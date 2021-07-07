package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* renamed from: com.xiaomi.push.cz */
public final class C4339cz {

    /* renamed from: a */
    public int f11559a;

    /* renamed from: a */
    public String f11560a;

    public C4339cz(String str, int i) {
        this.f11560a = str;
        this.f11559a = i;
    }

    /* renamed from: a */
    public static C4339cz m12015a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(Constants.COLON_SEPARATOR);
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new C4339cz(str, i);
    }

    /* renamed from: a */
    public static InetSocketAddress m12016a(String str, int i) {
        C4339cz a = m12015a(str, i);
        return new InetSocketAddress(a.m12018a(), a.mo41636a());
    }

    /* renamed from: a */
    public int mo41636a() {
        return this.f11559a;
    }

    /* renamed from: a */
    public String m12018a() {
        return this.f11560a;
    }

    public String toString() {
        if (this.f11559a <= 0) {
            return this.f11560a;
        }
        return this.f11560a + Constants.COLON_SEPARATOR + this.f11559a;
    }
}
