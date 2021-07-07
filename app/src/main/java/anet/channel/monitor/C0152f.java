package anet.channel.monitor;

/* renamed from: anet.channel.monitor.f */
public class C0152f {

    /* renamed from: a */
    public boolean f215a = false;

    /* renamed from: b */
    public long f216b;

    /* renamed from: c */
    public final double f217c = 40.0d;

    /* renamed from: d */
    public boolean f218d = true;

    /* renamed from: a */
    public int mo3518a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo3519a(double d) {
        return d < 40.0d;
    }

    /* renamed from: b */
    public final boolean mo3520b() {
        if (!this.f218d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f216b <= ((long) (mo3518a() * 1000))) {
            return true;
        }
        this.f218d = false;
        return false;
    }
}
