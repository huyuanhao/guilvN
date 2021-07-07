package com.p118pd.sdk;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

@ReactModule(name = "FileReaderModule")
/* renamed from: com.pd.sdk.FileReaderModule */
public class FileReaderModule extends ReactContextBaseJavaModule {
    public static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
    public static final String NAME = "FileReaderModule";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule() {
        return (BlobModule) getReactApplicationContext().getNativeModule(BlobModule.class);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FileReaderModule";
    }

    @ReactMethod
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(FileAttachment.KEY_SIZE));
        if (resolve == null) {
            promise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("data:");
            if (!readableMap.hasKey("type") || readableMap.getString("type").isEmpty()) {
                sb.append("application/octet-stream");
            } else {
                sb.append(readableMap.getString("type"));
            }
            sb.append(";base64,");
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(FileAttachment.KEY_SIZE));
        if (resolve == null) {
            promise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
