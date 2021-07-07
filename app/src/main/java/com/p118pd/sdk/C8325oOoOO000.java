package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.p118pd.sdk.AbstractC8308oOo0O00O;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO000  reason: case insensitive filesystem */
public class C8325oOoOO000 extends AbstractC8324oOoOO00 {
    public Bitmap.Config OooO00o = Bitmap.Config.ARGB_8888;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Canvas f21419OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8258oOOooOoO f21420OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<Bitmap> f21421OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<AbstractC8265oOOoooO0, OooO0O0> f21422OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21423OooO00o = new float[4];
    public Path OooO0O0 = new Path();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f21424OooO0O0 = new float[2];
    public Path OooO0OO = new Path();
    public Path OooO0Oo = new Path();
    public Paint OooO0o0;

    /* renamed from: com.pd.sdk.oOoOO000$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C8325oOoOO000.OooO00o.OooO00o = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8325oOoOO000.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C8325oOoOO000.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.C8325oOoOO000.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8325oOoOO000.OooO00o.<clinit>():void");
        }
    }

    public C8325oOoOO000(AbstractC8258oOOooOoO oooooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo2) {
        super(oooo0o0, oooooooo2);
        this.f21420OooO00o = oooooooo;
        Paint paint = new Paint(1);
        this.OooO0o0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.OooO0o0.setColor(-1);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20006OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        int OooO0oo = (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0oo();
        int OooO0oO = (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0oO();
        WeakReference<Bitmap> weakReference = this.f21421OooO00o;
        if (!(weakReference != null && weakReference.get().getWidth() == OooO0oo && this.f21421OooO00o.get().getHeight() == OooO0oO)) {
            if (OooO0oo > 0 && OooO0oO > 0) {
                this.f21421OooO00o = new WeakReference<>(Bitmap.createBitmap(OooO0oo, OooO0oO, this.OooO00o));
                this.f21419OooO00o = new Canvas(this.f21421OooO00o.get());
            } else {
                return;
            }
        }
        this.f21421OooO00o.get().eraseColor(0);
        for (AbstractC8264oOOoooO ooooooo : this.f21420OooO00o.getLineData().m19905OooO00o()) {
            if (ooooooo.isVisible()) {
                OooO00o(canvas, ooooooo);
            }
        }
        canvas.drawBitmap(this.f21421OooO00o.get(), 0.0f, 0.0f, ((AbstractC8321oOoO0ooO) this).OooO00o);
    }

    public void OooO0O0(AbstractC8264oOOoooO ooooooo) {
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        C8351oOoOOo0o OooO00o2 = this.f21420OooO00o.OooO00o(ooooooo.m19949OooO00o());
        ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.f21420OooO00o, ooooooo);
        this.OooO0O0.reset();
        AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
        if (oooO00o.OooO0OO >= 1) {
            Entry OooO00o3 = ooooooo.m19951OooO00o(oooO00o.OooO00o);
            this.OooO0O0.moveTo(OooO00o3.OooO0O0(), OooO00o3.OooO00o() * OooO0O02);
            int i = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + 1;
            while (true) {
                AbstractC8308oOo0O00O.OooO00o oooO00o2 = ((AbstractC8308oOo0O00O) this).OooO00o;
                if (i > oooO00o2.OooO0OO + oooO00o2.OooO00o) {
                    break;
                }
                Entry OooO00o4 = ooooooo.m19951OooO00o(i);
                float OooO0O03 = OooO00o3.OooO0O0() + ((OooO00o4.OooO0O0() - OooO00o3.OooO0O0()) / 2.0f);
                this.OooO0O0.cubicTo(OooO0O03, OooO00o3.OooO00o() * OooO0O02, OooO0O03, OooO00o4.OooO00o() * OooO0O02, OooO00o4.OooO0O0(), OooO00o4.OooO00o() * OooO0O02);
                i++;
                OooO00o3 = OooO00o4;
            }
        }
        if (ooooooo.OooO0o()) {
            this.OooO0OO.reset();
            this.OooO0OO.addPath(this.OooO0O0);
            OooO00o(this.f21419OooO00o, ooooooo, this.OooO0OO, OooO00o2, ((AbstractC8308oOo0O00O) this).OooO00o);
        }
        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(ooooooo.m19965OooOOOO());
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.STROKE);
        OooO00o2.OooO00o(this.OooO0O0);
        this.f21419OooO00o.drawPath(this.OooO0O0, ((AbstractC8321oOoO0ooO) this).OooO00o);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setPathEffect(null);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        int i;
        C8349oOoOOo00 oooooo00;
        float f;
        float f2;
        if (OooO00o(this.f21420OooO00o)) {
            List OooO00o2 = this.f21420OooO00o.getLineData().m19905OooO00o();
            for (int i2 = 0; i2 < OooO00o2.size(); i2++) {
                AbstractC8264oOOoooO ooooooo = (AbstractC8264oOOoooO) OooO00o2.get(i2);
                if (OooO00o((AbstractC8265oOOoooO0) ooooooo)) {
                    OooO00o((AbstractC8265oOOoooO0) ooooooo);
                    C8351oOoOOo0o OooO00o3 = this.f21420OooO00o.OooO00o(ooooooo.m19949OooO00o());
                    int OooOOoo = (int) (ooooooo.OooOOoo() * 1.75f);
                    if (!ooooooo.m19945OooO0Oo()) {
                        OooOOoo /= 2;
                    }
                    ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.f21420OooO00o, ooooooo);
                    float OooO00o4 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
                    float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                    float[] OooO00o5 = OooO00o3.OooO00o(ooooooo, OooO00o4, OooO0O02, oooO00o.OooO00o, oooO00o.OooO0O0);
                    C8349oOoOOo00 OooO00o6 = C8349oOoOOo00.OooO00o(ooooooo.m19953OooO00o());
                    OooO00o6.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.f21456OooO00o);
                    OooO00o6.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.OooO0O0);
                    int i3 = 0;
                    while (i3 < OooO00o5.length) {
                        float f3 = OooO00o5[i3];
                        float f4 = OooO00o5[i3 + 1];
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f3)) {
                            break;
                        }
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f3) || !((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(f4)) {
                            i = i3;
                            oooooo00 = OooO00o6;
                        } else {
                            int i4 = i3 / 2;
                            Entry OooO00o7 = ooooooo.m19951OooO00o(((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + i4);
                            if (ooooooo.OooO0OO()) {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                oooooo00 = OooO00o6;
                                OooO00o(canvas, ooooooo.m19952OooO00o(), OooO00o7.OooO00o(), OooO00o7, i2, f3, f4 - ((float) OooOOoo), ooooooo.OooO0Oo(i4));
                            } else {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                oooooo00 = OooO00o6;
                            }
                            if (OooO00o7.m19898OooO00o() != null && ooooooo.OooOo00()) {
                                Drawable OooO00o8 = OooO00o7.m19898OooO00o();
                                AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o8, (int) (f + oooooo00.f21456OooO00o), (int) (f2 + oooooo00.OooO0O0), OooO00o8.getIntrinsicWidth(), OooO00o8.getIntrinsicHeight());
                            }
                        }
                        i3 = i + 2;
                        OooO00o6 = oooooo00;
                    }
                    C8349oOoOOo00.m20016OooO00o(OooO00o6);
                }
            }
        }
    }

    public void OooO0Oo(Canvas canvas) {
        OooO0O0 oooO0O0;
        Bitmap OooO00o2;
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.FILL);
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float[] fArr = this.f21424OooO0O0;
        float f = 0.0f;
        char c = 0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List OooO00o3 = this.f21420OooO00o.getLineData().m19905OooO00o();
        int i = 0;
        while (i < OooO00o3.size()) {
            AbstractC8264oOOoooO ooooooo = (AbstractC8264oOOoooO) OooO00o3.get(i);
            if (ooooooo.isVisible() && ooooooo.m19945OooO0Oo() && ooooooo.OooO0Oo() != 0) {
                this.OooO0o0.setColor(ooooooo.m19946OooO0o());
                C8351oOoOOo0o OooO00o4 = this.f21420OooO00o.OooO00o(ooooooo.m19949OooO00o());
                ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.f21420OooO00o, ooooooo);
                float OooOOoo = ooooooo.OooOOoo();
                float OooO0Oo2 = ooooooo.OooO0Oo();
                boolean z = ooooooo.m19943OooO00o() && OooO0Oo2 < OooOOoo && OooO0Oo2 > f;
                boolean z2 = z && ooooooo.m19946OooO0o() == 1122867;
                if (this.f21422OooO00o.containsKey(ooooooo)) {
                    oooO0O0 = this.f21422OooO00o.get(ooooooo);
                } else {
                    oooO0O0 = new OooO0O0(this, null);
                    this.f21422OooO00o.put(ooooooo, oooO0O0);
                }
                if (oooO0O0.OooO00o(ooooooo)) {
                    oooO0O0.OooO00o(ooooooo, z, z2);
                }
                AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                int i2 = oooO00o.OooO0OO;
                int i3 = oooO00o.OooO00o;
                int i4 = i2 + i3;
                while (i3 <= i4) {
                    Entry OooO00o5 = ooooooo.m19951OooO00o(i3);
                    if (OooO00o5 == null) {
                        break;
                    }
                    this.f21424OooO0O0[c] = OooO00o5.OooO0O0();
                    this.f21424OooO0O0[1] = OooO00o5.OooO00o() * OooO0O02;
                    OooO00o4.OooO0O0(this.f21424OooO0O0);
                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(this.f21424OooO0O0[c])) {
                        break;
                    }
                    if (((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(this.f21424OooO0O0[c]) && ((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(this.f21424OooO0O0[1]) && (OooO00o2 = oooO0O0.OooO00o(i3)) != null) {
                        float[] fArr2 = this.f21424OooO0O0;
                        canvas.drawBitmap(OooO00o2, fArr2[c] - OooOOoo, fArr2[1] - OooOOoo, (Paint) null);
                    }
                    i3++;
                    c = 0;
                }
            }
            i++;
            f = 0.0f;
            c = 0;
        }
    }

    /* renamed from: com.pd.sdk.oOoOO000$OooO0O0 */
    public class OooO0O0 {
        public Path OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap[] f21426OooO00o;

        public OooO0O0() {
            this.OooO00o = new Path();
        }

        public boolean OooO00o(AbstractC8264oOOoooO ooooooo) {
            int OooO0O0 = ooooooo.OooO0O0();
            Bitmap[] bitmapArr = this.f21426OooO00o;
            if (bitmapArr == null) {
                this.f21426OooO00o = new Bitmap[OooO0O0];
                return true;
            } else if (bitmapArr.length == OooO0O0) {
                return false;
            } else {
                this.f21426OooO00o = new Bitmap[OooO0O0];
                return true;
            }
        }

        public /* synthetic */ OooO0O0(C8325oOoOO000 ooooo000, OooO00o oooO00o) {
            this();
        }

        public void OooO00o(AbstractC8264oOOoooO ooooooo, boolean z, boolean z2) {
            int OooO0O0 = ooooooo.OooO0O0();
            float OooOOoo = ooooooo.OooOOoo();
            float OooO0Oo = ooooooo.OooO0Oo();
            for (int i = 0; i < OooO0O0; i++) {
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                double d = (double) OooOOoo;
                Double.isNaN(d);
                int i2 = (int) (d * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, config);
                Canvas canvas = new Canvas(createBitmap);
                this.f21426OooO00o[i] = createBitmap;
                ((AbstractC8321oOoO0ooO) C8325oOoOO000.this).OooO00o.setColor(ooooooo.OooO0O0(i));
                if (z2) {
                    this.OooO00o.reset();
                    this.OooO00o.addCircle(OooOOoo, OooOOoo, OooOOoo, Path.Direction.CW);
                    this.OooO00o.addCircle(OooOOoo, OooOOoo, OooO0Oo, Path.Direction.CCW);
                    canvas.drawPath(this.OooO00o, ((AbstractC8321oOoO0ooO) C8325oOoOO000.this).OooO00o);
                } else {
                    canvas.drawCircle(OooOOoo, OooOOoo, OooOOoo, ((AbstractC8321oOoO0ooO) C8325oOoOO000.this).OooO00o);
                    if (z) {
                        canvas.drawCircle(OooOOoo, OooOOoo, OooO0Oo, C8325oOoOO000.this.OooO0o0);
                    }
                }
            }
        }

        public Bitmap OooO00o(int i) {
            Bitmap[] bitmapArr = this.f21426OooO00o;
            return bitmapArr[i % bitmapArr.length];
        }
    }

    public void OooO00o(Canvas canvas, AbstractC8264oOOoooO ooooooo) {
        if (ooooooo.OooO0Oo() >= 1) {
            ((AbstractC8321oOoO0ooO) this).OooO00o.setStrokeWidth(ooooooo.OooO0oO());
            ((AbstractC8321oOoO0ooO) this).OooO00o.setPathEffect(ooooooo.m19944OooO0O0());
            int i = OooO00o.OooO00o[ooooooo.OooO00o().ordinal()];
            if (i == 3) {
                OooO00o(ooooooo);
            } else if (i != 4) {
                OooO0O0(canvas, ooooooo);
            } else {
                OooO0O0(ooooooo);
            }
            ((AbstractC8321oOoO0ooO) this).OooO00o.setPathEffect(null);
        }
    }

    public void OooO00o(AbstractC8264oOOoooO ooooooo) {
        Math.max(0.0f, Math.min(1.0f, ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()));
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        C8351oOoOOo0o OooO00o2 = this.f21420OooO00o.OooO00o(ooooooo.m19949OooO00o());
        ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.f21420OooO00o, ooooooo);
        float OooO0o = ooooooo.OooO0o();
        this.OooO0O0.reset();
        AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
        if (oooO00o.OooO0OO >= 1) {
            int i = oooO00o.OooO00o + 1;
            Entry OooO00o3 = ooooooo.m19951OooO00o(Math.max(i - 2, 0));
            Entry OooO00o4 = ooooooo.m19951OooO00o(Math.max(i - 1, 0));
            int i2 = -1;
            if (OooO00o4 != null) {
                this.OooO0O0.moveTo(OooO00o4.OooO0O0(), OooO00o4.OooO00o() * OooO0O02);
                int i3 = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + 1;
                Entry entry = OooO00o4;
                while (true) {
                    AbstractC8308oOo0O00O.OooO00o oooO00o2 = ((AbstractC8308oOo0O00O) this).OooO00o;
                    if (i3 > oooO00o2.OooO0OO + oooO00o2.OooO00o) {
                        break;
                    }
                    if (i2 != i3) {
                        OooO00o4 = ooooooo.m19951OooO00o(i3);
                    }
                    int i4 = i3 + 1;
                    if (i4 < ooooooo.OooO0Oo()) {
                        i3 = i4;
                    }
                    Entry OooO00o5 = ooooooo.m19951OooO00o(i3);
                    this.OooO0O0.cubicTo(entry.OooO0O0() + ((OooO00o4.OooO0O0() - OooO00o3.OooO0O0()) * OooO0o), (entry.OooO00o() + ((OooO00o4.OooO00o() - OooO00o3.OooO00o()) * OooO0o)) * OooO0O02, OooO00o4.OooO0O0() - ((OooO00o5.OooO0O0() - entry.OooO0O0()) * OooO0o), (OooO00o4.OooO00o() - ((OooO00o5.OooO00o() - entry.OooO00o()) * OooO0o)) * OooO0O02, OooO00o4.OooO0O0(), OooO00o4.OooO00o() * OooO0O02);
                    OooO00o3 = entry;
                    entry = OooO00o4;
                    OooO00o4 = OooO00o5;
                    i3 = i4;
                    i2 = i3;
                }
            } else {
                return;
            }
        }
        if (ooooooo.OooO0o()) {
            this.OooO0OO.reset();
            this.OooO0OO.addPath(this.OooO0O0);
            OooO00o(this.f21419OooO00o, ooooooo, this.OooO0OO, OooO00o2, ((AbstractC8308oOo0O00O) this).OooO00o);
        }
        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(ooooooo.m19965OooOOOO());
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.STROKE);
        OooO00o2.OooO00o(this.OooO0O0);
        this.f21419OooO00o.drawPath(this.OooO0O0, ((AbstractC8321oOoO0ooO) this).OooO00o);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setPathEffect(null);
    }

    public void OooO0O0(Canvas canvas, AbstractC8264oOOoooO ooooooo) {
        int OooO0Oo2 = ooooooo.OooO0Oo();
        boolean OooOOOO = ooooooo.OooOOOO();
        int i = OooOOOO ? 4 : 2;
        C8351oOoOOo0o OooO00o2 = this.f21420OooO00o.OooO00o(ooooooo.m19949OooO00o());
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = ooooooo.OooOOO() ? this.f21419OooO00o : canvas;
        ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.f21420OooO00o, ooooooo);
        if (ooooooo.OooO0o() && OooO0Oo2 > 0) {
            OooO00o(canvas, ooooooo, OooO00o2, ((AbstractC8308oOo0O00O) this).OooO00o);
        }
        if (ooooooo.m19955OooO00o().size() > 1) {
            int i2 = i * 2;
            if (this.f21423OooO00o.length <= i2) {
                this.f21423OooO00o = new float[(i * 4)];
            }
            int i3 = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o;
            while (true) {
                AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                if (i3 > oooO00o.OooO0OO + oooO00o.OooO00o) {
                    break;
                }
                Entry OooO00o3 = ooooooo.m19951OooO00o(i3);
                if (OooO00o3 != null) {
                    this.f21423OooO00o[0] = OooO00o3.OooO0O0();
                    this.f21423OooO00o[1] = OooO00o3.OooO00o() * OooO0O02;
                    if (i3 < ((AbstractC8308oOo0O00O) this).OooO00o.OooO0O0) {
                        Entry OooO00o4 = ooooooo.m19951OooO00o(i3 + 1);
                        if (OooO00o4 == null) {
                            break;
                        } else if (OooOOOO) {
                            this.f21423OooO00o[2] = OooO00o4.OooO0O0();
                            float[] fArr = this.f21423OooO00o;
                            fArr[3] = fArr[1];
                            fArr[4] = fArr[2];
                            fArr[5] = fArr[3];
                            fArr[6] = OooO00o4.OooO0O0();
                            this.f21423OooO00o[7] = OooO00o4.OooO00o() * OooO0O02;
                        } else {
                            this.f21423OooO00o[2] = OooO00o4.OooO0O0();
                            this.f21423OooO00o[3] = OooO00o4.OooO00o() * OooO0O02;
                        }
                    } else {
                        float[] fArr2 = this.f21423OooO00o;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    OooO00o2.OooO0O0(this.f21423OooO00o);
                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(this.f21423OooO00o[0])) {
                        break;
                    } else if (((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(this.f21423OooO00o[2]) && (((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(this.f21423OooO00o[1]) || ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(this.f21423OooO00o[3]))) {
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(ooooooo.OooO00o(i3));
                        canvas2.drawLines(this.f21423OooO00o, 0, i2, ((AbstractC8321oOoO0ooO) this).OooO00o);
                    }
                }
                i3++;
            }
        } else {
            int i4 = OooO0Oo2 * i;
            if (this.f21423OooO00o.length < Math.max(i4, i) * 2) {
                this.f21423OooO00o = new float[(Math.max(i4, i) * 4)];
            }
            if (ooooooo.m19951OooO00o(((AbstractC8308oOo0O00O) this).OooO00o.OooO00o) != null) {
                int i5 = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o;
                int i6 = 0;
                while (true) {
                    AbstractC8308oOo0O00O.OooO00o oooO00o2 = ((AbstractC8308oOo0O00O) this).OooO00o;
                    if (i5 > oooO00o2.OooO0OO + oooO00o2.OooO00o) {
                        break;
                    }
                    Entry OooO00o5 = ooooooo.m19951OooO00o(i5 == 0 ? 0 : i5 - 1);
                    Entry OooO00o6 = ooooooo.m19951OooO00o(i5);
                    if (!(OooO00o5 == null || OooO00o6 == null)) {
                        int i7 = i6 + 1;
                        this.f21423OooO00o[i6] = OooO00o5.OooO0O0();
                        int i8 = i7 + 1;
                        this.f21423OooO00o[i7] = OooO00o5.OooO00o() * OooO0O02;
                        if (OooOOOO) {
                            int i9 = i8 + 1;
                            this.f21423OooO00o[i8] = OooO00o6.OooO0O0();
                            int i10 = i9 + 1;
                            this.f21423OooO00o[i9] = OooO00o5.OooO00o() * OooO0O02;
                            int i11 = i10 + 1;
                            this.f21423OooO00o[i10] = OooO00o6.OooO0O0();
                            i8 = i11 + 1;
                            this.f21423OooO00o[i11] = OooO00o5.OooO00o() * OooO0O02;
                        }
                        int i12 = i8 + 1;
                        this.f21423OooO00o[i8] = OooO00o6.OooO0O0();
                        this.f21423OooO00o[i12] = OooO00o6.OooO00o() * OooO0O02;
                        i6 = i12 + 1;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    OooO00o2.OooO0O0(this.f21423OooO00o);
                    ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(ooooooo.m19965OooOOOO());
                    canvas2.drawLines(this.f21423OooO00o, 0, Math.max((((AbstractC8308oOo0O00O) this).OooO00o.OooO0OO + 1) * i, i) * 2, ((AbstractC8321oOoO0ooO) this).OooO00o);
                }
            }
        }
        ((AbstractC8321oOoO0ooO) this).OooO00o.setPathEffect(null);
    }

    public void OooO00o(Canvas canvas, AbstractC8264oOOoooO ooooooo, Path path, C8351oOoOOo0o oooooo0o, AbstractC8308oOo0O00O.OooO00o oooO00o) {
        float OooO00o2 = ooooooo.m19942OooO00o().OooO00o(ooooooo, this.f21420OooO00o);
        path.lineTo(ooooooo.m19951OooO00o(oooO00o.OooO00o + oooO00o.OooO0OO).OooO0O0(), OooO00o2);
        path.lineTo(ooooooo.m19951OooO00o(oooO00o.OooO00o).OooO0O0(), OooO00o2);
        path.close();
        oooooo0o.OooO00o(path);
        Drawable OooO00o3 = ooooooo.OooO00o();
        if (OooO00o3 != null) {
            OooO00o(canvas, path, OooO00o3);
        } else {
            OooO00o(canvas, path, ooooooo.OooOO0O(), ooooooo.OooOO0());
        }
    }

    public void OooO00o(Canvas canvas, AbstractC8264oOOoooO ooooooo, C8351oOoOOo0o oooooo0o, AbstractC8308oOo0O00O.OooO00o oooO00o) {
        int i;
        int i2;
        Path path = this.OooO0Oo;
        int i3 = oooO00o.OooO00o;
        int i4 = oooO00o.OooO0OO + i3;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                OooO00o(ooooooo, i, i2, path);
                oooooo0o.OooO00o(path);
                Drawable OooO00o2 = ooooooo.OooO00o();
                if (OooO00o2 != null) {
                    OooO00o(canvas, path, OooO00o2);
                } else {
                    OooO00o(canvas, path, ooooooo.OooOO0O(), ooooooo.OooOO0());
                }
            }
            i5++;
        } while (i <= i2);
    }

    private void OooO00o(AbstractC8264oOOoooO ooooooo, int i, int i2, Path path) {
        float OooO00o2 = ooooooo.m19942OooO00o().OooO00o(ooooooo, this.f21420OooO00o);
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        boolean z = ooooooo.OooO00o() == LineDataSet.Mode.STEPPED;
        path.reset();
        Entry OooO00o3 = ooooooo.m19951OooO00o(i);
        path.moveTo(OooO00o3.OooO0O0(), OooO00o2);
        path.lineTo(OooO00o3.OooO0O0(), OooO00o3.OooO00o() * OooO0O02);
        Entry entry = null;
        for (int i3 = i + 1; i3 <= i2; i3++) {
            entry = ooooooo.m19951OooO00o(i3);
            if (z && entry != null) {
                path.lineTo(entry.OooO0O0(), entry.OooO00o() * OooO0O02);
            }
            path.lineTo(entry.OooO0O0(), entry.OooO00o() * OooO0O02);
        }
        if (entry != null) {
            path.lineTo(entry.OooO0O0(), OooO00o2);
        }
        path.close();
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
        OooO0Oo(canvas);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0() {
        Canvas canvas = this.f21419OooO00o;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f21419OooO00o = null;
        }
        WeakReference<Bitmap> weakReference = this.f21421OooO00o;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.f21421OooO00o.clear();
            this.f21421OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        C8220oOOoOOo lineData = this.f21420OooO00o.getLineData();
        for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
            AbstractC8267oOOoooOo oooooooo = (AbstractC8264oOOoooO) lineData.OooO00o(ooooo0oo.m19936OooO0O0());
            if (oooooooo != null && oooooooo.OooO0O0()) {
                Entry OooO00o2 = oooooooo.OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
                if (OooO00o(OooO00o2, oooooooo)) {
                    C8346oOoOOOoo OooO00o3 = this.f21420OooO00o.OooO00o(oooooooo.m19949OooO00o()).OooO00o(OooO00o2.OooO0O0(), OooO00o2.OooO00o() * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0());
                    ooooo0oo.OooO00o((float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0);
                    OooO00o(canvas, (float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0, oooooooo);
                }
            }
        }
    }

    public void OooO00o(Bitmap.Config config) {
        this.OooO00o = config;
        OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public Bitmap.Config OooO00o() {
        return this.OooO00o;
    }
}
