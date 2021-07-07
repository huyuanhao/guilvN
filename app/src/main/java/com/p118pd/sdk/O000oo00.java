package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O000oo00 */
public final class O000oo00 {
    @NotNull
    public final File OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<File> f16949OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public O000oo00(@NotNull File file, @NotNull List<? extends File> list) {
        o0O0OO00.OooO0o(file, "root");
        o0O0OO00.OooO0o(list, "segments");
        this.OooO00o = file;
        this.f16949OooO00o = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.O000oo00 */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ O000oo00 OooO00o(O000oo00 o000oo00, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = o000oo00.OooO00o;
        }
        if ((i & 2) != 0) {
            list = o000oo00.f16949OooO00o;
        }
        return o000oo00.OooO00o(file, list);
    }

    @NotNull
    public final O000oo00 OooO00o(@NotNull File file, @NotNull List<? extends File> list) {
        o0O0OO00.OooO0o(file, "root");
        o0O0OO00.OooO0o(list, "segments");
        return new O000oo00(file, list);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final File m16511OooO00o() {
        return this.OooO00o;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final String m16512OooO00o() {
        String path = this.OooO00o.getPath();
        o0O0OO00.OooO00o((Object) path, "root.path");
        return path;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final List<File> m16513OooO00o() {
        return this.f16949OooO00o;
    }

    @NotNull
    public final File OooO0O0() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O000oo00)) {
            return false;
        }
        O000oo00 o000oo00 = (O000oo00) obj;
        return o0O0OO00.OooO00o(this.OooO00o, o000oo00.OooO00o) && o0O0OO00.OooO00o(this.f16949OooO00o, o000oo00.f16949OooO00o);
    }

    public int hashCode() {
        File file = this.OooO00o;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f16949OooO00o;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.OooO00o + ", segments=" + this.f16949OooO00o + C3848l.f10402t;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m16514OooO00o() {
        String path = this.OooO00o.getPath();
        o0O0OO00.OooO00o((Object) path, "root.path");
        return path.length() > 0;
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final List<File> m16515OooO0O0() {
        return this.f16949OooO00o;
    }

    public final int OooO00o() {
        return this.f16949OooO00o.size();
    }

    @NotNull
    public final File OooO00o(int i, int i2) {
        if (i < 0 || i > i2 || i2 > OooO00o()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f16949OooO00o.subList(i, i2);
        String str = File.separator;
        o0O0OO00.OooO00o((Object) str, "File.separator");
        return new File(CollectionsKt___CollectionsKt.OooO00o(subList, str, null, null, 0, null, null, 62, null));
    }
}
