package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨Ll1LI  reason: invalid class name and case insensitive filesystem */
public interface AbstractC9523Ll1LI extends AbstractC6799ll {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;

    /* renamed from: com.pd.sdk.丨Ll1LI$OooO00o */
    public static final class OooO00o {
        public static final OooO00o OooO00o = new OooO00o("HMacSHA1", new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o));
        public static final OooO00o OooO0O0 = new OooO00o("HMacSHA224", new C6456l1ilL(AbstractC5711LiLli.OoooooO, C6452l1Lll.OooO00o));
        public static final OooO00o OooO0OO = new OooO00o("HMacSHA256", new C6456l1ilL(AbstractC5711LiLli.Ooooooo, C6452l1Lll.OooO00o));
        public static final OooO00o OooO0Oo = new OooO00o("HMacSHA384", new C6456l1ilL(AbstractC5711LiLli.o0OoOo0, C6452l1Lll.OooO00o));
        public static final OooO00o OooO0o0 = new OooO00o("HMacSHA512", new C6456l1ilL(AbstractC5711LiLli.ooOO, C6452l1Lll.OooO00o));

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6456l1ilL f23096OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f23097OooO00o;

        public OooO00o(String str, C6456l1ilL r2) {
            this.f23097OooO00o = str;
            this.f23096OooO00o = r2;
        }

        public C6456l1ilL OooO00o() {
            return this.f23096OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m21584OooO00o() {
            return this.f23097OooO00o;
        }
    }

    int OooO00o();

    LL1L OooO00o(C6456l1ilL v, C6456l1ilL v2, byte[] bArr, byte[] bArr2) throws CMSException;

    byte[] OooO00o(int i, C6456l1ilL v, int i2) throws CMSException;

    char[] getPassword();
}
