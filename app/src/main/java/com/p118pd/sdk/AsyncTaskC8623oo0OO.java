package com.p118pd.sdk;

import android.os.AsyncTask;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.pd.sdk.oo0OO  reason: case insensitive filesystem */
public class AsyncTaskC8623oo0OO extends AsyncTask<String, Integer, Boolean> {
    public AbstractC9096ooo0000O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21744OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public AsyncTaskC8623oo0OO(String str, AbstractC9096ooo0000O ooo0000o, String str2, String str3) {
        this.f21744OooO00o = str2;
        this.OooO0O0 = str3;
        this.OooO0OO = str;
        this.OooO00o = ooo0000o;
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (!bool.booleanValue()) {
            File file = new File(this.f21744OooO00o);
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(this.OooO0O0);
            if (file2.exists()) {
                file2.delete();
            }
        }
        AbstractC9096ooo0000O ooo0000o = this.OooO00o;
        if (ooo0000o != null) {
            ooo0000o.OooO00o(bool.booleanValue(), this.OooO0O0);
        }
    }

    /* renamed from: OooO00o */
    public Boolean doInBackground(String... strArr) {
        try {
            String OooO00o2 = C9045ooOoOO0o.OooO00o(this.f21744OooO00o);
            if (!C9054ooOoOo0.OooO0OO(OooO00o2)) {
                if (OooO00o2.equalsIgnoreCase(this.OooO0OO)) {
                    String str = this.OooO0O0;
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    ZipFile zipFile = new ZipFile(new File(this.f21744OooO00o));
                    byte[] bArr = new byte[1024];
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry.isDirectory()) {
                            File file2 = new File(str + File.separator + zipEntry.getName());
                            if (!file2.exists()) {
                                file2.mkdir();
                            }
                        } else {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str + File.separator + zipEntry.getName().substring(zipEntry.getName().lastIndexOf(File.separator) + 1, zipEntry.getName().length()))));
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                            while (true) {
                                try {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                } catch (Exception e) {
                                    LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                                    sharedInstance.recordWarn(getClass().getSimpleName() + e.getMessage(), false);
                                    return false;
                                } finally {
                                    bufferedInputStream.close();
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "DirectoryOnlyZipAsyncTask Zip文件解压异常；全部解决到一层文件夹下");
            hashMap.put("exception", stringWriter.toString());
            hashMap.put("oldFilePath", this.f21744OooO00o);
            hashMap.put("newFilePath", this.OooO0O0);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
            return false;
        }
    }
}
