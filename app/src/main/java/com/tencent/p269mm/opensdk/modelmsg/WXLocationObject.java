package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXLocationObject */
public class WXLocationObject implements WXMediaMessage.IMediaObject {
    public static final String TAG = "MicroMsg.SDK.WXLocationObject";
    public double lat;
    public double lng;

    public WXLocationObject() {
        this(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
    }

    public WXLocationObject(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putDouble("_wxlocationobject_lat", this.lat);
        bundle.putDouble("_wxlocationobject_lng", this.lng);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 30;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.lat = bundle.getDouble("_wxlocationobject_lat");
        this.lng = bundle.getDouble("_wxlocationobject_lng");
    }
}
