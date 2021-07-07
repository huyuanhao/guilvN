package com.p118pd.sdk;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOo000  reason: case insensitive filesystem */
public class C8173oOOo000 implements AbstractC8175oOOo000O {
    public byte[] OooO00o;

    public C8173oOOo000(byte[] bArr) {
        this.OooO00o = bArr;
    }

    @Override // com.p118pd.sdk.AbstractC8175oOOo000O
    public PdfDocument OooO00o(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(this.OooO00o, str);
    }
}
