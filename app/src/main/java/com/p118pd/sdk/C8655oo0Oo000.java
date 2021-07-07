package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0Oo000  reason: case insensitive filesystem */
public class C8655oo0Oo000 {
    public static final String OooO00o = "RNFileUtil";
    public static final String OooO0O0 = "url";
    public static final String OooO0OO = "version_size";
    public static final String OooO0Oo = "version";
    public static final String OooO0o = "/index.android.bundle";
    public static final String OooO0o0 = "download_version";

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20279OooO00o() {
        File file = new File(OooO0o0());
        try {
            int available = C8654oo0Oo00.OooO00o().f21797OooO00o.getAssets().open(C8646oo0OOoO.OooO0OO).available();
            int OooO0O02 = C8742oo0oOo00.OooO0O0((Context) C8654oo0Oo00.OooO00o().f21797OooO00o);
            boolean exists = file.exists();
            boolean z = true;
            boolean z2 = C8686oo0OoooO.OooO00o().OooO00o("version", -1) != OooO0O02;
            if (C8686oo0OoooO.OooO00o().OooO00o(OooO0OO, -1) == available) {
                z = false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("fileAvailable", "" + available);
            hashMap.put("version", "" + OooO0O02);
            hashMap.put("exists", "" + exists);
            hashMap.put("versionCompare", "" + z2);
            hashMap.put("fileAvaiableCompare", "" + z);
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "initRN");
            hashMap.put("desc", "RN包初始化开始");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
            if (!exists || z2 || z) {
                OooO00o(new File(OooO0o()));
                OooO0O0(C8646oo0OOoO.OooO0OO);
                if (new File(OooO0o() + OooO0o).exists()) {
                    C8686oo0OoooO.OooO00o().m20296OooO00o(OooO0OO, available);
                    C8686oo0OoooO.OooO00o().m20296OooO00o("version", OooO0O02);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("desc", "RN包初始化，文件不存在");
                    LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap2);
                }
            }
            m20282OooO0O0();
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("desc", "RN包初始化出错");
            hashMap3.put("err", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap3);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20282OooO0O0() {
        try {
            Map jsonToMap = GsonUtil.jsonToMap(OooO0O0(), String.class, String.class);
            HashMap hashMap = new HashMap();
            if (jsonToMap != null && !jsonToMap.isEmpty()) {
                if (jsonToMap.containsKey("version")) {
                    hashMap.put(C8912ooOO0o0.OooOooO, jsonToMap.get("version"));
                }
                if (jsonToMap.containsKey("rnLibVersion")) {
                    hashMap.put(C8912ooOO0o0.OooOooo, jsonToMap.get("rnLibVersion"));
                }
                if (jsonToMap.containsKey("cpLibVersion")) {
                    hashMap.put(C8912ooOO0o0.Oooo000, jsonToMap.get("cpLibVersion"));
                }
            }
            LogCollectorManager.sharedInstance().addCommonParams(hashMap);
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "RN包初始化,获取info.json版本参数报错");
            hashMap2.put("err", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap2);
        }
    }

    public static String OooO0OO() {
        if (C8686oo0OoooO.OooO00o().OooO00o(OooO0o0, -1) != C8742oo0oOo00.OooO0O0((Context) C8654oo0Oo00.OooO00o().f21797OooO00o)) {
            return "";
        }
        return OooO0Oo() + OooO0o;
    }

    public static String OooO0Oo() {
        return C8686oo0OoooO.OooO00o().OooO00o("url", "");
    }

    public static String OooO0o() {
        Context applicationContext = C8654oo0Oo00.OooO00o().f21797OooO00o.getApplicationContext();
        File OooO0oo = DiskFileUtil.OooO0oo(applicationContext, C8646oo0OOoO.OooO00o);
        if (OooO0oo == null) {
            OooO0oo = DiskFileUtil.OooO0O0(applicationContext, C8646oo0OOoO.OooO00o);
        }
        if (OooO0oo == null) {
            return null;
        }
        return OooO0oo.getAbsolutePath() + "/rnbundle";
    }

    public static String OooO0o0() {
        return OooO0o() + OooO0o;
    }

    public static String OooO0oO() {
        File file = new File(OooO0Oo());
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(OooO0o());
        return file2.exists() ? file2.getAbsolutePath() : "";
    }

    public static String OooO0O0() {
        File file = new File(OooO0oO() + "/info.json");
        if (!file.exists()) {
            return null;
        }
        byte[] bArr = new byte[Long.valueOf(file.length()).intValue()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "getInfo");
            hashMap.put("exception", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
            return null;
        }
    }

    public static void OooO0O0(String str) {
        try {
            String OooO0o2 = OooO0o();
            File file = new File(OooO0o2);
            if (!file.exists()) {
                file.mkdirs();
            }
            ZipInputStream zipInputStream = new ZipInputStream(C8654oo0Oo00.OooO00o().f21797OooO00o.getAssets().open(str));
            byte[] bArr = new byte[1048576];
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                if (nextEntry.isDirectory()) {
                    File file2 = new File(OooO0o2 + File.separator + nextEntry.getName());
                    if (!file2.exists()) {
                        file2.mkdir();
                    }
                } else {
                    File file3 = new File(OooO0o2 + File.separator + nextEntry.getName());
                    if (!file3.exists()) {
                        file3.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                    }
                }
            }
            zipInputStream.close();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "本地RN文件解压成功");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "本地RN文件解压异常");
            hashMap2.put("exception", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap2);
        }
    }

    public static void OooO00o(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    OooO00o(file2);
                }
                file.delete();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20280OooO00o() {
        String OooO00o2 = OooO00o();
        if (!TextUtils.isEmpty(OooO00o2) && new File(OooO00o2).exists()) {
            return true;
        }
        return false;
    }

    public static void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            C8686oo0OoooO.OooO00o().m20298OooO00o("url", str);
            C8686oo0OoooO.OooO00o().m20296OooO00o(OooO0o0, C8742oo0oOo00.OooO0O0((Context) C8654oo0Oo00.OooO00o().f21797OooO00o));
            m20282OooO0O0();
        }
    }

    public static String OooO00o() {
        File file = new File(OooO0OO());
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(OooO0o0());
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        m20279OooO00o();
        return "";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20281OooO00o(String str) {
        String OooO0O02 = OooO0O0();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(OooO0O02)) {
            return true;
        }
        try {
            String optString = new JSONObject(OooO0O02).optString("version");
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split("\\.");
                String[] split2 = str.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt2 != parseInt) {
                        return parseInt2 > parseInt;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "isBundleValid");
            hashMap.put("exception", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
        } catch (Exception unused) {
        }
        return false;
    }
}
