package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import com.p118pd.sdk.AbstractC5932OooO0Oo;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.C6955o0000OO0;
import com.p118pd.sdk.OooO00o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class AppCompatDelegate {
    public static final int o00oO0O = 1;
    public static final int o0O0O00 = 10;
    public static final int o0OO00O = 108;
    public static final int o0OOO0o = -100;
    public static int o0Oo0oo = -1;
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f13602o0ooOOo = "AppCompatDelegate";
    public static final int o0ooOoO = -1;
    public static final int oo0o0Oo = 109;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface NightMode {
    }

    public static AppCompatDelegate OooO00o(Activity activity, AbstractC5932OooO0Oo oooO0Oo) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), oooO0Oo);
    }

    public static void OooO0O0(boolean z) {
        C6955o0000OO0.OooO00o(z);
    }

    public static void OooO0OO(int i) {
        if (i == -1 || i == 0 || i == 1 || i == 2) {
            o0Oo0oo = i;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract MenuInflater m14349OooO00o();

    @Nullable
    public abstract <T extends View> T OooO00o(@IdRes int i);

    public abstract View OooO00o(@Nullable View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract ActionBar m14350OooO00o();

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract OooO00o.OooO0O0 m14351OooO00o();

    @Nullable
    public abstract AbstractC5951OooOo00 OooO00o(@NonNull AbstractC5951OooOo00.OooO00o oooO00o);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m14352OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m14353OooO00o(@LayoutRes int i);

    public abstract void OooO00o(Configuration configuration);

    public abstract void OooO00o(Bundle bundle);

    public abstract void OooO00o(View view);

    public abstract void OooO00o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooO00o(@Nullable Toolbar toolbar);

    public abstract void OooO00o(@Nullable CharSequence charSequence);

    public abstract void OooO00o(boolean z);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m14354OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m14355OooO00o(int i);

    public abstract void OooO0O0();

    public abstract void OooO0O0(int i);

    public abstract void OooO0O0(Bundle bundle);

    public abstract void OooO0O0(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m14356OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m14357OooO0O0(int i);

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public abstract void m14358OooO0OO();

    public abstract void OooO0OO(Bundle bundle);

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public static AppCompatDelegate OooO00o(Dialog dialog, AbstractC5932OooO0Oo oooO0Oo) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), oooO0Oo);
    }

    public static boolean OooO0OO() {
        return C6955o0000OO0.OooO00o();
    }

    public static AppCompatDelegate OooO00o(Context context, Window window, AbstractC5932OooO0Oo oooO0Oo) {
        return new AppCompatDelegateImpl(context, window, oooO0Oo);
    }

    public static int OooO00o() {
        return o0Oo0oo;
    }
}
