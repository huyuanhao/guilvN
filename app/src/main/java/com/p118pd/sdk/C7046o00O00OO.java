package com.p118pd.sdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewProps;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.o00O00OO  reason: case insensitive filesystem */
public final class C7046o00O00OO {
    public static final String OooO00o = "android.hardware.display.category.PRESENTATION";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final WeakHashMap<Context, C7046o00O00OO> f19317OooO00o = new WeakHashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19318OooO00o;

    public C7046o00O00OO(Context context) {
        this.f19318OooO00o = context;
    }

    @NonNull
    public static C7046o00O00OO OooO00o(@NonNull Context context) {
        C7046o00O00OO o00o00oo;
        synchronized (f19317OooO00o) {
            o00o00oo = f19317OooO00o.get(context);
            if (o00o00oo == null) {
                o00o00oo = new C7046o00O00OO(context);
                f19317OooO00o.put(context, o00o00oo);
            }
        }
        return o00o00oo;
    }

    @Nullable
    public Display OooO00o(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f19318OooO00o.getSystemService(ViewProps.DISPLAY)).getDisplay(i);
        }
        Display defaultDisplay = ((WindowManager) this.f19318OooO00o.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == i) {
            return defaultDisplay;
        }
        return null;
    }

    @NonNull
    public Display[] OooO00o() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f19318OooO00o.getSystemService(ViewProps.DISPLAY)).getDisplays();
        }
        return new Display[]{((WindowManager) this.f19318OooO00o.getSystemService("window")).getDefaultDisplay()};
    }

    @NonNull
    public Display[] OooO00o(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f19318OooO00o.getSystemService(ViewProps.DISPLAY)).getDisplays(str);
        }
        if (str == null) {
            return new Display[0];
        }
        return new Display[]{((WindowManager) this.f19318OooO00o.getSystemService("window")).getDefaultDisplay()};
    }
}
