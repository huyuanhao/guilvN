package com.jinhui365.view.bankcard;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.jinhui365.view.BaseNativeActivity;
import com.p118pd.sdk.AbstractC8744oo0oOo0o;
import exocr.bankcard.DataCallBack;
import exocr.bankcard.EXBankCardInfo;
import s.h.e.l.l.C;

public final class BankScanActivity extends BaseNativeActivity implements DataCallBack {
    public static AbstractC8744oo0oOo0o OooO00o;

    static {
        C.i(50331737);
    }

    public static native void OooO00o(Activity activity, AbstractC8744oo0oOo0o oo0ooo0o);

    @Override // exocr.bankcard.DataCallBack
    public native void OooO00o();

    @Override // exocr.bankcard.DataCallBack
    public native void OooO00o(int i);

    @Override // exocr.bankcard.DataCallBack
    public native void OooO00o(int i, Bitmap bitmap);

    @Override // exocr.bankcard.DataCallBack
    public native void OooO00o(int i, EXBankCardInfo eXBankCardInfo);

    @Override // com.jinhui365.view.BaseNativeActivity
    public native void onCreate(Bundle bundle);
}
