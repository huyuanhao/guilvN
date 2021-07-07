package exocr.bankcard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.umeng.commonsdk.proguard.C3617o;
import exocr.bankcard.BankManager;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import s.h.e.l.l.C;

public final class CardRecoActivity extends Activity implements SDKDataCallBack {
    public static Bitmap OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f23615OooO00o = {0, 70, 10, 40};
    public static final /* synthetic */ boolean OooO0o = false;
    public static final int o00000 = 10;
    public static final int o000000 = 2;
    public static final int o000000O = -75;
    public static int o000000o = 0;
    public static final int o00000O = 1001;
    public static final int o00000O0 = 4132;
    public static final int o00000OO = 1002;
    public static final int o00000Oo = 1003;
    public static final int o00000o0 = 1004;
    public static final int o00000oO = 1006;
    public static final int o00000oo = 1007;
    public static final int o0000Ooo = 1005;
    public static final int o000OOo = 1;
    public static final int o0O0O00;
    public static final int o0OO00O;
    public static final int o0OOO0o = 13274384;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static String f23616o0OOO0o = "EXBankCardRec";
    public static final int o0Oo0oo;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static String f23617o0Oo0oo = "EXOCR_BANKCARD_SIG_20150327";
    public static final int o0ooOOo = 15;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f23618o0ooOOo = CardRecoActivity.class.getSimpleName();
    public static int o0ooOoO;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static String f23619o0ooOoO = "2.0.1.1";
    public static final int oo0o0Oo;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Sensor f23621OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorEventListener f23622OooO00o = new SensorEventListener() {
        /* class exocr.bankcard.CardRecoActivity.C47082 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float f = sensorEvent.values[0];
            if (f <= CardRecoActivity.this.OooO0Oo && CardRecoActivity.this.OooO0o0 && !BankManager.OooO00o().OooOOOO()) {
                CardRecoActivity.this.OooO0o0 = false;
                CardRecoActivity.this.OooO0o();
            }
            if (BankManager.OooO00o().OooOOOO()) {
                BankManager.OooO00o().OooO00o(f);
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorManager f23623OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23624OooO00o = new Handler() {
        /* class exocr.bankcard.CardRecoActivity.HandlerC47061 */

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1001) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CardRecoActivity.this);
                builder.setTitle("相机权限\n");
                builder.setMessage("权限受限，请手动添加相机权限");
                builder.setCancelable(false);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    /* class exocr.bankcard.CardRecoActivity.HandlerC47061.DialogInterface$OnClickListenerC47071 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (!BankManager.OooO00o().OooOOOO()) {
                            BankManager.OooO00o().m21982OooO00o();
                        }
                        CardRecoActivity.this.finish();
                    }
                });
                builder.create().show();
            } else if (i == 1002) {
                BankManager.OooO00o().OooO0o0(1);
                BankManager.OooO00o().OooO00o(new EXBankCardInfo());
                if (BankManager.OooO00o().OooOOOO()) {
                    BankManager.OooO00o().m21992OooO0OO();
                }
                CardRecoActivity.this.finish();
            } else if (i == 1003) {
                CardRecoActivity.this.f23631OooO00o.m22016OooO00o(((Boolean) message.obj).booleanValue());
            } else if (i == 1004) {
                if (BankManager.OooO00o().OooOO0o()) {
                    CardRecoActivity.this.m22004OooO0O0();
                }
            } else if (i == 1005) {
                if (BankManager.OooO00o().OooOO0o()) {
                    CardRecoActivity.this.OooO();
                }
            } else if (i == 1006) {
                CardRecoActivity.this.OooO0Oo();
            } else if (i == 1007) {
                CardRecoActivity.this.OooO0o0();
                if (BankManager.OooO00o().OooOOOO()) {
                    if (CardRecoActivity.this.f23631OooO00o != null) {
                        Bitmap OooO00o2 = CardRecoActivity.this.f23631OooO00o.m22011OooO00o();
                        if (OooO00o2 != null) {
                            BankManager.OooO00o().OooO00o(OooO00o2);
                        } else {
                            BankManager.OooO00o().OooO00o((Bitmap) null);
                        }
                    }
                } else if (CardRecoActivity.this.f23631OooO00o != null) {
                    Bitmap OooO00o3 = CardRecoActivity.this.f23631OooO00o.m22011OooO00o();
                    if (OooO00o3 != null) {
                        BankManager.OooO00o().OooO0o0(-2);
                        EXBankCardInfo eXBankCardInfo = new EXBankCardInfo();
                        eXBankCardInfo.f23661OooO00o = OooO00o3;
                        BankManager.OooO00o().OooO00o(eXBankCardInfo);
                        BankManager.OooO00o().m21982OooO00o();
                        CardRecoActivity.this.finish();
                        return;
                    }
                    BankManager.OooO00o().OooO0o0(-2);
                    EXBankCardInfo eXBankCardInfo2 = new EXBankCardInfo();
                    eXBankCardInfo2.f23661OooO00o = null;
                    BankManager.OooO00o().OooO00o(eXBankCardInfo2);
                    BankManager.OooO00o().m21982OooO00o();
                    CardRecoActivity.this.finish();
                }
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public OrientationEventListener f23625OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f23626OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FrameLayout f23627OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow f23628OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f23629OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BankPhoto f23630OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CardScanner f23631OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXBankCardInfo f23632OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OverlayView f23633OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Preview f23634OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Timer f23635OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TimerTask f23636OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO;
    public float OooO0Oo = 5.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23637OooO0Oo;
    public boolean OooO0o0 = false;
    public int o00oO0O;
    public int o0ooOO0;

    static {
        C.i(50331763);
        o0ooOoO = 13274384;
        int i = 13274384 + 1;
        o0ooOoO = i;
        int i2 = i + 1;
        o0ooOoO = i2;
        o0Oo0oo = i;
        int i3 = i2 + 1;
        o0ooOoO = i3;
        o0OO00O = i2;
        int i4 = i3 + 1;
        o0ooOoO = i4;
        oo0o0Oo = i3;
        o0ooOoO = i4 + 1;
        o0O0O00 = i4;
        o000000o = 10;
        o000000o = 10 + 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO();

    @Override // exocr.bankcard.SDKDataCallBack
    private native int OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static native String m22001OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static native Date m22002OooO00o();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO00o(int i);

    private native void OooO00o(Exception exc);

    private native void OooO00o(String str);

    public static native boolean OooO00o(Context context);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static native String m22003OooO0O0();

    private native void OooO0O0(int i);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO0O0  reason: collision with other method in class */
    private native boolean m22004OooO0O0();

    private native void OooO0OO(int i);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0oo() {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.bankcard.CardRecoActivity.OooO0oo():void");
    }

    private void OooOO0() {
        DebugLog.OooO0OO("CardRecoActivity_setPreviewLayout1=" + System.currentTimeMillis());
        FrameLayout frameLayout = new FrameLayout(this);
        this.f23627OooO00o = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f23627OooO00o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CardScanner cardScanner = this.f23631OooO00o;
        Preview preview = new Preview(this, null, cardScanner.f23657o0ooOoO, cardScanner.o0OOO0o);
        this.f23634OooO00o = preview;
        preview.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        this.f23627OooO00o.addView(this.f23634OooO00o);
        TextView textView = new TextView(this);
        this.f23629OooO00o = textView;
        textView.setText("");
        this.f23629OooO00o.setTextColor(-65536);
        this.f23629OooO00o.setTextSize(14.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 85);
        layoutParams.setMargins(0, 0, 0, 100);
        this.f23629OooO00o.setRotation(90.0f);
        this.f23629OooO00o.setLayoutParams(layoutParams);
        this.f23627OooO00o.addView(this.f23629OooO00o);
        View OooO00o2 = BankManager.OooO00o().m21979OooO00o();
        this.f23626OooO00o = OooO00o2;
        if (OooO00o2 == null || !BankManager.OooO00o().OooOOOO()) {
            OverlayView overlayView = new OverlayView(this, null, OooO00o((Context) this));
            this.f23633OooO00o = overlayView;
            overlayView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            DebugLog.OooO0OO("CardRecoActivity_setPreviewLayout1=" + System.currentTimeMillis());
            this.f23627OooO00o.addView(this.f23633OooO00o);
        } else {
            this.f23626OooO00o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
            if (this.f23627OooO00o.indexOfChild(this.f23626OooO00o) == -1) {
                this.f23627OooO00o.addView(this.f23626OooO00o);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(134217728, 134217728);
        }
        DebugLog.OooO0OO("CardRecoActivity_setPreviewLayout1=" + System.currentTimeMillis());
        setContentView(this.f23627OooO00o);
    }

    @Override // exocr.bankcard.SDKDataCallBack
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native Handler m22005OooO00o();

    public native void OooO00o(boolean z);

    @Override // exocr.bankcard.SDKDataCallBack
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native boolean m22007OooO00o();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public native void m22008OooO0O0();

    public void OooO0OO() {
        Timer timer = this.f23635OooO00o;
        if (timer != null) {
            timer.cancel();
            this.f23635OooO00o = null;
        }
        TimerTask timerTask = this.f23636OooO00o;
        if (timerTask != null) {
            timerTask.cancel();
            this.f23636OooO00o = null;
        }
        this.f23636OooO00o = new TimerTask() {
            /* class exocr.bankcard.CardRecoActivity.C47137 */

            public void run() {
                CardRecoActivity.this.f23624OooO00o.sendMessage(CardRecoActivity.this.f23624OooO00o.obtainMessage(1007));
            }
        };
        Timer timer2 = new Timer();
        this.f23635OooO00o = timer2;
        timer2.schedule(this.f23636OooO00o, BankManager.OooO00o().m21976OooO00o());
    }

    public native void OooO0Oo();

    public native void OooO0o();

    public native void OooO0o0();

    public native void OooO0oO();

    public native void onActivityResult(int i, int i2, Intent intent);

    public void onBackPressed() {
        DebugLog.m22020OooO00o("CardRecoActivity.onBackPressed()");
        if (!BankManager.OooO00o().OooOOOO() && this.f23633OooO00o.OooO00o()) {
            try {
                m22004OooO0O0();
            } catch (RuntimeException e) {
                DebugLog.OooO0o0("*** could not return to preview: " + e);
            }
        }
        super.onBackPressed();
        if (!BankManager.OooO00o().OooOOOO()) {
            BankManager.OooO00o().OooO0o0(1);
            BankManager.OooO00o().m21982OooO00o();
        } else {
            BankManager.OooO00o().m21992OooO0OO();
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().addFlags(256);
        getWindow().addFlags(512);
        BankManager.OooO00o().OooO00o(this);
        if (BankManager.OooO00o().m21987OooO0O0() == null) {
            BankManager.OooO00o().m21984OooO00o(getApplicationContext().getPackageName());
        }
        if (BankManager.OooO00o().OooOOOO()) {
            if (BankManager.OooO00o().OooOO0O()) {
                StatusBarUtil.OooO0O0(this);
            } else {
                StatusBarUtil.OooO00o(this);
            }
        }
        boolean OooOOOo = BankManager.OooO00o().OooOOOo();
        this.f23637OooO0Oo = OooOOOo;
        if (OooOOOo) {
            try {
                this.OooO0OO = false;
                this.f23620OooO00o = new Rect();
                this.o00oO0O = -1;
                if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft) {
                    this.o0ooOO0 = 4;
                } else {
                    this.o0ooOO0 = 1;
                }
                CardScanner cardScanner = new CardScanner(this, this.o0ooOO0);
                this.f23631OooO00o = cardScanner;
                cardScanner.m22019OooO0Oo();
                OooOO0();
                this.f23625OooO00o = new OrientationEventListener(this, 2) {
                    /* class exocr.bankcard.CardRecoActivity.C47093 */

                    public void onOrientationChanged(int i) {
                        if (BankManager.OooO00o().OooOOOO()) {
                            if (i >= 0 && CardRecoActivity.this.f23631OooO00o != null) {
                                int OooO0O0 = i + CardRecoActivity.this.OooO0O0();
                                while (OooO0O0 > 360) {
                                    OooO0O0 -= 360;
                                }
                                if (OooO0O0 < 15 || OooO0O0 > 345) {
                                    CardRecoActivity.this.o0ooOO0 = 1;
                                } else if (OooO0O0 > 75 && OooO0O0 < 105) {
                                    CardRecoActivity.this.o0ooOO0 = 4;
                                } else if (OooO0O0 > 165 && OooO0O0 < 195) {
                                    CardRecoActivity.this.o0ooOO0 = 1;
                                } else if (OooO0O0 > 255 && OooO0O0 < 285) {
                                    CardRecoActivity.this.o0ooOO0 = 3;
                                }
                                if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft) {
                                    CardRecoActivity.this.f23631OooO00o.OooO00o(3);
                                    BankManager.OooO00o().m21983OooO00o(3);
                                } else if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyPortrait) {
                                    CardRecoActivity.this.f23631OooO00o.OooO00o(1);
                                    BankManager.OooO00o().m21983OooO00o(1);
                                } else {
                                    CardRecoActivity.this.f23631OooO00o.OooO00o(CardRecoActivity.this.o0ooOO0);
                                    BankManager.OooO00o().m21983OooO00o(CardRecoActivity.this.o0ooOO0);
                                }
                            }
                        } else if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft) {
                            CardRecoActivity.this.OooO00o((CardRecoActivity) 270);
                        } else if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyPortrait) {
                            CardRecoActivity.this.OooO00o((CardRecoActivity) 0);
                        } else {
                            CardRecoActivity.this.OooO00o((CardRecoActivity) i);
                        }
                    }
                };
                if (BankManager.OooO00o().m21993OooO0OO()) {
                    SensorManager sensorManager = (SensorManager) getSystemService(C3617o.f9339Z);
                    this.f23623OooO00o = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                    this.f23621OooO00o = defaultSensor;
                    this.f23623OooO00o.registerListener(this.f23622OooO00o, defaultSensor, 0);
                    this.OooO0o0 = true;
                }
                OooO0oo();
            } catch (Exception e) {
                OooO00o(e);
            }
            if (!EXBankCardReco.f23670OooO00o) {
                this.f23633OooO00o = new OverlayView(this, null, false);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("识别核心初始化失败\n");
                builder.setMessage("请检查识别核心授权是否过期");
                builder.setCancelable(false);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    /* class exocr.bankcard.CardRecoActivity.DialogInterface$OnClickListenerC47104 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        BankManager.OooO00o().OooO0o0(-1);
                        if (!BankManager.OooO00o().OooOOOO()) {
                            BankManager.OooO00o().m21982OooO00o();
                        } else {
                            BankManager.OooO00o().m21992OooO0OO();
                        }
                        CardRecoActivity.this.finish();
                    }
                });
                builder.create().show();
            }
            if (BankManager.OooO00o().OooOOO()) {
                OooO0OO();
            }
        } else if (!BankManager.OooO00o().OooOOOO()) {
            this.f23633OooO00o = new OverlayView(this, null, false);
            this.f23624OooO00o.postDelayed(new Runnable() {
                /* class exocr.bankcard.CardRecoActivity.RunnableC47115 */

                public void run() {
                    CardRecoActivity.this.f23624OooO00o.obtainMessage(1001).sendToTarget();
                }
            }, 100);
        } else {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle("相机权限\n");
            builder2.setMessage("权限受限，请手动添加相机权限");
            builder2.setCancelable(false);
            builder2.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                /* class exocr.bankcard.CardRecoActivity.DialogInterface$OnClickListenerC47126 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    BankManager.OooO00o().m21992OooO0OO();
                    CardRecoActivity.this.finish();
                }
            });
            builder2.create().show();
        }
    }

    public native void onDestroy();

    public native void onPause();

    public void onResume() {
        super.onResume();
        if (this.f23637OooO0Oo && !this.OooO0OO) {
            DebugLog.OooO0OO("onResume() ----------------------------------------------------------");
            DebugLog.OooO0OO("CardRecoActivity_onResume1=" + System.currentTimeMillis());
            if (!BankManager.OooO00o().OooOOOO()) {
                getWindow().addFlags(1024);
                getWindow().addFlags(128);
            } else if (!BankManager.OooO00o().OooOO0()) {
                getWindow().addFlags(1024);
                getWindow().addFlags(128);
            }
            setRequestedOrientation(1);
            OrientationEventListener orientationEventListener = this.f23625OooO00o;
            if (orientationEventListener != null) {
                orientationEventListener.enable();
            }
            DebugLog.OooO0OO("CardRecoActivity_onResume2=" + System.currentTimeMillis());
            if (!m22004OooO0O0()) {
                DebugLog.OooO0O0("Could not connect to camera.");
                OooO00o("ERROR_CAMERA_UNEXPECTED_FAIL");
            } else {
                OooO00o(false);
            }
            DebugLog.OooO0OO("CardRecoActivity_onResume3=" + System.currentTimeMillis());
        }
        OooO00o(this.o00oO0O);
    }

    @Override // exocr.bankcard.SDKDataCallBack
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22006OooO00o() {
        DebugLog.m22020OooO00o("mFirstPreviewFrame");
        if (!BankManager.OooO00o().OooOOOO()) {
            SurfaceView OooO00o2 = this.f23634OooO00o.m22021OooO00o();
            int left = OooO00o2.getLeft();
            int top = OooO00o2.getTop();
            int right = OooO00o2.getRight();
            int bottom = OooO00o2.getBottom();
            OooO00o2.getWidth();
            OooO00o2.getHeight();
            DebugLog.OooO0OO("CardRecoActivity_InvalidateOverlapView=" + System.currentTimeMillis());
            this.f23620OooO00o = this.f23631OooO00o.m22012OooO00o();
            OooO00o2.getWidth();
            int i = this.f23631OooO00o.f23657o0ooOoO;
            this.f23620OooO00o.offset(left, top);
            OverlayView overlayView = this.f23633OooO00o;
            if (overlayView != null) {
                overlayView.OooO00o(new Rect(left, top, right, bottom));
                if (m22007OooO00o()) {
                    this.f23633OooO00o.OooO00o(this.f23620OooO00o, 270);
                } else if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft) {
                    this.f23633OooO00o.OooO00o(this.f23620OooO00o, 270);
                } else {
                    this.f23633OooO00o.OooO00o(this.f23620OooO00o, 0);
                }
                this.f23633OooO00o.invalidate();
            }
        } else if (BankManager.OooO00o().m21980OooO00o() == BankManager.supportOrientations.onlyLandscapeLeft) {
            BankManager.OooO00o().m21983OooO00o(3);
        } else {
            BankManager.OooO00o().m21983OooO00o(this.f23631OooO00o.m22010OooO00o());
        }
    }

    @Override // exocr.bankcard.SDKDataCallBack
    public void OooO00o(boolean z, EXBankCardInfo eXBankCardInfo) {
        DebugLog.m22020OooO00o("processDetections");
        try {
            ((Vibrator) getSystemService("vibrator")).vibrate(f23615OooO00o, -1);
        } catch (SecurityException unused) {
            DebugLog.OooO0O0("Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        } catch (Exception unused2) {
            DebugLog.OooO0o0("Exception while attempting to vibrate: ");
        }
        DebugLog.OooO0OO("CardRecoActivity_onCardDetected1=" + System.currentTimeMillis());
        if (eXBankCardInfo.o00oO0O > 0) {
            this.f23632OooO00o = eXBankCardInfo;
            DebugLog.OooO0OO("CardRecoActivity_onCardDetected2=" + System.currentTimeMillis());
            BankManager.OooO00o().OooO00o(this.f23632OooO00o);
            BankManager.OooO00o().OooO0o0(0);
            this.f23632OooO00o = null;
            if (!BankManager.OooO00o().OooOOOO()) {
                BankManager.OooO00o().m21982OooO00o();
                finish();
                return;
            }
            OooO0o0();
            BankManager.OooO00o().OooO0O0(true);
            return;
        }
        this.f23632OooO00o = eXBankCardInfo;
        BankManager.OooO00o().OooO00o(this.f23632OooO00o);
        BankManager.OooO00o().OooO0o0(-1);
        this.f23632OooO00o = null;
        if (!BankManager.OooO00o().OooOOOO()) {
            BankManager.OooO00o().m21982OooO00o();
            finish();
            return;
        }
        BankManager.OooO00o().OooO0O0(false);
    }
}
