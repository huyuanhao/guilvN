package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.systrace.Systrace;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import javax.annotation.Nullable;

public class ReactRootView extends SizeMonitoringFrameLayout implements RootView, MeasureSpecProvider {
    public final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
    @Nullable
    public Bundle mAppProperties;
    @Nullable
    public CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    public int mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
    @Nullable
    public String mInitialUITemplate;
    public boolean mIsAttachedToInstance;
    @Nullable
    public String mJSModuleName;
    @Nullable
    public JSTouchDispatcher mJSTouchDispatcher;
    @Nullable
    public ReactInstanceManager mReactInstanceManager;
    @Nullable
    public ReactRootViewEventListener mRootViewEventListener;
    public int mRootViewTag;
    public boolean mShouldLogContentAppeared;
    public int mUIManagerType = 1;
    public boolean mWasMeasured = false;
    public int mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);

    public class CustomGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public int mDeviceRotation = 0;
        public int mKeyboardHeight = 0;
        public final int mMinKeyboardHeightDetected;
        public DisplayMetrics mScreenMetrics = new DisplayMetrics();
        public final Rect mVisibleViewArea;
        public DisplayMetrics mWindowMetrics = new DisplayMetrics();

        public CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private boolean areMetricsEqual(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (Build.VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            return displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
        }

        private void checkForDeviceDimensionsChanges() {
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext());
            if (!areMetricsEqual(this.mWindowMetrics, DisplayMetricsHolder.getWindowDisplayMetrics()) || !areMetricsEqual(this.mScreenMetrics, DisplayMetricsHolder.getScreenDisplayMetrics())) {
                this.mWindowMetrics.setTo(DisplayMetricsHolder.getWindowDisplayMetrics());
                this.mScreenMetrics.setTo(DisplayMetricsHolder.getScreenDisplayMetrics());
                emitUpdateDimensionsEvent();
            }
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation != rotation) {
                this.mDeviceRotation = rotation;
                emitOrientationChanged(rotation);
            }
        }

        private void checkForKeyboardEvents() {
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            int i = DisplayMetricsHolder.getWindowDisplayMetrics().heightPixels - this.mVisibleViewArea.bottom;
            if (this.mKeyboardHeight != i && i > this.mMinKeyboardHeightDetected) {
                this.mKeyboardHeight = i;
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("screenY", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.bottom));
                createMap2.putDouble("screenX", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.left));
                createMap2.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.width()));
                createMap2.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mKeyboardHeight));
                createMap.putMap("endCoordinates", createMap2);
                ReactRootView.this.sendEvent("keyboardDidShow", createMap);
            } else if (this.mKeyboardHeight != 0 && i <= this.mMinKeyboardHeightDetected) {
                this.mKeyboardHeight = 0;
                ReactRootView.this.sendEvent("keyboardDidHide", null);
            }
        }

        private void emitOrientationChanged(int i) {
            String str;
            double d;
            double d2;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d = -90.0d;
                    str = "landscape-primary";
                } else if (i == 2) {
                    d2 = 180.0d;
                    str = "portrait-secondary";
                } else if (i == 3) {
                    d = 90.0d;
                    str = "landscape-secondary";
                } else {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d);
                createMap.putBoolean("isLandscape", z);
                ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
            }
            d2 = AbstractC8352oOoOOoO0.OooO0O0;
            str = "portrait-primary";
            d = d2;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d);
            createMap2.putBoolean("isLandscape", z);
            ReactRootView.this.sendEvent("namedOrientationDidChange", createMap2);
        }

        private void emitUpdateDimensionsEvent() {
            ((DeviceInfoModule) ReactRootView.this.mReactInstanceManager.getCurrentReactContext().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        public void onGlobalLayout() {
            if (ReactRootView.this.mReactInstanceManager != null && ReactRootView.this.mIsAttachedToInstance && ReactRootView.this.mReactInstanceManager.getCurrentReactContext() != null) {
                checkForKeyboardEvents();
                checkForDeviceOrientationChanges();
                checkForDeviceDimensionsChanges();
            }
        }
    }

    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    public ReactRootView(Context context) {
        super(context);
        init();
    }

    private void attachToReactInstanceManager() {
        Systrace.beginSection(0, "attachToReactInstanceManager");
        try {
            if (!this.mIsAttachedToInstance) {
                this.mIsAttachedToInstance = true;
                ((ReactInstanceManager) Assertions.assertNotNull(this.mReactInstanceManager)).attachRootView(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                Systrace.endSection(0);
            }
        } finally {
            Systrace.endSection(0);
        }
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || !this.mIsAttachedToInstance || reactInstanceManager.getCurrentReactContext() == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    private void enableLayoutCalculation() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            ((UIManagerModule) currentReactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().enableLayoutCalculationForRootNode(getRootViewTag());
        }
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    private void init() {
        setClipChildren(false);
    }

    private void removeOnGlobalLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            UIManagerHelper.getUIManager(currentReactContext, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || !this.mIsAttachedToInstance || reactInstanceManager.getCurrentReactContext() == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        super.finalize();
        Assertions.assertCondition(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Nullable
    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    @Override // com.facebook.react.uimanager.common.MeasureSpecProvider
    public int getHeightMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().height <= 0) {
            return this.mHeightMeasureSpec;
        }
        return View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    @Nullable
    public String getInitialUITemplate() {
        return this.mInitialUITemplate;
    }

    public String getJSModuleName() {
        return (String) Assertions.assertNotNull(this.mJSModuleName);
    }

    @Nullable
    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    public int getUIManagerType() {
        return this.mUIManagerType;
    }

    @Override // com.facebook.react.uimanager.common.MeasureSpecProvider
    public int getWidthMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().width <= 0) {
            return this.mWidthMeasureSpec;
        }
        return View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(Throwable th) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || reactInstanceManager.getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        }
        this.mReactInstanceManager.getCurrentReactContext().handleException(new IllegalViewOperationException(th.getMessage(), this, th));
    }

    public void onAttachedToReactInstance() {
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        ReactRootViewEventListener reactRootViewEventListener = this.mRootViewEventListener;
        if (reactRootViewEventListener != null) {
            reactRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || !this.mIsAttachedToInstance || reactInstanceManager.getCurrentReactContext() == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || !this.mIsAttachedToInstance || reactInstanceManager.getCurrentReactContext() == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            return;
        }
        this.mAndroidHWInputDeviceHelper.clearFocus();
        super.onFocusChanged(z, i, rect);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x0098 }, LOOP:1: B:17:0x0051->B:19:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[Catch:{ all -> 0x0098 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            String str = this.mJSModuleName;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.mRootViewTag);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || !this.mIsAttachedToInstance || reactInstanceManager.getCurrentReactContext() == null) {
            FLog.m913w(ReactConstants.TAG, "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void runApplication() {
        Systrace.beginSection(0, "ReactRootView.runApplication");
        try {
            if (this.mReactInstanceManager != null) {
                if (this.mIsAttachedToInstance) {
                    ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
                    if (currentReactContext == null) {
                        Systrace.endSection(0);
                        return;
                    }
                    CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    if (getUIManagerType() == 2) {
                        writableNativeMap.putBoolean("fabric", true);
                    }
                    this.mShouldLogContentAppeared = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
                    Systrace.endSection(0);
                }
            }
        } finally {
            Systrace.endSection(0);
        }
    }

    public void sendEvent(String str, @Nullable WritableMap writableMap) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactInstanceManager.getCurrentReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public void setAppProperties(@Nullable Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (getRootViewTag() != 0) {
            runApplication();
        }
    }

    public void setEventListener(ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z) {
        this.mUIManagerType = z ? 2 : 1;
    }

    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    @VisibleForTesting
    public void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    public void unmountReactApplication() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            reactInstanceManager.detachRootView(this);
            this.mReactInstanceManager = null;
            this.mIsAttachedToInstance = false;
        }
        this.mShouldLogContentAppeared = false;
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        startReactApplication(reactInstanceManager, str, bundle, null);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle, @Nullable String str2) {
        Systrace.beginSection(0, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            Assertions.assertCondition(this.mReactInstanceManager == null, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            this.mInitialUITemplate = str2;
            if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
                this.mReactInstanceManager.createReactContextInBackground();
            }
            attachToReactInstanceManager();
        } finally {
            Systrace.endSection(0);
        }
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
