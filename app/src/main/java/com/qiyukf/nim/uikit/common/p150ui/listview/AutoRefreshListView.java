package com.qiyukf.nim.uikit.common.p150ui.listview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.ui.listview.AutoRefreshListView */
public class AutoRefreshListView extends ListView {

    /* renamed from: a */
    public float f3681a = 0.0f;

    /* renamed from: b */
    public boolean f3682b = false;

    /* renamed from: c */
    public AbstractC1928b f3683c;

    /* renamed from: d */
    public List<AbsListView.OnScrollListener> f3684d = new ArrayList();

    /* renamed from: e */
    public int f3685e = EnumC1929c.f3707b;

    /* renamed from: f */
    public int f3686f;

    /* renamed from: g */
    public int f3687g;

    /* renamed from: h */
    public boolean f3688h;

    /* renamed from: i */
    public boolean f3689i;

    /* renamed from: j */
    public int f3690j;

    /* renamed from: k */
    public ViewGroup f3691k;

    /* renamed from: l */
    public ViewGroup f3692l;

    /* renamed from: m */
    public ImageView f3693m;

    /* renamed from: n */
    public AnimationDrawable f3694n;

    /* renamed from: o */
    public int f3695o;

    /* renamed from: p */
    public boolean f3696p;

    /* renamed from: q */
    public int f3697q;

    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.AutoRefreshListView$3 */
    public static /* synthetic */ class C19263 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3700a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3701b;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
        static {
            /*
                int[] r0 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1927a.m3755a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19263.f3701b = r0
                r1 = 1
                int r2 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1927a.f3703b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19263.f3701b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r3 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1927a.f3702a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r3 = r3 - r1
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1929c.m3758a()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19263.f3700a = r2
                int r3 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1929c.f3706a     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r3 = r3 - r1
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19263.f3700a     // Catch:{ NoSuchFieldError -> 0x002c }
                int r3 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1929c.f3707b     // Catch:{ NoSuchFieldError -> 0x002c }
                int r3 = r3 - r1
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19263.<clinit>():void");
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.AutoRefreshListView$a */
    public static final class EnumC1927a extends Enum<EnumC1927a> {

        /* renamed from: a */
        public static final int f3702a = 1;

        /* renamed from: b */
        public static final int f3703b = 2;

        /* renamed from: c */
        public static final int f3704c = 3;

        /* renamed from: d */
        public static final /* synthetic */ int[] f3705d = {1, 2, 3};

        /* renamed from: a */
        public static int[] m3755a() {
            return (int[]) f3705d.clone();
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.AutoRefreshListView$b */
    public interface AbstractC1928b {
        /* renamed from: a */
        void mo34341a();

        /* renamed from: a */
        void mo34342a(int i);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.AutoRefreshListView$c */
    public static final class EnumC1929c extends Enum<EnumC1929c> {

        /* renamed from: a */
        public static final int f3706a = 1;

        /* renamed from: b */
        public static final int f3707b = 2;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3708c = {1, 2};

        /* renamed from: a */
        public static int[] m3758a() {
            return (int[]) f3708c.clone();
        }
    }

    public AutoRefreshListView(Context context) {
        super(context);
        int i = EnumC1927a.f3702a;
        this.f3686f = i;
        this.f3687g = i;
        this.f3688h = true;
        this.f3689i = true;
        this.f3690j = 0;
        this.f3696p = false;
        this.f3697q = 0;
        m3744a(context);
    }

    public AutoRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = EnumC1927a.f3702a;
        this.f3686f = i;
        this.f3687g = i;
        this.f3688h = true;
        this.f3689i = true;
        this.f3690j = 0;
        this.f3696p = false;
        this.f3697q = 0;
        m3744a(context);
    }

    public AutoRefreshListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = EnumC1927a.f3702a;
        this.f3686f = i2;
        this.f3687g = i2;
        this.f3688h = true;
        this.f3689i = true;
        this.f3690j = 0;
        this.f3696p = false;
        this.f3697q = 0;
        m3744a(context);
    }

    @TargetApi(21)
    public AutoRefreshListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = EnumC1927a.f3702a;
        this.f3686f = i3;
        this.f3687g = i3;
        this.f3688h = true;
        this.f3689i = true;
        this.f3690j = 0;
        this.f3696p = false;
        this.f3697q = 0;
        m3744a(context);
    }

    /* renamed from: a */
    private void m3744a(Context context) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, C2364R.layout.ysf_listview_refresh, null);
        this.f3691k = viewGroup;
        this.f3693m = (ImageView) viewGroup.findViewById(C2364R.C2367id.ysf_iv_refresh_loading_anim);
        if (!(C2452d.m5373e().uiCustomization == null || C2452d.m5373e().uiCustomization.loadingAnimationDrawable == 0)) {
            this.f3693m.setImageResource(C2452d.m5373e().uiCustomization.loadingAnimationDrawable);
            if (this.f3693m.getDrawable() instanceof AnimationDrawable) {
                this.f3694n = (AnimationDrawable) this.f3693m.getDrawable();
            }
        }
        addHeaderView(this.f3691k, null, false);
        ViewGroup viewGroup2 = (ViewGroup) View.inflate(context, C2364R.layout.ysf_listview_refresh, null);
        this.f3692l = viewGroup2;
        addFooterView(viewGroup2, null, false);
        super.setOnScrollListener(new AbsListView.OnScrollListener() {
            /* class com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19241 */

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                for (AbsListView.OnScrollListener onScrollListener : AutoRefreshListView.this.f3684d) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                }
            }

            public final void onScrollStateChanged(AbsListView absListView, int i) {
                for (AbsListView.OnScrollListener onScrollListener : AutoRefreshListView.this.f3684d) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                }
            }
        });
        this.f3684d.add(new AbsListView.OnScrollListener() {
            /* class com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.C19252 */

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public final void onScrollStateChanged(AbsListView absListView, int i) {
                if (i == 0 && AutoRefreshListView.this.f3685e == EnumC1929c.f3707b) {
                    boolean z = true;
                    if (AutoRefreshListView.this.getFirstVisiblePosition() < AutoRefreshListView.this.getHeaderViewsCount() && AutoRefreshListView.this.getCount() > AutoRefreshListView.this.getHeaderViewsCount()) {
                        AutoRefreshListView.m3745a(AutoRefreshListView.this, true);
                        return;
                    }
                    if (AutoRefreshListView.this.getLastVisiblePosition() < AutoRefreshListView.this.getCount() - 1) {
                        z = false;
                    }
                    if (z) {
                        AutoRefreshListView.m3745a(AutoRefreshListView.this, false);
                    }
                }
            }
        });
        this.f3685e = EnumC1929c.f3707b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3745a(AutoRefreshListView autoRefreshListView, boolean z) {
        if (autoRefreshListView.f3683c != null) {
            View childAt = autoRefreshListView.getChildAt(autoRefreshListView.getHeaderViewsCount());
            if (childAt != null) {
                autoRefreshListView.f3695o = childAt.getTop();
            }
            if (!z && autoRefreshListView.f3689i && autoRefreshListView.f3686f != EnumC1927a.f3702a) {
                autoRefreshListView.f3683c.mo34341a();
                autoRefreshListView.f3687g = EnumC1927a.f3703b;
                autoRefreshListView.f3685e = EnumC1929c.f3706a;
            }
            autoRefreshListView.m3748b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x0090;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3746a(android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.m3746a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private void m3748b() {
        int i = C19263.f3700a[this.f3685e - 1];
        if (i != 1) {
            if (i == 2) {
                int i2 = 8;
                if (this.f3687g != EnumC1927a.f3702a) {
                    this.f3692l.getChildAt(0).setVisibility(8);
                } else if (this.f3694n != null) {
                    this.f3691k.getChildAt(0).setVisibility(8);
                    if (this.f3694n == null) {
                        return;
                    }
                    if (this.f3688h) {
                        this.f3693m.setVisibility(4);
                        AnimationDrawable animationDrawable = this.f3694n;
                        if (animationDrawable != null) {
                            animationDrawable.start();
                            return;
                        }
                        return;
                    }
                    this.f3693m.setVisibility(8);
                    AnimationDrawable animationDrawable2 = this.f3694n;
                    if (animationDrawable2 != null) {
                        animationDrawable2.stop();
                    }
                } else {
                    View childAt = this.f3691k.getChildAt(0);
                    if (this.f3688h) {
                        i2 = 4;
                    }
                    childAt.setVisibility(i2);
                }
            }
        } else if (this.f3694n == null || this.f3687g == EnumC1927a.f3703b) {
            (C19263.f3701b[this.f3687g - 1] != 1 ? this.f3691k : this.f3692l).getChildAt(0).setVisibility(0);
        } else {
            this.f3693m.setVisibility(0);
            this.f3694n.start();
        }
    }

    /* renamed from: b */
    private void m3749b(MotionEvent motionEvent) {
        if (getFirstVisiblePosition() < getHeaderViewsCount() && getCount() > getHeaderViewsCount()) {
            this.f3685e = EnumC1929c.f3706a;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        if (!this.f3688h && firstVisiblePosition <= getHeaderViewsCount() && !this.f3696p) {
            this.f3696p = true;
            this.f3697q = (int) motionEvent.getY();
        }
        if (!this.f3682b) {
            this.f3681a = (float) ((int) motionEvent.getY());
            this.f3682b = true;
        }
        if (((int) motionEvent.getY()) - this.f3690j > 50) {
            m3748b();
        }
    }

    /* renamed from: a */
    public final AbstractC1928b mo34330a() {
        return this.f3683c;
    }

    /* renamed from: a */
    public final void mo34331a(int i) {
        this.f3686f = i;
    }

    /* renamed from: a */
    public final void mo34332a(AbstractC1928b bVar) {
        this.f3683c = bVar;
    }

    /* renamed from: b */
    public final void mo34333b(int i) {
        this.f3685e = EnumC1929c.f3706a;
        this.f3687g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (com.qiyukf.unicorn.C2452d.m5373e().isDefaultLoadMsg == false) goto L_0x0032;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34334c(int r6) {
        /*
            r5 = this;
            int r0 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1929c.f3707b
            r5.f3685e = r0
            int r0 = r5.f3687g
            int r1 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1927a.f3702a
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0035
            int r0 = r5.getCount()
            int r1 = r5.getHeaderViewsCount()
            int r1 = r1 + r6
            int r4 = r5.getFooterViewsCount()
            int r1 = r1 + r4
            if (r0 != r1) goto L_0x002e
            r0 = 20
            if (r6 < r0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r5.f3688h = r0
            com.qiyukf.unicorn.api.YSFOptions r0 = com.qiyukf.unicorn.C2452d.m5373e()
            boolean r0 = r0.isDefaultLoadMsg
            if (r0 != 0) goto L_0x003b
            goto L_0x0032
        L_0x002e:
            if (r6 <= 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            r5.f3688h = r2
            goto L_0x003b
        L_0x0035:
            if (r6 <= 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            r5.f3689i = r2
        L_0x003b:
            r5.m3748b()
            int r0 = r5.f3687g
            int r1 = com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.EnumC1927a.f3702a
            if (r0 != r1) goto L_0x0052
            int r0 = r5.getHeaderViewsCount()
            int r6 = r6 + r0
            boolean r0 = r5.f3688h
            if (r0 == 0) goto L_0x004f
            int r3 = r5.f3695o
        L_0x004f:
            r5.setSelectionFromTop(r6, r3)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.mo34334c(int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 11) {
            return m3746a(motionEvent);
        }
        try {
            return m3746a(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        throw new UnsupportedOperationException("Use addOnScrollListener instead!");
    }
}
