package com.huawei.hms.support.api.push.p041a.p042a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C8413oOoo0o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;

/* renamed from: com.huawei.hms.support.api.push.a.a.a */
public class C1173a {

    /* renamed from: a */
    public static final String[] f1228a = {"phone", "url", "email", "app", "cosa", "rp"};

    /* renamed from: b */
    public Context f1229b;

    /* renamed from: c */
    public C1174a f1230c;

    public C1173a(Context context, C1174a aVar) {
        this.f1229b = context;
        this.f1230c = aVar;
    }

    /* renamed from: a */
    public static boolean m1167a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f1228a;
            if (i >= strArr.length) {
                return false;
            }
            if (strArr[i].equals(str)) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m1169b() {
        C1202a.m1316a("PushSelfShowLog", "enter launchCall");
        try {
            Intent intent = new Intent();
            Intent action = intent.setAction("android.intent.action.DIAL");
            action.setData(Uri.parse("tel:" + this.f1230c.mo15676o())).setFlags(CommonNetImpl.FLAG_AUTH);
            this.f1229b.startActivity(intent);
        } catch (Exception e) {
            C1202a.m1317a("PushSelfShowLog", e.toString(), e);
        }
    }

    /* renamed from: c */
    private void m1170c() {
        C1202a.m1316a("PushSelfShowLog", "enter launchMail");
        try {
            if (this.f1230c.mo15677p() != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SENDTO").setFlags(CommonNetImpl.FLAG_AUTH).setData(Uri.fromParts("mailto", this.f1230c.mo15677p(), null)).putExtra("android.intent.extra.SUBJECT", this.f1230c.mo15678q()).putExtra("android.intent.extra.TEXT", this.f1230c.mo15679r()).setPackage("com.android.email");
                this.f1229b.startActivity(intent);
            }
        } catch (Exception e) {
            C1202a.m1317a("PushSelfShowLog", e.toString(), e);
        }
    }

    /* renamed from: d */
    private void m1171d() {
        try {
            C1202a.m1318b("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f1230c.mo15680s() + ",and msg.intentUri is " + this.f1230c.mo15668g());
            if (C1184a.m1250c(this.f1229b, this.f1230c.mo15680s())) {
                m1174g();
                return;
            }
            C1202a.m1318b("PushSelfShowLog", "enter launch app, appPackageName =" + this.f1230c.mo15680s() + ",and msg.intentUri is " + this.f1230c.mo15668g());
            m1172e();
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }

    /* renamed from: e */
    private void m1172e() {
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f1230c.mo15668g())) {
                sb.append("&referrer=");
                sb.append(Uri.encode(m1168b(this.f1230c.mo15668g())));
            }
            String str = "market://details?id=" + this.f1230c.mo15680s() + ((Object) sb);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage(C8413oOoo0o.f21545OooO0O0);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str));
            intent2.setPackage("com.android.vending");
            if (C1184a.m1238a(this.f1229b, "com.android.vending", intent2).booleanValue()) {
                intent2.setFlags(402653184);
                C1202a.m1318b("PushSelfShowLog", "open google play store's app detail, IntentUrl is:" + intent2.toURI());
                this.f1229b.startActivity(intent2);
            } else if (C1184a.m1238a(this.f1229b, C8413oOoo0o.f21545OooO0O0, intent).booleanValue()) {
                intent.setFlags(402653184);
                C1202a.m1318b("PushSelfShowLog", "open HiApp's app detail, IntentUrl is:" + intent.toURI());
                this.f1229b.startActivity(intent);
            } else {
                C1202a.m1318b("PushSelfShowLog", "open app detail by browser.");
                m1173f();
            }
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", "open market app detail failed,exception:" + e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        com.huawei.hms.support.log.C1202a.m1318b("PushSelfShowLog", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1173f() {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.api.push.p041a.p042a.C1173a.m1173f():void");
    }

    /* renamed from: g */
    private void m1174g() {
        C1202a.m1318b("PushSelfShowLog", "run into launchCosaApp ");
        try {
            C1202a.m1318b("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f1230c.mo15680s() + ",and msg.intentUri is " + this.f1230c.mo15668g());
            Intent b = C1184a.m1245b(this.f1229b, this.f1230c.mo15680s());
            boolean z = false;
            if (this.f1230c.mo15668g() != null) {
                try {
                    Intent parseUri = Intent.parseUri(this.f1230c.mo15668g(), 0);
                    C1202a.m1318b("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0)," + parseUri.toURI());
                    z = C1184a.m1238a(this.f1229b, this.f1230c.mo15680s(), parseUri).booleanValue();
                    if (z) {
                        b = parseUri;
                    }
                } catch (RuntimeException unused) {
                    C1202a.m1319c("PushSelfShowLog", "intentUri error");
                } catch (Exception unused2) {
                    C1202a.m1319c("PushSelfShowLog", "intentUri error");
                }
            } else {
                if (this.f1230c.mo15681t() != null) {
                    Intent intent = new Intent(this.f1230c.mo15681t());
                    if (C1184a.m1238a(this.f1229b, this.f1230c.mo15680s(), intent).booleanValue()) {
                        b = intent;
                    }
                }
                b.setPackage(this.f1230c.mo15680s());
            }
            if (b == null) {
                C1202a.m1318b("PushSelfShowLog", "launchCosaApp,intent == null");
            } else if (!C1184a.m1244a(this.f1229b, b)) {
                C1202a.m1319c("PushSelfShowLog", "no permission to start Activity");
            } else {
                if (z) {
                    b.addFlags(CommonNetImpl.FLAG_AUTH);
                } else {
                    b.setFlags(805437440);
                }
                C1202a.m1318b("PushSelfShowLog", "start " + b.toURI());
                this.f1229b.startActivity(b);
            }
        } catch (RuntimeException unused3) {
            C1202a.m1320d("PushSelfShowLog", "launch Cosa App exception");
        } catch (Exception unused4) {
            C1202a.m1320d("PushSelfShowLog", "launch Cosa App exception");
        }
    }

    /* renamed from: a */
    public void mo15661a() {
        C1174a aVar;
        C1202a.m1316a("PushSelfShowLog", "enter launchNotify()");
        if (this.f1229b == null || (aVar = this.f1230c) == null) {
            C1202a.m1316a("PushSelfShowLog", "launchNotify  context or msg is null");
        } else if ("app".equals(aVar.mo15672k())) {
            m1171d();
        } else if ("cosa".equals(this.f1230c.mo15672k())) {
            m1174g();
        } else if ("email".equals(this.f1230c.mo15672k())) {
            m1170c();
        } else if ("phone".equals(this.f1230c.mo15672k())) {
            m1169b();
        } else if ("rp".equals(this.f1230c.mo15672k())) {
            C1202a.m1319c("PushSelfShowLog", this.f1230c.mo15672k() + " not support rich message.");
        } else if ("url".equals(this.f1230c.mo15672k())) {
            C1202a.m1319c("PushSelfShowLog", this.f1230c.mo15672k() + " not support URL.");
        } else {
            C1202a.m1316a("PushSelfShowLog", this.f1230c.mo15672k() + " is not exist in hShowType");
        }
    }

    /* renamed from: b */
    private String m1168b(String str) {
        try {
            int indexOf = str.indexOf(63);
            if (indexOf == -1) {
                return str;
            }
            int i = indexOf + 1;
            String[] split = str.substring(i).split("&");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (!str2.startsWith("h_w_hiapp_referrer") && !str2.startsWith("h_w_gp_referrer")) {
                    arrayList.add(str2);
                }
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((String) arrayList.get(i2));
                if (i2 < arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            String substring = arrayList.size() == 0 ? str.substring(0, indexOf) : str.substring(0, i) + sb.toString();
            C1202a.m1316a("PushSelfShowLog", "after delete referrer, the new IntentUri is:" + substring);
            return substring;
        } catch (RuntimeException unused) {
            C1202a.m1320d("PushSelfShowLog", "self show receiver exception");
            return str;
        } catch (Exception unused2) {
            C1202a.m1320d("PushSelfShowLog", "delete referrer exception");
            return str;
        }
    }
}
