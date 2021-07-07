package com.p118pd.sdk;

import com.qiyukf.basesdk.sdk.ResponseCode;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.Ii1lI  reason: case insensitive filesystem */
public class C5340Ii1lI {
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final short[] f15679OooO00o = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, C6728ll11.OooOoo, 140, 8, 21, C6728ll11.OooOoO0, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, C6728ll11.OooOoo0, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, C6728ll11.OooOoOO, 178, 145, 89, 13, 71, 32, ResponseCode.RES_SUCCESS, 79, 88, 224, 1, 226, 22, 56, 196, C6728ll11.OooOoO, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, C6728ll11.OooOooO, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
    public static final Map OooO0O0 = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final short[] f15680OooO0O0 = {93, 190, 155, 139, 17, 153, C6728ll11.OooOoO0, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, C6728ll11.OooOooO, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, C6728ll11.OooOoo, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, C6728ll11.OooOoO, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, C6728ll11.OooOoo0, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, ResponseCode.RES_SUCCESS, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, C6728ll11.OooOoOO, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
    public static final Map OooO0OO = OooO00o();

    /* renamed from: com.pd.sdk.Ii1lI$OooO00o */
    public static class OooO00o implements AbstractC9677lI1li {
        @Override // com.p118pd.sdk.AbstractC9677lI1li
        public lIL1i11 OooO00o(C6456l1ilL r1) {
            return new C6461l1liI();
        }
    }

    /* renamed from: com.pd.sdk.Ii1lI$OooO0O0 */
    public static class OooO0O0 implements AbstractC9677lI1li {
        @Override // com.p118pd.sdk.AbstractC9677lI1li
        public lIL1i11 OooO00o(C6456l1ilL r1) {
            return new C9495LLIl();
        }
    }

    /* renamed from: com.pd.sdk.Ii1lI$OooO0OO */
    public static class OooO0OO implements AbstractC9677lI1li {
        @Override // com.p118pd.sdk.AbstractC9677lI1li
        public lIL1i11 OooO00o(C6456l1ilL r1) {
            return new I1li1Ll();
        }
    }

    /* renamed from: com.pd.sdk.Ii1lI$OooO0Oo  reason: case insensitive filesystem */
    public static class C5341OooO0Oo implements AbstractC9677lI1li {
        @Override // com.p118pd.sdk.AbstractC9677lI1li
        public lIL1i11 OooO00o(C6456l1ilL r1) {
            return new i1iLLll();
        }
    }

    /* renamed from: com.pd.sdk.Ii1lI$OooO0o0  reason: case insensitive filesystem */
    public static class C5342OooO0o0 implements AbstractC9677lI1li {
        @Override // com.p118pd.sdk.AbstractC9677lI1li
        public lIL1i11 OooO00o(C6456l1ilL r1) {
            return new C5622LILlL();
        }
    }

    static {
        OooO00o.put(L1lI1i.OooO0O0, "DESEDE");
        OooO00o.put(L1lI1i.OooO0o, "AES");
        OooO00o.put(L1lI1i.OooO0oO, "AES");
        OooO00o.put(L1lI1i.OooO0oo, "AES");
        OooO0O0.put(L1lI1i.OooO0O0, "DESEDEMac");
        OooO0O0.put(L1lI1i.OooO0o, "AESMac");
        OooO0O0.put(L1lI1i.OooO0oO, "AESMac");
        OooO0O0.put(L1lI1i.OooO0oo, "AESMac");
        OooO0O0.put(L1lI1i.OooO0OO, "RC2Mac");
    }

    private C5706LiL OooO00o(SecureRandom secureRandom, int i) {
        C5706LiL liL = new C5706LiL();
        liL.OooO00o(new C6470l1i(secureRandom, i));
        return liL;
    }

    public static lIL1i11 OooO00o(C6456l1ilL r1) throws OperatorCreationException {
        return ((AbstractC9677lI1li) OooO0OO.get(r1.OooO00o())).OooO00o(null);
    }

    public static C6744ll1L OooO00o(LlLI1 llLI1) throws CMSException {
        C6927lll1 r3;
        if (AbstractC5905LllI.OooOo0.equals(llLI1) || AbstractC5905LllI.OooOoo.equals(llLI1) || AbstractC5905LllI.Oooo0OO.equals(llLI1)) {
            r3 = new C6927lll1(new C5586L1i());
        } else if (AbstractC5711LiLli.OoooOoo.equals(llLI1)) {
            r3 = new C6927lll1(new C1LliI());
        } else if (AbstractC9733l.OooO0o0.equals(llLI1)) {
            r3 = new C6927lll1(new C6293il1I());
        } else if (AbstractC5711LiLli.Ooooo00.equals(llLI1)) {
            r3 = new C6927lll1(new C5591L1l());
        } else if (AbstractC5702Li111.OooOo0.equals(llLI1)) {
            r3 = new C6927lll1(new LlIlLI());
        } else {
            throw new CMSException("cannot recognise cipher: " + llLI1);
        }
        return new C6600lLi(r3, new C5346IiIIL());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC9875iiI m15557OooO00o(LlLI1 llLI1) throws CMSException {
        if (AbstractC5905LllI.OooOo0.equals(llLI1) || AbstractC5905LllI.OooOoo.equals(llLI1) || AbstractC5905LllI.Oooo0OO.equals(llLI1)) {
            return new C5691LLliL(new C5586L1i());
        }
        if (AbstractC5711LiLli.OoooOoo.equals(llLI1)) {
            return new C5691LLliL(new C1LliI());
        }
        if (AbstractC9733l.OooO0o0.equals(llLI1)) {
            return new C5691LLliL(new C6293il1I());
        }
        if (AbstractC5711LiLli.Ooooo00.equals(llLI1)) {
            return new C5691LLliL(new C5591L1l());
        }
        throw new CMSException("cannot recognise wrapper: " + llLI1);
    }

    public static Object OooO00o(boolean z, AbstractC6370iIIIl r6, C6456l1ilL r7) throws CMSException {
        C6274iilL1L r0;
        LlLI1 OooO00o2 = r7.OooO00o();
        if (OooO00o2.equals(AbstractC5711LiLli.Ooooo0o)) {
            C5739Lil1 r72 = new C5739Lil1();
            r72.OooO00o(z, r6);
            return r72;
        }
        C6744ll1L OooO00o3 = OooO00o(r7.OooO00o());
        AbstractC6122iIlLiL OooO0O02 = r7.m17587OooO0O0().OooO0O0();
        if (OooO0O02 != null && !(OooO0O02 instanceof AbstractC5335ILl)) {
            if (OooO00o2.equals(L1lI1i.OooO0O0) || OooO00o2.equals(L1lI1i.OooO0Oo) || OooO00o2.equals(L1lI1i.OooO0o) || OooO00o2.equals(L1lI1i.OooO0oO) || OooO00o2.equals(L1lI1i.OooO0oo) || OooO00o2.equals(L1lI1i.OooOOo) || OooO00o2.equals(L1lI1i.OooOOoo) || OooO00o2.equals(L1lI1i.OooOo00) || OooO00o2.equals(L1lI1i.OooOo0O) || OooO00o2.equals(AbstractC9733l.OooO0o0)) {
                r0 = new C6274iilL1L(r6, AbstractC6804llL1ii.OooO00o((Object) OooO0O02).m17938OooO00o());
            } else if (OooO00o2.equals(L1lI1i.OooO0o0)) {
                r0 = new C6274iilL1L(r6, C6014i1IL.OooO00o(OooO0O02).OooO00o());
            } else if (OooO00o2.equals(L1lI1i.OooO0OO)) {
                C6721liiLIL OooO00o4 = C6721liiLIL.OooO00o(OooO0O02);
                r0 = new C6274iilL1L(new C6148iL11L(((C6642li1LI) r6).OooO00o(), f15680OooO0O0[OooO00o4.OooO00o().intValue()]), OooO00o4.m17818OooO00o());
            } else {
                throw new CMSException("cannot match parameters");
            }
            OooO00o3.OooO00o(z, r0);
        } else if (OooO00o2.equals(L1lI1i.OooO0O0) || OooO00o2.equals(L1lI1i.OooO0Oo) || OooO00o2.equals(L1lI1i.OooO0o0)) {
            OooO00o3.OooO00o(z, new C6274iilL1L(r6, new byte[8]));
        } else {
            OooO00o3.OooO00o(z, r6);
        }
        return OooO00o3;
    }

    public static Map OooO00o() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC5711LiLli.Oooooo, new OooO00o());
        hashMap.put(AbstractC5711LiLli.OoooooO, new OooO0O0());
        hashMap.put(AbstractC5711LiLli.Ooooooo, new OooO0OO());
        hashMap.put(AbstractC5711LiLli.o0OoOo0, new C5341OooO0Oo());
        hashMap.put(AbstractC5711LiLli.ooOO, new C5342OooO0o0());
        return Collections.unmodifiableMap(hashMap);
    }

    public C5706LiL OooO00o(LlLI1 llLI1, SecureRandom secureRandom) throws CMSException {
        if (AbstractC5905LllI.OooOo0.equals(llLI1)) {
            return OooO00o(secureRandom, 128);
        }
        if (AbstractC5905LllI.OooOoo.equals(llLI1)) {
            return OooO00o(secureRandom, 192);
        }
        if (AbstractC5905LllI.Oooo0OO.equals(llLI1)) {
            return OooO00o(secureRandom, 256);
        }
        if (AbstractC5711LiLli.OoooOoo.equals(llLI1)) {
            I1IiLL r5 = new I1IiLL();
            r5.OooO00o(new C6470l1i(secureRandom, 192));
            return r5;
        } else if (lILIiLL.OooO00o.equals(llLI1)) {
            return OooO00o(secureRandom, 128);
        } else {
            if (lILIiLL.OooO0O0.equals(llLI1)) {
                return OooO00o(secureRandom, 192);
            }
            if (lILIiLL.OooO0OO.equals(llLI1)) {
                return OooO00o(secureRandom, 256);
            }
            if (ll1IL1.OooO00o.equals(llLI1)) {
                return OooO00o(secureRandom, 128);
            }
            if (L1lI1i.OooO0o0.equals(llLI1)) {
                return OooO00o(secureRandom, 128);
            }
            if (AbstractC9733l.OooO0o0.equals(llLI1)) {
                C6203iLIl1 r52 = new C6203iLIl1();
                r52.OooO00o(new C6470l1i(secureRandom, 64));
                return r52;
            } else if (AbstractC5711LiLli.Ooooo0o.equals(llLI1)) {
                return OooO00o(secureRandom, 128);
            } else {
                if (AbstractC5711LiLli.Ooooo00.equals(llLI1)) {
                    return OooO00o(secureRandom, 128);
                }
                throw new CMSException("cannot recognise cipher: " + llLI1);
            }
        }
    }

    public C6456l1ilL OooO00o(LlLI1 llLI1, AbstractC6370iIIIl r4, SecureRandom secureRandom) throws CMSException {
        if (llLI1.equals(L1lI1i.OooO0o) || llLI1.equals(L1lI1i.OooO0oO) || llLI1.equals(L1lI1i.OooO0oo) || llLI1.equals(L1lI1i.OooOOo) || llLI1.equals(L1lI1i.OooOOoo) || llLI1.equals(L1lI1i.OooOo00) || llLI1.equals(L1lI1i.OooOo0O)) {
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            return new C6456l1ilL(llLI1, new C6487lIIiIlL(bArr));
        } else if (llLI1.equals(L1lI1i.OooO0O0) || llLI1.equals(L1lI1i.OooO0Oo) || llLI1.equals(AbstractC9733l.OooO0o0)) {
            byte[] bArr2 = new byte[8];
            secureRandom.nextBytes(bArr2);
            return new C6456l1ilL(llLI1, new C6487lIIiIlL(bArr2));
        } else if (llLI1.equals(L1lI1i.OooO0o0)) {
            byte[] bArr3 = new byte[8];
            secureRandom.nextBytes(bArr3);
            return new C6456l1ilL(llLI1, new C6014i1IL(bArr3, ((C6642li1LI) r4).OooO00o().length * 8));
        } else if (llLI1.equals(AbstractC5711LiLli.Ooooo0o)) {
            return new C6456l1ilL(llLI1, C6452l1Lll.OooO00o);
        } else {
            if (llLI1.equals(AbstractC5711LiLli.Ooooo00)) {
                byte[] bArr4 = new byte[8];
                secureRandom.nextBytes(bArr4);
                return new C6456l1ilL(llLI1, new C6721liiLIL(f15679OooO00o[128], bArr4));
            }
            throw new CMSException("unable to match algorithm");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15558OooO00o(LlLI1 llLI1) {
        String str = (String) OooO00o.get(llLI1);
        return str == null ? llLI1.m16387OooO0O0() : str;
    }
}
