package com.rxhui.rxbus;

import com.p118pd.sdk.C6261iii1I1;
import com.p118pd.sdk.C6342il11;
import com.p118pd.sdk.LL1LL;

public enum EventThread {
    MAIN_THREAD,
    NEW_THREAD,
    IO,
    COMPUTATION,
    TRAMPOLINE,
    IMMEDIATE;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rxhui.rxbus.EventThread[] r0 = com.rxhui.rxbus.EventThread.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.rxhui.rxbus.EventThread.OooO00o.OooO00o = r0
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.MAIN_THREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.rxhui.rxbus.EventThread.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.NEW_THREAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.rxhui.rxbus.EventThread.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.IO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.rxhui.rxbus.EventThread.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.COMPUTATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.rxhui.rxbus.EventThread.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.TRAMPOLINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.rxhui.rxbus.EventThread.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rxhui.rxbus.EventThread r1 = com.rxhui.rxbus.EventThread.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rxhui.rxbus.EventThread.OooO00o.<clinit>():void");
        }
    }

    public static LL1LL getScheduler(EventThread eventThread) {
        switch (OooO00o.OooO00o[eventThread.ordinal()]) {
            case 1:
                return C6342il11.OooO00o();
            case 2:
                return C6261iii1I1.OooO0Oo();
            case 3:
                return C6261iii1I1.OooO0OO();
            case 4:
                return C6261iii1I1.OooO00o();
            case 5:
                return C6261iii1I1.OooO0o0();
            case 6:
                return C6261iii1I1.OooO0O0();
            default:
                return C6342il11.OooO00o();
        }
    }
}
