package com.gzlex.hui.guoziwei.travel.wxapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.gzlex.hui.guoziwei.travel.C1084R;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8371oOoOoO;
import com.p118pd.sdk.C8742oo0oOo00;
import com.p118pd.sdk.C9019ooOo0o0o;
import com.p118pd.sdk.O0O00O;
import com.p118pd.sdk.o0OOOOO;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.openapi.IWXAPI;
import com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p269mm.opensdk.openapi.WXAPIFactory;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s.h.e.l.l.C;

public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = -1;
    public static final int o0ooOOo = -2;
    public IWXAPI OooO00o;

    static {
        C.i(50331725);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1084R.layout.activity_pay_result);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, C8742oo0oOo00.m20365OooO00o((Context) this, o0OOOOO.OooO00o(new byte[]{96, 116, 124, 59, 122, 123, 104, 112, 101, 51, 108, 118, 120, O0O00O.OooO0O0, 115, ExifInterface.OooO00o, 116}, "715c35")));
        this.OooO00o = createWXAPI;
        createWXAPI.handleIntent(getIntent(), this);
    }

    public native void onNewIntent(Intent intent);

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
    public native void onReq(BaseReq baseReq);

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        if (baseResp.getType() == 5) {
            finish();
            C8371oOoOoO oooooo = new C8371oOoOoO();
            oooooo.OooO00o = baseResp.errCode;
            C9019ooOo0o0o.OooO00o().OooO00o(oooooo);
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo(o0OOOOO.OooO00o(new byte[]{79, 75, 20, 87, 29, 66, 79, 75, 54, 83, 23, 23, 84, C8027oOO00oo.OooO0O0, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 1, 12, 76, 29, 1, 68, 22, PublicSuffixDatabase.EXCEPTION_MARKER, 87, 87, 1, 11}, "83d6db") + oooooo.OooO00o);
        }
    }
}
