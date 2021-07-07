package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.alipay.sdk.protocol.EnumC0406a;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7447o0Oo;
import com.p118pd.sdk.C7476o0OoO;
import com.p118pd.sdk.C7477o0OoO0;
import com.p118pd.sdk.C7479o0OoO000;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.p118pd.sdk.C7485o0OoO0o0;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C7494o0OoOOOo;
import com.p118pd.sdk.C7510o0OoOoo;
import com.p118pd.sdk.C7512o0OoOooO;
import com.p118pd.sdk.C7513o0Ooo;
import com.p118pd.sdk.C7514o0Ooo0;
import com.p118pd.sdk.C7515o0Ooo00;
import com.p118pd.sdk.C7516o0Ooo000;
import com.p118pd.sdk.C7518o0Ooo00o;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C7528o0OooOoo;
import com.p118pd.sdk.C7531o0Oooo0o;
import com.p118pd.sdk.C7533o0OoooO0;
import com.p118pd.sdk.C7534o0OoooOO;
import com.p118pd.sdk.C7620o0oOOOoo;
import com.p118pd.sdk.C7722o0ooOOO0;
import com.p118pd.sdk.RunnableC7475o0Oo0ooo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class PayTask {
    public static long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f14765OooO00o = C7533o0OoooO0.class;
    public static final long OooO0O0 = 3000;
    public static long OooO0OO = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f14766OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7534o0OoooOO f14767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f14768OooO00o = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, OooO00o> f14769OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f14770OooO0O0 = "mclient.alipay.com/service/rest.htm";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f14771OooO0OO = "mclient.alipay.com/home/exterfaceAssign.htm";

    public class OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f14772OooO00o;
        public String OooO0O0;
        public String OooO0OO;
        public String OooO0Oo;

        public OooO00o() {
            this.f14772OooO00o = "";
            this.OooO0O0 = "";
            this.OooO0OO = "";
            this.OooO0Oo = "";
        }

        public String OooO00o() {
            return this.f14772OooO00o;
        }

        public String OooO0O0() {
            return this.OooO0OO;
        }

        public String OooO0OO() {
            return this.OooO0O0;
        }

        public String OooO0Oo() {
            return this.OooO0Oo;
        }

        public void OooO00o(String str) {
            this.f14772OooO00o = str;
        }

        public void OooO0O0(String str) {
            this.OooO0OO = str;
        }

        public void OooO0OO(String str) {
            this.OooO0O0 = str;
        }

        public void OooO0Oo(String str) {
            this.OooO0Oo = str;
        }

        public /* synthetic */ OooO00o(PayTask payTask, RunnableC7475o0Oo0ooo o0oo0ooo) {
            this();
        }
    }

    public PayTask(Activity activity) {
        this.f14766OooO00o = activity;
        C7515o0Ooo00.OooO00o().OooO00o(this.f14766OooO00o, C7476o0OoO.OooO00o());
        C7477o0OoO0.OooO00o(activity);
        this.f14767OooO00o = new C7534o0OoooOO(activity, C7534o0OoooOO.OooO0OO);
    }

    public static final String OooO00o(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    private String OooO0O0(String str) {
        showLoading();
        EnumC0405k kVar = null;
        try {
            JSONObject OooO00o2 = new C7510o0OoOoo().OooO00o(this.f14766OooO00o.getApplicationContext(), str).m19120OooO00o();
            String optString = OooO00o2.optString("end_code", null);
            List<C7512o0OoOooO> OooO00o3 = C7512o0OoOooO.OooO00o(OooO00o2.optJSONObject(C7485o0OoO0o0.OooO0OO).optJSONObject(C7485o0OoO0o0.OooO0Oo));
            for (int i = 0; i < OooO00o3.size(); i++) {
                if (OooO00o3.get(i).OooO00o() == EnumC0406a.Update) {
                    C7512o0OoOooO.OooO00o(OooO00o3.get(i));
                }
            }
            OooO00o(OooO00o2);
            dismissLoading();
            for (int i2 = 0; i2 < OooO00o3.size(); i2++) {
                C7512o0OoOooO o0oooooo = OooO00o3.get(i2);
                if (o0oooooo.OooO00o() == EnumC0406a.WapPay) {
                    String OooO00o4 = OooO00o(o0oooooo);
                    dismissLoading();
                    return OooO00o4;
                } else if (o0oooooo.OooO00o() == EnumC0406a.OpenWeb) {
                    String OooO00o5 = OooO00o(o0oooooo, optString);
                    dismissLoading();
                    return OooO00o5;
                }
            }
        } catch (IOException e) {
            kVar = EnumC0405k.m832b(EnumC0405k.NETWORK_ERROR.mo4240a());
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, e);
        } catch (Throwable th) {
            dismissLoading();
            throw th;
        }
        dismissLoading();
        if (kVar == null) {
            kVar = EnumC0405k.m832b(EnumC0405k.FAILED.mo4240a());
        }
        return C7479o0OoO000.OooO00o(kVar.mo4240a(), kVar.mo4243b(), "");
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                C7515o0Ooo00.OooO00o().OooO00o(context, C7476o0OoO.OooO00o());
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - OooO00o < ((long) C7486o0OoO0oO.OooO00o().m19115OooO0O0())) {
                    return false;
                }
                OooO00o = elapsedRealtime;
                C7486o0OoO0oO.OooO00o().OooO00o(context.getApplicationContext());
                return true;
            } catch (Exception e) {
                C7620o0oOOOoo.m19257OooO00o((Throwable) e);
                return false;
            }
        }
    }

    public void dismissLoading() {
        C7534o0OoooOO o0oooooo = this.f14767OooO00o;
        if (o0oooooo != null) {
            o0oooooo.OooO0O0();
            this.f14767OooO00o = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00dc, code lost:
        if (r9.startsWith("http://" + r17.f14770OooO0O0) != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0179, code lost:
        if (r9.startsWith("http://" + r17.f14771OooO0OO) != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r9.startsWith("http://" + r17.f14768OooO00o) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 1228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public synchronized String fetchTradeToken() {
        return C7522o0Ooo0o.OooO00o(this.f14766OooO00o.getApplicationContext());
    }

    public String getVersion() {
        return "15.6.8";
    }

    public synchronized C7514o0Ooo0 h5Pay(String str, boolean z) {
        C7514o0Ooo0 o0ooo0;
        o0ooo0 = new C7514o0Ooo0();
        try {
            String[] split = pay(str, z).split(C7522o0Ooo0o.OooO0O0);
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                int indexOf = str2.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str2.substring(0, indexOf);
                    hashMap.put(substring, OooO00o(str2, substring));
                }
            }
            if (hashMap.containsKey(C7513o0Ooo.OooO00o)) {
                o0ooo0.OooO00o(hashMap.get(C7513o0Ooo.OooO00o));
            }
            o0ooo0.OooO0O0(OooO00o(str, hashMap));
            if (TextUtils.isEmpty(o0ooo0.OooO0O0())) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooooO0, "");
            }
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooooOO, th);
            C7620o0oOOOoo.m19257OooO00o(th);
        }
        return o0ooo0;
    }

    /* JADX INFO: finally extract failed */
    public synchronized String pay(String str, boolean z) {
        String str2;
        if (m14976OooO00o()) {
            return C7479o0OoO000.OooO0OO();
        }
        if (z) {
            showLoading();
        }
        if (str.contains("payment_inst=")) {
            String substring = str.substring(str.indexOf("payment_inst=") + 13);
            int indexOf = substring.indexOf(38);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            C7528o0OooOoo.OooO00o(substring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            C7528o0OooOoo.OooO00o("");
        }
        if (str.contains(C7722o0ooOOO0.OooOOo)) {
            C7722o0ooOOO0.f20700OooO00o = true;
        }
        if (C7722o0ooOOO0.f20700OooO00o) {
            if (str.startsWith(C7722o0ooOOO0.OooOOoo)) {
                str = str.substring(str.indexOf(C7722o0ooOOO0.OooOOoo) + 53);
            } else if (str.startsWith(C7722o0ooOOO0.OooOo00)) {
                str = str.substring(str.indexOf(C7722o0ooOOO0.OooOo00) + 52);
            }
        }
        try {
            str2 = OooO00o(str);
            C7522o0Ooo0o.OooO00o(this.f14766OooO00o.getApplicationContext(), str2);
            C7486o0OoO0oO.OooO00o().OooO00o(this.f14766OooO00o.getApplicationContext());
            dismissLoading();
            C7477o0OoO0.OooO0O0(this.f14766OooO00o.getApplicationContext(), str);
        } catch (Throwable th) {
            C7486o0OoO0oO.OooO00o().OooO00o(this.f14766OooO00o.getApplicationContext());
            dismissLoading();
            C7477o0OoO0.OooO0O0(this.f14766OooO00o.getApplicationContext(), str);
            throw th;
        }
        return str2;
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            new Thread(new RunnableC7475o0Oo0ooo(this, fetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        return C7513o0Ooo.OooO00o(pay(str, z));
    }

    public void showLoading() {
        C7534o0OoooOO o0oooooo = this.f14767OooO00o;
        if (o0oooooo != null) {
            o0oooooo.m19201OooO00o();
        }
    }

    private boolean OooO00o(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            if (z2) {
                return false;
            }
            return true;
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
    }

    private String OooO00o(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String str2;
        String str3;
        boolean equals = "9000".equals(map.get(C7513o0Ooo.OooO00o));
        String str4 = map.get("result");
        OooO00o remove = this.f14769OooO00o.remove(str);
        String[] strArr = new String[2];
        if (remove != null) {
            str2 = remove.OooO0O0();
        } else {
            str2 = "";
        }
        strArr[0] = str2;
        if (remove != null) {
            str3 = remove.OooO0Oo();
        } else {
            str3 = "";
        }
        strArr[1] = str3;
        OooO00o(strArr);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str4.length() > 15) {
            String OooO00o2 = OooO00o(C7531o0Oooo0o.OooO00o("&callBackUrl=\"", "\"", str4), C7531o0Oooo0o.OooO00o("&call_back_url=\"", "\"", str4), C7531o0Oooo0o.OooO00o(C7722o0ooOOO0.OooOOOo, "\"", str4), URLDecoder.decode(C7531o0Oooo0o.OooO00o(C7722o0ooOOO0.OooOOo0, "&", str4), "utf-8"), URLDecoder.decode(C7531o0Oooo0o.OooO00o("&callBackUrl=", "&", str4), "utf-8"), C7531o0Oooo0o.OooO00o("call_back_url=\"", "\"", str4));
            if (!TextUtils.isEmpty(OooO00o2)) {
                return OooO00o2;
            }
        }
        if (remove != null) {
            String OooO00o3 = equals ? remove.OooO00o() : remove.OooO0OO();
            if (!TextUtils.isEmpty(OooO00o3)) {
                return OooO00o3;
            }
        }
        if (remove != null) {
            return C7486o0OoO0oO.OooO00o().m19112OooO00o();
        }
        return "";
    }

    private String OooO00o(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(C7522o0Ooo0o.OooO0Oo));
    }

    private C7533o0OoooO0.OooO00o OooO00o() {
        return new C7447o0Oo(this);
    }

    private String OooO00o(String str) {
        String OooO00o2 = new C7516o0Ooo000(this.f14766OooO00o).m19159OooO00o(str);
        if (OooO00o2.contains("paymethod=\"expressGateway\"")) {
            return OooO0O0(OooO00o2);
        }
        List<C7486o0OoO0oO.OooO00o> OooO00o3 = C7486o0OoO0oO.OooO00o().m19113OooO00o();
        if (!C7486o0OoO0oO.OooO00o().f20323OooO0OO || OooO00o3 == null) {
            OooO00o3 = C7528o0OooOoo.f20379OooO00o;
        }
        if (C7531o0Oooo0o.m19197OooO00o((Context) this.f14766OooO00o, OooO00o3)) {
            C7533o0OoooO0 o0ooooo0 = new C7533o0OoooO0(this.f14766OooO00o, OooO00o());
            String OooO00o4 = o0ooooo0.OooO00o(OooO00o2);
            o0ooooo0.OooO00o();
            if (TextUtils.equals(OooO00o4, C7533o0OoooO0.OooO0O0) || TextUtils.equals(OooO00o4, C7533o0OoooO0.OooO0OO)) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOo0, "");
                return OooO0O0(OooO00o2);
            } else if (TextUtils.isEmpty(OooO00o4)) {
                return C7479o0OoO000.OooO0O0();
            } else {
                if (!OooO00o4.contains(PayResultActivity.o0ooOOo)) {
                    return OooO00o4;
                }
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOoo, "");
                return OooO00o(OooO00o2, OooO00o3, OooO00o4, this.f14766OooO00o);
            }
        } else {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOoO, "");
            return OooO0O0(OooO00o2);
        }
    }

    public static String OooO00o(String str, List<C7486o0OoO0oO.OooO00o> list, String str2, Activity activity) {
        C7531o0Oooo0o.OooO00o OooO00o2 = C7531o0Oooo0o.OooO00o((Context) activity, list);
        if (OooO00o2 == null || OooO00o2.OooO00o() || OooO00o2.OooO0O0() || !TextUtils.equals(OooO00o2.f20383OooO00o.packageName, PayResultActivity.o0ooOoO)) {
            return str2;
        }
        C7620o0oOOOoo.OooO0O0(C7494o0OoOOOo.OooO00o, "PayTask:payResult: NOT_LOGIN");
        String valueOf = String.valueOf(str.hashCode());
        PayResultActivity.OooO00o.put(valueOf, new Object());
        Intent intent = new Intent(activity, PayResultActivity.class);
        intent.putExtra(PayResultActivity.o0Oo0oo, str);
        intent.putExtra(PayResultActivity.o0OO00O, activity.getPackageName());
        intent.putExtra(PayResultActivity.o0OOO0o, valueOf);
        activity.startActivity(intent);
        synchronized (PayResultActivity.OooO00o.get(valueOf)) {
            try {
                C7620o0oOOOoo.OooO0O0(C7494o0OoOOOo.OooO00o, "PayTask:payResult: wait");
                PayResultActivity.OooO00o.get(valueOf).wait();
            } catch (InterruptedException e) {
                C7620o0oOOOoo.OooO0O0(C7494o0OoOOOo.OooO00o, "PayTask:payResult: InterruptedException:" + e);
                return C7479o0OoO000.OooO0O0();
            }
        }
        String str3 = PayResultActivity.OooO00o.OooO0O0;
        C7620o0oOOOoo.OooO0O0(C7494o0OoOOOo.OooO00o, "PayTask:payResult: result:" + str3);
        return str3;
    }

    private void OooO00o(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString(C7518o0Ooo00o.OooO);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                C7518o0Ooo00o.OooO00o(C7515o0Ooo00.OooO00o().m19156OooO00o()).OooO00o(optString, optString2);
            }
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooO0, th);
        }
    }

    private String OooO00o(C7512o0OoOooO o0oooooo, String str) {
        boolean OooO00o2;
        String OooO00o3;
        String[] OooO00o4 = o0oooooo.m19154OooO00o();
        Intent intent = new Intent(this.f14766OooO00o, H5PayActivity.class);
        try {
            JSONObject OooO00o5 = C7531o0Oooo0o.m19195OooO00o(new String(C7490o0OoOO0o.OooO00o(OooO00o4[2])));
            intent.putExtra("url", OooO00o4[0]);
            intent.putExtra("title", OooO00o4[1]);
            intent.putExtra("version", DefaultDiskStorage.DEFAULT_DISK_STORAGE_VERSION_PREFIX);
            intent.putExtra(AbstractC7726o0ooOOoo.OooOOo0, OooO00o5.optString(AbstractC7726o0ooOOoo.OooOOo0, "POST"));
            C7479o0OoO000.OooO00o(false);
            C7479o0OoO000.OooO00o((String) null);
            this.f14766OooO00o.startActivity(intent);
            synchronized (f14765OooO00o) {
                try {
                    f14765OooO00o.wait();
                    OooO00o2 = C7479o0OoO000.m19107OooO00o();
                    OooO00o3 = C7479o0OoO000.OooO00o();
                    C7479o0OoO000.OooO00o(false);
                    C7479o0OoO000.OooO00o((String) null);
                } catch (InterruptedException e) {
                    C7620o0oOOOoo.m19257OooO00o((Throwable) e);
                    return C7479o0OoO000.OooO0O0();
                }
            }
            String str2 = "";
            if (OooO00o2) {
                try {
                    List<C7512o0OoOooO> OooO00o6 = C7512o0OoOooO.OooO00o(C7531o0Oooo0o.m19195OooO00o(new String(C7490o0OoOO0o.OooO00o(OooO00o3))));
                    int i = 0;
                    while (true) {
                        if (i >= OooO00o6.size()) {
                            break;
                        }
                        C7512o0OoOooO o0oooooo2 = OooO00o6.get(i);
                        if (o0oooooo2.OooO00o() == EnumC0406a.SetResult) {
                            String[] OooO00o7 = o0oooooo2.m19154OooO00o();
                            str2 = C7479o0OoO000.OooO00o(Integer.valueOf(OooO00o7[1]).intValue(), OooO00o7[0], C7531o0Oooo0o.OooO0O0(OooO00o7[2]));
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    C7620o0oOOOoo.m19257OooO00o(th);
                    C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOooo, th, OooO00o3);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            try {
                return C7479o0OoO000.OooO00o(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOooo, th2, "endCode: " + str);
                return C7479o0OoO000.OooO00o(8000, "", "");
            }
        } catch (Throwable th3) {
            C7620o0oOOOoo.m19257OooO00o(th3);
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOooo, th3, Arrays.toString(OooO00o4));
            return C7479o0OoO000.OooO0O0();
        }
    }

    private String OooO00o(C7512o0OoOooO o0oooooo) {
        String[] OooO00o2 = o0oooooo.m19154OooO00o();
        Intent intent = new Intent(this.f14766OooO00o, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", OooO00o2[0]);
        if (OooO00o2.length == 2) {
            bundle.putString("cookie", OooO00o2[1]);
        }
        intent.putExtras(bundle);
        this.f14766OooO00o.startActivity(intent);
        synchronized (f14765OooO00o) {
            try {
                f14765OooO00o.wait();
            } catch (InterruptedException e) {
                C7620o0oOOOoo.m19257OooO00o((Throwable) e);
                return C7479o0OoO000.OooO0O0();
            }
        }
        String OooO00o3 = C7479o0OoO000.OooO00o();
        return TextUtils.isEmpty(OooO00o3) ? C7479o0OoO000.OooO0O0() : OooO00o3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14976OooO00o() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - OooO0OO < 3000) {
            return true;
        }
        OooO0OO = elapsedRealtime;
        return false;
    }
}
