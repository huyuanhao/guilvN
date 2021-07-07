package com.p118pd.sdk;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00OoO  reason: case insensitive filesystem */
public abstract class AbstractC7278o0O00OoO {
    public static final int OooO0O0 = Integer.MIN_VALUE;
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19944OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RecyclerView.OooOOO0 f19945OooO00o;

    /* renamed from: com.pd.sdk.o0O00OoO$OooO00o */
    public static class OooO00o extends AbstractC7278o0O00OoO {
        public OooO00o(RecyclerView.OooOOO0 oooOOO0) {
            super(oooOOO0, null);
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO, com.p118pd.sdk.AbstractC7278o0O00OoO, com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO00o() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOOO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0O0() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOOO() - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOO0o();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0OO(View view) {
            RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0Oo(view) + ((ViewGroup.MarginLayoutParams) oooOOO).topMargin + ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0Oo(View view) {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0OO(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.OooOOO) view.getLayoutParams())).leftMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOO0O();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o0(View view) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO00o(view, true, ((AbstractC7278o0O00OoO) this).f19944OooO00o);
            return ((AbstractC7278o0O00OoO) this).f19944OooO00o.right;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0oO() {
            return (((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOOO() - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOO0O()) - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOO0o();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public void OooO00o(int i) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.m14785OooO0O0(i);
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0O0(View view) {
            RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0o0(view) + ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin + ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o(View view) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO00o(view, true, ((AbstractC7278o0O00OoO) this).f19944OooO00o);
            return ((AbstractC7278o0O00OoO) this).f19944OooO00o.left;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO00o(View view) {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0o(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.OooOOO) view.getLayoutParams())).rightMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0OO() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOO0o();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0Oo() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOOo();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o0() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public void OooO00o(View view, int i) {
            view.offsetLeftAndRight(i);
        }
    }

    /* renamed from: com.pd.sdk.o0O00OoO$OooO0O0 */
    public static class OooO0O0 extends AbstractC7278o0O00OoO {
        public OooO0O0(RecyclerView.OooOOO0 oooOOO0) {
            super(oooOOO0, null);
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO, com.p118pd.sdk.AbstractC7278o0O00OoO, com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO00o() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0O0() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0OO() - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0OO(View view) {
            RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0o0(view) + ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin + ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0Oo(View view) {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0oO(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.OooOOO) view.getLayoutParams())).topMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o0(View view) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO00o(view, true, ((AbstractC7278o0O00OoO) this).f19944OooO00o);
            return ((AbstractC7278o0O00OoO) this).f19944OooO00o.bottom;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0oO() {
            return (((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0OO() - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOO()) - ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public void OooO00o(int i) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0OO(i);
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0O0(View view) {
            RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0Oo(view) + ((ViewGroup.MarginLayoutParams) oooOOO).topMargin + ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o(View view) {
            ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO00o(view, true, ((AbstractC7278o0O00OoO) this).f19944OooO00o);
            return ((AbstractC7278o0O00OoO) this).f19944OooO00o.top;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO00o(View view) {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0O0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.OooOOO) view.getLayoutParams())).bottomMargin;
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0OO() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0Oo() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public int OooO0o0() {
            return ((AbstractC7278o0O00OoO) this).f19945OooO00o.OooOOOo();
        }

        @Override // com.p118pd.sdk.AbstractC7278o0O00OoO
        public void OooO00o(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    public /* synthetic */ AbstractC7278o0O00OoO(RecyclerView.OooOOO0 oooOOO0, OooO00o oooO00o) {
        this(oooOOO0);
    }

    public static AbstractC7278o0O00OoO OooO0O0(RecyclerView.OooOOO0 oooOOO0) {
        return new OooO0O0(oooOOO0);
    }

    public abstract int OooO00o();

    public abstract int OooO00o(View view);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public RecyclerView.OooOOO0 m18771OooO00o() {
        return this.f19945OooO00o;
    }

    public abstract void OooO00o(int i);

    public abstract void OooO00o(View view, int i);

    public abstract int OooO0O0();

    public abstract int OooO0O0(View view);

    public abstract int OooO0OO();

    public abstract int OooO0OO(View view);

    public abstract int OooO0Oo();

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o();

    public abstract int OooO0o(View view);

    public abstract int OooO0o0();

    public abstract int OooO0o0(View view);

    public abstract int OooO0oO();

    public int OooO0oo() {
        if (Integer.MIN_VALUE == this.OooO00o) {
            return 0;
        }
        return OooO0oO() - this.OooO00o;
    }

    public AbstractC7278o0O00OoO(RecyclerView.OooOOO0 oooOOO0) {
        this.OooO00o = Integer.MIN_VALUE;
        this.f19944OooO00o = new Rect();
        this.f19945OooO00o = oooOOO0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18772OooO00o() {
        this.OooO00o = OooO0oO();
    }

    public static AbstractC7278o0O00OoO OooO00o(RecyclerView.OooOOO0 oooOOO0, int i) {
        if (i == 0) {
            return OooO00o(oooOOO0);
        }
        if (i == 1) {
            return OooO0O0(oooOOO0);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static AbstractC7278o0O00OoO OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        return new OooO00o(oooOOO0);
    }
}
