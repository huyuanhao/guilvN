package com.tencent.p269mm.opensdk.diffdev.p271a;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import com.tencent.p269mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p269mm.opensdk.diffdev.OAuthListener;
import com.tencent.p269mm.opensdk.utils.Log;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import com.umeng.socialize.handler.UMWXHandler;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.d */
public final class AsyncTaskC3380d extends AsyncTask<Void, Void, C3381a> {

    /* renamed from: h */
    public static String f8320h = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    public String appId;

    /* renamed from: i */
    public String f8321i;

    /* renamed from: j */
    public String f8322j;

    /* renamed from: k */
    public OAuthListener f8323k;

    /* renamed from: l */
    public AsyncTaskC3383f f8324l;
    public String scope;
    public String signature;

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.d$a */
    public static class C3381a {

        /* renamed from: m */
        public OAuthErrCode f8325m;

        /* renamed from: n */
        public String f8326n;

        /* renamed from: o */
        public String f8327o;

        /* renamed from: p */
        public String f8328p;

        /* renamed from: q */
        public int f8329q;

        /* renamed from: r */
        public String f8330r;

        /* renamed from: s */
        public byte[] f8331s;

        /* renamed from: a */
        public static C3381a m8642a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String format;
            C3381a aVar = new C3381a();
            if (bArr == null || bArr.length == 0) {
                Log.m8651e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt(UMWXHandler.ERRORCODE);
                        if (i != 0) {
                            Log.m8651e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f8325m = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f8329q = i;
                            aVar.f8330r = jSONObject.optString(UMWXHandler.ERRMSG);
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null) {
                            if (string.length() != 0) {
                                byte[] decode = Base64.decode(string, 0);
                                if (decode != null) {
                                    if (decode.length != 0) {
                                        aVar.f8325m = OAuthErrCode.WechatAuth_Err_OK;
                                        aVar.f8331s = decode;
                                        aVar.f8326n = jSONObject.getString(C3692t.f9678a);
                                        String string2 = jSONObject.getString("appname");
                                        aVar.f8327o = string2;
                                        Log.m8650d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f8326n, string2, Integer.valueOf(aVar.f8331s.length)));
                                        return aVar;
                                    }
                                }
                                Log.m8651e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                                aVar.f8325m = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                                return aVar;
                            }
                        }
                        Log.m8651e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f8325m = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        format = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.m8651e("MicroMsg.SDK.GetQRCodeResult", format);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f8325m = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    format = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                    Log.m8651e("MicroMsg.SDK.GetQRCodeResult", format);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f8325m = oAuthErrCode;
                    return aVar;
                }
            }
            aVar.f8325m = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC3380d(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.appId = str;
        this.scope = str2;
        this.f8321i = str3;
        this.f8322j = str4;
        this.signature = str5;
        this.f8323k = oAuthListener;
    }

    /* renamed from: a */
    public final boolean mo38549a() {
        Log.m8652i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC3383f fVar = this.f8324l;
        return fVar == null ? cancel(true) : fVar.cancel(true);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ C3381a doInBackground(Void[] voidArr) {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m8652i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String format = String.format(f8320h, this.appId, this.f8321i, this.f8322j, this.scope, this.signature);
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a = C3382e.m8643a(format);
        Log.m8650d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", format, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        return C3381a.m8642a(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(C3381a aVar) {
        C3381a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f8325m;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            Log.m8650d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success");
            this.f8323k.onAuthGotQrcode(aVar2.f8328p, aVar2.f8331s);
            AsyncTaskC3383f fVar = new AsyncTaskC3383f(aVar2.f8326n, this.f8323k);
            this.f8324l = fVar;
            if (Build.VERSION.SDK_INT >= 11) {
                fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                fVar.execute(new Void[0]);
            }
        } else {
            Log.m8651e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f8323k.onAuthFinish(aVar2.f8325m, null);
        }
    }
}
