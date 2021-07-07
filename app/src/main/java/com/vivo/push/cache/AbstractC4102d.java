package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8027oOO00oo;
import com.vivo.push.util.C4138h;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4155y;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.vivo.push.cache.d */
public abstract class AbstractC4102d<T> {

    /* renamed from: a */
    public static final byte[] f11002a = {34, 32, PublicSuffixDatabase.EXCEPTION_MARKER, C8027oOO00oo.OooO0OO, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 32, PublicSuffixDatabase.EXCEPTION_MARKER, PublicSuffixDatabase.EXCEPTION_MARKER, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 41, 35, 32, 32, 32};

    /* renamed from: b */
    public static final byte[] f11003b = {PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, 32, 38, C8027oOO00oo.OooO0OO, 36, 35, 34, PublicSuffixDatabase.EXCEPTION_MARKER};

    /* renamed from: c */
    public static final Object f11004c = new Object();

    /* renamed from: d */
    public List<T> f11005d = new ArrayList();

    /* renamed from: e */
    public Context f11006e;

    public AbstractC4102d(Context context) {
        this.f11006e = context.getApplicationContext();
        mo41002c();
    }

    /* renamed from: a */
    public abstract String mo40985a();

    /* renamed from: a */
    public abstract List<T> mo40986a(String str);

    /* renamed from: b */
    public abstract String mo40988b(String str) throws Exception;

    /* renamed from: c */
    public final void mo41002c() {
        synchronized (f11004c) {
            C4138h.m11169a(mo40985a());
            this.f11005d.clear();
            String a = C4155y.m11251b(this.f11006e).mo41187a(mo40985a(), null);
            if (TextUtils.isEmpty(a)) {
                C4146p.m11216d("CacheSettings", "ClientManager init " + mo40985a() + " strApps empty.");
            } else if (a.length() > 10000) {
                C4146p.m11216d("CacheSettings", "sync " + mo40985a() + " strApps lenght too large");
                mo41003d();
            } else {
                try {
                    C4146p.m11216d("CacheSettings", "ClientManager init " + mo40985a() + " strApps : " + a);
                    List<T> a2 = mo40986a(mo40988b(a));
                    if (a2 != null) {
                        this.f11005d.addAll(a2);
                    }
                } catch (Exception e) {
                    mo41003d();
                    C4146p.m11216d("CacheSettings", C4146p.m11207a(e));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo41003d() {
        synchronized (f11004c) {
            this.f11005d.clear();
            C4155y.m11251b(this.f11006e).mo41189b(mo40985a(), "");
            C4146p.m11216d("CacheSettings", "clear " + mo40985a() + " strApps");
        }
    }
}
