package com.p118pd.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.openssl.PEMException;

/* renamed from: com.pd.sdk.Ll丨1l丨I  reason: invalid class name and case insensitive filesystem */
public class C5806Ll1lI {
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f16756OooO00o = new HashSet();
    public static final Set OooO0O0 = new HashSet();

    static {
        f16756OooO00o.add(AbstractC5711LiLli.OoooO0);
        f16756OooO00o.add(AbstractC5711LiLli.OoooO0O);
        f16756OooO00o.add(AbstractC5711LiLli.OoooO);
        f16756OooO00o.add(AbstractC5711LiLli.OoooOO0);
        f16756OooO00o.add(AbstractC5711LiLli.o000oOoO);
        f16756OooO00o.add(AbstractC5711LiLli.OoooOOO);
        OooO0O0.add(AbstractC5711LiLli.OoooOOo);
        OooO0O0.add(AbstractC5711LiLli.OoooOoo);
        OooO0O0.add(AbstractC5905LllI.OooOo0);
        OooO0O0.add(AbstractC5905LllI.OooOoo);
        OooO0O0.add(AbstractC5905LllI.Oooo0OO);
        OooO00o.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.OooOo0.m16387OooO0O0(), I11I.OooO00o(128));
        OooO00o.put(AbstractC5905LllI.OooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.Oooo0OO.m16387OooO0O0(), I11I.OooO00o(256));
        OooO00o.put(AbstractC5711LiLli.o000o0OO.m16387OooO0O0(), I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0Oo, I11I.OooO00o(40));
        OooO00o.put(AbstractC5711LiLli.o000o0o, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0o0, I11I.OooO00o(192));
        OooO00o.put(AbstractC5711LiLli.o000o0oO, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0oo, I11I.OooO00o(40));
    }

    public static int OooO00o(String str) {
        if (OooO00o.containsKey(str)) {
            return ((Integer) OooO00o.get(str)).intValue();
        }
        throw new IllegalStateException("no key size for algorithm: " + str);
    }

    public static C6642li1LI OooO00o(String str, char[] cArr, byte[] bArr, int i) {
        C6928llIL r0 = new C6928llIL(new C6461l1liI());
        r0.OooO00o(lLLL1iL.OooO0O0(cArr), bArr, i);
        return (C6642li1LI) r0.OooO0O0(OooO00o(str));
    }

    public static C6642li1LI OooO00o(char[] cArr, int i, byte[] bArr) throws PEMException {
        return OooO00o(cArr, i, bArr, false);
    }

    public static C6642li1LI OooO00o(char[] cArr, int i, byte[] bArr, boolean z) throws PEMException {
        C9695lLlLL r0 = new C9695lLlLL();
        r0.OooO00o(lLLL1iL.OooO0O0(cArr), bArr, 1);
        C6642li1LI r3 = (C6642li1LI) r0.OooO0O0(i * 8);
        if (!z || r3.OooO00o().length != 24) {
            return r3;
        }
        byte[] OooO00o2 = r3.OooO00o();
        System.arraycopy(OooO00o2, 0, OooO00o2, 16, 8);
        return new C6642li1LI(OooO00o2);
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        return llLI1.m16387OooO0O0().startsWith(AbstractC5711LiLli.o000o0O.m16387OooO0O0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132 A[SYNTHETIC, Splitter:B:59:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140 A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0144 A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0165 A[Catch:{ Exception -> 0x016c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0166 A[Catch:{ Exception -> 0x016c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] OooO00o(boolean r16, byte[] r17, char[] r18, java.lang.String r19, byte[] r20) throws org.bouncycastle.openssl.PEMException {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5806Ll1lI.OooO00o(boolean, byte[], char[], java.lang.String, byte[]):byte[]");
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return f16756OooO00o.contains(llLI1);
    }

    public static boolean OooO0OO(LlLI1 llLI1) {
        return OooO0O0.contains(llLI1);
    }
}
