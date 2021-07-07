package com.taobao.accs.p260b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.taobao.accs.b.a */
public class C3089a implements Handler.Callback {
    public static final int ACT_START = 0;
    public static final int ACT_STOP = -1;
    public static final String AGOO_PID = "agoo.pid";
    public static final String EX_FILE_NAME = "DaemonServer";
    public static final String PROCESS_NAME = "runServer";

    /* renamed from: a */
    public static String f6829a = "startservice -n {packname}/com.taobao.accs.ChannelService";

    /* renamed from: c */
    public static final String f6830c = C3089a.class.getName();

    /* renamed from: g */
    public static int f6831g = 7200;

    /* renamed from: h */
    public static int f6832h = 2500;

    /* renamed from: i */
    public static final ReentrantLock f6833i = new ReentrantLock();

    /* renamed from: j */
    public static C3089a f6834j = null;

    /* renamed from: b */
    public boolean f6835b = false;

    /* renamed from: d */
    public Context f6836d = null;

    /* renamed from: e */
    public String f6837e;

    /* renamed from: f */
    public int f6838f = 1800;

    /* renamed from: k */
    public String f6839k = "100001";

    /* renamed from: l */
    public String f6840l = "tb_accs_eudemon_1.1.3";

    /* renamed from: m */
    public String f6841m;

    /* renamed from: n */
    public String f6842n;

    /* renamed from: o */
    public int f6843o;

    /* renamed from: p */
    public String f6844p;

    /* renamed from: q */
    public String f6845q;

    /* renamed from: r */
    public int f6846r;

    /* renamed from: s */
    public boolean f6847s;

    /* renamed from: t */
    public Handler f6848t;

    /* renamed from: u */
    public HandlerThread f6849u;

    public C3089a(Context context, int i, boolean z) {
        String str = "";
        this.f6841m = str;
        this.f6842n = "21646297";
        this.f6843o = 0;
        this.f6844p = "100.69.165.28";
        this.f6845q = "http://100.69.165.28/agoo/report";
        this.f6846r = 80;
        this.f6847s = true;
        this.f6848t = null;
        this.f6849u = null;
        m7240b();
        f6829a = "startservice -n {packname}/com.taobao.accs.ChannelService";
        this.f6836d = context;
        this.f6838f = i;
        this.f6835b = z;
        this.f6837e = m7234a(new Build(), "CPU_ABI");
        this.f6841m = "/data/data/" + context.getPackageName();
        this.f6843o = Constants.SDK_VERSION_CODE;
        String[] s = UtilityImpl.m7651s(this.f6836d);
        if (!(s == null || s.length == 0)) {
            str = s[0];
        }
        this.f6842n = str;
        if (C3194w.m7716b(context) == 0) {
            this.f6844p = "agoodm.m.taobao.com";
            this.f6846r = 80;
            this.f6845q = "http://agoodm.m.taobao.com/agoo/report";
            this.f6839k = "1009527";
        } else if (C3194w.m7716b(context) == 1) {
            this.f6844p = "110.75.98.154";
            this.f6846r = 80;
            this.f6845q = "http://agoodm.wapa.taobao.com/agoo/report";
            this.f6839k = "1009527";
        } else {
            this.f6844p = "100.69.168.33";
            this.f6846r = 80;
            this.f6845q = "http://100.69.168.33/agoo/report";
            this.f6838f = 60;
            this.f6839k = "9527";
        }
    }

    /* renamed from: a */
    public static String m7234a(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    /* renamed from: b */
    private void m7240b() {
        HandlerThread handlerThread = new HandlerThread("soManager-threads");
        this.f6849u = handlerThread;
        handlerThread.setPriority(5);
        this.f6849u.start();
        this.f6848t = new Handler(this.f6849u.getLooper(), this);
    }

    /* renamed from: c */
    private String m7243c() {
        if (this.f6837e.startsWith("arm")) {
            return "armeabi/";
        }
        return this.f6837e + C8932ooOOO0o.OooO0OO;
    }

    /* renamed from: d */
    private String m7245d() throws IOException {
        File file = new File(this.f6836d.getFilesDir(), EX_FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
        String str = f6830c;
        ALog.m7603w(str, "open assets from = " + m7243c() + EX_FILE_NAME, new Object[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        InputStream inputStream = null;
        try {
            if (this.f6835b) {
                AssetManager assets = this.f6836d.getAssets();
                inputStream = assets.open(m7243c() + EX_FILE_NAME);
                byte[] bArr = new byte[100];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } else {
                m7236a(fileOutputStream, file);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    ALog.m7598e(f6830c, "error in close input file", e, new Object[0]);
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                ALog.m7598e(f6830c, "error in close io", e2, new Object[0]);
            }
        } catch (Exception e3) {
            ALog.m7598e(f6830c, "error in copy daemon files", e3, new Object[0]);
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    ALog.m7598e(f6830c, "error in close input file", e4, new Object[0]);
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                ALog.m7598e(f6830c, "error in close io", e5, new Object[0]);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    ALog.m7598e(f6830c, "error in close input file", e6, new Object[0]);
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e7) {
                ALog.m7598e(f6830c, "error in close io", e7, new Object[0]);
            }
            throw th;
        }
        return file.getCanonicalPath();
    }

    /* renamed from: e */
    private String m7246e() {
        StringBuilder sb = new StringBuilder();
        String str = "/data/data/" + this.f6836d.getPackageName();
        sb.append("-s \"");
        sb.append(str);
        sb.append("/lib/");
        sb.append("\" ");
        sb.append("-n \"runServer\" ");
        sb.append("-p \"");
        sb.append(m7248g());
        sb.append("\" ");
        sb.append("-f \"");
        sb.append(str);
        sb.append("\" ");
        sb.append("-t \"");
        sb.append(this.f6838f);
        sb.append("\" ");
        sb.append("-c \"agoo.pid\" ");
        if (this.f6841m != null) {
            sb.append("-P ");
            sb.append(this.f6841m);
            sb.append(" ");
        }
        if (this.f6839k != null) {
            sb.append("-K ");
            sb.append(this.f6839k);
            sb.append(" ");
        }
        if (this.f6840l != null) {
            sb.append("-U ");
            sb.append(this.f6840l);
            sb.append(" ");
        }
        if (this.f6845q != null) {
            sb.append("-L ");
            sb.append(this.f6845q);
            sb.append(" ");
        }
        sb.append("-D ");
        sb.append(m7247f());
        sb.append(" ");
        if (this.f6844p != null) {
            sb.append("-I ");
            sb.append(this.f6844p);
            sb.append(" ");
        }
        if (this.f6846r > 0) {
            sb.append("-O ");
            sb.append(this.f6846r);
            sb.append(" ");
        }
        String a = UtilityImpl.m7609a(this.f6836d);
        int b = UtilityImpl.m7621b(this.f6836d);
        if (a != null && b > 0) {
            sb.append("-X ");
            sb.append(a);
            sb.append(" ");
            sb.append("-Y ");
            sb.append(b);
            sb.append(" ");
        }
        if (this.f6847s) {
            sb.append("-T ");
        }
        sb.append("-Z ");
        return sb.toString();
    }

    /* renamed from: f */
    private String m7247f() {
        String l = UtilityImpl.m7644l(this.f6836d);
        if (TextUtils.isEmpty(l)) {
            l = "null";
        }
        String str = "{\"package\":\"" + this.f6836d.getPackageName() + "\",\"appKey\":\"" + this.f6842n + "\",\"utdid\":\"" + l + "\",\"sdkVersion\":\"" + this.f6843o + "\"}";
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            ALog.m7599e(f6830c, "getReportData failed for url encode, data:" + str, new Object[0]);
            return str;
        }
    }

    /* renamed from: g */
    private String m7248g() {
        StringBuilder sb = new StringBuilder();
        sb.append(f6829a.replaceAll("\\{packname\\}", this.f6836d.getApplicationContext().getPackageName()));
        if (Build.VERSION.SDK_INT > 15) {
            sb.append(" --user 0");
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:3|4|5|6|7|8|9|10|(2:11|(3:13|(2:15|92)(4:16|(2:18|(2:20|93)(1:21))|22|94)|90)(1:91))|23|24|25|26|27|28|29|30|31|32|33|98) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e A[SYNTHETIC, Splitter:B:55:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115 A[SYNTHETIC, Splitter:B:59:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c A[SYNTHETIC, Splitter:B:63:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0123 A[SYNTHETIC, Splitter:B:67:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012e A[SYNTHETIC, Splitter:B:76:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0135 A[SYNTHETIC, Splitter:B:80:0x0135] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013c A[SYNTHETIC, Splitter:B:84:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7249h() {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p260b.C3089a.m7249h():void");
    }

    /* renamed from: i */
    private void m7250i() {
        String str = f6830c;
        ALog.m7597d(str, "api level is:" + Build.VERSION.SDK_INT, new Object[0]);
        m7242b(this.f6836d);
        if (Build.VERSION.SDK_INT < 20) {
            try {
                String d = m7245d();
                m7249h();
                m7237a(d);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        UTMini.getInstance().commitEvent(66001, "EUDEMON_START", "");
    }

    /* renamed from: j */
    private void m7251j() {
        File file = new File("/data/data/" + this.f6836d.getPackageName(), "daemonserver.pid");
        if (file.exists()) {
            file.delete();
        }
    }

    public boolean handleMessage(Message message) {
        try {
            if (message.what == 0) {
                m7250i();
                return true;
            } else if (message.what != -1) {
                return true;
            } else {
                m7251j();
                return true;
            }
        } catch (Throwable th) {
            ALog.m7598e(f6830c, "handleMessage error", th, new Object[0]);
            return true;
        }
    }

    /* renamed from: a */
    public static C3089a m7233a(Context context, int i, boolean z) {
        try {
            f6833i.lock();
            if (f6834j == null) {
                f6834j = new C3089a(context, i, z);
            }
        } catch (Exception e) {
            ALog.m7598e(f6830c, "getInstance", e, new Object[0]);
        } catch (Throwable th) {
            f6833i.unlock();
            throw th;
        }
        f6833i.unlock();
        return f6834j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[SYNTHETIC, Splitter:B:21:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7244c(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p260b.C3089a.m7244c(android.content.Context):void");
    }

    /* renamed from: b */
    public static void m7242b(Context context) {
        int i = Calendar.getInstance().get(11);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            PendingIntent a = m7232a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i > 23 || i < 6) {
                ALog.m7603w(f6830c, "time is night, do not wakeup cpu", new Object[0]);
                m7241b(alarmManager, a, elapsedRealtime);
                return;
            }
            ALog.m7603w(f6830c, "time is daytime, wakeup cpu for keeping connecntion", new Object[0]);
            m7235a(alarmManager, a, elapsedRealtime);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3 A[SYNTHETIC, Splitter:B:34:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7236a(java.io.FileOutputStream r9, java.io.File r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p260b.C3089a.m7236a(java.io.FileOutputStream, java.io.File):void");
    }

    /* renamed from: b */
    public static void m7241b(AlarmManager alarmManager, PendingIntent pendingIntent, long j) {
        alarmManager.cancel(pendingIntent);
        int i = f6831g;
        alarmManager.setRepeating(3, j + ((long) (i * 1000)), (long) (i * 1000), pendingIntent);
    }

    /* renamed from: a */
    private void m7237a(String str) {
        StringBuilder sb = new StringBuilder();
        m7239a("", "chmod 500 " + str, sb);
        m7239a("", str + " " + m7246e(), sb);
        String str2 = f6830c;
        ALog.m7603w(str2, str + " " + m7246e(), new Object[0]);
    }

    /* renamed from: a */
    private void m7238a(String str, int i, int i2, String str2, String str3, int i3) {
        String str4 = "AndroidVer=" + Build.VERSION.RELEASE + "&Model=" + Build.MODEL + "&AndroidSdk=" + Build.VERSION.SDK_INT + "&AccsVer=" + Constants.SDK_VERSION_CODE + "&Appkey=" + this.f6842n + "&PullCount=" + str2 + "&Pid=" + str + "&StartTime=" + i + "&EndTime=" + i2 + "&ExitCode=" + str3 + "&AliveTime=" + i3;
        String str5 = "EUDEMON_ENDSTAT doReportDaemonStat:" + str4;
        UTMini.getInstance().commitEvent(66001, "EUDEMON_ENDSTAT", str4);
    }

    /* renamed from: a */
    public void mo37426a() {
        Message obtain = Message.obtain();
        obtain.what = 0;
        this.f6848t.sendMessage(obtain);
    }

    /* renamed from: a */
    public static final PendingIntent m7232a(Context context) {
        Intent intent = new Intent();
        intent.setAction(context.getApplicationContext().getPackageName() + ".intent.action.COCKROACH");
        intent.putExtra("cockroach", "cockroach-PPreotect");
        intent.putExtra("pack", context.getApplicationContext().getPackageName());
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    public static void m7235a(AlarmManager alarmManager, PendingIntent pendingIntent, long j) {
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
            int i = f6832h;
            alarmManager.setRepeating(2, ((long) (i * 1000)) + j, (long) (i * 1000), pendingIntent);
        }
    }

    /* renamed from: a */
    public static boolean m7239a(String str, String str2, StringBuilder sb) {
        try {
            Process exec = Runtime.getRuntime().exec("sh");
            DataInputStream dataInputStream = new DataInputStream(exec.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            if (str != null && !"".equals(str.trim())) {
                dataOutputStream.writeBytes("cd " + str + "\n");
            }
            dataOutputStream.writeBytes(str2 + " &\n");
            dataOutputStream.writeBytes("exit \n");
            dataOutputStream.flush();
            exec.waitFor();
            byte[] bArr = new byte[dataInputStream.available()];
            dataInputStream.read(bArr);
            String str3 = new String(bArr);
            if (str3.length() == 0) {
                return true;
            }
            sb.append(str3);
            return true;
        } catch (Exception e) {
            sb.append("Exception:");
            sb.append(e.getMessage());
            return false;
        }
    }
}
