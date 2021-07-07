package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.AbstractC5974OoooO;
import com.p118pd.sdk.AbstractC7089o00OO0oO;
import com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C6934o000000;
import com.p118pd.sdk.C6970o0000oO;
import com.p118pd.sdk.C7120o00OoOO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActivityChooserView extends ViewGroup implements C5982OoooOoO.OooO00o {
    public static final String o0ooOOo = "ActivityChooserView";
    public final DataSetObserver OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Drawable f13748OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f13749OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13750OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FrameLayout f13751OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ImageView f13752OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow.OnDismissListener f13753OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0o f13754OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View$OnClickListenerC5013OooO0oO f13755OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6934o000000 f13756OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7089o00OO0oO f13757OooO00o;
    public final FrameLayout OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ImageView f13758OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13759OooO0O0;
    public boolean OooO0OO;
    public final int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f13760o0ooOOo;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class InnerLayout extends LinearLayout {
        public static final int[] OooO00o = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, OooO00o);
            setBackgroundDrawable(OooO00o2.m18162OooO00o(0));
            OooO00o2.m18167OooO00o();
        }
    }

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f13754OooO00o.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f13754OooO00o.notifyDataSetInvalidated();
        }
    }

    public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO0O0() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.OooO0O0()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().m18102OooO00o();
            AbstractC7089o00OO0oO o00oo0oo = ActivityChooserView.this.f13757OooO00o;
            if (o00oo0oo != null) {
                o00oo0oo.OooO00o(true);
            }
        }
    }

    public class OooO0OO extends View.AccessibilityDelegate {
        public OooO0OO() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C7120o00OoOO.OooO00o(accessibilityNodeInfo).OooO0O0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$OooO0Oo  reason: case insensitive filesystem */
    public class C5011OooO0Oo extends AbstractView$OnTouchListenerC6995o000OOo {
        public C5011OooO0Oo(View view) {
            super(view);
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public AbstractC5974OoooO OooO00o() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public boolean OooO0O0() {
            ActivityChooserView.this.m14430OooO00o();
            return true;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14431OooO00o() {
            ActivityChooserView.this.OooO0OO();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$OooO0o0  reason: case insensitive filesystem */
    public class C5012OooO0o0 extends DataSetObserver {
        public C5012OooO0o0() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.OooO00o();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$OooO0oO  reason: case insensitive filesystem */
    public class View$OnClickListenerC5013OooO0oO implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public View$OnClickListenerC5013OooO0oO() {
        }

        private void OooO00o() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f13753OooO00o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.OooO0O0) {
                activityChooserView.m14430OooO00o();
                Intent OooO00o2 = ActivityChooserView.this.f13754OooO00o.m14433OooO00o().OooO00o(ActivityChooserView.this.f13754OooO00o.m14433OooO00o().OooO00o(ActivityChooserView.this.f13754OooO00o.m14432OooO00o()));
                if (OooO00o2 != null) {
                    OooO00o2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(OooO00o2);
                }
            } else if (view == activityChooserView.f13751OooO00o) {
                activityChooserView.f13759OooO0O0 = false;
                activityChooserView.OooO00o(activityChooserView.o0ooOO0);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            OooO00o();
            AbstractC7089o00OO0oO o00oo0oo = ActivityChooserView.this.f13757OooO00o;
            if (o00oo0oo != null) {
                o00oo0oo.OooO00o(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((OooO0o) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.m14430OooO00o();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f13759OooO0O0) {
                    if (!activityChooserView.f13754OooO00o.m14434OooO00o()) {
                        i++;
                    }
                    Intent OooO00o2 = ActivityChooserView.this.f13754OooO00o.m14433OooO00o().OooO00o(i);
                    if (OooO00o2 != null) {
                        OooO00o2.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(OooO00o2);
                    }
                } else if (i > 0) {
                    activityChooserView.f13754OooO00o.m14433OooO00o().m16821OooO00o(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.OooO00o(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.OooO0O0) {
                if (activityChooserView.f13754OooO00o.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f13759OooO0O0 = true;
                    activityChooserView2.OooO00o(activityChooserView2.o0ooOO0);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(int r6) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.OooO00o(int):void");
    }

    public boolean OooO0O0() {
        return getListPopupWindow().m18109OooO0O0();
    }

    public boolean OooO0OO() {
        if (OooO0O0() || !this.OooO0OO) {
            return false;
        }
        this.f13759OooO0O0 = false;
        OooO00o(this.o0ooOO0);
        return true;
    }

    public C5982OoooOoO getDataModel() {
        return this.f13754OooO00o.m14433OooO00o();
    }

    public C6934o000000 getListPopupWindow() {
        if (this.f13756OooO00o == null) {
            C6934o000000 o000000 = new C6934o000000(getContext());
            this.f13756OooO00o = o000000;
            o000000.OooO00o(this.f13754OooO00o);
            this.f13756OooO00o.m18103OooO00o((View) this);
            this.f13756OooO00o.OooO0OO(true);
            this.f13756OooO00o.OooO00o((AdapterView.OnItemClickListener) this.f13755OooO00o);
            this.f13756OooO00o.OooO00o((PopupWindow.OnDismissListener) this.f13755OooO00o);
        }
        return this.f13756OooO00o;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5982OoooOoO OooO00o2 = this.f13754OooO00o.m14433OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.registerObserver(this.OooO00o);
        }
        this.OooO0OO = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5982OoooOoO OooO00o2 = this.f13754OooO00o.m14433OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.unregisterObserver(this.OooO00o);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13750OooO00o);
        }
        if (OooO0O0()) {
            m14430OooO00o();
        }
        this.OooO0OO = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f13749OooO00o.layout(0, 0, i3 - i, i4 - i2);
        if (!OooO0O0()) {
            m14430OooO00o();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f13749OooO00o;
        if (this.OooO0O0.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.p118pd.sdk.C5982OoooOoO.OooO00o
    public void setActivityChooserModel(C5982OoooOoO ooooOoO) {
        this.f13754OooO00o.OooO00o(ooooOoO);
        if (OooO0O0()) {
            m14430OooO00o();
            OooO0OO();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f13760o0ooOOo = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f13752OooO00o.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f13752OooO00o.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.o0ooOO0 = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f13753OooO00o = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setProvider(AbstractC7089o00OO0oO o00oo0oo) {
        this.f13757OooO00o = o00oo0oo;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO00o = new OooO00o();
        this.f13750OooO00o = new OooO0O0();
        this.o0ooOO0 = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooO0o, i, 0);
        this.o0ooOO0 = obtainStyledAttributes.getInt(C0033R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0033R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0033R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        this.f13755OooO00o = new View$OnClickListenerC5013OooO0oO();
        View findViewById = findViewById(C0033R.C0036id.activity_chooser_view_content);
        this.f13749OooO00o = findViewById;
        this.f13748OooO00o = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0033R.C0036id.default_activity_button);
        this.OooO0O0 = frameLayout;
        frameLayout.setOnClickListener(this.f13755OooO00o);
        this.OooO0O0.setOnLongClickListener(this.f13755OooO00o);
        this.f13758OooO0O0 = (ImageView) this.OooO0O0.findViewById(C0033R.C0036id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0033R.C0036id.expand_activities_button);
        frameLayout2.setOnClickListener(this.f13755OooO00o);
        frameLayout2.setAccessibilityDelegate(new OooO0OO());
        frameLayout2.setOnTouchListener(new C5011OooO0Oo(frameLayout2));
        this.f13751OooO00o = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(C0033R.C0036id.image);
        this.f13752OooO00o = imageView;
        imageView.setImageDrawable(drawable);
        OooO0o oooO0o = new OooO0o();
        this.f13754OooO00o = oooO0o;
        oooO0o.registerDataSetObserver(new C5012OooO0o0());
        Resources resources = context.getResources();
        this.o00oO0O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0033R.dimen.abc_config_prefDialogWidth));
    }

    public class OooO0o extends BaseAdapter {
        public static final int o0OOO0o = 1;
        public static final int o0Oo0oo = 3;
        public static final int o0ooOO0 = Integer.MAX_VALUE;
        public static final int o0ooOOo = 4;
        public static final int o0ooOoO = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5982OoooOoO f13761OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public int o00oO0O = 4;

        public OooO0o() {
        }

        public void OooO00o(C5982OoooOoO ooooOoO) {
            C5982OoooOoO OooO00o2 = ActivityChooserView.this.f13754OooO00o.m14433OooO00o();
            if (OooO00o2 != null && ActivityChooserView.this.isShown()) {
                OooO00o2.unregisterObserver(ActivityChooserView.this.OooO00o);
            }
            this.f13761OooO00o = ooooOoO;
            if (ooooOoO != null && ActivityChooserView.this.isShown()) {
                ooooOoO.registerObserver(ActivityChooserView.this.OooO00o);
            }
            notifyDataSetChanged();
        }

        public int OooO0O0() {
            return this.f13761OooO00o.m16823OooO0OO();
        }

        public int OooO0OO() {
            int i = this.o00oO0O;
            this.o00oO0O = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.o00oO0O = i;
            return i2;
        }

        public int getCount() {
            int OooO00o2 = this.f13761OooO00o.m16817OooO00o();
            if (!this.OooO0O0 && this.f13761OooO00o.m16819OooO00o() != null) {
                OooO00o2--;
            }
            int min = Math.min(OooO00o2, this.o00oO0O);
            return this.OooO0Oo ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.OooO0O0 && this.f13761OooO00o.m16819OooO00o() != null) {
                    i++;
                }
                return this.f13761OooO00o.m16820OooO00o(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.OooO0Oo || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C0033R.C0036id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0033R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0033R.C0036id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0033R.C0036id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.OooO0O0 || i != 0 || !this.OooO0OO) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0033R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C0033R.C0036id.title)).setText(ActivityChooserView.this.getContext().getString(C0033R.string.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void OooO00o(int i) {
            if (this.o00oO0O != i) {
                this.o00oO0O = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public ResolveInfo m14432OooO00o() {
            return this.f13761OooO00o.m16819OooO00o();
        }

        public void OooO00o(boolean z) {
            if (this.OooO0Oo != z) {
                this.OooO0Oo = z;
                notifyDataSetChanged();
            }
        }

        public int OooO00o() {
            return this.f13761OooO00o.m16817OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5982OoooOoO m14433OooO00o() {
            return this.f13761OooO00o;
        }

        public void OooO00o(boolean z, boolean z2) {
            if (this.OooO0O0 != z || this.OooO0OO != z2) {
                this.OooO0O0 = z;
                this.OooO0OO = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14434OooO00o() {
            return this.OooO0O0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14430OooO00o() {
        if (!OooO0O0()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f13750OooO00o);
        return true;
    }

    public void OooO00o() {
        if (this.f13754OooO00o.getCount() > 0) {
            this.f13751OooO00o.setEnabled(true);
        } else {
            this.f13751OooO00o.setEnabled(false);
        }
        int OooO00o2 = this.f13754OooO00o.OooO00o();
        int OooO0O02 = this.f13754OooO00o.OooO0O0();
        if (OooO00o2 == 1 || (OooO00o2 > 1 && OooO0O02 > 0)) {
            this.OooO0O0.setVisibility(0);
            ResolveInfo OooO00o3 = this.f13754OooO00o.m14432OooO00o();
            PackageManager packageManager = getContext().getPackageManager();
            this.f13758OooO0O0.setImageDrawable(OooO00o3.loadIcon(packageManager));
            if (this.f13760o0ooOOo != 0) {
                CharSequence loadLabel = OooO00o3.loadLabel(packageManager);
                this.OooO0O0.setContentDescription(getContext().getString(this.f13760o0ooOOo, loadLabel));
            }
        } else {
            this.OooO0O0.setVisibility(8);
        }
        if (this.OooO0O0.getVisibility() == 0) {
            this.f13749OooO00o.setBackgroundDrawable(this.f13748OooO00o);
        } else {
            this.f13749OooO00o.setBackgroundDrawable(null);
        }
    }
}
