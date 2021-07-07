package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlowControl {
    public static final int DELAY_MAX = -1;
    public static final int DELAY_MAX_BRUSH = -1000;
    public static final int HIGH_FLOW_CTRL = 2;
    public static final int HIGH_FLOW_CTRL_BRUSH = 3;
    public static final int LOW_FLOW_CTRL = 1;
    public static final int NO_FLOW_CTRL = 0;
    public static final String SERVICE_ALL = "ALL";
    public static final String SERVICE_ALL_BRUSH = "ALL_BRUSH";
    public static final int STATUS_FLOW_CTRL_ALL = 420;
    public static final int STATUS_FLOW_CTRL_BRUSH = 422;
    public static final int STATUS_FLOW_CTRL_CUR = 421;

    /* renamed from: a */
    public Context f6975a;

    /* renamed from: b */
    public FlowCtrlInfoHolder f6976b;

    public static class FlowControlInfo implements Serializable {
        public static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        public FlowControlInfo(String str, String str2, int i, long j, long j2, long j3) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i;
            this.delayTime = j;
            this.expireTime = j2 <= 0 ? 0 : j2;
            this.startTime = j3 <= 0 ? 0 : j3;
        }

        public boolean isExpired() {
            return System.currentTimeMillis() - (this.startTime + this.expireTime) > 0;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }
    }

    public static class FlowCtrlInfoHolder implements Serializable {
        public static final long serialVersionUID = 6307563052429742524L;
        public Map<String, FlowControlInfo> flowCtrlMap = null;

        public FlowControlInfo get(String str, String str2) {
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    public FlowControl(Context context) {
        this.f6975a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        r13 = r19;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ all -> 0x011d, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo37617a(java.util.Map<java.lang.Integer, java.lang.String> r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.mo37617a(java.util.Map, java.lang.String):int");
    }

    /* renamed from: a */
    private boolean m7396a(long j, long j2) {
        if (j != 0 && j2 > 0) {
            return true;
        }
        ALog.m7599e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo37618a(java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.mo37618a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    private void m7395a() {
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f6976b;
        if (flowCtrlInfoHolder != null && flowCtrlInfoHolder.flowCtrlMap != null) {
            synchronized (this) {
                Iterator<Map.Entry<String, FlowControlInfo>> it = this.f6976b.flowCtrlMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().isExpired()) {
                        it.remove();
                    }
                }
            }
        }
    }
}
