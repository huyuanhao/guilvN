package com.p118pd.sdk;

import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.lll1丨I11  reason: invalid class name and case insensitive filesystem */
public class C6790lll1I11 extends C929811Li1 implements Principal {
    public C6790lll1I11(l1LILI1 r1) {
        super((I11li1) r1.OooO0O0());
    }

    public C6790lll1I11(C929811Li1 r1) {
        super((I11li1) r1.OooO0O0());
    }

    public C6790lll1I11(String str) {
        super(str);
    }

    public C6790lll1I11(Hashtable hashtable) {
        super(hashtable);
    }

    public C6790lll1I11(Vector vector, Hashtable hashtable) {
        super(vector, hashtable);
    }

    public C6790lll1I11(Vector vector, Vector vector2) {
        super(vector, vector2);
    }

    public C6790lll1I11(boolean z, String str) {
        super(z, str);
    }

    public C6790lll1I11(boolean z, Hashtable hashtable, String str) {
        super(z, hashtable, str);
    }

    public C6790lll1I11(byte[] bArr) throws IOException {
        super(OooO00o(new C5805Ll1(bArr)));
    }

    public static I11li1 OooO00o(C5805Ll1 r3) throws IOException {
        try {
            return I11li1.OooO00o((Object) r3.OooO00o());
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: " + e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() {
        try {
            return OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public String getName() {
        return toString();
    }
}
