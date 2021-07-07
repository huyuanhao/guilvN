package com.umeng.socialize.shareboard;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.utils.ShareBoardlistener;
import com.umeng.socialize.utils.SocializeSpUtils;
import java.util.List;

public class ShareBoard extends PopupWindow {
    public ShareBoardConfig mShareBoardConfig;

    public ShareBoard(Context context, List<SnsPlatform> list) {
        this(context, list, null);
    }

    private void saveShareboardConfig(Context context, ShareBoardConfig shareBoardConfig) {
        if (context != null && shareBoardConfig != null) {
            String str = "0";
            String str2 = shareBoardConfig.mShareboardPosition == ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM ? str : "1";
            int i = shareBoardConfig.mMenuBgShape;
            if (i != ShareBoardConfig.BG_SHAPE_NONE) {
                str = i == ShareBoardConfig.BG_SHAPE_CIRCULAR ? "1" : i == ShareBoardConfig.BG_SHAPE_ROUNDED_SQUARE ? shareBoardConfig.mMenuBgShapeAngle != 0 ? "2" : "3" : null;
            }
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                SocializeSpUtils.putShareBoardConfig(context, str + C7522o0Ooo0o.OooO0O0 + str2);
            }
        }
    }

    public void setShareBoardlistener(final ShareBoardlistener shareBoardlistener) {
        if (this.mShareBoardConfig != null) {
            this.mShareBoardConfig.setShareBoardlistener(new ShareBoardlistener() {
                /* class com.umeng.socialize.shareboard.ShareBoard.C39923 */

                @Override // com.umeng.socialize.utils.ShareBoardlistener
                public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
                    ShareBoard.this.setOnDismissListener(null);
                    ShareBoard.this.dismiss();
                    ShareBoardlistener shareBoardlistener = shareBoardlistener;
                    if (shareBoardlistener != null) {
                        shareBoardlistener.onclick(snsPlatform, share_media);
                    }
                }
            });
        }
    }

    public ShareBoard(Context context, List<SnsPlatform> list, ShareBoardConfig shareBoardConfig) {
        super(context);
        setWindowLayoutMode(-1, -1);
        boolean z = context.getResources().getConfiguration().orientation == 2;
        shareBoardConfig = shareBoardConfig == null ? new ShareBoardConfig() : shareBoardConfig;
        this.mShareBoardConfig = shareBoardConfig;
        shareBoardConfig.setOrientation(z);
        UMActionFrame uMActionFrame = new UMActionFrame(context);
        uMActionFrame.setSnsPlatformData(list, shareBoardConfig);
        uMActionFrame.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        uMActionFrame.setDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.umeng.socialize.shareboard.ShareBoard.C39901 */

            public void onDismiss() {
                ShareBoard.this.dismiss();
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.umeng.socialize.shareboard.ShareBoard.C39912 */

            public void onDismiss() {
                PopupWindow.OnDismissListener onDismissListener = ShareBoard.this.mShareBoardConfig != null ? ShareBoard.this.mShareBoardConfig.getOnDismissListener() : null;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss();
                }
            }
        });
        setContentView(uMActionFrame);
        setFocusable(true);
        saveShareboardConfig(context, shareBoardConfig);
    }
}
