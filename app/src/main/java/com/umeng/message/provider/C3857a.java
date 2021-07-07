package com.umeng.message.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;
import com.umeng.message.common.UmengMessageDeviceConfig;

/* renamed from: com.umeng.message.provider.a */
public class C3857a {

    /* renamed from: a */
    public static String f10476a;

    /* renamed from: b */
    public static Uri f10477b;

    /* renamed from: c */
    public static Uri f10478c;

    /* renamed from: d */
    public static Uri f10479d;

    /* renamed from: e */
    public static Uri f10480e;

    /* renamed from: f */
    public static Uri f10481f;

    /* renamed from: g */
    public static Uri f10482g;

    /* renamed from: h */
    public static Uri f10483h;

    /* renamed from: i */
    public static Uri f10484i;

    /* renamed from: j */
    public static Uri f10485j;

    /* renamed from: k */
    public static Uri f10486k;

    /* renamed from: l */
    public static Context f10487l;

    /* renamed from: m */
    public static C3857a f10488m;

    /* renamed from: n */
    public static String f10489n;

    /* renamed from: com.umeng.message.provider.a$a */
    public static class C3858a implements BaseColumns {

        /* renamed from: a */
        public static final String f10490a = "/MessageStores/";

        /* renamed from: b */
        public static final String f10491b = "/MsgTemps/";

        /* renamed from: c */
        public static final String f10492c = "/MsgAlias/";

        /* renamed from: d */
        public static final String f10493d = "/MsgAliasDeleteAll/";

        /* renamed from: e */
        public static final String f10494e = "/MsgLogStores/";

        /* renamed from: f */
        public static final String f10495f = "/MsgLogIdTypeStores/";

        /* renamed from: g */
        public static final String f10496g = "/MsgLogStoreForAgoos/";

        /* renamed from: h */
        public static final String f10497h = "/MsgLogIdTypeStoreForAgoos/";

        /* renamed from: i */
        public static final String f10498i = "/MsgConfigInfos/";

        /* renamed from: j */
        public static final String f10499j = "/InAppLogStores/";

        /* renamed from: k */
        public static final String f10500k = "vnd.android.cursor.dir/vnd.umeng.message";

        /* renamed from: l */
        public static final String f10501l = "vnd.android.cursor.item/vnd.umeng.message";

        /* renamed from: m */
        public static final String f10502m = "content://";
    }

    /* renamed from: a */
    public static C3857a m10616a(Context context) {
        f10487l = context;
        if (f10488m == null) {
            f10488m = new C3857a();
            f10489n = UmengMessageDeviceConfig.getPackageName(context);
            f10476a = f10489n + ".umeng.message";
            f10477b = Uri.parse("content://" + f10476a + C3858a.f10490a);
            f10478c = Uri.parse("content://" + f10476a + C3858a.f10491b);
            f10479d = Uri.parse("content://" + f10476a + C3858a.f10492c);
            f10480e = Uri.parse("content://" + f10476a + C3858a.f10493d);
            f10481f = Uri.parse("content://" + f10476a + C3858a.f10494e);
            f10482g = Uri.parse("content://" + f10476a + C3858a.f10495f);
            f10483h = Uri.parse("content://" + f10476a + C3858a.f10496g);
            f10484i = Uri.parse("content://" + f10476a + C3858a.f10497h);
            f10485j = Uri.parse("content://" + f10476a + C3858a.f10498i);
            f10486k = Uri.parse("content://" + f10476a + C3858a.f10499j);
        }
        return f10488m;
    }
}
