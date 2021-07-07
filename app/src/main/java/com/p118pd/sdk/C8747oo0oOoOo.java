package com.p118pd.sdk;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.List;

/* renamed from: com.pd.sdk.oo0oOoOo  reason: case insensitive filesystem */
public class C8747oo0oOoOo extends ViewGroup {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OrientationEventListener f21926OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextureView$SurfaceTextureListenerC8748oo0oOoo0 f21927OooO00o = null;
    public boolean OooO0O0 = false;
    public int o00oO0O = -1;
    public int o0OOO0o = -1;
    public int o0Oo0oo = 0;
    public int o0ooOO0 = 1;
    public int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f21928o0ooOOo = RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH;
    public int o0ooOoO = -1;

    /* renamed from: com.pd.sdk.oo0oOoOo$OooO00o */
    public class OooO00o extends OrientationEventListener {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            C8747oo0oOoOo oo0ooooo = C8747oo0oOoOo.this;
            if (oo0ooooo.m20389OooO00o((C8747oo0oOoOo) oo0ooooo.OooO00o)) {
                C8747oo0oOoOo.this.OooO0OO();
            }
        }
    }

    public C8747oo0oOoOo(Context context) {
        super(context);
        this.OooO00o = context;
        C8745oo0oOoO0.OooO0o(OooO00o(context));
        OooO00o oooO00o = new OooO00o(context, 3);
        this.f21926OooO00o = oooO00o;
        if (oooO00o.canDetectOrientation()) {
            this.f21926OooO00o.enable();
        } else {
            this.f21926OooO00o.disable();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0OO() {
        OooO00o(getLeft(), getTop(), getRight(), getBottom());
    }

    public void OooO0O0() {
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0O0();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO00o(i, i2, i3, i4);
    }

    public void onViewAdded(View view) {
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != view) {
            removeView(oo0oooo0);
            addView(this.f21927OooO00o, 0);
        }
    }

    public void setAspect(int i) {
        this.o0ooOO0 = i;
        OooO0OO();
    }

    public void setBarCodeTypes(List<String> list) {
        C8745oo0oOoO0.OooO00o().m20384OooO00o(list);
    }

    public void setBarcodeScannerEnabled(boolean z) {
        C8745oo0oOoO0.OooO00o().OooO00o(z);
    }

    public void setCameraType(int i) {
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO00o(i);
            C8745oo0oOoO0.OooO00o().m20382OooO00o(i);
            return;
        }
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo02 = new TextureView$SurfaceTextureListenerC8748oo0oOoo0(this.OooO00o, i);
        this.f21927OooO00o = oo0oooo02;
        int i2 = this.o0OOO0o;
        if (-1 != i2) {
            oo0oooo02.OooO0OO(i2);
        }
        int i3 = this.o0ooOoO;
        if (-1 != i3) {
            this.f21927OooO00o.OooO0Oo(i3);
        }
        int i4 = this.o0Oo0oo;
        if (i4 != 0) {
            this.f21927OooO00o.OooO0o0(i4);
        }
        this.f21927OooO00o.OooO00o(this.OooO0O0);
        addView(this.f21927OooO00o);
    }

    public void setCaptureMode(int i) {
        this.o0ooOOo = i;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0O0(i);
        }
    }

    public void setCaptureQuality(String str) {
        this.f21928o0ooOOo = str;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.m20393OooO00o(str);
        }
    }

    public void setClearWindowBackground(boolean z) {
        this.OooO0O0 = z;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO00o(z);
        }
    }

    public void setFlashMode(int i) {
        this.o0OOO0o = i;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0OO(i);
        }
    }

    public void setOrientation(int i) {
        C8745oo0oOoO0.OooO00o().OooO0o0(i);
        if (this.f21927OooO00o != null) {
            OooO0OO();
        }
    }

    public void setTorchMode(int i) {
        this.o0ooOoO = i;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0Oo(i);
        }
    }

    public void setZoom(int i) {
        this.o0Oo0oo = i;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0o0(i);
        }
    }

    public void OooO00o() {
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.m20392OooO00o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20389OooO00o(Context context) {
        int OooO00o2 = OooO00o(context);
        if (this.o00oO0O == OooO00o2) {
            return false;
        }
        this.o00oO0O = OooO00o2;
        C8745oo0oOoO0.OooO00o().m20387OooO0OO(this.o00oO0O);
        return true;
    }

    private int OooO00o(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    private void OooO00o(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        double d;
        double d2;
        double d3;
        TextureView$SurfaceTextureListenerC8748oo0oOoo0 oo0oooo0 = this.f21927OooO00o;
        if (oo0oooo0 != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            int i7 = this.o0ooOO0;
            if (i7 == 0) {
                d2 = oo0oooo0.m20390OooO00o();
                double d4 = (double) f2;
                Double.isNaN(d4);
                d = d4 * d2;
                d3 = (double) f;
                if (d < d3) {
                    Double.isNaN(d3);
                    i5 = (int) (d3 / d2);
                    i6 = (int) f;
                    int i8 = (int) ((f - ((float) i6)) / 2.0f);
                    int i9 = (int) ((f2 - ((float) i5)) / 2.0f);
                    C8745oo0oOoO0.OooO00o().OooO00o(this.f21927OooO00o.m20391OooO00o(), (int) f, (int) f2);
                    this.f21927OooO00o.layout(i8, i9, i6 + i8, i5 + i9);
                    postInvalidate(getLeft(), getTop(), getRight(), getBottom());
                }
                i6 = (int) d;
            } else if (i7 != 1) {
                i6 = (int) f;
            } else {
                d2 = oo0oooo0.m20390OooO00o();
                double d5 = (double) f2;
                Double.isNaN(d5);
                d = d5 * d2;
                d3 = (double) f;
                if (d > d3) {
                    Double.isNaN(d3);
                    i5 = (int) (d3 / d2);
                    i6 = (int) f;
                    int i82 = (int) ((f - ((float) i6)) / 2.0f);
                    int i92 = (int) ((f2 - ((float) i5)) / 2.0f);
                    C8745oo0oOoO0.OooO00o().OooO00o(this.f21927OooO00o.m20391OooO00o(), (int) f, (int) f2);
                    this.f21927OooO00o.layout(i82, i92, i6 + i82, i5 + i92);
                    postInvalidate(getLeft(), getTop(), getRight(), getBottom());
                }
                i6 = (int) d;
            }
            i5 = (int) f2;
            int i822 = (int) ((f - ((float) i6)) / 2.0f);
            int i922 = (int) ((f2 - ((float) i5)) / 2.0f);
            C8745oo0oOoO0.OooO00o().OooO00o(this.f21927OooO00o.m20391OooO00o(), (int) f, (int) f2);
            this.f21927OooO00o.layout(i822, i922, i6 + i822, i5 + i922);
            postInvalidate(getLeft(), getTop(), getRight(), getBottom());
        }
    }
}
