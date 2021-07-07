package org.android.agoo.huawei;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.support.api.push.PushReceiver;

public class HuaWeiReceiver extends PushReceiver {
    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onEvent(Context context, PushReceiver.Event event, Bundle bundle) {
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public boolean onPushMsg(Context context, byte[] bArr, Bundle bundle) {
        return true;
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onPushState(Context context, boolean z) {
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onToken(Context context, String str, Bundle bundle) {
    }
}
