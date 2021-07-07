package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.p118pd.sdk.C7754o0oooo00;
import java.util.HashMap;

/* renamed from: com.pd.sdk.o0oooOo  reason: case insensitive filesystem */
public final class C7749o0oooOo {
    public final Handler OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DecodeFormat f20761OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20762OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7745o0oooO0o f20763OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RunnableC7750o0oooOo0 f20764OooO00o;

    public C7749o0oooOo(AbstractC7745o0oooO0o o0oooo0o, AbstractC7711o0ooO0OO o0ooo0oo, DecodeFormat decodeFormat) {
        this.f20763OooO00o = o0oooo0o;
        this.f20762OooO00o = o0ooo0oo;
        this.f20761OooO00o = decodeFormat;
    }

    public void OooO00o(C7754o0oooo00.OooO00o... oooO00oArr) {
        RunnableC7750o0oooOo0 o0ooooo0 = this.f20764OooO00o;
        if (o0ooooo0 != null) {
            o0ooooo0.m19394OooO00o();
        }
        C7754o0oooo00[] o0oooo00Arr = new C7754o0oooo00[oooO00oArr.length];
        for (int i = 0; i < oooO00oArr.length; i++) {
            C7754o0oooo00.OooO00o oooO00o = oooO00oArr[i];
            if (oooO00o.OooO00o() == null) {
                oooO00o.OooO00o(this.f20761OooO00o == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            o0oooo00Arr[i] = oooO00o.m19401OooO00o();
        }
        RunnableC7750o0oooOo0 o0ooooo02 = new RunnableC7750o0oooOo0(this.f20762OooO00o, this.f20763OooO00o, OooO00o(o0oooo00Arr));
        this.f20764OooO00o = o0ooooo02;
        this.OooO00o.post(o0ooooo02);
    }

    @VisibleForTesting
    public C7751o0oooOoO OooO00o(C7754o0oooo00... o0oooo00Arr) {
        long OooO00o2 = (this.f20763OooO00o.OooO00o() - this.f20763OooO00o.OooO0O0()) + this.f20762OooO00o.OooO00o();
        int i = 0;
        for (C7754o0oooo00 o0oooo00 : o0oooo00Arr) {
            i += o0oooo00.OooO0O0();
        }
        float f = ((float) OooO00o2) / ((float) i);
        HashMap hashMap = new HashMap();
        for (C7754o0oooo00 o0oooo002 : o0oooo00Arr) {
            hashMap.put(o0oooo002, Integer.valueOf(Math.round(((float) o0oooo002.OooO0O0()) * f) / OooO00o(o0oooo002)));
        }
        return new C7751o0oooOoO(hashMap);
    }

    public static int OooO00o(C7754o0oooo00 o0oooo00) {
        return oO0O0O00.OooO00o(o0oooo00.OooO0OO(), o0oooo00.OooO00o(), o0oooo00.m19400OooO00o());
    }
}
