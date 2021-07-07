package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.support.log.C1202a;
import java.text.NumberFormat;

/* renamed from: com.huawei.hms.update.e.i */
public class C1243i extends AbstractC1233b {

    /* renamed from: a */
    public ProgressBar f1382a;

    /* renamed from: b */
    public TextView f1383b;

    /* renamed from: c */
    public int f1384c = 0;

    /* renamed from: d */
    public DialogInterface.OnKeyListener f1385d = new DialogInterface$OnKeyListenerC1244a();

    /* renamed from: com.huawei.hms.update.e.i$a */
    public static class DialogInterface$OnKeyListenerC1244a implements DialogInterface.OnKeyListener {
        public DialogInterface$OnKeyListenerC1244a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1233b
    /* renamed from: a */
    public AlertDialog mo15768a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo15774f(), mo15775g());
        View inflate = View.inflate(mo15774f(), AbstractC1139h.m1080a("hms_download_progress"), null);
        builder.setView(inflate);
        builder.setCancelable(false);
        builder.setOnKeyListener(this.f1385d);
        this.f1382a = (ProgressBar) inflate.findViewById(AbstractC1139h.m1084b("download_info_progress"));
        this.f1383b = (TextView) inflate.findViewById(AbstractC1139h.m1084b("hms_progress_text"));
        mo15783b(this.f1384c);
        return builder.create();
    }

    /* renamed from: b */
    public void mo15783b(int i) {
        ProgressBar progressBar;
        Activity f = mo15774f();
        if (f == null || f.isFinishing()) {
            C1202a.m1319c("DownloadProgress", "In setDownloading, The activity is null or finishing.");
        } else if (this.f1383b != null && (progressBar = this.f1382a) != null) {
            progressBar.setProgress(i);
            this.f1383b.setText(NumberFormat.getPercentInstance().format((double) (((float) i) / 100.0f)));
        }
    }

    /* renamed from: a */
    public void mo15782a(int i) {
        this.f1384c = i;
    }
}
