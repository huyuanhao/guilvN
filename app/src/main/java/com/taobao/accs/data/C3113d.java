package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.net.C3145j;
import com.taobao.accs.p263ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p263ut.monitor.TrafficsMonitor;
import com.taobao.accs.p263ut.p264a.C3162a;
import com.taobao.accs.p263ut.p264a.C3163b;
import com.taobao.accs.p263ut.p264a.C3165d;
import com.taobao.accs.p263ut.p264a.C3166e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.C3185p;
import com.taobao.accs.utl.C3189s;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.socialize.handler.UMSSOHandler;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.data.d */
public class C3113d {

    /* renamed from: a */
    public ConcurrentMap<String, ScheduledFuture<?>> f6943a = new ConcurrentHashMap();

    /* renamed from: b */
    public int f6944b;

    /* renamed from: c */
    public TrafficsMonitor f6945c;

    /* renamed from: d */
    public FlowControl f6946d;

    /* renamed from: e */
    public AntiBrush f6947e;

    /* renamed from: f */
    public String f6948f = "";

    /* renamed from: g */
    public ConcurrentMap<Message.C3109Id, Message> f6949g = new ConcurrentHashMap();

    /* renamed from: h */
    public boolean f6950h = false;

    /* renamed from: i */
    public Context f6951i;

    /* renamed from: j */
    public C3165d f6952j;

    /* renamed from: k */
    public Message f6953k;

    /* renamed from: l */
    public AbstractC3137b f6954l;

    /* renamed from: m */
    public String f6955m = "MsgRecv_";

    /* renamed from: n */
    public LinkedHashMap<String, String> f6956n = new MessageHandler$1(this);

    /* renamed from: o */
    public Map<String, C3110a> f6957o = new HashMap();

    /* renamed from: p */
    public Runnable f6958p = new RunnableC3115f(this);

    public C3113d(Context context, AbstractC3137b bVar) {
        String str;
        this.f6951i = context;
        this.f6954l = bVar;
        this.f6945c = new TrafficsMonitor(context);
        this.f6946d = new FlowControl(this.f6951i);
        this.f6947e = new AntiBrush(this.f6951i);
        if (bVar == null) {
            str = this.f6955m;
        } else {
            str = this.f6955m + bVar.f7021m;
        }
        this.f6955m = str;
        m7359i();
        mo37602h();
    }

    /* renamed from: b */
    private boolean m7355b(int i) {
        return i == -1 || i == -9 || i == -10 || i == -11;
    }

    /* renamed from: i */
    private void m7359i() {
        try {
            File dir = this.f6951i.getDir("accs", 0);
            File file = new File(dir, "message" + this.f6954l.mo37667i());
            if (!file.exists()) {
                ALog.m7597d(this.f6955m, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    this.f6956n.put(readLine, readLine);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m7360j() {
        try {
            File dir = this.f6951i.getDir("accs", 0);
            FileWriter fileWriter = new FileWriter(new File(dir, "message" + this.f6954l.mo37667i()));
            fileWriter.write("");
            for (String str : this.f6956n.keySet()) {
                fileWriter.append((CharSequence) str).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo37592a(byte[] bArr) throws IOException {
        mo37593a(bArr, (String) null);
    }

    /* renamed from: b */
    public void mo37595b() {
        ALog.m7597d(this.f6955m, "onRcvPing", new Object[0]);
        synchronized (C3113d.class) {
            this.f6950h = false;
        }
    }

    /* renamed from: c */
    public boolean mo37597c() {
        return this.f6950h;
    }

    /* renamed from: d */
    public int mo37598d() {
        return this.f6949g.size();
    }

    /* renamed from: e */
    public Collection<Message> mo37599e() {
        return this.f6949g.values();
    }

    /* renamed from: f */
    public Set<Message.C3109Id> mo37600f() {
        return this.f6949g.keySet();
    }

    /* renamed from: g */
    public C3165d mo37601g() {
        return this.f6952j;
    }

    /* renamed from: h */
    public void mo37602h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.f6958p);
        } catch (Throwable th) {
            ALog.m7598e(this.f6955m, "restoreTraffics", th, new Object[0]);
        }
    }

    /* renamed from: c */
    private boolean m7357c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f6956n.containsKey(str);
    }

    /* renamed from: d */
    private void m7358d(String str) {
        if (!TextUtils.isEmpty(str) && !this.f6956n.containsKey(str)) {
            this.f6956n.put(str, str);
            m7360j();
        }
    }

    /* renamed from: a */
    public void mo37593a(byte[] bArr, String str) throws IOException {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i(this.f6955m, "onMessage", "host", str);
        }
        C3189s sVar = new C3189s(bArr);
        try {
            int a = sVar.mo37788a();
            int i = (a & 240) >> 4;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str2 = this.f6955m;
                ALog.m7597d(str2, "version:" + i, new Object[0]);
            }
            int i2 = a & 15;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str3 = this.f6955m;
                ALog.m7597d(str3, "compress:" + i2, new Object[0]);
            }
            sVar.mo37788a();
            int b = sVar.mo37790b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str4 = this.f6955m;
                ALog.m7597d(str4, "totalLen:" + b, new Object[0]);
            }
            int i3 = 0;
            while (i3 < b) {
                int b2 = sVar.mo37790b();
                int i4 = i3 + 2;
                if (b2 > 0) {
                    byte[] bArr2 = new byte[b2];
                    sVar.read(bArr2);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        String str5 = this.f6955m;
                        ALog.m7597d(str5, "buf len:" + b2, new Object[0]);
                    }
                    i3 = i4 + b2;
                    m7347a(i2, bArr2, str, i);
                } else {
                    throw new IOException("data format error");
                }
            }
        } catch (Throwable th) {
            sVar.close();
            throw th;
        }
        sVar.close();
    }

    /* renamed from: c */
    private Intent m7356c(Message message) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.f6914m);
        intent.putExtra("command", message.command);
        intent.putExtra(Constants.KEY_SERVICE_ID, message.serviceId);
        intent.putExtra("userInfo", message.userinfo);
        Integer num = message.command;
        if (num != null && num.intValue() == 100) {
            intent.putExtra(Constants.KEY_DATA_ID, message.cunstomDataId);
        }
        return intent;
    }

    /* renamed from: b */
    public void mo37596b(Message message) {
        if (this.f6949g.keySet().size() > 0) {
            for (Message.C3109Id id : this.f6949g.keySet()) {
                Message message2 = this.f6949g.get(id);
                if (!(message2 == null || message2.command == null || !message2.getPackageName().equals(message.getPackageName()))) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                message2.isCancel = true;
                                break;
                            }
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                message2.isCancel = true;
                                break;
                            }
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                message2.isCancel = true;
                                break;
                            }
                    }
                }
                if (message2 != null && message2.isCancel) {
                    ALog.m7599e(this.f6955m, "cancelControlMessage", "command", message2.command);
                }
            }
        }
    }

    /* renamed from: b */
    public Message mo37594b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f6949g.remove(new Message.C3109Id(0, str));
        }
        return null;
    }

    /* renamed from: b */
    private void m7354b(Message message, int i) {
        if (message != null) {
            String l = UtilityImpl.m7644l(this.f6951i);
            String str = System.currentTimeMillis() + "";
            boolean z = i == 200;
            int intValue = message.command.intValue();
            if (intValue == 1) {
                C3162a aVar = new C3162a();
                aVar.f7115a = l;
                aVar.f7116b = str;
                aVar.f7117c = z;
                aVar.mo37707a(i);
                aVar.mo37706a();
            } else if (intValue == 3) {
                C3163b bVar = new C3163b();
                bVar.f7121a = l;
                bVar.f7122b = str;
                bVar.f7123c = z;
                bVar.f7125e = message.userinfo;
                bVar.mo37710a(i);
                bVar.mo37709a();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:198:0x0655 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r48v0, types: [com.taobao.accs.data.d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v43, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05e5  */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7347a(int r49, byte[] r50, java.lang.String r51, int r52) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1949
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3113d.m7347a(int, byte[], java.lang.String, int):void");
    }

    /* renamed from: a */
    private byte[] m7352a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused) {
            }
            return byteArray;
        } catch (Exception e) {
            String str = this.f6955m;
            ALog.m7599e(str, "uncompress data error " + e.toString(), new Object[0]);
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f6944b + " uncompress data error " + e.toString());
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m7349a(Message message, byte[] bArr, byte[] bArr2, String str) {
        Throwable th;
        JSONArray jSONArray;
        int i = -8;
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(this.f6955m, "handleControlMessage parse", UMSSOHandler.JSON, jSONObject.toString());
                }
                if (message.command.intValue() == 100) {
                    i = 200;
                } else {
                    i = jSONObject.getInt("code");
                }
                if (i == 200) {
                    int intValue = message.command.intValue();
                    if (intValue == 1) {
                        UtilityImpl.m7629c(Constants.SP_FILE_NAME, this.f6951i);
                        try {
                            this.f6954l.mo37668j().mo37527a(this.f6951i.getPackageName());
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            this.f6948f = C3185p.m7678a(jSONObject2, Constants.KEY_DEVICE_TOKEN, null);
                            if (!(jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray(Constants.KEY_PACKAGE_NAMES)) == null)) {
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    String string = jSONArray.getString(i2);
                                    if (UtilityImpl.m7617a(this.f6951i, string)) {
                                        this.f6954l.mo37668j().mo37527a(message.f6914m);
                                    } else {
                                        ALog.m7597d(this.f6955m, "unbind app", "pkg", string);
                                        this.f6954l.mo37658b(Message.buildUnbindApp(this.f6954l.mo37654b((String) null), string), true);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            ALog.m7600i(this.f6955m, "no token/invalid app", th2);
                        }
                    } else if (intValue == 2) {
                        this.f6954l.mo37668j().mo37529b(message.f6914m);
                    } else if (intValue == 3) {
                        this.f6954l.mo37668j().mo37528a(message.f6914m, message.userinfo);
                    } else if (intValue == 4) {
                        this.f6954l.mo37668j().mo37533e(message.f6914m);
                    } else if (intValue == 100) {
                        if ((this.f6954l instanceof C3145j) && "4|sal|accs-iot".equals(message.f6910i)) {
                            ((C3145j) this.f6954l).mo37690a(jSONObject);
                        }
                    }
                } else if (message.command.intValue() == 3 && i == 300) {
                    this.f6954l.mo37668j().mo37529b(message.f6914m);
                }
            } catch (Throwable th3) {
                th = th3;
                ALog.m7598e(this.f6955m, "handleControlMessage", th, new Object[0]);
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f6944b + th.toString());
                mo37589a(message, i, null, bArr, null);
                mo37591a(new TrafficsMonitor.C3168a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, (long) bArr2.length));
            }
        } catch (Throwable th4) {
            th = th4;
            ALog.m7598e(this.f6955m, "handleControlMessage", th, new Object[0]);
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f6944b + th.toString());
            mo37589a(message, i, null, bArr, null);
            mo37591a(new TrafficsMonitor.C3168a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, (long) bArr2.length));
        }
        mo37589a(message, i, null, bArr, null);
        mo37591a(new TrafficsMonitor.C3168a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, (long) bArr2.length));
    }

    /* renamed from: a */
    private Map<Integer, String> m7346a(C3189s sVar) {
        HashMap hashMap = null;
        if (sVar == null) {
            return null;
        }
        try {
            int b = sVar.mo37790b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str = this.f6955m;
                ALog.m7597d(str, "extHeaderLen:" + b, new Object[0]);
            }
            int i = 0;
            while (i < b) {
                int b2 = sVar.mo37790b();
                int i2 = (64512 & b2) >> 10;
                int i3 = b2 & 1023;
                String a = sVar.mo37789a(i3);
                i = i + 2 + i3;
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(Integer.valueOf(i2), a);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(this.f6955m, "", "extHeaderType", Integer.valueOf(i2), "value", a);
                }
            }
        } catch (Exception e) {
            ALog.m7598e(this.f6955m, "parseExtHeader", e, new Object[0]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo37588a(Message message, int i) {
        mo37589a(message, i, null, null, null);
    }

    /* renamed from: a */
    public void mo37590a(Message message, int i, Map<Integer, String> map) {
        mo37589a(message, i, null, null, map);
    }

    /* renamed from: a */
    public void mo37589a(Message message, int i, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        Map<Integer, String> map2;
        byte[] bArr2;
        Message.ReqType reqType2;
        int i2;
        if (message.command == null || message.getType() < 0 || message.getType() == 2) {
            ALog.m7597d(this.f6955m, "onError, skip ping/ack", new Object[0]);
            return;
        }
        String str = message.cunstomDataId;
        if (str != null) {
            this.f6943a.remove(str);
        }
        if (this.f6947e.checkAntiBrush(message.host, map)) {
            i2 = ErrorCode.SERVIER_ANTI_BRUSH;
            reqType2 = null;
            bArr2 = null;
            map2 = null;
        } else {
            i2 = i;
            bArr2 = bArr;
            map2 = map;
            reqType2 = reqType;
        }
        int a = this.f6946d.mo37617a(map2, message.serviceId);
        if (a != 0) {
            i2 = a == 2 ? ErrorCode.SERVIER_HIGH_LIMIT : a == 3 ? ErrorCode.SERVIER_HIGH_LIMIT_BRUSH : ErrorCode.SERVIER_LOW_LIMIT;
            reqType2 = null;
            bArr2 = null;
            map2 = null;
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d(this.f6955m, "onResult", "command", message.command, "erorcode", Integer.valueOf(i2));
        }
        if (message.command.intValue() != 102) {
            if (message.isCancel) {
                ALog.m7599e(this.f6955m, "onResult message is cancel", "command", message.command);
            } else if (!m7355b(i2) || message.command.intValue() == 100 || message.retryTimes > Message.CONTROL_MAX_RETRY_TIMES) {
                Intent c = m7356c(message);
                c.putExtra(Constants.KEY_ERROR_CODE, i2);
                Message.ReqType valueOf = Message.ReqType.valueOf((message.f6907f >> 13) & 3);
                if (reqType2 == Message.ReqType.RES || valueOf == Message.ReqType.REQ) {
                    c.putExtra(Constants.KEY_SEND_TYPE, "res");
                }
                if (i2 == 200) {
                    c.putExtra("data", bArr2);
                }
                c.putExtra("appKey", this.f6954l.f7010b);
                c.putExtra(Constants.KEY_CONFIG_TAG, this.f6954l.f7021m);
                m7351a(map2, c);
                C3116g.m7382a(this.f6951i, this.f6954l, c);
                if (!TextUtils.isEmpty(message.serviceId)) {
                    UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message.command, "serviceId=" + message.serviceId + " errorCode=" + i2 + " dataId=" + message.dataId, Integer.valueOf(Constants.SDK_VERSION_CODE));
                    StringBuilder sb = new StringBuilder();
                    sb.append("1commandId=");
                    sb.append(message.command);
                    sb.append("serviceId=");
                    sb.append(message.serviceId);
                    C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb.toString(), AbstractC8352oOoOOoO0.OooO0O0);
                }
            } else {
                message.startSendTime = System.currentTimeMillis();
                int i3 = message.retryTimes + 1;
                message.retryTimes = i3;
                ALog.m7597d(this.f6955m, "onResult", "retryTimes", Integer.valueOf(i3));
                this.f6954l.mo37658b(message, true);
            }
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor != null) {
                netPermanceMonitor.onToBizDate();
                URL url = message.host;
                String url2 = url == null ? null : url.toString();
                if (i2 == 200) {
                    netPermanceMonitor.setRet(true);
                    if (message.retryTimes > 0) {
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", AbstractC8352oOoOOoO0.OooO0O0);
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.retryTimes, AbstractC8352oOoOOoO0.OooO0O0);
                    } else {
                        C3179k.m7666a("accs", BaseMonitor.ALARM_POINT_REQUEST, url2);
                    }
                } else {
                    if (message.retryTimes > 0) {
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + i2, AbstractC8352oOoOOoO0.OooO0O0);
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", AbstractC8352oOoOOoO0.OooO0O0);
                    } else if (i2 != -13) {
                        C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQUEST, url2, UtilityImpl.m7607a(i2), this.f6944b + message.serviceId + message.timeout);
                    }
                    netPermanceMonitor.setRet(false);
                    netPermanceMonitor.setFailReason(i2);
                }
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
            m7354b(message, i2);
        }
    }

    /* renamed from: a */
    public void mo37585a() {
        ALog.m7597d(this.f6955m, "onSendPing", new Object[0]);
        synchronized (C3113d.class) {
            this.f6950h = true;
        }
    }

    /* renamed from: a */
    public void mo37587a(Message message) {
        String str;
        Message message2 = this.f6953k;
        if (!(message2 == null || (str = message.cunstomDataId) == null || message.serviceId == null || !message2.cunstomDataId.equals(str) || !this.f6953k.serviceId.equals(message.serviceId))) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.serviceId, message.cunstomDataId, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.getType() != -1 && message.getType() != 2 && !message.isAck) {
            this.f6949g.put(message.getMsgId(), message);
        }
    }

    /* renamed from: a */
    public void mo37586a(int i) {
        this.f6950h = false;
        Message.C3109Id[] idArr = (Message.C3109Id[]) this.f6949g.keySet().toArray(new Message.C3109Id[0]);
        if (idArr.length > 0) {
            ALog.m7597d(this.f6955m, "onNetworkFail", new Object[0]);
            for (Message.C3109Id id : idArr) {
                Message remove = this.f6949g.remove(id);
                if (remove != null) {
                    mo37588a(remove, i);
                }
            }
        }
    }

    /* renamed from: a */
    public Message mo37584a(String str) {
        return this.f6949g.get(new Message.C3109Id(0, str));
    }

    /* renamed from: a */
    private byte[] m7353a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int parseInt = Integer.parseInt(map.get(17));
                    int parseInt2 = Integer.parseInt(map.get(16));
                    if (parseInt2 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    } else if (parseInt < 0 || parseInt >= parseInt2) {
                        throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(parseInt2), Integer.valueOf(parseInt)));
                    } else {
                        String str2 = map.get(18);
                        long j = 0;
                        try {
                            String str3 = map.get(15);
                            if (!TextUtils.isEmpty(str3)) {
                                j = Long.parseLong(str3);
                            }
                        } catch (Throwable th) {
                            ALog.m7602w(this.f6955m, "putBurstMessage", th, new Object[0]);
                        }
                        C3110a aVar = this.f6957o.get(str);
                        if (aVar == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.m7600i(this.f6955m, "putBurstMessage", Constants.KEY_DATA_ID, str, "burstLength", Integer.valueOf(parseInt2));
                            }
                            aVar = new C3110a(str, parseInt2, str2);
                            aVar.mo37579a(j);
                            this.f6957o.put(str, aVar);
                        }
                        return aVar.mo37580a(parseInt, parseInt2, bArr);
                    }
                }
            } catch (Throwable th2) {
                ALog.m7602w(this.f6955m, "putBurstMessage", th2, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    /* renamed from: a */
    private void m7351a(Map<Integer, String> map, Intent intent) {
        if (map != null && intent != null) {
            intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
        }
    }

    /* renamed from: a */
    private void m7348a(Intent intent, String str, String str2, short s) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra("flags", s);
        }
    }

    /* renamed from: a */
    private void m7350a(String str, String str2) {
        C3166e eVar = new C3166e();
        eVar.f7150a = UtilityImpl.m7644l(this.f6951i);
        eVar.f7152c = str;
        eVar.f7153d = "" + System.currentTimeMillis();
        eVar.f7155f = "";
        eVar.f7154e = str2;
        eVar.f7151b = "";
        eVar.mo37714a();
    }

    /* renamed from: a */
    public void mo37591a(TrafficsMonitor.C3168a aVar) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3114e(this, aVar));
        } catch (Throwable th) {
            ALog.m7598e(this.f6955m, "addTrafficsInfo", th, new Object[0]);
        }
    }
}
