package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000oooo  reason: case insensitive filesystem */
public class C7039o000oooo {
    public static final String OooO00o = "TypefaceCompatBaseImpl";
    public static final String OooO0O0 = "cached_font_";

    /* renamed from: com.pd.sdk.o000oooo$OooO0OO */
    public interface OooO0OO<T> {
        int OooO00o(T t);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m18306OooO00o(T t);
    }

    public static <T> T OooO00o(T[] tArr, int i, OooO0OO<T> oooO0OO) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(oooO0OO.OooO00o((Object) t2) - i2) * 2) + (oooO0OO.m18306OooO00o(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: com.pd.sdk.o000oooo$OooO00o */
    public class OooO00o implements OooO0OO<FontsContractCompat.C5039OooO0oo> {
        public OooO00o() {
        }

        public int OooO00o(FontsContractCompat.C5039OooO0oo oooO0oo) {
            return oooO0oo.OooO0OO();
        }

        public boolean OooO00o(FontsContractCompat.C5039OooO0oo oooO0oo) {
            return oooO0oo.m14561OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.o000oooo$OooO0O0 */
    public class OooO0O0 implements OooO0OO<FontResourcesParserCompat.OooO0OO> {
        public OooO0O0() {
        }

        public int OooO00o(FontResourcesParserCompat.OooO0OO oooO0OO) {
            return oooO0OO.OooO0OO();
        }

        public boolean OooO00o(FontResourcesParserCompat.OooO0OO oooO0OO) {
            return oooO0OO.m14547OooO00o();
        }
    }

    public FontsContractCompat.C5039OooO0oo OooO00o(FontsContractCompat.C5039OooO0oo[] oooO0ooArr, int i) {
        return (FontsContractCompat.C5039OooO0oo) OooO00o(oooO0ooArr, i, new OooO00o());
    }

    public Typeface OooO00o(Context context, InputStream inputStream) {
        File OooO00o2 = C6929o00.OooO00o(context);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            if (!C6929o00.OooO00o(OooO00o2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(OooO00o2.getPath());
            OooO00o2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            OooO00o2.delete();
        }
    }

    public Typeface OooO00o(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.C5039OooO0oo[] oooO0ooArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (oooO0ooArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(OooO00o(oooO0ooArr, i).m14560OooO00o());
            try {
                Typeface OooO00o2 = OooO00o(context, inputStream);
                C6929o00.OooO00o(inputStream);
                return OooO00o2;
            } catch (IOException unused) {
                C6929o00.OooO00o(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                C6929o00.OooO00o(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C6929o00.OooO00o(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C6929o00.OooO00o(inputStream2);
            throw th;
        }
    }

    private FontResourcesParserCompat.OooO0OO OooO00o(FontResourcesParserCompat.OooO0O0 oooO0O0, int i) {
        return (FontResourcesParserCompat.OooO0OO) OooO00o(oooO0O0.OooO00o(), i, new OooO0O0());
    }

    @Nullable
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0O0 oooO0O0, Resources resources, int i) {
        FontResourcesParserCompat.OooO0OO OooO00o2 = OooO00o(oooO0O0, i);
        if (OooO00o2 == null) {
            return null;
        }
        return C7033o000ooO.OooO00o(context, resources, OooO00o2.OooO00o(), OooO00o2.m14546OooO00o(), i);
    }

    @Nullable
    public Typeface OooO00o(Context context, Resources resources, int i, String str, int i2) {
        File OooO00o2 = C6929o00.OooO00o(context);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            if (!C6929o00.OooO00o(OooO00o2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(OooO00o2.getPath());
            OooO00o2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            OooO00o2.delete();
        }
    }
}
