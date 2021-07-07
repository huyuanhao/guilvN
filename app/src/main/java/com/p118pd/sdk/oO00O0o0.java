package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00O0o0 */
public final class oO00O0o0 {
    public static volatile boolean OooO00o = true;

    public static Drawable OooO00o(Context context, Context context2, @DrawableRes int i) {
        return OooO00o(context, context2, i, null);
    }

    public static Drawable OooO0O0(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return C7023o000o0o0.m18287OooO00o(context.getResources(), i, theme);
    }

    public static Drawable OooO0OO(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new C5952OooOo0O(context, theme);
        }
        return C5945OooOOO0.m16716OooO00o(context, i);
    }

    public static Drawable OooO00o(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return OooO00o(context, context, i, theme);
    }

    public static Drawable OooO00o(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (OooO00o) {
                return OooO0OO(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            OooO00o = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C7009o000OoOo.m18256OooO00o(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return OooO0O0(context2, i, theme);
    }
}
