package kotlin.p285io;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.O000OOOO;
import com.p118pd.sdk.O000oo00;
import com.p118pd.sdk.O00O;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oOO0OO00;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, mo43195d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", DispatchConstants.OTHER, "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.FilesKt__UtilsKt */
public class FilesKt__UtilsKt extends O00O {
    @NotNull
    public static /* synthetic */ File OooO00o(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return OooO00o(str, str2, file);
    }

    @NotNull
    public static /* synthetic */ File OooO0O0(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return OooO0O0(str, str2, file);
    }

    @NotNull
    public static final String OooO0OO(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            o0O0OO00.OooO00o((Object) path, "path");
            return oOO0OO00.OooO00o(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        o0O0OO00.OooO00o((Object) path2, "path");
        return path2;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        String name = file.getName();
        o0O0OO00.OooO00o((Object) name, "name");
        return StringsKt__StringsKt.OooO0o0(name, C9058ooOoOoOO.OooOO0, null, 2, null);
    }

    @NotNull
    public static final File OooO0o0(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "relative");
        O000oo00 OooO00o = O000OOOO.OooO00o(file);
        return OooO0Oo(OooO0Oo(OooO00o.OooO0O0(), OooO00o.OooO00o() == 0 ? new File("..") : OooO00o.OooO00o(0, OooO00o.OooO00o() - 1)), file2);
    }

    @NotNull
    public static final File OooO00o(@NotNull String str, @Nullable String str2, @Nullable File file) {
        o0O0OO00.OooO0o(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            o0O0OO00.OooO00o((Object) createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    @NotNull
    public static final File OooO0O0(@NotNull String str, @Nullable String str2, @Nullable File file) {
        o0O0OO00.OooO0o(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        o0O0OO00.OooO00o((Object) createTempFile, "File.createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    @NotNull
    public static final File OooO0OO(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "base");
        String OooO0O0 = m22815OooO0O0(file, file2);
        return OooO0O0 != null ? new File(OooO0O0) : file;
    }

    @NotNull
    public static final File OooO0Oo(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "relative");
        if (O000OOOO.m16510OooO00o(file2)) {
            return file2;
        }
        String file3 = file.toString();
        o0O0OO00.OooO00o((Object) file3, "this.toString()");
        if ((file3.length() == 0) || StringsKt__StringsKt.OooO0O0((CharSequence) file3, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final String m22814OooO0O0(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        String name = file.getName();
        o0O0OO00.OooO00o((Object) name, "name");
        return StringsKt__StringsKt.OooO0O0(name, '.', "");
    }

    @Nullable
    public static final File OooO0O0(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "base");
        String OooO0O0 = m22815OooO0O0(file, file2);
        if (OooO0O0 != null) {
            return new File(OooO0O0);
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final String m22815OooO0O0(@NotNull File file, File file2) {
        O000oo00 OooO00o = OooO00o(O000OOOO.OooO00o(file));
        O000oo00 OooO00o2 = OooO00o(O000OOOO.OooO00o(file2));
        if (!o0O0OO00.OooO00o(OooO00o.OooO0O0(), OooO00o2.OooO0O0())) {
            return null;
        }
        int OooO00o3 = OooO00o2.OooO00o();
        int OooO00o4 = OooO00o.OooO00o();
        int i = 0;
        int min = Math.min(OooO00o4, OooO00o3);
        while (i < min && o0O0OO00.OooO00o(OooO00o.m16515OooO0O0().get(i), OooO00o2.m16515OooO0O0().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = OooO00o3 - 1;
        if (i2 >= i) {
            while (!o0O0OO00.OooO00o((Object) OooO00o2.m16515OooO0O0().get(i2).getName(), (Object) "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < OooO00o4) {
            if (i < OooO00o3) {
                sb.append(File.separatorChar);
            }
            List OooO0O0 = CollectionsKt___CollectionsKt.m22752OooO0O0((Iterable) OooO00o.m16515OooO0O0(), i);
            String str = File.separator;
            o0O0OO00.OooO00o((Object) str, "File.separator");
            CollectionsKt___CollectionsKt.OooO00o(OooO0O0, sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m22811OooO00o(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "base");
        String OooO0O0 = m22815OooO0O0(file, file2);
        if (OooO0O0 != null) {
            return OooO0O0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    @NotNull
    public static final File OooO00o(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, "base");
        return new File(m22811OooO00o(file, file2));
    }

    @NotNull
    public static /* synthetic */ File OooO00o(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return OooO00o(file, file2, z, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        throw r7;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File OooO00o(@org.jetbrains.annotations.NotNull java.io.File r6, @org.jetbrains.annotations.NotNull java.io.File r7, boolean r8, int r9) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__UtilsKt.OooO00o(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22816OooO0O0(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        Iterator it = O00O.OooO00o(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22817OooO0O0(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, DispatchConstants.OTHER);
        O000oo00 OooO00o = O000OOOO.OooO00o(file);
        O000oo00 OooO00o2 = O000OOOO.OooO00o(file2);
        if (!(!o0O0OO00.OooO00o(OooO00o.OooO0O0(), OooO00o2.OooO0O0())) && OooO00o.OooO00o() >= OooO00o2.OooO00o()) {
            return OooO00o.m16515OooO0O0().subList(0, OooO00o2.OooO00o()).equals(OooO00o2.m16515OooO0O0());
        }
        return false;
    }

    public static /* synthetic */ boolean OooO00o(File file, File file2, boolean z, O00Oo000 o00Oo000, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            o00Oo000 = FilesKt__UtilsKt$copyRecursively$1.INSTANCE;
        }
        return OooO00o(file, file2, z, o00Oo000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[Catch:{ TerminateException -> 0x00e4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean OooO00o(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull java.io.File r12, boolean r13, @org.jetbrains.annotations.NotNull com.p118pd.sdk.O00Oo000<? super java.io.File, ? super java.io.IOException, ? extends kotlin.p285io.OnErrorAction> r14) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__UtilsKt.OooO00o(java.io.File, java.io.File, boolean, com.pd.sdk.O00Oo000):boolean");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22818OooO0O0(@NotNull File file, @NotNull String str) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, DispatchConstants.OTHER);
        return m22817OooO0O0(file, new File(str));
    }

    @NotNull
    public static final File OooO0O0(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        O000oo00 OooO00o = O000OOOO.OooO00o(file);
        File OooO0O0 = OooO00o.OooO0O0();
        List<File> OooO00o2 = OooO00o(OooO00o.m16515OooO0O0());
        String str = File.separator;
        o0O0OO00.OooO00o((Object) str, "File.separator");
        return OooO00o(OooO0O0, CollectionsKt___CollectionsKt.OooO00o(OooO00o2, str, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final File OooO0O0(@NotNull File file, @NotNull String str) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, "relative");
        return OooO0o0(file, new File(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m22812OooO00o(@NotNull File file, @NotNull File file2) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(file2, DispatchConstants.OTHER);
        O000oo00 OooO00o = O000OOOO.OooO00o(file);
        O000oo00 OooO00o2 = O000OOOO.OooO00o(file2);
        if (OooO00o2.m16514OooO00o()) {
            return o0O0OO00.OooO00o(file, file2);
        }
        int OooO00o3 = OooO00o.OooO00o() - OooO00o2.OooO00o();
        if (OooO00o3 < 0) {
            return false;
        }
        return OooO00o.m16515OooO0O0().subList(OooO00o3, OooO00o.OooO00o()).equals(OooO00o2.m16515OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m22813OooO00o(@NotNull File file, @NotNull String str) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, DispatchConstants.OTHER);
        return m22812OooO00o(file, new File(str));
    }

    public static final O000oo00 OooO00o(@NotNull O000oo00 o000oo00) {
        return new O000oo00(o000oo00.OooO0O0(), OooO00o(o000oo00.m16515OooO0O0()));
    }

    public static final List<File> OooO00o(@NotNull List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472 && name.equals("..")) {
                        if (arrayList.isEmpty() || !(!o0O0OO00.OooO00o((Object) ((File) CollectionsKt___CollectionsKt.OooO0oo((List) arrayList)).getName(), (Object) ".."))) {
                            arrayList.add(file);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else if (name.equals(C9058ooOoOoOO.OooOO0)) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    @NotNull
    public static final File OooO00o(@NotNull File file, @NotNull String str) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, "relative");
        return OooO0Oo(file, new File(str));
    }
}
