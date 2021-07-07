package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOo00O0  reason: case insensitive filesystem */
public class C8178oOOo00O0 implements AbstractC8175oOOo000O {
    public Uri OooO00o;

    public C8178oOOo00O0(Uri uri) {
        this.OooO00o = uri;
    }

    @Override // com.p118pd.sdk.AbstractC8175oOOo000O
    public PdfDocument OooO00o(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(context.getContentResolver().openFileDescriptor(this.OooO00o, "r"), str);
    }
}
