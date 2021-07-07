package com.p118pd.sdk;

import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.p003os.OperationCanceledException;

/* renamed from: com.pd.sdk.o00O0O0o  reason: case insensitive filesystem */
public final class C7056o00O0O0o {
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f19323OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19324OooO00o;
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.o00O0O0o$OooO00o */
    public interface OooO00o {
        void onCancel();
    }

    private void OooO0OO() {
        while (this.OooO0O0) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18327OooO00o() {
        boolean z;
        synchronized (this) {
            z = this.f19324OooO00o;
        }
        return z;
    }

    public void OooO0O0() {
        if (m18327OooO00o()) {
            throw new OperationCanceledException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.OooO0O0 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.OooO0O0 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18326OooO00o() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f19324OooO00o     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f19324OooO00o = r0     // Catch:{ all -> 0x003e }
            r4.OooO0O0 = r0     // Catch:{ all -> 0x003e }
            com.pd.sdk.o00O0O0o$OooO00o r0 = r4.OooO00o     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f19323OooO00o     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.OooO0O0 = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.OooO0O0 = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7056o00O0O0o.m18326OooO00o():void");
    }

    public void OooO00o(OooO00o oooO00o) {
        synchronized (this) {
            OooO0OO();
            if (this.OooO00o != oooO00o) {
                this.OooO00o = oooO00o;
                if (this.f19324OooO00o) {
                    if (oooO00o != null) {
                        oooO00o.onCancel();
                    }
                }
            }
        }
    }

    public Object OooO00o() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f19323OooO00o == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f19323OooO00o = cancellationSignal;
                if (this.f19324OooO00o) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f19323OooO00o;
        }
        return obj;
    }
}
