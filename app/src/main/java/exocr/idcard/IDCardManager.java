package exocr.idcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import com.jinhui365.view.idcard.IDCardScanActivity;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import exocr.engine.ViewEvent;
import exocr.exocrengine.EXIDCardResult;
import exocr.exocrengine.EXOCREngine;

public class IDCardManager {
    public static final String OooO0o = "IDCardManager";
    public static final int OooOO0O = 0;
    public static final int OooOO0o = 1;
    public static final int OooOOO0 = 2;
    public int OooO;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f23770OooO;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f23771OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f23772OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23773OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23774OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f23775OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewEvent f23776OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXIDCardResult f23777OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IDCallBack f23778OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23779OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23780OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Bitmap f23781OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f23782OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23783OooO0O0;
    public final int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Bitmap f23784OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f23785OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23786OooO0OO;
    public final int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Bitmap f23787OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public String f23788OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23789OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public int f23790OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f23791OooO0o;
    public int OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public Bitmap f23792OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public String f23793OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f23794OooO0o0;
    public int OooO0oO;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f23795OooO0oO;
    public int OooO0oo;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f23796OooO0oo;
    public int OooOO0;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f23797OooOO0;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public boolean f23798OooOO0O;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public boolean f23799OooOO0o;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public boolean f23800OooOOO0;

    public interface IDCallBack {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = -1;
        public static final int OooO0Oo = -2;

        void OooO00o();

        void OooO00o(int i);

        void OooO00o(int i, Bitmap bitmap);

        void OooO00o(int i, EXIDCardResult eXIDCardResult);
    }

    public static class LazyHolder {
        public static IDCardManager OooO00o = new IDCardManager();
    }

    public interface PhotoCallBack {
        void OooO00o(Bitmap bitmap);

        void OooO00o(EXIDCardResult eXIDCardResult);
    }

    public static IDCardManager OooO00o() {
        return LazyHolder.OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean OooOOO() {
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
        throw new UnsupportedOperationException("Method not decompiled: exocr.idcard.IDCardManager.OooOOO():boolean");
    }

    public boolean OooO() {
        return this.f23783OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Bitmap m22058OooO0O0() {
        return this.f23787OooO0Oo;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public Bitmap m22062OooO0OO() {
        return this.f23792OooO0o0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public Bitmap m22066OooO0Oo() {
        return this.f23781OooO0O0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m22070OooO0o() {
        return this.f23789OooO0Oo;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public Bitmap m22071OooO0o0() {
        return this.f23784OooO0OO;
    }

    public boolean OooO0oO() {
        return this.f23794OooO0o0;
    }

    public boolean OooO0oo() {
        return this.f23780OooO00o;
    }

    public boolean OooOO0() {
        return this.f23799OooOO0o;
    }

    public boolean OooOO0O() {
        return this.f23800OooOOO0;
    }

    public boolean OooOO0o() {
        return this.f23795OooO0oO;
    }

    public boolean OooOOO0() {
        return this.f23770OooO;
    }

    public IDCardManager() {
        this.OooO00o = 1;
        this.OooO0O0 = 2;
        this.OooO0OO = 4;
        this.OooO0Oo = 8;
        this.f23780OooO00o = false;
        this.f23783OooO0O0 = false;
        this.f23786OooO0OO = false;
        this.f23773OooO00o = null;
        this.f23789OooO0Oo = false;
        this.f23781OooO0O0 = null;
        this.f23794OooO0o0 = false;
        this.f23784OooO0OO = null;
        this.f23791OooO0o = false;
        this.f23787OooO0Oo = null;
        this.f23792OooO0o0 = null;
        this.f23795OooO0oO = true;
        this.f23796OooO0oo = true;
        this.f23771OooO00o = TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE;
        this.f23770OooO = false;
        this.f23775OooO00o = null;
        this.f23797OooOO0 = false;
        this.f23779OooO00o = null;
        this.OooO0o0 = 2;
        this.f23790OooO0o = -1;
        this.OooO0oO = -15045433;
        this.OooO0oo = -15045433;
        this.OooO = -65536;
        this.f23798OooOO0O = true;
        this.OooOO0 = 24;
        this.f23782OooO0O0 = IDCardScanActivity.f15048o0ooOoO;
        this.f23785OooO0OO = IDCardScanActivity.f15045o0OOO0o;
        this.f23788OooO0Oo = IDCardScanActivity.f15046o0Oo0oo;
        this.f23793OooO0o0 = IDCardScanActivity.o0OO00O;
        this.f23799OooOO0o = true;
        this.f23800OooOOO0 = true;
        this.f23777OooO00o = new EXIDCardResult();
    }

    public void OooO(boolean z) {
        this.f23795OooO0oO = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m22053OooO00o() {
        return this.f23773OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m22061OooO0O0() {
        return this.f23797OooOO0;
    }

    public int OooO0OO() {
        return this.OooO;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m22069OooO0Oo() {
        return this.f23786OooO0OO;
    }

    public void OooO0o() {
        if (this.f23797OooOO0) {
            this.f23780OooO00o = false;
            Handler handler = this.f23774OooO00o;
            if (handler != null) {
                this.f23774OooO00o.sendMessage(handler.obtainMessage(1002));
            }
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m22074OooO0o0() {
        return this.f23791OooO0o;
    }

    public void OooO0oO(boolean z) {
        this.f23799OooOO0o = z;
    }

    public void OooO0oo(boolean z) {
        this.f23800OooOOO0 = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m22057OooO00o() {
        return this.f23796OooO0oo;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m22059OooO0O0() {
        return this.f23793OooO0o0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m22063OooO0OO() {
        return this.f23788OooO0Oo;
    }

    public void OooO0Oo(boolean z) {
        this.f23796OooO0oo = z;
    }

    public int OooO0o0() {
        return this.OooOO0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m22051OooO00o() {
        return this.f23771OooO00o;
    }

    public void OooO0O0(int i) {
        this.f23790OooO0o = i;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m22065OooO0OO() {
        return this.f23798OooOO0O;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m22068OooO0Oo() {
        ViewEvent viewEvent;
        if (this.f23797OooOO0 && (viewEvent = this.f23776OooO00o) != null) {
            viewEvent.OooO0OO();
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public String m22072OooO0o0() {
        return this.f23782OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22056OooO00o() {
        ViewEvent viewEvent = this.f23776OooO00o;
        if (viewEvent != null) {
            viewEvent.OooO0O0();
            this.f23776OooO00o = null;
            this.f23775OooO00o = null;
        }
    }

    public int OooO0O0() {
        return this.OooO0o0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m22064OooO0OO() {
        ViewEvent viewEvent;
        if (this.f23797OooOO0 && (viewEvent = this.f23776OooO00o) != null) {
            viewEvent.OooO0Oo();
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public void m22073OooO0o0() {
        Handler handler;
        if (this.f23797OooOO0 && (handler = this.f23774OooO00o) != null) {
            this.f23774OooO00o.sendMessage(handler.obtainMessage(1006));
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m22060OooO0O0() {
        IDCallBack iDCallBack = this.f23778OooO00o;
        if (iDCallBack != null) {
            int i = this.f23790OooO0o;
            if (i == -2) {
                EXIDCardResult eXIDCardResult = this.f23777OooO00o;
                if (eXIDCardResult != null) {
                    Bitmap bitmap = eXIDCardResult.OooO00o;
                    if (bitmap != null) {
                        iDCallBack.OooO00o(-2, bitmap);
                    } else {
                        iDCallBack.OooO00o(-2, (Bitmap) null);
                    }
                } else {
                    iDCallBack.OooO00o(-2, (Bitmap) null);
                }
            } else if (i == -1) {
                EXIDCardResult eXIDCardResult2 = this.f23777OooO00o;
                if (eXIDCardResult2 != null) {
                    Bitmap bitmap2 = eXIDCardResult2.OooO00o;
                    if (bitmap2 != null) {
                        iDCallBack.OooO00o(-1, bitmap2);
                    } else {
                        iDCallBack.OooO00o(-1, (Bitmap) null);
                    }
                } else {
                    iDCallBack.OooO00o(-1, (Bitmap) null);
                }
            } else if (i == 0) {
                iDCallBack.OooO00o(0, this.f23777OooO00o);
            } else if (i == 1) {
                iDCallBack.OooO00o(1);
            }
            this.f23778OooO00o = null;
        }
        this.f23777OooO00o = null;
        OooO0O0(-1);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m22067OooO0Oo() {
        return this.f23785OooO0OO;
    }

    public void OooO0OO(boolean z) {
        ViewEvent viewEvent;
        if (this.f23797OooOO0 && (viewEvent = this.f23776OooO00o) != null) {
            this.f23780OooO00o = true;
            viewEvent.OooO0o0();
            Handler handler = this.f23774OooO00o;
            if (handler != null) {
                this.f23774OooO00o.sendMessage(handler.obtainMessage(1005, Boolean.valueOf(z)));
            }
        }
    }

    public int OooO0Oo() {
        return this.OooO0oo;
    }

    public void OooO0o(boolean z) {
        this.f23783OooO0O0 = z;
    }

    public void OooO0Oo(int i) {
        this.OooO0oo = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m22050OooO00o() {
        return this.OooO0oO | -16777216;
    }

    public void OooO0Oo(String str) {
        this.f23785OooO0OO = str;
    }

    public void OooO0o0(boolean z) {
        Handler handler;
        if (this.f23797OooOO0 && (handler = this.f23774OooO00o) != null) {
            this.f23774OooO00o.sendMessage(handler.obtainMessage(1007, Boolean.valueOf(z)));
        }
    }

    public void OooO00o(EXIDCardResult eXIDCardResult) {
        this.f23777OooO00o = eXIDCardResult;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m22055OooO00o() {
        return this.f23779OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m22054OooO00o() {
        return this.f23775OooO00o;
    }

    public void OooO00o(CaptureActivity captureActivity) {
        this.f23772OooO00o = captureActivity;
        if (captureActivity != null) {
            this.f23774OooO00o = captureActivity.OooO0O0();
        } else {
            this.f23774OooO00o = null;
        }
    }

    public void OooO0OO(Resources resources, int i) {
        if (!this.f23797OooOO0) {
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
                this.f23784OooO0OO = decodeResource;
                if (decodeResource != null) {
                    this.f23794OooO0o0 = true;
                }
            } catch (Exception unused) {
                this.f23794OooO0o0 = false;
            }
        }
    }

    public void OooO0o0(int i) {
        this.OooOO0 = i;
    }

    public void OooO0o0(String str) {
        this.f23782OooO0O0 = str;
    }

    public void OooO00o(float f) {
        ViewEvent viewEvent;
        if (this.f23797OooOO0 && (viewEvent = this.f23776OooO00o) != null) {
            viewEvent.OooO00o(f);
        }
    }

    public void OooO0OO(int i) {
        this.OooO = i;
    }

    public void OooO00o(View view) {
        this.f23775OooO00o = view;
        if (view != null) {
            this.f23797OooOO0 = true;
        } else {
            this.f23797OooOO0 = false;
        }
    }

    public void OooO0OO(String str) {
        this.f23788OooO0Oo = str;
    }

    public void OooO00o(long j) {
        this.f23770OooO = true;
        this.f23771OooO00o = j;
    }

    public void OooO00o(ViewEvent viewEvent, Context context, boolean z) {
        if (this.f23797OooOO0) {
            this.f23776OooO00o = viewEvent;
            this.f23798OooOO0O = z;
            this.f23777OooO00o = null;
            this.f23790OooO0o = -1;
            if (OooOOO()) {
                Intent intent = new Intent(context, CaptureActivity.class);
                intent.putExtra("isFont", z);
                context.startActivity(intent);
                return;
            }
            viewEvent.OooO00o();
        }
    }

    public void OooO0O0(boolean z) {
        ViewEvent viewEvent = this.f23776OooO00o;
        if (viewEvent == null) {
            return;
        }
        if (z) {
            viewEvent.OooO00o(this.f23777OooO00o);
        } else {
            viewEvent.OooO00o((Parcelable) null);
        }
    }

    public void OooO0O0(Resources resources, int i) {
        if (!this.f23797OooOO0) {
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
                this.f23781OooO0O0 = decodeResource;
                if (decodeResource != null) {
                    this.f23789OooO0Oo = true;
                }
            } catch (Exception unused) {
                this.f23789OooO0Oo = false;
            }
        }
    }

    public void OooO0O0(String str) {
        this.f23793OooO0o0 = str;
    }

    public void OooO00o(IDCallBack iDCallBack, Context context, boolean z) {
        if (!this.f23797OooOO0) {
            this.f23778OooO00o = iDCallBack;
            this.f23798OooOO0O = z;
            this.f23777OooO00o = null;
            this.f23790OooO0o = -1;
            if (OooOOO()) {
                Intent intent = new Intent(context, CaptureActivity.class);
                intent.putExtra("isFont", z);
                context.startActivity(intent);
                return;
            }
            iDCallBack.OooO00o();
        }
    }

    public void OooO00o(Bitmap bitmap, PhotoCallBack photoCallBack) {
        EXIDCardResult OooO00o2 = new IDPhoto().m22075OooO00o(bitmap);
        if (OooO00o2 != null) {
            photoCallBack.OooO00o(OooO00o2);
        } else {
            photoCallBack.OooO00o(bitmap);
        }
    }

    public void OooO00o(int i, int i2) {
        this.OooO0o0 = i;
        int OooO0O02 = OooO00o().OooO0O0();
        int i3 = 14;
        if (OooO0O02 == 0) {
            i3 = 1;
        } else if (OooO0O02 == 1) {
            i3 = 2;
        }
        EXOCREngine.nativeSetExtractImageMode2(i3, i2);
    }

    public void OooO00o(String str) {
        this.f23779OooO00o = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Activity m22052OooO00o() {
        Activity activity;
        if (!this.f23797OooOO0 || (activity = this.f23772OooO00o) == null) {
            return null;
        }
        return activity;
    }

    public void OooO00o(boolean z) {
        ViewEvent viewEvent;
        if (this.f23797OooOO0) {
            this.f23780OooO00o = false;
            if (this.f23774OooO00o != null && (viewEvent = this.f23776OooO00o) != null) {
                this.f23798OooOO0O = z;
                viewEvent.OooO00o(z);
                this.f23774OooO00o.sendMessage(this.f23774OooO00o.obtainMessage(1004));
            }
        }
    }

    public void OooO00o(Resources resources, int i, int i2) {
        if (!this.f23797OooOO0) {
            try {
                this.f23792OooO0o0 = BitmapFactory.decodeResource(resources, i);
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2);
                this.f23787OooO0Oo = decodeResource;
                if (decodeResource != null && this.f23792OooO0o0 != null) {
                    this.f23791OooO0o = true;
                }
            } catch (Exception unused) {
                this.f23791OooO0o = false;
            }
        }
    }

    public void OooO00o(Resources resources, int i) {
        if (!this.f23797OooOO0) {
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
                this.f23773OooO00o = decodeResource;
                if (decodeResource != null) {
                    this.f23786OooO0OO = true;
                }
            } catch (Exception unused) {
                this.f23786OooO0OO = false;
            }
        }
    }

    public void OooO00o(int i) {
        this.OooO0oO = i;
    }
}
