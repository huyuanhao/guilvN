package com.p118pd.sdk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOoo  reason: case insensitive filesystem */
public abstract class AbstractC5957OooOoo implements AbstractC5961Oooo {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LayoutInflater f17171OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f17172OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17173OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5976OoooO00 f17174OooO00o;
    public Context OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public LayoutInflater f17175OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;

    public AbstractC5957OooOoo(Context context, int i, int i2) {
        this.OooO00o = context;
        this.f17171OooO00o = LayoutInflater.from(context);
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Context context, C5965Oooo00o oooo00o) {
        this.OooO0O0 = context;
        this.f17175OooO0O0 = LayoutInflater.from(context);
        this.f17173OooO00o = oooo00o;
    }

    public abstract void OooO00o(C5967Oooo0OO oooo0OO, AbstractC5976OoooO00.OooO00o oooO00o);

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16761OooO00o() {
        return false;
    }

    public boolean OooO00o(int i, C5967Oooo0OO oooo0OO) {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO0O0(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public int getId() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5976OoooO00 m16760OooO00o(ViewGroup viewGroup) {
        if (this.f17174OooO00o == null) {
            AbstractC5976OoooO00 ooooO00 = (AbstractC5976OoooO00) this.f17171OooO00o.inflate(this.o00oO0O, viewGroup, false);
            this.f17174OooO00o = ooooO00;
            ooooO00.OooO00o(this.f17173OooO00o);
            OooO00o(true);
        }
        return this.f17174OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f17174OooO00o;
        if (viewGroup != null) {
            C5965Oooo00o oooo00o = this.f17173OooO00o;
            int i = 0;
            if (oooo00o != null) {
                oooo00o.m16788OooO0OO();
                ArrayList<C5967Oooo0OO> OooO0OO = this.f17173OooO00o.OooO0OO();
                int size = OooO0OO.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C5967Oooo0OO oooo0OO = OooO0OO.get(i3);
                    if (OooO00o(i2, oooo0OO)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C5967Oooo0OO itemData = childAt instanceof AbstractC5976OoooO00.OooO00o ? ((AbstractC5976OoooO00.OooO00o) childAt).getItemData() : null;
                        View OooO00o2 = OooO00o(oooo0OO, childAt, viewGroup);
                        if (oooo0OO != itemData) {
                            OooO00o2.setPressed(false);
                            OooO00o2.jumpDrawablesToCurrentState();
                        }
                        if (OooO00o2 != childAt) {
                            OooO00o(OooO00o2, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!OooO00o(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public void OooO00o(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f17174OooO00o).addView(view, i);
    }

    public boolean OooO00o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        this.f17172OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    public AbstractC5961Oooo.OooO00o OooO00o() {
        return this.f17172OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public AbstractC5976OoooO00.OooO00o OooO00o(ViewGroup viewGroup) {
        return (AbstractC5976OoooO00.OooO00o) this.f17171OooO00o.inflate(this.o0ooOO0, viewGroup, false);
    }

    public View OooO00o(C5967Oooo0OO oooo0OO, View view, ViewGroup viewGroup) {
        AbstractC5976OoooO00.OooO00o oooO00o;
        if (view instanceof AbstractC5976OoooO00.OooO00o) {
            oooO00o = (AbstractC5976OoooO00.OooO00o) view;
        } else {
            oooO00o = OooO00o(viewGroup);
        }
        OooO00o(oooo0OO, oooO00o);
        return (View) oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        AbstractC5961Oooo.OooO00o oooO00o = this.f17172OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(oooo00o, z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
        AbstractC5961Oooo.OooO00o oooO00o = this.f17172OooO00o;
        if (oooO00o != null) {
            return oooO00o.OooO00o(o000oooo);
        }
        return false;
    }

    public void OooO00o(int i) {
        this.o0ooOOo = i;
    }
}
