package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.util.i */
public class C0229i {

    /* renamed from: a */
    public static AtomicInteger f489a = new AtomicInteger();

    /* renamed from: a */
    public static String m330a(String str) {
        if (f489a.get() == Integer.MAX_VALUE) {
            f489a.set(0);
        }
        if (!TextUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(f489a.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(f489a.incrementAndGet()));
    }
}
