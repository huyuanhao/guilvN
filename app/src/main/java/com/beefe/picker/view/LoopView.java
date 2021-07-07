package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.p118pd.sdk.AbstractC7589o0o0OO;
import com.p118pd.sdk.C7590o0o0OO0;
import com.p118pd.sdk.C7591o0o0OO0O;
import com.p118pd.sdk.C7596o0o0OOOo;
import com.p118pd.sdk.HandlerC7592o0o0OO0o;
import com.p118pd.sdk.RunnableC7594o0o0OOO0;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class LoopView extends View {
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f14779OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint f14780OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f14781OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f14782OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public GestureDetector f14783OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7589o0o0OO f14784OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f14785OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScheduledExecutorService f14786OooO00o = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScheduledFuture<?> f14787OooO00o;
    public Paint OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14788OooO0O0;
    public Paint OooO0OO;
    public float OooO0Oo = 1.05f;
    public float OooO0o;
    public float OooO0o0;
    public int o00000 = 0;
    public int o000000;
    public int o000000O;
    public int o000000o;
    public int o000OOo;
    public int o00oO0O;
    public int o0O0O00 = 7;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f14789o0ooOOo;
    public int o0ooOoO;
    public int oo0o0Oo;

    public enum ACTION {
        CLICK,
        FLING,
        DRAG
    }

    public LoopView(Context context) {
        super(context);
        OooO00o(context);
    }

    private void OooO00o(Context context) {
        this.f14779OooO00o = context;
        this.f14782OooO00o = new HandlerC7592o0o0OO0o(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C7591o0o0OO0O(this));
        this.f14783OooO00o = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.OooO0o0 = 2.0f;
        this.f14788OooO0O0 = true;
        this.o000OOo = 9;
        this.o00oO0O = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
        this.o0OOO0o = 0;
        this.o0Oo0oo = -1;
        OooO0Oo();
    }

    private void OooO0Oo() {
        Paint paint = new Paint();
        this.f14780OooO00o = paint;
        paint.setColor(-5263441);
        this.f14780OooO00o.setAntiAlias(true);
        this.f14780OooO00o.setTypeface(Typeface.MONOSPACE);
        this.f14780OooO00o.setTextSize((float) this.o00oO0O);
        Paint paint2 = new Paint();
        this.OooO0O0 = paint2;
        paint2.setColor(-16777216);
        this.OooO0O0.setAntiAlias(true);
        this.OooO0O0.setTextScaleX(this.OooO0Oo);
        this.OooO0O0.setTypeface(Typeface.MONOSPACE);
        this.OooO0O0.setTextSize((float) this.o00oO0O);
        Paint paint3 = new Paint();
        this.OooO0OO = paint3;
        paint3.setColor(-4670526);
        this.OooO0OO.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    private void OooO0o0() {
        List<String> list = this.f14785OooO00o;
        if (list != null) {
            int i = this.o00oO0O;
            this.o0ooOO0 = i;
            float f = this.OooO0o0;
            int i2 = (int) (((float) i) * f * ((float) (this.o000OOo - 1)));
            this.o000000O = i2;
            double d = (double) (i2 * 2);
            Double.isNaN(d);
            int i3 = (int) (d / 3.141592653589793d);
            this.o000000 = i3;
            double d2 = (double) i2;
            Double.isNaN(d2);
            this.o000000o = (int) (d2 / 3.141592653589793d);
            this.o0ooOOo = (int) ((((float) i3) - (((float) i) * f)) / 2.0f);
            this.o0ooOoO = (int) ((((float) i3) + (f * ((float) i))) / 2.0f);
            if (this.o0Oo0oo == -1) {
                if (this.f14788OooO0O0) {
                    this.o0Oo0oo = (list.size() + 1) / 2;
                } else {
                    this.o0Oo0oo = 0;
                }
            }
            this.oo0o0Oo = this.o0Oo0oo;
        }
    }

    public final void OooO0O0() {
        if (this.f14784OooO00o != null) {
            postDelayed(new RunnableC7594o0o0OOO0(this), 200);
        }
    }

    public final void OooO0OO() {
        this.f14788OooO0O0 = false;
    }

    public final int getSelectedIndex() {
        return this.o0OO00O;
    }

    public String getSelectedItem() {
        return this.f14789o0ooOOo;
    }

    public int getViewHeight() {
        return this.o000000;
    }

    public void onDraw(Canvas canvas) {
        List<String> list = this.f14785OooO00o;
        if (list != null) {
            String[] strArr = new String[this.o000OOo];
            int size = this.o0Oo0oo + (((int) (((float) this.o0OOO0o) / (this.OooO0o0 * ((float) this.o0ooOO0)))) % list.size());
            this.oo0o0Oo = size;
            if (!this.f14788OooO0O0) {
                if (size < 0) {
                    this.oo0o0Oo = 0;
                }
                if (this.oo0o0Oo > this.f14785OooO00o.size() - 1) {
                    this.oo0o0Oo = this.f14785OooO00o.size() - 1;
                }
            } else {
                if (size < 0) {
                    this.oo0o0Oo = this.f14785OooO00o.size() + this.oo0o0Oo;
                }
                if (this.oo0o0Oo > this.f14785OooO00o.size() - 1) {
                    this.oo0o0Oo -= this.f14785OooO00o.size();
                }
            }
            int i = (int) (((float) this.o0OOO0o) % (this.OooO0o0 * ((float) this.o0ooOO0)));
            int i2 = 0;
            while (true) {
                int i3 = this.o000OOo;
                if (i2 >= i3) {
                    break;
                }
                int i4 = this.oo0o0Oo - ((i3 / 2) - i2);
                if (this.f14788OooO0O0) {
                    while (i4 < 0) {
                        i4 += this.f14785OooO00o.size();
                    }
                    while (i4 > this.f14785OooO00o.size() - 1) {
                        i4 -= this.f14785OooO00o.size();
                    }
                    strArr[i2] = this.f14785OooO00o.get(i4);
                } else if (i4 < 0) {
                    strArr[i2] = "";
                } else if (i4 > this.f14785OooO00o.size() - 1) {
                    strArr[i2] = "";
                } else {
                    strArr[i2] = this.f14785OooO00o.get(i4);
                }
                i2++;
            }
            canvas.drawLine(0.0f, (float) this.o0ooOOo, (float) getWidth(), (float) this.o0ooOOo, this.OooO0OO);
            canvas.drawLine(0.0f, (float) this.o0ooOoO, (float) getWidth(), (float) this.o0ooOoO, this.OooO0OO);
            for (int i5 = 0; i5 < this.o000OOo; i5++) {
                canvas.save();
                float f = ((float) this.o0ooOO0) * this.OooO0o0;
                double d = (double) ((((float) i5) * f) - ((float) i));
                Double.isNaN(d);
                double d2 = (double) this.o000000O;
                Double.isNaN(d2);
                double d3 = (d * 3.141592653589793d) / d2;
                float f2 = (float) (90.0d - ((d3 / 3.141592653589793d) * 180.0d));
                if (f2 >= 90.0f || f2 <= -90.0f) {
                    canvas.restore();
                } else {
                    double d4 = (double) this.o000000o;
                    double cos = Math.cos(d3);
                    double d5 = (double) this.o000000o;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    double d6 = d4 - (cos * d5);
                    double sin = Math.sin(d3);
                    double d7 = (double) this.o0ooOO0;
                    Double.isNaN(d7);
                    int i6 = (int) (d6 - ((sin * d7) / 2.0d));
                    canvas.translate(0.0f, (float) i6);
                    canvas.scale(1.0f, (float) Math.sin(d3));
                    String str = strArr[i5];
                    int i7 = this.o0ooOOo;
                    if (i6 > i7 || this.o0ooOO0 + i6 < i7) {
                        int i8 = this.o0ooOoO;
                        if (i6 <= i8 && this.o0ooOO0 + i6 >= i8) {
                            canvas.save();
                            canvas.clipRect(0, 0, getWidth(), this.o0ooOoO - i6);
                            OooO00o(canvas, str, OooO00o(str, this.OooO0O0), OooO00o(this.OooO0O0), this.OooO0O0);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(0, this.o0ooOoO - i6, getWidth(), (int) f);
                            OooO00o(canvas, str, OooO00o(str, this.f14780OooO00o), OooO00o(this.f14780OooO00o), this.f14780OooO00o);
                            canvas.restore();
                        } else if (i6 < this.o0ooOOo || this.o0ooOO0 + i6 > this.o0ooOoO) {
                            canvas.clipRect(0, 0, getWidth(), (int) f);
                            OooO00o(canvas, str, OooO00o(str, this.f14780OooO00o), OooO00o(this.f14780OooO00o), this.f14780OooO00o);
                        } else {
                            canvas.clipRect(0, 0, getWidth(), (int) f);
                            OooO00o(canvas, str, OooO00o(str, this.OooO0O0), OooO00o(this.OooO0O0), this.OooO0O0);
                            this.f14789o0ooOOo = str;
                            this.o0OO00O = this.f14785OooO00o.indexOf(str);
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(0, 0, getWidth(), this.o0ooOOo - i6);
                        OooO00o(canvas, str, OooO00o(str, this.f14780OooO00o), OooO00o(this.f14780OooO00o), this.f14780OooO00o);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0, this.o0ooOOo - i6, getWidth(), (int) f);
                        OooO00o(canvas, str, OooO00o(str, this.OooO0O0), OooO00o(this.OooO0O0), this.OooO0O0);
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        OooO0o0();
        setMeasuredDimension(i, this.o000000);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f14783OooO00o.onTouchEvent(motionEvent);
        float f = this.OooO0o0 * ((float) this.o0ooOO0);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.OooO00o = System.currentTimeMillis();
            OooO00o();
            this.OooO0o = motionEvent.getRawY();
        } else if (action == 2) {
            this.OooO0o = motionEvent.getRawY();
            this.o0OOO0o = (int) (((float) this.o0OOO0o) + (this.OooO0o - motionEvent.getRawY()));
            if (!this.f14788OooO0O0) {
                float f2 = ((float) (-this.o0Oo0oo)) * f;
                float size = ((float) ((this.f14785OooO00o.size() - 1) - this.o0Oo0oo)) * f;
                int i = this.o0OOO0o;
                if (((float) i) < f2) {
                    this.o0OOO0o = (int) f2;
                } else if (((float) i) > size) {
                    this.o0OOO0o = (int) size;
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i2 = this.o000000o;
            double acos = Math.acos((double) ((((float) i2) - y) / ((float) i2)));
            double d = (double) this.o000000o;
            Double.isNaN(d);
            double d2 = acos * d;
            double d3 = (double) (f / 2.0f);
            Double.isNaN(d3);
            double d4 = d2 + d3;
            double d5 = (double) f;
            Double.isNaN(d5);
            this.o00000 = (int) ((((float) (((int) (d4 / d5)) - (this.o000OOo / 2))) * f) - (((((float) this.o0OOO0o) % f) + f) % f));
            if (System.currentTimeMillis() - this.OooO00o > 120) {
                OooO00o(ACTION.DRAG);
            } else {
                OooO00o(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    public final void setItems(List<String> list) {
        this.f14785OooO00o = list;
        OooO0o0();
        invalidate();
    }

    public final void setListener(AbstractC7589o0o0OO o0o0oo) {
        this.f14784OooO00o = o0o0oo;
    }

    public void setSelectedItem(String str) {
        setSelectedPosition(this.f14785OooO00o.indexOf(str));
    }

    public final void setSelectedPosition(int i) {
        if (i < 0) {
            this.o0Oo0oo = 0;
        } else {
            List<String> list = this.f14785OooO00o;
            if (list != null && list.size() > i) {
                this.o0Oo0oo = i;
            }
        }
        this.o0OO00O = i;
        this.o0OOO0o = 0;
        OooO00o();
        invalidate();
    }

    public void setTextColor(int i) {
        this.OooO0O0.setColor(i);
        invalidate();
    }

    public final void setTextEllipsisLen(int i) {
        this.o0O0O00 = i;
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.f14779OooO00o.getResources().getDisplayMetrics().density * f);
            this.o00oO0O = i;
            this.f14780OooO00o.setTextSize((float) i);
            this.OooO0O0.setTextSize((float) this.o00oO0O);
            OooO0o0();
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        this.f14780OooO00o.setTypeface(typeface);
        this.OooO0O0.setTypeface(typeface);
        invalidate();
    }

    public LoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    public void OooO00o(ACTION action) {
        OooO00o();
        if (action == ACTION.FLING || action == ACTION.DRAG) {
            float f = this.OooO0o0 * ((float) this.o0ooOO0);
            int i = (int) (((((float) this.o0OOO0o) % f) + f) % f);
            this.o00000 = i;
            if (((float) i) > f / 2.0f) {
                this.o00000 = (int) (f - ((float) i));
            } else {
                this.o00000 = -i;
            }
        }
        this.f14787OooO00o = this.f14786OooO00o.scheduleWithFixedDelay(new C7596o0o0OOOo(this, this.o00000), 0, 10, TimeUnit.MILLISECONDS);
    }

    public LoopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o(context);
    }

    public final void OooO00o(float f) {
        OooO00o();
        this.f14787OooO00o = this.f14786OooO00o.scheduleWithFixedDelay(new C7590o0o0OO0(this, f), 0, (long) 10, TimeUnit.MILLISECONDS);
    }

    public void OooO00o() {
        ScheduledFuture<?> scheduledFuture = this.f14787OooO00o;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f14787OooO00o.cancel(true);
            this.f14787OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14981OooO00o(String str) {
        return this.f14785OooO00o.indexOf(str) != -1;
    }

    public int OooO00o(String str) {
        return this.f14785OooO00o.indexOf(str);
    }

    public String OooO00o(int i) {
        return this.f14785OooO00o.get(i);
    }

    public final void OooO00o(Canvas canvas, String str, float f, float f2, Paint paint) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < charArray.length && i < this.o0O0O00 * 2; i2++) {
            char c = charArray[i2];
            i = (c > 127 || c == '^') ? i + 2 : i + 1;
            stringBuffer.append(String.valueOf(c));
        }
        if (charArray.length != stringBuffer.toString().toCharArray().length) {
            str = stringBuffer.toString() + "...";
        }
        canvas.drawText(str, f, f2, paint);
    }

    private float OooO00o(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.f14781OooO00o);
        if ((((float) getWidth()) - (((float) this.f14781OooO00o.width()) * this.OooO0Oo)) / 2.0f > 0.0f) {
            return (((float) getWidth()) - (((float) this.f14781OooO00o.width()) * this.OooO0Oo)) / 2.0f;
        }
        return 0.0f;
    }

    private float OooO00o(Paint paint) {
        Rect rect = new Rect(0, 0, getWidth(), this.o0ooOO0);
        RectF rectF = new RectF(rect);
        rectF.bottom = paint.descent() - paint.ascent();
        float height = rectF.top + ((((float) rect.height()) - rectF.bottom) / 2.0f);
        rectF.top = height;
        return height - paint.ascent();
    }
}
