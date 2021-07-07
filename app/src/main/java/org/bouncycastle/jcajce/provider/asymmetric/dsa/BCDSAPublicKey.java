package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5242IIl;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6847lLI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9348II1i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.util.Strings;

public class BCDSAPublicKey implements DSAPublicKey {
    public static BigInteger OooO00o = BigInteger.valueOf(0);
    public static final long serialVersionUID = 1752452449903495175L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C5242IIl f23899OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient DSAParams f23900OooO00o;

    /* renamed from: y */
    public BigInteger f13489y;

    public BCDSAPublicKey(C5242IIl r5) {
        this.f13489y = r5.OooO00o();
        this.f23900OooO00o = r5 != null ? new DSAParameterSpec(r5.OooO00o().OooO0O0(), r5.OooO00o().OooO0OO(), r5.OooO00o().m15991OooO00o()) : null;
        this.f23899OooO00o = r5;
    }

    public BCDSAPublicKey(C6888ll r4) {
        try {
            this.f13489y = ((C6513lIiI) r4.OooO0o0()).m17647OooO0O0();
            if (OooO00o(r4.m18041OooO00o().m17587OooO0O0())) {
                C6847lLI OooO00o2 = C6847lLI.OooO00o(r4.m18041OooO00o().m17587OooO0O0());
                this.f23900OooO00o = new DSAParameterSpec(OooO00o2.m17999OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.OooO00o());
            } else {
                this.f23900OooO00o = null;
            }
            this.f23899OooO00o = new C5242IIl(this.f13489y, C9348II1i.OooO00o(this.f23900OooO00o));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f13489y = dSAPublicKey.getY();
        this.f23900OooO00o = dSAPublicKey.getParams();
        this.f23899OooO00o = new C5242IIl(this.f13489y, C9348II1i.OooO00o(this.f23900OooO00o));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f13489y = dSAPublicKeySpec.getY();
        this.f23900OooO00o = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.f23899OooO00o = new C5242IIl(this.f13489y, C9348II1i.OooO00o(this.f23900OooO00o));
    }

    private boolean OooO00o(AbstractC6854lLi1LL r2) {
        return r2 != null && !C6452l1Lll.OooO00o.equals(r2.OooO0O0());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(OooO00o)) {
            this.f23900OooO00o = null;
        } else {
            this.f23900OooO00o = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.f23899OooO00o = new C5242IIl(this.f13489y, C9348II1i.OooO00o(this.f23900OooO00o));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger bigInteger;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.f23900OooO00o;
        if (dSAParams == null) {
            bigInteger = OooO00o;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.f23900OooO00o.getQ());
            bigInteger = this.f23900OooO00o.getG();
        }
        objectOutputStream.writeObject(bigInteger);
    }

    public C5242IIl engineGetKeyParameters() {
        return this.f23899OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.f23900OooO00o != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        DSAParams dSAParams = this.f23900OooO00o;
        return dSAParams == null ? C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo), new C6513lIiI(this.f13489y)) : C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(dSAParams.getP(), this.f23900OooO00o.getQ(), this.f23900OooO00o.getG()).OooO0O0()), new C6513lIiI(this.f13489y));
    }

    public String getFormat() {
        return "X.509";
    }

    public DSAParams getParams() {
        return this.f23900OooO00o;
    }

    public BigInteger getY() {
        return this.f13489y;
    }

    public int hashCode() {
        return this.f23900OooO00o != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o2 = Strings.m22984OooO00o();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(C9348II1i.OooO00o(this.f13489y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
