package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: com.pd.sdk.oOOOoOOO  reason: case insensitive filesystem */
public class C8154oOOOoOOO implements AbstractC8155oOOOoOOo {
    public static final String OooO00o = "oOOOoOOO";

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21212OooO00o;

    public C8154oOOOoOOO(PDFView pDFView) {
        this.f21212OooO00o = pDFView;
    }

    @Override // com.p118pd.sdk.AbstractC8155oOOOoOOo
    public void OooO00o(C8167oOOOooOo oooooooo) {
        String uri = oooooooo.m19817OooO00o().getUri();
        Integer destPageIdx = oooooooo.m19817OooO00o().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            OooO00o(uri);
        } else if (destPageIdx != null) {
            OooO00o(destPageIdx.intValue());
        }
    }

    private void OooO00o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f21212OooO00o.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        String str2 = "No activity found for URI: " + str;
    }

    private void OooO00o(int i) {
        this.f21212OooO00o.OooO0OO(i);
    }
}
