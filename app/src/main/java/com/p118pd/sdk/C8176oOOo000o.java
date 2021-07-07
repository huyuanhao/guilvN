package com.p118pd.sdk;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOo000o  reason: case insensitive filesystem */
public class C8176oOOo000o implements AbstractC8175oOOo000O {
    public File OooO00o;

    public C8176oOOo000o(File file) {
        this.OooO00o = file;
    }

    @Override // com.p118pd.sdk.AbstractC8175oOOo000O
    public PdfDocument OooO00o(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(ParcelFileDescriptor.open(this.OooO00o, CommonNetImpl.FLAG_AUTH), str);
    }
}
