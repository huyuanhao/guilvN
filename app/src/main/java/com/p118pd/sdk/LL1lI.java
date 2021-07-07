package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.LL1lI */
public class LL1lI {
    public C6600lLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BufferedInputStream f16400OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BufferedOutputStream f16401OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16402OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16403OooO00o;

    public LL1lI() {
        this.f16402OooO00o = true;
        this.OooO00o = null;
        this.f16400OooO00o = null;
        this.f16401OooO00o = null;
        this.f16403OooO00o = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        java.lang.System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
        java.lang.System.exit(1);
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        r7 = java.lang.System.err;
        r8 = new java.lang.StringBuilder();
        r10 = "Could not decryption create key file [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        r8.append(r10);
        r8.append(r9);
        r8.append("]");
        r7.println(r8.toString());
        java.lang.System.exit(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0078 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LL1lI(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.LL1lI.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private void OooO00o() {
        this.OooO00o = new C6600lLi(new C6927lll1(new C1LliI()));
        if (this.f16402OooO00o) {
            OooO0O0(this.f16403OooO00o);
        } else {
            OooO00o(this.f16403OooO00o);
        }
        try {
            this.f16400OooO00o.close();
            this.f16401OooO00o.flush();
            this.f16401OooO00o.close();
        } catch (IOException e) {
            PrintStream printStream = System.err;
            printStream.println("exception closing resources: " + e.getMessage());
        }
    }

    private void OooO00o(byte[] bArr) {
        this.OooO00o.OooO00o(false, (AbstractC6370iIIIl) new C6642li1LI(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f16400OooO00o));
        byte[] bArr2 = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    byte[] OooO00o2 = C6472l1l1l.OooO00o(readLine);
                    bArr2 = new byte[this.OooO00o.OooO00o(OooO00o2.length)];
                    int OooO00o3 = this.OooO00o.OooO00o(OooO00o2, 0, OooO00o2.length, bArr2, 0);
                    if (OooO00o3 > 0) {
                        this.f16401OooO00o.write(bArr2, 0, OooO00o3);
                    }
                } else {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int OooO00o4 = this.OooO00o.OooO00o(bArr2, 0);
        if (OooO00o4 > 0) {
            this.f16401OooO00o.write(bArr2, 0, OooO00o4);
        }
    }

    public static void OooO00o(String[] strArr) {
        String str;
        boolean z = true;
        if (strArr.length < 2) {
            new LL1lI();
            PrintStream printStream = System.err;
            printStream.println("Usage: java " + LL1lI.class.getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z = false;
        } else {
            str = "deskey.dat";
        }
        new LL1lI(str2, str3, str, z).OooO00o();
    }

    private void OooO0O0(byte[] bArr) {
        this.OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C6642li1LI(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.OooO00o.OooO00o(47)];
        while (true) {
            try {
                int read = this.f16400OooO00o.read(bArr2, 0, 47);
                if (read > 0) {
                    int OooO00o2 = this.OooO00o.OooO00o(bArr2, 0, read, bArr3, 0);
                    if (OooO00o2 > 0) {
                        byte[] OooO00o3 = C6472l1l1l.m17609OooO00o(bArr3, 0, OooO00o2);
                        this.f16401OooO00o.write(OooO00o3, 0, OooO00o3.length);
                        this.f16401OooO00o.write(10);
                    }
                } else {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int OooO00o4 = this.OooO00o.OooO00o(bArr3, 0);
        if (OooO00o4 > 0) {
            byte[] OooO00o5 = C6472l1l1l.m17609OooO00o(bArr3, 0, OooO00o4);
            this.f16401OooO00o.write(OooO00o5, 0, OooO00o5.length);
            this.f16401OooO00o.write(10);
        }
    }
}
