package com.p118pd.sdk;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.C5948OooOOo0;
import com.p118pd.sdk.OooOOOO;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.pd.sdk.OooOOO */
public class OooOOO extends C5948OooOOo0 {
    public static final String o000OOo = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    public static final String o0O0O00 = ": <transition> tag requires 'fromId' & 'toId' attributes";
    public static final String o0OO00O = "item";
    public static final String o0OOO0o = OooOOO.class.getSimpleName();
    public static final String o0Oo0oo = "transition";
    public static final String oo0o0Oo = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    public OooO0OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5944OooO0oO f17082OooO00o;
    public boolean OooO0oo;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public int f17083o0OOO0o;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.OooOOO$OooO0O0 */
    public static class OooO0O0 extends AbstractC5944OooO0oO {
        public final Animatable OooO00o;

        public OooO0O0(Animatable animatable) {
            super();
            this.OooO00o = animatable;
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0O0() {
            this.OooO00o.start();
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0OO() {
            this.OooO00o.stop();
        }
    }

    /* renamed from: com.pd.sdk.OooOOO$OooO0OO */
    public static class OooO0OO extends C5948OooOOo0.OooO00o {
        public static final long OooO00o = 4294967296L;
        public static final long OooO0O0 = 8589934592L;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6930o000<Long> f17084OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7010o000Ooo<Integer> f17085OooO00o;

        public OooO0OO(@Nullable OooO0OO oooO0OO, @NonNull OooOOO oooOOO, @Nullable Resources resources) {
            super(oooO0OO, oooOOO, resources);
            if (oooO0OO != null) {
                this.f17084OooO00o = oooO0OO.f17084OooO00o;
                this.f17085OooO00o = oooO0OO.f17085OooO00o;
                return;
            }
            this.f17084OooO00o = new C6930o000<>();
            this.f17085OooO00o = new C7010o000Ooo<>();
        }

        public static long OooO00o(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public int OooO00o(int i, int i2, @NonNull Drawable drawable, boolean z) {
            int OooO00o2 = super.m16722OooO00o(drawable);
            long OooO00o3 = OooO00o(i, i2);
            long j = z ? OooO0O0 : 0;
            long j2 = (long) OooO00o2;
            this.f17084OooO00o.m18087OooO00o(OooO00o3, Long.valueOf(j2 | j));
            if (z) {
                this.f17084OooO00o.m18087OooO00o(OooO00o(i2, i), Long.valueOf(OooO00o | j2 | j));
            }
            return OooO00o2;
        }

        public int OooO0O0(@NonNull int[] iArr) {
            int OooO00o2 = super.OooO00o(iArr);
            if (OooO00o2 >= 0) {
                return OooO00o2;
            }
            return super.OooO00o(StateSet.WILD_CARD);
        }

        public boolean OooO0OO(int i, int i2) {
            return (this.f17084OooO00o.OooO00o(OooO00o(i, i2), -1L).longValue() & OooO0O0) != 0;
        }

        @Override // com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.C5948OooOOo0.OooO00o
        public void OooO0Oo() {
            this.f17084OooO00o = this.f17084OooO00o.clone();
            this.f17085OooO00o = this.f17085OooO00o.clone();
        }

        @Override // com.p118pd.sdk.C5948OooOOo0.OooO00o
        @NonNull
        public Drawable newDrawable() {
            return new OooOOO(this, null);
        }

        @Override // com.p118pd.sdk.C5948OooOOo0.OooO00o
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new OooOOO(this, resources);
        }

        public boolean OooO0O0(int i, int i2) {
            return (this.f17084OooO00o.OooO00o(OooO00o(i, i2), -1L).longValue() & OooO00o) != 0;
        }

        public int OooO00o(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
            int OooO00o2 = super.OooO00o(iArr, drawable);
            this.f17085OooO00o.OooO0O0(OooO00o2, Integer.valueOf(i));
            return OooO00o2;
        }

        @Override // com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.OooOOOO.OooO0OO
        public int OooO00o(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f17085OooO00o.OooO00o(i, (Integer) 0).intValue();
        }

        @Override // com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.C5948OooOOo0.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m16713OooO00o(int i, int i2) {
            return (int) this.f17084OooO00o.OooO00o(OooO00o(i, i2), (Long) -1L).longValue();
        }
    }

    /* renamed from: com.pd.sdk.OooOOO$OooO0Oo  reason: case insensitive filesystem */
    public static class C5942OooO0Oo extends AbstractC5944OooO0oO {
        public final C7703o0ooO OooO00o;

        public C5942OooO0Oo(C7703o0ooO o0ooo) {
            super();
            this.OooO00o = o0ooo;
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0O0() {
            this.OooO00o.start();
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0OO() {
            this.OooO00o.stop();
        }
    }

    /* renamed from: com.pd.sdk.OooOOO$OooO0o0  reason: case insensitive filesystem */
    public static class C5943OooO0o0 extends AbstractC5944OooO0oO {
        public final ObjectAnimator OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f17087OooO00o;

        public C5943OooO0o0(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            OooO0o oooO0o = new OooO0o(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) oooO0o.OooO00o());
            ofInt.setInterpolator(oooO0o);
            this.f17087OooO00o = z2;
            this.OooO00o = ofInt;
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO, com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16714OooO00o() {
            return this.f17087OooO00o;
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0O0() {
            this.OooO00o.start();
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO0OO() {
            this.OooO00o.cancel();
        }

        @Override // com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO, com.p118pd.sdk.OooOOO.AbstractC5944OooO0oO
        public void OooO00o() {
            this.OooO00o.reverse();
        }
    }

    /* renamed from: com.pd.sdk.OooOOO$OooO0oO  reason: case insensitive filesystem */
    public static abstract class AbstractC5944OooO0oO {
        public AbstractC5944OooO0oO() {
        }

        public void OooO00o() {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16715OooO00o() {
            return false;
        }

        public abstract void OooO0O0();

        public abstract void OooO0OO();
    }

    public OooOOO() {
        this(null, null);
    }

    @Override // com.p118pd.sdk.C5948OooOOo0
    public /* bridge */ /* synthetic */ void OooO00o(int[] iArr, Drawable drawable) {
        super.OooO00o(iArr, drawable);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void OooO0OO(int i) {
        super.OooO0OO(i);
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO
    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // com.p118pd.sdk.OooOOOO
    @RequiresApi(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // com.p118pd.sdk.OooOOOO
    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void getHotspotBounds(@NonNull Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.p118pd.sdk.OooOOOO
    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void getOutline(@NonNull Outline outline) {
        super.getOutline(outline);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void invalidateDrawable(@NonNull Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO
    public boolean isStateful() {
        return true;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC5944OooO0oO oooO0oO = this.f17082OooO00o;
        if (oooO0oO != null) {
            oooO0oO.OooO0OO();
            this.f17082OooO00o = null;
            m16721OooO00o(this.o0ooOoO);
            this.o0ooOoO = -1;
            this.f17083o0OOO0o = -1;
        }
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO
    public Drawable mutate() {
        if (!this.OooO0oo && super.mutate() == this) {
            this.OooO00o.OooO0Oo();
            this.OooO0oo = true;
        }
        return this;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO
    public boolean onStateChange(int[] iArr) {
        int OooO0O02 = this.OooO00o.OooO0O0(iArr);
        boolean z = OooO0O02 != m16718OooO00o() && (OooO0O0(OooO0O02) || m16721OooO00o(OooO0O02));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.p118pd.sdk.OooOOOO
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f17082OooO00o != null && (visible || z2)) {
            if (z) {
                this.f17082OooO00o.OooO0O0();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public OooOOO(@Nullable OooO0OO oooO0OO, @Nullable Resources resources) {
        super(null);
        this.o0ooOoO = -1;
        this.f17083o0OOO0o = -1;
        OooO00o(new OooO0OO(oooO0OO, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // com.p118pd.sdk.OooOOOO
    private boolean OooO0O0(int i) {
        int i2;
        int OooO00o2;
        AbstractC5944OooO0oO oooO0oO;
        AbstractC5944OooO0oO oooO0oO2 = this.f17082OooO00o;
        if (oooO0oO2 == null) {
            i2 = m16718OooO00o();
        } else if (i == this.o0ooOoO) {
            return true;
        } else {
            if (i != this.f17083o0OOO0o || !oooO0oO2.m16715OooO00o()) {
                i2 = this.o0ooOoO;
                oooO0oO2.OooO0OO();
            } else {
                oooO0oO2.OooO00o();
                this.o0ooOoO = this.f17083o0OOO0o;
                this.f17083o0OOO0o = i;
                return true;
            }
        }
        this.f17082OooO00o = null;
        this.f17083o0OOO0o = -1;
        this.o0ooOoO = -1;
        OooO0OO oooO0OO = this.OooO00o;
        int OooO00o3 = oooO0OO.OooO00o(i2);
        int OooO00o4 = oooO0OO.OooO00o(i);
        if (OooO00o4 == 0 || OooO00o3 == 0 || (OooO00o2 = oooO0OO.m16713OooO00o(OooO00o3, OooO00o4)) < 0) {
            return false;
        }
        boolean OooO0OO2 = oooO0OO.OooO0OO(OooO00o3, OooO00o4);
        m16721OooO00o(OooO00o2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            oooO0oO = new C5943OooO0o0((AnimationDrawable) current, oooO0OO.OooO0O0(OooO00o3, OooO00o4), OooO0OO2);
        } else if (current instanceof C7703o0ooO) {
            oooO0oO = new C5942OooO0Oo((C7703o0ooO) current);
        } else {
            if (current instanceof Animatable) {
                oooO0oO = new OooO0O0((Animatable) current);
            }
            return false;
        }
        oooO0oO.OooO0O0();
        this.f17082OooO00o = oooO0oO;
        this.f17083o0OOO0o = i2;
        this.o0ooOoO = i;
        return true;
    }

    private void OooO0OO(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        OooO00o(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(o0Oo0oo)) {
                        OooO0O0(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019 A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.OooOOO OooO00o(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.DrawableRes int r6, @androidx.annotation.Nullable android.content.res.Resources.Theme r7) {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x000c:
            int r2 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            r3 = 2
            if (r2 == r3) goto L_0x0017
            r4 = 1
            if (r2 == r4) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r2 != r3) goto L_0x001e
            com.pd.sdk.OooOOO r5 = m16710OooO00o(r5, r0, r6, r1, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            return r5
        L_0x001e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            java.lang.String r6 = "No start tag found"
            r5.<init>(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            throw r5     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OooOOO.OooO00o(android.content.Context, int, android.content.res.Resources$Theme):com.pd.sdk.OooOOO");
    }

    /* renamed from: com.pd.sdk.OooOOO$OooO0o */
    public static class OooO0o implements TimeInterpolator {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f17086OooO00o;
        public int OooO0O0;

        public OooO0o(AnimationDrawable animationDrawable, boolean z) {
            OooO00o(animationDrawable, z);
        }

        public int OooO00o(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.OooO00o = numberOfFrames;
            int[] iArr = this.f17086OooO00o;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17086OooO00o = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17086OooO00o;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.OooO0O0 = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.OooO0O0)) + 0.5f);
            int i2 = this.OooO00o;
            int[] iArr = this.f17086OooO00o;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.OooO0O0) : 0.0f);
        }

        public int OooO00o() {
            return this.OooO0O0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static OooOOO m16710OooO00o(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            OooOOO oooOOO = new OooOOO();
            oooOOO.m16712OooO00o(context, resources, xmlPullParser, attributeSet, theme);
            return oooOOO;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // com.p118pd.sdk.C5948OooOOo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16712OooO00o(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0033R.styleable.OooO0oo);
        setVisible(OooO00o2.getBoolean(C0033R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        OooO0O0(OooO00o2);
        OooO00o(resources);
        OooO00o2.recycle();
        OooO0OO(context, resources, xmlPullParser, attributeSet, theme);
        OooO0O0();
    }

    public void OooO00o(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
        if (drawable != null) {
            this.OooO00o.OooO00o(iArr, drawable, i);
            onStateChange(getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }

    public <T extends Drawable & Animatable> void OooO00o(int i, int i2, @NonNull T t, boolean z) {
        if (t != null) {
            this.OooO00o.OooO00o(i, i2, t, z);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }

    @Override // com.p118pd.sdk.C5948OooOOo0
    private int OooO00o(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0033R.styleable.OooO);
        int resourceId = OooO00o2.getResourceId(C0033R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = OooO00o2.getResourceId(C0033R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable OooO00o3 = resourceId2 > 0 ? C5945OooOOO0.m16716OooO00o(context, resourceId2) : null;
        OooO00o2.recycle();
        int[] OooO00o4 = OooO00o(attributeSet);
        if (OooO00o3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + o000OOo);
            } else if (xmlPullParser.getName().equals(C7303o0O0OOOo.f19984o0OO00O)) {
                OooO00o3 = C7303o0O0OOOo.OooO00o(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                OooO00o3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                OooO00o3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (OooO00o3 != null) {
            return this.OooO00o.OooO00o(OooO00o4, OooO00o3, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + o000OOo);
    }

    private void OooO0O0(TypedArray typedArray) {
        OooO0OO oooO0OO = this.OooO00o;
        if (Build.VERSION.SDK_INT >= 21) {
            ((OooOOOO.OooO0OO) oooO0OO).OooO0O0 |= typedArray.getChangingConfigurations();
        }
        oooO0OO.OooO0O0(typedArray.getBoolean(C0033R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, ((OooOOOO.OooO0OO) oooO0OO).f17108OooO00o));
        oooO0OO.OooO00o(typedArray.getBoolean(C0033R.styleable.AnimatedStateListDrawableCompat_android_constantSize, ((OooOOOO.OooO0OO) oooO0OO).f17111OooO0OO));
        oooO0OO.m16725OooO00o(typedArray.getInt(C0033R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, ((OooOOOO.OooO0OO) oooO0OO).OooOO0O));
        oooO0OO.OooO0O0(typedArray.getInt(C0033R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, ((OooOOOO.OooO0OO) oooO0OO).OooOO0o));
        setDither(typedArray.getBoolean(C0033R.styleable.AnimatedStateListDrawableCompat_android_dither, ((OooOOOO.OooO0OO) oooO0OO).f17117OooOO0));
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    public OooO0OO OooO00o() {
        return new OooO0OO(this.OooO00o, this, null);
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16711OooO00o() {
        super.m16734OooO00o();
        this.OooO0oo = false;
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.C5948OooOOo0
    private void OooO0O0() {
        onStateChange(getState());
    }

    private int OooO0O0(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0033R.styleable.OooOO0);
        int resourceId = OooO00o2.getResourceId(C0033R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = OooO00o2.getResourceId(C0033R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = OooO00o2.getResourceId(C0033R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable OooO00o3 = resourceId3 > 0 ? C5945OooOOO0.m16716OooO00o(context, resourceId3) : null;
        boolean z = OooO00o2.getBoolean(C0033R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        OooO00o2.recycle();
        if (OooO00o3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + oo0o0Oo);
            } else if (xmlPullParser.getName().equals(C7703o0ooO.o0ooOoO)) {
                OooO00o3 = C7703o0ooO.OooO00o(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                OooO00o3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                OooO00o3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (OooO00o3 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + oo0o0Oo);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.OooO00o.OooO00o(resourceId, resourceId2, OooO00o3, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + o0O0O00);
        }
    }

    @Override // com.p118pd.sdk.C5948OooOOo0, com.p118pd.sdk.OooOOOO
    public void OooO00o(@NonNull OooOOOO.OooO0OO oooO0OO) {
        super.OooO00o(oooO0OO);
        if (oooO0OO instanceof OooO0OO) {
            this.OooO00o = (OooO0OO) oooO0OO;
        }
    }
}
