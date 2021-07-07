package com.huawei.hianalytics.log.p033f;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8536oo00OO0O;
import com.p118pd.sdk.C8555oo00OooO;
import com.p118pd.sdk.C8560oo00o00O;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.huawei.hianalytics.log.f.a */
public final class C1101a {

    /* renamed from: com.huawei.hianalytics.log.f.a$a */
    public static class C1102a implements Serializable, Comparator<File> {
        /* renamed from: a */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified < 0 ? -1 : 0;
        }
    }

    public static File OooO00o(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC8536oo00OO0O.OooO0Oo("AppLogManager", "createLogFile Exc, not have file path or name");
            return null;
        }
        File file = new File(str, str2);
        try {
            if (file.createNewFile()) {
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "log file createNewFile");
            }
        } catch (IOException unused) {
            AbstractC8536oo00OO0O.OooO0Oo("AppLogManager", "createNewFile Exception,log File creation failure!");
        }
        File[] OooO00o = OooO00o(str);
        int OooO00o2 = C8560oo00o00O.OooO00o(OooO00o);
        int i2 = i;
        boolean z = false;
        for (File file2 : OooO00o) {
            if (file2.getName().equals("eventinfo.log")) {
                i2++;
                z = true;
            }
        }
        if (OooO00o2 > i2) {
            if (!z) {
                Arrays.sort(OooO00o, new C1102a());
                OooO00o(OooO00o, i);
            } else {
                File[] OooO00o3 = OooO00o(OooO00o);
                Arrays.sort(OooO00o3, new C1102a());
                OooO00o(OooO00o3, i);
            }
        }
        return file;
    }

    public static void OooO00o(String str, int i) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                str3 = "Failed to create file";
            } else if (listFiles.length > i) {
                C8555oo00OooO.OooO00o(file);
                str3 = "zips number anomaly ,Delete the file ";
            } else {
                Arrays.sort(listFiles, new C1102a());
                long j = 0;
                for (File file2 : listFiles) {
                    if (((double) file2.length()) <= 1887436.8d || !file2.delete()) {
                        j += file2.length();
                        if (((double) j) >= 1887436.8d) {
                            if (C8560oo00o00O.m20215OooO00o(listFiles)) {
                                str2 = "delFullFile() true";
                            } else {
                                if (listFiles[0].delete()) {
                                    str2 = "delFullFile() Crash file deletion success";
                                }
                                OooO00o(str, i);
                            }
                            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", str2);
                            OooO00o(str, i);
                        }
                    } else {
                        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "Delete a file with a length greater than 1.8M ");
                        j = 0;
                    }
                }
                return;
            }
            AbstractC8536oo00OO0O.OooO0OO("AppLogManager", str3);
        }
    }

    public static boolean OooO00o(File file) {
        return file.length() <= ((long) 204800);
    }

    public static boolean OooO00o(File[] fileArr, int i) {
        if (fileArr == null || fileArr.length < i) {
            AbstractC8536oo00OO0O.OooO0O0("AppLogManager", "files is empty or files size too much");
            return false;
        }
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < fileArr.length; i3++) {
            if (i3 < (fileArr.length - i) + i2) {
                if (fileArr[i3].getName().contains("Crash")) {
                    i2++;
                } else if (!fileArr[i3].delete()) {
                    AbstractC8536oo00OO0O.OooO0OO("AppLogManager", "delete failed:");
                    z = false;
                } else {
                    AbstractC8536oo00OO0O.OooO0OO("AppLogManager", "delete success:");
                }
            }
            if (i2 >= 5) {
                if (!fileArr[0].delete()) {
                    AbstractC8536oo00OO0O.OooO0OO("AppLogManager", "delete failed:");
                    z = false;
                } else {
                    AbstractC8536oo00OO0O.OooO0OO("AppLogManager", "delete success:");
                }
            }
        }
        return z;
    }

    public static File[] OooO00o(String str) {
        return new File(str).listFiles();
    }

    public static File[] OooO00o(File[] fileArr) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (!"eventinfo.log".equals(file.getName())) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }
}
