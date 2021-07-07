package com.qiyukf.nim.uikit.session.viewholder;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1864e;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MsgThumbImageView;
import com.qiyukf.nim.uikit.session.activity.WatchVideoActivity;
import com.qiyukf.nimlib.p198j.p200b.C2341a;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.nimlib.p198j.p201c.C2346b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.sdk.msg.attachment.VideoAttachment;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.l */
public class C2101l extends AbstractC2098i {

    /* renamed from: a */
    public C2342b.C2343a f4229a;

    /* renamed from: b */
    public VideoAttachment f4230b;

    /* renamed from: c */
    public TextView f4231c;

    /* renamed from: g */
    public TextView f4232g;

    /* renamed from: h */
    public TextView f4233h;

    /* renamed from: b */
    public static /* synthetic */ void m4267b(C2101l lVar) {
        C2709i.m6263a((Activity) lVar.context).mo36469a("android.permission.WRITE_EXTERNAL_STORAGE").mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.nim.uikit.session.viewholder.C2101l.C21054 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_camera);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onGranted() {
                if (C2101l.this.f4230b.getPath() == null) {
                    C1865f.m3557a("请先下载视频");
                }
                String c = C2349d.m5132c(C2101l.this.context);
                if (TextUtils.isEmpty(C2101l.this.f4230b.getExtension())) {
                    C1865f.m3555a(C2364R.string.ysf_video_save_fail);
                } else if (Build.VERSION.SDK_INT < 29) {
                    String str = c + ("video_" + System.currentTimeMillis() + ".mp4");
                    if (C1806a.m3408a(C2101l.this.f4230b.getPath(), str) != -1) {
                        try {
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(Uri.fromFile(new File(str)));
                            C2101l.this.context.sendBroadcast(intent);
                            C1865f.m3560b(C2101l.this.context.getString(C2364R.string.ysf_video_save_to) + c + "查看");
                        } catch (Exception unused) {
                            C1865f.m3559b(C2364R.string.ysf_picture_save_fail);
                        }
                    } else {
                        C1865f.m3555a(C2364R.string.ysf_video_save_fail);
                    }
                } else if (C2346b.m5119b(C2101l.this.context, new File(C2101l.this.f4230b.getPath()))) {
                    C1865f.m3560b(C2101l.this.context.getString(C2364R.string.ysf_video_save_success));
                } else {
                    C1865f.m3555a(C2364R.string.ysf_video_save_fail);
                }
            }
        }).mo36470a();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final String mo34619a(String str) {
        VideoAttachment videoAttachment = (VideoAttachment) this.message.getAttachment();
        String thumbPathForSave = videoAttachment.getThumbPathForSave();
        if (C2341a.m5087a(str, thumbPathForSave, videoAttachment.getWidth(), videoAttachment.getHeight())) {
            return thumbPathForSave;
        }
        return null;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final void mo34620a(C2342b.C2343a aVar) {
        this.f4229a = aVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.f4226d.setLayoutParams(layoutParams);
        setLayoutParams(aVar.f4693a, aVar.f4694b, this.f4228f);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    /* renamed from: a */
    public final int[] mo34621a() {
        VideoAttachment videoAttachment = (VideoAttachment) this.message.getAttachment();
        return new int[]{videoAttachment.getWidth(), videoAttachment.getHeight()};
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    public void bindContentView() {
        StringBuilder sb;
        super.bindContentView();
        VideoAttachment videoAttachment = (VideoAttachment) this.message.getAttachment();
        this.f4230b = videoAttachment;
        long a = C1864e.m3551a(videoAttachment.getDuration());
        if (a == 0) {
            a = 1;
        }
        TextView textView = this.f4231c;
        if (a >= 10) {
            sb = new StringBuilder("00:");
        }
        sb.append(a);
        textView.setText(sb.toString());
        this.f4232g.setText(C1807b.m3415a(this.f4230b.getSize()));
        this.f4233h.setWidth(mo34627b().f4693a);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_video;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i
    public void inflateContentView() {
        super.inflateContentView();
        this.f4232g = (TextView) findViewById(C2364R.C2367id.tv_ysf_item_message_size);
        this.f4231c = (TextView) findViewById(C2364R.C2367id.tv_ysf_item_message_duration);
        this.f4233h = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_video_shadow);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        WatchVideoActivity.start(this.context, this.message, false);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean onItemLongClick() {
        MsgThumbImageView msgThumbImageView = this.f4226d;
        View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_popup_video_msg_item, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(inflate, C1862c.m3540a(100.0f), C1862c.m3540a(30.0f), true);
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            /* class com.qiyukf.nim.uikit.session.viewholder.C2101l.View$OnTouchListenerC21021 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        ((TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_popup_video_voice)).setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.viewholder.C2101l.View$OnClickListenerC21032 */

            public final void onClick(View view) {
                popupWindow.dismiss();
                WatchVideoActivity.start(C2101l.this.context, C2101l.this.message, true);
            }
        });
        ((TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_popup_video_save)).setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.viewholder.C2101l.View$OnClickListenerC21043 */

            public final void onClick(View view) {
                popupWindow.dismiss();
                C2101l.m4267b(C2101l.this);
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) msgThumbImageView.getLayoutParams();
        popupWindow.showAsDropDown(msgThumbImageView, (layoutParams.width / 2) - C1862c.m3540a(50.0f), -(layoutParams.height + C1862c.m3540a(30.0f)));
        return true;
    }
}
