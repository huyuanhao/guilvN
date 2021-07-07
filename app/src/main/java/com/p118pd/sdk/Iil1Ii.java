package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: com.pd.sdk.Iil1Ii */
public class Iil1Ii {
    public static byte[] OooO00o(LlLI1 llLI1, byte[] bArr, int i, char[] cArr, byte[] bArr2, String str) throws Exception {
        SecretKeyFactory instance = SecretKeyFactory.getInstance(llLI1.m16387OooO0O0(), str);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        SecretKey generateSecret = instance.generateSecret(new PBEKeySpec(cArr));
        Mac instance2 = Mac.getInstance(llLI1.m16387OooO0O0(), str);
        instance2.init(generateSecret, pBEParameterSpec);
        instance2.update(bArr2);
        return instance2.doFinal();
    }

    public static byte[] OooO00o(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6119iIl1il r1 = new C6119iIl1il(byteArrayOutputStream);
        C1696ll OooO00o = C1696ll.OooO00o(bArr);
        byteArrayOutputStream.reset();
        r1.OooO00o(OooO00o);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO00o(byte[] bArr, char[] cArr, String str) throws IOException {
        C1696ll OooO00o = C1696ll.OooO00o(bArr);
        C6903lil OooO00o2 = OooO00o.OooO00o();
        AbstractC6804llL1ii OooO00o3 = AbstractC6804llL1ii.OooO00o(OooO00o2.m18069OooO0O0());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6119iIl1il r3 = new C6119iIl1il(byteArrayOutputStream);
        r3.OooO00o((AbstractC6854lLi1LL) new C5805Ll1(OooO00o3.m17938OooO00o()).OooO00o());
        C6903lil r1 = new C6903lil(OooO00o2.OooO00o(), new C6487lIIiIlL(byteArrayOutputStream.toByteArray()));
        C9713llii OooO00o4 = OooO00o.m17822OooO00o();
        try {
            int intValue = OooO00o4.m21750OooO00o().intValue();
            C1696ll llVar = new C1696ll(r1, new C9713llii(new C6052i1l(new C6456l1ilL(OooO00o4.OooO00o().OooO00o().OooO00o(), C6452l1Lll.OooO00o), OooO00o(OooO00o4.OooO00o().OooO00o().OooO00o(), OooO00o4.m21751OooO00o(), intValue, cArr, AbstractC6804llL1ii.OooO00o(r1.m18069OooO0O0()).m17938OooO00o(), str)), OooO00o4.m21751OooO00o(), intValue));
            byteArrayOutputStream.reset();
            r3.OooO00o(llVar);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new IOException("error constructing MAC: " + e.toString());
        }
    }
}
