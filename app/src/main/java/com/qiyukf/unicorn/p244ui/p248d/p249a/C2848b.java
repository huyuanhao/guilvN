package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;

/* renamed from: com.qiyukf.unicorn.ui.d.a.b */
public final class C2848b {
    /* renamed from: a */
    public static void m6622a(final C2515i.C2517b bVar, ViewGroup viewGroup, int i, boolean z) {
        if (TextUtils.equals(SocializeProtocolConstants.IMAGE, bVar.mo35823a())) {
            final float dimension = (((z ? viewGroup.getResources().getDimension(C2364R.dimen.ysf_bubble_content_max_width) : (float) C1862c.m3539a()) - ((float) viewGroup.getPaddingLeft())) - ((float) viewGroup.getPaddingRight())) / ((float) i);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_message_item_card_image, viewGroup, false);
            final ImageView imageView = (ImageView) inflate.findViewById(C2364R.C2367id.ysf_card_image);
            viewGroup.addView(inflate);
            C1870a.m3569a(bVar.mo35825b(), new ImageLoaderListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2848b.C28491 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    float f = imageView.getResources().getDisplayMetrics().density;
                    imageView.setImageBitmap(bitmap);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.width = (int) Math.min(((float) bitmap.getWidth()) * f, dimension);
                    layoutParams.gravity = C2848b.m6624c(bVar);
                    imageView.setLayoutParams(layoutParams);
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            });
            return;
        }
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_message_item_card_text, viewGroup, false);
        viewGroup.addView(textView);
        textView.setText(bVar.mo35825b());
        textView.setTextColor(m6623b(bVar));
        textView.setTextSize(z ? 14.0f : 16.0f);
        textView.setGravity(m6624c(bVar));
        textView.setMaxLines(bVar.mo35824a(8) ? 1 : 3);
        TextPaint paint = textView.getPaint();
        if (bVar.mo35824a(1)) {
            paint.setFakeBoldText(true);
        }
        if (bVar.mo35824a(2)) {
            if (!TextUtils.isEmpty(bVar.mo35825b())) {
                textView.setText(bVar.mo35825b().concat(" "));
            }
            paint.setTextSkewX(-0.2f);
        }
        if (bVar.mo35824a(4)) {
            paint.setUnderlineText(true);
        }
    }

    @ColorInt
    /* renamed from: b */
    public static int m6623b(C2515i.C2517b bVar) {
        try {
            return Color.parseColor(bVar.mo35826c());
        } catch (Exception unused) {
            return -16777216;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6624c(com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i.C2517b r3) {
        /*
            java.lang.String r3 = r3.mo35827d()
            int r0 = r3.hashCode()
            r1 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r2 = 1
            if (r0 == r1) goto L_0x002d
            r1 = 3317767(0x32a007, float:4.649182E-39)
            if (r0 == r1) goto L_0x0023
            r1 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r0 == r1) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            java.lang.String r0 = "right"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            r3 = 0
            goto L_0x0038
        L_0x0023:
            java.lang.String r0 = "left"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            r3 = 2
            goto L_0x0038
        L_0x002d:
            java.lang.String r0 = "center"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = -1
        L_0x0038:
            if (r3 == 0) goto L_0x0043
            if (r3 == r2) goto L_0x0040
            r3 = 8388611(0x800003, float:1.1754948E-38)
            return r3
        L_0x0040:
            r3 = 17
            return r3
        L_0x0043:
            r3 = 8388613(0x800005, float:1.175495E-38)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p248d.p249a.C2848b.m6624c(com.qiyukf.unicorn.f.a.a.a.i$b):int");
    }
}
