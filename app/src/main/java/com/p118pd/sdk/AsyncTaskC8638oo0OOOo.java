package com.p118pd.sdk;

import android.os.AsyncTask;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0OOOo  reason: case insensitive filesystem */
public class AsyncTaskC8638oo0OOOo extends AsyncTask<String, Integer, Boolean> {
    public String OooO00o;
    public String OooO0O0;

    public AsyncTaskC8638oo0OOOo(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
    }

    /* renamed from: OooO00o */
    public Boolean doInBackground(String... strArr) {
        try {
            File file = new File(this.OooO0O0);
            File file2 = new File(this.OooO00o);
            byte[] bArr = new byte[1024];
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            while (true) {
                try {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        bufferedInputStream.close();
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        return true;
                    }
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    HashMap hashMap = new HashMap();
                    hashMap.put("desc", "ReadAsyncTask 流异常");
                    hashMap.put("exception", stringWriter.toString());
                    hashMap.put("oldFilePath", this.OooO00o);
                    hashMap.put("newFilePath", this.OooO0O0);
                    LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, LogApplicationType.EXCEPTION.getValue(), hashMap);
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return false;
                } catch (Throwable th) {
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    throw th;
                }
            }
        } catch (Exception e2) {
            StringWriter stringWriter2 = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter2));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "ReadAsyncTask 全局抛流异常");
            hashMap2.put("exception", stringWriter2.toString());
            hashMap2.put("oldFilePath", this.OooO00o);
            hashMap2.put("newFilePath", this.OooO0O0);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap2);
            return false;
        }
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (!bool.booleanValue()) {
            File file = new File(this.OooO00o);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
