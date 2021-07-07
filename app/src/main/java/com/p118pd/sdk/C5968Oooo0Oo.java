package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* renamed from: com.pd.sdk.Oooo0Oo  reason: case insensitive filesystem */
public final class C5968Oooo0Oo extends oOOO00OO {
    public final MessageDigest OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Mac f17237OooO00o;

    public C5968Oooo0Oo(AbstractC8930ooOOO0OO ooooo0oo, String str) {
        super(ooooo0oo);
        try {
            this.OooO00o = MessageDigest.getInstance(str);
            this.f17237OooO00o = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static C5968Oooo0Oo OooO00o(AbstractC8930ooOOO0OO ooooo0oo) {
        return new C5968Oooo0Oo(ooooo0oo, "MD5");
    }

    public static C5968Oooo0Oo OooO0O0(AbstractC8930ooOOO0OO ooooo0oo) {
        return new C5968Oooo0Oo(ooooo0oo, LL1i.OooO0O0);
    }

    public static C5968Oooo0Oo OooO0OO(AbstractC8930ooOOO0OO ooooo0oo) {
        return new C5968Oooo0Oo(ooooo0oo, LL1i.OooO0Oo);
    }

    @Override // com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) throws IOException {
        long read = super.read(oooo000, j);
        if (read != -1) {
            long j2 = oooo000.f16981OooO00o;
            long j3 = j2 - read;
            C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
            while (j2 > j3) {
                ooooo00o = ooooo00o.f22171OooO0O0;
                j2 -= (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
            }
            while (j2 < oooo000.f16981OooO00o) {
                int i = (int) ((((long) ooooo00o.OooO00o) + j3) - j2);
                MessageDigest messageDigest = this.OooO00o;
                if (messageDigest != null) {
                    messageDigest.update(ooooo00o.f22170OooO00o, i, ooooo00o.OooO0O0 - i);
                } else {
                    this.f17237OooO00o.update(ooooo00o.f22170OooO00o, i, ooooo00o.OooO0O0 - i);
                }
                j3 = ((long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o)) + j2;
                ooooo00o = ooooo00o.f22168OooO00o;
                j2 = j3;
            }
        }
        return read;
    }

    public static C5968Oooo0Oo OooO00o(AbstractC8930ooOOO0OO ooooo0oo, ByteString byteString) {
        return new C5968Oooo0Oo(ooooo0oo, byteString, "HmacSHA1");
    }

    public static C5968Oooo0Oo OooO0O0(AbstractC8930ooOOO0OO ooooo0oo, ByteString byteString) {
        return new C5968Oooo0Oo(ooooo0oo, byteString, "HmacSHA256");
    }

    public final ByteString OooO0O0() {
        MessageDigest messageDigest = this.OooO00o;
        return ByteString.m14263of(messageDigest != null ? messageDigest.digest() : this.f17237OooO00o.doFinal());
    }

    public C5968Oooo0Oo(AbstractC8930ooOOO0OO ooooo0oo, ByteString byteString, String str) {
        super(ooooo0oo);
        try {
            Mac instance = Mac.getInstance(str);
            this.f17237OooO00o = instance;
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.OooO00o = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
