package com.umeng.socialize.shareboard;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.umeng.socialize.utils.ShareBoardlistener;

public class ShareBoardConfig {
    public static int BG_SHAPE_CIRCULAR = 1;
    public static int BG_SHAPE_NONE = 0;
    public static int BG_SHAPE_ROUNDED_SQUARE = 2;
    public static final int CANCEL_BTN_HEIGHT = 50;
    public static final int CANCEL_BTN_TEXT_SIZE_IN_SP = 15;
    public static final int CENTER_MENU_LEFT_PADDING = 36;
    public static final int INDICATOR_BOTTOM_MARGIN = 20;
    public static final int INDICATOR_SIZE = 3;
    public static final int INDICATOR_SPACE = 5;
    public static final int MENU_COLUMN_NUM = 4;
    public static final int MENU_COLUMN_NUM_CENTER = 3;
    public static final int MENU_COLUMN_NUM_HORIZONTAL = 6;
    public static final int MENU_COLUMN_NUM_HORIZONTAL_CENTER = 5;
    public static final int MENU_ROW_MARGIN = 20;
    public static final int MENU_ROW_NUM = 2;
    public static final int MENU_TOP_MARGIN = 20;
    public static int SHAREBOARD_POSITION_BOTTOM = 3;
    public static int SHAREBOARD_POSITION_CENTER = 2;
    public static int SHAREBOARD_POSITION_TOP = 1;
    public static final int TITLE_TEXT_SIZE_IN_SP = 16;
    public static final int TITLE_TOP_MARGIN = 20;
    public static final int VIEW_PAGER_LEFT_MARGIN = 10;
    public int mCancelBtnBgColor;
    public int mCancelBtnBgPressedColor;
    public int mCancelBtnColor;
    public String mCancelBtnText;
    public boolean mCancelBtnVisibility;
    public int mIndicatorNormalColor;
    public int mIndicatorSelectedColor;
    public boolean mIndicatorVisibility;
    public int mMenuBgColor;
    public int mMenuBgPressedColor;
    public int mMenuBgShape;
    public int mMenuBgShapeAngle;
    public int mMenuColumnNum;
    public int mMenuIconPressedColor;
    public int mMenuTextColor;
    public PopupWindow.OnDismissListener mOnDismissListener;
    public ShareBoardlistener mShareBoardlistener;
    public int mShareboardBgColor;
    public int mShareboardPosition;
    public String mTitleText;
    public int mTitleTextColor;
    public boolean mTitleVisibility;
    public int mTopMargin;

    public ShareBoardConfig() {
        setDefaultValue();
    }

    private void setDefaultValue() {
        int parseColor = Color.parseColor("#575A5C");
        setShareboardBackgroundColor(Color.parseColor("#E9EFF2"));
        setShareboardPostion(SHAREBOARD_POSITION_BOTTOM);
        setTitleText("选择要分享到的平台");
        setTitleTextColor(parseColor);
        setMenuItemBackgroundShape(BG_SHAPE_ROUNDED_SQUARE, 5);
        setMenuItemBackgroundColor(Color.parseColor("#ffffff"), Color.parseColor("#22000000"));
        setMenuItemIconPressedColor(Color.parseColor("#22000000"));
        setMenuItemTextColor(parseColor);
        setCancelButtonText("取消分享");
        setCancelButtonTextColor(parseColor);
        setCancelButtonBackground(Color.parseColor("#ffffff"), Color.parseColor("#22000000"));
        setIndicatorColor(Color.parseColor("#C2C9CC"), Color.parseColor("#0086DC"));
    }

    public int calculateMenuHeightInDp(int i) {
        int i2 = this.mMenuColumnNum;
        int i3 = 2;
        if (i <= i2) {
            i3 = 1;
        } else {
            int i4 = i2 * 2;
        }
        return (i3 * 75) + ((i3 - 1) * 20) + 20;
    }

    public PopupWindow.OnDismissListener getOnDismissListener() {
        return this.mOnDismissListener;
    }

    public ShareBoardlistener getShareBoardlistener() {
        return this.mShareBoardlistener;
    }

    public ShareBoardConfig setCancelButtonBackground(int i) {
        setCancelButtonBackground(i, 0);
        return this;
    }

    public ShareBoardConfig setCancelButtonText(String str) {
        if (TextUtils.isEmpty(str)) {
            setCancelButtonVisibility(false);
        } else {
            setCancelButtonVisibility(true);
            this.mCancelBtnText = str;
        }
        return this;
    }

    public ShareBoardConfig setCancelButtonTextColor(int i) {
        this.mCancelBtnColor = i;
        return this;
    }

    public ShareBoardConfig setCancelButtonVisibility(boolean z) {
        this.mCancelBtnVisibility = z;
        return this;
    }

    public ShareBoardConfig setIndicatorColor(int i) {
        setIndicatorColor(i, 0);
        return this;
    }

    public ShareBoardConfig setIndicatorVisibility(boolean z) {
        this.mIndicatorVisibility = z;
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundColor(int i) {
        setMenuItemBackgroundColor(i, 0);
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundShape(int i) {
        setMenuItemBackgroundShape(i, 0);
        return this;
    }

    public ShareBoardConfig setMenuItemIconPressedColor(int i) {
        this.mMenuIconPressedColor = i;
        return this;
    }

    public ShareBoardConfig setMenuItemTextColor(int i) {
        this.mMenuTextColor = i;
        return this;
    }

    public ShareBoardConfig setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        return this;
    }

    public void setOrientation(boolean z) {
        if (z) {
            int i = this.mShareboardPosition;
            if (i == SHAREBOARD_POSITION_BOTTOM) {
                this.mMenuColumnNum = 6;
            } else if (i == SHAREBOARD_POSITION_CENTER) {
                this.mMenuColumnNum = 5;
            }
        } else {
            int i2 = this.mShareboardPosition;
            if (i2 == SHAREBOARD_POSITION_BOTTOM) {
                this.mMenuColumnNum = 4;
            } else if (i2 == SHAREBOARD_POSITION_CENTER) {
                this.mMenuColumnNum = 3;
            }
        }
    }

    public void setShareBoardlistener(ShareBoardlistener shareBoardlistener) {
        this.mShareBoardlistener = shareBoardlistener;
    }

    public ShareBoardConfig setShareboardBackgroundColor(int i) {
        this.mShareboardBgColor = i;
        return this;
    }

    public ShareBoardConfig setShareboardPostion(int i) {
        int i2 = SHAREBOARD_POSITION_BOTTOM;
        if (!(i == i2 || i == SHAREBOARD_POSITION_CENTER || i == SHAREBOARD_POSITION_TOP)) {
            i = i2;
        }
        this.mShareboardPosition = i;
        return this;
    }

    public ShareBoardConfig setStatusBarHeight(int i) {
        this.mTopMargin = i;
        return this;
    }

    public ShareBoardConfig setTitleText(String str) {
        if (TextUtils.isEmpty(str)) {
            setTitleVisibility(false);
        } else {
            setTitleVisibility(true);
            this.mTitleText = str;
        }
        return this;
    }

    public ShareBoardConfig setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        return this;
    }

    public ShareBoardConfig setTitleVisibility(boolean z) {
        this.mTitleVisibility = z;
        return this;
    }

    public ShareBoardConfig setCancelButtonBackground(int i, int i2) {
        this.mCancelBtnBgColor = i;
        this.mCancelBtnBgPressedColor = i2;
        return this;
    }

    public ShareBoardConfig setIndicatorColor(int i, int i2) {
        if (i != 0) {
            this.mIndicatorNormalColor = i;
        }
        if (i2 != 0) {
            this.mIndicatorSelectedColor = i2;
        }
        setIndicatorVisibility(true);
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundColor(int i, int i2) {
        this.mMenuBgColor = i;
        this.mMenuBgPressedColor = i2;
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundShape(int i, int i2) {
        if (!(i == BG_SHAPE_CIRCULAR || i == BG_SHAPE_ROUNDED_SQUARE)) {
            i = BG_SHAPE_NONE;
        }
        this.mMenuBgShape = i;
        this.mMenuBgShapeAngle = i2;
        return this;
    }
}
