package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.O0O00O;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.p263ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3184o;
import com.taobao.accs.utl.C3185p;
import com.taobao.accs.utl.C3188r;
import com.taobao.accs.utl.UtilityImpl;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class Message implements Serializable {
    public static int CONTROL_MAX_RETRY_TIMES = 5;
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BINDAPP = "ctrl_bindapp";
    public static final String KEY_BINDSERVICE = "ctrl_bindservice";
    public static final String KEY_BINDUSER = "ctrl_binduser";
    public static final String KEY_UNBINDAPP = "ctrl_unbindapp";
    public static final String KEY_UNBINDSERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBINDUSER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;

    /* renamed from: a */
    public static long f6893a = 1;

    /* renamed from: A */
    public String f6894A = null;

    /* renamed from: B */
    public String f6895B = null;

    /* renamed from: C */
    public String f6896C = null;

    /* renamed from: D */
    public byte[] f6897D;

    /* renamed from: E */
    public int f6898E;

    /* renamed from: F */
    public long f6899F;

    /* renamed from: G */
    public transient NetPerformanceMonitor f6900G;

    /* renamed from: H */
    public String f6901H = null;

    /* renamed from: I */
    public C3109Id f6902I;
    public String appSign = null;

    /* renamed from: b */
    public byte f6903b = 0;
    public String bizId = null;

    /* renamed from: c */
    public byte f6904c = 0;
    public Integer command = null;
    public String cunstomDataId;

    /* renamed from: d */
    public short f6905d;
    public String dataId;
    public long delyTime = 0;

    /* renamed from: e */
    public short f6906e;

    /* renamed from: f */
    public short f6907f;
    public boolean force = false;

    /* renamed from: g */
    public byte f6908g;

    /* renamed from: h */
    public byte f6909h;
    public URL host;

    /* renamed from: i */
    public String f6910i;
    public boolean isAck = false;
    public boolean isCancel = false;

    /* renamed from: j */
    public String f6911j;

    /* renamed from: k */
    public int f6912k = -1;

    /* renamed from: l */
    public Map<Integer, String> f6913l;

    /* renamed from: m */
    public String f6914m = null;

    /* renamed from: n */
    public Integer f6915n = 0;

    /* renamed from: o */
    public String f6916o = null;

    /* renamed from: p */
    public Integer f6917p = null;

    /* renamed from: q */
    public String f6918q = null;

    /* renamed from: r */
    public String f6919r = null;
    public int retryTimes = 0;

    /* renamed from: s */
    public String f6920s = null;
    public String serviceId = null;
    public long startSendTime;

    /* renamed from: t */
    public String f6921t = null;
    public int timeout = AbstractC3137b.ACCS_RECEIVE_TIMEOUT;

    /* renamed from: u */
    public String f6922u = null;
    public String userinfo = null;

    /* renamed from: v */
    public Integer f6923v = null;

    /* renamed from: w */
    public String f6924w = null;

    /* renamed from: x */
    public String f6925x = null;

    /* renamed from: y */
    public String f6926y = null;

    /* renamed from: z */
    public String f6927z = null;

    /* renamed from: com.taobao.accs.data.Message$Id */
    public static class C3109Id implements Serializable {

        /* renamed from: a */
        public int f6928a;

        /* renamed from: b */
        public String f6929b;

        public C3109Id(int i, String str) {
            this.f6928a = i;
            this.f6929b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3109Id.class != obj.getClass()) {
                return false;
            }
            C3109Id id = (C3109Id) obj;
            if (this.f6928a == id.getId() || this.f6929b.equals(id.getDataId())) {
                return true;
            }
            return false;
        }

        public String getDataId() {
            return this.f6929b;
        }

        public int getId() {
            return this.f6928a;
        }

        public int hashCode() {
            return this.f6929b.hashCode();
        }
    }

    public static class MsgResType implements Serializable {
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        public static String name(int i) {
            return i != 0 ? i != 1 ? "INVALID" : "NEED_ACK" : "NO_ACK";
        }

        public static int valueOf(int i) {
            return i != 0 ? 1 : 0;
        }
    }

    public static class MsgType implements Serializable {
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        public static String name(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "INVALID" : "HANDSHAKE" : "PING" : "DATA" : "CONTROL";
        }

        public static int valueOf(int i) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }
    }

    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i) {
            if (i == 0) {
                return DATA;
            }
            if (i == 1) {
                return ACK;
            }
            if (i == 2) {
                return REQ;
            }
            if (i != 3) {
                return DATA;
            }
            return RES;
        }
    }

    public Message() {
        synchronized (Message.class) {
            this.startSendTime = System.currentTimeMillis();
            String str = String.valueOf(this.startSendTime) + C9058ooOoOoOO.OooOO0 + String.valueOf(f6893a);
            this.dataId = str;
            long j = f6893a;
            f6893a = 1 + j;
            this.f6902I = new C3109Id((int) j, str);
        }
    }

    public static Message BuildPing(boolean z, int i) {
        Message message = new Message();
        message.f6912k = 2;
        message.command = 201;
        message.force = z;
        message.delyTime = (long) i;
        return message;
    }

    public static Message buildBackground(String str) {
        Message message = new Message();
        message.m7329a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f6910i = Constants.TARGET_BACK;
        m7331a(str, message);
        return message;
    }

    @Deprecated
    public static Message buildBindApp(AbstractC3137b bVar, Context context, Intent intent) {
        return buildBindApp(bVar.mo37654b((String) null), bVar.f7021m, context, intent);
    }

    @Deprecated
    public static Message buildBindService(AbstractC3137b bVar, Context context, Intent intent) {
        return buildBindService(bVar.mo37654b((String) null), bVar.f7021m, intent);
    }

    @Deprecated
    public static Message buildBindUser(AbstractC3137b bVar, Context context, Intent intent) {
        return buildBindUser(bVar.mo37654b((String) null), bVar.f7021m, intent);
    }

    public static Message buildErrorReportMessage(String str, String str2, String str3, int i) {
        Message message = new Message();
        try {
            message.host = new URL(str3);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        message.f6910i = Constants.TARGET_SERVICE_ST;
        message.m7329a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f6897D = (0 + "|" + i + "|" + str + "|" + C3178j.m7663b(GlobalClientInfo.getContext()) + "|" + str2).getBytes();
        return message;
    }

    public static Message buildForeground(String str) {
        Message message = new Message();
        message.m7329a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f6910i = Constants.TARGET_FORE;
        m7331a(str, message);
        return message;
    }

    public static Message buildHandshake(String str) {
        Message message = new Message();
        message.m7329a(3, ReqType.DATA, 1);
        message.f6914m = str;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 200;
        return message;
    }

    public static Message buildParameterError(String str, int i) {
        Message message = new Message();
        message.m7329a(1, ReqType.ACK, 0);
        message.command = Integer.valueOf(i);
        message.f6914m = str;
        return message;
    }

    @Deprecated
    public static Message buildPushAck(AbstractC3137b bVar, String str, String str2, String str3, boolean z, short s, String str4, Map<Integer, String> map) {
        return buildPushAck(bVar.mo37654b((String) null), bVar.f7021m, str, str2, str3, z, s, str4, map);
    }

    @Deprecated
    public static Message buildRequest(AbstractC3137b bVar, Context context, String str, String str2, String str3, ACCSManager.AccsRequest accsRequest, boolean z) {
        return buildRequest(context, bVar.mo37654b((String) null), bVar.f7021m, bVar.f7017i.getStoreId(), str, str2, accsRequest, z);
    }

    @Deprecated
    public static Message buildSendData(AbstractC3137b bVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(bVar.mo37654b((String) null), bVar.f7021m, bVar.f7017i.getStoreId(), context, str, accsRequest, true);
    }

    @Deprecated
    public static Message buildUnbindApp(AbstractC3137b bVar, Context context, Intent intent) {
        return buildUnbindApp(bVar.mo37654b((String) null), intent);
    }

    @Deprecated
    public static Message buildUnbindService(AbstractC3137b bVar, Context context, Intent intent) {
        return buildUnbindService(bVar.mo37654b((String) null), bVar.f7021m, intent);
    }

    @Deprecated
    public static Message buildUnbindUser(AbstractC3137b bVar, Context context, Intent intent) {
        return buildUnbindUser(bVar.mo37654b((String) null), bVar.f7021m, intent);
    }

    /* renamed from: c */
    private String m7334c() {
        return "Msg" + "_" + this.f6901H;
    }

    /* renamed from: a */
    public short mo37555a(Map<Integer, String> map) {
        short s = 0;
        if (map != null) {
            try {
                for (Integer num : map.keySet()) {
                    String str = map.get(Integer.valueOf(num.intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        s = (short) (s + ((short) (str.getBytes("utf-8").length & 1023)) + 2);
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
        return s;
    }

    /* renamed from: b */
    public void mo37557b() throws JSONException, UnsupportedEncodingException {
        Integer num = this.command;
        if (num != null && num.intValue() != 100 && this.command.intValue() != 102) {
            this.f6897D = new C3185p.C3186a().mo37783a("command", this.command.intValue() == 100 ? null : this.command).mo37784a("appKey", this.f6916o).mo37783a(Constants.KEY_OS_TYPE, this.f6917p).mo37784a("sign", this.appSign).mo37783a("sdkVersion", this.f6923v).mo37784a("appVersion", this.f6922u).mo37784a(Constants.KEY_TTID, this.f6924w).mo37784a(Constants.KEY_MODEL, this.f6926y).mo37784a("brand", this.f6927z).mo37784a("imei", this.f6894A).mo37784a(Constants.KEY_IMSI, this.f6895B).mo37784a("os", this.f6918q).mo37784a(Constants.KEY_EXTS, this.f6921t).mo37785a().toString().getBytes("utf-8");
        }
    }

    public byte[] build(Context context, int i) {
        String str;
        byte[] bArr;
        try {
            mo37557b();
        } catch (JSONException e) {
            ALog.m7598e(m7334c(), "build1", e, new Object[0]);
        } catch (UnsupportedEncodingException e2) {
            ALog.m7598e(m7334c(), "build2", e2, new Object[0]);
        }
        if (this.f6897D != null) {
            str = new String(this.f6897D);
        } else {
            str = "";
        }
        mo37556a();
        if (!this.isAck) {
            StringBuilder sb = new StringBuilder();
            sb.append(UtilityImpl.m7644l(context));
            sb.append("|");
            sb.append(this.f6914m);
            sb.append("|");
            String str2 = this.serviceId;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append("|");
            String str3 = this.userinfo;
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            this.f6911j = sb.toString();
        }
        try {
            bArr = (this.dataId + "").getBytes("utf-8");
            this.f6909h = (byte) this.f6911j.getBytes("utf-8").length;
            this.f6908g = (byte) this.f6910i.getBytes("utf-8").length;
        } catch (Exception e3) {
            e3.printStackTrace();
            ALog.m7598e(m7334c(), "build3", e3, new Object[0]);
            bArr = (this.dataId + "").getBytes();
            this.f6909h = (byte) this.f6911j.getBytes().length;
            this.f6908g = (byte) this.f6910i.getBytes().length;
        }
        short a = mo37555a(this.f6913l);
        int length = this.f6908g + 3 + 1 + this.f6909h + 1 + bArr.length;
        byte[] bArr2 = this.f6897D;
        short length2 = (short) (length + (bArr2 == null ? 0 : bArr2.length) + a + 2);
        this.f6906e = length2;
        this.f6905d = (short) (length2 + 2);
        C3188r rVar = new C3188r(this.f6905d + 2 + 4);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d(m7334c(), "Build Message", Constants.KEY_DATA_ID, new String(bArr));
        }
        try {
            rVar.mo37786a((byte) (this.f6903b | 32));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c = m7334c();
                ALog.m7597d(c, "\tversion:2 compress:" + ((int) this.f6903b), new Object[0]);
            }
            if (i == 0) {
                rVar.mo37786a(O0O00O.OooO00o);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(m7334c(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                rVar.mo37786a((byte) 64);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(m7334c(), "\tflag: 0x40", new Object[0]);
                }
            }
            rVar.mo37787a(this.f6905d);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c2 = m7334c();
                ALog.m7597d(c2, "\ttotalLength:" + ((int) this.f6905d), new Object[0]);
            }
            rVar.mo37787a(this.f6906e);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c3 = m7334c();
                ALog.m7597d(c3, "\tdataLength:" + ((int) this.f6906e), new Object[0]);
            }
            rVar.mo37787a(this.f6907f);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c4 = m7334c();
                ALog.m7597d(c4, "\tflags:" + Integer.toHexString(this.f6907f), new Object[0]);
            }
            rVar.mo37786a(this.f6908g);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c5 = m7334c();
                ALog.m7597d(c5, "\ttargetLength:" + ((int) this.f6908g), new Object[0]);
            }
            rVar.write(this.f6910i.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c6 = m7334c();
                ALog.m7597d(c6, "\ttarget:" + this.f6910i, new Object[0]);
            }
            rVar.mo37786a(this.f6909h);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c7 = m7334c();
                ALog.m7597d(c7, "\tsourceLength:" + ((int) this.f6909h), new Object[0]);
            }
            rVar.write(this.f6911j.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c8 = m7334c();
                ALog.m7597d(c8, "\tsource:" + this.f6911j, new Object[0]);
            }
            rVar.mo37786a((byte) bArr.length);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c9 = m7334c();
                ALog.m7597d(c9, "\tdataIdLength:" + bArr.length, new Object[0]);
            }
            rVar.write(bArr);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c10 = m7334c();
                ALog.m7597d(c10, "\tdataId:" + new String(bArr), new Object[0]);
            }
            rVar.mo37787a(a);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c11 = m7334c();
                ALog.m7597d(c11, "\textHeader len:" + ((int) a), new Object[0]);
            }
            if (this.f6913l != null) {
                for (Integer num : this.f6913l.keySet()) {
                    int intValue = num.intValue();
                    String str4 = this.f6913l.get(Integer.valueOf(intValue));
                    if (!TextUtils.isEmpty(str4)) {
                        rVar.mo37787a((short) ((((short) intValue) << 10) | ((short) (str4.getBytes("utf-8").length & 1023))));
                        rVar.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            String c12 = m7334c();
                            ALog.m7597d(c12, "\textHeader key:" + intValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            if (this.f6897D != null) {
                rVar.write(this.f6897D);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                String c13 = m7334c();
                ALog.m7597d(c13, "\toriData:" + str, new Object[0]);
            }
            rVar.flush();
        } catch (IOException e4) {
            ALog.m7598e(m7334c(), "build4", e4, new Object[0]);
        }
        byte[] byteArray = rVar.toByteArray();
        try {
            rVar.close();
        } catch (IOException e5) {
            ALog.m7598e(m7334c(), "build5", e5, new Object[0]);
        }
        return byteArray;
    }

    public String getDataId() {
        return this.dataId;
    }

    public long getDelyTime() {
        return this.delyTime;
    }

    public C3109Id getMsgId() {
        return this.f6902I;
    }

    public NetPerformanceMonitor getNetPermanceMonitor() {
        return this.f6900G;
    }

    public int getNode() {
        return this.f6898E;
    }

    public String getPackageName() {
        String str = this.f6914m;
        return str == null ? "" : str;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public int getType() {
        return this.f6912k;
    }

    public boolean isControlFrame() {
        return Constants.TARGET_CONTROL.equals(this.f6910i);
    }

    public boolean isTimeOut() {
        boolean z = (System.currentTimeMillis() - this.startSendTime) + this.delyTime >= ((long) this.timeout);
        if (z) {
            String c = m7334c();
            ALog.m7599e(c, "delay time:" + this.delyTime + " beforeSendTime:" + (System.currentTimeMillis() - this.startSendTime) + " timeout" + this.timeout, new Object[0]);
        }
        return z;
    }

    public void setSendTime(long j) {
        this.f6899F = j;
    }

    public static Message buildBindApp(String str, String str2, Context context, Intent intent) {
        Message message = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            message = buildBindApp(context, str2, intent.getStringExtra("appKey"), intent.getStringExtra("app_sercet"), stringExtra, intent.getStringExtra(Constants.KEY_TTID), intent.getStringExtra("appVersion"));
            m7331a(str, message);
            return message;
        } catch (Exception e) {
            ALog.m7599e("Msg", "buildBindApp", e.getMessage());
            return message;
        }
    }

    public static Message buildBindService(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildBindService(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            message.f6901H = str2;
            m7331a(str, message);
            return message;
        } catch (Exception e) {
            ALog.m7598e("Msg", "buildBindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    public static Message buildBindUser(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildBindUser(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra("userInfo"));
            if (message != null) {
                message.f6901H = str2;
                m7331a(str, message);
            }
        } catch (Exception e) {
            ALog.m7598e("Msg", "buildBindUser", e, new Object[0]);
            e.printStackTrace();
        }
        return message;
    }

    public static Message buildPushAck(String str, String str2, String str3, String str4, String str5, boolean z, short s, String str6, Map<Integer, String> map) {
        Message message = new Message();
        message.f6898E = 1;
        message.m7333a(s, z);
        message.f6911j = str3;
        message.f6910i = str4;
        message.dataId = str5;
        message.isAck = true;
        message.f6913l = map;
        try {
            if (TextUtils.isEmpty(str6)) {
                message.host = new URL(str);
            } else {
                message.host = new URL(str6);
            }
            message.f6901H = str2;
            if (message.host == null) {
                try {
                    message.host = new URL(str);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (message.host == null) {
                try {
                    message.host = new URL(str);
                } catch (MalformedURLException e2) {
                    e2.printStackTrace();
                }
            }
            throw th;
        }
        return message;
    }

    public static Message buildRequest(Context context, String str, String str2, String str3, String str4, String str5, ACCSManager.AccsRequest accsRequest, boolean z) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.REQ, 1);
        message.command = 100;
        message.f6914m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.f6897D = accsRequest.data;
        String str6 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str6);
        sb.append("|");
        String str7 = accsRequest.target;
        if (str7 == null) {
            str7 = "";
        }
        sb.append(str7);
        message.f6910i = sb.toString();
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        message.f6901H = str2;
        int i = accsRequest.timeout;
        if (i > 0) {
            message.timeout = i;
        }
        if (z) {
            m7332a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        m7330a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f6860c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f6900G = netPerformanceMonitor;
        netPerformanceMonitor.setDataId(accsRequest.dataId);
        message.f6900G.setServiceId(accsRequest.serviceId);
        message.f6900G.setHost(message.host.toString());
        message.f6901H = str2;
        return message;
    }

    @Deprecated
    public static Message buildSendData(AbstractC3137b bVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z) {
        return buildSendData(bVar.mo37654b((String) null), bVar.f7021m, bVar.f7017i.getStoreId(), context, str, accsRequest, z);
    }

    public static Message buildUnbindApp(String str, Intent intent) {
        ALog.m7599e("Msg", "buildUnbindApp1" + UtilityImpl.m7611a(new Exception()), new Object[0]);
        Message message = null;
        try {
            message = buildUnbindApp(str, intent.getStringExtra(Constants.KEY_PACKAGE_NAME));
            m7331a(str, message);
            return message;
        } catch (Exception e) {
            ALog.m7599e("Msg", "buildUnbindApp1", e.getMessage());
            return message;
        }
    }

    public static Message buildUnbindService(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildUnbindService(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            message.f6901H = str2;
            m7331a(str, message);
            return message;
        } catch (Exception e) {
            ALog.m7598e("Msg", "buildUnbindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    public static Message buildUnbindUser(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildUnbindUser(intent.getStringExtra(Constants.KEY_PACKAGE_NAME));
            message.f6901H = str2;
            m7331a(str, message);
            return message;
        } catch (Exception e) {
            ALog.m7598e("Msg", "buildUnbindUser", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(str, str2, str3, context, str4, accsRequest, true);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest, boolean z) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.command = 100;
        message.f6914m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.f6897D = accsRequest.data;
        String str5 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.TARGET_SERVICE_PRE);
        sb.append(str5);
        sb.append("|");
        String str6 = accsRequest.target;
        if (str6 == null) {
            str6 = "";
        }
        sb.append(str6);
        message.f6910i = sb.toString();
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        int i = accsRequest.timeout;
        if (i > 0) {
            message.timeout = i;
        }
        if (z) {
            m7332a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        m7330a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f6860c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f6900G = netPerformanceMonitor;
        netPerformanceMonitor.setMsgType(0);
        message.f6900G.setDataId(accsRequest.dataId);
        message.f6900G.setServiceId(accsRequest.serviceId);
        message.f6900G.setHost(message.host.toString());
        message.f6901H = str2;
        return message;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37556a() {
        /*
            r6 = this;
            r0 = 0
            byte[] r1 = r6.f6897D     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            byte[] r0 = r6.f6897D     // Catch:{ all -> 0x0030 }
            r2.write(r0)     // Catch:{ all -> 0x0030 }
            r2.finish()     // Catch:{ all -> 0x0030 }
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            int r3 = r0.length     // Catch:{ all -> 0x0030 }
            byte[] r4 = r6.f6897D     // Catch:{ all -> 0x0030 }
            int r4 = r4.length     // Catch:{ all -> 0x0030 }
            if (r3 >= r4) goto L_0x0029
            r6.f6897D = r0     // Catch:{ all -> 0x0030 }
            r0 = 1
            r6.f6903b = r0     // Catch:{ all -> 0x0030 }
        L_0x0029:
            r2.close()     // Catch:{ Exception -> 0x004c }
        L_0x002c:
            r1.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0030:
            r0 = move-exception
            goto L_0x003b
        L_0x0032:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x003b
        L_0x0037:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x003b:
            r6.m7334c()     // Catch:{ all -> 0x004d }
            r0.toString()     // Catch:{ all -> 0x004d }
            r0.printStackTrace()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0049
            r2.close()
        L_0x0049:
            if (r1 == 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            return
        L_0x004d:
            r0 = move-exception
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            goto L_0x005a
        L_0x0059:
            throw r0
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.Message.mo37556a():void");
    }

    @Deprecated
    public static Message buildUnbindApp(AbstractC3137b bVar, Context context, String str, String str2, String str3, String str4) {
        return buildUnbindApp(bVar.mo37654b((String) null), str);
    }

    public static Message buildUnbindApp(String str, String str2) {
        Exception e;
        Message message = null;
        try {
            ALog.m7597d("Msg", "buildUnbindApp", new Object[0]);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            Message message2 = new Message();
            try {
                message2.f6898E = 1;
                message2.m7329a(1, ReqType.DATA, 1);
                message2.f6914m = str2;
                message2.f6910i = Constants.TARGET_CONTROL;
                message2.command = 2;
                message2.f6914m = str2;
                message2.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
                message2.cunstomDataId = KEY_UNBINDAPP;
                m7331a(str, message2);
                return message2;
            } catch (Exception e2) {
                e = e2;
                message = message2;
            }
        } catch (Exception e3) {
            e = e3;
            ALog.m7599e("Msg", "buildUnbindApp", e.getMessage());
            return message;
        }
    }

    @Deprecated
    public static Message buildUnbindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildUnbindUser(str);
    }

    @Deprecated
    public static Message buildBindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildBindService(str, str3);
    }

    @Deprecated
    public static Message buildBindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildBindUser(str, str4);
    }

    @Deprecated
    public static Message buildUnbindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildUnbindService(str, str3);
    }

    public static Message buildUnbindUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.f6914m = str;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 4;
        message.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_UNBINDUSER;
        return message;
    }

    @Deprecated
    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return buildBindApp(context, str, str2, str3, str4, str5, str6);
    }

    public static Message buildBindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.f6914m = str;
        message.serviceId = str2;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 5;
        message.f6914m = str;
        message.serviceId = str2;
        message.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_BINDSERVICE;
        return message;
    }

    public static Message buildBindUser(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.f6914m = str;
        message.userinfo = str2;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 3;
        message.f6914m = str;
        message.userinfo = str2;
        message.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_BINDUSER;
        return message;
    }

    public static Message buildUnbindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.f6914m = str;
        message.serviceId = str2;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 6;
        message.f6914m = str;
        message.serviceId = str2;
        message.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_UNBINDSERVICE;
        return message;
    }

    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = null;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f6898E = 1;
        message.m7329a(1, ReqType.DATA, 1);
        message.f6917p = 1;
        message.f6918q = Build.VERSION.SDK_INT + "";
        message.f6914m = str4;
        message.f6910i = Constants.TARGET_CONTROL;
        message.command = 1;
        message.f6916o = str2;
        message.appSign = UtilityImpl.m7610a(context, str2, str3, UtilityImpl.m7644l(context), str);
        message.f6923v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f6922u = str6;
        message.f6914m = str4;
        message.f6924w = str5;
        message.f6926y = Build.MODEL;
        message.f6927z = Build.BRAND;
        message.cunstomDataId = KEY_BINDAPP;
        message.f6901H = str;
        message.f6921t = new C3185p.C3186a().mo37784a("notifyEnable", UtilityImpl.m7650r(context)).mo37784a("romInfo", new C3184o().mo37782a()).mo37785a().toString();
        UtilityImpl.m7615a(context, Constants.SP_FILE_NAME, UtilityImpl.m7650r(context));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            message.f6894A = telephonyManager != null ? telephonyManager.getDeviceId() : null;
            if (telephonyManager != null) {
                str7 = telephonyManager.getSubscriberId();
            }
            message.f6895B = str7;
        } catch (Throwable th) {
            ALog.m7603w("Msg", "buildBindApp imei", th.getMessage());
        }
        return message;
    }

    /* renamed from: a */
    public static void m7332a(String str, Message message, ACCSManager.AccsRequest accsRequest) {
        URL url = accsRequest.host;
        if (url == null) {
            try {
                message.host = new URL(str);
            } catch (MalformedURLException e) {
                ALog.m7598e("Msg", "setUnit", e, new Object[0]);
                e.printStackTrace();
            }
        } else {
            message.host = url;
        }
    }

    /* renamed from: a */
    public static void m7331a(String str, Message message) {
        try {
            message.host = new URL(str);
        } catch (Exception e) {
            ALog.m7598e("Msg", "setControlHost", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m7330a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str6) || str4 != null) {
            message.f6913l = new HashMap();
            if (str5 != null && UtilityImpl.m7605a(str5) <= 1023) {
                message.f6913l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
            }
            if (str != null && UtilityImpl.m7605a(str) <= 1023) {
                message.f6913l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
            }
            if (str2 != null && UtilityImpl.m7605a(str2) <= 1023) {
                message.f6913l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
            }
            if (str6 != null && UtilityImpl.m7605a(str6) <= 1023) {
                message.f6913l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
            }
            if (str4 != null && UtilityImpl.m7605a(str4) <= 1023) {
                message.f6913l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
            }
            if (str3 != null && UtilityImpl.m7605a(str3) <= 1023) {
                message.f6913l.put(19, str3);
            }
        }
    }

    /* renamed from: a */
    private void m7329a(int i, ReqType reqType, int i2) {
        this.f6912k = i;
        if (i != 2) {
            this.f6907f = (short) (((((i & 1) << 4) | (reqType.ordinal() << 2)) | i2) << 11);
        }
    }

    /* renamed from: a */
    private void m7333a(short s, boolean z) {
        this.f6912k = 1;
        this.f6907f = s;
        short s2 = (short) (s & -16385);
        this.f6907f = s2;
        short s3 = (short) (s2 | 8192);
        this.f6907f = s3;
        short s4 = (short) (s3 & -2049);
        this.f6907f = s4;
        short s5 = (short) (s4 & -65);
        this.f6907f = s5;
        if (z) {
            this.f6907f = (short) (s5 | 32);
        }
    }
}
