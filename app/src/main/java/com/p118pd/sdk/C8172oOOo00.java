package com.p118pd.sdk;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oOOo00  reason: case insensitive filesystem */
public class C8172oOOo00 implements AbstractC8175oOOo000O {
    public InputStream OooO00o;

    public C8172oOOo00(InputStream inputStream) {
        this.OooO00o = inputStream;
    }

    @Override // com.p118pd.sdk.AbstractC8175oOOo000O
    public PdfDocument OooO00o(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(C8183oOOo00oo.OooO00o(this.OooO00o), str);
    }
}
