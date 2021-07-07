package com.p118pd.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.pd.sdk.ooO0OO0O  reason: case insensitive filesystem */
public class C8835ooO0OO0O {
    public static Bundle[] OooO00o(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
