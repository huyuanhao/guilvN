package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.FontMetricsUtil;
import com.p118pd.sdk.AbstractC9071ooOoo0OO;
import com.p118pd.sdk.AbstractC9087ooOooo;
import com.p118pd.sdk.C9062ooOoOooO;
import com.p118pd.sdk.C9063ooOoOooo;
import com.p118pd.sdk.C9069ooOoo0O;
import com.p118pd.sdk.C9070ooOoo0O0;
import com.p118pd.sdk.C9072ooOoo0Oo;
import com.p118pd.sdk.C9074ooOoo0o0;
import com.p118pd.sdk.C9075ooOoo0oO;
import com.p118pd.sdk.C9076ooOoo0oo;
import com.p118pd.sdk.C9077ooOooO;
import com.p118pd.sdk.C9080ooOooO0O;
import com.p118pd.sdk.C9081ooOooO0o;
import com.p118pd.sdk.C9082ooOooOO;
import com.p118pd.sdk.C9084ooOooOo;
import com.p118pd.sdk.C9089ooOooo00;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = RNGestureHandlerModule.MODULE_NAME)
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    public static final String KEY_DIRECTION = "direction";
    public static final String KEY_ENABLED = "enabled";
    public static final String KEY_HIT_SLOP = "hitSlop";
    public static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    public static final String KEY_HIT_SLOP_HEIGHT = "height";
    public static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    public static final String KEY_HIT_SLOP_LEFT = "left";
    public static final String KEY_HIT_SLOP_RIGHT = "right";
    public static final String KEY_HIT_SLOP_TOP = "top";
    public static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    public static final String KEY_HIT_SLOP_WIDTH = "width";
    public static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    public static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    public static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    public static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    public static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    public static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    public static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    public static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    public static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    public static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    public static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    public static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    public static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    public static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    public static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    public static final String KEY_PAN_MIN_DIST = "minDist";
    public static final String KEY_PAN_MIN_POINTERS = "minPointers";
    public static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    public static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    public static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    public static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    public static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    public static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    public static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    public static final String KEY_TAP_MAX_DIST = "maxDist";
    public static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    public static final String KEY_TAP_MIN_POINTERS = "minPointers";
    public static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    public List<Integer> mEnqueuedRootViewInit = new ArrayList();
    public AbstractC9071ooOoo0OO mEventListener = new OooO00o();
    public AbstractC9883OooO0Oo[] mHandlerFactories = {new OooO0o(null), new OooOO0(null), new C9884OooO0o0(null), new C9885OooO0oO(null), new C9886OooO0oo(null), new OooO(null), new OooO0OO(null)};
    public C9077ooOooO mInteractionManager = new C9077ooOooO();
    public final C9082ooOooOO mRegistry = new C9082ooOooOO();
    public List<C9084ooOooOo> mRoots = new ArrayList();

    public static class OooO extends AbstractC9883OooO0Oo<C9076ooOoo0oo> {
        public OooO() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9076ooOoo0oo> m21963OooO00o() {
            return "RotationGestureHandler";
        }

        public /* synthetic */ OooO(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9076ooOoo0oo> OooO00o() {
            return C9076ooOoo0oo.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9076ooOoo0oo OooO00o(Context context) {
            return new C9076ooOoo0oo();
        }

        public void OooO00o(C9076ooOoo0oo ooooo0oo, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0oo, writableMap);
            writableMap.putDouble(BaseViewManager.PROP_ROTATION, ooooo0oo.OooO00o());
            writableMap.putDouble("anchorX", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0oO()));
            writableMap.putDouble("anchorY", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0oo()));
            writableMap.putDouble("velocity", ooooo0oo.OooO0O0());
        }
    }

    public class OooO00o implements AbstractC9071ooOoo0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC9071ooOoo0OO
        public void OooO00o(C9063ooOoOooo oooooooo, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(oooooooo, motionEvent);
        }

        @Override // com.p118pd.sdk.AbstractC9071ooOoo0OO
        public void OooO00o(C9063ooOoOooo oooooooo, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(oooooooo, i, i2);
        }
    }

    public class OooO0O0 implements UIBlock {
        public final /* synthetic */ int OooO00o;

        public OooO0O0(int i) {
            this.OooO00o = i;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            View resolveView = nativeViewHierarchyManager.resolveView(this.OooO00o);
            if (resolveView instanceof C9080ooOooO0O) {
                ((C9080ooOooO0O) resolveView).OooO00o();
            }
            synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(new Integer(this.OooO00o));
            }
        }
    }

    public static class OooO0OO extends AbstractC9883OooO0Oo<C9062ooOoOooO> {
        public OooO0OO() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9062ooOoOooO> m21964OooO00o() {
            return "FlingGestureHandler";
        }

        public /* synthetic */ OooO0OO(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9062ooOoOooO> OooO00o() {
            return C9062ooOoOooO.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9062ooOoOooO OooO00o(Context context) {
            return new C9062ooOoOooO();
        }

        public void OooO00o(C9062ooOoOooO oooooooo, ReadableMap readableMap) {
            super.OooO00o((C9063ooOoOooo) oooooooo, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                oooooooo.OooO0oO(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                oooooooo.OooO0o(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        public void OooO00o(C9062ooOoOooO oooooooo, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) oooooooo, writableMap);
            writableMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel(oooooooo.OooO0OO()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(oooooooo.m20743OooO0Oo()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(oooooooo.OooO00o()));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(oooooooo.OooO0O0()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$OooO0Oo  reason: case insensitive filesystem */
    public static abstract class AbstractC9883OooO0Oo<T extends C9063ooOoOooo> implements AbstractC9087ooOooo<T> {
        public AbstractC9883OooO0Oo() {
        }

        public abstract T OooO00o(Context context);

        public abstract Class<T> OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract String m21965OooO00o();

        public void OooO00o(T t, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.OooO0O0(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey("enabled")) {
                t.OooO00o(readableMap.getBoolean("enabled"));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        public /* synthetic */ AbstractC9883OooO0Oo(OooO00o oooO00o) {
            this();
        }

        @Override // com.p118pd.sdk.AbstractC9087ooOooo
        public void OooO00o(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, (double) t.m20730OooO00o());
        }
    }

    public static class OooO0o extends AbstractC9883OooO0Oo<C9069ooOoo0O> {
        public OooO0o() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9069ooOoo0O> m21966OooO00o() {
            return "NativeViewGestureHandler";
        }

        public /* synthetic */ OooO0o(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9069ooOoo0O> OooO00o() {
            return C9069ooOoo0O.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9069ooOoo0O OooO00o(Context context) {
            return new C9069ooOoo0O();
        }

        public void OooO00o(C9069ooOoo0O ooooo0o, ReadableMap readableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0o, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                ooooo0o.OooO0O0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                ooooo0o.OooO00o(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        public void OooO00o(C9069ooOoo0O ooooo0o, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0o, writableMap);
            writableMap.putBoolean("pointerInside", ooooo0o.m20739OooO0O0());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$OooO0o0  reason: case insensitive filesystem */
    public static class C9884OooO0o0 extends AbstractC9883OooO0Oo<C9070ooOoo0O0> {
        public C9884OooO0o0() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9070ooOoo0O0> m21967OooO00o() {
            return "LongPressGestureHandler";
        }

        public /* synthetic */ C9884OooO0o0(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9070ooOoo0O0> OooO00o() {
            return C9070ooOoo0O0.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9070ooOoo0O0 OooO00o(Context context) {
            return new C9070ooOoo0O0(context);
        }

        public void OooO00o(C9070ooOoo0O0 ooooo0o0, ReadableMap readableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0o0, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                ooooo0o0.OooO00o((long) readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                ooooo0o0.OooO00o(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist")));
            }
        }

        public void OooO00o(C9070ooOoo0O0 ooooo0o0, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0o0, writableMap);
            writableMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel(ooooo0o0.OooO0OO()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(ooooo0o0.m20743OooO0Oo()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(ooooo0o0.OooO00o()));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(ooooo0o0.OooO0O0()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$OooO0oO  reason: case insensitive filesystem */
    public static class C9885OooO0oO extends AbstractC9883OooO0Oo<C9072ooOoo0Oo> {
        public C9885OooO0oO() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9072ooOoo0Oo> m21968OooO00o() {
            return "PanGestureHandler";
        }

        public /* synthetic */ C9885OooO0oO(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9072ooOoo0Oo> OooO00o() {
            return C9072ooOoo0Oo.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9072ooOoo0Oo OooO00o(Context context) {
            return new C9072ooOoo0Oo(context);
        }

        public void OooO00o(C9072ooOoo0Oo ooooo0oo, ReadableMap readableMap) {
            boolean z;
            super.OooO00o((C9063ooOoOooo) ooooo0oo, readableMap);
            boolean z2 = true;
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                ooooo0oo.OooO0O0(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                ooooo0oo.OooO00o(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                ooooo0oo.OooO0o(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                ooooo0oo.OooO0o0(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                ooooo0oo.OooO0Oo(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                ooooo0oo.OooO0OO(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                ooooo0oo.OooO0oo(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                ooooo0oo.OooO0oO(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                ooooo0oo.OooOO0(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                ooooo0oo.OooOO0O(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                ooooo0oo.OooOO0o(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z2 = z;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                ooooo0oo.OooO(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z2) {
                ooooo0oo.OooO(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                ooooo0oo.OooO0O0(readableMap.getInt("minPointers"));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                ooooo0oo.OooO00o(readableMap.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                ooooo0oo.OooO00o(readableMap.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
        }

        public void OooO00o(C9072ooOoo0Oo ooooo0oo, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0oo, writableMap);
            writableMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0OO()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(ooooo0oo.m20743OooO0Oo()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO00o()));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0O0()));
            writableMap.putDouble("translationX", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0oO()));
            writableMap.putDouble("translationY", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0oo()));
            writableMap.putDouble("velocityX", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO()));
            writableMap.putDouble("velocityY", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooOO0()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$OooO0oo  reason: case insensitive filesystem */
    public static class C9886OooO0oo extends AbstractC9883OooO0Oo<C9074ooOoo0o0> {
        public C9886OooO0oo() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9074ooOoo0o0> m21969OooO00o() {
            return "PinchGestureHandler";
        }

        public /* synthetic */ C9886OooO0oo(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9074ooOoo0o0> OooO00o() {
            return C9074ooOoo0o0.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9074ooOoo0o0 OooO00o(Context context) {
            return new C9074ooOoo0o0();
        }

        public void OooO00o(C9074ooOoo0o0 ooooo0o0, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0o0, writableMap);
            writableMap.putDouble("scale", ooooo0o0.OooO00o());
            writableMap.putDouble("focalX", (double) PixelUtil.toDIPFromPixel(ooooo0o0.OooO0oO()));
            writableMap.putDouble("focalY", (double) PixelUtil.toDIPFromPixel(ooooo0o0.OooO0oo()));
            writableMap.putDouble("velocity", ooooo0o0.OooO0O0());
        }
    }

    public static class OooOO0 extends AbstractC9883OooO0Oo<C9075ooOoo0oO> {
        public OooOO0() {
            super(null);
        }

        /* Return type fixed from 'java.lang.String' to match base method */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<C9075ooOoo0oO> m21970OooO00o() {
            return "TapGestureHandler";
        }

        public /* synthetic */ OooOO0(OooO00o oooO00o) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo, com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public Class<C9075ooOoo0oO> OooO00o() {
            return C9075ooOoo0oO.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC9883OooO0Oo
        public C9075ooOoo0oO OooO00o(Context context) {
            return new C9075ooOoo0oO();
        }

        public void OooO00o(C9075ooOoo0oO ooooo0oo, ReadableMap readableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0oo, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                ooooo0oo.OooO0O0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                ooooo0oo.OooO0O0((long) readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                ooooo0oo.OooO00o((long) readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                ooooo0oo.OooO0O0(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                ooooo0oo.OooO0OO(PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                ooooo0oo.OooO00o(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                ooooo0oo.OooO00o(readableMap.getInt("minPointers"));
            }
        }

        public void OooO00o(C9075ooOoo0oO ooooo0oo, WritableMap writableMap) {
            super.OooO00o((C9063ooOoOooo) ooooo0oo, writableMap);
            writableMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0OO()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(ooooo0oo.m20743OooO0Oo()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO00o()));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(ooooo0oo.OooO0O0()));
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nullable
    private AbstractC9883OooO0Oo findFactoryForHandler(C9063ooOoOooo oooooooo) {
        int i = 0;
        while (true) {
            AbstractC9883OooO0Oo[] oooO0OoArr = this.mHandlerFactories;
            if (i >= oooO0OoArr.length) {
                return null;
            }
            AbstractC9883OooO0Oo oooO0Oo = oooO0OoArr[i];
            if (oooO0Oo.OooO00o().equals(oooooooo.getClass())) {
                return oooO0Oo;
            }
            i++;
        }
    }

    @Nullable
    private C9084ooOooOo findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                C9084ooOooOo ooooooo = this.mRoots.get(i2);
                if (ooooooo.OooO00o().getRootViewTag() == resolveRootTagFromReactTag) {
                    return ooooooo;
                }
            }
            return null;
        }
    }

    public static void handleHitSlopProperty(C9063ooOoOooo oooooooo, ReadableMap readableMap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble(KEY_HIT_SLOP));
            oooooooo.OooO00o(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(KEY_HIT_SLOP);
        if (map.hasKey(KEY_HIT_SLOP_HORIZONTAL)) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble(KEY_HIT_SLOP_HORIZONTAL));
            f = f2;
        } else {
            f2 = Float.NaN;
            f = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_VERTICAL)) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble(KEY_HIT_SLOP_VERTICAL));
            f3 = f4;
        } else {
            f4 = Float.NaN;
            f3 = Float.NaN;
        }
        if (map.hasKey("left")) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble("left"));
        }
        if (map.hasKey("top")) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
        }
        if (map.hasKey("right")) {
            f = PixelUtil.toPixelFromDIP(map.getDouble("right"));
        }
        if (map.hasKey("bottom")) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
        }
        oooooooo.OooO00o(f2, f4, f, f3, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onStateChange(C9063ooOoOooo oooooooo, int i, int i2) {
        if (oooooooo.m20740OooO0OO() >= 0) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C9089ooOooo00.OooO00o(oooooooo, i, i2, (AbstractC9087ooOooo) findFactoryForHandler(oooooooo)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onTouchEvent(C9063ooOoOooo oooooooo, MotionEvent motionEvent) {
        if (oooooooo.m20740OooO0OO() >= 0 && oooooooo.m20737OooO0O0() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C9081ooOooO0o.OooO00o(oooooooo, (AbstractC9087ooOooo) findFactoryForHandler(oooooooo)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r5 = r4.mEnqueuedRootViewInit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r4.mEnqueuedRootViewInit.contains(java.lang.Integer.valueOf(r1)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r4.mEnqueuedRootViewInit.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r0.addUIBlock(new com.swmansion.gesturehandler.react.RNGestureHandlerModule.OooO0O0(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryInitializeHandlerForReactRootView(int r5) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.tryInitializeHandlerForReactRootView(int):void");
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (!this.mRegistry.OooO00o(i, i2)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        int i2 = 0;
        while (true) {
            AbstractC9883OooO0Oo[] oooO0OoArr = this.mHandlerFactories;
            if (i2 < oooO0OoArr.length) {
                AbstractC9883OooO0Oo oooO0Oo = oooO0OoArr[i2];
                if (oooO0Oo.m21965OooO00o().equals(str)) {
                    C9063ooOoOooo OooO00o2 = oooO0Oo.OooO00o(getReactApplicationContext());
                    OooO00o2.m20734OooO00o(i);
                    OooO00o2.OooO00o(this.mEventListener);
                    this.mRegistry.OooO00o(OooO00o2);
                    this.mInteractionManager.OooO00o(OooO00o2, readableMap);
                    oooO0Oo.OooO00o(OooO00o2, readableMap);
                    return;
                }
                i2++;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
            }
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.OooO00o(i);
        this.mRegistry.m20760OooO00o(i);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map getConstants() {
        return MapBuilder.m947of("State", MapBuilder.m951of("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", MapBuilder.m949of("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public C9082ooOooOO getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        C9084ooOooOo findRootHelperForViewAncestor;
        if (this.mRegistry != null && (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i)) != null) {
            findRootHelperForViewAncestor.OooO00o(i, z);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.OooO00o();
        this.mInteractionManager.OooO00o();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                C9084ooOooOo ooooooo = this.mRoots.get(0);
                ReactRootView OooO00o2 = ooooooo.OooO00o();
                if (OooO00o2 instanceof C9080ooOooO0O) {
                    ((C9080ooOooO0O) OooO00o2).OooO0O0();
                } else {
                    ooooooo.m20761OooO00o();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(C9084ooOooOo ooooooo) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(ooooooo)) {
                this.mRoots.add(ooooooo);
            } else {
                throw new IllegalStateException("Root helper" + ooooooo + " already registered");
            }
        }
    }

    public void unregisterRootHelper(C9084ooOooOo ooooooo) {
        synchronized (this.mRoots) {
            this.mRoots.remove(ooooooo);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        AbstractC9883OooO0Oo findFactoryForHandler;
        C9063ooOoOooo OooO00o2 = this.mRegistry.OooO00o(i);
        if (OooO00o2 != null && (findFactoryForHandler = findFactoryForHandler(OooO00o2)) != null) {
            this.mInteractionManager.OooO00o(i);
            this.mInteractionManager.OooO00o(OooO00o2, readableMap);
            findFactoryForHandler.OooO00o(OooO00o2, readableMap);
        }
    }
}
