package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.p118pd.sdk.C8912ooOO0o0;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.providers.C4568a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.gz */
public class C4473gz {

    /* renamed from: a */
    public static volatile int f12121a = -1;

    /* renamed from: a */
    public static long f12122a = System.currentTimeMillis();

    /* renamed from: a */
    public static C4256al f12123a = new C4256al(true);

    /* renamed from: a */
    public static C4568a f12124a = null;

    /* renamed from: a */
    public static final Object f12125a = new Object();

    /* renamed from: a */
    public static String f12126a = "";

    /* renamed from: a */
    public static List<C4474a> f12127a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.xiaomi.push.gz$a */
    public static class C4474a {

        /* renamed from: a */
        public int f12128a = -1;

        /* renamed from: a */
        public long f12129a = 0;

        /* renamed from: a */
        public String f12130a = "";

        /* renamed from: b */
        public int f12131b = -1;

        /* renamed from: b */
        public long f12132b = 0;

        /* renamed from: b */
        public String f12133b = "";

        public C4474a(String str, long j, int i, int i2, String str2, long j2) {
            this.f12130a = str;
            this.f12129a = j;
            this.f12128a = i;
            this.f12131b = i2;
            this.f12133b = str2;
            this.f12132b = j2;
        }

        /* renamed from: a */
        public boolean mo41988a(C4474a aVar) {
            return TextUtils.equals(aVar.f12130a, this.f12130a) && TextUtils.equals(aVar.f12133b, this.f12133b) && aVar.f12128a == this.f12128a && aVar.f12131b == this.f12131b && Math.abs(aVar.f12129a - this.f12129a) <= WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS;
        }
    }

    /* renamed from: a */
    public static int m12839a(Context context) {
        if (f12121a == -1) {
            f12121a = m12852b(context);
        }
        return f12121a;
    }

    /* renamed from: a */
    public static int m12840a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* renamed from: a */
    public static long m12841a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f12122a;
            f12122a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    /* renamed from: a */
    public static C4568a m12842a(Context context) {
        C4568a aVar = f12124a;
        if (aVar != null) {
            return aVar;
        }
        C4568a aVar2 = new C4568a(context);
        f12124a = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public static synchronized String m12844a(Context context) {
        synchronized (C4473gz.class) {
            if (TextUtils.isEmpty(f12126a)) {
                return "";
            }
            return f12126a;
        }
    }

    /* renamed from: a */
    public static void m12846a(Context context) {
        f12121a = m12852b(context);
    }

    /* renamed from: a */
    public static void m12847a(Context context, String str, long j, boolean z, long j2) {
        int a;
        boolean isEmpty;
        if (context != null && !TextUtils.isEmpty(str) && MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName()) && !MiPushRegistar.PACKAGE_XIAOMI.equals(str) && -1 != (a = m12839a(context))) {
            synchronized (f12125a) {
                isEmpty = f12127a.isEmpty();
                m12850a(new C4474a(str, j2, a, z ? 1 : 0, a == 0 ? m12844a(context) : "", j));
            }
            if (isEmpty) {
                f12123a.mo41484a(new C4476ha(context), WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
            }
        }
    }

    /* renamed from: a */
    public static void m12848a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        m12847a(context, str, m12841a(m12839a(context), j, z, j2, z2), z, j2);
    }

    /* renamed from: a */
    public static void m12850a(C4474a aVar) {
        for (C4474a aVar2 : f12127a) {
            if (aVar2.mo41988a(aVar)) {
                aVar2.f12132b += aVar.f12132b;
                return;
            }
        }
        f12127a.add(aVar);
    }

    /* renamed from: a */
    public static synchronized void m12851a(String str) {
        synchronized (C4473gz.class) {
            if (!C4563l.m13731d() && !TextUtils.isEmpty(str)) {
                f12126a = str;
            }
        }
    }

    /* renamed from: b */
    public static int m12852b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m12853b(Context context, List<C4474a> list) {
        try {
            synchronized (C4568a.f13064a) {
                SQLiteDatabase writableDatabase = m12842a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C4474a aVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", aVar.f12130a);
                        contentValues.put("message_ts", Long.valueOf(aVar.f12129a));
                        contentValues.put(C8912ooOO0o0.OooOo00, Integer.valueOf(aVar.f12128a));
                        contentValues.put("bytes", Long.valueOf(aVar.f12132b));
                        contentValues.put("rcv", Integer.valueOf(aVar.f12131b));
                        contentValues.put(Constants.KEY_IMSI, aVar.f12133b);
                        writableDatabase.insert(C3416b.f8421E, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLiteException e) {
            AbstractC4163b.m11303a(e);
        }
    }
}
