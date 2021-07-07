package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.IL丨丨l  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5335ILl extends AbstractC6122iIlLiL {
    public static AbstractC5335ILl OooO00o(Object obj) {
        if (obj instanceof AbstractC5335ILl) {
            return (AbstractC5335ILl) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct NULL from byte[]: " + e.getMessage());
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        return iillil instanceof AbstractC5335ILl;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }
}
