package com.p118pd.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.lLlIII  reason: case insensitive filesystem */
public abstract class AbstractC6617lLlIII {
    public static final Hashtable OooO00o;

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put(AbstractC9525LlI1.OooOO0o, "SHA1withRSA");
        OooO00o.put(AbstractC9525LlI1.OooOOO0, "SHA256withRSA");
        OooO00o.put(AbstractC9525LlI1.OooOOO, "SHA1withRSAandMGF1");
        OooO00o.put(AbstractC9525LlI1.OooOOOO, "SHA256withRSAandMGF1");
        OooO00o.put(AbstractC9525LlI1.OooOOOo, "SHA512withRSA");
        OooO00o.put(AbstractC9525LlI1.OooOOo0, "SHA512withRSAandMGF1");
        OooO00o.put(AbstractC9525LlI1.OooOOoo, "SHA1withECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo00, "SHA224withECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0, "SHA256withECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0O, "SHA384withECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0o, "SHA512withECDSA");
    }

    public Signature OooO00o(LlLI1 llLI1) throws NoSuchProviderException, NoSuchAlgorithmException {
        return OooO00o((String) OooO00o.get(llLI1));
    }

    public abstract Signature OooO00o(String str) throws NoSuchProviderException, NoSuchAlgorithmException;
}
