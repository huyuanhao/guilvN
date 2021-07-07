package com.facebook.react.uimanager;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

public class IllegalViewOperationException extends JSApplicationCausedNativeException {
    @Nullable
    public View mView;

    public IllegalViewOperationException(String str) {
        super(str);
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    public IllegalViewOperationException(String str, @Nullable View view, Throwable th) {
        super(str, th);
        this.mView = view;
    }
}
