package com.p118pd.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebView;
import anet.channel.util.HttpConstant;
import com.alipay.sdk.app.EnumC0405k;
import com.alipay.sdk.app.EnvUtils;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0Oooo0o  reason: case insensitive filesystem */
public class C7531o0Oooo0o {
    public static final int OooO00o = 99;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20380OooO00o = "com.alipay.android.app";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f20381OooO00o = {"10.1.5.1013151", "10.1.5.1013148"};
    public static final int OooO0O0 = 125;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f20382OooO0O0 = "com.eg.android.AlipayGphone";
    public static final String OooO0OO = "com.eg.android.AlipayGphoneRC";

    /* renamed from: com.pd.sdk.o0Oooo0o$OooO00o */
    public static final class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final PackageInfo f20383OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f20384OooO00o;

        public OooO00o(PackageInfo packageInfo, int i, String str) {
            this.f20383OooO00o = packageInfo;
            this.OooO00o = i;
            this.f20384OooO00o = str;
        }

        public boolean OooO00o() {
            Signature[] signatureArr = this.f20383OooO00o.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String OooO0O0 = C7531o0Oooo0o.OooO0O0(signature.toByteArray());
                if (OooO0O0 != null && !TextUtils.equals(OooO0O0, this.f20384OooO00o)) {
                    C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.Oooo00O, String.format("Got %s, expected %s", OooO0O0, this.f20384OooO00o));
                    return true;
                }
            }
            return false;
        }

        public boolean OooO0O0() {
            return this.f20383OooO00o.versionCode < this.OooO00o;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Map<String, String> m19199OooO0O0(String str) {
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            String[] split = str.substring(indexOf + 1).split("&");
            for (String str2 : split) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), OooO0O0(str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static String OooO0OO() {
        String OooO0Oo = OooO0Oo();
        int indexOf = OooO0Oo.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (indexOf != -1) {
            OooO0Oo = OooO0Oo.substring(0, indexOf);
        }
        int indexOf2 = OooO0Oo.indexOf("\n");
        if (indexOf2 != -1) {
            OooO0Oo = OooO0Oo.substring(0, indexOf2);
        }
        return "Linux " + OooO0Oo;
    }

    /* JADX INFO: finally extract failed */
    public static String OooO0Oo() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String OooO0o(Context context) {
        return OooO0O0(context, context.getPackageName());
    }

    public static String OooO0o0(Context context) {
        return "-1;-1";
    }

    public static String OooO00o() {
        if (EnvUtils.m14975OooO00o()) {
            return OooO0OO;
        }
        try {
            return C7528o0OooOoo.f20379OooO00o.get(0).f20324OooO00o;
        } catch (Throwable unused) {
            return f20382OooO0O0;
        }
    }

    public static String OooO00o(String str) {
        return (!EnvUtils.m14975OooO00o() || !TextUtils.equals(str, OooO0OO)) ? "com.eg.android.AlipayGphone.IAlixPay" : "com.eg.android.AlipayGphoneRC.IAlixPay";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, String> m19194OooO00o(String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split("&");
        for (String str2 : split) {
            int indexOf = str2.indexOf(C8932ooOOO0o.OooO0Oo, 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static String OooO0OO(Context context) {
        DisplayMetrics OooO00o2 = OooO00o(context);
        return OooO00o2.widthPixels + "*" + OooO00o2.heightPixels;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static JSONObject m19195OooO00o(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String OooO0O0(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOooo, e);
            return "";
        }
    }

    public static String OooO0Oo(Context context) {
        String OooO00o2 = C7530o0Oooo0.OooO00o(context);
        return OooO00o2.substring(0, OooO00o2.indexOf(HttpConstant.SCHEME_SPLIT));
    }

    public static String OooO00o(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int i = 0;
            if (!TextUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, indexOf);
            }
            if (i < 1) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooO0O0(byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            C7477o0OoO0.OooO00o("auth", C7482o0OoO0OO.OooOoO0, e);
            return null;
        }
    }

    public static OooO00o OooO00o(Context context, List<C7486o0OoO0oO.OooO00o> list) {
        OooO00o OooO00o2;
        if (list == null) {
            return null;
        }
        for (C7486o0OoO0oO.OooO00o oooO00o : list) {
            if (oooO00o != null && (OooO00o2 = OooO00o(context, oooO00o.f20324OooO00o, oooO00o.OooO00o, oooO00o.OooO0O0)) != null && !OooO00o2.OooO00o() && !OooO00o2.OooO0O0()) {
                return OooO00o2;
            }
        }
        return null;
    }

    public static boolean OooO0O0(PackageInfo packageInfo) {
        String str = "";
        boolean z = false;
        if (packageInfo == null) {
            str = str + "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = str + "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = str + "info.signatures.length <= 0";
            } else {
                z = true;
            }
        }
        if (!z) {
            C7477o0OoO0.OooO00o("auth", C7482o0OoO0OO.OooOo0o, str);
        }
        return z;
    }

    public static OooO00o OooO00o(Context context, String str, int i, String str2) {
        PackageInfo packageInfo;
        if (EnvUtils.m14975OooO00o() && f20382OooO0O0.equals(str)) {
            str = OooO0OO;
        }
        try {
            packageInfo = OooO00o(context, str);
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o("auth", C7482o0OoO0OO.OooOo0O, th);
            packageInfo = null;
        }
        if (!OooO0O0(packageInfo)) {
            return null;
        }
        return OooO00o(packageInfo, i, str2);
    }

    public static PackageInfo OooO00o(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m19200OooO0O0(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(OooO00o(), 128);
            if (packageInfo != null && packageInfo.versionCode < 99) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
            return false;
        }
    }

    public static OooO00o OooO00o(PackageInfo packageInfo, int i, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new OooO00o(packageInfo, i, str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19196OooO00o(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo(f20380OooO00o, 128) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String OooO0O0() {
        return "Android " + Build.VERSION.RELEASE;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19197OooO00o(Context context, List<C7486o0OoO0oO.OooO00o> list) {
        try {
            for (C7486o0OoO0oO.OooO00o oooO00o : list) {
                if (oooO00o != null) {
                    String str = oooO00o.f20324OooO00o;
                    if (EnvUtils.m14975OooO00o() && f20382OooO0O0.equals(str)) {
                        str = OooO0OO;
                    }
                    try {
                        if (context.getPackageManager().getPackageInfo(str, 128) != null) {
                            return true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOO0, th);
            return false;
        }
    }

    public static String OooO0O0(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String OooO0O0(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOo0O, th);
            return "";
        }
    }

    public static boolean OooO00o(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            if (TextUtils.equals(str, f20381OooO00o[0]) || TextUtils.equals(str, f20381OooO00o[1])) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19192OooO00o(Context context) {
        String OooO0O02 = OooO0O0();
        String OooO0OO2 = OooO0OO();
        String OooO0O03 = OooO0O0(context);
        String OooO0OO3 = OooO0OO(context);
        return " (" + OooO0O02 + C7522o0Ooo0o.OooO0O0 + OooO0OO2 + C7522o0Ooo0o.OooO0O0 + OooO0O03 + C7522o0Ooo0o.OooO0O0 + C7522o0Ooo0o.OooO0O0 + OooO0OO3 + C3848l.f10402t + "(sdk android)";
    }

    public static DisplayMetrics OooO00o(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String OooO00o(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 65.0d))));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 97.0d))));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19198OooO00o(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19193OooO00o(Context context, String str) {
        String str2 = "";
        try {
            String str3 = str2;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getApplicationContext().getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    str3 = str3 + "#M";
                } else {
                    if (runningAppProcessInfo.processName.startsWith(str + Constants.COLON_SEPARATOR)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append("#");
                        sb.append(runningAppProcessInfo.processName.replace(str + Constants.COLON_SEPARATOR, str2));
                        str3 = sb.toString();
                    }
                }
            }
            str2 = str3;
        } catch (Throwable unused) {
        }
        if (str2.length() > 0) {
            str2 = str2.substring(1);
        }
        return str2.length() == 0 ? "N" : str2;
    }

    public static boolean OooO00o(WebView webView, String str, Activity activity) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (str.toLowerCase().startsWith(C7722o0ooOOO0.OooOO0.toLowerCase()) || str.toLowerCase().startsWith(C7722o0ooOOO0.OooOO0O.toLowerCase())) {
            try {
                OooO00o OooO00o2 = OooO00o((Context) activity, C7528o0OooOoo.f20379OooO00o);
                if (OooO00o2 != null && !OooO00o2.OooO0O0()) {
                    if (!OooO00o2.OooO00o()) {
                        if (str.startsWith("intent://platformapi/startapp")) {
                            str = str.replaceFirst("intent://platformapi/startapp\\?", C7722o0ooOOO0.OooOO0);
                        }
                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            return true;
        } else if (TextUtils.equals(str, C7722o0ooOOO0.OooOOO0) || TextUtils.equals(str, C7722o0ooOOO0.OooOOO)) {
            C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0O0());
            activity.finish();
            return true;
        } else if (!str.startsWith(C7722o0ooOOO0.OooOO0o)) {
            return false;
        } else {
            try {
                String substring = str.substring(str.indexOf(C7722o0ooOOO0.OooOO0o) + 24);
                int parseInt = Integer.parseInt(substring.substring(substring.lastIndexOf(C7722o0ooOOO0.OooOOOO) + 10));
                if (parseInt != EnumC0405k.SUCCEEDED.mo4240a()) {
                    if (parseInt != EnumC0405k.PAY_WAITTING.mo4240a()) {
                        EnumC0405k b = EnumC0405k.m832b(EnumC0405k.FAILED.mo4240a());
                        C7479o0OoO000.OooO00o(C7479o0OoO000.OooO00o(b.mo4240a(), b.mo4243b(), ""));
                        activity.runOnUiThread(new RunnableC7529o0Oooo(activity));
                        return true;
                    }
                }
                if (C7722o0ooOOO0.f20700OooO00o) {
                    StringBuilder sb = new StringBuilder();
                    String decode = URLDecoder.decode(str);
                    String decode2 = URLDecoder.decode(decode);
                    String str3 = decode2.substring(decode2.indexOf(C7722o0ooOOO0.OooOO0o) + 24, decode2.lastIndexOf(C7722o0ooOOO0.OooOOOO)).split(C7722o0ooOOO0.OooOOo0)[0];
                    int indexOf = decode.indexOf(C7722o0ooOOO0.OooOOo0) + 12;
                    sb.append(str3);
                    sb.append(C7722o0ooOOO0.OooOOo0);
                    sb.append(decode.substring(indexOf, decode.indexOf("&", indexOf)));
                    sb.append(decode.substring(decode.indexOf("&", indexOf)));
                    str2 = sb.toString();
                } else {
                    String decode3 = URLDecoder.decode(str);
                    str2 = decode3.substring(decode3.indexOf(C7722o0ooOOO0.OooOO0o) + 24, decode3.lastIndexOf(C7722o0ooOOO0.OooOOOO));
                }
                EnumC0405k b2 = EnumC0405k.m832b(parseInt);
                C7479o0OoO000.OooO00o(C7479o0OoO000.OooO00o(b2.mo4240a(), b2.mo4243b(), str2));
            } catch (Exception unused2) {
                C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0Oo());
            }
            activity.runOnUiThread(new RunnableC7529o0Oooo(activity));
            return true;
        }
    }
}
