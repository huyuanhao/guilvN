package com.jinhui365.view.idcard;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.jinhui365.auth.C1402R;
import com.jinhui365.view.BaseNativeActivity;
import com.p118pd.sdk.AbstractC8740oo0oOo;
import com.p118pd.sdk.C7265o0O000oo;
import exocr.engine.ViewEvent;
import exocr.exocrengine.EXIDCardResult;
import exocr.idcard.IDCardManager;
import s.h.e.l.l.C;

public class IDCardScanActivity extends BaseNativeActivity implements ViewEvent, IDCardManager.PhotoCallBack {
    public static Bitmap OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8740oo0oOo f15044OooO00o = null;
    public static Bitmap OooO0O0 = null;
    public static Bitmap OooO0OO = null;
    public static Bitmap OooO0Oo = null;
    public static final String o0OO00O = "检测到身份证正面，请将背面朝上";
    public static final int o0OOO0o = 1;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f15045o0OOO0o = "检测到身份证背面，请将正面朝上";
    public static final int o0Oo0oo = 2;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f15046o0Oo0oo = "请将身份证放在屏幕中央，背面朝上";
    public static final int o0ooOOo = 40002;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f15047o0ooOOo = "IDCardScanActivity";
    public static final int o0ooOoO = 0;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f15048o0ooOoO = "请将身份证放在屏幕中央，正面朝上";

    /* renamed from: OooO00o  reason: collision with other field name */
    public ProgressDialog f15049OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f15050OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CheckBox f15051OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView f15052OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f15053OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CustomView f15054OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXIDCardResult f15055OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Handler f15056OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public View f15057OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ImageView f15058OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f15059OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public View f15060OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f15061OooO0OO = true;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                IDCardManager.OooO00o().OooO0o();
                IDCardScanActivity.this.finish();
            } else if (i == 1) {
                IDCardScanActivity.this.OooO0O0((IDCardScanActivity) false);
            } else if (i == 2) {
                IDCardScanActivity iDCardScanActivity = IDCardScanActivity.this;
                Toast.makeText(iDCardScanActivity, iDCardScanActivity.getString(C1402R.string.scan_error_tip), 0).show();
                IDCardManager.OooO00o().OooO0o();
                AbstractC8740oo0oOo oo0ooo = IDCardScanActivity.f15044OooO00o;
                if (oo0ooo != null) {
                    oo0ooo.fail(-1, IDCardScanActivity.this.getString(C1402R.string.scan_error_tip));
                }
                IDCardScanActivity.this.finish();
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            IDCardScanActivity.this.OooO();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            IDCardManager.OooO00o().OooO0o();
            IDCardScanActivity.this.finish();
        }
    }

    /* renamed from: com.jinhui365.view.idcard.IDCardScanActivity$OooO0Oo  reason: case insensitive filesystem */
    public class C5125OooO0Oo implements CompoundButton.OnCheckedChangeListener {
        public C5125OooO0Oo() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IDCardManager.OooO00o().OooO0o0(z);
        }
    }

    static {
        C.i(50331738);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO();

    public static native void OooO00o(Activity activity, boolean z, AbstractC8740oo0oOo oo0ooo);

    private native void OooO0O0(EXIDCardResult eXIDCardResult);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO0O0(boolean z);

    private native void OooO0o();

    private native void OooO0oO();

    private native void OooO0oo();

    @Override // exocr.engine.ViewEvent
    public native Rect OooO00o(int i);

    @Override // exocr.engine.ViewEvent
    public native void OooO00o();

    @Override // exocr.engine.ViewEvent
    public native void OooO00o(float f);

    @Override // exocr.idcard.IDCardManager.PhotoCallBack
    public native void OooO00o(Bitmap bitmap);

    @Override // exocr.engine.ViewEvent
    public native void OooO00o(Parcelable parcelable);

    @Override // exocr.idcard.IDCardManager.PhotoCallBack
    public native void OooO00o(EXIDCardResult eXIDCardResult);

    @Override // exocr.engine.ViewEvent
    public native void OooO00o(boolean z);

    @Override // exocr.engine.ViewEvent
    public native void OooO0O0();

    @Override // exocr.engine.ViewEvent
    public native void OooO0O0(int i);

    @Override // exocr.engine.ViewEvent
    public native void OooO0OO();

    @Override // exocr.engine.ViewEvent
    public void OooO0Oo() {
        OooO0O0(true);
        this.f15056OooO0O0.sendEmptyMessageDelayed(1, C7265o0O000oo.OooO0o.OooO00o);
    }

    @Override // exocr.engine.ViewEvent
    public native void OooO0o0();

    public native void finish();

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 40002) {
            this.f15059OooO0O0 = false;
            if (i2 == -1) {
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f15049OooO00o = progressDialog;
                progressDialog.setMessage("图片解析中...");
                this.f15049OooO00o.setCancelable(false);
                this.f15049OooO00o.show();
                Uri data = intent.getData();
                ContentResolver contentResolver = getContentResolver();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i3 = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(contentResolver.openInputStream(data), null, options);
                    int min = Math.min(options.outHeight, options.outWidth);
                    if (min > 2000) {
                        i3 = (int) (((float) min) / 1000.0f);
                    }
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = i3;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Bitmap decodeStream = BitmapFactory.decodeStream(contentResolver.openInputStream(data), null, options);
                    if (decodeStream == null) {
                        OooO00o((Bitmap) null);
                    } else {
                        IDCardManager.OooO00o().OooO00o(decodeStream, this);
                    }
                } catch (Exception e) {
                    e.getLocalizedMessage();
                    OooO00o((Bitmap) null);
                }
            } else {
                finish();
            }
        }
    }

    @Override // com.jinhui365.view.BaseNativeActivity
    public native void onCreate(Bundle bundle);

    @Override // com.jinhui365.view.BaseNativeActivity
    public native void onDestroy();
}
