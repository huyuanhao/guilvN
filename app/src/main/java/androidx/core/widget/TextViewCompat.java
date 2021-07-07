package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.p118pd.sdk.AbstractC7137o00OooO0;
import com.p118pd.sdk.C7072o00O0oOO;
import com.p118pd.sdk.C7086o00OO0OO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p283fi.iki.elonen.NanoHTTPD;

public final class TextViewCompat {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14078OooO00o = "TextViewCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f14079OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f14080OooO00o = false;
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Field f14081OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f14082OooO0O0 = false;
    public static final int OooO0OO = 1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Field f14083OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f14084OooO0OO;
    public static Field OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static boolean f14085OooO0Oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AutoSizeTextType {
    }

    public static Field OooO00o(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            String str2 = "Could not retrieve " + str + " field.";
            return field;
        }
    }

    public static void OooO0O0(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static int OooO0OO(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof AbstractC7137o00OooO0) {
            return ((AbstractC7137o00OooO0) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int OooO0Oo(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof AbstractC7137o00OooO0) {
            return ((AbstractC7137o00OooO0) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static int OooO0o(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void OooO0o0(@NonNull TextView textView, @StyleRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static int OooO0oO(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f14082OooO0O0) {
            f14081OooO0O0 = OooO00o("mMaxMode");
            f14082OooO0O0 = true;
        }
        Field field = f14081OooO0O0;
        if (field == null || OooO00o(field, textView) != 1) {
            return -1;
        }
        if (!f14080OooO00o) {
            f14079OooO00o = OooO00o("mMaximum");
            f14080OooO00o = true;
        }
        Field field2 = f14079OooO00o;
        if (field2 != null) {
            return OooO00o(field2, textView);
        }
        return -1;
    }

    public static int OooO0oo(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMinLines();
        }
        if (!f14085OooO0Oo) {
            OooO0Oo = OooO00o("mMinMode");
            f14085OooO0Oo = true;
        }
        Field field = OooO0Oo;
        if (field == null || OooO00o(field, textView) != 1) {
            return -1;
        }
        if (!f14084OooO0OO) {
            f14083OooO0OO = OooO00o("mMinimum");
            f14084OooO0OO = true;
        }
        Field field2 = f14083OooO0OO;
        if (field2 != null) {
            return OooO00o(field2, textView);
        }
        return -1;
    }

    public static int OooO00o(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            String str = "Could not retrieve value of " + field.getName() + " field.";
            return -1;
        }
    }

    public static int OooO0o0(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static void OooO0OO(@NonNull TextView textView, @IntRange(from = 0) @AbstractC0032Px int i) {
        int i2;
        C7086o00OO0OO.OooO00o(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void OooO0Oo(@NonNull TextView textView, @IntRange(from = 0) @AbstractC0032Px int i) {
        C7086o00OO0OO.OooO00o(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public static void OooO00o(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void OooO0O0(@NonNull TextView textView, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else if (i5 >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            int i6 = z ? i3 : i;
            if (!z) {
                i = i3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(i6, i2, i, i4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable[] m14638OooO00o(@NonNull TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    public static int OooO0O0(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof AbstractC7137o00OooO0) {
            return ((AbstractC7137o00OooO0) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static void OooO0O0(@NonNull TextView textView, @IntRange(from = 0) @AbstractC0032Px int i) {
        int i2;
        C7086o00OO0OO.OooO00o(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void OooO00o(@NonNull TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        } else if (textView instanceof AbstractC7137o00OooO0) {
            ((AbstractC7137o00OooO0) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void OooO00o(@NonNull TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (textView instanceof AbstractC7137o00OooO0) {
            ((AbstractC7137o00OooO0) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    @RequiresApi(26)
    public static class OooO00o implements ActionMode.Callback {
        public static final int OooO00o = 100;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ActionMode.Callback f14086OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TextView f14087OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Class f14088OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f14089OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14090OooO00o;
        public boolean OooO0O0 = false;

        public OooO00o(ActionMode.Callback callback, TextView textView) {
            this.f14086OooO00o = callback;
            this.f14087OooO00o = textView;
        }

        private void OooO00o(Menu menu) {
            Method method;
            Context context = this.f14087OooO00o.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f14088OooO00o = cls;
                    this.f14089OooO00o = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f14090OooO00o = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f14088OooO00o = null;
                    this.f14089OooO00o = null;
                    this.f14090OooO00o = false;
                }
            }
            try {
                if (!this.f14090OooO00o || !this.f14088OooO00o.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.f14089OooO00o;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> OooO00o2 = OooO00o(context, packageManager);
                for (int i = 0; i < OooO00o2.size(); i++) {
                    ResolveInfo resolveInfo = OooO00o2.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(OooO00o(resolveInfo, this.f14087OooO00o)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f14086OooO00o.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f14086OooO00o.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f14086OooO00o.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            OooO00o(menu);
            return this.f14086OooO00o.onPrepareActionMode(actionMode, menu);
        }

        private List<ResolveInfo> OooO00o(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(OooO00o(), 0)) {
                if (OooO00o(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean OooO00o(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private Intent OooO00o(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = OooO00o().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !OooO00o(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private boolean OooO00o(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent OooO00o() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(NanoHTTPD.MIME_PLAINTEXT);
        }
    }

    public static void OooO00o(@NonNull TextView textView, @NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (textView instanceof AbstractC7137o00OooO0) {
            ((AbstractC7137o00OooO0) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    public static int OooO00o(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof AbstractC7137o00OooO0) {
            return ((AbstractC7137o00OooO0) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m14637OooO00o(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextAvailableSizes();
        }
        return textView instanceof AbstractC7137o00OooO0 ? ((AbstractC7137o00OooO0) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14636OooO00o(@NonNull TextView textView, @NonNull ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(OooO00o(textView, callback));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static ActionMode.Callback OooO00o(@NonNull TextView textView, @NonNull ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof OooO00o)) ? callback : new OooO00o(callback, textView);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7072o00O0oOO.OooO00o m14635OooO00o(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C7072o00O0oOO.OooO00o(textView.getTextMetricsParams());
        }
        C7072o00O0oOO.OooO00o.C4953OooO00o oooO00o = new C7072o00O0oOO.OooO00o.C4953OooO00o(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            oooO00o.OooO00o(textView.getBreakStrategy());
            oooO00o.OooO0O0(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            oooO00o.OooO00o(m14634OooO00o(textView));
        }
        return oooO00o.OooO00o();
    }

    public static void OooO00o(@NonNull TextView textView, @NonNull C7072o00O0oOO.OooO00o oooO00o) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(OooO00o(oooO00o.m18361OooO00o()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = oooO00o.m18362OooO00o().getTextScaleX();
            textView.getPaint().set(oooO00o.m18362OooO00o());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(oooO00o.m18362OooO00o());
        textView.setBreakStrategy(oooO00o.OooO00o());
        textView.setHyphenationFrequency(oooO00o.OooO0O0());
    }

    public static void OooO00o(@NonNull TextView textView, @NonNull C7072o00O0oOO o00o0ooo) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setText(o00o0ooo.m18359OooO00o());
        } else if (m14635OooO00o(textView).equals(o00o0ooo.m18360OooO00o())) {
            textView.setText(o00o0ooo);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    @RequiresApi(18)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static TextDirectionHeuristic m14634OooO00o(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    @RequiresApi(18)
    public static int OooO00o(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
}
