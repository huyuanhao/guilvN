package com.huawei.updatesdk.sdk.service.download.bean;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;

public class DownloadTask implements Parcelable {
    public static final Parcelable.Creator<DownloadTask> CREATOR = new Parcelable.Creator<DownloadTask>() {
        /* class com.huawei.updatesdk.sdk.service.download.bean.DownloadTask.C13081 */

        /* renamed from: a */
        public DownloadTask createFromParcel(Parcel parcel) {
            return new DownloadTask(parcel);
        }

        /* renamed from: a */
        public DownloadTask[] newArray(int i) {
            return new DownloadTask[i];
        }
    };

    /* renamed from: j */
    public static int f1491j = C1312a.m1773e();

    /* renamed from: k */
    public static final Object f1492k = new Object();

    /* renamed from: A */
    public C1309a f1493A;

    /* renamed from: B */
    public C1310b f1494B;

    /* renamed from: C */
    public List<C1312a> f1495C;

    /* renamed from: D */
    public long f1496D;
    @AbstractC1313b

    /* renamed from: E */
    public String f1497E;

    /* renamed from: F */
    public Future<?> f1498F;

    /* renamed from: a */
    public String f1499a;
    @AbstractC1313b

    /* renamed from: b */
    public int f1500b;
    @AbstractC1313b

    /* renamed from: c */
    public long f1501c;
    @AbstractC1313b

    /* renamed from: d */
    public String f1502d;
    @AbstractC1313b

    /* renamed from: e */
    public int f1503e;
    @AbstractC1313b

    /* renamed from: f */
    public int f1504f;

    /* renamed from: g */
    public boolean f1505g;
    @AbstractC1313b

    /* renamed from: h */
    public int f1506h;

    /* renamed from: i */
    public final String f1507i;
    @AbstractC1313b

    /* renamed from: l */
    public int f1508l;
    @AbstractC1313b

    /* renamed from: m */
    public String f1509m;
    @AbstractC1313b

    /* renamed from: n */
    public long f1510n;
    @AbstractC1313b

    /* renamed from: o */
    public String f1511o;
    @AbstractC1313b

    /* renamed from: p */
    public long f1512p;
    @AbstractC1313b

    /* renamed from: q */
    public int f1513q;

    /* renamed from: r */
    public Future<?> f1514r;
    @AbstractC1313b

    /* renamed from: s */
    public String f1515s;
    @AbstractC1313b

    /* renamed from: t */
    public int f1516t;

    /* renamed from: u */
    public boolean f1517u;

    /* renamed from: v */
    public int f1518v;

    /* renamed from: w */
    public int f1519w;

    /* renamed from: x */
    public boolean f1520x;

    /* renamed from: y */
    public String f1521y;

    /* renamed from: z */
    public String f1522z;

    /* renamed from: com.huawei.updatesdk.sdk.service.download.bean.DownloadTask$a */
    public static class C1309a {

        /* renamed from: a */
        public int f1523a;

        /* renamed from: b */
        public String f1524b;

        public String toString() {
            return this.f1523a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f1524b;
        }
    }

    /* renamed from: com.huawei.updatesdk.sdk.service.download.bean.DownloadTask$b */
    public static class C1310b {

        /* renamed from: a */
        public long f1525a;

        /* renamed from: b */
        public long f1526b;

        /* renamed from: c */
        public boolean f1527c = false;

        /* renamed from: a */
        public void mo16012a(long j) {
            this.f1525a = j;
        }

        /* renamed from: a */
        public void mo16013a(boolean z) {
            this.f1527c = z;
        }

        /* renamed from: a */
        public boolean mo16014a() {
            return this.f1527c;
        }

        /* renamed from: b */
        public void mo16015b(long j) {
            this.f1526b = j;
        }
    }

    /* renamed from: com.huawei.updatesdk.sdk.service.download.bean.DownloadTask$c */
    public static class C1311c implements PrivilegedAction {

        /* renamed from: a */
        public Field f1528a;

        public C1311c(Field field) {
            this.f1528a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f1528a.setAccessible(true);
            return null;
        }
    }

    public DownloadTask() {
        this.f1507i = "DownloadTask";
        this.f1508l = -1;
        this.f1500b = 0;
        this.f1510n = 0;
        this.f1512p = 0;
        this.f1501c = 0;
        this.f1513q = 0;
        this.f1504f = 0;
        this.f1505g = false;
        this.f1514r = null;
        this.f1506h = 0;
        this.f1516t = 0;
        this.f1517u = true;
        this.f1518v = 1;
        this.f1519w = 0;
        this.f1520x = true;
        this.f1521y = null;
        this.f1522z = null;
        this.f1493A = new C1309a();
        this.f1494B = new C1310b();
        this.f1495C = new CopyOnWriteArrayList();
        this.f1496D = 0;
        this.f1498F = null;
    }

    public DownloadTask(Bundle bundle) {
        Field field;
        Object valueOf;
        this.f1507i = "DownloadTask";
        this.f1508l = -1;
        this.f1500b = 0;
        this.f1510n = 0;
        this.f1512p = 0;
        this.f1501c = 0;
        this.f1513q = 0;
        this.f1504f = 0;
        this.f1505g = false;
        this.f1514r = null;
        this.f1506h = 0;
        this.f1516t = 0;
        this.f1517u = true;
        this.f1518v = 1;
        this.f1519w = 0;
        this.f1520x = true;
        this.f1521y = null;
        this.f1522z = null;
        this.f1493A = new C1309a();
        this.f1494B = new C1310b();
        this.f1495C = new CopyOnWriteArrayList();
        this.f1496D = 0;
        this.f1498F = null;
        Field[] declaredFields = DownloadTask.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            try {
                AccessController.doPrivileged(new C1311c(declaredFields[i]));
                if (declaredFields[i].isAnnotationPresent(AbstractC1313b.class)) {
                    String simpleName = declaredFields[i].getType().getSimpleName();
                    String name = declaredFields[i].getName();
                    if ("String".equals(simpleName)) {
                        field = declaredFields[i];
                        valueOf = bundle.getString(name);
                    } else if ("int".equals(simpleName)) {
                        field = declaredFields[i];
                        valueOf = Integer.valueOf(bundle.getInt(name));
                    } else if ("long".equals(simpleName)) {
                        field = declaredFields[i];
                        valueOf = Long.valueOf(bundle.getLong(name));
                    } else if ("float".equals(simpleName)) {
                        field = declaredFields[i];
                        valueOf = Float.valueOf(bundle.getFloat(name));
                    } else {
                        C1278a.m1584d("DownloadTask", "unsupport field type:" + simpleName + " " + declaredFields[i].getName());
                    }
                    field.set(this, valueOf);
                }
            } catch (IllegalAccessException | RuntimeException e) {
                C1278a.m1581a("DownloadTask", "DownloadTask exception:", e);
            }
        }
    }

    public DownloadTask(Parcel parcel) {
        this.f1507i = "DownloadTask";
        this.f1508l = -1;
        this.f1500b = 0;
        this.f1510n = 0;
        this.f1512p = 0;
        this.f1501c = 0;
        this.f1513q = 0;
        this.f1504f = 0;
        this.f1505g = false;
        this.f1514r = null;
        this.f1506h = 0;
        this.f1516t = 0;
        this.f1517u = true;
        this.f1518v = 1;
        this.f1519w = 0;
        this.f1520x = true;
        this.f1521y = null;
        this.f1522z = null;
        this.f1493A = new C1309a();
        this.f1494B = new C1310b();
        this.f1495C = new CopyOnWriteArrayList();
        this.f1496D = 0;
        this.f1498F = null;
        this.f1508l = parcel.readInt();
        this.f1500b = parcel.readInt();
        this.f1509m = parcel.readString();
        this.f1510n = parcel.readLong();
        this.f1501c = parcel.readLong();
        this.f1502d = parcel.readString();
        this.f1515s = parcel.readString();
        this.f1503e = parcel.readInt();
        this.f1504f = parcel.readInt();
        this.f1506h = parcel.readInt();
        this.f1516t = parcel.readInt();
        this.f1511o = parcel.readString();
        this.f1512p = parcel.readLong();
        this.f1513q = parcel.readInt();
        this.f1499a = parcel.readString();
    }

    /* renamed from: a */
    public static int m1715a() {
        int i;
        synchronized (f1492k) {
            int i2 = f1491j + 1;
            f1491j = i2;
            if (i2 == Integer.MIN_VALUE || i2 == -1) {
                f1491j = C1312a.m1773e();
            }
            i = f1491j;
        }
        return i;
    }

    /* renamed from: a */
    public static DownloadTask m1716a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new DownloadTask(bundle);
    }

    /* renamed from: a */
    public void mo15956a(int i) {
        this.f1516t = i;
    }

    /* renamed from: a */
    public void mo15957a(long j) {
        this.f1510n = j;
        if (j <= 0) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("debug : fileSize is wrong \n");
            stringBuffer.append("Stack for setFileSize, fileSize=" + j + Constants.COLON_SEPARATOR);
            for (int i = 0; i < stackTrace.length; i++) {
                stringBuffer.append("\n    " + stackTrace[i].getClassName() + C9058ooOoOoOO.OooOO0 + stackTrace[i].getMethodName() + C3848l.f10401s + stackTrace[i].getFileName() + Constants.COLON_SEPARATOR + stackTrace[i].getLineNumber() + C3848l.f10402t);
                if (i > 14) {
                    break;
                }
            }
            C1278a.m1584d("HiAppDownload", stringBuffer.toString());
        }
    }

    /* renamed from: a */
    public void mo15958a(NetworkInfo networkInfo) {
        String str = this.f1509m;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("&");
            String str2 = this.f1509m;
            if (lastIndexOf != -1 && str2.substring(lastIndexOf + 1).trim().startsWith(C7482o0OoO0OO.OooOO0O)) {
                str2 = this.f1509m.substring(0, lastIndexOf);
            }
            this.f1509m = str2 + "&" + C7482o0OoO0OO.OooOO0O + C8932ooOOO0o.OooO0Oo + C1291b.m1632a(networkInfo);
        }
    }

    /* renamed from: a */
    public void mo15959a(String str) {
        this.f1521y = str;
    }

    /* renamed from: a */
    public void mo15960a(Future<?> future) {
        this.f1514r = future;
    }

    /* renamed from: a */
    public void mo15961a(boolean z) {
        this.f1517u = z;
    }

    /* renamed from: a */
    public void mo15962a(boolean z, int i) {
        this.f1505g = z;
        this.f1506h = i;
        if (i != 4 && z) {
            this.f1494B.f1527c = true;
        }
        C1278a.m1583c("DownloadTask", "setInterrupt,package:" + mo16002w() + ", isInterrupt:" + z + ",reason:" + i);
        if (z) {
            mo15981f();
        }
    }

    /* renamed from: b */
    public List<C1312a> mo15963b() {
        return this.f1495C;
    }

    /* renamed from: b */
    public void mo15964b(int i) {
        this.f1518v = i;
    }

    /* renamed from: b */
    public void mo15965b(long j) {
        this.f1501c = j;
    }

    /* renamed from: b */
    public void mo15966b(Bundle bundle) {
        Field[] declaredFields = DownloadTask.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            try {
                AccessController.doPrivileged(new C1311c(declaredFields[i]));
                if (declaredFields[i].isAnnotationPresent(AbstractC1313b.class)) {
                    String simpleName = declaredFields[i].getType().getSimpleName();
                    String name = declaredFields[i].getName();
                    Object obj = declaredFields[i].get(this);
                    if (obj != null) {
                        if ("String".equals(simpleName)) {
                            bundle.putString(name, (String) obj);
                        } else if ("int".equals(simpleName)) {
                            bundle.putInt(name, ((Integer) obj).intValue());
                        } else if ("long".equals(simpleName)) {
                            bundle.putLong(name, ((Long) obj).longValue());
                        } else if ("float".equals(simpleName)) {
                            bundle.putFloat(name, ((Float) obj).floatValue());
                        } else if ("boolean".equals(simpleName)) {
                            bundle.putBoolean(name, ((Boolean) obj).booleanValue());
                        } else {
                            C1278a.m1584d("DownloadTask", "unsupport type");
                        }
                    }
                }
            } catch (IllegalAccessException | RuntimeException e) {
                C1278a.m1581a("DownloadTask", "writeToBundle exception:", e);
            }
        }
    }

    /* renamed from: b */
    public void mo15967b(String str) {
        this.f1522z = str;
    }

    /* renamed from: b */
    public void mo15968b(Future<?> future) {
        this.f1498F = future;
    }

    /* renamed from: b */
    public void mo15969b(boolean z) {
        this.f1520x = z;
    }

    /* renamed from: c */
    public void mo15970c() {
        this.f1521y = null;
        this.f1522z = null;
        this.f1503e = 0;
    }

    /* renamed from: c */
    public void mo15971c(int i) {
        this.f1519w = i;
    }

    /* renamed from: c */
    public void mo15972c(long j) {
        this.f1496D = j;
    }

    /* renamed from: c */
    public void mo15973c(String str) {
        this.f1497E = str;
    }

    /* renamed from: d */
    public C1309a mo15974d() {
        return this.f1493A;
    }

    /* renamed from: d */
    public void mo15975d(int i) {
        if (i == 5) {
            C1278a.m1584d("downloadtask", "set DownloadCode.downloadfailed");
        }
        this.f1504f = i;
    }

    /* renamed from: d */
    public void mo15976d(String str) {
        this.f1509m = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C1310b mo15978e() {
        return this.f1494B;
    }

    /* renamed from: e */
    public void mo15979e(int i) {
        this.f1508l = i;
    }

    /* renamed from: e */
    public void mo15980e(String str) {
        this.f1502d = str;
    }

    /* renamed from: f */
    public void mo15981f() {
        Future<?> future = this.f1498F;
        if (future != null) {
            try {
                future.cancel(true);
                C1278a.m1583c("HiAppDownload", "abort http request, pacakge:" + this.f1515s);
            } catch (Exception e) {
                C1278a.m1581a("HiAppDownload", "abort http request exception:", e);
            }
        }
    }

    /* renamed from: f */
    public void mo15982f(int i) {
        this.f1500b = i;
    }

    /* renamed from: f */
    public void mo15983f(String str) {
        this.f1515s = str;
    }

    /* renamed from: g */
    public int mo15984g() {
        return this.f1506h;
    }

    /* renamed from: g */
    public void mo15985g(int i) {
        this.f1503e = i;
    }

    /* renamed from: h */
    public long mo15986h() {
        return this.f1512p;
    }

    /* renamed from: i */
    public int mo15987i() {
        return this.f1518v;
    }

    /* renamed from: j */
    public int mo15988j() {
        return this.f1519w;
    }

    /* renamed from: k */
    public String mo15989k() {
        return this.f1521y;
    }

    /* renamed from: l */
    public String mo15990l() {
        return this.f1522z;
    }

    /* renamed from: m */
    public String mo15991m() {
        return this.f1497E;
    }

    /* renamed from: n */
    public int mo15992n() {
        return this.f1504f;
    }

    /* renamed from: o */
    public int mo15993o() {
        return this.f1508l;
    }

    /* renamed from: p */
    public int mo15994p() {
        int i = this.f1500b;
        if (i > 100) {
            return 100;
        }
        return i;
    }

    /* renamed from: q */
    public String mo15995q() {
        return this.f1509m;
    }

    /* renamed from: r */
    public long mo15996r() {
        return this.f1510n;
    }

    /* renamed from: s */
    public long mo15997s() {
        return this.f1501c;
    }

    /* renamed from: t */
    public String mo15998t() {
        return this.f1502d;
    }

    public String toString() {
        return getClass().getName() + " {\n\thash_: " + this.f1499a + "\n\tid_: " + this.f1508l + "\n\tprogress_: " + this.f1500b + "\n\turl_: " + this.f1509m + "\n\ticonUrl_: \n\tfileSize_: " + this.f1510n + "\n\talreadDownloadSize_: " + this.f1501c + "\n\tfilepath_: " + this.f1502d + "\n\tdownloadRate_: " + this.f1503e + "\n\tstatus_: " + this.f1504f + "\n\tisInterrupt: " + this.f1505g + "\n\tpackageName_: " + this.f1515s + "\n\tinterruptReason_: " + this.f1506h + "\n\tinstallType_: " + this.f1516t + "\n\tdownloadErrInfo: " + this.f1493A + "\n\tisDeleteDirtyFile: " + this.f1517u + "\n\tbackupUrl: " + this.f1511o + "\n\tbackupFileSize: " + this.f1512p + "\n\tdownloadProtocol_: " + this.f1513q + "\n}";
    }

    /* renamed from: u */
    public String mo16000u() {
        int lastIndexOf;
        String str = this.f1502d;
        if (str == null || (lastIndexOf = str.lastIndexOf(File.separator)) == -1) {
            return null;
        }
        return this.f1502d.substring(lastIndexOf + 1);
    }

    /* renamed from: v */
    public Future<?> mo16001v() {
        return this.f1514r;
    }

    /* renamed from: w */
    public String mo16002w() {
        return this.f1515s;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1508l);
        parcel.writeInt(this.f1500b);
        parcel.writeString(this.f1509m);
        parcel.writeLong(this.f1510n);
        parcel.writeLong(this.f1501c);
        parcel.writeString(this.f1502d);
        parcel.writeString(this.f1515s);
        parcel.writeInt(this.f1503e);
        parcel.writeInt(this.f1504f);
        parcel.writeInt(this.f1506h);
        parcel.writeInt(this.f1516t);
        parcel.writeString(this.f1511o);
        parcel.writeLong(this.f1512p);
        parcel.writeInt(this.f1513q);
        parcel.writeString(this.f1499a);
    }

    /* renamed from: x */
    public void mo16004x() {
        if (this.f1517u && this.f1502d != null) {
            C1278a.m1580a("DownloadTask", "download failed, delete temp file, task:" + this);
            if (!new File(this.f1502d).delete()) {
                C1278a.m1584d("DownloadTask", "file delete failed!");
            }
        }
    }

    /* renamed from: y */
    public boolean mo16005y() {
        return this.f1520x;
    }

    /* renamed from: z */
    public int mo16006z() {
        double s = (double) mo15997s();
        double r = (double) mo15996r();
        Double.isNaN(s);
        Double.isNaN(r);
        int round = (int) Math.round((s / r) * 100.0d);
        if (round > 100) {
            return 100;
        }
        return round;
    }
}
