package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5907Ll1LI;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6847lLI;
import com.p118pd.sdk.C9348II1i;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.util.Strings;

public class BCDSAPrivateKey implements DSAPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = -4677259546958385734L;
    public transient LLi1i OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient DSAParams f23898OooO00o;

    /* renamed from: x */
    public BigInteger f13488x;

    public BCDSAPrivateKey() {
    }

    public BCDSAPrivateKey(C5464IlilIi r4) throws IOException {
        C6847lLI OooO00o2 = C6847lLI.OooO00o(r4.m15707OooO0O0().m17587OooO0O0());
        this.f13488x = ((C6513lIiI) r4.m15708OooO0O0()).m17647OooO0O0();
        this.f23898OooO00o = new DSAParameterSpec(OooO00o2.m17999OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.OooO00o());
    }

    public BCDSAPrivateKey(C5907Ll1LI r4) {
        this.f13488x = r4.OooO00o();
        this.f23898OooO00o = new DSAParameterSpec(r4.OooO00o().OooO0O0(), r4.OooO00o().OooO0OO(), r4.OooO00o().m15991OooO00o());
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.f13488x = dSAPrivateKey.getX();
        this.f23898OooO00o = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.f13488x = dSAPrivateKeySpec.getX();
        this.f23898OooO00o = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23898OooO00o = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f23898OooO00o.getP());
        objectOutputStream.writeObject(this.f23898OooO00o.getQ());
        objectOutputStream.writeObject(this.f23898OooO00o.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.OooO00o.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        return C6412iliILI.OooO00o(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(this.f23898OooO00o.getP(), this.f23898OooO00o.getQ(), this.f23898OooO00o.getG()).OooO0O0()), new C6513lIiI(getX()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DSAParams getParams() {
        return this.f23898OooO00o;
    }

    public BigInteger getX() {
        return this.f13488x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.OooO00o.setBagAttribute(llLI1, r3);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o2 = Strings.m22984OooO00o();
        BigInteger modPow = getParams().getG().modPow(this.f13488x, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(C9348II1i.OooO00o(modPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        stringBuffer.append("            y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
