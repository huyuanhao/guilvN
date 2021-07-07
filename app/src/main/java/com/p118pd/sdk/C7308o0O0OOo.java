package com.p118pd.sdk;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0O0OOo  reason: case insensitive filesystem */
public class C7308o0O0OOo {
    public static Parcelable OooO00o(AbstractC7313o0O0Oo0 o0o0oo0) {
        return new ParcelImpl(o0o0oo0);
    }

    public static <T extends AbstractC7313o0O0Oo0> T OooO00o(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).OooO00o();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static void OooO00o(AbstractC7313o0O0Oo0 o0o0oo0, OutputStream outputStream) {
        C7526o0OooO0 o0oooo0 = new C7526o0OooO0(null, outputStream);
        o0oooo0.m14934OooO00o(o0o0oo0);
        o0oooo0.m19185OooO00o();
    }

    public static <T extends AbstractC7313o0O0Oo0> T OooO00o(InputStream inputStream) {
        return (T) new C7526o0OooO0(inputStream, null).m14919OooO00o();
    }
}
