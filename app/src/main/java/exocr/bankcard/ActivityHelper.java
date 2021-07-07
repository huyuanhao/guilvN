package exocr.bankcard;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;

public class ActivityHelper {
    @TargetApi(11)
    public static void OooO00o(Activity activity) {
        if (OooO00o()) {
            activity.requestWindowFeature(8);
        }
    }

    public static boolean OooO0O0() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static void OooO00o(Activity activity, TextView textView, String str, String str2, Drawable drawable) {
        if (str2 == null) {
            str2 = "";
        }
        activity.setTitle(str2 + str);
        if (OooO00o()) {
            OooO00o(activity, str, drawable);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (textView != null) {
            textView.setText(str);
        }
    }

    @TargetApi(11)
    public static void OooO00o(Activity activity, String str, Drawable drawable) {
        ActionBar actionBar = activity.getActionBar();
        actionBar.setBackgroundDrawable(Appearance.f23568OooO00o);
        actionBar.setTitle(str);
        TextView textView = (TextView) activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (textView != null) {
            textView.setTextColor(-1);
        }
        actionBar.setDisplayHomeAsUpEnabled(false);
        if (drawable == null || Build.VERSION.SDK_INT < 14) {
            actionBar.setDisplayShowHomeEnabled(false);
        } else {
            OooO00o(actionBar, drawable);
        }
    }

    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 11;
    }

    @TargetApi(14)
    public static void OooO00o(ActionBar actionBar, Drawable drawable) {
        actionBar.setIcon(drawable);
    }

    @TargetApi(11)
    public static void OooO00o(Activity activity, boolean z) {
        if (z && activity.getApplicationInfo().theme != 0) {
            activity.setTheme(activity.getApplicationInfo().theme);
        } else if (OooO0O0()) {
            activity.setTheme(16973934);
        } else {
            activity.setTheme(16973836);
        }
    }
}
