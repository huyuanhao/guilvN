package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import com.p118pd.sdk.AbstractC7587o0o0O0oO;
import com.p118pd.sdk.C7588o0o0O0oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;

        /* renamed from: OK */
        public static final int f944OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    public static final class OooO0O0 {
        public final Context OooO00o;

        public OooO0O0(Context context) {
            this.OooO00o = context;
        }

        public InstallReferrerClient OooO00o() {
            Context context = this.OooO00o;
            if (context != null) {
                return new InstallReferrerClientImpl(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static OooO0O0 OooO00o(Context context) {
        return new OooO0O0(context);
    }

    public abstract C7588o0o0O0oo OooO00o() throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m14977OooO00o();

    public abstract void OooO00o(AbstractC7587o0o0O0oO o0o0o0oo);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m14978OooO00o();
}
