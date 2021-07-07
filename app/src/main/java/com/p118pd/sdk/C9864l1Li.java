package com.p118pd.sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;

/* renamed from: com.pd.sdk.丨丨l丨1Li  reason: invalid class name and case insensitive filesystem */
public class C9864l1Li {
    public C5859LLl OooO00o = new C5859LLl();

    /* renamed from: OooO00o  reason: collision with other field name */
    public JcaX509CertificateConverter f23479OooO00o = new JcaX509CertificateConverter();

    private void OooO00o(File file) throws IOException {
        if (!file.canRead()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("Unable to open file " + file.getPath() + " for reading.");
        }
        throw new FileNotFoundException("Unable to open " + file.getPath() + ": it does not exist.");
    }

    public C6536lILlii OooO00o(File file, File file2) throws IOException, CertificateException {
        OooO00o(file);
        OooO00o(file2);
        FileInputStream fileInputStream = new FileInputStream(file);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        C6536lILlii OooO00o2 = OooO00o(fileInputStream, fileInputStream2);
        fileInputStream.close();
        fileInputStream2.close();
        return OooO00o2;
    }

    public C6536lILlii OooO00o(InputStream inputStream, InputStream inputStream2) throws IOException, CertificateException {
        C5859LLl r0;
        C5464IlilIi r4;
        Object readObject = new C6488lIIill(new InputStreamReader(inputStream)).readObject();
        if (readObject instanceof C6626lL11) {
            r0 = this.OooO00o;
            r4 = ((C6626lL11) readObject).OooO00o();
        } else if (readObject instanceof C5464IlilIi) {
            r0 = this.OooO00o;
            r4 = (C5464IlilIi) readObject;
        } else {
            throw new IOException("unrecognised private key file");
        }
        PrivateKey OooO00o2 = r0.OooO00o(r4);
        C6488lIIill r02 = new C6488lIIill(new InputStreamReader(inputStream2));
        ArrayList arrayList = new ArrayList();
        while (true) {
            Object readObject2 = r02.readObject();
            if (readObject2 == null) {
                return new C6536lILlii(OooO00o2, (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]));
            }
            arrayList.add(this.f23479OooO00o.OooO00o((X509CertificateHolder) readObject2));
        }
    }

    public C9864l1Li OooO00o(String str) {
        this.OooO00o = this.OooO00o.OooO00o(str);
        this.f23479OooO00o = this.f23479OooO00o.OooO00o(str);
        return this;
    }

    public C9864l1Li OooO00o(Provider provider) {
        this.OooO00o = this.OooO00o.OooO00o(provider);
        this.f23479OooO00o = this.f23479OooO00o.OooO00o(provider);
        return this;
    }
}
