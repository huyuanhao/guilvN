package com.p118pd.sdk;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.C5965Oooo00o;

/* renamed from: com.pd.sdk.o00000  reason: case insensitive filesystem */
public class C6931o00000 {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnTouchListener f19066OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f19067OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5965Oooo00o f19068OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5973Oooo0oo f19069OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6932OooO0Oo f19070OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6933OooO0o0 f19071OooO00o;

    /* renamed from: com.pd.sdk.o00000$OooO00o */
    public class OooO00o implements C5965Oooo00o.OooO00o {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o) {
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
            AbstractC6933OooO0o0 oooO0o0 = C6931o00000.this.f19071OooO00o;
            if (oooO0o0 != null) {
                return oooO0o0.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o00000$OooO0O0 */
    public class OooO0O0 implements PopupWindow.OnDismissListener {
        public OooO0O0() {
        }

        public void onDismiss() {
            C6931o00000 o00000 = C6931o00000.this;
            AbstractC6932OooO0Oo oooO0Oo = o00000.f19070OooO00o;
            if (oooO0Oo != null) {
                oooO0Oo.OooO00o(o00000);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00000$OooO0OO */
    public class OooO0OO extends AbstractView$OnTouchListenerC6995o000OOo {
        public OooO0OO(View view) {
            super(view);
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18096OooO00o() {
            C6931o00000.this.OooO0O0();
            return true;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public boolean OooO0O0() {
            C6931o00000.this.m18095OooO00o();
            return true;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public AbstractC5974OoooO OooO00o() {
            return C6931o00000.this.f19069OooO00o.m16802OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.o00000$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC6932OooO0Oo {
        void OooO00o(C6931o00000 o00000);
    }

    /* renamed from: com.pd.sdk.o00000$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC6933OooO0o0 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C6931o00000(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public int OooO00o() {
        return this.f19069OooO00o.OooO00o();
    }

    public void OooO0O0(int i) {
        this.f19069OooO00o.OooO00o(i);
    }

    public C6931o00000(@NonNull Context context, @NonNull View view, int i) {
        this(context, view, i, C0033R.attr.popupMenuStyle, 0);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View.OnTouchListener m18093OooO00o() {
        if (this.f19066OooO00o == null) {
            this.f19066OooO00o = new OooO0OO(this.f19067OooO00o);
        }
        return this.f19066OooO00o;
    }

    public void OooO0O0() {
        this.f19069OooO00o.m16806OooO0O0();
    }

    public C6931o00000(@NonNull Context context, @NonNull View view, int i, @AttrRes int i2, @StyleRes int i3) {
        this.OooO00o = context;
        this.f19067OooO00o = view;
        C5965Oooo00o oooo00o = new C5965Oooo00o(context);
        this.f19068OooO00o = oooo00o;
        oooo00o.OooO00o(new OooO00o());
        C5973Oooo0oo oooo0oo = new C5973Oooo0oo(context, this.f19068OooO00o, view, false, i2, i3);
        this.f19069OooO00o = oooo0oo;
        oooo0oo.OooO00o(i);
        this.f19069OooO00o.OooO00o(new OooO0O0());
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Menu m18091OooO00o() {
        return this.f19068OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MenuInflater m18092OooO00o() {
        return new C5955OooOoO0(this.OooO00o);
    }

    public void OooO00o(@MenuRes int i) {
        m18092OooO00o().inflate(i, this.f19068OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18095OooO00o() {
        this.f19069OooO00o.dismiss();
    }

    public void OooO00o(@Nullable AbstractC6933OooO0o0 oooO0o0) {
        this.f19071OooO00o = oooO0o0;
    }

    public void OooO00o(@Nullable AbstractC6932OooO0Oo oooO0Oo) {
        this.f19070OooO00o = oooO0Oo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m18094OooO00o() {
        if (!this.f19069OooO00o.m16804OooO00o()) {
            return null;
        }
        return this.f19069OooO00o.m16801OooO00o();
    }
}
