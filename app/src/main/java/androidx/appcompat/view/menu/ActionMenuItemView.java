package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.ActionMenuView;
import com.p118pd.sdk.AbstractC5974OoooO;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C6953o0000O0O;
import com.p118pd.sdk.C7724o0ooOOo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActionMenuItemView extends C7724o0ooOOo implements AbstractC5976OoooO00.OooO00o, View.OnClickListener, ActionMenuView.OooO00o {
    public static final String o0ooOOo = "ActionMenuItemView";
    public static final int o0ooOoO = 32;
    public Drawable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f13665OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o.OooO0O0 f13666OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5967Oooo0OO f13667OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractView$OnTouchListenerC6995o000OOo f13668OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f13669OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f13670o0ooOOo;

    public static abstract class OooO0O0 {
        public abstract AbstractC5974OoooO OooO00o();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean OooO0o() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void OooO00o(C5967Oooo0OO oooo0OO, int i) {
        this.f13667OooO00o = oooo0OO;
        setIcon(oooo0OO.getIcon());
        setTitle(oooo0OO.OooO00o((AbstractC5976OoooO00.OooO00o) this));
        setId(oooo0OO.getItemId());
        setVisibility(oooo0OO.isVisible() ? 0 : 8);
        setEnabled(oooo0OO.isEnabled());
        if (oooo0OO.hasSubMenu() && this.f13668OooO00o == null) {
            this.f13668OooO00o = new OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void OooO00o(boolean z, char c) {
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14403OooO00o() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean OooO0O0() {
        return OooO0o0() && this.f13667OooO00o.getIcon() == null;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public boolean OooO0OO() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean OooO0Oo() {
        return OooO0o0();
    }

    public boolean OooO0o0() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public C5967Oooo0OO getItemData() {
        return this.f13667OooO00o;
    }

    public void onClick(View view) {
        C5965Oooo00o.OooO0O0 oooO0O0 = this.f13666OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(this.f13667OooO00o);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.OooO0O0 = OooO0o();
        OooO00o();
    }

    @Override // com.p118pd.sdk.C7724o0ooOOo
    public void onMeasure(int i, int i2) {
        int i3;
        boolean OooO0o0 = OooO0o0();
        if (OooO0o0 && (i3 = this.o0ooOO0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.o00oO0O) : this.o00oO0O;
        if (mode != 1073741824 && this.o00oO0O > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!OooO0o0 && this.OooO00o != null) {
            super.setPadding((getMeasuredWidth() - this.OooO00o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC6995o000OOo o000ooo;
        if (!this.f13667OooO00o.hasSubMenu() || (o000ooo = this.f13668OooO00o) == null || !o000ooo.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setCheckable(boolean z) {
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.OooO0OO != z) {
            this.OooO0OO = z;
            C5967Oooo0OO oooo0OO = this.f13667OooO00o;
            if (oooo0OO != null) {
                oooo0OO.m16795OooO00o();
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setIcon(Drawable drawable) {
        this.OooO00o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f13670o0ooOOo;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f13670o0ooOOo;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooO00o();
    }

    public void setItemInvoker(C5965Oooo00o.OooO0O0 oooO0O0) {
        this.f13666OooO00o = oooO0O0;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.o0ooOO0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(OooO0O0 oooO0O0) {
        this.f13665OooO00o = oooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setTitle(CharSequence charSequence) {
        this.f13669OooO00o = charSequence;
        OooO00o();
    }

    public class OooO00o extends AbstractView$OnTouchListenerC6995o000OOo {
        public OooO00o() {
            super(ActionMenuItemView.this);
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public AbstractC5974OoooO OooO00o() {
            OooO0O0 oooO0O0 = ActionMenuItemView.this.f13665OooO00o;
            if (oooO0O0 != null) {
                return oooO0O0.OooO00o();
            }
            return null;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14404OooO00o() {
            AbstractC5974OoooO OooO00o2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C5965Oooo00o.OooO0O0 oooO0O0 = actionMenuItemView.f13666OooO00o;
            if (oooO0O0 == null || !oooO0O0.OooO00o(actionMenuItemView.f13667OooO00o) || (OooO00o2 = OooO00o()) == null || !OooO00o2.OooO0O0()) {
                return false;
            }
            return true;
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.OooO0O0 = OooO0o();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooO0OO, i, 0);
        this.o00oO0O = obtainStyledAttributes.getDimensionPixelSize(C0033R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f13670o0ooOOo = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o0ooOO0 = -1;
        setSaveEnabled(false);
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    private void OooO00o() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f13669OooO00o);
        if (this.OooO00o != null && (!this.f13667OooO00o.OooO() || (!this.OooO0O0 && !this.OooO0OO))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f13669OooO00o : null);
        CharSequence contentDescription = this.f13667OooO00o.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f13667OooO00o.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f13667OooO00o.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f13667OooO00o.getTitle();
            }
            C6953o0000O0O.OooO00o(this, charSequence2);
            return;
        }
        C6953o0000O0O.OooO00o(this, tooltipText);
    }
}
