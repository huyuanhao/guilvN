package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.entity.C0131a;
import anet.channel.entity.ConnType;
import anet.channel.request.C0155b;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0209c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import anet.channel.util.C0228h;
import anet.channel.util.C0230j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.Utils;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.session.d */
public class C0166d extends Session {

    /* renamed from: w */
    public SSLSocketFactory f287w;

    public C0166d(Context context, C0131a aVar) {
        super(context, aVar);
        if (this.f48k == null) {
            String str = this.f40c;
            this.f47j = (str == null || !str.startsWith("https")) ? ConnType.HTTP : ConnType.HTTPS;
        } else if (AwcnConfig.isHttpsSniEnable() && this.f47j.equals(ConnType.HTTPS)) {
            this.f287w = new C0230j(this.f41d);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f40c).setSeq(this.f53p).setConnectTimeout((int) (((float) this.f55r) * Utils.getNetworkTimeFactor())).setReadTimeout((int) (((float) this.f56s) * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            if (this.f287w != null) {
                redirectEnable.setSslSocketFactory(this.f287w);
            }
            if (this.f50m) {
                redirectEnable.addHeader(HttpConstant.HOST, this.f42e);
            }
            if (C0223c.m314a() && C0209c.m281a(this.f42e)) {
                try {
                    this.f43f = C0223c.m312a(this.f42e);
                } catch (Exception unused) {
                }
            }
            ALog.m290i("awcn.HttpSession", "HttpSession connect", null, "host", this.f40c, "ip", this.f43f, "port", Integer.valueOf(this.f44g));
            Request build = redirectEnable.build();
            build.setDnsOptimize(this.f43f, this.f44g);
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0167e(this, build), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.m288e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f51n == 4;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        C0155b bVar = C0155b.NULL;
        Request.Builder builder = null;
        RequestStatistic requestStatistic = request != null ? request.f219a : new RequestStatistic(this.f41d, null);
        requestStatistic.setConnType(this.f47j);
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return bVar;
        }
        try {
            if (request.getSslSocketFactory() == null && this.f287w != null) {
                builder = request.newBuilder().setSslSocketFactory(this.f287w);
            }
            if (this.f50m) {
                if (builder == null) {
                    builder = request.newBuilder();
                }
                builder.addHeader(HttpConstant.HOST, this.f42e);
            }
            if (builder != null) {
                request = builder.build();
            }
            if (this.f43f == null) {
                String host = request.getHttpUrl().host();
                if (C0223c.m314a() && C0209c.m281a(host)) {
                    try {
                        this.f43f = C0223c.m312a(host);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.f43f, this.f44g);
            request.setUrlScheme(this.f47j.isSSL());
            if (this.f48k != null) {
                request.f219a.setIpInfo(this.f48k.getIpSource(), this.f48k.getIpType());
            } else {
                request.f219a.setIpInfo(1, 1);
            }
            request.f219a.unit = this.f49l;
            return new C0155b(ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0168f(this, request, requestCb, requestStatistic), C0228h.m329a(request)), request.getSeq());
        } catch (Throwable th) {
            if (requestCb == null) {
                return bVar;
            }
            requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th.toString()), requestStatistic);
            return bVar;
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z) {
        this.f57t = false;
        close();
    }
}
