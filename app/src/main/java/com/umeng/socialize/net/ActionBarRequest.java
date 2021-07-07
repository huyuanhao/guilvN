package com.umeng.socialize.net;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.Config;
import com.umeng.socialize.net.base.SocializeRequest;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SocializeUtils;

public class ActionBarRequest extends SocializeRequest {

    /* renamed from: a */
    public static final String f10789a = "/bar/get/";

    /* renamed from: b */
    public static final int f10790b = 1;

    /* renamed from: c */
    public int f10791c = 0;

    public ActionBarRequest(Context context, boolean z) {
        super(context, "", ActionBarResponse.class, 1, URequest.RequestMethod.GET);
        this.mContext = context;
        this.f10791c = z ? 1 : 0;
        this.mMethod = URequest.RequestMethod.GET;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    public String getPath() {
        return f10789a + SocializeUtils.getAppkey(this.mContext) + C8932ooOOO0o.OooO0OO;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DESCRIPTOR, Config.Descriptor);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_NEW_INSTALL, String.valueOf(this.f10791c));
        if (!TextUtils.isEmpty(Config.EntityName)) {
            addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_NAME, Config.EntityName);
        }
    }
}
