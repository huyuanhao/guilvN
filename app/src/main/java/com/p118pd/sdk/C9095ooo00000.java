package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import java.io.File;

/* renamed from: com.pd.sdk.ooo00000  reason: case insensitive filesystem */
public class C9095ooo00000 {
    public static String OooO00o(Context context, HotSourceVO hotSourceVO) {
        return C8742oo0oOo00.OooO00o(context, C8653oo0Oo0.f21789OooO0O0) + File.separator + hotSourceVO.getMd5() + hotSourceVO.getUrl().substring(hotSourceVO.getUrl().lastIndexOf(File.separator) + 1, hotSourceVO.getUrl().length());
    }

    public static String OooO0O0(Context context, HotSourceVO hotSourceVO) {
        File OooO0oo = DiskFileUtil.OooO0oo(context, C8653oo0Oo0.f21789OooO0O0);
        if (OooO0oo == null) {
            OooO0oo = DiskFileUtil.OooO0O0(context, C8653oo0Oo0.f21789OooO0O0);
        }
        if (OooO0oo == null) {
            return null;
        }
        return OooO0oo + File.separator + hotSourceVO.getMd5();
    }

    public static String OooO0OO(Context context, HotSourceVO hotSourceVO) {
        return C8742oo0oOo00.OooO00o(context, C8653oo0Oo0.f21789OooO0O0) + File.separator + hotSourceVO.getMd5();
    }
}
