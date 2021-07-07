package com.facebook.react.common;

import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.react.devsupport.StackTraceHelper;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class DebugServerException extends RuntimeException {
    public static final String GENERIC_ERROR_MESSAGE = "\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:8081 tcp:8081' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:8081\n\n";

    public DebugServerException(String str, String str2, int i, int i2) {
        super(str + "\n  at " + str2 + Constants.COLON_SEPARATOR + i + Constants.COLON_SEPARATOR + i2);
    }

    public static DebugServerException makeGeneric(String str, Throwable th) {
        return makeGeneric(str, "", th);
    }

    @Nullable
    public static DebugServerException parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new DebugServerException(jSONObject.getString("description"), shortenFileName(jSONObject.getString("filename")), jSONObject.getInt("lineNumber"), jSONObject.getInt(StackTraceHelper.COLUMN_KEY));
        } catch (JSONException e) {
            FLog.m914w(ReactConstants.TAG, "Could not parse DebugServerException from: " + str, e);
            return null;
        }
    }

    public static String shortenFileName(String str) {
        String[] split = str.split(C8932ooOOO0o.OooO0OO);
        return split[split.length - 1];
    }

    public DebugServerException(String str) {
        super(str);
    }

    public static DebugServerException makeGeneric(String str, String str2, Throwable th) {
        return new DebugServerException(str + GENERIC_ERROR_MESSAGE + str2, th);
    }

    public DebugServerException(String str, Throwable th) {
        super(str, th);
    }
}
