package com.tencent.p269mm.opensdk.diffdev.p271a;

import android.os.AsyncTask;
import com.p118pd.sdk.C8713oo0o0o;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.p269mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p269mm.opensdk.diffdev.OAuthListener;
import com.tencent.p269mm.opensdk.utils.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.f */
public final class AsyncTaskC3383f extends AsyncTask<Void, Void, C3384a> {

    /* renamed from: k */
    public OAuthListener f8332k;

    /* renamed from: n */
    public String f8333n;

    /* renamed from: t */
    public int f8334t;
    public String url;

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.f$a */
    public static class C3384a {

        /* renamed from: m */
        public OAuthErrCode f8335m;

        /* renamed from: u */
        public String f8336u;

        /* renamed from: v */
        public int f8337v;

        /* renamed from: b */
        public static C3384a m8644b(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String format;
            OAuthErrCode oAuthErrCode2;
            C3384a aVar = new C3384a();
            if (bArr == null || bArr.length == 0) {
                Log.m8651e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("wx_errcode");
                        aVar.f8337v = i;
                        Log.m8650d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i)));
                        int i2 = aVar.f8337v;
                        if (i2 == 408) {
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                        } else if (i2 != 500) {
                            switch (i2) {
                                case TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    break;
                                case TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    break;
                                case 404:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                                    break;
                                case C8713oo0o0o.OooO0o:
                                    aVar.f8335m = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f8336u = jSONObject.getString("wx_code");
                                    break;
                                default:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    break;
                            }
                            return aVar;
                        } else {
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        aVar.f8335m = oAuthErrCode2;
                        return aVar;
                    } catch (Exception e) {
                        format = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.m8651e("MicroMsg.SDK.NoopingResult", format);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f8335m = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    format = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                    Log.m8651e("MicroMsg.SDK.NoopingResult", format);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f8335m = oAuthErrCode;
                    return aVar;
                }
            }
            aVar.f8335m = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC3383f(String str, OAuthListener oAuthListener) {
        this.f8333n = str;
        this.f8332k = oAuthListener;
        this.url = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ C3384a doInBackground(Void[] voidArr) {
        C3384a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str2 = this.f8333n;
        if (str2 == null || str2.length() == 0) {
            Log.m8651e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new C3384a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.f8334t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.f8334t;
                }
                sb.append(str);
                String sb2 = sb.toString();
                long currentTimeMillis = System.currentTimeMillis();
                byte[] a = C3382e.m8643a(sb2);
                long currentTimeMillis2 = System.currentTimeMillis();
                C3384a b = C3384a.m8644b(a);
                Log.m8650d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", sb2, b.f8335m.toString(), Integer.valueOf(b.f8337v), Long.valueOf(currentTimeMillis2 - currentTimeMillis)));
                OAuthErrCode oAuthErrCode2 = b.f8335m;
                if (oAuthErrCode2 == OAuthErrCode.WechatAuth_Err_OK) {
                    int i = b.f8337v;
                    this.f8334t = i;
                    if (i == EnumC3385g.UUID_SCANED.getCode()) {
                        this.f8332k.onQrcodeScanned();
                    } else if (b.f8337v != EnumC3385g.UUID_KEEP_CONNECT.getCode() && b.f8337v == EnumC3385g.UUID_CONFIRM.getCode()) {
                        String str3 = b.f8336u;
                        if (str3 == null || str3.length() == 0) {
                            Log.m8651e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            b.f8335m = OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        return b;
                    }
                } else {
                    Log.m8651e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), Integer.valueOf(b.f8337v)));
                    return b;
                }
            }
            Log.m8652i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new C3384a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.f8335m = oAuthErrCode;
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(C3384a aVar) {
        C3384a aVar2 = aVar;
        this.f8332k.onAuthFinish(aVar2.f8335m, aVar2.f8336u);
    }
}
