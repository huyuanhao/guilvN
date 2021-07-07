package com.taobao.accs.base;

import androidx.annotation.Keep;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.annotation.type.Callback;

@Callback
@Keep
public interface AccsDataListener {
    void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo);

    void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo);

    void onConnected(TaoBaseService.ConnectInfo connectInfo);

    void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    void onDisconnected(TaoBaseService.ConnectInfo connectInfo);

    void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo);

    void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo);
}
