package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.k */
public class C3549k {

    /* renamed from: a */
    public static final String f9143a = "um_pri";

    /* renamed from: b */
    public static final String f9144b = "um_common_strength";

    /* renamed from: c */
    public static final String f9145c = "um_common_battery";

    /* renamed from: a */
    public static String m9208a(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || !UMUtils.checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getSimSerialNumber();
    }

    /* renamed from: b */
    public static String m9210b(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 23 || !UMUtils.checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            Class<?> cls = telephonyManager.getClass();
            if (((Integer) cls.getMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue() != 2) {
                return null;
            }
            return (String) cls.getMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static JSONObject m9212c(Context context) {
        TelephonyManager telephonyManager;
        JSONObject jSONObject;
        if (context == null) {
            return null;
        }
        if ((!UMUtils.checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION") && !UMUtils.checkPermission(context, "android.permission.ACCESS_FINE_LOCATION")) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        CellLocation cellLocation = telephonyManager.getCellLocation();
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 1 && (cellLocation instanceof GsmCellLocation)) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            int cid = gsmCellLocation.getCid();
            if (cid <= 0 || cid == 65535) {
                return null;
            }
            int lac = gsmCellLocation.getLac();
            jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", cid);
                jSONObject.put("lacid", lac);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
        } else if (phoneType != 2 || !(cellLocation instanceof CdmaCellLocation)) {
            return null;
        } else {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            int baseStationId = cdmaCellLocation.getBaseStationId();
            int networkId = cdmaCellLocation.getNetworkId();
            jSONObject = new JSONObject();
            jSONObject.put("cid", baseStationId);
            jSONObject.put("lacid", networkId);
            jSONObject.put("ts", System.currentTimeMillis());
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static String m9213d(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9143a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f9144b, null);
    }

    /* renamed from: e */
    public static String m9214e(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9143a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f9145c, null);
    }

    /* renamed from: f */
    public static JSONArray m9215f(Context context) {
        SensorManager sensorManager;
        JSONArray jSONArray = new JSONArray();
        if (context == null || (sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z)) == null) {
            return jSONArray;
        }
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            if (sensor != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("a_type", sensor.getType());
                    jSONObject.put("a_ven", sensor.getVendor());
                    if (Build.VERSION.SDK_INT >= 24) {
                        jSONObject.put("a_id", sensor.getId());
                    }
                    jSONObject.put("a_na", sensor.getName());
                    jSONObject.put("a_ver", sensor.getVersion());
                    jSONObject.put("a_mar", (double) sensor.getMaximumRange());
                    jSONObject.put("a_ver", sensor.getVersion());
                    jSONObject.put("a_res", (double) sensor.getResolution());
                    jSONObject.put("a_po", (double) sensor.getPower());
                    if (Build.VERSION.SDK_INT >= 9) {
                        jSONObject.put("a_mid", sensor.getMinDelay());
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        jSONObject.put("a_mad", sensor.getMaxDelay());
                    }
                    jSONObject.put("ts", System.currentTimeMillis());
                } catch (Exception unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m9209a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context != null && !TextUtils.isEmpty(str) && (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9143a, 0)) != null) {
            sharedPreferences.edit().putString(f9144b, str).commit();
        }
    }

    /* renamed from: b */
    public static void m9211b(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context != null && !TextUtils.isEmpty(str) && (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9143a, 0)) != null) {
            sharedPreferences.edit().putString(f9145c, str).commit();
        }
    }
}
