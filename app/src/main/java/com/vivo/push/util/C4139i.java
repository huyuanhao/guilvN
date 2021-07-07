package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.vivo.push.model.InsideNotificationItem;

/* renamed from: com.vivo.push.util.i */
public final class C4139i implements BaseNotifyDataAdapter {

    /* renamed from: a */
    public Resources f11098a;

    /* renamed from: b */
    public String f11099b;

    /* renamed from: c */
    public String f11100c;

    /* renamed from: d */
    public String f11101d;

    /* renamed from: a */
    private int m11170a(String str) {
        while (!TextUtils.isEmpty(str)) {
            Resources resources = this.f11098a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str + "_notifyicon", "drawable", this.f11099b);
            if (identifier > 0) {
                return identifier;
            }
            str = str.substring(0, str.length() - 1);
        }
        return this.f11098a.getIdentifier("vivo_push_notifyicon", "drawable", this.f11099b);
    }

    /* renamed from: b */
    private int m11171b(String str) {
        while (!TextUtils.isEmpty(str)) {
            Resources resources = this.f11098a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str + "_icon", "drawable", this.f11099b);
            if (identifier > 0) {
                return identifier;
            }
            str = str.substring(0, str.length() - 1);
        }
        return this.f11098a.getIdentifier("vivo_push_icon", "drawable", this.f11099b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        int i;
        String str = this.f11101d;
        while (true) {
            if (Build.VERSION.SDK_INT < 26) {
                break;
            } else if (TextUtils.isEmpty(str)) {
                C4146p.m11216d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
                break;
            } else {
                String str2 = "vivo_push_ard" + str + "_notifyicon";
                i = this.f11098a.getIdentifier(str2, "drawable", this.f11099b);
                if (i > 0) {
                    C4146p.m11216d("DefaultNotifyDataAdapter", "get notify icon : " + str2);
                    break;
                }
                C4146p.m11216d("DefaultNotifyDataAdapter", "get notify error icon : " + str2);
                str = str.substring(0, str.length() + -1);
            }
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return m11170a(this.f11100c);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        int i;
        String str = this.f11101d;
        while (true) {
            if (Build.VERSION.SDK_INT < 26) {
                break;
            } else if (TextUtils.isEmpty(str)) {
                C4146p.m11216d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
                break;
            } else {
                String str2 = "vivo_push_ard" + str + "_icon";
                i = this.f11098a.getIdentifier(str2, "drawable", this.f11099b);
                if (i > 0) {
                    C4146p.m11216d("DefaultNotifyDataAdapter", "get small icon : " + str2);
                    break;
                }
                C4146p.m11216d("DefaultNotifyDataAdapter", "get small error icon : " + str2);
                str = str.substring(0, str.length() + -1);
            }
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return m11171b(this.f11100c);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 1;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        String str;
        this.f11099b = context.getPackageName();
        this.f11098a = context.getResources();
        this.f11100c = C4141k.m11172a();
        String str2 = Build.VERSION.RELEASE;
        if (TextUtils.isEmpty(str2)) {
            str = null;
        } else {
            str = str2.replace(C9058ooOoOoOO.OooOO0, "");
        }
        this.f11101d = str;
    }
}
