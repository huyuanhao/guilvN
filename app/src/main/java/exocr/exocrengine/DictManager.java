package exocr.exocrengine;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DictManager {
    public static final String OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f23693OooO00o;

    public static void OooO00o(Activity activity) {
        byte[] bArr = new byte[256];
        Context applicationContext = activity.getApplicationContext();
        String absolutePath = applicationContext.getFilesDir().getAbsolutePath();
        if (!OooO00o(absolutePath + "/zocr0.lib")) {
            File file = new File(absolutePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!OooO00o(applicationContext, "zocr0.lib", absolutePath + "/zocr0.lib")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle("识别核心初始化失败\n");
                builder.setMessage("请检查识字典文件是否存在");
                builder.setCancelable(true);
                builder.create().show();
                return;
            }
        }
        for (int i = 0; i < absolutePath.length(); i++) {
            bArr[i] = (byte) absolutePath.charAt(i);
        }
        bArr[absolutePath.length()] = 0;
        if (EXOCREngine.nativeInit(bArr) < 0) {
            f23693OooO00o = false;
            AlertDialog.Builder builder2 = new AlertDialog.Builder(activity);
            builder2.setTitle("识别核心初始化失败\n");
            builder2.setMessage("请检查识别核心授权是否过期");
            builder2.setCancelable(true);
            builder2.create().show();
            return;
        }
        f23693OooO00o = true;
        if (EXOCREngine.nativeCheckSignature(applicationContext) != 1) {
            f23693OooO00o = false;
            AlertDialog.Builder builder3 = new AlertDialog.Builder(activity);
            builder3.setTitle("识别核心初始化失败\n");
            builder3.setMessage("请检查识别核心授权是否过期");
            builder3.setCancelable(true);
            builder3.create().show();
        }
    }

    public static boolean OooO0O0() {
        return f23693OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22029OooO00o() {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            r1 = 0
            java.lang.String r2 = ""
            java.util.Date r0 = r0.parse(r2)     // Catch:{ ParseException -> 0x0017 }
            java.util.Date r2 = new java.util.Date     // Catch:{ ParseException -> 0x0015 }
            r2.<init>()     // Catch:{ ParseException -> 0x0015 }
            r1 = r2
            goto L_0x001c
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            r0 = r1
        L_0x0019:
            r2.printStackTrace()
        L_0x001c:
            long r2 = r0.getTime()
            long r0 = r1.getTime()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x002a
            r0 = 0
            return r0
        L_0x002a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.exocrengine.DictManager.m22029OooO00o():boolean");
    }

    public static boolean OooO00o(Context context, String str, String str2) {
        try {
            InputStream open = context.getResources().getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    open.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean OooO00o(String str) {
        return new File(str).exists();
    }

    public static void OooO00o() {
        f23693OooO00o = false;
        EXOCREngine.nativeDone();
    }
}
