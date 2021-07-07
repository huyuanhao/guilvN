package com.baidu.idl.face.platform.common;

import android.text.TextUtils;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.network.LogRequest;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogHelper {
    public static final String TAG = "LogHelper";
    public static ArrayList<Integer> logLivenessLiveness = new ArrayList<>();
    public static HashMap<String, Object> logMap = new HashMap<>();
    public static HashMap<String, Integer> logTipsMap = new HashMap<>();

    public static void addLivenessLog(int i) {
        ArrayList<Integer> arrayList = logLivenessLiveness;
        if (arrayList != null && !arrayList.contains(Integer.valueOf(i))) {
            logLivenessLiveness.add(Integer.valueOf(i));
        }
    }

    public static void addLog(String str, Object obj) {
        HashMap<String, Object> hashMap = logMap;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    public static void addLogWithKey(String str, Object obj) {
        HashMap<String, Object> hashMap = logMap;
        if (hashMap != null && !hashMap.containsKey(str)) {
            logMap.put(str, obj);
        }
    }

    public static void addTipsLogWithKey(String str) {
        HashMap<String, Integer> hashMap = logTipsMap;
        if (hashMap == null || hashMap.containsKey(str)) {
            HashMap<String, Integer> hashMap2 = logTipsMap;
            if (hashMap2 != null && hashMap2.containsKey(str)) {
                logTipsMap.put(str, Integer.valueOf(logTipsMap.get(str).intValue() + 1));
                return;
            }
            return;
        }
        logTipsMap.put(str, 1);
    }

    public static void clear() {
        logMap = new HashMap<>();
        logLivenessLiveness = new ArrayList<>();
        logTipsMap = new HashMap<>();
    }

    public static String getLog() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("{");
            int i = 0;
            for (Map.Entry<String, Object> entry : logMap.entrySet()) {
                if (i != logMap.size() - 1) {
                    if (entry.getValue() instanceof String) {
                        sb.append(entry.getKey() + ":'" + entry.getValue() + "'");
                    } else {
                        sb.append(entry.getKey() + Constants.COLON_SEPARATOR + entry.getValue());
                    }
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                } else if (entry.getValue() instanceof String) {
                    sb.append(entry.getKey() + ":'" + entry.getValue() + "'");
                } else {
                    sb.append(entry.getKey() + Constants.COLON_SEPARATOR + entry.getValue());
                }
                i++;
            }
            if (logLivenessLiveness != null && logLivenessLiveness.size() > 0) {
                sb.append(",lv:[");
                for (int i2 = 0; i2 < logLivenessLiveness.size(); i2++) {
                    if (i2 == logLivenessLiveness.size() - 1) {
                        sb.append(logLivenessLiveness.get(i2));
                    } else {
                        sb.append(logLivenessLiveness.get(i2) + Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                sb.append("]");
            }
            if (logTipsMap != null && logTipsMap.size() > 0) {
                sb.append(",msg:{");
                sb.append(getTipsMessage());
                sb.append(C7522o0Ooo0o.OooO0Oo);
            }
            sb.append(C7522o0Ooo0o.OooO0Oo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logMap = new HashMap<>();
        logLivenessLiveness = new ArrayList<>();
        logTipsMap = new HashMap<>();
        return sb.toString();
    }

    public static String getTipsKey(String str) {
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccLeftEye.name())) {
            return ConstantHelper.LOG_TIPS_LEFTEYE_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccRightEye.name())) {
            return ConstantHelper.LOG_TIPS_RIGHTEYE_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccNose.name())) {
            return ConstantHelper.LOG_TIPS_NOSE_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccMouth.name())) {
            return ConstantHelper.LOG_TIPS_MOUTH_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccLeftContour.name())) {
            return ConstantHelper.LOG_TIPS_LEFTFACE_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccRightContour.name())) {
            return ConstantHelper.LOG_TIPS_RIGHTFACE_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_OccChin.name())) {
            return ConstantHelper.LOG_TIPS_CHIN_OCC;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_PoorIllumintion.name())) {
            return ConstantHelper.LOG_TIPS_LIGHTUP;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_ImageBlured.name())) {
            return ConstantHelper.LOG_TIPS_STAYSTILL;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_FaceZoomIn.name())) {
            return ConstantHelper.LOG_TIPS_MOVECLOSE;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_FaceZoomOut.name())) {
            return ConstantHelper.LOG_TIPS_MOVEFURTHER;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_PitchOutOfDownMaxRange.name())) {
            return ConstantHelper.LOG_TIPS_HEADUP;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_PitchOutOfUpMaxRange.name())) {
            return ConstantHelper.LOG_TIPS_HEADDOWN;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_PitchOutOfRightMaxRange.name())) {
            return ConstantHelper.LOG_TIPS_TURNLEFT;
        }
        if (TextUtils.equals(str, FaceStatusEnum.Detect_PitchOutOfLeftMaxRange.name())) {
            return ConstantHelper.LOG_TIPS_TURNRIGHT;
        }
        return (TextUtils.equals(str, FaceStatusEnum.Detect_NoFace.name()) || TextUtils.equals(str, FaceStatusEnum.Detect_FacePointOut.name())) ? ConstantHelper.LOG_TIPS_MOVEFACE : "";
    }

    public static String getTipsMessage() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : logTipsMap.entrySet()) {
            String tipsKey = getTipsKey(entry.getKey());
            if (!TextUtils.isEmpty(tipsKey)) {
                sb.append(tipsKey + Constants.COLON_SEPARATOR + entry.getValue());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void sendLog() {
        LogRequest.sendLogMessage(getLog());
    }
}
