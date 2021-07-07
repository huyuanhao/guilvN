package com.p118pd.sdk;

import android.graphics.Rect;
import com.baidu.idl.face.platform.FaceSDKManager;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.IDetectStrategy;
import com.baidu.idl.face.platform.IDetectStrategyCallback;
import com.jinhui365.util.video.VideoUtil;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0O0o  reason: case insensitive filesystem */
public class C8611oo0O0o extends VideoUtil implements IDetectStrategyCallback {
    public IDetectStrategy OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8615oo0O0o0o f21733OooO00o;

    public C8611oo0O0o() {
    }

    @Override // com.jinhui365.util.video.VideoUtil
    public void OooO00o(byte[] bArr, Rect rect, Rect rect2) {
        IDetectStrategy iDetectStrategy = this.OooO00o;
        if (iDetectStrategy == null) {
            IDetectStrategy detectStrategyModule = FaceSDKManager.getInstance().getDetectStrategyModule();
            this.OooO00o = detectStrategyModule;
            detectStrategyModule.setDetectStrategyConfig(rect, rect2, this);
            return;
        }
        iDetectStrategy.detectStrategy(bArr);
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategyCallback
    public void onDetectCompletion(FaceStatusEnum faceStatusEnum, String str, HashMap<String, String> hashMap) {
        if (FaceStatusEnum.OK == faceStatusEnum) {
            this.f21733OooO00o.OooO00o(true);
        } else {
            this.f21733OooO00o.OooO00o(false);
        }
    }

    public C8611oo0O0o(boolean z) {
        this.OooO0OO = z;
    }

    @Override // com.jinhui365.util.video.VideoUtil, com.jinhui365.util.video.VideoUtil, com.jinhui365.util.video.VideoUtil, com.jinhui365.util.video.VideoUtil
    public AbstractC8615oo0O0o0o OooO00o() {
        return this.f21733OooO00o;
    }

    public void OooO00o(AbstractC8615oo0O0o0o oo0o0o0o) {
        this.f21733OooO00o = oo0o0o0o;
    }
}
