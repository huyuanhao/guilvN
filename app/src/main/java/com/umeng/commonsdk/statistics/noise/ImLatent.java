package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.megvii.apo.PhoneFingerManager;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.C3656a;
import com.umeng.commonsdk.statistics.common.C3667d;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.AbstractC3701d;
import com.umeng.commonsdk.statistics.internal.StatTracer;

public class ImLatent implements AbstractC3701d {
    public static ImLatent instanse;
    public final int LATENT_MAX = 1800000;
    public final int LATENT_WINDOW = 10;
    public final long _360HOURS_IN_MS = 1296000000;
    public final long _36HOURS_IN_MS = 129600000;
    public final int _DEFAULT_HOURS = 360;
    public final int _DEFAULT_MAX_LATENT = 1800;
    public final int _DEFAULT_MIN_HOURS = 36;
    public final int _DEFAULT_MIN_LATENT = 1;
    public final long _ONE_HOURS_IN_MS = PhoneFingerManager.PER_HOUR_MILLISECOND;
    public Context context;
    public long latentHour = 1296000000;
    public int latentWindow = 10;
    public long mDelay = 0;
    public long mElapsed = 0;
    public boolean mLatentActivite = false;
    public Object mLatentLock = new Object();
    public StatTracer statTracer;
    public C3667d storeHelper;

    public ImLatent(Context context2, StatTracer statTracer2) {
        this.context = context2;
        this.storeHelper = C3667d.m9861a(context2);
        this.statTracer = statTracer2;
    }

    public static synchronized ImLatent getService(Context context2, StatTracer statTracer2) {
        ImLatent imLatent;
        synchronized (ImLatent.class) {
            if (instanse == null) {
                ImLatent imLatent2 = new ImLatent(context2, statTracer2);
                instanse = imLatent2;
                imLatent2.onImprintChanged(ImprintHandler.getImprintService(context2).mo39228c());
            }
            imLatent = instanse;
        }
        return imLatent;
    }

    public long getDelayTime() {
        long j;
        synchronized (this.mLatentLock) {
            j = this.mDelay;
        }
        return j;
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    public boolean isLatentActivite() {
        boolean z;
        synchronized (this.mLatentLock) {
            z = this.mLatentActivite;
        }
        return z;
    }

    public void latentDeactivite() {
        synchronized (this.mLatentLock) {
            this.mLatentActivite = false;
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.AbstractC3701d
    public void onImprintChanged(ImprintHandler.C3671a aVar) {
        int i = 360;
        int intValue = Integer.valueOf(aVar.mo39233a("latent_hours", String.valueOf(360))).intValue();
        if (intValue > 36) {
            i = intValue;
        }
        this.latentHour = ((long) i) * PhoneFingerManager.PER_HOUR_MILLISECOND;
        int intValue2 = Integer.valueOf(aVar.mo39233a(C3617o.f9344aD, "0")).intValue();
        if (intValue2 < 1 || intValue2 > 1800) {
            intValue2 = 0;
        }
        if (intValue2 == 0) {
            int i2 = C3656a.f9557c;
            if (i2 <= 0 || i2 > 1800000) {
                this.latentWindow = 10;
            } else {
                this.latentWindow = i2;
            }
        } else {
            this.latentWindow = intValue2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r4 = java.lang.System.currentTimeMillis() - r8.statTracer.getLastReqTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r4 <= r8.latentHour) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r1 = com.umeng.commonsdk.statistics.idtracking.Envelope.getSignature(r8.context);
        r2 = r8.mLatentLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8.mDelay = (long) com.umeng.commonsdk.statistics.common.DataHelper.random(r8.latentWindow, r1);
        r8.mElapsed = r4;
        r8.mLatentActivite = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r4 <= 129600000) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r2 = r8.mLatentLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.mDelay = 0;
        r8.mElapsed = r4;
        r8.mLatentActivite = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0061, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldStartLatency() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.noise.ImLatent.shouldStartLatency():boolean");
    }
}
