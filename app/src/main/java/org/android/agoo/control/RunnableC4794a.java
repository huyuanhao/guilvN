package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.commonsdk.proguard.C3617o;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.a */
public class RunnableC4794a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f13443a;

    /* renamed from: b */
    public final /* synthetic */ String f13444b;

    /* renamed from: c */
    public final /* synthetic */ AgooFactory f13445c;

    public RunnableC4794a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f13445c = agooFactory;
        this.f13443a = bArr;
        this.f13444b = str;
    }

    public void run() {
        try {
            String str = new String(this.f13443a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String str2 = null;
                String str3 = null;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        str2 = jSONObject.getString(C3617o.f9367au);
                        str3 = jSONObject.getString(C3617o.f9365as);
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m7600i(AgooFactory.TAG, "saveMsg msgId:" + str2 + ",message=" + str + ",currentPack=" + str3 + ",reportTimes=" + Config.m14276e(AgooFactory.mContext), new Object[0]);
                }
                if (!TextUtils.isEmpty(str3) && TextUtils.equals(str3, AgooFactory.mContext.getPackageName())) {
                    if (TextUtils.isEmpty(this.f13444b)) {
                        this.f13445c.messageService.mo44539a(str2, str, "0");
                    } else {
                        this.f13445c.messageService.mo44539a(str2, str, this.f13444b);
                    }
                }
            }
        } catch (Throwable th) {
            ALog.m7599e(AgooFactory.TAG, "saveMsg fail:" + th.toString(), new Object[0]);
        }
    }
}
