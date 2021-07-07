package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;
import okhttp3.internal.p288ws.RealWebSocket;

public class BitmapCounterProvider {

    /* renamed from: KB */
    public static final long f966KB = 1024;
    public static final int MAX_BITMAP_TOTAL_SIZE = getMaxSizeHardCap();

    /* renamed from: MB */
    public static final long f967MB = 1048576;
    public static final Class<?> TAG = BitmapCounterProvider.class;
    public static volatile BitmapCounter sBitmapCounter;
    public static int sMaxBitmapCount = 384;

    @ThreadSafe
    public static BitmapCounter get() {
        if (sBitmapCounter == null) {
            synchronized (BitmapCounterProvider.class) {
                if (sBitmapCounter == null) {
                    sBitmapCounter = new BitmapCounter(sMaxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                }
            }
        }
        return sBitmapCounter;
    }

    public static int getMaxSizeHardCap() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > RealWebSocket.MAX_QUEUE_SIZE) {
            return (min / 4) * 3;
        }
        return min / 2;
    }

    public static void initialize(BitmapCounterConfig bitmapCounterConfig) {
        if (sBitmapCounter == null) {
            sMaxBitmapCount = bitmapCounterConfig.getMaxBitmapCount();
            return;
        }
        throw new IllegalStateException("BitmapCounter has already been created! `BitmapCounterProvider.initialize(...)` should only be called before `BitmapCounterProvider.get()` or not at all!");
    }
}
