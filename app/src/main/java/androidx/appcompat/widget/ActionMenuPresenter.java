package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0033R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p118pd.sdk.AbstractC5957OooOoo;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5974OoooO;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.AbstractC7089o00OO0oO;
import com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo;
import com.p118pd.sdk.C5949OooOOoo;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C5973Oooo0oo;
import com.p118pd.sdk.C6953o0000O0O;
import com.p118pd.sdk.C7043o00O0000;
import com.p118pd.sdk.C8888ooOO;
import com.p118pd.sdk.SubMenuC7026o000oOoO;
import java.util.ArrayList;

public class ActionMenuPresenter extends AbstractC5957OooOoo implements AbstractC7089o00OO0oO.OooO00o {
    public static final String o0ooOOo = "ActionMenuPresenter";
    public Drawable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseBooleanArray f13730OooO00o = new SparseBooleanArray();

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13731OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f13732OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f13733OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f13734OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5007OooO0Oo f13735OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5008OooO0o0 f13736OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0o f13737OooO00o = new OooO0o();
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOoO;
    public int oo0o0Oo;

    public class OooO00o extends C5973Oooo0oo {
        public OooO00o(Context context, SubMenuC7026o000oOoO o000oooo, View view) {
            super(context, o000oooo, view, false, C0033R.attr.actionOverflowMenuStyle);
            if (!((C5967Oooo0OO) o000oooo.getItem()).OooO0OO()) {
                View view2 = ActionMenuPresenter.this.f13735OooO00o;
                OooO00o(view2 == null ? (View) ((AbstractC5957OooOoo) ActionMenuPresenter.this).f17174OooO00o : view2);
            }
            OooO00o(ActionMenuPresenter.this.f13737OooO00o);
        }

        @Override // com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo
        public void OooO00o() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f13732OooO00o = null;
            actionMenuPresenter.oo0o0Oo = 0;
            super.m16803OooO00o();
        }
    }

    public class OooO0O0 extends ActionMenuItemView.OooO0O0 {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.OooO0O0
        public AbstractC5974OoooO OooO00o() {
            OooO00o oooO00o = ActionMenuPresenter.this.f13732OooO00o;
            if (oooO00o != null) {
                return oooO00o.m16802OooO00o();
            }
            return null;
        }
    }

    public class OooO0OO implements Runnable {
        public C5008OooO0o0 OooO00o;

        public OooO0OO(C5008OooO0o0 oooO0o0) {
            this.OooO00o = oooO0o0;
        }

        public void run() {
            if (((AbstractC5957OooOoo) ActionMenuPresenter.this).f17173OooO00o != null) {
                ((AbstractC5957OooOoo) ActionMenuPresenter.this).f17173OooO00o.m16779OooO00o();
            }
            View view = (View) ((AbstractC5957OooOoo) ActionMenuPresenter.this).f17174OooO00o;
            if (!(view == null || view.getWindowToken() == null || !this.OooO00o.m16807OooO0O0())) {
                ActionMenuPresenter.this.f13736OooO00o = this.OooO00o;
            }
            ActionMenuPresenter.this.f13734OooO00o = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0Oo  reason: case insensitive filesystem */
    public class C5007OooO0Oo extends C8888ooOO implements ActionMenuView.OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final float[] f13739OooO00o = new float[2];

        public C5007OooO0Oo(Context context) {
            super(context, null, C0033R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C6953o0000O0O.OooO00o(this, getContentDescription());
            setOnTouchListener(new OooO00o(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public boolean OooO0O0() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public boolean OooO0Oo() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.OooO0oo();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C7043o00O0000.OooO00o(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0Oo$OooO00o */
        public class OooO00o extends AbstractView$OnTouchListenerC6995o000OOo {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ ActionMenuPresenter f13740OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f13740OooO00o = actionMenuPresenter;
            }

            @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
            public AbstractC5974OoooO OooO00o() {
                C5008OooO0o0 oooO0o0 = ActionMenuPresenter.this.f13736OooO00o;
                if (oooO0o0 == null) {
                    return null;
                }
                return oooO0o0.m16802OooO00o();
            }

            @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
            public boolean OooO0O0() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f13734OooO00o != null) {
                    return false;
                }
                actionMenuPresenter.OooO0OO();
                return true;
            }

            @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m14427OooO00o() {
                ActionMenuPresenter.this.OooO0oo();
                return true;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0o0  reason: case insensitive filesystem */
    public class C5008OooO0o0 extends C5973Oooo0oo {
        public C5008OooO0o0(Context context, C5965Oooo00o oooo00o, View view, boolean z) {
            super(context, oooo00o, view, z, C0033R.attr.actionOverflowMenuStyle);
            OooO00o(8388613);
            OooO00o(ActionMenuPresenter.this.f13737OooO00o);
        }

        @Override // com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo, com.p118pd.sdk.C5973Oooo0oo
        public void OooO00o() {
            if (((AbstractC5957OooOoo) ActionMenuPresenter.this).f17173OooO00o != null) {
                ((AbstractC5957OooOoo) ActionMenuPresenter.this).f17173OooO00o.close();
            }
            ActionMenuPresenter.this.f13736OooO00o = null;
            super.m16803OooO00o();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public int o00oO0O;

        public static class OooO00o implements Parcelable.Creator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.o00oO0O);
        }

        public SavedState(Parcel parcel) {
            this.o00oO0O = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0033R.layout.abc_action_menu_layout, C0033R.layout.abc_action_menu_item_layout);
    }

    public boolean OooO0o() {
        C5008OooO0o0 oooO0o0 = this.f13736OooO00o;
        return oooO0o0 != null && oooO0o0.m16804OooO00o();
    }

    public boolean OooO0o0() {
        return this.f13734OooO00o != null || OooO0o();
    }

    public boolean OooO0oO() {
        return this.OooO0OO;
    }

    public boolean OooO0oo() {
        C5965Oooo00o oooo00o;
        if (!this.OooO0OO || OooO0o() || (oooo00o = ((AbstractC5957OooOoo) this).f17173OooO00o) == null || ((AbstractC5957OooOoo) this).f17174OooO00o == null || this.f13734OooO00o != null || oooo00o.OooO0O0().isEmpty()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO(new C5008OooO0o0(((AbstractC5957OooOoo) this).OooO0O0, ((AbstractC5957OooOoo) this).f17173OooO00o, this.f13735OooO00o, true));
        this.f13734OooO00o = oooO0OO;
        ((View) ((AbstractC5957OooOoo) this).f17174OooO00o).post(oooO0OO);
        super.OooO00o((SubMenuC7026o000oOoO) null);
        return true;
    }

    public void OooO0OO(boolean z) {
        this.OooO0oo = z;
    }

    public void OooO0Oo(boolean z) {
        this.OooO0OO = z;
        this.OooO0Oo = true;
    }

    public class OooO0o implements AbstractC5961Oooo.OooO00o {
        public OooO0o() {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o) {
            if (oooo00o == null) {
                return false;
            }
            ActionMenuPresenter.this.oo0o0Oo = ((SubMenuC7026o000oOoO) oooo00o).getItem().getItemId();
            AbstractC5961Oooo.OooO00o OooO00o2 = ActionMenuPresenter.this.OooO00o();
            if (OooO00o2 != null) {
                return OooO00o2.OooO00o(oooo00o);
            }
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
            if (oooo00o instanceof SubMenuC7026o000oOoO) {
                oooo00o.m16773OooO00o().OooO00o(false);
            }
            AbstractC5961Oooo.OooO00o OooO00o2 = ActionMenuPresenter.this.OooO00o();
            if (OooO00o2 != null) {
                OooO00o2.OooO00o(oooo00o, z);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(@NonNull Context context, @Nullable C5965Oooo00o oooo00o) {
        super.OooO00o(context, oooo00o);
        Resources resources = context.getResources();
        C5949OooOOoo OooO00o2 = C5949OooOOoo.OooO00o(context);
        if (!this.OooO0Oo) {
            this.OooO0OO = OooO00o2.m16739OooO0OO();
        }
        if (!this.OooO0oO) {
            this.o0ooOoO = OooO00o2.OooO00o();
        }
        if (!this.OooO0o0) {
            this.o0Oo0oo = OooO00o2.OooO0O0();
        }
        int i = this.o0ooOoO;
        if (this.OooO0OO) {
            if (this.f13735OooO00o == null) {
                C5007OooO0Oo oooO0Oo = new C5007OooO0Oo(((AbstractC5957OooOoo) this).OooO00o);
                this.f13735OooO00o = oooO0Oo;
                if (this.OooO0O0) {
                    oooO0Oo.setImageDrawable(this.OooO00o);
                    this.OooO00o = null;
                    this.OooO0O0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13735OooO00o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f13735OooO00o.getMeasuredWidth();
        } else {
            this.f13735OooO00o = null;
        }
        this.o0OOO0o = i;
        this.o0OO00O = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f13731OooO00o = null;
    }

    public void OooO0O0(int i) {
        this.o0Oo0oo = i;
        this.OooO0o0 = true;
    }

    public boolean OooO0OO() {
        AbstractC5976OoooO00 ooooO00;
        OooO0OO oooO0OO = this.f13734OooO00o;
        if (oooO0OO == null || (ooooO00 = ((AbstractC5957OooOoo) this).f17174OooO00o) == null) {
            C5008OooO0o0 oooO0o0 = this.f13736OooO00o;
            if (oooO0o0 == null) {
                return false;
            }
            oooO0o0.dismiss();
            return true;
        }
        ((View) ooooO00).removeCallbacks(oooO0OO);
        this.f13734OooO00o = null;
        return true;
    }

    public boolean OooO0Oo() {
        OooO00o oooO00o = this.f13732OooO00o;
        if (oooO00o == null) {
            return false;
        }
        oooO00o.dismiss();
        return true;
    }

    public boolean OooO0O0() {
        return OooO0OO() | OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7089o00OO0oO.OooO00o
    public void OooO0O0(boolean z) {
        if (z) {
            super.OooO00o((SubMenuC7026o000oOoO) null);
            return;
        }
        C5965Oooo00o oooo00o = ((AbstractC5957OooOoo) this).f17173OooO00o;
        if (oooo00o != null) {
            oooo00o.OooO00o(false);
        }
    }

    public void OooO00o(Configuration configuration) {
        if (!this.OooO0o0) {
            this.o0Oo0oo = C5949OooOOoo.OooO00o(((AbstractC5957OooOoo) this).OooO0O0).OooO0O0();
        }
        C5965Oooo00o oooo00o = ((AbstractC5957OooOoo) this).f17173OooO00o;
        if (oooo00o != null) {
            oooo00o.OooO0O0(true);
        }
    }

    public void OooO00o(int i, boolean z) {
        this.o0ooOoO = i;
        this.OooO0o = z;
        this.OooO0oO = true;
    }

    public void OooO00o(Drawable drawable) {
        C5007OooO0Oo oooO0Oo = this.f13735OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.setImageDrawable(drawable);
            return;
        }
        this.OooO0O0 = true;
        this.OooO00o = drawable;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    public Drawable OooO00o() {
        C5007OooO0Oo oooO0Oo = this.f13735OooO00o;
        if (oooO0Oo != null) {
            return oooO0Oo.getDrawable();
        }
        if (this.OooO0O0) {
            return this.OooO00o;
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo
    public AbstractC5976OoooO00 OooO00o(ViewGroup viewGroup) {
        AbstractC5976OoooO00 ooooO00 = ((AbstractC5957OooOoo) this).f17174OooO00o;
        AbstractC5976OoooO00 OooO00o2 = super.m16760OooO00o(viewGroup);
        if (ooooO00 != OooO00o2) {
            ((ActionMenuView) OooO00o2).setPresenter(this);
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo
    public View OooO00o(C5967Oooo0OO oooo0OO, View view, ViewGroup viewGroup) {
        View actionView = oooo0OO.getActionView();
        if (actionView == null || oooo0OO.m16796OooO00o()) {
            actionView = super.OooO00o(oooo0OO, view, viewGroup);
        }
        actionView.setVisibility(oooo0OO.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo
    public void OooO00o(C5967Oooo0OO oooo0OO, AbstractC5976OoooO00.OooO00o oooO00o) {
        oooO00o.OooO00o(oooo0OO, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) oooO00o;
        actionMenuItemView.setItemInvoker((ActionMenuView) ((AbstractC5957OooOoo) this).f17174OooO00o);
        if (this.f13733OooO00o == null) {
            this.f13733OooO00o = new OooO0O0();
        }
        actionMenuItemView.setPopupCallback(this.f13733OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo
    public boolean OooO00o(int i, C5967Oooo0OO oooo0OO) {
        return oooo0OO.OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(boolean z) {
        AbstractC5976OoooO00 ooooO00;
        super.OooO00o(z);
        ((View) ((AbstractC5957OooOoo) this).f17174OooO00o).requestLayout();
        C5965Oooo00o oooo00o = ((AbstractC5957OooOoo) this).f17173OooO00o;
        boolean z2 = false;
        if (oooo00o != null) {
            ArrayList<C5967Oooo0OO> OooO00o2 = oooo00o.m16778OooO00o();
            int size = OooO00o2.size();
            for (int i = 0; i < size; i++) {
                AbstractC7089o00OO0oO OooO00o3 = OooO00o2.get(i).m16792OooO00o();
                if (OooO00o3 != null) {
                    OooO00o3.OooO00o(this);
                }
            }
        }
        C5965Oooo00o oooo00o2 = ((AbstractC5957OooOoo) this).f17173OooO00o;
        ArrayList<C5967Oooo0OO> OooO0O02 = oooo00o2 != null ? oooo00o2.OooO0O0() : null;
        if (this.OooO0OO && OooO0O02 != null) {
            int size2 = OooO0O02.size();
            if (size2 == 1) {
                z2 = !OooO0O02.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f13735OooO00o == null) {
                this.f13735OooO00o = new C5007OooO0Oo(((AbstractC5957OooOoo) this).OooO00o);
            }
            ViewGroup viewGroup = (ViewGroup) this.f13735OooO00o.getParent();
            if (viewGroup != ((AbstractC5957OooOoo) this).f17174OooO00o) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13735OooO00o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) ((AbstractC5957OooOoo) this).f17174OooO00o;
                actionMenuView.addView(this.f13735OooO00o, actionMenuView.OooO0O0());
            }
        } else {
            C5007OooO0Oo oooO0Oo = this.f13735OooO00o;
            if (oooO0Oo != null && oooO0Oo.getParent() == (ooooO00 = ((AbstractC5957OooOoo) this).f17174OooO00o)) {
                ((ViewGroup) ooooO00).removeView(this.f13735OooO00o);
            }
        }
        ((ActionMenuView) ((AbstractC5957OooOoo) this).f17174OooO00o).setOverflowReserved(this.OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo
    public boolean OooO00o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f13735OooO00o) {
            return false;
        }
        return super.OooO00o(viewGroup, i);
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
        boolean z = false;
        if (!o000oooo.hasVisibleItems()) {
            return false;
        }
        SubMenuC7026o000oOoO o000oooo2 = o000oooo;
        while (o000oooo2.OooO00o() != ((AbstractC5957OooOoo) this).f17173OooO00o) {
            o000oooo2 = (SubMenuC7026o000oOoO) o000oooo2.OooO00o();
        }
        View OooO00o2 = OooO00o(o000oooo2.getItem());
        if (OooO00o2 == null) {
            return false;
        }
        this.oo0o0Oo = o000oooo.getItem().getItemId();
        int size = o000oooo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = o000oooo.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        OooO00o oooO00o = new OooO00o(((AbstractC5957OooOoo) this).OooO0O0, o000oooo, OooO00o2);
        this.f13732OooO00o = oooO00o;
        oooO00o.OooO00o(z);
        this.f13732OooO00o.m16806OooO0O0();
        super.OooO00o(o000oooo);
        return true;
    }

    private View OooO00o(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) ((AbstractC5957OooOoo) this).f17174OooO00o;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AbstractC5976OoooO00.OooO00o) && ((AbstractC5976OoooO00.OooO00o) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14426OooO00o() {
        int i;
        ArrayList<C5967Oooo0OO> arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C5965Oooo00o oooo00o = ((AbstractC5957OooOoo) actionMenuPresenter).f17173OooO00o;
        int i5 = 0;
        if (oooo00o != null) {
            arrayList = oooo00o.OooO0OO();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.o0Oo0oo;
        int i7 = actionMenuPresenter.o0OOO0o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) ((AbstractC5957OooOoo) actionMenuPresenter).f17174OooO00o;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C5967Oooo0OO oooo0OO = arrayList.get(i10);
            if (oooo0OO.OooO0o()) {
                i8++;
            } else if (oooo0OO.OooO0o0()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.OooO0oo && oooo0OO.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.OooO0OO && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f13730OooO00o;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.OooO0o) {
            int i12 = actionMenuPresenter.o0OO00O;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C5967Oooo0OO oooo0OO2 = arrayList.get(i13);
            if (oooo0OO2.OooO0o()) {
                View OooO00o2 = actionMenuPresenter.OooO00o(oooo0OO2, actionMenuPresenter.f13731OooO00o, viewGroup);
                if (actionMenuPresenter.f13731OooO00o == null) {
                    actionMenuPresenter.f13731OooO00o = OooO00o2;
                }
                if (actionMenuPresenter.OooO0o) {
                    i2 -= ActionMenuView.OooO00o(OooO00o2, i3, i2, makeMeasureSpec, i5);
                } else {
                    OooO00o2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = OooO00o2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = oooo0OO2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                oooo0OO2.OooO0Oo(true);
                i4 = i;
            } else if (oooo0OO2.OooO0o0()) {
                int groupId2 = oooo0OO2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.OooO0o || i2 > 0);
                boolean z4 = z3;
                if (z3) {
                    View OooO00o3 = actionMenuPresenter.OooO00o(oooo0OO2, actionMenuPresenter.f13731OooO00o, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f13731OooO00o == null) {
                        actionMenuPresenter.f13731OooO00o = OooO00o3;
                    }
                    if (actionMenuPresenter.OooO0o) {
                        int OooO00o4 = ActionMenuView.OooO00o(OooO00o3, i3, i2, makeMeasureSpec, 0);
                        i2 -= OooO00o4;
                        if (OooO00o4 == 0) {
                            z4 = false;
                        }
                    } else {
                        OooO00o3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = OooO00o3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z4 & (!actionMenuPresenter.OooO0o ? i7 + i14 > 0 : i7 >= 0);
                } else {
                    i4 = i;
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C5967Oooo0OO oooo0OO3 = arrayList.get(i15);
                        if (oooo0OO3.getGroupId() == groupId2) {
                            if (oooo0OO3.OooO0OO()) {
                                i11++;
                            }
                            oooo0OO3.OooO0Oo(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                oooo0OO2.OooO0Oo(z3);
            } else {
                i4 = i;
                oooo0OO2.OooO0Oo(false);
                i13++;
                i5 = 0;
                actionMenuPresenter = this;
                i = i4;
            }
            i13++;
            i5 = 0;
            actionMenuPresenter = this;
            i = i4;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        OooO0O0();
        super.OooO00o(oooo00o, z);
    }

    @Override // com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5957OooOoo, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Parcelable m14425OooO00o() {
        SavedState savedState = new SavedState();
        savedState.o00oO0O = this.oo0o0Oo;
        return savedState;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).o00oO0O) > 0 && (findItem = ((AbstractC5957OooOoo) this).f17173OooO00o.findItem(i)) != null) {
            OooO00o((SubMenuC7026o000oOoO) findItem.getSubMenu());
        }
    }

    public void OooO00o(ActionMenuView actionMenuView) {
        ((AbstractC5957OooOoo) this).f17174OooO00o = actionMenuView;
        actionMenuView.OooO00o(((AbstractC5957OooOoo) this).f17173OooO00o);
    }
}
