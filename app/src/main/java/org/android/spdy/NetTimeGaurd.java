package org.android.spdy;

import android.util.Log;

public class NetTimeGaurd {
    public static final int CREATE = 0;
    public static final int ERROR = 2;
    public static final int PING = 1;
    public static final int STREAM = 3;
    public static final long calltime = 10;
    public static final long total = 50;
    public static long[] totaltime = new long[4];

    public static long begin() {
        if (SpdyAgent.enableTimeGaurd) {
            return System.currentTimeMillis();
        }
        return 0;
    }

    public static void end(String str, int i, long j) {
        if (SpdyAgent.enableTimeGaurd) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            long[] jArr = totaltime;
            jArr[i] = jArr[i] + currentTimeMillis;
            Log.i("NetTimeGaurd", "NetTimeGaurd[end]" + str + " time=" + currentTimeMillis + " total=" + totaltime[i]);
            if (currentTimeMillis > 10) {
                throw new SpdyErrorException("CallBack:" + str + " timeconsuming:" + currentTimeMillis + "  mustlessthan:" + 10L, -1);
            }
        }
    }

    public static void finish(int i) {
        if (SpdyAgent.enableTimeGaurd) {
            Log.i("NetTimeGaurd", "NetTimeGaurd[finish]:time=" + totaltime[i]);
            if (totaltime[i] > 50) {
                throw new SpdyErrorException("CallBack totaltimeconsuming:" + totaltime[i] + "  mustlessthan:" + 50L, -1);
            }
        }
    }

    public static void start(int i) {
        if (SpdyAgent.enableTimeGaurd) {
            totaltime[i] = 0;
        }
    }
}
