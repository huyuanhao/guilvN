package com.baidu.idl.license;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.message.MsgConstant;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class LicenseDevice {
    public static final String KEY_DEVICE = "com.baidu.face.deviceid";
    public static final String KEY_FACE = "com.baidu.face";
    public static final String KEY_IMEI = "com.baidu.face.i";

    public static String decrypt(String str, String str2) throws Exception {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("ASCII"), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec("01251500ascfacei".getBytes()));
            try {
                return new String(instance.doFinal(Base64.decode(str, 2)));
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return "";
        }
    }

    public static String encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec("01251500ascfacei".getBytes()));
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 2);
    }

    public static String getAndroidID(Context context) {
        return Settings.System.getString(context.getContentResolver(), "android_id");
    }

    public static String getDeviceCode(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || context.checkCallingOrSelfPermission(MsgConstant.PERMISSION_READ_PHONE_STATE) != 0) {
                return "";
            }
            return telephonyManager.getDeviceId();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getDeviceID(Context context) {
        String androidID = getAndroidID(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return md5((KEY_FACE + androidID).getBytes());
        }
        try {
            String imei = getImei(context);
            if (!TextUtils.isEmpty(imei)) {
                String string = Settings.System.getString(context.getContentResolver(), KEY_DEVICE);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        String decrypt = decrypt(string, imei + 1);
                        if (!TextUtils.isEmpty(decrypt)) {
                            return decrypt;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String md5 = md5((imei + androidID + UUID.randomUUID()).getBytes());
                StringBuilder sb = new StringBuilder();
                sb.append(imei);
                sb.append(1);
                Settings.System.putString(context.getContentResolver(), KEY_DEVICE, encrypt(md5, sb.toString()));
                return md5;
            }
            String macAddr = getMacAddr();
            return md5((macAddr + androidID).getBytes());
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getImei(Context context) {
        String string = Settings.System.getString(context.getContentResolver(), KEY_IMEI);
        if (!TextUtils.isEmpty(string)) {
            try {
                String decrypt = decrypt(string, "01251500ascfacei");
                if (!TextUtils.isEmpty(decrypt) && decrypt.length() == 15) {
                    return decrypt;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String deviceCode = getDeviceCode(context);
        if (!TextUtils.isEmpty(deviceCode)) {
            try {
                Settings.System.putString(context.getContentResolver(), KEY_IMEI, encrypt(deviceCode, "01251500ascfacei"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return deviceCode;
    }

    public static String getMacAddr() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String md5(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
