package com.megvii.meglive_sdk.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.megvii.meglive_sdk.volley.C1638t;
import com.megvii.meglive_sdk.volley.toolbox.C1646g;

public class NetworkImageView extends ImageView {

    /* renamed from: a */
    public String f2917a;

    /* renamed from: b */
    public int f2918b;

    /* renamed from: c */
    public int f2919c;

    /* renamed from: d */
    public C1646g f2920d;

    /* renamed from: e */
    public C1646g.C1648c f2921e;

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void onDetachedFromWindow() {
        C1646g.C1648c cVar = this.f2921e;
        if (cVar != null) {
            cVar.mo17380a();
            setImageBitmap(null);
            this.f2921e = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.volley.toolbox.NetworkImageView.onLayout(boolean, int, int, int, int):void");
    }

    public void setDefaultImageResId(int i) {
        this.f2918b = i;
    }

    public void setErrorImageResId(int i) {
        this.f2919c = i;
    }

    public class OooO00o implements C1646g.AbstractC1649d {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f15108OooO00o = true;

        /* renamed from: com.megvii.meglive_sdk.volley.toolbox.NetworkImageView$OooO00o$OooO00o  reason: collision with other inner class name */
        public class RunnableC4905OooO00o implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C1646g.C1648c f15109OooO00o;

            public RunnableC4905OooO00o(C1646g.C1648c cVar) {
                this.f15109OooO00o = cVar;
            }

            public final void run() {
                OooO00o.this.mo17365a(this.f15109OooO00o, false);
            }
        }

        public OooO00o() {
        }

        @Override // com.megvii.meglive_sdk.volley.C1631o.AbstractC1632a
        /* renamed from: a */
        public final void mo16993a(C1638t tVar) {
            if (NetworkImageView.this.f2919c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f2919c);
            }
        }

        @Override // com.megvii.meglive_sdk.volley.toolbox.C1646g.AbstractC1649d
        /* renamed from: a */
        public final void mo17365a(C1646g.C1648c cVar, boolean z) {
            if (!z || !this.f15108OooO00o) {
                Bitmap bitmap = cVar.f2943a;
                if (bitmap != null) {
                    NetworkImageView.this.setImageBitmap(bitmap);
                } else if (NetworkImageView.this.f2918b != 0) {
                    NetworkImageView networkImageView = NetworkImageView.this;
                    networkImageView.setImageResource(networkImageView.f2918b);
                }
            } else {
                NetworkImageView.this.post(new RunnableC4905OooO00o(cVar));
            }
        }
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m2820a() {
        int i = this.f2918b;
        if (i != 0) {
            setImageResource(i);
        } else {
            setImageBitmap(null);
        }
    }
}
