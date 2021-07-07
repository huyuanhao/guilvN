package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AccessibilityDelegateUtil;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> {
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    public static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    public static final String PROP_ACCESSIBILITY_COMPONENT_TYPE = "accessibilityComponentType";
    public static final String PROP_ACCESSIBILITY_HINT = "accessibilityHint";
    public static final String PROP_ACCESSIBILITY_LABEL = "accessibilityLabel";
    public static final String PROP_ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    public static final String PROP_ACCESSIBILITY_ROLE = "accessibilityRole";
    public static final String PROP_ACCESSIBILITY_STATES = "accessibilityStates";
    public static final String PROP_BACKGROUND_COLOR = "backgroundColor";
    public static final String PROP_ELEVATION = "elevation";
    public static final String PROP_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String PROP_NATIVE_ID = "nativeID";
    public static final String PROP_RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    public static final String PROP_ROTATION = "rotation";
    public static final String PROP_SCALE_X = "scaleX";
    public static final String PROP_SCALE_Y = "scaleY";
    public static final String PROP_TEST_ID = "testID";
    public static final String PROP_TRANSFORM = "transform";
    public static final String PROP_TRANSLATE_X = "translateX";
    public static final String PROP_TRANSLATE_Y = "translateY";
    public static final String PROP_Z_INDEX = "zIndex";
    public static MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    public static double[] sTransformDecompositionArray = new double[16];

    public static void resetTransformProperty(@Nonnull View view) {
        view.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
        view.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    public static void setTransformProperty(@Nonnull View view, ReadableArray readableArray) {
        TransformHelper.processTransform(readableArray, sTransformDecompositionArray);
        MatrixMathHelper.decomposeMatrix(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[0]));
        view.setTranslationY(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[1]));
        view.setRotation((float) sMatrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) sMatrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) sMatrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) sMatrixDecompositionContext.scale[0]);
        view.setScaleY((float) sMatrixDecompositionContext.scale[1]);
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private void updateViewAccessibility(@Nonnull T t) {
        AccessibilityDelegateUtil.setDelegate(t);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @ReactProp(name = PROP_ACCESSIBILITY_COMPONENT_TYPE)
    public void setAccessibilityComponentType(@Nonnull T t, String str) {
        AccessibilityHelper.updateAccessibilityComponentType(t, str);
    }

    @ReactProp(name = PROP_ACCESSIBILITY_HINT)
    public void setAccessibilityHint(@Nonnull T t, String str) {
        t.setTag(C0587R.C0590id.accessibility_hint, str);
    }

    @ReactProp(name = PROP_ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(@Nonnull T t, String str) {
        t.setContentDescription(str);
    }

    @ReactProp(name = PROP_ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(@Nonnull T t, @Nullable String str) {
        if (str == null || str.equals("none")) {
            ViewCompat.OooO0o0((View) t, 0);
        } else if (str.equals("polite")) {
            ViewCompat.OooO0o0((View) t, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.OooO0o0((View) t, 2);
        }
    }

    @ReactProp(name = PROP_ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@Nonnull T t, @Nullable String str) {
        if (str != null) {
            t.setTag(C0587R.C0590id.accessibility_role, AccessibilityDelegateUtil.AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@Nonnull T t, int i) {
        t.setBackgroundColor(i);
    }

    @ReactProp(name = PROP_ELEVATION)
    public void setElevation(@Nonnull T t, float f) {
        ViewCompat.OooO0O0(t, PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = PROP_IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(@Nonnull T t, @Nullable String str) {
        if (str == null || str.equals("auto")) {
            ViewCompat.OooO0o((View) t, 0);
        } else if (str.equals("yes")) {
            ViewCompat.OooO0o((View) t, 1);
        } else if (str.equals("no")) {
            ViewCompat.OooO0o((View) t, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.OooO0o((View) t, 4);
        }
    }

    @ReactProp(name = PROP_NATIVE_ID)
    public void setNativeId(@Nonnull T t, String str) {
        t.setTag(C0587R.C0590id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(@Nonnull T t, float f) {
        t.setAlpha(f);
    }

    @ReactProp(name = PROP_RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(@Nonnull T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @ReactProp(name = PROP_ROTATION)
    @Deprecated
    public void setRotation(@Nonnull T t, float f) {
        t.setRotation(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = PROP_SCALE_X)
    @Deprecated
    public void setScaleX(@Nonnull T t, float f) {
        t.setScaleX(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = PROP_SCALE_Y)
    @Deprecated
    public void setScaleY(@Nonnull T t, float f) {
        t.setScaleY(f);
    }

    @ReactProp(name = PROP_TEST_ID)
    public void setTestId(@Nonnull T t, String str) {
        t.setTag(C0587R.C0590id.react_test_id, str);
        t.setTag(str);
    }

    @ReactProp(name = PROP_TRANSFORM)
    public void setTransform(@Nonnull T t, @Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = PROP_TRANSLATE_X)
    @Deprecated
    public void setTranslateX(@Nonnull T t, float f) {
        t.setTranslationX(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = PROP_TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(@Nonnull T t, float f) {
        t.setTranslationY(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = PROP_ACCESSIBILITY_STATES)
    public void setViewStates(@Nonnull T t, @Nullable ReadableArray readableArray) {
        t.setSelected(false);
        t.setEnabled(true);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string.equals("selected")) {
                    t.setSelected(true);
                } else if (string.equals("disabled")) {
                    t.setEnabled(false);
                }
            }
        }
    }

    @ReactProp(name = PROP_Z_INDEX)
    public void setZIndex(@Nonnull T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent != null && (parent instanceof ReactZIndexedViewGroup)) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }
}
