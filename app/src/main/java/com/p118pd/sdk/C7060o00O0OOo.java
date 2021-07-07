package com.p118pd.sdk;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* renamed from: com.pd.sdk.o00O0OOo  reason: case insensitive filesystem */
public final class C7060o00O0OOo {
    public static final C7060o00O0OOo OooO00o = new C7060o00O0OOo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC8730oo0oOO0 f19325OooO00o;

    @RequiresApi(24)
    /* renamed from: com.pd.sdk.o00O0OOo$OooO00o */
    public static class OooO00o implements AbstractC8730oo0oOO0 {
        public LocaleList OooO00o = new LocaleList(new Locale[0]);

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public void OooO00o(@NonNull Locale... localeArr) {
            this.OooO00o = new LocaleList(localeArr);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public boolean equals(Object obj) {
            return this.OooO00o.equals(((C7060o00O0OOo) obj).m18330OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public int hashCode() {
            return this.OooO00o.hashCode();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public boolean isEmpty() {
            return this.OooO00o.isEmpty();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @IntRange(from = 0)
        public int size() {
            return this.OooO00o.size();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public String toString() {
            return this.OooO00o.toString();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0, com.p118pd.sdk.AbstractC8730oo0oOO0
        public Object OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public Locale OooO00o(int i) {
            return this.OooO00o.get(i);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @IntRange(from = -1)
        public int OooO00o(Locale locale) {
            return this.OooO00o.indexOf(locale);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0, com.p118pd.sdk.AbstractC8730oo0oOO0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m18333OooO00o() {
            return this.OooO00o.toLanguageTags();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @Nullable
        public Locale OooO00o(String[] strArr) {
            LocaleList localeList = this.OooO00o;
            if (localeList != null) {
                return localeList.getFirstMatch(strArr);
            }
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o00O0OOo$OooO0O0 */
    public static class OooO0O0 implements AbstractC8730oo0oOO0 {
        public C7062o00O0Oo0 OooO00o = new C7062o00O0Oo0(new Locale[0]);

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public void OooO00o(@NonNull Locale... localeArr) {
            this.OooO00o = new C7062o00O0Oo0(localeArr);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public boolean equals(Object obj) {
            return this.OooO00o.equals(((C7060o00O0OOo) obj).m18330OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public int hashCode() {
            return this.OooO00o.hashCode();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public boolean isEmpty() {
            return this.OooO00o.m18343OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @IntRange(from = 0)
        public int size() {
            return this.OooO00o.m18338OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public String toString() {
            return this.OooO00o.toString();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0, com.p118pd.sdk.AbstractC8730oo0oOO0
        public Object OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        public Locale OooO00o(int i) {
            return this.OooO00o.OooO00o(i);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @IntRange(from = -1)
        public int OooO00o(Locale locale) {
            return this.OooO00o.m18339OooO00o(locale);
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0, com.p118pd.sdk.AbstractC8730oo0oOO0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m18334OooO00o() {
            return this.OooO00o.m18341OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC8730oo0oOO0
        @Nullable
        public Locale OooO00o(String[] strArr) {
            C7062o00O0Oo0 o00o0oo0 = this.OooO00o;
            if (o00o0oo0 != null) {
                return o00o0oo0.m18342OooO00o(strArr);
            }
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f19325OooO00o = new OooO00o();
        } else {
            f19325OooO00o = new OooO0O0();
        }
    }

    @RequiresApi(24)
    public static C7060o00O0OOo OooO00o(Object obj) {
        C7060o00O0OOo o00o0ooo = new C7060o00O0OOo();
        if (obj instanceof LocaleList) {
            o00o0ooo.OooO00o((LocaleList) obj);
        }
        return o00o0ooo;
    }

    @NonNull
    @Size(min = 1)
    public static C7060o00O0OOo OooO0O0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return OooO00o((Object) LocaleList.getDefault());
        }
        return OooO00o(Locale.getDefault());
    }

    @NonNull
    public static C7060o00O0OOo OooO0OO() {
        return OooO00o;
    }

    public boolean equals(Object obj) {
        return f19325OooO00o.equals(obj);
    }

    public int hashCode() {
        return f19325OooO00o.hashCode();
    }

    public String toString() {
        return f19325OooO00o.toString();
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18330OooO00o() {
        return f19325OooO00o.OooO00o();
    }

    public static C7060o00O0OOo OooO00o(@NonNull Locale... localeArr) {
        C7060o00O0OOo o00o0ooo = new C7060o00O0OOo();
        o00o0ooo.m18328OooO00o(localeArr);
        return o00o0ooo;
    }

    public Locale OooO00o(int i) {
        return f19325OooO00o.OooO00o(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18332OooO00o() {
        return f19325OooO00o.isEmpty();
    }

    @IntRange(from = 0)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18329OooO00o() {
        return f19325OooO00o.size();
    }

    @IntRange(from = -1)
    public int OooO00o(Locale locale) {
        return f19325OooO00o.OooO00o(locale);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18331OooO00o() {
        return f19325OooO00o.m20345OooO00o();
    }

    public Locale OooO00o(String[] strArr) {
        return f19325OooO00o.OooO00o(strArr);
    }

    @NonNull
    public static C7060o00O0OOo OooO00o(@Nullable String str) {
        Locale locale;
        if (str == null || str.isEmpty()) {
            return OooO0OO();
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            if (Build.VERSION.SDK_INT >= 21) {
                locale = Locale.forLanguageTag(split[i]);
            } else {
                locale = C7059o00O0OOO.OooO00o(split[i]);
            }
            localeArr[i] = locale;
        }
        C7060o00O0OOo o00o0ooo = new C7060o00O0OOo();
        o00o0ooo.m18328OooO00o(localeArr);
        return o00o0ooo;
    }

    @NonNull
    @Size(min = 1)
    public static C7060o00O0OOo OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return OooO00o((Object) LocaleList.getAdjustedDefault());
        }
        return OooO00o(Locale.getDefault());
    }

    @RequiresApi(24)
    private void OooO00o(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            f19325OooO00o.OooO00o(localeArr);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m18328OooO00o(Locale... localeArr) {
        f19325OooO00o.OooO00o(localeArr);
    }
}
