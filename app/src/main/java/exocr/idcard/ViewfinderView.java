package exocr.idcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewProps;

public class ViewfinderView extends View {
    public static final long OooO00o = 10;
    public static boolean OooO0Oo = false;
    public static final float OooO0oo = 22.0f;
    public static final int o000OOo = 20;
    public static final int o0O0O00 = 60;
    public static final String o0OOO0o = ViewfinderView.class.getSimpleName();
    public static final int oo0o0Oo = 255;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f23817OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Paint f23819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23820OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f23821OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Back f23822OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CaptureActivity f23823OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Photo f23824OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Torch f23825OooO00o;
    public Rect OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23826OooO0O0 = true;
    public Rect OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23827OooO0OO = true;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float f23828OooO0Oo = 24.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Rect f23829OooO0Oo;
    public float OooO0o;
    public float OooO0o0 = 1.0f;
    public float OooO0oO;
    public int o00oO0O = 0;
    public final int o0OO00O;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public final int f23830o0OOO0o;
    public int o0Oo0oo;
    public final int o0ooOO0 = 4;
    public final int o0ooOOo = 16;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f23831o0ooOOo;
    public final int o0ooOoO;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public final String f23832o0ooOoO;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23817OooO00o = context;
        this.f23819OooO00o = new Paint();
        this.o0ooOoO = getResources().getColor(ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), ViewProps.COLOR, "viewfinder_mask"));
        this.f23830o0OOO0o = IDCardManager.OooO00o().m22050OooO00o();
        this.o0Oo0oo = IDCardManager.OooO00o().OooO0Oo();
        this.f23826OooO0O0 = IDCardManager.OooO00o().OooOO0();
        this.f23827OooO0OO = IDCardManager.OooO00o().OooOO0O();
        this.f23828OooO0Oo = (float) IDCardManager.OooO00o().OooO0o0();
        this.o0OO00O = -1;
        this.f23832o0ooOoO = new String("本技术由易道博识提供");
        float f = getResources().getDisplayMetrics().density / 1.5f;
        this.OooO0o0 = f;
        this.OooO0o = this.f23828OooO0Oo * f;
        this.OooO0oO = f * 22.0f;
        float f2 = this.OooO0o0;
        this.f23825OooO00o = new Torch(f2 * 60.0f, f2 * 60.0f);
        float f3 = this.OooO0o0;
        this.f23822OooO00o = new Back(f3 * 60.0f, f3 * 60.0f);
        float f4 = this.OooO0o0;
        this.f23824OooO00o = new Photo(f4 * 60.0f, f4 * 60.0f);
        OooO0Oo = false;
        this.f23829OooO0Oo = new Rect();
        if (IDCardManager.OooO00o().OooO0oO()) {
            this.f23821OooO00o = new BitmapDrawable(IDCardManager.OooO00o().m22071OooO0o0());
            return;
        }
        this.f23821OooO00o = context.getResources().getDrawable(ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "drawable", "scan_line_portrait"));
    }

    public static int OooO0O0(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean OooO00o() {
        return OooO0Oo;
    }

    public Point getRealScreenSize() {
        Display defaultDisplay = ((WindowManager) this.f23817OooO00o.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 14 && i3 < 17) {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        } else if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
            i2 = point.x;
        }
        return new Point(i2, i);
    }

    public void onDraw(Canvas canvas) {
        Rect OooO00o2 = CameraManager.OooO00o().m22035OooO00o();
        if (OooO00o2 != null) {
            this.OooO0O0 = ViewUtil.OooO00o(new Point(OooO00o2.left / 2, 60), 60, 60);
            Point realScreenSize = getRealScreenSize();
            this.f23820OooO00o = ViewUtil.OooO00o(new Point(OooO00o2.left / 2, realScreenSize.y - 60), 60, 60);
            this.OooO0OO = ViewUtil.OooO00o(new Point(OooO00o2.left / 2, realScreenSize.y / 2), 60, 60);
            int i = this.o00oO0O + 16;
            this.o00oO0O = i;
            if (i < (OooO00o2.right - OooO00o2.left) - 4) {
                canvas.save();
                Rect rect = this.f23829OooO0Oo;
                int i2 = OooO00o2.left;
                int i3 = this.o00oO0O;
                rect.set(i2 + i3, OooO00o2.top, i2 + 4 + i3, OooO00o2.bottom);
                this.f23821OooO00o.setBounds(this.f23829OooO0Oo);
                this.f23821OooO00o.draw(canvas);
                canvas.restore();
            } else {
                this.o00oO0O = 0;
            }
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            int i4 = (OooO00o2.right - OooO00o2.left) / 20;
            canvas.save();
            this.f23819OooO00o.setColor(this.o0ooOoO);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) OooO00o2.top, this.f23819OooO00o);
            canvas.drawRect(0.0f, (float) OooO00o2.top, (float) OooO00o2.left, (float) (OooO00o2.bottom + 1), this.f23819OooO00o);
            canvas.drawRect((float) (OooO00o2.right + 1), (float) OooO00o2.top, f, (float) (OooO00o2.bottom + 1), this.f23819OooO00o);
            canvas.drawRect(0.0f, (float) (OooO00o2.bottom + 1), f, (float) height, this.f23819OooO00o);
            this.f23819OooO00o.setColor(this.f23830o0OOO0o);
            int i5 = OooO00o2.left;
            int i6 = OooO00o2.top;
            canvas.drawRect((float) i5, (float) i6, (float) (i5 + i4 + 1), (float) (i6 + 10 + 1), this.f23819OooO00o);
            int i7 = OooO00o2.left;
            int i8 = OooO00o2.top;
            canvas.drawRect((float) i7, (float) i8, (float) (i7 + 10 + 1), (float) (i8 + i4 + 1), this.f23819OooO00o);
            int i9 = OooO00o2.right;
            int i10 = OooO00o2.top;
            canvas.drawRect((float) (i9 - i4), (float) i10, (float) (i9 + 1), (float) (i10 + 10 + 1), this.f23819OooO00o);
            int i11 = OooO00o2.right;
            int i12 = OooO00o2.top;
            canvas.drawRect((float) (i11 - 10), (float) i12, (float) (i11 + 1), (float) (i12 + i4 + 1), this.f23819OooO00o);
            int i13 = OooO00o2.left;
            int i14 = OooO00o2.bottom;
            canvas.drawRect((float) i13, (float) (i14 - 10), (float) (i13 + i4 + 1), (float) (i14 + 1), this.f23819OooO00o);
            int i15 = OooO00o2.left;
            int i16 = OooO00o2.bottom;
            canvas.drawRect((float) i15, (float) (i16 - i4), (float) (i15 + 10 + 1), (float) (i16 + 1), this.f23819OooO00o);
            int i17 = OooO00o2.right;
            int i18 = OooO00o2.bottom;
            canvas.drawRect((float) (i17 - i4), (float) (i18 - 10), (float) (i17 + 1), (float) (i18 + 1), this.f23819OooO00o);
            int i19 = OooO00o2.right;
            int i20 = OooO00o2.bottom;
            canvas.drawRect((float) (i19 - 10), (float) (i20 - i4), (float) (i19 + 1), (float) (i20 + 1), this.f23819OooO00o);
            if (this.f23831o0ooOOo != null) {
                this.f23819OooO00o.setTextAlign(Paint.Align.CENTER);
                this.f23819OooO00o.setColor(this.o0Oo0oo);
                this.f23819OooO00o.setTextSize(this.OooO0o);
                canvas.translate((float) (OooO00o2.left + (OooO00o2.width() / 2)), (float) (OooO00o2.top + ((OooO00o2.height() * 1) / 3)));
                canvas.drawText(this.f23831o0ooOOo, 0.0f, 0.0f, this.f23819OooO00o);
            }
            if (this.f23832o0ooOoO != null && this.f23826OooO0O0) {
                canvas.save();
                this.f23819OooO00o.setTextAlign(Paint.Align.CENTER);
                this.f23819OooO00o.setColor(this.o0OO00O);
                this.f23819OooO00o.setTextSize(this.OooO0oO);
                canvas.translate(0.0f, ((float) ((OooO00o2.height() * 2) / 3)) - this.OooO0oO);
                canvas.drawText(this.f23832o0ooOoO, 0.0f, 0.0f, this.f23819OooO00o);
                canvas.drawBitmap(this.f23818OooO00o, (float) (-(((int) ((((float) this.f23832o0ooOoO.length()) * this.OooO0oO) / 2.0f)) + this.f23818OooO00o.getWidth())), (float) (-((int) ((((float) this.f23818OooO00o.getHeight()) + this.OooO0oO) / 2.0f))), this.f23819OooO00o);
                canvas.restore();
            }
            if (this.f23825OooO00o != null) {
                canvas.restore();
                canvas.save();
                canvas.translate(this.OooO0O0.exactCenterX(), this.OooO0O0.exactCenterY() + 30.0f);
                this.f23825OooO00o.OooO00o(canvas, this.f23817OooO00o);
                canvas.restore();
            }
            if (this.f23827OooO0OO) {
                canvas.save();
                canvas.translate(this.OooO0OO.exactCenterX(), this.OooO0OO.exactCenterY());
                this.f23824OooO00o.OooO00o(canvas, this.f23817OooO00o);
                canvas.restore();
            }
            if (this.f23822OooO00o != null) {
                canvas.save();
                canvas.translate(this.f23820OooO00o.exactCenterX(), this.f23820OooO00o.exactCenterY() - 30.0f);
                this.f23822OooO00o.OooO00o(canvas, this.f23817OooO00o);
                canvas.restore();
            }
            postInvalidateDelayed(10, OooO00o2.left, OooO00o2.top, OooO00o2.right, OooO00o2.bottom);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if ((motionEvent.getAction() & 255) == 0) {
                Rect OooO00o2 = ViewUtil.OooO00o(new Point((int) motionEvent.getX(), (int) motionEvent.getY()), 20, 20);
                if (this.OooO0O0 != null && Rect.intersects(this.OooO0O0, OooO00o2)) {
                    DebugLog.m22048OooO00o("torch touched");
                    if (OooO0Oo) {
                        CameraManager.OooO00o().m22039OooO0O0();
                        OooO0Oo = false;
                    } else {
                        CameraManager.OooO00o().OooO0OO();
                        OooO0Oo = true;
                    }
                } else if (this.f23820OooO00o != null && Rect.intersects(this.f23820OooO00o, OooO00o2)) {
                    IDCardManager.OooO00o().OooO0O0(1);
                    IDCardManager.OooO00o().m22060OooO0O0();
                    this.f23823OooO00o.finish();
                } else if (this.OooO0OO != null && Rect.intersects(this.OooO0OO, OooO00o2) && this.f23827OooO0OO) {
                    this.f23823OooO00o.OooO0OO();
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public void setActivity(CaptureActivity captureActivity) {
        this.f23823OooO00o = captureActivity;
    }

    public void setLogo(Bitmap bitmap) {
        this.f23818OooO00o = bitmap;
    }

    public void setTipColor(int i) {
        this.o0Oo0oo = i;
    }

    public void setTipText(String str) {
        this.f23831o0ooOOo = str;
    }

    public void setbLight(boolean z) {
        OooO0Oo = z;
    }

    public static int OooO00o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void OooO00o(Bitmap bitmap) {
        invalidate();
    }
}
