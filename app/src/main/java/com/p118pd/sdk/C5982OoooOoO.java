package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.OoooOoO  reason: case insensitive filesystem */
public class C5982OoooOoO extends DataSetObservable {
    public static final String OooO = ".xml";
    public static final float OooO00o = 1.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, C5982OoooOoO> f17265OooO00o = new HashMap();
    public static final int OooO0O0 = 50;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object f17266OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f17267OooO0O0 = C5982OoooOoO.class.getSimpleName();
    public static final int OooO0OO = 5;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f17268OooO0OO = "historical-records";
    public static final int OooO0Oo = -1;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f17269OooO0Oo = "historical-record";
    public static final String OooO0o = "time";
    public static final String OooO0o0 = "activity";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final boolean f17270OooO0o0 = false;
    public static final String OooO0oO = "weight";
    public static final String OooO0oo = "activity_choser_model_history.xml";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17271OooO00o = 50;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f17272OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Intent f17273OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f17274OooO00o = new C5983OooO0Oo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0o f17275OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f17276OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f17277OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<OooO0O0> f17278OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17279OooO00o = true;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<C5984OooO0o0> f17280OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17281OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f17282OooO0OO = true;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f17283OooO0Oo = false;

    /* renamed from: com.pd.sdk.OoooOoO$OooO00o */
    public interface OooO00o {
        void setActivityChooserModel(C5982OoooOoO ooooOoO);
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0O0 */
    public static final class OooO0O0 implements Comparable<OooO0O0> {
        public final ResolveInfo OooO00o;
        public float OooO0Oo;

        public OooO0O0(ResolveInfo resolveInfo) {
            this.OooO00o = resolveInfo;
        }

        /* renamed from: OooO00o */
        public int compareTo(OooO0O0 oooO0O0) {
            return Float.floatToIntBits(oooO0O0.OooO0Oo) - Float.floatToIntBits(this.OooO0Oo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && OooO0O0.class == obj.getClass() && Float.floatToIntBits(this.OooO0Oo) == Float.floatToIntBits(((OooO0O0) obj).OooO0Oo);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.OooO0Oo) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.OooO00o.toString() + "; weight:" + new BigDecimal((double) this.OooO0Oo) + "]";
        }
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0OO */
    public interface OooO0OO {
        void OooO00o(Intent intent, List<OooO0O0> list, List<C5984OooO0o0> list2);
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0Oo  reason: case insensitive filesystem */
    public static final class C5983OooO0Oo implements OooO0OO {
        public static final float OooO00o = 0.95f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<ComponentName, OooO0O0> f17284OooO00o = new HashMap();

        @Override // com.p118pd.sdk.C5982OoooOoO.OooO0OO
        public void OooO00o(Intent intent, List<OooO0O0> list, List<C5984OooO0o0> list2) {
            Map<ComponentName, OooO0O0> map = this.f17284OooO00o;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OooO0O0 oooO0O0 = list.get(i);
                oooO0O0.OooO0Oo = 0.0f;
                ActivityInfo activityInfo = oooO0O0.OooO00o.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), oooO0O0);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C5984OooO0o0 oooO0o0 = list2.get(size2);
                OooO0O0 oooO0O02 = map.get(oooO0o0.f17286OooO00o);
                if (oooO0O02 != null) {
                    oooO0O02.OooO0Oo += oooO0o0.OooO00o * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0o */
    public interface OooO0o {
        boolean OooO00o(C5982OoooOoO ooooOoO, Intent intent);
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0o0  reason: case insensitive filesystem */
    public static final class C5984OooO0o0 {
        public final float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long f17285OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ComponentName f17286OooO00o;

        public C5984OooO0o0(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5984OooO0o0.class != obj.getClass()) {
                return false;
            }
            C5984OooO0o0 oooO0o0 = (C5984OooO0o0) obj;
            ComponentName componentName = this.f17286OooO00o;
            if (componentName == null) {
                if (oooO0o0.f17286OooO00o != null) {
                    return false;
                }
            } else if (!componentName.equals(oooO0o0.f17286OooO00o)) {
                return false;
            }
            return this.f17285OooO00o == oooO0o0.f17285OooO00o && Float.floatToIntBits(this.OooO00o) == Float.floatToIntBits(oooO0o0.OooO00o);
        }

        public int hashCode() {
            ComponentName componentName = this.f17286OooO00o;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f17285OooO00o;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.OooO00o);
        }

        public String toString() {
            return "[" + "; activity:" + this.f17286OooO00o + "; time:" + this.f17285OooO00o + "; weight:" + new BigDecimal((double) this.OooO00o) + "]";
        }

        public C5984OooO0o0(ComponentName componentName, long j, float f) {
            this.f17286OooO00o = componentName;
            this.f17285OooO00o = j;
            this.OooO00o = f;
        }
    }

    /* renamed from: com.pd.sdk.OoooOoO$OooO0oO  reason: case insensitive filesystem */
    public final class AsyncTaskC5985OooO0oO extends AsyncTask<Object, Void, Void> {
        public AsyncTaskC5985OooO0oO() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
            if (r15 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
            if (r15 == null) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
            if (r15 == null) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
            if (r15 == null) goto L_0x00c6;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0075 */
        /* renamed from: OooO00o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5982OoooOoO.AsyncTaskC5985OooO0oO.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public C5982OoooOoO(Context context, String str) {
        this.f17272OooO00o = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(OooO)) {
            this.f17277OooO00o = str;
            return;
        }
        this.f17277OooO00o = str + OooO;
    }

    public static C5982OoooOoO OooO00o(Context context, String str) {
        C5982OoooOoO ooooOoO;
        synchronized (f17266OooO0O0) {
            ooooOoO = f17265OooO00o.get(str);
            if (ooooOoO == null) {
                ooooOoO = new C5982OoooOoO(context, str);
                f17265OooO00o.put(str, ooooOoO);
            }
        }
        return ooooOoO;
    }

    private void OooO0O0() {
        if (!this.f17281OooO0O0) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f17282OooO0OO) {
            this.f17282OooO0OO = false;
            if (!TextUtils.isEmpty(this.f17277OooO00o)) {
                new AsyncTaskC5985OooO0oO().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f17280OooO0O0), this.f17277OooO00o);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0Oo() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5982OoooOoO.OooO0Oo():void");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m16823OooO0OO() {
        int size;
        synchronized (this.f17276OooO00o) {
            OooO00o();
            size = this.f17280OooO0O0.size();
        }
        return size;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private boolean m16816OooO0OO() {
        if (this.f17274OooO00o == null || this.f17273OooO00o == null || this.f17278OooO00o.isEmpty() || this.f17280OooO0O0.isEmpty()) {
            return false;
        }
        this.f17274OooO00o.OooO00o(this.f17273OooO00o, this.f17278OooO00o, Collections.unmodifiableList(this.f17280OooO0O0));
        return true;
    }

    public void OooO00o(Intent intent) {
        synchronized (this.f17276OooO00o) {
            if (this.f17273OooO00o != intent) {
                this.f17273OooO00o = intent;
                this.f17283OooO0Oo = true;
                OooO00o();
            }
        }
    }

    public void OooO0O0(int i) {
        synchronized (this.f17276OooO00o) {
            if (this.f17271OooO00o != i) {
                this.f17271OooO00o = i;
                OooO0OO();
                if (m16816OooO0OO()) {
                    notifyChanged();
                }
            }
        }
    }

    private void OooO0OO() {
        int size = this.f17280OooO0O0.size() - this.f17271OooO00o;
        if (size > 0) {
            this.f17282OooO0OO = true;
            for (int i = 0; i < size; i++) {
                this.f17280OooO0O0.remove(0);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Intent m16818OooO00o() {
        Intent intent;
        synchronized (this.f17276OooO00o) {
            intent = this.f17273OooO00o;
        }
        return intent;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m16822OooO0O0() {
        int i;
        synchronized (this.f17276OooO00o) {
            i = this.f17271OooO00o;
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16817OooO00o() {
        int size;
        synchronized (this.f17276OooO00o) {
            OooO00o();
            size = this.f17278OooO00o.size();
        }
        return size;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m16815OooO0O0() {
        if (!this.f17279OooO00o || !this.f17282OooO0OO || TextUtils.isEmpty(this.f17277OooO00o)) {
            return false;
        }
        this.f17279OooO00o = false;
        this.f17281OooO0O0 = true;
        OooO0Oo();
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ResolveInfo m16820OooO00o(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f17276OooO00o) {
            OooO00o();
            resolveInfo = this.f17278OooO00o.get(i).OooO00o;
        }
        return resolveInfo;
    }

    public int OooO00o(ResolveInfo resolveInfo) {
        synchronized (this.f17276OooO00o) {
            OooO00o();
            List<OooO0O0> list = this.f17278OooO00o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).OooO00o == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent OooO00o(int i) {
        synchronized (this.f17276OooO00o) {
            if (this.f17273OooO00o == null) {
                return null;
            }
            OooO00o();
            OooO0O0 oooO0O0 = this.f17278OooO00o.get(i);
            ComponentName componentName = new ComponentName(oooO0O0.OooO00o.activityInfo.packageName, oooO0O0.OooO00o.activityInfo.name);
            Intent intent = new Intent(this.f17273OooO00o);
            intent.setComponent(componentName);
            if (this.f17275OooO00o != null) {
                if (this.f17275OooO00o.OooO00o(this, new Intent(intent))) {
                    return null;
                }
            }
            OooO00o(new C5984OooO0o0(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public void OooO00o(OooO0o oooO0o) {
        synchronized (this.f17276OooO00o) {
            this.f17275OooO00o = oooO0o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ResolveInfo m16819OooO00o() {
        synchronized (this.f17276OooO00o) {
            OooO00o();
            if (this.f17278OooO00o.isEmpty()) {
                return null;
            }
            return this.f17278OooO00o.get(0).OooO00o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16821OooO00o(int i) {
        synchronized (this.f17276OooO00o) {
            OooO00o();
            OooO0O0 oooO0O0 = this.f17278OooO00o.get(i);
            OooO0O0 oooO0O02 = this.f17278OooO00o.get(0);
            OooO00o(new C5984OooO0o0(new ComponentName(oooO0O0.OooO00o.activityInfo.packageName, oooO0O0.OooO00o.activityInfo.name), System.currentTimeMillis(), oooO0O02 != null ? (oooO0O02.OooO0Oo - oooO0O0.OooO0Oo) + 5.0f : 1.0f));
        }
    }

    public void OooO00o(OooO0OO oooO0OO) {
        synchronized (this.f17276OooO00o) {
            if (this.f17274OooO00o != oooO0OO) {
                this.f17274OooO00o = oooO0OO;
                if (m16816OooO0OO()) {
                    notifyChanged();
                }
            }
        }
    }

    private void OooO00o() {
        boolean OooO00o2 = m16814OooO00o() | m16815OooO0O0();
        OooO0OO();
        if (OooO00o2) {
            m16816OooO0OO();
            notifyChanged();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m16814OooO00o() {
        if (!this.f17283OooO0Oo || this.f17273OooO00o == null) {
            return false;
        }
        this.f17283OooO0Oo = false;
        this.f17278OooO00o.clear();
        List<ResolveInfo> queryIntentActivities = this.f17272OooO00o.getPackageManager().queryIntentActivities(this.f17273OooO00o, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f17278OooO00o.add(new OooO0O0(queryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean OooO00o(C5984OooO0o0 oooO0o0) {
        boolean add = this.f17280OooO0O0.add(oooO0o0);
        if (add) {
            this.f17282OooO0OO = true;
            OooO0OO();
            OooO0O0();
            m16816OooO0OO();
            notifyChanged();
        }
        return add;
    }
}
