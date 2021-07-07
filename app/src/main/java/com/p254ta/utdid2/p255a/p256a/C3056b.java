package com.p254ta.utdid2.p255a.p256a;

import android.annotation.SuppressLint;
import com.p118pd.sdk.C8027oOO00oo;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ta.utdid2.a.a.b */
public class C3056b {

    /* renamed from: a */
    public static final /* synthetic */ boolean f6747a = (!C3056b.class.desiredAssertionStatus());

    /* renamed from: com.ta.utdid2.a.a.b$a */
    public static abstract class AbstractC3057a {

        /* renamed from: a */
        public int f6748a;

        /* renamed from: a */
        public byte[] f6749a;
    }

    /* renamed from: com.ta.utdid2.a.a.b$b */
    public static class C3058b extends AbstractC3057a {

        /* renamed from: a */
        public static final int[] f6750a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: b */
        public static final int[] f6751b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        public final int[] f6752c;
        public int state;
        public int value;

        public C3058b(int i, byte[] bArr) {
            ((AbstractC3057a) this).f6749a = bArr;
            this.f6752c = (i & 8) == 0 ? f6750a : f6751b;
            this.state = 0;
            this.value = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:70:0x00f1 A[EDGE_INSN: B:70:0x00f1->B:53:0x00f1 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo37249a(byte[] r17, int r18, int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 293
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p254ta.utdid2.p255a.p256a.C3056b.C3058b.mo37249a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: com.ta.utdid2.a.a.b$c */
    public static class C3059c extends AbstractC3057a {

        /* renamed from: a */
        public static final /* synthetic */ boolean f6753a = (!C3056b.class.desiredAssertionStatus());

        /* renamed from: b */
        public static final byte[] f6754b = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: c */
        public static final byte[] f6755c = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: b */
        public int f6756b;

        /* renamed from: b */
        public final boolean f6757b;

        /* renamed from: c */
        public final boolean f6758c;
        public int count;

        /* renamed from: d */
        public final boolean f6759d;

        /* renamed from: d */
        public final byte[] f6760d;

        /* renamed from: e */
        public final byte[] f6761e;

        public C3059c(int i, byte[] bArr) {
            ((AbstractC3057a) this).f6749a = bArr;
            boolean z = true;
            this.f6757b = (i & 1) == 0;
            this.f6758c = (i & 2) == 0;
            this.f6759d = (i & 4) == 0 ? false : z;
            this.f6761e = (i & 8) == 0 ? f6754b : f6755c;
            this.f6760d = new byte[2];
            this.f6756b = 0;
            this.count = this.f6758c ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        public boolean mo37250a(byte[] r18, int r19, int r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 518
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p254ta.utdid2.p255a.p256a.C3056b.C3059c.mo37250a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    @SuppressLint({"Assert"})
    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        C3059c cVar = new C3059c(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!cVar.f6757b) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.f6758c && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.f6759d) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        ((AbstractC3057a) cVar).f6749a = new byte[i4];
        cVar.mo37250a(bArr, i, i2, true);
        if (f6747a || ((AbstractC3057a) cVar).f6748a == i4) {
            return ((AbstractC3057a) cVar).f6749a;
        }
        throw new AssertionError();
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        C3058b bVar = new C3058b(i3, new byte[((i2 * 3) / 4)]);
        if (bVar.mo37249a(bArr, i, i2, true)) {
            int i4 = ((AbstractC3057a) bVar).f6748a;
            byte[] bArr2 = ((AbstractC3057a) bVar).f6749a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
