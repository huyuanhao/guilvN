package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

/* renamed from: com.pd.sdk.OooOO0O  reason: case insensitive filesystem */
public class C5938OooOO0O {
    public static final int OooO00o = 6;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C5938OooOO0O f17038OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17039OooO00o = "TwilightManager";
    public static final int OooO0O0 = 22;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f17040OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LocationManager f17041OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f17042OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.OooOO0O$OooO00o */
    public static class OooO00o {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17043OooO00o;
        public long OooO0O0;
        public long OooO0OO;
        public long OooO0Oo;
        public long OooO0o0;
    }

    @VisibleForTesting
    public C5938OooOO0O(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f17040OooO00o = context;
        this.f17041OooO00o = locationManager;
    }

    public static C5938OooOO0O OooO00o(@NonNull Context context) {
        if (f17038OooO00o == null) {
            Context applicationContext = context.getApplicationContext();
            f17038OooO00o = new C5938OooOO0O(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f17038OooO00o;
    }

    private boolean OooO0O0() {
        return this.f17042OooO00o.OooO0o0 > System.currentTimeMillis();
    }

    @VisibleForTesting
    public static void OooO00o(C5938OooOO0O oooOO0O) {
        f17038OooO00o = oooOO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16672OooO00o() {
        OooO00o oooO00o = this.f17042OooO00o;
        if (OooO0O0()) {
            return oooO00o.f17043OooO00o;
        }
        Location OooO00o2 = OooO00o();
        if (OooO00o2 != null) {
            OooO00o(OooO00o2);
            return oooO00o.f17043OooO00o;
        }
        Log.i(f17039OooO00o, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @SuppressLint({"MissingPermission"})
    private Location OooO00o() {
        Location location = null;
        Location OooO00o2 = PermissionChecker.OooO0O0(this.f17040OooO00o, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? OooO00o("network") : null;
        if (PermissionChecker.OooO0O0(this.f17040OooO00o, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = OooO00o("gps");
        }
        return (location == null || OooO00o2 == null) ? location != null ? location : OooO00o2 : location.getTime() > OooO00o2.getTime() ? location : OooO00o2;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location OooO00o(String str) {
        try {
            if (this.f17041OooO00o.isProviderEnabled(str)) {
                return this.f17041OooO00o.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void OooO00o(@NonNull Location location) {
        long j;
        OooO00o oooO00o = this.f17042OooO00o;
        long currentTimeMillis = System.currentTimeMillis();
        C5937OooOO0 OooO00o2 = C5937OooOO0.OooO00o();
        OooO00o2.OooO00o(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = OooO00o2.f17036OooO00o;
        OooO00o2.OooO00o(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = OooO00o2.f17035OooO00o == 1;
        long j3 = OooO00o2.f17037OooO0O0;
        long j4 = OooO00o2.f17036OooO00o;
        OooO00o2.OooO00o(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = OooO00o2.f17037OooO0O0;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        oooO00o.f17043OooO00o = z;
        oooO00o.OooO00o = j2;
        oooO00o.OooO0O0 = j3;
        oooO00o.OooO0OO = j4;
        oooO00o.OooO0Oo = j5;
        oooO00o.OooO0o0 = j;
    }
}
