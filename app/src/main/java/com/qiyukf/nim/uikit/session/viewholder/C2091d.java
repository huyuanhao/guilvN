package com.qiyukf.nim.uikit.session.viewholder;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.load.engine.GlideException;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.nimlib.p198j.p199a.C2336b;
import com.qiyukf.nimlib.p198j.p199a.C2340c;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.p244ui.activity.FileDownloadActivity;
import com.qiyukf.unicorn.widget.FileNameTextView;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.d */
public class C2091d extends AbstractC2083b {

    /* renamed from: a */
    public LinearLayout f4207a;

    /* renamed from: b */
    public ImageView f4208b;

    /* renamed from: c */
    public FileNameTextView f4209c;

    /* renamed from: d */
    public TextView f4210d;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        Context context;
        int i;
        this.f4207a.setBackgroundResource(isReceivedMessage() ? C2364R.C2366drawable.ysf_msg_back_left_selector : C2364R.C2366drawable.ysf_msg_white_back_right_selector);
        FileAttachment fileAttachment = (FileAttachment) this.message.getAttachment();
        this.f4208b.setImageResource(C2340c.m5083a(fileAttachment.getDisplayName(), false));
        this.f4209c.mo36845a(fileAttachment.getDisplayName());
        if (this.message.getDirect() == MsgDirectionEnum.Out) {
            this.f4210d.setVisibility(8);
            return;
        }
        this.f4210d.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append(C1807b.m3415a(fileAttachment.getSize()));
        sb.append(GlideException.OooO00o.o0ooOoO);
        if (C2336b.m5077d(this.message)) {
            context = this.context;
            i = C2364R.string.ysf_msg_file_downloaded;
        } else if (C2336b.m5078e(this.message)) {
            context = this.context;
            i = C2364R.string.ysf_msg_file_expired;
        } else {
            context = this.context;
            i = C2364R.string.ysf_msg_file_not_downloaded;
        }
        sb.append(context.getString(i));
        this.f4210d.setText(sb.toString());
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_file;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f4207a = (LinearLayout) findViewById(C2364R.C2367id.ll_content);
        this.f4208b = (ImageView) findViewById(C2364R.C2367id.message_item_file_icon_image);
        this.f4209c = (FileNameTextView) findViewById(C2364R.C2367id.message_item_file_name_label);
        this.f4210d = (TextView) findViewById(C2364R.C2367id.message_item_file_status_label);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        if (C2336b.m5077d(this.message) || !C2336b.m5078e(this.message)) {
            FileDownloadActivity.start(this.context, this.message);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
