package com.p118pd.sdk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O000OOOO */
public class O000OOOO {
    public static final int OooO00o(@NotNull String str) {
        char c;
        int OooO00o;
        int OooO00o2 = StringsKt__StringsKt.OooO00o((CharSequence) str, File.separatorChar, 0, false, 4, (Object) null);
        if (OooO00o2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (OooO00o = StringsKt__StringsKt.OooO00o((CharSequence) str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int OooO00o3 = StringsKt__StringsKt.OooO00o((CharSequence) str, File.separatorChar, OooO00o + 1, false, 4, (Object) null);
            if (OooO00o3 >= 0) {
                return OooO00o3 + 1;
            }
            return str.length();
        } else if (OooO00o2 > 0 && str.charAt(OooO00o2 - 1) == ':') {
            return OooO00o2 + 1;
        } else {
            if (OooO00o2 != -1 || !StringsKt__StringsKt.OooO0O0((CharSequence) str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m16509OooO00o(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        String path = file.getPath();
        o0O0OO00.OooO00o((Object) path, "path");
        String path2 = file.getPath();
        o0O0OO00.OooO00o((Object) path2, "path");
        int OooO00o = OooO00o(path2);
        if (path != null) {
            String substring = path.substring(0, OooO00o);
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final File m16508OooO00o(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        return new File(m16509OooO00o(file));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m16510OooO00o(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        String path = file.getPath();
        o0O0OO00.OooO00o((Object) path, "path");
        return OooO00o(path) > 0;
    }

    @NotNull
    public static final O000oo00 OooO00o(@NotNull File file) {
        List list;
        o0O0OO00.OooO0o(file, "receiver$0");
        String path = file.getPath();
        o0O0OO00.OooO00o((Object) path, "path");
        int OooO00o = OooO00o(path);
        String substring = path.substring(0, OooO00o);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = path.substring(OooO00o);
        o0O0OO00.OooO00o((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = CollectionsKt__CollectionsKt.m22696OooO00o();
        } else {
            List<String> OooO00o2 = StringsKt__StringsKt.OooO00o((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(OooO00o2, 10));
            for (String str : OooO00o2) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new O000oo00(new File(substring), list);
    }

    @NotNull
    public static final File OooO00o(@NotNull File file, int i, int i2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        return OooO00o(file).OooO00o(i, i2);
    }
}
