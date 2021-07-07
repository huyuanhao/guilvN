package exocr.idcard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p118pd.sdk.C7265o0O000oo;
import com.p118pd.sdk.C7748o0oooOOo;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.commonsdk.proguard.C3617o;
import exocr.exocrengine.DictManager;
import exocr.exocrengine.EXIDCardResult;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import s.h.e.l.l.C;

public class CaptureActivity extends Activity implements SurfaceHolder.Callback {
    public static final long OooO00o = 200;
    public static final float OooO0o0 = 0.1f;
    public static final int o00000 = 1007;
    public static final int o000000 = 1004;

    /* renamed from: o000000  reason: collision with other field name */
    public static final String f23727o000000 = "ShouldFront";
    public static final int o000000O = 1005;
    public static final int o000000o = 1006;
    public static final int o000OOo = 1003;

    /* renamed from: o000OOo  reason: collision with other field name */
    public static final String f23728o000OOo = IDCardManager.OooO00o().m22059OooO0O0();
    public static final int o0O0O00 = 1002;

    /* renamed from: o0O0O00  reason: collision with other field name */
    public static final String f23729o0O0O00 = IDCardManager.OooO00o().m22067OooO0Oo();
    public static final int o0OO00O = 10;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f23730o0OO00O = IDCardManager.OooO00o().m22072OooO0o0();
    public static final int o0OOO0o = 4133;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f23731o0OOO0o = "exocr.idcard.scanResult";
    public static int o0Oo0oo = 0;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f23732o0Oo0oo = CaptureActivity.class.getSimpleName();
    public static final int oo0o0Oo = 1001;

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public static final String f23733oo0o0Oo = IDCardManager.OooO00o().m22063OooO0OO();
    public boolean OooO = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23734OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Camera.ShutterCallback f23735OooO00o = new Camera.ShutterCallback() {
        /* class exocr.idcard.CaptureActivity.C47262 */

        public void onShutter() {
            ((AudioManager) CaptureActivity.this.getSystemService("audio")).playSoundEffect(4);
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorEventListener f23736OooO00o = new SensorEventListener() {
        /* class exocr.idcard.CaptureActivity.C47273 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float f = sensorEvent.values[0];
            if (f <= CaptureActivity.this.OooO0Oo && CaptureActivity.this.OooO && !IDCardManager.OooO00o().m22061OooO0O0() && CaptureActivity.this.f23748OooO00o != null) {
                CaptureActivity.this.OooO = false;
                CaptureActivity.this.f23748OooO00o.setbLight(true);
                CameraManager.OooO00o().OooO0OO();
            }
            if (IDCardManager.OooO00o().m22061OooO0O0()) {
                IDCardManager.OooO00o().OooO00o(f);
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorManager f23737OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final MediaPlayer.OnCompletionListener f23738OooO00o = new MediaPlayer.OnCompletionListener() {
        /* class exocr.idcard.CaptureActivity.C472511 */

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public MediaPlayer f23739OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23740OooO00o = new Handler() {
        /* class exocr.idcard.CaptureActivity.HandlerC47221 */
        public static final /* synthetic */ boolean OooO00o = false;

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1001) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CaptureActivity.this);
                builder.setTitle("相机权限\n");
                builder.setMessage("权限受限，请手动添加相机权限");
                builder.setCancelable(false);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    /* class exocr.idcard.CaptureActivity.HandlerC47221.DialogInterface$OnClickListenerC47231 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        CaptureActivity.this.f23746OooO00o.OooO0O0(-1);
                        if (!CaptureActivity.this.f23746OooO00o.m22061OooO0O0()) {
                            CaptureActivity.this.f23746OooO00o.m22060OooO0O0();
                        } else {
                            CaptureActivity.this.f23746OooO00o.m22056OooO00o();
                        }
                        CaptureActivity.this.finish();
                    }
                });
                builder.create().show();
            } else if (i == 1003) {
                CaptureActivity.this.OooO0o0();
                if (IDCardManager.OooO00o().m22061OooO0O0()) {
                    CaptureActivity.this.f23746OooO00o.m22068OooO0Oo();
                    return;
                }
                CaptureActivity.this.f23746OooO00o.OooO0O0(-2);
                Bitmap OooO00o2 = CaptureActivity.this.f23745OooO00o.OooO00o();
                EXIDCardResult eXIDCardResult = new EXIDCardResult();
                eXIDCardResult.OooO00o = OooO00o2;
                CaptureActivity.this.f23746OooO00o.OooO00o(eXIDCardResult);
                if (!CaptureActivity.this.f23746OooO00o.m22061OooO0O0()) {
                    CaptureActivity.this.f23746OooO00o.m22060OooO0O0();
                } else {
                    CaptureActivity.this.f23746OooO00o.m22056OooO00o();
                }
                CaptureActivity.this.finish();
            } else if (i == 1002) {
                if (CaptureActivity.this.f23746OooO00o.m22061OooO0O0()) {
                    CaptureActivity.this.f23746OooO00o.m22056OooO00o();
                }
                CaptureActivity.this.finish();
            } else if (i == 1004) {
                CameraManager.OooO00o().OooO0Oo();
                CaptureActivity.this.f23745OooO00o.OooO0OO();
            } else if (i == 1005) {
                if (((Boolean) message.obj).booleanValue()) {
                    CaptureActivity.this.f23745OooO00o.m22047OooO00o();
                }
            } else if (i == 1006) {
                CaptureActivity.this.OooO0OO();
            } else if (i != 1007) {
            } else {
                if (((Boolean) message.obj).booleanValue()) {
                    CameraManager.OooO00o().OooO0OO();
                } else {
                    CameraManager.OooO00o().m22039OooO0O0();
                }
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f23741OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FrameLayout f23742OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow f23743OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f23744OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CaptureActivityHandler f23745OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IDCardManager f23746OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IDPhoto f23747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewfinderView f23748OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Timer f23749OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TimerTask f23750OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXIDCardResult[] f23751OooO00o = new EXIDCardResult[5];
    public Bitmap OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Timer f23752OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TimerTask f23753OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23754OooO0O0;
    public boolean OooO0OO;
    public float OooO0Oo = 5.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23755OooO0Oo;
    public boolean OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f23756OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public int o00oO0O = 102;
    public final int o0ooOO0 = 5;
    public int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f23757o0ooOOo = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/exidcard/");
    public int o0ooOoO = 0;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public final String f23758o0ooOoO = "/data/data/com.exidcard";

    static {
        C.i(50331764);
        o0Oo0oo = 10;
        o0Oo0oo = 10 + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0o() {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.idcard.CaptureActivity.OooO0o():void");
    }

    private void OooO0oO() {
        if (this.OooO0OO && this.f23739OooO00o == null) {
            setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f23739OooO00o = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f23739OooO00o.setOnCompletionListener(this.f23738OooO00o);
            AssetFileDescriptor openRawResourceFd = getResources().openRawResourceFd(ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "raw", "beep"));
            try {
                this.f23739OooO00o.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                this.f23739OooO00o.setVolume(0.1f, 0.1f);
                this.f23739OooO00o.prepare();
            } catch (IOException unused) {
                this.f23739OooO00o = null;
            }
        }
    }

    private void OooO0oo() {
        MediaPlayer mediaPlayer;
        if (this.OooO0OO && (mediaPlayer = this.f23739OooO00o) != null) {
            mediaPlayer.start();
        }
        if (this.f23755OooO0Oo) {
            ((Vibrator) getSystemService("vibrator")).vibrate(200);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native Handler m22042OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native ViewfinderView m22043OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native void m22044OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native boolean m22045OooO00o(EXIDCardResult eXIDCardResult);

    public native Handler OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public native void m22046OooO0O0();

    public native void OooO0OO();

    public void OooO0Oo() {
        Timer timer = this.f23752OooO0O0;
        if (timer != null) {
            timer.cancel();
            this.f23752OooO0O0 = null;
        }
        TimerTask timerTask = this.f23753OooO0O0;
        if (timerTask != null) {
            timerTask.cancel();
            this.f23753OooO0O0 = null;
        }
        this.f23753OooO0O0 = new TimerTask() {
            /* class exocr.idcard.CaptureActivity.C47328 */

            public void run() {
                CaptureActivity.this.f23740OooO00o.sendMessage(CaptureActivity.this.f23740OooO00o.obtainMessage(1003));
            }
        };
        Timer timer2 = new Timer();
        this.f23752OooO0O0 = timer2;
        timer2.schedule(this.f23753OooO0O0, IDCardManager.OooO00o().m22051OooO00o());
    }

    public native void OooO0o0();

    public native void onActivityResult(int i, int i2, Intent intent);

    public native void onBackPressed();

    public void onCreate(Bundle bundle) {
        setRequestedOrientation(0);
        super.onCreate(bundle);
        if (IDCardManager.OooO00o().m22055OooO00o() == null) {
            IDCardManager.OooO00o().OooO00o(getApplicationContext().getPackageName());
        }
        IDCardManager OooO00o2 = IDCardManager.OooO00o();
        this.f23746OooO00o = OooO00o2;
        OooO00o2.OooO00o(this);
        this.OooO0oo = m22040OooO00o();
        CameraManager.OooO00o(getApplication());
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(134217728, 134217728);
        }
        if (Build.VERSION.SDK_INT >= 17 && OooO00o() >= 4) {
            EXIDCardResult.OooO0O0 = true;
            DebugLog.m22048OooO00o("open double-check");
            Timer timer = this.f23749OooO00o;
            if (timer != null) {
                timer.cancel();
                this.f23749OooO00o = null;
            }
            TimerTask timerTask = this.f23750OooO00o;
            if (timerTask != null) {
                timerTask.cancel();
                this.f23750OooO00o = null;
            }
            this.f23750OooO00o = new TimerTask() {
                /* class exocr.idcard.CaptureActivity.C47284 */

                public void run() {
                    EXIDCardResult.OooO0O0 = false;
                    DebugLog.m22048OooO00o("close double-check");
                }
            };
            Timer timer2 = new Timer();
            this.f23749OooO00o = timer2;
            timer2.schedule(this.f23750OooO00o, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        }
        int OooO00o3 = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "layout", "idcardpreview");
        DebugLog.OooO0OO(getApplicationContext().getPackageName());
        setContentView(OooO00o3);
        if (IDCardManager.OooO00o().m22057OooO00o()) {
            SensorManager sensorManager = (SensorManager) getSystemService(C3617o.f9339Z);
            this.f23737OooO00o = sensorManager;
            this.f23737OooO00o.registerListener(this.f23736OooO00o, sensorManager.getDefaultSensor(5), 0);
            this.OooO = true;
        }
        if (this.OooO0oo) {
            ViewfinderView viewfinderView = new ViewfinderView(this, null);
            this.f23748OooO00o = viewfinderView;
            viewfinderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f23742OooO00o = (FrameLayout) findViewById(ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "fl_id"));
            TextView textView = new TextView(this);
            this.f23744OooO00o = textView;
            textView.setText("");
            this.f23744OooO00o.setTextColor(-65536);
            this.f23744OooO00o.setTextSize(14.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 53);
            layoutParams.setMargins(0, 14, 28, 0);
            this.f23744OooO00o.setLayoutParams(layoutParams);
            this.f23742OooO00o.addView(this.f23744OooO00o);
            OooO0o();
            View OooO00o4 = IDCardManager.OooO00o().m22054OooO00o();
            this.f23741OooO00o = OooO00o4;
            if (OooO00o4 != null) {
                if (!(OooO00o4 == null || OooO00o4.getParent() == null)) {
                    this.f23742OooO00o.removeView(this.f23741OooO00o);
                }
                this.f23741OooO00o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f23742OooO00o.addView(this.f23741OooO00o);
            } else {
                this.f23742OooO00o.addView(this.f23748OooO00o);
            }
            this.f23748OooO00o.setActivity(this);
            this.f23754OooO0O0 = false;
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "drawable", "yidaoboshi"));
            this.f23734OooO00o = decodeResource;
            this.f23748OooO00o.setLogo(decodeResource);
            this.f23756OooO0o0 = false;
            boolean OooO0OO2 = this.f23746OooO00o.m22065OooO0OO();
            this.OooO0o = OooO0OO2;
            if (OooO0OO2) {
                this.f23748OooO00o.setTipText(f23730o0OO00O);
                DebugLog.m22048OooO00o("正面");
            } else {
                this.f23748OooO00o.setTipText(f23733oo0o0Oo);
                DebugLog.m22048OooO00o("反面");
            }
            if (!DictManager.OooO0O0()) {
                new AlertDialog.Builder(this).setTitle("提示").setMessage("识别核心初始化失败，请检查授权并重试").setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    /* class exocr.idcard.CaptureActivity.DialogInterface$OnClickListenerC47295 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        CaptureActivity.this.f23746OooO00o.OooO0O0(-1);
                        if (!CaptureActivity.this.f23746OooO00o.m22061OooO0O0()) {
                            CaptureActivity.this.f23746OooO00o.m22060OooO0O0();
                        } else {
                            CaptureActivity.this.f23746OooO00o.m22056OooO00o();
                        }
                        CaptureActivity.this.finish();
                    }
                }).create().show();
            }
            if (this.f23746OooO00o.OooOOO0()) {
                OooO0Oo();
            }
        } else if (!this.f23746OooO00o.m22061OooO0O0()) {
            this.f23740OooO00o.postDelayed(new Runnable() {
                /* class exocr.idcard.CaptureActivity.RunnableC47306 */

                public void run() {
                    CaptureActivity.this.f23740OooO00o.obtainMessage(1001).sendToTarget();
                }
            }, 100);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("相机权限\n");
            builder.setMessage("权限受限，请手动添加相机权限");
            builder.setCancelable(false);
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                /* class exocr.idcard.CaptureActivity.DialogInterface$OnClickListenerC47317 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    CaptureActivity.this.finish();
                }
            });
            builder.create().show();
        }
    }

    public native void onDestroy();

    public native void onPause();

    public native void onResume();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (Build.VERSION.SDK_INT >= 14 && this.OooO0oo) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Point OooO00o2 = CameraManager.OooO00o().m22034OooO00o();
                if (motionEvent.getAction() == 1) {
                    if (x > ((float) ((OooO00o2.x * 8) / 10)) && y < ((float) (OooO00o2.y / 4))) {
                        return false;
                    }
                    OooO00o((EXIDCardResult) null);
                    if (this.f23745OooO00o != null) {
                        this.f23745OooO00o.OooO0OO();
                    }
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public native void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3);

    public native void surfaceCreated(SurfaceHolder surfaceHolder);

    public native void surfaceDestroyed(SurfaceHolder surfaceHolder);

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0013  */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22040OooO00o() {
        /*
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
        throw new UnsupportedOperationException("Method not decompiled: exocr.idcard.CaptureActivity.m22040OooO00o():boolean");
    }

    private void OooO00o(SurfaceHolder surfaceHolder) {
        try {
            CameraManager.OooO00o().OooO00o(surfaceHolder);
            CameraManager.OooO00o().OooO00o(this, 0, CameraManager.OooO00o().m22036OooO00o());
            if (this.f23745OooO00o == null) {
                this.f23745OooO00o = new CaptureActivityHandler(this);
            }
        } catch (IOException unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("摄像头获取失败");
            builder.setMessage("请重试");
            builder.setNegativeButton("确定", new DialogInterface.OnClickListener() {
                /* class exocr.idcard.CaptureActivity.DialogInterface$OnClickListenerC47339 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    CaptureActivity.this.f23746OooO00o.OooO0O0(-1);
                    if (!CaptureActivity.this.f23746OooO00o.m22061OooO0O0()) {
                        CaptureActivity.this.f23746OooO00o.m22060OooO0O0();
                    } else {
                        CaptureActivity.this.f23746OooO00o.m22056OooO00o();
                    }
                    CaptureActivity.this.finish();
                }
            });
            builder.setCancelable(true);
            builder.create().show();
        } catch (RuntimeException unused2) {
        }
    }

    public void OooO00o(EXIDCardResult eXIDCardResult) {
        if (eXIDCardResult != null) {
            boolean OooO0OO2 = this.f23746OooO00o.m22065OooO0OO();
            this.OooO0o = OooO0OO2;
            if ((eXIDCardResult.o0ooOO0 != 1 || !OooO0OO2) && (eXIDCardResult.o0ooOO0 != 2 || this.OooO0o)) {
                if (this.f23746OooO00o.m22061OooO0O0()) {
                    this.f23746OooO00o.m22064OooO0OO();
                }
                if (!this.OooO0oO) {
                    this.f23748OooO00o.setTipColor(IDCardManager.OooO00o().OooO0OO());
                    boolean z = this.OooO0o;
                    if (z) {
                        this.f23748OooO00o.setTipText(f23729o0O0O00);
                    } else if (!z) {
                        this.f23748OooO00o.setTipText(f23728o000OOo);
                    }
                    Timer timer = this.f23749OooO00o;
                    if (timer != null) {
                        timer.cancel();
                        this.f23749OooO00o = null;
                    }
                    TimerTask timerTask = this.f23750OooO00o;
                    if (timerTask != null) {
                        timerTask.cancel();
                        this.f23750OooO00o = null;
                    }
                    this.f23750OooO00o = new TimerTask() {
                        /* class exocr.idcard.CaptureActivity.C472410 */

                        public void run() {
                            CaptureActivity.this.f23748OooO00o.setTipColor(IDCardManager.OooO00o().OooO0Oo());
                            if (CaptureActivity.this.OooO0o) {
                                CaptureActivity.this.f23748OooO00o.setTipText(CaptureActivity.f23730o0OO00O);
                                DebugLog.m22048OooO00o("正面");
                            } else {
                                CaptureActivity.this.f23748OooO00o.setTipText(CaptureActivity.f23733oo0o0Oo);
                                DebugLog.m22048OooO00o("反面");
                            }
                            CaptureActivity.this.OooO0oO = false;
                        }
                    };
                    Timer timer2 = new Timer();
                    this.f23749OooO00o = timer2;
                    timer2.schedule(this.f23750OooO00o, C7265o0O000oo.OooO0o.OooO00o);
                    this.OooO0oO = true;
                }
                Message.obtain(m22042OooO00o(), ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_failed")).sendToTarget();
                return;
            }
            this.OooO0oO = false;
            if (eXIDCardResult != null) {
                this.f23746OooO00o.OooO0O0(0);
                this.f23746OooO00o.OooO00o(eXIDCardResult);
                if (this.f23746OooO00o.m22061OooO0O0()) {
                    this.f23746OooO00o.OooO0O0(true);
                    return;
                }
                this.f23746OooO00o.m22060OooO0O0();
                finish();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Camera.ShutterCallback m22041OooO00o() {
        return this.f23735OooO00o;
    }

    private int OooO00o() {
        try {
            File[] listFiles = new File(C7748o0oooOOo.OooO0OO).listFiles(new FileFilter() {
                /* class exocr.idcard.CaptureActivity.AnonymousClass1CpuFilter */

                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            DebugLog.m22048OooO00o("CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            DebugLog.m22048OooO00o("CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }
}
