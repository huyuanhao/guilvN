package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p019a.C0381a;
import com.alipay.apmobilesecuritysdk.p024f.C0401b;
import com.p118pd.sdk.C7559o0o00OOo;
import java.util.HashMap;

public class TMNTokenClient {

    /* renamed from: a */
    public static TMNTokenClient f902a;

    /* renamed from: b */
    public Context f903b = null;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public TMNTokenClient(Context context) {
        if (context != null) {
            this.f903b = context;
            return;
        }
        throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f902a == null) {
            synchronized (TMNTokenClient.class) {
                if (f902a == null) {
                    f902a = new TMNTokenClient(context);
                }
            }
        }
        return f902a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (C7559o0o00OOo.m19210OooO00o(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (C7559o0o00OOo.m19210OooO00o(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", UtdidWrapper.getUtdid(this.f903b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put(DispatchConstants.APP_NAME, str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put("rpcVersion", "8");
        C0401b.m826a().mo4198a(new Runnable() {
            /* class com.alipay.apmobilesecuritysdk.face.TMNTokenClient.RunnableC04041 */

            public void run() {
                int a = new C0381a(TMNTokenClient.this.f903b).mo4184a(hashMap);
                InitResultListener initResultListener = initResultListener;
                if (initResultListener != null) {
                    if (a == 0) {
                        initResultListener.onResult(C0381a.m732a(TMNTokenClient.this.f903b, str), 0);
                        return;
                    }
                    initResultListener.onResult("", a);
                }
            }
        });
    }
}
