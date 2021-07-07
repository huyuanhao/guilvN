package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1825b;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1846e;
import com.qiyukf.basesdk.p138c.p140b.C1844d;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.session.activity.WatchVideoActivity;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2003b;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nimlib.p198j.p199a.C2335a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.qiyukf.unicorn.k.f */
public final class C2700f {

    /* renamed from: a */
    public static final int f5599a = C1862c.m3540a(90.0f);

    /* renamed from: b */
    public static final String f5600b = String.format(Locale.getDefault(), "imageView&thumbnail=%dx0", Integer.valueOf(f5599a));

    /* renamed from: a */
    public static String m6245a(String str) {
        return TextUtils.isEmpty(str) ? str : Html.fromHtml(str.replaceAll("<(img|IMG)\\s+([^>]*)>", C2452d.m5367c().getString(C2364R.string.ysf_msg_notify_image))).toString();
    }

    /* renamed from: a */
    public static void m6246a(final TextView textView, String str, final int i, String str2) {
        final Context context = textView.getContext();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final C1844d a = C1844d.m3489a(str).mo34114b(str2).mo34110a(new AbstractC1825b() {
            /* class com.qiyukf.unicorn.p232k.C2700f.C27022 */

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b
            /* renamed from: a */
            public final Drawable mo34099a() {
                return C7009o000OoOo.m18256OooO00o(context, C2364R.C2366drawable.ysf_image_placeholder_loading);
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b
            /* renamed from: a */
            public final void mo34100a(String str, final AbstractC1825b.AbstractC1826a aVar) {
                C1870a.m3569a(C2700f.m6248c(str), new ImageLoaderListener() {
                    /* class com.qiyukf.unicorn.p232k.C2700f.C27022.C27031 */

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadComplete(@NonNull Bitmap bitmap) {
                        aVar.mo34079a(bitmap);
                    }

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadFailed(Throwable th) {
                        atomicBoolean.set(true);
                        aVar.mo34078a();
                    }
                });
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b
            /* renamed from: b */
            public final Drawable mo34101b() {
                return C7009o000OoOo.m18256OooO00o(context, C2364R.C2366drawable.ysf_image_placeholder_fail);
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b
            /* renamed from: b */
            public final void mo34102b(String str, final AbstractC1825b.AbstractC1826a aVar) {
                if (context != null) {
                    if ("defaultImg".equals(str) || TextUtils.isEmpty(str)) {
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C2364R.C2366drawable.ysf_ic_default_video_img);
                        aVar.mo34079a(C2335a.m5071a(decodeResource, C2335a.m5070a(BitmapFactory.decodeResource(context.getResources(), C2364R.C2366drawable.ysf_video_play_icon), decodeResource.getWidth() / 4, decodeResource.getWidth() / 4)));
                        return;
                    }
                    C1870a.m3569a(str, new ImageLoaderListener() {
                        /* class com.qiyukf.unicorn.p232k.C2700f.C27022.C27042 */

                        @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                        public final void onLoadComplete(@NonNull Bitmap bitmap) {
                            aVar.mo34079a(C2335a.m5071a(bitmap, C2335a.m5070a(BitmapFactory.decodeResource(context.getResources(), C2364R.C2366drawable.ysf_video_play_icon), bitmap.getWidth() / 4, bitmap.getWidth() / 4)));
                        }

                        @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                        public final void onLoadFailed(Throwable th) {
                            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C2364R.C2366drawable.ysf_ic_default_video_img);
                            aVar.mo34079a(C2335a.m5071a(decodeResource, C2335a.m5070a(BitmapFactory.decodeResource(context.getResources(), C2364R.C2366drawable.ysf_video_play_icon), decodeResource.getWidth() / 4, decodeResource.getWidth() / 4)));
                        }
                    });
                }
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b
            /* renamed from: c */
            public final int mo34103c() {
                return i;
            }
        }).mo34111a(new C1844d.AbstractC1845a() {
            /* class com.qiyukf.unicorn.p232k.C2700f.C27011 */

            @Override // com.qiyukf.basesdk.p138c.p140b.C1844d.AbstractC1845a
            /* renamed from: a */
            public final CharSequence mo34115a(SpannableStringBuilder spannableStringBuilder) {
                return C2015e.m4002a(context, C1990f.m3945a(context, spannableStringBuilder));
            }
        });
        a.mo34112a(new AbstractC1846e() {
            /* class com.qiyukf.unicorn.p232k.C2700f.C27053 */

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1846e
            /* renamed from: a */
            public final void mo34116a(Context context, String str) {
                WatchVideoActivity.start(context, str);
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1846e
            /* renamed from: a */
            public final void mo34117a(Context context, String str, String str2) {
                C2003b.m3987a(context, str, str2);
            }

            @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1846e
            /* renamed from: a */
            public final void mo34118a(Context context, List<String> list, int i) {
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                    a.mo34113a(textView);
                }
                UrlImagePreviewActivity.start(context, (ArrayList) list, i);
            }
        });
        a.mo34113a(textView);
    }

    /* renamed from: b */
    public static boolean m6247b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (!TextUtils.isEmpty(host)) {
            return host.endsWith("nosdn.127.net") || host.endsWith("nos.netease.com");
        }
        return false;
    }

    /* renamed from: c */
    public static String m6248c(String str) {
        if (!m6247b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = C8932ooOOO0o.f22176OooO00o;
        if (str.contains(str2)) {
            str2 = "&";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        return sb2 + f5600b;
    }
}
