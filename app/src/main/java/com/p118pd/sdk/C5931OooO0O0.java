package com.p118pd.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.OooO0O0  reason: case insensitive filesystem */
public class C5931OooO0O0 {
    public static final String OooO00o = "ActionBarDrawerToggleHC";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f17022OooO00o = {16843531};

    /* renamed from: com.pd.sdk.OooO0O0$OooO00o */
    public static class OooO00o {
        public ImageView OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f17023OooO00o;
        public Method OooO0O0;

        public OooO00o(Activity activity) {
            try {
                this.f17023OooO00o = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.OooO0O0 = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C7191o00oO0O0.OooO0Oo);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.OooO00o = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    public static OooO00o OooO00o(OooO00o oooO00o, Activity activity, Drawable drawable, int i) {
        OooO00o oooO00o2 = new OooO00o(activity);
        if (oooO00o2.f17023OooO00o != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                oooO00o2.f17023OooO00o.invoke(actionBar, drawable);
                oooO00o2.OooO0O0.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = oooO00o2.OooO00o;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return oooO00o2;
    }

    public static OooO00o OooO00o(OooO00o oooO00o, Activity activity, int i) {
        if (oooO00o == null) {
            oooO00o = new OooO00o(activity);
        }
        if (oooO00o.f17023OooO00o != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                oooO00o.OooO0O0.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception unused) {
            }
        }
        return oooO00o;
    }

    public static Drawable OooO00o(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f17022OooO00o);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}
