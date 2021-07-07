package com.megvii.apo;

import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.Map;

/* renamed from: com.megvii.apo.i */
public final class C1482i extends AbstractC1486m {
    public C1482i(Context context) {
        super(context);
    }

    /* renamed from: b */
    private String m2212b() {
        int i;
        try {
            i = Settings.System.getInt(this.f1983a.getContentResolver(), "screen_brightness");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            i = 0;
        }
        return String.valueOf(i);
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        if (C1500j.f2061p == 1) {
            try {
                DisplayMetrics displayMetrics = this.f1983a.getResources().getDisplayMetrics();
                map.put("101020003", String.valueOf(Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d))));
                DisplayMetrics displayMetrics2 = this.f1983a.getResources().getDisplayMetrics();
                StringBuilder sb = new StringBuilder();
                sb.append(displayMetrics2.densityDpi);
                map.put("101020004", sb.toString());
                DisplayMetrics displayMetrics3 = this.f1983a.getResources().getDisplayMetrics();
                map.put("101020005", displayMetrics3.xdpi + C8932ooOOO0o.OooO0OO + displayMetrics3.ydpi);
                map.put("101020006", m2212b());
                map.put("101020007", String.valueOf(((AudioManager) this.f1983a.getSystemService("audio")).getStreamVolume(1)));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
