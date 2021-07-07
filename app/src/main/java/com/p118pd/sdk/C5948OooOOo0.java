package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.OooOOOO;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOOo0  reason: case insensitive filesystem */
public class C5948OooOOo0 extends OooOOOO {
    public static final boolean OooO0oO = false;
    public static final String o0ooOoO = "StateListDrawable";
    public OooO00o OooO00o;
    public boolean OooO0o;

    /* renamed from: com.pd.sdk.OooOOo0$OooO00o */
    public static class OooO00o extends OooOOOO.OooO0OO {
        public int[][] OooO00o;

        public OooO00o(OooO00o oooO00o, C5948OooOOo0 oooOOo0, Resources resources) {
            super(oooO00o, oooOOo0, resources);
            if (oooO00o != null) {
                this.OooO00o = oooO00o.OooO00o;
            } else {
                this.OooO00o = new int[OooO00o()][];
            }
        }

        public int OooO00o(int[] iArr, Drawable drawable) {
            int OooO00o2 = m16722OooO00o(drawable);
            this.OooO00o[OooO00o2] = iArr;
            return OooO00o2;
        }

        @Override // com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.OooOOOO.OooO0OO
        public void OooO0Oo() {
            int[][] iArr = this.OooO00o;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.OooO00o;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.OooO00o = iArr2;
        }

        @NonNull
        public Drawable newDrawable() {
            return new C5948OooOOo0(this, null);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C5948OooOOo0(this, resources);
        }

        public int OooO00o(int[] iArr) {
            int[][] iArr2 = this.OooO00o;
            int OooO0O0 = OooO0O0();
            for (int i = 0; i < OooO0O0; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // com.p118pd.sdk.OooOOOO.OooO0OO, com.p118pd.sdk.OooOOOO.OooO0OO
        public void OooO00o(int i, int i2) {
            super.OooO00o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.OooO00o, 0, iArr, 0, i);
            this.OooO00o = iArr;
        }
    }

    public C5948OooOOo0() {
        this(null, null);
    }

    private void OooO0O0(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        OooO00o oooO00o = this.OooO00o;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0033R.styleable.Oooo0o0);
                    Drawable drawable = null;
                    int resourceId = OooO00o2.getResourceId(C0033R.styleable.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = C5945OooOOO0.m16716OooO00o(context, resourceId);
                    }
                    OooO00o2.recycle();
                    int[] OooO00o3 = OooO00o(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or " + "child tag defining a drawable");
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    oooO00o.OooO00o(OooO00o3, drawable);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.OooOOOO
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.p118pd.sdk.OooOOOO
    public boolean isStateful() {
        return true;
    }

    @Override // com.p118pd.sdk.OooOOOO
    @NonNull
    public Drawable mutate() {
        if (!this.OooO0o && super.mutate() == this) {
            this.OooO00o.OooO0Oo();
            this.OooO0o = true;
        }
        return this;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int OooO00o2 = this.OooO00o.OooO00o(iArr);
        if (OooO00o2 < 0) {
            OooO00o2 = this.OooO00o.OooO00o(StateSet.WILD_CARD);
        }
        return m16721OooO00o(OooO00o2) || onStateChange;
    }

    public C5948OooOOo0(OooO00o oooO00o, Resources resources) {
        OooO00o(new OooO00o(oooO00o, this, resources));
        onStateChange(getState());
    }

    public void OooO00o(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.OooO00o.OooO00o(iArr, drawable);
            onStateChange(getState());
        }
    }

    public void OooO00o(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0033R.styleable.Oooo0OO);
        setVisible(OooO00o2.getBoolean(C0033R.styleable.StateListDrawable_android_visible, true), true);
        OooO00o(OooO00o2);
        OooO00o(resources);
        OooO00o2.recycle();
        OooO0O0(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public C5948OooOOo0(@Nullable OooO00o oooO00o) {
        if (oooO00o != null) {
            OooO00o(oooO00o);
        }
    }

    private void OooO00o(TypedArray typedArray) {
        OooO00o oooO00o = this.OooO00o;
        if (Build.VERSION.SDK_INT >= 21) {
            ((OooOOOO.OooO0OO) oooO00o).OooO0O0 |= typedArray.getChangingConfigurations();
        }
        ((OooOOOO.OooO0OO) oooO00o).f17108OooO00o = typedArray.getBoolean(C0033R.styleable.StateListDrawable_android_variablePadding, ((OooOOOO.OooO0OO) oooO00o).f17108OooO00o);
        ((OooOOOO.OooO0OO) oooO00o).f17111OooO0OO = typedArray.getBoolean(C0033R.styleable.StateListDrawable_android_constantSize, ((OooOOOO.OooO0OO) oooO00o).f17111OooO0OO);
        ((OooOOOO.OooO0OO) oooO00o).OooOO0O = typedArray.getInt(C0033R.styleable.StateListDrawable_android_enterFadeDuration, ((OooOOOO.OooO0OO) oooO00o).OooOO0O);
        ((OooOOOO.OooO0OO) oooO00o).OooOO0o = typedArray.getInt(C0033R.styleable.StateListDrawable_android_exitFadeDuration, ((OooOOOO.OooO0OO) oooO00o).OooOO0o);
        ((OooOOOO.OooO0OO) oooO00o).f17117OooOO0 = typedArray.getBoolean(C0033R.styleable.StateListDrawable_android_dither, ((OooOOOO.OooO0OO) oooO00o).f17117OooOO0);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public OooO00o m16736OooO0O0() {
        return this.OooO00o;
    }

    public int[] OooO00o(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public int OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m16735OooO00o(int i) {
        return this.OooO00o.OooO00o[i];
    }

    @Override // com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    public Drawable OooO00o(int i) {
        return this.OooO00o.OooO00o(i);
    }

    public int OooO00o(int[] iArr) {
        return this.OooO00o.OooO00o(iArr);
    }

    @Override // com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    public OooO00o OooO00o() {
        return new OooO00o(this.OooO00o, this, null);
    }

    @Override // com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO, com.p118pd.sdk.OooOOOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16734OooO00o() {
        super.m16720OooO00o();
        this.OooO0o = false;
    }

    @Override // com.p118pd.sdk.OooOOOO
    public void OooO00o(@NonNull OooOOOO.OooO0OO oooO0OO) {
        super.OooO00o(oooO0OO);
        if (oooO0OO instanceof OooO00o) {
            this.OooO00o = (OooO00o) oooO0OO;
        }
    }
}
