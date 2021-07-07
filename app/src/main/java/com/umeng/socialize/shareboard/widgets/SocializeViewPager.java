package com.umeng.socialize.shareboard.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
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
import android.widget.Scroller;
import com.umeng.socialize.shareboard.widgets.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocializeViewPager extends ViewGroup {
    public static final int CLOSE_ENOUGH = 2;
    public static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() {
        /* class com.umeng.socialize.shareboard.widgets.SocializeViewPager.C40002 */

        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    public static final int DEFAULT_GUTTER_SIZE = 16;
    public static final int DEFAULT_OFFSCREEN_PAGES = 1;
    public static final int DEFAULT_WIDTH_FACTOR = 1;
    public static final int INVALID_POINTER = -1;
    public static final int[] LAYOUT_ATTRS = {16842931};
    public static final int MAX_SETTLE_DURATION = 600;
    public static final int MIN_DISTANCE_FOR_FLING = 25;
    public static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "ViewPager";
    public static final Interpolator sInterpolator = new Interpolator() {
        /* class com.umeng.socialize.shareboard.widgets.SocializeViewPager.animationInterpolatorC40013 */

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int mActivePointerId = -1;
    public SocializePagerAdapter mAdapter;
    public boolean mCalledSuper;
    public int mCloseEnough;
    public int mCurPosition;
    public int mDefaultGutterSize;
    public final Runnable mEndScrollRunnable = new Runnable() {
        /* class com.umeng.socialize.shareboard.widgets.SocializeViewPager.RunnableC39991 */

        public void run() {
            SocializeViewPager.this.setScrollState(0);
            SocializeViewPager.this.populate();
        }
    };
    public int mExpectedAdapterCount;
    public boolean mFirstLayout;
    public float mFirstOffset;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public List<ItemInfo> mItems = new ArrayList();
    public float mLastMotionX;
    public float mLastMotionY;
    public float mLastOffset;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public PagerObserver mObserver;
    public int mOffscreenPageLimit = 1;
    public List<OnPageChangeListener> mOnPageChangeListeners;
    public boolean mPopulatePending;
    public Parcelable mRestoredAdapterState = null;
    public ClassLoader mRestoredClassLoader = null;
    public int mRestoredCurItem = -1;
    public int mScrollState = 0;
    public Scroller mScroller;
    public final ItemInfo mTempItem = new ItemInfo();
    public final Rect mTempRect = new Rect();
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;

    public static class ItemInfo {
        public Object object;
        public float offset;
        public int position;
        public boolean scrolling;
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        public void onChanged() {
            SocializeViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            SocializeViewPager.this.dataSetChanged();
        }
    }

    public SocializeViewPager(Context context) {
        super(context);
        init();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i, ItemInfo itemInfo2) {
        int i2;
        int i3;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        if (itemInfo2 != null) {
            int i4 = itemInfo2.position;
            int i5 = itemInfo.position;
            if (i4 < i5) {
                int i6 = 0;
                float f = itemInfo2.offset + 1.0f + 0.0f;
                while (true) {
                    i4++;
                    if (i4 > itemInfo.position || i6 >= this.mItems.size()) {
                        break;
                    }
                    ItemInfo itemInfo5 = this.mItems.get(i6);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i4 > itemInfo4.position && i6 < this.mItems.size() - 1) {
                            i6++;
                            itemInfo5 = this.mItems.get(i6);
                        }
                    }
                    while (i4 < itemInfo4.position) {
                        f += this.mAdapter.getPageWidth(i4) + 0.0f;
                        i4++;
                    }
                    itemInfo4.offset = f;
                    f += 1.0f;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f2 = itemInfo2.offset;
                while (true) {
                    i4--;
                    if (i4 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i4 < itemInfo3.position && size > 0) {
                            size--;
                            itemInfo6 = this.mItems.get(size);
                        }
                    }
                    while (i4 > itemInfo3.position) {
                        f2 -= this.mAdapter.getPageWidth(i4) + 0.0f;
                        i4--;
                    }
                    f2 -= 1.0f;
                    itemInfo3.offset = f2;
                }
            }
        }
        int size2 = this.mItems.size();
        float f3 = itemInfo.offset;
        int i7 = itemInfo.position;
        int i8 = i7 - 1;
        this.mFirstOffset = i7 == 0 ? f3 : -3.4028235E38f;
        int i9 = count - 1;
        this.mLastOffset = itemInfo.position == i9 ? (itemInfo.offset + 1.0f) - 1.0f : Float.MAX_VALUE;
        int i10 = i - 1;
        while (i10 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i10);
            while (true) {
                i3 = itemInfo7.position;
                if (i8 <= i3) {
                    break;
                }
                f3 -= this.mAdapter.getPageWidth(i8) + 0.0f;
                i8--;
            }
            f3 -= 1.0f;
            itemInfo7.offset = f3;
            if (i3 == 0) {
                this.mFirstOffset = f3;
            }
            i10--;
            i8--;
        }
        float f4 = itemInfo.offset + 1.0f + 0.0f;
        int i11 = itemInfo.position + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i12);
            while (true) {
                i2 = itemInfo8.position;
                if (i11 >= i2) {
                    break;
                }
                f4 += this.mAdapter.getPageWidth(i11) + 0.0f;
                i11++;
            }
            if (i2 == i9) {
                this.mLastOffset = (f4 + 1.0f) - 1.0f;
            }
            itemInfo8.offset = f4;
            f4 += 1.0f;
            i12++;
            i11++;
        }
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2 && (!this.mScroller.isFinished())) {
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
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurPosition ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        List<ItemInfo> list = this.mItems;
        return Math.max(this.mItems.get(0).position, Math.min(i, list.get(list.size() - 1).position));
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrolled(i, f, i2);
                }
            }
        }
    }

    private void dispatchOnPageSelected(int i) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageSelected(i);
                }
            }
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
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

    private ItemInfo infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        ItemInfo itemInfo = null;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        float f = 0.0f;
        while (i3 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i3);
            if (!z && itemInfo2.position != (i = i2 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f + 0.0f + 0.0f;
                itemInfo2.position = i;
                i3--;
            }
            f = itemInfo2.offset;
            float f2 = 1.0f + f + 0.0f;
            if (!z && scrollX < f) {
                return itemInfo;
            }
            if (scrollX < f2 || i3 == this.mItems.size() - 1) {
                return itemInfo2;
            }
            i2 = itemInfo2.position;
            i3++;
            itemInfo = itemInfo2;
            z = false;
        }
        return itemInfo;
    }

    private void init() {
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
        this.mCloseEnough = (int) (2.0f * f);
        this.mFlingDistance = (int) (25.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.setOnApplyWindowInsetsListener(this, new ViewCompat.OnApplyWindowInsetsListener() {
            /* class com.umeng.socialize.shareboard.widgets.SocializeViewPager.C40024 */

            @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = SocializeViewPager.this.mTempRect;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = SocializeViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(SocializeViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
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
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = infoForCurrentScrollPosition.position;
            float f = (float) clientWidth;
            float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.offset) / 1.0f;
            this.mCalledSuper = false;
            onPageScrolled(i2, f2, (int) (f * f2));
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
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z2 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        List<ItemInfo> list = this.mItems;
        boolean z3 = true;
        ItemInfo itemInfo2 = list.get(list.size() - 1);
        if (itemInfo.position != 0) {
            f3 = itemInfo.offset * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f4 = itemInfo2.offset * clientWidth;
            z3 = false;
        }
        if (scrollX < f3) {
            scrollX = f3;
            z2 = z;
        } else if (scrollX > f4) {
            scrollX = f4;
            z2 = z3;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void populate() {
        populate(this.mCurPosition);
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            ItemInfo infoForPosition = infoForPosition(this.mCurPosition);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.offset, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
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

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        return true;
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        ItemInfo infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset))) : 0;
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

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ItemInfo infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurPosition) {
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

    public ItemInfo addNewItem(int i, int i2) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i2, itemInfo);
        }
        return itemInfo;
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurPosition) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.isDecor | false;
        layoutParams2.isDecor = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !z) {
            layoutParams2.needsMeasure = true;
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.shareboard.widgets.SocializeViewPager.arrowScroll(int):boolean");
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
        if (!z || !ViewCompat.canScrollHorizontally(view, -i)) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
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
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurPosition;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i3 = this.mCurPosition;
                    if (i3 == itemInfo.position) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = itemInfo.position;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurPosition) {
                            i = itemPosition;
                        }
                        itemInfo.position = itemPosition;
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
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurPosition && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return arrowScroll(17);
            }
            if (keyCode == 22) {
                return arrowScroll(66);
            }
            if (keyCode == 61 && Build.VERSION.SDK_INT >= 11) {
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    return arrowScroll(2);
                }
                if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public int getCurrentItem() {
        return this.mCurPosition;
    }

    public ItemInfo infoForAnyChild(View view) {
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

    public ItemInfo infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = this.mItems.get(i2);
            if (itemInfo.position == i) {
                return itemInfo;
            }
        }
        return null;
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
                    } else if (abs2 > ((float) this.mTouchSlop)) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        ViewCompat.postInvalidateOnAnimation(this);
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

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ItemInfo infoForChild;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i7 = (i5 - paddingLeft) - paddingRight;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.isDecor && (infoForChild = infoForChild(childAt)) != null) {
                    float f = (float) i7;
                    int i9 = ((int) (infoForChild.offset * f)) + paddingLeft;
                    if (layoutParams.needsMeasure) {
                        layoutParams.needsMeasure = false;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt.layout(i9, paddingTop, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + paddingTop);
                }
            }
        }
        if (this.mFirstLayout) {
            scrollToItem(this.mCurPosition, false, 0, false);
        }
        this.mFirstLayout = false;
    }

    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft * 1, 1073741824), makeMeasureSpec);
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        dispatchOnPageScrolled(i, f, i2);
        this.mCalledSuper = true;
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        ItemInfo infoForChild;
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
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurPosition && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, 0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SocializePagerAdapter socializePagerAdapter;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (socializePagerAdapter = this.mAdapter) == null || socializePagerAdapter.getCount() == 0) {
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
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurPosition, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / 1.0f, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z = resetTouch();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurPosition;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        SocializePagerAdapter socializePagerAdapter = this.mAdapter;
        if (socializePagerAdapter == null || this.mCurPosition >= socializePagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurPosition + 1, true);
        return true;
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(SocializePagerAdapter socializePagerAdapter) {
        SocializePagerAdapter socializePagerAdapter2 = this.mAdapter;
        if (socializePagerAdapter2 != null) {
            socializePagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                ItemInfo itemInfo = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeAllViews();
            this.mCurPosition = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = socializePagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (socializePagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
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
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            dispatchOnScrollStateChanged(i);
        }
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public int childIndex;
        public int gravity;
        public boolean isDecor;
        public boolean needsMeasure;
        public int position;
        public float widthFactor = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SocializeViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r9 == r10) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populate(int r18) {
        /*
        // Method dump skipped, instructions count: 609
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.shareboard.widgets.SocializeViewPager.populate(int):void");
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        SocializePagerAdapter socializePagerAdapter = this.mAdapter;
        if (socializePagerAdapter != null && socializePagerAdapter.getCount() > 0) {
            if (z2 || this.mCurPosition != i || this.mItems.size() == 0) {
                boolean z3 = false;
                if (i < 0) {
                    i = 0;
                } else if (i >= this.mAdapter.getCount()) {
                    i = this.mAdapter.getCount() - 1;
                }
                int i3 = this.mOffscreenPageLimit;
                int i4 = this.mCurPosition;
                if (i > i4 + i3 || i < i4 - i3) {
                    for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                        this.mItems.get(i5).scrolling = true;
                    }
                }
                if (this.mCurPosition != i) {
                    z3 = true;
                }
                if (this.mFirstLayout) {
                    this.mCurPosition = i;
                    if (z3) {
                        dispatchOnPageSelected(i);
                    }
                    requestLayout();
                    return;
                }
                populate(i);
                scrollToItem(i, z, i2, z3);
            }
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() != 0) {
            Scroller scroller = this.mScroller;
            if (scroller != null && !scroller.isFinished()) {
                i4 = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
                this.mScroller.abortAnimation();
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
                i5 = (int) (((((float) Math.abs(i6)) / (f * this.mAdapter.getPageWidth(this.mCurPosition))) + 1.0f) * 100.0f);
            }
            int min = Math.min(i5, 600);
            this.mIsScrollStarted = false;
            this.mScroller.startScroll(i4, scrollY, i6, i7, min);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SocializeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SocializeViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public SocializeViewPager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
