package com.umeng.socialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.p118pd.sdk.C8932ooOOO0o;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.socialize.Config;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.cache.DplueCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class SocializeUtils {
    public static final String TAG = "SocializeUtils";
    public static Set<Uri> deleteUris = new HashSet();
    public static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Pattern mDoubleByte_Pattern = null;
    public static int smDip = 0;

    public static byte[] File2byte(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (FileNotFoundException e) {
            SLog.error(e);
            return null;
        } catch (IOException e2) {
            SLog.error(e2);
            return null;
        }
    }

    public static boolean assertBinaryInvalid(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static Map<String, String> bundleTomap(Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            if (str.equals("com.sina.weibo.intent.extra.USER_ICON")) {
                hashMap.put("icon_url", bundle.getString(str));
            }
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public static int countContentLength(String str) {
        int i;
        String trim = str.trim();
        int i2 = 0;
        while (getDoubleBytePattern().matcher(trim).find()) {
            i2++;
        }
        int length = trim.length() - i2;
        if (length % 2 != 0) {
            i = (length + 1) / 2;
        } else {
            i = length / 2;
        }
        return i2 + i;
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(C8932ooOOO0o.OooO0Oo);
                bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
            }
        }
        return bundle;
    }

    public static int dip2Px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String getAppkey(Context context) {
        Object obj;
        if (context == null) {
            return "";
        }
        String str = SocializeConstants.APPKEY;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (obj = applicationInfo.metaData.get("UMENG_APPKEY")) == null) {
                return str;
            }
            return obj.toString();
        } catch (Exception e) {
            SLog.error(e);
            return str;
        }
    }

    public static Pattern getDoubleBytePattern() {
        if (mDoubleByte_Pattern == null) {
            mDoubleByte_Pattern = Pattern.compile("[^\\x00-\\xff]");
        }
        return mDoubleByte_Pattern;
    }

    public static int[] getFloatWindowSize(Context context) {
        return context == null ? new int[2] : new int[]{580, TinkerReport.KEY_LOADED_PACKAGE_CHECK_SIGNATURE};
    }

    public static String hexdigest(String str) {
        try {
            return md5(str.getBytes());
        } catch (Exception e) {
            SLog.error(e);
            return null;
        }
    }

    public static Uri insertImage(Context context, String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            try {
                String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), str, "umeng_social_shareimg", (String) null);
                if (TextUtils.isEmpty(insertImage)) {
                    return null;
                }
                return Uri.parse(insertImage);
            } catch (Throwable th) {
                SLog.error(th);
            }
        }
        return null;
    }

    public static boolean isFloatWindowStyle(Context context) {
        if (context != null && SocializeConstants.SUPPORT_PAD) {
            if (smDip == 0) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                int width = defaultDisplay.getWidth();
                int height = defaultDisplay.getHeight();
                if (width > height) {
                    width = height;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                smDip = (int) ((((float) width) / displayMetrics.density) + 0.5f);
            }
            if ((context.getResources().getConfiguration().screenLayout & 15) < 3 || smDip < 550) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isHasDplusCache() {
        File filePath = DplueCache.getFilePath("s_e");
        File filePath2 = DplueCache.getFilePath("auth");
        File filePath3 = DplueCache.getFilePath("userinfo");
        File filePath4 = DplueCache.getFilePath("dau");
        File filePath5 = DplueCache.getFilePath("stats");
        return ((filePath == null || filePath.listFiles() == null || filePath.listFiles().length <= 0) && (filePath2 == null || filePath2.listFiles() == null || filePath2.listFiles().length <= 0) && ((filePath3 == null || filePath3.listFiles() == null || filePath3.listFiles().length <= 0) && ((filePath4 == null || filePath4.listFiles() == null || filePath4.listFiles().length <= 0) && (filePath5 == null || filePath5.listFiles() == null || filePath5.listFiles().length <= 0)))) ? false : true;
    }

    public static boolean isToday(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(System.currentTimeMillis()));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j));
        if (instance2.get(1) == instance.get(1) && instance2.get(6) - instance.get(6) == 0) {
            return true;
        }
        return false;
    }

    public static Map<String, String> jsonToMap(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next) + "");
            }
        } catch (Exception e) {
            SLog.error(e);
        }
        return hashMap;
    }

    public static Bundle mapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = hexDigits[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = hexDigits[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            SLog.error(e);
            return null;
        }
    }

    public static void openApplicationMarket(Context context, String str) throws Exception {
        if (Config.isJumptoAppStore) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            context.startActivity(intent);
        }
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static void safeCloseDialog(Dialog dialog) {
        if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            } catch (Exception e) {
                SLog.error(e);
            }
        }
    }

    public static void safeShowDialog(Dialog dialog) {
        if (dialog != null) {
            try {
                if (!dialog.isShowing()) {
                    dialog.show();
                }
            } catch (Exception e) {
                SLog.error(e);
            }
        }
    }
}
