package com.p118pd.sdk;

import android.os.Build;
import android.os.Process;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.p118pd.sdk.C7265o0O000oo;
import com.p273uc.crashsdk.JNIBridge;
import com.taobao.accs.common.Constants;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.pd.sdk.oooO000  reason: case insensitive filesystem */
public class C9110oooO000 {
    public static int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final SparseArray<String> f22472OooO00o = new SparseArray<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22473OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22474OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f22475OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22476OooO00o = false;
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Map<String, OooO00o> f22477OooO0O0 = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22478OooO0O0 = false;
    public static final Object OooO0OO = new Object();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final /* synthetic */ boolean f22479OooO0OO = (!C9110oooO000.class.desiredAssertionStatus());
    public static final Object OooO0Oo = new Object();

    /* renamed from: com.pd.sdk.oooO000$OooO00o */
    public static class OooO00o {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f22480OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f22481OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Map<String, String> f22482OooO00o = new HashMap();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22483OooO00o = false;
        public boolean OooO0O0 = false;

        public OooO00o(String str, boolean z, boolean z2) {
            this.f22481OooO00o = str;
            this.f22483OooO00o = z;
            this.OooO0O0 = z2;
        }

        public final void OooO00o(String str, String str2) {
            this.f22482OooO00o.put(str, str2);
        }

        public final String OooO0O0(String str) {
            String OooO00o2 = m20783OooO00o(str);
            return OooO00o2 == null ? "" : OooO00o2;
        }

        public final void OooO00o(String str, long j) {
            long OooO00o2 = OooO00o(str) + j;
            if (OooO00o2 <= 100) {
                j = OooO00o2 < 0 ? 0 : OooO00o2;
            }
            OooO00o(str, String.valueOf(j));
        }

        public final boolean OooO00o(OooO00o oooO00o) {
            if (!this.OooO0O0) {
                C9090ooOooo0O.OooO00o("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f22481OooO00o), null);
                return false;
            }
            for (String str : oooO00o.f22482OooO00o.keySet()) {
                if (str.startsWith("c_")) {
                    OooO00o(str, oooO00o.m20783OooO00o(str));
                } else {
                    long OooO00o2 = oooO00o.OooO00o(str);
                    if (OooO00o2 == 0) {
                        OooO00o(str, oooO00o.m20783OooO00o(str));
                    } else if (OooO00o2 < 100) {
                        OooO00o(str, OooO00o2);
                    }
                }
            }
            return true;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final String m20783OooO00o(String str) {
            return this.f22482OooO00o.get(str);
        }

        private long OooO00o(String str) {
            return C9111oooO0000.OooO00o(m20783OooO00o(str));
        }

        public final String OooO00o(boolean z, boolean z2, boolean z3) {
            if (this.f22481OooO00o == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                C9110oooO000.OooO0O0(sb, "lt", "uc");
                C9110oooO000.OooO0O0(sb, C7383o0OOO0O.OooOO0o, C9120oooO00oO.m20866OooO0oo());
                C9110oooO000.OooO0O0(sb, "pkg", C9119oooO00o0.f22566OooO00o);
                C9110oooO000.OooO0O0(sb, "rom", Build.VERSION.RELEASE);
                C9110oooO000.OooO0O0(sb, "brd", Build.BRAND);
                C9110oooO000.OooO0O0(sb, Constants.KEY_MODEL, Build.MODEL);
                C9110oooO000.OooO00o(sb, "sdk", (long) Build.VERSION.SDK_INT);
                C9110oooO000.OooO0O0(sb, C3617o.f9393v, C9278ooooo0.OooO0o());
                C9110oooO000.OooO0O0(sb, "hdw", C9278ooooo0.OooO0oO());
                long OooO0O02 = C9110oooO000.OooO0O0();
                C9110oooO000.OooO00o(sb, "ram", OooO0O02);
                C9110oooO000.OooO0O0(sb, "aram", C9110oooO000.OooO00o(OooO0O02));
                C9110oooO000.OooO0O0(sb, "cver", "3.2.0.4");
                C9110oooO000.OooO0O0(sb, "cseq", "200403192109");
                C9110oooO000.OooO0O0(sb, "ctag", "umeng");
                C9110oooO000.OooO0O0(sb, "aver", C9119oooO00o0.m20832OooO00o());
                C9110oooO000.OooO0O0(sb, "ver", C9120oooO00oO.m20846OooO00o());
                C9110oooO000.OooO0O0(sb, "sver", C9120oooO00oO.m20850OooO0O0());
                C9110oooO000.OooO0O0(sb, "seq", C9120oooO00oO.m20853OooO0OO());
                C9110oooO000.OooO0O0(sb, "grd", C9112oooO000O.OooOo00() ? "fg" : "bg");
                C9110oooO000.OooO0O0(sb, "os", "android");
                sb.append("\n");
            }
            C9110oooO000.OooO0O0(sb, "lt", this.f22481OooO00o);
            C9110oooO000.OooO00o(sb, this.f22482OooO00o);
            if (this.f22483OooO00o && !z2) {
                long j = this.f22480OooO00o;
                if (j != 0) {
                    C9110oooO000.OooO0O0(sb, CommonNetImpl.f10820UP, String.valueOf(j));
                }
                if (z3) {
                    C9110oooO000.OooO0O0(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(Process.myPid())));
                } else {
                    int i = this.OooO00o;
                    if (i != 0) {
                        C9110oooO000.OooO0O0(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(i)));
                    }
                }
            }
            sb.append("\n");
            return sb.toString();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final boolean m20784OooO00o(String str) {
            if (C9111oooO0000.m20791OooO00o(str)) {
                return false;
            }
            String str2 = null;
            long j = 0;
            HashMap hashMap = new HashMap();
            Map OooO00o2 = C9110oooO000.OooO00o(str);
            int i = 0;
            for (String str3 : OooO00o2.keySet()) {
                String str4 = (String) OooO00o2.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f22483OooO00o && str3.equals(CommonNetImpl.f10820UP)) {
                    j = C9111oooO0000.OooO00o(str4);
                } else if (!this.f22483OooO00o || !str3.equals("pid")) {
                    hashMap.put(str3, str4);
                } else {
                    i = (int) C9111oooO0000.OooO00o(str4);
                }
            }
            String str5 = this.f22481OooO00o;
            if (!(str5 == null || str5.equals(str2))) {
                return false;
            }
            this.f22480OooO00o = j;
            this.OooO00o = i;
            this.f22481OooO00o = str2;
            this.f22482OooO00o = hashMap;
            return true;
        }
    }

    public static /* synthetic */ String OooO00o(long j) {
        if (j < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            return "512M";
        }
        return String.format(Locale.US, "%dG", Long.valueOf(((j / 1024) + 512) / 1024));
    }

    public static void OooO0O0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(C8932ooOOO0o.OooO0Oo);
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m20782OooO0OO() {
        OooO00o(3, 0);
    }

    public static void OooO0Oo() {
        OooO0O0(2, (long) C7265o0O000oo.OooO0o.OooO00o);
        OooO00o(1, 70000);
    }

    public static void OooO0o() {
        OooO0O0(3, 0);
    }

    public static void OooO0o0() {
        OooO0O0(1, (long) C7265o0O000oo.OooO0o.OooO00o);
    }

    public static void OooO0oO() {
        OooO0O0(4, 0);
    }

    public static void OooO0oo() {
        if (C9120oooO00oO.m20863OooO0o0()) {
            C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(303));
        }
    }

    public static /* synthetic */ void OooO00o(StringBuilder sb, String str, long j) {
        OooO0O0(sb, str, String.valueOf(j));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20781OooO0O0() {
        OooO00o(2, 0);
    }

    public static String OooO0OO() {
        if (C9111oooO0000.m20791OooO00o(f22474OooO00o)) {
            synchronized (OooO0Oo) {
                String str = "https://applog.uc.cn/collect";
                if (C9120oooO00oO.m20860OooO0o()) {
                    str = "https://gjapplog.ucweb.com/collect";
                }
                f22474OooO00o = C9111oooO0000.OooO00o(C9112oooO000O.OooOO0o(), str, true);
            }
        }
        return f22474OooO00o;
    }

    public static void OooO0O0(int i, long j) {
        if (C9120oooO00oO.m20863OooO0o0()) {
            C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(301, new Object[]{Integer.valueOf(i)}), j);
        }
    }

    public static /* synthetic */ void OooO00o(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            OooO0O0(sb, str, (String) map.get(str));
        }
    }

    public static void OooO00o(String str) {
        synchronized (f22473OooO00o) {
            File file = new File(OooO00o());
            OooO00o oooO00o = new OooO00o(SocializeProtocolConstants.PROTOCOL_KEY_PV, true, true);
            String OooO00o2 = C9111oooO0000.OooO00o(file);
            if (!C9111oooO0000.m20791OooO00o(OooO00o2)) {
                oooO00o.m20784OooO00o(OooO00o2);
            }
            oooO00o.OooO00o(str, 1);
            oooO00o.OooO00o("aujv", 1);
            C9111oooO0000.OooO00o(file, oooO00o.OooO00o(false, false, false));
        }
    }

    public static void OooO0O0(boolean z) {
        if (!OooO00o(z, "crash detail upload")) {
            String str = C9120oooO00oO.m20856OooO0Oo() + "dt.wa";
            C9112oooO000O.OooO00o(OooO0O0, str, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META, new Object[]{str}));
            String OooO0O02 = m20780OooO0O0();
            C9112oooO000O.OooO00o(OooO0OO, OooO0O02, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND, new Object[]{OooO0O02}));
        }
    }

    public static boolean OooO0O0(String str, String str2, boolean z, boolean z2) {
        OooO00o oooO00o;
        File file = new File(m20780OooO0O0());
        ArrayList<OooO00o> OooO00o2 = OooO00o(file, "cst", 30);
        String str3 = str + str2;
        Iterator<OooO00o> it = OooO00o2.iterator();
        while (true) {
            if (!it.hasNext()) {
                oooO00o = null;
                break;
            }
            oooO00o = it.next();
            if (str3.equals(oooO00o.OooO0O0("prc") + oooO00o.OooO0O0("typ"))) {
                break;
            }
        }
        if (oooO00o == null) {
            oooO00o = new OooO00o("cst", false, true);
            oooO00o.OooO00o("prc", str);
            oooO00o.OooO00o("typ", str2);
            OooO00o(oooO00o);
            OooO00o2.add(oooO00o);
        }
        oooO00o.OooO00o("cnt", 1);
        if (z) {
            oooO00o.OooO00o("lim", 1);
        }
        if (z2) {
            oooO00o.OooO00o("syu", 1);
        }
        return C9111oooO0000.OooO00o(file, OooO00o((Iterable<OooO00o>) OooO00o2, false, false).toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20775OooO00o() {
        OooO00o(0, C9112oooO000O.m20809OooO0O0() ? 700000 : 70000);
    }

    public static void OooO00o(int i, long j) {
        if (C9112oooO000O.m20802OooO00o()) {
            C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(302, new Object[]{Integer.valueOf(i)}), j);
        }
    }

    public static boolean OooO00o(String str, String str2) {
        String str3;
        try {
            String str4 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (C9111oooO0000.m20791OooO00o(str2)) {
                str3 = "";
            } else {
                str3 = str2.replaceAll("[`=]", com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            }
            synchronized (f22475OooO00o) {
                if (f22475OooO00o.get(str4) == null) {
                    if (OooO00o >= 20) {
                        return false;
                    }
                    OooO00o++;
                }
                f22475OooO00o.put(str4, str3);
                return true;
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return false;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m20780OooO0O0() {
        return C9120oooO00oO.m20856OooO0Oo() + "cdt.wa";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO0O0(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9110oooO000.OooO0O0(java.lang.String, java.lang.String):boolean");
    }

    public static void OooO00o(OooO00o oooO00o) {
        synchronized (f22475OooO00o) {
            for (String str : f22475OooO00o.keySet()) {
                oooO00o.OooO00o(str, f22475OooO00o.get(str));
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20776OooO00o() {
        return f22478OooO0O0;
    }

    public static void OooO00o(boolean z) {
        OooO00o(1, z);
    }

    public static boolean OooO00o(boolean z, String str) {
        if (!C9112oooO000O.f22506OooO0Oo || z || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        C9090ooOooo0O.OooO0O0("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    public static long OooO0O0() {
        Iterator<String> it = C9111oooO0000.OooO00o(new File("/proc/meminfo"), 2).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e) {
                    C9111oooO0000.OooO00o(e);
                }
            }
        }
        return 0;
    }

    public static void OooO00o(int i, boolean z) {
        if (!OooO00o(z, "crash rate")) {
            String str = C9120oooO00oO.m20856OooO0Oo() + "cr.wa";
            C9112oooO000O.OooO00o(f22473OooO00o, str, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_PACKAGE_CHECK_DEX_META, new Object[]{str, Integer.valueOf(i)}));
        }
    }

    public static void OooO0O0(String str) {
        synchronized (OooO0Oo) {
            f22474OooO00o = str;
            String OooOO0o = C9112oooO000O.OooOO0o();
            C9093ooOoooO0.OooO00o(OooOO0o, f22474OooO00o + "\n");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r3 == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(int r9, java.lang.Object[] r10) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9110oooO000.OooO00o(int, java.lang.Object[]):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20777OooO00o(int i, Object[] objArr) {
        switch (i) {
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_DEX_META /*{ENCODED_INT: 351}*/:
                if (f22479OooO0OO || objArr != null) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    if (intValue == 1) {
                        if (f22478OooO0O0) {
                            return false;
                        }
                        f22478OooO0O0 = true;
                    }
                    File file = new File(str);
                    ArrayList<OooO00o> OooO00o2 = OooO00o(file, "crp", 100);
                    if (intValue != 4) {
                        OooO00o oooO00o = new OooO00o("crp", false, false);
                        String str2 = "1";
                        if (intValue == 1) {
                            oooO00o.OooO00o("et", String.valueOf(C9112oooO000O.OooO00o()));
                            oooO00o.OooO00o("ete", String.valueOf(C9112oooO000O.OooO0O0()));
                        } else if (intValue == 3) {
                            oooO00o.OooO00o("et", str2);
                            oooO00o.OooO00o("ete", str2);
                        } else if (intValue == 2) {
                            oooO00o.OooO00o("hpv", str2);
                        }
                        oooO00o.OooO00o("prc", C9278ooooo0.OooO());
                        if (!C9112oooO000O.m20802OooO00o()) {
                            str2 = "0";
                        }
                        oooO00o.OooO00o("imp", str2);
                        OooO00o(oooO00o);
                        OooO00o2.add(0, oooO00o);
                    }
                    if (!OooO00o2.isEmpty()) {
                        boolean OooO0O02 = OooO0O0(C9278ooooo0.OooOO0o(), OooO00o((Iterable<OooO00o>) OooO00o2, true, false).toString());
                        C9111oooO0000.m20788OooO00o(file);
                        if (!OooO0O02) {
                            C9111oooO0000.OooO00o(file, OooO00o((Iterable<OooO00o>) OooO00o2, false, true).toString());
                        }
                    }
                    return true;
                }
                throw new AssertionError();
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META /*{ENCODED_INT: 352}*/:
                if (f22479OooO0OO || objArr != null) {
                    return m20778OooO00o((String) objArr[0]);
                }
                throw new AssertionError();
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND /*{ENCODED_INT: 353}*/:
                if (f22479OooO0OO || objArr != null) {
                    return OooO0O0((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND /*{ENCODED_INT: 354}*/:
                if (f22479OooO0OO || objArr != null) {
                    File file2 = new File((String) objArr[0]);
                    boolean OooO0O03 = OooO0O0(C9278ooooo0.OooOO0o(), OooO00o((Iterable<OooO00o>) OooO00o(file2, "cst", 30), true, false).toString());
                    if (OooO0O03) {
                        C9111oooO0000.m20788OooO00o(file2);
                    }
                    return OooO0O03;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    public static StringBuilder OooO00o(Iterable<OooO00o> iterable, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        boolean z3 = true;
        for (OooO00o oooO00o : iterable) {
            if (z3) {
                sb.append(oooO00o.OooO00o(z, z, z2));
                z3 = false;
            } else {
                sb.append(oooO00o.OooO00o(false, z, z2));
            }
        }
        return sb;
    }

    public static void OooO00o(String str, int i, int i2) {
        if (C9120oooO00oO.m20863OooO0o0()) {
            synchronized (OooO0O0) {
                OooO00o oooO00o = f22477OooO0O0.get(str);
                if (oooO00o == null) {
                    oooO00o = new OooO00o("cst", false, true);
                    f22477OooO0O0.put(str, oooO00o);
                    OooO00o(oooO00o);
                }
                synchronized (f22472OooO00o) {
                    if (f22472OooO00o.size() == 0) {
                        OooO00o(100, SocializeProtocolConstants.PROTOCOL_KEY_PV);
                        OooO00o(102, "hpv");
                        OooO00o(1, "all");
                        OooO00o(2, "afg");
                        OooO00o(101, "abg");
                        OooO00o(3, "jfg");
                        OooO00o(4, "jbg");
                        OooO00o(7, "nfg");
                        OooO00o(8, "nbg");
                        OooO00o(27, "nafg");
                        OooO00o(28, "nabg");
                        OooO00o(9, "nho");
                        OooO00o(10, "uar");
                        OooO00o(29, "ulm");
                        OooO00o(30, "ukt");
                        OooO00o(31, "uet");
                        OooO00o(32, "urs");
                        OooO00o(11, "ufg");
                        OooO00o(12, "ubg");
                        OooO00o(40, "anf");
                        OooO00o(41, "anb");
                        OooO00o(42, "ancf");
                        OooO00o(43, "ancb");
                        OooO00o(13, "lup");
                        OooO00o(14, "luf");
                        OooO00o(15, "lef");
                        OooO00o(200, "ltf");
                        OooO00o(16, "laf");
                        OooO00o(22, "lac");
                        OooO00o(23, "lau");
                        OooO00o(17, "llf");
                        OooO00o(18, "lul");
                        OooO00o(19, "lub");
                        OooO00o(20, "luc");
                        OooO00o(21, "luu");
                        OooO00o(24, "lzc");
                        OooO00o(201, "lec");
                        OooO00o(25, "lrc");
                        OooO00o(26, "lss");
                    }
                }
                String str2 = f22472OooO00o.get(i);
                if (str2 == null) {
                    C9090ooOooo0O.OooO00o("crashsdk", "map key is not set with: " + i, null);
                }
                oooO00o.OooO00o("prc", str);
                if (str2 != null) {
                    oooO00o.OooO00o(str2, String.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20778OooO00o(String str) {
        File file = new File(str);
        Iterator<OooO00o> it = OooO00o(file, "cst", 30).iterator();
        while (it.hasNext()) {
            OooO00o next = it.next();
            String OooO00o2 = next.m20783OooO00o("prc");
            if (!C9111oooO0000.m20791OooO00o(OooO00o2)) {
                OooO00o oooO00o = f22477OooO0O0.get(OooO00o2);
                if (oooO00o != null) {
                    oooO00o.OooO00o(next);
                } else {
                    f22477OooO0O0.put(OooO00o2, next);
                }
            }
        }
        boolean OooO0O02 = OooO0O0(C9278ooooo0.OooOO0o(), OooO00o((Iterable<OooO00o>) f22477OooO0O0.values(), true, false).toString());
        C9111oooO0000.m20788OooO00o(file);
        if (OooO0O02 || C9111oooO0000.OooO00o(file, OooO00o((Iterable<OooO00o>) f22477OooO0O0.values(), false, true).toString())) {
            f22477OooO0O0.clear();
        }
        return true;
    }

    public static boolean OooO00o(String str, String str2, boolean z, boolean z2) {
        if (!C9120oooO00oO.m20863OooO0o0()) {
            return false;
        }
        String OooO0O02 = m20780OooO0O0();
        return C9112oooO000O.OooO00o(OooO0OO, OooO0O02, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, new Object[]{str, str2, Boolean.valueOf(z), Boolean.valueOf(z2)}));
    }

    public static void OooO00o(int i, String str) {
        f22472OooO00o.put(i, str);
    }

    public static ArrayList<OooO00o> OooO00o(File file, String str, int i) {
        ArrayList<String> OooO00o2 = C9111oooO0000.OooO00o(file, i);
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        Iterator<String> it = OooO00o2.iterator();
        while (it.hasNext()) {
            OooO00o oooO00o = new OooO00o(str, false, false);
            if (oooO00o.m20784OooO00o(it.next())) {
                arrayList.add(oooO00o);
            }
        }
        return arrayList;
    }

    public static String OooO00o() {
        return C9120oooO00oO.m20856OooO0Oo() + "pv.wa";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20779OooO00o() {
        return new byte[]{O0O00O.OooO0O0, 100, 110, C3571am.f9204j};
    }
}
