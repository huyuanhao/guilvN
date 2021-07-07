package com.umeng.socialize.net.dplus.cache;

import android.content.Context;
import android.os.Handler;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class CacheApi {

    /* renamed from: a */
    public static String f10823a = "CacheApi";

    /* renamed from: e */
    public static CacheApi f10824e;

    /* renamed from: b */
    public Handler f10825b;

    /* renamed from: c */
    public CacheExector f10826c = new CacheExector(m10828a());

    /* renamed from: d */
    public Context f10827d;

    public CacheApi(Context context) {
        this.f10827d = context;
    }

    /* renamed from: a */
    private String m10828a() {
        Context context = this.f10827d;
        if (context == null) {
            return null;
        }
        return context.getFilesDir().getPath();
    }

    public static CacheApi get(Context context) {
        if (f10824e == null) {
            f10824e = new CacheApi(context);
        }
        return f10824e;
    }

    public double checkSize(String str) {
        CacheExector cacheExector = this.f10826c;
        if (cacheExector == null) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        return cacheExector.checkSize(str);
    }

    public boolean delete(String str) {
        CacheExector cacheExector = this.f10826c;
        if (cacheExector == null) {
            return false;
        }
        return cacheExector.deleteFile(str);
    }

    public IReader read(String str, Class cls) {
        CacheExector cacheExector = this.f10826c;
        if (cacheExector == null) {
            return null;
        }
        return cacheExector.readFile(str, cls);
    }

    public boolean save(String str, String str2) {
        CacheExector cacheExector = this.f10826c;
        if (cacheExector == null) {
            return false;
        }
        return cacheExector.save(str, str2);
    }
}
