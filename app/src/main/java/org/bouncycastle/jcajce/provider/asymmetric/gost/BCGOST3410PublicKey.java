package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.p118pd.sdk.AbstractC5161I11ill;
import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.C5201IIL;
import com.p118pd.sdk.C5569ILi1LL;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9574i1iIiI;
import com.p118pd.sdk.C9683lIi;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.lLi1lILl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.util.Strings;

public class BCGOST3410PublicKey implements GOST3410PublicKey {
    public static final long serialVersionUID = -6251023343619275990L;
    public transient AbstractC5161I11ill OooO00o;

    /* renamed from: y */
    public BigInteger f13493y;

    public BCGOST3410PublicKey(C5201IIL r1, lLi1lILl lli1lill) {
        this.f13493y = r1.OooO00o();
        this.OooO00o = lli1lill;
    }

    public BCGOST3410PublicKey(C5569ILi1LL r5) {
        this.f13493y = r5.OooO0Oo();
        this.OooO00o = new lLi1lILl(new C9683lIi(r5.OooO0O0(), r5.OooO0OO(), r5.OooO00o()));
    }

    public BCGOST3410PublicKey(C6888ll r6) {
        C9574i1iIiI r0 = new C9574i1iIiI((I11li1) r6.m18042OooO0O0().m17587OooO0O0());
        try {
            byte[] OooO00o2 = ((C6487lIIiIlL) r6.OooO0o0()).m17938OooO00o();
            byte[] bArr = new byte[OooO00o2.length];
            for (int i = 0; i != OooO00o2.length; i++) {
                bArr[i] = OooO00o2[(OooO00o2.length - 1) - i];
            }
            this.f13493y = new BigInteger(1, bArr);
            this.OooO00o = lLi1lILl.OooO00o(r0);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    public BCGOST3410PublicKey(BigInteger bigInteger, lLi1lILl lli1lill) {
        this.f13493y = bigInteger;
        this.OooO00o = lli1lill;
    }

    public BCGOST3410PublicKey(GOST3410PublicKey gOST3410PublicKey) {
        this.f13493y = gOST3410PublicKey.getY();
        this.OooO00o = gOST3410PublicKey.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.OooO00o = new lLi1lILl(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.OooO00o = new lLi1lILl(new C9683lIi((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object obj;
        objectOutputStream.defaultWriteObject();
        if (this.OooO00o.m15235OooO00o() != null) {
            obj = this.OooO00o.m15235OooO00o();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.OooO00o.OooO00o().OooO0O0());
            objectOutputStream.writeObject(this.OooO00o.OooO00o().OooO0OO());
            obj = this.OooO00o.OooO00o().OooO00o();
        }
        objectOutputStream.writeObject(obj);
        objectOutputStream.writeObject(this.OooO00o.OooO0O0());
        objectOutputStream.writeObject(this.OooO00o.OooO0OO());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.f13493y.equals(bCGOST3410PublicKey.f13493y) && this.OooO00o.equals(bCGOST3410PublicKey.OooO00o);
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return C6412iliILI.OooO00o(this.OooO00o instanceof lLi1lILl ? this.OooO00o.OooO0OO() != null ? new C6888ll(new C6456l1ilL(AbstractC5331ILi.OooOO0o, new C9574i1iIiI(new LlLI1(this.OooO00o.m15235OooO00o()), new LlLI1(this.OooO00o.OooO0O0()), new LlLI1(this.OooO00o.OooO0OO()))), new C6487lIIiIlL(bArr)) : new C6888ll(new C6456l1ilL(AbstractC5331ILi.OooOO0o, new C9574i1iIiI(new LlLI1(this.OooO00o.m15235OooO00o()), new LlLI1(this.OooO00o.OooO0O0()))), new C6487lIIiIlL(bArr)) : new C6888ll(new C6456l1ilL(AbstractC5331ILi.OooOO0o), new C6487lIIiIlL(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.AbstractC5419Il1i
    public AbstractC5161I11ill getParameters() {
        return this.OooO00o;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public BigInteger getY() {
        return this.f13493y;
    }

    public int hashCode() {
        return this.f13493y.hashCode() ^ this.OooO00o.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o2 = Strings.m22984OooO00o();
        stringBuffer.append("GOST3410 Public Key");
        stringBuffer.append(OooO00o2);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
