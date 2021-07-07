package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.p118pd.sdk.AbstractC5950OooOo0;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.AbstractC7472o0Oo0oo;
import com.p118pd.sdk.C5945OooOOO0;
import com.p118pd.sdk.C5955OooOoO0;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C5998Ooooooo;
import com.p118pd.sdk.C6941o00000O;
import com.p118pd.sdk.C6951o0000O0;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C6970o0000oO;
import com.p118pd.sdk.C7092o00OOO0;
import com.p118pd.sdk.C7095o00OOOO;
import com.p118pd.sdk.C7724o0ooOOo;
import com.p118pd.sdk.C8888ooOO;
import com.p118pd.sdk.SubMenuC7026o000oOoO;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public static final String TAG = "Toolbar";
    public AbstractC5961Oooo.OooO00o mActionMenuPresenterCallback;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    public CharSequence mCollapseDescription;
    public Drawable mCollapseIcon;
    public boolean mCollapsible;
    public int mContentInsetEndWithActions;
    public int mContentInsetStartWithNavigation;
    public C6941o00000O mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C5019OooO0Oo mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList<View> mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public C5965Oooo00o.OooO00o mMenuBuilderCallback;
    public ActionMenuView mMenuView;
    public final ActionMenuView.AbstractC5010OooO0o0 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public OooO0o mOnMenuItemClickListener;
    public ActionMenuPresenter mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    public final Runnable mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public int mSubtitleTextColor;
    public TextView mSubtitleTextView;
    public final int[] mTempMargins;
    public final ArrayList<View> mTempViews;
    public int mTitleMarginBottom;
    public int mTitleMarginEnd;
    public int mTitleMarginStart;
    public int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public int mTitleTextColor;
    public TextView mTitleTextView;
    public C6951o0000O0 mWrapper;

    public class OooO00o implements ActionMenuView.AbstractC5010OooO0o0 {
        public OooO00o() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC5010OooO0o0
        public boolean onMenuItemClick(MenuItem menuItem) {
            OooO0o oooO0o = Toolbar.this.mOnMenuItemClickListener;
            if (oooO0o != null) {
                return oooO0o.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    public interface OooO0o {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public boolean OooO0O0;
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

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o00oO0O);
            parcel.writeInt(this.OooO0O0 ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.o00oO0O = parcel.readInt();
            this.OooO0O0 = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = ViewCompat.m14593OooO0o(this) == 1;
        int childCount = getChildCount();
        int OooO00o2 = C7092o00OOO0.OooO00o(i, ViewCompat.m14593OooO0o((View) this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C5020OooO0o0 oooO0o0 = (C5020OooO0o0) childAt.getLayoutParams();
                if (oooO0o0.OooO0O0 == 0 && shouldLayout(childAt) && getChildHorizontalGravity(oooO0o0.OooO00o) == OooO00o2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C5020OooO0o0 oooO0o02 = (C5020OooO0o0) childAt2.getLayoutParams();
            if (oooO0o02.OooO0O0 == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(oooO0o02.OooO00o) == OooO00o2) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        C5020OooO0o0 oooO0o0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            oooO0o0 = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            oooO0o0 = generateLayoutParams(layoutParams);
        } else {
            oooO0o0 = (C5020OooO0o0) layoutParams;
        }
        oooO0o0.OooO0O0 = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, oooO0o0);
            return;
        }
        view.setLayoutParams(oooO0o0);
        this.mHiddenViews.add(view);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C6941o00000O();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new C8888ooOO(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.m14428OooO00o() == null) {
            C5965Oooo00o oooo00o = (C5965Oooo00o) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C5019OooO0Oo();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            oooo00o.OooO00o(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.OooO00o(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            C5020OooO0o0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.OooO00o = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C5998Ooooooo(getContext(), null, C0033R.attr.toolbarNavigationButtonStyle);
            C5020OooO0o0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.OooO00o = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        int OooO00o2 = C7092o00OOO0.OooO00o(i, OooO0o2) & 7;
        if (OooO00o2 == 1 || OooO00o2 == 3 || OooO00o2 == 5) {
            return OooO00o2;
        }
        return OooO0o2 == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        C5020OooO0o0 oooO0o0 = (C5020OooO0o0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(oooO0o0.OooO00o);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C7095o00OOOO.OooO0OO(marginLayoutParams) + C7095o00OOOO.OooO0O0(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new C5955OooOoO0(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C5020OooO0o0 oooO0o0 = (C5020OooO0o0) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public static boolean isCustomView(View view) {
        return ((C5020OooO0o0) view.getLayoutParams()).OooO0O0 == 0;
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        C5020OooO0o0 oooO0o0 = (C5020OooO0o0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        C5020OooO0o0 oooO0o0 = (C5020OooO0o0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.OooO0o();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C5020OooO0o0);
    }

    public void collapseActionView() {
        C5019OooO0Oo oooO0Oo = this.mExpandedMenuPresenter;
        C5967Oooo0OO oooo0OO = oooO0Oo == null ? null : oooO0Oo.f13809OooO00o;
        if (oooo0OO != null) {
            oooo0OO.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.OooO0OO();
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C5998Ooooooo ooooooo = new C5998Ooooooo(getContext(), null, C0033R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = ooooooo;
            ooooooo.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C5020OooO0o0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.OooO00o = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.OooO0O0 = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new OooO0OO());
        }
    }

    public int getContentInsetEnd() {
        C6941o00000O o00000o = this.mContentInsets;
        if (o00000o != null) {
            return o00000o.OooO00o();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C6941o00000O o00000o = this.mContentInsets;
        if (o00000o != null) {
            return o00000o.OooO0O0();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C6941o00000O o00000o = this.mContentInsets;
        if (o00000o != null) {
            return o00000o.OooO0OO();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C6941o00000O o00000o = this.mContentInsets;
        if (o00000o != null) {
            return o00000o.OooO0Oo();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C5965Oooo00o OooO00o2;
        ActionMenuView actionMenuView = this.mMenuView;
        if ((actionMenuView == null || (OooO00o2 = actionMenuView.m14428OooO00o()) == null || !OooO00o2.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.m14593OooO0o((View) this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.m14593OooO0o((View) this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public AbstractC7472o0Oo0oo getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C6951o0000O0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        C5019OooO0Oo oooO0Oo = this.mExpandedMenuPresenter;
        return (oooO0Oo == null || oooO0Oo.f13809OooO00o == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m14429OooO0OO();
    }

    public void inflateMenu(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.OooO0Oo();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.OooO0o0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 787
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        int i10 = 0;
        if (C6954o0000OO.m18147OooO00o((View) this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i5 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i3 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i5 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i3 = View.combineMeasuredStates(i3, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i3 = View.combineMeasuredStates(i3, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i3 = View.combineMeasuredStates(i3, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i3 = View.combineMeasuredStates(i3, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C5020OooO0o0) childAt.getLayoutParams()).OooO0O0 == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i13 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i7 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i9 = View.combineMeasuredStates(i3, this.mTitleTextView.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i8 = Math.max(i8, measureChildCollapseMargins(this.mSubtitleTextView, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i9 = View.combineMeasuredStates(i9, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!shouldCollapse()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        ActionMenuView actionMenuView = this.mMenuView;
        C5965Oooo00o OooO00o2 = actionMenuView != null ? actionMenuView.m14428OooO00o() : null;
        int i = savedState.o00oO0O;
        if (!(i == 0 || this.mExpandedMenuPresenter == null || OooO00o2 == null || (findItem = OooO00o2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.OooO0O0) {
            postShowOverflowMenu();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ensureContentInsets();
        C6941o00000O o00000o = this.mContentInsets;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        o00000o.OooO00o(z);
    }

    public Parcelable onSaveInstanceState() {
        C5967Oooo0OO oooo0OO;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C5019OooO0Oo oooO0Oo = this.mExpandedMenuPresenter;
        if (!(oooO0Oo == null || (oooo0OO = oooO0Oo.f13809OooO00o) == null)) {
            savedState.o00oO0O = oooo0OO.getItemId();
        }
        savedState.OooO0O0 = isOverflowMenuShowing();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C5020OooO0o0) childAt.getLayoutParams()).OooO0O0 == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.OooO00o(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.OooO0O0(i, i2);
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMenu(C5965Oooo00o oooo00o, ActionMenuPresenter actionMenuPresenter) {
        if (oooo00o != null || this.mMenuView != null) {
            ensureMenuView();
            C5965Oooo00o OooO00o2 = this.mMenuView.m14428OooO00o();
            if (OooO00o2 != oooo00o) {
                if (OooO00o2 != null) {
                    OooO00o2.OooO0O0(this.mOuterActionMenuPresenter);
                    OooO00o2.OooO0O0(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new C5019OooO0Oo();
                }
                actionMenuPresenter.OooO0OO(true);
                if (oooo00o != null) {
                    oooo00o.OooO00o(actionMenuPresenter, this.mPopupContext);
                    oooo00o.OooO00o(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    actionMenuPresenter.OooO00o(this.mPopupContext, (C5965Oooo00o) null);
                    this.mExpandedMenuPresenter.OooO00o(this.mPopupContext, (C5965Oooo00o) null);
                    actionMenuPresenter.OooO00o(true);
                    this.mExpandedMenuPresenter.OooO00o(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMenuCallbacks(AbstractC5961Oooo.OooO00o oooO00o, C5965Oooo00o.OooO00o oooO00o2) {
        this.mActionMenuPresenterCallback = oooO00o;
        this.mMenuBuilderCallback = oooO00o2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.OooO00o(oooO00o, oooO00o2);
        }
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OooO0o oooO0o) {
        this.mOnMenuItemClickListener = oooO0o;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.mSubtitleTextColor = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.OooO0oO();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$OooO0o0  reason: case insensitive filesystem */
    public static class C5020OooO0o0 extends ActionBar.OooO00o {
        public static final int OooO0OO = 0;
        public static final int OooO0Oo = 1;
        public static final int OooO0o0 = 2;
        public int OooO0O0;

        public C5020OooO0o0(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.OooO0O0 = 0;
        }

        public void OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C5020OooO0o0(int i, int i2) {
            super(i, i2);
            this.OooO0O0 = 0;
            this.OooO00o = 8388627;
        }

        public C5020OooO0o0(int i, int i2, int i3) {
            super(i, i2);
            this.OooO0O0 = 0;
            this.OooO00o = i3;
        }

        public C5020OooO0o0(int i) {
            this(-2, -1, i);
        }

        public C5020OooO0o0(C5020OooO0o0 oooO0o0) {
            super((ActionBar.OooO00o) oooO0o0);
            this.OooO0O0 = 0;
            this.OooO0O0 = oooO0o0.OooO0O0;
        }

        public C5020OooO0o0(ActionBar.OooO00o oooO00o) {
            super(oooO00o);
            this.OooO0O0 = 0;
        }

        public C5020OooO0o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.OooO0O0 = 0;
            OooO00o(marginLayoutParams);
        }

        public C5020OooO0o0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.OooO0O0 = 0;
        }
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.toolbarStyle);
    }

    public C5020OooO0o0 generateDefaultLayoutParams() {
        return new C5020OooO0o0(-2, -2);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C7724o0ooOOo o0ooooo = new C7724o0ooOOo(context);
                this.mSubtitleTextView = o0ooooo;
                o0ooooo.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mSubtitleTextColor;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C7724o0ooOOo o0ooooo = new C7724o0ooOOo(context);
                this.mTitleTextView = o0ooooo;
                o0ooooo.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mTitleTextColor;
                if (i2 != 0) {
                    this.mTitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$OooO0Oo  reason: case insensitive filesystem */
    public class C5019OooO0Oo implements AbstractC5961Oooo {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5965Oooo00o f13808OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5967Oooo0OO f13809OooO00o;

        public C5019OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
        public Parcelable OooO00o() {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public AbstractC5976OoooO00 OooO00o(ViewGroup viewGroup) {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public void OooO00o(Context context, C5965Oooo00o oooo00o) {
            C5967Oooo0OO oooo0OO;
            C5965Oooo00o oooo00o2 = this.f13808OooO00o;
            if (!(oooo00o2 == null || (oooo0OO = this.f13809OooO00o) == null)) {
                oooo00o2.m16782OooO00o(oooo0OO);
            }
            this.f13808OooO00o = oooo00o;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public void OooO00o(Parcelable parcelable) {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14446OooO00o() {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public boolean OooO0O0(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof AbstractC5950OooOo0) {
                ((AbstractC5950OooOo0) view).OooO00o();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f13809OooO00o = null;
            Toolbar.this.requestLayout();
            oooo0OO.OooO00o(false);
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public int getId() {
            return 0;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public void OooO00o(boolean z) {
            if (this.f13809OooO00o != null) {
                C5965Oooo00o oooo00o = this.f13808OooO00o;
                boolean z2 = false;
                if (oooo00o != null) {
                    int size = oooo00o.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f13808OooO00o.getItem(i) == this.f13809OooO00o) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    OooO0O0(this.f13808OooO00o, this.f13809OooO00o);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo
        public boolean OooO00o(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = oooo0OO.getActionView();
            this.f13809OooO00o = oooo0OO;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                C5020OooO0o0 generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.OooO00o = 8388611 | (toolbar4.mButtonGravity & 112);
                generateDefaultLayoutParams.OooO0O0 = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            oooo0OO.OooO00o(true);
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof AbstractC5950OooOo0) {
                ((AbstractC5950OooOo0) view).OooO0O0();
            }
            return true;
        }
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new OooO00o();
        this.mShowOverflowMenuRunnable = new OooO0O0();
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(getContext(), attributeSet, C0033R.styleable.Oooo0oo, i, 0);
        this.mTitleTextAppearance = OooO00o2.OooO0oO(C0033R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = OooO00o2.OooO0oO(C0033R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = OooO00o2.OooO0o0(C0033R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = OooO00o2.OooO0o0(C0033R.styleable.Toolbar_buttonGravity, 48);
        int OooO0O02 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMargin, 0);
        OooO0O02 = OooO00o2.m18168OooO00o(C0033R.styleable.Toolbar_titleMargins) ? OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMargins, OooO0O02) : OooO0O02;
        this.mTitleMarginBottom = OooO0O02;
        this.mTitleMarginTop = OooO0O02;
        this.mTitleMarginEnd = OooO0O02;
        this.mTitleMarginStart = OooO0O02;
        int OooO0O03 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMarginStart, -1);
        if (OooO0O03 >= 0) {
            this.mTitleMarginStart = OooO0O03;
        }
        int OooO0O04 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMarginEnd, -1);
        if (OooO0O04 >= 0) {
            this.mTitleMarginEnd = OooO0O04;
        }
        int OooO0O05 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMarginTop, -1);
        if (OooO0O05 >= 0) {
            this.mTitleMarginTop = OooO0O05;
        }
        int OooO0O06 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_titleMarginBottom, -1);
        if (OooO0O06 >= 0) {
            this.mTitleMarginBottom = OooO0O06;
        }
        this.mMaxButtonHeight = OooO00o2.OooO0OO(C0033R.styleable.Toolbar_maxButtonHeight, -1);
        int OooO0O07 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int OooO0O08 = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int OooO0OO2 = OooO00o2.OooO0OO(C0033R.styleable.Toolbar_contentInsetLeft, 0);
        int OooO0OO3 = OooO00o2.OooO0OO(C0033R.styleable.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.OooO00o(OooO0OO2, OooO0OO3);
        if (!(OooO0O07 == Integer.MIN_VALUE && OooO0O08 == Integer.MIN_VALUE)) {
            this.mContentInsets.OooO0O0(OooO0O07, OooO0O08);
        }
        this.mContentInsetStartWithNavigation = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = OooO00o2.OooO0O0(C0033R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = OooO00o2.m18162OooO00o(C0033R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = OooO00o2.m18164OooO00o(C0033R.styleable.Toolbar_collapseContentDescription);
        CharSequence OooO00o3 = OooO00o2.m18164OooO00o(C0033R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(OooO00o3)) {
            setTitle(OooO00o3);
        }
        CharSequence OooO00o4 = OooO00o2.m18164OooO00o(C0033R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(OooO00o4)) {
            setSubtitle(OooO00o4);
        }
        this.mPopupContext = getContext();
        setPopupTheme(OooO00o2.OooO0oO(C0033R.styleable.Toolbar_popupTheme, 0));
        Drawable OooO00o5 = OooO00o2.m18162OooO00o(C0033R.styleable.Toolbar_navigationIcon);
        if (OooO00o5 != null) {
            setNavigationIcon(OooO00o5);
        }
        CharSequence OooO00o6 = OooO00o2.m18164OooO00o(C0033R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(OooO00o6)) {
            setNavigationContentDescription(OooO00o6);
        }
        Drawable OooO00o7 = OooO00o2.m18162OooO00o(C0033R.styleable.Toolbar_logo);
        if (OooO00o7 != null) {
            setLogo(OooO00o7);
        }
        CharSequence OooO00o8 = OooO00o2.m18164OooO00o(C0033R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(OooO00o8)) {
            setLogoDescription(OooO00o8);
        }
        if (OooO00o2.m18168OooO00o(C0033R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(OooO00o2.OooO00o(C0033R.styleable.Toolbar_titleTextColor, -1));
        }
        if (OooO00o2.m18168OooO00o(C0033R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(OooO00o2.OooO00o(C0033R.styleable.Toolbar_subtitleTextColor, -1));
        }
        OooO00o2.m18167OooO00o();
    }

    @Override // android.view.ViewGroup
    public C5020OooO0o0 generateLayoutParams(AttributeSet attributeSet) {
        return new C5020OooO0o0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C5020OooO0o0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5020OooO0o0) {
            return new C5020OooO0o0((C5020OooO0o0) layoutParams);
        }
        if (layoutParams instanceof ActionBar.OooO00o) {
            return new C5020OooO0o0((ActionBar.OooO00o) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5020OooO0o0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5020OooO0o0(layoutParams);
    }
}
