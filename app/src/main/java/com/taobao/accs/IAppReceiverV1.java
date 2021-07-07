package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;

@Callback
public interface IAppReceiverV1 extends IAppReceiver {
    void onBindApp(int i, String str);
}
