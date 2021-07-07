package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.jpeg.HuffmanTablesDirectory;

/* renamed from: com.pd.sdk.oOO0O0 */
public class oOO0O0 extends C7929oO0o0OoO<HuffmanTablesDirectory> {
    public oOO0O0(@NotNull HuffmanTablesDirectory huffmanTablesDirectory) {
        super(huffmanTablesDirectory);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((HuffmanTablesDirectory) this.f20998OooO00o).m19639OooO00o(1);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o);
        sb.append(OooO00o.intValue() == 1 ? " Huffman table" : " Huffman tables");
        return sb.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 1) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
