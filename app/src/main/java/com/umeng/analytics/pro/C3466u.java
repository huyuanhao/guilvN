package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.u */
public class C3466u {

    /* renamed from: c */
    public static volatile C3466u f8793c;

    /* renamed from: a */
    public AbstractC3464s f8794a = new C3465t();

    /* renamed from: b */
    public String f8795b;

    /* renamed from: d */
    public List<AbstractC3467a> f8796d;

    /* renamed from: e */
    public String f8797e;

    /* renamed from: com.umeng.analytics.pro.u$a */
    public interface AbstractC3467a {
        /* renamed from: a */
        void mo38772a(String str, long j, long j2);

        /* renamed from: a */
        void mo38773a(String str, String str2, long j, long j2);
    }

    /* renamed from: a */
    public static C3466u m8916a() {
        if (f8793c == null) {
            synchronized (C3466u.class) {
                if (f8793c == null) {
                    f8793c = new C3466u();
                }
            }
        }
        return f8793c;
    }

    /* renamed from: f */
    private String m8918f(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(C3460q.f8780d, mo38796d(context));
            edit.commit();
        } catch (Exception unused) {
        }
        long h = m8920h(context);
        long i = m8921i(context);
        String str = this.f8795b;
        m8917a(i, h, str, false);
        this.f8795b = this.f8794a.mo38784a(context);
        m8917a(i, h, str, true);
        this.f8794a.mo38786a(context, this.f8795b);
        return this.f8795b;
    }

    /* renamed from: g */
    private boolean m8919g(Context context) {
        if (!TextUtils.isEmpty(this.f8795b) && C3437g.m8754a(context).mo38700a(this.f8795b) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private long m8920h(Context context) {
        return m8915a(context, C3460q.f8782f);
    }

    /* renamed from: i */
    private long m8921i(Context context) {
        return m8915a(context, C3460q.f8777a);
    }

    /* renamed from: j */
    private boolean m8922j(Context context) {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext(context));
            long j = sharedPreferences.getLong(C3460q.f8781e, 0);
            long j2 = sharedPreferences.getLong(C3460q.f8782f, 0);
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j2 - j));
            return this.f8794a.mo38787a(j, j2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long mo38792b() {
        return this.f8794a.mo38783a();
    }

    /* renamed from: c */
    public String mo38795c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f8795b = m8918f(appContext);
        } catch (Exception unused) {
        }
        return this.f8795b;
    }

    /* renamed from: d */
    public String mo38796d(Context context) {
        if (TextUtils.isEmpty(this.f8795b)) {
            try {
                this.f8795b = PreferenceWrapper.getDefault(context).getString(C3460q.f8779c, null);
            } catch (Exception unused) {
            }
        }
        return this.f8795b;
    }

    /* renamed from: e */
    public boolean mo38797e(Context context) {
        if (TextUtils.isEmpty(this.f8795b)) {
            this.f8795b = mo38796d(context);
        }
        return TextUtils.isEmpty(this.f8795b) || m8922j(context) || m8919g(context);
    }

    /* renamed from: b */
    public synchronized String mo38793b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f8795b = mo38796d(appContext);
        if (mo38797e(appContext)) {
            try {
                this.f8795b = m8918f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f8795b;
    }

    /* renamed from: a */
    public void mo38790a(long j) {
        this.f8794a.mo38785a(j);
    }

    /* renamed from: a */
    public String mo38788a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String str = "";
        try {
            synchronized (C3466u.class) {
                str = PreferenceWrapper.getDefault(appContext).getString(C3460q.f8780d, "");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: b */
    public void mo38794b(AbstractC3467a aVar) {
        List<AbstractC3467a> list;
        if (aVar != null && (list = this.f8796d) != null && list.size() != 0) {
            this.f8796d.remove(aVar);
        }
    }

    /* renamed from: a */
    public String mo38789a(Context context, long j) {
        if (TextUtils.isEmpty(this.f8797e)) {
            String str = "SUB" + j;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f8797e = sb.toString();
        }
        return this.f8797e;
    }

    /* renamed from: a */
    private long m8915a(Context context, String str) {
        long j;
        try {
            j = PreferenceWrapper.getDefault(context).getLong(str, 0);
        } catch (Exception unused) {
            j = 0;
        }
        return j <= 0 ? System.currentTimeMillis() : j;
    }

    /* renamed from: a */
    private void m8917a(long j, long j2, String str, boolean z) {
        List<AbstractC3467a> list = this.f8796d;
        if (list != null) {
            for (AbstractC3467a aVar : list) {
                if (z) {
                    try {
                        aVar.mo38773a(str, this.f8795b, j, j2);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo38772a(this.f8795b, j, j2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo38791a(AbstractC3467a aVar) {
        if (aVar != null) {
            if (this.f8796d == null) {
                this.f8796d = new ArrayList();
            }
            if (!this.f8796d.contains(aVar)) {
                this.f8796d.add(aVar);
            }
        }
    }
}
