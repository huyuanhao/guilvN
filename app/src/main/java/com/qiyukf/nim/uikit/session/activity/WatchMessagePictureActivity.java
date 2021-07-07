package com.qiyukf.nim.uikit.session.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a;
import com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MultiTouchZoomableImageView;
import com.qiyukf.nimlib.p198j.p200b.C2341a;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.nimlib.p198j.p201c.C2346b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.ImageAttachment;
import com.qiyukf.unicorn.p232k.C2709i;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.h.e.l.l.C;

@TargetApi(9)
public class WatchMessagePictureActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public List<IMMessage> f3760b;

    /* renamed from: c */
    public View f3761c;

    /* renamed from: d */
    public ViewPager f3762d;

    /* renamed from: e */
    public C1947a f3763e;

    /* renamed from: f */
    public boolean f3764f = true;

    /* renamed from: g */
    public Handler f3765g;

    /* renamed from: h */
    public Observer<IMMessage> f3766h = new Observer<IMMessage>() {
        /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.C19412 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(IMMessage iMMessage) {
            IMMessage iMMessage2 = iMMessage;
            if (iMMessage2.isTheSame(WatchMessagePictureActivity.m3810d(WatchMessagePictureActivity.this)) && !WatchMessagePictureActivity.this.mo34176e()) {
                if (iMMessage2.getAttachStatus() == AttachStatusEnum.transferred && WatchMessagePictureActivity.m3805b(iMMessage2)) {
                    WatchMessagePictureActivity.this.m3808c((WatchMessagePictureActivity) iMMessage2);
                } else if (iMMessage2.getAttachStatus() == AttachStatusEnum.fail) {
                    WatchMessagePictureActivity.m3804b(WatchMessagePictureActivity.this, iMMessage2);
                }
            }
        }
    };

    /* renamed from: com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity$a */
    public class C1947a extends AbstractC7314o0O0Oo0O {

        /* renamed from: b */
        public List<IMMessage> f3778b;

        /* renamed from: c */
        public Handler f3779c = C1805a.m3403a().mo34073c();

        /* renamed from: d */
        public int f3780d;

        public C1947a(int i, List<IMMessage> list) {
            this.f3778b = list;
            this.f3780d = i;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MultiTouchZoomableImageView multiTouchZoomableImageView = (MultiTouchZoomableImageView) obj;
            multiTouchZoomableImageView.mo34279b();
            viewGroup.removeView(multiTouchZoomableImageView);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getCount() {
            List<IMMessage> list = this.f3778b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final Object instantiateItem(ViewGroup viewGroup, final int i) {
            MultiTouchZoomableImageView multiTouchZoomableImageView = new MultiTouchZoomableImageView(viewGroup.getContext());
            viewGroup.addView(multiTouchZoomableImageView, new ViewGroup.LayoutParams(-1, -1));
            multiTouchZoomableImageView.setTag(Integer.valueOf(i));
            if (i == this.f3780d) {
                WatchMessagePictureActivity watchMessagePictureActivity = WatchMessagePictureActivity.this;
                watchMessagePictureActivity.m3797a((WatchMessagePictureActivity) ((IMMessage) watchMessagePictureActivity.f3760b.get(i)), (IMMessage) true);
            } else {
                this.f3779c.post(new Runnable() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.C1947a.RunnableC19481 */

                    public final void run() {
                        WatchMessagePictureActivity watchMessagePictureActivity = WatchMessagePictureActivity.this;
                        watchMessagePictureActivity.m3797a((WatchMessagePictureActivity) ((IMMessage) watchMessagePictureActivity.f3760b.get(i)), (IMMessage) false);
                    }
                });
            }
            return multiTouchZoomableImageView;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    static {
        C.i(50331749);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3794a(WatchMessagePictureActivity watchMessagePictureActivity, final int i) {
        if (i == watchMessagePictureActivity.f3762d.getCurrentItem()) {
            BaseZoomableImageView c = watchMessagePictureActivity.m3807c(i);
            if (c == null) {
                watchMessagePictureActivity.f3765g.postDelayed(new Runnable() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.RunnableC19455 */

                    public final void run() {
                        WatchMessagePictureActivity.m3794a(WatchMessagePictureActivity.this, i);
                    }
                }, 300);
                return;
            }
            c.mo34277a(new AbstractC1923a() {
                /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.C19423 */

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: a */
                public final void mo34327a() {
                    WatchMessagePictureActivity.this.finish();
                }

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: b */
                public final void mo34328b() {
                    WatchMessagePictureActivity.this.mo34366f();
                }

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: c */
                public final void mo34329c() {
                    WatchMessagePictureActivity.this.finish();
                }
            });
            c.mo34276a(watchMessagePictureActivity.f3762d);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m3797a(IMMessage iMMessage, boolean z) {
        ImageAttachment imageAttachment;
        final BaseZoomableImageView d = m3809d(iMMessage);
        if (d != null && (imageAttachment = (ImageAttachment) iMMessage.getAttachment()) != null) {
            String path = imageAttachment.getPath();
            if (TextUtils.isEmpty(path)) {
                path = imageAttachment.getThumbPath();
            }
            final Bitmap bitmap = null;
            if (!TextUtils.isEmpty(path)) {
                bitmap = C2342b.m5096a(path, C2341a.m5090b(path));
            }
            if (bitmap == null) {
                bitmap = C2342b.m5094a(C2364R.C2366drawable.ysf_image_placeholder_loading);
            }
            if (z) {
                d.mo34274a(bitmap);
            } else {
                this.f3765g.post(new Runnable() {
                    /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.RunnableC19466 */

                    public final void run() {
                        d.mo34274a(bitmap);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m3798a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeMsgStatus(this.f3766h, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m3803b(WatchMessagePictureActivity watchMessagePictureActivity, int i) {
        IMMessage iMMessage = watchMessagePictureActivity.f3760b.get(i);
        if (m3805b(iMMessage)) {
            watchMessagePictureActivity.m3808c(iMMessage);
            return;
        }
        watchMessagePictureActivity.m3797a(iMMessage, false);
        boolean isEmpty = TextUtils.isEmpty(((ImageAttachment) iMMessage.getAttachment()).getPath());
        View view = watchMessagePictureActivity.f3761c;
        if (isEmpty) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        ((MsgService) NIMClient.getService(MsgService.class)).downloadAttachment(iMMessage, false);
    }

    /* renamed from: b */
    public static /* synthetic */ void m3804b(WatchMessagePictureActivity watchMessagePictureActivity, IMMessage iMMessage) {
        watchMessagePictureActivity.f3761c.setVisibility(8);
        BaseZoomableImageView d = watchMessagePictureActivity.m3809d(iMMessage);
        if (d != null) {
            d.mo34274a(C2342b.m5094a(C2364R.C2366drawable.ysf_image_placeholder_fail));
            C1865f.m3559b(C2364R.string.ysf_image_download_failed);
        }
    }

    /* renamed from: b */
    public static boolean m3805b(IMMessage iMMessage) {
        return iMMessage.getAttachStatus() == AttachStatusEnum.transferred && !TextUtils.isEmpty(((ImageAttachment) iMMessage.getAttachment()).getPath());
    }

    /* renamed from: c */
    private BaseZoomableImageView m3807c(int i) {
        try {
            return (BaseZoomableImageView) this.f3762d.findViewWithTag(Integer.valueOf(i));
        } catch (Exception e) {
            C1709a.m3015b("imageViewOf is error", "position：" + i, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m3808c(IMMessage iMMessage) {
        this.f3761c.setVisibility(8);
        m3797a(iMMessage, false);
    }

    /* renamed from: d */
    private BaseZoomableImageView m3809d(IMMessage iMMessage) {
        Iterator<IMMessage> it = this.f3760b.iterator();
        int i = 0;
        while (it.hasNext() && !it.next().isTheSame(iMMessage)) {
            i++;
        }
        return m3807c(i);
    }

    /* renamed from: d */
    public static /* synthetic */ IMMessage m3810d(WatchMessagePictureActivity watchMessagePictureActivity) {
        return watchMessagePictureActivity.f3760b.get(watchMessagePictureActivity.f3762d.getCurrentItem());
    }

    public static void start(Context context, ArrayList<IMMessage> arrayList, int i) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_IMAGES", arrayList);
        intent.putExtra("EXTRA_INDEX", i);
        intent.setClass(context, WatchMessagePictureActivity.class);
        context.startActivity(intent);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    /* renamed from: f */
    public final void mo34366f() {
        if (!TextUtils.isEmpty(((ImageAttachment) this.f3760b.get(this.f3762d.getCurrentItem()).getAttachment()).getPath())) {
            C3021g.m7057a(this, (CharSequence) null, new CharSequence[]{getString(C2364R.string.ysf_save_to_device)}, new C3021g.AbstractC3022a() {
                /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.C19434 */

                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                /* renamed from: a */
                public final void mo34369a(int i) {
                    C2709i.m6263a((Activity) WatchMessagePictureActivity.this).mo36469a("android.permission.WRITE_EXTERNAL_STORAGE").mo36468a(new C2709i.AbstractC2710a() {
                        /* class com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity.C19434.C19441 */

                        @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                        public final void onDenied() {
                            C1865f.m3555a(C2364R.string.ysf_no_permission_save_image);
                        }

                        @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                        public final void onGranted() {
                            WatchMessagePictureActivity.this.savePicture();
                        }
                    }).mo36470a();
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    public void savePicture() {
        ImageAttachment imageAttachment = (ImageAttachment) this.f3760b.get(this.f3762d.getCurrentItem()).getAttachment();
        String path = imageAttachment.getPath();
        if (!TextUtils.isEmpty(path)) {
            if (Build.VERSION.SDK_INT < 29) {
                String str = imageAttachment.getFileName() + C9058ooOoOoOO.OooOO0 + (TextUtils.isEmpty(imageAttachment.getExtension()) ? BitmapUtils.IMAGE_KEY_SUFFIX : imageAttachment.getExtension());
                String str2 = C2349d.m5129b(this) + str;
                if (C1806a.m3408a(path, str2) != -1) {
                    try {
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("mime_type", "image/jpeg");
                        contentValues.put("_data", str2);
                        getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                        C1865f.m3559b(C2364R.string.ysf_picture_save_to);
                    } catch (Exception e) {
                        C1865f.m3559b(C2364R.string.ysf_picture_save_fail);
                        C1709a.m3015b("savePicture is error", "", e);
                    }
                } else {
                    C1865f.m3559b(C2364R.string.ysf_picture_save_fail);
                }
            } else if (C2346b.m5117a(this, new File(path))) {
                C1865f.m3559b(C2364R.string.ysf_picture_save_to);
            } else {
                C1865f.m3559b(C2364R.string.ysf_picture_save_fail);
            }
        }
    }
}
