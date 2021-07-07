package com.facebook.react.uimanager;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.C0587R;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7120o00OoOO;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.Locale;
import javax.annotation.Nullable;

public class AccessibilityDelegateUtil {

    /* renamed from: com.facebook.react.uimanager.AccessibilityDelegateUtil$2 */
    public static /* synthetic */ class C08342 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$AccessibilityDelegateUtil$AccessibilityRole */
        public static final /* synthetic */ int[] f979x36a49faa;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.AccessibilityDelegateUtil.C08342.<clinit>():void");
        }
    }

    public enum AccessibilityRole {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER;

        public static AccessibilityRole fromValue(@Nullable String str) {
            AccessibilityRole[] values = values();
            for (AccessibilityRole accessibilityRole : values) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (C08342.f979x36a49faa[accessibilityRole.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    return "android.widget.Button";
                case 3:
                    return "android.widget.ViewGroup";
                case 4:
                    return "android.widget.EditText";
                case 5:
                case 6:
                    return "android.widget.ImageView";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.ViewGroup";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                case 11:
                    return "android.widget.ViewGroup";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    public static void setDelegate(final View view) {
        final String str = (String) view.getTag(C0587R.C0590id.accessibility_hint);
        final AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C0587R.C0590id.accessibility_role);
        if (ViewCompat.m14583OooO0O0(view)) {
            return;
        }
        if (str != null || accessibilityRole != null) {
            ViewCompat.OooO00o(view, new C7087o00OO0o() {
                /* class com.facebook.react.uimanager.AccessibilityDelegateUtil.C08331 */

                @Override // com.p118pd.sdk.C7087o00OO0o
                public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
                    super.onInitializeAccessibilityNodeInfo(view, o00oooo);
                    if (str != null) {
                        String str = (String) o00oooo.m18428OooO0O0();
                        if (str != null) {
                            o00oooo.OooO0O0((CharSequence) (str + ", " + str));
                        } else {
                            o00oooo.OooO0O0((CharSequence) str);
                        }
                    }
                    AccessibilityDelegateUtil.setRole(o00oooo, accessibilityRole, view.getContext());
                }
            });
        }
    }

    public static void setRole(C7120o00OoOO o00oooo, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        o00oooo.OooO00o(AccessibilityRole.getValue(accessibilityRole));
        if (Locale.getDefault().getLanguage().equals(new Locale(SocializeProtocolConstants.PROTOCOL_KEY_EN).getLanguage())) {
            if (accessibilityRole.equals(AccessibilityRole.LINK)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.link_description));
                if (o00oooo.m18428OooO0O0() != null) {
                    SpannableString spannableString = new SpannableString(o00oooo.m18428OooO0O0());
                    spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                    o00oooo.OooO0O0((CharSequence) spannableString);
                }
                if (o00oooo.m18446OooO0oo() != null) {
                    SpannableString spannableString2 = new SpannableString(o00oooo.m18446OooO0oo());
                    spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                    o00oooo.OooO0oo(spannableString2);
                }
            }
            if (accessibilityRole.equals(AccessibilityRole.SEARCH)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.search_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.image_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.image_button_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.ADJUSTABLE)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.adjustable_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
                o00oooo.OooO0oO(context.getString(C0587R.string.header_description));
                o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(0, 1, 0, 1, true));
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            o00oooo.OooO0o0(true);
        }
    }
}
