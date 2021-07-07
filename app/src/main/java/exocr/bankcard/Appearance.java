package exocr.bankcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;

public class Appearance {
    public static final int OooO = Color.parseColor("#c5ddeb");
    public static final float OooO00o = 28.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f23566OooO00o = Color.parseColor("#003087");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Typeface f23567OooO00o = OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Drawable f23568OooO00o = new ColorDrawable(Color.parseColor("#717074"));

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23569OooO00o = "16dip";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f23570OooO00o = {16842919, 16842910};
    public static final float OooO0O0 = 20.0f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f23571OooO0O0 = Color.parseColor("#009CDE");

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f23572OooO0O0 = "20dip";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f23573OooO0O0 = {16842910};
    public static final float OooO0OO = 16.0f;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int f23574OooO0OO = Color.parseColor("#aa009CDE");

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f23575OooO0OO = "4dip";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f23576OooO0OO = {-16842910};
    public static final float OooO0Oo = 14.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int f23577OooO0Oo = Color.parseColor("#ff99ccff");

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f23578OooO0Oo = "8dip";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int[] f23579OooO0Oo = {16842908};
    public static final int OooO0o = f23571OooO0O0;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f23580OooO0o = "42dip";
    public static final int OooO0o0 = Color.parseColor("#f5f5f5");

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f23581OooO0o0 = "54dip";
    public static final int OooO0oO = f23574OooO0OO;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f23582OooO0oO = "4dip";
    public static final int OooO0oo = f23566OooO00o;
    public static final int OooOO0 = Color.parseColor("#717074");
    public static final int OooOO0O = Color.parseColor("#aa717074");
    public static final int OooOO0o = Color.parseColor("#5a5a5d");
    public static final int OooOOO = Color.parseColor("#515151");
    public static final int OooOOO0 = Color.parseColor("#f5f5f5");
    public static final int OooOOOO = -12303292;
    public static final int OooOOOo = Color.parseColor("#b32317");
    public static final int OooOOo = -1;
    public static final int OooOOo0 = OooOOO;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m21974OooO00o(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f23570OooO00o, new ColorDrawable(OooO0oo));
        stateListDrawable.addState(f23576OooO0OO, new ColorDrawable(OooO));
        stateListDrawable.addState(f23579OooO0Oo, OooO0O0(context));
        stateListDrawable.addState(f23573OooO0O0, OooO0OO(context));
        return stateListDrawable;
    }

    public static Drawable OooO0O0(Context context) {
        return OooO00o(OooO0o, OooO0oO, OooO00o(context));
    }

    public static Drawable OooO0OO(Context context) {
        return OooO00o(OooO0o, OooO00o(context));
    }

    public static Drawable OooO0Oo(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f23570OooO00o, new ColorDrawable(OooOO0o));
        stateListDrawable.addState(f23576OooO0OO, new ColorDrawable(OooOOO0));
        stateListDrawable.addState(f23579OooO0Oo, OooO0o0(context));
        stateListDrawable.addState(f23573OooO0O0, OooO0o(context));
        return stateListDrawable;
    }

    public static Drawable OooO0o(Context context) {
        return OooO00o(OooOO0, OooO00o(context));
    }

    public static Drawable OooO0o0(Context context) {
        return OooO00o(OooOO0, OooOO0O, OooO00o(context));
    }

    public static float OooO00o(Context context) {
        return (ViewUtil.OooO00o("4dip", context) / 2.0f) * context.getResources().getDisplayMetrics().density;
    }

    public static Drawable OooO00o(int i, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(f * 2.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(OooO0o0);
        return new LayerDrawable(new Drawable[]{new ColorDrawable(i), shapeDrawable});
    }

    public static Drawable OooO00o(int i, int i2, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(2.0f * f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(OooO0o0);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setStrokeWidth(f);
        shapeDrawable2.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable2.getPaint().setColor(i2);
        return new LayerDrawable(new Drawable[]{new ColorDrawable(i), shapeDrawable, shapeDrawable2});
    }

    public static Typeface OooO00o() {
        return Typeface.create("sans-serif-light", 0);
    }
}
