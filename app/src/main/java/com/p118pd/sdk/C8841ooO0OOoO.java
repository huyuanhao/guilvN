package com.p118pd.sdk;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.pd.sdk.ooO0OOoO  reason: case insensitive filesystem */
public class C8841ooO0OOoO {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static int OooO0Oo = -1;

    public static int OooO00o() {
        int i = OooO0Oo;
        if (i >= 0) {
            return i;
        }
        Context OooO00o2 = C8769oo0ooOOO.OooO00o();
        if (OooO00o2 == null) {
            return OooO0Oo;
        }
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(OooO00o2);
            if (isGooglePlayServicesAvailable != 0) {
                if (isGooglePlayServicesAvailable != 9) {
                    if (!(isGooglePlayServicesAvailable == 18 || isGooglePlayServicesAvailable == 2)) {
                        if (isGooglePlayServicesAvailable != 3) {
                            OooO0Oo = 0;
                            C8783oo0oooOO.OooOOOO("check Google Play Service status = " + OooO0Oo);
                            return OooO0Oo;
                        }
                    }
                }
                OooO0Oo = 1;
                C8783oo0oooOO.OooOOOO("check Google Play Service status = " + OooO0Oo);
                return OooO0Oo;
            }
            OooO0Oo = 2;
        } catch (Throwable th) {
            OooO0Oo = 0;
            C8783oo0oooOO.OooOOOO("check Google Play Service exception = " + th);
        }
        C8783oo0oooOO.OooOOOO("check Google Play Service status = " + OooO0Oo);
        return OooO0Oo;
    }
}
