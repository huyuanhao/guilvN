package com.alibaba.sdk.android.utils;

import android.content.Context;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AMSDevReporter {
    public static String TAG = "AMSDevReporter";

    /* renamed from: a */
    public static Context f725a;

    /* renamed from: a */
    public static ConcurrentHashMap<AMSSdkTypeEnum, AMSReportStatusEnum> f726a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static final ExecutorService f727a = Executors.newSingleThreadExecutor(new ThreadFactoryC0328a());

    /* renamed from: a */
    public static boolean f728a = false;

    public enum AMSReportStatusEnum {
        UNREPORTED,
        REPORTED
    }

    public enum AMSSdkExtInfoKeyEnum {
        AMS_EXTINFO_KEY_VERSION(C3848l.f10392j),
        AMS_EXTINFO_KEY_PACKAGE("PackageName");
        
        public String description;

        /* access modifiers changed from: public */
        AMSSdkExtInfoKeyEnum(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public enum AMSSdkTypeEnum {
        AMS_MAN("MAN"),
        AMS_HTTPDNS("HTTPDNS"),
        AMS_MPUSH("MPUSH"),
        AMS_MAC("MAC"),
        AMS_API("API"),
        AMS_HOTFIX("HOTFIX"),
        AMS_FEEDBACK("FEEDBACK"),
        AMS_IM("IM");
        
        public String description;

        /* access modifiers changed from: public */
        AMSSdkTypeEnum(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    static {
        for (AMSSdkTypeEnum aMSSdkTypeEnum : AMSSdkTypeEnum.values()) {
            f726a.put(aMSSdkTypeEnum, AMSReportStatusEnum.UNREPORTED);
        }
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum) {
        asyncReport(context, aMSSdkTypeEnum, null);
    }

    public static AMSReportStatusEnum getReportStatus(AMSSdkTypeEnum aMSSdkTypeEnum) {
        return f726a.get(aMSSdkTypeEnum);
    }

    public static void setLogEnabled(boolean z) {
        C0340d.setLogEnabled(z);
    }

    public static void asyncReport(Context context, final AMSSdkTypeEnum aMSSdkTypeEnum, final Map<String, Object> map) {
        if (context == null) {
            C0340d.m634c(TAG, "Context is null, return.");
            return;
        }
        f725a = context;
        String str = TAG;
        C0340d.m633b(str, "Add [" + aMSSdkTypeEnum.toString() + "] to report queue.");
        f728a = false;
        f727a.execute(new Runnable() {
            /* class com.alibaba.sdk.android.utils.AMSDevReporter.RunnableC03271 */

            public void run() {
                if (AMSDevReporter.f728a) {
                    C0340d.m634c(AMSDevReporter.TAG, "Unable to execute remain task in queue, return.");
                    return;
                }
                String str = AMSDevReporter.TAG;
                C0340d.m633b(str, "Get [" + aMSSdkTypeEnum.toString() + "] from report queue.");
                AMSDevReporter.m604a(aMSSdkTypeEnum, map);
            }
        });
    }

    /* renamed from: a */
    public static void m604a(AMSSdkTypeEnum aMSSdkTypeEnum, Map<String, Object> map) {
        String aMSSdkTypeEnum2 = aMSSdkTypeEnum.toString();
        if (f726a.get(aMSSdkTypeEnum) != AMSReportStatusEnum.UNREPORTED) {
            String str = TAG;
            C0340d.m633b(str, "[" + aMSSdkTypeEnum2 + "] already reported, return.");
            return;
        }
        int i = 0;
        int i2 = 5;
        while (true) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Report [");
            sb.append(aMSSdkTypeEnum2);
            sb.append("], times: [");
            i++;
            sb.append(i);
            sb.append("].");
            C0340d.m633b(str2, sb.toString());
            if (!m606a(aMSSdkTypeEnum, map)) {
                if (i > 10) {
                    String str3 = TAG;
                    C0340d.m634c(str3, "Report [" + aMSSdkTypeEnum2 + "] stat failed, exceed max retry times, return.");
                    f726a.put(aMSSdkTypeEnum, AMSReportStatusEnum.UNREPORTED);
                    f728a = true;
                    break;
                }
                String str4 = TAG;
                C0340d.m633b(str4, "Report [" + aMSSdkTypeEnum2 + "] failed, wait for [" + i2 + "] seconds.");
                C0341e.m638a((double) i2);
                i2 *= 2;
                if (i2 >= 60) {
                    i2 = 60;
                }
            } else {
                String str5 = TAG;
                C0340d.m633b(str5, "Report [" + aMSSdkTypeEnum2 + "] stat success.");
                f726a.put(aMSSdkTypeEnum, AMSReportStatusEnum.REPORTED);
                break;
            }
        }
        if (f728a) {
            String str6 = TAG;
            C0340d.m634c(str6, "Report [" + aMSSdkTypeEnum2 + "] failed, clear remain report in queue.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dc A[SYNTHETIC, Splitter:B:74:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e4 A[Catch:{ IOException -> 0x01e0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m606a(com.alibaba.sdk.android.utils.AMSDevReporter.AMSSdkTypeEnum r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.AMSDevReporter.m606a(com.alibaba.sdk.android.utils.AMSDevReporter$AMSSdkTypeEnum, java.util.Map):boolean");
    }

    /* renamed from: a */
    public static String m603a(AMSSdkTypeEnum aMSSdkTypeEnum, String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(aMSSdkTypeEnum);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(str);
        if (map != null) {
            String str2 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString());
            if (!C0341e.m639a(str2)) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(str2);
            }
            String str3 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_PACKAGE.toString());
            if (!C0341e.m639a(str3)) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
