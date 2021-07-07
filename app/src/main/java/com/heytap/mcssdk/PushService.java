package com.heytap.mcssdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.p118pd.sdk.AbstractC8393oOoo0000;
import com.p118pd.sdk.C8379oOoOoOo;
import com.p118pd.sdk.C8399oOoo00o0;
import com.p118pd.sdk.C8400oOoo00oO;
import com.p118pd.sdk.C8402oOoo0O;
import com.p118pd.sdk.C8409oOoo0OOo;
import com.p118pd.sdk.C8449oOooOOoo;

public class PushService extends Service implements AbstractC8393oOoo0000 {
    @Override // com.p118pd.sdk.AbstractC8393oOoo0000
    public void OooO00o(Context context, C8399oOoo00o0 oooo00o0) {
    }

    @Override // com.p118pd.sdk.AbstractC8393oOoo0000
    public void OooO00o(Context context, C8400oOoo00oO oooo00oo) {
        C8409oOoo0OOo.OooO00o("mcssdk-processMessage:" + oooo00oo.OooO0OO());
        C8449oOooOOoo.OooO00o(getApplicationContext(), oooo00oo, C8379oOoOoOo.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC8393oOoo0000
    public void OooO00o(Context context, C8402oOoo0O oooo0o) {
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C8449oOooOOoo.OooO00o(getApplicationContext(), intent, this);
        return super.onStartCommand(intent, i, i2);
    }
}
