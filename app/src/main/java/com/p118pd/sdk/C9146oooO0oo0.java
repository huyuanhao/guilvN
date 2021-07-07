package com.p118pd.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oooO0oo0  reason: case insensitive filesystem */
public class C9146oooO0oo0 {
    public static Handler OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile HandlerThread f22620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Object, Object[]> f22621OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f22622OooO00o = (!C9146oooO0oo0.class.desiredAssertionStatus());
    public static Handler OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static volatile HandlerThread f22623OooO0O0;
    public static Handler OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static volatile HandlerThread f22624OooO0OO;
    public static Handler OooO0Oo;

    public static Handler OooO00o(int i) {
        if (i == 0) {
            if (f22620OooO00o == null) {
                OooO00o();
            }
            return OooO00o;
        } else if (i == 1) {
            if (f22623OooO0O0 == null) {
                OooO0O0();
            }
            return OooO0O0;
        } else if (i == 2) {
            if (OooO0OO == null) {
                OooO0OO = new Handler(Looper.getMainLooper());
            }
            return OooO0OO;
        } else if (i == 3) {
            if (OooO0Oo == null) {
                OooO0OO();
            }
            return OooO0Oo;
        } else {
            throw new RuntimeException("unknown thread type: " + i);
        }
    }

    public static synchronized void OooO0O0() {
        synchronized (C9146oooO0oo0.class) {
            if (f22623OooO0O0 == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                f22623OooO0O0 = handlerThread;
                handlerThread.start();
                OooO0O0 = new Handler(f22623OooO0O0.getLooper());
            }
        }
    }

    public static synchronized void OooO0OO() {
        synchronized (C9146oooO0oo0.class) {
            if (f22624OooO0OO == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                f22624OooO0OO = handlerThread;
                handlerThread.start();
                OooO0Oo = new Handler(f22624OooO0OO.getLooper());
            }
        }
    }

    public static boolean OooO00o(int i, Runnable runnable, long j) {
        Handler OooO00o2;
        if (runnable == null || (OooO00o2 = OooO00o(i)) == null) {
            return false;
        }
        RunnableC9106ooo0oooo ooo0oooo = new RunnableC9106ooo0oooo(10, new Object[]{runnable});
        synchronized (f22621OooO00o) {
            f22621OooO00o.put(runnable, new Object[]{ooo0oooo, Integer.valueOf(i)});
        }
        return OooO00o2.postDelayed(ooo0oooo, j);
    }

    public static void OooO00o(int i, Object[] objArr) {
        if (i != 10) {
            if (!f22622OooO00o) {
                throw new AssertionError();
            }
        } else if (f22622OooO00o || objArr != null) {
            Runnable runnable = (Runnable) objArr[0];
            synchronized (f22621OooO00o) {
                if (f22621OooO00o.get(runnable) != null) {
                    f22621OooO00o.remove(runnable);
                }
            }
            runnable.run();
        } else {
            throw new AssertionError();
        }
    }

    public static boolean OooO00o(int i, Runnable runnable) {
        return OooO00o(i, runnable, 0);
    }

    public static void OooO00o(Runnable runnable) {
        Object[] objArr;
        if (runnable != null) {
            synchronized (f22621OooO00o) {
                objArr = f22621OooO00o.get(runnable);
            }
            if (objArr != null) {
                int intValue = ((Integer) objArr[1]).intValue();
                Handler handler = null;
                if (intValue == 0) {
                    handler = OooO00o;
                } else if (intValue == 1) {
                    handler = OooO0O0;
                } else if (intValue == 2) {
                    handler = OooO0OO;
                }
                if (handler != null) {
                    handler.removeCallbacks((Runnable) objArr[0]);
                }
                synchronized (f22621OooO00o) {
                    if (f22621OooO00o.get(runnable) != null) {
                        f22621OooO00o.remove(runnable);
                    }
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20891OooO00o(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        synchronized (f22621OooO00o) {
            objArr = f22621OooO00o.get(runnable);
        }
        if (objArr != null) {
            return true;
        }
        return false;
    }

    public static synchronized void OooO00o() {
        synchronized (C9146oooO0oo0.class) {
            if (f22620OooO00o == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f22620OooO00o = handlerThread;
                handlerThread.start();
                OooO00o = new Handler(f22620OooO00o.getLooper());
            }
        }
    }
}
