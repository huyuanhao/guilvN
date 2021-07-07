package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.l丨l丨lIL  reason: invalid class name and case insensitive filesystem */
public class C6889lllIL {
    public Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f18980OooO00o = new Vector();

    public C9431I OooO00o() {
        return new C9431I(this.f18980OooO00o, this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18043OooO00o() {
        this.OooO00o = new Hashtable();
        this.f18980OooO00o = new Vector();
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) {
        try {
            OooO00o(llLI1, z, r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding value: " + e);
        }
    }

    public void OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        if (!this.OooO00o.containsKey(llLI1)) {
            this.f18980OooO00o.addElement(llLI1);
            this.OooO00o.put(llLI1, new C5551IiL(z, new C6487lIIiIlL(bArr)));
            return;
        }
        throw new IllegalArgumentException("extension " + llLI1 + " already added");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18044OooO00o() {
        return this.f18980OooO00o.isEmpty();
    }
}
