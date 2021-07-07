package com.p118pd.sdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

/* renamed from: com.pd.sdk.o0O0O0o  reason: case insensitive filesystem */
public class C7290o0O0O0o extends ViewGroup implements AbstractC7103o00OOooo, AbstractC7100o00OOOoO {
    public static final int ALPHA_ANIMATION_DURATION = 300;
    public static final int ANIMATE_TO_START_DURATION = 200;
    public static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    public static final int CIRCLE_BG_LIGHT = -328966;
    @VisibleForTesting
    public static final int CIRCLE_DIAMETER = 40;
    @VisibleForTesting
    public static final int CIRCLE_DIAMETER_LARGE = 56;
    public static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    public static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    public static final float DRAG_RATE = 0.5f;
    public static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    public static final int[] LAYOUT_ATTRS = {16842766};
    public static final String LOG_TAG = C7290o0O0O0o.class.getSimpleName();
    public static final int MAX_ALPHA = 255;
    public static final float MAX_PROGRESS_ANGLE = 0.8f;
    public static final int SCALE_DOWN_DURATION = 150;
    public static final int STARTING_PROGRESS_ALPHA = 76;
    public int mActivePointerId;
    public Animation mAlphaMaxAnimation;
    public Animation mAlphaStartAnimation;
    public final Animation mAnimateToCorrectPosition;
    public final Animation mAnimateToStartPosition;
    public OooO mChildScrollUpCallback;
    public int mCircleDiameter;
    public C7295o0O0O0o0 mCircleView;
    public int mCircleViewIndex;
    public int mCurrentTargetOffsetTop;
    public int mCustomSlingshotDistance;
    public final DecelerateInterpolator mDecelerateInterpolator;
    public int mFrom;
    public float mInitialDownY;
    public float mInitialMotionY;
    public boolean mIsBeingDragged;
    public OooOO0 mListener;
    public int mMediumAnimationDuration;
    public boolean mNestedScrollInProgress;
    public final C7101o00OOoo mNestedScrollingChildHelper;
    public final C7129o00OoOoO mNestedScrollingParentHelper;
    public boolean mNotify;
    public int mOriginalOffsetTop;
    public final int[] mParentOffsetInWindow;
    public final int[] mParentScrollConsumed;
    public CircularProgressDrawable mProgress;
    public Animation.AnimationListener mRefreshListener;
    public boolean mRefreshing;
    public boolean mReturningToStart;
    public boolean mScale;
    public Animation mScaleAnimation;
    public Animation mScaleDownAnimation;
    public Animation mScaleDownToStartAnimation;
    public int mSpinnerOffsetEnd;
    public float mStartingScale;
    public View mTarget;
    public float mTotalDragDistance;
    public float mTotalUnconsumed;
    public int mTouchSlop;
    public boolean mUsingCustomStart;

    /* renamed from: com.pd.sdk.o0O0O0o$OooO */
    public interface OooO {
        boolean OooO00o(@NonNull C7290o0O0O0o o0o0o0o, @Nullable View view);
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO00o */
    public class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        public void onAnimationEnd(Animation animation) {
            OooOO0 oooOO0;
            C7290o0O0O0o o0o0o0o = C7290o0O0O0o.this;
            if (o0o0o0o.mRefreshing) {
                o0o0o0o.mProgress.setAlpha(255);
                C7290o0O0O0o.this.mProgress.start();
                C7290o0O0O0o o0o0o0o2 = C7290o0O0O0o.this;
                if (o0o0o0o2.mNotify && (oooOO0 = o0o0o0o2.mListener) != null) {
                    oooOO0.onRefresh();
                }
                C7290o0O0O0o o0o0o0o3 = C7290o0O0O0o.this;
                o0o0o0o3.mCurrentTargetOffsetTop = o0o0o0o3.mCircleView.getTop();
                return;
            }
            o0o0o0o.reset();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0O0 */
    public class OooO0O0 extends Animation {
        public OooO0O0() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C7290o0O0O0o.this.setAnimationProgress(f);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0OO */
    public class OooO0OO extends Animation {
        public OooO0OO() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C7290o0O0O0o.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0Oo  reason: case insensitive filesystem */
    public class C7291OooO0Oo extends Animation {
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ int o0ooOO0;

        public C7291OooO0Oo(int i, int i2) {
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            CircularProgressDrawable circularProgressDrawable = C7290o0O0O0o.this.mProgress;
            int i = this.o00oO0O;
            circularProgressDrawable.setAlpha((int) (((float) i) + (((float) (this.o0ooOO0 - i)) * f)));
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0o */
    public class OooO0o extends Animation {
        public OooO0o() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            C7290o0O0O0o o0o0o0o = C7290o0O0O0o.this;
            if (!o0o0o0o.mUsingCustomStart) {
                i = o0o0o0o.mSpinnerOffsetEnd - Math.abs(o0o0o0o.mOriginalOffsetTop);
            } else {
                i = o0o0o0o.mSpinnerOffsetEnd;
            }
            C7290o0O0O0o o0o0o0o2 = C7290o0O0O0o.this;
            int i2 = o0o0o0o2.mFrom;
            C7290o0O0O0o.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - o0o0o0o2.mCircleView.getTop());
            C7290o0O0O0o.this.mProgress.OooO00o(1.0f - f);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0o0  reason: case insensitive filesystem */
    public class animation.Animation$AnimationListenerC7292OooO0o0 implements Animation.AnimationListener {
        public animation.Animation$AnimationListenerC7292OooO0o0() {
        }

        public void onAnimationEnd(Animation animation) {
            C7290o0O0O0o o0o0o0o = C7290o0O0O0o.this;
            if (!o0o0o0o.mScale) {
                o0o0o0o.startScaleDownAnimation(null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0oO  reason: case insensitive filesystem */
    public class C7293OooO0oO extends Animation {
        public C7293OooO0oO() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C7290o0O0O0o.this.moveToStart(f);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooO0oo  reason: case insensitive filesystem */
    public class C7294OooO0oo extends Animation {
        public C7294OooO0oo() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C7290o0O0O0o o0o0o0o = C7290o0O0O0o.this;
            float f2 = o0o0o0o.mStartingScale;
            o0o0o0o.setAnimationProgress(f2 + ((-f2) * f));
            C7290o0O0O0o.this.moveToStart(f);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0o$OooOO0 */
    public interface OooOO0 {
        void onRefresh();
    }

    public C7290o0O0O0o(@NonNull Context context) {
        this(context, null);
    }

    private void animateOffsetToCorrectPosition(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.OooO00o(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i, animationListener);
            return;
        }
        this.mFrom = i;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.OooO00o(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void createProgressView() {
        this.mCircleView = new C7295o0O0O0o0(getContext(), CIRCLE_BG_LIGHT);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.OooO0O0(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void finishSpinner(float f) {
        if (f > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.OooO0O0(0.0f, 0.0f);
        animation.Animation$AnimationListenerC7292OooO0o0 oooO0o0 = null;
        if (!this.mScale) {
            oooO0o0 = new animation.Animation$AnimationListenerC7292OooO0o0();
        }
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, oooO0o0);
        this.mProgress.OooO00o(false);
    }

    private boolean isAnimationRunning(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void moveSpinner(float f) {
        this.mProgress.OooO00o(true);
        float min = Math.min(1.0f, Math.abs(f / this.mTotalDragDistance));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, (double) AbstractC8352oOoOOoO0.OooO0O0)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.mTotalDragDistance;
        int i = this.mCustomSlingshotDistance;
        if (i <= 0) {
            i = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.mOriginalOffsetTop + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f / this.mTotalDragDistance));
        }
        if (f < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.OooO0O0(0.0f, Math.min(0.8f, max * 0.8f));
        this.mProgress.OooO00o(Math.min(1.0f, max));
        this.mProgress.OooO0OO((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.mCurrentTargetOffsetTop);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i) {
        this.mCircleView.getBackground().setAlpha(i);
        this.mProgress.setAlpha(i);
    }

    private Animation startAlphaAnimation(int i, int i2) {
        C7291OooO0Oo oooO0Oo = new C7291OooO0Oo(i, i2);
        oooO0Oo.setDuration(300);
        this.mCircleView.OooO00o((Animation.AnimationListener) null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(oooO0Oo);
        return oooO0Oo;
    }

    private void startDragging(float f) {
        float f2 = this.mInitialDownY;
        int i = this.mTouchSlop;
        if (f - f2 > ((float) i) && !this.mIsBeingDragged) {
            this.mInitialMotionY = f2 + ((float) i);
            this.mIsBeingDragged = true;
            this.mProgress.setAlpha(76);
        }
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    private void startScaleDownReturnToStartAnimation(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.mStartingScale = this.mCircleView.getScaleX();
        C7294OooO0oo oooO0oo = new C7294OooO0oo();
        this.mScaleDownToStartAnimation = oooO0oo;
        oooO0oo.setDuration(150);
        if (animationListener != null) {
            this.mCircleView.OooO00o(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.mScaleAnimation = oooO0O0;
        oooO0O0.setDuration((long) this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.OooO00o(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public boolean canChildScrollUp() {
        OooO oooO = this.mChildScrollUpCallback;
        if (oooO != null) {
            return oooO.OooO00o(this, this.mTarget);
        }
        View view = this.mTarget;
        if (view instanceof ListView) {
            return C7146o00o0000.m18515OooO00o((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mNestedScrollingChildHelper.OooO00o(f, f2, z);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mNestedScrollingChildHelper.OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.OooO00o(i, i2, iArr, iArr2);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mNestedScrollingChildHelper.OooO00o(i, i2, i3, i4, iArr);
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.mCircleViewIndex;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.OooO00o();
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.m18377OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.m18379OooO0O0();
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f) {
        int i = this.mFrom;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.mOriginalOffsetTop - i)) * f))) - this.mCircleView.getTop());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        ensureTarget();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.mActivePointerId;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    startDragging(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(findPointerIndex2);
        }
        return this.mIsBeingDragged;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            View view = this.mTarget;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                int measuredHeight2 = this.mCircleView.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.mCurrentTargetOffsetTop;
                this.mCircleView.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
            this.mCircleViewIndex = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.mCircleView) {
                    this.mCircleViewIndex = i3;
                    return;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.mTotalUnconsumed;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f - f2;
                    iArr[1] = i2;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i2 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
        int i5 = i4 + this.mParentOffsetInWindow[1];
        if (i5 < 0 && !canChildScrollUp()) {
            float abs = this.mTotalUnconsumed + ((float) Math.abs(i5));
            this.mTotalUnconsumed = abs;
            moveSpinner(abs);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mNestedScrollingParentHelper.OooO00o(view, view2, i);
        startNestedScroll(i & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.mReturningToStart && !this.mRefreshing && (i & 2) != 0;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.OooO00o(view);
        this.mNestedScrollInProgress = false;
        float f = this.mTotalUnconsumed;
        if (f > 0.0f) {
            finishSpinner(f);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.mIsBeingDragged) {
                this.mIsBeingDragged = false;
                finishSpinner((motionEvent.getY(findPointerIndex) - this.mInitialMotionY) * 0.5f);
            }
            this.mActivePointerId = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            startDragging(y);
            if (this.mIsBeingDragged) {
                float f = (y - this.mInitialMotionY) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                moveSpinner(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.mTarget instanceof AbsListView)) {
            View view = this.mTarget;
            if (view == null || ViewCompat.m14617OooOOOo(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f) {
        this.mCircleView.setScaleX(f);
        this.mCircleView.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        ensureTarget();
        this.mProgress.OooO00o(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C7009o000OoOo.OooO00o(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.mTotalDragDistance = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            reset();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void setNestedScrollingEnabled(boolean z) {
        this.mNestedScrollingChildHelper.OooO00o(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OooO oooO) {
        this.mChildScrollUpCallback = oooO;
    }

    public void setOnRefreshListener(@Nullable OooOO0 oooOO0) {
        this.mListener = oooOO0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.mCircleView.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(C7009o000OoOo.OooO00o(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.mSpinnerOffsetEnd = i;
        this.mScale = z;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.mScale = z;
        this.mOriginalOffsetTop = i;
        this.mSpinnerOffsetEnd = i2;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.mRefreshing == z) {
            setRefreshing(z, false);
            return;
        }
        this.mRefreshing = z;
        if (!this.mUsingCustomStart) {
            i = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
        } else {
            i = this.mSpinnerOffsetEnd;
        }
        setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.OooO0O0(i);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(@AbstractC0032Px int i) {
        this.mCustomSlingshotDistance = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.mCircleView.bringToFront();
        ViewCompat.OooO0Oo((View) this.mCircleView, i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean startNestedScroll(int i) {
        return this.mNestedScrollingChildHelper.OooO0O0(i);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        OooO0OO oooO0OO = new OooO0OO();
        this.mScaleDownAnimation = oooO0OO;
        oooO0OO.setDuration(150);
        this.mCircleView.OooO00o(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.OooO0O0();
    }

    public C7290o0O0O0o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new OooO00o();
        this.mAnimateToCorrectPosition = new OooO0o();
        this.mAnimateToStartPosition = new C7293OooO0oO();
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i;
        this.mTotalDragDistance = (float) i;
        this.mNestedScrollingParentHelper = new C7129o00OoOoO(this);
        this.mNestedScrollingChildHelper = new C7101o00OOoo(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i2;
        this.mOriginalOffsetTop = i2;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (z) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }
}
