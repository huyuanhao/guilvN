package com.tencent.bugly.crashreport.biz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.proguard.AbstractC3306ad;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.message.proguard.C3848l;
import java.util.List;

/* renamed from: com.tencent.bugly.crashreport.biz.a */
public class C3259a {

    /* renamed from: a */
    public Context f7585a;

    /* renamed from: b */
    public long f7586b;

    /* renamed from: c */
    public int f7587c;

    /* renamed from: d */
    public boolean f7588d = true;

    /* renamed from: com.tencent.bugly.crashreport.biz.a$a */
    public class RunnableC3262a implements Runnable {

        /* renamed from: b */
        public boolean f7593b;

        /* renamed from: c */
        public UserInfoBean f7594c;

        public RunnableC3262a(UserInfoBean userInfoBean, boolean z) {
            this.f7594c = userInfoBean;
            this.f7593b = z;
        }

        /* renamed from: a */
        private void m7922a(UserInfoBean userInfoBean) {
            C3269a b;
            if (userInfoBean != null && (b = C3269a.m7966b()) != null) {
                userInfoBean.f7575j = b.mo38159e();
            }
        }

        public void run() {
            try {
                if (this.f7594c != null) {
                    m7922a(this.f7594c);
                    C3321an.m8355c("[UserInfo] Record user info.", new Object[0]);
                    C3259a.this.m7906a((C3259a) this.f7594c, (UserInfoBean) false);
                }
                if (this.f7593b) {
                    C3259a.this.mo38104b();
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.biz.a$b */
    public class RunnableC3263b implements Runnable {
        public RunnableC3263b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < C3259a.this.f7586b) {
                C3319am.m8340a().mo38399a(new RunnableC3263b(), (C3259a.this.f7586b - currentTimeMillis) + WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                return;
            }
            C3259a.this.mo38101a(3, false, 0L);
            C3259a.this.mo38100a();
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.biz.a$c */
    public class RunnableC3264c implements Runnable {

        /* renamed from: b */
        public long f7597b = 21600000;

        public RunnableC3264c(long j) {
            this.f7597b = j;
        }

        public void run() {
            C3259a.this.mo38104b();
            C3259a.this.mo38105b(this.f7597b);
        }
    }

    public C3259a(Context context, boolean z) {
        this.f7585a = context;
        this.f7588d = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m7910c() {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.biz.C3259a.m7910c():void");
    }

    /* renamed from: b */
    public void mo38105b(long j) {
        C3319am.m8340a().mo38399a(new RunnableC3264c(j), j);
    }

    /* renamed from: a */
    public static UserInfoBean m7905a(Context context, int i) {
        C3269a a = C3269a.m7965a(context);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f7567b = i;
        userInfoBean.f7568c = a.f7681e;
        userInfoBean.f7569d = a.mo38163g();
        userInfoBean.f7570e = System.currentTimeMillis();
        userInfoBean.f7571f = -1;
        userInfoBean.f7579n = a.f7692p;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        userInfoBean.f7580o = i2;
        userInfoBean.f7577l = a.mo38149a();
        userInfoBean.f7578m = a.f7698v;
        userInfoBean.f7572g = a.f7699w;
        userInfoBean.f7573h = a.f7700x;
        userInfoBean.f7574i = a.f7701y;
        userInfoBean.f7576k = a.f7702z;
        userInfoBean.f7583r = a.mo38126B();
        userInfoBean.f7584s = a.mo38131G();
        userInfoBean.f7581p = a.mo38132H();
        userInfoBean.f7582q = a.mo38133I();
        return userInfoBean;
    }

    /* renamed from: b */
    public void mo38104b() {
        C3319am a = C3319am.m8340a();
        if (a != null) {
            a.mo38398a(new Runnable() {
                /* class com.tencent.bugly.crashreport.biz.C3259a.RunnableC32612 */

                public void run() {
                    try {
                        C3259a.this.m7910c();
                    } catch (Throwable th) {
                        C3321an.m8350a(th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo38101a(int i, boolean z, long j) {
        C3272a a = C3272a.m8069a();
        if (a == null || a.mo38194c().f7715h || i == 1 || i == 3) {
            if (i == 1 || i == 3) {
                this.f7587c++;
            }
            C3319am.m8340a().mo38399a(new RunnableC3262a(m7905a(this.f7585a, i), z), j);
            return;
        }
        C3321an.m8357e("UserInfo is disable", new Object[0]);
    }

    /* renamed from: a */
    public void mo38102a(long j) {
        C3319am.m8340a().mo38399a(new RunnableC3262a(null, true), j);
    }

    /* renamed from: a */
    public void mo38100a() {
        this.f7586b = C3325ap.m8412b() + 86400000;
        C3319am.m8340a().mo38399a(new RunnableC3263b(), (this.f7586b - System.currentTimeMillis()) + WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m7906a(UserInfoBean userInfoBean, boolean z) {
        List<UserInfoBean> a;
        if (userInfoBean != null) {
            if (z || userInfoBean.f7567b == 1 || (a = mo38099a(C3269a.m7965a(this.f7585a).f7681e)) == null || a.size() < 20) {
                long a2 = C3307ae.m8249a().mo38340a("t_ui", mo38097a(userInfoBean), (AbstractC3306ad) null, true);
                if (a2 >= 0) {
                    C3321an.m8355c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(a2));
                    userInfoBean.f7566a = a2;
                    return;
                }
                return;
            }
            C3321an.m8349a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(a.size()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3 A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.bugly.crashreport.biz.UserInfoBean> mo38099a(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.biz.C3259a.mo38099a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public void mo38103a(List<UserInfoBean> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < list.size() && i < 50) {
                sb.append(" or ");
                sb.append(C3848l.f10389g);
                sb.append(" = ");
                sb.append(list.get(i).f7566a);
                i++;
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                sb2 = sb2.substring(4);
            }
            sb.setLength(0);
            try {
                C3321an.m8355c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C3307ae.m8249a().mo38339a("t_ui", sb2, (String[]) null, (AbstractC3306ad) null, true)));
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public ContentValues mo38097a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (userInfoBean.f7566a > 0) {
                contentValues.put(C3848l.f10389g, Long.valueOf(userInfoBean.f7566a));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f7570e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f7571f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f7567b));
            contentValues.put("_pc", userInfoBean.f7568c);
            contentValues.put("_dt", C3325ap.m8407a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public UserInfoBean mo38098a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j = cursor.getLong(cursor.getColumnIndex(C3848l.f10389g));
            UserInfoBean userInfoBean = (UserInfoBean) C3325ap.m8385a(blob, UserInfoBean.CREATOR);
            if (userInfoBean != null) {
                userInfoBean.f7566a = j;
            }
            return userInfoBean;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }
}
