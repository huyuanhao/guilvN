package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000OO0  reason: case insensitive filesystem */
public class C6955o0000OO0 extends Resources {
    public static final int OooO00o = 20;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19151OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WeakReference<Context> f19152OooO00o;

    public C6955o0000OO0(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f19152OooO00o = new WeakReference<>(context);
    }

    public static boolean OooO0O0() {
        return OooO00o() && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable OooO00o(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f19152OooO00o.get();
        if (context != null) {
            return C5994Oooooo0.OooO00o().OooO00o(context, this, i);
        }
        return super.getDrawable(i);
    }

    public static void OooO00o(boolean z) {
        f19151OooO00o = z;
    }

    public static boolean OooO00o() {
        return f19151OooO00o;
    }
}
