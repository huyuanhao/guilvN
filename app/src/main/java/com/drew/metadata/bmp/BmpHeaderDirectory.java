package com.drew.metadata.bmp;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.p118pd.sdk.C7936oO0o0oO;
import com.p118pd.sdk.C7938oO0o0oOo;
import java.util.HashMap;

public class BmpHeaderDirectory extends AbstractC7922oO0o0O0O {
    public static final int OooO = 7;
    public static final int OooO00o = -2;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f14868OooO00o;
    public static final int OooO0O0 = -1;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 2;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 3;
    public static final int OooO0oO = 5;
    public static final int OooO0oo = 6;
    public static final int OooOO0 = 8;
    public static final int OooOO0O = 9;
    public static final int OooOO0o = 10;
    public static final int OooOOO = 12;
    public static final int OooOOO0 = 11;
    public static final int OooOOOO = 13;
    public static final int OooOOOo = 14;
    public static final int OooOOo = 16;
    public static final int OooOOo0 = 15;
    public static final int OooOOoo = 17;
    public static final int OooOo0 = 19;
    public static final int OooOo00 = 18;
    public static final int OooOo0O = 20;
    public static final int OooOo0o = 21;

    public enum BitmapType {
        BITMAP(C7938oO0o0oOo.OooO00o),
        OS2_BITMAP_ARRAY(C7938oO0o0oOo.OooO0O0),
        OS2_ICON(C7938oO0o0oOo.OooO0OO),
        OS2_COLOR_ICON(C7938oO0o0oOo.OooO0Oo),
        OS2_COLOR_POINTER(C7938oO0o0oOo.OooO0o0),
        OS2_POINTER(C7938oO0o0oOo.OooO0o);
        
        public final int value;

        /* access modifiers changed from: public */
        BitmapType(int i) {
            this.value = i;
        }

        @Nullable
        public static BitmapType typeOf(int i) {
            BitmapType[] values = values();
            for (BitmapType bitmapType : values) {
                if (bitmapType.value == i) {
                    return bitmapType;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            switch (OooO00o.OooO00o[ordinal()]) {
                case 1:
                    return "Standard";
                case 2:
                    return "Bitmap Array";
                case 3:
                    return "Color Icon";
                case 4:
                    return "Color Pointer";
                case 5:
                    return "Monochrome Icon";
                case 6:
                    return "Monochrome Pointer";
                default:
                    throw new IllegalStateException("Unimplemented bitmap type " + super.toString());
            }
        }
    }

    public enum ColorEncoding {
        RGB(0);
        
        public final int value;

        /* access modifiers changed from: public */
        ColorEncoding(int i) {
            this.value = i;
        }

        @Nullable
        public static ColorEncoding typeOf(int i) {
            if (i == 0) {
                return RGB;
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ColorSpaceType {
        LCS_CALIBRATED_RGB(0),
        LCS_sRGB(1934772034),
        LCS_WINDOWS_COLOR_SPACE(1466527264),
        PROFILE_LINKED(1279872587),
        PROFILE_EMBEDDED(1296188740);
        
        public final long value;

        /* access modifiers changed from: public */
        ColorSpaceType(long j) {
            this.value = j;
        }

        @Nullable
        public static ColorSpaceType typeOf(long j) {
            ColorSpaceType[] values = values();
            for (ColorSpaceType colorSpaceType : values) {
                if (colorSpaceType.value == j) {
                    return colorSpaceType;
                }
            }
            return null;
        }

        public long getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            int i = OooO00o.OooO0Oo[ordinal()];
            if (i == 1) {
                return "Calibrated RGB";
            }
            if (i == 2) {
                return "sRGB Color Space";
            }
            if (i == 3) {
                return "System Default Color Space, sRGB";
            }
            if (i == 4) {
                return "Linked Profile";
            }
            if (i == 5) {
                return "Embedded Profile";
            }
            throw new IllegalStateException("Unimplemented color space type " + super.toString());
        }
    }

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;
        public static final /* synthetic */ int[] OooO0OO;
        public static final /* synthetic */ int[] OooO0Oo;
        public static final /* synthetic */ int[] OooO0o0;

        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(69:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(71:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(73:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|49|50|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0103 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0142 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x014c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0156 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0160 */
        static {
            /*
            // Method dump skipped, instructions count: 363
            */
            throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.bmp.BmpHeaderDirectory.OooO00o.<clinit>():void");
        }
    }

    public enum RenderingHalftoningAlgorithm {
        NONE(0),
        ERROR_DIFFUSION(1),
        PANDA(2),
        SUPER_CIRCLE(3);
        
        public final int value;

        /* access modifiers changed from: public */
        RenderingHalftoningAlgorithm(int i) {
            this.value = i;
        }

        @Nullable
        public static RenderingHalftoningAlgorithm typeOf(int i) {
            RenderingHalftoningAlgorithm[] values = values();
            for (RenderingHalftoningAlgorithm renderingHalftoningAlgorithm : values) {
                if (renderingHalftoningAlgorithm.value == i) {
                    return renderingHalftoningAlgorithm;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            int i = OooO00o.OooO0OO[ordinal()];
            if (i == 1) {
                return "No Halftoning Algorithm";
            }
            if (i == 2) {
                return "Error Diffusion Halftoning";
            }
            if (i == 3) {
                return "Processing Algorithm for Noncoded Document Acquisition";
            }
            if (i == 4) {
                return "Super-circle Halftoning";
            }
            throw new IllegalStateException("Unimplemented rendering halftoning algorithm type " + super.toString());
        }
    }

    public enum RenderingIntent {
        LCS_GM_BUSINESS(1),
        LCS_GM_GRAPHICS(2),
        LCS_GM_IMAGES(4),
        LCS_GM_ABS_COLORIMETRIC(8);
        
        public final int value;

        /* access modifiers changed from: public */
        RenderingIntent(int i) {
            this.value = i;
        }

        @Nullable
        public static RenderingIntent typeOf(long j) {
            RenderingIntent[] values = values();
            for (RenderingIntent renderingIntent : values) {
                if (((long) renderingIntent.value) == j) {
                    return renderingIntent;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            int i = OooO00o.OooO0o0[ordinal()];
            if (i == 1) {
                return "Graphic, Saturation";
            }
            if (i == 2) {
                return "Proof, Relative Colorimetric";
            }
            if (i == 3) {
                return "Picture, Perceptual";
            }
            if (i == 4) {
                return "Match, Absolute Colorimetric";
            }
            throw new IllegalStateException("Unimplemented rendering intent " + super.toString());
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f14868OooO00o = hashMap;
        hashMap.put(-2, "Bitmap type");
        f14868OooO00o.put(-1, "Header Size");
        f14868OooO00o.put(1, "Image Height");
        f14868OooO00o.put(2, "Image Width");
        f14868OooO00o.put(3, "Planes");
        f14868OooO00o.put(4, "Bits Per Pixel");
        f14868OooO00o.put(5, ExifInterface.f14135OooO0o);
        f14868OooO00o.put(6, "X Pixels per Meter");
        f14868OooO00o.put(7, "Y Pixels per Meter");
        f14868OooO00o.put(8, "Palette Colour Count");
        f14868OooO00o.put(9, "Important Colour Count");
        f14868OooO00o.put(10, "Rendering");
        f14868OooO00o.put(11, "Color Encoding");
        f14868OooO00o.put(12, "Red Mask");
        f14868OooO00o.put(13, "Green Mask");
        f14868OooO00o.put(14, "Blue Mask");
        f14868OooO00o.put(15, "Alpha Mask");
        f14868OooO00o.put(16, "Color Space Type");
        f14868OooO00o.put(17, "Red Gamma Curve");
        f14868OooO00o.put(18, "Green Gamma Curve");
        f14868OooO00o.put(19, "Blue Gamma Curve");
        f14868OooO00o.put(20, "Rendering Intent");
        f14868OooO00o.put(21, "Linked Profile File Name");
    }

    public BmpHeaderDirectory() {
        OooO00o(new C7936oO0o0oO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public BitmapType OooO00o() {
        Integer OooO00o2 = m19639OooO00o(-2);
        if (OooO00o2 == null) {
            return null;
        }
        return BitmapType.typeOf(OooO00o2.intValue());
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15026OooO00o() {
        return "BMP Header";
    }

    public enum Compression {
        BI_RGB(0),
        BI_RLE8(1),
        BI_RLE4(2),
        BI_BITFIELDS(3),
        BI_HUFFMAN_1D(3),
        BI_JPEG(4),
        BI_RLE24(4),
        BI_PNG(5),
        BI_ALPHABITFIELDS(6),
        BI_CMYK(11),
        BI_CMYKRLE8(12),
        BI_CMYKRLE4(13);
        
        public final int value;

        /* access modifiers changed from: public */
        Compression(int i) {
            this.value = i;
        }

        @Nullable
        public static Compression typeOf(@NotNull BmpHeaderDirectory bmpHeaderDirectory) {
            Integer OooO00o2;
            Integer OooO00o3 = bmpHeaderDirectory.m19639OooO00o(5);
            if (OooO00o3 == null || (OooO00o2 = bmpHeaderDirectory.m19639OooO00o(-1)) == null) {
                return null;
            }
            return typeOf(OooO00o3.intValue(), OooO00o2.intValue());
        }

        public int getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            switch (OooO00o.OooO0O0[ordinal()]) {
                case 1:
                    return "None";
                case 2:
                    return "RLE 8-bit/pixel";
                case 3:
                    return "RLE 4-bit/pixel";
                case 4:
                    return "Bit Fields";
                case 5:
                    return "Huffman 1D";
                case 6:
                    return "JPEG";
                case 7:
                    return "RLE 24-bit/pixel";
                case 8:
                    return "PNG";
                case 9:
                    return "RGBA Bit Fields";
                case 10:
                    return "CMYK Uncompressed";
                case 11:
                    return "CMYK RLE-8";
                case 12:
                    return "CMYK RLE-4";
                default:
                    throw new IllegalStateException("Unimplemented compression type " + super.toString());
            }
        }

        @Nullable
        public static Compression typeOf(int i, int i2) {
            switch (i) {
                case 0:
                    return BI_RGB;
                case 1:
                    return BI_RLE8;
                case 2:
                    return BI_RLE4;
                case 3:
                    return i2 == 64 ? BI_HUFFMAN_1D : BI_BITFIELDS;
                case 4:
                    return i2 == 64 ? BI_RLE24 : BI_JPEG;
                case 5:
                    return BI_PNG;
                case 6:
                    return BI_ALPHABITFIELDS;
                case 7:
                case 8:
                case 9:
                case 10:
                default:
                    return null;
                case 11:
                    return BI_CMYK;
                case 12:
                    return BI_CMYKRLE8;
                case 13:
                    return BI_CMYKRLE4;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Compression m15023OooO00o() {
        return Compression.typeOf(this);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RenderingHalftoningAlgorithm m15024OooO00o() {
        Integer OooO00o2 = m19639OooO00o(10);
        if (OooO00o2 == null) {
            return null;
        }
        return RenderingHalftoningAlgorithm.typeOf(OooO00o2.intValue());
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ColorEncoding m15021OooO00o() {
        Integer OooO00o2 = m19639OooO00o(11);
        if (OooO00o2 == null) {
            return null;
        }
        return ColorEncoding.typeOf(OooO00o2.intValue());
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ColorSpaceType m15022OooO00o() {
        Long OooO00o2 = m19641OooO00o(16);
        if (OooO00o2 == null) {
            return null;
        }
        return ColorSpaceType.typeOf(OooO00o2.longValue());
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RenderingIntent m15025OooO00o() {
        Integer OooO00o2 = m19639OooO00o(20);
        if (OooO00o2 == null) {
            return null;
        }
        return RenderingIntent.typeOf((long) OooO00o2.intValue());
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m15027OooO00o() {
        return f14868OooO00o;
    }
}
