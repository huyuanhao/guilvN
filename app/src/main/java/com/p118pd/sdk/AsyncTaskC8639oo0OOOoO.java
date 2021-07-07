package com.p118pd.sdk;

import android.os.AsyncTask;
import com.jinhui365.hotsources.bean.HotSourceVO;
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

/* renamed from: com.pd.sdk.oo0OOOoO  reason: case insensitive filesystem */
public class AsyncTaskC8639oo0OOOoO extends AsyncTask<String, Integer, Boolean> {
    public HotSourceVO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8665oo0OoO f21762OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21763OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public AsyncTaskC8639oo0OOOoO(String str, AbstractC8665oo0OoO oo0ooo, String str2, String str3, HotSourceVO hotSourceVO) {
        this.f21763OooO00o = str2;
        this.OooO0O0 = str3;
        this.OooO0OO = str;
        this.f21762OooO00o = oo0ooo;
        this.OooO00o = hotSourceVO;
    }

    /* renamed from: OooO00o */
    public Boolean doInBackground(String... strArr) {
        try {
            String OooO00o2 = C9045ooOoOO0o.OooO00o(this.f21763OooO00o);
            if (!C9054ooOoOo0.OooO0OO(OooO00o2)) {
                if (OooO00o2.equalsIgnoreCase(this.OooO0OO)) {
                    File file = new File(this.OooO0O0);
                    File file2 = new File(this.f21763OooO00o);
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
                            e.printStackTrace(new PrintWriter(new StringWriter()));
                            HashMap hashMap = new HashMap();
                            hashMap.put("desc", "ReadMD5AsyncTask 流异常");
                            hashMap.put("exception", e.getLocalizedMessage());
                            hashMap.put("oldFilePath", this.f21763OooO00o);
                            hashMap.put("newFilePath", this.OooO0O0);
                            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
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
                }
            }
            return false;
        } catch (Exception e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "ReadMD5AsyncTask 读取整体文件异常");
            hashMap2.put("exception", stringWriter.toString());
            hashMap2.put("oldFilePath", this.f21763OooO00o);
            hashMap2.put("newFilePath", this.OooO0O0);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap2);
            return false;
        }
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (!bool.booleanValue()) {
            File file = new File(this.f21763OooO00o);
            if (file.exists()) {
                file.delete();
            }
        }
        AbstractC8665oo0OoO oo0ooo = this.f21762OooO00o;
        if (oo0ooo != null) {
            oo0ooo.OooO00o(bool.booleanValue(), this.OooO00o);
        }
    }
}
