package com.qiyukf.unicorn.p244ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.baidu.aip.face.stat.FileUtil;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.provider.UnicornProvider;
import com.qiyukf.nimlib.p198j.p199a.C2336b;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.model.AttachmentProgress;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.widget.FileNameTextView;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.io.File;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.FileDownloadActivity */
public class FileDownloadActivity extends BaseFragmentActivity implements View.OnClickListener, C2336b.AbstractC2339a {

    /* renamed from: b */
    public ImageView f5841b;

    /* renamed from: c */
    public FileNameTextView f5842c;

    /* renamed from: d */
    public TextView f5843d;

    /* renamed from: e */
    public Button f5844e;

    /* renamed from: f */
    public LinearLayout f5845f;

    /* renamed from: g */
    public ProgressBar f5846g;

    /* renamed from: h */
    public ImageView f5847h;

    /* renamed from: i */
    public TextView f5848i;

    /* renamed from: j */
    public IMMessage f5849j;

    static {
        C.i(50331754);
    }

    /* renamed from: a */
    private void m6457a(AttachmentProgress attachmentProgress) {
        if (this.f5849j.getAttachStatus() != AttachStatusEnum.transferring || attachmentProgress == null) {
            String a = C1807b.m3415a(((FileAttachment) this.f5849j.getAttachment()).getSize());
            this.f5843d.setText(getString(C2364R.string.ysf_file_download_file_size, new Object[]{a}));
            return;
        }
        String a2 = C1807b.m3415a(attachmentProgress.getTransferred());
        String a3 = C1807b.m3415a(attachmentProgress.getTotal());
        this.f5843d.setText(getString(C2364R.string.ysf_file_download_progress, new Object[]{a2, a3}));
        this.f5846g.setMax((int) attachmentProgress.getTotal());
        this.f5846g.setProgress((int) attachmentProgress.getTransferred());
    }

    /* renamed from: a */
    private void m6459a(boolean z) {
        C2336b.m5072a().mo35083a(z ? this : null);
    }

    /* renamed from: b */
    private void m6460b(boolean z) {
        int i = 0;
        m6461c(false);
        m6457a((AttachmentProgress) null);
        this.f5844e.setText(z ? C2364R.string.ysf_file_open : C2364R.string.ysf_file_download);
        TextView textView = this.f5848i;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: c */
    private void m6461c(boolean z) {
        int i = 8;
        this.f5844e.setVisibility(z ? 8 : 0);
        LinearLayout linearLayout = this.f5845f;
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m6462f() {
        m6461c(true);
        C2336b.m5072a().mo35084b(this.f5849j);
    }

    public static native void start(Context context, IMMessage iMMessage);

    public void onClick(View view) {
        String str;
        if (view == this.f5844e) {
            if (C2336b.m5077d(this.f5849j)) {
                FileAttachment fileAttachment = (FileAttachment) this.f5849j.getAttachment();
                String path = fileAttachment.getPath();
                String displayName = fileAttachment.getDisplayName();
                File file = new File(path);
                if (TextUtils.isEmpty(displayName)) {
                    str = "";
                } else {
                    String a = C1807b.m3416a(displayName);
                    String str2 = null;
                    if (!TextUtils.isEmpty(a)) {
                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a);
                    }
                    String str3 = (!TextUtils.isEmpty(str2) || !TextUtils.equals(a, "aac")) ? str2 : "audio/aac";
                    Log.i(FileUtil.TAG, "fileName:" + displayName + " type:" + str3);
                    str = str3;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(Uri.fromFile(file), str);
                    startActivity(intent);
                } catch (Exception e) {
                    if (TextUtils.equals(e.getClass().getName(), "android.os.FileUriExposedException") && UnicornProvider.m3772b(this)) {
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setDataAndType(UnicornProvider.m3770a(this, file), str);
                            intent2.addFlags(1);
                            startActivity(intent2);
                            return;
                        } catch (Exception unused) {
                            C1865f.m3555a(C2364R.string.ysf_file_open_fail);
                        }
                    }
                    C1865f.m3555a(C2364R.string.ysf_file_open_fail);
                }
            } else if (C2336b.m5078e(this.f5849j)) {
                C1865f.m3555a(C2364R.string.ysf_file_out_of_date);
                this.f5844e.setEnabled(false);
            } else if (!C1861b.m3529b(this)) {
                C1865f.m3555a(C2364R.string.ysf_download_network_not_available);
            } else if (C1861b.m3531d(this) || C1861b.m3532e(this)) {
                C3021g.m7058a(this, getString(C2364R.string.ysf_download_tips_title), getString(C2364R.string.ysf_download_tips_message), getString(C2364R.string.ysf_download_tips_sure), getString(C2364R.string.ysf_cancel), true, new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.unicorn.p244ui.activity.FileDownloadActivity.C27901 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        if (i == 0) {
                            FileDownloadActivity.this.m6462f();
                        }
                    }
                });
            } else {
                m6462f();
            }
        } else if (view == this.f5847h) {
            C2336b.m5072a().mo35085c(this.f5849j);
            m6460b(false);
        }
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // com.qiyukf.nimlib.p198j.p199a.C2336b.AbstractC2339a
    public native void onFail(IMMessage iMMessage);

    @Override // com.qiyukf.nimlib.p198j.p199a.C2336b.AbstractC2339a
    public native void onProgress(AttachmentProgress attachmentProgress);

    @Override // com.qiyukf.nimlib.p198j.p199a.C2336b.AbstractC2339a
    public native void onSuccess(IMMessage iMMessage);
}
