package com.megvii.meglive_sdk.p100e.p103b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

@TargetApi(18)
/* renamed from: com.megvii.meglive_sdk.e.b.c */
public final class C1546c {

    /* renamed from: a */
    public EGLContext f2503a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b */
    public EGLDisplay f2504b;

    /* renamed from: c */
    public EGLConfig f2505c = null;

    /* renamed from: d */
    public EGLContext f2506d;

    /* renamed from: com.megvii.meglive_sdk.e.b.c$a */
    public static class C1547a {

        /* renamed from: a */
        public final C1546c f2507a;

        /* renamed from: b */
        public EGLSurface f2508b = EGL14.EGL_NO_SURFACE;

        /* renamed from: c */
        public final int f2509c;

        /* renamed from: d */
        public final int f2510d;

        public C1547a(C1546c cVar, Object obj) {
            if ((obj instanceof SurfaceView) || (obj instanceof Surface) || (obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
                this.f2507a = cVar;
                EGLSurface a = cVar.mo17166a(obj);
                this.f2508b = a;
                this.f2509c = this.f2507a.mo17165a(a, 12375);
                this.f2510d = this.f2507a.mo17165a(this.f2508b, 12374);
                return;
            }
            throw new IllegalArgumentException("unsupported surface");
        }

        /* renamed from: a */
        public final void mo17169a() {
            C1546c cVar = this.f2507a;
            EGLSurface eGLSurface = this.f2508b;
            if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
                EGL14.eglGetError();
            } else if (!EGL14.eglMakeCurrent(cVar.f2504b, eGLSurface, eGLSurface, cVar.f2503a)) {
                new StringBuilder("eglMakeCurrent:").append(EGL14.eglGetError());
            }
        }

        /* renamed from: b */
        public final void mo17170b() {
            this.f2507a.mo17168b();
            C1546c cVar = this.f2507a;
            EGLSurface eGLSurface = this.f2508b;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                EGL14.eglMakeCurrent(cVar.f2504b, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(cVar.f2504b, eGLSurface);
            }
            this.f2508b = EGL14.EGL_NO_SURFACE;
        }
    }

    public C1546c(EGLContext eGLContext, boolean z) {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f2504b = eGLDisplay;
        this.f2506d = EGL14.EGL_NO_CONTEXT;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f2504b = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
                    if (this.f2503a == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig a = m2598a(z);
                        this.f2505c = a;
                        if (a != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f2504b, a, eGLContext, new int[]{12440, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.f2503a = eglCreateContext;
                            } else {
                                throw new RuntimeException("eglCreateContext" + ": EGL error: 0x" + Integer.toHexString(eglGetError));
                            }
                        } else {
                            throw new RuntimeException("chooseConfig failed");
                        }
                    }
                    EGL14.eglQueryContext(this.f2504b, this.f2503a, 12440, new int[1], 0);
                    mo17168b();
                    return;
                }
                this.f2504b = null;
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }
        throw new RuntimeException("EGL already set up");
    }

    /* renamed from: a */
    public final void mo17167a() {
        EGLDisplay eGLDisplay = this.f2504b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            if (!EGL14.eglDestroyContext(eGLDisplay, this.f2503a)) {
                StringBuilder sb = new StringBuilder("display:");
                sb.append(this.f2504b);
                sb.append(" context: ");
                sb.append(this.f2503a);
                new StringBuilder("eglDestroyContex:").append(EGL14.eglGetError());
            }
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            this.f2503a = eGLContext;
            EGLContext eGLContext2 = this.f2506d;
            if (eGLContext2 != eGLContext) {
                if (!EGL14.eglDestroyContext(this.f2504b, eGLContext2)) {
                    StringBuilder sb2 = new StringBuilder("display:");
                    sb2.append(this.f2504b);
                    sb2.append(" context: ");
                    sb2.append(this.f2506d);
                    new StringBuilder("eglDestroyContex:").append(EGL14.eglGetError());
                }
                this.f2506d = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.f2504b);
            EGL14.eglReleaseThread();
        }
        this.f2504b = EGL14.EGL_NO_DISPLAY;
        this.f2503a = EGL14.EGL_NO_CONTEXT;
    }

    /* renamed from: b */
    public final void mo17168b() {
        EGLDisplay eGLDisplay = this.f2504b;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            new StringBuilder("makeDefault").append(EGL14.eglGetError());
        }
    }

    /* renamed from: a */
    public final int mo17165a(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f2504b, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: a */
    public final EGLSurface mo17166a(Object obj) {
        try {
            return EGL14.eglCreateWindowSurface(this.f2504b, this.f2505c, obj, new int[]{12344}, 0);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private EGLConfig m2598a(boolean z) {
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344, 12344, 12344, 12344, 12344, 12344, 12344};
        int i = 10;
        if (z && Build.VERSION.SDK_INT >= 18) {
            iArr[10] = 12610;
            i = 12;
            iArr[11] = 1;
        }
        for (int i2 = 16; i2 >= i; i2--) {
            iArr[i2] = 12344;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f2504b, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        return eGLConfigArr[0];
    }
}
