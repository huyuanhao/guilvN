package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.L11丨l1i丨  reason: invalid class name */
public class L11l1i {
    public Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f16155OooO00o = new Vector();

    public iI11IL OooO00o() {
        C5237III[] r0 = new C5237III[this.f16155OooO00o.size()];
        for (int i = 0; i != this.f16155OooO00o.size(); i++) {
            r0[i] = (C5237III) this.OooO00o.get(this.f16155OooO00o.elementAt(i));
        }
        return new iI11IL(r0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15891OooO00o() {
        this.OooO00o = new Hashtable();
        this.f16155OooO00o = new Vector();
    }

    public void OooO00o(C5237III r4) {
        if (!this.OooO00o.containsKey(r4.OooO00o())) {
            this.f16155OooO00o.addElement(r4.OooO00o());
            this.OooO00o.put(r4.OooO00o(), r4);
            return;
        }
        throw new IllegalArgumentException("extension " + r4.OooO00o() + " already added");
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws IOException {
        OooO00o(llLI1, z, r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
    }

    public void OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        if (!this.OooO00o.containsKey(llLI1)) {
            this.f16155OooO00o.addElement(llLI1);
            this.OooO00o.put(llLI1, new C5237III(llLI1, z, new C6487lIIiIlL(bArr)));
            return;
        }
        throw new IllegalArgumentException("extension " + llLI1 + " already added");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15892OooO00o() {
        return this.f16155OooO00o.isEmpty();
    }
}
