package com.p118pd.sdk;

import android.app.Activity;
import android.webkit.WebView;
import com.alipay.sdk.app.EnumC0405k;

/* renamed from: com.pd.sdk.o0o0000o  reason: case insensitive filesystem */
public class C7544o0o0000o extends AbstractC7611o0o0o00O {
    public WebView OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7468o0Oo0o0o f20407OooO00o;

    public C7544o0o0000o(Activity activity) {
        super(activity);
        WebView webView = new WebView(activity);
        this.OooO00o = webView;
        OooO00o(webView, activity);
        addView(this.OooO00o);
        C7468o0Oo0o0o o0oo0o0o = new C7468o0Oo0o0o(activity);
        this.f20407OooO00o = o0oo0o0o;
        this.OooO00o.setWebViewClient(o0oo0o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O, com.p118pd.sdk.AbstractC7611o0o0o00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19202OooO00o() {
        if (!this.OooO00o.canGoBack()) {
            C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0O0());
            ((AbstractC7611o0o0o00O) this).OooO00o.finish();
            return true;
        } else if (!this.f20407OooO00o.m19091OooO00o()) {
            return true;
        } else {
            EnumC0405k b = EnumC0405k.m832b(EnumC0405k.NETWORK_ERROR.mo4240a());
            C7479o0OoO000.OooO00o(C7479o0OoO000.OooO00o(b.mo4240a(), b.mo4243b(), ""));
            ((AbstractC7611o0o0o00O) this).OooO00o.finish();
            return true;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O, com.p118pd.sdk.AbstractC7611o0o0o00O
    public void OooO00o() {
        this.f20407OooO00o.OooO00o();
        removeAllViews();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0084 A[Catch:{ all -> 0x009f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(android.webkit.WebView r7, android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7544o0o0000o.OooO00o(android.webkit.WebView, android.content.Context):void");
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O
    public void OooO00o(String str) {
        this.OooO00o.loadUrl(str);
    }
}
