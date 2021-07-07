package exocr.bankcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.io.UnsupportedEncodingException;

public class BankManager {
    public static final String OooO0OO = "BankManager";
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public static final int OooO0oO = 3;
    public static final int OooO0oo = 4;
    public boolean OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f23583OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f23584OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f23585OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23586OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23587OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f23588OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public supportOrientations f23589OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataCallBack f23590OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXBankCardInfo f23591OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewEvent f23592OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23593OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23594OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Bitmap f23595OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f23596OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23597OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f23598OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Bitmap f23599OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23600OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Bitmap f23601OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23602OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f23603OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f23604OooO0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f23605OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f23606OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;

    public static class LazyHolder {
        public static BankManager OooO00o = new BankManager();
    }

    public enum supportOrientations {
        onlyPortrait,
        onlyLandscapeLeft,
        allSupport
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean OooOOo0() {
        /*
            r3 = this;
            r0 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x000e }
            android.hardware.Camera$Parameters r2 = r1.getParameters()     // Catch:{ Exception -> 0x000f }
            r1.setParameters(r2)     // Catch:{ Exception -> 0x000f }
            r2 = 1
            goto L_0x0010
        L_0x000e:
            r1 = 0
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r1 != 0) goto L_0x0013
            return r0
        L_0x0013:
            if (r2 == 0) goto L_0x0018
            r1.release()
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.bankcard.BankManager.OooOOo0():boolean");
    }

    public boolean OooO() {
        return this.OooOOOO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m21978OooO00o() {
        return this.f23586OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Bitmap m21986OooO0O0() {
        return this.f23599OooO0OO;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public Bitmap m21990OooO0OO() {
        return this.f23601OooO0Oo;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m21991OooO0OO() {
        return "4.0.1";
    }

    public Bitmap OooO0Oo() {
        return this.f23595OooO0O0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m21997OooO0o() {
        return this.f23600OooO0OO;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m21998OooO0o0() {
        return this.f23602OooO0Oo;
    }

    public boolean OooO0oO() {
        return this.f23604OooO0o0;
    }

    public boolean OooO0oo() {
        return this.OooOO0;
    }

    public boolean OooOO0() {
        return this.f23606OooO0oo;
    }

    public boolean OooOO0O() {
        return this.f23605OooO0oO;
    }

    public boolean OooOO0o() {
        return this.f23603OooO0o;
    }

    public boolean OooOOO() {
        return this.OooOO0O;
    }

    public boolean OooOOO0() {
        return this.OooO;
    }

    public boolean OooOOOO() {
        return this.OooOOO0;
    }

    public boolean OooOOOo() {
        return this.f23594OooO00o;
    }

    public BankManager() {
        this.f23588OooO00o = null;
        this.f23594OooO00o = false;
        this.f23597OooO0O0 = false;
        this.f23586OooO00o = null;
        this.f23600OooO0OO = false;
        this.f23595OooO0O0 = null;
        this.f23602OooO0Oo = false;
        this.f23599OooO0OO = null;
        this.f23601OooO0Oo = null;
        this.f23604OooO0o0 = false;
        this.f23603OooO0o = false;
        this.f23605OooO0oO = false;
        this.f23606OooO0oo = false;
        this.OooO = false;
        this.OooOO0 = false;
        this.f23589OooO00o = supportOrientations.allSupport;
        this.f23583OooO00o = TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE;
        this.OooOO0O = false;
        this.OooOO0o = true;
        this.OooOOO0 = false;
        this.f23593OooO00o = null;
        this.OooO00o = -15045433;
        this.OooO0O0 = -15045433;
        this.f23596OooO0O0 = "请将扫描线对准银行卡号";
        this.f23598OooO0OO = -15045433;
        this.OooOOO = true;
        this.OooOOOO = true;
        this.OooOOOo = false;
        this.OooO0Oo = -1;
    }

    public static BankManager OooO00o() {
        return LazyHolder.OooO00o;
    }

    private void OooO0o() {
        if (this.f23591OooO00o == null) {
            this.f23591OooO00o = new EXBankCardInfo();
        }
        boolean OooOOo0 = OooOOo0();
        this.f23594OooO00o = OooOOo0;
        if (OooOOo0) {
            this.f23585OooO00o.startActivity(new Intent(this.f23585OooO00o, CardRecoActivity.class));
            return;
        }
        DataCallBack dataCallBack = this.f23590OooO00o;
        if (dataCallBack != null) {
            dataCallBack.OooO00o();
        }
        ViewEvent viewEvent = this.f23592OooO00o;
        if (viewEvent != null) {
            viewEvent.OooO00o();
        }
    }

    public void OooO(boolean z) {
        if (this.OooOOO0) {
            this.f23605OooO0oO = z;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21987OooO0O0() {
        return this.f23593OooO00o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21993OooO0OO() {
        return this.OooOO0o;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m21996OooO0Oo() {
        return this.f23597OooO0O0;
    }

    public void OooO0o0(int i) {
        this.OooO0Oo = i;
    }

    public void OooO0oO(boolean z) {
        if (!this.OooOOO0) {
            this.OooOOOO = z;
        }
    }

    public void OooO0oo(boolean z) {
        if (this.OooOOO0) {
            this.f23606OooO0oo = z;
        }
    }

    public void OooOO0(boolean z) {
        this.OooO = z;
    }

    public void OooOO0O(boolean z) {
        if (!this.OooOOO0) {
            this.OooOOO = z;
        }
    }

    public void OooO00o(Bitmap bitmap) {
        ViewEvent viewEvent;
        if (this.OooOOO0 && (viewEvent = this.f23592OooO00o) != null) {
            viewEvent.OooO00o(bitmap);
        }
    }

    public int OooO0O0() {
        return this.OooO00o | -16777216;
    }

    public int OooO0OO() {
        return this.OooO0O0 | -16777216;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m21994OooO0Oo() {
        return this.f23596OooO0O0;
    }

    public void OooO0o0() {
        if (this.OooOOO0) {
            this.f23604OooO0o0 = false;
            this.f23587OooO00o.sendMessage(this.f23587OooO00o.obtainMessage(1002));
        }
    }

    public void OooO0O0(boolean z) {
        this.f23604OooO0o0 = true;
        ViewEvent viewEvent = this.f23592OooO00o;
        if (viewEvent == null) {
            return;
        }
        if (z) {
            viewEvent.OooO00o(this.f23591OooO00o);
        } else {
            viewEvent.OooO00o((Parcelable) null);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m21992OooO0OO() {
        ViewEvent viewEvent = this.f23592OooO00o;
        if (viewEvent != null) {
            viewEvent.OooO0O0();
            this.f23592OooO00o = null;
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m21995OooO0Oo() {
        if (this.OooOOO0) {
            this.f23587OooO00o.sendMessage(this.f23587OooO00o.obtainMessage(1006));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m21976OooO00o() {
        return this.f23583OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m21975OooO00o() {
        return this.f23598OooO0OO | -16777216;
    }

    public void OooO00o(EXBankCardInfo eXBankCardInfo) {
        this.f23591OooO00o = eXBankCardInfo;
    }

    public void OooO0OO(boolean z) {
        if (this.OooOOO0) {
            this.f23604OooO0o0 = true;
            this.f23603OooO0o = z;
            this.f23587OooO00o.sendMessage(this.f23587OooO00o.obtainMessage(1005));
        }
    }

    public void OooO0Oo(int i) {
        if (!this.OooOOO0) {
            this.OooO0O0 = i;
        }
    }

    public void OooO0o0(boolean z) {
        if (this.OooOOO0) {
            this.f23587OooO00o.sendMessage(this.f23587OooO00o.obtainMessage(1003, Boolean.valueOf(z)));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21982OooO00o() {
        DataCallBack dataCallBack;
        int i = this.OooO0Oo;
        if (i == -2) {
            Bitmap bitmap = this.f23591OooO00o.f23661OooO00o;
            if (bitmap != null) {
                DataCallBack dataCallBack2 = this.f23590OooO00o;
                if (dataCallBack2 != null) {
                    dataCallBack2.OooO00o(-2, bitmap);
                }
            } else {
                DataCallBack dataCallBack3 = this.f23590OooO00o;
                if (dataCallBack3 != null) {
                    dataCallBack3.OooO00o(-2, (Bitmap) null);
                }
            }
        } else if (i == -1) {
            DataCallBack dataCallBack4 = this.f23590OooO00o;
            if (dataCallBack4 != null) {
                dataCallBack4.OooO00o(-1, (Bitmap) null);
            }
        } else if (i == 0) {
            DataCallBack dataCallBack5 = this.f23590OooO00o;
            if (dataCallBack5 != null) {
                dataCallBack5.OooO00o(0, this.f23591OooO00o);
            }
        } else if (i == 1 && (dataCallBack = this.f23590OooO00o) != null) {
            dataCallBack.OooO00o(1);
        }
        this.f23591OooO00o = null;
        this.f23585OooO00o = null;
        this.f23590OooO00o = null;
        OooO0o0(-1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21989OooO0O0() {
        return this.OooOOO;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21988OooO0O0() {
        if (this.OooOOO0) {
            this.f23604OooO0o0 = false;
            this.f23587OooO00o.sendMessage(this.f23587OooO00o.obtainMessage(1004));
        }
    }

    public void OooO0Oo(boolean z) {
        this.OooOO0o = z;
    }

    public void OooO0o(boolean z) {
        if (!this.OooOOO0) {
            this.OooOO0 = z;
        }
    }

    public void OooO0OO(int i) {
        if (!this.OooOOO0) {
            this.OooO00o = i;
        }
    }

    public void OooO0O0(Resources resources, int i) {
        if (!this.OooOOO0) {
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
                this.f23595OooO0O0 = decodeResource;
                if (decodeResource != null) {
                    this.f23600OooO0OO = true;
                }
            } catch (Exception unused) {
                this.f23600OooO0OO = false;
            }
        }
    }

    public void OooO0O0(int i) {
        if (!this.OooOOO0) {
            this.f23598OooO0OO = i;
        }
    }

    public void OooO0O0(String str) {
        if (!this.OooOOO0) {
            this.f23596OooO0O0 = str;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21985OooO00o() {
        return this.OooOOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m21979OooO00o() {
        return this.f23588OooO00o;
    }

    public void OooO00o(Activity activity) {
        this.f23584OooO00o = activity;
        if (activity != null) {
            this.f23587OooO00o = ((CardRecoActivity) activity).m22005OooO00o();
        } else {
            this.f23587OooO00o = null;
        }
    }

    public Rect OooO00o(int i) {
        ViewEvent viewEvent = this.f23592OooO00o;
        if (viewEvent != null) {
            return viewEvent.OooO00o(i);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21983OooO00o(int i) {
        ViewEvent viewEvent = this.f23592OooO00o;
        if (viewEvent != null) {
            viewEvent.OooO0O0(i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public supportOrientations m21980OooO00o() {
        return this.f23589OooO00o;
    }

    public void OooO00o(float f) {
        ViewEvent viewEvent;
        if (this.OooOOO0 && (viewEvent = this.f23592OooO00o) != null) {
            viewEvent.OooO00o(f);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Activity m21977OooO00o() {
        Activity activity;
        if (!this.OooOOO0 || (activity = this.f23584OooO00o) == null) {
            return null;
        }
        return activity;
    }

    public void OooO00o(View view) {
        this.f23588OooO00o = view;
        if (view != null) {
            this.OooOOO0 = true;
        } else {
            this.OooOOO0 = false;
        }
    }

    public void OooO00o(Resources resources, int i, int i2) {
        if (!this.OooOOO0) {
            try {
                this.f23601OooO0Oo = BitmapFactory.decodeResource(resources, i);
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2);
                this.f23599OooO0OO = decodeResource;
                if (decodeResource != null && this.f23601OooO0Oo != null) {
                    this.f23602OooO0Oo = true;
                }
            } catch (Exception unused) {
                this.f23602OooO0Oo = false;
            }
        }
    }

    public void OooO00o(Resources resources, int i) {
        if (!this.OooOOO0) {
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
                this.f23586OooO00o = decodeResource;
                if (decodeResource != null) {
                    this.f23597OooO0O0 = true;
                }
            } catch (Exception unused) {
                this.f23597OooO0O0 = false;
            }
        }
    }

    public void OooO00o(boolean z) {
        if (!this.OooOOO0) {
            this.OooOOOo = z;
        }
    }

    public void OooO00o(long j) {
        this.OooOO0O = true;
        this.f23583OooO00o = j;
    }

    public void OooO00o(Bitmap bitmap, PhotoCallBack photoCallBack, Context context) {
        EXBankCardInfo OooO00o2 = new BankPhoto(context).m21999OooO00o(bitmap);
        if (OooO00o2.f23669o0ooOoO != null) {
            if (photoCallBack != null) {
                photoCallBack.OooO00o(OooO00o2);
            }
        } else if (photoCallBack != null) {
            photoCallBack.OooO00o(bitmap);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21984OooO00o(String str) {
        this.f23593OooO00o = str;
    }

    public void OooO00o(DataCallBack dataCallBack, Context context) {
        if (!this.OooOOO0) {
            this.f23585OooO00o = context;
            this.f23590OooO00o = dataCallBack;
            if (context != null) {
                OooO0o();
            }
        }
    }

    public void OooO00o(ViewEvent viewEvent, Context context) {
        if (this.OooOOO0) {
            this.f23585OooO00o = context;
            this.f23592OooO00o = viewEvent;
            if (context != null) {
                OooO0o();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21981OooO00o() {
        byte[] bArr = new byte[128];
        if (EXBankCardReco.nativeGetVersion(bArr) == 0) {
            try {
                return new String(bArr, "GB2312");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public void OooO00o(supportOrientations supportorientations) {
        this.f23589OooO00o = supportorientations;
    }

    public EXBankCardInfo OooO00o(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[1024];
        EXBankCardReco.nativeQueryBankInfo(bytes, bytes.length, bArr, 1024);
        EXBankCardInfo eXBankCardInfo = new EXBankCardInfo();
        if (OooO00o(bArr, 1024, eXBankCardInfo)) {
            return eXBankCardInfo;
        }
        return null;
    }

    public static boolean OooO00o(byte[] bArr, int i, EXBankCardInfo eXBankCardInfo) {
        if (eXBankCardInfo == null) {
            return false;
        }
        byte[] bArr2 = new byte[72];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < 64) {
            int i5 = i3 + 1;
            bArr2[i2] = bArr[i3];
            if (bArr2[i2] != 0) {
                i4 = i2;
            }
            i2++;
            i3 = i5;
        }
        try {
            eXBankCardInfo.f23668o0ooOOo = new String(bArr2, 0, i4 + 1, "GBK");
            int i6 = 0;
            int i7 = 0;
            while (i6 < 32) {
                int i8 = i3 + 1;
                bArr2[i6] = bArr[i3];
                if (bArr2[i6] != 0) {
                    i7 = i6;
                }
                i6++;
                i3 = i8;
            }
            eXBankCardInfo.f23666o0OOO0o = new String(bArr2, 0, i7 + 1, "GBK");
            int i9 = 0;
            int i10 = 0;
            while (i9 < 32) {
                int i11 = i3 + 1;
                bArr2[i9] = bArr[i3];
                if (bArr2[i9] != 0) {
                    i10 = i9;
                }
                i9++;
                i3 = i11;
            }
            eXBankCardInfo.f23667o0Oo0oo = new String(bArr2, 0, i10 + 1, "GBK");
            return !eXBankCardInfo.f23668o0ooOOo.equals("");
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }
}
