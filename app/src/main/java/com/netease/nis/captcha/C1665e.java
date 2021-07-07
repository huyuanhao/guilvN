package com.netease.nis.captcha;

import com.p118pd.sdk.C8932ooOOO0o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.netease.nis.captcha.e */
public class C1665e {

    /* renamed from: a */
    public static ExecutorService f3055a = Executors.newSingleThreadExecutor();

    /* renamed from: com.netease.nis.captcha.e$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ AbstractC1666a OooO00o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO00o(String str, String str2, AbstractC1666a aVar) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.OooO00o = aVar;
        }

        public void run() {
            try {
                C1665e.m2941c(this.o0ooOOo, this.o0ooOoO);
                if (this.OooO00o != null) {
                    this.OooO00o.mo17688a();
                }
            } catch (IOException e) {
                e.printStackTrace();
                AbstractC1666a aVar = this.OooO00o;
                if (aVar != null) {
                    aVar.mo17689a(e.toString());
                }
            }
        }
    }

    /* renamed from: com.netease.nis.captcha.e$a */
    public interface AbstractC1666a {
        /* renamed from: a */
        void mo17688a();

        /* renamed from: a */
        void mo17689a(String str);
    }

    /* renamed from: a */
    public static void m2938a(String str, String str2, String str3, AbstractC1666a aVar) {
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        f3055a.execute(new OooO00o(str, str3 + File.separator + str2, aVar));
    }

    /* renamed from: a */
    public static boolean m2939a(String str, String str2) {
        String substring = str.substring(str.lastIndexOf(C8932ooOOO0o.OooO0OO) + 1);
        m2938a(str, substring, str2, null);
        return new File(str2, substring).exists();
    }

    /* renamed from: c */
    public static void m2941c(String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        byte[] bArr = new byte[1024];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            } else {
                fileOutputStream.close();
                bufferedInputStream.close();
                return;
            }
        }
    }
}
