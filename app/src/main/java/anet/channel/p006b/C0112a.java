package anet.channel.p006b;

import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;

/* renamed from: anet.channel.b.a */
public class C0112a implements Cache {

    /* renamed from: a */
    public static boolean f111a = false;

    /* renamed from: b */
    public static Object f112b;

    /* renamed from: c */
    public static Object f113c;

    /* renamed from: d */
    public static Object f114d;

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f112b = new C0113b();
            f113c = new C0114c();
            f114d = new C0115d();
        } catch (ClassNotFoundException unused) {
            ALog.m292w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    /* renamed from: b */
    private IAVFSCache m49b() {
        AVFSCache cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (cacheForModule != null) {
            return cacheForModule.getFileCache();
        }
        return null;
    }

    /* renamed from: a */
    public void mo3417a() {
        AVFSCache cacheForModule;
        if (f111a && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = 1048576;
            cacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        if (f111a) {
            try {
                IAVFSCache b = m49b();
                if (b != null) {
                    b.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f114d);
                }
            } catch (Exception e) {
                ALog.m288e("anet.AVFSCacheImpl", "clear cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        if (!f111a) {
            return null;
        }
        try {
            IAVFSCache b = m49b();
            if (b != null) {
                return (Cache.Entry) b.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e) {
            ALog.m288e("anet.AVFSCacheImpl", "get cache failed", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        if (f111a) {
            try {
                IAVFSCache b = m49b();
                if (b != null) {
                    b.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f112b);
                }
            } catch (Exception e) {
                ALog.m288e("anet.AVFSCacheImpl", "put cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        if (f111a) {
            try {
                IAVFSCache b = m49b();
                if (b != null) {
                    b.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f113c);
                }
            } catch (Exception e) {
                ALog.m288e("anet.AVFSCacheImpl", "remove cache failed", null, e, new Object[0]);
            }
        }
    }
}
