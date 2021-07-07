package com.qiyukf.unicorn.p230i;

import android.app.Activity;
import android.app.Fragment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p119a.C1713c;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2482q;
import com.qiyukf.unicorn.p213f.C2634c;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.i.b */
public final class C2683b {

    /* renamed from: a */
    public SparseArray<String> f5573a = new SparseArray<>();

    /* renamed from: b */
    public Handler f5574b;

    /* renamed from: com.qiyukf.unicorn.i.b$a */
    public static class C2688a {

        /* renamed from: a */
        public static C2683b f5589a;
    }

    public C2683b() {
        Handler a = C1805a.m3403a().mo34072a("StatisticsManager");
        this.f5574b = a;
        a.post(new Runnable() {
            /* class com.qiyukf.unicorn.p230i.C2683b.RunnableC26841 */

            public final void run() {
                JSONObject f;
                if (System.currentTimeMillis() - C2437b.m5304t() > 86400000 && (f = C1810b.m3433f(C2634c.m6004b(), "result")) != null) {
                    boolean z = true;
                    if (C1810b.m3427b(f, "track") != 1) {
                        z = false;
                    }
                    C2437b.m5271d(z);
                    C2437b.m5252b(System.currentTimeMillis());
                    C1709a.m3014b(C7383o0OOO0O.OooOOO0, "requestDaConfig");
                }
                C1709a.m3011a("StatisticsManager", "track switch " + (C2437b.m5303s() ? 1 : 0));
            }
        });
    }

    /* renamed from: a */
    public static C2683b m6190a() {
        if (C2688a.f5589a == null) {
            C2683b unused = C2688a.f5589a = new C2683b();
        }
        return C2688a.f5589a;
    }

    /* renamed from: a */
    private String m6191a(Object obj, int i) {
        if (i == 0) {
            String lowerCase = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
            this.f5573a.put(obj.hashCode(), lowerCase);
            return lowerCase;
        }
        String str = this.f5573a.get(obj.hashCode());
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
        }
        this.f5573a.remove(obj.hashCode());
        return str;
    }

    /* renamed from: a */
    private void m6192a(Object obj, final CharSequence charSequence, final int i) {
        if (C2437b.m5303s()) {
            final String name = obj.getClass().getName();
            final String a = m6191a(obj, i);
            final long currentTimeMillis = System.currentTimeMillis();
            this.f5574b.post(new Runnable() {
                /* class com.qiyukf.unicorn.p230i.C2683b.RunnableC26863 */

                public final void run() {
                    try {
                        C2683b.m6194a(name, charSequence, a, i, currentTimeMillis);
                    } catch (Throwable th) {
                        C1709a.m3019d("StatisticsManager", "handle action error", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m6193a(Object obj, final CharSequence charSequence, final JSONObject jSONObject) {
        if (C2437b.m5303s()) {
            final String name = obj.getClass().getName();
            final String a = m6191a(obj, 0);
            final long currentTimeMillis = System.currentTimeMillis();
            this.f5574b.post(new Runnable() {
                /* class com.qiyukf.unicorn.p230i.C2683b.RunnableC26874 */

                public final void run() {
                    try {
                        C2683b.m6195a(name, charSequence, a, currentTimeMillis, jSONObject);
                    } catch (Throwable th) {
                        C1709a.m3019d("StatisticsManager", "handle action error", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6194a(String str, CharSequence charSequence, String str2, int i, long j) {
        String e = m6198e();
        String a = C2689c.m6213a(str, charSequence, str2, i, j, "0", null);
        if (m6197d()) {
            C2689c.m6215a(e, a);
        } else {
            C2689c.m6217b(e, a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6195a(String str, CharSequence charSequence, String str2, long j, JSONObject jSONObject) {
        String e = m6198e();
        String a = C2689c.m6213a(str, charSequence, str2, 0, j, "1", jSONObject);
        if (m6197d()) {
            C2689c.m6215a(e, a);
        } else {
            C2689c.m6217b(e, a);
        }
    }

    /* renamed from: d */
    public static boolean m6197d() {
        for (C2482q qVar : C2452d.m5375g().mo36354e().values()) {
            if (qVar != null && qVar.f4928g == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static String m6198e() {
        C1713c a = C1709a.m3009a();
        if (a == null) {
            return null;
        }
        return a.mo33864a() + "/statistics/record.log";
    }

    /* renamed from: a */
    public final void mo36443a(Activity activity) {
        if (activity != null) {
            mo36444a(activity, activity.getTitle());
        }
    }

    /* renamed from: a */
    public final void mo36444a(Activity activity, CharSequence charSequence) {
        if (activity != null) {
            m6192a(activity, charSequence, 0);
        }
    }

    /* renamed from: a */
    public final void mo36445a(Activity activity, CharSequence charSequence, JSONObject jSONObject) {
        if (activity != null) {
            m6193a((Object) activity, charSequence, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo36446a(Fragment fragment, CharSequence charSequence) {
        if (fragment != null) {
            m6192a(fragment.getClass().getName(), charSequence, 0);
        }
    }

    /* renamed from: a */
    public final void mo36447a(Fragment fragment, CharSequence charSequence, JSONObject jSONObject) {
        if (fragment != null) {
            m6193a((Object) fragment, charSequence, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo36448a(androidx.fragment.app.Fragment fragment, CharSequence charSequence) {
        if (fragment != null) {
            m6192a(fragment, charSequence, 0);
        }
    }

    /* renamed from: a */
    public final void mo36449a(androidx.fragment.app.Fragment fragment, CharSequence charSequence, JSONObject jSONObject) {
        if (fragment != null) {
            m6193a((Object) fragment, charSequence, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo36450b() {
        if (C2437b.m5303s()) {
            this.f5574b.post(new Runnable() {
                /* class com.qiyukf.unicorn.p230i.C2683b.RunnableC26852 */

                public final void run() {
                    C2689c.m6216a(C2683b.m6198e());
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36451b(Activity activity) {
        if (activity != null) {
            mo36452b(activity, activity.getTitle());
        }
    }

    /* renamed from: b */
    public final void mo36452b(Activity activity, CharSequence charSequence) {
        if (activity != null) {
            m6192a(activity, charSequence, 1);
        }
    }

    /* renamed from: b */
    public final void mo36453b(Fragment fragment, CharSequence charSequence) {
        if (fragment != null) {
            m6192a(fragment, charSequence, 1);
        }
    }

    /* renamed from: b */
    public final void mo36454b(androidx.fragment.app.Fragment fragment, CharSequence charSequence) {
        if (fragment != null) {
            m6192a(fragment, charSequence, 1);
        }
    }
}
