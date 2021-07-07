package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.p118pd.sdk.C8981ooOOoOOo;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.oO00OO  reason: case insensitive filesystem */
public class C7796oO00OO extends Drawable implements C8981ooOOoOOo.OooO0O0, Animatable {
    public static final int o0OOO0o = 119;
    public static final int o0ooOOo = -1;
    public static final int o0ooOoO = 0;
    public Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f20851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20852OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: com.pd.sdk.oO00OO$OooO00o */
    public static final class OooO00o extends Drawable.ConstantState {
        @VisibleForTesting
        public final C8981ooOOoOOo OooO00o;

        public OooO00o(C8981ooOOoOOo oooooooo) {
            this.OooO00o = oooooooo;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @NonNull
        public Drawable newDrawable() {
            return new C7796oO00OO(this);
        }
    }

    @Deprecated
    public C7796oO00OO(Context context, GifDecoder gifDecoder, AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, int i, int i2, Bitmap bitmap) {
        this(context, gifDecoder, o0oooo0o, i, i2, bitmap);
    }

    private void OooO0Oo() {
        this.o00oO0O = 0;
    }

    private void OooO0o() {
        this.OooO0O0 = false;
        this.f20852OooO00o.OooO00o.OooO0O0(this);
    }

    private void OooO0o0() {
        C7842oO0O0.OooO00o(!this.OooO0Oo, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f20852OooO00o.OooO00o.OooO0O0() == 1) {
            invalidateSelf();
        } else if (!this.OooO0O0) {
            this.OooO0O0 = true;
            this.f20852OooO00o.OooO00o.OooO00o(this);
            invalidateSelf();
        }
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m19486OooO00o() {
        return this.f20852OooO00o.OooO00o.m20644OooO0O0();
    }

    public int OooO0O0() {
        return this.f20852OooO00o.OooO00o.m20639OooO00o();
    }

    public int OooO0OO() {
        return this.f20852OooO00o.OooO00o.m20649OooO0o0();
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.OooO0Oo) {
            if (this.OooO0o) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m19483OooO00o());
                this.OooO0o = false;
            }
            canvas.drawBitmap(this.f20852OooO00o.OooO00o.m20640OooO00o(), (Rect) null, m19483OooO00o(), OooO00o());
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f20852OooO00o;
    }

    public int getIntrinsicHeight() {
        return this.f20852OooO00o.OooO00o.m20646OooO0OO();
    }

    public int getIntrinsicWidth() {
        return this.f20852OooO00o.OooO00o.m20648OooO0o();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.OooO0O0;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.OooO0o = true;
    }

    public void setAlpha(int i) {
        OooO00o().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        OooO00o().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C7842oO0O0.OooO00o(!this.OooO0Oo, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.OooO0o0 = z;
        if (!z) {
            OooO0o();
        } else if (this.OooO0OO) {
            OooO0o0();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.OooO0OO = true;
        OooO0Oo();
        if (this.OooO0o0) {
            OooO0o0();
        }
    }

    public void stop() {
        this.OooO0OO = false;
        OooO0o();
    }

    public C7796oO00OO(Context context, GifDecoder gifDecoder, AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, int i, int i2, Bitmap bitmap) {
        this(new OooO00o(new C8981ooOOoOOo(ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context), gifDecoder, i, i2, o0oooo0o, bitmap)));
    }

    public void OooO00o(AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, Bitmap bitmap) {
        this.f20852OooO00o.OooO00o.OooO00o(o0oooo0o, bitmap);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19491OooO0O0() {
        this.OooO0Oo = true;
        this.f20852OooO00o.OooO00o.m20643OooO00o();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m19492OooO0OO() {
        C7842oO0O0.OooO00o(!this.OooO0O0, "You cannot restart a currently running animation.");
        this.f20852OooO00o.OooO00o.m20645OooO0O0();
        start();
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7655o0oOoo0O<Bitmap> m19487OooO00o() {
        return this.f20852OooO00o.OooO00o.m20641OooO00o();
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteBuffer m19488OooO00o() {
        return this.f20852OooO00o.OooO00o.m20642OooO00o();
    }

    public C7796oO00OO(OooO00o oooO00o) {
        this.OooO0o0 = true;
        this.o0ooOO0 = -1;
        this.f20852OooO00o = (OooO00o) C7842oO0O0.OooO00o(oooO00o);
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19485OooO00o() {
        return this.f20852OooO00o.OooO00o.OooO0O0();
    }

    public void OooO00o(boolean z) {
        this.OooO0O0 = z;
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    private Rect m19483OooO00o() {
        if (this.f20851OooO00o == null) {
            this.f20851OooO00o = new Rect();
        }
        return this.f20851OooO00o;
    }

    @VisibleForTesting
    public C7796oO00OO(C8981ooOOoOOo oooooooo, Paint paint) {
        this(new OooO00o(oooooooo));
        this.OooO00o = paint;
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    private Paint OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = new Paint(2);
        }
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    private Drawable.Callback m19484OooO00o() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19489OooO00o() {
        if (m19484OooO00o() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (OooO0O0() == m19485OooO00o() - 1) {
            this.o00oO0O++;
        }
        int i = this.o0ooOO0;
        if (i != -1 && this.o00oO0O >= i) {
            stop();
        }
    }

    @Override // com.p118pd.sdk.C8981ooOOoOOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19490OooO00o() {
        return this.OooO0Oo;
    }

    public void OooO00o(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            int OooO0Oo2 = this.f20852OooO00o.OooO00o.m20647OooO0Oo();
            if (OooO0Oo2 != 0) {
                i2 = OooO0Oo2;
            }
            this.o0ooOO0 = i2;
        } else {
            this.o0ooOO0 = i;
        }
    }
}
