package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* renamed from: com.pd.sdk.oOOO0O0O */
public final class oOOO0O0O extends oOOO00O0 {
    @Nullable
    public final MessageDigest OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Mac f21109OooO00o;

    public oOOO0O0O(AbstractC8210oOOoO0o0 ooooo0o0, String str) {
        super(ooooo0o0);
        try {
            this.OooO00o = MessageDigest.getInstance(str);
            this.f21109OooO00o = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static oOOO0O0O OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new oOOO0O0O(ooooo0o0, "MD5");
    }

    public static oOOO0O0O OooO0O0(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new oOOO0O0O(ooooo0o0, LL1i.OooO0O0);
    }

    public static oOOO0O0O OooO0OO(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new oOOO0O0O(ooooo0o0, LL1i.OooO0Oo);
    }

    public static oOOO0O0O OooO0Oo(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new oOOO0O0O(ooooo0o0, LL1i.f16408OooO0o);
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0
    public void write(OOOO000 oooo000, long j) throws IOException {
        C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, j);
        C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
            MessageDigest messageDigest = this.OooO00o;
            if (messageDigest != null) {
                messageDigest.update(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
            } else {
                this.f21109OooO00o.update(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
            }
            j2 += (long) min;
            ooooo00o = ooooo00o.f22168OooO00o;
        }
        super.write(oooo000, j);
    }

    public static oOOO0O0O OooO00o(AbstractC8210oOOoO0o0 ooooo0o0, ByteString byteString) {
        return new oOOO0O0O(ooooo0o0, byteString, "HmacSHA1");
    }

    public static oOOO0O0O OooO0O0(AbstractC8210oOOoO0o0 ooooo0o0, ByteString byteString) {
        return new oOOO0O0O(ooooo0o0, byteString, "HmacSHA256");
    }

    public static oOOO0O0O OooO0OO(AbstractC8210oOOoO0o0 ooooo0o0, ByteString byteString) {
        return new oOOO0O0O(ooooo0o0, byteString, "HmacSHA512");
    }

    public final ByteString OooO0O0() {
        MessageDigest messageDigest = this.OooO00o;
        return ByteString.m14263of(messageDigest != null ? messageDigest.digest() : this.f21109OooO00o.doFinal());
    }

    public oOOO0O0O(AbstractC8210oOOoO0o0 ooooo0o0, ByteString byteString, String str) {
        super(ooooo0o0);
        try {
            Mac instance = Mac.getInstance(str);
            this.f21109OooO00o = instance;
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.OooO00o = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
