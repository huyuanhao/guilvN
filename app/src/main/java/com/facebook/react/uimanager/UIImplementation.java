package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class UIImplementation {
    public final EventDispatcher mEventDispatcher;
    public long mLastCalculateLayoutTime;
    @Nullable
    public LayoutUpdateListener mLayoutUpdateListener;
    public final int[] mMeasureBuffer;
    public final Set<Integer> mMeasuredRootNodes;
    public final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    public final UIViewOperationQueue mOperationsQueue;
    public final ReactApplicationContext mReactContext;
    public final ShadowNodeRegistry mShadowNodeRegistry;
    public final ViewManagerRegistry mViewManagers;
    public Object uiImplementationThreadLock;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, UIManagerModule.ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(viewManagerResolver), eventDispatcher, i);
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        ViewManager viewManager = (ViewManager) Assertions.assertNotNull(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            if (viewGroupManager != null && viewGroupManager.needsCustomLayoutForChildren()) {
                throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + reactShadowNode.getViewClass() + "). Use measure instead.");
            }
            return;
        }
        throw new IllegalViewOperationException("Trying to use view " + reactShadowNode.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    private void assertViewExists(int i, String str) {
        if (this.mShadowNodeRegistry.getNode(i) == null) {
            throw new IllegalViewOperationException("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
        }
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int i;
        int i2;
        if (reactShadowNode != reactShadowNode2) {
            i2 = Math.round(reactShadowNode.getLayoutX());
            i = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                Assertions.assertNotNull(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                i2 += Math.round(parent.getLayoutX());
                i += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        } else {
            i2 = 0;
            i = 0;
        }
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i));
            }
            reactShadowNode.onBeforeLayout();
        }
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        this.mMeasuredRootNodes.remove(Integer.valueOf(reactShadowNode.getReactTag()));
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public void addAnimation(int i, int i2, Callback callback) {
        assertViewExists(i, "addAnimation");
        this.mOperationsQueue.enqueueAddAnimation(i, i2, callback);
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f, float f2) {
        if (reactShadowNode.hasUpdates()) {
            if (!reactShadowNode.isVirtualAnchor()) {
                for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                    applyUpdatesRecursive(reactShadowNode.getChildAt(i), reactShadowNode.getLayoutX() + f, reactShadowNode.getLayoutY() + f2);
                }
            }
            int reactTag = reactShadowNode.getReactTag();
            if (!this.mShadowNodeRegistry.isRootNode(reactTag) && reactShadowNode.dispatchUpdates(f, f2, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer) && reactShadowNode.shouldNotifyOnLayout()) {
                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(reactTag, reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
            }
            reactShadowNode.markUpdateSeen();
        }
    }

    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
        SystraceMessage.beginSection(0, "cssRoot.calculateLayout").arg("rootTag", reactShadowNode.getReactTag()).flush();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            reactShadowNode.calculateLayout();
        } finally {
            Systrace.endSection(0);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback, callback2);
    }

    public ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    public ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode createShadowNode = createShadowNode(str);
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
            Assertions.assertNotNull(node, "Root node with tag " + i2 + " doesn't exist");
            createShadowNode.setReactTag(i);
            createShadowNode.setViewClassName(str);
            createShadowNode.setRootTag(node.getReactTag());
            createShadowNode.setThemedContext(node.getThemedContext());
            this.mShadowNodeRegistry.addNode(createShadowNode);
            ReactStylesDiffMap reactStylesDiffMap = null;
            if (readableMap != null) {
                reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                createShadowNode.updateProperties(reactStylesDiffMap);
            }
            handleCreateView(createShadowNode, i2, reactStylesDiffMap);
        }
    }

    public void dismissPopupMenu() {
        this.mOperationsQueue.enqueueDismissPopupMenu();
    }

    public void dispatchViewManagerCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        assertViewExists(i, "dispatchViewManagerCommand");
        this.mOperationsQueue.enqueueDispatchCommand(i, i2, readableArray);
    }

    public void dispatchViewUpdates(int i) {
        SystraceMessage.beginSection(0, "UIImplementation.dispatchViewUpdates").arg("batchId", i).flush();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i, uptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Systrace.endSection(0);
        }
    }

    public void enableLayoutCalculationForRootNode(int i) {
        this.mMeasuredRootNodes.add(Integer.valueOf(i));
    }

    public void findSubviewIn(int i, float f, float f2, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i, f, f2, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
        }
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
        }
    }

    public void manageChildren(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        Throwable th;
        int i2;
        int i3;
        int i4;
        ReadableArray readableArray6 = readableArray;
        synchronized (this.uiImplementationThreadLock) {
            try {
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
                if (readableArray6 == null) {
                    i2 = 0;
                } else {
                    i2 = readableArray.size();
                }
                if (readableArray3 == null) {
                    i3 = 0;
                } else {
                    i3 = readableArray3.size();
                }
                if (readableArray5 == null) {
                    i4 = 0;
                } else {
                    i4 = readableArray5.size();
                }
                if (i2 != 0) {
                    if (readableArray2 == null || i2 != readableArray2.size()) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                }
                if (i3 != 0) {
                    if (readableArray4 == null || i3 != readableArray4.size()) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                }
                int i5 = i2 + i3;
                ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[i5];
                int i6 = i2 + i4;
                int[] iArr = new int[i6];
                try {
                    int[] iArr2 = new int[i6];
                    int[] iArr3 = new int[i4];
                    if (i2 > 0) {
                        Assertions.assertNotNull(readableArray);
                        Assertions.assertNotNull(readableArray2);
                        int i7 = 0;
                        while (i7 < i2) {
                            int i8 = readableArray6.getInt(i7);
                            int reactTag = node.getChildAt(i8).getReactTag();
                            viewAtIndexArr[i7] = new ViewAtIndex(reactTag, readableArray2.getInt(i7));
                            iArr[i7] = i8;
                            iArr2[i7] = reactTag;
                            i7++;
                            readableArray6 = readableArray;
                            i6 = i6;
                            iArr3 = iArr3;
                            node = node;
                        }
                    }
                    ReactShadowNode reactShadowNode = node;
                    if (i3 > 0) {
                        Assertions.assertNotNull(readableArray3);
                        Assertions.assertNotNull(readableArray4);
                        for (int i9 = 0; i9 < i3; i9++) {
                            viewAtIndexArr[i2 + i9] = new ViewAtIndex(readableArray3.getInt(i9), readableArray4.getInt(i9));
                        }
                    }
                    if (i4 > 0) {
                        Assertions.assertNotNull(readableArray5);
                        int i10 = 0;
                        while (i10 < i4) {
                            int i11 = readableArray5.getInt(i10);
                            int reactTag2 = reactShadowNode.getChildAt(i11).getReactTag();
                            int i12 = i2 + i10;
                            iArr[i12] = i11;
                            iArr2[i12] = reactTag2;
                            iArr3[i10] = reactTag2;
                            i10++;
                            reactShadowNode = reactShadowNode;
                        }
                    }
                    Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
                    Arrays.sort(iArr);
                    int i13 = -1;
                    for (int i14 = i6 - 1; i14 >= 0; i14--) {
                        if (iArr[i14] != i13) {
                            reactShadowNode.removeChildAt(iArr[i14]);
                            i13 = iArr[i14];
                        } else {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i);
                        }
                    }
                    int i15 = 0;
                    for (int i16 = i5; i15 < i16; i16 = i16) {
                        ViewAtIndex viewAtIndex = viewAtIndexArr[i15];
                        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                        if (node2 != null) {
                            reactShadowNode.addChildAt(node2, viewAtIndex.mIndex);
                            i15++;
                            iArr2 = iArr2;
                        } else {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag);
                        }
                    }
                    if (!reactShadowNode.isVirtual() && !reactShadowNode.isVirtualAnchor()) {
                        this.mNativeViewHierarchyOptimizer.handleManageChildren(reactShadowNode, iArr, iArr2, viewAtIndexArr, iArr3);
                    }
                    for (int i17 = 0; i17 < i4; i17++) {
                        removeShadowNode(this.mShadowNodeRegistry.getNode(iArr3[i17]));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void measure(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasure(i, callback);
    }

    public void measureInWindow(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasureInWindow(i, callback);
    }

    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        try {
            measureLayout(i, i2, this.mMeasureBuffer);
            callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3])));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        try {
            measureLayoutRelativeToParent(i, this.mMeasureBuffer);
            callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3])));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public void registerAnimation(Animation animation) {
        this.mOperationsQueue.enqueueRegisterAnimation(animation);
    }

    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> void registerRootView(T t, int i, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            final ReactShadowNode createRootShadowNode = createRootShadowNode();
            createRootShadowNode.setReactTag(i);
            createRootShadowNode.setThemedContext(themedReactContext);
            updateRootView(createRootShadowNode, t.getWidthMeasureSpec(), t.getHeightMeasureSpec());
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() {
                /* class com.facebook.react.uimanager.UIImplementation.RunnableC08421 */

                public void run() {
                    UIImplementation.this.mShadowNodeRegistry.addRootNode(createRootShadowNode);
                }
            });
            this.mOperationsQueue.addRootView(i, t, themedReactContext);
        }
    }

    public void removeAnimation(int i, int i2) {
        assertViewExists(i, "removeAnimation");
        this.mOperationsQueue.enqueueRemoveAnimation(i2);
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void removeRootShadowNode(int i) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i);
        }
    }

    public void removeRootView(int i) {
        removeRootShadowNode(i);
        this.mOperationsQueue.enqueueRemoveRootView(i);
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    public void removeSubviewsFromContainerWithID(int i) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i2 = 0; i2 < node.getChildCount(); i2++) {
                createArray.pushInt(i2);
            }
            manageChildren(i, null, null, null, null, createArray);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove subviews of an unknown view tag: " + i);
    }

    public void replaceExistingNonRootView(int i, int i2) {
        if (this.mShadowNodeRegistry.isRootNode(i) || this.mShadowNodeRegistry.isRootNode(i2)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                int indexOf = parent.indexOf(node);
                if (indexOf >= 0) {
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushInt(indexOf);
                    WritableArray createArray3 = Arguments.createArray();
                    createArray3.pushInt(indexOf);
                    manageChildren(parent.getReactTag(), null, null, createArray, createArray2, createArray3);
                    return;
                }
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            throw new IllegalViewOperationException("Node is not attached to a parent: " + i);
        }
        throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i);
    }

    public int resolveRootTagFromReactTag(int i) {
        if (this.mShadowNodeRegistry.isRootNode(i)) {
            return i;
        }
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        if (resolveShadowNode != null) {
            return resolveShadowNode.getRootTag();
        }
        FLog.m913w(ReactConstants.TAG, "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    public final ReactShadowNode resolveShadowNode(int i) {
        return this.mShadowNodeRegistry.getNode(i);
    }

    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.get(str);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i, i2);
    }

    public void setChildren(int i, ReadableArray readableArray) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i2));
                if (node2 != null) {
                    node.addChildAt(node2, i2);
                } else {
                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i2));
                }
            }
            if (!node.isVirtual() && !node.isVirtualAnchor()) {
                this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
            }
        }
    }

    public void setJSResponder(int i, boolean z) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            while (true) {
                if (node.isVirtual() || node.isLayoutOnly()) {
                    node = node.getParent();
                } else {
                    this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i, z);
                    return;
                }
            }
        }
    }

    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z);
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            FLog.m913w(ReactConstants.TAG, "Attempt to set local data for view with unknown tag: " + i);
            return;
        }
        node.setLocalData(obj);
        dispatchViewUpdatesIfNeeded();
    }

    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        assertViewExists(i, "showPopupMenu");
        this.mOperationsQueue.enqueueShowPopupMenu(i, readableArray, callback, callback2);
    }

    public void synchronouslyUpdateViewOnUIThread(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i, reactStylesDiffMap);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            FLog.m913w(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i);
            return;
        }
        node.setStyleWidth((float) i2);
        node.setStyleHeight((float) i3);
        dispatchViewUpdatesIfNeeded();
    }

    public void updateRootView(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            FLog.m913w(ReactConstants.TAG, "Tried to update non-existent root tag: " + i);
            return;
        }
        updateRootView(node, i2, i3);
    }

    public void updateView(int i, String str, ReadableMap readableMap) {
        if (this.mViewManagers.get(str) != null) {
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
            if (node == null) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i);
            } else if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        } else {
            throw new IllegalViewOperationException("Got unknown view type: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void updateViewHierarchy() {
        Systrace.beginSection(0, "UIImplementation.updateViewHierarchy");
        for (int i = 0; i < this.mShadowNodeRegistry.getRootNodeCount(); i++) {
            try {
                int rootTag = this.mShadowNodeRegistry.getRootTag(i);
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(rootTag);
                if (this.mMeasuredRootNodes.contains(Integer.valueOf(rootTag))) {
                    SystraceMessage.beginSection(0, "UIImplementation.notifyOnBeforeLayoutRecursive").arg("rootTag", node.getReactTag()).flush();
                    try {
                        notifyOnBeforeLayoutRecursive(node);
                        Systrace.endSection(0);
                        calculateRootLayout(node);
                        SystraceMessage.beginSection(0, "UIImplementation.applyUpdatesRecursive").arg("rootTag", node.getReactTag()).flush();
                        try {
                            applyUpdatesRecursive(node, 0.0f, 0.0f);
                            Systrace.endSection(0);
                            if (this.mLayoutUpdateListener != null) {
                                this.mOperationsQueue.enqueueLayoutUpdateFinished(node, this.mLayoutUpdateListener);
                            }
                        } catch (Throwable th) {
                            Systrace.endSection(0);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Systrace.endSection(0);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Systrace.endSection(0);
                throw th3;
            }
        }
        Systrace.endSection(0);
    }

    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i2);
        if (node == null || node2 == null) {
            callback.invoke(false);
            return;
        }
        callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(list), eventDispatcher, i);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i), eventDispatcher);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        this.mShadowNodeRegistry = new ShadowNodeRegistry();
        this.mMeasuredRootNodes = new HashSet();
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(uIViewOperationQueue, this.mShadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            reactShadowNode.setStyleMaxWidth((float) size);
        } else if (mode == 0) {
            reactShadowNode.setStyleWidthAuto();
        } else if (mode == 1073741824) {
            reactShadowNode.setStyleWidth((float) size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            reactShadowNode.setStyleMaxHeight((float) size2);
        } else if (mode2 == 0) {
            reactShadowNode.setStyleHeightAuto();
        } else if (mode2 == 1073741824) {
            reactShadowNode.setStyleHeight((float) size2);
        }
    }

    private void measureLayout(int i, int i2, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i2);
        if (node == null || node2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (node != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new IllegalViewOperationException(sb.toString());
        }
        if (node != node2) {
            for (ReactShadowNode parent = node.getParent(); parent != node2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToParent(int i, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            throw new IllegalViewOperationException("View with tag " + i + " doesn't have a parent!");
        }
        throw new IllegalViewOperationException("No native view for tag " + i + " exists!");
    }
}
