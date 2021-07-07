package com.p118pd.sdk;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.pd.sdk.L丨丨il  reason: invalid class name and case insensitive filesystem */
public final class C5915Lil {
    public static void OooO00o(CountDownLatch countDownLatch, LlIiLii llIiLii) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                llIiLii.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
