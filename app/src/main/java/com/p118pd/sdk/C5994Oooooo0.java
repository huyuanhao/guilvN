package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooooo0  reason: case insensitive filesystem */
public final class C5994Oooooo0 {
    public static final PorterDuff.Mode OooO00o = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO0OO f17299OooO00o = new OooO0OO(6);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C5994Oooooo0 f17300OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17301OooO00o = "AppCompatDrawableManag";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f17302OooO00o = {C0033R.C0035drawable.abc_textfield_search_default_mtrl_alpha, C0033R.C0035drawable.abc_textfield_default_mtrl_alpha, C0033R.C0035drawable.abc_ab_share_pack_mtrl_alpha};
    public static final String OooO0O0 = "appcompat_skip_skip";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final boolean f17303OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f17304OooO0O0 = {C0033R.C0035drawable.abc_ic_commit_search_api_mtrl_alpha, C0033R.C0035drawable.abc_seekbar_tick_mark_material, C0033R.C0035drawable.abc_ic_menu_share_mtrl_alpha, C0033R.C0035drawable.abc_ic_menu_copy_mtrl_am_alpha, C0033R.C0035drawable.abc_ic_menu_cut_mtrl_alpha, C0033R.C0035drawable.abc_ic_menu_selectall_mtrl_alpha, C0033R.C0035drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public static final String OooO0OO = "android.graphics.drawable.VectorDrawable";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f17305OooO0OO = {C0033R.C0035drawable.abc_textfield_activated_mtrl_alpha, C0033R.C0035drawable.abc_textfield_search_activated_mtrl_alpha, C0033R.C0035drawable.abc_cab_background_top_mtrl_alpha, C0033R.C0035drawable.abc_text_cursor_material, C0033R.C0035drawable.abc_text_select_handle_left_mtrl_dark, C0033R.C0035drawable.abc_text_select_handle_middle_mtrl_dark, C0033R.C0035drawable.abc_text_select_handle_right_mtrl_dark, C0033R.C0035drawable.abc_text_select_handle_left_mtrl_light, C0033R.C0035drawable.abc_text_select_handle_middle_mtrl_light, C0033R.C0035drawable.abc_text_select_handle_right_mtrl_light};
    public static final int[] OooO0Oo = {C0033R.C0035drawable.abc_popup_background_mtrl_mult, C0033R.C0035drawable.abc_cab_background_internal_bg, C0033R.C0035drawable.abc_menu_hardkey_panel_mtrl_mult};
    public static final int[] OooO0o = {C0033R.C0035drawable.abc_btn_check_material, C0033R.C0035drawable.abc_btn_radio_material};
    public static final int[] OooO0o0 = {C0033R.C0035drawable.abc_tab_indicator_material, C0033R.C0035drawable.abc_textfield_search_material};

    /* renamed from: OooO00o  reason: collision with other field name */
    public TypedValue f17306OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6971o0000oO0<String, AbstractC5995OooO0Oo> f17307OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7010o000Ooo<String> f17308OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakHashMap<Context, C7010o000Ooo<ColorStateList>> f17309OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17310OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final WeakHashMap<Context, C6930o000<WeakReference<Drawable.ConstantState>>> f17311OooO0O0 = new WeakHashMap<>(0);

    @RequiresApi(11)
    /* renamed from: com.pd.sdk.Oooooo0$OooO00o */
    public static class OooO00o implements AbstractC5995OooO0Oo {
        @Override // com.p118pd.sdk.C5994Oooooo0.AbstractC5995OooO0Oo
        public Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return OooOOO.m16710OooO00o(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.pd.sdk.Oooooo0$OooO0O0 */
    public static class OooO0O0 implements AbstractC5995OooO0Oo {
        @Override // com.p118pd.sdk.C5994Oooooo0.AbstractC5995OooO0Oo
        public Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return C7703o0ooO.OooO00o(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.pd.sdk.Oooooo0$OooO0OO */
    public static class OooO0OO extends C6980o000O000<Integer, PorterDuffColorFilter> {
        public OooO0OO(int i) {
            super(i);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public PorterDuffColorFilter m16835OooO00o(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(OooO00o(i, mode)));
        }

        public PorterDuffColorFilter OooO00o(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(OooO00o(i, mode)), porterDuffColorFilter);
        }

        public static int OooO00o(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: com.pd.sdk.Oooooo0$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5995OooO0Oo {
        Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    /* renamed from: com.pd.sdk.Oooooo0$OooO0o0  reason: case insensitive filesystem */
    public static class C5996OooO0o0 implements AbstractC5995OooO0Oo {
        @Override // com.p118pd.sdk.C5994Oooooo0.AbstractC5995OooO0Oo
        public Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return C7303o0O0OOOo.OooO00o(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static synchronized C5994Oooooo0 OooO00o() {
        C5994Oooooo0 oooooo0;
        synchronized (C5994Oooooo0.class) {
            if (f17300OooO00o == null) {
                C5994Oooooo0 oooooo02 = new C5994Oooooo0();
                f17300OooO00o = oooooo02;
                OooO00o(oooooo02);
            }
            oooooo0 = f17300OooO00o;
        }
        return oooooo0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private Drawable m16830OooO0O0(@NonNull Context context, @DrawableRes int i) {
        if (this.f17306OooO00o == null) {
            this.f17306OooO00o = new TypedValue();
        }
        TypedValue typedValue = this.f17306OooO00o;
        context.getResources().getValue(i, typedValue, true);
        long OooO00o2 = OooO00o(typedValue);
        Drawable OooO00o3 = OooO00o(context, OooO00o2);
        if (OooO00o3 != null) {
            return OooO00o3;
        }
        if (i == C0033R.C0035drawable.abc_cab_background_top_material) {
            OooO00o3 = new LayerDrawable(new Drawable[]{m16833OooO00o(context, C0033R.C0035drawable.abc_cab_background_internal_bg), m16833OooO00o(context, C0033R.C0035drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (OooO00o3 != null) {
            OooO00o3.setChangingConfigurations(typedValue.changingConfigurations);
            OooO00o(context, OooO00o2, OooO00o3);
        }
        return OooO00o3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: OooO0OO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m16832OooO0OO(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.DrawableRes int r12) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5994Oooooo0.m16832OooO0OO(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private ColorStateList OooO0Oo(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList OooO00o2 = C6948o00000oO.m18125OooO00o(context, C0033R.attr.colorSwitchThumbNormal);
        if (OooO00o2 == null || !OooO00o2.isStateful()) {
            iArr[0] = C6948o00000oO.f19120OooO00o;
            iArr2[0] = C6948o00000oO.OooO00o(context, C0033R.attr.colorSwitchThumbNormal);
            iArr[1] = C6948o00000oO.OooO0o0;
            iArr2[1] = C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlActivated);
            iArr[2] = C6948o00000oO.OooO0oo;
            iArr2[2] = C6948o00000oO.OooO0O0(context, C0033R.attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = C6948o00000oO.f19120OooO00o;
            iArr2[0] = OooO00o2.getColorForState(iArr[0], 0);
            iArr[1] = C6948o00000oO.OooO0o0;
            iArr2[1] = C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlActivated);
            iArr[2] = C6948o00000oO.OooO0oo;
            iArr2[2] = OooO00o2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static void OooO00o(@NonNull C5994Oooooo0 oooooo0) {
        if (Build.VERSION.SDK_INT < 24) {
            oooooo0.OooO00o(C7303o0O0OOOo.f19984o0OO00O, new C5996OooO0o0());
            oooooo0.OooO00o(C7703o0ooO.o0ooOoO, new OooO0O0());
            oooooo0.OooO00o("animated-selector", new OooO00o());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Drawable m16833OooO00o(@NonNull Context context, @DrawableRes int i) {
        return OooO00o(context, i, false);
    }

    public synchronized Drawable OooO00o(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable OooO0OO2;
        m16831OooO0O0(context);
        OooO0OO2 = m16832OooO0OO(context, i);
        if (OooO0OO2 == null) {
            OooO0OO2 = m16830OooO0O0(context, i);
        }
        if (OooO0OO2 == null) {
            OooO0OO2 = C7009o000OoOo.m18256OooO00o(context, i);
        }
        if (OooO0OO2 != null) {
            OooO0OO2 = OooO00o(context, i, z, OooO0OO2);
        }
        if (OooO0OO2 != null) {
            o0OO00O.m18877OooO00o(OooO0OO2);
        }
        return OooO0OO2;
    }

    private void OooO0O0(@NonNull String str, @NonNull AbstractC5995OooO0Oo oooO0Oo) {
        C6971o0000oO0<String, AbstractC5995OooO0Oo> o0000oo0 = this.f17307OooO00o;
        if (o0000oo0 != null && o0000oo0.get(str) == oooO0Oo) {
            this.f17307OooO00o.remove(str);
        }
    }

    private ColorStateList OooO0O0(@NonNull Context context) {
        return OooO0O0(context, C6948o00000oO.OooO0O0(context, C0033R.attr.colorAccent));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m16834OooO00o(@NonNull Context context) {
        C6930o000<WeakReference<Drawable.ConstantState>> o000 = this.f17311OooO0O0.get(context);
        if (o000 != null) {
            o000.OooO0O0();
        }
    }

    private ColorStateList OooO0O0(@NonNull Context context, @ColorInt int i) {
        int OooO0O02 = C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlHighlight);
        int OooO00o2 = C6948o00000oO.OooO00o(context, C0033R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{C6948o00000oO.f19120OooO00o, C6948o00000oO.OooO0Oo, C6948o00000oO.OooO0O0, C6948o00000oO.OooO0oo}, new int[]{OooO00o2, C7029o000oo0.OooO0O0(OooO0O02, i), C7029o000oo0.OooO0O0(OooO0O02, i), i});
    }

    public static long OooO00o(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable OooO00o(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList OooO00o2 = OooO00o(context, i);
        if (OooO00o2 != null) {
            if (o0OO00O.m18878OooO00o(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable OooO0O02 = C7043o00O0000.m18317OooO0O0(drawable);
            C7043o00O0000.OooO00o(OooO0O02, OooO00o2);
            PorterDuff.Mode OooO00o3 = OooO00o(i);
            if (OooO00o3 == null) {
                return OooO0O02;
            }
            C7043o00O0000.OooO00o(OooO0O02, OooO00o3);
            return OooO0O02;
        } else if (i == C0033R.C0035drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            OooO00o(layerDrawable.findDrawableByLayerId(16908288), C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlNormal), OooO00o);
            OooO00o(layerDrawable.findDrawableByLayerId(16908303), C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlNormal), OooO00o);
            OooO00o(layerDrawable.findDrawableByLayerId(16908301), C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlActivated), OooO00o);
            return drawable;
        } else if (i == C0033R.C0035drawable.abc_ratingbar_material || i == C0033R.C0035drawable.abc_ratingbar_indicator_material || i == C0033R.C0035drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            OooO00o(layerDrawable2.findDrawableByLayerId(16908288), C6948o00000oO.OooO00o(context, C0033R.attr.colorControlNormal), OooO00o);
            OooO00o(layerDrawable2.findDrawableByLayerId(16908303), C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlActivated), OooO00o);
            OooO00o(layerDrawable2.findDrawableByLayerId(16908301), C6948o00000oO.OooO0O0(context, C0033R.attr.colorControlActivated), OooO00o);
            return drawable;
        } else if (OooO00o(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m16831OooO0O0(@NonNull Context context) {
        if (!this.f17310OooO00o) {
            this.f17310OooO00o = true;
            Drawable OooO00o2 = m16833OooO00o(context, C0033R.C0035drawable.abc_vector_test);
            if (OooO00o2 == null || !OooO00o(OooO00o2)) {
                this.f17310OooO00o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList OooO0OO(@NonNull Context context, @DrawableRes int i) {
        C7010o000Ooo<ColorStateList> o000ooo;
        WeakHashMap<Context, C7010o000Ooo<ColorStateList>> weakHashMap = this.f17309OooO00o;
        if (weakHashMap == null || (o000ooo = weakHashMap.get(context)) == null) {
            return null;
        }
        return o000ooo.m18264OooO00o(i);
    }

    private ColorStateList OooO0OO(@NonNull Context context) {
        return OooO0O0(context, C6948o00000oO.OooO0O0(context, C0033R.attr.colorButtonNormal));
    }

    private synchronized Drawable OooO00o(@NonNull Context context, long j) {
        C6930o000<WeakReference<Drawable.ConstantState>> o000 = this.f17311OooO0O0.get(context);
        if (o000 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> OooO00o2 = o000.m18084OooO00o(j);
        if (OooO00o2 != null) {
            Drawable.ConstantState constantState = OooO00o2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            o000.m18086OooO00o(j);
        }
        return null;
    }

    private synchronized boolean OooO00o(@NonNull Context context, long j, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C6930o000<WeakReference<Drawable.ConstantState>> o000 = this.f17311OooO0O0.get(context);
        if (o000 == null) {
            o000 = new C6930o000<>();
            this.f17311OooO0O0.put(context, o000);
        }
        o000.OooO0O0(j, new WeakReference<>(constantState));
        return true;
    }

    public synchronized Drawable OooO00o(@NonNull Context context, @NonNull C6955o0000OO0 o0000oo0, @DrawableRes int i) {
        Drawable OooO0OO2 = m16832OooO0OO(context, i);
        if (OooO0OO2 == null) {
            OooO0OO2 = o0000oo0.OooO00o(i);
        }
        if (OooO0OO2 == null) {
            return null;
        }
        return OooO00o(context, i, false, OooO0OO2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.DrawableRes int r7, @androidx.annotation.NonNull android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = com.p118pd.sdk.C5994Oooooo0.OooO00o
            int[] r1 = com.p118pd.sdk.C5994Oooooo0.f17302OooO00o
            boolean r1 = OooO00o(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = androidx.appcompat.C0033R.attr.colorControlNormal
        L_0x0012:
            r7 = -1
        L_0x0013:
            r1 = 1
            goto L_0x0042
        L_0x0015:
            int[] r1 = com.p118pd.sdk.C5994Oooooo0.f17305OooO0OO
            boolean r1 = OooO00o(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = androidx.appcompat.C0033R.attr.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = com.p118pd.sdk.C5994Oooooo0.OooO0Oo
            boolean r1 = OooO00o(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = androidx.appcompat.C0033R.C0035drawable.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0013
        L_0x003a:
            int r1 = androidx.appcompat.C0033R.C0035drawable.abc_dialog_material_background
            if (r7 != r1) goto L_0x003f
            goto L_0x0012
        L_0x003f:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x005f
            boolean r1 = com.p118pd.sdk.o0OO00O.m18878OooO00o(r8)
            if (r1 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004e:
            int r6 = com.p118pd.sdk.C6948o00000oO.OooO0O0(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = OooO00o(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x005e
            r8.setAlpha(r7)
        L_0x005e:
            return r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5994Oooooo0.OooO00o(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void OooO00o(@NonNull String str, @NonNull AbstractC5995OooO0Oo oooO0Oo) {
        if (this.f17307OooO00o == null) {
            this.f17307OooO00o = new C6971o0000oO0<>();
        }
        this.f17307OooO00o.put(str, oooO0Oo);
    }

    public static boolean OooO00o(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static PorterDuff.Mode OooO00o(int i) {
        if (i == C0033R.C0035drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public synchronized ColorStateList OooO00o(@NonNull Context context, @DrawableRes int i) {
        ColorStateList OooO0OO2;
        OooO0OO2 = OooO0OO(context, i);
        if (OooO0OO2 == null) {
            if (i == C0033R.C0035drawable.abc_edit_text_material) {
                OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_edittext);
            } else if (i == C0033R.C0035drawable.abc_switch_track_mtrl_alpha) {
                OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_switch_track);
            } else if (i == C0033R.C0035drawable.abc_switch_thumb_material) {
                OooO0OO2 = OooO0Oo(context);
            } else if (i == C0033R.C0035drawable.abc_btn_default_mtrl_shape) {
                OooO0OO2 = OooO0OO(context);
            } else if (i == C0033R.C0035drawable.abc_btn_borderless_material) {
                OooO0OO2 = OooO00o(context);
            } else if (i == C0033R.C0035drawable.abc_btn_colored_material) {
                OooO0OO2 = OooO0O0(context);
            } else {
                if (i != C0033R.C0035drawable.abc_spinner_mtrl_am_alpha) {
                    if (i != C0033R.C0035drawable.abc_spinner_textfield_background_material) {
                        if (OooO00o(f17304OooO0O0, i)) {
                            OooO0OO2 = C6948o00000oO.m18125OooO00o(context, C0033R.attr.colorControlNormal);
                        } else if (OooO00o(OooO0o0, i)) {
                            OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_default);
                        } else if (OooO00o(OooO0o, i)) {
                            OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_btn_checkable);
                        } else if (i == C0033R.C0035drawable.abc_seekbar_thumb_material) {
                            OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_seek_thumb);
                        }
                    }
                }
                OooO0OO2 = C5945OooOOO0.OooO0O0(context, C0033R.C0034color.abc_tint_spinner);
            }
            if (OooO0OO2 != null) {
                OooO00o(context, i, OooO0OO2);
            }
        }
        return OooO0OO2;
    }

    private void OooO00o(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.f17309OooO00o == null) {
            this.f17309OooO00o = new WeakHashMap<>();
        }
        C7010o000Ooo<ColorStateList> o000ooo = this.f17309OooO00o.get(context);
        if (o000ooo == null) {
            o000ooo = new C7010o000Ooo<>();
            this.f17309OooO00o.put(context, o000ooo);
        }
        o000ooo.m18266OooO00o(i, colorStateList);
    }

    private ColorStateList OooO00o(@NonNull Context context) {
        return OooO0O0(context, 0);
    }

    public static void OooO00o(Drawable drawable, C6952o0000O00 o0000o00, int[] iArr) {
        if (!o0OO00O.m18878OooO00o(drawable) || drawable.mutate() == drawable) {
            if (o0000o00.OooO0O0 || o0000o00.f19149OooO00o) {
                drawable.setColorFilter(OooO00o(o0000o00.OooO0O0 ? o0000o00.OooO00o : null, o0000o00.f19149OooO00o ? o0000o00.f19148OooO00o : OooO00o, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return OooO00o(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter OooO00o(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter OooO00o2;
        synchronized (C5994Oooooo0.class) {
            OooO00o2 = f17299OooO00o.m16835OooO00o(i, mode);
            if (OooO00o2 == null) {
                OooO00o2 = new PorterDuffColorFilter(i, mode);
                f17299OooO00o.OooO00o(i, mode, OooO00o2);
            }
        }
        return OooO00o2;
    }

    public static void OooO00o(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (o0OO00O.m18878OooO00o(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = OooO00o;
        }
        drawable.setColorFilter(OooO00o(i, mode));
    }

    public static boolean OooO00o(@NonNull Drawable drawable) {
        return (drawable instanceof C7303o0O0OOOo) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
