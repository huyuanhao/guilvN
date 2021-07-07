package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.eac.EACException;

/* renamed from: com.pd.sdk.L丨丨IIiII  reason: invalid class name and case insensitive filesystem */
public class C5911LIIiII {
    public iiLiIlL OooO00o = new l1i11();

    public static IIiLIli OooO00o(EllipticCurve ellipticCurve, BigInteger bigInteger, int i) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            return new IIiLIli.OooO0o(((ECFieldFp) field).getP(), a, b, bigInteger, BigInteger.valueOf((long) i));
        }
        throw new IllegalStateException("not implemented yet!!!");
    }

    public static AbstractC9738llL1L OooO00o(IIiLIli r1, ECPoint eCPoint) {
        return r1.OooO00o(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    private PublicKey OooO00o(C9497LLi1 r4) throws EACException, InvalidKeySpecException {
        try {
            return this.OooO00o.OooO00o("ECDSA").generatePublic(new ECPublicKeySpec(m16493OooO00o(r4), m16492OooO00o(r4)));
        } catch (NoSuchProviderException e) {
            throw new EACException("cannot find provider: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new EACException("cannot find algorithm ECDSA: " + e2.getMessage(), e2);
        }
    }

    public static ECField OooO00o(AbstractC6047i1lLI i1lli) {
        if (Lii1I.OooO0O0(i1lli)) {
            return new ECFieldFp(i1lli.OooO00o());
        }
        AbstractC9760IiI OooO00o2 = ((LiliILiI) i1lli).OooO00o();
        int[] OooO00o3 = OooO00o2.m21891OooO00o();
        return new ECFieldF2m(OooO00o2.OooO00o(), C9586iIILl.OooO0O0(C9586iIILl.m21637OooO00o(OooO00o3, 1, OooO00o3.length - 1)));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private ECParameterSpec m16492OooO00o(C9497LLi1 r8) {
        if (r8.m21550OooO00o()) {
            IIiLIli.OooO0o oooO0o = new IIiLIli.OooO0o(r8.OooO0Oo(), r8.m21552OooO0O0(), r8.OooO0o0(), r8.OooO0OO(), r8.m21549OooO00o());
            AbstractC9738llL1L OooO00o2 = oooO0o.OooO00o(r8.m21551OooO00o());
            return new ECParameterSpec(OooO00o(oooO0o), new ECPoint(OooO00o2.m21802OooO00o().m21859OooO00o(), OooO00o2.m21810OooO0O0().m21859OooO00o()), r8.OooO0OO(), r8.m21549OooO00o().intValue());
        }
        throw new IllegalArgumentException("Public key does not contains EC Params");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private ECPoint m16493OooO00o(C9497LLi1 r8) {
        if (r8.m21550OooO00o()) {
            AbstractC9738llL1L.C9740OooO0o0 oooO0o0 = (AbstractC9738llL1L.C9740OooO0o0) new IIiLIli.OooO0o(r8.OooO0Oo(), r8.m21552OooO0O0(), r8.OooO0o0(), r8.OooO0OO(), r8.m21549OooO00o()).OooO00o(r8.m21553OooO0O0());
            return new ECPoint(oooO0o0.m21802OooO00o().m21859OooO00o(), oooO0o0.m21810OooO0O0().m21859OooO00o());
        }
        throw new IllegalArgumentException("Public key does not contains EC Params");
    }

    public static EllipticCurve OooO00o(IIiLIli r4) {
        return new EllipticCurve(OooO00o(r4.m15391OooO00o()), r4.m15394OooO00o().m21859OooO00o(), r4.m15400OooO0O0().m21859OooO00o(), null);
    }

    public C5911LIIiII OooO00o(String str) {
        this.OooO00o = new I1II1iL(str);
        return this;
    }

    public C5911LIIiII OooO00o(Provider provider) {
        this.OooO00o = new C9821LLl1(provider);
        return this;
    }

    public AbstractC9710lilli OooO00o(LlLI1 llLI1, PublicKey publicKey) {
        if (publicKey instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            return new LIii1II(llLI1, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        ECParameterSpec params = eCPublicKey.getParams();
        return new C9497LLi1(llLI1, ((ECFieldFp) params.getCurve().getField()).getP(), params.getCurve().getA(), params.getCurve().getB(), OooO00o(OooO00o(params.getCurve(), params.getOrder(), params.getCofactor()), params.getGenerator()).m21807OooO00o(), params.getOrder(), OooO00o(OooO00o(params.getCurve(), params.getOrder(), params.getCofactor()), eCPublicKey.getW()).m21807OooO00o(), params.getCofactor());
    }

    public PublicKey OooO00o(AbstractC9710lilli r4) throws EACException, InvalidKeySpecException {
        if (r4.OooO00o().OooO00o(AbstractC9525LlI1.OooOOo)) {
            return OooO00o((C9497LLi1) r4);
        }
        LIii1II lIii1II = (LIii1II) r4;
        try {
            return this.OooO00o.OooO00o(C7491o0OoOOO.OooO00o).generatePublic(new RSAPublicKeySpec(lIii1II.m16089OooO00o(), lIii1II.m16090OooO0O0()));
        } catch (NoSuchProviderException e) {
            throw new EACException("cannot find provider: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new EACException("cannot find algorithm ECDSA: " + e2.getMessage(), e2);
        }
    }
}
