package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;

/* renamed from: com.xiaomi.push.df */
public abstract class AbstractC4348df {

    /* renamed from: com.xiaomi.push.df$a */
    public static class C4349a extends AbstractC4347de {
        public C4349a() {
            super(1);
        }

        @Override // com.xiaomi.push.AbstractC4347de, com.xiaomi.push.AbstractC4347de
        /* renamed from: a */
        public String mo41654a(Context context, String str, List<AbstractC4273ay> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (AbstractC4273ay ayVar : list) {
                    buildUpon.appendQueryParameter(ayVar.mo41499a(), ayVar.mo41500b());
                }
                url = new URL(buildUpon.toString());
            }
            return C4274az.m11727a(context, url);
        }
    }

    /* renamed from: a */
    public static int m12064a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + 1080 + i + i2;
    }

    /* renamed from: a */
    public static int m12065a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    /* renamed from: a */
    public static int m12066a(AbstractC4347de deVar, String str, List<AbstractC4273ay> list, String str2) {
        if (deVar.mo41653a() == 1) {
            return m12064a(str.length(), m12067a(str2));
        }
        if (deVar.mo41653a() != 2) {
            return -1;
        }
        return m12065a(str.length(), m12068a(list), m12067a(str2));
    }

    /* renamed from: a */
    public static int m12067a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m12068a(List<AbstractC4273ay> list) {
        int i = 0;
        for (AbstractC4273ay ayVar : list) {
            if (!TextUtils.isEmpty(ayVar.mo41499a())) {
                i += ayVar.mo41499a().length();
            }
            if (!TextUtils.isEmpty(ayVar.mo41500b())) {
                i += ayVar.mo41500b().length();
            }
        }
        return i * 2;
    }

    /* renamed from: a */
    public static String m12069a(Context context, String str, List<AbstractC4273ay> list) {
        return m12070a(context, str, list, new C4349a(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12070a(android.content.Context r20, java.lang.String r21, java.util.List<com.xiaomi.push.AbstractC4273ay> r22, com.xiaomi.push.AbstractC4347de r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.AbstractC4348df.m12070a(android.content.Context, java.lang.String, java.util.List, com.xiaomi.push.de, boolean):java.lang.String");
    }
}
