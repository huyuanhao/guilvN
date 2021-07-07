package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hianalytics.log.p034g.C1103f;
import com.p118pd.sdk.C8552oo00OoOo;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;

/* renamed from: com.pd.sdk.oo00oOOo  reason: case insensitive filesystem */
public final class C8569oo00oOOo {
    public static int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Context f21673OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile OooO00o f21674OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8569oo00oOOo f21675OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f21676OooO00o;

    /* renamed from: com.pd.sdk.oo00oOOo$OooO00o */
    public static class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        private void OooO00o() {
            if (C8560oo00o00O.OooO00o(C8569oo00oOOo.f21673OooO00o)) {
                if (C8560oo00o00O.m20214OooO00o(C8569oo00oOOo.f21676OooO00o + C8552oo00OoOo.OooO00o.OooO0OO)) {
                    C8549oo00Oo0o.OooO0Oo().OooO00o(new C8577oo00oo0o(C8569oo00oOOo.f21673OooO00o, C8561oo00o0o0.OooO00o(C8569oo00oOOo.f21673OooO00o, true, false), C8569oo00oOOo.f21676OooO00o));
                }
            }
        }

        public void handleMessage(Message message) {
            if (6 == message.what) {
                OooO00o();
            }
        }
    }

    public static C8569oo00oOOo OooO00o() {
        C8569oo00oOOo oo00oooo;
        synchronized (C8569oo00oOOo.class) {
            if (f21675OooO00o == null) {
                f21675OooO00o = new C8569oo00oOOo();
            }
            oo00oooo = f21675OooO00o;
        }
        return oo00oooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20218OooO00o() {
        f21673OooO00o = null;
    }

    public static void OooO00o(int i, String str, String str2, String str3) {
        String str4;
        if (f21673OooO00o == null) {
            str4 = "No init of logServer";
        } else if (m20219OooO00o(str2, str3)) {
            str4 = "tag or msg Parameter error!";
        } else if (OooO00o(i)) {
            C8549oo00Oo0o.OooO0OO().OooO00o(new C1103f(new C8554oo00Ooo0(str, str2, str3), null, f21676OooO00o));
            return;
        } else {
            AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "levelInt < Specified level for write log");
            return;
        }
        AbstractC8536oo00OO0O.OooO0Oo("AppLogApiImpl", str4);
    }

    public static void OooO00o(String str, String str2) {
        String OooO00o2 = C8591oo0O00O.OooO00o("logClintID", str, "[a-zA-Z0-9_]{1,256}", "");
        if (!C8591oo0O00O.OooO00o("logClintKey", str2, 4096)) {
            str2 = "";
        }
        AbstractC8456oOooOoo0.OooO00o(OooO00o2);
        AbstractC8456oOooOoo0.OooO0O0(str2);
    }

    @TargetApi(18)
    public static void OooO00o(String str, String str2, String str3, Bundle bundle) {
        if (f21673OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "No init of SDK logServer");
        } else if (!C8591oo0O00O.OooO00o(Constants.KEY_ERROR_CODE, str3, 256)) {
            AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "This method is stopped from execution due to a parameter error");
        } else {
            if (bundle == null) {
                AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "bundle is null");
                bundle = new Bundle();
            }
            if (m20219OooO00o(str, str2)) {
                AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "This method is stopped from execution due to a parameter error");
                return;
            }
            bundle.putString("MetaData", C8591oo0O00O.OooO00o("metaData", bundle.getString("MetaData"), UMModuleRegister.PUSH_EVENT_VALUE_HIGH) ? bundle.getString("MetaData") : "");
            OooO00o(6, ExifInterface.o000oo00, str, str2);
            bundle.putString("Eventid", str3);
            C8574oo00oo0 oo00oo0 = new C8574oo00oo0(bundle, "eventinfo.log", f21676OooO00o + C8552oo00OoOo.OooO00o.OooO0O0);
            C8549oo00Oo0o OooO0OO = C8549oo00Oo0o.OooO0OO();
            OooO0OO.OooO00o(oo00oo0);
            String OooO00o2 = C8561oo00o0o0.OooO00o(f21673OooO00o, false, C8907ooOO0Oo0.OooO00o.equals(str));
            if (f21674OooO00o != null) {
                OooO0OO.OooO00o(new C8572oo00oOoo(OooO00o2, f21674OooO00o, f21676OooO00o));
            }
        }
    }

    public static boolean OooO00o(int i) {
        return i >= OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20219OooO00o(String str, String str2) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 256 && str2.length() <= 20480) {
            z = true;
        }
        return !z;
    }

    public static boolean OooO00o(File[] fileArr) {
        for (File file : fileArr) {
            if ("eventinfo.log".equals(file.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0O0() {
        AbstractRunnableC8546oo00Oo0 oo00oo0;
        C8549oo00Oo0o oo00oo0o;
        if (C8560oo00o00O.OooO0O0(f21673OooO00o) && C8560oo00o00O.OooO00o(f21673OooO00o)) {
            String str = f21676OooO00o + C8552oo00OoOo.OooO00o.OooO0OO;
            File file = new File(f21676OooO00o + C8552oo00OoOo.OooO00o.OooO0O0);
            if (!file.exists()) {
                AbstractC8536oo00OO0O.OooO0OO("AppLogApiImpl", "checkUploadLog() No logs file");
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0 || listFiles.length > 5) {
                C8555oo00OooO.OooO00o(file);
                File[] listFiles2 = new File(str).listFiles();
                if (listFiles2 == null || listFiles2.length == 0) {
                    AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "No error log.");
                    return;
                }
                C8555oo00OooO.OooO00o(new File(f21676OooO00o + C8552oo00OoOo.OooO00o.OooO0Oo));
                oo00oo0 = new C8577oo00oo0o(f21673OooO00o, C8561oo00o0o0.OooO00o(f21673OooO00o, true, false), f21676OooO00o);
                oo00oo0o = C8549oo00Oo0o.OooO0Oo();
            } else if (OooO00o(listFiles)) {
                oo00oo0 = new C8572oo00oOoo(C8561oo00o0o0.OooO00o(f21673OooO00o, false, false), f21674OooO00o, f21676OooO00o);
                oo00oo0o = C8549oo00Oo0o.OooO0OO();
            } else {
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "No error log.");
                return;
            }
            oo00oo0o.OooO00o(oo00oo0);
        }
    }

    @TargetApi(18)
    public static void OooO0O0(Context context) {
        f21673OooO00o = context;
        f21676OooO00o = context.getFilesDir().getPath();
        if (TextUtils.isEmpty(AbstractC8453oOooOoOO.OooO0Oo())) {
            AbstractC8453oOooOoOO.OooO0Oo(context.getPackageName());
        }
        if (f21674OooO00o == null) {
            HandlerThread handlerThread = new HandlerThread(C8569oo00oOOo.class.getCanonicalName(), 10);
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            if (looper == null) {
                AbstractC8536oo00OO0O.OooO0Oo("AppLogApiImpl", "handler thread looper is null,send data over!");
                handlerThread.quitSafely();
                return;
            }
            f21674OooO00o = new OooO00o(looper);
        }
        OooO00o = AbstractC8456oOooOoo0.OooO00o();
    }

    public synchronized void OooO00o(Context context) {
        OooO0O0(context);
    }
}
