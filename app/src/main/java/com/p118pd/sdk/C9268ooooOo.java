package com.p118pd.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.p273uc.crashsdk.JNIBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: com.pd.sdk.ooooOo  reason: case insensitive filesystem */
public class C9268ooooOo {
    public static C9268ooooOo OooO00o = null;
    public static boolean OooO0O0 = true;
    public static boolean OooO0OO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22650OooO00o = false;

    public C9268ooooOo(Context context, C9115oooO00O0 oooo00o0, C9263ooooOOOO oooooooo, AbstractC9118oooO00o oooo00o, boolean z, boolean z2, boolean z3) {
        Context OooO00o2 = OooO00o(context);
        m21149OooO00o(OooO00o2);
        C9112oooO000O.f22507OooO0o = z2;
        C9112oooO000O.f22510OooO0oO = z3;
        if (C9112oooO000O.m20811OooO0OO()) {
            m21149OooO00o(OooO00o2);
            OooO00o(OooO00o2, oooo00o0, oooooooo, oooo00o);
            if (z) {
                OooO0o0();
            }
            if (C9112oooO000O.f22507OooO0o && C9278ooooo0.m21190OooO0O0("libcrashsdk.so")) {
                C9112oooO000O.f22509OooO0o0 = true;
                OooO0o();
            }
        } else if (oooo00o0 == null || oooooooo == null) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        } else {
            C9120oooO00oO.m20848OooO00o(oooo00o0);
            try {
                C9278ooooo0.OooO00o(C9278ooooo0.OooOOO0(), true);
                OooO00o(OooO00o2, oooo00o0, oooooooo, oooo00o);
            } catch (Throwable th) {
                OooO00o(th);
            }
            if (z) {
                try {
                    OooO0o0();
                } catch (Throwable th2) {
                    OooO00o(th2);
                }
            }
            try {
                C9112oooO000O.m20812OooO0Oo();
                C9110oooO000.m20775OooO00o();
                C9094ooOoooOO.m20763OooO00o();
                C9111oooO0000.m20787OooO00o();
            } catch (Throwable th3) {
                C9111oooO0000.OooO00o(th3);
            }
            try {
                if (!C9112oooO000O.m20804OooO00o(OooO00o2)) {
                    C9090ooOooo0O.OooO0Oo("crashsdk", "registerLifecycleCallbacks failed!");
                }
            } catch (Throwable th4) {
                C9111oooO0000.OooO00o(th4);
            }
            try {
                C9119oooO00o0.OooO0o();
                try {
                    C9278ooooo0.m21174OooO00o();
                } catch (Throwable th5) {
                    C9111oooO0000.OooO0O0(th5);
                }
                C9278ooooo0.m21188OooO0O0();
            } catch (Throwable th6) {
                C9111oooO0000.OooO00o(th6);
            }
            try {
                if (C9120oooO00oO.m20873OooOOO0() && C9112oooO000O.m20802OooO00o() && !this.f22650OooO00o) {
                    C9278ooooo0.m21198OooO0o0();
                    this.f22650OooO00o = true;
                }
            } catch (Throwable th7) {
                C9111oooO0000.OooO0O0(th7);
            }
        }
    }

    public static synchronized C9268ooooOo OooO00o(Context context, C9115oooO00O0 oooo00o0, C9263ooooOOOO oooooooo, AbstractC9118oooO00o oooo00o, boolean z, boolean z2, boolean z3) {
        C9268ooooOo oooooo;
        synchronized (C9268ooooOo.class) {
            if (OooO00o == null) {
                OooO00o = new C9268ooooOo(context, oooo00o0, oooooooo, oooo00o, z, z2, z3);
            }
            oooooo = OooO00o;
        }
        return oooooo;
    }

    public static void OooO0o() {
        synchronized (C9112oooO000O.f22493OooO00o) {
            if (C9112oooO000O.f22507OooO0o) {
                if (C9112oooO000O.f22509OooO0o0) {
                    if (C9112oooO000O.f22501OooO0O0) {
                        C9090ooOooo0O.OooO0O0("Has enabled native log!");
                        return;
                    }
                    OooO0oO();
                    C9278ooooo0.m21194OooO0Oo();
                    C9112oooO000O.f22501OooO0O0 = true;
                    JNIBridge.OooO00o(6);
                    C9120oooO00oO.m20862OooO0o0();
                }
            }
        }
    }

    public static void OooO0o0() {
        if (C9112oooO000O.f22497OooO00o) {
            C9090ooOooo0O.OooO0O0("Has enabled java log!");
            return;
        }
        C9278ooooo0.OooOOoo();
        C9278ooooo0.OooOOOo();
        C9112oooO000O.f22497OooO00o = true;
    }

    public static void OooO0oO() {
        if (!C9112oooO000O.f22506OooO0Oo) {
            C9120oooO00oO.m20854OooO0OO();
            JNIBridge.OooO00o(5);
            C9120oooO00oO.m20857OooO0Oo();
            C9112oooO000O.f22506OooO0Oo = true;
        }
    }

    public int OooO0O0() {
        if (OooO00o("getLastExitTypeEx")) {
            return 1;
        }
        return C9112oooO000O.OooO0O0();
    }

    public int OooO0OO() {
        if (OooO00o("getUnexpReason")) {
            return 100;
        }
        return C9278ooooo0.OooO0OO();
    }

    public void OooO0Oo() {
        if (!OooO00o("uploadCrashLogs")) {
            C9278ooooo0.m21185OooO00o(false, true);
        }
    }

    public int OooO0O0(boolean z) {
        if (OooO00o("resetCrashStats")) {
            return 0;
        }
        return C9278ooooo0.OooO00o(z);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m21162OooO0OO() {
        if (!OooO00o("setNewInstall")) {
            C9112oooO000O.m20797OooO();
        }
    }

    public static C9268ooooOo OooO00o(Context context, String str, boolean z) {
        return OooO00o(context, str, z, (Bundle) null);
    }

    public static C9268ooooOo OooO00o(Context context, String str, boolean z, Bundle bundle) {
        return OooO00o(context, str, z, bundle, null);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21161OooO0O0() {
        C9112oooO000O.m20821OooOO0();
    }

    public static C9268ooooOo OooO00o(Context context, String str, boolean z, Bundle bundle, AbstractC9118oooO00o oooo00o) {
        C9268ooooOo oooooo = OooO00o;
        if (oooooo != null) {
            return oooooo;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        OooO0O0 = bundle.getBoolean("useApplicationContext", true);
        Context OooO00o2 = OooO00o(context);
        m21149OooO00o(OooO00o2);
        C9115oooO00O0 oooo00o0 = new C9115oooO00O0(str);
        oooo00o0.f22553OooOOO0 = true;
        oooo00o0.f22548OooO0oo = true;
        oooo00o0.f22557OooOOo0 = z;
        C9115oooO00O0 OooO00o3 = C9120oooO00oO.OooO00o(oooo00o0, bundle);
        C9263ooooOOOO OooO00o4 = C9120oooO00oO.OooO00o(bundle);
        boolean z2 = bundle.getBoolean("enableJavaLog", true);
        boolean z3 = bundle.getBoolean("enableNativeLog", true);
        boolean z4 = bundle.getBoolean("enableUnexpLog", C9112oooO000O.m20802OooO00o());
        boolean z5 = bundle.getBoolean("enableANRLog", true);
        C9268ooooOo OooO00o5 = OooO00o(OooO00o2, OooO00o3, OooO00o4, oooo00o, z2, z3, z4);
        C9112oooO000O.OooO00o(z5);
        if (z3 || z4) {
            if (C9278ooooo0.m21190OooO0O0("libcrashsdk.so")) {
                OooO00o5.m21154OooO00o();
            } else {
                C9090ooOooo0O.OooO0Oo("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i >= 0 && C9112oooO000O.m20802OooO00o()) {
            C9278ooooo0.m21175OooO00o(i);
        }
        return OooO00o5;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public ParcelFileDescriptor m21160OooO0O0() {
        return C9278ooooo0.m21167OooO00o();
    }

    public boolean OooO0O0(ParcelFileDescriptor parcelFileDescriptor) {
        return C9278ooooo0.OooO00o(parcelFileDescriptor);
    }

    public boolean OooO00o(int i, ValueCallback<Bundle> valueCallback) {
        if (valueCallback == null) {
            throw null;
        } else if (i == 1) {
            return C9113oooO000o.OooO00o(valueCallback);
        } else {
            if (i == 2) {
                return C9113oooO000o.OooO0OO(valueCallback);
            }
            if (i == 3) {
                return C9113oooO000o.OooO0Oo(valueCallback);
            }
            if (i == 4) {
                return C9113oooO000o.OooO0O0(valueCallback);
            }
            throw new IllegalArgumentException("Unknown event type: " + i);
        }
    }

    public int OooO00o(C9115oooO00O0 oooo00o0) {
        if (oooo00o0 != null) {
            return C9120oooO00oO.OooO00o(oooo00o0);
        }
        throw null;
    }

    public int OooO00o(Bundle bundle) {
        if (bundle != null) {
            return OooO00o(C9120oooO00oO.OooO00o((C9115oooO00O0) null, bundle));
        }
        throw null;
    }

    public static C9268ooooOo OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21154OooO00o() {
        if (!OooO00o("crashSoLoaded")) {
            C9112oooO000O.f22509OooO0o0 = true;
            OooO0o();
            synchronized (C9112oooO000O.f22493OooO00o) {
                if (C9112oooO000O.f22510OooO0oO) {
                    if (C9112oooO000O.f22509OooO0o0) {
                        if (!C9112oooO000O.f22504OooO0OO) {
                            if (!C9112oooO000O.f22506OooO0Oo) {
                                OooO0oO();
                                C9120oooO00oO.m20862OooO0o0();
                            }
                            C9278ooooo0.OooOo0();
                            C9112oooO000O.f22504OooO0OO = true;
                        }
                    }
                }
            }
            C9119oooO00o0.OooO0o();
            C9278ooooo0.OooOOOO();
        }
    }

    public void OooO00o(C9263ooooOOOO oooooooo) {
        if (oooooooo != null) {
            C9120oooO00oO.OooO00o(oooooooo);
            return;
        }
        throw null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21155OooO00o(Bundle bundle) {
        if (bundle != null) {
            OooO00o(C9120oooO00oO.OooO00o(bundle));
            return;
        }
        throw null;
    }

    public void OooO00o(int i) {
        synchronized (C9112oooO000O.f22493OooO00o) {
            C9112oooO000O.OooO0O0(i);
            if (C9264ooooOOOo.OooO0O0(i) && C9112oooO000O.f22497OooO00o) {
                C9278ooooo0.OooOo00();
                C9112oooO000O.f22497OooO00o = false;
            }
            if (C9264ooooOOOo.OooO0OO(i)) {
                if (C9112oooO000O.f22501OooO0O0) {
                    JNIBridge.OooO00o(9);
                    C9112oooO000O.f22501OooO0O0 = false;
                } else {
                    C9112oooO000O.f22507OooO0o = false;
                }
            }
            if (C9264ooooOOOo.OooO00o(i)) {
                C9112oooO000O.OooO00o(false);
            }
            if (C9264ooooOOOo.OooO0Oo(i)) {
                if (!C9112oooO000O.f22504OooO0OO) {
                    C9112oooO000O.f22510OooO0oO = false;
                } else if (C9278ooooo0.m21205OooOO0()) {
                    C9112oooO000O.f22504OooO0OO = false;
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21159OooO00o(String str, String str2) {
        if (OooO00o("addStatInfo")) {
            return false;
        }
        if (C9111oooO0000.m20791OooO00o(str)) {
            throw null;
        } else if (str.length() <= 24) {
            if (str2 != null && str2.length() > 512) {
                str2 = str2.substring(0, 512);
            }
            return C9110oooO000.OooO00o(str, str2);
        } else {
            throw new IllegalArgumentException("key is too long!");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21152OooO00o() {
        if (OooO00o("getCrashLogUploadUrl")) {
            return null;
        }
        return C9278ooooo0.OooOO0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m21150OooO00o() {
        if (OooO00o("getLastExitType")) {
            return 1;
        }
        return C9112oooO000O.OooO00o();
    }

    public int OooO00o(boolean z) {
        if (OooO00o("reportCrashStats")) {
            return 0;
        }
        return C9278ooooo0.OooO00o(z, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21157OooO00o(boolean z) {
        C9112oooO000O.OooO0O0(z);
    }

    public int OooO00o(int i, String str) {
        return C9119oooO00o0.OooO00o(i, str);
    }

    public boolean OooO00o(C9114oooO00O oooo00o) {
        String str;
        StringBuilder sb;
        String str2 = null;
        if (oooo00o == null) {
            throw null;
        } else if (oooo00o.f22522OooO00o == null || (str = oooo00o.OooO00o) == null) {
            throw new NullPointerException("mData or mLogType is null!");
        } else if (str.contains("_") || oooo00o.OooO00o.contains(" ")) {
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        } else {
            ArrayList<Integer> arrayList = oooo00o.OooO0Oo;
            if (arrayList == null || arrayList.size() <= 0) {
                sb = null;
            } else {
                sb = new StringBuilder();
                Iterator<Integer> it = oooo00o.OooO0Oo.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().intValue());
                    sb.append(" ");
                }
            }
            long j = 0;
            if (oooo00o.f22524OooO00o) {
                j = 1;
            }
            if (oooo00o.f22525OooO0O0) {
                j |= 2;
            }
            if (oooo00o.f22526OooO0OO) {
                j |= 4;
            }
            if (oooo00o.OooO0o0) {
                j |= 8;
            }
            if (oooo00o.OooO0o) {
                j |= 16;
            }
            if (oooo00o.f22527OooO0Oo) {
                j |= 32;
            }
            StringBuffer stringBuffer = oooo00o.f22522OooO00o;
            String str3 = oooo00o.OooO00o;
            ArrayList<String> arrayList2 = oooo00o.f22523OooO00o;
            ArrayList<String> arrayList3 = oooo00o.OooO0O0;
            ArrayList<String> arrayList4 = oooo00o.OooO0OO;
            if (sb != null) {
                str2 = sb.toString();
            }
            return C9278ooooo0.OooO00o(stringBuffer, str3, j, arrayList2, arrayList3, arrayList4, str2);
        }
    }

    public boolean OooO00o(StringBuffer stringBuffer, String str, Bundle bundle) {
        C9114oooO00O oooo00o = new C9114oooO00O(stringBuffer, str);
        if (bundle != null) {
            oooo00o.f22524OooO00o = bundle.getBoolean("mAddHeader", oooo00o.f22524OooO00o);
            oooo00o.f22525OooO0O0 = bundle.getBoolean("mAddFooter", oooo00o.f22525OooO0O0);
            oooo00o.f22526OooO0OO = bundle.getBoolean("mAddLogcat", oooo00o.f22526OooO0OO);
            oooo00o.f22527OooO0Oo = bundle.getBoolean("mUploadNow", oooo00o.f22527OooO0Oo);
            oooo00o.OooO0o0 = bundle.getBoolean("mAddThreadsDump", oooo00o.OooO0o0);
            oooo00o.OooO0o = bundle.getBoolean("mAddBuildId", oooo00o.OooO0o);
            oooo00o.f22523OooO00o = bundle.getStringArrayList("mDumpFiles");
            oooo00o.OooO0O0 = bundle.getStringArrayList("mCallbacks");
            oooo00o.OooO0OO = bundle.getStringArrayList("mCachedInfos");
            oooo00o.OooO0Oo = bundle.getIntegerArrayList("mDumpTids");
        }
        return OooO00o(oooo00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21156OooO00o(String str, String str2) {
        if (str != null) {
            C9119oooO00o0.m20836OooO00o(str, str2);
            return;
        }
        throw null;
    }

    public int OooO00o(String str, int i, int i2) {
        if (str == null) {
            throw null;
        } else if (i <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        } else if ((1048849 & i2) == 0) {
            return 0;
        } else {
            return C9119oooO00o0.OooO00o(str, i, i2);
        }
    }

    public int OooO00o(String str, String str2) {
        if (str == null) {
            throw null;
        } else if (str2 != null) {
            return C9119oooO00o0.OooO00o(str, str2);
        } else {
            throw null;
        }
    }

    public int OooO00o(String str, int i) {
        if (str == null) {
            throw null;
        } else if ((1048849 & i) == 0) {
            return 0;
        } else {
            return C9119oooO00o0.OooO00o(str, i, null, 0, 0);
        }
    }

    public int OooO00o(String str, int i, Callable<String> callable) {
        if (str == null) {
            throw null;
        } else if (callable == null) {
            throw null;
        } else if ((1048849 & i) == 0) {
            return 0;
        } else {
            return C9119oooO00o0.OooO00o(str, i, callable, 0, 0);
        }
    }

    public int OooO00o(C9117oooO00Oo oooo00oo) {
        String str;
        if (oooo00oo != null) {
            String str2 = oooo00oo.f22560OooO00o;
            if (str2 == null || (str = oooo00oo.OooO0O0) == null) {
                throw null;
            }
            int i = oooo00oo.OooO00o;
            if ((1048849 & i) == 0) {
                return 0;
            }
            return C9119oooO00o0.OooO00o(str2, str, oooo00oo.OooO0OO, oooo00oo.f22561OooO00o, i, oooo00oo.f22562OooO0O0);
        }
        throw null;
    }

    public int OooO00o(String str, String str2, int i, Bundle bundle) {
        C9117oooO00Oo oooo00oo = new C9117oooO00Oo(str, str2, i);
        if (bundle != null) {
            oooo00oo.OooO0OO = bundle.getBoolean("mIsEncrypted", oooo00oo.OooO0OO);
            oooo00oo.f22561OooO00o = bundle.getBoolean("mWriteCategory", oooo00oo.f22561OooO00o);
            oooo00oo.f22562OooO0O0 = bundle.getBoolean("mDeleteAfterDump", oooo00oo.f22562OooO0O0);
        }
        return OooO00o(oooo00oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m21153OooO00o() {
        return C9278ooooo0.m21172OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21158OooO00o() {
        if (OooO00o("updateUnexpInfo")) {
            return false;
        }
        return C9119oooO00o0.OooO00o(true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ParcelFileDescriptor m21151OooO00o() {
        return C9278ooooo0.m21167OooO00o();
    }

    public boolean OooO00o(ParcelFileDescriptor parcelFileDescriptor) {
        return C9278ooooo0.OooO00o(parcelFileDescriptor);
    }

    public boolean OooO00o(String str, long j) {
        if (OooO00o("generateTraces")) {
            return false;
        }
        if (!C9112oooO000O.f22506OooO0Oo) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "Crash so is not loaded!");
            return false;
        } else if (JNIBridge.nativeCmd(12, j, str, null) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void OooO00o(Context context, C9115oooO00O0 oooo00o0, C9263ooooOOOO oooooooo, AbstractC9118oooO00o oooo00o) {
        C9113oooO000o.OooO00o(oooo00o);
        C9120oooO00oO.OooO00o(oooo00o0, oooooooo);
        if (!C9112oooO000O.m20811OooO0OO()) {
            C9278ooooo0.OooOOo0();
            C9278ooooo0.OooO00o(context);
            C9278ooooo0.OooO0O0(context);
        }
    }

    public static Context OooO00o(Context context) {
        if (context == null) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "context can not be null!");
            throw null;
        } else if (!OooO0O0 || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
            return context;
        } else {
            C9090ooOooo0O.OooO0Oo("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21149OooO00o(Context context) {
        try {
            if (!OooO0OO) {
                C9111oooO0000.OooO00o(context);
                C9119oooO00o0.f22566OooO00o = context.getPackageName();
                OooO0OO = true;
            }
        } catch (Throwable th) {
            OooO00o(th);
        }
    }

    public static void OooO00o(Throwable th) {
        new C9278ooooo0().OooO00o(Thread.currentThread(), th, true);
    }

    public static boolean OooO00o(String str) {
        if (!C9112oooO000O.m20811OooO0OO()) {
            return false;
        }
        C9090ooOooo0O.OooO0Oo("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
