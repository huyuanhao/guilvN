package com.p118pd.sdk;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;

/* renamed from: com.pd.sdk.oOOOoO00  reason: case insensitive filesystem */
public class AsyncTaskC8149oOOOoO00 extends AsyncTask<Void, Void, Throwable> {
    public PDFView OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8153oOOOoOO0 f21163OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8175oOOo000O f21164OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PdfiumCore f21165OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21166OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21167OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f21168OooO00o;

    public AsyncTaskC8149oOOOoO00(AbstractC8175oOOo000O oooo000o, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f21164OooO00o = oooo000o;
        this.f21168OooO00o = iArr;
        this.OooO00o = pDFView;
        this.f21166OooO00o = str;
        this.f21165OooO00o = pdfiumCore;
    }

    /* renamed from: OooO00o */
    public Throwable doInBackground(Void... voidArr) {
        try {
            this.f21163OooO00o = new C8153oOOOoOO0(this.f21165OooO00o, this.f21164OooO00o.OooO00o(this.OooO00o.getContext(), this.f21165OooO00o, this.f21166OooO00o), this.OooO00o.getPageFitPolicy(), OooO00o(), this.f21168OooO00o, this.OooO00o.OooOO0o(), this.OooO00o.getSpacingPx(), this.OooO00o.m15045OooO00o());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public void onCancelled() {
        this.f21167OooO00o = true;
    }

    private Size OooO00o() {
        return new Size(this.OooO00o.getWidth(), this.OooO00o.getHeight());
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Throwable th) {
        if (th != null) {
            this.OooO00o.OooO00o(th);
        } else if (!this.f21167OooO00o) {
            this.OooO00o.OooO00o(this.f21163OooO00o);
        }
    }
}
