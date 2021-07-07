package com.taobao.accs.p263ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;

@Monitor(module = "accs", monitorPoint = "netperformance")
/* renamed from: com.taobao.accs.ut.monitor.NetPerformanceMonitor */
public class NetPerformanceMonitor extends BaseMonitor {

    /* renamed from: a */
    public long f7158a;
    @Dimension
    public int accs_sdk_version;
    @Dimension
    public int accs_type;

    /* renamed from: b */
    public long f7159b;

    /* renamed from: c */
    public long f7160c;

    /* renamed from: d */
    public long f7161d;
    public String data_id;
    public String device_id;

    /* renamed from: e */
    public long f7162e;
    @Dimension
    public int error_code;

    /* renamed from: f */
    public long f7163f;
    @Dimension
    public String fail_reasons;

    /* renamed from: g */
    public long f7164g;
    @Dimension
    public String host;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long in_queue_time;
    @Dimension
    public int msgType;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long receive_accs_to_call_time;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long receive_agoo_to_call_time;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long receive_to_call_back_time;
    @Dimension
    public String ret;
    @Dimension
    public int retry_times;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long send_to_receive_time;
    @Dimension
    public String service_id = "none";
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long start_to_enter_queue_time;
    public long take_date;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long talk_to_send_time;
    public long to_tnet_date;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0, max = 60000.0d, min = AbstractC8352oOoOOoO0.OooO0O0)
    public long total_time;

    /* renamed from: a */
    private long m7592a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0;
        }
        return j2 - j;
    }

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        this.accs_sdk_version = Constants.SDK_VERSION_CODE;
        this.total_time = m7592a(this.f7158a, this.f7161d);
        this.start_to_enter_queue_time = m7592a(this.f7158a, this.f7159b);
        this.in_queue_time = m7592a(this.f7159b, this.take_date);
        this.talk_to_send_time = m7592a(this.take_date, this.to_tnet_date);
        this.send_to_receive_time = m7592a(this.to_tnet_date, this.f7160c);
        this.receive_to_call_back_time = m7592a(this.f7160c, this.f7161d);
        this.receive_accs_to_call_time = m7592a(this.f7162e, this.f7163f);
        this.receive_agoo_to_call_time = m7592a(this.f7162e, this.f7164g);
        return super.beforeCommit();
    }

    public void onEnterQueueData() {
        this.f7159b = System.currentTimeMillis();
    }

    public void onRecAck() {
        this.f7160c = System.currentTimeMillis();
    }

    public void onReceiveData() {
        this.f7162e = System.currentTimeMillis();
    }

    public void onSend() {
        this.f7158a = System.currentTimeMillis();
    }

    public void onSendData() {
        this.to_tnet_date = System.currentTimeMillis();
    }

    public void onTakeFromQueue() {
        this.take_date = System.currentTimeMillis();
    }

    public void onToAccsTime() {
        this.f7163f = System.currentTimeMillis();
    }

    public void onToAgooTime() {
        this.f7164g = System.currentTimeMillis();
    }

    public void onToBizDate() {
        this.f7161d = System.currentTimeMillis();
    }

    public void setConnType(int i) {
        this.accs_type = i;
    }

    public void setDataId(String str) {
        this.data_id = str;
    }

    public void setDeviceId(String str) {
        this.device_id = str;
    }

    public void setFailReason(String str) {
        this.fail_reasons = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setRet(boolean z) {
        this.ret = z ? "y" : GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
    }

    public void setServiceId(String str) {
        this.service_id = str;
    }

    public void setFailReason(int i) {
        this.error_code = i;
        if (i == -4) {
            setFailReason("msg too large");
        } else if (i == -3) {
            setFailReason("service not available");
        } else if (i == -2) {
            setFailReason("param error");
        } else if (i == -1) {
            setFailReason("network fail");
        } else if (i == 200) {
        } else {
            if (i != 300) {
                setFailReason(String.valueOf(i));
            } else {
                setFailReason("app not bind");
            }
        }
    }
}
