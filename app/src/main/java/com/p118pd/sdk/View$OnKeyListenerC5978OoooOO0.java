package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;

/* renamed from: com.pd.sdk.OoooOO0  reason: case insensitive filesystem */
public final class View$OnKeyListenerC5978OoooOO0 extends AbstractC5972Oooo0oO implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, AbstractC5961Oooo, View.OnKeyListener {
    public static final int o0Oo0oo = C0033R.layout.abc_popup_menu_item_layout;
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View.OnAttachStateChangeListener f17249OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f17250OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ViewTreeObserver.OnGlobalLayoutListener f17251OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewTreeObserver f17252OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow.OnDismissListener f17253OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f17254OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5964Oooo00O f17255OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5965Oooo00o f17256OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6940o000000o f17257OooO00o;
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f17258OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;
    public final int o00oO0O;
    public int o0OOO0o = 0;
    public final int o0ooOO0;
    public final int o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.OoooOO0$OooO00o */
    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerC5978OoooOO0.this.OooO0O0() && !View$OnKeyListenerC5978OoooOO0.this.f17257OooO00o.m18113OooO0Oo()) {
                View view = View$OnKeyListenerC5978OoooOO0.this.OooO0O0;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC5978OoooOO0.this.dismiss();
                } else {
                    View$OnKeyListenerC5978OoooOO0.this.f17257OooO00o.m18102OooO00o();
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.OoooOO0$OooO0O0 */
    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC5978OoooOO0.this.f17252OooO00o;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC5978OoooOO0.this.f17252OooO00o = view.getViewTreeObserver();
                }
                View$OnKeyListenerC5978OoooOO0 ooooOO0 = View$OnKeyListenerC5978OoooOO0.this;
                ooooOO0.f17252OooO00o.removeGlobalOnLayoutListener(ooooOO0.f17251OooO00o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC5978OoooOO0(Context context, C5965Oooo00o oooo00o, View view, int i, int i2, boolean z) {
        this.OooO00o = context;
        this.f17256OooO00o = oooo00o;
        this.f17258OooO0O0 = z;
        this.f17255OooO00o = new C5964Oooo00O(oooo00o, LayoutInflater.from(context), this.f17258OooO0O0, o0Oo0oo);
        this.o0ooOO0 = i;
        this.o0ooOOo = i2;
        Resources resources = context.getResources();
        this.o00oO0O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0033R.dimen.abc_config_prefDialogWidth));
        this.f17250OooO00o = view;
        this.f17257OooO00o = new C6940o000000o(this.OooO00o, null, this.o0ooOO0, this.o0ooOOo);
        oooo00o.OooO00o(this, context);
    }

    private boolean OooO0Oo() {
        View view;
        if (OooO0O0()) {
            return true;
        }
        if (this.OooO0OO || (view = this.f17250OooO00o) == null) {
            return false;
        }
        this.OooO0O0 = view;
        this.f17257OooO00o.OooO00o((PopupWindow.OnDismissListener) this);
        this.f17257OooO00o.OooO00o((AdapterView.OnItemClickListener) this);
        this.f17257OooO00o.OooO0OO(true);
        View view2 = this.OooO0O0;
        boolean z = this.f17252OooO00o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f17252OooO00o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f17251OooO00o);
        }
        view2.addOnAttachStateChangeListener(this.f17249OooO00o);
        this.f17257OooO00o.m18103OooO00o(view2);
        this.f17257OooO00o.OooO0OO(this.o0OOO0o);
        if (!this.OooO0Oo) {
            this.o0ooOoO = AbstractC5972Oooo0oO.OooO00o(this.f17255OooO00o, null, this.OooO00o, this.o00oO0O);
            this.OooO0Oo = true;
        }
        this.f17257OooO00o.m18108OooO0O0(this.o0ooOoO);
        this.f17257OooO00o.OooO0o(2);
        this.f17257OooO00o.OooO00o(OooO00o());
        this.f17257OooO00o.m18102OooO00o();
        ListView OooO00o2 = this.f17257OooO00o.m18100OooO00o();
        OooO00o2.setOnKeyListener(this);
        if (this.OooO0o0 && this.f17256OooO00o.m16776OooO00o() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.OooO00o).inflate(C0033R.layout.abc_popup_menu_header_item_layout, (ViewGroup) OooO00o2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f17256OooO00o.m16776OooO00o());
            }
            frameLayout.setEnabled(false);
            OooO00o2.addHeaderView(frameLayout, null, false);
        }
        this.f17257OooO00o.OooO00o((ListAdapter) this.f17255OooO00o);
        this.f17257OooO00o.m18102OooO00o();
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    public Parcelable OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(int i) {
        this.o0OOO0o = i;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Parcelable parcelable) {
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(C5965Oooo00o oooo00o) {
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16811OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0O0(boolean z) {
        this.f17255OooO00o.OooO00o(z);
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0OO(int i) {
        this.f17257OooO00o.OooOO0O(i);
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public void dismiss() {
        if (OooO0O0()) {
            this.f17257OooO00o.dismiss();
        }
    }

    public void onDismiss() {
        this.OooO0OO = true;
        this.f17256OooO00o.close();
        ViewTreeObserver viewTreeObserver = this.f17252OooO00o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f17252OooO00o = this.OooO0O0.getViewTreeObserver();
            }
            this.f17252OooO00o.removeGlobalOnLayoutListener(this.f17251OooO00o);
            this.f17252OooO00o = null;
        }
        this.OooO0O0.removeOnAttachStateChangeListener(this.f17249OooO00o);
        PopupWindow.OnDismissListener onDismissListener = this.f17253OooO00o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16810OooO00o() {
        if (!OooO0Oo()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public boolean OooO0O0() {
        return !this.OooO0OO && this.f17257OooO00o.m18109OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0OO(boolean z) {
        this.OooO0o0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0O0(int i) {
        this.f17257OooO00o.OooO0o0(i);
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(boolean z) {
        this.OooO0Oo = false;
        C5964Oooo00O oooo00O = this.f17255OooO00o;
        if (oooo00O != null) {
            oooo00O.notifyDataSetChanged();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        this.f17254OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
        if (o000oooo.hasVisibleItems()) {
            C5973Oooo0oo oooo0oo = new C5973Oooo0oo(this.OooO00o, o000oooo, this.OooO0O0, this.f17258OooO0O0, this.o0ooOO0, this.o0ooOOo);
            oooo0oo.OooO00o(this.f17254OooO00o);
            oooo0oo.OooO00o(AbstractC5972Oooo0oO.OooO00o((C5965Oooo00o) o000oooo));
            oooo0oo.OooO00o(this.f17253OooO00o);
            this.f17253OooO00o = null;
            this.f17256OooO00o.OooO00o(false);
            int OooO0OO2 = this.f17257OooO00o.OooO0OO();
            int OooO0oo = this.f17257OooO00o.OooO0oo();
            if ((Gravity.getAbsoluteGravity(this.o0OOO0o, ViewCompat.m14593OooO0o(this.f17250OooO00o)) & 7) == 5) {
                OooO0OO2 += this.f17250OooO00o.getWidth();
            }
            if (oooo0oo.m16805OooO00o(OooO0OO2, OooO0oo)) {
                AbstractC5961Oooo.OooO00o oooO00o = this.f17254OooO00o;
                if (oooO00o == null) {
                    return true;
                }
                oooO00o.OooO00o(o000oooo);
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        if (oooo00o == this.f17256OooO00o) {
            dismiss();
            AbstractC5961Oooo.OooO00o oooO00o = this.f17254OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o(oooo00o, z);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(View view) {
        this.f17250OooO00o = view;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(PopupWindow.OnDismissListener onDismissListener) {
        this.f17253OooO00o = onDismissListener;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m16809OooO00o() {
        return this.f17257OooO00o.m18100OooO00o();
    }
}
