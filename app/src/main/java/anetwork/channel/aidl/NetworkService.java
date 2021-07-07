package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.p118pd.sdk.AbstractC7328o0O0o00O;
import com.p118pd.sdk.AbstractC7334o0O0o0o0;
import com.p118pd.sdk.BinderC7329o0O0o00o;
import s.h.e.l.l.C;

public class NetworkService extends Service {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7328o0O0o00O.OooO00o f14717OooO00o = new BinderC7329o0O0o00o(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7334o0O0o0o0.OooO00o f14718OooO00o = null;
    public AbstractC7334o0O0o0o0.OooO00o OooO0O0 = null;

    static {
        C.i(0);
    }

    public native IBinder onBind(Intent intent);

    public native void onDestroy();

    public native int onStartCommand(Intent intent, int i, int i2);
}
