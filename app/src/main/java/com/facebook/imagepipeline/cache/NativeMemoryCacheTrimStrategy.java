package com.facebook.imagepipeline.cache;

import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class NativeMemoryCacheTrimStrategy implements CountingMemoryCache.CacheTrimStrategy {
    public static final String TAG = "NativeMemoryCacheTrimStrategy";

    /* renamed from: com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy$1 */
    public static /* synthetic */ class C05141 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$memory$MemoryTrimType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.common.memory.MemoryTrimType[] r0 = com.facebook.common.memory.MemoryTrimType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy.C05141.$SwitchMap$com$facebook$common$memory$MemoryTrimType = r0
                com.facebook.common.memory.MemoryTrimType r1 = com.facebook.common.memory.MemoryTrimType.OnCloseToDalvikHeapLimit     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy.C05141.$SwitchMap$com$facebook$common$memory$MemoryTrimType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.common.memory.MemoryTrimType r1 = com.facebook.common.memory.MemoryTrimType.OnAppBackgrounded     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy.C05141.$SwitchMap$com$facebook$common$memory$MemoryTrimType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.common.memory.MemoryTrimType r1 = com.facebook.common.memory.MemoryTrimType.OnSystemLowMemoryWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy.C05141.$SwitchMap$com$facebook$common$memory$MemoryTrimType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.common.memory.MemoryTrimType r1 = com.facebook.common.memory.MemoryTrimType.OnSystemLowMemoryWhileAppInBackground     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy.C05141.<clinit>():void");
        }
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy
    public double getTrimRatio(MemoryTrimType memoryTrimType) {
        int i = C05141.$SwitchMap$com$facebook$common$memory$MemoryTrimType[memoryTrimType.ordinal()];
        if (i == 1) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        if (i == 2 || i == 3 || i == 4) {
            return 1.0d;
        }
        FLog.wtf(TAG, "unknown trim type: %s", memoryTrimType);
        return AbstractC8352oOoOOoO0.OooO0O0;
    }
}
