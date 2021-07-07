package com.facebook.react.bridge;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class PromiseImpl implements Promise {
    public static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
    public static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
    public static final String ERROR_MAP_KEY_CODE = "code";
    public static final String ERROR_MAP_KEY_MESSAGE = "message";
    public static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
    public static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    public static final int ERROR_STACK_FRAME_LIMIT = 10;
    public static final String STACK_FRAME_KEY_FILE = "file";
    public static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
    public static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    @Nullable
    public Callback mReject;
    @Nullable
    public Callback mResolve;

    public PromiseImpl(@Nullable Callback callback, @Nullable Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        reject(str, str2, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th) {
        reject(str, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th) {
        reject(str, str2, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th) {
        reject(null, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th, WritableMap writableMap) {
        reject(null, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, @Nonnull WritableMap writableMap) {
        reject(str, null, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th, WritableMap writableMap) {
        reject(str, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, @Nonnull WritableMap writableMap) {
        reject(str, str2, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@Nullable String str, @Nullable String str2, @Nullable Throwable th, @Nullable WritableMap writableMap) {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null) {
            writableNativeMap.putString("code", ERROR_DEFAULT_CODE);
        } else {
            writableNativeMap.putString("code", str);
        }
        if (str2 != null) {
            writableNativeMap.putString("message", str2);
        } else if (th != null) {
            writableNativeMap.putString("message", th.getMessage());
        } else {
            writableNativeMap.putString("message", ERROR_DEFAULT_MESSAGE);
        }
        if (writableMap != null) {
            writableNativeMap.putMap("userInfo", writableMap);
        } else {
            writableNativeMap.putNull("userInfo");
        }
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int i = 0;
            while (i < stackTrace.length && i < 10) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("file", stackTraceElement.getFileName());
                writableNativeMap2.putInt("lineNumber", stackTraceElement.getLineNumber());
                writableNativeMap2.putString(STACK_FRAME_KEY_METHOD_NAME, stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
                i++;
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, writableNativeArray);
        } else {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    @Deprecated
    public void reject(String str) {
        reject(null, str, null, null);
    }
}
