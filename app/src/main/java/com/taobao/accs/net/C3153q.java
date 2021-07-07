package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.taobao.accs.net.C3145j;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.accs.net.q */
public class C3153q implements RequestCb {

    /* renamed from: a */
    public final /* synthetic */ IAuth.AuthCallback f7070a;

    /* renamed from: b */
    public final /* synthetic */ C3145j.C3146a f7071b;

    public C3153q(C3145j.C3146a aVar, IAuth.AuthCallback authCallback) {
        this.f7071b = aVar;
        this.f7070a = authCallback;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (i < 0) {
            ALog.m7599e(this.f7071b.f7053c, "auth onFinish", "statusCode", Integer.valueOf(i));
            this.f7070a.onAuthFail(i, "onFinish auth fail");
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        ALog.m7599e(this.f7071b.f7053c, "auth", "httpStatusCode", Integer.valueOf(i));
        if (i == 200) {
            this.f7070a.onAuthSuccess();
            if (this.f7071b.f7054d instanceof C3145j) {
                ((C3145j) this.f7071b.f7054d).m7518n();
            }
        } else {
            this.f7070a.onAuthFail(i, "auth fail");
        }
        Map<String, String> a = UtilityImpl.m7613a(map);
        ALog.m7597d(this.f7071b.f7053c, "auth", "header", a);
        String str = a.get("x-at");
        if (!TextUtils.isEmpty(str)) {
            this.f7071b.f7054d.f7019k = str;
        }
    }
}
