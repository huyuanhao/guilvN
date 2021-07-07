package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.taobao.accs.common.Constants;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOooo0o0  reason: case insensitive filesystem */
public class C8470oOooo0o0 implements Thread.UncaughtExceptionHandler {
    public static C8470oOooo0o0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21590OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8474oOoooO00 f21591OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21592OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Thread.UncaughtExceptionHandler f21593OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f21594OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21595OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f21596OooO00o = new String[0];
    public AbstractC8474oOoooO00 OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f21597OooO0O0 = "";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21598OooO0O0;

    public static C8470oOooo0o0 OooO00o() {
        C8470oOooo0o0 ooooo0o0;
        synchronized (C8470oOooo0o0.class) {
            if (OooO00o == null) {
                OooO00o = new C8470oOooo0o0();
            }
            ooooo0o0 = OooO00o;
        }
        return ooooo0o0;
    }

    private String OooO00o(Throwable th) {
        return OooO0OO(th);
    }

    private void OooO00o(Context context) {
        synchronized (C8470oOooo0o0.class) {
            if (this.f21590OooO00o == null) {
                this.f21590OooO00o = context;
                this.f21593OooO00o = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }
    }

    private boolean OooO00o(String str) {
        String[] strArr = {"java.io.FileNotFoundException", "java.sql.SQLException", "java.net.BindException", "java.util.ConcurrentModificationException", "javax.naming.InsufficientResourcesException", "java.util.MissingResourceException", "java.util.jar.JarException", "java.lang.OutOfMemoryError", "java.lang.StackOverflowError", "java.security.acl.NotOwnerException"};
        for (int i = 0; i < 10; i++) {
            if (str.equals(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    private String OooO0O0(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        Throwable cause = th.getCause();
        for (StackTraceElement stackTraceElement : cause != null ? cause.getStackTrace() : th.getStackTrace()) {
            stringBuffer.append(stackTraceElement.toString().trim());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    private void OooO0O0(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            this.f21594OooO00o.put(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            if (packageInfo != null) {
                this.f21594OooO00o.put(C8379oOoOoOo.OooOoo, packageInfo.versionName == null ? "null" : packageInfo.versionName);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC8536oo00OO0O.OooO0Oo(C8907ooOO0Oo0.OooO00o, "an error occured when collect package info,package name not found!");
        }
    }

    private String OooO0OO(Throwable th) {
        String name = th.getClass().getName();
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "crash error is Grey list");
        for (String str : this.f21596OooO00o) {
            if (name.equals(str)) {
                return "An exception occurred";
            }
        }
        if (!OooO00o(name)) {
            return "An exception occurred";
        }
        this.f21592OooO00o = name;
        this.f21597OooO0O0 = OooO0O0(th);
        return name + "\n" + this.f21597OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20131OooO00o() {
        AbstractC8536oo00OO0O.OooO0OO(C8907ooOO0Oo0.OooO00o, "crash log server unInit!");
        this.f21595OooO00o = false;
        this.f21596OooO00o = new String[0];
    }

    public void OooO00o(Context context, AbstractC8474oOoooO00 oooooo00) {
        this.f21591OooO00o = oooooo00;
        this.f21598OooO0O0 = true;
        OooO00o(context);
    }

    public void OooO00o(Context context, String[] strArr, AbstractC8474oOoooO00 oooooo00) {
        this.OooO0O0 = oooooo00;
        this.f21596OooO00o = (String[]) strArr.clone();
        this.f21595OooO00o = true;
        OooO00o(context);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20132OooO00o(Throwable th) {
        if (th == null) {
            return false;
        }
        OooO0O0(this.f21590OooO00o);
        String OooO00o2 = OooO00o(th);
        String str = this.f21594OooO00o.get(Constants.KEY_PACKAGE_NAME);
        String str2 = this.f21594OooO00o.get(C8379oOoOoOo.OooOoo);
        if (this.f21595OooO00o) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Constants.KEY_PACKAGE_NAME, str);
                jSONObject.put(C8379oOoOoOo.OooOoo, str2);
                jSONObject.put("errStack", OooO00o2.replaceAll("(\r\n|\r|\n|\n\r)", " "));
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO(C8907ooOO0Oo0.OooO00o, "logManager handlerExc json put error!");
            }
            this.OooO0O0.OooO00o(jSONObject);
        }
        if (!this.f21598OooO0O0) {
            return true;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("_crash_class", this.f21592OooO00o);
            jSONObject2.put("_crash_stack", this.f21597OooO0O0);
        } catch (JSONException unused2) {
            AbstractC8536oo00OO0O.OooO0OO(C8907ooOO0Oo0.OooO00o, "eventManager handlerEx json put error!");
        }
        this.f21591OooO00o.OooO00o(jSONObject2);
        this.f21592OooO00o = "";
        this.f21597OooO0O0 = "";
        return true;
    }

    public void OooO0O0() {
        this.f21598OooO0O0 = false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f21593OooO00o != null) {
            if (this.f21590OooO00o != null) {
                AbstractC8536oo00OO0O.OooO0Oo(C8907ooOO0Oo0.OooO00o, "uncaughtException.");
                if (m20132OooO00o(th)) {
                    AbstractC8536oo00OO0O.OooO0Oo(C8907ooOO0Oo0.OooO00o, "Throwable is doing.");
                }
            }
            this.f21593OooO00o.uncaughtException(thread, th);
        }
    }
}
