package com.umeng.analytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p118pd.sdk.C7265o0O000oo;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3410c;
import com.umeng.analytics.pro.C3416b;
import com.umeng.analytics.pro.C3445k;
import com.umeng.analytics.pro.C3453n;
import com.umeng.analytics.pro.C3468v;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class UMProcessDBDatasSender implements UMLogDataProtocol {
    public static final int UM_PROCESS_CONSTRUCTMESSAGE = 36946;
    public static final int UM_PROCESS_EVENT_KEY = 36945;
    public static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    public static UMProcessDBDatasSender mInstance;
    public Context mContext;
    public List<Integer> mGeneralBodyIds;
    public FileLockUtil mLockUtil = new FileLockUtil();
    public C3445k.C3449c mPolicySelector;

    public class ConstructMessageCallback implements FileLockCallback {
        public ConstructMessageCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            JSONObject buildEnvelopeWithExtHeader;
            UMProcessDBDatasSender uMProcessDBDatasSender = UMProcessDBDatasSender.this;
            JSONObject jSONObject = uMProcessDBDatasSender.setupReportData(UMEnvelopeBuild.maxDataSpace(uMProcessDBDatasSender.mContext));
            if (jSONObject != null && jSONObject.length() >= 1) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
                if (!(UMProcessDBDatasSender.this.mContext == null || jSONObject2 == null || jSONObject3 == null || (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(UMProcessDBDatasSender.this.mContext, jSONObject2, jSONObject3)) == null)) {
                    UMProcessDBDatasSender.this.removeCacheData(buildEnvelopeWithExtHeader);
                }
            }
            return true;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    public class ReplaceCallback implements FileLockCallback {
        public ReplaceCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(AbstractC3479a.f8831c)) {
                str = str.replaceFirst(AbstractC3479a.f8831c, "");
            }
            UMProcessDBHelper.getInstance(UMProcessDBDatasSender.this.mContext).deleteEventDatas(str.replace(AbstractC3479a.f8832d, ""), null, null);
            return true;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    private void constructMessage() {
        if (defconProcesserHandler() == 0) {
            this.mLockUtil.doFileOperateion(C3481b.m8961b(this.mContext, ""), new ConstructMessageCallback());
        }
    }

    private int defconProcesserHandler() {
        int a = C3453n.m8858a().mo38761a(this.mContext);
        if (a != 0) {
            try {
                DBFileTraversalUtil.traverseDBFiles(C3481b.m8959a(this.mContext), new ReplaceCallback(), null);
            } catch (Exception unused) {
            }
            UMProcessDBHelper.getInstance(this.mContext).deleteEventDatas(AbstractC3479a.f8836h, null, null);
        }
        return a;
    }

    private JSONObject generalBody() {
        JSONObject jSONObject = null;
        try {
            if (this.mGeneralBodyIds == null) {
                this.mGeneralBodyIds = new ArrayList();
            }
            jSONObject = UMProcessDBHelper.getInstance(this.mContext).readMainEvents(UMEnvelopeBuild.maxDataSpace(this.mContext) - C7265o0O000oo.OooO0o.OooO00o, this.mGeneralBodyIds);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.mContext);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] a = C3410c.m8724a(this.mContext);
            if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3416b.f8428L, a[0]);
                jSONObject2.put(C3416b.f8429M, a[1]);
                if (jSONObject2.length() > 0) {
                    jSONObject.put(C3416b.f8427K, jSONObject2);
                }
            }
            if (ABTest.getService(this.mContext).isInTest()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ABTest.getService(this.mContext).getTestName(), ABTest.getService(this.mContext).getGroupInfo());
                jSONObject.put(C3416b.f8426J, jSONObject3);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject generalHeader() {
        String str;
        JSONObject readVersionInfoFromColumId;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(AnalyticsConfig.mWrapperType == null || AnalyticsConfig.mWrapperVersion == null)) {
                jSONObject.put("wrapper_version", AnalyticsConfig.mWrapperVersion);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            jSONObject.put(C3416b.f8482i, AnalyticsConfig.getVerticalType(this.mContext));
            jSONObject.put("sdk_version", C3468v.f8798a);
            String str2 = "";
            if (this.mGeneralBodyIds.size() <= 0 || (readVersionInfoFromColumId = UMProcessDBHelper.getInstance(this.mContext).readVersionInfoFromColumId(this.mGeneralBodyIds.get(0))) == null) {
                str = str2;
            } else {
                str2 = readVersionInfoFromColumId.optString("__av");
                str = readVersionInfoFromColumId.optString("__vc");
            }
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("app_version", UMUtils.getAppVersionName(this.mContext));
            } else {
                jSONObject.put("app_version", str2);
            }
            if (TextUtils.isEmpty(str)) {
                jSONObject.put("version_code", UMUtils.getAppVersionCode(this.mContext));
            } else {
                jSONObject.put("version_code", str);
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(this.mContext));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put("secret", MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(this.mContext, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.mContext);
            jSONObject.put(C3416b.f8485l, UMEnvelopeBuild.imprintProperty(this.mContext, "pr_ve", null));
            jSONObject.put(C3416b.f8486m, UMEnvelopeBuild.imprintProperty(this.mContext, "ud_da", null));
            jSONObject.put(C3416b.f8453ae, "1.0.0");
            if (TextUtils.isEmpty(imprintProperty)) {
                jSONObject.put(C3416b.f8485l, sharedPreferences.getString("vers_pre_version", "0"));
                jSONObject.put(C3416b.f8486m, sharedPreferences.getString("vers_date", new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()))));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public static UMProcessDBDatasSender getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBDatasSender.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBDatasSender();
                }
            }
        }
        UMProcessDBDatasSender uMProcessDBDatasSender = mInstance;
        uMProcessDBDatasSender.mContext = context;
        return uMProcessDBDatasSender;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        List<Integer> list;
        JSONObject optJSONObject;
        if (obj != null && (list = this.mGeneralBodyIds) != null && list.size() != 0) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("analytics") && (optJSONObject = jSONObject.optJSONObject("analytics")) != null && optJSONObject.length() > 0 && optJSONObject.has(C3416b.f8434R)) {
                UMProcessDBHelper.getInstance(this.mContext).deleteMainProcessEventDatasByIds(this.mGeneralBodyIds);
                this.mGeneralBodyIds.clear();
            }
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        int a = C3453n.m8858a().mo38761a(this.mContext);
        JSONObject generalBody = generalBody();
        if (generalBody.length() <= 0) {
            return null;
        }
        JSONObject generalHeader = generalHeader();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (generalBody != null && generalBody.length() > 0) {
                jSONObject2.put("analytics", generalBody);
            }
            if (generalHeader != null && generalHeader.length() > 0) {
                jSONObject.put("header", generalHeader);
            }
            if (jSONObject2.length() > 0) {
                if (jSONObject2.has("analytics")) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("analytics");
                    if (optJSONObject.length() == 1 && (optJSONObject.optJSONObject(C3416b.f8427K) != null || !TextUtils.isEmpty(optJSONObject.optString("userlevel")))) {
                        return null;
                    }
                    if (optJSONObject.length() == 2 && optJSONObject.optJSONObject(C3416b.f8427K) != null && !TextUtils.isEmpty(optJSONObject.optString("userlevel"))) {
                        return null;
                    }
                }
                jSONObject.put("content", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        if (UMGlobalContext.getInstance().isMainProcess(this.mContext)) {
            switch (i) {
                case 36945:
                    executor.schedule(new Runnable() {
                        /* class com.umeng.analytics.process.UMProcessDBDatasSender.RunnableC34761 */

                        public void run() {
                            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> call processDBToMain start.");
                            UMProcessDBHelper.getInstance(UMProcessDBDatasSender.this.mContext).processDBToMain();
                        }
                    }, 5, TimeUnit.SECONDS);
                    return;
                case UM_PROCESS_CONSTRUCTMESSAGE /*{ENCODED_INT: 36946}*/:
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg.");
                    constructMessage();
                    return;
                default:
                    return;
            }
        }
    }
}
