package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.p118pd.sdk.AbstractC5161I11ill;
import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6463l1lI;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C9344I1ll;
import com.p118pd.sdk.C9574i1iIiI;
import com.p118pd.sdk.C9683lIi;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.lLi1lILl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;

public class BCGOST3410PrivateKey implements GOST3410PrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = 8581661527592305464L;
    public transient AbstractC5161I11ill OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient AbstractC6786llil f23936OooO00o = new LLi1i();

    /* renamed from: x */
    public BigInteger f13492x;

    public BCGOST3410PrivateKey() {
    }

    public BCGOST3410PrivateKey(C5464IlilIi r6) throws IOException {
        BigInteger bigInteger;
        C9574i1iIiI OooO00o2 = C9574i1iIiI.OooO00o(r6.m15707OooO0O0().m17587OooO0O0());
        AbstractC6854lLi1LL OooO0O0 = r6.m15708OooO0O0();
        if (OooO0O0 instanceof C6513lIiI) {
            bigInteger = C6513lIiI.OooO00o(OooO0O0).OooO00o();
        } else {
            byte[] OooO00o3 = AbstractC6804llL1ii.OooO00o(r6.m15708OooO0O0()).m17938OooO00o();
            byte[] bArr = new byte[OooO00o3.length];
            for (int i = 0; i != OooO00o3.length; i++) {
                bArr[i] = OooO00o3[(OooO00o3.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.f13492x = bigInteger;
        this.OooO00o = lLi1lILl.OooO00o(OooO00o2);
    }

    public BCGOST3410PrivateKey(C6463l1lI r2, lLi1lILl lli1lill) {
        this.f13492x = r2.OooO00o();
        this.OooO00o = lli1lill;
        if (lli1lill == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    public BCGOST3410PrivateKey(C9344I1ll r5) {
        this.f13492x = r5.OooO0Oo();
        this.OooO00o = new lLi1lILl(new C9683lIi(r5.OooO0O0(), r5.OooO0OO(), r5.OooO00o()));
    }

    public BCGOST3410PrivateKey(GOST3410PrivateKey gOST3410PrivateKey) {
        this.f13492x = gOST3410PrivateKey.getX();
        this.OooO00o = gOST3410PrivateKey.getParameters();
    }

    private boolean OooO00o(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.OooO00o = new lLi1lILl(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.OooO00o = new lLi1lILl(new C9683lIi((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.f23936OooO00o = new LLi1i();
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
        if (!(obj instanceof GOST3410PrivateKey)) {
            return false;
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) obj;
        return getX().equals(gOST3410PrivateKey.getX()) && getParameters().OooO00o().equals(gOST3410PrivateKey.getParameters().OooO00o()) && getParameters().OooO0O0().equals(gOST3410PrivateKey.getParameters().OooO0O0()) && OooO00o(getParameters().OooO0OO(), gOST3410PrivateKey.getParameters().OooO0OO());
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.f23936OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.f23936OooO00o.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.OooO00o instanceof lLi1lILl ? new C5464IlilIi(new C6456l1ilL(AbstractC5331ILi.OooOO0o, new C9574i1iIiI(new LlLI1(this.OooO00o.m15235OooO00o()), new LlLI1(this.OooO00o.OooO0O0()))), new C6487lIIiIlL(bArr)) : new C5464IlilIi(new C6456l1ilL(AbstractC5331ILi.OooOO0o), new C6487lIIiIlL(bArr))).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC5419Il1i
    public AbstractC5161I11ill getParameters() {
        return this.OooO00o;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public BigInteger getX() {
        return this.f13492x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.f23936OooO00o.setBagAttribute(llLI1, r3);
    }
}
