package com.qiyukf.basesdk.p138c.p140b;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.XMLReader;

/* renamed from: com.qiyukf.basesdk.c.b.c */
public final class C1827c implements Html.TagHandler {

    /* renamed from: a */
    public static Pattern f3377a;

    /* renamed from: b */
    public static Pattern f3378b;

    /* renamed from: c */
    public static Pattern f3379c;

    /* renamed from: d */
    public static Pattern f3380d;

    /* renamed from: e */
    public static Pattern f3381e;

    /* renamed from: f */
    public static Pattern f3382f;

    /* renamed from: g */
    public static final Map<String, Integer> f3383g;

    /* renamed from: m */
    public static final BulletSpan f3384m = new BulletSpan(10);

    /* renamed from: h */
    public Context f3385h;

    /* renamed from: i */
    public TextPaint f3386i;

    /* renamed from: j */
    public Html.ImageGetter f3387j;

    /* renamed from: k */
    public Stack<String> f3388k = new Stack<>();

    /* renamed from: l */
    public Stack<Integer> f3389l = new Stack<>();

    /* renamed from: com.qiyukf.basesdk.c.b.c$a */
    public static class C1828a {

        /* renamed from: a */
        public Layout.Alignment f3390a;

        public C1828a(Layout.Alignment alignment) {
            this.f3390a = alignment;
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$b */
    public static class C1829b {
        public C1829b() {
        }

        public /* synthetic */ C1829b(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$c */
    public static class C1830c {
        public C1830c() {
        }

        public /* synthetic */ C1830c(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$d */
    public static class C1831d {
        public C1831d() {
        }

        public /* synthetic */ C1831d(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$e */
    public static class C1832e {

        /* renamed from: a */
        public String f3391a;

        /* renamed from: b */
        public String f3392b;

        public C1832e(String str, String str2) {
            this.f3391a = str;
            this.f3392b = str2;
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$f */
    public static class C1833f {

        /* renamed from: a */
        public int f3393a;

        /* renamed from: b */
        public int f3394b;

        public C1833f() {
            this.f3393a = 0;
            this.f3394b = 0;
        }

        public /* synthetic */ C1833f(byte b) {
            this();
        }

        /* renamed from: a */
        public final int mo34107a() {
            return this.f3393a;
        }

        /* renamed from: a */
        public final void mo34108a(int i) {
            this.f3393a = i;
        }

        /* renamed from: b */
        public final void mo34109b(int i) {
            this.f3394b = i;
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$g */
    public static class C1834g {

        /* renamed from: a */
        public String f3395a;

        public C1834g(String str) {
            this.f3395a = str;
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$h */
    public static class C1835h {
        public C1835h() {
        }

        public /* synthetic */ C1835h(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$i */
    public static class C1836i {

        /* renamed from: a */
        public int f3396a = 1;
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$j */
    public static class C1837j {
        public C1837j() {
        }

        public /* synthetic */ C1837j(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$k */
    public static class C1838k {
        public C1838k() {
        }

        public /* synthetic */ C1838k(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$l */
    public static class C1839l {
        public C1839l() {
        }

        public /* synthetic */ C1839l(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$m */
    public static class C1840m {
        public C1840m() {
        }

        public /* synthetic */ C1840m(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$n */
    public static class C1841n {
        public C1841n() {
        }

        public /* synthetic */ C1841n(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$o */
    public static class C1842o {
        public C1842o() {
        }

        public /* synthetic */ C1842o(byte b) {
            this();
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.c$p */
    public static class C1843p {
        public C1843p() {
        }

        public /* synthetic */ C1843p(byte b) {
            this();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f3383g = hashMap;
        hashMap.put("darkgray", -5658199);
        f3383g.put("gray", -8355712);
        f3383g.put("lightgray", -2894893);
        f3383g.put("darkgrey", -5658199);
        f3383g.put("grey", -8355712);
        f3383g.put("lightgrey", -2894893);
        f3383g.put("green", -16744448);
    }

    /* renamed from: a */
    public static Object m3465a(Editable editable, Class cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        for (int length = spans.length; length > 0; length--) {
            int i = length - 1;
            if (editable.getSpanFlags(spans[i]) == 17) {
                return spans[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m3466a(Spanned spanned, Class<T> cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[spans.length - 1];
    }

    /* renamed from: a */
    public static String m3467a(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.replaceAll("<div>(<img\\s+[^>]*>)</div>", "$1");
        return ("<html>" + replaceAll + "</html>").replace("<ul", "<HTML_TEXT_TAG_UL").replace("</ul>", "</HTML_TEXT_TAG_UL>").replace("<ol", "<HTML_TEXT_TAG_OL").replace("</ol>", "</HTML_TEXT_TAG_OL>").replace("<li", "<HTML_TEXT_TAG_LI").replace("</li>", "</HTML_TEXT_TAG_LI>").replace("<font", "<HTML_TEXT_TAG_FONT").replace("</font>", "</HTML_TEXT_TAG_FONT>").replace("<div", "<HTML_TEXT_TAG_DIV").replace("</div>", "</HTML_TEXT_TAG_DIV>").replace("<span", "<HTML_SPAN_STYLE").replace("</span>", "</HTML_SPAN_STYLE>").replace("<br", "<HTML_BR_LABEL").replace("<b", "<HTML_B_STYLE").replace("<HTML_BR_LABEL", "<br").replace("</b>", "</HTML_B_STYLE>").replace("<p", "<HTML_P_STYLE").replace("</p>", "</HTML_P_STYLE>").replace("<a", "<HTML_A_STYLE").replace("</a>", "</HTML_A_STYLE>").replace("<u", "<HTML_U_STYLE").replace("</u>", "</HTML_U_STYLE>").replace("<img", "<HTML_IMG_LABEL").replace("<i", "<HTML_I_STYLE").replace("<HTML_IMG_LABEL", "<img").replace("<video", "<HTML_VIDEO_LABEL").replace("</i>", "</HTML_I_STYLE>").replace("\n", "<br>");
    }

    /* renamed from: a */
    public static HashMap<String, String> m3468a(XMLReader xMLReader) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Field declaredField = xMLReader.getClass().getDeclaredField("theNewElement");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(xMLReader);
            Field declaredField2 = obj.getClass().getDeclaredField("theAtts");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("data");
            declaredField3.setAccessible(true);
            String[] strArr = (String[]) declaredField3.get(obj2);
            Field declaredField4 = obj2.getClass().getDeclaredField("length");
            declaredField4.setAccessible(true);
            int intValue = ((Integer) declaredField4.get(obj2)).intValue();
            for (int i = 0; i < intValue; i++) {
                int i2 = i * 5;
                hashMap.put(strArr[i2 + 1], strArr[i2 + 4]);
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m3469a(Editable editable) {
        C1833f fVar;
        int length = editable.length();
        Object[] spans = editable.getSpans(0, editable.length(), C1833f.class);
        Object obj = spans.length == 0 ? null : spans[spans.length - 1];
        int spanStart = editable.getSpanStart(obj);
        editable.removeSpan(obj);
        if (spanStart != length && (fVar = (C1833f) obj) != null) {
            int a = fVar.mo34107a();
            int i = fVar.f3394b;
            if (a != -1) {
                editable.setSpan(new ForegroundColorSpan(a | -16777216), spanStart, length, 33);
            }
            if (i > 0) {
                editable.setSpan(new AbsoluteSizeSpan(i, true), spanStart, length, 33);
            }
        }
    }

    /* renamed from: a */
    public static void m3470a(Editable editable, int i) {
        int length = editable.length();
        if (length != 0) {
            int i2 = 0;
            while (true) {
                length--;
                if (length >= 0 && editable.charAt(length) == '\n') {
                    i2++;
                }
            }
            while (i2 < i) {
                editable.append("\n");
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m3471a(Editable editable, Class cls, Object obj) {
        editable.length();
        Object a = m3465a(editable, cls);
        if (a != null) {
            m3475a(editable, a, obj);
        }
    }

    /* renamed from: a */
    public static void m3472a(Editable editable, Class cls, boolean z, Object... objArr) {
        Object a = m3465a(editable, cls);
        int spanStart = editable.getSpanStart(a);
        int length = editable.length();
        editable.removeSpan(a);
        if (spanStart != length) {
            if (z) {
                editable.append("\n");
                length++;
            }
            for (Object obj : objArr) {
                editable.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    /* renamed from: a */
    public static void m3473a(Editable editable, Object obj) {
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    /* renamed from: a */
    public static void m3474a(Editable editable, XMLReader xMLReader) {
        int d;
        String str = m3468a(xMLReader).get("style");
        if (str != null) {
            C1833f fVar = new C1833f((byte) 0);
            if (f3377a == null) {
                f3377a = Pattern.compile("(?:\\s+|\\A|;\\s*)color\\s*:\\s*(.*)\\b");
            }
            Matcher matcher = f3377a.matcher(str);
            if (matcher.find() && (d = m3480d(matcher.group(1))) != -1) {
                fVar.mo34108a(d);
            }
            if (f3378b == null) {
                f3378b = Pattern.compile("font-size: (\\d+)px");
            }
            Matcher matcher2 = f3378b.matcher(str);
            if (matcher2.find()) {
                try {
                    fVar.mo34109b(Integer.parseInt(matcher2.group(1)));
                } catch (NumberFormatException unused) {
                }
            }
            int length = editable.length();
            editable.setSpan(fVar, length, length, 17);
        }
    }

    /* renamed from: a */
    public static void m3475a(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        spannable.removeSpan(obj);
        int length = spannable.length();
        if (spanStart != length) {
            for (int i = 0; i <= 0; i++) {
                spannable.setSpan(objArr[0], spanStart, length, 33);
            }
        }
    }

    /* renamed from: b */
    public static int m3476b(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m3477b(Editable editable) {
        int length = editable.length();
        if ((length <= 0 || editable.charAt(length - 1) != '\n') && length != 0) {
            editable.append("\n");
        }
    }

    /* renamed from: b */
    public static void m3478b(Editable editable, Object obj) {
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    /* renamed from: c */
    private int m3479c(String str) {
        try {
            return (Math.min(Math.max(Integer.parseInt(str), 1), 7) - 3) + ((int) ((this.f3386i.getTextSize() / this.f3385h.getResources().getDisplayMetrics().density) + 0.5f));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(5:1|2|(1:4)|5|(2:7|8))|9|11|12|(1:14)|15|(2:17|18)|19|20|(1:22)|23|(2:25|26)(1:29)) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return -16777216;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3480d(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p140b.C1827c.m3480d(java.lang.String):int");
    }

    /* renamed from: a */
    public final void mo34104a(Html.ImageGetter imageGetter) {
        this.f3387j = imageGetter;
    }

    /* renamed from: a */
    public final void mo34105a(TextView textView) {
        this.f3385h = textView.getContext().getApplicationContext();
        this.f3386i = textView.getPaint();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: android.text.style.BulletSpan */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleTag(boolean r27, java.lang.String r28, android.text.Editable r29, org.xml.sax.XMLReader r30) {
        /*
        // Method dump skipped, instructions count: 1316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p140b.C1827c.handleTag(boolean, java.lang.String, android.text.Editable, org.xml.sax.XMLReader):void");
    }
}
