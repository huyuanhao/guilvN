package com.megvii.meglive_sdk.p100e.p103b;

import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.text.TextUtils;
import com.megvii.meglive_sdk.p100e.p103b.C1546c;

/* renamed from: com.megvii.meglive_sdk.e.b.e */
public final class RunnableC1549e implements Runnable {

    /* renamed from: a */
    public final Object f2521a = new Object();

    /* renamed from: b */
    public EGLContext f2522b;

    /* renamed from: c */
    public boolean f2523c;

    /* renamed from: d */
    public Object f2524d;

    /* renamed from: e */
    public int f2525e = -1;

    /* renamed from: f */
    public float[] f2526f = new float[32];

    /* renamed from: g */
    public boolean f2527g;

    /* renamed from: h */
    public boolean f2528h;

    /* renamed from: i */
    public int f2529i;

    /* renamed from: j */
    public C1546c f2530j;

    /* renamed from: k */
    public C1546c.C1547a f2531k;

    /* renamed from: l */
    public C1548d f2532l;

    /* renamed from: a */
    public static final RunnableC1549e m2606a(String str) {
        RunnableC1549e eVar = new RunnableC1549e();
        synchronized (eVar.f2521a) {
            if (TextUtils.isEmpty(str)) {
                str = "RenderHandler";
            }
            new Thread(eVar, str).start();
            try {
                eVar.f2521a.wait();
            } catch (InterruptedException unused) {
            }
        }
        return eVar;
    }

    /* renamed from: c */
    private final void m2608c() {
        C1546c.C1547a aVar = this.f2531k;
        if (aVar != null) {
            aVar.mo17170b();
            this.f2531k = null;
        }
        C1548d dVar = this.f2532l;
        if (dVar != null) {
            dVar.mo17171a();
            this.f2532l = null;
        }
        C1546c cVar = this.f2530j;
        if (cVar != null) {
            cVar.mo17167a();
            this.f2530j = null;
        }
    }

    /* renamed from: b */
    public final void mo17173b() {
        synchronized (this.f2521a) {
            if (!this.f2528h) {
                this.f2528h = true;
                this.f2521a.notifyAll();
                try {
                    this.f2521a.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r6.f2530j == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r6.f2525e < 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r6.f2531k.mo17169a();
        android.opengl.GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        r0 = r6.f2532l;
        r2 = r6.f2526f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r2 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r2.length < 32) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        java.lang.System.arraycopy(r2, 16, r0.f2518f, 0, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        android.opengl.Matrix.setIdentityM(r0.f2518f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = r6.f2532l;
        r2 = r6.f2525e;
        r4 = r6.f2526f;
        android.opengl.GLES20.glUseProgram(r0.f2513a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        android.opengl.GLES20.glUniformMatrix4fv(r0.f2517e, 1, false, r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        android.opengl.GLES20.glUniformMatrix4fv(r0.f2516d, 1, false, r0.f2518f, 0);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, r2);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glUseProgram(0);
        r0 = r6.f2531k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        if (android.opengl.EGL14.eglSwapBuffers(r0.f2507a.f2504b, r0.f2508b) != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        android.opengl.EGL14.eglGetError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r0 = r6.f2521a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.f2521a.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f2, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.p100e.p103b.RunnableC1549e.run():void");
    }

    /* renamed from: a */
    public final void mo17172a() {
        m2607a(this.f2525e);
    }

    /* renamed from: a */
    private void m2607a(int i) {
        synchronized (this.f2521a) {
            if (!this.f2528h) {
                this.f2525e = i;
                Matrix.setIdentityM(this.f2526f, 0);
                Matrix.setIdentityM(this.f2526f, 16);
                this.f2529i++;
                this.f2521a.notifyAll();
            }
        }
    }
}
