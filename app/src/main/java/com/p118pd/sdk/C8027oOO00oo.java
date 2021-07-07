package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.oOO00oo  reason: case insensitive filesystem */
public final class C8027oOO00oo {
    public static final byte OooO00o = 65;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f21055OooO00o = 14844066;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21056OooO00o = "ISO-8859-1";
    public static final byte OooO0O0 = 71;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21057OooO0O0 = "UTF-8";
    public static final byte OooO0OO = 37;
    public static final byte OooO0Oo = 27;

    @Nullable
    public static String OooO00o(@NotNull byte[] bArr) {
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 37 && bArr[2] == 71) {
            return "UTF-8";
        }
        if (bArr.length > 3 && bArr[0] == 27 && ((bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16)) == 14844066 && bArr[4] == 65) {
            return "ISO-8859-1";
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Charset m19729OooO00o(@NotNull byte[] bArr) {
        String[] strArr = {"UTF-8", System.getProperty("file.encoding"), "ISO-8859-1"};
        for (int i = 0; i < 3; i++) {
            Charset forName = Charset.forName(strArr[i]);
            try {
                forName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return forName;
            } catch (CharacterCodingException unused) {
            }
        }
        return null;
    }
}
