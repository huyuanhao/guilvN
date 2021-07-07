package anet.channel.strategy;

import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

public class ConnHistoryItem implements Serializable {

    /* renamed from: a */
    public byte f329a = 0;

    /* renamed from: b */
    public long f330b = 0;

    /* renamed from: c */
    public long f331c = 0;

    /* renamed from: a */
    public void mo3636a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - (z ? this.f330b : this.f331c) > TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE) {
            this.f329a = (byte) ((this.f329a << 1) | (!z ? 1 : 0));
            if (z) {
                this.f330b = currentTimeMillis;
            } else {
                this.f331c = currentTimeMillis;
            }
        }
    }

    /* renamed from: b */
    public boolean mo3637b() {
        return (this.f329a & 1) == 1;
    }

    /* renamed from: c */
    public boolean mo3638c() {
        if (mo3635a() >= 3 && System.currentTimeMillis() - this.f331c <= Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo3639d() {
        long j = this.f330b;
        long j2 = this.f331c;
        if (j <= j2) {
            j = j2;
        }
        return j != 0 && System.currentTimeMillis() - j > 86400000;
    }

    /* renamed from: a */
    public int mo3635a() {
        int i = 0;
        for (int i2 = this.f329a & 255; i2 > 0; i2 >>= 1) {
            i += i2 & 1;
        }
        return i;
    }
}
