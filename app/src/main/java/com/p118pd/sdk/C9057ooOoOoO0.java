package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: com.pd.sdk.ooOoOoO0  reason: case insensitive filesystem */
public class C9057ooOoOoO0 {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22362OooO00o = true;

    public C9057ooOoOoO0(Context context) {
        this.OooO00o = context;
    }

    public boolean OooO() {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", C9053ooOoOo.OooO00o});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public boolean OooO00o(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C9053ooOoOo.f22358OooO0O0));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return OooO00o(arrayList);
    }

    public boolean OooO0O0(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C9053ooOoOo.OooO0OO));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return OooO00o(arrayList);
    }

    public boolean OooO0OO(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C9053ooOoOo.f22357OooO00o));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return OooO00o(arrayList);
    }

    public boolean OooO0Oo() {
        return OooO00o("magisk");
    }

    public boolean OooO0o() {
        String[] OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return false;
        }
        boolean z = false;
        for (String str : OooO00o2) {
            String[] split = str.split(" ");
            if (split.length < 4) {
                C9059ooOoOoOo.OooO0O0("Error formatting mount line: " + str);
            } else {
                String str2 = split[1];
                String str3 = split[3];
                String[] strArr = C9053ooOoOo.OooO0o0;
                for (String str4 : strArr) {
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] split2 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        int length = split2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (split2[i].equalsIgnoreCase("rw")) {
                                C9059ooOoOoOo.OooO0Oo(str4 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean OooO0o0() {
        try {
            new RootBeerNative().setLogDebugMessages(this.f22362OooO00o);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean OooO0oO() {
        if (!m20718OooO00o()) {
            C9059ooOoOoOo.OooO0O0("We could not load the native library to test for root");
            return false;
        }
        String[] OooO00o2 = C9053ooOoOo.OooO00o();
        int length = OooO00o2.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = OooO00o2[i] + C9053ooOoOo.OooO00o;
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f22362OooO00o);
            if (rootBeerNative.checkForRoot(strArr) > 0) {
                return true;
            }
            return false;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean OooO0oo() {
        return OooO00o(C9053ooOoOo.OooO00o);
    }

    public boolean OooOO0() {
        return OooO00o((String[]) null);
    }

    public boolean OooOO0O() {
        return OooO0O0(null) || (m20718OooO00o() && !OooO0o0());
    }

    public boolean OooOO0o() {
        return OooO0OO(null);
    }

    public boolean OooOOO() {
        return OooOO0o() || OooOO0() || OooO00o(C9053ooOoOo.OooO00o) || OooO0OO() || OooO0o() || OooOOO0() || OooO() || OooO0oO() || OooO0Oo();
    }

    public boolean OooOOO0() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean OooOOOO() {
        return OooOO0o() || OooOO0() || OooO00o(C9053ooOoOo.OooO00o) || OooO00o(C9053ooOoOo.OooO0O0) || OooO0OO() || OooO0o() || OooOOO0() || OooO() || OooO0oO() || OooO0Oo();
    }

    public boolean OooOOOo() {
        return OooOOO();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20719OooO0O0() {
        return OooO00o(C9053ooOoOo.OooO0O0);
    }

    public boolean OooO0OO() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] OooO0O0 = OooO0O0();
        if (OooO0O0 == null) {
            return false;
        }
        boolean z = false;
        for (String str : OooO0O0) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        C9059ooOoOoOo.OooO0Oo(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private String[] OooO0O0() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C9059ooOoOoOo.OooO00o(e);
            return null;
        }
    }

    public boolean OooO00o(String str) {
        String[] OooO00o2 = C9053ooOoOo.OooO00o();
        boolean z = false;
        for (String str2 : OooO00o2) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                C9059ooOoOoOo.OooO0Oo(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public void OooO00o(boolean z) {
        this.f22362OooO00o = z;
        C9059ooOoOoOo.OooO0oO = z ? 5 : 0;
    }

    private String[] OooO00o() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C9059ooOoOoOo.OooO00o(e);
            return null;
        }
    }

    private boolean OooO00o(List<String> list) {
        PackageManager packageManager = this.OooO00o.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                C9059ooOoOoOo.OooO0O0(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20718OooO00o() {
        return new RootBeerNative().OooO00o();
    }
}
