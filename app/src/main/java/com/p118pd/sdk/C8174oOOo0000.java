package com.p118pd.sdk;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOo0000  reason: case insensitive filesystem */
public class C8174oOOo0000 implements AbstractC8175oOOo000O {
    public final String OooO00o;

    public C8174oOOo0000(String str) {
        this.OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC8175oOOo000O
    public PdfDocument OooO00o(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(ParcelFileDescriptor.open(C8181oOOo00o0.OooO00o(context, this.OooO00o), CommonNetImpl.FLAG_AUTH), str);
    }
}
