package anet.channel.util;

import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: anet.channel.util.g */
public class C0227g {

    /* renamed from: a */
    public static C0227g f484a;

    /* renamed from: b */
    public final Proxy f485b;

    /* renamed from: c */
    public final String f486c;

    /* renamed from: d */
    public final String f487d;

    public C0227g(String str, int i, String str2, String str3) {
        this.f485b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        this.f486c = str2;
        this.f487d = str3;
    }

    /* renamed from: a */
    public static C0227g m326a() {
        return f484a;
    }

    /* renamed from: b */
    public Proxy mo3775b() {
        return this.f485b;
    }

    /* renamed from: c */
    public String mo3776c() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f486c);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f487d);
        String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 0);
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Basic ");
        sb2.append(encodeToString);
        return sb2.toString();
    }
}
