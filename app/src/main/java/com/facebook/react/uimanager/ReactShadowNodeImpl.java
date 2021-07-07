package com.facebook.react.uimanager;

import com.bumptech.glide.load.engine.GlideException;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.Nullable;

@ReactPropertyHolder
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    public static final YogaConfig sYogaConfig = ReactYogaConfigProvider.get();
    @Nullable
    public ArrayList<ReactShadowNodeImpl> mChildren;
    public final Spacing mDefaultPadding = new Spacing(0.0f);
    public boolean mIsLayoutOnly;
    @Nullable
    public ArrayList<ReactShadowNodeImpl> mNativeChildren;
    @Nullable
    public ReactShadowNodeImpl mNativeParent;
    public boolean mNodeUpdated = true;
    public final float[] mPadding = new float[9];
    public final boolean[] mPaddingIsPercent = new boolean[9];
    @Nullable
    public ReactShadowNodeImpl mParent;
    public int mReactTag;
    public int mRootTag;
    public int mScreenHeight;
    public int mScreenWidth;
    public int mScreenX;
    public int mScreenY;
    public boolean mShouldNotifyOnLayout;
    @Nullable
    public ThemedReactContext mThemedContext;
    public int mTotalNativeChildren = 0;
    @Nullable
    public String mViewClassName;
    public YogaNode mYogaNode;

    public ReactShadowNodeImpl() {
        if (!isVirtual()) {
            YogaNode acquire = YogaNodePool.get().acquire();
            acquire = acquire == null ? new YogaNode(sYogaConfig) : acquire;
            this.mYogaNode = acquire;
            acquire.setData(this);
            Arrays.fill(this.mPadding, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(GlideException.OooO00o.o0ooOoO);
        }
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" view='");
        sb.append(getViewClass());
        sb.append("' tag=");
        sb.append(getReactTag());
        if (this.mYogaNode != null) {
            sb.append(" layout='x:");
            sb.append(getScreenX());
            sb.append(" y:");
            sb.append(getScreenY());
            sb.append(" w:");
            sb.append(getLayoutWidth());
            sb.append(" h:");
            sb.append(getLayoutHeight());
            sb.append("'");
        } else {
            sb.append("(virtual node)");
        }
        sb.append(">\n");
        if (getChildCount() != 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).getHierarchyInfoWithIndentation(sb, i + 1);
            }
        }
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (this.mIsLayoutOnly) {
            for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (!parent.isLayoutOnly()) {
                    return;
                }
            }
        }
    }

    private void updatePadding() {
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5) {
                if (YogaConstants.isUndefined(this.mPadding[i]) && YogaConstants.isUndefined(this.mPadding[6]) && YogaConstants.isUndefined(this.mPadding[8])) {
                    this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
                }
            } else if (i == 1 || i == 3) {
                if (YogaConstants.isUndefined(this.mPadding[i]) && YogaConstants.isUndefined(this.mPadding[7]) && YogaConstants.isUndefined(this.mPadding[8])) {
                    this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
                }
            } else if (YogaConstants.isUndefined(this.mPadding[i])) {
                this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
            }
            if (this.mPaddingIsPercent[i]) {
                this.mYogaNode.setPaddingPercent(YogaEdge.fromInt(i), this.mPadding[i]);
            } else {
                this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mPadding[i]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        this.mYogaNode.calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, @Nullable NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int round = Math.round(f3);
            float f4 = f2 + layoutY;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + getLayoutWidth());
            int round4 = Math.round(f4 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (!(round5 == this.mScreenX && round6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight)) {
                z = true;
            }
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                }
            }
        }
        return z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.reset();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb = new StringBuilder();
        getHierarchyInfoWithIndentation(sb, 0);
        return sb.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.getLayoutDirection();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.getLayoutHeight();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.getLayoutWidth();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.getLayoutX();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.getLayoutY();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i) {
        return this.mYogaNode.getLayoutPadding(YogaEdge.fromInt(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        Assertions.assertCondition(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.getHeight();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i) {
        return this.mYogaNode.getPadding(YogaEdge.fromInt(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.getWidth();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) Assertions.assertNotNull(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        return (String) Assertions.assertNotNull(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.hasNewLayout();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return this.mYogaNode.isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (!this.mNodeUpdated) {
            this.mNodeUpdated = true;
            ReactShadowNodeImpl parent = getParent();
            if (parent != null) {
                parent.markUpdated();
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() != 0) {
            int i = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.mYogaNode != null && !isYogaLeafNode()) {
                    this.mYogaNode.removeChildAt(childCount);
                }
                ReactShadowNodeImpl childAt = getChildAt(childCount);
                childAt.mParent = null;
                childAt.dispose();
                i += childAt.isLayoutOnly() ? childAt.getTotalNativeChildren() : 1;
            }
            ((ArrayList) Assertions.assertNotNull(this.mChildren)).clear();
            markUpdated();
            this.mTotalNativeChildren -= i;
            updateNativeChildrenCountInParent(-i);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignContent(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignItems(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignSelf(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.setBaselineFunction(yogaBaselineFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i, float f) {
        this.mYogaNode.setBorder(YogaEdge.fromInt(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.set(i, f);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.setDisplay(yogaDisplay);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f) {
        this.mYogaNode.setFlex(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f) {
        this.mYogaNode.setFlexBasis(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.setFlexBasisAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f) {
        this.mYogaNode.setFlexBasisPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.setFlexDirection(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f) {
        this.mYogaNode.setFlexGrow(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f) {
        this.mYogaNode.setFlexShrink(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.setWrap(yogaWrap);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z) {
        boolean z2 = true;
        Assertions.assertCondition(getParent() == null, "Must remove from no opt parent first");
        Assertions.assertCondition(this.mNativeParent == null, "Must remove from native parent first");
        if (getNativeChildCount() != 0) {
            z2 = false;
        }
        Assertions.assertCondition(z2, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.setJustifyContent(yogaJustify);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.setDirection(yogaDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i, float f) {
        this.mYogaNode.setMargin(YogaEdge.fromInt(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i) {
        this.mYogaNode.setMarginAuto(YogaEdge.fromInt(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i, float f) {
        this.mYogaNode.setMarginPercent(YogaEdge.fromInt(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.setMeasureFunction(yogaMeasureFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.setOverflow(yogaOverflow);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !YogaConstants.isUndefined(f);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i, float f) {
        this.mYogaNode.setPosition(YogaEdge.fromInt(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i, float f) {
        this.mYogaNode.setPositionPercent(YogaEdge.fromInt(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.setPositionType(yogaPositionType);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i) {
        this.mRootTag = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f) {
        this.mYogaNode.setAspectRatio(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f) {
        this.mYogaNode.setHeight(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.setHeightAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f) {
        this.mYogaNode.setHeightPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f) {
        this.mYogaNode.setMaxHeight(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.setMaxHeightPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f) {
        this.mYogaNode.setMaxWidth(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.setMaxWidthPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f) {
        this.mYogaNode.setMinHeight(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.setMinHeightPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f) {
        this.mYogaNode.setMinWidth(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.setMinWidthPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f) {
        this.mYogaNode.setWidth(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.setWidthAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f) {
        this.mYogaNode.setWidthPercent(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            YogaNode yogaNode = reactShadowNodeImpl.mYogaNode;
            if (yogaNode != null) {
                this.mYogaNode.addChildAt(yogaNode, i);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
        }
        markUpdated();
        int totalNativeChildren = reactShadowNodeImpl.isLayoutOnly() ? reactShadowNodeImpl.getTotalNativeChildren() : 1;
        this.mTotalNativeChildren += totalNativeChildren;
        updateNativeChildrenCountInParent(totalNativeChildren);
    }

    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Assertions.assertCondition(!this.mIsLayoutOnly);
        Assertions.assertCondition(!reactShadowNodeImpl.mIsLayoutOnly);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= getChildCount()) {
                break;
            }
            ReactShadowNodeImpl childAt = getChildAt(i);
            if (reactShadowNodeImpl == childAt) {
                z = true;
                break;
            }
            if (childAt.isLayoutOnly()) {
                i3 = childAt.getTotalNativeChildren();
            }
            i2 += i3;
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        Assertions.assertNotNull(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            ReactShadowNodeImpl remove = arrayList.remove(i);
            remove.mParent = null;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.removeChildAt(i);
            }
            markUpdated();
            int totalNativeChildren = remove.isLayoutOnly() ? remove.getTotalNativeChildren() : 1;
            this.mTotalNativeChildren -= totalNativeChildren;
            updateNativeChildrenCountInParent(-totalNativeChildren);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i) {
        Assertions.assertNotNull(this.mNativeChildren);
        ReactShadowNodeImpl remove = this.mNativeChildren.remove(i);
        remove.mNativeParent = null;
        return remove;
    }
}
