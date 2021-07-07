package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.C0082R;
import androidx.recyclerview.widget.ViewBoundsCheck;
import com.p118pd.sdk.AbstractC7098o00OOOo;
import com.p118pd.sdk.AbstractC7110o00Oo0O0;
import com.p118pd.sdk.C1699o0;
import com.p118pd.sdk.C7067o00O0o00;
import com.p118pd.sdk.C7086o00OO0OO;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7099o00OOOo0;
import com.p118pd.sdk.C7101o00OOoo;
import com.p118pd.sdk.C7113o00Oo0o0;
import com.p118pd.sdk.C7116o00OoO;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7257o0O000Oo;
import com.p118pd.sdk.C7262o0O000o;
import com.p118pd.sdk.C7282o0O00o00;
import com.p118pd.sdk.C7289o0O0O0Oo;
import com.p118pd.sdk.C7509o0OoOoOo;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.RunnableC7728o0ooOoOO;
import com.p118pd.sdk.oOO000OO;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.common.SocializeConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements AbstractC7110o00Oo0O0, AbstractC7098o00OOOo {
    public static final long OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Interpolator f14515OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Class<?>[] f14516OooO00o;
    public static final long OooO0O0 = Long.MAX_VALUE;
    public static final int[] OooO0o = {16843830};
    public static final int[] OooO0oO = {16842987};
    public static final boolean OooOOo = false;
    public static final boolean OooOOo0 = false;
    public static final boolean OooOOoo;
    public static final boolean OooOo = (Build.VERSION.SDK_INT <= 15);
    public static final boolean OooOo0 = (Build.VERSION.SDK_INT >= 16);
    public static final boolean OooOo00 = (Build.VERSION.SDK_INT >= 23);
    public static final boolean OooOo0O = (Build.VERSION.SDK_INT >= 21);
    public static final boolean OooOo0o = (Build.VERSION.SDK_INT <= 15);
    public static final boolean OooOoO0 = false;
    public static final int o0000 = 0;
    public static final int o00000 = 0;
    public static final String o000000 = "RV CreateView";
    public static final int o00000O = 1;
    public static final int o00000O0 = 1;
    public static final int o00000OO = -1;
    public static final int o00000Oo = -1;
    public static final int o00000o0 = 0;
    public static final int o00000oO = 2000;
    public static final int o00000oo = -1;
    public static final int o0000O00 = 1;
    public static final int o0000Ooo = 1;
    public static final int o0000oo = 2;
    public static final String o000OOo = "RV Nested Prefetch";
    public static final String o0O0O00 = "RV Prefetch";
    public static final String o0OO00O = "RV PartialInvalidate";
    public static final String o0OOO0o = "RV OnLayout";
    public static final String o0Oo0oo = "RV FullInvalidate";
    public static final String o0ooOOo = "RecyclerView";
    public static final String o0ooOoO = "RV Scroll";
    public static final String oo0o0Oo = "RV OnBindView";
    public boolean OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f14517OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RectF f14518OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f14519OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AccessibilityManager f14520OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EdgeEffect f14521OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public EdgeEffectFactory f14522OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ItemAnimator.OooO0O0 f14523OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ItemAnimator f14524OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5065OooO0oO f14525OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOO0 f14526OooO00o;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOOO0 f14527OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5069OooOOOo f14528OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5071OooOOo0 f14529OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5070OooOOo f14530OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooOo00 f14531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5073OooOo0 f14532OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5074OooOo0O f14533OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5077OooOoO0 f14534OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RunnableC5078OooOoOO f14535OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SavedState f14536OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7101o00OOoo f14537OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1699o0 f14538OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7282o0O00o00 f14539OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7289o0O0O0Oo.OooO0O0 f14540OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7289o0O0O0Oo f14541OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7509o0OoOoOo f14542OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RunnableC7728o0ooOoOO.OooO0O0 f14543OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RunnableC7728o0ooOoOO f14544OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f14545OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<AbstractC5067OooOO0o> f14546OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<OooOOOO> f14547OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f14548OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Rect f14549OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public EdgeEffect f14550OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Runnable f14551OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ArrayList<AbstractC5071OooOOo0> f14552OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<AbstractC5070OooOOo> f14553OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14554OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int[] f14555OooO0O0;
    public EdgeEffect OooO0OO;
    @VisibleForTesting

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final List<AbstractC5079OooOoo0> f14556OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f14557OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final int[] f14558OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public EdgeEffect f14559OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f14560OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final int[] f14561OooO0Oo;
    @VisibleForTesting

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f14562OooO0o;
    public float OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f14563OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public final int[] f14564OooO0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f14565OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;

    /* renamed from: o000000  reason: collision with other field name */
    public int f14566o000000;
    public final int o000000O;
    public final int o000000o;

    /* renamed from: o000OOo  reason: collision with other field name */
    public int f14567o000OOo;
    public int o00oO0O;

    /* renamed from: o0O0O00  reason: collision with other field name */
    public int f14568o0O0O00;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public int f14569o0OO00O;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public int f14570o0OOO0o;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public int f14571o0Oo0oo;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f14572o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f14573o0ooOoO;

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public int f14574oo0o0Oo;

    public static class EdgeEffectFactory {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;
        public static final int OooO0Oo = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect OooO00o(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {
        public static final int OooO00o = 2;
        public static final int OooO0O0 = 8;
        public static final int OooO0OO = 4;
        public static final int OooO0Oo = 2048;
        public static final int OooO0o0 = 4096;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f14575OooO00o = 120;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0 f14576OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<OooO00o> f14577OooO00o = new ArrayList<>();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f14578OooO0O0 = 120;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public long f14579OooO0OO = 250;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public long f14580OooO0Oo = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface OooO00o {
            void OooO00o();
        }

        public interface OooO0O0 {
            void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0);
        }

        public static class OooO0OO {
            public int OooO00o;
            public int OooO0O0;
            public int OooO0OO;
            public int OooO0Oo;
            public int OooO0o0;

            @NonNull
            public OooO0OO OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0) {
                return OooO00o(oooOoo0, 0);
            }

            @NonNull
            public OooO0OO OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, int i) {
                View view = oooOoo0.f14626OooO00o;
                this.OooO00o = view.getLeft();
                this.OooO0O0 = view.getTop();
                this.OooO0OO = view.getRight();
                this.OooO0Oo = view.getBottom();
                return this;
            }
        }

        public long OooO00o() {
            return this.f14575OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m14750OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14751OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0) {
            return true;
        }

        public abstract boolean OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, @Nullable OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull AbstractC5079OooOoo0 oooOoo02, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public long OooO0O0() {
            return this.f14580OooO0Oo;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public abstract void m14752OooO0O0();

        public abstract boolean OooO0O0(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull OooO0OO oooO0OO, @Nullable OooO0OO oooO0OO2);

        public long OooO0OO() {
            return this.f14579OooO0OO;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public abstract void m14753OooO0OO();

        public abstract void OooO0OO(@NonNull AbstractC5079OooOoo0 oooOoo0);

        public abstract boolean OooO0OO(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public long OooO0Oo() {
            return this.f14578OooO0O0;
        }

        public void OooO0Oo(@NonNull AbstractC5079OooOoo0 oooOoo0) {
        }

        public void OooO0o0(@NonNull AbstractC5079OooOoo0 oooOoo0) {
        }

        public void OooO00o(long j) {
            this.f14575OooO00o = j;
        }

        public void OooO0O0(long j) {
            this.f14580OooO0Oo = j;
        }

        public void OooO0OO(long j) {
            this.f14579OooO0OO = j;
        }

        public void OooO0Oo(long j) {
            this.f14578OooO0O0 = j;
        }

        public void OooO00o(OooO0O0 oooO0O0) {
            this.f14576OooO00o = oooO0O0;
        }

        public final void OooO0O0(@NonNull AbstractC5079OooOoo0 oooOoo0) {
            OooO0o0(oooOoo0);
        }

        @NonNull
        public OooO0OO OooO00o(@NonNull C5077OooOoO0 oooOoO0, @NonNull AbstractC5079OooOoo0 oooOoo0, int i, @NonNull List<Object> list) {
            return m14747OooO00o().OooO00o(oooOoo0);
        }

        @NonNull
        public OooO0OO OooO00o(@NonNull C5077OooOoO0 oooOoO0, @NonNull AbstractC5079OooOoo0 oooOoo0) {
            return m14747OooO00o().OooO00o(oooOoo0);
        }

        public static int OooO00o(AbstractC5079OooOoo0 oooOoo0) {
            int i = oooOoo0.OooO0o0 & 14;
            if (oooOoo0.m14851OooO0Oo()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int OooO0Oo2 = oooOoo0.OooO0Oo();
            int OooO00o2 = oooOoo0.OooO00o();
            return (OooO0Oo2 == -1 || OooO00o2 == -1 || OooO0Oo2 == OooO00o2) ? i : i | 2048;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m14749OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0) {
            OooO0Oo(oooOoo0);
            OooO0O0 oooO0O0 = this.f14576OooO00o;
            if (oooO0O0 != null) {
                oooO0O0.OooO00o(oooOoo0);
            }
        }

        public final boolean OooO00o(@Nullable OooO00o oooO00o) {
            boolean OooO00o2 = m14750OooO00o();
            if (oooO00o != null) {
                if (!OooO00o2) {
                    oooO00o.OooO00o();
                } else {
                    this.f14577OooO00o.add(oooO00o);
                }
            }
            return OooO00o2;
        }

        public boolean OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull List<Object> list) {
            return m14751OooO00o(oooOoo0);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m14748OooO00o() {
            int size = this.f14577OooO00o.size();
            for (int i = 0; i < size; i++) {
                this.f14577OooO00o.get(i).OooO00o();
            }
            this.f14577OooO00o.clear();
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m14747OooO00o() {
            return new OooO0OO();
        }
    }

    public static abstract class OooO {
        public void OooO00o() {
        }

        public void OooO00o(int i, int i2) {
        }

        public void OooO00o(int i, int i2, int i3) {
        }

        public void OooO00o(int i, int i2, @Nullable Object obj) {
            OooO00o(i, i2);
        }

        public void OooO0O0(int i, int i2) {
        }

        public void OooO0OO(int i, int i2) {
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f14562OooO0o && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f14557OooO0OO) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.OooO0oo) {
                    recyclerView2.f14565OooO0oO = true;
                } else {
                    recyclerView2.OooO0Oo();
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.f14524OooO00o;
            if (itemAnimator != null) {
                itemAnimator.m14753OooO0OO();
            }
            RecyclerView.this.OooOOOo = false;
        }
    }

    public static class OooO0OO implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0o implements C1699o0.OooO00o {
        public OooO0o() {
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public AbstractC5079OooOoo0 OooO00o(int i) {
            AbstractC5079OooOoo0 OooO00o2 = RecyclerView.this.OooO00o(i, true);
            if (OooO00o2 != null && !RecyclerView.this.f14542OooO00o.m19143OooO00o(OooO00o2.f14626OooO00o)) {
                return OooO00o2;
            }
            return null;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO0O0(C1699o0.OooO0O0 oooO0O0) {
            OooO0OO(oooO0O0);
        }

        public void OooO0OO(C1699o0.OooO0O0 oooO0O0) {
            int i = oooO0O0.OooO00o;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f14527OooO00o.m14779OooO00o(recyclerView, oooO0O0.OooO0O0, oooO0O0.OooO0OO);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f14527OooO00o.OooO0O0(recyclerView2, oooO0O0.OooO0O0, oooO0O0.OooO0OO);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f14527OooO00o.OooO00o(recyclerView3, oooO0O0.OooO0O0, oooO0O0.OooO0OO, oooO0O0.f19060OooO00o);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f14527OooO00o.OooO00o(recyclerView4, oooO0O0.OooO0O0, oooO0O0.OooO0OO, 1);
            }
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO0Oo(int i, int i2) {
            RecyclerView.this.OooO00o(i, i2, false);
            RecyclerView.this.OooOOO = true;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO0O0(int i, int i2) {
            RecyclerView.this.OooO0o(i, i2);
            RecyclerView.this.OooOOO = true;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO00o(int i, int i2) {
            RecyclerView.this.OooO00o(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.OooOOO = true;
            recyclerView.f14534OooO00o.OooO0OO += i2;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO00o(int i, int i2, Object obj) {
            RecyclerView.this.OooO00o(i, i2, obj);
            RecyclerView.this.OooOOOO = true;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO0OO(int i, int i2) {
            RecyclerView.this.OooO0o0(i, i2);
            RecyclerView.this.OooOOO = true;
        }

        @Override // com.p118pd.sdk.C1699o0.OooO00o
        public void OooO00o(C1699o0.OooO0O0 oooO0O0) {
            OooO0OO(oooO0O0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooO0oO  reason: case insensitive filesystem */
    public static abstract class AbstractC5065OooO0oO<VH extends AbstractC5079OooOoo0> {
        public final C5066OooO0oo OooO00o = new C5066OooO0oo();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14581OooO00o = false;

        public abstract int OooO00o();

        public int OooO00o(int i) {
            return 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public long m14757OooO00o(int i) {
            return -1;
        }

        public void OooO00o(@NonNull VH vh) {
        }

        public void OooO00o(@NonNull VH vh, int i, @NonNull List<Object> list) {
            OooO0O0(vh, i);
        }

        public void OooO00o(@NonNull RecyclerView recyclerView) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14761OooO00o(@NonNull VH vh) {
            return false;
        }

        @NonNull
        public abstract VH OooO0O0(@NonNull ViewGroup viewGroup, int i);

        public void OooO0O0(@NonNull VH vh) {
        }

        public abstract void OooO0O0(@NonNull VH vh, int i);

        public void OooO0O0(@NonNull RecyclerView recyclerView) {
        }

        public final boolean OooO0O0() {
            return this.f14581OooO00o;
        }

        public final void OooO0OO(int i, int i2) {
            this.OooO00o.OooO0OO(i, i2);
        }

        public void OooO0OO(@NonNull VH vh) {
        }

        public final void OooO0Oo(int i, int i2) {
            this.OooO00o.OooO0Oo(i, i2);
        }

        @NonNull
        public final VH OooO00o(@NonNull ViewGroup viewGroup, int i) {
            try {
                C7067o00O0o00.OooO00o(RecyclerView.o000000);
                VH OooO0O0 = OooO0O0(viewGroup, i);
                if (OooO0O0.f14626OooO00o.getParent() == null) {
                    OooO0O0.f14635OooO0OO = i;
                    return OooO0O0;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C7067o00O0o00.OooO00o();
            }
        }

        public void OooO0O0(@NonNull OooO oooO) {
            this.OooO00o.unregisterObserver(oooO);
        }

        public final void OooO0OO(int i) {
            this.OooO00o.OooO0Oo(i, 1);
        }

        public final void OooO0O0(int i, int i2) {
            this.OooO00o.OooO0O0(i, i2);
        }

        public final void OooO0O0(int i) {
            this.OooO00o.OooO0OO(i, 1);
        }

        public final void OooO00o(@NonNull VH vh, int i) {
            vh.OooO00o = i;
            if (OooO0O0()) {
                vh.f14625OooO00o = m14757OooO00o(i);
            }
            vh.OooO00o(1, 519);
            C7067o00O0o00.OooO00o(RecyclerView.oo0o0Oo);
            OooO00o(vh, i, vh.m14842OooO00o());
            vh.m14846OooO0O0();
            ViewGroup.LayoutParams layoutParams = vh.f14626OooO00o.getLayoutParams();
            if (layoutParams instanceof OooOOO) {
                ((OooOOO) layoutParams).f14583OooO00o = true;
            }
            C7067o00O0o00.OooO00o();
        }

        public void OooO00o(boolean z) {
            if (!m14760OooO00o()) {
                this.f14581OooO00o = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final boolean m14760OooO00o() {
            return this.OooO00o.m14762OooO00o();
        }

        public void OooO00o(@NonNull OooO oooO) {
            this.OooO00o.registerObserver(oooO);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m14758OooO00o() {
            this.OooO00o.OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m14759OooO00o(int i) {
            this.OooO00o.OooO0O0(i, 1);
        }

        public final void OooO00o(int i, @Nullable Object obj) {
            this.OooO00o.OooO00o(i, 1, obj);
        }

        public final void OooO00o(int i, int i2, @Nullable Object obj) {
            this.OooO00o.OooO00o(i, i2, obj);
        }

        public final void OooO00o(int i, int i2) {
            this.OooO00o.OooO00o(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooO0oo  reason: case insensitive filesystem */
    public static class C5066OooO0oo extends Observable<OooO> {
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14762OooO00o() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void OooO0O0(int i, int i2) {
            OooO00o(i, i2, null);
        }

        public void OooO0OO(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).OooO0O0(i, i2);
            }
        }

        public void OooO0Oo(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).OooO0OO(i, i2);
            }
        }

        public void OooO00o() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).OooO00o();
            }
        }

        public void OooO00o(int i, int i2, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).OooO00o(i, i2, obj);
            }
        }

        public void OooO00o(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).OooO00o(i, i2, 1);
            }
        }
    }

    public interface OooOO0 {
        int OooO00o(int i, int i2);
    }

    public class OooOO0O implements ItemAnimator.OooO0O0 {
        public OooOO0O() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.OooO0O0
        public void OooO00o(AbstractC5079OooOoo0 oooOoo0) {
            oooOoo0.OooO00o(true);
            if (oooOoo0.f14628OooO00o != null && oooOoo0.f14633OooO0O0 == null) {
                oooOoo0.f14628OooO00o = null;
            }
            oooOoo0.f14633OooO0O0 = null;
            if (!oooOoo0.OooOO0O() && !RecyclerView.this.m14729OooO00o(oooOoo0.f14626OooO00o) && oooOoo0.m14856OooO0oo()) {
                RecyclerView.this.removeDetachedView(oooOoo0.f14626OooO00o, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOO0o  reason: case insensitive filesystem */
    public static abstract class AbstractC5067OooOO0o {
        @Deprecated
        public void OooO00o(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void OooO00o(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C5077OooOoO0 oooOoO0) {
            OooO00o(canvas, recyclerView);
        }

        @Deprecated
        public void OooO0O0(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void OooO0O0(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C5077OooOoO0 oooOoO0) {
            OooO0O0(canvas, recyclerView);
        }

        @Deprecated
        public void OooO00o(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void OooO00o(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull C5077OooOoO0 oooOoO0) {
            OooO00o(rect, ((OooOOO) view.getLayoutParams()).OooO0O0(), recyclerView);
        }
    }

    public static class OooOOO extends ViewGroup.MarginLayoutParams {
        public final Rect OooO00o = new Rect();

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5079OooOoo0 f14582OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14583OooO00o = true;
        public boolean OooO0O0 = false;

        public OooOOO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14763OooO00o() {
            return this.f14582OooO00o.m14840OooO();
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14764OooO0O0() {
            return this.f14582OooO00o.m14852OooO0o();
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14765OooO0OO() {
            return this.f14582OooO00o.m14851OooO0Oo();
        }

        public boolean OooO0Oo() {
            return this.f14582OooO00o.OooOO0();
        }

        public int OooO00o() {
            return this.f14582OooO00o.OooO00o();
        }

        public int OooO0O0() {
            return this.f14582OooO00o.OooO0OO();
        }

        @Deprecated
        public int OooO0OO() {
            return this.f14582OooO00o.OooO0o0();
        }

        public OooOOO(int i, int i2) {
            super(i, i2);
        }

        public OooOOO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public OooOOO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooOOO(OooOOO oooOOO) {
            super((ViewGroup.LayoutParams) oooOOO);
        }
    }

    public static abstract class OooOOO0 {
        public int OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooOo f14584OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView f14585OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ViewBoundsCheck.OooO0O0 f14586OooO00o = new OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public ViewBoundsCheck f14587OooO00o = new ViewBoundsCheck(this.f14586OooO00o);

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7509o0OoOoOo f14588OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14589OooO00o = false;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final ViewBoundsCheck.OooO0O0 f14590OooO0O0 = new OooO0O0();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ViewBoundsCheck f14591OooO0O0 = new ViewBoundsCheck(this.f14590OooO0O0);

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14592OooO0O0 = false;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f14593OooO0OO = false;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f14594OooO0Oo = true;
        public boolean OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f14595OooO0o0 = true;

        public class OooO00o implements ViewBoundsCheck.OooO0O0 {
            public OooO00o() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0, androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public View m14806OooO00o() {
                return OooOOO0.this.f14585OooO00o;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO0O0() {
                return OooOOO0.this.OooOOOO() - OooOOO0.this.OooOO0o();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int getChildCount() {
                return OooOOO0.this.OooO0O0();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public View OooO00o(int i) {
                return OooOOO0.this.OooO0O0(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO0O0(View view) {
                return OooOOO0.this.OooO0OO(view) - ((ViewGroup.MarginLayoutParams) ((OooOOO) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0, androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO00o() {
                return OooOOO0.this.OooOO0O();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO00o(View view) {
                return OooOOO0.this.OooO0o(view) + ((ViewGroup.MarginLayoutParams) ((OooOOO) view.getLayoutParams())).rightMargin;
            }
        }

        public class OooO0O0 implements ViewBoundsCheck.OooO0O0 {
            public OooO0O0() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0, androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public View m14807OooO00o() {
                return OooOOO0.this.f14585OooO00o;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO0O0() {
                return OooOOO0.this.OooO0OO() - OooOOO0.this.OooO();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int getChildCount() {
                return OooOOO0.this.OooO0O0();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public View OooO00o(int i) {
                return OooOOO0.this.OooO0O0(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0, androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO00o() {
                return OooOOO0.this.OooOOO();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO0O0(View view) {
                return OooOOO0.this.OooO0oO(view) - ((ViewGroup.MarginLayoutParams) ((OooOOO) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public int OooO00o(View view) {
                return OooOOO0.this.OooO0O0(view) + ((ViewGroup.MarginLayoutParams) ((OooOOO) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface OooO0OO {
            void OooO00o(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOO0$OooO0Oo  reason: case insensitive filesystem */
        public static class C5068OooO0Oo {
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f14596OooO00o;
            public int OooO0O0;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public boolean f14597OooO0O0;
        }

        /* renamed from: OooO  reason: collision with other method in class */
        public final boolean m14768OooO() {
            return this.f14595OooO0o0;
        }

        public int OooO00o() {
            return -1;
        }

        public int OooO00o(int i, OooOo00 oooOo00, C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public int OooO00o(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Parcelable m14769OooO00o() {
            return null;
        }

        @Nullable
        public View OooO00o(@NonNull View view, int i) {
            return null;
        }

        @Nullable
        public View OooO00o(@NonNull View view, int i, @NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0) {
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract OooOOO m14772OooO00o();

        public void OooO00o(int i, int i2, C5077OooOoO0 oooOoO0, OooO0OO oooO0OO) {
        }

        public void OooO00o(int i, OooO0OO oooO0OO) {
        }

        public void OooO00o(Rect rect, int i, int i2) {
            OooO0OO(OooO00o(i, rect.width() + OooOO0O() + OooOO0o(), OooO0oo()), OooO00o(i2, rect.height() + OooOOO() + OooO(), OooO0oO()));
        }

        public void OooO00o(Parcelable parcelable) {
        }

        public void OooO00o(@Nullable AbstractC5065OooO0oO oooO0oO, @Nullable AbstractC5065OooO0oO oooO0oO2) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14777OooO00o(OooOo00 oooOo00, C5077OooOoO0 oooOoO0) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14778OooO00o(C5077OooOoO0 oooOoO0) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14779OooO00o(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void OooO00o(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void OooO00o(RecyclerView recyclerView, C5077OooOoO0 oooOoO0, int i) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14780OooO00o() {
            return false;
        }

        public boolean OooO00o(OooOOO oooOOO) {
            return oooOOO != null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14781OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0) {
            return false;
        }

        public boolean OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public boolean OooO00o(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public int OooO0O0(int i, OooOo00 oooOo00, C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public int OooO0O0(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public void OooO0O0(int i, int i2) {
            this.OooO0Oo = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.OooO0O0 = mode;
            if (mode == 0 && !RecyclerView.OooOo00) {
                this.OooO0Oo = 0;
            }
            this.OooO0o0 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.OooO0OO = mode2;
            if (mode2 == 0 && !RecyclerView.OooOo00) {
                this.OooO0o0 = 0;
            }
        }

        @CallSuper
        public void OooO0O0(RecyclerView recyclerView) {
        }

        public void OooO0O0(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14787OooO0O0() {
            return false;
        }

        public int OooO0OO(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public int OooO0OO(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        @Deprecated
        public void OooO0OO(RecyclerView recyclerView) {
        }

        public void OooO0OO(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14790OooO0OO() {
            RecyclerView recyclerView = this.f14585OooO00o;
            return recyclerView != null && recyclerView.f14554OooO0O0;
        }

        public int OooO0Oo(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public void OooO0Oo(int i) {
        }

        public void OooO0Oo(int i, int i2) {
            int OooO0O02 = OooO0O0();
            if (OooO0O02 == 0) {
                this.f14585OooO00o.m14738OooO0OO(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < OooO0O02; i7++) {
                View OooO0O03 = OooO0O0(i7);
                Rect rect = this.f14585OooO00o.f14517OooO00o;
                OooO0O0(OooO0O03, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f14585OooO00o.f14517OooO00o.set(i5, i6, i3, i4);
            OooO00o(this.f14585OooO00o.f14517OooO00o, i, i2);
        }

        public void OooO0Oo(@NonNull RecyclerView recyclerView) {
        }

        public int OooO0o(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        public void OooO0o(int i) {
        }

        public void OooO0o(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f14585OooO00o = null;
                this.f14588OooO00o = null;
                this.OooO0Oo = 0;
                this.OooO0o0 = 0;
            } else {
                this.f14585OooO00o = recyclerView;
                this.f14588OooO00o = recyclerView.f14542OooO00o;
                this.OooO0Oo = recyclerView.getWidth();
                this.OooO0o0 = recyclerView.getHeight();
            }
            this.OooO0O0 = 1073741824;
            this.OooO0OO = 1073741824;
        }

        public int OooO0o0(@NonNull C5077OooOoO0 oooOoO0) {
            return 0;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public void m14796OooO0o0(View view) {
            ItemAnimator itemAnimator = this.f14585OooO00o.f14524OooO00o;
            if (itemAnimator != null) {
                itemAnimator.OooO0OO(RecyclerView.OooO0OO(view));
            }
        }

        /* renamed from: OooO0oO  reason: collision with other method in class */
        public boolean m14799OooO0oO() {
            return this.f14593OooO0OO;
        }

        /* renamed from: OooO0oo  reason: collision with other method in class */
        public void m14800OooO0oo(View view) {
            this.f14588OooO00o.OooO0O0(view);
        }

        public int OooOO0(@NonNull View view) {
            return ((OooOOO) view.getLayoutParams()).OooO0O0();
        }

        /* renamed from: OooOO0O  reason: collision with other method in class */
        public boolean m14803OooOO0O() {
            OooOo oooOo = this.f14584OooO00o;
            return oooOo != null && oooOo.m14819OooO0O0();
        }

        @AbstractC0032Px
        public int OooOO0o() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: OooOO0o  reason: collision with other method in class */
        public boolean m14804OooOO0o() {
            return false;
        }

        @AbstractC0032Px
        public int OooOOO() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @AbstractC0032Px
        public int OooOOO0() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return ViewCompat.m14615OooOOOO((View) recyclerView);
            }
            return 0;
        }

        /* renamed from: OooOOO0  reason: collision with other method in class */
        public boolean m14805OooOOO0() {
            return false;
        }

        @AbstractC0032Px
        public int OooOOOO() {
            return this.OooO0Oo;
        }

        public int OooOOOo() {
            return this.OooO0O0;
        }

        @AbstractC0032Px
        public int OooO() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void OooO0OO(@NonNull View view, int i) {
            OooO00o(view, i, (OooOOO) view.getLayoutParams());
        }

        /* renamed from: OooO0oO  reason: collision with other method in class */
        public void m14798OooO0oO(@NonNull View view) {
            this.f14585OooO00o.removeDetachedView(view, false);
        }

        public int OooO0oo(@NonNull View view) {
            return RecyclerView.OooO0OO(view).OooO0O0();
        }

        @AbstractC0032Px
        public int OooOO0() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return ViewCompat.m14611OooOOO((View) recyclerView);
            }
            return 0;
        }

        @AbstractC0032Px
        public int OooOO0O() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int OooOO0o(@NonNull View view) {
            return ((OooOOO) view.getLayoutParams()).OooO00o.top;
        }

        /* renamed from: OooO  reason: collision with other method in class */
        public void m14767OooO(@NonNull View view) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            OooO0OO2.OooO0oO();
            OooO0OO2.m14853OooO0o0();
            OooO0OO2.OooO00o(4);
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m14789OooO0OO(@NonNull View view) {
            OooO0OO(view, -1);
        }

        public void OooO0o0(int i) {
            if (OooO0O0(i) != null) {
                this.f14588OooO00o.m19144OooO0O0(i);
            }
        }

        public int OooO0oO(@NonNull View view) {
            return view.getTop() - OooOO0o(view);
        }

        /* renamed from: OooO0oo  reason: collision with other method in class */
        public boolean m14801OooO0oo() {
            RecyclerView recyclerView = this.f14585OooO00o;
            return recyclerView != null && recyclerView.isFocused();
        }

        /* renamed from: OooOO0  reason: collision with other method in class */
        public boolean m14802OooOO0() {
            return this.f14594OooO0Oo;
        }

        public int OooOO0O(@NonNull View view) {
            return ((OooOOO) view.getLayoutParams()).OooO00o.right;
        }

        @AbstractC0032Px
        public int OooO0OO() {
            return this.OooO0o0;
        }

        @AbstractC0032Px
        public int OooO0oO() {
            return ViewCompat.m14605OooOO0((View) this.f14585OooO00o);
        }

        @AbstractC0032Px
        public int OooO0oo() {
            return ViewCompat.m14607OooOO0O((View) this.f14585OooO00o);
        }

        public void OooO0OO(@AbstractC0032Px int i) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                recyclerView.OooO0o0(i);
            }
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public boolean m14797OooO0o0() {
            RecyclerView recyclerView = this.f14585OooO00o;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void OooO00o(String str) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                recyclerView.OooO00o(str);
            }
        }

        public int OooO0o0() {
            RecyclerView recyclerView = this.f14585OooO00o;
            AbstractC5065OooO0oO adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.OooO00o();
            }
            return 0;
        }

        public int OooO(@NonNull View view) {
            return ((OooOOO) view.getLayoutParams()).OooO00o.left;
        }

        public void OooO0OO(OooOo00 oooOo00) {
            int OooO00o2 = oooOo00.OooO00o();
            for (int i = OooO00o2 - 1; i >= 0; i--) {
                View OooO00o3 = oooOo00.m14823OooO00o(i);
                AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(OooO00o3);
                if (!OooO0OO2.OooOO0o()) {
                    OooO0OO2.OooO00o(false);
                    if (OooO0OO2.m14856OooO0oo()) {
                        this.f14585OooO00o.removeDetachedView(OooO00o3, false);
                    }
                    ItemAnimator itemAnimator = this.f14585OooO00o.f14524OooO00o;
                    if (itemAnimator != null) {
                        itemAnimator.OooO0OO(OooO0OO2);
                    }
                    OooO0OO2.OooO00o(true);
                    oooOo00.OooO00o(OooO00o3);
                }
            }
            oooOo00.OooO0OO();
            if (OooO00o2 > 0) {
                this.f14585OooO00o.invalidate();
            }
        }

        public static int OooO00o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public int OooO0o0(@NonNull View view) {
            Rect rect = ((OooOOO) view.getLayoutParams()).OooO00o;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14784OooO0O0() {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void OooO0o0(RecyclerView recyclerView) {
            OooO0O0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void OooO0O0(String str) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                recyclerView.OooO0O0(str);
            }
        }

        /* renamed from: OooO0o  reason: collision with other method in class */
        public boolean m14795OooO0o() {
            return this.f14592OooO0O0;
        }

        @Deprecated
        public void OooO00o(boolean z) {
            this.f14593OooO0OO = z;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public void m14792OooO0Oo(@NonNull View view) {
            int OooO00o2 = this.f14588OooO00o.OooO00o(view);
            if (OooO00o2 >= 0) {
                OooO00o(OooO00o2, view);
            }
        }

        public int OooO0o() {
            return ViewCompat.m14593OooO0o((View) this.f14585OooO00o);
        }

        public void OooO00o(RecyclerView recyclerView) {
            this.f14592OooO0O0 = true;
            OooO0O0(recyclerView);
        }

        public final void OooO0O0(boolean z) {
            if (z != this.f14595OooO0o0) {
                this.f14595OooO0o0 = z;
                this.OooO00o = 0;
                RecyclerView recyclerView = this.f14585OooO00o;
                if (recyclerView != null) {
                    recyclerView.f14531OooO00o.OooO0oO();
                }
            }
        }

        /* renamed from: OooO0o  reason: collision with other method in class */
        public void m14794OooO0o(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f14585OooO00o;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f14585OooO00o.m14722OooO00o());
            }
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            OooO0OO2.OooO00o(128);
            this.f14585OooO00o.f14541OooO00o.OooO0Oo(OooO0OO2);
        }

        public int OooO0Oo() {
            return this.OooO0OO;
        }

        public void OooO00o(RecyclerView recyclerView, OooOo00 oooOo00) {
            this.f14592OooO0O0 = false;
            OooO0O0(recyclerView, oooOo00);
        }

        public int OooO0Oo(@NonNull View view) {
            Rect rect = ((OooOOO) view.getLayoutParams()).OooO00o;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void OooO00o(Runnable runnable) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                ViewCompat.OooO00o(recyclerView, runnable);
            }
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public void m14791OooO0Oo() {
            OooOo oooOo = this.f14584OooO00o;
            if (oooOo != null) {
                oooOo.OooO0OO();
            }
        }

        @CallSuper
        public void OooO0O0(RecyclerView recyclerView, OooOo00 oooOo00) {
            OooO0OO(recyclerView);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14783OooO00o(Runnable runnable) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void OooO0O0(OooOo oooOo) {
            OooOo oooOo2 = this.f14584OooO00o;
            if (!(oooOo2 == null || oooOo == oooOo2 || !oooOo2.m14819OooO0O0())) {
                this.f14584OooO00o.OooO0OO();
            }
            this.f14584OooO00o = oooOo;
            oooOo.OooO00o(this.f14585OooO00o, this);
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public boolean m14793OooO0Oo() {
            int OooO0O02 = OooO0O0();
            for (int i = 0; i < OooO0O02; i++) {
                ViewGroup.LayoutParams layoutParams = OooO0O0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public int OooO0o(@NonNull View view) {
            return view.getRight() + OooOO0O(view);
        }

        public void OooO0OO(boolean z) {
            this.f14594OooO0Oo = z;
        }

        public OooOOO OooO00o(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof OooOOO) {
                return new OooOOO((OooOOO) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new OooOOO((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new OooOOO(layoutParams);
        }

        public int OooO0OO(@NonNull View view) {
            return view.getLeft() - OooO(view);
        }

        public void OooO0OO(int i, int i2) {
            this.f14585OooO00o.setMeasuredDimension(i, i2);
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m14788OooO0OO() {
            this.f14589OooO00o = true;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14786OooO0O0(View view) {
            OooO0O0(view, -1);
        }

        public void OooO0O0(View view, int i) {
            OooO00o(view, i, false);
        }

        public OooOOO OooO00o(Context context, AttributeSet attributeSet) {
            return new OooOOO(context, attributeSet);
        }

        public void OooO0O0(@NonNull View view, @NonNull OooOo00 oooOo00) {
            m14800OooO0oo(view);
            oooOo00.OooO0O0(view);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14775OooO00o(View view) {
            m14776OooO00o(view, -1);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14776OooO00o(View view, int i) {
            OooO00o(view, i, true);
        }

        public void OooO0O0(int i, @NonNull OooOo00 oooOo00) {
            View OooO0O02 = OooO0O0(i);
            OooO0o0(i);
            oooOo00.OooO0O0(OooO0O02);
        }

        private void OooO00o(View view, int i, boolean z) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (z || OooO0OO2.m14852OooO0o()) {
                this.f14585OooO00o.f14541OooO00o.m18790OooO00o(OooO0OO2);
            } else {
                this.f14585OooO00o.f14541OooO00o.OooO0OO(OooO0OO2);
            }
            OooOOO oooOOO = (OooOOO) view.getLayoutParams();
            if (OooO0OO2.OooOOO0() || OooO0OO2.m14855OooO0oO()) {
                if (OooO0OO2.m14855OooO0oO()) {
                    OooO0OO2.OooO0oo();
                } else {
                    OooO0OO2.m14848OooO0OO();
                }
                this.f14588OooO00o.OooO00o(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f14585OooO00o) {
                int OooO00o2 = this.f14588OooO00o.OooO00o(view);
                if (i == -1) {
                    i = this.f14588OooO00o.OooO00o();
                }
                if (OooO00o2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f14585OooO00o.indexOfChild(view) + this.f14585OooO00o.m14722OooO00o());
                } else if (OooO00o2 != i) {
                    this.f14585OooO00o.f14527OooO00o.OooO00o(OooO00o2, i);
                }
            } else {
                this.f14588OooO00o.OooO00o(view, i, false);
                oooOOO.f14583OooO00o = true;
                OooOo oooOo = this.f14584OooO00o;
                if (oooOo != null && oooOo.m14819OooO0O0()) {
                    this.f14584OooO00o.m14816OooO00o(view);
                }
            }
            if (oooOOO.OooO0O0) {
                OooO0OO2.f14626OooO00o.invalidate();
                oooOOO.OooO0O0 = false;
            }
        }

        public int OooO0O0() {
            C7509o0OoOoOo o0oooooo = this.f14588OooO00o;
            if (o0oooooo != null) {
                return o0oooooo.OooO00o();
            }
            return 0;
        }

        @Nullable
        public View OooO0O0(int i) {
            C7509o0OoOoOo o0oooooo = this.f14588OooO00o;
            if (o0oooooo != null) {
                return o0oooooo.OooO0O0(i);
            }
            return null;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14785OooO0O0(@AbstractC0032Px int i) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null) {
                recyclerView.OooO0Oo(i);
            }
        }

        public boolean OooO0O0(View view, int i, int i2, OooOOO oooOOO) {
            return !this.f14594OooO0Oo || !m14766OooO00o(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) oooOOO).width) || !m14766OooO00o(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) oooOOO).height);
        }

        public void OooO0O0(@NonNull View view, int i, int i2) {
            OooOOO oooOOO = (OooOOO) view.getLayoutParams();
            Rect OooO00o2 = this.f14585OooO00o.m14718OooO00o(view);
            int i3 = i + OooO00o2.left + OooO00o2.right;
            int i4 = i2 + OooO00o2.top + OooO00o2.bottom;
            int OooO00o3 = OooO00o(OooOOOO(), OooOOOo(), OooOO0O() + OooOO0o() + ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin + ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin + i3, ((ViewGroup.MarginLayoutParams) oooOOO).width, m14780OooO00o());
            int OooO00o4 = OooO00o(OooO0OO(), OooO0Oo(), OooOOO() + OooO() + ((ViewGroup.MarginLayoutParams) oooOOO).topMargin + ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) oooOOO).height, m14787OooO0O0());
            if (OooO00o(view, OooO00o3, OooO00o4, oooOOO)) {
                view.measure(OooO00o3, OooO00o4);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14773OooO00o() {
            for (int OooO0O02 = OooO0O0() - 1; OooO0O02 >= 0; OooO0O02--) {
                this.f14588OooO00o.m19144OooO0O0(OooO0O02);
            }
        }

        public void OooO0O0(@NonNull View view, int i, int i2, int i3, int i4) {
            OooOOO oooOOO = (OooOOO) view.getLayoutParams();
            Rect rect = oooOOO.OooO00o;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) oooOOO).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin);
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m14771OooO00o(@NonNull View view) {
            View OooO00o2;
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView == null || (OooO00o2 = recyclerView.m14719OooO00o(view)) == null || this.f14588OooO00o.m19143OooO00o(OooO00o2)) {
                return null;
            }
            return OooO00o2;
        }

        public void OooO0O0(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.OooO0O0(view, rect);
        }

        public int OooO0O0(@NonNull View view) {
            return view.getBottom() + OooO00o(view);
        }

        @Nullable
        public View OooO00o(int i) {
            int OooO0O02 = OooO0O0();
            for (int i2 = 0; i2 < OooO0O02; i2++) {
                View OooO0O03 = OooO0O0(i2);
                AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(OooO0O03);
                if (OooO0OO2 != null && OooO0OO2.OooO0OO() == i && !OooO0OO2.OooOO0o() && (this.f14585OooO00o.f14534OooO00o.m14838OooO0Oo() || !OooO0OO2.m14852OooO0o())) {
                    return OooO0O03;
                }
            }
            return null;
        }

        public void OooO0O0(@NonNull OooOo00 oooOo00) {
            for (int OooO0O02 = OooO0O0() - 1; OooO0O02 >= 0; OooO0O02--) {
                if (!RecyclerView.OooO0OO(OooO0O0(OooO0O02)).OooOO0o()) {
                    OooO0O0(OooO0O02, oooOo00);
                }
            }
        }

        public int OooO0O0(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView == null || recyclerView.f14525OooO00o == null || !m14787OooO0O0()) {
                return 1;
            }
            return this.f14585OooO00o.f14525OooO00o.OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14774OooO00o(int i) {
            OooO00o(i, OooO0O0(i));
        }

        private void OooO00o(int i, @NonNull View view) {
            this.f14588OooO00o.m19141OooO00o(i);
        }

        public void OooO00o(@NonNull View view, int i, OooOOO oooOOO) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (OooO0OO2.m14852OooO0o()) {
                this.f14585OooO00o.f14541OooO00o.m18790OooO00o(OooO0OO2);
            } else {
                this.f14585OooO00o.f14541OooO00o.OooO0OO(OooO0OO2);
            }
            this.f14588OooO00o.OooO00o(view, i, oooOOO, OooO0OO2.m14852OooO0o());
        }

        public void OooO00o(int i, int i2) {
            View OooO0O02 = OooO0O0(i);
            if (OooO0O02 != null) {
                m14774OooO00o(i);
                OooO0OO(OooO0O02, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f14585OooO00o.toString());
        }

        public void OooO00o(@NonNull View view, @NonNull OooOo00 oooOo00) {
            OooO00o(oooOo00, this.f14588OooO00o.OooO00o(view), view);
        }

        public void OooO00o(int i, @NonNull OooOo00 oooOo00) {
            OooO00o(oooOo00, i, OooO0O0(i));
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m14770OooO00o() {
            View focusedChild;
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f14588OooO00o.m19143OooO00o(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void OooO00o(@NonNull OooOo00 oooOo00) {
            for (int OooO0O02 = OooO0O0() - 1; OooO0O02 >= 0; OooO0O02--) {
                OooO00o(oooOo00, OooO0O02, OooO0O0(OooO0O02));
            }
        }

        private void OooO00o(OooOo00 oooOo00, int i, View view) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (!OooO0OO2.OooOO0o()) {
                if (!OooO0OO2.m14851OooO0Oo() || OooO0OO2.m14852OooO0o() || this.f14585OooO00o.f14525OooO00o.OooO0O0()) {
                    m14774OooO00o(i);
                    oooOo00.OooO0Oo(view);
                    this.f14585OooO00o.f14541OooO00o.m18792OooO0O0(OooO0OO2);
                    return;
                }
                OooO0o0(i);
                oooOo00.OooO0O0(OooO0OO2);
            }
        }

        public void OooO00o(@NonNull View view, int i, int i2) {
            OooOOO oooOOO = (OooOOO) view.getLayoutParams();
            Rect OooO00o2 = this.f14585OooO00o.m14718OooO00o(view);
            int i3 = i + OooO00o2.left + OooO00o2.right;
            int i4 = i2 + OooO00o2.top + OooO00o2.bottom;
            int OooO00o3 = OooO00o(OooOOOO(), OooOOOo(), OooOO0O() + OooOO0o() + i3, ((ViewGroup.MarginLayoutParams) oooOOO).width, m14780OooO00o());
            int OooO00o4 = OooO00o(OooO0OO(), OooO0Oo(), OooOOO() + OooO() + i4, ((ViewGroup.MarginLayoutParams) oooOOO).height, m14787OooO0O0());
            if (OooO00o(view, OooO00o3, OooO00o4, oooOOO)) {
                view.measure(OooO00o3, OooO00o4);
            }
        }

        public boolean OooO00o(View view, int i, int i2, OooOOO oooOOO) {
            return view.isLayoutRequested() || !this.f14594OooO0Oo || !m14766OooO00o(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) oooOOO).width) || !m14766OooO00o(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) oooOOO).height);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public static boolean m14766OooO00o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int OooO00o(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOOO0.OooO00o(int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int OooO00o(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOOO0.OooO00o(int, int, int, int, boolean):int");
        }

        public void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((OooOOO) view.getLayoutParams()).OooO00o;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void OooO00o(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((OooOOO) view.getLayoutParams()).OooO00o;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f14585OooO00o == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f14585OooO00o.f14518OooO00o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void OooO00o(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m14718OooO00o(view));
            }
        }

        public int OooO00o(@NonNull View view) {
            return ((OooOOO) view.getLayoutParams()).OooO00o.bottom;
        }

        private int[] OooO00o(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int OooOO0O = OooOO0O();
            int OooOOO = OooOOO();
            int OooOOOO = OooOOOO() - OooOO0o();
            int OooO0OO2 = OooO0OO() - OooO();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - OooOO0O;
            int min = Math.min(0, i);
            int i2 = top - OooOOO;
            int min2 = Math.min(0, i2);
            int i3 = width - OooOOOO;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - OooO0OO2);
            if (OooO0o() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14782OooO00o(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return OooO00o(recyclerView, view, rect, z, false);
        }

        public boolean OooO00o(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] OooO00o2 = OooO00o(recyclerView, view, rect, z);
            int i = OooO00o2[0];
            int i2 = OooO00o2[1];
            if ((z2 && !OooO00o(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.OooO0oo(i, i2);
            }
            return true;
        }

        public boolean OooO00o(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.f14587OooO00o.OooO00o(view, SocializeConstants.AUTH_EVENT) && this.f14591OooO0O0.OooO00o(view, SocializeConstants.AUTH_EVENT);
            return z ? z3 : !z3;
        }

        private boolean OooO00o(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int OooOO0O = OooOO0O();
            int OooOOO = OooOOO();
            int OooOOOO = OooOOOO() - OooOO0o();
            int OooO0OO2 = OooO0OO() - OooO();
            Rect rect = this.f14585OooO00o.f14517OooO00o;
            OooO0O0(focusedChild, rect);
            if (rect.left - i >= OooOOOO || rect.right - i <= OooOO0O || rect.top - i2 >= OooO0OO2 || rect.bottom - i2 <= OooOOO) {
                return false;
            }
            return true;
        }

        @Deprecated
        public boolean OooO00o(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return m14803OooOO0O() || recyclerView.m14744OooO0o0();
        }

        public boolean OooO00o(@NonNull RecyclerView recyclerView, @NonNull C5077OooOoO0 oooOoO0, @NonNull View view, @Nullable View view2) {
            return OooO00o(recyclerView, view, view2);
        }

        public void OooO00o(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            OooO0OO(recyclerView, i, i2);
        }

        public void OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0, int i, int i2) {
            this.f14585OooO00o.m14738OooO0OO(i, i2);
        }

        public void OooO00o(OooOo oooOo) {
            if (this.f14584OooO00o == oooOo) {
                this.f14584OooO00o = null;
            }
        }

        public void OooO00o(C7120o00OoOO o00oooo) {
            RecyclerView recyclerView = this.f14585OooO00o;
            OooO00o(recyclerView.f14531OooO00o, recyclerView.f14534OooO00o, o00oooo);
        }

        public void OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0, @NonNull C7120o00OoOO o00oooo) {
            if (this.f14585OooO00o.canScrollVertically(-1) || this.f14585OooO00o.canScrollHorizontally(-1)) {
                o00oooo.m18416OooO00o(8192);
                o00oooo.OooOOoo(true);
            }
            if (this.f14585OooO00o.canScrollVertically(1) || this.f14585OooO00o.canScrollHorizontally(1)) {
                o00oooo.m18416OooO00o(4096);
                o00oooo.OooOOoo(true);
            }
            o00oooo.m18419OooO00o((Object) C7120o00OoOO.OooO0O0.OooO00o(OooO0O0(oooOo00, oooOoO0), OooO00o(oooOo00, oooOoO0), m14781OooO00o(oooOo00, oooOoO0), OooO0OO(oooOo00, oooOoO0)));
        }

        public void OooO00o(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f14585OooO00o;
            OooO00o(recyclerView.f14531OooO00o, recyclerView.f14534OooO00o, accessibilityEvent);
        }

        public void OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f14585OooO00o.canScrollVertically(-1) && !this.f14585OooO00o.canScrollHorizontally(-1) && !this.f14585OooO00o.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC5065OooO0oO oooO0oO = this.f14585OooO00o.f14525OooO00o;
                if (oooO0oO != null) {
                    accessibilityEvent.setItemCount(oooO0oO.OooO00o());
                }
            }
        }

        public void OooO00o(View view, C7120o00OoOO o00oooo) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (OooO0OO2 != null && !OooO0OO2.m14852OooO0o() && !this.f14588OooO00o.m19143OooO00o(OooO0OO2.f14626OooO00o)) {
                RecyclerView recyclerView = this.f14585OooO00o;
                OooO00o(recyclerView.f14531OooO00o, recyclerView.f14534OooO00o, view, o00oooo);
            }
        }

        public void OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0, @NonNull View view, @NonNull C7120o00OoOO o00oooo) {
            o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(m14787OooO0O0() ? OooOO0(view) : 0, 1, m14780OooO00o() ? OooOO0(view) : 0, 1, false, false));
        }

        public int OooO00o(@NonNull OooOo00 oooOo00, @NonNull C5077OooOoO0 oooOoO0) {
            RecyclerView recyclerView = this.f14585OooO00o;
            if (recyclerView == null || recyclerView.f14525OooO00o == null || !m14780OooO00o()) {
                return 1;
            }
            return this.f14585OooO00o.f14525OooO00o.OooO00o();
        }

        public boolean OooO00o(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.f14585OooO00o;
            return OooO00o(recyclerView.f14531OooO00o, recyclerView.f14534OooO00o, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean OooO00o(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OooOo00 r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.C5077OooOoO0 r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOOO0.OooO00o(androidx.recyclerview.widget.RecyclerView$OooOo00, androidx.recyclerview.widget.RecyclerView$OooOoO0, int, android.os.Bundle):boolean");
        }

        public boolean OooO00o(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.f14585OooO00o;
            return OooO00o(recyclerView.f14531OooO00o, recyclerView.f14534OooO00o, view, i, bundle);
        }

        public static C5068OooO0Oo OooO00o(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            C5068OooO0Oo oooO0Oo = new C5068OooO0Oo();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082R.styleable.OooO0oo, i, i2);
            oooO0Oo.OooO00o = obtainStyledAttributes.getInt(C0082R.styleable.RecyclerView_android_orientation, 1);
            oooO0Oo.OooO0O0 = obtainStyledAttributes.getInt(C0082R.styleable.RecyclerView_spanCount, 1);
            oooO0Oo.f14596OooO00o = obtainStyledAttributes.getBoolean(C0082R.styleable.RecyclerView_reverseLayout, false);
            oooO0Oo.f14597OooO0O0 = obtainStyledAttributes.getBoolean(C0082R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return oooO0Oo;
        }
    }

    public interface OooOOOO {
        void OooO00o(@NonNull View view);

        void OooO0O0(@NonNull View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOOo  reason: case insensitive filesystem */
    public static abstract class AbstractC5069OooOOOo {
        public abstract boolean OooO00o(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOo  reason: case insensitive filesystem */
    public static abstract class AbstractC5070OooOOo {
        public void OooO00o(@NonNull RecyclerView recyclerView, int i) {
        }

        public void OooO00o(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOo0  reason: case insensitive filesystem */
    public interface AbstractC5071OooOOo0 {
        void OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void OooO00o(boolean z);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m14808OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public static abstract class OooOo {
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f14601OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooOOO0 f14602OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO00o f14603OooO00o = new OooO00o(0, 0);

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView f14604OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14605OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public static class OooO00o {
            public static final int OooO0o = Integer.MIN_VALUE;
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public Interpolator f14606OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f14607OooO00o;
            public int OooO0O0;
            public int OooO0OO;
            public int OooO0Oo;
            public int OooO0o0;

            public OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public void OooO00o(int i) {
                this.OooO0Oo = i;
            }

            @AbstractC0032Px
            public int OooO0O0() {
                return this.OooO00o;
            }

            public void OooO0OO(@AbstractC0032Px int i) {
                this.f14607OooO00o = true;
                this.OooO00o = i;
            }

            public void OooO0Oo(@AbstractC0032Px int i) {
                this.f14607OooO00o = true;
                this.OooO0O0 = i;
            }

            public OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2, int i3) {
                this(i, i2, i3, null);
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m14822OooO00o() {
                return this.OooO0Oo >= 0;
            }

            public void OooO0O0(int i) {
                this.f14607OooO00o = true;
                this.OooO0OO = i;
            }

            public OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.OooO0Oo = -1;
                this.f14607OooO00o = false;
                this.OooO0o0 = 0;
                this.OooO00o = i;
                this.OooO0O0 = i2;
                this.OooO0OO = i3;
                this.f14606OooO00o = interpolator;
            }

            public void OooO00o(RecyclerView recyclerView) {
                int i = this.OooO0Oo;
                if (i >= 0) {
                    this.OooO0Oo = -1;
                    recyclerView.m14737OooO0OO(i);
                    this.f14607OooO00o = false;
                } else if (this.f14607OooO00o) {
                    OooO00o();
                    Interpolator interpolator = this.f14606OooO00o;
                    if (interpolator == null) {
                        int i2 = this.OooO0OO;
                        if (i2 == Integer.MIN_VALUE) {
                            recyclerView.f14535OooO00o.OooO0O0(this.OooO00o, this.OooO0O0);
                        } else {
                            recyclerView.f14535OooO00o.OooO00o(this.OooO00o, this.OooO0O0, i2);
                        }
                    } else {
                        recyclerView.f14535OooO00o.OooO00o(this.OooO00o, this.OooO0O0, this.OooO0OO, interpolator);
                    }
                    this.OooO0o0++;
                    this.f14607OooO00o = false;
                } else {
                    this.OooO0o0 = 0;
                }
            }

            @AbstractC0032Px
            public int OooO0OO() {
                return this.OooO0O0;
            }

            private void OooO00o() {
                if (this.f14606OooO00o != null && this.OooO0OO < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.OooO0OO < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public int m14820OooO00o() {
                return this.OooO0OO;
            }

            @Nullable
            /* renamed from: OooO00o  reason: collision with other method in class */
            public Interpolator m14821OooO00o() {
                return this.f14606OooO00o;
            }

            public void OooO00o(@Nullable Interpolator interpolator) {
                this.f14607OooO00o = true;
                this.f14606OooO00o = interpolator;
            }

            public void OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.OooO00o = i;
                this.OooO0O0 = i2;
                this.OooO0OO = i3;
                this.f14606OooO00o = interpolator;
                this.f14607OooO00o = true;
            }
        }

        public interface OooO0O0 {
            @Nullable
            PointF OooO00o(int i);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract void m14814OooO00o();

        public abstract void OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2, @NonNull C5077OooOoO0 oooOoO0, @NonNull OooO00o oooO00o);

        public abstract void OooO00o(@NonNull View view, @NonNull C5077OooOoO0 oooOoO0, @NonNull OooO00o oooO00o);

        public void OooO00o(RecyclerView recyclerView, OooOOO0 oooOOO0) {
            if (this.OooO0OO) {
                String str = "An instance of " + getClass().getSimpleName() + " was started " + "more than once. Each instance of" + getClass().getSimpleName() + " " + "is intended to only be used once. You should create a new instance for " + "each use.";
            }
            this.f14604OooO00o = recyclerView;
            this.f14602OooO00o = oooOOO0;
            int i = this.OooO00o;
            if (i != -1) {
                recyclerView.f14534OooO00o.OooO00o = i;
                this.OooO0O0 = true;
                this.f14605OooO00o = true;
                this.f14601OooO00o = m14812OooO00o(OooO0O0());
                m14814OooO00o();
                this.f14604OooO00o.f14535OooO00o.OooO00o();
                this.OooO0OO = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public abstract void m14818OooO0O0();

        public void OooO0O0(int i) {
            this.OooO00o = i;
        }

        public final void OooO0OO() {
            if (this.OooO0O0) {
                this.OooO0O0 = false;
                m14818OooO0O0();
                this.f14604OooO00o.f14534OooO00o.OooO00o = -1;
                this.f14601OooO00o = null;
                this.OooO00o = -1;
                this.f14605OooO00o = false;
                this.f14602OooO00o.OooO00o(this);
                this.f14602OooO00o = null;
                this.f14604OooO00o = null;
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14819OooO0O0() {
            return this.OooO0O0;
        }

        public int OooO0O0() {
            return this.OooO00o;
        }

        @Nullable
        public PointF OooO00o(int i) {
            OooOOO0 OooO00o2 = m14813OooO00o();
            if (OooO00o2 instanceof OooO0O0) {
                return ((OooO0O0) OooO00o2).OooO00o(i);
            }
            String str = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + OooO0O0.class.getCanonicalName();
            return null;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooOOO0 m14813OooO00o() {
            return this.f14602OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14817OooO00o() {
            return this.f14605OooO00o;
        }

        public void OooO00o(int i, int i2) {
            PointF OooO00o2;
            RecyclerView recyclerView = this.f14604OooO00o;
            if (!this.OooO0O0 || this.OooO00o == -1 || recyclerView == null) {
                OooO0OO();
            }
            if (!(!this.f14605OooO00o || this.f14601OooO00o != null || this.f14602OooO00o == null || (OooO00o2 = OooO00o(this.OooO00o)) == null || (OooO00o2.x == 0.0f && OooO00o2.y == 0.0f))) {
                recyclerView.OooO00o((int) Math.signum(OooO00o2.x), (int) Math.signum(OooO00o2.y), (int[]) null);
            }
            this.f14605OooO00o = false;
            View view = this.f14601OooO00o;
            if (view != null) {
                if (OooO00o(view) == this.OooO00o) {
                    OooO00o(this.f14601OooO00o, recyclerView.f14534OooO00o, this.f14603OooO00o);
                    this.f14603OooO00o.OooO00o(recyclerView);
                    OooO0OO();
                } else {
                    this.f14601OooO00o = null;
                }
            }
            if (this.OooO0O0) {
                OooO00o(i, i2, recyclerView.f14534OooO00o, this.f14603OooO00o);
                boolean OooO00o3 = this.f14603OooO00o.m14822OooO00o();
                this.f14603OooO00o.OooO00o(recyclerView);
                if (!OooO00o3) {
                    return;
                }
                if (this.OooO0O0) {
                    this.f14605OooO00o = true;
                    recyclerView.f14535OooO00o.OooO00o();
                    return;
                }
                OooO0OO();
            }
        }

        public int OooO00o(View view) {
            return this.f14604OooO00o.OooO0O0(view);
        }

        public int OooO00o() {
            return this.f14604OooO00o.f14527OooO00o.OooO0O0();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m14812OooO00o(int i) {
            return this.f14604OooO00o.f14527OooO00o.OooO00o(i);
        }

        @Deprecated
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14815OooO00o(int i) {
            this.f14604OooO00o.OooO0oo(i);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14816OooO00o(View view) {
            if (OooO00o(view) == OooO0O0()) {
                this.f14601OooO00o = view;
            }
        }

        public void OooO00o(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0  reason: case insensitive filesystem */
    public interface AbstractC5073OooOo0 {
        void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0);
    }

    public final class OooOo00 {
        public static final int OooO0OO = 2;
        public int OooO00o = 2;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5072OooOOoo f14608OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5076OooOoO f14609OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayList<AbstractC5079OooOoo0> f14611OooO00o = new ArrayList<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC5079OooOoo0> f14612OooO00o = Collections.unmodifiableList(this.f14611OooO00o);
        public int OooO0O0 = 2;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ArrayList<AbstractC5079OooOoo0> f14613OooO0O0 = null;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public final ArrayList<AbstractC5079OooOoo0> f14614OooO0OO = new ArrayList<>();

        public OooOo00() {
        }

        private void OooO0Oo(AbstractC5079OooOoo0 oooOoo0) {
            if (RecyclerView.this.m14740OooO0OO()) {
                View view = oooOoo0.f14626OooO00o;
                if (ViewCompat.m14581OooO0O0(view) == 0) {
                    ViewCompat.OooO0o(view, 1);
                }
                if (!ViewCompat.m14583OooO0O0(view)) {
                    oooOoo0.OooO00o(16384);
                    ViewCompat.OooO00o(view, RecyclerView.this.f14539OooO00o.OooO00o());
                }
            }
        }

        private void OooO0o0(AbstractC5079OooOoo0 oooOoo0) {
            View view = oooOoo0.f14626OooO00o;
            if (view instanceof ViewGroup) {
                OooO00o((ViewGroup) view, false);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14828OooO00o() {
            this.f14611OooO00o.clear();
            OooO0o();
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14831OooO0O0(int i) {
            this.OooO00o = i;
            OooO0oO();
        }

        public void OooO0OO(View view) {
            OooO0O0(RecyclerView.OooO0OO(view));
        }

        public void OooO0o() {
            for (int size = this.f14614OooO0OO.size() - 1; size >= 0; size--) {
                m14829OooO00o(size);
            }
            this.f14614OooO0OO.clear();
            if (RecyclerView.OooOo0O) {
                RecyclerView.this.f14543OooO00o.OooO00o();
            }
        }

        public void OooO0oO() {
            OooOOO0 oooOOO0 = RecyclerView.this.f14527OooO00o;
            this.OooO0O0 = this.OooO00o + (oooOOO0 != null ? oooOOO0.OooO00o : 0);
            for (int size = this.f14614OooO0OO.size() - 1; size >= 0 && this.f14614OooO0OO.size() > this.OooO0O0; size--) {
                m14829OooO00o(size);
            }
        }

        public void OooO0OO(AbstractC5079OooOoo0 oooOoo0) {
            if (oooOoo0.f14632OooO00o) {
                this.f14613OooO0O0.remove(oooOoo0);
            } else {
                this.f14611OooO00o.remove(oooOoo0);
            }
            oooOoo0.f14627OooO00o = null;
            oooOoo0.f14632OooO00o = false;
            oooOoo0.m14848OooO0OO();
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<AbstractC5079OooOoo0> m14827OooO00o() {
            return this.f14612OooO00o;
        }

        @NonNull
        public View OooO0O0(int i) {
            return OooO00o(i, false);
        }

        public void OooO0o0() {
            int size = this.f14614OooO0OO.size();
            for (int i = 0; i < size; i++) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14614OooO0OO.get(i);
                if (oooOoo0 != null) {
                    oooOoo0.OooO00o(6);
                    oooOoo0.OooO00o((Object) null);
                }
            }
            AbstractC5065OooO0oO oooO0oO = RecyclerView.this.f14525OooO00o;
            if (oooO0oO == null || !oooO0oO.OooO0O0()) {
                OooO0o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14830OooO00o(AbstractC5079OooOoo0 oooOoo0) {
            if (oooOoo0.m14852OooO0o()) {
                return RecyclerView.this.f14534OooO00o.m14838OooO0Oo();
            }
            int i = oooOoo0.OooO00o;
            if (i < 0 || i >= RecyclerView.this.f14525OooO00o.OooO00o()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + oooOoo0 + RecyclerView.this.m14722OooO00o());
            } else if (!RecyclerView.this.f14534OooO00o.m14838OooO0Oo() && RecyclerView.this.f14525OooO00o.OooO00o(oooOoo0.OooO00o) != oooOoo0.OooO0O0()) {
                return false;
            } else {
                if (!RecyclerView.this.f14525OooO00o.OooO0O0() || oooOoo0.m14841OooO00o() == RecyclerView.this.f14525OooO00o.m14757OooO00o(oooOoo0.OooO00o)) {
                    return true;
                }
                return false;
            }
        }

        public void OooO0O0(@NonNull View view) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (OooO0OO2.m14856OooO0oo()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (OooO0OO2.m14855OooO0oO()) {
                OooO0OO2.OooO0oo();
            } else if (OooO0OO2.OooOOO0()) {
                OooO0OO2.m14848OooO0OO();
            }
            OooO0O0(OooO0OO2);
        }

        public void OooO0OO() {
            this.f14611OooO00o.clear();
            ArrayList<AbstractC5079OooOoo0> arrayList = this.f14613OooO0O0;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public void OooO0Oo(View view) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (!OooO0OO2.m14845OooO00o(12) && OooO0OO2.m14840OooO() && !RecyclerView.this.m14730OooO00o(OooO0OO2)) {
                if (this.f14613OooO0O0 == null) {
                    this.f14613OooO0O0 = new ArrayList<>();
                }
                OooO0OO2.OooO00o(this, true);
                this.f14613OooO0O0.add(OooO0OO2);
            } else if (!OooO0OO2.m14851OooO0Oo() || OooO0OO2.m14852OooO0o() || RecyclerView.this.f14525OooO00o.OooO0O0()) {
                OooO0OO2.OooO00o(this, false);
                this.f14611OooO00o.add(OooO0OO2);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m14722OooO00o());
            }
        }

        public void OooO0OO(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f14614OooO0OO.size() - 1; size >= 0; size--) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14614OooO0OO.get(size);
                if (oooOoo0 != null && (i3 = oooOoo0.OooO00o) >= i && i3 < i4) {
                    oooOoo0.OooO00o(2);
                    m14829OooO00o(size);
                }
            }
        }

        public void OooO0O0(AbstractC5079OooOoo0 oooOoo0) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (oooOoo0.m14855OooO0oO() || oooOoo0.f14626OooO00o.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(oooOoo0.m14855OooO0oO());
                sb.append(" isAttached:");
                if (oooOoo0.f14626OooO00o.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.m14722OooO00o());
                throw new IllegalArgumentException(sb.toString());
            } else if (oooOoo0.m14856OooO0oo()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + oooOoo0 + RecyclerView.this.m14722OooO00o());
            } else if (!oooOoo0.OooOO0o()) {
                boolean OooO00o2 = oooOoo0.m14844OooO00o();
                AbstractC5065OooO0oO oooO0oO = RecyclerView.this.f14525OooO00o;
                if ((oooO0oO != null && OooO00o2 && oooO0oO.m14761OooO00o(oooOoo0)) || oooOoo0.m14854OooO0o0()) {
                    if (this.OooO0O0 <= 0 || oooOoo0.m14845OooO00o(oOO000OO.OooOO0)) {
                        z = false;
                    } else {
                        int size = this.f14614OooO0OO.size();
                        if (size >= this.OooO0O0 && size > 0) {
                            m14829OooO00o(0);
                            size--;
                        }
                        if (RecyclerView.OooOo0O && size > 0 && !RecyclerView.this.f14543OooO00o.OooO00o(oooOoo0.OooO00o)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f14543OooO00o.OooO00o(this.f14614OooO0OO.get(i).OooO00o)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f14614OooO0OO.add(size, oooOoo0);
                        z = true;
                    }
                    if (!z) {
                        OooO00o(oooOoo0, true);
                        z2 = z;
                        RecyclerView.this.f14541OooO00o.OooO0Oo(oooOoo0);
                        if (!z2 && !z3 && OooO00o2) {
                            oooOoo0.f14629OooO00o = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f14541OooO00o.OooO0Oo(oooOoo0);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m14722OooO00o());
            }
        }

        private boolean OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, int i, int i2, long j) {
            oooOoo0.f14629OooO00o = RecyclerView.this;
            int OooO0O02 = oooOoo0.OooO0O0();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f14608OooO00o.OooO00o(OooO0O02, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f14525OooO00o.OooO00o(oooOoo0, i);
            this.f14608OooO00o.OooO00o(oooOoo0.OooO0O0(), RecyclerView.this.getNanoTime() - nanoTime);
            OooO0Oo(oooOoo0);
            if (!RecyclerView.this.f14534OooO00o.m14838OooO0Oo()) {
                return true;
            }
            oooOoo0.OooO0Oo = i2;
            return true;
        }

        public void OooO0Oo() {
            int size = this.f14614OooO0OO.size();
            for (int i = 0; i < size; i++) {
                OooOOO oooOOO = (OooOOO) this.f14614OooO0OO.get(i).f14626OooO00o.getLayoutParams();
                if (oooOOO != null) {
                    oooOOO.f14583OooO00o = true;
                }
            }
        }

        public void OooO00o(@NonNull View view, int i) {
            OooOOO oooOOO;
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            if (OooO0OO2 != null) {
                int OooO0O02 = RecyclerView.this.f14538OooO00o.m18079OooO0O0(i);
                if (OooO0O02 < 0 || OooO0O02 >= RecyclerView.this.f14525OooO00o.OooO00o()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + OooO0O02 + ")." + "state:" + RecyclerView.this.f14534OooO00o.OooO00o() + RecyclerView.this.m14722OooO00o());
                }
                OooO00o(OooO0OO2, OooO0O02, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = OooO0OO2.f14626OooO00o.getLayoutParams();
                if (layoutParams == null) {
                    oooOOO = (OooOOO) RecyclerView.this.generateDefaultLayoutParams();
                    OooO0OO2.f14626OooO00o.setLayoutParams(oooOOO);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    oooOOO = (OooOOO) RecyclerView.this.generateLayoutParams(layoutParams);
                    OooO0OO2.f14626OooO00o.setLayoutParams(oooOOO);
                } else {
                    oooOOO = (OooOOO) layoutParams;
                }
                boolean z = true;
                oooOOO.f14583OooO00o = true;
                oooOOO.f14582OooO00o = OooO0OO2;
                if (OooO0OO2.f14626OooO00o.getParent() != null) {
                    z = false;
                }
                oooOOO.OooO0O0 = z;
                return;
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.m14722OooO00o());
        }

        public void OooO0O0(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f14614OooO0OO.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14614OooO0OO.get(i7);
                if (oooOoo0 != null && (i6 = oooOoo0.OooO00o) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        oooOoo0.OooO00o(i2 - i, false);
                    } else {
                        oooOoo0.OooO00o(i5, false);
                    }
                }
            }
        }

        public int OooO00o(int i) {
            if (i < 0 || i >= RecyclerView.this.f14534OooO00o.OooO00o()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + RecyclerView.this.f14534OooO00o.OooO00o() + RecyclerView.this.m14722OooO00o());
            } else if (!RecyclerView.this.f14534OooO00o.m14838OooO0Oo()) {
                return i;
            } else {
                return RecyclerView.this.f14538OooO00o.m18079OooO0O0(i);
            }
        }

        public void OooO0O0() {
            int size = this.f14614OooO0OO.size();
            for (int i = 0; i < size; i++) {
                this.f14614OooO0OO.get(i).m14843OooO00o();
            }
            int size2 = this.f14611OooO00o.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f14611OooO00o.get(i2).m14843OooO00o();
            }
            ArrayList<AbstractC5079OooOoo0> arrayList = this.f14613OooO0O0;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f14613OooO0O0.get(i3).m14843OooO00o();
                }
            }
        }

        public View OooO00o(int i, boolean z) {
            return OooO00o(i, z, Long.MAX_VALUE).f14626OooO00o;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a7  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0203  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0211  */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.AbstractC5079OooOoo0 OooO00o(int r17, boolean r18, long r19) {
            /*
            // Method dump skipped, instructions count: 620
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOo00.OooO00o(int, boolean, long):androidx.recyclerview.widget.RecyclerView$OooOoo0");
        }

        private void OooO00o(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    OooO00o((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14829OooO00o(int i) {
            OooO00o(this.f14614OooO0OO.get(i), true);
            this.f14614OooO0OO.remove(i);
        }

        public void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, boolean z) {
            RecyclerView.OooO0O0(oooOoo0);
            if (oooOoo0.m14845OooO00o(16384)) {
                oooOoo0.OooO00o(0, 16384);
                ViewCompat.OooO00o(oooOoo0.f14626OooO00o, (C7087o00OO0o) null);
            }
            if (z) {
                OooO00o(oooOoo0);
            }
            oooOoo0.f14629OooO00o = null;
            m14824OooO00o().OooO00o(oooOoo0);
        }

        public void OooO00o(View view) {
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(view);
            OooO0OO2.f14627OooO00o = null;
            OooO0OO2.f14632OooO00o = false;
            OooO0OO2.m14848OooO0OO();
            OooO0O0(OooO0OO2);
        }

        public int OooO00o() {
            return this.f14611OooO00o.size();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public View m14823OooO00o(int i) {
            return this.f14611OooO00o.get(i).f14626OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC5079OooOoo0 m14825OooO00o(int i) {
            int size;
            int OooO0O02;
            ArrayList<AbstractC5079OooOoo0> arrayList = this.f14613OooO0O0;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC5079OooOoo0 oooOoo0 = this.f14613OooO0O0.get(i2);
                    if (!oooOoo0.OooOOO0() && oooOoo0.OooO0OO() == i) {
                        oooOoo0.OooO00o(32);
                        return oooOoo0;
                    }
                }
                if (RecyclerView.this.f14525OooO00o.OooO0O0() && (OooO0O02 = RecyclerView.this.f14538OooO00o.m18079OooO0O0(i)) > 0 && OooO0O02 < RecyclerView.this.f14525OooO00o.OooO00o()) {
                    long OooO00o2 = RecyclerView.this.f14525OooO00o.m14757OooO00o(OooO0O02);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC5079OooOoo0 oooOoo02 = this.f14613OooO0O0.get(i3);
                        if (!oooOoo02.OooOOO0() && oooOoo02.m14841OooO00o() == OooO00o2) {
                            oooOoo02.OooO00o(32);
                            return oooOoo02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC5079OooOoo0 m14826OooO00o(int i, boolean z) {
            View OooO00o2;
            int size = this.f14611OooO00o.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14611OooO00o.get(i2);
                if (!oooOoo0.OooOOO0() && oooOoo0.OooO0OO() == i && !oooOoo0.m14851OooO0Oo() && (RecyclerView.this.f14534OooO00o.f14618OooO0O0 || !oooOoo0.m14852OooO0o())) {
                    oooOoo0.OooO00o(32);
                    return oooOoo0;
                }
            }
            if (z || (OooO00o2 = RecyclerView.this.f14542OooO00o.m19139OooO00o(i)) == null) {
                int size2 = this.f14614OooO0OO.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC5079OooOoo0 oooOoo02 = this.f14614OooO0OO.get(i3);
                    if (!oooOoo02.m14851OooO0Oo() && oooOoo02.OooO0OO() == i) {
                        if (!z) {
                            this.f14614OooO0OO.remove(i3);
                        }
                        return oooOoo02;
                    }
                }
                return null;
            }
            AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(OooO00o2);
            RecyclerView.this.f14542OooO00o.m19146OooO0OO(OooO00o2);
            int OooO00o3 = RecyclerView.this.f14542OooO00o.OooO00o(OooO00o2);
            if (OooO00o3 != -1) {
                RecyclerView.this.f14542OooO00o.m19141OooO00o(OooO00o3);
                OooO0Oo(OooO00o2);
                OooO0OO2.OooO00o(8224);
                return OooO0OO2;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + OooO0OO2 + RecyclerView.this.m14722OooO00o());
        }

        public AbstractC5079OooOoo0 OooO00o(long j, int i, boolean z) {
            for (int size = this.f14611OooO00o.size() - 1; size >= 0; size--) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14611OooO00o.get(size);
                if (oooOoo0.m14841OooO00o() == j && !oooOoo0.OooOOO0()) {
                    if (i == oooOoo0.OooO0O0()) {
                        oooOoo0.OooO00o(32);
                        if (oooOoo0.m14852OooO0o() && !RecyclerView.this.f14534OooO00o.m14838OooO0Oo()) {
                            oooOoo0.OooO00o(2, 14);
                        }
                        return oooOoo0;
                    } else if (!z) {
                        this.f14611OooO00o.remove(size);
                        RecyclerView.this.removeDetachedView(oooOoo0.f14626OooO00o, false);
                        OooO00o(oooOoo0.f14626OooO00o);
                    }
                }
            }
            int size2 = this.f14614OooO0OO.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC5079OooOoo0 oooOoo02 = this.f14614OooO0OO.get(size2);
                if (oooOoo02.m14841OooO00o() == j) {
                    if (i == oooOoo02.OooO0O0()) {
                        if (!z) {
                            this.f14614OooO0OO.remove(size2);
                        }
                        return oooOoo02;
                    } else if (!z) {
                        m14829OooO00o(size2);
                        return null;
                    }
                }
            }
        }

        public void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0) {
            AbstractC5073OooOo0 oooOo0 = RecyclerView.this.f14532OooO00o;
            if (oooOo0 != null) {
                oooOo0.OooO00o(oooOoo0);
            }
            AbstractC5065OooO0oO oooO0oO = RecyclerView.this.f14525OooO00o;
            if (oooO0oO != null) {
                oooO0oO.OooO0OO(oooOoo0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f14534OooO00o != null) {
                recyclerView.f14541OooO00o.OooO0Oo(oooOoo0);
            }
        }

        public void OooO00o(AbstractC5065OooO0oO oooO0oO, AbstractC5065OooO0oO oooO0oO2, boolean z) {
            m14828OooO00o();
            m14824OooO00o().OooO00o(oooO0oO, oooO0oO2, z);
        }

        public void OooO00o(int i, int i2) {
            int size = this.f14614OooO0OO.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14614OooO0OO.get(i3);
                if (oooOoo0 != null && oooOoo0.OooO00o >= i) {
                    oooOoo0.OooO00o(i2, true);
                }
            }
        }

        public void OooO00o(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f14614OooO0OO.size() - 1; size >= 0; size--) {
                AbstractC5079OooOoo0 oooOoo0 = this.f14614OooO0OO.get(size);
                if (oooOoo0 != null) {
                    int i4 = oooOoo0.OooO00o;
                    if (i4 >= i3) {
                        oooOoo0.OooO00o(-i2, z);
                    } else if (i4 >= i) {
                        oooOoo0.OooO00o(8);
                        m14829OooO00o(size);
                    }
                }
            }
        }

        public void OooO00o(AbstractC5076OooOoO oooOoO) {
            this.f14609OooO00o = oooOoO;
        }

        public void OooO00o(C5072OooOOoo oooOOoo) {
            C5072OooOOoo oooOOoo2 = this.f14608OooO00o;
            if (oooOOoo2 != null) {
                oooOOoo2.OooO0OO();
            }
            this.f14608OooO00o = oooOOoo;
            if (oooOOoo != null && RecyclerView.this.getAdapter() != null) {
                this.f14608OooO00o.m14811OooO00o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5072OooOOoo m14824OooO00o() {
            if (this.f14608OooO00o == null) {
                this.f14608OooO00o = new C5072OooOOoo();
            }
            return this.f14608OooO00o;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0o  reason: case insensitive filesystem */
    public static class C5075OooOo0o implements AbstractC5071OooOOo0 {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        public void OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        public void OooO00o(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14832OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO  reason: case insensitive filesystem */
    public static abstract class AbstractC5076OooOoO {
        @Nullable
        public abstract View OooO00o(@NonNull OooOo00 oooOo00, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO0  reason: case insensitive filesystem */
    public static class C5077OooOoO0 {
        public static final int OooOO0 = 1;
        public static final int OooOO0O = 2;
        public static final int OooOO0o = 4;
        public int OooO;
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f14615OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SparseArray<Object> f14616OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14617OooO00o = false;
        public int OooO0O0 = 0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14618OooO0O0 = false;
        public int OooO0OO = 0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f14619OooO0OO = false;
        public int OooO0Oo = 1;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f14620OooO0Oo = false;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f14621OooO0o = false;
        public int OooO0o0 = 0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f14622OooO0o0 = false;
        public int OooO0oO;
        public int OooO0oo;

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14834OooO00o(int i) {
            if ((this.OooO0Oo & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.OooO0Oo));
            }
        }

        public void OooO0O0(int i) {
            SparseArray<Object> sparseArray = this.f14616OooO00o;
            if (sparseArray != null) {
                sparseArray.remove(i);
            }
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14837OooO0OO() {
            return this.f14620OooO0Oo;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public boolean m14838OooO0Oo() {
            return this.f14618OooO0O0;
        }

        public boolean OooO0o() {
            return this.f14622OooO0o0;
        }

        public boolean OooO0o0() {
            return this.f14621OooO0o;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.OooO00o + ", mData=" + this.f14616OooO00o + ", mItemCount=" + this.OooO0o0 + ", mIsMeasuring=" + this.f14620OooO0Oo + ", mPreviousLayoutItemCount=" + this.OooO0O0 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.OooO0OO + ", mStructureChanged=" + this.f14617OooO00o + ", mInPreLayout=" + this.f14618OooO0O0 + ", mRunSimpleAnimations=" + this.f14622OooO0o0 + ", mRunPredictiveAnimations=" + this.f14621OooO0o + '}';
        }

        public int OooO0OO() {
            return this.OooO;
        }

        public int OooO0Oo() {
            return this.OooO00o;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14836OooO0O0() {
            return this.OooO00o != -1;
        }

        public int OooO0O0() {
            return this.OooO0oo;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5077OooOoO0 m14833OooO00o() {
            this.OooO00o = -1;
            SparseArray<Object> sparseArray = this.f14616OooO00o;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            this.OooO0o0 = 0;
            this.f14617OooO00o = false;
            this.f14620OooO0Oo = false;
            return this;
        }

        public void OooO00o(AbstractC5065OooO0oO oooO0oO) {
            this.OooO0Oo = 1;
            this.OooO0o0 = oooO0oO.OooO00o();
            this.f14618OooO0O0 = false;
            this.f14619OooO0OO = false;
            this.f14620OooO0Oo = false;
        }

        public <T> T OooO00o(int i) {
            SparseArray<Object> sparseArray = this.f14616OooO00o;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public void OooO00o(int i, Object obj) {
            if (this.f14616OooO00o == null) {
                this.f14616OooO00o = new SparseArray<>();
            }
            this.f14616OooO00o.put(i, obj);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14835OooO00o() {
            return this.f14617OooO00o;
        }

        public int OooO00o() {
            return this.f14618OooO0O0 ? this.OooO0O0 - this.OooO0OO : this.OooO0o0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOoOO  reason: case insensitive filesystem */
    public class RunnableC5078OooOoOO implements Runnable {
        public Interpolator OooO00o = RecyclerView.f14515OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OverScroller f14623OooO00o;
        public boolean OooO0O0 = false;
        public boolean OooO0OO = false;
        public int o00oO0O;
        public int o0ooOO0;

        public RunnableC5078OooOoOO() {
            this.f14623OooO00o = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f14515OooO00o);
        }

        private void OooO0OO() {
            this.OooO0OO = false;
            this.OooO0O0 = true;
        }

        private void OooO0Oo() {
            this.OooO0O0 = false;
            if (this.OooO0OO) {
                OooO00o();
            }
        }

        public void OooO00o() {
            if (this.OooO0O0) {
                this.OooO0OO = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.OooO00o(RecyclerView.this, this);
        }

        public void OooO0O0(int i, int i2) {
            m14839OooO00o(i, i2, 0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
            if (r8 > 0) goto L_0x00ef;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 418
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.RunnableC5078OooOoOO.run():void");
        }

        public void OooO0O0() {
            RecyclerView.this.removeCallbacks(this);
            this.f14623OooO00o.abortAnimation();
        }

        public void OooO00o(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.o0ooOO0 = 0;
            this.o00oO0O = 0;
            this.f14623OooO00o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14839OooO00o(int i, int i2, int i3, int i4) {
            OooO00o(i, i2, OooO00o(i, i2, i3, i4));
        }

        private float OooO00o(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        private int OooO00o(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float OooO00o2 = f2 + (OooO00o(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(OooO00o2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public void OooO00o(int i, int i2, int i3) {
            OooO00o(i, i2, i3, RecyclerView.f14515OooO00o);
        }

        public void OooO00o(int i, int i2, Interpolator interpolator) {
            int OooO00o2 = OooO00o(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f14515OooO00o;
            }
            OooO00o(i, i2, OooO00o2, interpolator);
        }

        public void OooO00o(int i, int i2, int i3, Interpolator interpolator) {
            if (this.OooO00o != interpolator) {
                this.OooO00o = interpolator;
                this.f14623OooO00o = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.o0ooOO0 = 0;
            this.o00oO0O = 0;
            this.f14623OooO00o.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f14623OooO00o.computeScrollOffset();
            }
            OooO00o();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOoo0  reason: case insensitive filesystem */
    public static abstract class AbstractC5079OooOoo0 {
        public static final int OooO = 1;
        public static final List<Object> OooO0OO = Collections.emptyList();
        public static final int OooOO0 = 2;
        public static final int OooOO0O = 4;
        public static final int OooOO0o = 8;
        public static final int OooOOO = 32;
        public static final int OooOOO0 = 16;
        public static final int OooOOOO = 128;
        public static final int OooOOOo = 256;
        public static final int OooOOo = 1024;
        public static final int OooOOo0 = 512;
        public static final int OooOOoo = 2048;
        public static final int OooOo0 = -1;
        public static final int OooOo00 = 4096;
        public static final int OooOo0O = 8192;
        public static final int OooOo0o = 16384;
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f14625OooO00o = -1;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final View f14626OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooOo00 f14627OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5079OooOoo0 f14628OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView f14629OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public WeakReference<RecyclerView> f14630OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Object> f14631OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14632OooO00o = false;
        public int OooO0O0 = -1;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public AbstractC5079OooOoo0 f14633OooO0O0 = null;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public List<Object> f14634OooO0O0 = null;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f14635OooO0OO = -1;
        public int OooO0Oo = -1;
        public int OooO0o = 0;
        public int OooO0o0;
        public int OooO0oO = 0;
        @VisibleForTesting
        public int OooO0oo = -1;

        public AbstractC5079OooOoo0(@NonNull View view) {
            if (view != null) {
                this.f14626OooO00o = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void OooO() {
            if (this.f14631OooO00o == null) {
                ArrayList arrayList = new ArrayList();
                this.f14631OooO00o = arrayList;
                this.f14634OooO0O0 = Collections.unmodifiableList(arrayList);
            }
        }

        public void OooO00o(int i, int i2, boolean z) {
            OooO00o(8);
            OooO00o(i2, z);
            this.OooO00o = i;
        }

        public final int OooO0O0() {
            return this.f14635OooO0OO;
        }

        public final int OooO0OO() {
            int i = this.OooO0Oo;
            return i == -1 ? this.OooO00o : i;
        }

        public final int OooO0Oo() {
            return this.OooO0O0;
        }

        public void OooO0o() {
            if (this.OooO0O0 == -1) {
                this.OooO0O0 = this.OooO00o;
            }
        }

        @Deprecated
        public final int OooO0o0() {
            int i = this.OooO0Oo;
            return i == -1 ? this.OooO00o : i;
        }

        /* renamed from: OooO0oO  reason: collision with other method in class */
        public boolean m14855OooO0oO() {
            return this.f14627OooO00o != null;
        }

        public void OooO0oo() {
            this.f14627OooO00o.OooO0OO(this);
        }

        public boolean OooOO0() {
            return (this.OooO0o0 & 2) != 0;
        }

        public boolean OooOO0O() {
            return (this.OooO0o0 & 16) != 0;
        }

        public boolean OooOO0o() {
            return (this.OooO0o0 & 128) != 0;
        }

        public boolean OooOOO0() {
            return (this.OooO0o0 & 32) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.OooO00o + " id=" + this.f14625OooO00o + ", oldPos=" + this.OooO0O0 + ", pLpos:" + this.OooO0Oo);
            if (m14855OooO0oO()) {
                sb.append(" scrap ");
                sb.append(this.f14632OooO00o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m14851OooO0Oo()) {
                sb.append(" invalid");
            }
            if (!m14849OooO0OO()) {
                sb.append(" unbound");
            }
            if (OooOO0()) {
                sb.append(" update");
            }
            if (m14852OooO0o()) {
                sb.append(" removed");
            }
            if (OooOO0o()) {
                sb.append(" ignored");
            }
            if (m14856OooO0oo()) {
                sb.append(" tmpDetached");
            }
            if (!m14854OooO0o0()) {
                sb.append(" not recyclable(" + this.OooO0o + C3848l.f10402t);
            }
            if (m14847OooO0O0()) {
                sb.append(" undefined adapter position");
            }
            if (this.f14626OooO00o.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append(C7522o0Ooo0o.OooO0Oo);
            return sb.toString();
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14847OooO0O0() {
            return (this.OooO0o0 & 512) != 0 || m14851OooO0Oo();
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m14848OooO0OO() {
            this.OooO0o0 &= -33;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public void m14850OooO0Oo() {
            this.OooO0o0 &= -257;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public void m14853OooO0o0() {
            this.OooO0o0 = 0;
            this.OooO00o = -1;
            this.OooO0O0 = -1;
            this.f14625OooO00o = -1;
            this.OooO0Oo = -1;
            this.OooO0o = 0;
            this.f14628OooO00o = null;
            this.f14633OooO0O0 = null;
            m14846OooO0O0();
            this.OooO0oO = 0;
            this.OooO0oo = -1;
            RecyclerView.OooO0O0(this);
        }

        public void OooO0oO() {
            this.OooO0o0 &= -129;
        }

        /* renamed from: OooO0oo  reason: collision with other method in class */
        public boolean m14856OooO0oo() {
            return (this.OooO0o0 & 256) != 0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14846OooO0O0() {
            List<Object> list = this.f14631OooO00o;
            if (list != null) {
                list.clear();
            }
            this.OooO0o0 &= -1025;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14849OooO0OO() {
            return (this.OooO0o0 & 1) != 0;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public boolean m14851OooO0Oo() {
            return (this.OooO0o0 & 4) != 0;
        }

        /* renamed from: OooO0o  reason: collision with other method in class */
        public boolean m14852OooO0o() {
            return (this.OooO0o0 & 8) != 0;
        }

        /* renamed from: OooO  reason: collision with other method in class */
        public boolean m14840OooO() {
            return (this.OooO0o0 & 2) != 0;
        }

        public void OooO00o(int i, boolean z) {
            if (this.OooO0O0 == -1) {
                this.OooO0O0 = this.OooO00o;
            }
            if (this.OooO0Oo == -1) {
                this.OooO0Oo = this.OooO00o;
            }
            if (z) {
                this.OooO0Oo += i;
            }
            this.OooO00o += i;
            if (this.f14626OooO00o.getLayoutParams() != null) {
                ((OooOOO) this.f14626OooO00o.getLayoutParams()).f14583OooO00o = true;
            }
        }

        public void OooO0O0(RecyclerView recyclerView) {
            recyclerView.OooO00o(this, this.OooO0oO);
            this.OooO0oO = 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14843OooO00o() {
            this.OooO0O0 = -1;
            this.OooO0Oo = -1;
        }

        public final int OooO00o() {
            RecyclerView recyclerView = this.f14629OooO00o;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m14715OooO00o(this);
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public final boolean m14854OooO0o0() {
            return (this.OooO0o0 & 16) == 0 && !ViewCompat.m14601OooO0oO(this.f14626OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final long m14841OooO00o() {
            return this.f14625OooO00o;
        }

        public void OooO00o(OooOo00 oooOo00, boolean z) {
            this.f14627OooO00o = oooOo00;
            this.f14632OooO00o = z;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14845OooO00o(int i) {
            return (i & this.OooO0o0) != 0;
        }

        public void OooO00o(int i, int i2) {
            this.OooO0o0 = (i & i2) | (this.OooO0o0 & (i2 ^ -1));
        }

        public void OooO00o(int i) {
            this.OooO0o0 = i | this.OooO0o0;
        }

        public void OooO00o(Object obj) {
            if (obj == null) {
                OooO00o(1024);
            } else if ((1024 & this.OooO0o0) == 0) {
                OooO();
                this.f14631OooO00o.add(obj);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<Object> m14842OooO00o() {
            if ((this.OooO0o0 & 1024) != 0) {
                return OooO0OO;
            }
            List<Object> list = this.f14631OooO00o;
            if (list == null || list.size() == 0) {
                return OooO0OO;
            }
            return this.f14634OooO0O0;
        }

        public void OooO00o(RecyclerView recyclerView) {
            int i = this.OooO0oo;
            if (i != -1) {
                this.OooO0oO = i;
            } else {
                this.OooO0oO = ViewCompat.m14581OooO0O0(this.f14626OooO00o);
            }
            recyclerView.OooO00o(this, 4);
        }

        public final void OooO00o(boolean z) {
            int i = this.OooO0o;
            int i2 = z ? i - 1 : i + 1;
            this.OooO0o = i2;
            if (i2 < 0) {
                this.OooO0o = 0;
                String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
            } else if (!z && i2 == 1) {
                this.OooO0o0 |= 16;
            } else if (z && this.OooO0o == 0) {
                this.OooO0o0 &= -17;
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14844OooO00o() {
            return (this.OooO0o0 & 16) == 0 && ViewCompat.m14601OooO0oO(this.f14626OooO00o);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Orientation {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        OooOOoo = i == 18 || i == 19 || i == 20;
        Class<?> cls = Integer.TYPE;
        f14516OooO00o = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void OooOo() {
        Oooo0();
        setScrollState(0);
    }

    private void OooOoO() {
        boolean z = true;
        this.f14534OooO00o.m14834OooO00o(1);
        OooO00o(this.f14534OooO00o);
        this.f14534OooO00o.f14620OooO0Oo = false;
        OooOo0O();
        this.f14541OooO00o.OooO00o();
        OooOOOo();
        OooOooo();
        Oooo0O0();
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        if (!oooOoO0.f14622OooO0o0 || !this.OooOOOO) {
            z = false;
        }
        oooOoO0.f14619OooO0OO = z;
        this.OooOOOO = false;
        this.OooOOO = false;
        C5077OooOoO0 oooOoO02 = this.f14534OooO00o;
        oooOoO02.f14618OooO0O0 = oooOoO02.f14621OooO0o;
        oooOoO02.OooO0o0 = this.f14525OooO00o.OooO00o();
        OooO00o(this.f14548OooO00o);
        if (this.f14534OooO00o.f14622OooO0o0) {
            int OooO00o2 = this.f14542OooO00o.OooO00o();
            for (int i = 0; i < OooO00o2; i++) {
                AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0O0(i));
                if (!OooO0OO2.OooOO0o() && (!OooO0OO2.m14851OooO0Oo() || this.f14525OooO00o.OooO0O0())) {
                    this.f14541OooO00o.OooO0OO(OooO0OO2, this.f14524OooO00o.OooO00o(this.f14534OooO00o, OooO0OO2, ItemAnimator.OooO00o(OooO0OO2), OooO0OO2.m14842OooO00o()));
                    if (this.f14534OooO00o.f14619OooO0OO && OooO0OO2.m14840OooO() && !OooO0OO2.m14852OooO0o() && !OooO0OO2.OooOO0o() && !OooO0OO2.m14851OooO0Oo()) {
                        this.f14541OooO00o.OooO00o(m14717OooO00o(OooO0OO2), OooO0OO2);
                    }
                }
            }
        }
        if (this.f14534OooO00o.f14621OooO0o) {
            OooOo0();
            C5077OooOoO0 oooOoO03 = this.f14534OooO00o;
            boolean z2 = oooOoO03.f14617OooO00o;
            oooOoO03.f14617OooO00o = false;
            this.f14527OooO00o.m14777OooO00o(this.f14531OooO00o, oooOoO03);
            this.f14534OooO00o.f14617OooO00o = z2;
            for (int i2 = 0; i2 < this.f14542OooO00o.OooO00o(); i2++) {
                AbstractC5079OooOoo0 OooO0OO3 = OooO0OO(this.f14542OooO00o.OooO0O0(i2));
                if (!OooO0OO3.OooOO0o() && !this.f14541OooO00o.m18793OooO0O0(OooO0OO3)) {
                    int OooO00o3 = ItemAnimator.OooO00o(OooO0OO3);
                    boolean OooO00o4 = OooO0OO3.m14845OooO00o(8192);
                    if (!OooO00o4) {
                        OooO00o3 |= 4096;
                    }
                    ItemAnimator.OooO0OO OooO00o5 = this.f14524OooO00o.OooO00o(this.f14534OooO00o, OooO0OO3, OooO00o3, OooO0OO3.m14842OooO00o());
                    if (OooO00o4) {
                        OooO00o(OooO0OO3, OooO00o5);
                    } else {
                        this.f14541OooO00o.OooO00o(OooO0OO3, OooO00o5);
                    }
                }
            }
            m14723OooO00o();
        } else {
            m14723OooO00o();
        }
        OooOOo0();
        OooO0OO(false);
        this.f14534OooO00o.OooO0Oo = 2;
    }

    private void OooOoO0() {
        int i = this.o0ooOO0;
        this.o0ooOO0 = 0;
        if (i != 0 && m14740OooO0OO()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C7116o00OoO.OooO0O0(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void OooOoOO() {
        OooOo0O();
        OooOOOo();
        this.f14534OooO00o.m14834OooO00o(6);
        this.f14538OooO00o.OooO0O0();
        this.f14534OooO00o.OooO0o0 = this.f14525OooO00o.OooO00o();
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        oooOoO0.OooO0OO = 0;
        oooOoO0.f14618OooO0O0 = false;
        this.f14527OooO00o.m14777OooO00o(this.f14531OooO00o, oooOoO0);
        C5077OooOoO0 oooOoO02 = this.f14534OooO00o;
        oooOoO02.f14617OooO00o = false;
        this.f14536OooO00o = null;
        oooOoO02.f14622OooO0o0 = oooOoO02.f14622OooO0o0 && this.f14524OooO00o != null;
        this.f14534OooO00o.OooO0Oo = 4;
        OooOOo0();
        OooO0OO(false);
    }

    @SuppressLint({"InlinedApi"})
    private void OooOoo() {
        if (ViewCompat.m14585OooO0OO((View) this) == 0) {
            ViewCompat.OooO0oO((View) this, 8);
        }
    }

    private void OooOoo0() {
        this.f14534OooO00o.m14834OooO00o(4);
        OooOo0O();
        OooOOOo();
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        oooOoO0.OooO0Oo = 1;
        if (oooOoO0.f14622OooO0o0) {
            for (int OooO00o2 = this.f14542OooO00o.OooO00o() - 1; OooO00o2 >= 0; OooO00o2--) {
                AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0O0(OooO00o2));
                if (!OooO0OO2.OooOO0o()) {
                    long OooO00o3 = m14717OooO00o(OooO0OO2);
                    ItemAnimator.OooO0OO OooO00o4 = this.f14524OooO00o.OooO00o(this.f14534OooO00o, OooO0OO2);
                    AbstractC5079OooOoo0 OooO00o5 = this.f14541OooO00o.OooO00o(OooO00o3);
                    if (OooO00o5 == null || OooO00o5.OooOO0o()) {
                        this.f14541OooO00o.OooO0O0(OooO0OO2, OooO00o4);
                    } else {
                        boolean OooO00o6 = this.f14541OooO00o.m18791OooO00o(OooO00o5);
                        boolean OooO00o7 = this.f14541OooO00o.m18791OooO00o(OooO0OO2);
                        if (!OooO00o6 || OooO00o5 != OooO0OO2) {
                            ItemAnimator.OooO0OO OooO0O02 = this.f14541OooO00o.OooO0O0(OooO00o5);
                            this.f14541OooO00o.OooO0O0(OooO0OO2, OooO00o4);
                            ItemAnimator.OooO0OO OooO00o8 = this.f14541OooO00o.OooO00o(OooO0OO2);
                            if (OooO0O02 == null) {
                                OooO00o(OooO00o3, OooO0OO2, OooO00o5);
                            } else {
                                OooO00o(OooO00o5, OooO0OO2, OooO0O02, OooO00o8, OooO00o6, OooO00o7);
                            }
                        } else {
                            this.f14541OooO00o.OooO0O0(OooO0OO2, OooO00o4);
                        }
                    }
                }
            }
            this.f14541OooO00o.OooO00o(this.f14540OooO00o);
        }
        this.f14527OooO00o.OooO0OO(this.f14531OooO00o);
        C5077OooOoO0 oooOoO02 = this.f14534OooO00o;
        oooOoO02.OooO0O0 = oooOoO02.OooO0o0;
        this.OooOO0O = false;
        this.OooOO0o = false;
        oooOoO02.f14622OooO0o0 = false;
        oooOoO02.f14621OooO0o = false;
        this.f14527OooO00o.f14589OooO00o = false;
        ArrayList<AbstractC5079OooOoo0> arrayList = this.f14531OooO00o.f14613OooO0O0;
        if (arrayList != null) {
            arrayList.clear();
        }
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0.OooO0o) {
            oooOOO0.OooO00o = 0;
            oooOOO0.OooO0o = false;
            this.f14531OooO00o.OooO0oO();
        }
        this.f14527OooO00o.m14778OooO00o(this.f14534OooO00o);
        OooOOo0();
        OooO0OO(false);
        this.f14541OooO00o.OooO00o();
        int[] iArr = this.f14548OooO00o;
        if (OooO0OO(iArr[0], iArr[1])) {
            OooO0Oo(0, 0);
        }
        Oooo000();
        Oooo00o();
    }

    private void OooOooO() {
        this.f14542OooO00o = new C7509o0OoOoOo(new C5064OooO0o0());
    }

    private void OooOooo() {
        if (this.OooOO0O) {
            this.f14538OooO00o.OooO0Oo();
            if (this.OooOO0o) {
                this.f14527OooO00o.OooO0Oo(this);
            }
        }
        if (OooO0oo()) {
            this.f14538OooO00o.OooO0OO();
        } else {
            this.f14538OooO00o.OooO0O0();
        }
        boolean z = false;
        boolean z2 = this.OooOOO || this.OooOOOO;
        this.f14534OooO00o.f14622OooO0o0 = this.f14562OooO0o && this.f14524OooO00o != null && (this.OooOO0O || z2 || this.f14527OooO00o.f14589OooO00o) && (!this.OooOO0O || this.f14525OooO00o.OooO0O0());
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        if (oooOoO0.f14622OooO0o0 && z2 && !this.OooOO0O && OooO0oo()) {
            z = true;
        }
        oooOoO0.f14621OooO0o = z;
    }

    private void Oooo0() {
        VelocityTracker velocityTracker = this.f14519OooO00o;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m14724OooO00o(0);
        Oooo00O();
    }

    private void Oooo000() {
        View findViewById;
        if (this.OooOOO0 && this.f14525OooO00o != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!OooOo || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f14542OooO00o.m19143OooO00o(focusedChild)) {
                            return;
                        }
                    } else if (this.f14542OooO00o.OooO00o() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                AbstractC5079OooOoo0 OooO00o2 = (this.f14534OooO00o.f14615OooO00o == -1 || !this.f14525OooO00o.OooO0O0()) ? null : OooO00o(this.f14534OooO00o.f14615OooO00o);
                if (OooO00o2 != null && !this.f14542OooO00o.m19143OooO00o(OooO00o2.f14626OooO00o) && OooO00o2.f14626OooO00o.hasFocusable()) {
                    view = OooO00o2.f14626OooO00o;
                } else if (this.f14542OooO00o.OooO00o() > 0) {
                    view = OooO00o();
                }
                if (view != null) {
                    int i = this.f14534OooO00o.OooO0oO;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void Oooo00O() {
        boolean z;
        EdgeEffect edgeEffect = this.f14521OooO00o;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f14521OooO00o.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f14550OooO0O0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f14550OooO0O0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.OooO0OO;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.OooO0OO.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f14559OooO0Oo;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f14559OooO0Oo.isFinished();
        }
        if (z) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    private void Oooo00o() {
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        oooOoO0.f14615OooO00o = -1;
        oooOoO0.OooO0o = -1;
        oooOoO0.OooO0oO = -1;
    }

    private void Oooo0O0() {
        int i;
        AbstractC5079OooOoo0 oooOoo0 = null;
        View focusedChild = (!this.OooOOO0 || !hasFocus() || this.f14525OooO00o == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            oooOoo0 = m14721OooO00o(focusedChild);
        }
        if (oooOoo0 == null) {
            Oooo00o();
            return;
        }
        this.f14534OooO00o.f14615OooO00o = this.f14525OooO00o.OooO0O0() ? oooOoo0.m14841OooO00o() : -1;
        C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
        if (this.OooOO0O) {
            i = -1;
        } else if (oooOoo0.m14852OooO0o()) {
            i = oooOoo0.OooO0O0;
        } else {
            i = oooOoo0.OooO00o();
        }
        oooOoO0.OooO0o = i;
        this.f14534OooO00o.OooO0oO = OooO0Oo(oooOoo0.f14626OooO00o);
    }

    private void Oooo0OO() {
        this.f14535OooO00o.OooO0O0();
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.m14791OooO0Oo();
        }
    }

    private C7101o00OOoo getScrollingChildHelper() {
        if (this.f14537OooO00o == null) {
            this.f14537OooO00o = new C7101o00OOoo(this);
        }
        return this.f14537OooO00o;
    }

    public void OooO(int i) {
        OooOOO0 oooOOO0;
        if (!this.OooO0oo && (oooOOO0 = this.f14527OooO00o) != null) {
            oooOOO0.OooO00o(this, this.f14534OooO00o, i);
        }
    }

    public void OooO0O0(@NonNull OooOOOO oooOOOO) {
        List<OooOOOO> list = this.f14547OooO00o;
        if (list != null) {
            list.remove(oooOOOO);
        }
    }

    public void OooO0OO() {
        List<AbstractC5070OooOOo> list = this.f14553OooO0O0;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m14739OooO0OO(@NonNull View view) {
    }

    public void OooO0Oo() {
        if (!this.f14562OooO0o || this.OooOO0O) {
            C7067o00O0o00.OooO00o(o0Oo0oo);
            OooO0o0();
            C7067o00O0o00.OooO00o();
        } else if (this.f14538OooO00o.m18076OooO00o()) {
            if (this.f14538OooO00o.m18077OooO00o(4) && !this.f14538OooO00o.m18077OooO00o(11)) {
                C7067o00O0o00.OooO00o(o0OO00O);
                OooOo0O();
                OooOOOo();
                this.f14538OooO00o.OooO0OO();
                if (!this.f14565OooO0oO) {
                    if (OooO0oO()) {
                        OooO0o0();
                    } else {
                        this.f14538OooO00o.OooO00o();
                    }
                }
                OooO0OO(true);
                OooOOo0();
                C7067o00O0o00.OooO00o();
            } else if (this.f14538OooO00o.m18076OooO00o()) {
                C7067o00O0o00.OooO00o(o0Oo0oo);
                OooO0o0();
                C7067o00O0o00.OooO00o();
            }
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m14741OooO0Oo(@NonNull View view) {
    }

    public void OooO0o(int i) {
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m14743OooO0o() {
        return this.OooO0oo;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m14744OooO0o0() {
        return this.f14572o0ooOOo > 0;
    }

    public void OooO0oO(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        OooO0O0(OooO00o(i));
    }

    public void OooO0oO(@AbstractC0032Px int i, @AbstractC0032Px int i2) {
    }

    public void OooO0oo(int i) {
        if (!this.OooO0oo) {
            OooOo0o();
            OooOOO0 oooOOO0 = this.f14527OooO00o;
            if (oooOOO0 != null) {
                oooOOO0.OooO0o(i);
                awakenScrollBars();
            }
        }
    }

    public void OooOO0() {
        if (this.f14550OooO0O0 == null) {
            EdgeEffect OooO00o2 = this.f14522OooO00o.OooO00o(this, 1);
            this.f14550OooO0O0 = OooO00o2;
            if (this.f14554OooO0O0) {
                OooO00o2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                OooO00o2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void OooOO0O() {
        this.f14538OooO00o = new C1699o0(new OooO0o());
    }

    public void OooOO0o() {
        this.f14559OooO0Oo = null;
        this.f14550OooO0O0 = null;
        this.OooO0OO = null;
        this.f14521OooO00o = null;
    }

    public void OooOOO() {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i = 0; i < OooO0O02; i++) {
            ((OooOOO) this.f14542OooO00o.OooO0OO(i).getLayoutParams()).f14583OooO00o = true;
        }
        this.f14531OooO00o.OooO0Oo();
    }

    public void OooOOO0() {
        if (this.f14546OooO00o.size() != 0) {
            OooOOO0 oooOOO0 = this.f14527OooO00o;
            if (oooOOO0 != null) {
                oooOOO0.OooO0O0("Cannot invalidate item decorations during a scroll or layout");
            }
            OooOOO();
            requestLayout();
        }
    }

    public void OooOOOO() {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i = 0; i < OooO0O02; i++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i));
            if (OooO0OO2 != null && !OooO0OO2.OooOO0o()) {
                OooO0OO2.OooO00o(6);
            }
        }
        OooOOO();
        this.f14531OooO00o.OooO0o0();
    }

    public void OooOOOo() {
        this.f14572o0ooOOo++;
    }

    public void OooOOo() {
        if (!this.OooOOOo && this.f14557OooO0OO) {
            ViewCompat.OooO00o(this, this.f14551OooO0O0);
            this.OooOOOo = true;
        }
    }

    public void OooOOo0() {
        OooO00o(true);
    }

    public void OooOOoo() {
        ItemAnimator itemAnimator = this.f14524OooO00o;
        if (itemAnimator != null) {
            itemAnimator.m14752OooO0O0();
        }
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO0O0(this.f14531OooO00o);
            this.f14527OooO00o.OooO0OO(this.f14531OooO00o);
        }
        this.f14531OooO00o.m14828OooO00o();
    }

    public void OooOo0() {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i = 0; i < OooO0O02; i++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i));
            if (!OooO0OO2.OooOO0o()) {
                OooO0OO2.OooO0o();
            }
        }
    }

    public void OooOo00() {
        AbstractC5079OooOoo0 oooOoo0;
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            View OooO0O02 = this.f14542OooO00o.OooO0O0(i);
            AbstractC5079OooOoo0 OooO0O03 = m14731OooO0O0(OooO0O02);
            if (!(OooO0O03 == null || (oooOoo0 = OooO0O03.f14633OooO0O0) == null)) {
                View view = oooOoo0.f14626OooO00o;
                int left = OooO0O02.getLeft();
                int top = OooO0O02.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void OooOo0O() {
        int i = this.o00oO0O + 1;
        this.o00oO0O = i;
        if (i == 1 && !this.OooO0oo) {
            this.f14565OooO0oO = false;
        }
    }

    public void OooOo0o() {
        setScrollState(0);
        Oooo0OO();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 == null || !oooOOO0.OooO00o(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooOOO) && this.f14527OooO00o.OooO00o((OooOOO) layoutParams);
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeHorizontalScrollExtent() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14780OooO00o()) {
            return this.f14527OooO00o.OooO00o(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeHorizontalScrollOffset() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14780OooO00o()) {
            return this.f14527OooO00o.OooO0O0(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeHorizontalScrollRange() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14780OooO00o()) {
            return this.f14527OooO00o.OooO0OO(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeVerticalScrollExtent() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14787OooO0O0()) {
            return this.f14527OooO00o.OooO0Oo(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeVerticalScrollOffset() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14787OooO0O0()) {
            return this.f14527OooO00o.OooO0o0(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    public int computeVerticalScrollRange() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && oooOOO0.m14787OooO0O0()) {
            return this.f14527OooO00o.OooO0o(this.f14534OooO00o);
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().OooO00o(f, f2, z);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO00o(i, i2, iArr, iArr2);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO00o(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f14546OooO00o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f14546OooO00o.get(i).OooO0O0(canvas, this, this.f14534OooO00o);
        }
        EdgeEffect edgeEffect = this.f14521OooO00o;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f14554OooO0O0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f14521OooO00o;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f14550OooO0O0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f14554OooO0O0) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f14550OooO0O0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.OooO0OO;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f14554OooO0O0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.OooO0OO;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f14559OooO0Oo;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f14554OooO0O0) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f14559OooO0Oo;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f14524OooO00o == null || this.f14546OooO00o.size() <= 0 || !this.f14524OooO00o.m14750OooO00o()) {
            z3 = z;
        }
        if (z3) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View OooO00o2 = this.f14527OooO00o.OooO00o(view, i);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        boolean z2 = true;
        boolean z3 = this.f14525OooO00o != null && this.f14527OooO00o != null && !m14744OooO0o0() && !this.OooO0oo;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                OooO0Oo();
                if (m14719OooO00o(view) == null) {
                    return null;
                }
                OooOo0O();
                view2 = this.f14527OooO00o.OooO00o(view, i, this.f14531OooO00o, this.f14534OooO00o);
                OooO0OO(false);
            }
        } else {
            if (this.f14527OooO00o.m14787OooO0O0()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (OooOo0o) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f14527OooO00o.m14780OooO00o()) {
                int i3 = (this.f14527OooO00o.OooO0o() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (OooOo0o) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                OooO0Oo();
                if (m14719OooO00o(view) == null) {
                    return null;
                }
                OooOo0O();
                this.f14527OooO00o.OooO00o(view, i, this.f14531OooO00o, this.f14534OooO00o);
                OooO0OO(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return OooO00o(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        OooO00o(view2, (View) null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            return oooOOO0.m14772OooO00o();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m14722OooO00o());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            return oooOOO0.OooO00o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m14722OooO00o());
    }

    @Nullable
    public AbstractC5065OooO0oO getAdapter() {
        return this.f14525OooO00o;
    }

    public int getBaseline() {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            return oooOOO0.OooO00o();
        }
        return super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        OooOO0 oooOO0 = this.f14526OooO00o;
        if (oooOO0 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return oooOO0.OooO00o(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f14554OooO0O0;
    }

    @Nullable
    public C7282o0O00o00 getCompatAccessibilityDelegate() {
        return this.f14539OooO00o;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.f14522OooO00o;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.f14524OooO00o;
    }

    public int getItemDecorationCount() {
        return this.f14546OooO00o.size();
    }

    @Nullable
    public OooOOO0 getLayoutManager() {
        return this.f14527OooO00o;
    }

    public int getMaxFlingVelocity() {
        return this.o000000o;
    }

    public int getMinFlingVelocity() {
        return this.o000000O;
    }

    public long getNanoTime() {
        if (OooOo0O) {
            return System.nanoTime();
        }
        return 0;
    }

    @Nullable
    public AbstractC5069OooOOOo getOnFlingListener() {
        return this.f14528OooO00o;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.OooOOO0;
    }

    @NonNull
    public C5072OooOOoo getRecycledViewPool() {
        return this.f14531OooO00o.m14824OooO00o();
    }

    public int getScrollState() {
        return this.f14570o0OOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m18377OooO00o();
    }

    public boolean isAttachedToWindow() {
        return this.f14557OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m18379OooO0O0();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14572o0ooOOo = 0;
        boolean z = true;
        this.f14557OooO0OO = true;
        if (!this.f14562OooO0o || isLayoutRequested()) {
            z = false;
        }
        this.f14562OooO0o = z;
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o(this);
        }
        this.OooOOOo = false;
        if (OooOo0O) {
            RunnableC7728o0ooOoOO o0oooooo = RunnableC7728o0ooOoOO.OooO00o.get();
            this.f14544OooO00o = o0oooooo;
            if (o0oooooo == null) {
                this.f14544OooO00o = new RunnableC7728o0ooOoOO();
                Display OooO00o2 = ViewCompat.m14570OooO00o((View) this);
                float f = 60.0f;
                if (!isInEditMode() && OooO00o2 != null) {
                    float refreshRate = OooO00o2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC7728o0ooOoOO o0oooooo2 = this.f14544OooO00o;
                o0oooooo2.OooO0O0 = (long) (1.0E9f / f);
                RunnableC7728o0ooOoOO.OooO00o.set(o0oooooo2);
            }
            this.f14544OooO00o.OooO00o(this);
        }
    }

    public void onDetachedFromWindow() {
        RunnableC7728o0ooOoOO o0oooooo;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f14524OooO00o;
        if (itemAnimator != null) {
            itemAnimator.m14752OooO0O0();
        }
        OooOo0o();
        this.f14557OooO0OO = false;
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o(this, this.f14531OooO00o);
        }
        this.f14556OooO0OO.clear();
        removeCallbacks(this.f14551OooO0O0);
        this.f14541OooO00o.OooO0O0();
        if (OooOo0O && (o0oooooo = this.f14544OooO00o) != null) {
            o0oooooo.OooO0O0(this);
            this.f14544OooO00o = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f14546OooO00o.size();
        for (int i = 0; i < size; i++) {
            this.f14546OooO00o.get(i).OooO00o(canvas, this, this.f14534OooO00o);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f14527OooO00o != null && !this.OooO0oo && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f14527OooO00o.m14787OooO0O0() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f14527OooO00o.m14780OooO00o()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        OooO00o((int) (f * this.OooO0Oo), (int) (f2 * this.OooO0o0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f14527OooO00o.m14787OooO0O0()) {
                        f2 = -axisValue;
                    } else if (this.f14527OooO00o.m14780OooO00o()) {
                        f = axisValue;
                        f2 = 0.0f;
                        OooO00o((int) (f * this.OooO0Oo), (int) (f2 * this.OooO0o0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            OooO00o((int) (f * this.OooO0Oo), (int) (f2 * this.OooO0o0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.OooO0oo) {
            return false;
        }
        if (OooO0O0(motionEvent)) {
            OooOo();
            return true;
        }
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 == null) {
            return false;
        }
        boolean OooO00o2 = oooOOO0.m14780OooO00o();
        boolean OooO0O02 = this.f14527OooO00o.m14787OooO0O0();
        if (this.f14519OooO00o == null) {
            this.f14519OooO00o = VelocityTracker.obtain();
        }
        this.f14519OooO00o.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.OooO) {
                this.OooO = false;
            }
            this.f14571o0Oo0oo = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f14568o0O0O00 = x;
            this.f14569o0OO00O = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f14567o000OOo = y;
            this.f14574oo0o0Oo = y;
            if (this.f14570o0OOO0o == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f14561OooO0Oo;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = OooO00o2 ? 1 : 0;
            if (OooO0O02) {
                i |= 2;
            }
            m14728OooO00o(i, 0);
        } else if (actionMasked == 1) {
            this.f14519OooO00o.clear();
            m14724OooO00o(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f14571o0Oo0oo);
            if (findPointerIndex < 0) {
                String str = "Error processing scroll; pointer index for id " + this.f14571o0Oo0oo + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f14570o0OOO0o != 1) {
                int i2 = x2 - this.f14569o0OO00O;
                int i3 = y2 - this.f14574oo0o0Oo;
                if (!OooO00o2 || Math.abs(i2) <= this.f14566o000000) {
                    z = false;
                } else {
                    this.f14568o0O0O00 = x2;
                    z = true;
                }
                if (OooO0O02 && Math.abs(i3) > this.f14566o000000) {
                    this.f14567o000OOo = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            OooOo();
        } else if (actionMasked == 5) {
            this.f14571o0Oo0oo = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f14568o0O0O00 = x3;
            this.f14569o0OO00O = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f14567o000OOo = y3;
            this.f14574oo0o0Oo = y3;
        } else if (actionMasked == 6) {
            OooO00o(motionEvent);
        }
        if (this.f14570o0OOO0o == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C7067o00O0o00.OooO00o(o0OOO0o);
        OooO0o0();
        C7067o00O0o00.OooO00o();
        this.f14562OooO0o = true;
    }

    public void onMeasure(int i, int i2) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 == null) {
            m14738OooO0OO(i, i2);
            return;
        }
        boolean z = false;
        if (oooOOO0.m14799OooO0oO()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f14527OooO00o.OooO00o(this.f14531OooO00o, this.f14534OooO00o, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f14525OooO00o != null) {
                if (this.f14534OooO00o.OooO0Oo == 1) {
                    OooOoO();
                }
                this.f14527OooO00o.OooO0O0(i, i2);
                this.f14534OooO00o.f14620OooO0Oo = true;
                OooOoOO();
                this.f14527OooO00o.OooO0Oo(i, i2);
                if (this.f14527OooO00o.m14804OooOO0o()) {
                    this.f14527OooO00o.OooO0O0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f14534OooO00o.f14620OooO0Oo = true;
                    OooOoOO();
                    this.f14527OooO00o.OooO0Oo(i, i2);
                }
            }
        } else if (this.f14560OooO0Oo) {
            this.f14527OooO00o.OooO00o(this.f14531OooO00o, this.f14534OooO00o, i, i2);
        } else {
            if (this.OooOO0) {
                OooOo0O();
                OooOOOo();
                OooOooo();
                OooOOo0();
                C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
                if (oooOoO0.f14621OooO0o) {
                    oooOoO0.f14618OooO0O0 = true;
                } else {
                    this.f14538OooO00o.OooO0O0();
                    this.f14534OooO00o.f14618OooO0O0 = false;
                }
                this.OooOO0 = false;
                OooO0OO(false);
            } else if (this.f14534OooO00o.f14621OooO0o) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
            if (oooO0oO != null) {
                this.f14534OooO00o.OooO0o0 = oooO0oO.OooO00o();
            } else {
                this.f14534OooO00o.OooO0o0 = 0;
            }
            OooOo0O();
            this.f14527OooO00o.OooO00o(this.f14531OooO00o, this.f14534OooO00o, i, i2);
            OooO0OO(false);
            this.f14534OooO00o.f14618OooO0O0 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m14744OooO0o0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f14536OooO00o = savedState;
        super.onRestoreInstanceState(savedState.OooO00o());
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && (parcelable2 = this.f14536OooO00o.OooO0O0) != null) {
            oooOOO0.OooO00o(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f14536OooO00o;
        if (savedState2 != null) {
            savedState.OooO00o(savedState2);
        } else {
            OooOOO0 oooOOO0 = this.f14527OooO00o;
            if (oooOOO0 != null) {
                savedState.OooO0O0 = oooOOO0.m14769OooO00o();
            } else {
                savedState.OooO0O0 = null;
            }
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            OooOO0o();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        boolean z2 = false;
        if (this.OooO0oo || this.OooO) {
            return false;
        }
        if (m14713OooO00o(motionEvent)) {
            OooOo();
            return true;
        }
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 == null) {
            return false;
        }
        boolean OooO00o2 = oooOOO0.m14780OooO00o();
        boolean OooO0O02 = this.f14527OooO00o.m14787OooO0O0();
        if (this.f14519OooO00o == null) {
            this.f14519OooO00o = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f14561OooO0Oo;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f14561OooO0Oo;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.f14571o0Oo0oo = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f14568o0O0O00 = x;
            this.f14569o0OO00O = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f14567o000OOo = y;
            this.f14574oo0o0Oo = y;
            int i3 = OooO00o2 ? 1 : 0;
            if (OooO0O02) {
                i3 |= 2;
            }
            m14728OooO00o(i3, 0);
        } else if (actionMasked == 1) {
            this.f14519OooO00o.addMovement(obtain);
            this.f14519OooO00o.computeCurrentVelocity(1000, (float) this.o000000o);
            float f = OooO00o2 ? -this.f14519OooO00o.getXVelocity(this.f14571o0Oo0oo) : 0.0f;
            float f2 = OooO0O02 ? -this.f14519OooO00o.getYVelocity(this.f14571o0Oo0oo) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !m14735OooO0O0((int) f, (int) f2)) {
                setScrollState(0);
            }
            Oooo0();
            z2 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f14571o0Oo0oo);
            if (findPointerIndex < 0) {
                String str = "Error processing scroll; pointer index for id " + this.f14571o0Oo0oo + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i4 = this.f14568o0O0O00 - x2;
            int i5 = this.f14567o000OOo - y2;
            if (OooO00o(i4, i5, this.f14558OooO0OO, this.f14555OooO0O0, 0)) {
                int[] iArr3 = this.f14558OooO0OO;
                i4 -= iArr3[0];
                i5 -= iArr3[1];
                int[] iArr4 = this.f14555OooO0O0;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.f14561OooO0Oo;
                int i6 = iArr5[0];
                int[] iArr6 = this.f14555OooO0O0;
                iArr5[0] = i6 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.f14570o0OOO0o != 1) {
                if (!OooO00o2 || Math.abs(i4) <= (i2 = this.f14566o000000)) {
                    z = false;
                } else {
                    i4 = i4 > 0 ? i4 - i2 : i4 + i2;
                    z = true;
                }
                if (OooO0O02 && Math.abs(i5) > (i = this.f14566o000000)) {
                    i5 = i5 > 0 ? i5 - i : i5 + i;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
            if (this.f14570o0OOO0o == 1) {
                int[] iArr7 = this.f14555OooO0O0;
                this.f14568o0O0O00 = x2 - iArr7[0];
                this.f14567o000OOo = y2 - iArr7[1];
                if (OooO00o(OooO00o2 ? i4 : 0, OooO0O02 ? i5 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.f14544OooO00o == null || (i4 == 0 && i5 == 0))) {
                    this.f14544OooO00o.OooO00o(this, i4, i5);
                }
            }
        } else if (actionMasked == 3) {
            OooOo();
        } else if (actionMasked == 5) {
            this.f14571o0Oo0oo = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f14568o0O0O00 = x3;
            this.f14569o0OO00O = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f14567o000OOo = y3;
            this.f14574oo0o0Oo = y3;
        } else if (actionMasked == 6) {
            OooO00o(motionEvent);
        }
        if (!z2) {
            this.f14519OooO00o.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void removeDetachedView(View view, boolean z) {
        AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
        if (OooO0OO2 != null) {
            if (OooO0OO2.m14856OooO0oo()) {
                OooO0OO2.m14850OooO0Oo();
            } else if (!OooO0OO2.OooOO0o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + OooO0OO2 + m14722OooO00o());
            }
        }
        view.clearAnimation();
        m14733OooO0O0(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f14527OooO00o.OooO00o(this, this.f14534OooO00o, view, view2) && view2 != null) {
            OooO00o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f14527OooO00o.m14782OooO00o(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f14552OooO0O0.size();
        for (int i = 0; i < size; i++) {
            this.f14552OooO0O0.get(i).OooO00o(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.o00oO0O != 0 || this.OooO0oo) {
            this.f14565OooO0oO = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i, int i2) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && !this.OooO0oo) {
            boolean OooO00o2 = oooOOO0.m14780OooO00o();
            boolean OooO0O02 = this.f14527OooO00o.m14787OooO0O0();
            if (OooO00o2 || OooO0O02) {
                if (!OooO00o2) {
                    i = 0;
                }
                if (!OooO0O02) {
                    i2 = 0;
                }
                OooO00o(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!OooO00o(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable C7282o0O00o00 o0o00o00) {
        this.f14539OooO00o = o0o00o00;
        ViewCompat.OooO00o(this, o0o00o00);
    }

    public void setAdapter(@Nullable AbstractC5065OooO0oO oooO0oO) {
        setLayoutFrozen(false);
        OooO00o(oooO0oO, false, true);
        OooO0O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable OooOO0 oooOO0) {
        if (oooOO0 != this.f14526OooO00o) {
            this.f14526OooO00o = oooOO0;
            setChildrenDrawingOrderEnabled(oooOO0 != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f14554OooO0O0) {
            OooOO0o();
        }
        this.f14554OooO0O0 = z;
        super.setClipToPadding(z);
        if (this.f14562OooO0o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        C7086o00OO0OO.OooO00o(edgeEffectFactory);
        this.f14522OooO00o = edgeEffectFactory;
        OooOO0o();
    }

    public void setHasFixedSize(boolean z) {
        this.f14560OooO0Oo = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f14524OooO00o;
        if (itemAnimator2 != null) {
            itemAnimator2.m14752OooO0O0();
            this.f14524OooO00o.OooO00o((ItemAnimator.OooO0O0) null);
        }
        this.f14524OooO00o = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.OooO00o(this.f14523OooO00o);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f14531OooO00o.m14831OooO0O0(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.OooO0oo) {
            OooO0O0("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.OooO0oo = false;
                if (!(!this.f14565OooO0oO || this.f14527OooO00o == null || this.f14525OooO00o == null)) {
                    requestLayout();
                }
                this.f14565OooO0oO = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.OooO0oo = true;
            this.OooO = true;
            OooOo0o();
        }
    }

    public void setLayoutManager(@Nullable OooOOO0 oooOOO0) {
        if (oooOOO0 != this.f14527OooO00o) {
            OooOo0o();
            if (this.f14527OooO00o != null) {
                ItemAnimator itemAnimator = this.f14524OooO00o;
                if (itemAnimator != null) {
                    itemAnimator.m14752OooO0O0();
                }
                this.f14527OooO00o.OooO0O0(this.f14531OooO00o);
                this.f14527OooO00o.OooO0OO(this.f14531OooO00o);
                this.f14531OooO00o.m14828OooO00o();
                if (this.f14557OooO0OO) {
                    this.f14527OooO00o.OooO00o(this, this.f14531OooO00o);
                }
                this.f14527OooO00o.OooO0o((RecyclerView) null);
                this.f14527OooO00o = null;
            } else {
                this.f14531OooO00o.m14828OooO00o();
            }
            this.f14542OooO00o.m19140OooO00o();
            this.f14527OooO00o = oooOOO0;
            if (oooOOO0 != null) {
                if (oooOOO0.f14585OooO00o == null) {
                    oooOOO0.OooO0o(this);
                    if (this.f14557OooO0OO) {
                        this.f14527OooO00o.OooO00o(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oooOOO0 + " is already attached to a RecyclerView:" + oooOOO0.f14585OooO00o.m14722OooO00o());
                }
            }
            this.f14531OooO00o.OooO0oO();
            requestLayout();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().OooO00o(z);
    }

    public void setOnFlingListener(@Nullable AbstractC5069OooOOOo oooOOOo) {
        this.f14528OooO00o = oooOOOo;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable AbstractC5070OooOOo oooOOo) {
        this.f14530OooO00o = oooOOo;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.OooOOO0 = z;
    }

    public void setRecycledViewPool(@Nullable C5072OooOOoo oooOOoo) {
        this.f14531OooO00o.OooO00o(oooOOoo);
    }

    public void setRecyclerListener(@Nullable AbstractC5073OooOo0 oooOo0) {
        this.f14532OooO00o = oooOo0;
    }

    public void setScrollState(int i) {
        if (i != this.f14570o0OOO0o) {
            this.f14570o0OOO0o = i;
            if (i != 2) {
                Oooo0OO();
            }
            m14732OooO0O0(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                String str = "setScrollingTouchSlop(): bad argument constant " + i + "; using default value";
            } else {
                this.f14566o000000 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f14566o000000 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable AbstractC5076OooOoO oooOoO) {
        this.f14531OooO00o.OooO00o(oooOoO);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().OooO0O0(i);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void stopNestedScroll() {
        getScrollingChildHelper().OooO0O0();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooO0Oo  reason: case insensitive filesystem */
    public class C5063OooO0Oo implements C7289o0O0O0Oo.OooO0O0 {
        public C5063OooO0Oo() {
        }

        @Override // com.p118pd.sdk.C7289o0O0O0Oo.OooO0O0
        public void OooO00o(AbstractC5079OooOoo0 oooOoo0, @NonNull ItemAnimator.OooO0OO oooO0OO, @Nullable ItemAnimator.OooO0OO oooO0OO2) {
            RecyclerView.this.f14531OooO00o.OooO0OO(oooOoo0);
            RecyclerView.this.OooO0O0(oooOoo0, oooO0OO, oooO0OO2);
        }

        @Override // com.p118pd.sdk.C7289o0O0O0Oo.OooO0O0
        public void OooO0O0(AbstractC5079OooOoo0 oooOoo0, ItemAnimator.OooO0OO oooO0OO, ItemAnimator.OooO0OO oooO0OO2) {
            RecyclerView.this.OooO00o(oooOoo0, oooO0OO, oooO0OO2);
        }

        @Override // com.p118pd.sdk.C7289o0O0O0Oo.OooO0O0
        public void OooO0OO(AbstractC5079OooOoo0 oooOoo0, @NonNull ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2) {
            oooOoo0.OooO00o(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.OooOO0O) {
                if (recyclerView.f14524OooO00o.OooO00o(oooOoo0, oooOoo0, oooO0OO, oooO0OO2)) {
                    RecyclerView.this.OooOOo();
                }
            } else if (recyclerView.f14524OooO00o.OooO0OO(oooOoo0, oooO0OO, oooO0OO2)) {
                RecyclerView.this.OooOOo();
            }
        }

        @Override // com.p118pd.sdk.C7289o0O0O0Oo.OooO0O0
        public void OooO00o(AbstractC5079OooOoo0 oooOoo0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f14527OooO00o.OooO0O0(oooOoo0.f14626OooO00o, recyclerView.f14531OooO00o);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooO0o0  reason: case insensitive filesystem */
    public class C5064OooO0o0 implements C7509o0OoOoOo.OooO0O0 {
        public C5064OooO0o0() {
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public void OooO00o(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m14725OooO00o(view);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public void OooO0O0(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m14733OooO0O0(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public int OooO00o(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public View OooO00o(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public void OooO00o() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View OooO00o2 = OooO00o(i);
                RecyclerView.this.m14733OooO0O0(OooO00o2);
                OooO00o2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public void OooO0O0(View view) {
            AbstractC5079OooOoo0 OooO0OO = RecyclerView.OooO0OO(view);
            if (OooO0OO != null) {
                OooO0OO.OooO00o(RecyclerView.this);
            }
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC5079OooOoo0 m14754OooO00o(View view) {
            return RecyclerView.OooO0OO(view);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        public void OooO00o(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC5079OooOoo0 OooO0OO = RecyclerView.OooO0OO(view);
            if (OooO0OO != null) {
                if (OooO0OO.m14856OooO0oo() || OooO0OO.OooOO0o()) {
                    OooO0OO.m14850OooO0Oo();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + OooO0OO + RecyclerView.this.m14722OooO00o());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14755OooO00o(int i) {
            AbstractC5079OooOoo0 OooO0OO;
            View OooO00o2 = OooO00o(i);
            if (!(OooO00o2 == null || (OooO0OO = RecyclerView.OooO0OO(OooO00o2)) == null)) {
                if (!OooO0OO.m14856OooO0oo() || OooO0OO.OooOO0o()) {
                    OooO0OO.OooO00o(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + OooO0OO + RecyclerView.this.m14722OooO00o());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) i);
        }

        @Override // com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0, com.p118pd.sdk.C7509o0OoOoOo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14756OooO00o(View view) {
            AbstractC5079OooOoo0 OooO0OO = RecyclerView.OooO0OO(view);
            if (OooO0OO != null) {
                OooO0OO.OooO0O0(RecyclerView.this);
            }
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void OooO0o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < OooO0O02; i7++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i7));
            if (OooO0OO2 != null && (i6 = OooO0OO2.OooO00o) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    OooO0OO2.OooO00o(i2 - i, false);
                } else {
                    OooO0OO2.OooO00o(i5, false);
                }
                this.f14534OooO00o.f14617OooO00o = true;
            }
        }
        this.f14531OooO00o.OooO0O0(i, i2);
        requestLayout();
    }

    public void OooO0o0() {
        if (this.f14525OooO00o != null && this.f14527OooO00o != null) {
            C5077OooOoO0 oooOoO0 = this.f14534OooO00o;
            oooOoO0.f14620OooO0Oo = false;
            if (oooOoO0.OooO0Oo == 1) {
                OooOoO();
                this.f14527OooO00o.OooO0o0(this);
                OooOoOO();
            } else if (!this.f14538OooO00o.m18080OooO0O0() && this.f14527OooO00o.OooOOOO() == getWidth() && this.f14527OooO00o.OooO0OO() == getHeight()) {
                this.f14527OooO00o.OooO0o0(this);
            } else {
                this.f14527OooO00o.OooO0o0(this);
                OooOoOO();
            }
            OooOoo0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOoo  reason: case insensitive filesystem */
    public static class C5072OooOOoo {
        public static final int OooO0O0 = 5;
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SparseArray<OooO00o> f14598OooO00o = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOOoo$OooO00o */
        public static class OooO00o {
            public int OooO00o = 5;

            /* renamed from: OooO00o  reason: collision with other field name */
            public long f14599OooO00o = 0;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final ArrayList<AbstractC5079OooOoo0> f14600OooO00o = new ArrayList<>();
            public long OooO0O0 = 0;
        }

        public void OooO00o(int i, int i2) {
            OooO00o OooO00o2 = OooO00o(i);
            OooO00o2.OooO00o = i2;
            ArrayList<AbstractC5079OooOoo0> arrayList = OooO00o2.f14600OooO00o;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public void OooO0O0() {
            for (int i = 0; i < this.f14598OooO00o.size(); i++) {
                this.f14598OooO00o.valueAt(i).f14600OooO00o.clear();
            }
        }

        public void OooO0OO() {
            this.OooO00o--;
        }

        public void OooO0O0(int i, long j) {
            OooO00o OooO00o2 = OooO00o(i);
            OooO00o2.f14599OooO00o = OooO00o(OooO00o2.f14599OooO00o, j);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m14809OooO00o(int i) {
            return OooO00o(i).f14600OooO00o.size();
        }

        public boolean OooO0O0(int i, long j, long j2) {
            long j3 = OooO00o(i).f14599OooO00o;
            return j3 == 0 || j + j3 < j2;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC5079OooOoo0 m14810OooO00o(int i) {
            OooO00o oooO00o = this.f14598OooO00o.get(i);
            if (oooO00o == null || oooO00o.f14600OooO00o.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC5079OooOoo0> arrayList = oooO00o.f14600OooO00o;
            return arrayList.remove(arrayList.size() - 1);
        }

        public int OooO00o() {
            int i = 0;
            for (int i2 = 0; i2 < this.f14598OooO00o.size(); i2++) {
                ArrayList<AbstractC5079OooOoo0> arrayList = this.f14598OooO00o.valueAt(i2).f14600OooO00o;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        public void OooO00o(AbstractC5079OooOoo0 oooOoo0) {
            int OooO0O02 = oooOoo0.OooO0O0();
            ArrayList<AbstractC5079OooOoo0> arrayList = OooO00o(OooO0O02).f14600OooO00o;
            if (this.f14598OooO00o.get(OooO0O02).OooO00o > arrayList.size()) {
                oooOoo0.m14853OooO0o0();
                arrayList.add(oooOoo0);
            }
        }

        public long OooO00o(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public void OooO00o(int i, long j) {
            OooO00o OooO00o2 = OooO00o(i);
            OooO00o2.OooO0O0 = OooO00o(OooO00o2.OooO0O0, j);
        }

        public boolean OooO00o(int i, long j, long j2) {
            long j3 = OooO00o(i).OooO0O0;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14811OooO00o() {
            this.OooO00o++;
        }

        public void OooO00o(AbstractC5065OooO0oO oooO0oO, AbstractC5065OooO0oO oooO0oO2, boolean z) {
            if (oooO0oO != null) {
                OooO0OO();
            }
            if (!z && this.OooO00o == 0) {
                OooO0O0();
            }
            if (oooO0oO2 != null) {
                m14811OooO00o();
            }
        }

        private OooO00o OooO00o(int i) {
            OooO00o oooO00o = this.f14598OooO00o.get(i);
            if (oooO00o != null) {
                return oooO00o;
            }
            OooO00o oooO00o2 = new OooO00o();
            this.f14598OooO00o.put(i, oooO00o2);
            return oooO00o2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0O  reason: case insensitive filesystem */
    public class C5074OooOo0O extends OooO {
        public C5074OooOo0O() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public void OooO00o() {
            RecyclerView.this.OooO0O0((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f14534OooO00o.f14617OooO00o = true;
            recyclerView.OooO0O0(true);
            if (!RecyclerView.this.f14538OooO00o.m18076OooO00o()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public void OooO0O0(int i, int i2) {
            RecyclerView.this.OooO0O0((String) null);
            if (RecyclerView.this.f14538OooO00o.m18078OooO00o(i, i2)) {
                OooO0O0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public void OooO0OO(int i, int i2) {
            RecyclerView.this.OooO0O0((String) null);
            if (RecyclerView.this.f14538OooO00o.m18081OooO0O0(i, i2)) {
                OooO0O0();
            }
        }

        public void OooO0O0() {
            if (RecyclerView.OooOo0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f14560OooO0Oo && recyclerView.f14557OooO0OO) {
                    ViewCompat.OooO00o(recyclerView, recyclerView.f14545OooO00o);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.OooOO0 = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public void OooO00o(int i, int i2, Object obj) {
            RecyclerView.this.OooO0O0((String) null);
            if (RecyclerView.this.f14538OooO00o.OooO00o(i, i2, obj)) {
                OooO0O0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public void OooO00o(int i, int i2, int i3) {
            RecyclerView.this.OooO0O0((String) null);
            if (RecyclerView.this.f14538OooO00o.OooO00o(i, i2, i3)) {
                OooO0O0();
            }
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14533OooO00o = new C5074OooOo0O();
        this.f14531OooO00o = new OooOo00();
        this.f14541OooO00o = new C7289o0O0O0Oo();
        this.f14545OooO00o = new OooO00o();
        this.f14517OooO00o = new Rect();
        this.f14549OooO0O0 = new Rect();
        this.f14518OooO00o = new RectF();
        this.f14546OooO00o = new ArrayList<>();
        this.f14552OooO0O0 = new ArrayList<>();
        this.o00oO0O = 0;
        this.OooOO0O = false;
        this.OooOO0o = false;
        this.f14572o0ooOOo = 0;
        this.f14573o0ooOoO = 0;
        this.f14522OooO00o = new EdgeEffectFactory();
        this.f14524OooO00o = new C7257o0O000Oo();
        this.f14570o0OOO0o = 0;
        this.f14571o0Oo0oo = -1;
        this.OooO0Oo = Float.MIN_VALUE;
        this.OooO0o0 = Float.MIN_VALUE;
        boolean z = true;
        this.OooOOO0 = true;
        this.f14535OooO00o = new RunnableC5078OooOoOO();
        this.f14543OooO00o = OooOo0O ? new RunnableC7728o0ooOoOO.OooO0O0() : null;
        this.f14534OooO00o = new C5077OooOoO0();
        this.OooOOO = false;
        this.OooOOOO = false;
        this.f14523OooO00o = new OooOO0O();
        this.OooOOOo = false;
        this.f14548OooO00o = new int[2];
        this.f14555OooO0O0 = new int[2];
        this.f14558OooO0OO = new int[2];
        this.f14561OooO0Oo = new int[2];
        this.f14564OooO0o0 = new int[2];
        this.f14556OooO0OO = new ArrayList();
        this.f14551OooO0O0 = new OooO0O0();
        this.f14540OooO00o = new C5063OooO0Oo();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0oO, i, 0);
            this.f14554OooO0O0 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f14554OooO0O0 = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14566o000000 = viewConfiguration.getScaledTouchSlop();
        this.OooO0Oo = C7113o00Oo0o0.OooO0O0(viewConfiguration, context);
        this.OooO0o0 = C7113o00Oo0o0.OooO0OO(viewConfiguration, context);
        this.o000000O = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o000000o = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f14524OooO00o.OooO00o(this.f14523OooO00o);
        OooOO0O();
        OooOooO();
        OooOoo();
        if (ViewCompat.m14581OooO0O0((View) this) == 0) {
            ViewCompat.OooO0o((View) this, 1);
        }
        this.f14520OooO00o = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C7282o0O00o00(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0082R.styleable.OooO0oo, i, 0);
            String string = obtainStyledAttributes2.getString(C0082R.styleable.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0082R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(C0082R.styleable.RecyclerView_fastScrollEnabled, false);
            this.f14563OooO0o0 = z2;
            if (z2) {
                OooO00o((StateListDrawable) obtainStyledAttributes2.getDrawable(C0082R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0082R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0082R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0082R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            OooO00o(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, OooO0o, i, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public void OooO0O0() {
        List<OooOOOO> list = this.f14547OooO00o;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m14737OooO0OO(int i) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO0o(i);
            awakenScrollBars();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public Parcelable OooO0O0;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.OooO0O0 = parcel.readParcelable(classLoader == null ? OooOOO0.class.getClassLoader() : classLoader);
        }

        public void OooO00o(SavedState savedState) {
            this.OooO0O0 = savedState.OooO0O0;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.OooO0O0, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private boolean OooO0oO() {
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0O0(i));
            if (!(OooO0OO2 == null || OooO0OO2.OooOO0o() || !OooO0OO2.m14840OooO())) {
                return true;
            }
        }
        return false;
    }

    public void OooO() {
        if (this.OooO0OO == null) {
            EdgeEffect OooO00o2 = this.f14522OooO00o.OooO00o(this, 2);
            this.OooO0OO = OooO00o2;
            if (this.f14554OooO0O0) {
                OooO00o2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                OooO00o2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            return oooOOO0.OooO00o(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m14722OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14722OooO00o() {
        return " " + super.toString() + ", adapter:" + this.f14525OooO00o + ", layout:" + this.f14527OooO00o + ", context:" + getContext();
    }

    public void OooO0O0(@NonNull AbstractC5067OooOO0o oooOO0o) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO0O0("Cannot remove item decoration during a scroll  or layout");
        }
        this.f14546OooO00o.remove(oooOO0o);
        if (this.f14546OooO00o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        OooOOO();
        requestLayout();
    }

    public void OooO0OO(boolean z) {
        if (this.o00oO0O < 1) {
            this.o00oO0O = 1;
        }
        if (!z && !this.OooO0oo) {
            this.f14565OooO0oO = false;
        }
        if (this.o00oO0O == 1) {
            if (z && this.f14565OooO0oO && !this.OooO0oo && this.f14527OooO00o != null && this.f14525OooO00o != null) {
                OooO0o0();
            }
            if (!this.OooO0oo) {
                this.f14565OooO0oO = false;
            }
        }
        this.o00oO0O--;
    }

    public void OooO0oo(@AbstractC0032Px int i, @AbstractC0032Px int i2) {
        OooO00o(i, i2, (Interpolator) null);
    }

    private void OooO00o(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String OooO00o2 = OooO00o(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = classLoader.loadClass(OooO00o2).asSubclass(OooOOO0.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f14516OooO00o);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + OooO00o2, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((OooOOO0) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + OooO00o2, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + OooO00o2, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + OooO00o2, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + OooO00o2, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + OooO00o2, e7);
                }
            }
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public void m14746OooO0oo() {
        if (this.f14521OooO00o == null) {
            EdgeEffect OooO00o2 = this.f14522OooO00o.OooO00o(this, 0);
            this.f14521OooO00o = OooO00o2;
            if (this.f14554OooO0O0) {
                OooO00o2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                OooO00o2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m14745OooO0oO() {
        if (this.f14559OooO0Oo == null) {
            EdgeEffect OooO00o2 = this.f14522OooO00o.OooO00o(this, 3);
            this.f14559OooO0Oo = OooO00o2;
            if (this.f14554OooO0O0) {
                OooO00o2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                OooO00o2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void OooO0o() {
        int i;
        for (int size = this.f14556OooO0OO.size() - 1; size >= 0; size--) {
            AbstractC5079OooOoo0 oooOoo0 = this.f14556OooO0OO.get(size);
            if (oooOoo0.f14626OooO00o.getParent() == this && !oooOoo0.OooOO0o() && (i = oooOoo0.OooO0oo) != -1) {
                ViewCompat.OooO0o(oooOoo0.f14626OooO00o, i);
                oooOoo0.OooO0oo = -1;
            }
        }
        this.f14556OooO0OO.clear();
    }

    public void OooO0O0(@NonNull AbstractC5070OooOOo oooOOo) {
        List<AbstractC5070OooOOo> list = this.f14553OooO0O0;
        if (list != null) {
            list.remove(oooOOo);
        }
    }

    private boolean OooO0oo() {
        return this.f14524OooO00o != null && this.f14527OooO00o.m14805OooOOO0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14735OooO0O0(int i, int i2) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        int i3 = 0;
        if (oooOOO0 == null || this.OooO0oo) {
            return false;
        }
        boolean OooO00o2 = oooOOO0.m14780OooO00o();
        boolean OooO0O02 = this.f14527OooO00o.m14787OooO0O0();
        if (!OooO00o2 || Math.abs(i) < this.o000000O) {
            i = 0;
        }
        if (!OooO0O02 || Math.abs(i2) < this.o000000O) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = (float) i;
        float f2 = (float) i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = OooO00o2 || OooO0O02;
            dispatchNestedFling(f, f2, z);
            AbstractC5069OooOOOo oooOOOo = this.f14528OooO00o;
            if (oooOOOo != null && oooOOOo.OooO00o(i, i2)) {
                return true;
            }
            if (z) {
                if (OooO00o2) {
                    i3 = 1;
                }
                if (OooO0O02) {
                    i3 |= 2;
                }
                m14728OooO00o(i3, 1);
                int i4 = this.o000000o;
                int max = Math.max(-i4, Math.min(i, i4));
                int i5 = this.o000000o;
                this.f14535OooO00o.OooO00o(max, Math.max(-i5, Math.min(i2, i5)));
                return true;
            }
        }
        return false;
    }

    public void OooO0o0(int i, int i2) {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i3 = 0; i3 < OooO0O02; i3++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i3));
            if (OooO0OO2 != null && !OooO0OO2.OooOO0o() && OooO0OO2.OooO00o >= i) {
                OooO0OO2.OooO00o(i2, false);
                this.f14534OooO00o.f14617OooO00o = true;
            }
        }
        this.f14531OooO00o.OooO00o(i, i2);
        requestLayout();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m14738OooO0OO(int i, int i2) {
        setMeasuredDimension(OooOOO0.OooO00o(i, getPaddingLeft() + getPaddingRight(), ViewCompat.m14607OooOO0O((View) this)), OooOOO0.OooO00o(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.m14605OooOO0((View) this)));
    }

    public void OooO0o0(@AbstractC0032Px int i) {
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            this.f14542OooO00o.OooO0O0(i2).offsetTopAndBottom(i);
        }
    }

    private int OooO0Oo(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14740OooO0OO() {
        AccessibilityManager accessibilityManager = this.f14520OooO00o;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private boolean OooO0OO(int i, int i2) {
        OooO00o(this.f14548OooO00o);
        int[] iArr = this.f14548OooO00o;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    public static AbstractC5079OooOoo0 OooO0OO(View view) {
        if (view == null) {
            return null;
        }
        return ((OooOOO) view.getLayoutParams()).f14582OooO00o;
    }

    private String OooO00o(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(C9058ooOoOoOO.OooOO0)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public void OooO0O0(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f14521OooO00o;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f14521OooO00o.onRelease();
            z = this.f14521OooO00o.isFinished();
        }
        EdgeEffect edgeEffect2 = this.OooO0OO;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.OooO0OO.onRelease();
            z |= this.OooO0OO.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f14550OooO0O0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f14550OooO0O0.onRelease();
            z |= this.f14550OooO0O0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f14559OooO0Oo;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f14559OooO0Oo.onRelease();
            z |= this.f14559OooO0Oo.isFinished();
        }
        if (z) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    @Deprecated
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m14736OooO0OO(@NonNull View view) {
        return m14714OooO00o(view);
    }

    @Nullable
    @Deprecated
    public AbstractC5079OooOoo0 OooO0OO(int i) {
        return OooO00o(i, false);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14742OooO0Oo() {
        ItemAnimator itemAnimator = this.f14524OooO00o;
        return itemAnimator != null && itemAnimator.m14750OooO00o();
    }

    public void OooO0Oo(@AbstractC0032Px int i) {
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            this.f14542OooO00o.OooO0O0(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14726OooO00o() {
        return this.f14560OooO0Oo;
    }

    public void OooO0Oo(int i, int i2) {
        this.f14573o0ooOoO++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        OooO0oO(i, i2);
        AbstractC5070OooOOo oooOOo = this.f14530OooO00o;
        if (oooOOo != null) {
            oooOOo.OooO00o(this, i, i2);
        }
        List<AbstractC5070OooOOo> list = this.f14553OooO0O0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14553OooO0O0.get(size).OooO00o(this, i, i2);
            }
        }
        this.f14573o0ooOoO--;
    }

    public void OooO00o(@Nullable AbstractC5065OooO0oO oooO0oO, boolean z) {
        setLayoutFrozen(false);
        OooO00o(oooO0oO, true, z);
        OooO0O0(true);
        requestLayout();
    }

    private void OooO00o(@Nullable AbstractC5065OooO0oO oooO0oO, boolean z, boolean z2) {
        AbstractC5065OooO0oO oooO0oO2 = this.f14525OooO00o;
        if (oooO0oO2 != null) {
            oooO0oO2.OooO0O0(this.f14533OooO00o);
            this.f14525OooO00o.OooO0O0(this);
        }
        if (!z || z2) {
            OooOOoo();
        }
        this.f14538OooO00o.OooO0Oo();
        AbstractC5065OooO0oO oooO0oO3 = this.f14525OooO00o;
        this.f14525OooO00o = oooO0oO;
        if (oooO0oO != null) {
            oooO0oO.OooO00o(this.f14533OooO00o);
            oooO0oO.OooO00o(this);
        }
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o(oooO0oO3, this.f14525OooO00o);
        }
        this.f14531OooO00o.OooO00o(oooO0oO3, this.f14525OooO00o, z);
        this.f14534OooO00o.f14617OooO00o = true;
    }

    public void OooO0O0(String str) {
        if (m14744OooO0o0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m14722OooO00o());
            }
            throw new IllegalStateException(str);
        } else if (this.f14573o0ooOoO > 0) {
            new IllegalStateException("" + m14722OooO00o());
        }
    }

    public void OooO0O0(@NonNull AbstractC5071OooOOo0 oooOOo0) {
        this.f14552OooO0O0.remove(oooOOo0);
        if (this.f14529OooO00o == oooOOo0) {
            this.f14529OooO00o = null;
        }
    }

    public void OooO00o(@NonNull OooOOOO oooOOOO) {
        if (this.f14547OooO00o == null) {
            this.f14547OooO00o = new ArrayList();
        }
        this.f14547OooO00o.add(oooOOOO);
    }

    private boolean OooO0O0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f14529OooO00o = null;
        }
        int size = this.f14552OooO0O0.size();
        for (int i = 0; i < size; i++) {
            AbstractC5071OooOOo0 oooOOo0 = this.f14552OooO0O0.get(i);
            if (oooOOo0.m14808OooO00o(this, motionEvent) && action != 3) {
                this.f14529OooO00o = oooOOo0;
                return true;
            }
        }
        return false;
    }

    private void OooO00o(AbstractC5079OooOoo0 oooOoo0) {
        View view = oooOoo0.f14626OooO00o;
        boolean z = view.getParent() == this;
        this.f14531OooO00o.OooO0OO(m14731OooO0O0(view));
        if (oooOoo0.m14856OooO0oo()) {
            this.f14542OooO00o.OooO00o(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f14542OooO00o.OooO00o(view, true);
        } else {
            this.f14542OooO00o.m19142OooO00o(view);
        }
    }

    public void OooO0O0(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull ItemAnimator.OooO0OO oooO0OO, @Nullable ItemAnimator.OooO0OO oooO0OO2) {
        OooO00o(oooOoo0);
        oooOoo0.OooO00o(false);
        if (this.f14524OooO00o.OooO0O0(oooOoo0, oooO0OO, oooO0OO2)) {
            OooOOo();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14729OooO00o(View view) {
        OooOo0O();
        boolean OooO0O02 = this.f14542OooO00o.m19145OooO0O0(view);
        if (OooO0O02) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
            this.f14531OooO00o.OooO0OO(OooO0OO2);
            this.f14531OooO00o.OooO0O0(OooO0OO2);
        }
        OooO0OO(!OooO0O02);
        return OooO0O02;
    }

    public void OooO0O0(boolean z) {
        this.OooOO0o = z | this.OooOO0o;
        this.OooOO0O = true;
        OooOOOO();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC5079OooOoo0 m14731OooO0O0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return OooO0OO(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void OooO00o(@NonNull AbstractC5067OooOO0o oooOO0o, int i) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO0O0("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f14546OooO00o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f14546OooO00o.add(oooOO0o);
        } else {
            this.f14546OooO00o.add(i, oooOO0o);
        }
        OooOOO();
        requestLayout();
    }

    public int OooO0O0(@NonNull View view) {
        AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
        if (OooO0OO2 != null) {
            return OooO0OO2.OooO0OO();
        }
        return -1;
    }

    @Nullable
    public AbstractC5079OooOoo0 OooO0O0(int i) {
        return OooO00o(i, false);
    }

    public static void OooO0O0(View view, Rect rect) {
        OooOOO oooOOO = (OooOOO) view.getLayoutParams();
        Rect rect2 = oooOOO.OooO00o;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oooOOO).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin);
    }

    public void OooO00o(@NonNull AbstractC5067OooOO0o oooOO0o) {
        OooO00o(oooOO0o, -1);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    @NonNull
    public AbstractC5067OooOO0o OooO00o(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f14546OooO00o.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14732OooO0O0(int i) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null) {
            oooOOO0.OooO0Oo(i);
        }
        OooO0o(i);
        AbstractC5070OooOOo oooOOo = this.f14530OooO00o;
        if (oooOOo != null) {
            oooOOo.OooO00o(this, i);
        }
        List<AbstractC5070OooOOo> list = this.f14553OooO0O0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14553OooO0O0.get(size).OooO00o(this, i);
            }
        }
    }

    public void OooO00o(@NonNull AbstractC5070OooOOo oooOOo) {
        if (this.f14553OooO0O0 == null) {
            this.f14553OooO0O0 = new ArrayList();
        }
        this.f14553OooO0O0.add(oooOOo);
    }

    public void OooO00o(int i, int i2, @Nullable int[] iArr) {
        OooOo0O();
        OooOOOo();
        C7067o00O0o00.OooO00o(o0ooOoO);
        OooO00o(this.f14534OooO00o);
        int OooO00o2 = i != 0 ? this.f14527OooO00o.OooO00o(i, this.f14531OooO00o, this.f14534OooO00o) : 0;
        int OooO0O02 = i2 != 0 ? this.f14527OooO00o.OooO0O0(i2, this.f14531OooO00o, this.f14534OooO00o) : 0;
        C7067o00O0o00.OooO00o();
        OooOo00();
        OooOOo0();
        OooO0OO(false);
        if (iArr != null) {
            iArr[0] = OooO00o2;
            iArr[1] = OooO0O02;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14734OooO0O0() {
        return !this.f14562OooO0o || this.OooOO0O || this.f14538OooO00o.m18076OooO00o();
    }

    public static void OooO0O0(@NonNull AbstractC5079OooOoo0 oooOoo0) {
        WeakReference<RecyclerView> weakReference = oooOoo0.f14630OooO00o;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != oooOoo0.f14626OooO00o) {
                    ViewParent parent = recyclerView.getParent();
                    recyclerView = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            oooOoo0.f14630OooO00o = null;
        }
    }

    public boolean OooO00o(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        OooO0Oo();
        if (this.f14525OooO00o != null) {
            OooO00o(i, i2, this.f14564OooO0o0);
            int[] iArr = this.f14564OooO0o0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            i5 = i8;
            i4 = i7;
            i3 = i - i7;
            i6 = i2 - i8;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f14546OooO00o.isEmpty()) {
            invalidate();
        }
        if (OooO00o(i4, i5, i3, i6, this.f14555OooO0O0, 0)) {
            int i9 = this.f14568o0O0O00;
            int[] iArr2 = this.f14555OooO0O0;
            this.f14568o0O0O00 = i9 - iArr2[0];
            this.f14567o000OOo -= iArr2[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.f14561OooO0Oo;
            int i10 = iArr3[0];
            int[] iArr4 = this.f14555OooO0O0;
            iArr3[0] = i10 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C7099o00OOOo0.m18374OooO00o(motionEvent, 8194)) {
                OooO00o(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i6);
            }
            OooO0O0(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            OooO0Oo(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14733OooO0O0(View view) {
        AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
        m14741OooO0Oo(view);
        AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
        if (!(oooO0oO == null || OooO0OO2 == null)) {
            oooO0oO.OooO0O0(OooO0OO2);
        }
        List<OooOOOO> list = this.f14547OooO00o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14547OooO00o.get(size).OooO0O0(view);
            }
        }
    }

    public void OooO00o(@AbstractC0032Px int i, @AbstractC0032Px int i2, @Nullable Interpolator interpolator) {
        OooOOO0 oooOOO0 = this.f14527OooO00o;
        if (oooOOO0 != null && !this.OooO0oo) {
            if (!oooOOO0.m14780OooO00o()) {
                i = 0;
            }
            if (!this.f14527OooO00o.m14787OooO0O0()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f14535OooO00o.OooO00o(i, i2, interpolator);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(float r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooO00o(float, float, float, float):void");
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public void OooO00o(int i, int i2) {
        if (i < 0) {
            m14746OooO0oo();
            this.f14521OooO00o.onAbsorb(-i);
        } else if (i > 0) {
            OooO();
            this.OooO0OO.onAbsorb(i);
        }
        if (i2 < 0) {
            OooOO0();
            this.f14550OooO0O0.onAbsorb(-i2);
        } else if (i2 > 0) {
            m14745OooO0oO();
            this.f14559OooO0Oo.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    private boolean OooO00o(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || m14719OooO00o(view2) == null) {
            return false;
        }
        if (view == null || m14719OooO00o(view) == null) {
            return true;
        }
        this.f14517OooO00o.set(0, 0, view.getWidth(), view.getHeight());
        this.f14549OooO0O0.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f14517OooO00o);
        offsetDescendantRectToMyCoords(view2, this.f14549OooO0O0);
        char c = 65535;
        int i3 = this.f14527OooO00o.OooO0o() == 1 ? -1 : 1;
        Rect rect = this.f14517OooO00o;
        int i4 = rect.left;
        int i5 = this.f14549OooO0O0.left;
        if ((i4 < i5 || rect.right <= i5) && this.f14517OooO00o.right < this.f14549OooO0O0.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f14517OooO00o;
            int i6 = rect2.right;
            int i7 = this.f14549OooO0O0.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f14517OooO00o.left > this.f14549OooO0O0.left) ? -1 : 0;
        }
        Rect rect3 = this.f14517OooO00o;
        int i8 = rect3.top;
        int i9 = this.f14549OooO0O0.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f14517OooO00o.bottom < this.f14549OooO0O0.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f14517OooO00o;
            int i10 = rect4.bottom;
            int i11 = this.f14549OooO0O0.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f14517OooO00o.top <= this.f14549OooO0O0.top) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + m14722OooO00o());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i2 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i2 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void OooO00o(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f14517OooO00o.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof OooOOO) {
            OooOOO oooOOO = (OooOOO) layoutParams;
            if (!oooOOO.f14583OooO00o) {
                Rect rect = oooOOO.OooO00o;
                Rect rect2 = this.f14517OooO00o;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f14517OooO00o);
            offsetRectIntoDescendantCoords(view, this.f14517OooO00o);
        }
        this.f14527OooO00o.OooO00o(this, view, this.f14517OooO00o, !this.f14562OooO0o, view2 == null);
    }

    public void OooO00o(String str) {
        if (m14744OooO0o0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + m14722OooO00o());
        }
        throw new IllegalStateException(str + m14722OooO00o());
    }

    public void OooO00o(@NonNull AbstractC5071OooOOo0 oooOOo0) {
        this.f14552OooO0O0.add(oooOOo0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14713OooO00o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        AbstractC5071OooOOo0 oooOOo0 = this.f14529OooO00o;
        if (oooOOo0 != null) {
            if (action == 0) {
                this.f14529OooO00o = null;
            } else {
                oooOOo0.OooO00o(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f14529OooO00o = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f14552OooO0O0.size();
            for (int i = 0; i < size; i++) {
                AbstractC5071OooOOo0 oooOOo02 = this.f14552OooO0O0.get(i);
                if (oooOOo02.m14808OooO00o(this, motionEvent)) {
                    this.f14529OooO00o = oooOOo02;
                    return true;
                }
            }
        }
        return false;
    }

    private void OooO00o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f14571o0Oo0oo) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f14571o0Oo0oo = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f14568o0O0O00 = x;
            this.f14569o0OO00O = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f14567o000OOo = y;
            this.f14574oo0o0Oo = y;
        }
    }

    public void OooO00o(boolean z) {
        int i = this.f14572o0ooOOo - 1;
        this.f14572o0ooOOo = i;
        if (i < 1) {
            this.f14572o0ooOOo = 0;
            if (z) {
                OooOoO0();
                OooO0o();
            }
        }
    }

    public boolean OooO00o(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!m14744OooO0o0()) {
            return false;
        }
        int OooO0O02 = accessibilityEvent != null ? C7116o00OoO.OooO0O0(accessibilityEvent) : 0;
        if (OooO0O02 != 0) {
            i = OooO0O02;
        }
        this.o0ooOO0 |= i;
        return true;
    }

    @Nullable
    private View OooO00o() {
        AbstractC5079OooOoo0 OooO00o2;
        int i = this.f14534OooO00o.OooO0o;
        if (i == -1) {
            i = 0;
        }
        int OooO00o3 = this.f14534OooO00o.OooO00o();
        for (int i2 = i; i2 < OooO00o3; i2++) {
            AbstractC5079OooOoo0 OooO00o4 = m14720OooO00o(i2);
            if (OooO00o4 == null) {
                break;
            } else if (OooO00o4.f14626OooO00o.hasFocusable()) {
                return OooO00o4.f14626OooO00o;
            }
        }
        int min = Math.min(OooO00o3, i);
        while (true) {
            min--;
            if (min < 0 || (OooO00o2 = m14720OooO00o(min)) == null) {
                return null;
            }
            if (OooO00o2.f14626OooO00o.hasFocusable()) {
                return OooO00o2.f14626OooO00o;
            }
        }
    }

    public final void OooO00o(C5077OooOoO0 oooOoO0) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f14535OooO00o.f14623OooO00o;
            oooOoO0.OooO0oo = overScroller.getFinalX() - overScroller.getCurrX();
            oooOoO0.OooO = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        oooOoO0.OooO0oo = 0;
        oooOoO0.OooO = 0;
    }

    private void OooO00o(long j, AbstractC5079OooOoo0 oooOoo0, AbstractC5079OooOoo0 oooOoo02) {
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0O0(i));
            if (OooO0OO2 != oooOoo0 && m14717OooO00o(OooO0OO2) == j) {
                AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
                if (oooO0oO == null || !oooO0oO.OooO0O0()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + OooO0OO2 + " \n View Holder 2:" + oooOoo0 + m14722OooO00o());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + OooO0OO2 + " \n View Holder 2:" + oooOoo0 + m14722OooO00o());
            }
        }
        String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oooOoo02 + " cannot be found but it is necessary for " + oooOoo0 + m14722OooO00o();
    }

    public void OooO00o(AbstractC5079OooOoo0 oooOoo0, ItemAnimator.OooO0OO oooO0OO) {
        oooOoo0.OooO00o(0, 8192);
        if (this.f14534OooO00o.f14619OooO0OO && oooOoo0.m14840OooO() && !oooOoo0.m14852OooO0o() && !oooOoo0.OooOO0o()) {
            this.f14541OooO00o.OooO00o(m14717OooO00o(oooOoo0), oooOoo0);
        }
        this.f14541OooO00o.OooO0OO(oooOoo0, oooO0OO);
    }

    private void OooO00o(int[] iArr) {
        int OooO00o2 = this.f14542OooO00o.OooO00o();
        if (OooO00o2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < OooO00o2; i3++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0O0(i3));
            if (!OooO0OO2.OooOO0o()) {
                int OooO0OO3 = OooO0OO2.OooO0OO();
                if (OooO0OO3 < i) {
                    i = OooO0OO3;
                }
                if (OooO0OO3 > i2) {
                    i2 = OooO0OO3;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m14717OooO00o(AbstractC5079OooOoo0 oooOoo0) {
        return this.f14525OooO00o.OooO0O0() ? oooOoo0.m14841OooO00o() : (long) oooOoo0.OooO00o;
    }

    public void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, @Nullable ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2) {
        oooOoo0.OooO00o(false);
        if (this.f14524OooO00o.OooO00o(oooOoo0, oooO0OO, oooO0OO2)) {
            OooOOo();
        }
    }

    private void OooO00o(@NonNull AbstractC5079OooOoo0 oooOoo0, @NonNull AbstractC5079OooOoo0 oooOoo02, @NonNull ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2, boolean z, boolean z2) {
        oooOoo0.OooO00o(false);
        if (z) {
            OooO00o(oooOoo0);
        }
        if (oooOoo0 != oooOoo02) {
            if (z2) {
                OooO00o(oooOoo02);
            }
            oooOoo0.f14628OooO00o = oooOoo02;
            OooO00o(oooOoo0);
            this.f14531OooO00o.OooO0OO(oooOoo0);
            oooOoo02.OooO00o(false);
            oooOoo02.f14633OooO0O0 = oooOoo0;
        }
        if (this.f14524OooO00o.OooO00o(oooOoo0, oooOoo02, oooO0OO, oooO0OO2)) {
            OooOOo();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14723OooO00o() {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i = 0; i < OooO0O02; i++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i));
            if (!OooO0OO2.OooOO0o()) {
                OooO0OO2.m14843OooO00o();
            }
        }
        this.f14531OooO00o.OooO0O0();
    }

    public void OooO00o(int i, int i2, boolean z) {
        int i3 = i + i2;
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i4 = 0; i4 < OooO0O02; i4++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i4));
            if (OooO0OO2 != null && !OooO0OO2.OooOO0o()) {
                int i5 = OooO0OO2.OooO00o;
                if (i5 >= i3) {
                    OooO0OO2.OooO00o(-i2, z);
                    this.f14534OooO00o.f14617OooO00o = true;
                } else if (i5 >= i) {
                    OooO0OO2.OooO00o(i - 1, -i2, z);
                    this.f14534OooO00o.f14617OooO00o = true;
                }
            }
        }
        this.f14531OooO00o.OooO00o(i, i2, z);
        requestLayout();
    }

    public void OooO00o(int i, int i2, Object obj) {
        int i3;
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        int i4 = i + i2;
        for (int i5 = 0; i5 < OooO0O02; i5++) {
            View OooO0OO2 = this.f14542OooO00o.OooO0OO(i5);
            AbstractC5079OooOoo0 OooO0OO3 = OooO0OO(OooO0OO2);
            if (OooO0OO3 != null && !OooO0OO3.OooOO0o() && (i3 = OooO0OO3.OooO00o) >= i && i3 < i4) {
                OooO0OO3.OooO00o(2);
                OooO0OO3.OooO00o(obj);
                ((OooOOO) OooO0OO2.getLayoutParams()).f14583OooO00o = true;
            }
        }
        this.f14531OooO00o.OooO0OO(i, i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14730OooO00o(AbstractC5079OooOoo0 oooOoo0) {
        ItemAnimator itemAnimator = this.f14524OooO00o;
        return itemAnimator == null || itemAnimator.OooO00o(oooOoo0, oooOoo0.m14842OooO00o());
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m14719OooO00o(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5079OooOoo0 m14721OooO00o(@NonNull View view) {
        View OooO00o2 = m14719OooO00o(view);
        if (OooO00o2 == null) {
            return null;
        }
        return m14731OooO0O0(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m14714OooO00o(@NonNull View view) {
        AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
        if (OooO0OO2 != null) {
            return OooO0OO2.OooO00o();
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m14716OooO00o(@NonNull View view) {
        AbstractC5079OooOoo0 OooO0OO2;
        AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
        if (oooO0oO == null || !oooO0oO.OooO0O0() || (OooO0OO2 = OooO0OO(view)) == null) {
            return -1;
        }
        return OooO0OO2.m14841OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5079OooOoo0 m14720OooO00o(int i) {
        AbstractC5079OooOoo0 oooOoo0 = null;
        if (this.OooOO0O) {
            return null;
        }
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i2));
            if (OooO0OO2 != null && !OooO0OO2.m14852OooO0o() && m14715OooO00o(OooO0OO2) == i) {
                if (!this.f14542OooO00o.m19143OooO00o(OooO0OO2.f14626OooO00o)) {
                    return OooO0OO2;
                }
                oooOoo0 = OooO0OO2;
            }
        }
        return oooOoo0;
    }

    @Nullable
    public AbstractC5079OooOoo0 OooO00o(int i, boolean z) {
        int OooO0O02 = this.f14542OooO00o.OooO0O0();
        AbstractC5079OooOoo0 oooOoo0 = null;
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i2));
            if (OooO0OO2 != null && !OooO0OO2.m14852OooO0o()) {
                if (z) {
                    if (OooO0OO2.OooO00o != i) {
                        continue;
                    }
                } else if (OooO0OO2.OooO0OO() != i) {
                    continue;
                }
                if (!this.f14542OooO00o.m19143OooO00o(OooO0OO2.f14626OooO00o)) {
                    return OooO0OO2;
                }
                oooOoo0 = OooO0OO2;
            }
        }
        return oooOoo0;
    }

    public AbstractC5079OooOoo0 OooO00o(long j) {
        AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
        AbstractC5079OooOoo0 oooOoo0 = null;
        if (oooO0oO != null && oooO0oO.OooO0O0()) {
            int OooO0O02 = this.f14542OooO00o.OooO0O0();
            for (int i = 0; i < OooO0O02; i++) {
                AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(this.f14542OooO00o.OooO0OO(i));
                if (OooO0OO2 != null && !OooO0OO2.m14852OooO0o() && OooO0OO2.m14841OooO00o() == j) {
                    if (!this.f14542OooO00o.m19143OooO00o(OooO0OO2.f14626OooO00o)) {
                        return OooO0OO2;
                    }
                    oooOoo0 = OooO0OO2;
                }
            }
        }
        return oooOoo0;
    }

    @Nullable
    public View OooO00o(float f, float f2) {
        for (int OooO00o2 = this.f14542OooO00o.OooO00o() - 1; OooO00o2 >= 0; OooO00o2--) {
            View OooO0O02 = this.f14542OooO00o.OooO0O0(OooO00o2);
            float translationX = OooO0O02.getTranslationX();
            float translationY = OooO0O02.getTranslationY();
            if (f >= ((float) OooO0O02.getLeft()) + translationX && f <= ((float) OooO0O02.getRight()) + translationX && f2 >= ((float) OooO0O02.getTop()) + translationY && f2 <= ((float) OooO0O02.getBottom()) + translationY) {
                return OooO0O02;
            }
        }
        return null;
    }

    public void OooO00o(@NonNull View view, @NonNull Rect rect) {
        OooO0O0(view, rect);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rect m14718OooO00o(View view) {
        OooOOO oooOOO = (OooOOO) view.getLayoutParams();
        if (!oooOOO.f14583OooO00o) {
            return oooOOO.OooO00o;
        }
        if (this.f14534OooO00o.m14838OooO0Oo() && (oooOOO.m14763OooO00o() || oooOOO.m14765OooO0OO())) {
            return oooOOO.OooO00o;
        }
        Rect rect = oooOOO.OooO00o;
        rect.set(0, 0, 0, 0);
        int size = this.f14546OooO00o.size();
        for (int i = 0; i < size; i++) {
            this.f14517OooO00o.set(0, 0, 0, 0);
            this.f14546OooO00o.get(i).OooO00o(this.f14517OooO00o, view, this, this.f14534OooO00o);
            int i2 = rect.left;
            Rect rect2 = this.f14517OooO00o;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oooOOO.f14583OooO00o = false;
        return rect;
    }

    @Nullable
    public static RecyclerView OooO00o(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView OooO00o2 = OooO00o(viewGroup.getChildAt(i));
            if (OooO00o2 != null) {
                return OooO00o2;
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14725OooO00o(View view) {
        AbstractC5079OooOoo0 OooO0OO2 = OooO0OO(view);
        m14739OooO0OO(view);
        AbstractC5065OooO0oO oooO0oO = this.f14525OooO00o;
        if (!(oooO0oO == null || OooO0OO2 == null)) {
            oooO0oO.OooO00o(OooO0OO2);
        }
        List<OooOOOO> list = this.f14547OooO00o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14547OooO00o.get(size).OooO00o(view);
            }
        }
    }

    @VisibleForTesting
    public boolean OooO00o(AbstractC5079OooOoo0 oooOoo0, int i) {
        if (m14744OooO0o0()) {
            oooOoo0.OooO0oo = i;
            this.f14556OooO0OO.add(oooOoo0);
            return false;
        }
        ViewCompat.OooO0o(oooOoo0.f14626OooO00o, i);
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m14715OooO00o(AbstractC5079OooOoo0 oooOoo0) {
        if (oooOoo0.m14845OooO00o(524) || !oooOoo0.m14849OooO0OO()) {
            return -1;
        }
        return this.f14538OooO00o.OooO00o(oooOoo0.OooO00o);
    }

    @VisibleForTesting
    public void OooO00o(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m14722OooO00o());
        }
        Resources resources = getContext().getResources();
        new C7262o0O000o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0082R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0082R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0082R.dimen.fastscroll_margin));
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14728OooO00o(int i, int i2) {
        return getScrollingChildHelper().OooO00o(i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14724OooO00o(int i) {
        getScrollingChildHelper().m18376OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14727OooO00o(int i) {
        return getScrollingChildHelper().m18378OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public boolean OooO00o(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().OooO00o(i, i2, i3, i4, iArr, i5);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public boolean OooO00o(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().OooO00o(i, i2, iArr, iArr2, i3);
    }
}
