package com.p118pd.sdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.o000000  reason: case insensitive filesystem */
public class C6934o000000 implements AbstractC5974OoooO {
    public static final boolean OooO = false;
    public static Method OooO00o = null;
    public static Method OooO0O0 = null;
    public static Method OooO0OO = null;
    public static final int o00000 = 0;
    public static final int o000000 = 1;
    public static final int o000000O = -1;
    public static final int o000000o = -2;
    public static final int o00000O = 2;
    public static final int o00000O0 = 1;
    public static final int o000OOo = 0;
    public static final int o0O0O00 = 250;
    public static final String o0ooOOo = "ListPopupWindow";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f19072OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataSetObserver f19073OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19074OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19075OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f19076OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f19077OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AdapterView.OnItemClickListener f19078OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AdapterView.OnItemSelectedListener f19079OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ListAdapter f19080OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow f19081OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RunnableC6935OooO0Oo f19082OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0o f19083OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View$OnTouchListenerC6937OooO0oO f19084OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RunnableC6938OooO0oo f19085OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8709oo0o0Oo f19086OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19087OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Rect f19088OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public View f19089OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19090OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f19091OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public int o00oO0O;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f19092o0ooOOo;
    public int o0ooOoO;
    public int oo0o0Oo;

    /* renamed from: com.pd.sdk.o000000$OooO00o */
    public class OooO00o extends AbstractView$OnTouchListenerC6995o000OOo {
        public OooO00o(View view) {
            super(view);
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public C6934o000000 OooO00o() {
            return C6934o000000.this;
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            View OooO00o2 = C6934o000000.this.m18099OooO00o();
            if (OooO00o2 != null && OooO00o2.getWindowToken() != null) {
                C6934o000000.this.m18102OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0OO */
    public class OooO0OO implements AdapterView.OnItemSelectedListener {
        public OooO0OO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C8709oo0o0Oo oo0o0oo;
            if (i != -1 && (oo0o0oo = C6934o000000.this.f19086OooO00o) != null) {
                oo0o0oo.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC6935OooO0Oo implements Runnable {
        public RunnableC6935OooO0Oo() {
        }

        public void run() {
            C6934o000000.this.m18107OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0o */
    public class OooO0o implements AbsListView.OnScrollListener {
        public OooO0o() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C6934o000000.this.m18111OooO0OO() && C6934o000000.this.f19081OooO00o.getContentView() != null) {
                C6934o000000 o000000 = C6934o000000.this;
                o000000.f19076OooO00o.removeCallbacks(o000000.f19085OooO00o);
                C6934o000000.this.f19085OooO00o.run();
            }
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0o0  reason: case insensitive filesystem */
    public class C6936OooO0o0 extends DataSetObserver {
        public C6936OooO0o0() {
        }

        public void onChanged() {
            if (C6934o000000.this.m18109OooO0O0()) {
                C6934o000000.this.m18102OooO00o();
            }
        }

        public void onInvalidated() {
            C6934o000000.this.dismiss();
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0oO  reason: case insensitive filesystem */
    public class View$OnTouchListenerC6937OooO0oO implements View.OnTouchListener {
        public View$OnTouchListenerC6937OooO0oO() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C6934o000000.this.f19081OooO00o) != null && popupWindow.isShowing() && x >= 0 && x < C6934o000000.this.f19081OooO00o.getWidth() && y >= 0 && y < C6934o000000.this.f19081OooO00o.getHeight()) {
                C6934o000000 o000000 = C6934o000000.this;
                o000000.f19076OooO00o.postDelayed(o000000.f19085OooO00o, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C6934o000000 o0000002 = C6934o000000.this;
                o0000002.f19076OooO00o.removeCallbacks(o0000002.f19085OooO00o);
                return false;
            }
        }
    }

    /* renamed from: com.pd.sdk.o000000$OooO0oo  reason: case insensitive filesystem */
    public class RunnableC6938OooO0oo implements Runnable {
        public RunnableC6938OooO0oo() {
        }

        public void run() {
            C8709oo0o0Oo oo0o0oo = C6934o000000.this.f19086OooO00o;
            if (oo0o0oo != null && ViewCompat.m14604OooO0oo((View) oo0o0oo) && C6934o000000.this.f19086OooO00o.getCount() > C6934o000000.this.f19086OooO00o.getChildCount()) {
                int childCount = C6934o000000.this.f19086OooO00o.getChildCount();
                C6934o000000 o000000 = C6934o000000.this;
                if (childCount <= o000000.o0OO00O) {
                    o000000.f19081OooO00o.setInputMethodMode(2);
                    C6934o000000.this.m18102OooO00o();
                }
            }
        }
    }

    static {
        try {
            OooO00o = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i(o0ooOOo, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            OooO0O0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i(o0ooOOo, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            OooO0OO = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i(o0ooOOo, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C6934o000000(@NonNull Context context) {
        this(context, null, C0033R.attr.listPopupWindowStyle);
    }

    public static boolean OooO0O0(int i) {
        return i == 66 || i == 23;
    }

    public int OooO() {
        return this.o0ooOO0;
    }

    public void OooO00o(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f19073OooO00o;
        if (dataSetObserver == null) {
            this.f19073OooO00o = new C6936OooO0o0();
        } else {
            ListAdapter listAdapter2 = this.f19080OooO00o;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f19080OooO00o = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f19073OooO00o);
        }
        C8709oo0o0Oo oo0o0oo = this.f19086OooO00o;
        if (oo0o0oo != null) {
            oo0o0oo.setAdapter(this.f19080OooO00o);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0O0(boolean z) {
        this.OooO0oO = z;
    }

    public void OooO0OO(boolean z) {
        this.OooO0oo = z;
        this.f19081OooO00o.setFocusable(z);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18113OooO0Oo() {
        return this.OooO0oo;
    }

    public void OooO0o(int i) {
        this.f19081OooO00o.setInputMethodMode(i);
    }

    public int OooO0o0() {
        return this.oo0o0Oo;
    }

    public int OooO0oO() {
        return this.f19081OooO00o.getSoftInputMode();
    }

    public void OooO0oo(int i) {
        this.oo0o0Oo = i;
    }

    public void OooOO0(int i) {
        this.f19081OooO00o.setSoftInputMode(i);
    }

    public void OooOO0O(int i) {
        this.o0ooOoO = i;
        this.f19090OooO0O0 = true;
    }

    public void OooOO0o(int i) {
        this.o0ooOO0 = i;
    }

    public void OooOOO0(int i) {
        this.o0OOO0o = i;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public void dismiss() {
        this.f19081OooO00o.dismiss();
        OooO0Oo();
        this.f19081OooO00o.setContentView(null);
        this.f19086OooO00o = null;
        this.f19076OooO00o.removeCallbacks(this.f19085OooO00o);
    }

    public C6934o000000(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.listPopupWindowStyle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    private int OooOO0() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (this.f19086OooO00o == null) {
            Context context = this.f19072OooO00o;
            this.f19087OooO00o = new OooO0O0();
            C8709oo0o0Oo OooO00o2 = OooO00o(context, !this.OooO0oo);
            this.f19086OooO00o = OooO00o2;
            Drawable drawable = this.f19075OooO00o;
            if (drawable != null) {
                OooO00o2.setSelector(drawable);
            }
            this.f19086OooO00o.setAdapter(this.f19080OooO00o);
            this.f19086OooO00o.setOnItemClickListener(this.f19078OooO00o);
            this.f19086OooO00o.setFocusable(true);
            this.f19086OooO00o.setFocusableInTouchMode(true);
            this.f19086OooO00o.setOnItemSelectedListener(new OooO0OO());
            this.f19086OooO00o.setOnScrollListener(this.f19083OooO00o);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f19079OooO00o;
            if (onItemSelectedListener != null) {
                this.f19086OooO00o.setOnItemSelectedListener(onItemSelectedListener);
            }
            C8709oo0o0Oo oo0o0oo = this.f19086OooO00o;
            View view = this.f19077OooO00o;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.oo0o0Oo;
                if (i5 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(oo0o0oo, layoutParams);
                } else if (i5 != 1) {
                    String str = "Invalid hint position " + this.oo0o0Oo;
                } else {
                    linearLayout.addView(oo0o0oo, layoutParams);
                    linearLayout.addView(view);
                }
                int i6 = this.o0ooOO0;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                oo0o0oo = linearLayout;
            } else {
                i = 0;
            }
            this.f19081OooO00o.setContentView(oo0o0oo);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f19081OooO00o.getContentView();
            View view2 = this.f19077OooO00o;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f19081OooO00o.getBackground();
        if (background != null) {
            background.getPadding(this.f19074OooO00o);
            Rect rect = this.f19074OooO00o;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f19090OooO0O0) {
                this.o0ooOoO = -i7;
            }
        } else {
            this.f19074OooO00o.setEmpty();
            i2 = 0;
        }
        if (this.f19081OooO00o.getInputMethodMode() != 2) {
            z = false;
        }
        int OooO00o3 = OooO00o(m18099OooO00o(), this.o0ooOoO, z);
        if (this.OooO0o || this.o00oO0O == -1) {
            return OooO00o3 + i2;
        }
        int i8 = this.o0ooOO0;
        if (i8 == -2) {
            int i9 = this.f19072OooO00o.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f19074OooO00o;
            i3 = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            i3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.f19072OooO00o.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f19074OooO00o;
            i3 = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int OooO00o4 = this.f19086OooO00o.OooO00o(i3, 0, -1, OooO00o3 - i, -1);
        if (OooO00o4 > 0) {
            i += i2 + this.f19086OooO00o.getPaddingTop() + this.f19086OooO00o.getPaddingBottom();
        }
        return OooO00o4 + i;
    }

    public void OooO(int i) {
        C8709oo0o0Oo oo0o0oo = this.f19086OooO00o;
        if (m18109OooO0O0() && oo0o0oo != null) {
            oo0o0oo.setListSelectionHidden(false);
            oo0o0oo.setSelection(i);
            if (oo0o0oo.getChoiceMode() != 0) {
                oo0o0oo.setItemChecked(i, true);
            }
        }
    }

    public void OooO0O0(Drawable drawable) {
        this.f19075OooO00o = drawable;
    }

    public void OooO0Oo(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.o00oO0O = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    public int OooO0o() {
        if (!m18109OooO0O0()) {
            return -1;
        }
        return this.f19086OooO00o.getSelectedItemPosition();
    }

    public void OooO0o0(int i) {
        this.f19092o0ooOOo = i;
    }

    public void OooO0oO(int i) {
        this.o0OO00O = i;
    }

    public int OooO0oo() {
        if (!this.f19090OooO0O0) {
            return 0;
        }
        return this.o0ooOoO;
    }

    public C6934o000000(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    private void OooO0o0(boolean z) {
        Method method = OooO00o;
        if (method != null) {
            try {
                method.invoke(this.f19081OooO00o, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(o0ooOOo, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18108OooO0O0(int i) {
        Drawable background = this.f19081OooO00o.getBackground();
        if (background != null) {
            background.getPadding(this.f19074OooO00o);
            Rect rect = this.f19074OooO00o;
            this.o0ooOO0 = rect.left + rect.right + i;
            return;
        }
        OooOO0o(i);
    }

    public int OooO0OO() {
        return this.f19092o0ooOOo;
    }

    public C6934o000000(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.o00oO0O = -2;
        this.o0ooOO0 = -2;
        this.o0OOO0o = 1002;
        this.f19091OooO0OO = true;
        this.o0Oo0oo = 0;
        this.OooO0o = false;
        this.OooO0oO = false;
        this.o0OO00O = Integer.MAX_VALUE;
        this.oo0o0Oo = 0;
        this.f19085OooO00o = new RunnableC6938OooO0oo();
        this.f19084OooO00o = new View$OnTouchListenerC6937OooO0oO();
        this.f19083OooO00o = new OooO0o();
        this.f19082OooO00o = new RunnableC6935OooO0Oo();
        this.f19074OooO00o = new Rect();
        this.f19072OooO00o = context;
        this.f19076OooO00o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOoo0, i, i2);
        this.f19092o0ooOOo = obtainStyledAttributes.getDimensionPixelOffset(C0033R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0033R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.o0ooOoO = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f19090OooO0O0 = true;
        }
        obtainStyledAttributes.recycle();
        C7105o00Oo0 o00oo0 = new C7105o00Oo0(context, attributeSet, i, i2);
        this.f19081OooO00o = o00oo0;
        o00oo0.setInputMethodMode(1);
    }

    private void OooO0Oo() {
        View view = this.f19077OooO00o;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f19077OooO00o);
            }
        }
    }

    public void OooO0OO(int i) {
        this.o0Oo0oo = i;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18110OooO0OO() {
        this.f19076OooO00o.post(this.f19087OooO00o);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18111OooO0OO() {
        return this.f19081OooO00o.getInputMethodMode() == 2;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    public int OooO0O0() {
        return this.o00oO0O;
    }

    public boolean OooO0OO(int i, @NonNull KeyEvent keyEvent) {
        if (!m18109OooO0O0() || this.f19086OooO00o.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f19086OooO00o.onKeyUp(i, keyEvent);
        if (onKeyUp && OooO0O0(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public void OooO0O0(@Nullable View view) {
        boolean OooO0O02 = m18109OooO0O0();
        if (OooO0O02) {
            OooO0Oo();
        }
        this.f19077OooO00o = view;
        if (OooO0O02) {
            m18102OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(boolean z) {
        this.OooO0o = z;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public int m18112OooO0Oo() {
        return this.f19081OooO00o.getInputMethodMode();
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18104OooO00o() {
        return this.OooO0o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0Oo(boolean z) {
        this.OooO0o0 = true;
        this.OooO0Oo = z;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m18098OooO00o() {
        return this.f19081OooO00o.getBackground();
    }

    public void OooO00o(@Nullable Drawable drawable) {
        this.f19081OooO00o.setBackgroundDrawable(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18107OooO0O0() {
        C8709oo0o0Oo oo0o0oo = this.f19086OooO00o;
        if (oo0o0oo != null) {
            oo0o0oo.setListSelectionHidden(true);
            oo0o0oo.requestLayout();
        }
    }

    public void OooO00o(@StyleRes int i) {
        this.f19081OooO00o.setAnimationStyle(i);
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @StyleRes
    public int OooO00o() {
        return this.f19081OooO00o.getAnimationStyle();
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18099OooO00o() {
        return this.f19089OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18109OooO0O0() {
        return this.f19081OooO00o.isShowing();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18103OooO00o(@Nullable View view) {
        this.f19089OooO0O0 = view;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public View m18106OooO0O0() {
        if (!m18109OooO0O0()) {
            return null;
        }
        return this.f19086OooO00o.getSelectedView();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(Rect rect) {
        this.f19088OooO0O0 = rect;
    }

    public void OooO00o(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.f19078OooO00o = onItemClickListener;
    }

    public boolean OooO0O0(int i, @NonNull KeyEvent keyEvent) {
        if (i != 4 || !m18109OooO0O0()) {
            return false;
        }
        View view = this.f19089OooO0O0;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                return false;
            }
            dismiss();
            return true;
        }
    }

    public void OooO00o(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f19079OooO00o = onItemSelectedListener;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18102OooO00o() {
        int OooOO0 = OooOO0();
        boolean OooO0OO2 = m18111OooO0OO();
        C7147o00o000O.OooO00o(this.f19081OooO00o, this.o0OOO0o);
        boolean z = true;
        if (!this.f19081OooO00o.isShowing()) {
            int i = this.o0ooOO0;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = m18099OooO00o().getWidth();
            }
            int i2 = this.o00oO0O;
            if (i2 == -1) {
                OooOO0 = -1;
            } else if (i2 != -2) {
                OooOO0 = i2;
            }
            this.f19081OooO00o.setWidth(i);
            this.f19081OooO00o.setHeight(OooOO0);
            OooO0o0(true);
            this.f19081OooO00o.setOutsideTouchable(!this.OooO0oO && !this.OooO0o);
            this.f19081OooO00o.setTouchInterceptor(this.f19084OooO00o);
            if (this.OooO0o0) {
                C7147o00o000O.OooO00o(this.f19081OooO00o, this.OooO0Oo);
            }
            Method method = OooO0OO;
            if (method != null) {
                try {
                    method.invoke(this.f19081OooO00o, this.f19088OooO0O0);
                } catch (Exception unused) {
                }
            }
            C7147o00o000O.OooO00o(this.f19081OooO00o, m18099OooO00o(), this.f19092o0ooOOo, this.o0ooOoO, this.o0Oo0oo);
            this.f19086OooO00o.setSelection(-1);
            if (!this.OooO0oo || this.f19086OooO00o.isInTouchMode()) {
                m18107OooO0O0();
            }
            if (!this.OooO0oo) {
                this.f19076OooO00o.post(this.f19082OooO00o);
            }
        } else if (ViewCompat.m14604OooO0oo(m18099OooO00o())) {
            int i3 = this.o0ooOO0;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = m18099OooO00o().getWidth();
            }
            int i4 = this.o00oO0O;
            if (i4 == -1) {
                if (!OooO0OO2) {
                    OooOO0 = -1;
                }
                if (OooO0OO2) {
                    this.f19081OooO00o.setWidth(this.o0ooOO0 == -1 ? -1 : 0);
                    this.f19081OooO00o.setHeight(0);
                } else {
                    this.f19081OooO00o.setWidth(this.o0ooOO0 == -1 ? -1 : 0);
                    this.f19081OooO00o.setHeight(-1);
                }
            } else if (i4 != -2) {
                OooOO0 = i4;
            }
            PopupWindow popupWindow = this.f19081OooO00o;
            if (this.OooO0oO || this.OooO0o) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f19081OooO00o.update(m18099OooO00o(), this.f19092o0ooOOo, this.o0ooOoO, i3 < 0 ? -1 : i3, OooOO0 < 0 ? -1 : OooOO0);
        }
    }

    public void OooO00o(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f19081OooO00o.setOnDismissListener(onDismissListener);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18105OooO00o(int i) {
        if (!m18109OooO0O0()) {
            return false;
        }
        if (this.f19078OooO00o == null) {
            return true;
        }
        C8709oo0o0Oo oo0o0oo = this.f19086OooO00o;
        this.f19078OooO00o.onItemClick(oo0o0oo, oo0o0oo.getChildAt(i - oo0o0oo.getFirstVisiblePosition()), i, oo0o0oo.getAdapter().getItemId(i));
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18101OooO00o() {
        if (!m18109OooO0O0()) {
            return null;
        }
        return this.f19086OooO00o.getSelectedItem();
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m18097OooO00o() {
        if (!m18109OooO0O0()) {
            return Long.MIN_VALUE;
        }
        return this.f19086OooO00o.getSelectedItemId();
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m18100OooO00o() {
        return this.f19086OooO00o;
    }

    @NonNull
    public C8709oo0o0Oo OooO00o(Context context, boolean z) {
        return new C8709oo0o0Oo(context, z);
    }

    public boolean OooO00o(int i, @NonNull KeyEvent keyEvent) {
        int i2;
        int i3;
        if (m18109OooO0O0() && i != 62 && (this.f19086OooO00o.getSelectedItemPosition() >= 0 || !OooO0O0(i))) {
            int selectedItemPosition = this.f19086OooO00o.getSelectedItemPosition();
            boolean z = !this.f19081OooO00o.isAboveAnchor();
            ListAdapter listAdapter = this.f19080OooO00o;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i2 = 0;
                } else {
                    i2 = this.f19086OooO00o.OooO00o(0, true);
                }
                if (areAllItemsEnabled) {
                    i3 = listAdapter.getCount() - 1;
                } else {
                    i3 = this.f19086OooO00o.OooO00o(listAdapter.getCount() - 1, false);
                }
                i4 = i2;
                i5 = i3;
            }
            if ((!z || i != 19 || selectedItemPosition > i4) && (z || i != 20 || selectedItemPosition < i5)) {
                this.f19086OooO00o.setListSelectionHidden(false);
                if (this.f19086OooO00o.onKeyDown(i, keyEvent)) {
                    this.f19081OooO00o.setInputMethodMode(2);
                    this.f19086OooO00o.requestFocusFromTouch();
                    m18102OooO00o();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (!z || i != 20) {
                    if (!z && i == 19 && selectedItemPosition == i4) {
                        return true;
                    }
                    return false;
                } else if (selectedItemPosition == i5) {
                    return true;
                }
            } else {
                m18107OooO0O0();
                this.f19081OooO00o.setInputMethodMode(1);
                m18102OooO00o();
                return true;
            }
        }
        return false;
    }

    public View.OnTouchListener OooO00o(View view) {
        return new OooO00o(view);
    }

    private int OooO00o(View view, int i, boolean z) {
        Method method = OooO0O0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f19081OooO00o, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i(o0ooOOo, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f19081OooO00o.getMaxAvailableHeight(view, i);
    }
}
