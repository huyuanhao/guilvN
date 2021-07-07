package anet.channel.p009e;

import anet.channel.util.ALog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* renamed from: anet.channel.e.a */
public class C0130a implements ALog.ILog {
    /* renamed from: a */
    private int m74a(char c) {
        if (c == 'D') {
            return 1;
        }
        if (c == 'E') {
            return 4;
        }
        if (c == 'I') {
            return 2;
        }
        if (c != 'V') {
            return c != 'W' ? 5 : 3;
        }
        return 0;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo3462d(String str, String str2) {
        AdapterForTLog.logd(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo3463e(String str, String str2) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo3465i(String str, String str2) {
        AdapterForTLog.logi(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i) {
        return i >= m74a(AdapterForTLog.getLogLevel().charAt(0));
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo3469w(String str, String str2) {
        AdapterForTLog.logw(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo3464e(String str, String str2, Throwable th) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo3470w(String str, String str2, Throwable th) {
        AdapterForTLog.logw(str, str2, th);
    }
}
