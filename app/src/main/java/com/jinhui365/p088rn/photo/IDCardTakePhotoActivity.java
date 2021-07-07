package com.jinhui365.p088rn.photo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.jinhui365.p088rn.BaseNativeActivity;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.p118pd.sdk.C8646oo0OOoO;
import com.p118pd.sdk.C8678oo0Ooo00;
import com.p118pd.sdk.C8736oo0oOOOo;
import com.p118pd.sdk.SurfaceHolder$CallbackC8679oo0Ooo0O;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import s.h.e.l.l.C;

/* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity */
public class IDCardTakePhotoActivity extends BaseNativeActivity implements Camera.PictureCallback {
    public static String o0OOO0o = "idCard_hasKg_key";
    public static final String o0ooOOo = "outputPath";
    public static String o0ooOoO = "idCard_facing_key";
    public DisplayMetrics OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Button f14965OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FrameLayout f14966OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView f14967OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f14968OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8678oo0Ooo00 f14969OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SurfaceHolder$CallbackC8679oo0Ooo0O f14970OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f14971OooO00o = new ArrayList();
    public Handler OooO0O0 = new OooO0o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ImageView f14972OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f14973OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14974OooO0O0 = false;
    public ImageView OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f14975OooO0OO = false;
    public boolean OooO0Oo = true;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f14976o0ooOoO;

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            IDCardTakePhotoActivity.this.OooO0Oo();
        }
    }

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            IDCardTakePhotoActivity.this.OooO0OO();
        }
    }

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO0OO */
    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            IDCardTakePhotoActivity.this.OooO00o();
        }
    }

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO0Oo  reason: case insensitive filesystem */
    public class View$OnClickListenerC5117OooO0Oo implements View.OnClickListener {
        public View$OnClickListenerC5117OooO0Oo() {
        }

        public void onClick(View view) {
            IDCardTakePhotoActivity.this.OooO0O0();
        }
    }

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO0o */
    public class OooO0o extends Handler {
        public OooO0o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            IDCardTakePhotoActivity.this.OooO0o0();
        }
    }

    /* renamed from: com.jinhui365.rn.photo.IDCardTakePhotoActivity$OooO0o0  reason: case insensitive filesystem */
    public class C5118OooO0o0 extends TimerTask {
        public C5118OooO0o0() {
        }

        public void run() {
            try {
                IDCardTakePhotoActivity.this.f14970OooO00o.OooO00o(IDCardTakePhotoActivity.this.OooO00o.widthPixels, IDCardTakePhotoActivity.this.OooO00o.heightPixels);
            } catch (Exception unused) {
                IDCardTakePhotoActivity.this.OooO0O0.sendEmptyMessage(0);
            }
        }
    }

    static {
        C.i(50331734);
    }

    private native void OooO0o();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO0o0();

    private native void OooO0oO();

    @TargetApi(11)
    private void OooO0oo() {
        this.f14973OooO0O0.setRotation(-90.0f);
        this.f14968OooO00o.setRotation(-90.0f);
        this.f14972OooO0O0.setVisibility(4);
        this.f14969OooO00o.f21831OooO0O0 = true;
    }

    public native Bitmap OooO00o(byte[] bArr);

    public native void OooO00o();

    public native void OooO0O0();

    public native void OooO0OO();

    public native void OooO0Oo();

    @Override // androidx.core.app.ComponentActivity, com.jinhui365.p088rn.BaseNativeActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.jinhui365.p088rn.BaseNativeActivity, androidx.fragment.app.FragmentActivity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onDestroy() {
        super.onDestroy();
        setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onPause();

    public void onPictureTaken(byte[] bArr, Camera camera) {
        OooO00o(false);
        this.f14970OooO00o.OooO0o0();
        Bitmap OooO00o2 = OooO00o(bArr);
        File file = new File(DiskFileUtil.OooO0o(this, C8646oo0OOoO.OooO00o).getAbsolutePath() + "/image", System.currentTimeMillis() + ".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        this.f14971OooO00o.add(C8736oo0oOOOo.OooO00o(OooO00o2, 1024, file.getPath()));
        this.f14967OooO00o.setImageBitmap(OooO00o2);
    }

    @Override // com.jinhui365.p088rn.BaseNativeActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        this.f14969OooO00o = new C8678oo0Ooo00(this);
        this.f14969OooO00o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f14966OooO00o.addView(this.f14969OooO00o);
        if (this.f14976o0ooOoO == 1) {
            this.f14970OooO00o.OooO0OO();
        }
        if (!this.OooO0Oo) {
            this.f14969OooO00o.f21831OooO0O0 = true;
        }
        OooO00o(true);
        new Timer().schedule(new C5118OooO0o0(), 300);
    }

    @Override // com.jinhui365.p088rn.BaseNativeActivity, androidx.fragment.app.FragmentActivity
    public native void onStop();

    @TargetApi(11)
    private void OooO00o(boolean z) {
        this.f14974OooO0O0 = z;
        if (z) {
            this.f14965OooO00o.setVisibility(0);
            this.f14968OooO00o.setVisibility(4);
            this.f14966OooO00o.setVisibility(0);
            this.f14967OooO00o.setVisibility(4);
            if (this.f14975OooO0OO) {
                this.OooO0OO.setVisibility(0);
            }
            if (this.f14976o0ooOoO == 1) {
                OooO0oo();
            }
            this.f14973OooO0O0.setText("取消");
            return;
        }
        this.f14966OooO00o.setVisibility(4);
        this.f14968OooO00o.setVisibility(0);
        this.f14973OooO0O0.setText("重拍");
        this.f14965OooO00o.setVisibility(4);
        this.f14967OooO00o.setVisibility(0);
        this.OooO0OO.setVisibility(4);
        if (this.f14970OooO00o.OooO0O0) {
            this.f14967OooO00o.setRotation(180.0f);
        } else {
            this.f14967OooO00o.setRotation(0.0f);
        }
    }

    public int OooO00o(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
