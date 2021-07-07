package com.taobao.accs.data;

import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.data.a */
public class C3110a {
    public static final int SPLITTED_DATA_INDEX = 17;
    public static final int SPLITTED_DATA_MD5 = 18;
    public static final int SPLITTED_DATA_NUMS = 16;
    public static final int SPLITTED_TIME_OUT = 15;

    /* renamed from: a */
    public static final char[] f6933a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public String f6934b;

    /* renamed from: c */
    public int f6935c;

    /* renamed from: d */
    public String f6936d;

    /* renamed from: e */
    public long f6937e;

    /* renamed from: f */
    public volatile int f6938f = 0;

    /* renamed from: g */
    public ScheduledFuture<?> f6939g;

    /* renamed from: h */
    public Map<Integer, byte[]> f6940h = new TreeMap(new C3111b(this));

    public C3110a(String str, int i, String str2) {
        this.f6934b = str;
        this.f6935c = i;
        this.f6936d = str2;
    }

    /* renamed from: a */
    public void mo37579a(long j) {
        if (j <= 0) {
            j = 30000;
        }
        this.f6939g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3112c(this), j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo37580a(int r13, int r14, byte[] r15) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3110a.mo37580a(int, int, byte[]):byte[]");
    }

    /* renamed from: a */
    public static char[] m7340a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f6933a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }
}
