package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@KeepForSdk
public class AndroidUtilsLight {
    public static volatile int zzge = -1;

    @KeepForSdk
    @TargetApi(24)
    public static Context getDeviceProtectedStorageContext(Context context) {
        return (!PlatformVersion.isAtLeastN() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
    }

    @KeepForSdk
    public static byte[] getPackageCertificateHashBytes(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest zzi;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (zzi = zzi("SHA1")) == null) {
            return null;
        }
        return zzi.digest(packageInfo.signatures[0].toByteArray());
    }

    public static MessageDigest zzi(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
