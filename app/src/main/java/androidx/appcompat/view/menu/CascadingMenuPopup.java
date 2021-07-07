package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5972Oooo0oO;
import com.p118pd.sdk.AbstractC6939o000000O;
import com.p118pd.sdk.C5964Oooo00O;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C6940o000000o;
import com.p118pd.sdk.C7092o00OOO0;
import com.p118pd.sdk.SubMenuC7026o000oOoO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class CascadingMenuPopup extends AbstractC5972Oooo0oO implements AbstractC5961Oooo, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int o000000 = 1;
    public static final int o000000O = 200;
    public static final int o000OOo = 0;
    public static final int o0O0O00 = C0033R.layout.abc_cascading_menu_item_layout;
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f13671OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View.OnAttachStateChangeListener f13672OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13673OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13674OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewTreeObserver f13675OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow.OnDismissListener f13676OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f13677OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6939o000000O f13678OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C5965Oooo00o> f13679OooO00o = new ArrayList();
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<C5004OooO0Oo> f13680OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f13681OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public final int o00oO0O;
    public int o0OO00O;
    public int o0OOO0o = 0;
    public int o0Oo0oo;
    public final int o0ooOO0;
    public final int o0ooOOo;
    public int o0ooOoO = 0;
    public int oo0o0Oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.OooO0O0() && CascadingMenuPopup.this.f13680OooO0O0.size() > 0 && !CascadingMenuPopup.this.f13680OooO0O0.get(0).f13686OooO00o.m18113OooO0Oo()) {
                View view = CascadingMenuPopup.this.OooO0O0;
                if (view == null || !view.isShown()) {
                    CascadingMenuPopup.this.dismiss();
                    return;
                }
                for (C5004OooO0Oo oooO0Oo : CascadingMenuPopup.this.f13680OooO0O0) {
                    oooO0Oo.f13686OooO00o.m18102OooO00o();
                }
            }
        }
    }

    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f13675OooO00o;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f13675OooO00o = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f13675OooO00o.removeGlobalOnLayoutListener(cascadingMenuPopup.f13674OooO00o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class OooO0OO implements AbstractC6939o000000O {

        public class OooO00o implements Runnable {
            public final /* synthetic */ MenuItem OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5004OooO0Oo f13683OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5965Oooo00o f13684OooO00o;

            public OooO00o(C5004OooO0Oo oooO0Oo, MenuItem menuItem, C5965Oooo00o oooo00o) {
                this.f13683OooO00o = oooO0Oo;
                this.OooO00o = menuItem;
                this.f13684OooO00o = oooo00o;
            }

            public void run() {
                C5004OooO0Oo oooO0Oo = this.f13683OooO00o;
                if (oooO0Oo != null) {
                    CascadingMenuPopup.this.OooO0oO = true;
                    oooO0Oo.f13685OooO00o.OooO00o(false);
                    CascadingMenuPopup.this.OooO0oO = false;
                }
                if (this.OooO00o.isEnabled() && this.OooO00o.hasSubMenu()) {
                    this.f13684OooO00o.OooO00o(this.OooO00o, 4);
                }
            }
        }

        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC6939o000000O
        public void OooO00o(@NonNull C5965Oooo00o oooo00o, @NonNull MenuItem menuItem) {
            C5004OooO0Oo oooO0Oo = null;
            CascadingMenuPopup.this.f13671OooO00o.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f13680OooO0O0.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (oooo00o == CascadingMenuPopup.this.f13680OooO0O0.get(i).f13685OooO00o) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < CascadingMenuPopup.this.f13680OooO0O0.size()) {
                    oooO0Oo = CascadingMenuPopup.this.f13680OooO0O0.get(i2);
                }
                CascadingMenuPopup.this.f13671OooO00o.postAtTime(new OooO00o(oooO0Oo, menuItem, oooo00o), oooo00o, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6939o000000O
        public void OooO0O0(@NonNull C5965Oooo00o oooo00o, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f13671OooO00o.removeCallbacksAndMessages(oooo00o);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$OooO0Oo  reason: case insensitive filesystem */
    public static class C5004OooO0Oo {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C5965Oooo00o f13685OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6940o000000o f13686OooO00o;

        public C5004OooO0Oo(@NonNull C6940o000000o o000000o, @NonNull C5965Oooo00o oooo00o, int i) {
            this.f13686OooO00o = o000000o;
            this.f13685OooO00o = oooo00o;
            this.OooO00o = i;
        }

        public ListView OooO00o() {
            return this.f13686OooO00o.m18100OooO00o();
        }
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.OooO00o = context;
        this.f13673OooO00o = view;
        this.o0ooOO0 = i;
        this.o0ooOOo = i2;
        this.f13681OooO0O0 = z;
        this.OooO0o0 = false;
        this.o0Oo0oo = OooO00o();
        Resources resources = context.getResources();
        this.o00oO0O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0033R.dimen.abc_config_prefDialogWidth));
        this.f13671OooO00o = new Handler();
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    private C6940o000000o m14405OooO00o() {
        C6940o000000o o000000o = new C6940o000000o(this.OooO00o, null, this.o0ooOO0, this.o0ooOOo);
        o000000o.OooO00o(this.f13678OooO00o);
        o000000o.OooO00o((AdapterView.OnItemClickListener) this);
        o000000o.OooO00o((PopupWindow.OnDismissListener) this);
        o000000o.m18103OooO00o(this.f13673OooO00o);
        o000000o.OooO0OO(this.o0OOO0o);
        o000000o.OooO0OO(true);
        o000000o.OooO0o(2);
        return o000000o;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Parcelable m14406OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Parcelable parcelable) {
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14411OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0O0(boolean z) {
        this.OooO0o0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0OO(int i) {
        this.OooO0Oo = true;
        this.oo0o0Oo = i;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public boolean OooO0OO() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public void dismiss() {
        int size = this.f13680OooO0O0.size();
        if (size > 0) {
            C5004OooO0Oo[] oooO0OoArr = (C5004OooO0Oo[]) this.f13680OooO0O0.toArray(new C5004OooO0Oo[size]);
            for (int i = size - 1; i >= 0; i--) {
                C5004OooO0Oo oooO0Oo = oooO0OoArr[i];
                if (oooO0Oo.f13686OooO00o.m18109OooO0O0()) {
                    oooO0Oo.f13686OooO00o.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        C5004OooO0Oo oooO0Oo;
        int size = this.f13680OooO0O0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                oooO0Oo = null;
                break;
            }
            oooO0Oo = this.f13680OooO0O0.get(i);
            if (!oooO0Oo.f13686OooO00o.m18109OooO0O0()) {
                break;
            }
            i++;
        }
        if (oooO0Oo != null) {
            oooO0Oo.f13685OooO00o.OooO00o(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    private void OooO0O0(@NonNull C5965Oooo00o oooo00o) {
        View view;
        C5004OooO0Oo oooO0Oo;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.OooO00o);
        C5964Oooo00O oooo00O = new C5964Oooo00O(oooo00o, from, this.f13681OooO0O0, o0O0O00);
        if (!OooO0O0() && this.OooO0o0) {
            oooo00O.OooO00o(true);
        } else if (OooO0O0()) {
            oooo00O.OooO00o(AbstractC5972Oooo0oO.OooO00o(oooo00o));
        }
        int OooO00o2 = AbstractC5972Oooo0oO.OooO00o(oooo00O, null, this.OooO00o, this.o00oO0O);
        C6940o000000o OooO00o3 = m14405OooO00o();
        OooO00o3.OooO00o((ListAdapter) oooo00O);
        OooO00o3.m18108OooO0O0(OooO00o2);
        OooO00o3.OooO0OO(this.o0OOO0o);
        if (this.f13680OooO0O0.size() > 0) {
            List<C5004OooO0Oo> list = this.f13680OooO0O0;
            oooO0Oo = list.get(list.size() - 1);
            view = OooO00o(oooO0Oo, oooo00o);
        } else {
            oooO0Oo = null;
            view = null;
        }
        if (view != null) {
            OooO00o3.OooO0o(false);
            OooO00o3.OooO00o((Object) null);
            int OooO00o4 = OooO00o(OooO00o2);
            boolean z = OooO00o4 == 1;
            this.o0Oo0oo = OooO00o4;
            if (Build.VERSION.SDK_INT >= 26) {
                OooO00o3.m18103OooO00o(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f13673OooO00o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o0OOO0o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f13673OooO00o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o0OOO0o & 5) != 5) {
                if (z) {
                    OooO00o2 = view.getWidth();
                }
                i3 = i - OooO00o2;
                OooO00o3.OooO0o0(i3);
                OooO00o3.OooO0Oo(true);
                OooO00o3.OooOO0O(i2);
            } else if (!z) {
                OooO00o2 = view.getWidth();
                i3 = i - OooO00o2;
                OooO00o3.OooO0o0(i3);
                OooO00o3.OooO0Oo(true);
                OooO00o3.OooOO0O(i2);
            }
            i3 = i + OooO00o2;
            OooO00o3.OooO0o0(i3);
            OooO00o3.OooO0Oo(true);
            OooO00o3.OooOO0O(i2);
        } else {
            if (this.OooO0OO) {
                OooO00o3.OooO0o0(this.o0OO00O);
            }
            if (this.OooO0Oo) {
                OooO00o3.OooOO0O(this.oo0o0Oo);
            }
            OooO00o3.OooO00o(OooO00o());
        }
        this.f13680OooO0O0.add(new C5004OooO0Oo(OooO00o3, oooo00o, this.o0Oo0oo));
        OooO00o3.m18102OooO00o();
        ListView OooO00o5 = OooO00o3.m18100OooO00o();
        OooO00o5.setOnKeyListener(this);
        if (oooO0Oo == null && this.OooO0o && oooo00o.m16776OooO00o() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0033R.layout.abc_popup_menu_header_item_layout, (ViewGroup) OooO00o5, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(oooo00o.m16776OooO00o());
            OooO00o5.addHeaderView(frameLayout, null, false);
            OooO00o3.m18102OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0OO(boolean z) {
        this.OooO0o = z;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14408OooO00o() {
        if (!OooO0O0()) {
            for (C5965Oooo00o oooo00o : this.f13679OooO00o) {
                OooO0O0(oooo00o);
            }
            this.f13679OooO00o.clear();
            View view = this.f13673OooO00o;
            this.OooO0O0 = view;
            if (view != null) {
                boolean z = this.f13675OooO00o == null;
                ViewTreeObserver viewTreeObserver = this.OooO0O0.getViewTreeObserver();
                this.f13675OooO00o = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f13674OooO00o);
                }
                this.OooO0O0.addOnAttachStateChangeListener(this.f13672OooO00o);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    private int OooO00o() {
        return ViewCompat.m14593OooO0o(this.f13673OooO00o) == 1 ? 0 : 1;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    private int OooO00o(int i) {
        List<C5004OooO0Oo> list = this.f13680OooO0O0;
        ListView OooO00o2 = list.get(list.size() - 1).OooO00o();
        int[] iArr = new int[2];
        OooO00o2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.OooO0O0.getWindowVisibleDisplayFrame(rect);
        if (this.o0Oo0oo == 1) {
            if (iArr[0] + OooO00o2.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14410OooO00o(C5965Oooo00o oooo00o) {
        oooo00o.OooO00o(this, this.OooO00o);
        if (OooO0O0()) {
            OooO0O0(oooo00o);
        } else {
            this.f13679OooO00o.add(oooo00o);
        }
    }

    private MenuItem OooO00o(@NonNull C5965Oooo00o oooo00o, @NonNull C5965Oooo00o oooo00o2) {
        int size = oooo00o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = oooo00o.getItem(i);
            if (item.hasSubMenu() && oooo00o2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Nullable
    private View OooO00o(@NonNull C5004OooO0Oo oooO0Oo, @NonNull C5965Oooo00o oooo00o) {
        int i;
        C5964Oooo00O oooo00O;
        int firstVisiblePosition;
        MenuItem OooO00o2 = OooO00o(oooO0Oo.f13685OooO00o, oooo00o);
        if (OooO00o2 == null) {
            return null;
        }
        ListView OooO00o3 = oooO0Oo.OooO00o();
        ListAdapter adapter = OooO00o3.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            oooo00O = (C5964Oooo00O) headerViewListAdapter.getWrappedAdapter();
        } else {
            oooo00O = (C5964Oooo00O) adapter;
            i = 0;
        }
        int count = oooo00O.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (OooO00o2 == oooo00O.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - OooO00o3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < OooO00o3.getChildCount()) {
            return OooO00o3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(boolean z) {
        for (C5004OooO0Oo oooO0Oo : this.f13680OooO0O0) {
            AbstractC5972Oooo0oO.OooO00o(oooO0Oo.OooO00o().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        this.f13677OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
        for (C5004OooO0Oo oooO0Oo : this.f13680OooO0O0) {
            if (o000oooo == oooO0Oo.f13685OooO00o) {
                oooO0Oo.OooO00o().requestFocus();
                return true;
            }
        }
        if (!o000oooo.hasVisibleItems()) {
            return false;
        }
        m14410OooO00o((C5965Oooo00o) o000oooo);
        AbstractC5961Oooo.OooO00o oooO00o = this.f13677OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(o000oooo);
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public boolean OooO0O0() {
        return this.f13680OooO0O0.size() > 0 && this.f13680OooO0O0.get(0).f13686OooO00o.m18109OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO0O0(int i) {
        this.OooO0OO = true;
        this.o0OO00O = i;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    private int OooO00o(@NonNull C5965Oooo00o oooo00o) {
        int size = this.f13680OooO0O0.size();
        for (int i = 0; i < size; i++) {
            if (oooo00o == this.f13680OooO0O0.get(i).f13685OooO00o) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        int OooO00o2 = OooO00o(oooo00o);
        if (OooO00o2 >= 0) {
            int i = OooO00o2 + 1;
            if (i < this.f13680OooO0O0.size()) {
                this.f13680OooO0O0.get(i).f13685OooO00o.OooO00o(false);
            }
            C5004OooO0Oo remove = this.f13680OooO0O0.remove(OooO00o2);
            remove.f13685OooO00o.OooO0O0(this);
            if (this.OooO0oO) {
                remove.f13686OooO00o.OooO0O0((Object) null);
                remove.f13686OooO00o.OooO00o(0);
            }
            remove.f13686OooO00o.dismiss();
            int size = this.f13680OooO0O0.size();
            if (size > 0) {
                this.o0Oo0oo = this.f13680OooO0O0.get(size - 1).OooO00o;
            } else {
                this.o0Oo0oo = OooO00o();
            }
            if (size == 0) {
                dismiss();
                AbstractC5961Oooo.OooO00o oooO00o = this.f13677OooO00o;
                if (oooO00o != null) {
                    oooO00o.OooO00o(oooo00o, true);
                }
                ViewTreeObserver viewTreeObserver = this.f13675OooO00o;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f13675OooO00o.removeGlobalOnLayoutListener(this.f13674OooO00o);
                    }
                    this.f13675OooO00o = null;
                }
                this.OooO0O0.removeOnAttachStateChangeListener(this.f13672OooO00o);
                this.f13676OooO00o.onDismiss();
            } else if (z) {
                this.f13680OooO0O0.get(0).f13685OooO00o.OooO00o(false);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14409OooO00o(int i) {
        if (this.o0ooOoO != i) {
            this.o0ooOoO = i;
            this.o0OOO0o = C7092o00OOO0.OooO00o(i, ViewCompat.m14593OooO0o(this.f13673OooO00o));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(@NonNull View view) {
        if (this.f13673OooO00o != view) {
            this.f13673OooO00o = view;
            this.o0OOO0o = C7092o00OOO0.OooO00o(this.o0ooOoO, ViewCompat.m14593OooO0o(view));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO
    public void OooO00o(PopupWindow.OnDismissListener onDismissListener) {
        this.f13676OooO00o = onDismissListener;
    }

    @Override // com.p118pd.sdk.AbstractC5972Oooo0oO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m14407OooO00o() {
        if (this.f13680OooO0O0.isEmpty()) {
            return null;
        }
        List<C5004OooO0Oo> list = this.f13680OooO0O0;
        return list.get(list.size() - 1).OooO00o();
    }
}
