package com.umeng.socialize.shareboard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ShareBoardMenuHelper {
    public static String TAG = "ShareBoardMenuHelper";
    public ShareBoardConfig mShareBoardConfig;

    public ShareBoardMenuHelper(ShareBoardConfig shareBoardConfig) {
        this.mShareBoardConfig = shareBoardConfig;
    }

    private View createBtnView(Context context, final SnsPlatform snsPlatform) {
        String str;
        String str2;
        String str3 = "";
        LinearLayout linearLayout = new LinearLayout(context);
        int i = 0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        if (snsPlatform != null) {
            ResContainer resContainer = ResContainer.get(context);
            View inflate = LayoutInflater.from(context).inflate(resContainer.layout("socialize_share_menu_item"), (ViewGroup) null);
            SocializeImageView socializeImageView = (SocializeImageView) inflate.findViewById(resContainer.mo40288id("socialize_image_view"));
            TextView textView = (TextView) inflate.findViewById(resContainer.mo40288id("socialize_text_view"));
            ShareBoardConfig shareBoardConfig = this.mShareBoardConfig;
            int i2 = shareBoardConfig.mMenuBgColor;
            if (i2 == 0 || shareBoardConfig.mMenuBgShape == ShareBoardConfig.BG_SHAPE_NONE) {
                socializeImageView.setPadding(0, 0, 0, 0);
            } else {
                socializeImageView.setBackgroundColor(i2, shareBoardConfig.mMenuBgPressedColor);
                ShareBoardConfig shareBoardConfig2 = this.mShareBoardConfig;
                socializeImageView.setBackgroundShape(shareBoardConfig2.mMenuBgShape, shareBoardConfig2.mMenuBgShapeAngle);
            }
            int i3 = this.mShareBoardConfig.mMenuIconPressedColor;
            if (i3 != 0) {
                socializeImageView.setPressedColor(i3);
            }
            try {
                str = snsPlatform.mShowWord;
            } catch (Exception e) {
                SHARE_MEDIA share_media = snsPlatform.mPlatform;
                if (share_media == null) {
                    str2 = str3;
                } else {
                    str2 = share_media.toString();
                }
                SLog.error(UmengText.SHAREBOARD.NULLNAME + str2, e);
                str = str3;
            }
            if (!TextUtils.isEmpty(str)) {
                textView.setText(snsPlatform.mShowWord);
            }
            textView.setGravity(17);
            try {
                i = ResContainer.getResourceId(context, "drawable", snsPlatform.mIcon);
            } catch (Exception e2) {
                SHARE_MEDIA share_media2 = snsPlatform.mPlatform;
                if (share_media2 != null) {
                    str3 = share_media2.toString();
                }
                SLog.error(UmengText.SHAREBOARD.NULLNAME + str3, e2);
            }
            if (i != 0) {
                socializeImageView.setImageResource(i);
            }
            int i4 = this.mShareBoardConfig.mMenuTextColor;
            if (i4 != 0) {
                textView.setTextColor(i4);
            }
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.umeng.socialize.shareboard.ShareBoardMenuHelper.View$OnClickListenerC39931 */

                public void onClick(View view) {
                    SHARE_MEDIA share_media = snsPlatform.mPlatform;
                    if (ShareBoardMenuHelper.this.mShareBoardConfig != null && ShareBoardMenuHelper.this.mShareBoardConfig.getShareBoardlistener() != null) {
                        ShareBoardMenuHelper.this.mShareBoardConfig.getShareBoardlistener().onclick(snsPlatform, share_media);
                    }
                }
            });
            linearLayout.addView(inflate);
        }
        return linearLayout;
    }

    private View createRowLayout(Context context, SnsPlatform[] snsPlatformArr, boolean z) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.topMargin = dip2px(context, 20.0f);
        }
        linearLayout.setLayoutParams(layoutParams);
        for (SnsPlatform snsPlatform : snsPlatformArr) {
            linearLayout.addView(createBtnView(context, snsPlatform));
        }
        return linearLayout;
    }

    private int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public View createPageLayout(Context context, SnsPlatform[][] snsPlatformArr) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(48);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i = 0;
        while (i < snsPlatformArr.length) {
            linearLayout.addView(createRowLayout(context, snsPlatformArr[i], i != 0));
            i++;
        }
        return linearLayout;
    }

    public List<SnsPlatform[][]> formatPageData(List<SnsPlatform> list) {
        int i;
        int i2 = this.mShareBoardConfig.mMenuColumnNum * 2;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i3 = this.mShareBoardConfig.mMenuColumnNum;
        if (size < i3) {
            int[] iArr = new int[2];
            iArr[1] = size;
            iArr[0] = 1;
            SnsPlatform[][] snsPlatformArr = (SnsPlatform[][]) Array.newInstance(SnsPlatform.class, iArr);
            for (int i4 = 0; i4 < list.size(); i4++) {
                snsPlatformArr[0][i4] = list.get(i4);
            }
            arrayList.add(snsPlatformArr);
            return arrayList;
        }
        int i5 = size / i2;
        int i6 = size % i2;
        if (i6 != 0) {
            i = (i6 / i3) + (i6 % i3 != 0 ? 1 : 0);
            i5++;
        } else {
            i = -1;
        }
        int i7 = 0;
        while (i7 < i5) {
            int i8 = (i7 != i5 + -1 || i == -1) ? 2 : i;
            int[] iArr2 = new int[2];
            iArr2[1] = this.mShareBoardConfig.mMenuColumnNum;
            iArr2[0] = i8;
            arrayList.add((SnsPlatform[][]) Array.newInstance(SnsPlatform.class, iArr2));
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            SnsPlatform[][] snsPlatformArr2 = (SnsPlatform[][]) arrayList.get(i10);
            for (SnsPlatform[] snsPlatformArr3 : snsPlatformArr2) {
                for (int i11 = 0; i11 < snsPlatformArr3.length; i11++) {
                    if (i9 < size) {
                        snsPlatformArr3[i11] = list.get(i9);
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }
}
