package com.p118pd.sdk;

import com.umeng.message.proguard.C3817f;
import java.nio.charset.Charset;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooo00O0  reason: case insensitive filesystem */
public final class C9097ooo00O0 {
    public static Charset OooO;
    public static final C9097ooo00O0 OooO00o = new C9097ooo00O0();
    @JvmField
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Charset f22450OooO00o;
    @JvmField
    @NotNull
    public static final Charset OooO0O0;
    @JvmField
    @NotNull
    public static final Charset OooO0OO;
    @JvmField
    @NotNull
    public static final Charset OooO0Oo;
    @JvmField
    @NotNull
    public static final Charset OooO0o;
    @JvmField
    @NotNull
    public static final Charset OooO0o0;
    public static Charset OooO0oO;
    public static Charset OooO0oo;

    static {
        Charset forName = Charset.forName("UTF-8");
        o0O0OO00.OooO00o((Object) forName, "Charset.forName(\"UTF-8\")");
        f22450OooO00o = forName;
        Charset forName2 = Charset.forName(C3817f.f10341c);
        o0O0OO00.OooO00o((Object) forName2, "Charset.forName(\"UTF-16\")");
        OooO0O0 = forName2;
        Charset forName3 = Charset.forName(C3817f.f10342d);
        o0O0OO00.OooO00o((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        OooO0OO = forName3;
        Charset forName4 = Charset.forName(C3817f.f10343e);
        o0O0OO00.OooO00o((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        OooO0Oo = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        o0O0OO00.OooO00o((Object) forName5, "Charset.forName(\"US-ASCII\")");
        OooO0o0 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        o0O0OO00.OooO00o((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        OooO0o = forName6;
    }

    @JvmName(name = "UTF32")
    @NotNull
    public final Charset OooO00o() {
        Charset charset = OooO0oO;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        o0O0OO00.OooO00o((Object) forName, "Charset.forName(\"UTF-32\")");
        OooO0oO = forName;
        return forName;
    }

    @JvmName(name = "UTF32_BE")
    @NotNull
    public final Charset OooO0O0() {
        Charset charset = OooO;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        o0O0OO00.OooO00o((Object) forName, "Charset.forName(\"UTF-32BE\")");
        OooO = forName;
        return forName;
    }

    @JvmName(name = "UTF32_LE")
    @NotNull
    public final Charset OooO0OO() {
        Charset charset = OooO0oo;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        o0O0OO00.OooO00o((Object) forName, "Charset.forName(\"UTF-32LE\")");
        OooO0oo = forName;
        return forName;
    }
}
