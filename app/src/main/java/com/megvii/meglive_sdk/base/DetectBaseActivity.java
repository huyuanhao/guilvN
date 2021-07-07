package com.megvii.meglive_sdk.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import com.megvii.meglive_sdk.base.DetectBasePresenter;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p106f.C1567i;
import s.h.e.l.l.C;

public abstract class DetectBaseActivity<P extends DetectBasePresenter> extends Activity implements BaseView {
    public AlertDialog alertDialog;
    public String language;
    public C1567i mDialogUtil;
    public C1525e mManagerImpl;
    public P mPresenter;

    static {
        C.i(16777259);
    }

    private native void setLanguage();

    public abstract P createPresenter();

    @Override // com.megvii.meglive_sdk.base.BaseView
    public native Activity getActivity();

    @Override // com.megvii.meglive_sdk.base.BaseView
    public native Context getContext();

    public abstract int getLayoutResId();

    public native String getMirroFailedMsg(int i);

    public P getPresenter() {
        return this.mPresenter;
    }

    public abstract void initData();

    public abstract void initView();

    public native void onCreate(Bundle bundle);

    public native void onPause();
}
