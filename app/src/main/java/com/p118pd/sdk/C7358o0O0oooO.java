package com.p118pd.sdk;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.http.NetworkSdkSetting;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.o0O0oooO  reason: case insensitive filesystem */
public class C7358o0O0oooO {
    public static final int OooO00o = -100;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20088OooO00o = "anet.DownloadManager";
    public static final int OooO0O0 = -101;
    public static final int OooO0OO = -102;
    public static final int OooO0Oo = -103;
    public static final int OooO0o = -105;
    public static final int OooO0o0 = -104;
    public static final int OooO0oO = -106;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f20089OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SparseArray<OooO0OO> f20090OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThreadPoolExecutor f20091OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AtomicInteger f20092OooO00o;

    /* renamed from: com.pd.sdk.o0O0oooO$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, int i2, String str);

        void OooO00o(int i, long j, long j2);

        void OooO00o(int i, String str);
    }

    /* renamed from: com.pd.sdk.o0O0oooO$OooO0O0 */
    public static class OooO0O0 {
        public static C7358o0O0oooO OooO00o = new C7358o0O0oooO();
    }

    /* renamed from: com.pd.sdk.o0O0oooO$OooO0OO */
    public class OooO0OO implements Runnable {
        public volatile AbstractC7326o0O0o00 OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final URL f20094OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final CopyOnWriteArrayList<OooO00o> f20095OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f20096OooO00o = new AtomicBoolean(false);
        public final AtomicBoolean OooO0O0 = new AtomicBoolean(false);

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f20097OooO0O0 = true;
        public final int o00oO0O;
        public final String o0ooOOo;

        public OooO0OO(URL url, String str, String str2, OooO00o oooO00o) {
            this.o00oO0O = C7358o0O0oooO.this.f20092OooO00o.getAndIncrement();
            this.f20094OooO00o = url;
            str2 = TextUtils.isEmpty(str2) ? OooO00o(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.o0ooOOo = C7358o0O0oooO.this.OooO00o((C7358o0O0oooO) str2);
            } else {
                if (str.endsWith(C8932ooOOO0o.OooO0OO)) {
                    this.o0ooOOo = str + str2;
                } else {
                    this.o0ooOOo = str + '/' + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.f20097OooO0O0 = false;
                }
            }
            CopyOnWriteArrayList<OooO00o> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f20095OooO00o = copyOnWriteArrayList;
            copyOnWriteArrayList.add(oooO00o);
        }

        public boolean OooO00o(OooO00o oooO00o) {
            if (this.OooO0O0.get()) {
                return false;
            }
            this.f20095OooO00o.add(oooO00o);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:175:0x024e A[SYNTHETIC, Splitter:B:175:0x024e] */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x0255 A[SYNTHETIC, Splitter:B:179:0x0255] */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x025c A[SYNTHETIC, Splitter:B:183:0x025c] */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0264 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x0276 A[SYNTHETIC, Splitter:B:197:0x0276] */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x027d A[SYNTHETIC, Splitter:B:201:0x027d] */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0284 A[SYNTHETIC, Splitter:B:205:0x0284] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x028c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 668
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7358o0O0oooO.OooO0OO.run():void");
        }

        public void OooO00o() {
            this.f20096OooO00o.set(true);
            OooO00o(-105, "download canceled.");
            if (this.OooO00o != null) {
                try {
                    this.OooO00o.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        private void OooO00o(String str) {
            if (this.OooO0O0.compareAndSet(false, true)) {
                Iterator<OooO00o> it = this.f20095OooO00o.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(this.o00oO0O, str);
                }
            }
        }

        private void OooO00o(int i, String str) {
            if (this.OooO0O0.compareAndSet(false, true)) {
                Iterator<OooO00o> it = this.f20095OooO00o.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(this.o00oO0O, i, str);
                }
            }
        }

        private void OooO00o(long j, long j2) {
            if (!this.OooO0O0.get()) {
                Iterator<OooO00o> it = this.f20095OooO00o.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(this.o00oO0O, j, j2);
                }
            }
        }

        private long OooO00o(int i, Map<String, List<String>> map, long j) {
            int lastIndexOf;
            if (i == 200) {
                try {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length"));
                } catch (Exception unused) {
                    return 0;
                }
            } else if (i != 206) {
                return 0;
            } else {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Range");
                long parseLong = (singleHeaderFieldByKey == null || (lastIndexOf = singleHeaderFieldByKey.lastIndexOf(47)) == -1) ? 0 : Long.parseLong(singleHeaderFieldByKey.substring(lastIndexOf + 1));
                if (parseLong == 0) {
                    try {
                        return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length")) + j;
                    } catch (Exception unused2) {
                    }
                }
                return parseLong;
            }
        }

        private void OooO00o(List<AbstractC7323o0O0Oooo> list) {
            if (list != null) {
                ListIterator<AbstractC7323o0O0Oooo> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if ("Range".equalsIgnoreCase(listIterator.next().getName())) {
                        listIterator.remove();
                        return;
                    }
                }
            }
        }

        private String OooO00o(URL url) {
            String path = url.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            String substring = lastIndexOf != -1 ? path.substring(lastIndexOf + 1, path.length()) : null;
            if (!TextUtils.isEmpty(substring)) {
                return substring;
            }
            String md5ToHex = StringUtils.md5ToHex(url.toString());
            return md5ToHex == null ? url.getFile() : md5ToHex;
        }
    }

    public C7358o0O0oooO() {
        this.f20090OooO00o = new SparseArray<>(6);
        this.f20092OooO00o = new AtomicInteger(0);
        this.f20091OooO00o = new ThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f20089OooO00o = null;
        this.f20089OooO00o = NetworkSdkSetting.getContext();
        this.f20091OooO00o.allowCoreThreadTimeOut(true);
        m18862OooO00o();
    }

    public static C7358o0O0oooO OooO00o() {
        return OooO0O0.OooO00o;
    }

    public int OooO00o(String str, String str2, OooO00o oooO00o) {
        return OooO00o(str, null, str2, oooO00o);
    }

    public int OooO00o(String str, String str2, String str3, OooO00o oooO00o) {
        int i = 0;
        if (ALog.isPrintLog(2)) {
            ALog.m290i(f20088OooO00o, "enqueue", null, "folder", str2, "filename", str3, "url", str);
        }
        if (this.f20089OooO00o == null) {
            ALog.m289e(f20088OooO00o, "network sdk not initialized.", null, new Object[0]);
            return -1;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(str2) || m18863OooO00o(str2)) {
                synchronized (this.f20090OooO00o) {
                    int size = this.f20090OooO00o.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        OooO0OO valueAt = this.f20090OooO00o.valueAt(i);
                        if (!url.equals(valueAt.f20094OooO00o)) {
                            i++;
                        } else if (valueAt.OooO00o(oooO00o)) {
                            return valueAt.o00oO0O;
                        }
                    }
                    OooO0OO oooO0OO = new OooO0OO(url, str2, str3, oooO00o);
                    this.f20090OooO00o.put(oooO0OO.o00oO0O, oooO0OO);
                    this.f20091OooO00o.submit(oooO0OO);
                    return oooO0OO.o00oO0O;
                }
            }
            ALog.m289e(f20088OooO00o, "file folder invalid.", null, new Object[0]);
            if (oooO00o != null) {
                oooO00o.OooO00o(-1, -101, "file folder path invalid");
            }
            return -1;
        } catch (MalformedURLException e) {
            ALog.m288e(f20088OooO00o, "url invalid.", null, e, new Object[0]);
            if (oooO00o != null) {
                oooO00o.OooO00o(-1, -100, "url invalid");
            }
            return -1;
        }
    }

    public void OooO00o(int i) {
        synchronized (this.f20090OooO00o) {
            OooO0OO oooO0OO = this.f20090OooO00o.get(i);
            if (oooO0OO != null) {
                if (ALog.isPrintLog(2)) {
                    ALog.m290i(f20088OooO00o, "try cancel task" + i + " url=" + oooO0OO.f20094OooO00o.toString(), null, new Object[0]);
                }
                this.f20090OooO00o.remove(i);
                oooO0OO.OooO00o();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m18862OooO00o() {
        if (this.f20089OooO00o != null) {
            File file = new File(this.f20089OooO00o.getExternalFilesDir(null), "downloads");
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18863OooO00o(String str) {
        if (this.f20089OooO00o != null) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return file.mkdir();
                }
                return true;
            } catch (Exception unused) {
                ALog.m289e(f20088OooO00o, "create folder failed", null, "folder", str);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String OooO00o(String str) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20089OooO00o.getExternalFilesDir(null));
        sb.append(C8932ooOOO0o.OooO0OO);
        sb.append("downloads");
        sb.append(C8932ooOOO0o.OooO0OO);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private File OooO00o(String str, boolean z) {
        String md5ToHex = StringUtils.md5ToHex(str);
        if (md5ToHex != null) {
            str = md5ToHex;
        }
        if (z) {
            return new File(this.f20089OooO00o.getExternalCacheDir(), str);
        }
        return new File(this.f20089OooO00o.getCacheDir(), str);
    }
}
