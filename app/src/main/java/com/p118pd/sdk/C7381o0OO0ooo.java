package com.p118pd.sdk;

import android.support.p000v4.media.session.PlaybackStateCompat;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.monitor.C0147b;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import com.p118pd.sdk.C7446o0OOoooO;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.o0OO0ooo  reason: case insensitive filesystem */
public class C7381o0OO0ooo implements RequestCb {
    public final /* synthetic */ Request OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ RequestStatistic f20143OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7446o0OOoooO f20144OooO00o;

    public C7381o0OO0ooo(C7446o0OOoooO o0oooooo, Request request, RequestStatistic requestStatistic) {
        this.f20144OooO00o = o0oooooo;
        this.OooO00o = request;
        this.f20143OooO00o = requestStatistic;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
        if (!this.f20144OooO00o.f20281OooO00o.get()) {
            C7446o0OOoooO o0oooooo = this.f20144OooO00o;
            if (o0oooooo.o0ooOO0 == 0) {
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "[onDataReceive] receive first data chunk!", o0oooooo.f20278OooO00o.f20100OooO00o, new Object[0]);
            }
            if (z) {
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "[onDataReceive] receive last data chunk!", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, new Object[0]);
            }
            C7446o0OOoooO o0oooooo2 = this.f20144OooO00o;
            int i = o0oooooo2.o0ooOO0 + 1;
            o0oooooo2.o0ooOO0 = i;
            try {
                if (o0oooooo2.f20279OooO00o != null) {
                    o0oooooo2.f20279OooO00o.f20283OooO00o.add(byteArray);
                    if (this.f20143OooO00o.recDataSize > PlaybackStateCompat.ACTION_PREPARE_FROM_URI || z) {
                        this.f20144OooO00o.o0ooOO0 = this.f20144OooO00o.f20279OooO00o.OooO00o(this.f20144OooO00o.f20278OooO00o.OooO00o, this.f20144OooO00o.o00oO0O);
                        this.f20144OooO00o.OooO0OO = true;
                        this.f20144OooO00o.OooO0Oo = this.f20144OooO00o.o0ooOO0 > 1;
                        this.f20144OooO00o.f20279OooO00o = null;
                    }
                } else {
                    o0oooooo2.f20278OooO00o.OooO00o.OooO00o(i, o0oooooo2.o00oO0O, byteArray);
                    this.f20144OooO00o.OooO0Oo = true;
                }
                if (this.f20144OooO00o.f20280OooO00o != null) {
                    this.f20144OooO00o.f20280OooO00o.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                    if (z) {
                        String OooO00o2 = this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19129OooO00o();
                        this.f20144OooO00o.f20276OooO00o.data = this.f20144OooO00o.f20280OooO00o.toByteArray();
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f20144OooO00o.f20277OooO00o.put(OooO00o2, this.f20144OooO00o.f20276OooO00o);
                        ALog.m290i(C7446o0OOoooO.o0ooOoO, "write cache", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), FileAttachment.KEY_SIZE, Integer.valueOf(this.f20144OooO00o.f20276OooO00o.data.length), "key", OooO00o2);
                    }
                }
            } catch (Exception e) {
                ALog.m291w(C7446o0OOoooO.o0ooOoO, "[onDataReceive] error.", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, e, new Object[0]);
            }
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        String str2;
        DefaultFinishEvent defaultFinishEvent;
        String str3;
        int i2 = i;
        if (!this.f20144OooO00o.f20281OooO00o.getAndSet(true)) {
            int i3 = 3;
            if (ALog.isPrintLog(2)) {
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "[onFinish]", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, "code", Integer.valueOf(i), "msg", str);
            }
            if (i2 < 0) {
                try {
                    if (this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19134OooO0O0()) {
                        if (this.f20144OooO00o.OooO0OO || this.f20144OooO00o.OooO0Oo) {
                            requestStatistic.msg += ":回调后触发重试";
                            if (this.f20144OooO00o.OooO0Oo) {
                                requestStatistic.roaming = 2;
                            } else if (this.f20144OooO00o.OooO0OO) {
                                requestStatistic.roaming = 1;
                            }
                            ALog.m289e(C7446o0OOoooO.o0ooOoO, "Cannot retry request after onHeader/onDataReceived callback!", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, new Object[0]);
                        } else {
                            ALog.m289e(C7446o0OOoooO.o0ooOoO, "clear response buffer and retry", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, new Object[0]);
                            if (this.f20144OooO00o.f20279OooO00o != null) {
                                if (!this.f20144OooO00o.f20279OooO00o.f20283OooO00o.isEmpty()) {
                                    i3 = 4;
                                }
                                requestStatistic.roaming = i3;
                                this.f20144OooO00o.f20279OooO00o.OooO00o();
                                this.f20144OooO00o.f20279OooO00o = null;
                            }
                            this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19131OooO00o();
                            this.f20144OooO00o.f20278OooO00o.f20102OooO00o = new AtomicBoolean();
                            this.f20144OooO00o.f20278OooO00o.f20098OooO00o = new C7446o0OOoooO(this.f20144OooO00o.f20278OooO00o, this.f20144OooO00o.f20277OooO00o, this.f20144OooO00o.f20276OooO00o);
                            if (requestStatistic.tnetErrorCode != 0) {
                                str3 = i2 + "|" + requestStatistic.tnetErrorCode;
                                requestStatistic.tnetErrorCode = 0;
                            } else {
                                str3 = String.valueOf(i);
                            }
                            requestStatistic.appendErrorTrace(str3);
                            long currentTimeMillis = System.currentTimeMillis();
                            requestStatistic.retryCostTime += currentTimeMillis - requestStatistic.start;
                            requestStatistic.start = currentTimeMillis;
                            ThreadPoolExecutorFactory.submitPriorityTask(this.f20144OooO00o.f20278OooO00o.f20098OooO00o, ThreadPoolExecutorFactory.Priority.HIGH);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.f20144OooO00o.f20279OooO00o != null) {
                this.f20144OooO00o.f20279OooO00o.OooO00o(this.f20144OooO00o.f20278OooO00o.OooO00o, this.f20144OooO00o.o00oO0O);
            }
            this.f20144OooO00o.f20278OooO00o.OooO00o();
            requestStatistic.isDone.set(true);
            if ("wv_h5".equals(this.f20144OooO00o.f20282o0ooOOo)) {
                ALog.m289e(C7446o0OOoooO.o0ooOoO, null, this.f20144OooO00o.f20278OooO00o.f20100OooO00o, "url", this.OooO00o.getHttpUrl().simpleUrlString(), "content-length", Integer.valueOf(this.f20144OooO00o.o00oO0O), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
            }
            if (!this.f20144OooO00o.f20278OooO00o.f20099OooO00o.OooO0o0() || requestStatistic.contentLength == 0 || requestStatistic.contentLength == requestStatistic.rspBodyDeflateSize) {
                str2 = str;
            } else {
                requestStatistic.ret = 0;
                requestStatistic.statusCode = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
                String errMsg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH);
                requestStatistic.msg = errMsg;
                ALog.m289e(C7446o0OOoooO.o0ooOoO, "received data length not match with content-length", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, "content-length", Integer.valueOf(this.f20144OooO00o.o00oO0O), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
                ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH, errMsg, "rt");
                exceptionStatistic.url = this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19129OooO00o();
                AppMonitor.getInstance().commitStat(exceptionStatistic);
                str2 = errMsg;
                i2 = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
            }
            if (i2 != 304 || this.f20144OooO00o.f20276OooO00o == null) {
                defaultFinishEvent = new DefaultFinishEvent(i2, str2, requestStatistic);
            } else {
                requestStatistic.protocolType = "cache";
                defaultFinishEvent = new DefaultFinishEvent(200, str2, requestStatistic);
            }
            this.f20144OooO00o.f20278OooO00o.OooO00o.OooO00o(defaultFinishEvent);
            if (i2 >= 0) {
                C0147b.m101a().mo3510a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize);
            } else {
                requestStatistic.netType = NetworkStatusHelper.getNetworkSubType();
            }
            NetworkAnalysis.getInstance().commitFlow(new FlowStat(this.f20144OooO00o.f20282o0ooOOo, requestStatistic));
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        String singleHeaderFieldByKey;
        if (!this.f20144OooO00o.f20281OooO00o.get()) {
            if (ALog.isPrintLog(2)) {
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "onResponseCode", this.OooO00o.getSeq(), "code", Integer.valueOf(i));
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "onResponseCode", this.OooO00o.getSeq(), "headers", map);
            }
            if (HttpHelper.checkRedirect(this.OooO00o, i) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location")) != null) {
                HttpUrl parse = HttpUrl.parse(singleHeaderFieldByKey);
                if (parse == null) {
                    ALog.m289e(C7446o0OOoooO.o0ooOoO, "redirect url is invalid!", this.OooO00o.getSeq(), "redirect url", singleHeaderFieldByKey);
                } else if (this.f20144OooO00o.f20281OooO00o.compareAndSet(false, true)) {
                    parse.lockScheme();
                    this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19132OooO00o(parse);
                    this.f20144OooO00o.f20278OooO00o.f20102OooO00o = new AtomicBoolean();
                    C7360o0OO o0oo = this.f20144OooO00o.f20278OooO00o;
                    o0oo.f20098OooO00o = new C7446o0OOoooO(o0oo, null, null);
                    this.f20143OooO00o.recordRedirect(i, parse.simpleUrlString());
                    ThreadPoolExecutorFactory.submitPriorityTask(this.f20144OooO00o.f20278OooO00o.f20098OooO00o, ThreadPoolExecutorFactory.Priority.HIGH);
                    return;
                } else {
                    return;
                }
            }
            try {
                this.f20144OooO00o.f20278OooO00o.OooO00o();
                C7354o0O0ooO0.OooO00o(this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19129OooO00o(), map);
                this.f20144OooO00o.o00oO0O = HttpHelper.parseContentLength(map);
                String OooO00o2 = this.f20144OooO00o.f20278OooO00o.f20099OooO00o.m19129OooO00o();
                if (this.f20144OooO00o.f20276OooO00o == null || i != 304) {
                    if (this.f20144OooO00o.f20277OooO00o != null) {
                        if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control"))) {
                            this.f20144OooO00o.f20277OooO00o.remove(OooO00o2);
                        } else {
                            C7446o0OOoooO o0oooooo = this.f20144OooO00o;
                            Cache.Entry OooO00o3 = C7347o0O0oOoo.OooO00o(map);
                            o0oooooo.f20276OooO00o = OooO00o3;
                            if (OooO00o3 != null) {
                                HttpHelper.removeHeaderFiledByKey(map, "Cache-Control");
                                map.put("Cache-Control", Arrays.asList("no-store"));
                                this.f20144OooO00o.f20280OooO00o = new ByteArrayOutputStream(this.f20144OooO00o.o00oO0O != 0 ? this.f20144OooO00o.o00oO0O : 5120);
                            }
                        }
                    }
                    map.put(HttpConstant.X_PROTOCOL, Arrays.asList(this.f20143OooO00o.protocolType));
                    if (!C7348o0O0oo.OooO0oo() || this.f20144OooO00o.o00oO0O > 131072) {
                        this.f20144OooO00o.f20278OooO00o.OooO00o.onResponseCode(i, map);
                        this.f20144OooO00o.OooO0OO = true;
                        return;
                    }
                    this.f20144OooO00o.f20279OooO00o = new C7446o0OOoooO.OooO00o(i, map);
                    return;
                }
                this.f20144OooO00o.f20276OooO00o.responseHeaders.putAll(map);
                Cache.Entry OooO00o4 = C7347o0O0oOoo.OooO00o(map);
                if (OooO00o4 != null && OooO00o4.ttl > this.f20144OooO00o.f20276OooO00o.ttl) {
                    this.f20144OooO00o.f20276OooO00o.ttl = OooO00o4.ttl;
                }
                this.f20144OooO00o.f20278OooO00o.OooO00o.onResponseCode(200, this.f20144OooO00o.f20276OooO00o.responseHeaders);
                this.f20144OooO00o.f20278OooO00o.OooO00o.OooO00o(1, this.f20144OooO00o.f20276OooO00o.data.length, ByteArray.wrap(this.f20144OooO00o.f20276OooO00o.data));
                long currentTimeMillis = System.currentTimeMillis();
                this.f20144OooO00o.f20277OooO00o.put(OooO00o2, this.f20144OooO00o.f20276OooO00o);
                ALog.m290i(C7446o0OOoooO.o0ooOoO, "update cache", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "key", OooO00o2);
            } catch (Exception e) {
                ALog.m291w(C7446o0OOoooO.o0ooOoO, "[onResponseCode] error.", this.f20144OooO00o.f20278OooO00o.f20100OooO00o, e, new Object[0]);
            }
        }
    }
}
