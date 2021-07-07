package com.megvii.apo;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.views.text.FontMetricsUtil;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.megvii.apo.h */
public final class C1481h extends AbstractC1486m {

    /* renamed from: com.megvii.apo.h$OooO00o */
    public class OooO00o implements FileFilter {
        public OooO00o() {
        }

        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public C1481h(Context context) {
        super(context);
    }

    /* renamed from: b */
    private String m2210b() {
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

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        String str;
        if (C1500j.f2055j == 1) {
            try {
                map.put("101010001", Build.MANUFACTURER);
                map.put("101010002", Build.MODEL);
                map.put("101010003", Build.BRAND);
                map.put("101010004", Build.BOARD);
                map.put("101010005", Build.DEVICE);
                map.put("101010006", Build.HARDWARE);
                map.put("101010007", Build.PRODUCT);
                DisplayMetrics displayMetrics = this.f1983a.getResources().getDisplayMetrics();
                map.put("101020001", displayMetrics.widthPixels + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + displayMetrics.heightPixels);
                DisplayMetrics displayMetrics2 = this.f1983a.getResources().getDisplayMetrics();
                int i = displayMetrics2.widthPixels;
                int i2 = displayMetrics2.heightPixels;
                map.put("101020002", ((double) (((float) i) / displayMetrics2.xdpi)) + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + ((double) (((float) i2) / displayMetrics2.ydpi)));
                map.put("101050001", Build.HARDWARE);
                map.put("101050002", Build.CPU_ABI);
                map.put("101050005", m2210b());
                StringBuilder sb = new StringBuilder();
                sb.append(Runtime.getRuntime().availableProcessors());
                map.put("101050008", sb.toString());
                String str2 = "";
                if (Build.VERSION.SDK_INT > 17) {
                    DisplayMetrics displayMetrics3 = new DisplayMetrics();
                    ((WindowManager) this.f1983a.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics3);
                    str = displayMetrics3.widthPixels + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + displayMetrics3.heightPixels;
                } else {
                    str = str2;
                }
                map.put("101020008", str);
                if (Build.VERSION.SDK_INT > 17) {
                    Point point = new Point();
                    ((WindowManager) this.f1983a.getSystemService("window")).getDefaultDisplay().getRealSize(point);
                    str2 = point.x + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + point.y;
                }
                map.put("101020009", str2);
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
