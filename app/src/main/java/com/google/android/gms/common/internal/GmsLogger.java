package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class GmsLogger {
    public static final int zzef = 15;
    public static final String zzeg = null;
    public final String zzeh;
    public final String zzei;

    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzeh = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzei = null;
        } else {
            this.zzei = str2;
        }
    }

    private final String zza(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzei;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    private final String zzh(String str) {
        String str2 = this.zzei;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    @KeepForSdk
    public final boolean canLog(int i) {
        return Log.isLoggable(this.zzeh, i);
    }

    @KeepForSdk
    public final boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public final void mo10801d(String str, String str2) {
        if (canLog(3)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public final void mo10803e(String str, String str2) {
        if (canLog(6)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            zza(str2, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public final void mo10806i(String str, String str2) {
        if (canLog(4)) {
            Log.i(str, zzh(str2));
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? valueOf.concat(" PII_LOG") : new String(valueOf), zzh(str2));
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public final void mo10810v(String str, String str2) {
        if (canLog(2)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public final void mo10812w(String str, String str2) {
        if (canLog(5)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            zza(str2, objArr);
        }
    }

    @KeepForSdk
    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            zzh(str2);
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final void mo10802d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public final void mo10804e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public final void mo10807i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            Log.i(str, zzh(str2), th);
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2, Throwable th) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? valueOf.concat(" PII_LOG") : new String(valueOf), zzh(str2), th);
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public final void mo10811v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            zzh(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public final void mo10813w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            zzh(str2);
        }
    }

    public GmsLogger(String str) {
        this(str, null);
    }
}
