package com.p118pd.sdk;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.pd.sdk.o0o000  reason: case insensitive filesystem */
public class C7540o0o000 implements DownloadListener {
    public final /* synthetic */ C7544o0o0000o OooO00o;

    public C7540o0o000(C7544o0o0000o o0o0000o) {
        this.OooO00o = o0o0000o;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(CommonNetImpl.FLAG_AUTH);
            ((AbstractC7611o0o0o00O) this.OooO00o).OooO00o.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
