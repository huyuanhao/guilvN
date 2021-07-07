package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.HeadImageView */
public class HeadImageView extends ShapedImageView {
    public HeadImageView(Context context) {
        super(context);
    }

    public HeadImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeadImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo34303a(String str) {
        if (C1877b.m3578a() != null) {
            int dimension = (int) C1877b.m3578a().getResources().getDimension(C2364R.dimen.ysf_avatar_size);
            setImageResource(C2180b.m4479d().userInfoProvider.getDefaultIconResId());
            UserInfoProvider.UserInfo userInfo = C2180b.m4479d().userInfoProvider.getUserInfo(str);
            if (userInfo == null || !C1870a.m3572b(userInfo.getAvatar())) {
                setTag(null);
                return;
            }
            setTag(userInfo.getAvatar());
            String avatar = userInfo.getAvatar();
            final Object tag = getTag();
            C19201 r2 = new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.common.p150ui.imageview.HeadImageView.C19201 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    if (HeadImageView.this.getTag() != null && HeadImageView.this.getTag().equals(tag)) {
                        HeadImageView.this.setImageBitmap(bitmap);
                    }
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            };
            Bitmap a = C1870a.m3562a(avatar);
            if (a != null) {
                r2.onLoadComplete(a);
            } else {
                C1870a.m3566a(avatar, dimension, dimension, r2);
            }
        }
    }
}
