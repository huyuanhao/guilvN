package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.AbstractC7297o0O0O0oo;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.pd.sdk.o0ooO  reason: case insensitive filesystem */
public class C7703o0ooO extends AbstractC7301o0O0OOO implements AbstractC7297o0O0O0oo {
    public static final boolean OooO0O0 = false;
    public static final String o0OOO0o = "target";
    public static final String o0ooOOo = "AnimatedVDCompat";
    public static final String o0ooOoO = "animated-vector";
    public Animator.AnimatorListener OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArgbEvaluator f20656OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f20657OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Drawable.Callback f20658OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f20659OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7704OooO0Oo f20660OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<AbstractC7297o0O0O0oo.OooO00o> f20661OooO00o;

    /* renamed from: com.pd.sdk.o0ooO$OooO00o */
    public class OooO00o implements Drawable.Callback {
        public OooO00o() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C7703o0ooO.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C7703o0ooO.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C7703o0ooO.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: com.pd.sdk.o0ooO$OooO0O0 */
    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C7703o0ooO.this.f20661OooO00o);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC7297o0O0O0oo.OooO00o) arrayList.get(i)).OooO00o(C7703o0ooO.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C7703o0ooO.this.f20661OooO00o);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC7297o0O0O0oo.OooO00o) arrayList.get(i)).OooO0O0(C7703o0ooO.this);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0ooO$OooO0OO */
    public static class OooO0OO extends Drawable.ConstantState {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AnimatorSet f20662OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6971o0000oO0<Animator, String> f20663OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7303o0O0OOOo f20664OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<Animator> f20665OooO00o;

        public OooO0OO(Context context, OooO0OO oooO0OO, Drawable.Callback callback, Resources resources) {
            if (oooO0OO != null) {
                this.OooO00o = oooO0OO.OooO00o;
                C7303o0O0OOOo o0o0oooo = oooO0OO.f20664OooO00o;
                if (o0o0oooo != null) {
                    Drawable.ConstantState constantState = o0o0oooo.getConstantState();
                    if (resources != null) {
                        this.f20664OooO00o = (C7303o0O0OOOo) constantState.newDrawable(resources);
                    } else {
                        this.f20664OooO00o = (C7303o0O0OOOo) constantState.newDrawable();
                    }
                    C7303o0O0OOOo o0o0oooo2 = (C7303o0O0OOOo) this.f20664OooO00o.mutate();
                    this.f20664OooO00o = o0o0oooo2;
                    o0o0oooo2.setCallback(callback);
                    this.f20664OooO00o.setBounds(oooO0OO.f20664OooO00o.getBounds());
                    this.f20664OooO00o.OooO00o(false);
                }
                ArrayList<Animator> arrayList = oooO0OO.f20665OooO00o;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f20665OooO00o = new ArrayList<>(size);
                    this.f20663OooO00o = new C6971o0000oO0<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = oooO0OO.f20665OooO00o.get(i);
                        Animator clone = animator.clone();
                        String str = oooO0OO.f20663OooO00o.get(animator);
                        clone.setTarget(this.f20664OooO00o.OooO00o(str));
                        this.f20665OooO00o.add(clone);
                        this.f20663OooO00o.put(clone, str);
                    }
                    OooO00o();
                }
            }
        }

        public void OooO00o() {
            if (this.f20662OooO00o == null) {
                this.f20662OooO00o = new AnimatorSet();
            }
            this.f20662OooO00o.playTogether(this.f20665OooO00o);
        }

        public int getChangingConfigurations() {
            return this.OooO00o;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C7703o0ooO() {
        this(null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[Catch:{ IOException | XmlPullParserException -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[Catch:{ IOException | XmlPullParserException -> 0x005a }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7703o0ooO OooO00o(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.DrawableRes int r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x002c
            com.pd.sdk.o0ooO r0 = new com.pd.sdk.o0ooO
            r0.<init>(r4)
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            android.graphics.drawable.Drawable r4 = com.p118pd.sdk.C7023o000o0o0.m18287OooO00o(r1, r5, r4)
            r0.OooO00o = r4
            android.graphics.drawable.Drawable$Callback r5 = r0.f20658OooO00o
            r4.setCallback(r5)
            com.pd.sdk.o0ooO$OooO0Oo r4 = new com.pd.sdk.o0ooO$OooO0Oo
            android.graphics.drawable.Drawable r5 = r0.OooO00o
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f20660OooO00o = r4
            return r0
        L_0x002c:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
        L_0x0038:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            r2 = 2
            if (r1 == r2) goto L_0x0043
            r3 = 1
            if (r1 == r3) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            if (r1 != r2) goto L_0x0052
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            android.content.res.Resources$Theme r2 = r4.getTheme()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            com.pd.sdk.o0ooO r4 = OooO00o(r4, r1, r5, r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            return r4
        L_0x0052:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x005a }
        L_0x005a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7703o0ooO.OooO00o(android.content.Context, int):com.pd.sdk.o0ooO");
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return C7043o00O0000.m18315OooO00o(drawable);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7297o0O0O0oo
    public void clearAnimationCallbacks() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        OooO00o();
        ArrayList<AbstractC7297o0O0O0oo.OooO00o> arrayList = this.f20661OooO00o;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f20659OooO00o.f20664OooO00o.draw(canvas);
        if (this.f20659OooO00o.f20662OooO00o.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return C7043o00O0000.OooO00o(drawable);
        }
        return this.f20659OooO00o.f20664OooO00o.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f20659OooO00o.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (((AbstractC7301o0O0OOO) this).OooO00o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C7704OooO0Oo(((AbstractC7301o0O0OOO) this).OooO00o.getConstantState());
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f20659OooO00o.f20664OooO00o.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f20659OooO00o.f20664OooO00o.getIntrinsicWidth();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f20659OooO00o.f20664OooO00o.getOpacity();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (o0ooOoO.equals(name)) {
                    TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19973OooO0o0);
                    int resourceId = OooO00o2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C7303o0O0OOOo OooO00o3 = C7303o0O0OOOo.OooO00o(resources, resourceId, theme);
                        OooO00o3.OooO00o(false);
                        OooO00o3.setCallback(this.f20658OooO00o);
                        C7303o0O0OOOo o0o0oooo = this.f20659OooO00o.f20664OooO00o;
                        if (o0o0oooo != null) {
                            o0o0oooo.setCallback(null);
                        }
                        this.f20659OooO00o.f20664OooO00o = OooO00o3;
                    }
                    OooO00o2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7296o0O0O0oO.f19972OooO0o);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f20657OooO00o;
                        if (context != null) {
                            OooO00o(string, o0O0OO0O.OooO00o(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f20659OooO00o.OooO00o();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return C7043o00O0000.m18319OooO0O0(drawable);
        }
        return this.f20659OooO00o.f20664OooO00o.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f20659OooO00o.f20662OooO00o.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f20659OooO00o.f20664OooO00o.isStateful();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public void onBoundsChange(Rect rect) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f20659OooO00o.f20664OooO00o.setBounds(rect);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public boolean onLevelChange(int i) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f20659OooO00o.f20664OooO00o.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f20659OooO00o.f20664OooO00o.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f20659OooO00o.f20664OooO00o.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, z);
        } else {
            this.f20659OooO00o.f20664OooO00o.setAutoMirrored(z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTint(int i) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, i);
        } else {
            this.f20659OooO00o.f20664OooO00o.setTint(i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, colorStateList);
        } else {
            this.f20659OooO00o.f20664OooO00o.setTintList(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, mode);
        } else {
            this.f20659OooO00o.f20664OooO00o.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f20659OooO00o.f20664OooO00o.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f20659OooO00o.f20662OooO00o.isStarted()) {
            this.f20659OooO00o.f20662OooO00o.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f20659OooO00o.f20662OooO00o.end();
        }
    }

    public C7703o0ooO(@Nullable Context context) {
        this(context, null, null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20659OooO00o.f20664OooO00o.setColorFilter(colorFilter);
        }
    }

    @RequiresApi(24)
    /* renamed from: com.pd.sdk.o0ooO$OooO0Oo  reason: case insensitive filesystem */
    public static class C7704OooO0Oo extends Drawable.ConstantState {
        public final Drawable.ConstantState OooO00o;

        public C7704OooO0Oo(Drawable.ConstantState constantState) {
            this.OooO00o = constantState;
        }

        public boolean canApplyTheme() {
            return this.OooO00o.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.OooO00o.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C7703o0ooO o0ooo = new C7703o0ooO();
            Drawable newDrawable = this.OooO00o.newDrawable();
            ((AbstractC7301o0O0OOO) o0ooo).OooO00o = newDrawable;
            newDrawable.setCallback(o0ooo.f20658OooO00o);
            return o0ooo;
        }

        public Drawable newDrawable(Resources resources) {
            C7703o0ooO o0ooo = new C7703o0ooO();
            Drawable newDrawable = this.OooO00o.newDrawable(resources);
            ((AbstractC7301o0O0OOO) o0ooo).OooO00o = newDrawable;
            newDrawable.setCallback(o0ooo.f20658OooO00o);
            return o0ooo;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C7703o0ooO o0ooo = new C7703o0ooO();
            Drawable newDrawable = this.OooO00o.newDrawable(resources, theme);
            ((AbstractC7301o0O0OOO) o0ooo).OooO00o = newDrawable;
            newDrawable.setCallback(o0ooo.f20658OooO00o);
            return o0ooo;
        }
    }

    public C7703o0ooO(@Nullable Context context, @Nullable OooO0OO oooO0OO, @Nullable Resources resources) {
        this.f20656OooO00o = null;
        this.OooO00o = null;
        this.f20661OooO00o = null;
        this.f20658OooO00o = new OooO00o();
        this.f20657OooO00o = context;
        if (oooO0OO != null) {
            this.f20659OooO00o = oooO0OO;
        } else {
            this.f20659OooO00o = new OooO0OO(context, oooO0OO, this.f20658OooO00o, resources);
        }
    }

    public static C7703o0ooO OooO00o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C7703o0ooO o0ooo = new C7703o0ooO(context);
        o0ooo.inflate(resources, xmlPullParser, attributeSet, theme);
        return o0ooo;
    }

    private void OooO00o(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                OooO00o(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f20656OooO00o == null) {
                    this.f20656OooO00o = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f20656OooO00o);
            }
        }
    }

    private void OooO00o(String str, Animator animator) {
        animator.setTarget(this.f20659OooO00o.f20664OooO00o.OooO00o(str));
        if (Build.VERSION.SDK_INT < 21) {
            OooO00o(animator);
        }
        OooO0OO oooO0OO = this.f20659OooO00o;
        if (oooO0OO.f20665OooO00o == null) {
            oooO0OO.f20665OooO00o = new ArrayList<>();
            this.f20659OooO00o.f20663OooO00o = new C6971o0000oO0<>();
        }
        this.f20659OooO00o.f20665OooO00o.add(animator);
        this.f20659OooO00o.f20663OooO00o.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @RequiresApi(23)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19342OooO00o(AnimatedVectorDrawable animatedVectorDrawable, AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        return animatedVectorDrawable.unregisterAnimationCallback(oooO00o.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC7297o0O0O0oo, com.p118pd.sdk.AbstractC7297o0O0O0oo
    public void OooO00o(@NonNull AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            OooO00o((AnimatedVectorDrawable) drawable, oooO00o);
        } else if (oooO00o != null) {
            if (this.f20661OooO00o == null) {
                this.f20661OooO00o = new ArrayList<>();
            }
            if (!this.f20661OooO00o.contains(oooO00o)) {
                this.f20661OooO00o.add(oooO00o);
                if (this.OooO00o == null) {
                    this.OooO00o = new OooO0O0();
                }
                this.f20659OooO00o.f20662OooO00o.addListener(this.OooO00o);
            }
        }
    }

    @RequiresApi(23)
    public static void OooO00o(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        animatedVectorDrawable.registerAnimationCallback(oooO00o.OooO00o());
    }

    private void OooO00o() {
        Animator.AnimatorListener animatorListener = this.OooO00o;
        if (animatorListener != null) {
            this.f20659OooO00o.f20662OooO00o.removeListener(animatorListener);
            this.OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7297o0O0O0oo, com.p118pd.sdk.AbstractC7297o0O0O0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19344OooO00o(@NonNull AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            m19342OooO00o((AnimatedVectorDrawable) drawable, oooO00o);
        }
        ArrayList<AbstractC7297o0O0O0oo.OooO00o> arrayList = this.f20661OooO00o;
        if (arrayList == null || oooO00o == null) {
            return false;
        }
        boolean remove = arrayList.remove(oooO00o);
        if (this.f20661OooO00o.size() == 0) {
            OooO00o();
        }
        return remove;
    }

    public static void OooO00o(Drawable drawable, AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        if (drawable != null && oooO00o != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                OooO00o((AnimatedVectorDrawable) drawable, oooO00o);
            } else {
                ((C7703o0ooO) drawable).OooO00o(oooO00o);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19343OooO00o(Drawable drawable, AbstractC7297o0O0O0oo.OooO00o oooO00o) {
        if (drawable == null || oooO00o == null || !(drawable instanceof Animatable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return m19342OooO00o((AnimatedVectorDrawable) drawable, oooO00o);
        }
        return ((C7703o0ooO) drawable).m19344OooO00o(oooO00o);
    }

    public static void OooO00o(Drawable drawable) {
        if (drawable != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((C7703o0ooO) drawable).clearAnimationCallbacks();
            }
        }
    }
}
