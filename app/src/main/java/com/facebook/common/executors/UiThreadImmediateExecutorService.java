package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;

public class UiThreadImmediateExecutorService extends HandlerExecutorServiceImpl {
    public static UiThreadImmediateExecutorService sInstance;

    public UiThreadImmediateExecutorService() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static UiThreadImmediateExecutorService getInstance() {
        if (sInstance == null) {
            sInstance = new UiThreadImmediateExecutorService();
        }
        return sInstance;
    }

    @Override // com.facebook.common.executors.HandlerExecutorServiceImpl
    public void execute(Runnable runnable) {
        if (isHandlerThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
