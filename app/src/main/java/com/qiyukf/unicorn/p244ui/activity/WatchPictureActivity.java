package com.qiyukf.unicorn.p244ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.p118pd.sdk.C7189o00oO00o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MultiTouchZoomableImageView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.WatchPictureActivity */
public class WatchPictureActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public ArrayList<C2743d> f5925b = new ArrayList<>();

    /* renamed from: c */
    public ViewPager f5926c;

    /* renamed from: d */
    public C2819a f5927d;

    /* renamed from: e */
    public int f5928e = 0;

    /* renamed from: f */
    public boolean f5929f = false;

    /* renamed from: com.qiyukf.unicorn.ui.activity.WatchPictureActivity$a */
    public class C2819a extends AbstractC7314o0O0Oo0O {

        /* renamed from: b */
        public List<C2743d> f5936b;

        /* renamed from: c */
        public Handler f5937c = C1805a.m3403a().mo34073c();

        /* renamed from: d */
        public int f5938d;

        public C2819a(int i, List<C2743d> list) {
            this.f5936b = list;
            this.f5938d = i;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            ((MultiTouchZoomableImageView) view.findViewById(C2364R.C2367id.ysf_watch_pic_and_video_imageView)).mo34279b();
            viewGroup.removeView(view);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getCount() {
            List<C2743d> list = this.f5936b;
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
            View inflate = LayoutInflater.from(WatchPictureActivity.this).inflate(C2364R.layout.ysf_watch_pic_and_video_item, (ViewGroup) null);
            MultiTouchZoomableImageView multiTouchZoomableImageView = (MultiTouchZoomableImageView) inflate.findViewById(C2364R.C2367id.ysf_watch_pic_and_video_imageView);
            ImageView imageView = (ImageView) inflate.findViewById(C2364R.C2367id.ysf_iv_watch_pic_and_video_start);
            viewGroup.addView(inflate);
            inflate.setTag(Integer.valueOf(i));
            if (EnumC2731b.m6308b(WatchPictureActivity.this.f5925b.get(i).f5670b)) {
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity.C2819a.View$OnClickListenerC28201 */

                    public final void onClick(View view) {
                        if (EnumC2731b.m6308b(WatchPictureActivity.this.f5925b.get(i).f5670b)) {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            WatchPictureActivity watchPictureActivity = WatchPictureActivity.this;
                            intent.setDataAndType(watchPictureActivity.f5925b.get(watchPictureActivity.f5928e).f5671c, C9058ooOoOoOO.OooO0oO);
                            try {
                                WatchPictureActivity.this.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                C1865f.m3555a(C2364R.string.ysf_error_no_video_activity);
                            }
                        }
                    }
                });
            } else {
                imageView.setVisibility(8);
            }
            if (i == this.f5938d) {
                WatchPictureActivity watchPictureActivity = WatchPictureActivity.this;
                WatchPictureActivity.m6519a(watchPictureActivity, watchPictureActivity.f5925b.get(i));
            } else {
                this.f5937c.post(new Runnable() {
                    /* class com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity.C2819a.RunnableC28212 */

                    public final void run() {
                        WatchPictureActivity watchPictureActivity = WatchPictureActivity.this;
                        WatchPictureActivity.m6519a(watchPictureActivity, watchPictureActivity.f5925b.get(i));
                    }
                });
            }
            multiTouchZoomableImageView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity.C2819a.View$OnClickListenerC28223 */

                public final void onClick(View view) {
                    ViewPropertyAnimator viewPropertyAnimator;
                    ViewGroup viewGroup;
                    if (Build.VERSION.SDK_INT >= 14) {
                        if (WatchPictureActivity.this.f5929f) {
                            viewPropertyAnimator = WatchPictureActivity.this.f3468a.animate().setInterpolator(new C7189o00oO00o());
                            viewGroup = WatchPictureActivity.this.f3468a;
                        } else {
                            viewPropertyAnimator = WatchPictureActivity.this.f3468a.animate().setInterpolator(new C7189o00oO00o());
                            viewGroup = WatchPictureActivity.this.f3468a;
                        }
                        viewPropertyAnimator.translationYBy((float) viewGroup.getMeasuredHeight()).start();
                    }
                    WatchPictureActivity watchPictureActivity = WatchPictureActivity.this;
                    watchPictureActivity.f5929f = !watchPictureActivity.f5929f;
                }
            });
            return inflate;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    static {
        C.i(50331759);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6519a(WatchPictureActivity watchPictureActivity, C2743d dVar) {
        Iterator<C2743d> it = watchPictureActivity.f5925b.iterator();
        int i = 0;
        while (it.hasNext() && !it.next().f5671c.equals(dVar.f5671c)) {
            i++;
        }
        final BaseZoomableImageView c = watchPictureActivity.m6522c(i);
        if (c != null && !TextUtils.isEmpty(dVar.f5671c.toString())) {
            Point a = C2756c.m6385a(dVar.f5671c, watchPictureActivity);
            C1870a.m3566a(dVar.f5671c.toString(), a.x, a.y, new ImageLoaderListener() {
                /* class com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity.C28183 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    c.mo34274a(bitmap);
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                    if (th != null) {
                        C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private BaseZoomableImageView m6522c(int i) {
        try {
            return (BaseZoomableImageView) this.f5926c.findViewWithTag(Integer.valueOf(i)).findViewById(C2364R.C2367id.ysf_watch_pic_and_video_imageView);
        } catch (Exception e) {
            C1709a.m3015b("imageViewOf is error", "position：" + i, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m6527f() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", this.f5925b);
        intent.putExtra("extra_default_bundle", bundle);
        setResult(-1, intent);
        finish();
    }

    public static void start(Activity activity, ArrayList<C2743d> arrayList, int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("WATCH_PICTURE_List_LABEL", arrayList);
        intent.putExtra("WATCH_PICTURE_INDEX_LABEL", i);
        intent.setClass(activity, WatchPictureActivity.class);
        activity.startActivityForResult(intent, i2);
    }

    public static void start(Fragment fragment, ArrayList<C2743d> arrayList, int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("WATCH_PICTURE_List_LABEL", arrayList);
        intent.putExtra("WATCH_PICTURE_INDEX_LABEL", i);
        intent.setClass(fragment.getActivity(), WatchPictureActivity.class);
        fragment.startActivityForResult(intent, i2);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: d */
    public final void mo34175d() {
        m6527f();
    }

    @Override // androidx.core.app.ComponentActivity
    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);
}
