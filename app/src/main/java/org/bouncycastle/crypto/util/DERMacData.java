package org.bouncycastle.crypto.util;

import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.ILI1Ll;
import org.bouncycastle.util.Strings;

public final class DERMacData {
    public final byte[] OooO00o;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bouncycastle.crypto.util.DERMacData$Type[] r0 = org.bouncycastle.crypto.util.DERMacData.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bouncycastle.crypto.util.DERMacData.OooO00o.OooO00o = r0
                org.bouncycastle.crypto.util.DERMacData$Type r1 = org.bouncycastle.crypto.util.DERMacData.Type.UNILATERALU     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.bouncycastle.crypto.util.DERMacData.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bouncycastle.crypto.util.DERMacData$Type r1 = org.bouncycastle.crypto.util.DERMacData.Type.BILATERALU     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.bouncycastle.crypto.util.DERMacData.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bouncycastle.crypto.util.DERMacData$Type r1 = org.bouncycastle.crypto.util.DERMacData.Type.UNILATERALV     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = org.bouncycastle.crypto.util.DERMacData.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bouncycastle.crypto.util.DERMacData$Type r1 = org.bouncycastle.crypto.util.DERMacData.Type.BILATERALV     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.util.DERMacData.OooO00o.<clinit>():void");
        }
    }

    public static final class OooO0O0 {
        public AbstractC6804llL1ii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Type f23890OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f23891OooO00o;
        public AbstractC6804llL1ii OooO0O0;
        public AbstractC6804llL1ii OooO0OO;
        public AbstractC6804llL1ii OooO0Oo;

        public OooO0O0(Type type, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.f23890OooO00o = type;
            this.OooO00o = DerUtil.OooO00o(bArr);
            this.OooO0O0 = DerUtil.OooO00o(bArr2);
            this.OooO0OO = DerUtil.OooO00o(bArr3);
            this.OooO0Oo = DerUtil.OooO00o(bArr4);
        }

        private byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            return C9586iIILl.m21645OooO0O0(C9586iIILl.OooO00o(bArr, bArr2, bArr3), C9586iIILl.OooO00o(bArr4, bArr5, bArr6));
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.f23891OooO00o = DerUtil.OooO00o(new ILI1Ll(false, 0, DerUtil.OooO00o(bArr)));
            return this;
        }

        public DERMacData OooO00o() {
            int i = OooO00o.OooO00o[this.f23890OooO00o.ordinal()];
            if (i == 1 || i == 2) {
                return new DERMacData(OooO00o(this.f23890OooO00o.getHeader(), DerUtil.OooO00o(this.OooO00o), DerUtil.OooO00o(this.OooO0O0), DerUtil.OooO00o(this.OooO0OO), DerUtil.OooO00o(this.OooO0Oo), this.f23891OooO00o), null);
            }
            if (i == 3 || i == 4) {
                return new DERMacData(OooO00o(this.f23890OooO00o.getHeader(), DerUtil.OooO00o(this.OooO0O0), DerUtil.OooO00o(this.OooO00o), DerUtil.OooO00o(this.OooO0Oo), DerUtil.OooO00o(this.OooO0OO), this.f23891OooO00o), null);
            }
            throw new IllegalStateException("Unknown type encountered in build");
        }
    }

    public enum Type {
        UNILATERALU("KC_1_U"),
        UNILATERALV("KC_1_V"),
        BILATERALU("KC_2_U"),
        BILATERALV("KC_2_V");
        
        public final String enc;

        /* access modifiers changed from: public */
        Type(String str) {
            this.enc = str;
        }

        public byte[] getHeader() {
            return Strings.m22985OooO00o(this.enc);
        }
    }

    public DERMacData(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public /* synthetic */ DERMacData(byte[] bArr, OooO00o oooO00o) {
        this(bArr);
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }
}
