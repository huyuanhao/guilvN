package com.tencent.bugly.crashreport.crash;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import com.p118pd.sdk.C8025oOO00oOO;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.C3216b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC3306ad;
import com.tencent.bugly.proguard.AbstractC3313aj;
import com.tencent.bugly.proguard.AbstractC3357m;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3310ag;
import com.tencent.bugly.proguard.C3311ah;
import com.tencent.bugly.proguard.C3314ak;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.tencent.bugly.proguard.C3334ay;
import com.tencent.bugly.proguard.C3337ba;
import com.tencent.bugly.proguard.C3338bb;
import com.tencent.bugly.proguard.C3339bc;
import com.tencent.bugly.proguard.C3340bd;
import com.tencent.bugly.proguard.C3341be;
import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.android.agoo.message.MessageService;

/* renamed from: com.tencent.bugly.crashreport.crash.b */
public class C3285b {

    /* renamed from: a */
    public static int f7833a;

    /* renamed from: b */
    public final Context f7834b;

    /* renamed from: c */
    public final C3314ak f7835c;

    /* renamed from: d */
    public final C3307ae f7836d;

    /* renamed from: e */
    public final C3272a f7837e;

    /* renamed from: f */
    public AbstractC3294f f7838f;

    /* renamed from: g */
    public BuglyStrategy.C3214a f7839g;

    public C3285b(int i, Context context, C3314ak akVar, C3307ae aeVar, C3272a aVar, BuglyStrategy.C3214a aVar2, AbstractC3294f fVar) {
        f7833a = i;
        this.f7834b = context;
        this.f7835c = akVar;
        this.f7836d = aeVar;
        this.f7837e = aVar;
        this.f7839g = aVar2;
        this.f7838f = fVar;
    }

    /* renamed from: f */
    private boolean m8124f(CrashDetailBean crashDetailBean) {
        try {
            C3321an.m8355c("save eup logs", new Object[0]);
            C3269a b = C3269a.m7966b();
            String f = b.mo38161f();
            String str = b.f7692p;
            String str2 = crashDetailBean.f7750A;
            Locale locale = Locale.US;
            b.getClass();
            String format = String.format(locale, "#--------\npackage:%s\nversion:%s\nsdk:%s\nprocess:%s\ndate:%s\ntype:%s\nmessage:%s\nstack:\n%s\neupID:%s\n", f, str, "2.6.5", str2, C3325ap.m8392a(new Date(crashDetailBean.f7790r)), crashDetailBean.f7786n, crashDetailBean.f7787o, crashDetailBean.f7789q, crashDetailBean.f7775c);
            String str3 = null;
            if (C3287c.f7851j != null) {
                File file = new File(C3287c.f7851j);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                str3 = file.getAbsolutePath();
            } else if (Environment.getExternalStorageState().equals("mounted")) {
                str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f7834b.getPackageName();
            }
            C3325ap.m8398a(this.f7834b, str3 + "/euplog.txt", format, C3287c.f7852k);
            return true;
        } catch (Throwable th) {
            C3321an.m8356d("rqdp{  save error} %s", th.toString());
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public List<C3276a> mo38238a(List<C3276a> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C3276a aVar : list) {
            if (aVar.f7802d && aVar.f7800b <= currentTimeMillis - 86400000) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo38247b(CrashDetailBean crashDetailBean) {
        if (this.f7838f != null) {
            boolean z = false;
            C3321an.m8355c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
            AbstractC3294f fVar = this.f7838f;
            if (crashDetailBean.f7774b == 1) {
                z = true;
            }
            fVar.mo38286b(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1 A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016e A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0188 A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a7 A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38248c(com.tencent.bugly.crashreport.crash.CrashDetailBean r23) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.C3285b.mo38248c(com.tencent.bugly.crashreport.crash.CrashDetailBean):void");
    }

    /* renamed from: d */
    public ContentValues mo38250d(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (crashDetailBean.f7773a > 0) {
                contentValues.put(C3848l.f10389g, Long.valueOf(crashDetailBean.f7773a));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f7790r));
            contentValues.put("_s1", crashDetailBean.f7793u);
            int i = 1;
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f7776d ? 1 : 0));
            if (!crashDetailBean.f7782j) {
                i = 0;
            }
            contentValues.put("_me", Integer.valueOf(i));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f7784l));
            contentValues.put("_dt", C3325ap.m8407a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: e */
    public void mo38252e(CrashDetailBean crashDetailBean) {
        if (crashDetailBean != null) {
            ContentValues d = mo38250d(crashDetailBean);
            if (d != null) {
                long a = C3307ae.m8249a().mo38340a("t_cr", d, (AbstractC3306ad) null, true);
                if (a >= 0) {
                    C3321an.m8355c("insert %s success!", "t_cr");
                    crashDetailBean.f7773a = a;
                }
            }
            if (C3287c.f7850i) {
                m8124f(crashDetailBean);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4 A[DONT_GENERATE] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.bugly.crashreport.crash.CrashDetailBean> mo38246b(java.util.List<com.tencent.bugly.crashreport.crash.C3276a> r15) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.C3285b.mo38246b(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public CrashDetailBean mo38236a(List<C3276a> list, CrashDetailBean crashDetailBean) {
        List<CrashDetailBean> b;
        String[] split;
        if (list == null || list.size() == 0) {
            return crashDetailBean;
        }
        CrashDetailBean crashDetailBean2 = null;
        ArrayList arrayList = new ArrayList(10);
        for (C3276a aVar : list) {
            if (aVar.f7803e) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.size() > 0 && (b = mo38246b(arrayList)) != null && b.size() > 0) {
            Collections.sort(b);
            for (int i = 0; i < b.size(); i++) {
                CrashDetailBean crashDetailBean3 = b.get(i);
                if (i == 0) {
                    crashDetailBean2 = crashDetailBean3;
                } else {
                    String str = crashDetailBean3.f7791s;
                    if (!(str == null || (split = str.split("\n")) == null)) {
                        for (String str2 : split) {
                            if (!crashDetailBean2.f7791s.contains("" + str2)) {
                                crashDetailBean2.f7792t++;
                                crashDetailBean2.f7791s += str2 + "\n";
                            }
                        }
                    }
                }
            }
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f7782j = true;
            crashDetailBean.f7792t = 0;
            crashDetailBean.f7791s = "";
            crashDetailBean2 = crashDetailBean;
        }
        for (C3276a aVar2 : list) {
            if (!aVar2.f7803e && !aVar2.f7802d) {
                if (!crashDetailBean2.f7791s.contains("" + aVar2.f7800b)) {
                    crashDetailBean2.f7792t++;
                    crashDetailBean2.f7791s += aVar2.f7800b + "\n";
                }
            }
        }
        if (crashDetailBean2.f7790r != crashDetailBean.f7790r) {
            if (!crashDetailBean2.f7791s.contains("" + crashDetailBean.f7790r)) {
                crashDetailBean2.f7792t++;
                crashDetailBean2.f7791s += crashDetailBean.f7790r + "\n";
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: d */
    public void mo38251d(List<CrashDetailBean> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (CrashDetailBean crashDetailBean : list) {
                        sb.append(" or ");
                        sb.append(C3848l.f10389g);
                        sb.append(" = ");
                        sb.append(crashDetailBean.f7773a);
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        sb2 = sb2.substring(4);
                    }
                    sb.setLength(0);
                    C3321an.m8355c("deleted %s data %d", "t_cr", Integer.valueOf(C3307ae.m8249a().mo38339a("t_cr", sb2, (String[]) null, (AbstractC3306ad) null, true)));
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public C3276a mo38244b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C3276a aVar = new C3276a();
            aVar.f7799a = cursor.getLong(cursor.getColumnIndex(C3848l.f10389g));
            aVar.f7800b = cursor.getLong(cursor.getColumnIndex("_tm"));
            aVar.f7801c = cursor.getString(cursor.getColumnIndex("_s1"));
            boolean z = false;
            aVar.f7802d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            if (cursor.getInt(cursor.getColumnIndex("_me")) == 1) {
                z = true;
            }
            aVar.f7803e = z;
            aVar.f7804f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return aVar;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo38242a(CrashDetailBean crashDetailBean) {
        return mo38243a(crashDetailBean, -123456789);
    }

    /* renamed from: a */
    public boolean mo38243a(CrashDetailBean crashDetailBean, int i) {
        if (crashDetailBean == null) {
            return true;
        }
        String str = C3287c.f7855n;
        if (str != null && !str.isEmpty()) {
            C3321an.m8355c("Crash filter for crash stack is: %s", C3287c.f7855n);
            if (crashDetailBean.f7789q.contains(C3287c.f7855n)) {
                C3321an.m8356d("This crash contains the filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        String str2 = C3287c.f7856o;
        if (str2 != null && !str2.isEmpty()) {
            C3321an.m8355c("Crash regular filter for crash stack is: %s", C3287c.f7856o);
            if (Pattern.compile(C3287c.f7856o).matcher(crashDetailBean.f7789q).find()) {
                C3321an.m8356d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        boolean z = crashDetailBean.f7774b == 1;
        String str3 = crashDetailBean.f7786n;
        String str4 = crashDetailBean.f7787o;
        String str5 = crashDetailBean.f7788p;
        String str6 = crashDetailBean.f7789q;
        long j = crashDetailBean.f7790r;
        String str7 = crashDetailBean.f7785m;
        String str8 = crashDetailBean.f7777e;
        String str9 = crashDetailBean.f7775c;
        String str10 = crashDetailBean.f7750A;
        String str11 = crashDetailBean.f7751B;
        if (this.f7838f != null) {
            C3321an.m8355c("Calling 'onCrashSaving' of RQD crash listener.", new Object[0]);
            if (!this.f7838f.mo38283a(z, str3, str4, str5, str6, i, j, str7, str8, str9, str10, str11)) {
                C3321an.m8356d("Crash listener 'onCrashSaving' return 'false' thus will not handle this crash.", new Object[0]);
                return true;
            }
        }
        if (crashDetailBean.f7774b != 2) {
            C3310ag agVar = new C3310ag();
            agVar.f7986b = 1;
            agVar.f7987c = crashDetailBean.f7750A;
            agVar.f7988d = crashDetailBean.f7751B;
            agVar.f7989e = crashDetailBean.f7790r;
            this.f7836d.mo38352b(1);
            this.f7836d.mo38349a(agVar);
            C3321an.m8352b("[crash] a crash occur, handling...", new Object[0]);
        } else {
            C3321an.m8352b("[crash] a caught exception occur, handling...", new Object[0]);
        }
        List<C3276a> b = mo38245b();
        List<C3276a> list = null;
        if (b != null && b.size() > 0) {
            list = new ArrayList<>(10);
            List<C3276a> arrayList = new ArrayList<>(10);
            list.addAll(mo38238a(b));
            b.removeAll(list);
            if (!C3216b.f7324c && C3287c.f7845d) {
                boolean z2 = false;
                for (C3276a aVar : b) {
                    if (crashDetailBean.f7793u.equals(aVar.f7801c)) {
                        if (aVar.f7803e) {
                            z2 = true;
                        }
                        arrayList.add(aVar);
                    }
                }
                if (z2 || arrayList.size() >= C3287c.f7844c) {
                    C3321an.m8349a("same crash occur too much do merged!", new Object[0]);
                    CrashDetailBean a = mo38236a(arrayList, crashDetailBean);
                    for (C3276a aVar2 : arrayList) {
                        if (aVar2.f7799a != a.f7773a) {
                            list.add(aVar2);
                        }
                    }
                    mo38252e(a);
                    mo38249c(list);
                    C3321an.m8352b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
                    return true;
                }
            }
        }
        mo38252e(crashDetailBean);
        if (list != null && !list.isEmpty()) {
            mo38249c(list);
        }
        C3321an.m8352b("[crash] save crash success", new Object[0]);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.tencent.bugly.crashreport.crash.a>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[DONT_GENERATE] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.bugly.crashreport.crash.C3276a> mo38245b() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.C3285b.mo38245b():java.util.List");
    }

    /* renamed from: c */
    public void mo38249c(List<C3276a> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (C3276a aVar : list) {
                sb.append(" or ");
                sb.append(C3848l.f10389g);
                sb.append(" = ");
                sb.append(aVar.f7799a);
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                sb2 = sb2.substring(4);
            }
            sb.setLength(0);
            try {
                C3321an.m8355c("deleted %s data %d", "t_cr", Integer.valueOf(C3307ae.m8249a().mo38339a("t_cr", sb2, (String[]) null, (AbstractC3306ad) null, true)));
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public List<CrashDetailBean> mo38237a() {
        StrategyBean c = C3272a.m8069a().mo38194c();
        if (c == null) {
            C3321an.m8356d("have not synced remote!", new Object[0]);
            return null;
        } else if (!c.f7714g) {
            C3321an.m8356d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C3321an.m8352b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long b = C3325ap.m8412b();
            List<C3276a> b2 = mo38245b();
            C3321an.m8355c("Size of crash list loaded from DB: %s", Integer.valueOf(b2.size()));
            if (b2 == null || b2.size() <= 0) {
                return null;
            }
            List<C3276a> arrayList = new ArrayList<>();
            arrayList.addAll(mo38238a(b2));
            b2.removeAll(arrayList);
            Iterator<C3276a> it = b2.iterator();
            while (it.hasNext()) {
                C3276a next = it.next();
                long j = next.f7800b;
                if (j < b - C3287c.f7848g) {
                    it.remove();
                    arrayList.add(next);
                } else if (next.f7802d) {
                    if (j >= currentTimeMillis - 86400000) {
                        it.remove();
                    } else if (!next.f7803e) {
                        it.remove();
                        arrayList.add(next);
                    }
                } else if (((long) next.f7804f) >= 3 && j < currentTimeMillis - 86400000) {
                    it.remove();
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                mo38249c(arrayList);
            }
            List<CrashDetailBean> arrayList2 = new ArrayList<>();
            List<CrashDetailBean> b3 = mo38246b(b2);
            if (b3 != null && b3.size() > 0) {
                String str = C3269a.m7966b().f7692p;
                Iterator<CrashDetailBean> it2 = b3.iterator();
                while (it2.hasNext()) {
                    CrashDetailBean next2 = it2.next();
                    if (!str.equals(next2.f7778f)) {
                        it2.remove();
                        arrayList2.add(next2);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                mo38251d(arrayList2);
            }
            return b3;
        }
    }

    /* renamed from: a */
    public void mo38239a(CrashDetailBean crashDetailBean, long j, boolean z) {
        if (C3287c.f7853l) {
            C3321an.m8349a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            mo38240a(arrayList, j, z, crashDetailBean.f7774b == 7, z);
        }
    }

    /* renamed from: a */
    public void mo38240a(final List<CrashDetailBean> list, long j, boolean z, boolean z2, boolean z3) {
        C3314ak akVar;
        if (!C3269a.m7965a(this.f7834b).f7684h || (akVar = this.f7835c) == null) {
            return;
        }
        if (z3 || akVar.mo38386b(C3287c.f7842a)) {
            StrategyBean c = this.f7837e.mo38194c();
            if (!c.f7714g) {
                C3321an.m8356d("remote report is disable!", new Object[0]);
                C3321an.m8352b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            } else if (list != null && list.size() != 0) {
                try {
                    String str = this.f7835c.f7997b ? c.f7726s : c.f7727t;
                    String str2 = this.f7835c.f7997b ? StrategyBean.f7710c : StrategyBean.f7708a;
                    int i = this.f7835c.f7997b ? 830 : C8025oOO00oOO.OooooOO;
                    C3339bc a = m8122a(this.f7834b, list, C3269a.m7966b());
                    if (a == null) {
                        C3321an.m8356d("create eupPkg fail!", new Object[0]);
                        return;
                    }
                    byte[] a2 = C3311ah.m8286a((AbstractC3357m) a);
                    if (a2 == null) {
                        C3321an.m8356d("send encode fail!", new Object[0]);
                        return;
                    }
                    C3340bd a3 = C3311ah.m8281a(this.f7834b, i, a2);
                    if (a3 == null) {
                        C3321an.m8356d("request package is null.", new Object[0]);
                        return;
                    }
                    C32861 r10 = new AbstractC3313aj() {
                        /* class com.tencent.bugly.crashreport.crash.C3285b.C32861 */

                        @Override // com.tencent.bugly.proguard.AbstractC3313aj
                        /* renamed from: a */
                        public void mo38038a(int i) {
                        }

                        @Override // com.tencent.bugly.proguard.AbstractC3313aj
                        /* renamed from: a */
                        public void mo38039a(int i, C3341be beVar, long j, long j2, boolean z, String str) {
                            C3285b.this.mo38241a(z, list);
                        }
                    };
                    if (z) {
                        this.f7835c.mo38378a(f7833a, a3, str, str2, r10, j, z2);
                    } else {
                        this.f7835c.mo38379a(f7833a, a3, str, str2, r10, false);
                    }
                } catch (Throwable th) {
                    C3321an.m8357e("req cr error %s", th.toString());
                    if (!C3321an.m8353b(th)) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo38241a(boolean z, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C3321an.m8355c("up finish update state %b", Boolean.valueOf(z));
            for (CrashDetailBean crashDetailBean : list) {
                C3321an.m8355c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f7775c, Integer.valueOf(crashDetailBean.f7784l), Boolean.valueOf(crashDetailBean.f7776d), Boolean.valueOf(crashDetailBean.f7782j));
                int i = crashDetailBean.f7784l + 1;
                crashDetailBean.f7784l = i;
                crashDetailBean.f7776d = z;
                C3321an.m8355c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f7775c, Integer.valueOf(i), Boolean.valueOf(crashDetailBean.f7776d), Boolean.valueOf(crashDetailBean.f7782j));
            }
            for (CrashDetailBean crashDetailBean2 : list) {
                C3287c.m8145a().mo38255a(crashDetailBean2);
            }
            C3321an.m8355c("update state size %d", Integer.valueOf(list.size()));
        }
        if (!z) {
            C3321an.m8352b("[crash] upload fail.", new Object[0]);
        }
    }

    /* renamed from: a */
    public CrashDetailBean mo38235a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j = cursor.getLong(cursor.getColumnIndex(C3848l.f10389g));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C3325ap.m8385a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean != null) {
                crashDetailBean.f7773a = j;
            }
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C3338bb m8121a(Context context, CrashDetailBean crashDetailBean, C3269a aVar) {
        C3337ba a;
        C3337ba a2;
        C3337ba baVar;
        boolean z = false;
        if (context == null || crashDetailBean == null || aVar == null) {
            C3321an.m8356d("enExp args == null", new Object[0]);
            return null;
        }
        C3338bb bbVar = new C3338bb();
        int i = crashDetailBean.f7774b;
        switch (i) {
            case 0:
                bbVar.f8099a = crashDetailBean.f7782j ? "200" : MessageService.MSG_DB_COMPLETE;
                break;
            case 1:
                bbVar.f8099a = crashDetailBean.f7782j ? "201" : "101";
                break;
            case 2:
                bbVar.f8099a = crashDetailBean.f7782j ? "202" : "102";
                break;
            case 3:
                bbVar.f8099a = crashDetailBean.f7782j ? "203" : "103";
                break;
            case 4:
                bbVar.f8099a = crashDetailBean.f7782j ? "204" : "104";
                break;
            case 5:
                bbVar.f8099a = crashDetailBean.f7782j ? "207" : "107";
                break;
            case 6:
                bbVar.f8099a = crashDetailBean.f7782j ? "206" : "106";
                break;
            case 7:
                bbVar.f8099a = crashDetailBean.f7782j ? "208" : "108";
                break;
            default:
                C3321an.m8357e("crash type error! %d", Integer.valueOf(i));
                break;
        }
        bbVar.f8100b = crashDetailBean.f7790r;
        bbVar.f8101c = crashDetailBean.f7786n;
        bbVar.f8102d = crashDetailBean.f7787o;
        bbVar.f8103e = crashDetailBean.f7788p;
        bbVar.f8105g = crashDetailBean.f7789q;
        bbVar.f8106h = crashDetailBean.f7798z;
        bbVar.f8107i = crashDetailBean.f7775c;
        bbVar.f8108j = null;
        bbVar.f8110l = crashDetailBean.f7785m;
        bbVar.f8111m = crashDetailBean.f7777e;
        bbVar.f8104f = crashDetailBean.f7751B;
        bbVar.f8118t = C3269a.m7966b().mo38166i();
        bbVar.f8112n = null;
        Map<String, PlugInBean> map = crashDetailBean.f7781i;
        if (map != null && map.size() > 0) {
            bbVar.f8113o = new ArrayList<>();
            for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f7781i.entrySet()) {
                C3334ay ayVar = new C3334ay();
                ayVar.f8079a = entry.getValue().f7616a;
                ayVar.f8081c = entry.getValue().f7618c;
                ayVar.f8083e = entry.getValue().f7617b;
                ayVar.f8080b = aVar.mo38175r();
                bbVar.f8113o.add(ayVar);
            }
        }
        Map<String, PlugInBean> map2 = crashDetailBean.f7780h;
        if (map2 != null && map2.size() > 0) {
            bbVar.f8114p = new ArrayList<>();
            for (Map.Entry<String, PlugInBean> entry2 : crashDetailBean.f7780h.entrySet()) {
                C3334ay ayVar2 = new C3334ay();
                ayVar2.f8079a = entry2.getValue().f7616a;
                ayVar2.f8081c = entry2.getValue().f7618c;
                ayVar2.f8083e = entry2.getValue().f7617b;
                bbVar.f8114p.add(ayVar2);
            }
        }
        if (crashDetailBean.f7782j) {
            bbVar.f8109k = crashDetailBean.f7792t;
            String str = crashDetailBean.f7791s;
            if (str != null && str.length() > 0) {
                if (bbVar.f8115q == null) {
                    bbVar.f8115q = new ArrayList<>();
                }
                try {
                    bbVar.f8115q.add(new C3337ba((byte) 1, "alltimes.txt", crashDetailBean.f7791s.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    bbVar.f8115q = null;
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(bbVar.f8109k);
            ArrayList<C3337ba> arrayList = bbVar.f8115q;
            objArr[1] = Integer.valueOf(arrayList != null ? arrayList.size() : 0);
            C3321an.m8355c("crashcount:%d sz:%d", objArr);
        }
        if (crashDetailBean.f7795w != null) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            try {
                bbVar.f8115q.add(new C3337ba((byte) 1, "log.txt", crashDetailBean.f7795w.getBytes("utf-8")));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                bbVar.f8115q = null;
            }
        }
        if (crashDetailBean.f7796x != null) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            try {
                bbVar.f8115q.add(new C3337ba((byte) 1, "jniLog.txt", crashDetailBean.f7796x.getBytes("utf-8")));
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
                bbVar.f8115q = null;
            }
        }
        if (!C3325ap.m8404a(crashDetailBean.f7771V)) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            try {
                baVar = new C3337ba((byte) 1, "crashInfos.txt", crashDetailBean.f7771V.getBytes("utf-8"));
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
                baVar = null;
            }
            if (baVar != null) {
                C3321an.m8355c("attach crash infos", new Object[0]);
                bbVar.f8115q.add(baVar);
            }
        }
        if (crashDetailBean.f7772W != null) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            C3337ba a3 = m8120a("backupRecord.zip", context, crashDetailBean.f7772W);
            if (a3 != null) {
                C3321an.m8355c("attach backup record", new Object[0]);
                bbVar.f8115q.add(a3);
            }
        }
        byte[] bArr = crashDetailBean.f7797y;
        if (bArr != null && bArr.length > 0) {
            C3337ba baVar2 = new C3337ba((byte) 2, "buglylog.zip", bArr);
            C3321an.m8355c("attach user log", new Object[0]);
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            bbVar.f8115q.add(baVar2);
        }
        if (crashDetailBean.f7774b == 3) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            Map<String, String> map3 = crashDetailBean.f7765P;
            if (map3 != null && map3.containsKey("BUGLY_CR_01")) {
                try {
                    bbVar.f8115q.add(new C3337ba((byte) 1, "anrMessage.txt", crashDetailBean.f7765P.get("BUGLY_CR_01").getBytes("utf-8")));
                    C3321an.m8355c("attach anr message", new Object[0]);
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                    bbVar.f8115q = null;
                }
                crashDetailBean.f7765P.remove("BUGLY_CR_01");
            }
            String str2 = crashDetailBean.f7794v;
            if (!(str2 == null || (a2 = m8120a("trace.zip", context, str2)) == null)) {
                C3321an.m8355c("attach traces", new Object[0]);
                bbVar.f8115q.add(a2);
            }
        }
        if (crashDetailBean.f7774b == 1) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            String str3 = crashDetailBean.f7794v;
            if (!(str3 == null || (a = m8120a("tomb.zip", context, str3)) == null)) {
                C3321an.m8355c("attach tombs", new Object[0]);
                bbVar.f8115q.add(a);
            }
        }
        List<String> list = aVar.f7630K;
        if (list != null && !list.isEmpty()) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            StringBuilder sb = new StringBuilder();
            for (String str4 : aVar.f7630K) {
                sb.append(str4);
            }
            try {
                bbVar.f8115q.add(new C3337ba((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
                C3321an.m8355c("attach pageTracingList", new Object[0]);
            } catch (UnsupportedEncodingException e6) {
                e6.printStackTrace();
            }
        }
        byte[] bArr2 = crashDetailBean.f7770U;
        if (bArr2 != null && bArr2.length > 0) {
            if (bbVar.f8115q == null) {
                bbVar.f8115q = new ArrayList<>();
            }
            bbVar.f8115q.add(new C3337ba((byte) 1, "userExtraByteData", crashDetailBean.f7770U));
            C3321an.m8355c("attach extraData", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        bbVar.f8116r = hashMap;
        hashMap.put("A9", "" + crashDetailBean.f7752C);
        bbVar.f8116r.put("A11", "" + crashDetailBean.f7753D);
        bbVar.f8116r.put("A10", "" + crashDetailBean.f7754E);
        bbVar.f8116r.put("A23", "" + crashDetailBean.f7778f);
        bbVar.f8116r.put("A7", "" + aVar.f7688l);
        bbVar.f8116r.put("A6", "" + aVar.mo38176s());
        bbVar.f8116r.put("A5", "" + aVar.mo38175r());
        bbVar.f8116r.put("A22", "" + aVar.mo38165h());
        bbVar.f8116r.put("A2", "" + crashDetailBean.f7756G);
        bbVar.f8116r.put("A1", "" + crashDetailBean.f7755F);
        bbVar.f8116r.put("A24", "" + aVar.f7690n);
        bbVar.f8116r.put("A17", "" + crashDetailBean.f7757H);
        bbVar.f8116r.put("A3", "" + aVar.mo38168k());
        bbVar.f8116r.put("A16", "" + aVar.mo38170m());
        bbVar.f8116r.put("A25", "" + aVar.mo38171n());
        bbVar.f8116r.put("A14", "" + aVar.mo38169l());
        bbVar.f8116r.put("A15", "" + aVar.mo38180w());
        bbVar.f8116r.put("A13", "" + aVar.mo38181x());
        bbVar.f8116r.put("A34", "" + crashDetailBean.f7750A);
        if (aVar.f7623D != null) {
            bbVar.f8116r.put("productIdentify", "" + aVar.f7623D);
        }
        try {
            bbVar.f8116r.put("A26", "" + URLEncoder.encode(crashDetailBean.f7758I, "utf-8"));
        } catch (UnsupportedEncodingException e7) {
            e7.printStackTrace();
        }
        if (crashDetailBean.f7774b == 1) {
            bbVar.f8116r.put("A27", "" + crashDetailBean.f7761L);
            bbVar.f8116r.put("A28", "" + crashDetailBean.f7760K);
            bbVar.f8116r.put("A29", "" + crashDetailBean.f7783k);
        }
        bbVar.f8116r.put("A30", "" + crashDetailBean.f7762M);
        bbVar.f8116r.put("A18", "" + crashDetailBean.f7763N);
        Map<String, String> map4 = bbVar.f8116r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(!crashDetailBean.f7764O);
        map4.put("A36", sb2.toString());
        bbVar.f8116r.put("F02", "" + aVar.f7699w);
        bbVar.f8116r.put("F03", "" + aVar.f7700x);
        bbVar.f8116r.put("F04", "" + aVar.mo38159e());
        bbVar.f8116r.put("F05", "" + aVar.f7701y);
        bbVar.f8116r.put("F06", "" + aVar.f7698v);
        bbVar.f8116r.put("F08", "" + aVar.f7621B);
        bbVar.f8116r.put("F09", "" + aVar.f7622C);
        bbVar.f8116r.put("F10", "" + aVar.f7702z);
        if (crashDetailBean.f7766Q >= 0) {
            bbVar.f8116r.put("C01", "" + crashDetailBean.f7766Q);
        }
        if (crashDetailBean.f7767R >= 0) {
            bbVar.f8116r.put("C02", "" + crashDetailBean.f7767R);
        }
        Map<String, String> map5 = crashDetailBean.f7768S;
        if (map5 != null && map5.size() > 0) {
            for (Map.Entry<String, String> entry3 : crashDetailBean.f7768S.entrySet()) {
                bbVar.f8116r.put("C03_" + entry3.getKey(), entry3.getValue());
            }
        }
        Map<String, String> map6 = crashDetailBean.f7769T;
        if (map6 != null && map6.size() > 0) {
            for (Map.Entry<String, String> entry4 : crashDetailBean.f7769T.entrySet()) {
                bbVar.f8116r.put("C04_" + entry4.getKey(), entry4.getValue());
            }
        }
        bbVar.f8117s = null;
        Map<String, String> map7 = crashDetailBean.f7765P;
        if (map7 != null && map7.size() > 0) {
            Map<String, String> map8 = crashDetailBean.f7765P;
            bbVar.f8117s = map8;
            C3321an.m8349a("setted message size %d", Integer.valueOf(map8.size()));
        }
        Object[] objArr2 = new Object[12];
        objArr2[0] = crashDetailBean.f7786n;
        objArr2[1] = crashDetailBean.f7775c;
        objArr2[2] = aVar.mo38159e();
        objArr2[3] = Long.valueOf((crashDetailBean.f7790r - crashDetailBean.f7763N) / 1000);
        objArr2[4] = Boolean.valueOf(crashDetailBean.f7783k);
        objArr2[5] = Boolean.valueOf(crashDetailBean.f7764O);
        objArr2[6] = Boolean.valueOf(crashDetailBean.f7782j);
        if (crashDetailBean.f7774b == 1) {
            z = true;
        }
        objArr2[7] = Boolean.valueOf(z);
        objArr2[8] = Integer.valueOf(crashDetailBean.f7792t);
        objArr2[9] = crashDetailBean.f7791s;
        objArr2[10] = Boolean.valueOf(crashDetailBean.f7776d);
        objArr2[11] = Integer.valueOf(bbVar.f8116r.size());
        C3321an.m8355c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", objArr2);
        return bbVar;
    }

    /* renamed from: a */
    public static C3339bc m8122a(Context context, List<CrashDetailBean> list, C3269a aVar) {
        if (context == null || list == null || list.size() == 0 || aVar == null) {
            C3321an.m8356d("enEXPPkg args == null!", new Object[0]);
            return null;
        }
        C3339bc bcVar = new C3339bc();
        bcVar.f8121a = new ArrayList<>();
        for (CrashDetailBean crashDetailBean : list) {
            bcVar.f8121a.add(m8121a(context, crashDetailBean, aVar));
        }
        return bcVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC, Splitter:B:35:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.bugly.proguard.C3337ba m8120a(java.lang.String r6, android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.C3285b.m8120a(java.lang.String, android.content.Context, java.lang.String):com.tencent.bugly.proguard.ba");
    }

    /* renamed from: a */
    public static void m8123a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C3269a b = C3269a.m7966b();
        if (b != null) {
            C3321an.m8357e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
            C3321an.m8357e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
            C3321an.m8357e("# PKG NAME: %s", b.f7680d);
            C3321an.m8357e("# APP VER: %s", b.f7692p);
            C3321an.m8357e("# LAUNCH TIME: %s", C3325ap.m8392a(new Date(C3269a.m7966b().f7646a)));
            C3321an.m8357e("# CRASH TYPE: %s", str);
            C3321an.m8357e("# CRASH TIME: %s", str2);
            C3321an.m8357e("# CRASH PROCESS: %s", str3);
            C3321an.m8357e("# CRASH THREAD: %s", str4);
            if (crashDetailBean != null) {
                C3321an.m8357e("# REPORT ID: %s", crashDetailBean.f7775c);
                Object[] objArr = new Object[2];
                objArr[0] = b.f7689m;
                objArr[1] = b.mo38181x().booleanValue() ? "ROOTED" : "UNROOT";
                C3321an.m8357e("# CRASH DEVICE: %s %s", objArr);
                C3321an.m8357e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f7752C), Long.valueOf(crashDetailBean.f7753D), Long.valueOf(crashDetailBean.f7754E));
                C3321an.m8357e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f7755F), Long.valueOf(crashDetailBean.f7756G), Long.valueOf(crashDetailBean.f7757H));
                if (!C3325ap.m8404a(crashDetailBean.f7761L)) {
                    C3321an.m8357e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f7761L, crashDetailBean.f7760K);
                } else if (crashDetailBean.f7774b == 3) {
                    Object[] objArr2 = new Object[1];
                    if (crashDetailBean.f7765P == null) {
                        str6 = "null";
                    } else {
                        str6 = "" + crashDetailBean.f7765P.get("BUGLY_CR_01");
                    }
                    objArr2[0] = str6;
                    C3321an.m8357e("# EXCEPTION ANR MESSAGE:\n %s", objArr2);
                }
            }
            if (!C3325ap.m8404a(str5)) {
                C3321an.m8357e("# CRASH STACK: ", new Object[0]);
                C3321an.m8357e(str5, new Object[0]);
            }
            C3321an.m8357e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
        }
    }
}
