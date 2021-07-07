package com.p118pd.sdk;

import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;

/* renamed from: com.pd.sdk.o0OO0o  reason: case insensitive filesystem */
public class C7371o0OO0o implements AbstractRunnableC7374o0OO0o0O {
    public Cache OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7360o0OO f20128OooO00o = null;
    public volatile boolean OooO0O0 = false;

    public C7371o0OO0o(C7360o0OO o0oo, Cache cache) {
        this.f20128OooO00o = o0oo;
        this.OooO00o = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.OooO0O0 = true;
        this.f20128OooO00o.f20099OooO00o.f20340OooO00o.ret = 2;
    }

    public void run() {
        Cache.Entry entry;
        boolean z;
        if (!this.OooO0O0) {
            C7503o0OoOoO o0ooooo = this.f20128OooO00o.f20099OooO00o;
            RequestStatistic requestStatistic = o0ooooo.f20340OooO00o;
            if (this.OooO00o != null) {
                String OooO00o2 = o0ooooo.m19129OooO00o();
                String str = this.f20128OooO00o.f20099OooO00o.m19127OooO00o().getHeaders().get("Cache-Control");
                boolean equals = "no-store".equals(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (equals) {
                    this.OooO00o.remove(OooO00o2);
                    z = false;
                    entry = null;
                } else {
                    z = "no-cache".equals(str);
                    entry = this.OooO00o.get(OooO00o2);
                    if (ALog.isPrintLog(2)) {
                        String str2 = this.f20128OooO00o.f20100OooO00o;
                        Object[] objArr = new Object[8];
                        objArr[0] = "hit";
                        objArr[1] = Boolean.valueOf(entry != null);
                        objArr[2] = "cost";
                        objArr[3] = Long.valueOf(requestStatistic.cacheTime);
                        objArr[4] = "length";
                        objArr[5] = Integer.valueOf(entry != null ? entry.data.length : 0);
                        objArr[6] = "key";
                        objArr[7] = OooO00o2;
                        ALog.m290i("anet.CacheTask", "read cache", str2, objArr);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.cacheTime = currentTimeMillis2 - currentTimeMillis;
                if (entry == null || z || !entry.isFresh()) {
                    if (!this.OooO0O0) {
                        C7446o0OOoooO o0oooooo = new C7446o0OOoooO(this.f20128OooO00o, equals ? null : this.OooO00o, entry);
                        this.f20128OooO00o.f20098OooO00o = o0oooooo;
                        o0oooooo.run();
                    }
                } else if (this.f20128OooO00o.f20102OooO00o.compareAndSet(false, true)) {
                    this.f20128OooO00o.OooO00o();
                    requestStatistic.ret = 1;
                    requestStatistic.statusCode = 200;
                    requestStatistic.msg = "SUCCESS";
                    requestStatistic.protocolType = "cache";
                    requestStatistic.rspEnd = currentTimeMillis2;
                    requestStatistic.processTime = currentTimeMillis2 - requestStatistic.start;
                    if (ALog.isPrintLog(2)) {
                        C7360o0OO o0oo = this.f20128OooO00o;
                        ALog.m290i("anet.CacheTask", "hit fresh cache", o0oo.f20100OooO00o, "URL", o0oo.f20099OooO00o.m19128OooO00o().urlString());
                    }
                    this.f20128OooO00o.OooO00o.onResponseCode(200, entry.responseHeaders);
                    AbstractC7369o0OO0O0 o0oo0o0 = this.f20128OooO00o.OooO00o;
                    byte[] bArr = entry.data;
                    o0oo0o0.OooO00o(1, bArr.length, ByteArray.wrap(bArr));
                    this.f20128OooO00o.OooO00o.OooO00o(new DefaultFinishEvent(200, "SUCCESS", requestStatistic));
                }
            }
        }
    }
}
