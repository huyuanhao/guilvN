package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.iII丨I  reason: invalid class name and case insensitive filesystem */
public class C6088iIII implements AbstractC6317ilLi {
    public llL1LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lllll1 f17495OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9605iL11 f17496OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17497OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Collection f17498OooO00o = new HashSet();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f17499OooO00o;
    public Collection OooO0O0 = new HashSet();

    private Set OooO00o(Collection collection) throws IOException {
        if (collection == null || collection.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (Object obj : collection) {
            if (!(obj instanceof ILI)) {
                obj = ILI.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            }
            hashSet.add(obj);
        }
        return hashSet;
    }

    public llL1LI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Lllll1 m16944OooO00o() {
        return this.f17495OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9605iL11 m16945OooO00o() {
        return this.f17496OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16946OooO00o() {
        return this.f17497OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m16947OooO00o() {
        return Collections.unmodifiableCollection(this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m16948OooO00o() {
        if (this.f17499OooO00o != null) {
            return new Date(this.f17499OooO00o.getTime());
        }
        return null;
    }

    public void OooO00o(ILI ili) {
        this.OooO0O0.add(ili);
    }

    public void OooO00o(llL1LI r1) {
        this.OooO00o = r1;
    }

    public void OooO00o(Lllll1 r1) {
        this.f17495OooO00o = r1;
    }

    public void OooO00o(AbstractC9605iL11 r1) {
        this.f17496OooO00o = r1;
    }

    public void OooO00o(BigInteger bigInteger) {
        this.f17497OooO00o = bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16949OooO00o(Collection collection) throws IOException {
        this.OooO0O0 = OooO00o(collection);
    }

    public void OooO00o(Date date) {
        if (date != null) {
            this.f17499OooO00o = new Date(date.getTime());
        } else {
            this.f17499OooO00o = null;
        }
    }

    public void OooO00o(byte[] bArr) throws IOException {
        OooO00o(ILI.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr)));
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        byte[] extensionValue;
        if (!(obj instanceof AbstractC9605iL11)) {
            return false;
        }
        AbstractC9605iL11 r9 = (AbstractC9605iL11) obj;
        AbstractC9605iL11 r0 = this.f17496OooO00o;
        if (!(r0 == null || r0.equals(r9))) {
            return false;
        }
        if (!(this.f17497OooO00o == null || r9.getSerialNumber().equals(this.f17497OooO00o))) {
            return false;
        }
        if (!(this.OooO00o == null || r9.OooO00o().equals(this.OooO00o))) {
            return false;
        }
        if (!(this.f17495OooO00o == null || r9.m21662OooO00o().equals(this.f17495OooO00o))) {
            return false;
        }
        Date date = this.f17499OooO00o;
        if (date != null) {
            try {
                r9.checkValidity(date);
            } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                return false;
            }
        }
        if ((!this.f17498OooO00o.isEmpty() || !this.OooO0O0.isEmpty()) && (extensionValue = r9.getExtensionValue(C5237III.o00o0OO0.m16387OooO0O0())) != null) {
            try {
                IIl1LLl[] OooO00o2 = C9761IiiLLI.OooO00o(new C5805Ll1(((C6487lIIiIlL) AbstractC6122iIlLiL.OooO00o(extensionValue)).m17938OooO00o()).OooO00o()).OooO00o();
                if (!this.f17498OooO00o.isEmpty()) {
                    boolean z = false;
                    for (IIl1LLl r4 : OooO00o2) {
                        C5620LII[] OooO00o3 = r4.OooO00o();
                        int i = 0;
                        while (true) {
                            if (i >= OooO00o3.length) {
                                break;
                            } else if (this.f17498OooO00o.contains(ILI.OooO00o(OooO00o3[i].OooO0O0()))) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                if (!this.OooO0O0.isEmpty()) {
                    boolean z2 = false;
                    for (IIl1LLl r42 : OooO00o2) {
                        C5620LII[] OooO00o4 = r42.OooO00o();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= OooO00o4.length) {
                                break;
                            } else if (this.OooO0O0.contains(ILI.OooO00o(OooO00o4[i2].OooO00o()))) {
                                z2 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
            } catch (IOException | IllegalArgumentException unused2) {
            }
        }
        return true;
    }

    public Collection OooO0O0() {
        return Collections.unmodifiableCollection(this.f17498OooO00o);
    }

    public void OooO0O0(ILI ili) {
        this.f17498OooO00o.add(ili);
    }

    public void OooO0O0(Collection collection) throws IOException {
        this.f17498OooO00o = OooO00o(collection);
    }

    public void OooO0O0(byte[] bArr) throws IOException {
        OooO0O0(ILI.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr)));
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        C6088iIII r0 = new C6088iIII();
        r0.f17496OooO00o = this.f17496OooO00o;
        r0.f17499OooO00o = m16948OooO00o();
        r0.OooO00o = this.OooO00o;
        r0.f17495OooO00o = this.f17495OooO00o;
        r0.f17497OooO00o = this.f17497OooO00o;
        r0.OooO0O0 = m16947OooO00o();
        r0.f17498OooO00o = OooO0O0();
        return r0;
    }
}
