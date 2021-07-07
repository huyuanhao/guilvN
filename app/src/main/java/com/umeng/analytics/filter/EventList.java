package com.umeng.analytics.filter;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;

public class EventList extends C3413c implements FileLockCallback {
    public static final int DELETE_LIST_DATA = 2;
    public static final int LOAD_LIST_DATA = 1;
    public static final int SAVE_LIST_DATA = 0;
    public Context mAppContext;
    public String mEventList;
    public String mEventListKey;
    public String mEventListName;
    public String mEventListVersionKey;
    public FileLockUtil mFileLock = new FileLockUtil();

    public EventList(String str, String str2) {
        this.mEventListName = str;
        this.mEventListKey = str;
        this.mEventListVersionKey = str2;
    }

    private void deleteDataFile(File file) {
        if (this.mAppContext != null) {
            synchronized (this.mFileLock) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean loadEventListFromFile(android.content.Context r9, java.io.File r10) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.filter.EventList.loadEventListFromFile(android.content.Context, java.io.File):boolean");
    }

    private void saveEventListToFile(Context context, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.mEventList.getBytes());
            fileOutputStream.close();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public boolean enabled() {
        synchronized (this) {
            if (this.mEventList == null) {
                return false;
            }
            return true;
        }
    }

    public void eventListChange() {
    }

    public boolean matchHit(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i) {
        if (i == 0) {
            synchronized (this) {
                saveEventListToFile(this.mAppContext, file);
            }
        } else if (i == 1) {
            synchronized (this) {
                if (loadEventListFromFile(this.mAppContext, file)) {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> find event list data file, load it.");
                } else {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> can't find event list file.");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                this.mEventList = null;
                deleteDataFile(file);
            }
        }
        return true;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    @Override // com.umeng.analytics.filter.C3413c, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        if ("ekv_bl_ver".equals(str) && str2 == null) {
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> disable black list for ekv.");
            this.mFileLock.doFileOperateion(new File(this.mAppContext.getFilesDir(), this.mEventListName), this, 2);
        }
        if ("ekv_wl_ver".equals(str) && str2 == null) {
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> disable white list for ekv.");
            this.mFileLock.doFileOperateion(new File(this.mAppContext.getFilesDir(), this.mEventListName), this, 2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3.mAppContext, r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x005e */
    @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback, com.umeng.analytics.filter.C3413c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreProcessImprintKey(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.filter.EventList.onPreProcessImprintKey(java.lang.String, java.lang.String):boolean");
    }

    public void register(Context context) {
        if (this.mAppContext == null) {
            this.mAppContext = context.getApplicationContext();
        }
        File file = new File(this.mAppContext.getFilesDir(), this.mEventListName);
        if (!TextUtils.isEmpty(UMEnvelopeBuild.imprintProperty(this.mAppContext, this.mEventListVersionKey, ""))) {
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this, 1);
            } else {
                setMD5ClearFlag(true);
            }
        }
        if (UMUtils.isMainProgress(this.mAppContext)) {
            ImprintHandler.getImprintService(this.mAppContext).registPreProcessCallback(this.mEventListKey, this);
            ImprintHandler.getImprintService(this.mAppContext).registImprintCallback(this.mEventListVersionKey, this);
        }
    }

    public void setMD5ClearFlag(boolean z) {
    }

    public String toString() {
        if (TextUtils.isEmpty(this.mEventListName) || TextUtils.isEmpty(this.mEventListKey)) {
            return "Uninitialized EventList.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append("EventListName:" + this.mEventListName + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("listKey:" + this.mEventListKey + Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (!TextUtils.isEmpty(this.mEventList)) {
            sb.append("listKeyValue:" + this.mEventList + "]");
        } else {
            sb.append("listKeyValue:empty,");
        }
        if (!TextUtils.isEmpty(this.mEventListVersionKey)) {
            sb.append("listKeyVer:" + this.mEventListVersionKey + "]");
        } else {
            sb.append("listKeyVer:empty]");
        }
        return sb.toString();
    }
}
