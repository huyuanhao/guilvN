package com.umeng.message.common;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.C3847k;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.umeng.message.common.c */
public class C3779c {

    /* renamed from: a */
    public static final String f10116a = "com.umeng.message.common.c";

    /* renamed from: b */
    public static C3779c f10117b;

    /* renamed from: e */
    public static Class f10118e;

    /* renamed from: f */
    public static Class f10119f;

    /* renamed from: g */
    public static Class f10120g;

    /* renamed from: h */
    public static Class f10121h;

    /* renamed from: i */
    public static Class f10122i;

    /* renamed from: j */
    public static Class f10123j;

    /* renamed from: k */
    public static Class f10124k;

    /* renamed from: l */
    public static Class f10125l;

    /* renamed from: c */
    public Context f10126c;

    /* renamed from: d */
    public String f10127d;

    public C3779c(Context context) {
        this.f10126c = context.getApplicationContext();
        UMLog uMLog = UMConfigure.umDebugLog;
        String str = f10116a;
        UMLog.mutlInfo(str, 2, "packageName=" + this.f10126c.getPackageName());
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb.append(".R$drawable");
            f10119f = Class.forName(sb.toString());
        } catch (ClassNotFoundException e) {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e.getMessage());
            UMLog uMLog3 = UMConfigure.umDebugLog;
            UMLog.m9005aq(C3847k.f10378c, 0, "\\|");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb2.append(".R$layout");
            f10120g = Class.forName(sb2.toString());
        } catch (ClassNotFoundException e2) {
            UMLog uMLog4 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e2.getMessage());
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb3.append(".R$id");
            f10118e = Class.forName(sb3.toString());
        } catch (ClassNotFoundException e3) {
            UMLog uMLog5 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e3.getMessage());
        }
        try {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb4.append(".R$anim");
            f10121h = Class.forName(sb4.toString());
        } catch (ClassNotFoundException e4) {
            UMLog uMLog6 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e4.getMessage());
        }
        try {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb5.append(".R$style");
            f10122i = Class.forName(sb5.toString());
        } catch (ClassNotFoundException e5) {
            UMLog uMLog7 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e5.getMessage());
        }
        try {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb6.append(".R$string");
            f10123j = Class.forName(sb6.toString());
        } catch (ClassNotFoundException e6) {
            UMLog uMLog8 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e6.getMessage());
        }
        try {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb7.append(".R$array");
            f10124k = Class.forName(sb7.toString());
        } catch (ClassNotFoundException e7) {
            UMLog uMLog9 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e7.getMessage());
        }
        try {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(!TextUtils.isEmpty(PushAgent.getInstance(this.f10126c).getResourcePackageName()) ? PushAgent.getInstance(this.f10126c).getResourcePackageName() : this.f10126c.getPackageName());
            sb8.append(".R$raw");
            f10125l = Class.forName(sb8.toString());
        } catch (ClassNotFoundException e8) {
            UMLog uMLog10 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, e8.getMessage());
        }
    }

    /* renamed from: a */
    public static C3779c m10332a(Context context) {
        if (f10117b == null) {
            f10117b = new C3779c(context);
        }
        return f10117b;
    }

    /* renamed from: b */
    public int mo39731b(String str) {
        return m10331a(f10118e, str);
    }

    /* renamed from: c */
    public int mo39732c(String str) throws Exception {
        return m10333b(f10118e, str);
    }

    /* renamed from: d */
    public int mo39733d(String str) {
        return m10331a(f10119f, str);
    }

    /* renamed from: e */
    public int mo39734e(String str) {
        return m10331a(f10120g, str);
    }

    /* renamed from: f */
    public int mo39735f(String str) throws Exception {
        return m10333b(f10120g, str);
    }

    /* renamed from: g */
    public int mo39736g(String str) {
        return m10331a(f10122i, str);
    }

    /* renamed from: h */
    public int mo39737h(String str) {
        return m10331a(f10123j, str);
    }

    /* renamed from: i */
    public int mo39738i(String str) {
        return m10331a(f10124k, str);
    }

    /* renamed from: j */
    public int mo39739j(String str) {
        return m10331a(f10125l, str);
    }

    /* renamed from: k */
    public void mo39740k(String str) {
        this.f10127d = str;
    }

    /* renamed from: b */
    private int m10333b(Class<?> cls, String str) throws Exception {
        if (cls != null) {
            int i = cls.getField(str).getInt(str);
            UMLog uMLog = UMConfigure.umDebugLog;
            String str2 = f10116a;
            UMLog.mutlInfo(str2, 0, "getRes(" + cls.getName() + ", " + str + C3848l.f10402t);
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10116a, 0, "获取资源错误，确保你已经把res目录下的所有资源从SDK拷贝到了你的主工程");
            return i;
        }
        UMLog uMLog3 = UMConfigure.umDebugLog;
        String str3 = f10116a;
        UMLog.mutlInfo(str3, 0, "getRes(null," + str + C3848l.f10402t);
        throw new IllegalArgumentException("ResClass未初始化，请确保你已经添加了必要的资源。同时确保你在混淆文件中添加了" + this.f10126c.getPackageName() + ".R$* 。 field=" + str);
    }

    /* renamed from: a */
    public int mo39729a(String str) {
        return m10331a(f10121h, str);
    }

    /* renamed from: a */
    private int m10331a(Class<?> cls, String str) {
        if (cls != null) {
            try {
                return cls.getField(str).getInt(str);
            } catch (Exception e) {
                UMLog uMLog = UMConfigure.umDebugLog;
                String str2 = f10116a;
                UMLog.mutlInfo(str2, 0, "getRes(" + cls.getName() + ", " + str + C3848l.f10402t);
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10116a, 0, "获取资源错误，确保你已经把res目录下的所有资源从SDK拷贝到了你的主工程");
                UMLog uMLog3 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10116a, 0, e.getMessage());
                return -1;
            }
        } else {
            UMLog uMLog4 = UMConfigure.umDebugLog;
            String str3 = f10116a;
            UMLog.mutlInfo(str3, 0, "getRes(null," + str + C3848l.f10402t);
            throw new IllegalArgumentException("ResClass未初始化，请确保你已经添加了必要的资源。同时确保你在混淆文件中添加了" + this.f10126c.getPackageName() + ".R$* 。 field=" + str);
        }
    }

    /* renamed from: a */
    public String mo39730a() {
        if (TextUtils.isEmpty(this.f10127d)) {
            return this.f10126c.getPackageName();
        }
        return this.f10127d;
    }
}
