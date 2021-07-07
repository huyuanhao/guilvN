package kotlin.text;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.C8282oOo000oO;
import com.p118pd.sdk.C9202oooOooo;
import com.p118pd.sdk.C9878I1;
import com.p118pd.sdk.O000O000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oOO0OO00;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, mo43195d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/text/StringsKt")
public class StringsKt__IndentKt {
    @NotNull
    public static /* synthetic */ String OooO00o(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return OooO00o(str, str2, str3);
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return OooO0O0(str, str2);
    }

    @NotNull
    public static /* synthetic */ String OooO0OO(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return OooO0OO(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i;
        String invoke;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "newIndent");
        o0O0OO00.OooO0o(str3, "marginPrefix");
        if (!oOO0OO00.OooO00o((CharSequence) str3)) {
            List<String> OooO00o = StringsKt__StringsKt.m22898OooO00o((CharSequence) str);
            int length = str.length() + (str2.length() * OooO00o.size());
            O00O0OOO<String, String> OooO00o2 = m22890OooO00o(str2);
            int OooO00o3 = CollectionsKt__CollectionsKt.OooO00o((List) OooO00o);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T t : OooO00o) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                }
                T t2 = t;
                String str4 = null;
                if ((i2 == 0 || i2 == OooO00o3) && oOO0OO00.OooO00o((CharSequence) t2)) {
                    t2 = null;
                } else {
                    int length2 = t2.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C8282oOo000oO.OooOOO(t2.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1 && oOO0OO00.OooO00o((String) t2, str3, i, false, 4, (Object) null)) {
                        int length3 = i + str3.length();
                        if (t2 != null) {
                            str4 = t2.substring(length3);
                            o0O0OO00.OooO00o((Object) str4, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    if (!(str4 == null || (invoke = OooO00o2.invoke(str4)) == 0)) {
                        t2 = invoke;
                    }
                }
                if (t2 != null) {
                    arrayList.add(t2);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) CollectionsKt___CollectionsKt.OooO00o(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            o0O0OO00.OooO00o((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String str2) {
        String invoke;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "newIndent");
        List<String> OooO00o = StringsKt__StringsKt.m22898OooO00o((CharSequence) str);
        ArrayList<String> arrayList = new ArrayList();
        for (T t : OooO00o) {
            if (!oOO0OO00.OooO00o((CharSequence) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList(C9202oooOooo.OooO00o(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(OooO00o(str3)));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.m22745OooO0O0((Iterable) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * OooO00o.size());
        O00O0OOO<String, String> OooO00o2 = m22890OooO00o(str2);
        int OooO00o3 = CollectionsKt__CollectionsKt.OooO00o((List) OooO00o);
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : OooO00o) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            }
            T t3 = t2;
            if ((i == 0 || i == OooO00o3) && oOO0OO00.OooO00o((CharSequence) t3)) {
                t3 = null;
            } else {
                String OooO0O0 = StringsKt___StringsKt.OooO0O0((String) t3, intValue);
                if (!(OooO0O0 == null || (invoke = OooO00o2.invoke(OooO0O0)) == 0)) {
                    t3 = invoke;
                }
            }
            if (t3 != null) {
                arrayList3.add(t3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) CollectionsKt___CollectionsKt.OooO00o(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        o0O0OO00.OooO00o((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "marginPrefix");
        return OooO00o(str, "", str2);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m22891OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return OooO0O0(str, "");
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = C9878I1.f23489OooO00o;
        }
        return OooO00o(str, str2);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "indent");
        return SequencesKt___SequencesKt.OooO00o(SequencesKt___SequencesKt.OooO0oO((AbstractC7873oO0OOo00) StringsKt__StringsKt.m22893OooO00o((CharSequence) str), (O00O0OOO) new StringsKt__IndentKt$prependIndent$1(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final O00O0OOO<String, String> m22890OooO00o(String str) {
        if (str.length() == 0) {
            return StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
        }
        return new StringsKt__IndentKt$getIndentFunction$2(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    public static final String OooO00o(@NotNull List<String> list, int i, O00O0OOO<? super String, String> o00o0ooo, O00O0OOO<? super String, String> o00o0ooo2) {
        String invoke;
        int OooO00o = CollectionsKt__CollectionsKt.OooO00o((List) list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            T t2 = t;
            if ((i2 == 0 || i2 == OooO00o) && oOO0OO00.OooO00o((CharSequence) t2)) {
                t2 = null;
            } else {
                String invoke2 = o00o0ooo2.invoke(t2);
                if (!(invoke2 == null || (invoke = o00o0ooo.invoke(invoke2)) == 0)) {
                    t2 = invoke;
                }
            }
            if (t2 != null) {
                arrayList.add(t2);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt___CollectionsKt.OooO00o(arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null)).toString();
        o0O0OO00.OooO00o((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static final int OooO00o(@NotNull String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C8282oOo000oO.OooOOO(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }
}
