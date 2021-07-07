package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.learnium.RNDeviceInfo.SystemBarTintManager;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000O  reason: case insensitive filesystem */
public class C6950o0000O {
    public static final String OooO00o = "TooltipPopup";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19122OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19123OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f19124OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WindowManager.LayoutParams f19125OooO00o = new WindowManager.LayoutParams();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TextView f19126OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19127OooO00o = new int[2];
    public final int[] OooO0O0 = new int[2];

    public C6950o0000O(Context context) {
        this.f19122OooO00o = context;
        View inflate = LayoutInflater.from(context).inflate(C0033R.layout.abc_tooltip, (ViewGroup) null);
        this.f19124OooO00o = inflate;
        this.f19126OooO00o = (TextView) inflate.findViewById(C0033R.C0036id.message);
        this.f19125OooO00o.setTitle(C6950o0000O.class.getSimpleName());
        this.f19125OooO00o.packageName = this.f19122OooO00o.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f19125OooO00o;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0033R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void OooO00o(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m18127OooO00o()) {
            OooO00o();
        }
        this.f19126OooO00o.setText(charSequence);
        OooO00o(view, i, i2, z, this.f19125OooO00o);
        ((WindowManager) this.f19122OooO00o.getSystemService("window")).addView(this.f19124OooO00o, this.f19125OooO00o);
    }

    public void OooO00o() {
        if (m18127OooO00o()) {
            ((WindowManager) this.f19122OooO00o.getSystemService("window")).removeView(this.f19124OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18127OooO00o() {
        return this.f19124OooO00o.getParent() != null;
    }

    private void OooO00o(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f19122OooO00o.getResources().getDimensionPixelOffset(C0033R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f19122OooO00o.getResources().getDimensionPixelOffset(C0033R.dimen.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f19122OooO00o.getResources().getDimensionPixelOffset(z ? C0033R.dimen.tooltip_y_offset_touch : C0033R.dimen.tooltip_y_offset_non_touch);
        View OooO00o2 = OooO00o(view);
        if (OooO00o2 != null) {
            OooO00o2.getWindowVisibleDisplayFrame(this.f19123OooO00o);
            Rect rect = this.f19123OooO00o;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = this.f19122OooO00o.getResources();
                int identifier = resources.getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f19123OooO00o.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            OooO00o2.getLocationOnScreen(this.OooO0O0);
            view.getLocationOnScreen(this.f19127OooO00o);
            int[] iArr = this.f19127OooO00o;
            int i5 = iArr[0];
            int[] iArr2 = this.OooO0O0;
            iArr[0] = i5 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i) - (OooO00o2.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f19124OooO00o.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f19124OooO00o.getMeasuredHeight();
            int[] iArr3 = this.f19127OooO00o;
            int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
            if (z) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= this.f19123OooO00o.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
    }

    public static View OooO00o(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
