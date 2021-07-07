package com.qiyukf.unicorn.p244ui.p248d;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.p229h.C2667c;

/* renamed from: com.qiyukf.unicorn.ui.d.g */
public class C2930g extends AbstractC2083b {

    /* renamed from: a */
    public View f6329a;

    /* renamed from: b */
    public TextView f6330b;

    /* renamed from: c */
    public ImageView f6331c;

    /* renamed from: d */
    public TextView f6332d;

    /* renamed from: e */
    public TextView f6333e;

    /* renamed from: f */
    public TextView f6334f;

    /* renamed from: g */
    public TextView f6335g;

    /* renamed from: h */
    public LinearLayout f6336h;

    /* renamed from: i */
    public TextView f6337i;

    /* renamed from: j */
    public TextView f6338j;

    /* renamed from: k */
    public TextView f6339k;

    /* renamed from: l */
    public TextView f6340l;

    /* renamed from: m */
    public TextView f6341m;

    /* renamed from: n */
    public TextView f6342n;

    /* renamed from: o */
    public View f6343o;

    /* renamed from: p */
    public View f6344p;

    /* renamed from: q */
    public ImageView f6345q;

    /* renamed from: r */
    public View f6346r;

    /* renamed from: s */
    public TextView f6347s;

    /* renamed from: t */
    public LinearLayout f6348t;

    /* renamed from: u */
    public View f6349u;

    /* renamed from: v */
    public TextView f6350v;

    /* renamed from: w */
    public ProductAttachment f6351w;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        this.f6351w = (ProductAttachment) this.message.getAttachment();
        this.f6329a.setBackgroundResource(isReceivedMessage() ? C2364R.C2366drawable.ysf_msg_back_left_selector : C2364R.C2366drawable.ysf_msg_white_back_right_selector);
        String str = "";
        if (this.f6351w.getTemplate() == null || !"pictureLink".equals(this.f6351w.getTemplate())) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6329a.getLayoutParams();
            layoutParams.width = (int) ((this.context.getResources().getDisplayMetrics().density * 235.0f) + 0.5f);
            this.f6329a.setLayoutParams(layoutParams);
            this.f6345q.setVisibility(8);
            this.f6348t.setVisibility(0);
            this.f6330b.setText(this.f6351w.getTitle());
            this.f6332d.setText(this.f6351w.getDesc());
            this.f6331c.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
            String picture = this.f6351w.getPicture();
            if (!TextUtils.isEmpty(picture)) {
                str = picture.trim();
            }
            ImageView imageView = this.f6331c;
            C1870a.m3568a(str, imageView, imageView.getWidth(), this.f6331c.getHeight());
            if (!TextUtils.isEmpty(this.f6351w.getOrderSku())) {
                this.f6342n.setVisibility(0);
                this.f6342n.setText(this.f6351w.getOrderSku());
            } else {
                this.f6342n.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getNote())) {
                this.f6333e.setText(this.f6351w.getNote());
                this.f6333e.setVisibility(0);
            } else {
                this.f6333e.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getOrderTime())) {
                this.f6340l.setVisibility(0);
                TextView textView = this.f6340l;
                textView.setText("下单时间：" + this.f6351w.getOrderTime());
            } else {
                this.f6340l.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getOrderID())) {
                this.f6343o.setVisibility(0);
                this.f6339k.setVisibility(0);
                TextView textView2 = this.f6339k;
                textView2.setText("订单编号：" + this.f6351w.getOrderID());
            } else {
                this.f6339k.setVisibility(8);
                this.f6343o.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getActivity())) {
                this.f6341m.setVisibility(0);
                this.f6344p.setVisibility(0);
                this.f6341m.setText(this.f6351w.getActivity());
                if (!TextUtils.isEmpty(this.f6351w.getActivityHref())) {
                    this.f6341m.setOnClickListener(new View.OnClickListener() {
                        /* class com.qiyukf.unicorn.p244ui.p248d.C2930g.View$OnClickListenerC29344 */

                        public final void onClick(View view) {
                            C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2930g.this.context, C2930g.this.f6351w.getActivityHref());
                        }
                    });
                }
            } else {
                this.f6341m.setVisibility(8);
                this.f6344p.setVisibility(8);
            }
            this.f6336h.setVisibility(0);
            if (!TextUtils.isEmpty(this.f6351w.getPrice())) {
                this.f6334f.setVisibility(0);
                this.f6334f.setText(this.f6351w.getPrice());
            } else {
                this.f6334f.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getOrderStatus())) {
                this.f6335g.setVisibility(0);
                this.f6335g.setText(this.f6351w.getOrderStatus());
            } else {
                this.f6335g.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getPayMoney())) {
                this.f6337i.setVisibility(0);
                this.f6337i.setText(this.f6351w.getPayMoney());
            } else {
                this.f6337i.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f6351w.getOrderCount())) {
                this.f6338j.setVisibility(0);
                this.f6338j.setText(this.f6351w.getOrderCount());
            } else {
                this.f6338j.setVisibility(8);
            }
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f6329a.getLayoutParams();
            layoutParams2.width = -2;
            this.f6329a.setLayoutParams(layoutParams2);
            this.f6345q.setVisibility(0);
            this.f6348t.setVisibility(8);
            this.f6339k.setVisibility(8);
            this.f6343o.setVisibility(8);
            this.f6340l.setVisibility(8);
            this.f6344p.setVisibility(8);
            this.f6341m.setVisibility(8);
            this.f6345q.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
            String picture2 = this.f6351w.getPicture();
            if (!TextUtils.isEmpty(picture2)) {
                str = picture2.trim();
            }
            ImageView imageView2 = this.f6345q;
            C1870a.m3568a(str, imageView2, imageView2.getWidth(), this.f6345q.getHeight());
            if (!TextUtils.isEmpty(this.f6351w.getUrl())) {
                this.f6345q.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.C2930g.View$OnClickListenerC29333 */

                    public final void onClick(View view) {
                        C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2930g.this.context, C2930g.this.f6351w.getUrl());
                    }
                });
            }
        }
        if (this.f6351w.getSendByUser() == 1 && this.message.getDirect() == MsgDirectionEnum.Out && C2452d.m5375g().mo36355f(this.message.getSessionId()) != 1) {
            this.f6347s.setText(TextUtils.isEmpty(this.f6351w.getActionText()) ? "发送链接" : this.f6351w.getActionText());
            this.f6347s.setTextColor(this.f6351w.getActionTextColor() == 0 ? -10578718 : this.f6351w.getActionTextColor());
            this.f6346r.setVisibility(0);
            this.f6347s.setVisibility(0);
            this.f6347s.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.C2930g.View$OnClickListenerC29311 */

                public final void onClick(View view) {
                    int i;
                    if (C2452d.m5375g().mo36355f(C2930g.this.message.getSessionId()) == 1) {
                        i = C2364R.string.ysf_send_card_robot;
                    } else if (!C2667c.m6120b()) {
                        i = C2364R.string.ysf_send_card_error;
                    } else {
                        ProductAttachment clone = C2930g.this.f6351w.clone();
                        if (clone != null) {
                            clone.setSendByUser(0);
                            clone.setAuto(0);
                            clone.setActionText("");
                            C2667c.m6119b(MessageBuilder.createCustomMessage(C2930g.this.message.getSessionId(), SessionTypeEnum.Ysf, clone));
                            return;
                        }
                        return;
                    }
                    C1865f.m3559b(i);
                }
            });
        } else {
            this.f6347s.setVisibility(8);
            this.f6346r.setVisibility(8);
        }
        if (this.message.getDirect() != MsgDirectionEnum.Out || !this.f6351w.isOpenReselect()) {
            this.f6350v.setVisibility(8);
            this.f6349u.setVisibility(8);
            return;
        }
        this.f6350v.setVisibility(0);
        this.f6349u.setVisibility(0);
        this.f6350v.setText(TextUtils.isEmpty(this.f6351w.getReselectText()) ? "重新选择" : this.f6351w.getReselectText());
        this.f6350v.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2930g.View$OnClickListenerC29322 */

            public final void onClick(View view) {
                C2930g.this.f6351w.getProductReslectOnclickListener().onClick(C2930g.this.context, C2930g.this.f6351w.getHandlerTag());
            }
        });
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_product;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6329a = findViewById(C2364R.C2367id.ysf_product_content);
        this.f6330b = (TextView) findViewById(C2364R.C2367id.ysf_product_title);
        this.f6331c = (ImageView) findViewById(C2364R.C2367id.ysf_product_image);
        this.f6332d = (TextView) findViewById(C2364R.C2367id.ysf_product_description);
        this.f6333e = (TextView) findViewById(C2364R.C2367id.ysf_product_note);
        this.f6342n = (TextView) findViewById(C2364R.C2367id.ysf_product_sku);
        this.f6334f = (TextView) findViewById(C2364R.C2367id.ysf_product_price);
        this.f6335g = (TextView) findViewById(C2364R.C2367id.ysf_product_order_status);
        this.f6336h = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_product_price_and_count_parent);
        this.f6337i = (TextView) findViewById(C2364R.C2367id.ysf_tv_product_pay_money);
        this.f6338j = (TextView) findViewById(C2364R.C2367id.ysf_tv_product_count);
        this.f6339k = (TextView) findViewById(C2364R.C2367id.ysf_tv_product_number);
        this.f6340l = (TextView) findViewById(C2364R.C2367id.ysf_tv_product_time);
        this.f6341m = (TextView) findViewById(C2364R.C2367id.ysf_tv_product_activity);
        this.f6343o = findViewById(C2364R.C2367id.ysf_view_product_order_line);
        this.f6344p = findViewById(C2364R.C2367id.view_ysf_message_item_activity_line);
        this.f6345q = (ImageView) findViewById(C2364R.C2367id.iv_ysf_message_product_template);
        this.f6346r = findViewById(C2364R.C2367id.view_ysf_message_item_send_line);
        this.f6347s = (TextView) findViewById(C2364R.C2367id.tv_ysf_message_product_send);
        this.f6348t = (LinearLayout) findViewById(C2364R.C2367id.ll_ysf_message_product_top_parent);
        this.f6349u = findViewById(C2364R.C2367id.view_ysf_message_item_reselect_line);
        this.f6350v = (TextView) findViewById(C2364R.C2367id.tv_ysf_message_product_reselect);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        if (this.f6351w.getUrl() != null) {
            String trim = this.f6351w.getUrl().trim();
            Uri parse = Uri.parse(trim);
            if (TextUtils.isEmpty(parse.getScheme())) {
                trim = "http://" + trim;
                parse = Uri.parse(trim);
            }
            try {
                OnMessageItemClickListener onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
                if (onMessageItemClickListener != null) {
                    onMessageItemClickListener.onURLClicked(this.context, trim);
                    return;
                }
                this.context.startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
