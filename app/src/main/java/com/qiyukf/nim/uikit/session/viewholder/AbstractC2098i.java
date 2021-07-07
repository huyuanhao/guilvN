package com.qiyukf.nim.uikit.session.viewholder;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MsgThumbImageView;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.nimlib.sdk.msg.attachment.VideoAttachment;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.i */
public abstract class AbstractC2098i extends AbstractC2083b {

    /* renamed from: d */
    public MsgThumbImageView f4226d;

    /* renamed from: e */
    public TextView f4227e;

    /* renamed from: f */
    public ImageView f4228f;

    /* renamed from: b */
    private void m4259b(String str) {
        C2342b.C2343a b = mo34627b();
        setLayoutParams(b.f4693a, b.f4694b, this.f4226d);
        mo34620a(b);
        if (str == null) {
            this.f4226d.mo34304a(C2364R.C2366drawable.ysf_image_placeholder_loading, b.f4693a, b.f4694b, C2364R.C2366drawable.ysf_ic_img_msg_back);
        } else if (this.message.getAttachment() instanceof VideoAttachment) {
            this.f4226d.mo34305a(BitmapFactory.decodeFile(str), b.f4693a, b.f4694b, C2364R.C2366drawable.ysf_ic_img_msg_back);
        } else {
            this.f4226d.mo34306a(str, b.f4693a, b.f4694b, C2364R.C2366drawable.ysf_ic_img_msg_back);
        }
    }

    /* renamed from: c */
    public static int m4260c() {
        double a = (double) C1862c.m3539a();
        Double.isNaN(a);
        return (int) (a * 0.2375d);
    }

    /* renamed from: a */
    public abstract String mo34619a(String str);

    /* renamed from: a */
    public abstract void mo34620a(C2342b.C2343a aVar);

    /* renamed from: a */
    public abstract int[] mo34621a();

    /* renamed from: b */
    public final C2342b.C2343a mo34627b() {
        int[] a = mo34621a();
        if (a[0] > 0 && a[1] > 0) {
            return C2342b.m5097a((float) a[0], (float) a[1], (float) C1862c.m3540a(140.0f), (float) m4260c());
        }
        int a2 = (C1862c.m3540a(140.0f) + m4260c()) / 2;
        return new C2342b.C2343a(a2, a2);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        this.f4228f.setImageResource(C2364R.C2366drawable.ysf_back_img_msg);
        FileAttachment fileAttachment = (FileAttachment) this.message.getAttachment();
        String path = fileAttachment.getPath();
        String thumbPath = fileAttachment.getThumbPath();
        if (TextUtils.isEmpty(thumbPath)) {
            if (!TextUtils.isEmpty(path)) {
                thumbPath = mo34619a(path);
            } else {
                m4259b(null);
                if (this.message.getAttachStatus() == AttachStatusEnum.transferred || this.message.getAttachStatus() == AttachStatusEnum.def) {
                    downloadAttachment();
                }
                FileAttachment fileAttachment2 = (FileAttachment) this.message.getAttachment();
                if (TextUtils.isEmpty(fileAttachment2.getPath()) && TextUtils.isEmpty(fileAttachment2.getThumbPath())) {
                    if (this.message.getAttachStatus() != AttachStatusEnum.fail || this.message.getStatus() == MsgStatusEnum.fail) {
                        this.alertButton.setVisibility(0);
                    } else {
                        this.alertButton.setVisibility(8);
                    }
                }
                if (this.message.getStatus() != MsgStatusEnum.sending || this.message.getAttachStatus() == AttachStatusEnum.transferring) {
                    this.progressBar.setVisibility(0);
                    this.f4227e.setVisibility(0);
                    this.f4227e.setText(C1853d.m3515a(getAdapter().mo34515b(this.message)));
                }
                this.f4227e.setVisibility(8);
                return;
            }
        }
        m4259b(thumbPath);
        FileAttachment fileAttachment22 = (FileAttachment) this.message.getAttachment();
        if (this.message.getAttachStatus() != AttachStatusEnum.fail) {
        }
        this.alertButton.setVisibility(0);
        if (this.message.getStatus() != MsgStatusEnum.sending) {
        }
        this.progressBar.setVisibility(0);
        this.f4227e.setVisibility(0);
        this.f4227e.setText(C1853d.m3515a(getAdapter().mo34515b(this.message)));
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f4226d = (MsgThumbImageView) findViewById(C2364R.C2367id.message_item_thumb_thumbnail);
        this.f4227e = (TextView) findViewById(C2364R.C2367id.message_item_thumb_progress_text);
        this.f4228f = (ImageView) findViewById(C2364R.C2367id.message_item_thumb_cover);
        ViewCompat.OooO00o(this.f4226d, 1, (Paint) null);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
