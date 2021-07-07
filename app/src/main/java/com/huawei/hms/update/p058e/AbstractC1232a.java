package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.p037c.AbstractC1136f;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p050b.C1201a;
import com.umeng.message.common.C3777a;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.huawei.hms.update.e.a */
public abstract class AbstractC1232a implements AbstractC1109a {

    /* renamed from: a */
    public WeakReference<Activity> f1367a;

    /* renamed from: b */
    public AbstractC1109a f1368b;

    /* renamed from: c */
    public C1262v f1369c = null;

    /* renamed from: d */
    public AbstractC1233b f1370d = null;

    /* renamed from: e */
    public boolean f1371e = false;

    /* renamed from: f */
    public int f1372f = -1;

    /* renamed from: g */
    public String f1373g = null;

    /* renamed from: h */
    public String f1374h = null;

    /* renamed from: i */
    public int f1375i = 0;

    /* renamed from: j */
    public String f1376j = null;

    /* renamed from: a */
    public static String m1400a(int i) {
        if (i == 0) {
            return C1259t.class.getName();
        }
        if (i == 2) {
            return C1246k.class.getName();
        }
        if (i == 4) {
            return C1247l.class.getName();
        }
        if (i != 5) {
            return i != 6 ? "" : C1263w.class.getName();
        }
        return C1248m.class.getName();
    }

    /* renamed from: c */
    private String m1402c(int i, int i2) {
        String valueOf = String.valueOf(i);
        if (i2 == 0) {
            return "0000" + valueOf;
        } else if (i2 == 2) {
            return "2000" + valueOf;
        } else if (i2 == 4) {
            return "6000" + valueOf;
        } else if (i2 == 5) {
            return "5000" + valueOf;
        } else if (i2 != 6) {
            return valueOf;
        } else {
            return "4000" + valueOf;
        }
    }

    /* renamed from: a */
    public void mo15761a(AbstractC1233b bVar) {
    }

    /* renamed from: a */
    public abstract void mo15762a(Class<? extends AbstractC1233b> cls);

    /* renamed from: b */
    public void mo15765b() {
        AbstractC1233b bVar = this.f1370d;
        if (bVar != null) {
            try {
                bVar.mo15771c();
                this.f1370d = null;
            } catch (IllegalStateException e) {
                C1202a.m1320d("AbsUpdateWizard", "In dismissDialog, Failed to dismiss the dialog." + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo15767b(AbstractC1233b bVar) {
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeActivityCreate(Activity activity) {
        this.f1367a = new WeakReference<>(activity);
        if (this.f1369c == null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                C1262v vVar = (C1262v) intent.getSerializableExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO);
                this.f1369c = vVar;
                if (vVar == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1373g = this.f1369c.mo15806b();
        this.f1374h = this.f1369c.mo15812e();
        this.f1375i = this.f1369c.mo15809c();
        this.f1376j = this.f1369c.mo15811d();
        this.f1368b = null;
        this.f1371e = false;
        this.f1372f = -1;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeActivityDestroy() {
        AbstractC1109a aVar;
        this.f1367a = null;
        mo15765b();
        if (this.f1371e && (aVar = this.f1368b) != null) {
            aVar.onBridgeActivityDestroy();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.update.e.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeConfigurationChanged() {
        AbstractC1109a aVar;
        if (!this.f1371e || (aVar = this.f1368b) == null) {
            AbstractC1233b bVar = this.f1370d;
            if (bVar != null) {
                Class<?> cls = bVar.getClass();
                this.f1370d.mo15771c();
                this.f1370d = null;
                mo15762a((Class<? extends AbstractC1233b>) cls);
                return;
            }
            return;
        }
        aVar.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            aVar.onKeyUp(i, keyEvent);
        }
    }

    /* renamed from: b */
    public void mo15766b(int i, int i2) {
        Activity a = mo15759a();
        if (a != null && !a.isFinishing()) {
            mo15760a(i, i2);
            Intent intent = new Intent();
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, getClass().getName());
            intent.putExtra("intent.extra.RESULT", i);
            a.setResult(-1, intent);
            a.finish();
        }
    }

    /* renamed from: a */
    public Activity mo15759a() {
        WeakReference<Activity> weakReference = this.f1367a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public void mo15760a(int i, int i2) {
        Activity a;
        if (!C1201a.m1307a().mo15709b() && (a = mo15759a()) != null && !a.isFinishing()) {
            int b = new C1137g(a).mo15418b(this.f1373g);
            HashMap hashMap = new HashMap();
            hashMap.put(C3777a.f10045u, a.getPackageName());
            hashMap.put("target_package", this.f1373g);
            hashMap.put("target_ver", String.valueOf(b));
            hashMap.put("sdk_ver", String.valueOf((int) HuaweiApiAvailability.HMS_SDK_VERSION_CODE));
            hashMap.put(Constants.APP_ID, C1141j.m1090a((Context) a));
            hashMap.put("trigger_api", "core.connnect");
            hashMap.put("update_type", String.valueOf(i2));
            hashMap.put("net_type", String.valueOf(AbstractC1136f.m1072a(a)));
            hashMap.put("result", m1402c(i, i2));
            C1201a.m1307a().mo15707a(a, "HMS_SDK_UPDATE", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo15764a(boolean z) {
        Activity a = mo15759a();
        if (a == null) {
            return false;
        }
        ArrayList f = this.f1369c.mo15813f();
        if (f.size() > 0) {
            f.remove(0);
        }
        if (this.f1368b == null) {
            m1401a(f);
        }
        if (this.f1368b == null) {
            return false;
        }
        this.f1371e = true;
        this.f1369c.mo15803a(f);
        this.f1369c.mo15808b(z);
        this.f1368b.onBridgeActivityCreate(a);
        return true;
    }

    /* renamed from: a */
    private void m1401a(ArrayList arrayList) {
        String a = (arrayList == null || arrayList.size() <= 0) ? null : m1400a(((Integer) arrayList.get(0)).intValue());
        if (a != null) {
            try {
                this.f1368b = (AbstractC1109a) Class.forName(a).asSubclass(AbstractC1109a.class).newInstance();
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                C1202a.m1320d("AbsUpdateWizard", "getBridgeActivityDelegate error" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean mo15763a(String str, int i) {
        Activity a;
        if (!TextUtils.isEmpty(str) && (a = mo15759a()) != null && !a.isFinishing() && new C1137g(a).mo15418b(str) >= i) {
            return true;
        }
        return false;
    }
}
