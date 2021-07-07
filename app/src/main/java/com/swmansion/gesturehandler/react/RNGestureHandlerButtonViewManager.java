package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<OooO00o> {

    public static class OooO00o extends ViewGroup {
        public static TypedValue OooO00o = new TypedValue();

        /* renamed from: OooO00o  reason: collision with other field name */
        public static OooO00o f23521OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Integer f23522OooO00o;
        public boolean OooO0O0 = false;
        public boolean OooO0OO = false;
        public float OooO0Oo = 0.0f;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f23523OooO0Oo = false;
        public int o00oO0O = 0;

        public OooO00o(Context context) {
            super(context);
            setClickable(true);
            setFocusable(true);
            this.f23523OooO0Oo = true;
        }

        public void OooO0O0(boolean z) {
            this.OooO0O0 = z;
            this.f23523OooO0Oo = true;
        }

        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        public void drawableHotspotChanged(float f, float f2) {
            OooO00o oooO00o = f23521OooO00o;
            if (oooO00o == null || oooO00o == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            if (isPressed()) {
                return true;
            }
            return false;
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public void setBackgroundColor(int i) {
            this.o00oO0O = i;
            this.f23523OooO0Oo = true;
        }

        public void setPressed(boolean z) {
            if (z && f23521OooO00o == null) {
                f23521OooO00o = this;
            }
            if (!z || f23521OooO00o == this) {
                super.setPressed(z);
            }
            if (!z && f23521OooO00o == this) {
                f23521OooO00o = null;
            }
        }

        public void OooO00o(Integer num) {
            this.f23522OooO00o = num;
            this.f23523OooO0Oo = true;
        }

        public void OooO00o(float f) {
            this.OooO0Oo = f * getResources().getDisplayMetrics().density;
            this.f23523OooO0Oo = true;
        }

        private Drawable OooO00o(Drawable drawable) {
            Integer num = this.f23522OooO00o;
            if (num != null && drawable != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num.intValue()}));
            }
            return drawable;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m21962OooO00o() {
            if (this.f23523OooO0Oo) {
                this.f23523OooO0Oo = false;
                if (this.o00oO0O == 0) {
                    setBackground(null);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(null);
                }
                if (this.OooO0O0 && Build.VERSION.SDK_INT >= 23) {
                    setForeground(OooO00o(OooO00o()));
                    int i = this.o00oO0O;
                    if (i != 0) {
                        setBackgroundColor(i);
                    }
                } else if (this.o00oO0O == 0 && this.f23522OooO00o == null) {
                    setBackground(OooO00o());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.o00oO0O);
                    Drawable OooO00o2 = OooO00o();
                    float f = this.OooO0Oo;
                    if (f != 0.0f) {
                        paintDrawable.setCornerRadius(f);
                        if (Build.VERSION.SDK_INT >= 21 && (OooO00o2 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.OooO0Oo);
                            ((RippleDrawable) OooO00o2).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    OooO00o(OooO00o2);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, OooO00o2}));
                }
            }
        }

        public void OooO00o(boolean z) {
            this.OooO0OO = z;
        }

        private Drawable OooO00o() {
            int i = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(getResources().getIdentifier((!this.OooO0OO || i < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless", "attr", "android"), OooO00o, true);
            if (i >= 21) {
                return getResources().getDrawable(OooO00o.resourceId, getContext().getTheme());
            }
            return getResources().getDrawable(OooO00o.resourceId);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNGestureHandlerButton";
    }

    @ReactProp(name = ViewProps.BORDER_RADIUS)
    public void setBorderRadius(OooO00o oooO00o, float f) {
        oooO00o.OooO00o(f);
    }

    @ReactProp(name = "borderless")
    public void setBorderless(OooO00o oooO00o, boolean z) {
        oooO00o.OooO00o(z);
    }

    @ReactProp(name = "enabled")
    public void setEnabled(OooO00o oooO00o, boolean z) {
        oooO00o.setEnabled(z);
    }

    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(OooO00o oooO00o, boolean z) {
        oooO00o.OooO0O0(z);
    }

    @ReactProp(name = "rippleColor")
    public void setRippleColor(OooO00o oooO00o, Integer num) {
        oooO00o.OooO00o(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public OooO00o createViewInstance(ThemedReactContext themedReactContext) {
        return new OooO00o(themedReactContext);
    }

    public void onAfterUpdateTransaction(OooO00o oooO00o) {
        oooO00o.m21962OooO00o();
    }
}
