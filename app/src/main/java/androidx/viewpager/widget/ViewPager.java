package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.p118pd.sdk.AbstractC7107o00Oo000;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7119o00OoO0o;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7522o0Ooo0o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int CLOSE_ENOUGH = 2;
    public static final Comparator<C5084OooO0o0> COMPARATOR = new OooO00o();
    public static final boolean DEBUG = false;
    public static final int DEFAULT_GUTTER_SIZE = 16;
    public static final int DEFAULT_OFFSCREEN_PAGES = 1;
    public static final int DRAW_ORDER_DEFAULT = 0;
    public static final int DRAW_ORDER_FORWARD = 1;
    public static final int DRAW_ORDER_REVERSE = 2;
    public static final int INVALID_POINTER = -1;
    public static final int[] LAYOUT_ATTRS = {16842931};
    public static final int MAX_SETTLE_DURATION = 600;
    public static final int MIN_DISTANCE_FOR_FLING = 25;
    public static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "ViewPager";
    public static final boolean USE_CACHE = false;
    public static final Interpolator sInterpolator = new OooO0O0();
    public static final OooOOO0 sPositionComparator = new OooOOO0();
    public int mActivePointerId = -1;
    public AbstractC7314o0O0Oo0O mAdapter;
    public List<AbstractC5086OooO0oo> mAdapterChangeListeners;
    public int mBottomPageBounds;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mChildWidthMeasureSpec;
    public int mCloseEnough;
    public int mCurItem;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList<View> mDrawingOrderedChildren;
    public final Runnable mEndScrollRunnable = new OooO0OO();
    public int mExpectedAdapterCount;
    public long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout = true;
    public float mFirstOffset = -3.4028235E38f;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public OooO mInternalPageChangeListener;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public final ArrayList<C5084OooO0o0> mItems = new ArrayList<>();
    public float mLastMotionX;
    public float mLastMotionY;
    public float mLastOffset = Float.MAX_VALUE;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public boolean mNeedCalculatePageOffsets = false;
    public OooOO0O mObserver;
    public int mOffscreenPageLimit = 1;
    public OooO mOnPageChangeListener;
    public List<OooO> mOnPageChangeListeners;
    public int mPageMargin;
    public OooOO0 mPageTransformer;
    public int mPageTransformerLayerType;
    public boolean mPopulatePending;
    public Parcelable mRestoredAdapterState = null;
    public ClassLoader mRestoredClassLoader = null;
    public int mRestoredCurItem = -1;
    public EdgeEffect mRightEdge;
    public int mScrollState = 0;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public final C5084OooO0o0 mTempItem = new C5084OooO0o0();
    public final Rect mTempRect = new Rect();
    public int mTopPageBounds;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public interface OooO {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @AbstractC0032Px int i2);

        void onPageSelected(int i);
    }

    public static class OooO00o implements Comparator<C5084OooO0o0> {
        /* renamed from: OooO00o */
        public int compare(C5084OooO0o0 oooO0o0, C5084OooO0o0 oooO0o02) {
            return oooO0o0.f14708OooO00o - oooO0o02.f14708OooO00o;
        }
    }

    public static class OooO0O0 implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OooO0Oo  reason: case insensitive filesystem */
    public class C5083OooO0Oo implements AbstractC7107o00Oo000 {
        public final Rect OooO00o = new Rect();

        public C5083OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC7107o00Oo000
        public C7119o00OoO0o OooO00o(View view, C7119o00OoO0o o00ooo0o) {
            C7119o00OoO0o OooO0O0 = ViewCompat.OooO0O0(view, o00ooo0o);
            if (OooO0O0.m18399OooO0Oo()) {
                return OooO0O0;
            }
            Rect rect = this.OooO00o;
            rect.left = OooO0O0.OooO0o();
            rect.top = OooO0O0.OooO0oo();
            rect.right = OooO0O0.OooO0oO();
            rect.bottom = OooO0O0.OooO0o0();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C7119o00OoO0o OooO00o2 = ViewCompat.OooO00o(ViewPager.this.getChildAt(i), OooO0O0);
                rect.left = Math.min(OooO00o2.OooO0o(), rect.left);
                rect.top = Math.min(OooO00o2.OooO0oo(), rect.top);
                rect.right = Math.min(OooO00o2.OooO0oO(), rect.right);
                rect.bottom = Math.min(OooO00o2.OooO0o0(), rect.bottom);
            }
            return OooO0O0.OooO00o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OooO0o0  reason: case insensitive filesystem */
    public static class C5084OooO0o0 {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f14708OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f14709OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14710OooO00o;
        public float OooO0O0;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OooO0oO  reason: case insensitive filesystem */
    public class C5085OooO0oO extends C7087o00OO0o {
        public C5085OooO0oO() {
        }

        private boolean OooO00o() {
            AbstractC7314o0O0Oo0O o0o0oo0o = ViewPager.this.mAdapter;
            return o0o0oo0o != null && o0o0oo0o.getCount() > 1;
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC7314o0O0Oo0O o0o0oo0o;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(OooO00o());
            if (accessibilityEvent.getEventType() == 4096 && (o0o0oo0o = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(o0o0oo0o.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            super.onInitializeAccessibilityNodeInfo(view, o00oooo);
            o00oooo.OooO00o((CharSequence) ViewPager.class.getName());
            o00oooo.OooOOoo(OooO00o());
            if (ViewPager.this.canScrollHorizontally(1)) {
                o00oooo.m18416OooO00o(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                o00oooo.m18416OooO00o(8192);
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OooO0oo  reason: case insensitive filesystem */
    public interface AbstractC5086OooO0oo {
        void OooO00o(@NonNull ViewPager viewPager, @Nullable AbstractC7314o0O0Oo0O o0o0oo0o, @Nullable AbstractC7314o0O0Oo0O o0o0oo0o2);
    }

    public interface OooOO0 {
        void OooO00o(@NonNull View view, float f);
    }

    public class OooOO0O extends DataSetObserver {
        public OooOO0O() {
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OooOO0o  reason: case insensitive filesystem */
    public static class C5087OooOO0o implements OooO {
        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageSelected(int i) {
        }
    }

    public static class OooOOO0 implements Comparator<View> {
        /* renamed from: OooO00o */
        public int compare(View view, View view2) {
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            OooO0o oooO0o2 = (OooO0o) view2.getLayoutParams();
            boolean z = oooO0o.f14706OooO00o;
            if (z != oooO0o2.f14706OooO00o) {
                return z ? 1 : -1;
            }
            return oooO0o.OooO0O0 - oooO0o2.OooO0O0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public ClassLoader OooO00o;
        public Parcelable OooO0O0;
        public int o00oO0O;

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

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.o00oO0O + C7522o0Ooo0o.OooO0Oo;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o00oO0O);
            parcel.writeParcelable(this.OooO0O0, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.o00oO0O = parcel.readInt();
            this.OooO0O0 = parcel.readParcelable(classLoader);
            this.OooO00o = classLoader;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        initViewPager();
    }

    private void calculatePageOffsets(C5084OooO0o0 oooO0o0, int i, C5084OooO0o0 oooO0o02) {
        int i2;
        int i3;
        C5084OooO0o0 oooO0o03;
        C5084OooO0o0 oooO0o04;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (oooO0o02 != null) {
            int i4 = oooO0o02.f14708OooO00o;
            int i5 = oooO0o0.f14708OooO00o;
            if (i4 < i5) {
                float f2 = oooO0o02.OooO0O0 + oooO0o02.OooO00o + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= oooO0o0.f14708OooO00o && i7 < this.mItems.size()) {
                    C5084OooO0o0 oooO0o05 = this.mItems.get(i7);
                    while (true) {
                        oooO0o04 = oooO0o05;
                        if (i6 > oooO0o04.f14708OooO00o && i7 < this.mItems.size() - 1) {
                            i7++;
                            oooO0o05 = this.mItems.get(i7);
                        }
                    }
                    while (i6 < oooO0o04.f14708OooO00o) {
                        f2 += this.mAdapter.getPageWidth(i6) + f;
                        i6++;
                    }
                    oooO0o04.OooO0O0 = f2;
                    f2 += oooO0o04.OooO00o + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f3 = oooO0o02.OooO0O0;
                while (true) {
                    i4--;
                    if (i4 < oooO0o0.f14708OooO00o || size < 0) {
                        break;
                    }
                    C5084OooO0o0 oooO0o06 = this.mItems.get(size);
                    while (true) {
                        oooO0o03 = oooO0o06;
                        if (i4 < oooO0o03.f14708OooO00o && size > 0) {
                            size--;
                            oooO0o06 = this.mItems.get(size);
                        }
                    }
                    while (i4 > oooO0o03.f14708OooO00o) {
                        f3 -= this.mAdapter.getPageWidth(i4) + f;
                        i4--;
                    }
                    f3 -= oooO0o03.OooO00o + f;
                    oooO0o03.OooO0O0 = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = oooO0o0.OooO0O0;
        int i8 = oooO0o0.f14708OooO00o;
        int i9 = i8 - 1;
        this.mFirstOffset = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = count - 1;
        this.mLastOffset = oooO0o0.f14708OooO00o == i10 ? (oooO0o0.OooO0O0 + oooO0o0.OooO00o) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C5084OooO0o0 oooO0o07 = this.mItems.get(i11);
            while (true) {
                i3 = oooO0o07.f14708OooO00o;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.mAdapter.getPageWidth(i9) + f;
                i9--;
            }
            f4 -= oooO0o07.OooO00o + f;
            oooO0o07.OooO0O0 = f4;
            if (i3 == 0) {
                this.mFirstOffset = f4;
            }
            i11--;
            i9--;
        }
        float f5 = oooO0o0.OooO0O0 + oooO0o0.OooO00o + f;
        int i12 = oooO0o0.f14708OooO00o + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C5084OooO0o0 oooO0o08 = this.mItems.get(i13);
            while (true) {
                i2 = oooO0o08.f14708OooO00o;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.mAdapter.getPageWidth(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.mLastOffset = (oooO0o08.OooO00o + f5) - 1.0f;
            }
            oooO0o08.OooO0O0 = f5;
            f5 += oooO0o08.OooO00o + f;
            i13++;
            i12++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C5084OooO0o0 oooO0o0 = this.mItems.get(i);
            if (oooO0o0.f14710OooO00o) {
                oooO0o0.f14710OooO00o = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.OooO00o(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ArrayList<C5084OooO0o0> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).f14708OooO00o, Math.min(i, arrayList.get(arrayList.size() - 1).f14708OooO00o));
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        OooO oooO = this.mOnPageChangeListener;
        if (oooO != null) {
            oooO.onPageScrolled(i, f, i2);
        }
        List<OooO> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OooO oooO2 = this.mOnPageChangeListeners.get(i3);
                if (oooO2 != null) {
                    oooO2.onPageScrolled(i, f, i2);
                }
            }
        }
        OooO oooO3 = this.mInternalPageChangeListener;
        if (oooO3 != null) {
            oooO3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        OooO oooO = this.mOnPageChangeListener;
        if (oooO != null) {
            oooO.onPageSelected(i);
        }
        List<OooO> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO oooO2 = this.mOnPageChangeListeners.get(i2);
                if (oooO2 != null) {
                    oooO2.onPageSelected(i);
                }
            }
        }
        OooO oooO3 = this.mInternalPageChangeListener;
        if (oooO3 != null) {
            oooO3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        OooO oooO = this.mOnPageChangeListener;
        if (oooO != null) {
            oooO.onPageScrollStateChanged(i);
        }
        List<OooO> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO oooO2 = this.mOnPageChangeListeners.get(i2);
                if (oooO2 != null) {
                    oooO2.onPageScrollStateChanged(i);
                }
            }
        }
        OooO oooO3 = this.mInternalPageChangeListener;
        if (oooO3 != null) {
            oooO3.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C5084OooO0o0 infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        C5084OooO0o0 oooO0o0 = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mItems.size()) {
            C5084OooO0o0 oooO0o02 = this.mItems.get(i3);
            if (!z && oooO0o02.f14708OooO00o != (i = i2 + 1)) {
                oooO0o02 = this.mTempItem;
                oooO0o02.OooO0O0 = f + f3 + f2;
                oooO0o02.f14708OooO00o = i;
                oooO0o02.OooO00o = this.mAdapter.getPageWidth(i);
                i3--;
            }
            f = oooO0o02.OooO0O0;
            float f4 = oooO0o02.OooO00o + f + f2;
            if (!z && scrollX < f) {
                return oooO0o0;
            }
            if (scrollX < f4 || i3 == this.mItems.size() - 1) {
                return oooO0o02;
            }
            i2 = oooO0o02.f14708OooO00o;
            f3 = oooO0o02.OooO00o;
            i3++;
            oooO0o0 = oooO0o02;
            z = false;
        }
        return oooO0o0;
    }

    public static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C5084OooO0o0 infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = infoForCurrentScrollPosition.f14708OooO00o;
            float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.OooO0O0) / (infoForCurrentScrollPosition.OooO00o + (((float) i2) / f));
            this.mCalledSuper = false;
            onPageScrolled(i4, f2, (int) (((float) i3) * f2));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C5084OooO0o0 oooO0o0 = this.mItems.get(0);
        ArrayList<C5084OooO0o0> arrayList = this.mItems;
        C5084OooO0o0 oooO0o02 = arrayList.get(arrayList.size() - 1);
        if (oooO0o0.f14708OooO00o != 0) {
            f3 = oooO0o0.OooO0O0 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (oooO0o02.f14708OooO00o != this.mAdapter.getCount() - 1) {
            f4 = oooO0o02.OooO0O0 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C5084OooO0o0 infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.OooO0O0, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((OooO0o) getChildAt(i).getLayoutParams()).f14706OooO00o) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        C5084OooO0o0 infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.OooO0O0, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C5084OooO0o0 infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f14708OooO00o == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public C5084OooO0o0 addNewItem(int i, int i2) {
        C5084OooO0o0 oooO0o0 = new C5084OooO0o0();
        oooO0o0.f14708OooO00o = i;
        oooO0o0.f14709OooO00o = this.mAdapter.instantiateItem((ViewGroup) this, i);
        oooO0o0.OooO00o = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(oooO0o0);
        } else {
            this.mItems.add(i2, oooO0o0);
        }
        return oooO0o0;
    }

    public void addOnAdapterChangeListener(@NonNull AbstractC5086OooO0oo oooO0oo) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(oooO0oo);
    }

    public void addOnPageChangeListener(@NonNull OooO oooO) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(oooO);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C5084OooO0o0 infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f14708OooO00o == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        OooO0o oooO0o = (OooO0o) layoutParams;
        boolean isDecorView = oooO0o.f14706OooO00o | isDecorView(view);
        oooO0o.f14706OooO00o = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (oooO0o == null || !isDecorView) {
            oooO0o.f14707OooO0O0 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooO0o) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OooO> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m14597OooO0o0((View) this);
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C5084OooO0o0 oooO0o0 = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(oooO0o0.f14709OooO00o);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, oooO0o0.f14708OooO00o, oooO0o0.f14709OooO00o);
                    int i3 = this.mCurItem;
                    if (i3 == oooO0o0.f14708OooO00o) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = oooO0o0.f14708OooO00o;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        oooO0o0.f14708OooO00o = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                OooO0o oooO0o = (OooO0o) getChildAt(i5).getLayoutParams();
                if (!oooO0o.f14706OooO00o) {
                    oooO0o.OooO00o = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C5084OooO0o0 infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f14708OooO00o == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public void draw(Canvas canvas) {
        AbstractC7314o0O0Oo0O o0o0oo0o;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (o0o0oo0o = this.mAdapter) != null && o0o0oo0o.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C5084OooO0o0 infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f14708OooO00o, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.OooO0O0) / infoForCurrentScrollPosition.OooO00o, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C5084OooO0o0 oooO0o0 = this.mItems.get(0);
            ArrayList<C5084OooO0o0> arrayList = this.mItems;
            C5084OooO0o0 oooO0o02 = arrayList.get(arrayList.size() - 1);
            if (oooO0o0.f14708OooO00o != 0) {
                f2 = oooO0o0.OooO0O0 * clientWidth;
            }
            if (oooO0o02.f14708OooO00o != this.mAdapter.getCount() - 1) {
                f3 = oooO0o02.OooO0O0 * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO0o();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public AbstractC7314o0O0Oo0O getAdapter() {
        return this.mAdapter;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((OooO0o) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).OooO0OO;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C5084OooO0o0 infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public C5084OooO0o0 infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C5084OooO0o0 oooO0o0 = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, oooO0o0.f14709OooO00o)) {
                return oooO0o0;
            }
        }
        return null;
    }

    public C5084OooO0o0 infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C5084OooO0o0 oooO0o0 = this.mItems.get(i2);
            if (oooO0o0.f14708OooO00o == i) {
                return oooO0o0;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.OooO00o(this, new C5085OooO0oO());
        if (ViewCompat.m14581OooO0O0((View) this) == 0) {
            ViewCompat.OooO0o((View) this, 1);
        }
        ViewCompat.OooO00o(this, new C5083OooO0Oo());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.mPageMargin) / f3;
            int i = 0;
            C5084OooO0o0 oooO0o0 = this.mItems.get(0);
            float f5 = oooO0o0.OooO0O0;
            int size = this.mItems.size();
            int i2 = oooO0o0.f14708OooO00o;
            int i3 = this.mItems.get(size - 1).f14708OooO00o;
            while (i2 < i3) {
                while (i2 > oooO0o0.f14708OooO00o && i < size) {
                    i++;
                    oooO0o0 = this.mItems.get(i);
                }
                if (i2 == oooO0o0.f14708OooO00o) {
                    float f6 = oooO0o0.OooO0O0;
                    float f7 = oooO0o0.OooO00o;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i2);
                    f = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                if (((float) this.mPageMargin) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f == 0.0f || isGutterDrag(this.mLastMotionX, f) || !canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                    if (abs > ((float) this.mTouchSlop) && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        this.mLastMotionX = f > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.mTouchSlop)) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        ViewCompat.m14597OooO0o0((View) this);
                    }
                } else {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    @androidx.annotation.CallSuper
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C5084OooO0o0 infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f14708OooO00o == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        AbstractC7314o0O0Oo0O o0o0oo0o = this.mAdapter;
        if (o0o0oo0o != null) {
            o0o0oo0o.restoreState(savedState.OooO0O0, savedState.OooO00o);
            setCurrentItemInternal(savedState.o00oO0O, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.o00oO0O;
        this.mRestoredAdapterState = savedState.OooO0O0;
        this.mRestoredClassLoader = savedState.OooO00o;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.o00oO0O = this.mCurItem;
        AbstractC7314o0O0Oo0O o0o0oo0o = this.mAdapter;
        if (o0o0oo0o != null) {
            savedState.OooO0O0 = o0o0oo0o.saveState();
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC7314o0O0Oo0O o0o0oo0o;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (o0o0oo0o = this.mAdapter) == null || o0o0oo0o.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x2 - f > 0.0f ? f + ((float) this.mTouchSlop) : f - ((float) this.mTouchSlop);
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C5084OooO0o0 infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f2 = (float) clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f14708OooO00o, ((((float) scrollX) / f2) - infoForCurrentScrollPosition.OooO0O0) / (infoForCurrentScrollPosition.OooO00o + (((float) this.mPageMargin) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z = resetTouch();
        }
        if (z) {
            ViewCompat.m14597OooO0o0((View) this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        AbstractC7314o0O0Oo0O o0o0oo0o = this.mAdapter;
        if (o0o0oo0o == null || this.mCurItem >= o0o0oo0o.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull AbstractC5086OooO0oo oooO0oo) {
        List<AbstractC5086OooO0oo> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(oooO0oo);
        }
    }

    public void removeOnPageChangeListener(@NonNull OooO oooO) {
        List<OooO> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(oooO);
        }
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable AbstractC7314o0O0Oo0O o0o0oo0o) {
        AbstractC7314o0O0Oo0O o0o0oo0o2 = this.mAdapter;
        if (o0o0oo0o2 != null) {
            o0o0oo0o2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C5084OooO0o0 oooO0o0 = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, oooO0o0.f14708OooO00o, oooO0o0.f14709OooO00o);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        AbstractC7314o0O0Oo0O o0o0oo0o3 = this.mAdapter;
        this.mAdapter = o0o0oo0o;
        this.mExpectedAdapterCount = 0;
        if (o0o0oo0o != null) {
            if (this.mObserver == null) {
                this.mObserver = new OooOO0O();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<AbstractC5086OooO0oo> list = this.mAdapterChangeListeners;
        if (!(list == null || list.isEmpty())) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).OooO00o(this, o0o0oo0o3, o0o0oo0o);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public OooO setInternalPageChangeListener(OooO oooO) {
        OooO oooO2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = oooO;
        return oooO2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            String str = "Requested offscreen page limit " + i + " too small; defaulting to " + 1;
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OooO oooO) {
        this.mOnPageChangeListener = oooO;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable OooOO0 oooOO0) {
        setPageTransformer(z, oooOO0, 2);
    }

    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public static class OooO0o extends ViewGroup.LayoutParams {
        public float OooO00o = 0.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f14705OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14706OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14707OooO0O0;
        public int OooO0OO;

        public OooO0o() {
            super(-1, -1);
        }

        public OooO0o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f14705OooO00o = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0o(getContext(), attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        AbstractC7314o0O0Oo0O o0o0oo0o = this.mAdapter;
        boolean z3 = false;
        if (o0o0oo0o == null || o0o0oo0o.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f14710OooO00o = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void setPageTransformer(boolean z, @Nullable OooOO0 oooOO0, int i) {
        int i2 = 1;
        boolean z2 = oooOO0 != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = oooOO0;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i6 = i - i4;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i6)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i6, i7, min);
        ViewCompat.m14597OooO0o0((View) this);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C7009o000OoOo.m18256OooO00o(getContext(), i));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }
}
