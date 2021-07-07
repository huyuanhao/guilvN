package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.pd.sdk.i1Ii1iI1 */
public class i1Ii1iI1 implements IIllL1L {
    public Collection OooO00o;

    public i1Ii1iI1(Collection collection) {
        if (collection != null) {
            this.OooO00o = collection;
            return;
        }
        throw new NullPointerException("collection cannot be null");
    }

    public Collection OooO00o() {
        return new ArrayList(this.OooO00o);
    }

    public Object clone() {
        return new i1Ii1iI1(this.OooO00o);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.OooO00o + "\n");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
