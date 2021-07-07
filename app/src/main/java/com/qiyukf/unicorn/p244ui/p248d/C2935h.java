package com.qiyukf.unicorn.p244ui.p248d;

import android.text.Editable;
import android.text.Html;
import android.widget.TextView;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.viewholder.C2096h;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2581p;
import com.qiyukf.unicorn.p232k.C2700f;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xml.sax.XMLReader;

/* renamed from: com.qiyukf.unicorn.ui.d.h */
public class C2935h extends C2096h {

    /* renamed from: f */
    public C2581p f6356f;

    /* renamed from: com.qiyukf.unicorn.ui.d.h$a */
    public class C2936a implements Html.TagHandler {
        public C2936a() {
        }

        public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if ("html".equals(str)) {
                HashMap b = C2935h.m6818b(xMLReader);
                if (b.get("src") != null) {
                    if (b.get("title") == null) {
                        C1870a.m3567a((String) b.get("src"), C2935h.this.f4218c);
                        C2935h.this.f4218c.setVisibility(0);
                        C2935h.this.f4217b.setVisibility(8);
                    } else if (!((String) b.get("title")).endsWith(".gif") && !((String) b.get("title")).endsWith(".GIF")) {
                        C1870a.m3567a((String) b.get("src"), C2935h.this.f4218c);
                        C2935h.this.f4218c.setVisibility(0);
                        C2935h.this.f4217b.setVisibility(8);
                    } else if (C2452d.m5373e() == null || C2452d.m5373e().gifImageLoader == null) {
                        C1870a.m3567a((String) b.get("src"), C2935h.this.f4218c);
                        C2935h.this.f4218c.setVisibility(0);
                        C2935h.this.f4217b.setVisibility(8);
                    } else {
                        C2452d.m5373e().gifImageLoader.loadGifImage((String) b.get("src"), C2935h.this.f4217b, (String) b.get("title"));
                        C2935h.this.f4218c.setVisibility(8);
                        C2935h.this.f4217b.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m6816a(C2581p pVar) {
        return (pVar == null || pVar.mo36069a() == null || (!pVar.mo36069a().startsWith("<img") && !pVar.mo36069a().startsWith("<IMG"))) ? false : true;
    }

    /* renamed from: b */
    public static HashMap<String, String> m6818b(XMLReader xMLReader) {
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

    @Override // com.qiyukf.nim.uikit.session.viewholder.C2096h
    /* renamed from: a */
    public final int mo34623a() {
        if (m6816a(this.f6356f)) {
            return 0;
        }
        return super.mo34623a();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.C2096h
    /* renamed from: a */
    public final void mo34624a(TextView textView) {
        int dimension = (int) textView.getResources().getDimension(C2364R.dimen.ysf_bubble_content_rich_image_max_width);
        if (m6816a(this.f6356f)) {
            this.f4216a.setVisibility(8);
            Html.fromHtml(this.f6356f.mo36069a(), null, new C2936a());
        } else if (C1990f.m3950a(this.f6356f.mo36069a())) {
            this.f4216a.setText(C1990f.m3946a(this.context, this.f6356f.mo36069a(), this.f4216a));
            this.f4216a.setVisibility(0);
            this.f4217b.setVisibility(8);
            this.f4218c.setVisibility(8);
        } else {
            C2700f.m6246a(textView, this.f6356f.mo36069a(), dimension, this.message.getSessionId());
            this.f4216a.setVisibility(0);
            this.f4217b.setVisibility(8);
            this.f4218c.setVisibility(8);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.C2096h
    /* renamed from: b */
    public final int mo34625b() {
        if (m6816a(this.f6356f)) {
            return 0;
        }
        return super.mo34625b();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.nim.uikit.session.viewholder.C2096h
    public void bindContentView() {
        this.f6356f = (C2581p) this.message.getAttachment();
        super.bindContentView();
    }
}
