package com.p118pd.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.C5965Oooo00o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOO0o  reason: case insensitive filesystem */
public class C5939OooOO0o extends ActionBar implements ActionBarOverlayLayout.AbstractC5005OooO0Oo {
    public static final long OooO00o = 100;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Interpolator f17044OooO00o = new AccelerateInterpolator();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17045OooO00o = "WindowDecorActionBar";
    public static final long OooO0O0 = 200;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Interpolator f17046OooO0O0 = new DecelerateInterpolator();
    public static final int OooOO0O = -1;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final /* synthetic */ boolean f17047OooOO0O = false;
    public int OooO = -1;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f17048OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f17049OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Dialog f17050OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f17051OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f17052OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarContainer f17053OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarContextView f17054OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarOverlayLayout f17055OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5940OooO0Oo f17056OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5941OooO0o0 f17057OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5951OooOo00.OooO00o f17058OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5951OooOo00 f17059OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5954OooOoO f17060OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6943o00000OO f17061OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7118o00OoO00 f17062OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7472o0Oo0oo f17063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7617o0oOO f17064OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<C5941OooO0o0> f17065OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17066OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Context f17067OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC7617o0oOO f17068OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ArrayList<ActionBar.OooO0O0> f17069OooO0O0 = new ArrayList<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17070OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo = true;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo = true;
    public int OooOO0 = 0;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f17071OooOO0;

    /* renamed from: com.pd.sdk.OooOO0o$OooO00o */
    public class OooO00o extends C7104o00Oo {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            View view2;
            C5939OooOO0o oooOO0o = C5939OooOO0o.this;
            if (oooOO0o.OooO0Oo && (view2 = oooOO0o.f17052OooO00o) != null) {
                view2.setTranslationY(0.0f);
                C5939OooOO0o.this.f17053OooO00o.setTranslationY(0.0f);
            }
            C5939OooOO0o.this.f17053OooO00o.setVisibility(8);
            C5939OooOO0o.this.f17053OooO00o.setTransitioning(false);
            C5939OooOO0o oooOO0o2 = C5939OooOO0o.this;
            oooOO0o2.f17060OooO00o = null;
            oooOO0o2.OooO();
            ActionBarOverlayLayout actionBarOverlayLayout = C5939OooOO0o.this.f17055OooO00o;
            if (actionBarOverlayLayout != null) {
                ViewCompat.m14594OooO0o((View) actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: com.pd.sdk.OooOO0o$OooO0O0 */
    public class OooO0O0 extends C7104o00Oo {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            C5939OooOO0o oooOO0o = C5939OooOO0o.this;
            oooOO0o.f17060OooO00o = null;
            oooOO0o.f17053OooO00o.requestLayout();
        }
    }

    /* renamed from: com.pd.sdk.OooOO0o$OooO0OO */
    public class OooO0OO implements AbstractC7118o00OoO00 {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC7118o00OoO00
        public void OooO00o(View view) {
            ((View) C5939OooOO0o.this.f17053OooO00o.getParent()).invalidate();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.OooOO0o$OooO0Oo  reason: case insensitive filesystem */
    public class C5940OooO0Oo extends AbstractC5951OooOo00 implements C5965Oooo00o.OooO00o {
        public final Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5951OooOo00.OooO00o f17073OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C5965Oooo00o f17074OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public WeakReference<View> f17075OooO00o;

        public C5940OooO0Oo(Context context, AbstractC5951OooOo00.OooO00o oooO00o) {
            this.OooO00o = context;
            this.f17073OooO00o = oooO00o;
            C5965Oooo00o OooO00o2 = new C5965Oooo00o(context).m16774OooO00o(1);
            this.f17074OooO00o = OooO00o2;
            OooO00o2.OooO00o(this);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO00o  reason: collision with other method in class */
        public MenuInflater m16696OooO00o() {
            return new C5955OooOoO0(this.OooO00o);
        }

        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        }

        public void OooO00o(SubMenuC7026o000oOoO o000oooo) {
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m16701OooO0O0() {
            if (C5939OooOO0o.this.f17056OooO00o == this) {
                this.f17074OooO00o.OooO0o0();
                try {
                    this.f17073OooO00o.OooO0O0(this, this.f17074OooO00o);
                } finally {
                    this.f17074OooO00o.OooO0Oo();
                }
            }
        }

        public boolean OooO0Oo() {
            this.f17074OooO00o.OooO0o0();
            try {
                return this.f17073OooO00o.OooO00o(this, this.f17074OooO00o);
            } finally {
                this.f17074OooO00o.OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        public Menu OooO00o() {
            return this.f17074OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16699OooO00o() {
            C5939OooOO0o oooOO0o = C5939OooOO0o.this;
            if (oooOO0o.f17056OooO00o == this) {
                if (!C5939OooOO0o.OooO00o(oooOO0o.OooO0o0, oooOO0o.OooO0o, false)) {
                    C5939OooOO0o oooOO0o2 = C5939OooOO0o.this;
                    oooOO0o2.f17059OooO00o = this;
                    oooOO0o2.f17058OooO00o = this.f17073OooO00o;
                } else {
                    this.f17073OooO00o.OooO00o(this);
                }
                this.f17073OooO00o = null;
                C5939OooOO0o.this.OooOO0o(false);
                C5939OooOO0o.this.f17054OooO00o.OooO0OO();
                C5939OooOO0o.this.f17063OooO00o.m19094OooO00o().sendAccessibilityEvent(32);
                C5939OooOO0o oooOO0o3 = C5939OooOO0o.this;
                oooOO0o3.f17055OooO00o.setHideOnContentScrollEnabled(oooOO0o3.f17071OooOO0);
                C5939OooOO0o.this.f17056OooO00o = null;
            }
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO0O0(CharSequence charSequence) {
            C5939OooOO0o.this.f17054OooO00o.setTitle(charSequence);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO0O0(int i) {
            OooO0O0(C5939OooOO0o.this.f17051OooO00o.getResources().getString(i));
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        public CharSequence OooO0O0() {
            return C5939OooOO0o.this.f17054OooO00o.getTitle();
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m16702OooO0O0() {
            return C5939OooOO0o.this.f17054OooO00o.OooO0oO();
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO00o(View view) {
            C5939OooOO0o.this.f17054OooO00o.setCustomView(view);
            this.f17075OooO00o = new WeakReference<>(view);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO00o(CharSequence charSequence) {
            C5939OooOO0o.this.f17054OooO00o.setSubtitle(charSequence);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO00o(int i) {
            OooO00o((CharSequence) C5939OooOO0o.this.f17051OooO00o.getResources().getString(i));
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m16698OooO00o() {
            return C5939OooOO0o.this.f17054OooO00o.getSubtitle();
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00
        public void OooO00o(boolean z) {
            super.OooO00o(z);
            C5939OooOO0o.this.f17054OooO00o.setTitleOptional(z);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m16697OooO00o() {
            WeakReference<View> weakReference = this.f17075OooO00o;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
            AbstractC5951OooOo00.OooO00o oooO00o = this.f17073OooO00o;
            if (oooO00o != null) {
                return oooO00o.OooO00o(this, menuItem);
            }
            return false;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16700OooO00o(SubMenuC7026o000oOoO o000oooo) {
            if (this.f17073OooO00o == null) {
                return false;
            }
            if (!o000oooo.hasVisibleItems()) {
                return true;
            }
            new C5973Oooo0oo(C5939OooOO0o.this.m16676OooO00o(), o000oooo).m16806OooO0O0();
            return true;
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o) {
            if (this.f17073OooO00o != null) {
                m16701OooO0O0();
                C5939OooOO0o.this.f17054OooO00o.OooO0o();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.OooOO0o$OooO0o0  reason: case insensitive filesystem */
    public class C5941OooO0o0 extends ActionBar.AbstractC4991OooO0Oo {
        public Drawable OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f17076OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ActionBar.AbstractC4992OooO0o0 f17077OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f17079OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f17080OooO00o;
        public int OooO0O0 = -1;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public CharSequence f17081OooO0O0;

        public C5941OooO0o0() {
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object m16707OooO00o() {
            return this.f17080OooO00o;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO0O0(int i) {
            return OooO00o(LayoutInflater.from(C5939OooOO0o.this.m16676OooO00o()).inflate(i, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO0OO(int i) {
            return OooO00o(C5945OooOOO0.m16716OooO00o(C5939OooOO0o.this.f17051OooO00o, i));
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO0Oo(int i) {
            return OooO0O0(C5939OooOO0o.this.f17051OooO00o.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(Object obj) {
            this.f17080OooO00o = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public ActionBar.AbstractC4992OooO0o0 m16705OooO00o() {
            return this.f17077OooO00o;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(ActionBar.AbstractC4992OooO0o0 oooO0o0) {
            this.f17077OooO00o = oooO0o0;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public CharSequence OooO0O0() {
            return this.f17079OooO00o;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m16704OooO00o() {
            return this.f17076OooO00o;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO0O0(CharSequence charSequence) {
            this.f17079OooO00o = charSequence;
            int i = this.OooO0O0;
            if (i >= 0) {
                C5939OooOO0o.this.f17061OooO00o.OooO0Oo(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(View view) {
            this.f17076OooO00o = view;
            int i = this.OooO0O0;
            if (i >= 0) {
                C5939OooOO0o.this.f17061OooO00o.OooO0Oo(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Drawable m16703OooO00o() {
            return this.OooO00o;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public int OooO00o() {
            return this.OooO0O0;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16709OooO00o(int i) {
            this.OooO0O0 = i;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(Drawable drawable) {
            this.OooO00o = drawable;
            int i = this.OooO0O0;
            if (i >= 0) {
                C5939OooOO0o.this.f17061OooO00o.OooO0Oo(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16708OooO00o() {
            C5939OooOO0o.this.OooO0OO(this);
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(int i) {
            return OooO00o(C5939OooOO0o.this.f17051OooO00o.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        public ActionBar.AbstractC4991OooO0Oo OooO00o(CharSequence charSequence) {
            this.f17081OooO0O0 = charSequence;
            int i = this.OooO0O0;
            if (i >= 0) {
                C5939OooOO0o.this.f17061OooO00o.OooO0Oo(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo, androidx.appcompat.app.ActionBar.AbstractC4991OooO0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m16706OooO00o() {
            return this.f17081OooO0O0;
        }
    }

    public C5939OooOO0o(Activity activity, boolean z) {
        this.f17049OooO00o = activity;
        View decorView = activity.getWindow().getDecorView();
        OooO0O0(decorView);
        if (!z) {
            this.f17052OooO00o = decorView.findViewById(16908290);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    private AbstractC7472o0Oo0oo OooO00o(View view) {
        if (view instanceof AbstractC7472o0Oo0oo) {
            return (AbstractC7472o0Oo0oo) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public static boolean OooO00o(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private void OooO0O0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0033R.C0036id.decor_content_parent);
        this.f17055OooO00o = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f17063OooO00o = OooO00o(view.findViewById(C0033R.C0036id.action_bar));
        this.f17054OooO00o = (ActionBarContextView) view.findViewById(C0033R.C0036id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0033R.C0036id.action_bar_container);
        this.f17053OooO00o = actionBarContainer;
        AbstractC7472o0Oo0oo o0oo0oo = this.f17063OooO00o;
        if (o0oo0oo == null || this.f17054OooO00o == null || actionBarContainer == null) {
            throw new IllegalStateException(C5939OooOO0o.class.getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f17051OooO00o = o0oo0oo.getContext();
        boolean z = (this.f17063OooO00o.OooO0OO() & 4) != 0;
        if (z) {
            this.f17066OooO00o = true;
        }
        C5949OooOOoo OooO00o2 = C5949OooOOoo.OooO00o(this.f17051OooO00o);
        OooOO0(OooO00o2.m16737OooO00o() || z);
        OooOOOO(OooO00o2.m16738OooO0O0());
        TypedArray obtainStyledAttributes = this.f17051OooO00o.obtainStyledAttributes(null, C0033R.styleable.OooO00o, C0033R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0033R.styleable.ActionBar_hideOnContentScroll, false)) {
            OooO(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0033R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            OooO00o((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void OooOO0O() {
        if (this.f17061OooO00o == null) {
            C6943o00000OO o00000oo = new C6943o00000OO(this.f17051OooO00o);
            if (this.OooO0OO) {
                o00000oo.setVisibility(0);
                this.f17063OooO00o.OooO00o(o00000oo);
            } else {
                if (OooO0o0() == 2) {
                    o00000oo.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f17055OooO00o;
                    if (actionBarOverlayLayout != null) {
                        ViewCompat.m14594OooO0o((View) actionBarOverlayLayout);
                    }
                } else {
                    o00000oo.setVisibility(8);
                }
                this.f17053OooO00o.setTabContainer(o00000oo);
            }
            this.f17061OooO00o = o00000oo;
        }
    }

    private void OooOOOO(boolean z) {
        this.OooO0OO = z;
        if (!z) {
            this.f17063OooO00o.OooO00o((C6943o00000OO) null);
            this.f17053OooO00o.setTabContainer(this.f17061OooO00o);
        } else {
            this.f17053OooO00o.setTabContainer(null);
            this.f17063OooO00o.OooO00o(this.f17061OooO00o);
        }
        boolean z2 = true;
        boolean z3 = OooO0o0() == 2;
        C6943o00000OO o00000oo = this.f17061OooO00o;
        if (o00000oo != null) {
            if (z3) {
                o00000oo.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17055OooO00o;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m14594OooO0o((View) actionBarOverlayLayout);
                }
            } else {
                o00000oo.setVisibility(8);
            }
        }
        this.f17063OooO00o.OooO0O0(!this.OooO0OO && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17055OooO00o;
        if (this.OooO0OO || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private void OooOOOo(boolean z) {
        if (OooO00o(this.OooO0o0, this.OooO0o, this.OooO0oO)) {
            if (!this.OooO0oo) {
                this.OooO0oo = true;
                OooOOO(z);
            }
        } else if (this.OooO0oo) {
            this.OooO0oo = false;
            OooOOO0(z);
        }
    }

    public void OooO() {
        AbstractC5951OooOo00.OooO00o oooO00o = this.f17058OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(this.f17059OooO00o);
            this.f17059OooO00o = null;
            this.f17058OooO00o = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16685OooO0O0() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(int i) {
        m16682OooO00o(LayoutInflater.from(m16676OooO00o()).inflate(i, this.f17063OooO00o.m19094OooO00o(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(boolean z) {
        OooO00o(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(boolean z) {
        OooO00o(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o0(boolean z) {
        OooO00o(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oO(boolean z) {
        OooO00o(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oo(boolean z) {
        OooO00o(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0(boolean z) {
        this.f17063OooO00o.OooO00o(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0o(int i) {
        OooO0O0(this.f17051OooO00o.getString(i));
    }

    public void OooOOO(boolean z) {
        View view;
        View view2;
        C5954OooOoO oooOoO = this.f17060OooO00o;
        if (oooOoO != null) {
            oooOoO.OooO00o();
        }
        this.f17053OooO00o.setVisibility(0);
        if (this.OooOO0 != 0 || (!this.f17048OooO && !z)) {
            this.f17053OooO00o.setAlpha(1.0f);
            this.f17053OooO00o.setTranslationY(0.0f);
            if (this.OooO0Oo && (view = this.f17052OooO00o) != null) {
                view.setTranslationY(0.0f);
            }
            this.f17068OooO0O0.OooO0OO(null);
        } else {
            this.f17053OooO00o.setTranslationY(0.0f);
            float f = (float) (-this.f17053OooO00o.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f17053OooO00o.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f17053OooO00o.setTranslationY(f);
            C5954OooOoO oooOoO2 = new C5954OooOoO();
            C7115o00Oo0oo OooOOOO = ViewCompat.m14572OooO00o((View) this.f17053OooO00o).OooOOOO(0.0f);
            OooOOOO.OooO00o(this.f17062OooO00o);
            oooOoO2.OooO00o(OooOOOO);
            if (this.OooO0Oo && (view2 = this.f17052OooO00o) != null) {
                view2.setTranslationY(f);
                oooOoO2.OooO00o(ViewCompat.m14572OooO00o(this.f17052OooO00o).OooOOOO(0.0f));
            }
            oooOoO2.OooO00o(f17046OooO0O0);
            oooOoO2.OooO00o(250);
            oooOoO2.OooO00o(this.f17068OooO0O0);
            this.f17060OooO00o = oooOoO2;
            oooOoO2.OooO0OO();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f17055OooO00o;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m14594OooO0o((View) actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOOO0(int i) {
        OooO0OO(this.f17051OooO00o.getString(i));
    }

    private void OooOO0() {
        if (this.f17057OooO00o != null) {
            OooO0OO((ActionBar.AbstractC4991OooO0Oo) null);
        }
        this.f17065OooO00o.clear();
        C6943o00000OO o00000oo = this.f17061OooO00o;
        if (o00000oo != null) {
            o00000oo.m18117OooO00o();
        }
        this.OooO = -1;
    }

    private void OooOO0o() {
        if (this.OooO0oO) {
            this.OooO0oO = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f17055OooO00o;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            OooOOOo(false);
        }
    }

    private void OooOOO0() {
        if (!this.OooO0oO) {
            this.OooO0oO = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f17055OooO00o;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            OooOOOo(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(CharSequence charSequence) {
        this.f17063OooO00o.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(Drawable drawable) {
        this.f17053OooO00o.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0o0() {
        return this.f17063OooO00o.OooO0O0();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m16693OooO0oO() {
        OooOO0();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m16694OooO0oo() {
        ViewGroup OooO00o2 = this.f17063OooO00o.m19094OooO00o();
        if (OooO00o2 == null || OooO00o2.hasFocus()) {
            return false;
        }
        OooO00o2.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(int i) {
        if ((i & 4) != 0) {
            this.f17066OooO00o = true;
        }
        this.f17063OooO00o.OooO0OO(i);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m16690OooO0o() {
        AbstractC7472o0Oo0oo o0oo0oo = this.f17063OooO00o;
        return o0oo0oo != null && o0oo0oo.OooOO0();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public void m16691OooO0o0() {
        if (!this.OooO0o0) {
            this.OooO0o0 = true;
            OooOOOo(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oO(int i) {
        this.f17063OooO00o.OooO00o(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(CharSequence charSequence) {
        this.f17063OooO00o.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(int i) {
        this.f17063OooO00o.OooO0oo(i);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0oO() {
        return this.f17065OooO00o.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO(boolean z) {
        if (!z || this.f17055OooO00o.OooO()) {
            this.f17071OooOO0 = z;
            this.f17055OooO00o.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        int i = -1;
        if (OooO0o0() != 2) {
            if (oooO0Oo != null) {
                i = oooO0Oo.OooO00o();
            }
            this.OooO = i;
            return;
        }
        AbstractC7179o00o0oOo OooO00o2 = (!(this.f17049OooO00o instanceof FragmentActivity) || this.f17063OooO00o.m19094OooO00o().isInEditMode()) ? null : ((FragmentActivity) this.f17049OooO00o).getSupportFragmentManager().m18663OooO00o().OooO00o();
        C5941OooO0o0 oooO0o0 = this.f17057OooO00o;
        if (oooO0o0 != oooO0Oo) {
            C6943o00000OO o00000oo = this.f17061OooO00o;
            if (oooO0Oo != null) {
                i = oooO0Oo.OooO00o();
            }
            o00000oo.setTabSelected(i);
            C5941OooO0o0 oooO0o02 = this.f17057OooO00o;
            if (oooO0o02 != null) {
                oooO0o02.m16705OooO00o().OooO0OO(this.f17057OooO00o, OooO00o2);
            }
            C5941OooO0o0 oooO0o03 = (C5941OooO0o0) oooO0Oo;
            this.f17057OooO00o = oooO0o03;
            if (oooO0o03 != null) {
                oooO0o03.m16705OooO00o().OooO00o(this.f17057OooO00o, OooO00o2);
            }
        } else if (oooO0o0 != null) {
            oooO0o0.m16705OooO00o().OooO0O0(this.f17057OooO00o, OooO00o2);
            this.f17061OooO00o.OooO00o(oooO0Oo.OooO00o());
        }
        if (OooO00o2 != null && !OooO00o2.m18674OooO0O0()) {
            OooO00o2.OooO0OO();
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m16688OooO0Oo() {
        if (!this.OooO0o) {
            this.OooO0o = true;
            OooOOOo(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0o() {
        C5941OooO0o0 oooO0o0;
        int OooO0O02 = this.f17063OooO00o.OooO0O0();
        if (OooO0O02 == 1) {
            return this.f17063OooO00o.OooO0o0();
        }
        if (OooO0O02 == 2 && (oooO0o0 = this.f17057OooO00o) != null) {
            return oooO0o0.OooO00o();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public void OooO0oo() {
        if (this.OooO0o0) {
            this.OooO0o0 = false;
            OooOOOo(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o0(int i) {
        if (i == 0 || this.f17055OooO00o.OooO()) {
            this.f17055OooO00o.setActionBarHideOffset(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(float f) {
        ViewCompat.OooO0O0(this.f17053OooO00o, f);
    }

    public void OooOO0o(boolean z) {
        C7115o00Oo0oo o00oo0oo;
        C7115o00Oo0oo o00oo0oo2;
        if (z) {
            OooOOO0();
        } else {
            OooOO0o();
        }
        if (m16673OooOO0O()) {
            if (z) {
                o00oo0oo = this.f17063OooO00o.OooO00o(4, 100);
                o00oo0oo2 = this.f17054OooO00o.OooO00o(0, 200);
            } else {
                o00oo0oo2 = this.f17063OooO00o.OooO00o(0, 200);
                o00oo0oo = this.f17054OooO00o.OooO00o(8, 100);
            }
            C5954OooOoO oooOoO = new C5954OooOoO();
            oooOoO.OooO00o(o00oo0oo, o00oo0oo2);
            oooOoO.OooO0OO();
        } else if (z) {
            this.f17063OooO00o.OooO0oO(4);
            this.f17054OooO00o.setVisibility(0);
        } else {
            this.f17063OooO00o.OooO0oO(0);
            this.f17054OooO00o.setVisibility(8);
        }
    }

    public void OooOOO0(boolean z) {
        View view;
        C5954OooOoO oooOoO = this.f17060OooO00o;
        if (oooOoO != null) {
            oooOoO.OooO00o();
        }
        if (this.OooOO0 != 0 || (!this.f17048OooO && !z)) {
            this.f17064OooO00o.OooO0OO(null);
            return;
        }
        this.f17053OooO00o.setAlpha(1.0f);
        this.f17053OooO00o.setTransitioning(true);
        C5954OooOoO oooOoO2 = new C5954OooOoO();
        float f = (float) (-this.f17053OooO00o.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f17053OooO00o.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C7115o00Oo0oo OooOOOO = ViewCompat.m14572OooO00o((View) this.f17053OooO00o).OooOOOO(f);
        OooOOOO.OooO00o(this.f17062OooO00o);
        oooOoO2.OooO00o(OooOOOO);
        if (this.OooO0Oo && (view = this.f17052OooO00o) != null) {
            oooOoO2.OooO00o(ViewCompat.m14572OooO00o(view).OooOOOO(f));
        }
        oooOoO2.OooO00o(f17044OooO00o);
        oooOoO2.OooO00o(250);
        oooOoO2.OooO00o(this.f17064OooO00o);
        this.f17060OooO00o = oooOoO2;
        oooOoO2.OooO0OO();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public float OooO00o() {
        return ViewCompat.OooO0O0((View) this.f17053OooO00o);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m16689OooO0Oo() {
        return this.f17055OooO00o.m14424OooO0oo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oo(int i) {
        this.f17063OooO00o.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int OooO0O02 = this.f17063OooO00o.OooO0O0();
        if (OooO0O02 == 2) {
            this.OooO = OooO0o();
            OooO0OO((ActionBar.AbstractC4991OooO0Oo) null);
            this.f17061OooO00o.setVisibility(8);
        }
        if (!(OooO0O02 == i || this.OooO0OO || (actionBarOverlayLayout = this.f17055OooO00o) == null)) {
            ViewCompat.m14594OooO0o((View) actionBarOverlayLayout);
        }
        this.f17063OooO00o.OooO0Oo(i);
        boolean z = false;
        if (i == 2) {
            OooOO0O();
            this.f17061OooO00o.setVisibility(0);
            int i2 = this.OooO;
            if (i2 != -1) {
                OooOO0O(i2);
                this.OooO = -1;
            }
        }
        this.f17063OooO00o.OooO0O0(i == 2 && !this.OooO0OO);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17055OooO00o;
        if (i == 2 && !this.OooO0OO) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m16674OooO() {
        return this.f17063OooO00o.m19097OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(Configuration configuration) {
        OooOOOO(C5949OooOOoo.OooO00o(this.f17051OooO00o).m16738OooO0O0());
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public int OooO0Oo() {
        int OooO0O02 = this.f17063OooO00o.OooO0O0();
        if (OooO0O02 == 1) {
            return this.f17063OooO00o.OooO0Oo();
        }
        if (OooO0O02 != 2) {
            return 0;
        }
        return this.f17065OooO00o.size();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m16692OooO0o0() {
        int OooO0O02 = OooO0O0();
        return this.OooO0oo && (OooO0O02 == 0 || OooO0OO() < OooO0O02);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO(int i) {
        this.f17063OooO00o.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16681OooO00o(int i) {
        this.OooOO0 = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.OooO0O0 oooO0O0) {
        this.f17069OooO0O0.add(oooO0O0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(int i, int i2) {
        int OooO0OO2 = this.f17063OooO00o.OooO0OO();
        if ((i2 & 4) != 0) {
            this.f17066OooO00o = true;
        }
        this.f17063OooO00o.OooO0OO((i & i2) | ((i2 ^ -1) & OooO0OO2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(Drawable drawable) {
        this.f17063OooO00o.OooO0O0(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0O(boolean z) {
        C5954OooOoO oooOoO;
        this.f17048OooO = z;
        if (!z && (oooOoO = this.f17060OooO00o) != null) {
            oooOoO.OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(Drawable drawable) {
        this.f17053OooO00o.setPrimaryBackground(drawable);
    }

    public C5939OooOO0o(Dialog dialog) {
        this.f17050OooO00o = dialog;
        OooO0O0(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m16677OooO00o() {
        return this.f17063OooO00o.m19093OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0O(int i) {
        int OooO0O02 = this.f17063OooO00o.OooO0O0();
        if (OooO0O02 == 1) {
            this.f17063OooO00o.OooO0o0(i);
        } else if (OooO0O02 == 2) {
            OooO0OO(this.f17065OooO00o.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m16679OooO00o() {
        return this.f17063OooO00o.m19095OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16675OooO00o() {
        return this.f17063OooO00o.OooO0OO();
    }

    @Override // androidx.appcompat.app.ActionBar
    public AbstractC5951OooOo00 OooO00o(AbstractC5951OooOo00.OooO00o oooO00o) {
        C5940OooO0Oo oooO0Oo = this.f17056OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.m16699OooO00o();
        }
        this.f17055OooO00o.setHideOnContentScrollEnabled(false);
        this.f17054OooO00o.OooO0Oo();
        C5940OooO0Oo oooO0Oo2 = new C5940OooO0Oo(this.f17054OooO00o.getContext(), oooO00o);
        if (!oooO0Oo2.OooO0Oo()) {
            return null;
        }
        this.f17056OooO00o = oooO0Oo2;
        oooO0Oo2.m16701OooO0O0();
        this.f17054OooO00o.OooO00o(oooO0Oo2);
        OooOO0o(true);
        this.f17054OooO00o.sendAccessibilityEvent(32);
        return oooO0Oo2;
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    private boolean m16673OooOO0O() {
        return ViewCompat.m14612OooOOO((View) this.f17053OooO00o);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(ActionBar.OooO0O0 oooO0O0) {
        this.f17069OooO0O0.remove(oooO0O0);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public int OooO0OO() {
        return this.f17055OooO00o.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(boolean z) {
        if (z != this.f17070OooO0O0) {
            this.f17070OooO0O0 = z;
            int size = this.f17069OooO0O0.size();
            for (int i = 0; i < size; i++) {
                this.f17069OooO0O0.get(i).OooO00o(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m16687OooO0OO() {
        C5954OooOoO oooOoO = this.f17060OooO00o;
        if (oooOoO != null) {
            oooOoO.OooO00o();
            this.f17060OooO00o = null;
        }
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public boolean m16695OooOO0() {
        return this.f17063OooO00o.m19099OooO0O0();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(Drawable drawable) {
        this.f17063OooO00o.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(CharSequence charSequence) {
        this.f17063OooO00o.OooO00o(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(boolean z) {
        if (!this.f17066OooO00o) {
            OooO0Oo(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public CharSequence m16684OooO0O0() {
        return this.f17063OooO00o.getTitle();
    }

    private void OooO0O0(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i) {
        C5941OooO0o0 oooO0o0 = (C5941OooO0o0) oooO0Oo;
        if (oooO0o0.m16705OooO00o() != null) {
            oooO0o0.m16709OooO00o(i);
            this.f17065OooO00o.add(i, oooO0o0);
            int size = this.f17065OooO00o.size();
            while (true) {
                i++;
                if (i < size) {
                    this.f17065OooO00o.get(i).m16709OooO00o(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C5939OooOO0o(View view) {
        OooO0O0(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        OooO00o(oooO0Oo, this.f17065OooO00o.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i) {
        OooO00o(oooO0Oo, i, this.f17065OooO00o.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, boolean z) {
        OooOO0O();
        this.f17061OooO00o.m18118OooO00o(oooO0Oo, z);
        OooO0O0(oooO0Oo, this.f17065OooO00o.size());
        if (z) {
            OooO0OO(oooO0Oo);
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public ActionBar.AbstractC4991OooO0Oo m16683OooO0O0() {
        return new C5941OooO0o0();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        OooO0O0(oooO0Oo.OooO00o());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i, boolean z) {
        OooOO0O();
        this.f17061OooO00o.OooO00o(oooO0Oo, i, z);
        OooO0O0(oooO0Oo, i);
        if (z) {
            OooO0OO(oooO0Oo);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(int i) {
        if (this.f17061OooO00o != null) {
            C5941OooO0o0 oooO0o0 = this.f17057OooO00o;
            int OooO00o2 = oooO0o0 != null ? oooO0o0.OooO00o() : this.OooO;
            this.f17061OooO00o.OooO0OO(i);
            C5941OooO0o0 remove = this.f17065OooO00o.remove(i);
            if (remove != null) {
                remove.m16709OooO00o(-1);
            }
            int size = this.f17065OooO00o.size();
            for (int i2 = i; i2 < size; i2++) {
                this.f17065OooO00o.get(i2).m16709OooO00o(i2);
            }
            if (OooO00o2 == i) {
                OooO0OO(this.f17065OooO00o.isEmpty() ? null : this.f17065OooO00o.get(Math.max(0, i - 1)));
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ActionBar.AbstractC4991OooO0Oo m16678OooO00o() {
        return this.f17057OooO00o;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public void OooO00o(boolean z) {
        this.OooO0Oo = z;
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16680OooO00o() {
        if (this.OooO0o) {
            this.OooO0o = false;
            OooOOOo(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m16676OooO00o() {
        if (this.f17067OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f17051OooO00o.getTheme().resolveAttribute(C0033R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f17067OooO0O0 = new ContextThemeWrapper(this.f17051OooO00o, i);
            } else {
                this.f17067OooO0O0 = this.f17051OooO00o;
            }
        }
        return this.f17067OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public int OooO0O0() {
        return this.f17053OooO00o.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(Drawable drawable) {
        this.f17063OooO00o.OooO0OO(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16686OooO0O0() {
        AbstractC7472o0Oo0oo o0oo0oo = this.f17063OooO00o;
        if (o0oo0oo == null || !o0oo0oo.OooO()) {
            return false;
        }
        this.f17063OooO00o.m19098OooO0O0();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(CharSequence charSequence) {
        this.f17063OooO00o.OooO0O0(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16682OooO00o(View view) {
        this.f17063OooO00o.OooO00o(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(View view, ActionBar.OooO00o oooO00o) {
        view.setLayoutParams(oooO00o);
        this.f17063OooO00o.OooO00o(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(SpinnerAdapter spinnerAdapter, ActionBar.OooO0OO oooO0OO) {
        this.f17063OooO00o.OooO00o(spinnerAdapter, new C5935OooO0oO(oooO0OO));
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC5005OooO0Oo
    public ActionBar.AbstractC4991OooO0Oo OooO00o(int i) {
        return this.f17065OooO00o.get(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean OooO00o(int i, KeyEvent keyEvent) {
        Menu OooO00o2;
        C5940OooO0Oo oooO0Oo = this.f17056OooO00o;
        if (oooO0Oo == null || (OooO00o2 = oooO0Oo.OooO00o()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        OooO00o2.setQwertyMode(z);
        return OooO00o2.performShortcut(i, keyEvent, 0);
    }
}
