package com.tencent.bugly.beta.tinker;

import android.app.ActivityManager;
import android.content.Context;
import com.p118pd.sdk.C5982OoooOoO;
import com.tencent.tinker.lib.listener.DefaultPatchListener;
import com.tencent.tinker.lib.listener.PatchListener;
import com.tencent.tinker.lib.util.TinkerLog;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Properties;

public class TinkerPatchListener extends DefaultPatchListener {
    public static final long NEW_PATCH_RESTRICTION_SPACE_SIZE_MIN = 62914560;
    public static final String TAG = "Tinker.TinkerPatchListener";
    public final int maxMemory;
    public final PatchListener userPatchListener = TinkerManager.userPatchListener;

    public TinkerPatchListener(Context context) {
        super(context);
        this.maxMemory = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryClass();
        TinkerLog.i(TAG, "application maxMemory:" + this.maxMemory, new Object[0]);
    }

    public int patchCheck(String str, String str2) {
        PatchListener patchListener = this.userPatchListener;
        if (patchListener != null) {
            patchListener.onPatchReceived(str);
            return TinkerPatchListener.super.patchCheck(str, str2);
        }
        File file = new File(str);
        boolean z = false;
        TinkerLog.i(TAG, "receive a patch file: %s, file size:%d", new Object[]{str, Long.valueOf(SharePatchFileUtil.getFileOrDirectorySize(file))});
        int patchCheck = TinkerPatchListener.super.patchCheck(str, str2);
        if (patchCheck == 0) {
            patchCheck = TinkerUtils.checkForPatchRecover(NEW_PATCH_RESTRICTION_SPACE_SIZE_MIN, this.maxMemory);
        }
        if (patchCheck == 0 && this.context.getSharedPreferences("tinker_share_config", 0).getInt(str2, 0) >= 3) {
            patchCheck = -23;
        }
        if (patchCheck == 0) {
            Properties fastGetPatchPackageMeta = ShareTinkerInternals.fastGetPatchPackageMeta(file);
            if (fastGetPatchPackageMeta == null) {
                patchCheck = -24;
            } else {
                String property = fastGetPatchPackageMeta.getProperty("platform");
                TinkerLog.i(TAG, "get platform:" + property, new Object[0]);
            }
        }
        if (patchCheck == 0) {
            z = true;
        }
        TinkerReport.onTryApply(z);
        return patchCheck;
    }
}
