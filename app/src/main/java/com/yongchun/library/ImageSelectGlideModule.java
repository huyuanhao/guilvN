package com.yongchun.library;

import android.content.Context;
import androidx.annotation.NonNull;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.p118pd.sdk.C7605o0o0OoO;
import com.p118pd.sdk.C7736o0ooo0O;
import com.p118pd.sdk.oO00o00O;

public final class ImageSelectGlideModule extends oO00o00O {
    public static final int OooO00o = 524288000;

    @Override // com.p118pd.sdk.AbstractC7878oO0OOoOO, com.p118pd.sdk.oO00o00O
    public void applyOptions(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
        super.applyOptions(context, o0o0ooo);
        o0o0ooo.OooO00o(new C7736o0ooo0O(DiskFileUtil.OooO00o(context, "/react-native-cp") + "/GlideCacheFolder", 524288000));
    }
}
