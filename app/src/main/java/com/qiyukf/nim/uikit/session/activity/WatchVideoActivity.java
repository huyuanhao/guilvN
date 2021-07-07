package com.qiyukf.nim.uikit.session.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1730d;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1732f;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p143d.C1864e;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nimlib.p198j.p201c.C2346b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.attachment.VideoAttachment;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.model.AttachmentProgress;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import s.h.e.l.l.C;

public class WatchVideoActivity extends BaseFragmentActivity implements View.OnClickListener {

    /* renamed from: A */
    public boolean f3783A;

    /* renamed from: B */
    public ImageView f3784B;

    /* renamed from: C */
    public AbortableFuture f3785C;

    /* renamed from: D */
    public Runnable f3786D = new Runnable() {
        /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.RunnableC19607 */

        public final void run() {
            if (WatchVideoActivity.this.f3798k != null && WatchVideoActivity.this.f3798k.isPlaying()) {
                WatchVideoActivity.this.f3813z = 1;
                WatchVideoActivity watchVideoActivity = WatchVideoActivity.this;
                if (watchVideoActivity.f3797j <= 0) {
                    watchVideoActivity.f3791d.setVisibility(4);
                    return;
                }
                int currentPosition = watchVideoActivity.f3798k.getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                long a = C1864e.m3551a((long) currentPosition);
                WatchVideoActivity.this.f3791d.setText(WatchVideoActivity.secodeToTime(a));
                WatchVideoActivity.this.f3789b.setProgress((int) a);
                WatchVideoActivity.this.f3799l.postDelayed(this, 1000);
            }
        }
    };

    /* renamed from: E */
    public Observer<IMMessage> f3787E = new Observer<IMMessage>() {
        /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C195111 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(IMMessage iMMessage) {
            IMMessage iMMessage2 = iMMessage;
            if (iMMessage2.isTheSame(WatchVideoActivity.this.f3800m) && !WatchVideoActivity.this.mo34176e()) {
                if (iMMessage2.getAttachStatus() == AttachStatusEnum.transferred && WatchVideoActivity.m3834b(iMMessage2)) {
                    WatchVideoActivity watchVideoActivity = WatchVideoActivity.this;
                    watchVideoActivity.m3838c((WatchVideoActivity) ((VideoAttachment) watchVideoActivity.f3800m.getAttachment()).getPath());
                } else if (iMMessage2.getAttachStatus() == AttachStatusEnum.fail) {
                    WatchVideoActivity.m3852k(WatchVideoActivity.this);
                }
            }
        }
    };

    /* renamed from: F */
    public Observer<AttachmentProgress> f3788F = new Observer<AttachmentProgress>() {
        /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C195212 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(AttachmentProgress attachmentProgress) {
            long j;
            AttachmentProgress attachmentProgress2 = attachmentProgress;
            long total = attachmentProgress2.getTotal();
            long transferred = attachmentProgress2.getTransferred();
            float f = ((float) transferred) / ((float) total);
            if (((double) f) > 1.0d) {
                f = 1.0f;
                j = total;
            } else {
                j = transferred;
            }
            int i = (((double) (f - WatchVideoActivity.this.f3812y)) > 0.1d ? 1 : (((double) (f - WatchVideoActivity.this.f3812y)) == 0.1d ? 0 : -1));
            WatchVideoActivity watchVideoActivity = WatchVideoActivity.this;
            if (i >= 0) {
                watchVideoActivity.f3812y = f;
                WatchVideoActivity watchVideoActivity2 = WatchVideoActivity.this;
                watchVideoActivity2.m3826a(watchVideoActivity2.getString(C2364R.string.ysf_download_video), j, total);
                return;
            }
            if (((double) watchVideoActivity.f3812y) == AbstractC8352oOoOOoO0.OooO0O0) {
                WatchVideoActivity.this.f3812y = f;
                WatchVideoActivity watchVideoActivity3 = WatchVideoActivity.this;
                watchVideoActivity3.m3826a(watchVideoActivity3.getString(C2364R.string.ysf_download_video), j, total);
            }
            if (((double) f) == 1.0d && ((double) WatchVideoActivity.this.f3812y) != 1.0d) {
                WatchVideoActivity.this.f3812y = f;
                WatchVideoActivity watchVideoActivity4 = WatchVideoActivity.this;
                watchVideoActivity4.m3826a(watchVideoActivity4.getString(C2364R.string.ysf_download_video), j, total);
            }
        }
    };

    /* renamed from: b */
    public ProgressBar f3789b;

    /* renamed from: c */
    public ImageView f3790c;

    /* renamed from: d */
    public TextView f3791d;

    /* renamed from: e */
    public ImageView f3792e;

    /* renamed from: f */
    public CountDownTimer f3793f;

    /* renamed from: g */
    public long f3794g = 0;

    /* renamed from: h */
    public TextView f3795h;

    /* renamed from: i */
    public String f3796i;

    /* renamed from: j */
    public long f3797j = 0;

    /* renamed from: k */
    public MediaPlayer f3798k;

    /* renamed from: l */
    public Handler f3799l = new Handler();

    /* renamed from: m */
    public IMMessage f3800m;

    /* renamed from: n */
    public String f3801n;

    /* renamed from: o */
    public SurfaceView f3802o;

    /* renamed from: p */
    public SurfaceHolder f3803p;

    /* renamed from: q */
    public View f3804q;

    /* renamed from: r */
    public View f3805r;

    /* renamed from: s */
    public View f3806s;

    /* renamed from: t */
    public View f3807t;

    /* renamed from: u */
    public TextView f3808u;

    /* renamed from: v */
    public LinearLayout f3809v;

    /* renamed from: w */
    public boolean f3810w = true;

    /* renamed from: x */
    public boolean f3811x = false;

    /* renamed from: y */
    public float f3812y;

    /* renamed from: z */
    public int f3813z = 2;

    static {
        C.i(50331750);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private MediaPlayer m3822a(File file) {
        try {
            return MediaPlayer.create(this, Uri.fromFile(file));
        } catch (Exception e) {
            C1709a.m3015b("getVideoMediaPlayer is error", "file:" + file, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m3826a(final String str, final long j, final long j2) {
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        final float f = (float) (d / d2);
        runOnUiThread(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.RunnableC195313 */

            public final void run() {
                ViewGroup.LayoutParams layoutParams = WatchVideoActivity.this.f3807t.getLayoutParams();
                layoutParams.width = (int) (((float) WatchVideoActivity.this.f3806s.getWidth()) * f);
                WatchVideoActivity.this.f3807t.setLayoutParams(layoutParams);
                WatchVideoActivity.this.f3808u.setText(String.format(WatchVideoActivity.this.getString(C2364R.string.ysf_download_progress_description), str, C1807b.m3415a(j), C1807b.m3415a(j2)));
            }
        });
    }

    /* renamed from: a */
    private void m3827a(boolean z) {
        int i = 0;
        if (this.f3800m == null) {
            MediaPlayer a = m3822a(new File(this.f3796i));
            long duration = (long) (a == null ? 0 : a.getDuration());
            this.f3789b.setMax((int) C1864e.m3551a(duration));
            long a2 = C1864e.m3551a(duration);
            this.f3797j = a2;
            if (a2 == 0) {
                this.f3794g = 0;
            } else {
                this.f3794g = (100 / a2) * 100;
            }
        }
        this.f3804q.setVisibility(8);
        if (z) {
            i = 8;
        }
        m3837c(i);
        this.f3790c.setBackgroundResource(C2364R.C2366drawable.ysf_ic_video_pause_btn_back);
        MediaPlayer mediaPlayer = this.f3798k;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f3798k.stop();
            } else if (this.f3811x) {
                this.f3798k.setDisplay(this.f3803p);
            } else {
                C1865f.m3559b(C2364R.string.ysf_look_video_fail_try_again);
                return;
            }
            this.f3798k.reset();
            try {
                this.f3798k.setDataSource(this.f3796i);
                this.f3798k.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C19618 */

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        long duration;
                        WatchVideoActivity.this.f3804q.setVisibility(0);
                        WatchVideoActivity.this.f3790c.setBackgroundResource(C2364R.C2366drawable.ysf_ic_video_start_btn_back);
                        WatchVideoActivity.this.f3813z = 2;
                        WatchVideoActivity.this.f3789b.setProgress(100);
                        if (WatchVideoActivity.this.f3800m != null) {
                            duration = ((VideoAttachment) WatchVideoActivity.this.f3800m.getAttachment()).getDuration();
                        } else {
                            MediaPlayer a = WatchVideoActivity.this.m3822a((WatchVideoActivity) new File(WatchVideoActivity.this.f3796i));
                            duration = (long) (a == null ? 0 : a.getDuration());
                        }
                        WatchVideoActivity.this.f3791d.setText(WatchVideoActivity.secodeToTime((long) ((int) C1864e.m3551a(duration))));
                        WatchVideoActivity.this.m3837c((WatchVideoActivity) 0);
                        WatchVideoActivity.this.f3799l.removeCallbacks(WatchVideoActivity.this.f3786D);
                    }
                });
                this.f3798k.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C19629 */

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setDataAndType(Uri.parse("file://" + WatchVideoActivity.this.f3796i), "video/3gp");
                            WatchVideoActivity.this.startActivity(intent);
                            WatchVideoActivity.this.finish();
                            return true;
                        } catch (Exception unused) {
                            C1865f.m3559b(C2364R.string.ysf_look_video_fail);
                            return true;
                        }
                    }
                });
                this.f3798k.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C195010 */

                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        WatchVideoActivity.this.f3798k.start();
                        WatchVideoActivity.this.m3843f();
                        WatchVideoActivity.this.f3799l.postDelayed(WatchVideoActivity.this.f3786D, 100);
                        if (WatchVideoActivity.this.f3810w) {
                            WatchVideoActivity.this.f3798k.setVolume(0.0f, 0.0f);
                        }
                    }
                });
                this.f3798k.prepareAsync();
            } catch (Exception e) {
                C1865f.m3559b(C2364R.string.ysf_look_video_fail_try_again);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m3833b(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeMsgStatus(this.f3787E, z);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeAttachmentProgress(this.f3788F, z);
    }

    /* renamed from: b */
    public static boolean m3834b(IMMessage iMMessage) {
        return iMMessage != null && iMMessage.getAttachStatus() == AttachStatusEnum.transferred && !TextUtils.isEmpty(((VideoAttachment) iMMessage.getAttachment()).getPath());
    }

    /* renamed from: b */
    public static boolean m3835b(String str) {
        if (TextUtils.isEmpty(m3840d(str))) {
            return false;
        }
        return new File(m3840d(str)).exists();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m3837c(int i) {
        CountDownTimer countDownTimer;
        this.f3792e.setVisibility(i);
        this.f3790c.setVisibility(i);
        this.f3789b.setVisibility(i);
        this.f3791d.setVisibility(i);
        if (i != 8 || (countDownTimer = this.f3793f) == null) {
            CountDownTimer countDownTimer2 = this.f3793f;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            initCountDownTimer(3000);
            this.f3793f.start();
            return;
        }
        countDownTimer.cancel();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m3838c(String str) {
        this.f3785C = null;
        this.f3809v.setVisibility(8);
        this.f3805r.setVisibility(8);
        this.f3796i = str;
        this.f3790c.setOnClickListener(this);
        this.f3802o.setOnClickListener(this);
        this.f3802o.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.View$OnLongClickListenerC195414 */

            public final boolean onLongClick(View view) {
                WatchVideoActivity.m3857p(WatchVideoActivity.this);
                return true;
            }
        });
        m3827a(true);
    }

    /* renamed from: d */
    public static String m3840d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2349d.m5123a(C1852c.m3511a(str), EnumC2347c.TYPE_FILE);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m3843f() {
        MediaPlayer mediaPlayer = this.f3798k;
        if (mediaPlayer != null) {
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = this.f3798k.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                if (i / i2 > videoWidth / videoHeight) {
                    int i3 = (videoWidth * i2) / videoHeight;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i2);
                    int i4 = (i - i3) / 2;
                    layoutParams.setMargins(i4, 0, i4, 0);
                    this.f3802o.setLayoutParams(layoutParams);
                    return;
                }
                int i5 = (videoHeight * i) / videoWidth;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i5);
                int i6 = (i2 - i5) / 2;
                layoutParams2.setMargins(0, i6, 0, i6);
                this.f3802o.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: g */
    private void m3845g() {
        this.f3804q.setVisibility(8);
        this.f3790c.setBackgroundResource(C2364R.C2366drawable.ysf_ic_video_pause_btn_back);
        MediaPlayer mediaPlayer = this.f3798k;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.f3798k.start();
            this.f3813z = 1;
            this.f3799l.postDelayed(this.f3786D, 100);
        }
    }

    /* renamed from: h */
    private void m3846h() {
        IMMessage iMMessage = this.f3800m;
        if (iMMessage != null) {
            if (!m3834b(iMMessage)) {
                m3826a(getString(C2364R.string.ysf_download_video), 0, ((VideoAttachment) this.f3800m.getAttachment()).getSize());
                this.f3805r.setVisibility(0);
                this.f3785C = ((MsgService) NIMClient.getService(MsgService.class)).downloadAttachment(this.f3800m, false);
                this.f3783A = true;
            }
        } else if (!m3835b(this.f3801n)) {
            this.f3805r.setVisibility(8);
            this.f3809v.setVisibility(0);
            this.f3783A = true;
            final String str = this.f3801n;
            String d = m3840d(str);
            if (TextUtils.isEmpty(str) || d == null) {
                C1865f.m3555a(C2364R.string.ysf_download_video_fail);
                return;
            }
            C1732f.m3104a().mo33905a(new C1730d(str, d, new AbstractC1731e() {
                /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.C19596 */

                @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
                /* renamed from: a */
                public final void mo33899a() {
                    WatchVideoActivity.this.m3838c((WatchVideoActivity) WatchVideoActivity.m3840d(str));
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
                /* renamed from: a */
                public final void mo33900a(long j) {
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
                /* renamed from: b */
                public final void mo33901b() {
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
                /* renamed from: b */
                public final void mo33902b(long j) {
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
                /* renamed from: c */
                public final void mo33903c() {
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private void m3848i() {
        IMMessage iMMessage = this.f3800m;
        if (iMMessage != null) {
            if (m3834b(iMMessage)) {
                m3838c(((VideoAttachment) this.f3800m.getAttachment()).getPath());
            }
        } else if (m3835b(this.f3801n)) {
            m3838c(m3840d(this.f3801n));
        }
    }

    /* renamed from: j */
    private void m3850j() {
        AbortableFuture abortableFuture = this.f3785C;
        if (abortableFuture != null) {
            abortableFuture.abort();
            this.f3785C = null;
            this.f3783A = false;
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m3852k(WatchVideoActivity watchVideoActivity) {
        watchVideoActivity.f3785C = null;
        watchVideoActivity.f3809v.setVisibility(8);
        watchVideoActivity.f3805r.setVisibility(8);
        C1865f.m3559b(C2364R.string.ysf_download_video_fail);
    }

    /* renamed from: p */
    public static /* synthetic */ void m3857p(WatchVideoActivity watchVideoActivity) {
        View inflate = LayoutInflater.from(watchVideoActivity).inflate(C2364R.layout.ysf_popup_save_video, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(inflate, -1, -2, true);
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.View$OnTouchListenerC19552 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        ((TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_watch_video_save)).setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.View$OnClickListenerC19563 */

            public final void onClick(View view) {
                WatchVideoActivity.m3858q(WatchVideoActivity.this);
                popupWindow.dismiss();
            }
        });
        ((TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_watch_video_save_cancel)).setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.View$OnClickListenerC19574 */

            public final void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAsDropDown(watchVideoActivity.f3802o);
    }

    /* renamed from: q */
    public static /* synthetic */ void m3858q(WatchVideoActivity watchVideoActivity) {
        IMMessage iMMessage = watchVideoActivity.f3800m;
        if (iMMessage == null) {
            C1865f.m3555a(C2364R.string.ysf_video_save_fail);
            return;
        }
        VideoAttachment videoAttachment = (VideoAttachment) iMMessage.getAttachment();
        if (videoAttachment.getPath() == null) {
            C1865f.m3557a("请先下载视频");
        }
        String c = C2349d.m5132c(watchVideoActivity);
        if (TextUtils.isEmpty(videoAttachment.getExtension())) {
            C1865f.m3555a(C2364R.string.ysf_video_save_fail);
        } else if (Build.VERSION.SDK_INT < 29) {
            String str = c + ("video_" + System.currentTimeMillis() + ".mp4");
            if (C1806a.m3408a(videoAttachment.getPath(), str) != -1) {
                try {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(new File(str)));
                    watchVideoActivity.sendBroadcast(intent);
                    C1865f.m3560b(watchVideoActivity.getString(C2364R.string.ysf_video_save_to) + c + "查看");
                } catch (Exception unused) {
                    C1865f.m3559b(C2364R.string.ysf_picture_save_fail);
                }
            } else {
                C1865f.m3555a(C2364R.string.ysf_video_save_fail);
            }
        } else if (C2346b.m5119b(watchVideoActivity, new File(videoAttachment.getPath()))) {
            C1865f.m3560b(watchVideoActivity.getString(C2364R.string.ysf_video_save_success));
        } else {
            C1865f.m3555a(C2364R.string.ysf_video_save_fail);
        }
    }

    public static String secodeToTime(long j) {
        String str;
        String str2;
        long j2 = j / 60;
        long j3 = j % 60;
        StringBuilder sb = new StringBuilder();
        if (j2 >= 10) {
            str = String.valueOf(j2);
        } else {
            str = "0" + j2;
        }
        sb.append(str);
        sb.append(Constants.COLON_SEPARATOR);
        if (j3 >= 10) {
            str2 = String.valueOf(j3);
        } else {
            str2 = "0" + j3;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static native void start(Context context, IMMessage iMMessage, boolean z);

    public static native void start(Context context, String str);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    public void initCountDownTimer(long j) {
        this.f3793f = new CountDownTimer(j) {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.CountDownTimerC19585 */

            public final void onFinish() {
                if (WatchVideoActivity.this.f3813z == 1) {
                    WatchVideoActivity.this.m3837c((WatchVideoActivity) 8);
                }
            }

            public final void onTick(long j) {
            }
        };
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    public native void onClick(View view);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2364R.layout.ysf_watch_video_activity);
        getWindow().setFlags(1024, 1024);
        IMMessage iMMessage = (IMMessage) getIntent().getSerializableExtra("EXTRA_DATA");
        this.f3800m = iMMessage;
        if (iMMessage != null) {
            setTitle(String.format("视频发送于%s", new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(iMMessage.getTime()))));
            this.f3810w = getIntent().getBooleanExtra("EXTRA_MENU", true);
        } else {
            setTitle("查看视频");
            this.f3810w = false;
            this.f3801n = getIntent().getStringExtra("INTENT_EXTRA_VIDEO_URL");
        }
        this.f3805r = findViewById(C2364R.C2367id.layoutDownload);
        this.f3809v = (LinearLayout) findViewById(C2364R.C2367id.ysf_watch_video_download_parent);
        this.f3806s = findViewById(C2364R.C2367id.downloadProgressBackground);
        this.f3807t = findViewById(C2364R.C2367id.downloadProgressForeground);
        this.f3808u = (TextView) findViewById(C2364R.C2367id.downloadProgressText);
        this.f3804q = findViewById(C2364R.C2367id.videoIcon);
        ImageView imageView = (ImageView) findViewById(C2364R.C2367id.ysf_iv_watch_video_finish);
        this.f3792e = imageView;
        imageView.setOnClickListener(this);
        SurfaceView surfaceView = (SurfaceView) findViewById(C2364R.C2367id.videoView);
        this.f3802o = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f3803p = holder;
        holder.setType(3);
        this.f3803p.addCallback(new SurfaceHolder.Callback() {
            /* class com.qiyukf.nim.uikit.session.activity.WatchVideoActivity.SurfaceHolder$CallbackC19491 */

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (!WatchVideoActivity.this.f3811x) {
                    WatchVideoActivity.this.f3811x = true;
                    WatchVideoActivity.this.m3848i();
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                WatchVideoActivity.this.f3811x = false;
            }
        });
        this.f3795h = (TextView) findViewById(C2364R.C2367id.lblVideoFileInfo);
        ImageView imageView2 = (ImageView) findViewById(C2364R.C2367id.control_download_btn);
        this.f3784B = imageView2;
        imageView2.setOnClickListener(this);
        ProgressBar progressBar = (ProgressBar) findViewById(C2364R.C2367id.ysf_pb_video_progress_bar);
        this.f3789b = progressBar;
        IMMessage iMMessage2 = this.f3800m;
        if (iMMessage2 != null) {
            progressBar.setMax((int) C1864e.m3551a(((VideoAttachment) iMMessage2.getAttachment()).getDuration()));
        }
        this.f3790c = (ImageView) findViewById(C2364R.C2367id.ysf_iv_video_progress_btn);
        this.f3791d = (TextView) findViewById(C2364R.C2367id.ysf_tv_video_progress_second);
        IMMessage iMMessage3 = this.f3800m;
        if (iMMessage3 != null) {
            long duration = ((VideoAttachment) iMMessage3.getAttachment()).getDuration();
            long size = ((VideoAttachment) this.f3800m.getAttachment()).getSize();
            if (duration <= 0) {
                TextView textView = this.f3795h;
                textView.setText("大小: " + C1807b.m3415a(size));
            } else {
                long a = C1864e.m3551a(duration);
                TextView textView2 = this.f3795h;
                textView2.setText("大小: " + C1807b.m3415a(size) + ",时长: " + String.valueOf(a) + " 秒");
                this.f3797j = a;
                if (a == 0) {
                    this.f3794g = 0;
                } else {
                    this.f3794g = (100 / a) * 100;
                }
            }
        }
        m3833b(true);
        m3846h();
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onPause();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onResume();
}
