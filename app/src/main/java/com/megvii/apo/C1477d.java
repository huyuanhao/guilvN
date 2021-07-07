package com.megvii.apo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.megvii.apo.d */
public final class C1477d extends AbstractC1486m {

    /* renamed from: com.megvii.apo.d$OooO00o */
    public class OooO00o implements FileFilter {
        public OooO00o() {
        }

        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public C1477d(Context context) {
        super(context);
    }

    @TargetApi(21)
    /* renamed from: b */
    public static String m2196b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr = Build.SUPPORTED_ABIS;
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
            } else {
                String str = Build.CPU_ABI;
                String str2 = Build.CPU_ABI2;
                sb.append(str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2198c() {
        String str;
        String str2 = "";
        try {
            str = new BufferedReader(new InputStreamReader(new ProcessBuilder(C1493c.m2253a("mS9Og5cjPiWe+XQgm7W/8Q=="), C1493c.m2253a("2TfER6mCjFXQ6s36dvL3IEWJsulLhJQnMXThgXzBdtyW1bJf3oBfAfVmIp5Y7/coc0RMAvapX+JrjL9Fak+C+g==")).start().getInputStream())).readLine();
        } catch (Throwable th) {
            C1495e.m2258a(th);
            str = str2;
        }
        try {
            InputStream inputStream = new ProcessBuilder(C1493c.m2253a("mS9Og5cjPiWe+XQgm7W/8Q=="), C1493c.m2253a("2TfER6mCjFXQ6s36dvL3IEWJsulLhJQnMXThgXzBdtxeBn9Lk8DnzfqlyxDgbLd6l0wqzdREqzmwLQ3n95aA4Q==")).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
        } catch (Throwable th2) {
            C1495e.m2258a(th2);
            str2 = "N/A";
        }
        return str2.trim() + "~~" + str + "KHZ";
    }

    /* renamed from: d */
    private String m2199d() {
        try {
            File[] listFiles = new File(C1493c.m2253a("2TfER6mCjFXQ6s36dvL3IOW+Mj28jQ19kKkBvmgEHD8=")).listFiles(new OooO00o());
            StringBuilder sb = new StringBuilder();
            sb.append(listFiles.length);
            return sb.toString();
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "1";
        }
    }

    /* renamed from: e */
    public static String m2200e() {
        float f = (float) m2201f();
        float g = (float) m2202g();
        try {
            Thread.sleep(360);
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return String.valueOf(((((float) m2202g()) - g) * 100.0f) / (((float) m2201f()) - f));
    }

    /* renamed from: f */
    public static long m2201f() {
        String[] strArr;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(C1493c.m2253a("ngjGDUuZLTBiNu5EbFIvrA=="))), 1000);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            strArr = readLine.split(" ");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            strArr = null;
        }
        if (strArr == null) {
            return 0;
        }
        try {
            if (strArr.length > 0) {
                return Long.parseLong(strArr[2]) + Long.parseLong(strArr[3]) + Long.parseLong(strArr[4]) + Long.parseLong(strArr[6]) + Long.parseLong(strArr[5]) + Long.parseLong(strArr[7]) + Long.parseLong(strArr[8]);
            }
            return 0;
        } catch (Throwable th2) {
            C1495e.m2258a(th2);
            return 0;
        }
    }

    /* renamed from: g */
    public static long m2202g() {
        String[] strArr;
        try {
            int myPid = Process.myPid();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(C1493c.m2253a("vnW8/s+yOk7vXz4qTaIYHg==") + myPid + C1493c.m2253a("S/OzKa9C0LXu4bIh2IG+ng=="))), 1000);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            strArr = readLine.split(" ");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            strArr = null;
        }
        return Long.parseLong(strArr[13]) + Long.parseLong(strArr[14]) + Long.parseLong(strArr[15]) + Long.parseLong(strArr[16]);
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        if (C1500j.f2070y == 1) {
            try {
                map.put("101052001", m2196b());
                map.put("101051001", m2198c());
                int intValue = Integer.valueOf(m2199d()).intValue();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < intValue; i++) {
                    sb.append(m2197b(String.valueOf(i)));
                    if (i != intValue - 1) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                map.put("101051002", sb.toString());
                map.put("101050006", m2200e());
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* renamed from: b */
    public static String m2197b(String str) {
        String str2 = "";
        try {
            InputStream inputStream = new ProcessBuilder(C1493c.m2253a("mS9Og5cjPiWe+XQgm7W/8Q=="), C1493c.m2253a("2TfER6mCjFXQ6s36dvL3IByjDs0ZKIY05Q/18sYbh4U=") + str + C1493c.m2253a("z34pa4DPQ6ZsbwyrQTIKAsKD1CvHrVGqNbD+XF/v6IM=")).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return str2.trim();
    }
}
