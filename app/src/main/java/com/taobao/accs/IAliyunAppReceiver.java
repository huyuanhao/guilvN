package com.taobao.accs;

import com.taobao.accs.ErrorCode;

public interface IAliyunAppReceiver {
    void onBindApp(ErrorCode.INIT_ERROR init_error);
}
