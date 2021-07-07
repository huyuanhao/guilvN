package com.qiyukf.nim.uikit.session.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.helper.C2003b;
import com.qiyukf.unicorn.p232k.C2722o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.f */
public final class C1990f {

    /* renamed from: a */
    public static Pattern f3903a = Pattern.compile("<a\\s+([^>]*)>([^<]*)</a>");

    /* renamed from: b */
    public static Pattern f3904b = Pattern.compile("href\\s*=\\s*(\\S*)");

    /* renamed from: com.qiyukf.nim.uikit.session.emoji.f$a */
    public static class C1991a extends C2003b {

        /* renamed from: a */
        public int f3905a;

        /* renamed from: b */
        public int f3906b;

        /* renamed from: c */
        public String f3907c;

        public C1991a(Context context, String str, String str2, String str3) {
            super(context, str2);
            this.f3907c = str;
            mo34463a(str3);
        }

        /* renamed from: a */
        public final String mo34426a() {
            return this.f3907c;
        }

        /* renamed from: a */
        public final void mo34427a(int i, int i2) {
            this.f3905a = i;
            this.f3906b = i2;
        }

        @Override // com.qiyukf.nim.uikit.session.helper.C2003b
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: a */
    public static Drawable m3944a(Context context, CharSequence charSequence, float f) {
        Drawable a = C1978b.m3913a(context, charSequence.toString());
        if (a != null) {
            a.setBounds(0, 0, (int) (((float) a.getIntrinsicWidth()) * f), (int) (((float) a.getIntrinsicHeight()) * f));
        }
        return a;
    }

    /* renamed from: a */
    public static SpannableString m3945a(Context context, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        SpannableString spannableString = new SpannableString(charSequence);
        Matcher matcher = C1978b.m3916b().matcher(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            Drawable a = m3944a(context, charSequence.subSequence(start, end), 0.6f);
            if (a != null) {
                spannableString.setSpan(new ImageSpan(a, 0), start, end, 33);
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m3946a(Context context, CharSequence charSequence, TextView textView) {
        Object imageSpan;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        if (textView == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        Matcher matcher = C1978b.m3916b().matcher(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            CharSequence subSequence = charSequence.subSequence(start, end);
            if (!TextUtils.isEmpty(m3952b(subSequence))) {
                imageSpan = new C2722o(context, m3952b(subSequence), textView);
            } else {
                Drawable a = m3944a(context, subSequence, 0.6f);
                if (a != null) {
                    imageSpan = new ImageSpan(a, 0);
                }
            }
            spannableString.setSpan(imageSpan, start, end, 33);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m3947a(Context context, String str, String str2) {
        return m3945a(context, m3951b(context, str, str2));
    }

    /* renamed from: a */
    public static void m3948a(Context context, Editable editable, int i, int i2) {
        int i3;
        if (i2 > 0 && editable.length() >= (i3 = i2 + i)) {
            Matcher matcher = C1978b.m3916b().matcher(editable.subSequence(i, i3));
            while (matcher.find()) {
                int start = matcher.start() + i;
                int end = matcher.end() + i;
                Drawable a = m3944a(context, editable.subSequence(start, end).toString(), 0.45f);
                if (a != null) {
                    editable.setSpan(new ImageSpan(a, 0), start, end, 33);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3949a(Context context, TextView textView, String str, String str2) {
        SpannableString a = m3947a(context, str, str2);
        if (textView != null) {
            textView.setText(a);
        }
    }

    /* renamed from: a */
    public static boolean m3950a(CharSequence charSequence) {
        Pattern compile = Pattern.compile("\\[:[^\\[\\]]{1,10}\\]");
        if (charSequence == null) {
            return false;
        }
        Matcher matcher = compile.matcher(charSequence);
        while (matcher.find()) {
            if (charSequence.subSequence(matcher.start(), matcher.end()) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static SpannableString m3951b(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Matcher matcher = f3903a.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String str3 = null;
            Matcher matcher2 = f3904b.matcher(group);
            if (matcher2.find()) {
                str3 = matcher2.group(1).replace("\"", "").replace("'", "");
            }
            C1991a aVar = new C1991a(context, group2, str3, str2);
            aVar.mo34427a(start, end);
            arrayList.add(aVar);
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1991a aVar2 = (C1991a) it.next();
                sb.append(str.subSequence(i, aVar2.f3905a));
                sb.append(aVar2.mo34426a());
                i = aVar2.f3906b;
                aVar2.f3906b = sb.length();
                aVar2.f3905a = aVar2.f3906b - aVar2.mo34426a().length();
            }
            sb.append(str.subSequence(i, str.length()));
            str = sb.toString();
        }
        SpannableString spannableString = new SpannableString(str);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1991a aVar3 = (C1991a) it2.next();
            spannableString.setSpan(aVar3, aVar3.f3905a, aVar3.f3906b, 33);
        }
        return spannableString;
    }

    /* renamed from: b */
    public static String m3952b(CharSequence charSequence) {
        return C1995i.m3963a().mo34439a(charSequence.toString());
    }
}
