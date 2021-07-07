package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOoOoOo  reason: case insensitive filesystem */
public class C8379oOoOoOo implements AbstractC8387oOoOoooO {
    public static final String OooO = "push_click";
    public static final int OooO00o = 1012;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f21489OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f21490OooO00o = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    public static final int OooO0O0 = 23;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f21491OooO0O0 = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    public static final int OooO0OO = 59;
    public static final int OooO0Oo = 24;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21492OooO0Oo = "push_register";
    public static int OooO0o = 0;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f21493OooO0o = "push_show";
    public static final int OooO0o0 = 1000;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f21494OooO0o0 = "push_transmit";
    public static final String OooO0oO = "push_no_show";
    public static final String OooO0oo = "push_read_message";
    public static final String OooOO0 = "app_black_list";
    public static final String OooOO0O = "push_exception";
    public static final String OooOO0o = "push_delete";
    public static final String OooOOO = "push_revoke_delete";
    public static final String OooOOO0 = "push_revoke";
    public static final String OooOOOO = "add_message_top";
    public static final String OooOOOo = "add_message_no_disturbing";
    public static final String OooOOo = "message_repeat";
    public static final String OooOOo0 = "imsi_not_exist";
    public static final String OooOOoo = "com.mcs.action.RECEIVE_SDK_MESSAGE";
    public static final String OooOo = "extra";
    public static final String OooOo0 = "eventID";
    public static final String OooOo00 = "type";
    public static final String OooOo0O = "taskID";
    public static final String OooOo0o = "appPackage";
    public static final String OooOoO = "messageID";
    public static final String OooOoO0 = "messageType";
    public static final String OooOoOO = "globalID";
    public static final String OooOoo = "versionName";
    public static final String OooOoo0 = "supportOpenPush";
    public static final String OooOooO = "versionCode";
    public static final String OooOooo = "pushSdkVersion";
    public static String Oooo000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21495OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8394oOoo000O f21496OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f21497OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21498OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC8382oOoOoo> f21499OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f21500OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<AbstractC8384oOoOoo00> f21501OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f21502OooO0OO;

    public C8379oOoOoOo() {
        this.f21497OooO00o = new Object();
        this.f21499OooO00o = new ArrayList();
        this.f21501OooO0O0 = new ArrayList();
        this.f21502OooO0OO = null;
        synchronized (C8379oOoOoOo.class) {
            if (OooO0o <= 0) {
                OooO0o++;
            } else {
                throw new RuntimeException("PushManager can't create again!");
            }
        }
        OooO00o(new C8381oOoOoOoo());
        OooO00o(new C8383oOoOoo0());
        OooO00o(new C8934ooOOO0oO());
        OooO00o(new C8466oOooo0O0());
        OooO00o(new C8484oOooooo0());
        OooO00o(new C8386oOoOoo0o());
    }

    public /* synthetic */ C8379oOoOoOo(ServiceConnectionC8395oOoo000o oooo000o) {
        this();
    }

    private Intent OooO00o(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(OooO0OO(this.f21495OooO00o));
        intent.setPackage(OooO00o(this.f21495OooO00o));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt(OooOoo, C8415oOoo0o0.m20082OooO00o(this.f21495OooO00o, this.f21495OooO00o.getPackageName()));
            jSONObject2.putOpt(OooOooO, Integer.valueOf(C8415oOoo0o0.OooO00o(this.f21495OooO00o, this.f21495OooO00o.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.f21495OooO00o.getPackageName());
        intent.putExtra("appKey", this.f21498OooO00o);
        intent.putExtra(C8400oOoo00oO.f21511Oooo00o, this.f21500OooO0O0);
        intent.putExtra(C8400oOoo00oO.f21508Oooo0, this.f21502OooO0OO);
        intent.putExtra("sdkVersion", OooO0OO());
        return intent;
    }

    public static C8379oOoOoOo OooO00o() {
        return C8391oOoo00.OooO00o();
    }

    public static String OooO00o(Context context) {
        boolean z;
        if (Oooo000 == null) {
            String OooO0O02 = OooO0O0(context);
            if (OooO0O02 == null) {
                Oooo000 = C8415oOoo0o0.OooO00o(f21490OooO00o);
                z = false;
            } else {
                Oooo000 = OooO0O02;
                z = true;
            }
            f21489OooO00o = z;
        }
        return Oooo000;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20051OooO00o(int i, String str, JSONObject jSONObject) {
        synchronized (this.f21497OooO00o) {
            this.f21495OooO00o.startService(OooO00o(i, str, jSONObject));
        }
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20052OooO00o(Context context) {
        OooO00o(context, new C8404oOoo0O00(context.getPackageName(), "app_start", null));
    }

    public static void OooO00o(Context context, C8399oOoo00o0 oooo00o0, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(OooO0OO(context));
            intent.setPackage(OooO00o(context));
            intent.putExtra("type", 12291);
            intent.putExtra("taskID", oooo00o0.m20078OooO0O0());
            intent.putExtra("appPackage", oooo00o0.m20077OooO00o());
            intent.putExtra("messageID", String.valueOf(oooo00o0.OooO00o()));
            intent.putExtra("globalID", String.valueOf(oooo00o0.OooO00o()));
            intent.putExtra("messageType", oooo00o0.OooO0O0());
            intent.putExtra("eventID", str);
            context.startService(intent);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO0O0("statisticMessage--Exception" + e.getMessage());
        }
    }

    public static void OooO00o(Context context, C8404oOoo0O00 oooo0o00) {
        C8412oOoo0OoO.OooO00o(context, oooo0o00);
    }

    public static void OooO00o(Context context, C8402oOoo0O oooo0o, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(OooO0OO(context));
            intent.setPackage(OooO00o(context));
            intent.putExtra("type", 12291);
            intent.putExtra("taskID", oooo0o.m20078OooO0O0());
            intent.putExtra("appPackage", oooo0o.m20077OooO00o());
            intent.putExtra("messageID", oooo0o.OooO00o());
            intent.putExtra("globalID", oooo0o.OooO0o());
            intent.putExtra("messageType", oooo0o.OooO0O0());
            intent.putExtra("eventID", str);
            context.startService(intent);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO0O0("statisticMessage--Exception" + e.getMessage());
        }
    }

    public static void OooO00o(Context context, List<C8404oOoo0O00> list) {
        C8412oOoo0OoO.OooO00o(context, list);
    }

    private synchronized void OooO00o(AbstractC8384oOoOoo00 oooooo00) {
        if (oooooo00 != null) {
            this.f21501OooO0O0.add(oooooo00);
        }
    }

    private synchronized void OooO00o(AbstractC8382oOoOoo oooooo) {
        if (oooooo != null) {
            this.f21499OooO00o.add(oooooo);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20053OooO00o(Context context) {
        String OooO00o2 = OooO00o(context);
        return C8415oOoo0o0.m20083OooO00o(context, OooO00o2) && C8415oOoo0o0.OooO00o(context, OooO00o2) >= 1012 && C8415oOoo0o0.OooO00o(context, OooO00o2, OooOoo0);
    }

    public static String OooO0O0(Context context) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(OooOOoo), 8192);
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            try {
                boolean z = false;
                boolean z2 = (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1;
                if (context.getPackageManager().getPackageUid(str, 0) == context.getPackageManager().getPackageUid("android", 0)) {
                    z = true;
                }
                if (z2 || z) {
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    private void OooO0O0(int i, JSONObject jSONObject) {
        m20051OooO00o(i, "", jSONObject);
    }

    public static String OooO0OO() {
        return C8929ooOOO0O0.OooO0Oo;
    }

    public static String OooO0OO(Context context) {
        if (Oooo000 == null) {
            OooO0O0(context);
        }
        return f21489OooO00o ? OooOOoo : C8415oOoo0o0.OooO00o(f21491OooO0O0);
    }

    private void OooOOO() {
        if (this.f21495OooO00o == null) {
            throw new IllegalArgumentException("please call the register first!");
        }
    }

    private void OooOOO0() {
        OooOOO();
        OooOOOO();
    }

    private void OooOOOO() {
        if (this.f21502OooO0OO == null) {
            throw new IllegalArgumentException("please call the register until get the registerID!");
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO() {
        OooO0O0((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(12310, jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO, com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20054OooO00o() {
        OooOOO();
        Context context = this.f21495OooO00o;
        return C8415oOoo0o0.OooO00o(context, OooO00o(context));
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO, com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8394oOoo000O m20055OooO00o() {
        return this.f21496OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO, com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20056OooO00o() {
        return this.f21502OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO, com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<AbstractC8384oOoOoo00> m20057OooO00o() {
        return this.f21501OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO, com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20058OooO00o() {
        OooO0o0((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO00o(int i) {
        OooO00o(i, (JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO00o(int i, JSONObject jSONObject) {
        try {
            OooOOO0();
            m20051OooO00o(C8400oOoo00oO.Oooo0o0, String.valueOf(i), jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO00o(Context context, String str, String str2, AbstractC8394oOoo000O oooo000o) {
        OooO00o(context, str, str2, (JSONObject) null, oooo000o);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO00o(Context context, String str, String str2, JSONObject jSONObject, AbstractC8394oOoo000O oooo000o) {
        if (context != null) {
            try {
                OooO00o(context, new C8404oOoo0O00(context.getPackageName(), f21492OooO0Oo, null));
                if (m20053OooO00o(context)) {
                    this.f21498OooO00o = str;
                    this.f21500OooO0O0 = str2;
                    this.f21495OooO00o = context.getApplicationContext();
                    this.f21496OooO00o = oooo000o;
                    OooO0O0(12289, jSONObject);
                    return;
                }
                throw new IllegalArgumentException("the phone is not support push!");
            } catch (Exception unused) {
                if (m20055OooO00o() != null) {
                    m20055OooO00o().onRegister(-2, null);
                }
            }
        } else {
            throw new IllegalArgumentException("context is null !");
        }
    }

    public void OooO00o(AbstractC8394oOoo000O oooo000o) {
        this.f21496OooO00o = oooo000o;
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO00o(String str) {
        OooO00o(str, (JSONObject) null);
    }

    public void OooO00o(String str, String str2) {
        this.f21498OooO00o = str;
        this.f21500OooO0O0 = str2;
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO00o(String str, JSONObject jSONObject) {
        try {
            OooOOO0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            OooO00o(arrayList, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onSetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO00o(List<String> list) {
        OooO0Oo(list, null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO00o(List<Integer> list, int i, int i2, int i3, int i4) {
        OooO00o(list, i, i2, i3, i4, null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO00o(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null || list.size() <= 0 || i < 0 || i > 23 || i2 < 0 || i2 > 59 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
                throw new IllegalArgumentException("params are not all right,please check params");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("weekDays", C8400oOoo00oO.OooO00o(list));
                jSONObject2.put("startHour", i);
                jSONObject2.put("startMin", i2);
                jSONObject2.put("endHour", i3);
                jSONObject2.put("endMin", i4);
                m20051OooO00o(C8400oOoo00oO.OooOoo, jSONObject2.toString(), jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onSetPushTime(-2, e2.getMessage());
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    @Deprecated
    public void OooO00o(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(C8400oOoo00oO.Oooo000, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onSetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO00o(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.OooOooO, jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public String OooO0O0() {
        OooOOO();
        Context context = this.f21495OooO00o;
        return C8415oOoo0o0.m20082OooO00o(context, OooO00o(context));
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List<AbstractC8382oOoOoo> m20059OooO0O0() {
        return this.f21499OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20060OooO0O0() {
        try {
            OooOOO();
            OooO0O0(C8400oOoo00oO.OoooO0);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    public void OooO0O0(int i) {
        Intent OooO00o2 = OooO00o(i, "", (JSONObject) null);
        this.f21495OooO00o.bindService(OooO00o2, new ServiceConnectionC8395oOoo000o(this, OooO00o2), 1);
    }

    public void OooO0O0(Context context, String str, String str2, JSONObject jSONObject, AbstractC8394oOoo000O oooo000o) {
        this.f21498OooO00o = str;
        this.f21500OooO0O0 = str2;
        this.f21495OooO00o = context.getApplicationContext();
        this.f21496OooO00o = oooo000o;
        OooOO0O(jSONObject);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0O0(String str) {
        this.f21502OooO0OO = str;
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0O0(String str, JSONObject jSONObject) {
        try {
            OooOOO0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            OooO0O0(arrayList, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onUnsetAliases(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0O0(List<String> list) {
        OooO0OO(list, null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    @Deprecated
    public void OooO0O0(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(12294, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onUnsetAliases(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0O0(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.OooOoOO, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onGetTags(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m20061OooO0OO() {
        OooO0Oo((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0OO(String str) {
        OooO0O0(str, (JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0OO(List<String> list) {
        OooO00o(list, (JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0OO(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(C8400oOoo00oO.Oooo00o, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onUnsetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0OO(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.Oooo00O, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onGetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0Oo() {
        OooO00o((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0Oo(List<String> list) {
        OooO0o0(list, null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0Oo(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(C8400oOoo00oO.OooOo0o, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onSetAliases(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0Oo(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(12309, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onGetNotificationStatus(-2, 0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0o() {
        OooO0oo(null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0o(List<String> list) {
        OooO0o(list, null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0o(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(C8400oOoo00oO.OooOoo0, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onUnsetTags(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0o(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(12308, jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0o0() {
        OooO0oO(null);
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0o0(List<String> list) {
        OooO0O0(list, (JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0o0(List<String> list, JSONObject jSONObject) {
        try {
            OooOOO0();
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                m20051OooO00o(12295, C8400oOoo00oO.OooO00o(list), jSONObject);
            }
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onSetTags(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0o0(JSONObject jSONObject) {
        try {
            OooOOO();
            OooO0O0(12311, jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0oO() {
        OooO0o((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0oO(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.OooOooo, jSONObject);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(C8409oOoo0OOo.OooO00o, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooO0oo() {
        OooOO0(null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooO0oo(JSONObject jSONObject) {
        try {
            OooOOO();
            OooO0O0(12289, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onRegister(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooOO0() {
        OooO0OO((JSONObject) null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooOO0(JSONObject jSONObject) {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.OooOo, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onGetAliases(-2, null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void OooOO0O() {
        OooO(null);
    }

    @Override // com.p118pd.sdk.AbstractC8388oOoOoooo
    public void OooOO0O(JSONObject jSONObject) {
        try {
            OooOOO();
            OooO0O0(12290, jSONObject);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onUnRegister(-2);
            }
        }
    }

    public void OooOO0o() {
        try {
            OooOOO0();
            OooO0O0(C8400oOoo00oO.Oooo0OO, (JSONObject) null);
        } catch (Exception unused) {
            if (m20055OooO00o() != null) {
                m20055OooO00o().onGetPushStatus(-2, 0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8387oOoOoooO
    public void unRegister() {
        OooOO0O(null);
    }
}
