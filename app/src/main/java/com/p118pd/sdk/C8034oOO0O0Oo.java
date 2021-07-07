package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.jpeg.JpegComponent;

/* renamed from: com.pd.sdk.oOO0O0Oo  reason: case insensitive filesystem */
public class C8034oOO0O0Oo extends C7929oO0o0OoO<C8035oOO0O0o> {
    public C8034oOO0O0Oo(@NotNull C8035oOO0O0o ooo0o0o) {
        super(ooo0o0o);
    }

    @Nullable
    public String OooO00o() {
        String OooO0O0 = ((C8035oOO0O0o) this.f20998OooO00o).OooO0O0(0);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " bits";
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(-3, "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == -3) {
            return OooO0O0();
        }
        if (i == 3) {
            return OooO0Oo();
        }
        if (i == 0) {
            return OooO00o();
        }
        if (i == 1) {
            return OooO0OO();
        }
        switch (i) {
            case 6:
                return OooOO0(0);
            case 7:
                return OooOO0(1);
            case 8:
                return OooOO0(2);
            case 9:
                return OooOO0(3);
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        String OooO0O0 = ((C8035oOO0O0o) this.f20998OooO00o).OooO0O0(3);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " pixels";
    }

    @Nullable
    public String OooOO0(int i) {
        JpegComponent OooO00o = ((C8035oOO0O0o) this.f20998OooO00o).OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.getComponentName() + " component: " + OooO00o;
    }

    @Nullable
    public String OooO0OO() {
        String OooO0O0 = ((C8035oOO0O0o) this.f20998OooO00o).OooO0O0(1);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " pixels";
    }
}
