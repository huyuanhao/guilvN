package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3416b;
import com.umeng.analytics.pro.C3469w;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMProcessDBHelper {
    public static UMProcessDBHelper mInstance;
    public InsertEventCallback ekvCallBack = new InsertEventCallback();
    public Context mContext;
    public FileLockUtil mFileLock = new FileLockUtil();

    public class InsertEventCallback implements FileLockCallback {
        public InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(AbstractC3479a.f8831c)) {
                str = str.replaceFirst(AbstractC3479a.f8831c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(AbstractC3479a.f8832d, ""), (JSONArray) obj);
            return true;
        }
    }

    public class ProcessToMainCallback implements FileLockCallback {
        public ProcessToMainCallback() {
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
            UMProcessDBHelper.this.processToMain(str.replace(AbstractC3479a.f8832d, ""));
            return true;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    public class C3478a implements Serializable {

        /* renamed from: a */
        public int f8820a;

        /* renamed from: b */
        public String f8821b;

        /* renamed from: c */
        public String f8822c;

        /* renamed from: d */
        public String f8823d;

        /* renamed from: e */
        public int f8824e;

        /* renamed from: f */
        public String f8825f;

        /* renamed from: g */
        public String f8826g;

        /* renamed from: h */
        public String f8827h;

        public C3478a() {
        }
    }

    public UMProcessDBHelper() {
    }

    private List<C3478a> datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C3478a aVar = new C3478a();
                aVar.f8822c = jSONObject.optString("id");
                aVar.f8826g = UMUtils.getAppVersionName(this.mContext);
                aVar.f8827h = UMUtils.getAppVersionCode(this.mContext);
                aVar.f8821b = jSONObject.optString("__i");
                aVar.f8824e = jSONObject.optInt("__t");
                aVar.f8825f = str;
                if (jSONObject.has(C3416b.f8451ac)) {
                    jSONObject.remove(C3416b.f8451ac);
                }
                jSONObject.put(C3416b.f8451ac, getDataSource());
                jSONObject.remove("__i");
                jSONObject.remove("__t");
                aVar.f8823d = C3469w.m8935a().mo38798a(jSONObject.toString());
                jSONObject.remove(C3416b.f8451ac);
                arrayList.add(aVar);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(C3481b.m8961b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[SYNTHETIC, Splitter:B:29:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099 A[SYNTHETIC, Splitter:B:37:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean insertEvents_(java.lang.String r8, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3478a> r9) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.insertEvents_(java.lang.String, java.util.List):boolean");
    }

    private boolean processIsService(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processToMain(String str) {
        if (dbIsExists(str)) {
            List<C3478a> readEventByProcess = readEventByProcess(str);
            if (!readEventByProcess.isEmpty() && insertEvents_(AbstractC3479a.f8836h, readEventByProcess)) {
                deleteEventDatas(str, null, readEventByProcess);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (r3 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r3 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        r3.endTransaction();
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[SYNTHETIC, Splitter:B:34:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd A[Catch:{ Exception -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3478a> readEventByProcess(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readEventByProcess(java.lang.String):java.util.List");
    }

    public void createDBByProcess(String str) {
        try {
            C3482c.m8962a(this.mContext).mo38823a(str);
            C3482c.m8962a(this.mContext).mo38824b(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteEventDatas(java.lang.String r5, java.lang.String r6, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3478a> r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteEventDatas(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (0 == 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        com.umeng.analytics.process.C3482c.m8962a(r7.mContext).mo38824b(com.umeng.analytics.process.AbstractC3479a.f8836h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1 != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteMainProcessEventDatasByIds(java.util.List<java.lang.Integer> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "_main_"
            r1 = 0
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.C3482c.m8962a(r2)     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            android.database.sqlite.SQLiteDatabase r1 = r2.mo38823a(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
        L_0x0014:
            boolean r2 = r8.hasNext()     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r8.next()     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            java.lang.String r3 = "__et_p"
            java.lang.String r4 = "id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            r6 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            r5[r6] = r2     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            r1.delete(r3, r4, r5)     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            r1.setTransactionSuccessful()     // Catch:{ Exception -> 0x0048, all -> 0x0038 }
            if (r1 == 0) goto L_0x004e
            goto L_0x004b
        L_0x0038:
            r8 = move-exception
            if (r1 == 0) goto L_0x003e
            r1.endTransaction()
        L_0x003e:
            android.content.Context r1 = r7.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.C3482c.m8962a(r1)
            r1.mo38824b(r0)
            throw r8
        L_0x0048:
            if (r1 == 0) goto L_0x004e
        L_0x004b:
            r1.endTransaction()
        L_0x004e:
            android.content.Context r8 = r7.mContext
            com.umeng.analytics.process.c r8 = com.umeng.analytics.process.C3482c.m8962a(r8)
            r8.mo38824b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteMainProcessEventDatasByIds(java.util.List):void");
    }

    public void insertEvents(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(C3481b.m8961b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(C3481b.m8959a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.AbstractC3475a() {
                /* class com.umeng.analytics.process.UMProcessDBHelper.C34771 */

                @Override // com.umeng.analytics.process.DBFileTraversalUtil.AbstractC3475a
                /* renamed from: a */
                public void mo38811a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0142, code lost:
        if (r5 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0154, code lost:
        if (r5 == null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016b A[SYNTHETIC, Splitter:B:68:0x016b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject readMainEvents(long r19, java.util.List<java.lang.Integer> r21) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readMainEvents(long, java.util.List):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085 A[SYNTHETIC, Splitter:B:40:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b A[SYNTHETIC, Splitter:B:48:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a0 A[Catch:{ Exception -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject readVersionInfoFromColumId(java.lang.Integer r9) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readVersionInfoFromColumId(java.lang.Integer):org.json.JSONObject");
    }

    public UMProcessDBHelper(Context context) {
        C3469w.m8935a().mo38799a(context);
    }
}
