package exocr.bankcard;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

public class OverlayView extends View {
    public static final float OooO = 0.06666667f;
    public static final long OooO00o = 100;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f23671OooO00o = {0, 64, 128, 192, 255, 192, 128, 64};
    public static final float OooO0o = 22.0f;
    public static final float OooO0o0 = 24.0f;
    public static final float OooO0oO = 8.0f;
    public static final float OooO0oo = 32.0f;
    public static final int o000000 = 60;
    public static final int o000000O = 20;
    public static final int o000OOo = 5;
    public static String o0OOO0o;
    public static final String o0ooOOo = OverlayView.class.getSimpleName();
    public static String o0ooOoO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23672OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Paint f23673OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23674OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WeakReference<CardRecoActivity> f23675OooO00o;
    public final Bitmap OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Rect f23676OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23677OooO0O0 = false;
    public final Bitmap OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Rect f23678OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23679OooO0OO = true;
    public float OooO0Oo = 1.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final Bitmap f23680OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Rect f23681OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f23682OooO0Oo = true;

    /* renamed from: OooO0o  reason: collision with other field name */
    public Rect f23683OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public Rect f23684OooO0o0;
    public int o00oO0O;
    public int o0O0O00;
    public int o0OO00O;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public int f23685o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f23686o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f23687o0ooOoO = 1610612736;
    public int oo0o0Oo = -1;

    public OverlayView(CardRecoActivity cardRecoActivity, AttributeSet attributeSet, boolean z) {
        super(cardRecoActivity, attributeSet);
        this.f23682OooO0Oo = z;
        this.f23675OooO00o = new WeakReference<>(cardRecoActivity);
        this.f23686o0ooOOo = 1;
        this.OooO0Oo = getResources().getDisplayMetrics().density / 1.5f;
        if (BankManager.OooO00o().m21997OooO0o()) {
            this.OooO0O0 = BankManager.OooO00o().OooO0Oo();
        } else {
            this.OooO0O0 = BitmapFactory.decodeResource(getResources(), ViewUtil.OooO00o(BankManager.OooO00o().m21987OooO0O0(), "drawable", "photobank"));
        }
        if (BankManager.OooO00o().m21996OooO0Oo()) {
            this.OooO0OO = BankManager.OooO00o().m21978OooO00o();
        } else {
            this.OooO0OO = BitmapFactory.decodeResource(getResources(), ViewUtil.OooO00o(BankManager.OooO00o().m21987OooO0O0(), "drawable", "backbank"));
        }
        this.f23680OooO0Oo = BitmapFactory.decodeResource(getResources(), ViewUtil.OooO00o(BankManager.OooO00o().m21987OooO0O0(), "drawable", "yidaoboshi"));
        this.f23673OooO00o = new Paint(1);
        o0ooOoO = BankManager.OooO00o().m21994OooO0Oo();
        o0OOO0o = "本技术由易道博识提供";
        this.o0Oo0oo = BankManager.OooO00o().OooO0O0();
        this.f23685o0OOO0o = BankManager.OooO00o().OooO0OO();
        this.o0OO00O = BankManager.OooO00o().m21975OooO00o();
        this.f23679OooO0OO = BankManager.OooO00o().m21989OooO0O0();
        this.o0O0O00 = 4;
    }

    public void OooO00o(Rect rect, int i) {
        Point point;
        DebugLog.m22020OooO00o("setGuideAndRotation: " + rect + ", " + i);
        this.o00oO0O = i;
        this.f23674OooO00o = rect;
        if (i % 180 != 0) {
            float f = this.OooO0Oo;
            point = new Point((int) (f * 60.0f), (int) (f * 60.0f));
            this.f23686o0ooOOo = -1;
        } else {
            float f2 = this.OooO0Oo;
            point = new Point((int) (f2 * 60.0f), (int) (f2 * 60.0f));
            this.f23686o0ooOOo = 1;
        }
        if (this.f23676OooO0O0 != null) {
            DebugLog.m22020OooO00o("" + this.f23676OooO0O0 + ", " + point + ", " + this.f23676OooO0O0 + ", " + point);
            Rect rect2 = this.f23676OooO0O0;
            Point point2 = new Point(rect2.left + point.x, rect2.top + point.y);
            float f3 = this.OooO0Oo;
            this.f23684OooO0o0 = ViewUtil.OooO00o(point2, (int) (f3 * 60.0f), (int) (f3 * 60.0f));
            Rect rect3 = this.f23676OooO0O0;
            Point point3 = new Point(rect3.right - point.x, rect3.top + point.y);
            float f4 = this.OooO0Oo;
            this.f23678OooO0OO = ViewUtil.OooO00o(point3, (int) (f4 * 60.0f), (int) (f4 * 60.0f));
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            int width = windowManager.getDefaultDisplay().getWidth();
            windowManager.getDefaultDisplay().getHeight();
            Rect rect4 = this.f23676OooO0O0;
            Point point4 = new Point(rect4.left + (width / 2), rect4.top + point.y);
            float f5 = this.OooO0Oo;
            this.f23681OooO0Oo = ViewUtil.OooO00o(point4, (int) (f5 * 60.0f), (int) (f5 * 60.0f));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x04f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
        // Method dump skipped, instructions count: 1347
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.bankcard.OverlayView.onDraw(android.graphics.Canvas):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if ((motionEvent.getAction() & 255) != 0) {
                return false;
            }
            Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            Rect OooO00o2 = ViewUtil.OooO00o(point, 20, 20);
            DebugLog.m22020OooO00o("onTouchEvent: " + point);
            if (this.f23678OooO0OO != null && Rect.intersects(this.f23678OooO0OO, OooO00o2)) {
                DebugLog.m22020OooO00o("torch touched");
                this.f23675OooO00o.get().OooO0o();
                return false;
            } else if (this.f23681OooO0Oo != null && Rect.intersects(this.f23681OooO0Oo, OooO00o2) && BankManager.OooO00o().OooO()) {
                DebugLog.m22020OooO00o("photo touched");
                this.f23675OooO00o.get().OooO0Oo();
                return false;
            } else if (this.f23684OooO0o0 == null || !Rect.intersects(this.f23684OooO0o0, OooO00o2)) {
                this.f23675OooO00o.get().OooO0oO();
                return false;
            } else {
                BankManager.OooO00o().OooO0o0(1);
                BankManager.OooO00o().m21982OooO00o();
                this.f23675OooO00o.get().finish();
                return false;
            }
        } catch (NullPointerException unused) {
            DebugLog.m22020OooO00o("NullPointerException caught in onTouchEvent method");
            return false;
        }
    }

    private Rect OooO00o(int i, int i2, int i3, int i4) {
        int i5 = (int) (this.OooO0Oo * 2.0f);
        Rect rect = new Rect();
        rect.left = Math.min(i, i3) - i5;
        rect.right = Math.max(i, i3) + i5;
        rect.top = Math.min(i2, i4) - i5;
        rect.bottom = Math.max(i2, i4) + i5;
        return rect;
    }

    public void OooO00o(Bitmap bitmap) {
        RectF rectF = new RectF(2.0f, 2.0f, (float) (bitmap.getWidth() - 2), (float) (bitmap.getHeight() - 2));
        float height = ((float) bitmap.getHeight()) * 0.06666667f;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        Canvas canvas2 = new Canvas(bitmap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        paint2.setXfermode(null);
        createBitmap.recycle();
    }

    public boolean OooO00o() {
        return this.o0ooOO0 != 0;
    }

    public void OooO00o(Rect rect) {
        this.f23676OooO0O0 = rect;
    }

    public void OooO00o(boolean z) {
        this.f23677OooO0O0 = z;
        invalidate();
    }
}
