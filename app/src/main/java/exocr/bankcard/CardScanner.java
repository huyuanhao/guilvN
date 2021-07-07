package exocr.bankcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.p118pd.sdk.C7265o0O000oo;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.i111I;
import com.umeng.message.proguard.C3848l;
import exocr.bankcard.BankManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CardScanner implements Camera.PreviewCallback, Camera.AutoFocusCallback, SurfaceHolder.Callback {
    public static final /* synthetic */ boolean OooO = false;
    public static final long OooO0OO = 1000;
    public static final long OooO0Oo = 3000;
    public static final float OooO0o0 = 5.0f;
    public static boolean OooO0oO = false;
    public static boolean OooO0oo = false;
    public static final int o00000 = 3;
    public static final int o000000 = 50;
    public static final int o000000O = 1;
    public static final int o000000o = 2;
    public static final int o00000O = 100;
    public static final int o00000O0 = 4;
    public static final int o00000OO = 1024;
    public static final int o000OOo = 5000;
    public static final String o0ooOOo = CardScanner.class.getSimpleName();
    public static final String o0ooOoO = "";
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f23638OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Point f23639OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23640OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera f23641OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23642OooO00o = new Handler();

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXBankCardInfo f23643OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SDKDataCallBack f23644OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Camera.Size> f23645OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f23646OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23647OooO00o;
    public long OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Point f23648OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23649OooO0O0 = true;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23650OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23651OooO0OO = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f23652OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float f23653OooO0Oo = 1.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23654OooO0Oo = true;
    public boolean OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f23655OooO0o0 = false;
    public int o00oO0O;
    public int o0O0O00 = 0;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo = 1;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f23656o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f23657o0ooOoO;
    public int oo0o0Oo;

    public class recoThread implements Runnable {
        public CardScanner OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f23658OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f23659OooO0O0;

        public recoThread(CardScanner cardScanner, byte[] bArr) {
            this.OooO00o = cardScanner;
            this.f23658OooO00o = bArr;
        }

        public void run() {
            boolean z;
            synchronized (this) {
                DebugLog.m22020OooO00o("recoThread id:" + Thread.currentThread().getId());
                boolean unused = CardScanner.OooO0oO = true;
                if (BankManager.OooO00o().OooOOOO()) {
                    Rect rect = new Rect();
                    if (BankManager.OooO00o().OooO00o(CardScanner.this.o0Oo0oo) != null) {
                        rect.set(BankManager.OooO00o().OooO00o(CardScanner.this.o0Oo0oo));
                    } else {
                        rect.set(0, 0, 0, 0);
                    }
                    float f = ((float) CardScanner.this.f23656o0ooOOo) / ((float) CardScanner.this.f23639OooO00o.x);
                    rect.left = (int) (((float) rect.left) * f);
                    rect.top = (int) (((float) rect.top) * f);
                    rect.right = (int) (((float) rect.right) * f);
                    rect.bottom = (int) (((float) rect.bottom) * f);
                    int i = CardScanner.this.o0Oo0oo;
                    if (i == 1 || i == 2) {
                        CardScanner.this.f23640OooO00o = new Rect((int) (((float) rect.top) * CardScanner.this.f23653OooO0Oo), rect.left, (int) (((float) rect.bottom) * CardScanner.this.f23653OooO0Oo), rect.right);
                    } else if (i == 3) {
                        CardScanner.this.f23640OooO00o = new Rect((int) (((float) rect.top) * CardScanner.this.f23653OooO0Oo), CardScanner.this.f23656o0ooOOo - rect.right, (int) (((float) rect.bottom) * CardScanner.this.f23653OooO0Oo), CardScanner.this.f23656o0ooOOo - rect.left);
                    } else if (i == 4) {
                        CardScanner.this.f23640OooO00o = new Rect((int) (((float) rect.top) * CardScanner.this.f23653OooO0Oo), CardScanner.this.f23656o0ooOOo - rect.right, (int) (((float) rect.bottom) * CardScanner.this.f23653OooO0Oo), CardScanner.this.f23656o0ooOOo - rect.left);
                    }
                    DebugLog.OooO0OO(CardScanner.this.o0Oo0oo + "bbbbb");
                    DebugLog.OooO0OO("previewframeheight:" + CardScanner.this.f23656o0ooOOo + "width:" + CardScanner.this.o0ooOO0 + "guideRect:left:" + CardScanner.this.f23640OooO00o.left + "top:" + CardScanner.this.f23640OooO00o.top + "right:" + CardScanner.this.f23640OooO00o.right + "bottom:" + CardScanner.this.f23640OooO00o.bottom);
                } else {
                    CardScanner.this.f23640OooO00o = CardScanner.this.OooO00o(CardScanner.this.o0Oo0oo + 100, CardScanner.this.f23656o0ooOOo, CardScanner.this.o0ooOO0);
                }
                if (this.f23659OooO0O0) {
                    this.f23659OooO0O0 = false;
                    CardScanner.this.OooO00o(this.f23658OooO00o, CardScanner.this.o0ooOO0, CardScanner.this.f23656o0ooOOo, CardScanner.this.f23640OooO00o.left, CardScanner.this.f23640OooO00o.top, CardScanner.this.f23640OooO00o.right, CardScanner.this.f23640OooO00o.bottom, CardScanner.this.o0Oo0oo);
                    CardScanner.this.m22009OooO00o((CardScanner) this.f23658OooO00o, (byte[]) CardScanner.this.o0ooOO0, CardScanner.this.f23656o0ooOOo);
                }
                EXBankCardInfo eXBankCardInfo = new EXBankCardInfo();
                eXBankCardInfo.o00oO0O = 0;
                eXBankCardInfo.OooO0Oo = 0.0f;
                float nativeFocusScore = EXBankCardReco.nativeFocusScore(this.f23658OooO00o, CardScanner.this.o0ooOO0, CardScanner.this.f23656o0ooOOo, CardScanner.this.o00oO0O, CardScanner.this.f23640OooO00o.left, CardScanner.this.f23640OooO00o.top, CardScanner.this.f23640OooO00o.right, CardScanner.this.f23640OooO00o.bottom);
                eXBankCardInfo.OooO0Oo = nativeFocusScore;
                if (!(nativeFocusScore >= 5.0f)) {
                    CardScanner.this.OooO00o(false);
                    CardScanner.this.o0O0O00 = 0;
                } else {
                    int[] iArr = new int[8];
                    CardScanner.OooO0oO(CardScanner.this);
                    OverlayView.o0ooOoO = BankManager.OooO00o().m21994OooO0Oo();
                    CardScanner.this.o0OO00O = 0;
                    if (CardScanner.this.m22018OooO0OO()) {
                        CardScanner.this.o0OO00O = 1;
                    } else if (Build.MODEL.equals("Nexus 5X")) {
                        int i2 = CardScanner.this.o0Oo0oo;
                        if (i2 == 1 || i2 == 2) {
                            CardScanner.this.o0OO00O = 4;
                        } else if (i2 == 3) {
                            CardScanner.this.o0OO00O = 2;
                        } else if (i2 != 4) {
                            CardScanner.this.o0OO00O = 4;
                        } else {
                            CardScanner.this.o0OO00O = 1;
                        }
                    } else {
                        int i3 = CardScanner.this.o0Oo0oo;
                        if (i3 == 1 || i3 == 2) {
                            CardScanner.this.o0OO00O = 3;
                        } else if (i3 == 3) {
                            CardScanner.this.o0OO00O = 1;
                        } else if (i3 != 4) {
                            CardScanner.this.o0OO00O = 1;
                        } else {
                            CardScanner.this.o0OO00O = 2;
                        }
                    }
                    Bitmap bitmap = null;
                    if (!BankManager.OooO00o().OooO0oO()) {
                        bitmap = EXBankCardReco.nativeRecoNV21ST(this.f23658OooO00o, CardScanner.this.o0ooOO0, CardScanner.this.f23656o0ooOOo, CardScanner.this.o00oO0O, CardScanner.this.f23640OooO00o.left, CardScanner.this.f23640OooO00o.top, CardScanner.this.f23640OooO00o.right, CardScanner.this.f23640OooO00o.bottom, CardScanner.this.o0OO00O, 1, 1, CardScanner.this.f23650OooO0O0, CardScanner.this.f23650OooO0O0.length, iArr);
                    }
                    CardScanner.this.oo0o0Oo = iArr[0];
                    DebugLog.OooO0OO("ret:" + CardScanner.this.oo0o0Oo + "\ndirection:" + CardScanner.this.o0OO00O);
                    DebugLog.OooO0OO("ret:" + CardScanner.this.oo0o0Oo + "\nguiderect:left:" + CardScanner.this.f23640OooO00o.left + "top:" + CardScanner.this.f23640OooO00o.top + "right:" + CardScanner.this.f23640OooO00o.right + "bottom:" + CardScanner.this.f23640OooO00o.bottom);
                    if (CardScanner.this.oo0o0Oo <= 0 || bitmap == null) {
                        z = false;
                    } else {
                        z = EXBankCardReco.OooO0O0(CardScanner.this.f23650OooO0O0, CardScanner.this.oo0o0Oo, eXBankCardInfo);
                        DebugLog.OooO0OO("bankname  " + eXBankCardInfo.f23668o0ooOOo);
                        DebugLog.OooO0OO("长度" + String.valueOf(eXBankCardInfo.f23668o0ooOOo.length()));
                        if (z) {
                            z = BankManager.OooO00o().m21985OooO00o() ? CardScanner.this.OooO00o((CardScanner) eXBankCardInfo.f23668o0ooOOo) : true;
                            if (z) {
                                if (eXBankCardInfo.f23661OooO00o != null) {
                                    eXBankCardInfo.f23661OooO00o.recycle();
                                }
                                eXBankCardInfo.f23661OooO00o = bitmap;
                            } else {
                                OverlayView.o0ooOoO = "暂不支持此类银行卡，请更换！";
                            }
                        }
                    }
                    if (z) {
                        boolean unused2 = CardScanner.OooO0oo = true;
                        CardScanner.this.f23643OooO00o = eXBankCardInfo;
                        CardScanner.this.f23642OooO00o.post(new Runnable() {
                            /* class exocr.bankcard.CardScanner.recoThread.RunnableC47141 */

                            public void run() {
                                CardScanner.this.f23652OooO0OO = null;
                                if (CardScanner.this.f23643OooO00o.f23665OooO0O0 != null) {
                                    CardScanner.this.f23643OooO00o.f23665OooO0O0.recycle();
                                }
                                CardScanner.this.f23643OooO00o.f23665OooO0O0 = CardScanner.OooO00o(recoThread.this.f23658OooO00o, CardScanner.this.o0ooOO0, CardScanner.this.f23656o0ooOOo, CardScanner.this.o00oO0O, CardScanner.this.f23640OooO00o, CardScanner.this.o0OO00O);
                                DebugLog.OooO0OO(CardScanner.this.f23643OooO00o.f23669o0ooOoO + CardScanner.this.f23643OooO00o.f23668o0ooOOo);
                                CardScanner.this.f23644OooO00o.OooO00o(true, CardScanner.this.f23643OooO00o);
                            }
                        });
                    } else if (CardScanner.this.o0O0O00 > 6) {
                        CardScanner.this.OooO00o(false);
                        CardScanner.this.o0O0O00 = 0;
                    }
                }
                boolean unused3 = CardScanner.OooO0oO = false;
            }
        }
    }

    public CardScanner(SDKDataCallBack sDKDataCallBack, int i) {
        this.f23644OooO00o = sDKDataCallBack;
        ((CardRecoActivity) sDKDataCallBack).getIntent();
        this.o0Oo0oo = i;
        this.f23638OooO00o = ((CardRecoActivity) this.f23644OooO00o).getApplicationContext();
        this.f23643OooO00o = new EXBankCardInfo();
        this.f23650OooO0O0 = new byte[1024];
        this.oo0o0Oo = 0;
        this.OooO0o = false;
        m22014OooO00o();
        OooO0oo = false;
        OooO0oO = false;
        EXBankCardReco.f23670OooO00o = true;
        if (EXBankCardReco.nativeCheckSignature(this.f23638OooO00o) != 1) {
            EXBankCardReco.f23670OooO00o = false;
        }
    }

    public static /* synthetic */ int OooO0oO(CardScanner cardScanner) {
        int i = cardScanner.o0O0O00;
        cardScanner.o0O0O00 = i + 1;
        return i;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.OooO0O0 = System.currentTimeMillis();
        this.OooO0o = z;
        if (z) {
            DebugLog.m22020OooO00o("onAutoFocus success@@@@@@@@@@@@@@@@@@@@@@@@@");
        } else {
            DebugLog.m22020OooO00o("onAutoFocus failed###########################");
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        ExecutorService executorService;
        if (bArr == null) {
            DebugLog.OooO0o0("frame is null! skipping");
        } else if (OooO0oO) {
            DebugLog.OooO0OO("processing in progress.... dropping frame");
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        } else if (this.f23654OooO0Oo && !BankManager.OooO00o().OooOOOO()) {
            this.f23644OooO00o.OooO00o();
            this.f23654OooO0Oo = false;
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        } else if (!this.OooO0o) {
            DebugLog.OooO0OO("processing in progress.... dropping frame");
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
            OooO00o(false);
            this.o0O0O00 = 0;
        } else {
            if (!BankManager.OooO00o().OooOO0o() && BankManager.OooO00o().OooOOOO()) {
                OooO0oo = false;
            }
            if (OooO0oo && (executorService = this.f23646OooO00o) != null && !executorService.isShutdown()) {
                this.f23646OooO00o.shutdown();
            }
            DebugLog.m22020OooO00o("mainThread id:" + Thread.currentThread().getId());
            ExecutorService executorService2 = this.f23646OooO00o;
            if (executorService2 != null && !executorService2.isShutdown()) {
                if (this.f23652OooO0OO == null) {
                    this.f23652OooO0OO = new byte[bArr.length];
                }
                if (this.f23652OooO0OO.length < bArr.length) {
                    this.f23652OooO0OO = null;
                    this.f23652OooO0OO = new byte[bArr.length];
                }
                byte[] bArr2 = this.f23652OooO0OO;
                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                this.f23646OooO00o.execute(new recoThread(this, this.f23652OooO0OO));
                DebugLog.m22020OooO00o("on:" + Thread.currentThread().getId());
            }
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(surfaceHolder != null);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        DebugLog.m22020OooO00o(String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", objArr));
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        DebugLog.m22020OooO00o("Preview.surfaceCreated()");
        if (this.f23641OooO00o != null || !this.f23649OooO0O0) {
            this.f23651OooO0OO = true;
            OooO0O0(surfaceHolder);
            DebugLog.m22020OooO00o("Preview.surfaceCreated(), surface is valid");
            return;
        }
        DebugLog.OooO0o("CardScanner.surfaceCreated() - camera is null!");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        DebugLog.m22020OooO00o("Preview.surfaceDestroyed()");
        Camera camera = this.f23641OooO00o;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.f23641OooO00o.setPreviewCallback(null);
            } catch (Exception unused) {
                DebugLog.OooO0O0("error stopping camera");
            }
        }
        this.f23651OooO0OO = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean OooO0Oo() {
        /*
            r5 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            r1 = 0
            java.lang.String r2 = ""
            java.util.Date r0 = r0.parse(r2)     // Catch:{ ParseException -> 0x0017 }
            java.util.Date r2 = new java.util.Date     // Catch:{ ParseException -> 0x0015 }
            r2.<init>()     // Catch:{ ParseException -> 0x0015 }
            r1 = r2
            goto L_0x001c
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            r0 = r1
        L_0x0019:
            r2.printStackTrace()
        L_0x001c:
            long r2 = r0.getTime()
            long r0 = r1.getTime()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x002a
            r0 = 0
            return r0
        L_0x002a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.bankcard.CardScanner.OooO0Oo():boolean");
    }

    public void OooO0o0() {
        StringBuilder sb = new StringBuilder();
        sb.append("toggleFlash: currently ");
        String str = "ON";
        sb.append(m22017OooO0O0() ? str : "OFF");
        DebugLog.m22020OooO00o(sb.toString());
        m22016OooO00o(!m22017OooO0O0());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("toggleFlash - now ");
        if (!m22017OooO0O0()) {
            str = "OFF";
        }
        sb2.append(str);
        DebugLog.m22020OooO00o(sb2.toString());
    }

    public void OooO0OO() {
        m22016OooO00o(false);
        Camera camera = this.f23641OooO00o;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.f23641OooO00o.setPreviewDisplay(null);
            } catch (IOException unused) {
                DebugLog.OooO0o0("can't stop preview display");
            }
            this.f23641OooO00o.setPreviewCallback(null);
            this.f23641OooO00o.release();
            this.f23647OooO00o = null;
            DebugLog.m22020OooO00o("- released camera");
            this.f23641OooO00o = null;
        }
        ExecutorService executorService = this.f23646OooO00o;
        if (executorService != null && executorService.isShutdown()) {
            this.f23646OooO00o = null;
        }
        DebugLog.OooO0OO("scan paused");
    }

    public void OooO0O0(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        DebugLog.m22020OooO00o("Setting preview size: " + this.f23648OooO0O0);
        Point point = this.f23648OooO0O0;
        parameters.setPreviewSize(point.x, point.y);
        camera.setParameters(parameters);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m22019OooO0Oo() {
        DebugLog.OooO0Oo("prepareScanner()");
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        DebugLog.OooO0OO("CardScanner_prepareScanner1=" + System.currentTimeMillis());
        if (this.f23649OooO0O0 && this.f23641OooO00o == null) {
            Camera OooO00o2 = OooO00o(50, 5000);
            this.f23641OooO00o = OooO00o2;
            if (OooO00o2 == null) {
                DebugLog.OooO0O0("prepare scanner couldn't connect to camera!");
                return;
            }
            DebugLog.OooO0Oo("camera is connected");
            OooO00o((CardRecoActivity) this.f23644OooO00o, 0, this.f23641OooO00o);
            DebugLog.OooO0OO("CardScanner_prepareScanner2=" + System.currentTimeMillis());
            OooO00o(this.f23641OooO00o);
            Point point = this.f23639OooO00o;
            this.f23657o0ooOoO = point.y;
            this.o0OOO0o = point.x;
            Point point2 = this.f23648OooO0O0;
            this.o0ooOO0 = point2.x;
            int i = point2.y;
            this.f23656o0ooOOo = i;
            if (i < 720) {
                this.f23655OooO0o0 = true;
            }
            OooO0O0(this.f23641OooO00o);
            DebugLog.OooO0OO("CardScanner_prepareScanner3=" + System.currentTimeMillis());
        } else if (!this.f23649OooO0O0) {
            DebugLog.OooO0o0("useCamera is false!");
        } else if (this.f23641OooO00o != null) {
            DebugLog.OooO0Oo("we already have a camera instance: " + this.f23641OooO00o);
        }
    }

    public void OooO0O0() {
        if (this.f23641OooO00o != null) {
            OooO0OO();
        }
        this.f23647OooO00o = null;
    }

    private boolean OooO0O0(SurfaceHolder surfaceHolder) {
        DebugLog.m22020OooO00o("surfaceFrame: " + String.valueOf(surfaceHolder.getSurfaceFrame()));
        if (!this.f23649OooO0O0) {
            return true;
        }
        try {
            this.f23641OooO00o.setPreviewDisplay(surfaceHolder);
            try {
                this.f23641OooO00o.startPreview();
                this.f23641OooO00o.autoFocus(this);
                DebugLog.m22020OooO00o("startPreview success");
                return true;
            } catch (RuntimeException unused) {
                DebugLog.OooO0O0("startPreview failed on camera. Error: ");
                return false;
            }
        } catch (IOException unused2) {
            DebugLog.OooO0O0("can't set preview display");
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22014OooO00o() {
        this.f23646OooO00o = Executors.newFixedThreadPool(1);
    }

    public void OooO00o(Camera camera) {
        this.o00oO0O = camera.getParameters().getPreviewFormat();
        ((WindowManager) this.f23638OooO00o.getSystemService("window")).getDefaultDisplay();
        this.f23639OooO00o = OooO00o();
        List<Camera.Size> supportedPreviewSizes = this.f23641OooO00o.getParameters().getSupportedPreviewSizes();
        this.f23645OooO00o = supportedPreviewSizes;
        Point point = this.f23639OooO00o;
        int i = point.y;
        int i2 = point.x;
        if (i > i2) {
            this.f23648OooO0O0 = OooO00o(supportedPreviewSizes, i, i2);
        } else {
            this.f23648OooO0O0 = OooO00o(supportedPreviewSizes, i2, i);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m22018OooO0OO() {
        return this.f23655OooO0o0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m22017OooO0O0() {
        if (!this.f23649OooO0O0) {
            return false;
        }
        return this.f23641OooO00o.getParameters().getFlashMode().equals("torch");
    }

    private Point OooO00o() {
        Display defaultDisplay = ((WindowManager) this.f23638OooO00o.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 14 && i3 < 17) {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        } else if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
            i2 = point.x;
        }
        return new Point(i2, i);
    }

    private Point OooO00o(List<Camera.Size> list, int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            double d6 = (double) size2.width;
            double d7 = (double) size2.height;
            Double.isNaN(d6);
            Double.isNaN(d7);
            if (Math.abs((d6 / d7) - d3) <= 0.1d && ((double) Math.abs(size2.height - i2)) < d5) {
                d5 = (double) Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            Iterator<Camera.Size> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size next = it.next();
                if (next.height == 1080 && next.width == 1920) {
                    float f = (float) ((i * 1080) / i2);
                    if (f > 1920.0f) {
                        this.f23653OooO0Oo = 1920.0f / f;
                    } else {
                        this.f23653OooO0Oo = 1.0f;
                    }
                    size = next;
                } else if (((double) Math.abs(next.height - i2)) < d4) {
                    d4 = (double) Math.abs(next.height - i2);
                    size = next;
                }
            }
        }
        return new Point(size.width, size.height);
    }

    private Camera OooO00o(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f23649OooO0O0) {
            do {
                try {
                    return Camera.open(0);
                } catch (RuntimeException unused) {
                    try {
                        DebugLog.OooO0o0("Wasn't able to connect to camera service. Waiting and trying again...");
                        Thread.sleep((long) i);
                    } catch (InterruptedException unused2) {
                        DebugLog.OooO0O0("Interrupted while waiting for camera");
                    }
                } catch (Exception unused3) {
                    DebugLog.OooO0O0("Unexpected exception. Please report it to support@card.io");
                    i2 = 0;
                }
            } while (System.currentTimeMillis() - currentTimeMillis >= ((long) i2));
            DebugLog.OooO0o0("camera connect timeout");
            return null;
        }
        DebugLog.OooO0o0("camera connect timeout");
        return null;
        if (System.currentTimeMillis() - currentTimeMillis >= ((long) i2)) {
            DebugLog.OooO0o0("camera connect timeout");
            return null;
        }
    }

    public void OooO00o(Activity activity, int i, Camera camera) {
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i3 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i3) + 360) % 360;
        }
        if (camera != null) {
            camera.setDisplayOrientation(i2);
        }
    }

    public boolean OooO00o(SurfaceHolder surfaceHolder) {
        DebugLog.OooO0OO("CardScanner_resumeScanning1=" + System.currentTimeMillis());
        DebugLog.OooO0Oo("resumeScanning(" + surfaceHolder + C3848l.f10402t);
        if (this.f23641OooO00o == null) {
            DebugLog.OooO0Oo("preparing the scanner...");
            m22019OooO0Oo();
            DebugLog.OooO0Oo("preparations complete");
        }
        if (!this.f23649OooO0O0 || this.f23641OooO00o != null) {
            this.OooO0o = false;
            DebugLog.OooO0OO("CardScanner_resumeScanning2=" + System.currentTimeMillis());
            if (this.f23646OooO00o == null) {
                m22014OooO00o();
            }
            OooO0oo = false;
            OooO0oO = false;
            if (this.f23649OooO0O0 && this.f23647OooO00o == null) {
                byte[] bArr = new byte[(this.o0ooOO0 * this.f23656o0ooOOo * (ImageFormat.getBitsPerPixel(this.f23641OooO00o.getParameters().getPreviewFormat()) / 8) * 3)];
                this.f23647OooO00o = bArr;
                this.f23641OooO00o.addCallbackBuffer(bArr);
            }
            surfaceHolder.addCallback(this);
            surfaceHolder.setType(3);
            if (this.f23649OooO0O0) {
                this.f23641OooO00o.setPreviewCallbackWithBuffer(this);
            }
            if (this.f23651OooO0OO) {
                OooO0O0(surfaceHolder);
            }
            DebugLog.OooO0OO("CardScanner_resumeScanning3=" + System.currentTimeMillis());
            DebugLog.OooO0OO("CardScanner_resumeScanning4=" + System.currentTimeMillis());
            return true;
        }
        DebugLog.OooO0OO("null camera. failure");
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean OooO00o(String str) {
        String[] strArr = {"中国银行", "中国工商银行", "中国建设银行", "中国民生银行", "招商银行", "中国农业银行", "中国邮政储蓄银行有限责任公司", "中信银行", "中国光大银行", "华夏银行", "广东发展银行", "平安银行股份有限公司", "兴业银行", "上海浦东发展银行"};
        for (int i = 0; i < 14; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public Rect OooO00o(int i, int i2, int i3) {
        Rect rect;
        Rect rect2;
        Rect rect3 = new Rect();
        if (m22018OooO0OO()) {
            int i4 = (i3 * 80) / 100;
            int i5 = (int) (((float) i4) * 0.63084f);
            if (i2 < i5) {
                i5 = (i2 * 90) / 100;
                i4 = (int) (((float) i5) / 0.63084f);
            }
            int i6 = (i2 - i5) / 2;
            int i7 = (i3 - i4) / 2;
            int i8 = i5 + i6;
            int i9 = i4 + i7;
            if (i > 100) {
                rect2 = new Rect(i7, i6, i9, i8);
            } else {
                rect2 = new Rect(i6, i7, i8, i9);
            }
            return rect2;
        }
        if (this.f23654OooO0Oo) {
            i = BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft ? 4 : 1;
        }
        if (i == 1 || i == 2) {
            int i10 = (i2 * 90) / 100;
            int i11 = (int) (((float) i10) * 0.63084f);
            if (i3 < i11) {
                i11 = (i3 * 90) / 100;
                i10 = (int) (((float) i11) / 0.63084f);
            }
            int i12 = (i2 - i10) / 2;
            int i13 = (i3 - i11) / 2;
            rect = new Rect(i12, i13, i10 + i12, i11 + i13);
        } else if (i == 3 || i == 4) {
            int i14 = (i3 * 618) / 1000;
            int i15 = (int) (((float) i14) * 0.63084f);
            if (i2 < i15) {
                i15 = (i2 * 90) / 100;
                i14 = (int) (((float) i15) / 0.63084f);
            }
            int i16 = (i2 - i15) / 2;
            int i17 = (i3 - i14) / 2;
            rect = new Rect(i16, i17, i15 + i16, i14 + i17);
        } else {
            switch (i) {
                case 101:
                case 102:
                    int i18 = (i2 * 90) / 100;
                    int i19 = (int) (((float) i18) * 0.63084f);
                    if (i3 < i19) {
                        i19 = (i3 * 90) / 100;
                        i18 = (int) (((float) i19) / 0.63084f);
                    }
                    int i20 = (i2 - i18) / 2;
                    int i21 = (i3 - i19) / 2;
                    rect = new Rect(i21, i20, i19 + i21, i18 + i20);
                    break;
                case 103:
                case 104:
                    int i22 = (i3 * 618) / 1000;
                    int i23 = (int) (((float) i22) * 0.63084f);
                    if (i2 < i23) {
                        i23 = (i2 * 90) / 100;
                        i22 = (int) (((float) i23) / 0.63084f);
                    }
                    int i24 = (i2 - i23) / 2;
                    int i25 = (i3 - i22) / 2;
                    rect = new Rect(i25, i24, i22 + i25, i23 + i24);
                    break;
                default:
                    return rect3;
            }
        }
        return rect;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rect m22012OooO00o() {
        int i = this.o0Oo0oo;
        Point point = this.f23639OooO00o;
        return OooO00o(i, point.x, point.y);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rect m22013OooO00o(int i, int i2) {
        return OooO00o(this.o0Oo0oo, i, i2);
    }

    public void OooO00o(int i) {
        this.o0Oo0oo = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m22010OooO00o() {
        return this.o0Oo0oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m22015OooO00o() {
        return this.OooO0O0 < this.OooO00o;
    }

    public void OooO00o(boolean z) {
        if (this.f23649OooO0O0 && !m22015OooO00o()) {
            try {
                this.OooO00o = System.currentTimeMillis();
                this.f23641OooO00o.autoFocus(this);
            } catch (RuntimeException e) {
                DebugLog.OooO0o0("could not trigger auto focus: " + e);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m22016OooO00o(boolean z) {
        if (this.f23641OooO00o == null) {
            return false;
        }
        DebugLog.m22020OooO00o("setFlashOn: " + z);
        try {
            Camera.Parameters parameters = this.f23641OooO00o.getParameters();
            parameters.setFlashMode(z ? "torch" : "off");
            this.f23641OooO00o.setParameters(parameters);
            return true;
        } catch (RuntimeException e) {
            DebugLog.OooO0o0("Could not set flashbank mode: " + e);
            return false;
        }
    }

    public static Bitmap OooO00o(byte[] bArr, int i, int i2, int i3, Rect rect) {
        if (i3 != 17 && i3 != 20) {
            return null;
        }
        YuvImage yuvImage = new YuvImage(bArr, i3, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 100, byteArrayOutputStream);
        return BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
    }

    public static Bitmap OooO00o(byte[] bArr, int i, int i2, int i3, Rect rect, int i4) {
        int width = rect.width();
        int height = rect.height();
        if ((i3 != 17 && i3 != 20) || width <= 0 || height <= 0) {
            return null;
        }
        int[] iArr = new int[(width * height)];
        int i5 = rect.top;
        int i6 = rect.left;
        int i7 = (i5 * i) + i6;
        int i8 = ((i5 / 2) * i) + ((i6 / 2) * 2) + (i * i2);
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (i9 >= height) {
                break;
            }
            int i11 = i9 * width;
            int i12 = 0;
            while (i12 < width) {
                int i13 = ((i12 >> 1) << i10) + i8;
                int i14 = (bArr[i13] & 255) + C7490o0OoOO0o.OooO0oO;
                int i15 = (bArr[i13 + i10] & 255) + C7490o0OoOO0o.OooO0oO;
                int i16 = ((bArr[i7 + i12] & 255) - 16) * 1192;
                int i17 = (i14 * 1634) + i16;
                int i18 = (i16 - (i14 * 833)) - (i15 * 400);
                int i19 = i16 + (i15 * 2066);
                if (i17 < 0) {
                    i17 = 0;
                } else if (i17 > 262143) {
                    i17 = i111I.OooO0OO;
                }
                if (i18 < 0) {
                    i18 = 0;
                } else if (i18 > 262143) {
                    i18 = i111I.OooO0OO;
                }
                if (i19 < 0) {
                    i19 = 0;
                } else if (i19 > 262143) {
                    i19 = i111I.OooO0OO;
                }
                iArr[i11 + i12] = ((i17 << 6) & C7265o0O000oo.OooOo0O) | -16777216 | ((i18 >> 2) & 65280) | ((i19 >> 10) & 255);
                i12++;
                i10 = 1;
            }
            i7 += i;
            if (((rect.top + i9) & 1) == 1) {
                i8 += i;
            }
            i9++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        if (i4 == 1) {
            return createBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate((float) (i4 == 2 ? 180 : i4 == 3 ? 90 : 0));
        return Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
    }

    private float OooO00o(byte[] bArr, int i, int i2) {
        int i3 = i2 / 2;
        int i4 = i2 / 4;
        int i5 = i3 - i4;
        int i6 = i3 + i4;
        int i7 = i / 2;
        int i8 = i / 4;
        int i9 = i7 - i8;
        int i10 = i7 + i8;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i5; i13 < i6; i13++) {
            int i14 = (i13 * i) + i9;
            int i15 = i9;
            while (i15 < i10) {
                int i16 = i14 - i;
                int i17 = i14 + i;
                int abs = Math.abs((((bArr[i16 - 1] & 255) + (bArr[i17 + 1] & 255)) - (bArr[i16 + 1] & 255)) - (bArr[i17 - 1] & 255));
                i11 += abs;
                i12 += abs * abs;
                i15++;
                i14++;
            }
        }
        float f = (float) ((i10 - i9) * (i6 - i5));
        double d = (double) ((((float) i11) * 1.0f) / f);
        double d2 = (double) ((((float) i12) * 1.0f) / f);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        return (float) Math.sqrt(d2 - (d * d));
    }

    private void OooO00o(Bitmap bitmap) {
        DebugLog.OooO0O0("保存图片");
        String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        File file = new File(Environment.getExternalStorageDirectory() + File.separator + Environment.DIRECTORY_DCIM + File.separator + format + "_.jpg");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            DebugLog.OooO0OO("已经保存");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m22009OooO00o(byte[] bArr, int i, int i2) {
        String str = Environment.getExternalStorageDirectory() + File.separator + Environment.DIRECTORY_DCIM + File.separator + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date()) + "_.jpg";
        Rect rect = new Rect(0, 0, i, i2);
        if (this.o00oO0O == 17) {
            YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                yuvImage.compressToJpeg(rect, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void OooO00o(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i4 * i;
        for (int i9 = i3; i9 < i5; i9++) {
            bArr[i8 + i9] = 0;
        }
        while (true) {
            i4++;
            if (i4 >= i6) {
                break;
            }
            bArr[i8 + i3] = 0;
            bArr[i8 + i5] = 0;
            i8 += i;
        }
        int i10 = i6 * i;
        while (i3 < i5) {
            bArr[i10 + i3] = 0;
            i3++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m22011OooO00o() {
        if (this.f23652OooO0OO == null) {
            return null;
        }
        DebugLog.OooO0OO("数据不为空" + this.f23652OooO0OO.length);
        try {
            YuvImage yuvImage = new YuvImage(this.f23652OooO0OO, 17, this.o0ooOO0, this.f23656o0ooOOo, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, this.o0ooOO0, this.f23656o0ooOOo), 80, byteArrayOutputStream);
            return BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        } catch (Exception unused) {
            return null;
        }
    }
}
