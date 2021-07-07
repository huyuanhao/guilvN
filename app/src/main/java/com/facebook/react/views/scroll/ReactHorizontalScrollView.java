package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import com.p118pd.sdk.C7074o00O0oo;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup {
    @Nullable
    public static Field sScrollerField;
    public static boolean sTriedToGetScrollerField;
    public boolean mActivelyScrolling;
    @Nullable
    public Rect mClippingRect;
    public float mDecelerationRate;
    public boolean mDragging;
    @Nullable
    public Drawable mEndBackground;
    public int mEndFillColor;
    @Nullable
    public FpsListener mFpsListener;
    public final OnScrollDispatchHelper mOnScrollDispatchHelper;
    @Nullable
    public String mOverflow;
    public boolean mPagingEnabled;
    @Nullable
    public Runnable mPostTouchRunnable;
    public ReactViewBackgroundManager mReactBackgroundManager;
    public final Rect mRect;
    public boolean mRemoveClippedSubviews;
    public boolean mScrollEnabled;
    @Nullable
    public String mScrollPerfTag;
    @Nullable
    public final OverScroller mScroller;
    public boolean mSendMomentumEvents;
    public int mSnapInterval;
    @Nullable
    public List<Integer> mSnapOffsets;
    public boolean mSnapToEnd;
    public boolean mSnapToStart;
    public final VelocityHelper mVelocityHelper;

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void disableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            Assertions.assertNotNull(this.mFpsListener);
            Assertions.assertNotNull(this.mScrollPerfTag);
            this.mFpsListener.disable(this.mScrollPerfTag);
        }
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            Assertions.assertNotNull(this.mFpsListener);
            Assertions.assertNotNull(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void flingAndSnap(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (getChildCount() > 0) {
            if (this.mSnapInterval == 0 && this.mSnapOffsets == null) {
                smoothScrollAndSnap(i);
                return;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int predictFinalScrollPosition = predictFinalScrollPosition(i);
            int width = (getWidth() - ViewCompat.m14615OooOOOO((View) this)) - ViewCompat.m14611OooOOO((View) this);
            boolean z = C7074o00O0oo.OooO0O0(Locale.getDefault()) == 1;
            if (z) {
                predictFinalScrollPosition = max - predictFinalScrollPosition;
                i2 = -i;
            } else {
                i2 = i;
            }
            List<Integer> list = this.mSnapOffsets;
            if (list != null) {
                i6 = list.get(0).intValue();
                List<Integer> list2 = this.mSnapOffsets;
                i5 = list2.get(list2.size() - 1).intValue();
                i3 = max;
                i4 = 0;
                for (int i8 = 0; i8 < this.mSnapOffsets.size(); i8++) {
                    int intValue = this.mSnapOffsets.get(i8).intValue();
                    if (intValue <= predictFinalScrollPosition && predictFinalScrollPosition - intValue < predictFinalScrollPosition - i4) {
                        i4 = intValue;
                    }
                    if (intValue >= predictFinalScrollPosition && intValue - predictFinalScrollPosition < i3 - predictFinalScrollPosition) {
                        i3 = intValue;
                    }
                }
            } else {
                double snapInterval = (double) getSnapInterval();
                double d = (double) predictFinalScrollPosition;
                Double.isNaN(d);
                Double.isNaN(snapInterval);
                double d2 = d / snapInterval;
                double floor = Math.floor(d2);
                Double.isNaN(snapInterval);
                double ceil = Math.ceil(d2);
                Double.isNaN(snapInterval);
                i5 = max;
                i4 = (int) (floor * snapInterval);
                i3 = Math.min((int) (ceil * snapInterval), max);
                i6 = 0;
            }
            int i9 = predictFinalScrollPosition - i4;
            int i10 = i3 - predictFinalScrollPosition;
            int i11 = i9 < i10 ? i4 : i3;
            int scrollX = getScrollX();
            if (z) {
                scrollX = max - scrollX;
            }
            if (this.mSnapToEnd || predictFinalScrollPosition < i5) {
                if (this.mSnapToStart || predictFinalScrollPosition > i6) {
                    if (i2 > 0) {
                        double d3 = (double) i10;
                        Double.isNaN(d3);
                        i2 += (int) (d3 * 10.0d);
                        predictFinalScrollPosition = i3;
                    } else if (i2 < 0) {
                        double d4 = (double) i9;
                        Double.isNaN(d4);
                        i2 -= (int) (d4 * 10.0d);
                        predictFinalScrollPosition = i4;
                    } else {
                        predictFinalScrollPosition = i11;
                    }
                } else if (scrollX > i6) {
                    predictFinalScrollPosition = i6;
                }
            } else if (scrollX < i5) {
                predictFinalScrollPosition = i5;
            }
            int min = Math.min(Math.max(0, predictFinalScrollPosition), max);
            if (z) {
                min = max - min;
                i2 = -i2;
            }
            OverScroller overScroller = this.mScroller;
            if (overScroller != null) {
                this.mActivelyScrolling = true;
                int scrollX2 = getScrollX();
                int scrollY = getScrollY();
                if (i2 != 0) {
                    i7 = i2;
                } else {
                    i7 = min - getScrollX();
                }
                overScroller.fling(scrollX2, scrollY, i7, 0, min, min, 0, 0, (min == 0 || min == max) ? width / 2 : 0, 0);
                postInvalidateOnAnimation();
                return;
            }
            smoothScrollTo(min, getScrollY());
        }
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = sScrollerField;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.mSnapInterval;
        if (i != 0) {
            return i;
        }
        return getWidth();
    }

    private void handlePostTouchScrolling(int i, int i2) {
        if ((this.mSendMomentumEvents || this.mPagingEnabled || isScrollPerfLoggingEnabled()) && this.mPostTouchRunnable == null) {
            if (this.mSendMomentumEvents) {
                ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i, i2);
            }
            this.mActivelyScrolling = false;
            RunnableC08731 r3 = new Runnable() {
                /* class com.facebook.react.views.scroll.ReactHorizontalScrollView.RunnableC08731 */
                public boolean mSnappingToPage = false;

                public void run() {
                    if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                        ReactHorizontalScrollView.this.mActivelyScrolling = false;
                        ViewCompat.OooO00o(ReactHorizontalScrollView.this, this, 20);
                    } else if (!ReactHorizontalScrollView.this.mPagingEnabled || this.mSnappingToPage) {
                        if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                            ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                        }
                        ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                        ReactHorizontalScrollView.this.disableFpsListener();
                    } else {
                        this.mSnappingToPage = true;
                        ReactHorizontalScrollView.this.flingAndSnap(0);
                        ViewCompat.OooO00o(ReactHorizontalScrollView.this, this, 20);
                    }
                }
            };
            this.mPostTouchRunnable = r3;
            ViewCompat.OooO00o(this, r3, 20);
        }
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private int predictFinalScrollPosition(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.mDecelerationRate);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - ViewCompat.m14615OooOOOO((View) this)) - ViewCompat.m14611OooOOO((View) this)) / 2, 0);
        return overScroller.getFinalX();
    }

    private void smoothScrollAndSnap(int i) {
        double snapInterval = (double) getSnapInterval();
        double scrollX = (double) getScrollX();
        double predictFinalScrollPosition = (double) predictFinalScrollPosition(i);
        Double.isNaN(scrollX);
        Double.isNaN(snapInterval);
        double d = scrollX / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
        Double.isNaN(predictFinalScrollPosition);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(predictFinalScrollPosition / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d2 = (double) round;
        Double.isNaN(d2);
        Double.isNaN(snapInterval);
        double d3 = d2 * snapInterval;
        if (d3 != scrollX) {
            this.mActivelyScrolling = true;
            smoothScrollTo((int) d3, getScrollY());
        }
    }

    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View childAt = getChildAt(0);
            if (!(this.mEndBackground == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.mEndBackground.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    public void fling(int i) {
        int abs = (int) (((float) Math.abs(i)) * Math.signum(this.mOnScrollDispatchHelper.getXFlingVelocity()));
        if (this.mPagingEnabled) {
            flingAndSnap(abs);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.m14615OooOOOO((View) this)) - ViewCompat.m14611OooOOO((View) this)) / 2, 0);
            ViewCompat.m14597OooO0o0((View) this);
        } else {
            super.fling(abs);
        }
        handlePostTouchScrolling(abs, 0);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set((Rect) Assertions.assertNotNull(this.mClippingRect));
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public void onDraw(Canvas canvas) {
        getDrawingRect(this.mRect);
        String str = this.mOverflow;
        if (((str.hashCode() == 466743410 && str.equals(ViewProps.VISIBLE)) ? (char) 0 : 65535) != 0) {
            canvas.clipRect(this.mRect);
        }
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                ReactScrollViewHelper.emitScrollBeginDragEvent(this);
                this.mDragging = true;
                enableFpsListener();
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    public void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished() && this.mScroller.getCurrX() != this.mScroller.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.mScroller.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mActivelyScrolling = true;
        if (this.mOnScrollDispatchHelper.onScrollChanged(i, i2)) {
            if (this.mRemoveClippedSubviews) {
                updateClippingRect();
            }
            ReactScrollViewHelper.emitScrollEvent(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.mDragging) {
            float xVelocity = this.mVelocityHelper.getXVelocity();
            float yVelocity = this.mVelocityHelper.getYVelocity();
            ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
            this.mDragging = false;
            handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public void setBorderStyle(@Nullable String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setDecelerationRate(float f) {
        this.mDecelerationRate = f;
        OverScroller overScroller = this.mScroller;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.mEndFillColor) {
            this.mEndFillColor = i;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.mPagingEnabled = z;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.mSendMomentumEvents = z;
    }

    public void setSnapInterval(int i) {
        this.mSnapInterval = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.mSnapOffsets = list;
    }

    public void setSnapToEnd(boolean z) {
        this.mSnapToEnd = z;
    }

    public void setSnapToStart(boolean z) {
        this.mSnapToStart = z;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            Assertions.assertNotNull(this.mClippingRect);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            View childAt = getChildAt(0);
            if (childAt instanceof ReactClippingViewGroup) {
                ((ReactClippingViewGroup) childAt).updateClippingRect();
            }
        }
    }

    public ReactHorizontalScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mRect = new Rect();
        this.mOverflow = ViewProps.HIDDEN;
        this.mPagingEnabled = false;
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mSnapInterval = 0;
        this.mDecelerationRate = 0.985f;
        this.mSnapToStart = true;
        this.mSnapToEnd = true;
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mFpsListener = fpsListener;
        this.mScroller = getOverScrollerFromParent();
    }

    public void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }
}
