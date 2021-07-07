package com.p118pd.sdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oooO000o  reason: case insensitive filesystem */
public final class C9113oooO000o {
    public static int OooO00o = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC9118oooO00o f22519OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22520OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile List<ValueCallback<Bundle>> f22521OooO00o;
    public static volatile List<ValueCallback<Bundle>> OooO0O0;
    public static volatile List<ValueCallback<Bundle>> OooO0OO;
    public static volatile List<ValueCallback<Bundle>> OooO0Oo;

    public static void OooO00o(AbstractC9118oooO00o oooo00o) {
        f22519OooO00o = oooo00o;
    }

    public static boolean OooO0O0(ValueCallback<Bundle> valueCallback) {
        if (OooO0O0 == null) {
            synchronized (f22520OooO00o) {
                if (OooO0O0 == null) {
                    OooO0O0 = new ArrayList();
                }
            }
        }
        synchronized (OooO0O0) {
            if (OooO0O0.size() >= OooO00o) {
                return false;
            }
            OooO0O0.add(valueCallback);
            return true;
        }
    }

    public static boolean OooO0OO(ValueCallback<Bundle> valueCallback) {
        if (OooO0OO == null) {
            synchronized (f22520OooO00o) {
                if (OooO0OO == null) {
                    OooO0OO = new ArrayList();
                }
            }
        }
        synchronized (OooO0OO) {
            if (OooO0OO.size() >= OooO00o) {
                return false;
            }
            OooO0OO.add(valueCallback);
            return true;
        }
    }

    public static boolean OooO0Oo(ValueCallback<Bundle> valueCallback) {
        if (OooO0Oo == null) {
            synchronized (f22520OooO00o) {
                if (OooO0Oo == null) {
                    OooO0Oo = new ArrayList();
                }
            }
        }
        synchronized (OooO0Oo) {
            if (OooO0Oo.size() >= OooO00o) {
                return false;
            }
            OooO0Oo.add(valueCallback);
            return true;
        }
    }

    public static void OooO00o(String str, String str2, String str3) {
        if (C9111oooO0000.m20791OooO00o(str)) {
            C9090ooOooo0O.OooO00o("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = C9278ooooo0.OooO().equals(str2);
        if (f22519OooO00o != null) {
            File file = new File(str);
            if (equals) {
                try {
                    f22519OooO00o.onLogGenerated(file, str3);
                } catch (Throwable th) {
                    C9111oooO0000.OooO00o(th);
                }
            } else {
                f22519OooO00o.onClientProcessLogGenerated(str2, file, str3);
            }
        }
        List<ValueCallback<Bundle>> list = f22521OooO00o;
        if (!equals) {
            list = OooO0O0;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!equals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C9111oooO0000.OooO00o(th2);
                    }
                }
            }
        }
    }

    public static File OooO00o(File file) {
        AbstractC9118oooO00o oooo00o = f22519OooO00o;
        if (oooo00o != null) {
            try {
                return oooo00o.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
        return file;
    }

    public static void OooO00o(boolean z) {
        AbstractC9118oooO00o oooo00o = f22519OooO00o;
        if (oooo00o != null) {
            try {
                oooo00o.onCrashRestarting(z);
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
        if (OooO0OO != null) {
            synchronized (OooO0OO) {
                for (ValueCallback<Bundle> valueCallback : OooO0OO) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C9111oooO0000.OooO00o(th2);
                    }
                }
            }
        }
    }

    public static void OooO00o(String str, int i, int i2) {
        AbstractC9118oooO00o oooo00o = f22519OooO00o;
        if (oooo00o != null) {
            oooo00o.onAddCrashStats(str, i, i2);
        }
        if (OooO0Oo != null) {
            synchronized (OooO0Oo) {
                for (ValueCallback<Bundle> valueCallback : OooO0Oo) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt("key", i);
                        bundle.putInt(C8412oOoo0OoO.OooO0O0, i2);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        C9111oooO0000.OooO00o(th);
                    }
                }
            }
        }
    }

    public static String OooO00o(String str, boolean z) {
        AbstractC9118oooO00o oooo00o = f22519OooO00o;
        return oooo00o != null ? oooo00o.onGetCallbackInfo(str, z) : "";
    }

    public static boolean OooO00o(ValueCallback<Bundle> valueCallback) {
        if (f22521OooO00o == null) {
            synchronized (f22520OooO00o) {
                if (f22521OooO00o == null) {
                    f22521OooO00o = new ArrayList();
                }
            }
        }
        synchronized (f22521OooO00o) {
            if (f22521OooO00o.size() >= OooO00o) {
                return false;
            }
            f22521OooO00o.add(valueCallback);
            return true;
        }
    }
}
