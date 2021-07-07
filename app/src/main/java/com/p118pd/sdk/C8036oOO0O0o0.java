package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.jpeg.HuffmanTablesDirectory;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOO0O0o0  reason: case insensitive filesystem */
public class C8036oOO0O0o0 implements AbstractC8313oOo0o0oO {
    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.DHT);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            OooO00o(new C7916oO0o000(bArr), oo0o0oo0);
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        HuffmanTablesDirectory huffmanTablesDirectory = (HuffmanTablesDirectory) oo0o0oo0.OooO00o(HuffmanTablesDirectory.class);
        if (huffmanTablesDirectory == null) {
            huffmanTablesDirectory = new HuffmanTablesDirectory();
            oo0o0oo0.OooO00o(huffmanTablesDirectory);
        }
        while (oo0o000o.m19614OooO00o() > 0) {
            try {
                byte OooO00o = oo0o000o.OooO00o();
                HuffmanTablesDirectory.HuffmanTable.HuffmanTableClass typeOf = HuffmanTablesDirectory.HuffmanTable.HuffmanTableClass.typeOf((OooO00o & 240) >> 4);
                int i = OooO00o & 15;
                byte[] OooO00o2 = OooO00o(oo0o000o, 16);
                int i2 = 0;
                for (byte b : OooO00o2) {
                    i2 += b & 255;
                }
                huffmanTablesDirectory.m15031OooO00o().add(new HuffmanTablesDirectory.HuffmanTable(typeOf, i, OooO00o2, OooO00o(oo0o000o, i2)));
            } catch (IOException e) {
                huffmanTablesDirectory.OooO00o(e.getMessage());
            }
        }
        huffmanTablesDirectory.OooO00o(1, huffmanTablesDirectory.m15031OooO00o().size());
    }

    private byte[] OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, int i) throws IOException {
        byte OooO00o;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte OooO00o2 = oo0o000o.OooO00o();
            if ((OooO00o2 & 255) != 255 || (OooO00o = oo0o000o.OooO00o()) == 0) {
                bArr[i2] = OooO00o2;
            } else {
                throw new IOException("Marker " + JpegSegmentType.fromByte(OooO00o) + " found inside DHT segment");
            }
        }
        return bArr;
    }
}
