package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000o0O0  reason: case insensitive filesystem */
public final class C7019o000o0O0 {
    public static final String OooO00o = "ComplexColorCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19286OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ColorStateList f19287OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Shader f19288OooO00o;

    public C7019o000o0O0(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.f19288OooO00o = shader;
        this.f19287OooO00o = colorStateList;
        this.f19286OooO00o = i;
    }

    public static C7019o000o0O0 OooO00o(@NonNull Shader shader) {
        return new C7019o000o0O0(shader, null, 0);
    }

    public boolean OooO0O0() {
        ColorStateList colorStateList;
        return this.f19288OooO00o == null && (colorStateList = this.f19287OooO00o) != null && colorStateList.isStateful();
    }

    public boolean OooO0OO() {
        return m18280OooO00o() || this.f19286OooO00o != 0;
    }

    public static C7019o000o0O0 OooO00o(@NonNull ColorStateList colorStateList) {
        return new C7019o000o0O0(null, colorStateList, colorStateList.getDefaultColor());
    }

    @Nullable
    public static C7019o000o0O0 OooO0O0(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        try {
            return OooO00o(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static C7019o000o0O0 OooO00o(@ColorInt int i) {
        return new C7019o000o0O0(null, null, i);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Shader m18278OooO00o() {
        return this.f19288OooO00o;
    }

    @ColorInt
    public int OooO00o() {
        return this.f19286OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18279OooO00o(@ColorInt int i) {
        this.f19286OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18280OooO00o() {
        return this.f19288OooO00o != null;
    }

    public boolean OooO00o(int[] iArr) {
        if (OooO0O0()) {
            ColorStateList colorStateList = this.f19287OooO00o;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f19286OooO00o) {
                this.f19286OooO00o = colorForState;
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static C7019o000o0O0 OooO00o(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return OooO00o(C9215oooo00o.OooO00o(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return OooO00o(C7020o000o0OO.OooO00o(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
