package com.megvii.apo.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.megvii.apo.C1467b;
import com.p118pd.sdk.C5982OoooOoO;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.umeng.message.MsgConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: com.megvii.apo.util.g */
public final class C1497g {

    /* renamed from: a */
    public static final String[] f2016a = {"0", "1", "2", "3", "4", "5", "6", MsgConstant.MESSAGE_NOTIFY_ARRIVAL, "8", "9", "a", "b", C2756c.f5722a, "d", "e", "f"};

    /* renamed from: b */
    public static volatile boolean f2017b;

    /* renamed from: com.megvii.apo.util.g$OooO00o */
    public static class OooO00o extends Thread {
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str) {
            this.o0ooOOo = str;
        }

        public final void run() {
            super.run();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ps\n").getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains(this.o0ooOOo)) {
                            boolean unused = C1497g.f2017b = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* renamed from: b */
    public static boolean m2270b(String str) {
        OooO00o oooO00o = new OooO00o(str);
        try {
            oooO00o.start();
            for (int i = 0; i < 10 && !f2017b; i++) {
                Thread.sleep(100);
            }
            oooO00o.interrupt();
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return f2017b;
    }

    /* renamed from: a */
    public static C1467b.C1468a m2263a(Context context, ApplicationInfo applicationInfo) {
        PackageManager packageManager = context.getPackageManager();
        C1467b.C1468a aVar = new C1467b.C1468a();
        aVar.f1939b = applicationInfo.packageName;
        aVar.f1940c = applicationInfo.loadLabel(packageManager).toString();
        try {
            aVar.f1948k = m2264a(applicationInfo.loadIcon(packageManager));
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        aVar.f1951n = m2268a(context, applicationInfo.packageName);
        int i = applicationInfo.flags;
        if (!((i & 128) != 0 || (i & 1) == 0)) {
            aVar.f1942e = "1";
        } else {
            aVar.f1942e = "0";
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(aVar.f1939b, 4160);
            aVar.f1949l = packageInfo.versionName;
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.versionCode);
            aVar.f1941d = sb.toString();
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()));
            aVar.f1944g = x509Certificate.getNotBefore().toString();
            aVar.f1945h = x509Certificate.getNotAfter().toString();
            aVar.f1946i = x509Certificate.getSubjectDN().getName();
            aVar.f1947j = x509Certificate.getPublicKey().toString();
            String str = null;
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                str = m2266a(signatureArr[0].toByteArray());
            }
            aVar.f1943f = str;
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                String str2 = "";
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    str2 = str2 + strArr[i2];
                    if (C1493c.m2253a("AqP20/fWurXwemeh6GnJUB7O/YtQuFtmdkBtxz3rIIMu1MplP5spkT/2PaKdiFSa").equals(strArr[i2])) {
                        aVar.f1950m = "1";
                    }
                    if (i2 != strArr.length - 1) {
                        str2 = str2 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
            }
        } catch (Throwable th2) {
            C1495e.m2258a(th2);
        }
        return aVar;
    }

    /* renamed from: b */
    public static String m2269b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            try {
                int i = b;
                if (b < 0) {
                    i = b + 256;
                }
                int i2 = (i == 1 ? 1 : 0) / 16;
                stringBuffer.append(f2016a[i2] + f2016a[i % 16]);
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static synchronized String m2264a(Drawable drawable) {
        byte[] digest;
        synchronized (C1497g.class) {
            if (drawable == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(createBitmap.getWidth() * createBitmap.getHeight() * 4);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                for (byte b : MessageDigest.getInstance("MD5").digest(byteArrayOutputStream.toByteArray())) {
                    int i = b & 255;
                    if (i < 16) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(i));
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
            return stringBuffer.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0054 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081 A[Catch:{ Exception -> 0x0089 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2265a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.util.C1497g.m2265a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m2268a(Context context, String str) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.processName != null && runningAppProcessInfo.pid == myPid && runningAppProcessInfo.processName.contains(str)) {
                    return true;
                }
            }
            if (m2270b(str)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static String m2266a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return m2269b(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
