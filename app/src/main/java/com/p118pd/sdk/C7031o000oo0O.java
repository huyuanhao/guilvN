package com.p118pd.sdk;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000oo0O  reason: case insensitive filesystem */
public final class C7031o000oo0O {
    public static final String OooO00o = "󟿽";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadLocal<C7085o00OO0O0<Rect, Rect>> f19296OooO00o = new ThreadLocal<>();
    public static final String OooO0O0 = "m";

    public static boolean OooO00o(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText(OooO00o);
        float measureText2 = paint.measureText(OooO0O0);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C7085o00OO0O0<Rect, Rect> OooO00o2 = OooO00o();
        paint.getTextBounds(OooO00o, 0, 2, (Rect) OooO00o2.OooO00o);
        paint.getTextBounds(str, 0, length, (Rect) OooO00o2.OooO0O0);
        return !OooO00o2.OooO00o.equals(OooO00o2.OooO0O0);
    }

    public static C7085o00OO0O0<Rect, Rect> OooO00o() {
        C7085o00OO0O0<Rect, Rect> o00oo0o0 = f19296OooO00o.get();
        if (o00oo0o0 == null) {
            C7085o00OO0O0<Rect, Rect> o00oo0o02 = new C7085o00OO0O0<>(new Rect(), new Rect());
            f19296OooO00o.set(o00oo0o02);
            return o00oo0o02;
        }
        o00oo0o0.OooO00o.setEmpty();
        o00oo0o0.OooO0O0.setEmpty();
        return o00oo0o0;
    }
}
