package com.p118pd.sdk;

import android.os.AsyncTask;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.pd.sdk.oo0OOO00  reason: case insensitive filesystem */
public class AsyncTaskC8636oo0OOO00 extends AsyncTask<String, Integer, Boolean> {
    public AbstractC9096ooo0000O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21756OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public AsyncTaskC8636oo0OOO00(String str, AbstractC9096ooo0000O ooo0000o, String str2, String str3) {
        this.f21756OooO00o = str2;
        this.OooO0O0 = str3;
        this.OooO0OO = str;
        this.OooO00o = ooo0000o;
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (!bool.booleanValue()) {
            File file = new File(this.f21756OooO00o);
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
            String OooO00o2 = C9045ooOoOO0o.OooO00o(this.f21756OooO00o);
            if (!C9054ooOoOo0.OooO0OO(OooO00o2)) {
                if (OooO00o2.equalsIgnoreCase(this.OooO0OO)) {
                    String str = this.OooO0O0;
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(new File(this.f21756OooO00o)));
                    byte[] bArr = new byte[1048576];
                    for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                        if (nextEntry.isDirectory()) {
                            File file2 = new File(str + File.separator + nextEntry.getName());
                            if (!file2.exists()) {
                                file2.mkdir();
                            }
                        } else {
                            File file3 = new File(str + File.separator + nextEntry.getName());
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
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "DirectoryZipAsyncTask Zip文件解压异常；深层遍历文件夹");
            hashMap.put("exception", stringWriter.toString());
            hashMap.put("oldFilePath", this.f21756OooO00o);
            hashMap.put("newFilePath", this.OooO0O0);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
            return false;
        }
    }
}
