package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.huawei.hms.api.HuaweiApiClient;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOoo0o0O  reason: case insensitive filesystem */
public final class C8417oOoo0o0O implements AbstractC8431oOooO00o {
    public static final String OooO00o = "020503001";
    public static final String OooO0O0 = "020600001";
    public static final String OooO0OO = "020600200";
    public static final String OooO0Oo = "020601002";
    public static final String OooO0o = "020603306";
    public static final String OooO0o0 = "020601302";
    public static final String OooO0oO = "020603306";

    /* renamed from: com.pd.sdk.oOoo0o0O$OooO00o */
    public static class OooO00o implements AbstractC8430oOooO00O {
        public final /* synthetic */ AbstractC8435oOooO0o OooO00o;

        /* renamed from: com.pd.sdk.oOoo0o0O$OooO00o$OooO00o  reason: collision with other inner class name */
        public class RunnableC4973OooO00o implements Runnable {
            public final /* synthetic */ int o00oO0O;

            public RunnableC4973OooO00o(int i) {
                this.o00oO0O = i;
            }

            public void run() {
                OooO00o.this.OooO00o.onConnect(this.o00oO0O);
            }
        }

        public OooO00o(AbstractC8435oOooO0o ooooo0o) {
            this.OooO00o = ooooo0o;
        }

        @Override // com.p118pd.sdk.AbstractC8430oOooO00O
        public void OooO00o(int i, HuaweiApiClient huaweiApiClient) {
            if (this.OooO00o != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4973OooO00o(i));
            }
        }
    }

    /* renamed from: com.pd.sdk.oOoo0o0O$OooO0O0 */
    public static final class OooO0O0 {
        public static final int OooO = -1007;
        public static final int OooO00o = 0;
        public static final int OooO0O0 = -1000;
        public static final int OooO0OO = -1001;
        public static final int OooO0Oo = -1002;
        public static final int OooO0o = -1004;
        public static final int OooO0o0 = -1003;
        public static final int OooO0oO = -1005;
        public static final int OooO0oo = -1006;
        public static final int OooOO0 = -1008;
        public static final int OooOO0O = -1009;
    }

    /* renamed from: com.pd.sdk.oOoo0o0O$OooO0OO */
    public static final class OooO0OO {
        public static void OooO00o(AbstractC8451oOooOo0 oooooo0) {
            new C8443oOooOO0o().OooO00o(oooooo0);
        }

        public static void OooO00o(String str, AbstractC8445oOooOOO0 ooooooo0) {
            new C8426oOooO().OooO00o(str, ooooooo0);
        }

        public static void OooO00o(AbstractC8448oOooOOo ooooooo) {
            new C8442oOooOO0O().OooO00o(ooooooo);
        }

        public static void OooO00o(boolean z, AbstractC8447oOooOOOo oooooooo) {
            new C8440oOooOO0().OooO00o(z, oooooooo);
        }

        public static void OooO00o(boolean z, AbstractC8444oOooOOO ooooooo) {
            new C8441oOooOO00().OooO00o(z, ooooooo);
        }

        public static void OooO00o(AbstractC8450oOooOo oooooo) {
            new C8439oOooOO().OooO00o(oooooo);
        }
    }

    public static boolean OooO00o(Context context) {
        long parseLong = Long.parseLong("020603306") / 1000;
        if (20603 == parseLong) {
            return true;
        }
        String str = "error: HMSAgent major version code (" + parseLong + ") does not match HMSSDK major version code (" + 20603L + C3848l.f10402t;
        C8425oOoo0ooo.OooO0O0(str);
        Toast.makeText(context, str, 1).show();
        return false;
    }

    public static boolean OooO00o(Activity activity) {
        return OooO00o((Application) null, activity);
    }

    public static boolean OooO00o(Application application) {
        return OooO00o(application, (Activity) null);
    }

    public static boolean OooO00o(Application application, Activity activity) {
        if (application == null && activity == null) {
            C8425oOoo0ooo.OooO0O0("the param of method HMSAgent.init can not be null !!!");
            return false;
        }
        if (application == null) {
            application = activity.getApplication();
        }
        if (application == null) {
            C8425oOoo0ooo.OooO0O0("the param of method HMSAgent.init app can not be null !!!");
            return false;
        }
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (!OooO00o((Context) application)) {
            return false;
        }
        C8425oOoo0ooo.OooO0OO("init HMSAgent 020603306 with hmssdkver 20603306");
        C8418oOoo0o0o.OooO00o.OooO00o(application, activity);
        C8413oOoo0o.OooO00o.OooO00o(application);
        return true;
    }

    public static void OooO00o() {
        C8425oOoo0ooo.OooO0OO("destroy HMSAgent");
        C8418oOoo0o0o.OooO00o.OooO0OO();
        C8413oOoo0o.OooO00o.m20080OooO0O0();
    }

    public static void OooO00o(Activity activity, AbstractC8435oOooO0o ooooo0o) {
        C8425oOoo0ooo.OooO0OO("start connect");
        C8413oOoo0o.OooO00o.OooO00o((AbstractC8430oOooO00O) new OooO00o(ooooo0o), true);
    }

    public static void OooO00o(Activity activity, AbstractC8436oOooO0o0 ooooo0o0) {
        new C8423oOoo0oo0().OooO00o(activity, ooooo0o0);
    }
}
