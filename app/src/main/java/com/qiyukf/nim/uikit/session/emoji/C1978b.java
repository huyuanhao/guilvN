package com.qiyukf.nim.uikit.session.emoji;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Xml;
import com.p118pd.sdk.C6980o000O000;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.C1877b;
import com.taobao.accs.AccsClientConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.b */
public final class C1978b {

    /* renamed from: a */
    public static Pattern f3876a = Pattern.compile("\\[[^\\[\\]]{1,10}\\]");

    /* renamed from: b */
    public static final List<C1980a> f3877b = new ArrayList();

    /* renamed from: c */
    public static final Map<String, C1980a> f3878c = new HashMap();

    /* renamed from: d */
    public static C6980o000O000<String, Bitmap> f3879d = new C6980o000O000<String, Bitmap>() {
        /* class com.qiyukf.nim.uikit.session.emoji.C1978b.C19791 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.C6980o000O000
        public final /* synthetic */ void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            Bitmap bitmap3 = bitmap;
            if (bitmap3 != bitmap2) {
                bitmap3.recycle();
            }
        }
    };

    /* renamed from: com.qiyukf.nim.uikit.session.emoji.b$a */
    public static class C1980a {

        /* renamed from: a */
        public String f3880a;

        /* renamed from: b */
        public String f3881b;

        public C1980a(String str, String str2) {
            this.f3880a = str;
            this.f3881b = str2;
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.session.emoji.b$b */
    public static class C1981b extends DefaultHandler {

        /* renamed from: a */
        public String f3882a;

        public C1981b() {
            this.f3882a = "";
        }

        public /* synthetic */ C1981b(byte b) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) {
            if (str2.equals("Catalog")) {
                this.f3882a = attributes.getValue(str, "Title");
            } else if (str2.equals("Emoticon")) {
                String value = attributes.getValue(str, "Tag");
                String value2 = attributes.getValue(str, "File");
                C1980a aVar = new C1980a(value, "unicorn_emoji/" + this.f3882a + C8932ooOOO0o.OooO0OO + value2);
                C1978b.f3878c.put(aVar.f3880a, aVar);
                if (this.f3882a.equals(AccsClientConfig.DEFAULT_CONFIGTAG)) {
                    C1978b.f3877b.add(aVar);
                }
            }
        }
    }

    static {
        Context a = C1877b.m3578a();
        C1981b bVar = new C1981b((byte) 0);
        InputStream inputStream = null;
        try {
            inputStream = a.getAssets().open("unicorn_emoji/emoji.xml");
            Xml.parse(inputStream, Xml.Encoding.UTF_8, bVar);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            C1709a.m3015b("EntryLoader", "load is error assetPath" + "unicorn_emoji/emoji.xml", e2);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (SAXException e3) {
            C1709a.m3015b("EntryLoader", "load is error assetPath" + "unicorn_emoji/emoji.xml", e3);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final int m3911a() {
        return f3877b.size();
    }

    /* renamed from: a */
    public static final Drawable m3912a(Context context, int i) {
        String str = (i < 0 || i >= f3877b.size()) ? null : f3877b.get(i).f3880a;
        if (str == null) {
            return null;
        }
        return m3913a(context, str);
    }

    /* renamed from: a */
    public static final Drawable m3913a(Context context, String str) {
        C1980a aVar = f3878c.get(str);
        if (aVar == null) {
            return null;
        }
        Bitmap bitmap = f3879d.get(aVar.f3881b);
        if (bitmap == null) {
            bitmap = m3915b(context, aVar.f3881b);
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public static final String m3914a(int i) {
        if (i < 0 || i >= f3877b.size()) {
            return null;
        }
        return f3877b.get(i).f3880a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC, Splitter:B:21:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC, Splitter:B:29:0x006d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m3915b(android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.emoji.C1978b.m3915b(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public static final Pattern m3916b() {
        return f3876a;
    }
}
