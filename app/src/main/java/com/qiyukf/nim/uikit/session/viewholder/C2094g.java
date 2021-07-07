package com.qiyukf.nim.uikit.session.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.activity.WatchMessagePictureActivity;
import com.qiyukf.nim.uikit.session.helper.C2003b;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.ImageAttachment;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.g */
public class C2094g extends AbstractC2098i {

    /* renamed from: a */
    public TextView f4212a;

    /* renamed from: b */
    public String f4213b;

    /* renamed from: c */
    public View.OnClickListener f4214c = new View.OnClickListener() {
        /* class com.qiyukf.nim.uikit.session.viewholder.C2094g.View$OnClickListenerC20951 */

        public final void onClick(View view) {
            C2003b.m3987a(C2094g.this.context, C2094g.this.f4213b, "");
        }
    };

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final String mo34619a(String str) {
        return str;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final void mo34620a(C2342b.C2343a aVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (TextUtils.isEmpty(this.f4213b)) {
            layoutParams.gravity = 16;
            this.f4226d.setLayoutParams(layoutParams);
            setLayoutParams(aVar.f4693a, aVar.f4694b, this.f4228f);
            return;
        }
        layoutParams.gravity = 48;
        this.f4226d.setLayoutParams(layoutParams);
        setLayoutParams(aVar.f4693a, aVar.f4694b + 152, this.f4228f);
        setLayoutParams(aVar.f4693a, 152, this.f4212a);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final int[] mo34621a() {
        ImageAttachment imageAttachment = (ImageAttachment) this.message.getAttachment();
        return new int[]{imageAttachment.getWidth(), imageAttachment.getHeight()};
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    public void bindContentView() {
        super.bindContentView();
        JSONObject f = C1810b.m3433f(this.message.getExtension(), "action");
        if (f != null) {
            this.f4212a.setVisibility(0);
            if (!TextUtils.isEmpty(C1810b.m3432e(f, "label"))) {
                this.f4212a.setText(C1810b.m3432e(f, "label"));
            } else {
                this.f4212a.setText("知道了");
            }
            String e = C1810b.m3432e(f, "url");
            this.f4213b = e;
            if (!TextUtils.isEmpty(e)) {
                this.f4212a.setOnClickListener(this.f4214c);
            } else {
                this.f4212a.setOnClickListener(null);
            }
        } else {
            this.f4212a.setOnClickListener(null);
            this.f4212a.setVisibility(8);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_picture;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    public void inflateContentView() {
        super.inflateContentView();
        this.f4212a = (TextView) findViewById(C2364R.C2367id.tv_nim_message_item_thumb_button);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (IMMessage iMMessage : getAdapter().mo34141a()) {
            if (iMMessage.getMsgType() == MsgTypeEnum.image) {
                if (iMMessage.isTheSame(this.message)) {
                    i = arrayList.size();
                }
                arrayList.add(iMMessage);
            }
        }
        WatchMessagePictureActivity.start(this.context, arrayList, i);
    }
}
