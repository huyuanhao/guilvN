package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.丨1i  reason: invalid class name and case insensitive filesystem */
public class C93031i {
    public int OooO00o = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1LI11 f22790OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f22791OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5335ILl f22792OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5562Ill f22793OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L11l1i f22794OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lii1ii1 f22795OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9337I1IlL f22796OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9539LliII f22797OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f22798OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f22799OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f22800OooO00o;

    public C93031i(BigInteger bigInteger) {
        this.f22798OooO00o = bigInteger;
        this.f22794OooO00o = new L11l1i();
        this.f22790OooO00o = new I1LI11();
        this.f22799OooO00o = new ArrayList();
    }

    private C5432IlIlIlL OooO00o(Date date) {
        if (date != null) {
            return new C5432IlIlIlL(date);
        }
        return null;
    }

    public C93031i OooO00o() {
        if (this.f22795OooO00o == null && this.f22796OooO00o == null) {
            this.f22792OooO00o = C6452l1Lll.OooO00o;
            return this;
        }
        throw new IllegalStateException("only one proof of possession allowed");
    }

    public C93031i OooO00o(int i, C6838lIliI r3) {
        if (this.f22795OooO00o != null || this.f22792OooO00o != null || this.f22793OooO00o != null) {
            throw new IllegalStateException("only one proof of possession allowed");
        } else if (i == 2 || i == 3) {
            this.OooO00o = i;
            this.f22796OooO00o = new C9337I1IlL(r3);
            return this;
        } else {
            throw new IllegalArgumentException("type must be ProofOfPossession.TYPE_KEY_ENCIPHERMENT || ProofOfPossession.TYPE_KEY_AGREEMENT");
        }
    }

    public C93031i OooO00o(ILI ili) {
        this.f22791OooO00o = ili;
        return this;
    }

    public C93031i OooO00o(AbstractC5503II11L r2) {
        this.f22799OooO00o.add(r2);
        return this;
    }

    public C93031i OooO00o(C5562Ill r2) {
        if (this.f22795OooO00o == null && this.f22792OooO00o == null && this.f22796OooO00o == null) {
            this.f22793OooO00o = r2;
            return this;
        }
        throw new IllegalStateException("only one proof of possession allowed");
    }

    public C93031i OooO00o(Lii1ii1 r2) {
        if (this.f22796OooO00o == null && this.f22792OooO00o == null && this.f22793OooO00o == null) {
            this.f22795OooO00o = r2;
            return this;
        }
        throw new IllegalStateException("only one proof of possession allowed");
    }

    public C93031i OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws CertIOException {
        C5353IiIl1i.OooO00o(this.f22794OooO00o, llLI1, z, r4);
        return this;
    }

    public C93031i OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        this.f22794OooO00o.OooO00o(llLI1, z, bArr);
        return this;
    }

    public C93031i OooO00o(l1LILI1 r2) {
        return OooO00o(new ILI(r2));
    }

    public C93031i OooO00o(C6838lIliI r2) {
        if (this.f22795OooO00o == null && this.f22792OooO00o == null && this.f22793OooO00o == null) {
            this.OooO00o = 2;
            this.f22796OooO00o = new C9337I1IlL(r2);
            return this;
        }
        throw new IllegalStateException("only one proof of possession allowed");
    }

    public C93031i OooO00o(C6888ll r2) {
        if (r2 != null) {
            this.f22790OooO00o.OooO00o(r2);
        }
        return this;
    }

    public C93031i OooO00o(C9539LliII r1, char[] cArr) {
        this.f22797OooO00o = r1;
        this.f22800OooO00o = cArr;
        return this;
    }

    public C93031i OooO00o(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.f22790OooO00o.OooO00o(new C6513lIiI(bigInteger));
        }
        return this;
    }

    public C93031i OooO00o(Date date, Date date2) {
        this.f22790OooO00o.OooO00o(new C6368iI1II(OooO00o(date), OooO00o(date2)));
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9501LLll m21306OooO00o() throws CRMFException {
        Ll11LL11 ll11LL11;
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(this.f22798OooO00o));
        if (!this.f22794OooO00o.m15892OooO00o()) {
            this.f22790OooO00o.OooO00o(this.f22794OooO00o.OooO00o());
        }
        r0.OooO00o(this.f22790OooO00o.OooO00o());
        if (!this.f22799OooO00o.isEmpty()) {
            iILLL1 r1 = new iILLL1();
            for (AbstractC5503II11L r3 : this.f22799OooO00o) {
                r1.OooO00o(new C6424iL(r3.OooO00o(), r3.m15753OooO00o()));
            }
            r0.OooO00o(new C5707LiL1(r1));
        }
        C9730lILiL OooO00o2 = C9730lILiL.OooO00o(new C5707LiL1(r0));
        iILLL1 r12 = new iILLL1();
        r12.OooO00o(OooO00o2);
        if (this.f22795OooO00o != null) {
            C9502Li OooO00o3 = OooO00o2.m21784OooO00o();
            if (OooO00o3.m21567OooO0O0() == null || OooO00o3.m21564OooO00o() == null) {
                C6523lIliL r2 = new C6523lIliL(OooO00o2.m21784OooO00o().m21564OooO00o());
                ILI ili = this.f22791OooO00o;
                if (ili != null) {
                    r2.OooO00o(ili);
                } else {
                    r2.OooO00o(new C9488LLIIL(this.f22797OooO00o), this.f22800OooO00o);
                }
                ll11LL11 = new Ll11LL11(r2.OooO00o(this.f22795OooO00o));
            } else {
                ll11LL11 = new Ll11LL11(new C6523lIliL(OooO00o2).OooO00o(this.f22795OooO00o));
            }
        } else {
            C9337I1IlL r02 = this.f22796OooO00o;
            if (r02 != null) {
                r12.OooO00o(new Ll11LL11(this.OooO00o, r02));
            } else if (this.f22793OooO00o != null) {
                ll11LL11 = new Ll11LL11(3, C9337I1IlL.OooO00o(new ILI1Ll(false, 3, this.f22793OooO00o)));
            } else if (this.f22792OooO00o != null) {
                ll11LL11 = new Ll11LL11();
            }
            return new C9501LLll(C5309ILiL.OooO00o(new C5707LiL1(r12)));
        }
        r12.OooO00o(ll11LL11);
        return new C9501LLll(C5309ILiL.OooO00o(new C5707LiL1(r12)));
    }

    public C93031i OooO0O0(l1LILI1 r2) {
        if (r2 != null) {
            this.f22790OooO00o.OooO00o(r2);
        }
        return this;
    }

    public C93031i OooO0OO(l1LILI1 r2) {
        if (r2 != null) {
            this.f22790OooO00o.OooO0O0(r2);
        }
        return this;
    }
}
