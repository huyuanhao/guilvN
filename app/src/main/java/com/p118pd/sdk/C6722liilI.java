package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;

/* renamed from: com.pd.sdk.li丨丨ilI丨  reason: invalid class name and case insensitive filesystem */
public class C6722liilI {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iILLL1 f18677OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public il11ii1 f18678OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set f18679OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Set f18680OooO0O0;
    public Set OooO0OO;

    /* renamed from: com.pd.sdk.li丨丨ilI丨$OooO00o */
    public class OooO00o extends iIilII1 {
        public OooO00o(int i) {
            super(IL1Iii.m15473OooO00o(i), IL1Iii.OooO00o(i));
        }
    }

    public C6722liilI(il11ii1 r2, Set set) {
        this(r2, set, null, null);
    }

    public C6722liilI(il11ii1 r2, Set set, Set set2) {
        this(r2, set, set2, null);
    }

    public C6722liilI(il11ii1 r1, Set set, Set set2, Set set3) {
        this.f18678OooO00o = r1;
        this.f18679OooO00o = OooO00o(set);
        this.f18680OooO0O0 = OooO00o(set2);
        this.OooO0OO = OooO00o(set3);
        this.f18677OooO00o = new iILLL1();
    }

    private II1LL OooO00o() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.OooO00o));
        if (this.f18677OooO00o.OooO00o() > 0) {
            r0.OooO00o(C9752I11.OooO00o(new C5707LiL1(this.f18677OooO00o)));
        }
        if (this.OooO0O0 != 0) {
            r0.OooO00o(new OooO00o(this.OooO0O0));
        }
        return II1LL.OooO00o(new C5707LiL1(r0));
    }

    private Set OooO00o(Set set) {
        if (set == null) {
            return set;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Object obj : set) {
            if (obj instanceof String) {
                hashSet.add(new LlLI1((String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    private void OooO00o(int i) {
        this.OooO0O0 = i | this.OooO0O0;
    }

    private void OooO00o(String str) {
        this.f18677OooO00o.OooO00o(new LII(str));
    }

    public Il1i1L OooO00o(int i, int i2, String str) throws TSPException {
        this.OooO00o = i;
        this.f18677OooO00o = new iILLL1();
        OooO00o(i2);
        if (str != null) {
            OooO00o(str);
        }
        try {
            return new Il1i1L(new C9590iIl(OooO00o(), null));
        } catch (IOException unused) {
            throw new TSPException("created badly formatted response!");
        }
    }

    public Il1i1L OooO00o(C1LI1l r2, BigInteger bigInteger, Date date) throws TSPException {
        try {
            return OooO00o(r2, bigInteger, date, "Operation Okay");
        } catch (Exception e) {
            return OooO00o(e);
        }
    }

    public Il1i1L OooO00o(C1LI1l r7, BigInteger bigInteger, Date date, String str) throws TSPException {
        return OooO00o(r7, bigInteger, date, str, null);
    }

    public Il1i1L OooO00o(C1LI1l r4, BigInteger bigInteger, Date date, String str, iI11IL r8) throws TSPException {
        if (date != null) {
            r4.OooO00o(this.f18679OooO00o, this.f18680OooO0O0, this.OooO0OO);
            this.OooO00o = 0;
            this.f18677OooO00o = new iILLL1();
            if (str != null) {
                OooO00o(str);
            }
            try {
                try {
                    return new Il1i1L(new C6120iIlL1(new AbstractC6854lLi1LL[]{OooO00o().OooO0O0(), this.f18678OooO00o.OooO00o(r4, bigInteger, date, r8).m21487OooO00o().m17281OooO00o().OooO0O0()}));
                } catch (IOException unused) {
                    throw new TSPException("created badly formatted response!");
                }
            } catch (TSPException e) {
                throw e;
            } catch (Exception e2) {
                throw new TSPException("Timestamp token received cannot be converted to ContentInfo", e2);
            }
        } else {
            throw new TSPValidationException("The time source is not available.", 512);
        }
    }

    public Il1i1L OooO00o(Exception exc) throws TSPException {
        return OooO00o(2, exc instanceof TSPValidationException ? ((TSPValidationException) exc).getFailureCode() : 1073741824, exc.getMessage());
    }

    public Il1i1L OooO0O0(C1LI1l r2, BigInteger bigInteger, Date date) throws TSPException {
        return OooO00o(r2, bigInteger, date, null);
    }
}
