package com.taobao.accs;

import androidx.annotation.Keep;
import com.taobao.aranger.annotation.type.Callback;

@Callback
@Keep
public interface IAgooAppReceiver extends IAppReceiverV1 {
    String getAppkey();
}
