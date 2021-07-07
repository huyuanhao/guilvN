package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.ShapedImageView */
public class ShapedImageView extends ImageView {

    /* renamed from: a */
    public static final ImageView.ScaleType f3659a = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: b */
    public static final Bitmap.Config f3660b = Bitmap.Config.ARGB_8888;

    /* renamed from: c */
    public final RectF f3661c;

    /* renamed from: d */
    public final RectF f3662d;

    /* renamed from: e */
    public final Matrix f3663e;

    /* renamed from: f */
    public final Paint f3664f;

    /* renamed from: g */
    public final Paint f3665g;

    /* renamed from: h */
    public final Paint f3666h;

    /* renamed from: i */
    public int f3667i;

    /* renamed from: j */
    public int f3668j;

    /* renamed from: k */
    public int f3669k;

    /* renamed from: l */
    public int f3670l;

    /* renamed from: m */
    public Bitmap f3671m;

    /* renamed from: n */
    public BitmapShader f3672n;

    /* renamed from: o */
    public int f3673o;

    /* renamed from: p */
    public int f3674p;

    /* renamed from: q */
    public float f3675q;

    /* renamed from: r */
    public float f3676r;

    /* renamed from: s */
    public ColorFilter f3677s;

    /* renamed from: t */
    public boolean f3678t;

    /* renamed from: u */
    public boolean f3679u;

    /* renamed from: v */
    public boolean f3680v;

    public ShapedImageView(Context context) {
        super(context);
        this.f3661c = new RectF();
        this.f3662d = new RectF();
        this.f3663e = new Matrix();
        this.f3664f = new Paint();
        this.f3665g = new Paint();
        this.f3666h = new Paint();
        this.f3667i = -16777216;
        this.f3668j = 0;
        this.f3669k = 0;
        this.f3670l = 0;
        m3737a();
    }

    public ShapedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3661c = new RectF();
        this.f3662d = new RectF();
        this.f3663e = new Matrix();
        this.f3664f = new Paint();
        this.f3665g = new Paint();
        this.f3666h = new Paint();
        this.f3667i = -16777216;
        this.f3668j = 0;
        this.f3669k = 0;
        this.f3670l = 0;
        TypedArray obtainAttributes = getResources().obtainAttributes(attributeSet, C2364R.styleable.ShapedImageView);
        this.f3668j = obtainAttributes.getDimensionPixelSize(C2364R.styleable.ShapedImageView_ysf_siv_border_width, 0);
        this.f3667i = obtainAttributes.getColor(C2364R.styleable.ShapedImageView_ysf_siv_border_color, -16777216);
        this.f3680v = obtainAttributes.getBoolean(C2364R.styleable.ShapedImageView_ysf_siv_border_overlay, false);
        this.f3669k = obtainAttributes.getColor(C2364R.styleable.ShapedImageView_ysf_siv_fill_color, 0);
        this.f3670l = obtainAttributes.getInteger(C2364R.styleable.ShapedImageView_ysf_siv_shape, 0);
        obtainAttributes.recycle();
        m3737a();
    }

    /* renamed from: a */
    public static Bitmap m3736a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f3660b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f3660b);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            C1709a.m3015b("getBitmapFromDrawable is error", "", e);
            return null;
        } catch (OutOfMemoryError e2) {
            C1709a.m3015b("getBitmapFromDrawable is error", "", e2);
            return null;
        }
    }

    /* renamed from: a */
    private void m3737a() {
        super.setScaleType(f3659a);
        this.f3678t = true;
        if (this.f3679u) {
            m3738b();
            this.f3679u = false;
        }
    }

    /* renamed from: b */
    private void m3738b() {
        float f;
        float f2;
        if (!this.f3678t) {
            this.f3679u = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f3671m == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f3671m;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3672n = new BitmapShader(bitmap, tileMode, tileMode);
            this.f3664f.setAntiAlias(true);
            this.f3664f.setShader(this.f3672n);
            this.f3665g.setStyle(Paint.Style.STROKE);
            this.f3665g.setAntiAlias(true);
            this.f3665g.setColor(this.f3667i);
            this.f3665g.setStrokeWidth((float) this.f3668j);
            this.f3666h.setStyle(Paint.Style.FILL);
            this.f3666h.setAntiAlias(true);
            this.f3666h.setColor(this.f3669k);
            this.f3674p = this.f3671m.getHeight();
            this.f3673o = this.f3671m.getWidth();
            float f3 = 0.0f;
            this.f3662d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f3676r = Math.min((this.f3662d.height() - ((float) this.f3668j)) / 2.0f, (this.f3662d.width() - ((float) this.f3668j)) / 2.0f);
            this.f3661c.set(this.f3662d);
            if (!this.f3680v) {
                RectF rectF = this.f3661c;
                int i = this.f3668j;
                rectF.inset((float) i, (float) i);
            }
            this.f3675q = Math.min(this.f3661c.height() / 2.0f, this.f3661c.width() / 2.0f);
            this.f3663e.set(null);
            if (((float) this.f3673o) * this.f3661c.height() > this.f3661c.width() * ((float) this.f3674p)) {
                f2 = this.f3661c.height() / ((float) this.f3674p);
                f3 = (this.f3661c.width() - (((float) this.f3673o) * f2)) * 0.5f;
                f = 0.0f;
            } else {
                f2 = this.f3661c.width() / ((float) this.f3673o);
                f = (this.f3661c.height() - (((float) this.f3674p) * f2)) * 0.5f;
            }
            this.f3663e.setScale(f2, f2);
            Matrix matrix = this.f3663e;
            RectF rectF2 = this.f3661c;
            matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF2.left, ((float) ((int) (f + 0.5f))) + rectF2.top);
            this.f3672n.setLocalMatrix(this.f3663e);
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo34316a(int i) {
        if (this.f3670l == i) {
            return;
        }
        if (i >= 0 || i <= 1) {
            this.f3670l = i;
        }
    }

    public ImageView.ScaleType getScaleType() {
        return f3659a;
    }

    public void onDraw(Canvas canvas) {
        if (this.f3671m != null) {
            if (this.f3670l != 1) {
                if (this.f3669k != 0) {
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f3675q, this.f3666h);
                }
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f3675q, this.f3664f);
                return;
            }
            if (this.f3669k != 0) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f3666h);
            }
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f3664f);
            if (this.f3668j != 0) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f3665g);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m3738b();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f3677s) {
            this.f3677s = colorFilter;
            this.f3664f.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f3671m = bitmap;
        m3738b();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f3671m = m3736a(drawable);
        m3738b();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f3671m = m3736a(getDrawable());
        m3738b();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f3671m = uri != null ? m3736a(getDrawable()) : null;
        m3738b();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f3659a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
