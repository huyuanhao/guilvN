package com.jinhui365.faceid;

import android.app.Activity;
import android.os.Bundle;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.p025ui.FaceDetectActivity;
import com.p118pd.sdk.AbstractC8670oo0OoOO0;
import java.util.HashMap;
import s.h.e.l.l.C;

public class FaceDetectExpActivity extends FaceDetectActivity {
    public static AbstractC8670oo0OoOO0 OooO00o = null;
    public static final int o00oO0O = -100;
    public static final String o0ooOOo = "baidu";

    static {
        C.i(50331732);
    }

    public static native void OooO00o(Activity activity, AbstractC8670oo0OoOO0 oo0oooo0);

    @Override // com.baidu.idl.face.platform.p025ui.FaceDetectActivity
    public native void finish();

    @Override // com.baidu.idl.face.platform.p025ui.FaceDetectActivity
    public native void onCreate(Bundle bundle);

    @Override // com.baidu.idl.face.platform.IDetectStrategyCallback, com.baidu.idl.face.platform.p025ui.FaceDetectActivity
    public void onDetectCompletion(FaceStatusEnum faceStatusEnum, String str, HashMap<String, String> hashMap) {
        super.onDetectCompletion(faceStatusEnum, str, hashMap);
        if (faceStatusEnum == FaceStatusEnum.OK) {
            if (!hashMap.containsKey("bestImage0") || hashMap.get("bestImage0") == null) {
                OooO00o.onFail("活体图片未获取到", -100);
            } else {
                OooO00o.success("", hashMap.get("bestImage0"));
            }
            finish();
        } else if (faceStatusEnum.name().substring(0, 5).equals("Error")) {
            OooO00o.onFail(faceStatusEnum.name(), -100);
            finish();
        }
    }
}
