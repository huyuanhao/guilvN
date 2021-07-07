package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p019a.C0381a;
import com.alipay.apmobilesecuritysdk.p020b.C0382a;
import com.alipay.apmobilesecuritysdk.p023e.C0391a;
import com.alipay.apmobilesecuritysdk.p023e.C0394d;
import com.alipay.apmobilesecuritysdk.p023e.C0397g;
import com.alipay.apmobilesecuritysdk.p023e.C0398h;
import com.alipay.apmobilesecuritysdk.p023e.C0399i;
import com.alipay.apmobilesecuritysdk.p024f.C0401b;
import com.p118pd.sdk.C7559o0o00OOo;
import java.util.HashMap;
import java.util.Map;

public class APSecuritySdk {

    /* renamed from: a */
    public static APSecuritySdk f895a;

    /* renamed from: c */
    public static Object f896c = new Object();

    /* renamed from: b */
    public Context f897b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f897b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f895a == null) {
            synchronized (f896c) {
                if (f895a == null) {
                    f895a = new APSecuritySdk(context);
                }
            }
        }
        return f895a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public String getApdidToken() {
        String a = C0381a.m732a(this.f897b, "");
        if (C7559o0o00OOo.m19210OooO00o(a)) {
            initToken(0, new HashMap(), null);
        }
        return a;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.201910161639";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = C0381a.m732a(this.f897b, "");
            tokenResult.clientKey = C0398h.m800f(this.f897b);
            tokenResult.apdid = C0381a.m731a(this.f897b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f897b);
            if (C7559o0o00OOo.m19210OooO00o(tokenResult.apdid) || C7559o0o00OOo.m19210OooO00o(tokenResult.apdidToken) || C7559o0o00OOo.m19210OooO00o(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        C0382a.m738a().mo4185a(i);
        String b = C0398h.m792b(this.f897b);
        String c = C0382a.m738a().mo4187c();
        if (C7559o0o00OOo.m19212OooO0O0(b) && !C7559o0o00OOo.m19211OooO00o(b, c)) {
            C0391a.m760a(this.f897b);
            C0394d.m767a(this.f897b);
            C0397g.m785a(this.f897b);
            C0399i.m821h();
        }
        if (!C7559o0o00OOo.m19211OooO00o(b, c)) {
            C0398h.m794c(this.f897b, c);
        }
        String OooO00o = C7559o0o00OOo.OooO00o(map, "utdid", "");
        String OooO00o2 = C7559o0o00OOo.OooO00o(map, "tid", "");
        String OooO00o3 = C7559o0o00OOo.OooO00o(map, "userId", "");
        if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
            OooO00o = UtdidWrapper.getUtdid(this.f897b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", OooO00o);
        hashMap.put("tid", OooO00o2);
        hashMap.put("userId", OooO00o3);
        hashMap.put(DispatchConstants.APP_NAME, "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "8");
        C0401b.m826a().mo4198a(new Runnable() {
            /* class com.alipay.apmobilesecuritysdk.face.APSecuritySdk.RunnableC04031 */

            public void run() {
                new C0381a(APSecuritySdk.this.f897b).mo4184a(hashMap);
                InitResultListener initResultListener = initResultListener;
                if (initResultListener != null) {
                    initResultListener.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }
}
