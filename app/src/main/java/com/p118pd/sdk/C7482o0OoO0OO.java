package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.pd.sdk.o0OoO0OO  reason: case insensitive filesystem */
public class C7482o0OoO0OO {
    public static final String OooOO0O = "net";
    public static final String OooOO0o = "biz";
    public static final String OooOOO = "auth";
    public static final String OooOOO0 = "cp";
    public static final String OooOOOO = "third";
    public static final String OooOOOo = "tid";
    public static final String OooOOo = "GetApdidEx";
    public static final String OooOOo0 = "FormatResultEx";
    public static final String OooOOoo = "GetApdidNull";
    public static final String OooOo = "GetInstalledPackagesEx";
    public static final String OooOo0 = "GetUtdidEx";
    public static final String OooOo00 = "GetApdidTimeout";
    public static final String OooOo0O = "GetPackageInfoEx";
    public static final String OooOo0o = "NotIncludeSignatures";
    public static final String OooOoO = "H5PayNetworkError";
    public static final String OooOoO0 = "GetPublicKeyFromSignEx";
    public static final String OooOoOO = "H5AuthNetworkError";
    public static final String OooOoo = "SSLProceed";
    public static final String OooOoo0 = "SSLError";
    public static final String OooOooO = "SSLDenied";
    public static final String OooOooo = "H5PayDataAnalysisError";
    public static final String Oooo = "CheckClientSignEx";
    public static final String Oooo0 = "TriDesEncryptError";
    public static final String Oooo000 = "H5AuthDataAnalysisError";
    public static final String Oooo00O = "PublicKeyUnmatch";
    public static final String Oooo00o = "ClientBindFailed";
    public static final String Oooo0O0 = "TriDesDecryptError";
    public static final String Oooo0OO = "ClientBindException";
    public static final String Oooo0o = "ClientBindServiceFailed";
    public static final String Oooo0o0 = "SaveTradeTokenError";
    public static final String Oooo0oO = "BindWaitTimeoutEx";
    public static final String Oooo0oo = "CheckClientExistEx";
    public static final String OoooO = "StartLaunchAppTransEx";
    public static final String OoooO0 = "ParserTidClientKeyEx";
    public static final String OoooO00 = "GetInstalledAppEx";
    public static final String OoooO0O = "GetInstalledAppEx";
    public static final String OoooOO0 = "CheckLaunchAppExistEx";
    public static final String OoooOOO = "LogCurrentQueryTime";
    public static final String OoooOOo = "LogCalledPackage";
    public static final String OoooOo0 = "LogBindCalledH5";
    public static final String OoooOoO = "LogCalledH5";
    public static final String OoooOoo = "LogHkLoginByIntent";
    public static final String Ooooo00 = "SchemePayWrongHashEx";
    public static final String Ooooo0o = "LogAppLaunchSwitchEnabled";
    public static final String OooooO0 = "H5CbUrlEmpty";
    public static final String OooooOO = "H5CbEx";
    public static final String OooooOo = "BuildSchemePayUriError";
    public static final String Oooooo = "JSONEx";
    public static final String Oooooo0 = "StartActivityEx";
    public static final String OoooooO = "ParseBundleSerializableError";
    public static final String Ooooooo = "ParseSchemeQueryError";
    public static final String o000oOoO = "LogCurrentAppLaunchSwitch";
    public static final String o00O0O = "out_trade_no";
    public static final String o00Oo0 = "trade_no";
    public static final String o0OoOo0 = "tid_context_null";
    public static final String ooOO = "partner";
    public String OooO = "";
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public String OooO0oO;
    public String OooO0oo;
    public String OooOO0;

    public C7482o0OoO0OO(Context context) {
        context = context != null ? context.getApplicationContext() : context;
        this.OooO00o = OooO00o();
        this.OooO0OO = OooO00o(context);
        this.OooO0Oo = OooO0O0();
        this.OooO0o0 = OooO0OO();
        this.OooO0o = OooO0O0(context);
        this.OooO0oO = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.OooO0oo = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.OooOO0 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    private String OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("[", "【").replace("]", "】").replace(C3848l.f10401s, "（").replace(C3848l.f10402t, "）").replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "，").replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, C8932ooOOO0o.OooO0Oo).replace("^", Constants.WAVE_SEPARATOR);
    }

    private String OooO0OO(String str) {
        String str2;
        String[] split = str.split("&");
        String str3 = null;
        if (split != null) {
            String str4 = null;
            for (String str5 : split) {
                String[] split2 = str5.split(C8932ooOOO0o.OooO0Oo);
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase(ooOO)) {
                        split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(o00O0O)) {
                        str3 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(o00Oo0)) {
                        str4 = split2[1].replace("\"", "");
                    }
                }
            }
            str2 = str3;
            str3 = str4;
        } else {
            str2 = null;
        }
        String OooO0O02 = OooO0O0(str3);
        String OooO0O03 = OooO0O0(str2);
        return String.format("%s,%s,-,%s,-,-,-", OooO0O02, OooO0O03, OooO0O0(OooO0O03));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19108OooO00o() {
        return TextUtils.isEmpty(this.OooO);
    }

    public void OooO00o(String str, String str2, Throwable th) {
        OooO00o(str, str2, OooO00o(th));
    }

    private String OooO0O0() {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-", OooO0O0("15.6.8"), OooO0O0("h.a.3.6.8"));
    }

    public void OooO00o(String str, String str2, Throwable th, String str3) {
        OooO00o(str, str2, OooO00o(th), str3);
    }

    public void OooO00o(String str, String str2, String str3, String str4) {
        String str5 = "";
        if (!TextUtils.isEmpty(this.OooO)) {
            str5 = str5 + "^";
        }
        this.OooO += (str5 + String.format("%s,%s,%s,%s", str, str2, OooO0O0(str3), str4));
    }

    private String OooO0O0(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", OooO0O0(C7520o0Ooo0O0.OooO0O0(context)), "android", OooO0O0(Build.VERSION.RELEASE), OooO0O0(Build.MODEL), Constants.ACCEPT_TIME_SEPARATOR_SERVER, OooO0O0(C7520o0Ooo0O0.m19173OooO00o(context).OooO00o()), OooO0O0(C7520o0Ooo0O0.OooO00o(context).mo4245b()), "gw", OooO0O0(C7520o0Ooo0O0.m19173OooO00o(context).OooO0O0()));
    }

    public void OooO00o(String str, String str2, String str3) {
        OooO00o(str, str2, str3, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    private String OooO00o(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(Constants.COLON_SEPARATOR);
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (int i = 0; i < stackTrace.length; i++) {
                    stringBuffer.append(stackTrace[i].toString() + " 》 ");
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    private String OooO0OO() {
        return String.format("%s,%s,-,-,-", OooO0O0(C7518o0Ooo00o.OooO00o(C7515o0Ooo00.OooO00o().m19156OooO00o()).m19163OooO00o()), OooO0O0(C7515o0Ooo00.OooO00o().m19158OooO00o()));
    }

    public String OooO00o(String str) {
        if (m19108OooO00o()) {
            return "";
        }
        String OooO0OO2 = OooO0OO(str);
        this.OooO0O0 = OooO0OO2;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.OooO00o, OooO0OO2, this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, this.OooO, this.OooOO0);
    }

    @SuppressLint({"SimpleDateFormat"})
    private String OooO00o() {
        return String.format("123456789,%s", new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    private String OooO00o(Context context) {
        String str;
        String str2;
        String str3 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                str2 = applicationContext.getPackageName();
                try {
                    str3 = applicationContext.getPackageManager().getPackageInfo(str2, 0).versionName;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str2 = str3;
            }
            str = str3;
            str3 = str2;
        } else {
            str = str3;
        }
        return String.format("%s,%s,-,-,-", str3, str);
    }
}
