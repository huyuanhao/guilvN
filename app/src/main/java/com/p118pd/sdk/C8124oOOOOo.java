package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.png.PngColorType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.List;

/* renamed from: com.pd.sdk.oOOOOo  reason: case insensitive filesystem */
public class C8124oOOOOo extends C7929oO0o0OoO<oOOOOoO0> {
    public C8124oOOOOo(@NotNull oOOOOoO0 ooooooo0) {
        super(ooooooo0);
    }

    @Nullable
    public String OooO() {
        return OooO00o(18, "Unspecified", "Metres");
    }

    @Nullable
    public String OooO00o() {
        byte[] OooO00o = ((oOOOOoO0) this.f20998OooO00o).m19651OooO00o(15);
        Integer OooO00o2 = ((oOOOOoO0) this.f20998OooO00o).m19639OooO00o(4);
        if (!(OooO00o == null || OooO00o2 == null)) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(OooO00o);
            try {
                int intValue = OooO00o2.intValue();
                if (intValue != 0) {
                    if (intValue == 6 || intValue == 2) {
                        return String.format("R %d, G %d, B %d", Integer.valueOf(oo0o000.OooO0OO()), Integer.valueOf(oo0o000.OooO0OO()), Integer.valueOf(oo0o000.OooO0OO()));
                    } else if (intValue == 3) {
                        return String.format("Palette Index %d", Short.valueOf(oo0o000.m19625OooO0O0()));
                    } else if (intValue != 4) {
                        return null;
                    }
                }
                return String.format("Greyscale Level %d", Integer.valueOf(oo0o000.OooO0OO()));
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Nullable
    public String OooO0O0() {
        PngColorType fromNumericValue;
        Integer OooO00o = ((oOOOOoO0) this.f20998OooO00o).m19639OooO00o(4);
        if (OooO00o == null || (fromNumericValue = PngColorType.fromNumericValue(OooO00o.intValue())) == null) {
            return null;
        }
        return fromNumericValue.getDescription();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 4) {
            return OooO0O0();
        }
        if (i == 5) {
            return OooO0OO();
        }
        if (i == 6) {
            return OooO0Oo();
        }
        if (i == 7) {
            return OooO0o0();
        }
        if (i == 9) {
            return OooO0oO();
        }
        if (i == 10) {
            return OooO0o();
        }
        if (i == 13) {
            return OooO0oo();
        }
        if (i == 15) {
            return OooO00o();
        }
        if (i != 18) {
            return super.OooO0OO(i);
        }
        return OooO();
    }

    @Nullable
    public String OooO0Oo() {
        return OooO00o(6, "Adaptive");
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(10, "Perceptual", "Relative Colorimetric", ExifInterface.o00000oO, "Absolute Colorimetric");
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(7, "No Interlace", "Adam7 Interlace");
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(9, null, "Yes");
    }

    @Nullable
    public String OooO0oo() {
        Object OooO00o = ((oOOOOoO0) this.f20998OooO00o).m19642OooO00o(13);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C7904oO0Ooo0 oo0ooo0 : (List) OooO00o) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            sb.append(String.format("%s: %s", oo0ooo0.m19587OooO00o(), oo0ooo0.OooO00o()));
        }
        return sb.toString();
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(5, "Deflate");
    }
}
