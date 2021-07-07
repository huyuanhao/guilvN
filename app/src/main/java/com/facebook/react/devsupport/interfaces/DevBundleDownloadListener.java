package com.facebook.react.devsupport.interfaces;

import com.facebook.react.bridge.NativeDeltaClient;
import javax.annotation.Nullable;

public interface DevBundleDownloadListener {
    void onFailure(Exception exc);

    void onProgress(@Nullable String str, @Nullable Integer num, @Nullable Integer num2);

    void onSuccess(@Nullable NativeDeltaClient nativeDeltaClient);
}
