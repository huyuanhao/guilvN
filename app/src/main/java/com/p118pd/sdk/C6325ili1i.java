package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.ili1丨i丨  reason: invalid class name and case insensitive filesystem */
public class C6325ili1i extends KeyStoreSpi implements iI1Il1 {
    public static final int o000000 = 0;
    public static final int o000000O = 1;
    public static final int o000000o = 2;
    public static final int o000OOo = 4;
    public static final int o0O0O00 = 3;
    public static final int o0OO00O = 1;
    public static final int o0OOO0o = 1024;
    public static final int o0Oo0oo = 0;
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 20;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f18040o0ooOOo = "PBEWithSHAAndTwofish-CBC";
    public static final int o0ooOoO = 20;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f18041o0ooOoO = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    public static final int oo0o0Oo = 2;
    public final ii1I11l OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18042OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f18043OooO00o = new Hashtable();
    public int o00oO0O;

    /* renamed from: com.pd.sdk.ili1丨i丨$OooO00o */
    public static class OooO00o extends C6325ili1i {
        public OooO00o() {
            super(1);
        }

        @Override // com.p118pd.sdk.C6325ili1i, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            ((C6325ili1i) this).f18043OooO00o.clear();
            if (inputStream != null) {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                int readInt = dataInputStream.readInt();
                if (readInt == 2 || readInt == 0 || readInt == 1) {
                    int readInt2 = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt2];
                    if (readInt2 == 20) {
                        dataInputStream.readFully(bArr);
                        int readInt3 = dataInputStream.readInt();
                        if (readInt3 < 0 || readInt3 > 65536) {
                            throw new IOException("Key store corrupted.");
                        }
                        CipherInputStream cipherInputStream = new CipherInputStream(dataInputStream, OooO00o(readInt == 0 ? "OldPBEWithSHAAndTwofish-CBC" : C6325ili1i.f18040o0ooOOo, 2, cArr, bArr, readInt3));
                        C6461l1liI l1lii = new C6461l1liI();
                        OooO00o(new C9355IIlL(cipherInputStream, l1lii));
                        byte[] bArr2 = new byte[l1lii.OooO0O0()];
                        l1lii.OooO00o(bArr2, 0);
                        byte[] bArr3 = new byte[l1lii.OooO0O0()];
                        C6304ilIi1.OooO00o(cipherInputStream, bArr3);
                        if (!C9586iIILl.OooO0O0(bArr2, bArr3)) {
                            ((C6325ili1i) this).f18043OooO00o.clear();
                            throw new IOException("KeyStore integrity check failed.");
                        }
                        return;
                    }
                    throw new IOException("Key store corrupted.");
                }
                throw new IOException("Wrong version of key store.");
            }
        }

        @Override // com.p118pd.sdk.C6325ili1i, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int nextInt = (((C6325ili1i) this).f18042OooO00o.nextInt() & 1023) + 1024;
            ((C6325ili1i) this).f18042OooO00o.nextBytes(bArr);
            dataOutputStream.writeInt(this.o00oO0O);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, OooO00o(C6325ili1i.f18040o0ooOOo, 1, cArr, bArr, nextInt));
            C9537LlllII r8 = new C9537LlllII(new C6461l1liI());
            OooO00o(new C5741LilILl(cipherOutputStream, r8));
            cipherOutputStream.write(r8.OooO0O0());
            cipherOutputStream.close();
        }
    }

    /* renamed from: com.pd.sdk.ili1丨i丨$OooO0O0 */
    public static class OooO0O0 extends C6325ili1i {
        public OooO0O0() {
            super(2);
        }
    }

    /* renamed from: com.pd.sdk.ili1丨i丨$OooO0OO */
    public class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f18045OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f18046OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Date f18047OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Certificate[] f18048OooO00o;

        public OooO0OO(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Exception {
            this.f18047OooO00o = new Date();
            this.OooO00o = 4;
            this.f18046OooO00o = str;
            this.f18048OooO00o = certificateArr;
            byte[] bArr = new byte[20];
            C6325ili1i.this.f18042OooO00o.setSeed(System.currentTimeMillis());
            C6325ili1i.this.f18042OooO00o.nextBytes(bArr);
            int nextInt = (C6325ili1i.this.f18042OooO00o.nextInt() & 1023) + 1024;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, C6325ili1i.this.OooO00o(C6325ili1i.f18041o0ooOoO, 1, cArr, bArr, nextInt)));
            C6325ili1i.this.OooO00o((C6325ili1i) key, (Key) dataOutputStream2);
            dataOutputStream2.close();
            this.f18045OooO00o = byteArrayOutputStream.toByteArray();
        }

        public OooO0OO(String str, Certificate certificate) {
            this.f18047OooO00o = new Date();
            this.OooO00o = 1;
            this.f18046OooO00o = str;
            this.f18045OooO00o = certificate;
            this.f18048OooO00o = null;
        }

        public OooO0OO(String str, Date date, int i, Object obj) {
            this.f18047OooO00o = new Date();
            this.f18046OooO00o = str;
            this.f18047OooO00o = date;
            this.OooO00o = i;
            this.f18045OooO00o = obj;
        }

        public OooO0OO(String str, Date date, int i, Object obj, Certificate[] certificateArr) {
            this.f18047OooO00o = new Date();
            this.f18046OooO00o = str;
            this.f18047OooO00o = date;
            this.OooO00o = i;
            this.f18045OooO00o = obj;
            this.f18048OooO00o = certificateArr;
        }

        public OooO0OO(String str, byte[] bArr, Certificate[] certificateArr) {
            this.f18047OooO00o = new Date();
            this.OooO00o = 3;
            this.f18046OooO00o = str;
            this.f18045OooO00o = bArr;
            this.f18048OooO00o = certificateArr;
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object m17379OooO00o() {
            return this.f18045OooO00o;
        }

        public Object OooO00o(char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            Key OooO00o2;
            if (cArr == null || cArr.length == 0) {
                Object obj = this.f18045OooO00o;
                if (obj instanceof Key) {
                    return obj;
                }
            }
            if (this.OooO00o == 4) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) this.f18045OooO00o));
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    try {
                        return C6325ili1i.this.OooO00o((C6325ili1i) new DataInputStream(new CipherInputStream(dataInputStream, C6325ili1i.this.OooO00o(C6325ili1i.f18041o0ooOoO, 2, cArr, bArr, dataInputStream.readInt()))));
                    } catch (Exception unused) {
                        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) this.f18045OooO00o));
                        byte[] bArr2 = new byte[dataInputStream2.readInt()];
                        dataInputStream2.readFully(bArr2);
                        int readInt = dataInputStream2.readInt();
                        try {
                            OooO00o2 = C6325ili1i.this.OooO00o((C6325ili1i) new DataInputStream(new CipherInputStream(dataInputStream2, C6325ili1i.this.OooO00o("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                        } catch (Exception unused2) {
                            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) this.f18045OooO00o));
                            bArr2 = new byte[dataInputStream3.readInt()];
                            dataInputStream3.readFully(bArr2);
                            readInt = dataInputStream3.readInt();
                            OooO00o2 = C6325ili1i.this.OooO00o((C6325ili1i) new DataInputStream(new CipherInputStream(dataInputStream3, C6325ili1i.this.OooO00o("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                        }
                        if (OooO00o2 != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            dataOutputStream.writeInt(bArr2.length);
                            dataOutputStream.write(bArr2);
                            dataOutputStream.writeInt(readInt);
                            DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, C6325ili1i.this.OooO00o(C6325ili1i.f18041o0ooOoO, 1, cArr, bArr2, readInt)));
                            C6325ili1i.this.OooO00o((C6325ili1i) OooO00o2, (Key) dataOutputStream2);
                            dataOutputStream2.close();
                            this.f18045OooO00o = byteArrayOutputStream.toByteArray();
                            return OooO00o2;
                        }
                        throw new UnrecoverableKeyException("no match");
                    }
                } catch (Exception unused3) {
                    throw new UnrecoverableKeyException("no match");
                }
            } else {
                throw new RuntimeException("forget something!");
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m17380OooO00o() {
            return this.f18046OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Date m17381OooO00o() {
            return this.f18047OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Certificate[] m17382OooO00o() {
            return this.f18048OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.ili1丨i丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6326OooO0Oo extends C6325ili1i {
        public C6326OooO0Oo() {
            super(1);
        }
    }

    public C6325ili1i(int i) {
        this.o00oO0O = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Key OooO00o(DataInputStream dataInputStream) throws IOException {
        KeySpec keySpec;
        int read = dataInputStream.read();
        String readUTF = dataInputStream.readUTF();
        String readUTF2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (readUTF.equals("PKCS#8") || readUTF.equals("PKCS8")) {
            keySpec = new PKCS8EncodedKeySpec(bArr);
        } else if (readUTF.equals("X.509") || readUTF.equals("X509")) {
            keySpec = new X509EncodedKeySpec(bArr);
        } else if (readUTF.equals("RAW")) {
            return new SecretKeySpec(bArr, readUTF2);
        } else {
            throw new IOException("Key format " + readUTF + " not recognised!");
        }
        if (read == 0) {
            return BouncyCastleProvider.getPrivateKey(C5464IlilIi.OooO00o(bArr));
        }
        if (read == 1) {
            return BouncyCastleProvider.getPublicKey(C6888ll.OooO00o(bArr));
        }
        if (read == 2) {
            try {
                return this.OooO00o.m17228OooO00o(readUTF2).generateSecret(keySpec);
            } catch (Exception e) {
                throw new IOException("Exception creating key: " + e.toString());
            }
        } else {
            throw new IOException("Key type " + read + " not recognised!");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Certificate m17378OooO00o(DataInputStream dataInputStream) throws IOException {
        String readUTF = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.OooO00o.m17223OooO00o(readUTF).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (NoSuchProviderException e) {
            throw new IOException(e.toString());
        } catch (CertificateException e2) {
            throw new IOException(e2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(Key key, DataOutputStream dataOutputStream) throws IOException {
        byte[] encoded = key.getEncoded();
        dataOutputStream.write(key instanceof PrivateKey ? 0 : key instanceof PublicKey ? 1 : 2);
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    private void OooO00o(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (CertificateEncodingException e) {
            throw new IOException(e.toString());
        }
    }

    public Cipher OooO00o(String str, int i, char[] cArr, byte[] bArr, int i2) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            SecretKeyFactory OooO00o2 = this.OooO00o.m17228OooO00o(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i2);
            Cipher OooO00o3 = this.OooO00o.m17224OooO00o(str);
            OooO00o3.init(i, OooO00o2.generateSecret(pBEKeySpec), pBEParameterSpec);
            return OooO00o3;
        } catch (Exception e) {
            throw new IOException("Error initialising store of key store: " + e);
        }
    }

    public void OooO00o(InputStream inputStream) throws IOException {
        OooO0OO oooO0OO;
        Hashtable hashtable;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int read = dataInputStream.read(); read > 0; read = dataInputStream.read()) {
            String readUTF = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int readInt = dataInputStream.readInt();
            Certificate[] certificateArr = null;
            if (readInt != 0) {
                certificateArr = new Certificate[readInt];
                for (int i = 0; i != readInt; i++) {
                    certificateArr[i] = m17378OooO00o(dataInputStream);
                }
            }
            if (read == 1) {
                Certificate OooO00o2 = m17378OooO00o(dataInputStream);
                hashtable = this.f18043OooO00o;
                oooO0OO = new OooO0OO(readUTF, date, 1, OooO00o2);
            } else if (read == 2) {
                Key OooO00o3 = OooO00o(dataInputStream);
                hashtable = this.f18043OooO00o;
                oooO0OO = new OooO0OO(readUTF, date, 2, OooO00o3, certificateArr);
            } else if (read == 3 || read == 4) {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                this.f18043OooO00o.put(readUTF, new OooO0OO(readUTF, date, read, bArr, certificateArr));
            } else {
                throw new IOException("Unknown object type in store.");
            }
            hashtable.put(readUTF, oooO0OO);
        }
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        Enumeration elements = this.f18043OooO00o.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (true) {
            if (elements.hasMoreElements()) {
                OooO0OO oooO0OO = (OooO0OO) elements.nextElement();
                dataOutputStream.write(oooO0OO.OooO00o());
                dataOutputStream.writeUTF(oooO0OO.m17380OooO00o());
                dataOutputStream.writeLong(oooO0OO.m17381OooO00o().getTime());
                Certificate[] OooO00o2 = oooO0OO.m17382OooO00o();
                if (OooO00o2 == null) {
                    dataOutputStream.writeInt(0);
                } else {
                    dataOutputStream.writeInt(OooO00o2.length);
                    for (int i = 0; i != OooO00o2.length; i++) {
                        OooO00o(OooO00o2[i], dataOutputStream);
                    }
                }
                int OooO00o3 = oooO0OO.OooO00o();
                if (OooO00o3 == 1) {
                    OooO00o((Certificate) oooO0OO.m17379OooO00o(), dataOutputStream);
                } else if (OooO00o3 == 2) {
                    OooO00o((Key) oooO0OO.m17379OooO00o(), dataOutputStream);
                } else if (OooO00o3 == 3 || OooO00o3 == 4) {
                    byte[] bArr = (byte[]) oooO0OO.m17379OooO00o();
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                } else {
                    throw new IOException("Unknown object type in store.");
                }
            } else {
                dataOutputStream.write(0);
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.iI1Il1
    public void OooO00o(SecureRandom secureRandom) {
        this.f18042OooO00o = secureRandom;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.f18043OooO00o.keys();
    }

    public boolean engineContainsAlias(String str) {
        return this.f18043OooO00o.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.f18043OooO00o.get(str) != null) {
            this.f18043OooO00o.remove(str);
        }
    }

    public Certificate engineGetCertificate(String str) {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        if (oooO0OO == null) {
            return null;
        }
        if (oooO0OO.OooO00o() == 1) {
            return (Certificate) oooO0OO.m17379OooO00o();
        }
        Certificate[] OooO00o2 = oooO0OO.m17382OooO00o();
        if (OooO00o2 != null) {
            return OooO00o2[0];
        }
        return null;
    }

    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.f18043OooO00o.elements();
        while (elements.hasMoreElements()) {
            OooO0OO oooO0OO = (OooO0OO) elements.nextElement();
            if (!(oooO0OO.m17379OooO00o() instanceof Certificate)) {
                Certificate[] OooO00o2 = oooO0OO.m17382OooO00o();
                if (OooO00o2 != null && OooO00o2[0].equals(certificate)) {
                    return oooO0OO.m17380OooO00o();
                }
            } else if (((Certificate) oooO0OO.m17379OooO00o()).equals(certificate)) {
                return oooO0OO.m17380OooO00o();
            }
        }
        return null;
    }

    public Certificate[] engineGetCertificateChain(String str) {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        if (oooO0OO != null) {
            return oooO0OO.m17382OooO00o();
        }
        return null;
    }

    public Date engineGetCreationDate(String str) {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        if (oooO0OO != null) {
            return oooO0OO.m17381OooO00o();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        if (oooO0OO == null || oooO0OO.OooO00o() == 1) {
            return null;
        }
        return (Key) oooO0OO.OooO00o(cArr);
    }

    public boolean engineIsCertificateEntry(String str) {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        return oooO0OO != null && oooO0OO.OooO00o() == 1;
    }

    public boolean engineIsKeyEntry(String str) {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        return (oooO0OO == null || oooO0OO.OooO00o() == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        this.f18043OooO00o.clear();
        if (inputStream != null) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readInt = dataInputStream.readInt();
            if (readInt == 2 || readInt == 0 || readInt == 1) {
                int readInt2 = dataInputStream.readInt();
                if (readInt2 > 0) {
                    byte[] bArr = new byte[readInt2];
                    dataInputStream.readFully(bArr);
                    int readInt3 = dataInputStream.readInt();
                    C6383iLl1 r4 = new C6383iLl1(new C6461l1liI());
                    if (cArr == null || cArr.length == 0) {
                        OooO00o((InputStream) dataInputStream);
                        dataInputStream.readFully(new byte[r4.OooO00o()]);
                        return;
                    }
                    byte[] OooO00o2 = lLLL1iL.OooO00o(cArr);
                    Ii1LiIL ii1LiIL = new Ii1LiIL(new C6461l1liI());
                    ii1LiIL.OooO00o(OooO00o2, bArr, readInt3);
                    AbstractC6370iIIIl OooO00o3 = ii1LiIL.OooO00o(readInt != 2 ? r4.OooO00o() : r4.OooO00o() * 8);
                    C9586iIILl.OooO00o(OooO00o2, (byte) 0);
                    r4.OooO00o(OooO00o3);
                    OooO00o(new C97461ii(dataInputStream, r4));
                    byte[] bArr2 = new byte[r4.OooO00o()];
                    r4.OooO00o(bArr2, 0);
                    byte[] bArr3 = new byte[r4.OooO00o()];
                    dataInputStream.readFully(bArr3);
                    if (!C9586iIILl.OooO0O0(bArr2, bArr3)) {
                        this.f18043OooO00o.clear();
                        throw new IOException("KeyStore integrity check failed.");
                    }
                    return;
                }
                throw new IOException("Invalid salt detected");
            }
            throw new IOException("Wrong version of key store.");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        OooO0OO oooO0OO = (OooO0OO) this.f18043OooO00o.get(str);
        if (oooO0OO == null || oooO0OO.OooO00o() == 1) {
            this.f18043OooO00o.put(str, new OooO0OO(str, certificate));
            return;
        }
        throw new KeyStoreException("key store already has a key entry with alias " + str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey) || certificateArr != null) {
            try {
                this.f18043OooO00o.put(str, new OooO0OO(str, key, cArr, certificateArr));
            } catch (Exception e) {
                throw new KeyStoreException(e.toString());
            }
        } else {
            throw new KeyStoreException("no certificate chain for private key");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        this.f18043OooO00o.put(str, new OooO0OO(str, bArr, certificateArr));
    }

    public int engineSize() {
        return this.f18043OooO00o.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int nextInt = (this.f18042OooO00o.nextInt() & 1023) + 1024;
        this.f18042OooO00o.nextBytes(bArr);
        dataOutputStream.writeInt(this.o00oO0O);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(nextInt);
        C6383iLl1 r7 = new C6383iLl1(new C6461l1liI());
        LIL1 lil1 = new LIL1(r7);
        Ii1LiIL ii1LiIL = new Ii1LiIL(new C6461l1liI());
        byte[] OooO00o2 = lLLL1iL.OooO00o(cArr);
        ii1LiIL.OooO00o(OooO00o2, bArr, nextInt);
        r7.OooO00o(ii1LiIL.OooO00o(this.o00oO0O < 2 ? r7.OooO00o() : r7.OooO00o() * 8));
        for (int i = 0; i != OooO00o2.length; i++) {
            OooO00o2[i] = 0;
        }
        OooO00o(new C5741LilILl(dataOutputStream, lil1));
        byte[] bArr2 = new byte[r7.OooO00o()];
        r7.OooO00o(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }
}
