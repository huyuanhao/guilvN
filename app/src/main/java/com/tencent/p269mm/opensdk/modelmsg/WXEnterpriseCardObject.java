package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject */
public class WXEnterpriseCardObject implements WXMediaMessage.IMediaObject {
    public static final int LENGTH_LIMIT = 10240;
    public static final String TAG = "MicroMsg.SDK.WXEnterpriseCardObject";
    public String cardInfo;
    public int msgType;

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str = this.cardInfo;
        if (str != null && str.length() != 0) {
            return true;
        }
        Log.m8651e(TAG, "checkArgs fail, cardInfo is invalid");
        return false;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putInt("_wxenterprisecard_msgtype", this.msgType);
        bundle.putString("_wxenterprisecard_cardinfo", this.cardInfo);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 45;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.msgType = bundle.getInt("_wxenterprisecard_msgtype");
        this.cardInfo = bundle.getString("_wxenterprisecard_cardinfo");
    }
}
