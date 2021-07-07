package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;

/* renamed from: com.pd.sdk.o000o00O  reason: case insensitive filesystem */
public class C7016o000o00O {
    public ComponentName OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f19280OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IconCompat f19281OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f19282OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f19283OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19284OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Intent[] f19285OooO00o;
    public CharSequence OooO0O0;
    public CharSequence OooO0OO;

    /* renamed from: com.pd.sdk.o000o00O$OooO00o */
    public static class OooO00o {
        public final C7016o000o00O OooO00o;

        public OooO00o(@NonNull Context context, @NonNull String str) {
            C7016o000o00O o000o00o = new C7016o000o00O();
            this.OooO00o = o000o00o;
            o000o00o.f19280OooO00o = context;
            o000o00o.f19283OooO00o = str;
        }

        @NonNull
        public OooO00o OooO00o(@NonNull CharSequence charSequence) {
            this.OooO00o.OooO0OO = charSequence;
            return this;
        }

        @NonNull
        public OooO00o OooO0O0(@NonNull CharSequence charSequence) {
            this.OooO00o.OooO0O0 = charSequence;
            return this;
        }

        @NonNull
        public OooO00o OooO0OO(@NonNull CharSequence charSequence) {
            this.OooO00o.f19282OooO00o = charSequence;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@NonNull Intent intent) {
            return OooO00o(new Intent[]{intent});
        }

        @NonNull
        public OooO00o OooO00o(@NonNull Intent[] intentArr) {
            this.OooO00o.f19285OooO00o = intentArr;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(IconCompat iconCompat) {
            this.OooO00o.f19281OooO00o = iconCompat;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@NonNull ComponentName componentName) {
            this.OooO00o.OooO00o = componentName;
            return this;
        }

        public OooO00o OooO00o() {
            this.OooO00o.f19284OooO00o = true;
            return this;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7016o000o00O m18277OooO00o() {
            if (!TextUtils.isEmpty(this.OooO00o.f19282OooO00o)) {
                C7016o000o00O o000o00o = this.OooO00o;
                Intent[] intentArr = o000o00o.f19285OooO00o;
                if (intentArr != null && intentArr.length != 0) {
                    return o000o00o;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
    }

    @RequiresApi(25)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ShortcutInfo m18273OooO00o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f19280OooO00o, this.f19283OooO00o).setShortLabel(this.f19282OooO00o).setIntents(this.f19285OooO00o);
        IconCompat iconCompat = this.f19281OooO00o;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.OooO00o());
        }
        if (!TextUtils.isEmpty(this.OooO0O0)) {
            intents.setLongLabel(this.OooO0O0);
        }
        if (!TextUtils.isEmpty(this.OooO0OO)) {
            intents.setDisabledMessage(this.OooO0OO);
        }
        ComponentName componentName = this.OooO00o;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        return intents.build();
    }

    @Nullable
    public CharSequence OooO0O0() {
        return this.OooO0O0;
    }

    @NonNull
    public CharSequence OooO0OO() {
        return this.f19282OooO00o;
    }

    public Intent OooO00o(Intent intent) {
        Intent[] intentArr = this.f19285OooO00o;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f19282OooO00o.toString());
        if (this.f19281OooO00o != null) {
            Drawable drawable = null;
            if (this.f19284OooO00o) {
                PackageManager packageManager = this.f19280OooO00o.getPackageManager();
                ComponentName componentName = this.OooO00o;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f19280OooO00o.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f19281OooO00o.OooO00o(intent, drawable, this.f19280OooO00o);
        }
        return intent;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18275OooO00o() {
        return this.f19283OooO00o;
    }

    @Nullable
    public ComponentName OooO00o() {
        return this.OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18274OooO00o() {
        return this.OooO0OO;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Intent m18272OooO00o() {
        Intent[] intentArr = this.f19285OooO00o;
        return intentArr[intentArr.length - 1];
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Intent[] m18276OooO00o() {
        Intent[] intentArr = this.f19285OooO00o;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }
}
