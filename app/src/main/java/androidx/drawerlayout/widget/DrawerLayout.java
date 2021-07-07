package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7043o00O0000;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7092o00OOO0;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7157o00o0O00;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    public static final boolean ALLOW_EDGE_LOCK = false;
    public static final boolean CAN_HIDE_DESCENDANTS = (Build.VERSION.SDK_INT >= 19);
    public static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    public static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int DRAWER_ELEVATION = 10;
    public static final int[] LAYOUT_ATTRS = {16842931};
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int MIN_DRAWER_MARGIN = 64;
    public static final int MIN_FLING_VELOCITY = 400;
    public static final int PEEK_DELAY = 160;
    public static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final String TAG = "DrawerLayout";
    public static final int[] THEME_ATTRS = {16843828};
    public static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    public final OooO0OO mChildAccessibilityDelegate;
    public Rect mChildHitRect;
    public Matrix mChildInvertedMatrix;
    public boolean mChildrenCanceledTouch;
    public boolean mDisallowInterceptRequested;
    public boolean mDrawStatusBarBackground;
    public float mDrawerElevation;
    public int mDrawerState;
    public boolean mFirstLayout;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public Object mLastInsets;
    public final C5043OooO0oO mLeftCallback;
    public final C7157o00o0O00 mLeftDragger;
    @Nullable
    public AbstractC5041OooO0Oo mListener;
    public List<AbstractC5041OooO0Oo> mListeners;
    public int mLockModeEnd;
    public int mLockModeLeft;
    public int mLockModeRight;
    public int mLockModeStart;
    public int mMinDrawerMargin;
    public final ArrayList<View> mNonDrawerViews;
    public final C5043OooO0oO mRightCallback;
    public final C7157o00o0O00 mRightDragger;
    public int mScrimColor;
    public float mScrimOpacity;
    public Paint mScrimPaint;
    public Drawable mShadowEnd;
    public Drawable mShadowLeft;
    public Drawable mShadowLeftResolved;
    public Drawable mShadowRight;
    public Drawable mShadowRightResolved;
    public Drawable mShadowStart;
    public Drawable mStatusBarBackground;
    public CharSequence mTitleLeft;
    public CharSequence mTitleRight;

    public class OooO00o implements View.OnApplyWindowInsetsListener {
        public OooO00o() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public static final class OooO0OO extends C7087o00OO0o {
        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            super.onInitializeAccessibilityNodeInfo(view, o00oooo);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                o00oooo.OooO0Oo((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5041OooO0Oo {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f);

        void onDrawerStateChanged(int i);
    }

    public static abstract class OooO0o implements AbstractC5041OooO0Oo {
        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
        public void onDrawerClosed(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
        public void onDrawerOpened(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
        public void onDrawerSlide(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
        public void onDrawerStateChanged(int i) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0oO  reason: case insensitive filesystem */
    public class C5043OooO0oO extends C7157o00o0O00.OooO0OO {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7157o00o0O00 f14096OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Runnable f14097OooO00o = new OooO00o();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0oO$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                C5043OooO0oO.this.OooO00o();
            }
        }

        public C5043OooO0oO(int i) {
            this.OooO00o = i;
        }

        private void OooO0OO() {
            int i = 3;
            if (this.OooO00o == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        public void OooO00o(C7157o00o0O00 o00o0o00) {
            this.f14096OooO00o = o00o0o00;
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14639OooO00o(int i) {
            return false;
        }

        public void OooO0O0() {
            DrawerLayout.this.removeCallbacks(this.f14097OooO00o);
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14640OooO00o(View view, int i) {
            return DrawerLayout.this.isDrawerView(view) && DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.OooO00o) && DrawerLayout.this.getDrawerLockMode(view) == 0;
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO0O0(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f14097OooO00o, 160);
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO0O0(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(int i) {
            DrawerLayout.this.updateDrawerState(this.OooO00o, i, this.f14096OooO00o.m18545OooO00o());
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.setDrawerViewOffset(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, int i) {
            ((C5042OooO0o0) view.getLayoutParams()).f14094OooO00o = false;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, float f, float f2) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f14096OooO00o.OooO0Oo(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public void OooO00o() {
            View view;
            int i;
            int OooO0O0 = this.f14096OooO00o.OooO0O0();
            int i2 = 0;
            boolean z = this.OooO00o == 3;
            if (z) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + OooO0O0;
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
                i = DrawerLayout.this.getWidth() - OooO0O0;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                this.f14096OooO00o.OooO0O0(view, i, view.getTop());
                ((C5042OooO0o0) view.getLayoutParams()).f14094OooO00o = true;
                DrawerLayout.this.invalidate();
                OooO0OO();
                DrawerLayout.this.cancelChildViewTouch();
            }
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (view != null && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                this.f14096OooO00o.OooO00o(view, i2);
            }
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO00o(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO00o(View view, int i, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = z;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    public static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C5042OooO0o0) getChildAt(i).getLayoutParams()).f14094OooO00o) {
                return true;
            }
        }
        return false;
    }

    private boolean hasVisibleDrawer() {
        return findVisibleDrawer() != null;
    }

    public static boolean includeChildForAccessibility(View view) {
        return (ViewCompat.m14581OooO0O0(view) == 4 || ViewCompat.m14581OooO0O0(view) == 2) ? false : true;
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    private boolean mirror(Drawable drawable, int i) {
        if (drawable == null || !C7043o00O0000.m18319OooO0O0(drawable)) {
            return false;
        }
        C7043o00O0000.m18316OooO00o(drawable, i);
        return true;
    }

    private Drawable resolveLeftShadow() {
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        if (OooO0o2 == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, OooO0o2);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, OooO0o2);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        if (OooO0o2 == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, OooO0o2);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, OooO0o2);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || isDrawerView(childAt)) && (!z || childAt != view)) {
                ViewCompat.OooO0o(childAt, 4);
            } else {
                ViewCompat.OooO0o(childAt, 1);
            }
        }
    }

    public void addDrawerListener(@NonNull AbstractC5041OooO0Oo oooO0Oo) {
        if (oooO0Oo != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(oooO0Oo);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.mNonDrawerViews.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            ViewCompat.OooO0o(view, 4);
        } else {
            ViewCompat.OooO0o(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            ViewCompat.OooO00o(view, this.mChildAccessibilityDelegate);
        }
    }

    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5042OooO0o0) && super.checkLayoutParams(layoutParams);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C5042OooO0o0) getChildAt(i).getLayoutParams()).OooO00o);
        }
        this.mScrimOpacity = f;
        boolean OooO00o2 = this.mLeftDragger.OooO00o(true);
        boolean OooO00o3 = this.mRightDragger.OooO00o(true);
        if (OooO00o2 || OooO00o3) {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        C5042OooO0o0 oooO0o0 = (C5042OooO0o0) view.getLayoutParams();
        if ((oooO0o0.OooO0O0 & 1) == 1) {
            oooO0o0.OooO0O0 = 0;
            List<AbstractC5041OooO0Oo> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        C5042OooO0o0 oooO0o0 = (C5042OooO0o0) view.getLayoutParams();
        if ((oooO0o0.OooO0O0 & 1) == 0) {
            oooO0o0.OooO0O0 = 1;
            List<AbstractC5041OooO0Oo> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f) {
        List<AbstractC5041OooO0Oo> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.mScrimOpacity;
        if (f > 0.0f && isContentView) {
            int i4 = this.mScrimColor;
            this.mScrimPaint.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.OooO0O0()), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.OooO0O0()), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    public View findDrawerWithGravity(int i) {
        int OooO00o2 = C7092o00OOO0.OooO00o(i, ViewCompat.m14593OooO0o((View) this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == OooO00o2) {
                return childAt;
            }
        }
        return null;
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C5042OooO0o0) childAt.getLayoutParams()).OooO0O0 & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5042OooO0o0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5042OooO0o0) {
            return new C5042OooO0o0((C5042OooO0o0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5042OooO0o0((ViewGroup.MarginLayoutParams) layoutParams) : new C5042OooO0o0(layoutParams);
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i) {
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        if (i == 3) {
            int i2 = this.mLockModeLeft;
            if (i2 != 3) {
                return i2;
            }
            int i3 = OooO0o2 == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.mLockModeRight;
            if (i4 != 3) {
                return i4;
            }
            int i5 = OooO0o2 == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.mLockModeStart;
            if (i6 != 3) {
                return i6;
            }
            int i7 = OooO0o2 == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.mLockModeEnd;
            if (i8 != 3) {
                return i8;
            }
            int i9 = OooO0o2 == 0 ? this.mLockModeRight : this.mLockModeLeft;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    @Nullable
    public CharSequence getDrawerTitle(int i) {
        int OooO00o2 = C7092o00OOO0.OooO00o(i, ViewCompat.m14593OooO0o((View) this));
        if (OooO00o2 == 3) {
            return this.mTitleLeft;
        }
        if (OooO00o2 == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        return C7092o00OOO0.OooO00o(((C5042OooO0o0) view.getLayoutParams()).f14093OooO00o, ViewCompat.m14593OooO0o((View) this));
    }

    public float getDrawerViewOffset(View view) {
        return ((C5042OooO0o0) view.getLayoutParams()).OooO00o;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public boolean isContentView(View view) {
        return ((C5042OooO0o0) view.getLayoutParams()).f14093OooO00o == 0;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (isDrawerView(view)) {
            return (((C5042OooO0o0) view.getLayoutParams()).OooO0O0 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerView(View view) {
        int OooO00o2 = C7092o00OOO0.OooO00o(((C5042OooO0o0) view.getLayoutParams()).f14093OooO00o, ViewCompat.m14593OooO0o(view));
        return ((OooO00o2 & 3) == 0 && (OooO00o2 & 5) == 0) ? false : true;
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (isDrawerView(view)) {
            return ((C5042OooO0o0) view.getLayoutParams()).OooO00o > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.mLastInsets) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        return findVisibleDrawer != null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.mInLayout = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C5042OooO0o0 oooO0o0 = (C5042OooO0o0) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (oooO0o0.OooO00o * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (oooO0o0.OooO00o * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != oooO0o0.OooO00o;
                    int i10 = oooO0o0.f14093OooO00o & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    int i18 = oooO0o0.OooO00o > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.mLastInsets != null && ViewCompat.m14578OooO00o(this);
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C5042OooO0o0 oooO0o0 = (C5042OooO0o0) childAt.getLayoutParams();
                if (z) {
                    int OooO00o2 = C7092o00OOO0.OooO00o(oooO0o0.f14093OooO00o, OooO0o2);
                    if (ViewCompat.m14578OooO00o(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                            if (OooO00o2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (OooO00o2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (OooO00o2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (OooO00o2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin) - ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float OooO0O02 = ViewCompat.OooO0O0(childAt);
                        float f = this.mDrawerElevation;
                        if (OooO0O02 != f) {
                            ViewCompat.OooO0O0(childAt, f);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    boolean z4 = drawerViewAbsoluteGravity == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin, ((ViewGroup.MarginLayoutParams) oooO0o0).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin, ((ViewGroup.MarginLayoutParams) oooO0o0).height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this " + TAG + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        int i = savedState.o00oO0O;
        if (!(i == 0 || (findDrawerWithGravity = findDrawerWithGravity(i)) == null)) {
            openDrawer(findDrawerWithGravity);
        }
        int i2 = savedState.o0ooOO0;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.o0ooOOo;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.o0ooOoO;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.o0OOO0o;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C5042OooO0o0 oooO0o0 = (C5042OooO0o0) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = oooO0o0.OooO0O0 == 1;
            if (oooO0o0.OooO0O0 != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.o00oO0O = oooO0o0.f14093OooO00o;
            } else {
                i++;
            }
        }
        savedState.o0ooOO0 = this.mLockModeLeft;
        savedState.o0ooOOo = this.mLockModeRight;
        savedState.o0ooOoO = this.mLockModeStart;
        savedState.o0OOO0o = this.mLockModeEnd;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findOpenDrawer;
        this.mLeftDragger.OooO00o(motionEvent);
        this.mRightDragger.OooO00o(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View OooO00o2 = this.mLeftDragger.m18546OooO00o((int) x2, (int) y2);
            if (OooO00o2 != null && isContentView(OooO00o2)) {
                float f = x2 - this.mInitialMotionX;
                float f2 = y2 - this.mInitialMotionY;
                int OooO0OO2 = this.mLeftDragger.m18556OooO0OO();
                if (!((f * f) + (f2 * f2) >= ((float) (OooO0OO2 * OooO0OO2)) || (findOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                    z = false;
                    closeDrawers(z);
                    this.mDisallowInterceptRequested = false;
                }
            }
            z = true;
            closeDrawers(z);
            this.mDisallowInterceptRequested = false;
        } else if (action == 3) {
            closeDrawers(true);
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(@NonNull AbstractC5041OooO0Oo oooO0Oo) {
        List<AbstractC5041OooO0Oo> list;
        if (oooO0Oo != null && (list = this.mListeners) != null) {
            list.remove(oooO0Oo);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setChildInsets(Object obj, boolean z) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                ViewCompat.OooO0O0(childAt, this.mDrawerElevation);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(AbstractC5041OooO0Oo oooO0Oo) {
        AbstractC5041OooO0Oo oooO0Oo2 = this.mListener;
        if (oooO0Oo2 != null) {
            removeDrawerListener(oooO0Oo2);
        }
        if (oooO0Oo != null) {
            addDrawerListener(oooO0Oo);
        }
        this.mListener = oooO0Oo;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void setDrawerTitle(int i, @Nullable CharSequence charSequence) {
        int OooO00o2 = C7092o00OOO0.OooO00o(i, ViewCompat.m14593OooO0o((View) this));
        if (OooO00o2 == 3) {
            this.mTitleLeft = charSequence;
        } else if (OooO00o2 == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f) {
        C5042OooO0o0 oooO0o0 = (C5042OooO0o0) view.getLayoutParams();
        if (f != oooO0o0.OooO00o) {
            oooO0o0.OooO00o = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    public void setScrimColor(@ColorInt int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    public void updateDrawerState(int i, int i2, View view) {
        int OooO0Oo = this.mLeftDragger.m18558OooO0Oo();
        int OooO0Oo2 = this.mRightDragger.m18558OooO0Oo();
        int i3 = 2;
        if (OooO0Oo == 1 || OooO0Oo2 == 1) {
            i3 = 1;
        } else if (!(OooO0Oo == 2 || OooO0Oo2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C5042OooO0o0) view.getLayoutParams()).OooO00o;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i3 != this.mDrawerState) {
            this.mDrawerState = i3;
            List<AbstractC5041OooO0Oo> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i3);
                }
            }
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void closeDrawer(@NonNull View view, boolean z) {
        if (isDrawerView(view)) {
            C5042OooO0o0 oooO0o0 = (C5042OooO0o0) view.getLayoutParams();
            if (this.mFirstLayout) {
                oooO0o0.OooO00o = 0.0f;
                oooO0o0.OooO0O0 = 0;
            } else if (z) {
                oooO0o0.OooO0O0 |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.OooO0O0(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.OooO0O0(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(oooO0o0.f14093OooO00o, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void closeDrawers(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C5042OooO0o0 oooO0o0 = (C5042OooO0o0) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || oooO0o0.f14094OooO00o)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    z2 = this.mLeftDragger.OooO0O0(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.mRightDragger.OooO0O0(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                oooO0o0.f14094OooO00o = false;
            }
        }
        this.mLeftCallback.OooO0O0();
        this.mRightCallback.OooO0O0();
        if (z3) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5042OooO0o0(getContext(), attributeSet);
    }

    public void openDrawer(@NonNull View view, boolean z) {
        if (isDrawerView(view)) {
            C5042OooO0o0 oooO0o0 = (C5042OooO0o0) view.getLayoutParams();
            if (this.mFirstLayout) {
                oooO0o0.OooO00o = 1.0f;
                oooO0o0.OooO0O0 = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                oooO0o0.OooO0O0 |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.OooO0O0(view, 0, view.getTop());
                } else {
                    this.mRightDragger.OooO0O0(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(oooO0o0.f14093OooO00o, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new OooO0OO();
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.mLeftCallback = new C5043OooO0oO(3);
        this.mRightCallback = new C5043OooO0oO(5);
        C7157o00o0O00 OooO00o2 = C7157o00o0O00.OooO00o(this, 1.0f, this.mLeftCallback);
        this.mLeftDragger = OooO00o2;
        OooO00o2.OooO0O0(1);
        this.mLeftDragger.m18548OooO00o(f2);
        this.mLeftCallback.OooO00o(this.mLeftDragger);
        C7157o00o0O00 OooO00o3 = C7157o00o0O00.OooO00o(this, 1.0f, this.mRightCallback);
        this.mRightDragger = OooO00o3;
        OooO00o3.OooO0O0(2);
        this.mRightDragger.m18548OooO00o(f2);
        this.mRightCallback.OooO00o(this.mRightDragger);
        setFocusableInTouchMode(true);
        ViewCompat.OooO0o((View) this, 1);
        ViewCompat.OooO00o(this, new OooO0O0());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.m14578OooO00o((View) this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OooO00o());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
                try {
                    this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.mStatusBarBackground = null;
            }
        }
        this.mDrawerElevation = f * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    public void setDrawerLockMode(int i, int i2) {
        View findDrawerWithGravity;
        int OooO00o2 = C7092o00OOO0.OooO00o(i2, ViewCompat.m14593OooO0o((View) this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            (OooO00o2 == 3 ? this.mLeftDragger : this.mRightDragger).m18554OooO0O0();
        }
        if (i == 1) {
            View findDrawerWithGravity2 = findDrawerWithGravity(OooO00o2);
            if (findDrawerWithGravity2 != null) {
                closeDrawer(findDrawerWithGravity2);
            }
        } else if (i == 2 && (findDrawerWithGravity = findDrawerWithGravity(OooO00o2)) != null) {
            openDrawer(findDrawerWithGravity);
        }
    }

    public void setStatusBarBackground(int i) {
        this.mStatusBarBackground = i != 0 ? C7009o000OoOo.m18256OooO00o(getContext(), i) : null;
        invalidate();
    }

    public class OooO0O0 extends C7087o00OO0o {
        public final Rect OooO00o = new Rect();

        public OooO0O0() {
        }

        private void OooO00o(C7120o00OoOO o00oooo, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    o00oooo.m18417OooO00o(childAt);
                }
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null || (drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, o00oooo);
            } else {
                C7120o00OoOO OooO00o2 = C7120o00OoOO.OooO00o(o00oooo);
                super.onInitializeAccessibilityNodeInfo(view, OooO00o2);
                o00oooo.OooO0o0(view);
                ViewParent OooO00o3 = ViewCompat.m14571OooO00o(view);
                if (OooO00o3 instanceof View) {
                    o00oooo.OooO0Oo((View) OooO00o3);
                }
                OooO00o(o00oooo, OooO00o2);
                OooO00o2.m18415OooO00o();
                OooO00o(o00oooo, (ViewGroup) view);
            }
            o00oooo.OooO00o((CharSequence) DrawerLayout.class.getName());
            o00oooo.OooOO0O(false);
            o00oooo.OooOO0o(false);
            o00oooo.m18425OooO00o(C7120o00OoOO.OooO00o.OooO00o);
            o00oooo.m18425OooO00o(C7120o00OoOO.OooO00o.OooO0O0);
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void OooO00o(C7120o00OoOO o00oooo, C7120o00OoOO o00oooo2) {
            Rect rect = this.OooO00o;
            o00oooo2.OooO00o(rect);
            o00oooo.OooO0OO(rect);
            o00oooo2.OooO0O0(rect);
            o00oooo.OooO0Oo(rect);
            o00oooo.OooOo0O(o00oooo2.OooOo0O());
            o00oooo.OooO0o0(o00oooo2.m18442OooO0o0());
            o00oooo.OooO00o(o00oooo2.m18411OooO00o());
            o00oooo.OooO0O0(o00oooo2.m18428OooO0O0());
            o00oooo.OooOO0(o00oooo2.m18448OooOO0());
            o00oooo.OooO0o0(o00oooo2.m18443OooO0o0());
            o00oooo.OooOO0O(o00oooo2.OooOO0O());
            o00oooo.OooOO0o(o00oooo2.OooOO0o());
            o00oooo.OooO00o(o00oooo2.m18430OooO0O0());
            o00oooo.OooOo00(o00oooo2.OooOo00());
            o00oooo.OooOOOO(o00oooo2.OooOOOO());
            o00oooo.m18416OooO00o(o00oooo2.OooO00o());
        }
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0o0  reason: case insensitive filesystem */
    public static class C5042OooO0o0 extends ViewGroup.MarginLayoutParams {
        public static final int OooO0OO = 1;
        public static final int OooO0Oo = 2;
        public static final int OooO0o0 = 4;
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f14093OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14094OooO00o;
        public int OooO0O0;

        public C5042OooO0o0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14093OooO00o = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f14093OooO00o = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C5042OooO0o0(int i, int i2) {
            super(i, i2);
            this.f14093OooO00o = 0;
        }

        public C5042OooO0o0(int i, int i2, int i3) {
            this(i, i2);
            this.f14093OooO00o = i3;
        }

        public C5042OooO0o0(@NonNull C5042OooO0o0 oooO0o0) {
            super((ViewGroup.MarginLayoutParams) oooO0o0);
            this.f14093OooO00o = 0;
            this.f14093OooO00o = oooO0o0.f14093OooO00o;
        }

        public C5042OooO0o0(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14093OooO00o = 0;
        }

        public C5042OooO0o0(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14093OooO00o = 0;
        }
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public int o00oO0O = 0;
        public int o0OOO0o;
        public int o0ooOO0;
        public int o0ooOOo;
        public int o0ooOoO;

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

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.o00oO0O = parcel.readInt();
            this.o0ooOO0 = parcel.readInt();
            this.o0ooOOo = parcel.readInt();
            this.o0ooOoO = parcel.readInt();
            this.o0OOO0o = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o00oO0O);
            parcel.writeInt(this.o0ooOO0);
            parcel.writeInt(this.o0ooOOo);
            parcel.writeInt(this.o0ooOoO);
            parcel.writeInt(this.o0OOO0o);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(@DrawableRes int i, int i2) {
        setDrawerShadow(C7009o000OoOo.m18256OooO00o(getContext(), i), i2);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((C5042OooO0o0) view.getLayoutParams()).f14093OooO00o);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i, @NonNull View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((C5042OooO0o0) view.getLayoutParams()).f14093OooO00o);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a " + "drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }
}
