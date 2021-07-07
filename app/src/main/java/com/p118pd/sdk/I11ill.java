package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.cert.X509CRLHolder;

/* renamed from: com.pd.sdk.I11ill */
public class I11ill extends C5607LI1I1iI {
    public I11ill(Collection collection) throws CRLException {
        super(OooO00o(collection));
    }

    public static Collection OooO00o(Collection collection) throws CRLException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509CRL) {
                try {
                    arrayList.add(new X509CRLHolder(((X509CRL) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CRLException("cannot read encoding: " + e.getMessage());
                }
            } else {
                arrayList.add((X509CRLHolder) obj);
            }
        }
        return arrayList;
    }
}
