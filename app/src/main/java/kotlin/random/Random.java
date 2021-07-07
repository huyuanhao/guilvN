package kotlin.random;

import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.umeng.message.UmengMessageHandler;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0019"}, mo43195d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", FileAttachment.KEY_SIZE, "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Companion", UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME, "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO  reason: invalid package */
public abstract class Random {
    @JvmField
    @NotNull
    public static final OooO00o OooO00o = OooO00o.OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO0O0 f16961OooO00o = new OooO0O0(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Random f16962OooO00o = O000O000.OooO00o.OooO00o();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Default companion object instead")
    /* renamed from: com.pd.sdk.OO$OooO00o */
    public static final class OooO00o extends Random {
        public static final OooO00o OooO0O0 = new OooO00o();

        @Override // kotlin.random.Random, kotlin.random.Random
        public int OooO00o(int i) {
            return Random.f16961OooO00o.OooO00o(i);
        }
    }

    /* renamed from: com.pd.sdk.OO$OooO0O0 */
    public static final class OooO0O0 extends Random {
        public OooO0O0() {
        }

        @Override // kotlin.random.Random, kotlin.random.Random
        public int OooO00o(int i) {
            return Random.f16962OooO00o.OooO00o(i);
        }

        @Override // kotlin.random.Random
        public int OooO0O0(int i) {
            return Random.f16962OooO00o.OooO0O0(i);
        }

        public /* synthetic */ OooO0O0(O0o0o o0o0o) {
            this();
        }

        @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m16532OooO00o() {
            return Random.f16962OooO00o.m16527OooO00o();
        }

        @Override // kotlin.random.Random
        public int OooO00o(int i, int i2) {
            return Random.f16962OooO00o.OooO00o(i, i2);
        }

        @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
        /* renamed from: OooO00o  reason: collision with other method in class */
        public long m16533OooO00o() {
            return Random.f16962OooO00o.m16528OooO00o();
        }

        @Override // kotlin.random.Random
        public long OooO00o(long j) {
            return Random.f16962OooO00o.OooO00o(j);
        }

        @Override // kotlin.random.Random
        public long OooO00o(long j, long j2) {
            return Random.f16962OooO00o.OooO00o(j, j2);
        }

        @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16534OooO00o() {
            return Random.f16962OooO00o.m16529OooO00o();
        }

        @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
        public double OooO00o() {
            return Random.f16962OooO00o.OooO00o();
        }

        @Override // kotlin.random.Random
        public double OooO00o(double d) {
            return Random.f16962OooO00o.OooO00o(d);
        }

        @Override // kotlin.random.Random
        public double OooO00o(double d, double d2) {
            return Random.f16962OooO00o.OooO00o(d, d2);
        }

        @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
        /* renamed from: OooO00o  reason: collision with other method in class */
        public float m16531OooO00o() {
            return Random.f16962OooO00o.m16526OooO00o();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] OooO00o(@NotNull byte[] bArr) {
            o0O0OO00.OooO0o(bArr, "array");
            return Random.f16962OooO00o.OooO00o(bArr);
        }

        @Override // kotlin.random.Random, kotlin.random.Random
        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m16535OooO00o(int i) {
            return Random.f16962OooO00o.m16530OooO00o(i);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] OooO00o(@NotNull byte[] bArr, int i, int i2) {
            o0O0OO00.OooO0o(bArr, "array");
            return Random.f16962OooO00o.OooO00o(bArr, i, i2);
        }
    }

    public abstract int OooO00o(int i);

    public int OooO0O0(int i) {
        return OooO00o(0, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16527OooO00o() {
        return OooO00o(32);
    }

    public int OooO00o(int i, int i2) {
        int i3;
        int OooO00o2;
        int i4;
        OO0.m16536OooO00o(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = OooO00o(C7759o0ooooOO.OooO00o(i5));
            } else {
                do {
                    OooO00o2 = m16527OooO00o() >>> 1;
                    i4 = OooO00o2 % i5;
                } while ((OooO00o2 - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int OooO00o3 = m16527OooO00o();
            if (i <= OooO00o3 && i2 > OooO00o3) {
                return OooO00o3;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m16528OooO00o() {
        return (((long) m16527OooO00o()) << 32) + ((long) m16527OooO00o());
    }

    public long OooO00o(long j) {
        return OooO00o(0L, j);
    }

    public long OooO00o(long j, long j2) {
        long j3;
        long OooO00o2;
        long j4;
        int OooO00o3;
        OO0.OooO00o(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    OooO00o3 = OooO00o(C7759o0ooooOO.OooO00o(i));
                } else if (i2 == 1) {
                    OooO00o3 = m16527OooO00o();
                } else {
                    j3 = (((long) OooO00o(C7759o0ooooOO.OooO00o(i2))) << 32) + ((long) m16527OooO00o());
                }
                j3 = ((long) OooO00o3) & 4294967295L;
            } else {
                do {
                    OooO00o2 = m16528OooO00o() >>> 1;
                    j4 = OooO00o2 % j5;
                } while ((OooO00o2 - j4) + (j5 - 1) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        while (true) {
            long OooO00o4 = m16528OooO00o();
            if (j <= OooO00o4 && j2 > OooO00o4) {
                return OooO00o4;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16529OooO00o() {
        return OooO00o(1) != 0;
    }

    public double OooO00o() {
        return C7759o0ooooOO.OooO00o(OooO00o(26), OooO00o(27));
    }

    public double OooO00o(double d) {
        return OooO00o(AbstractC8352oOoOOoO0.OooO0O0, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double OooO00o(double r7, double r9) {
        /*
            r6 = this;
            com.p118pd.sdk.OO0.OooO00o(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L_0x0044
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0044
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L_0x002b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0044
            double r0 = r6.OooO00o()
            r2 = 2
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r4 = r9 / r2
            java.lang.Double.isNaN(r2)
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x004b
        L_0x0044:
            double r2 = r6.OooO00o()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L_0x004b:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            com.pd.sdk.O0O0O0 r7 = com.p118pd.sdk.O0O0O0.f16953OooO00o
            double r7 = r7.OooO0OO()
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x0059:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.OooO00o(double, double):double");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m16526OooO00o() {
        return ((float) OooO00o(24)) / ((float) 16777216);
    }

    @NotNull
    public static /* synthetic */ byte[] OooO00o(Random oo, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return oo.OooO00o(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] OooO00o(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.OooO00o(byte[], int, int):byte[]");
    }

    @NotNull
    public byte[] OooO00o(@NotNull byte[] bArr) {
        o0O0OO00.OooO0o(bArr, "array");
        return OooO00o(bArr, 0, bArr.length);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16530OooO00o(int i) {
        return OooO00o(new byte[i]);
    }
}
