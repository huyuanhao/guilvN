package com.p118pd.sdk;

import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O0Oo0  reason: case insensitive filesystem */
public final class C7062o00O0Oo0 {
    public static final int OooO00o = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7062o00O0Oo0 f19326OooO00o = new C7062o00O0Oo0(new Locale[0]);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19327OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Locale f19328OooO00o = new Locale(SocializeProtocolConstants.PROTOCOL_KEY_EN, "XA");
    @GuardedBy("sLock")
    public static C7062o00O0Oo0 OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19329OooO0O0 = "en-XA";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Locale f19330OooO0O0 = new Locale("ar", "XB");

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Locale[] f19331OooO0O0 = new Locale[0];
    @GuardedBy("sLock")
    public static C7062o00O0Oo0 OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19332OooO0OO = "ar-XB";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Locale f19333OooO0OO = C7059o00O0OOO.OooO00o("en-Latn");
    @GuardedBy("sLock")
    public static C7062o00O0Oo0 OooO0Oo = null;
    @GuardedBy("sLock")

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static Locale f19334OooO0Oo = null;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f19335OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Locale[] f19336OooO00o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C7062o00O0Oo0(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f19336OooO00o = f19331OooO0O0;
            this.f19335OooO00o = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                sb.append(C7059o00O0OOO.OooO00o(locale2));
                if (i < localeArr.length - 1) {
                    sb.append(AbstractC1299b.COMMA);
                }
                hashSet.add(locale2);
            } else {
                throw new IllegalArgumentException("list[" + i + "] is a repetition");
            }
        }
        this.f19336OooO00o = localeArr2;
        this.f19335OooO00o = sb.toString();
    }

    private int OooO0O0(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f19336OooO00o;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (OooO00o(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static C7062o00O0Oo0 OooO0OO() {
        return f19326OooO00o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Locale OooO00o(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f19336OooO00o;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7062o00O0Oo0)) {
            return false;
        }
        Locale[] localeArr = ((C7062o00O0Oo0) obj).f19336OooO00o;
        if (this.f19336OooO00o.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f19336OooO00o;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f19336OooO00o;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f19336OooO00o;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f19336OooO00o.length - 1) {
                    sb.append(AbstractC1299b.COMMA);
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18343OooO00o() {
        return this.f19336OooO00o.length == 0;
    }

    @IntRange(from = 0)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18338OooO00o() {
        return this.f19336OooO00o.length;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Locale m18344OooO0O0(String[] strArr) {
        return m18335OooO00o((Collection<String>) Arrays.asList(strArr), true);
    }

    @IntRange(from = -1)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18339OooO00o(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f19336OooO00o;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int OooO0O0(String[] strArr) {
        return OooO00o(Arrays.asList(strArr));
    }

    @NonNull
    @Size(min = 1)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static C7062o00O0Oo0 OooO0O0() {
        Locale locale = Locale.getDefault();
        synchronized (f19327OooO00o) {
            if (!locale.equals(f19334OooO0Oo)) {
                f19334OooO0Oo = locale;
                if (OooO0OO == null || !locale.equals(OooO0OO.OooO00o(0))) {
                    C7062o00O0Oo0 o00o0oo0 = new C7062o00O0Oo0(locale, OooO0O0);
                    OooO0OO = o00o0oo0;
                    OooO0Oo = o00o0oo0;
                } else {
                    return OooO0OO;
                }
            }
            return OooO0OO;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18341OooO00o() {
        return this.f19335OooO00o;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static C7062o00O0Oo0 OooO00o(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return OooO0OO();
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C7059o00O0OOO.OooO00o(split[i]);
        }
        return new C7062o00O0Oo0(localeArr);
    }

    public static String OooO00o(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            String script = locale.getScript();
            if (!script.isEmpty()) {
                return script;
            }
        }
        return "";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18336OooO00o(String str) {
        return f19329OooO0O0.equals(str) || f19332OooO0OO.equals(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18337OooO00o(Locale locale) {
        return f19328OooO00o.equals(locale) || f19330OooO0O0.equals(locale);
    }

    @IntRange(from = 0, mo605to = 1)
    public static int OooO00o(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m18337OooO00o(locale) || m18337OooO00o(locale2)) {
            return 0;
        }
        String OooO00o2 = OooO00o(locale);
        if (!OooO00o2.isEmpty()) {
            return OooO00o2.equals(OooO00o(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C7062o00O0Oo0(@NonNull Locale locale, C7062o00O0Oo0 o00o0oo0) {
        int i;
        if (locale != null) {
            if (o00o0oo0 == null) {
                i = 0;
            } else {
                i = o00o0oo0.f19336OooO00o.length;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    i2 = -1;
                    break;
                } else if (locale.equals(o00o0oo0.f19336OooO00o[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            int i3 = (i2 == -1 ? 1 : 0) + i;
            Locale[] localeArr = new Locale[i3];
            localeArr[0] = (Locale) locale.clone();
            if (i2 == -1) {
                int i4 = 0;
                while (i4 < i) {
                    int i5 = i4 + 1;
                    localeArr[i5] = (Locale) o00o0oo0.f19336OooO00o[i4].clone();
                    i4 = i5;
                }
            } else {
                int i6 = 0;
                while (i6 < i2) {
                    int i7 = i6 + 1;
                    localeArr[i7] = (Locale) o00o0oo0.f19336OooO00o[i6].clone();
                    i6 = i7;
                }
                for (int i8 = i2 + 1; i8 < i; i8++) {
                    localeArr[i8] = (Locale) o00o0oo0.f19336OooO00o[i8].clone();
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < i3; i9++) {
                sb.append(C7059o00O0OOO.OooO00o(localeArr[i9]));
                if (i9 < i3 - 1) {
                    sb.append(AbstractC1299b.COMMA);
                }
            }
            this.f19336OooO00o = localeArr;
            this.f19335OooO00o = sb.toString();
            return;
        }
        throw new NullPointerException("topLocale is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int OooO00o(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f19336OooO00o
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = com.p118pd.sdk.C7062o00O0Oo0.f19333OooO0OO
            int r6 = r4.OooO0O0(r6)
            if (r6 != 0) goto L_0x001b
            return r2
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0021:
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = com.p118pd.sdk.C7059o00O0OOO.OooO00o(r1)
            int r1 = r4.OooO0O0(r1)
            if (r1 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r1 >= r6) goto L_0x0025
            r6 = r1
            goto L_0x0025
        L_0x0040:
            if (r6 != r0) goto L_0x0043
            return r2
        L_0x0043:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7062o00O0Oo0.OooO00o(java.util.Collection, boolean):int");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Locale m18335OooO00o(Collection<String> collection, boolean z) {
        int OooO00o2 = OooO00o(collection, z);
        if (OooO00o2 == -1) {
            return null;
        }
        return this.f19336OooO00o[OooO00o2];
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Locale m18342OooO00o(String[] strArr) {
        return m18335OooO00o((Collection<String>) Arrays.asList(strArr), false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18340OooO00o(String[] strArr) {
        return OooO00o((Collection<String>) Arrays.asList(strArr), false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int OooO00o(Collection<String> collection) {
        return OooO00o(collection, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean OooO00o(@Nullable String[] strArr) {
        if (strArr == null) {
            return true;
        }
        if (strArr.length > 3) {
            return false;
        }
        for (String str : strArr) {
            if (!(str.isEmpty() || m18336OooO00o(str))) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    @Size(min = 1)
    public static C7062o00O0Oo0 OooO00o() {
        C7062o00O0Oo0 o00o0oo0;
        OooO0O0();
        synchronized (f19327OooO00o) {
            o00o0oo0 = OooO0Oo;
        }
        return o00o0oo0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(@NonNull @Size(min = 1) C7062o00O0Oo0 o00o0oo0) {
        OooO00o(o00o0oo0, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(@NonNull @Size(min = 1) C7062o00O0Oo0 o00o0oo0, int i) {
        if (o00o0oo0 == null) {
            throw new NullPointerException("locales is null");
        } else if (!o00o0oo0.m18343OooO00o()) {
            synchronized (f19327OooO00o) {
                Locale OooO00o2 = o00o0oo0.OooO00o(i);
                f19334OooO0Oo = OooO00o2;
                Locale.setDefault(OooO00o2);
                OooO0O0 = o00o0oo0;
                OooO0OO = o00o0oo0;
                if (i == 0) {
                    OooO0Oo = o00o0oo0;
                } else {
                    OooO0Oo = new C7062o00O0Oo0(f19334OooO0Oo, o00o0oo0);
                }
            }
        } else {
            throw new IllegalArgumentException("locales is empty");
        }
    }
}
