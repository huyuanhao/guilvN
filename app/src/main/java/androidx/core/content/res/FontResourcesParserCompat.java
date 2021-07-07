package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.C0045R;
import com.facebook.react.views.art.ARTTextShadowNode;
import com.p118pd.sdk.C7066o00O0o0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FontResourcesParserCompat {
    public static final int OooO00o = 400;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 500;
    public static final int OooO0o0 = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public interface OooO00o {
    }

    public static final class OooO0O0 implements OooO00o {
        @NonNull
        public final OooO0OO[] OooO00o;

        public OooO0O0(@NonNull OooO0OO[] oooO0OOArr) {
            this.OooO00o = oooO0OOArr;
        }

        @NonNull
        public OooO0OO[] OooO00o() {
            return this.OooO00o;
        }
    }

    public static final class OooO0OO {
        public int OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f13997OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13998OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f13999OooO0O0;
        public int OooO0OO;

        public OooO0OO(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.f13997OooO00o = str;
            this.OooO00o = i;
            this.f13998OooO00o = z;
            this.f13999OooO0O0 = str2;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m14546OooO00o() {
            return this.f13997OooO00o;
        }

        @Nullable
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public String m14548OooO0O0() {
            return this.f13999OooO0O0;
        }

        public int OooO0OO() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14547OooO00o() {
            return this.f13998OooO00o;
        }

        public int OooO0O0() {
            return this.OooO0O0;
        }

        public int OooO00o() {
            return this.OooO0OO;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$OooO0Oo  reason: case insensitive filesystem */
    public static final class C5032OooO0Oo implements OooO00o {
        public final int OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7066o00O0o0 f14000OooO00o;
        public final int OooO0O0;

        public C5032OooO0Oo(@NonNull C7066o00O0o0 o00o0o0, int i, int i2) {
            this.f14000OooO00o = o00o0o0;
            this.OooO0O0 = i;
            this.OooO00o = i2;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7066o00O0o0 m14549OooO00o() {
            return this.f14000OooO00o;
        }

        public int OooO0O0() {
            return this.OooO00o;
        }

        public int OooO00o() {
            return this.OooO0O0;
        }
    }

    @Nullable
    public static OooO00o OooO00o(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return OooO0O0(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @Nullable
    public static OooO00o OooO0O0(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return OooO0OO(xmlPullParser, resources);
        }
        OooO00o(xmlPullParser);
        return null;
    }

    @Nullable
    public static OooO00o OooO0OO(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0045R.styleable.OooO0O0);
        String string = obtainAttributes.getString(C0045R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0045R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0045R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0045R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0045R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0045R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals(ARTTextShadowNode.PROP_FONT)) {
                        arrayList.add(m14545OooO00o(xmlPullParser, resources));
                    } else {
                        OooO00o(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new OooO0O0((OooO0OO[]) arrayList.toArray(new OooO0OO[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            OooO00o(xmlPullParser);
        }
        return new C5032OooO0Oo(new C7066o00O0o0(string, string2, string3, OooO00o(resources, resourceId)), integer, integer2);
    }

    public static int OooO00o(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static List<List<byte[]>> OooO00o(Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (OooO00o(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(OooO00o(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(OooO00o(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static List<byte[]> OooO00o(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static OooO0OO m14545OooO00o(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0045R.styleable.OooO0OO);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0045R.styleable.FontFamilyFont_fontWeight) ? C0045R.styleable.FontFamilyFont_fontWeight : C0045R.styleable.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0045R.styleable.FontFamilyFont_fontStyle) ? C0045R.styleable.FontFamilyFont_fontStyle : C0045R.styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0045R.styleable.FontFamilyFont_ttcIndex) ? C0045R.styleable.FontFamilyFont_ttcIndex : C0045R.styleable.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0045R.styleable.FontFamilyFont_fontVariationSettings) ? C0045R.styleable.FontFamilyFont_fontVariationSettings : C0045R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0045R.styleable.FontFamilyFont_font) ? C0045R.styleable.FontFamilyFont_font : C0045R.styleable.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            OooO00o(xmlPullParser);
        }
        return new OooO0OO(string2, i, z, string, i3, resourceId);
    }

    public static void OooO00o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
