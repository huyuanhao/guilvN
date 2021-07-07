package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000000o  reason: case insensitive filesystem */
public class C6940o000000o extends C6934o000000 implements AbstractC6939o000000O {
    public static Method OooO0Oo = null;
    public static final String o0ooOoO = "MenuPopupWindow";
    public AbstractC6939o000000O OooO00o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.o000000o$OooO00o */
    public static class OooO00o extends C8709oo0o0Oo {
        public MenuItem OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6939o000000O f19093OooO00o;
        public final int o0O0O00;
        public final int oo0o0Oo;

        public OooO00o(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.oo0o0Oo = 22;
                this.o0O0O00 = 21;
                return;
            }
            this.oo0o0Oo = 21;
            this.o0O0O00 = 22;
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ int OooO00o(int i, boolean z) {
            return super.OooO00o(i, z);
        }

        public void OooO0OO() {
            setSelection(-1);
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C5964Oooo00O oooo00O;
            int pointToPosition;
            int i2;
            if (this.f19093OooO00o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    oooo00O = (C5964Oooo00O) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    oooo00O = (C5964Oooo00O) adapter;
                }
                C5967Oooo0OO oooo0OO = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < oooo00O.getCount()) {
                    oooo0OO = oooo00O.getItem(i2);
                }
                MenuItem menuItem = this.OooO00o;
                if (menuItem != oooo0OO) {
                    C5965Oooo00o OooO00o2 = oooo00O.OooO00o();
                    if (menuItem != null) {
                        this.f19093OooO00o.OooO0O0(OooO00o2, menuItem);
                    }
                    this.OooO00o = oooo0OO;
                    if (oooo0OO != null) {
                        this.f19093OooO00o.OooO00o(OooO00o2, oooo0OO);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.oo0o0Oo) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.o0O0O00) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C5964Oooo00O) getAdapter()).OooO00o().OooO00o(false);
                return true;
            }
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(AbstractC6939o000000O o000000o) {
            this.f19093OooO00o = o000000o;
        }

        @Override // android.widget.AbsListView, com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ int OooO00o(int i, int i2, int i3, int i4, int i5) {
            return super.OooO00o(i, i2, i3, i4, i5);
        }

        @Override // com.p118pd.sdk.C8709oo0o0Oo
        public /* bridge */ /* synthetic */ boolean OooO00o(MotionEvent motionEvent, int i) {
            return super.OooO00o(motionEvent, i);
        }
    }

    static {
        try {
            OooO0Oo = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i(o0ooOoO, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C6940o000000o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.p118pd.sdk.C6934o000000
    public C8709oo0o0Oo OooO00o(Context context, boolean z) {
        OooO00o oooO00o = new OooO00o(context, z);
        oooO00o.setHoverListener(this);
        return oooO00o;
    }

    public void OooO0O0(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            ((C6934o000000) this).f19081OooO00o.setExitTransition((Transition) obj);
        }
    }

    public void OooO0o(boolean z) {
        Method method = OooO0Oo;
        if (method != null) {
            try {
                method.invoke(((C6934o000000) this).f19081OooO00o, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(o0ooOoO, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public void OooO00o(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            ((C6934o000000) this).f19081OooO00o.setEnterTransition((Transition) obj);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6939o000000O
    public void OooO0O0(@NonNull C5965Oooo00o oooo00o, @NonNull MenuItem menuItem) {
        AbstractC6939o000000O o000000o = this.OooO00o;
        if (o000000o != null) {
            o000000o.OooO0O0(oooo00o, menuItem);
        }
    }

    public void OooO00o(AbstractC6939o000000O o000000o) {
        this.OooO00o = o000000o;
    }

    @Override // com.p118pd.sdk.AbstractC6939o000000O
    public void OooO00o(@NonNull C5965Oooo00o oooo00o, @NonNull MenuItem menuItem) {
        AbstractC6939o000000O o000000o = this.OooO00o;
        if (o000000o != null) {
            o000000o.OooO00o(oooo00o, menuItem);
        }
    }
}
