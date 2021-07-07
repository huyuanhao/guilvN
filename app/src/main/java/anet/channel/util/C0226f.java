package anet.channel.util;

import com.p118pd.sdk.C8932ooOOO0o;
import java.net.Inet6Address;

/* renamed from: anet.channel.util.f */
public class C0226f {

    /* renamed from: a */
    public int f482a;

    /* renamed from: b */
    public Inet6Address f483b;

    public C0226f(Inet6Address inet6Address, int i) {
        this.f482a = i;
        this.f483b = inet6Address;
    }

    public String toString() {
        return this.f483b.getHostAddress() + C8932ooOOO0o.OooO0OO + this.f482a;
    }
}
