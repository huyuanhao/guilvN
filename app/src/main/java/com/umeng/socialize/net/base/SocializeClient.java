package com.umeng.socialize.net.base;

import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.utils.UClient;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SLog;

public class SocializeClient extends UClient {
    public SocializeReseponse execute(URequest uRequest) {
        if (SocializeConstants.DEBUG_MODE) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                SLog.error(e);
            }
        }
        return (SocializeReseponse) super.execute(uRequest, uRequest.mResponseClz);
    }
}
