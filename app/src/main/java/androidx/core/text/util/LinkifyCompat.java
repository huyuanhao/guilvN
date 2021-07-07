package androidx.core.text.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7078o00O0ooo;
import com.p118pd.sdk.C7084o00OO0O;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LinkifyCompat {
    public static final Comparator<OooO0O0> OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f14039OooO00o = new String[0];

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LinkifyMask {
    }

    public static class OooO00o implements Comparator<OooO0O0> {
        /* renamed from: OooO00o */
        public int compare(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
            int i;
            int i2;
            int i3 = oooO0O0.OooO00o;
            int i4 = oooO0O02.OooO00o;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4 || (i = oooO0O0.OooO0O0) < (i2 = oooO0O02.OooO0O0)) {
                return 1;
            }
            if (i > i2) {
                return -1;
            }
            return 0;
        }
    }

    public static class OooO0O0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public URLSpan f14040OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f14041OooO00o;
        public int OooO0O0;
    }

    public static boolean OooO00o(@NonNull Spannable spannable, int i) {
        if (OooO00o()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            OooO00o(arrayList, spannable, C7084o00OO0O.f19412OooO0o0, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (Linkify.TransformFilter) null);
        }
        if ((i & 2) != 0) {
            OooO00o(arrayList, spannable, C7084o00OO0O.f19411OooO0o, new String[]{"mailto:"}, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
        if ((i & 8) != 0) {
            OooO00o(arrayList, spannable);
        }
        OooO0O0(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            if (oooO0O0.f14040OooO00o == null) {
                OooO00o(oooO0O0.f14041OooO00o, oooO0O0.OooO00o, oooO0O0.OooO0O0, spannable);
            }
        }
        return true;
    }

    public static void OooO0O0(ArrayList<OooO0O0> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i3 = 0; i3 < objArr.length; i3++) {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f14040OooO00o = objArr[i3];
            oooO0O0.OooO00o = spannable.getSpanStart(objArr[i3]);
            oooO0O0.OooO0O0 = spannable.getSpanEnd(objArr[i3]);
            arrayList.add(oooO0O0);
        }
        Collections.sort(arrayList, OooO00o);
        int size = arrayList.size();
        while (i2 < size - 1) {
            OooO0O0 oooO0O02 = arrayList.get(i2);
            int i4 = i2 + 1;
            OooO0O0 oooO0O03 = arrayList.get(i4);
            int i5 = oooO0O02.OooO00o;
            int i6 = oooO0O03.OooO00o;
            if (i5 <= i6 && (i = oooO0O02.OooO0O0) > i6) {
                int i7 = oooO0O03.OooO0O0;
                int i8 = (i7 > i && i - i5 <= i7 - i6) ? i - i5 < i7 - i6 ? i2 : -1 : i4;
                if (i8 != -1) {
                    Object obj = arrayList.get(i8).f14040OooO00o;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i8);
                    size--;
                }
            }
            i2 = i4;
        }
    }

    public static boolean OooO00o(@NonNull TextView textView, int i) {
        if (OooO00o()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (!OooO00o(valueOf, i)) {
                return false;
            }
            OooO00o(textView);
            textView.setText(valueOf);
            return true;
        } else if (!OooO00o((Spannable) text, i)) {
            return false;
        } else {
            OooO00o(textView);
            return true;
        }
    }

    public static void OooO00o(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str) {
        if (OooO00o()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            OooO00o(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void OooO00o(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (OooO00o()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            OooO00o(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    public static void OooO00o(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str, @Nullable String[] strArr, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (OooO00o()) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (OooO00o(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            OooO00o(textView);
        }
    }

    public static boolean OooO00o(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str) {
        if (OooO00o()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return OooO00o(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean OooO00o(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (OooO00o()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return OooO00o(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    public static boolean OooO00o(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str, @Nullable String[] strArr, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        String str2;
        if (OooO00o()) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f14039OooO00o;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str3 = strArr[i];
            i++;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = str2;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) {
                OooO00o(OooO00o(matcher.group(0), strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }

    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static void OooO00o(@NonNull TextView textView) {
        MovementMethod movementMethod = textView.getMovementMethod();
        if ((movementMethod == null || !(movementMethod instanceof LinkMovementMethod)) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static String OooO00o(@NonNull String str, @NonNull String[] strArr, Matcher matcher, @Nullable Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            } else if (!str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                i++;
            } else if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                str = strArr[i] + str.substring(strArr[i].length());
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    public static void OooO00o(ArrayList<OooO0O0> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                OooO0O0 oooO0O0 = new OooO0O0();
                oooO0O0.f14041OooO00o = OooO00o(matcher.group(0), strArr, matcher, transformFilter);
                oooO0O0.OooO00o = start;
                oooO0O0.OooO0O0 = end;
                arrayList.add(oooO0O0);
            }
        }
    }

    public static void OooO00o(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:13:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:13:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:13:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.OooO0O0> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = OooO00o(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            androidx.core.text.util.LinkifyCompat$OooO0O0 r3 = new androidx.core.text.util.LinkifyCompat$OooO0O0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.OooO00o = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.OooO0O0 = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r3.f14041OooO00o = r1
            r5.add(r3)
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.util.LinkifyCompat.OooO00o(java.util.ArrayList, android.text.Spannable):void");
    }

    public static String OooO00o(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C7078o00O0ooo.OooO00o(str);
    }
}
