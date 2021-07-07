package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2528o;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.p232k.C2700f;
import com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity;
import java.util.ArrayList;

/* renamed from: com.qiyukf.unicorn.ui.d.a.r */
public class C2894r extends AbstractC2857f {

    /* renamed from: a */
    public LinearLayout f6212a;

    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: android.widget.ImageView */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        TextView textView;
        int i;
        int i2;
        this.f6212a.removeAllViews();
        C2528o oVar = (C2528o) this.message.getAttachment();
        for (int i3 = 0; i3 < oVar.mo35868c().size(); i3++) {
            final C2528o.C2529a aVar = oVar.mo35868c().get(i3);
            if (aVar.mo35869a()) {
                ImageView imageView = (ImageView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_image, (ViewGroup) this.f6212a, false);
                C1870a.m3567a(aVar.mo35875g(), imageView);
                imageView.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2894r.View$OnClickListenerC28951 */

                    public final void onClick(View view) {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(aVar.mo35875g());
                        UrlImagePreviewActivity.start(C2894r.this.context, arrayList, 0);
                    }
                });
                textView = imageView;
            } else if (aVar.mo35871c() || aVar.mo35870b() || aVar.mo35872d()) {
                TextView textView2 = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_button, (ViewGroup) this.f6212a, false);
                UICustomization uICustomization = C2452d.m5373e().uiCustomization;
                if (uICustomization == null || (i = uICustomization.robotBtnTextColor) == 0) {
                    i = this.context.getResources().getColor(C2364R.C2365color.ysf_white);
                }
                textView2.setTextColor(i);
                if (!C2690a.m6219a().mo36462d() || textView2.getBackground() == null) {
                    if (uICustomization == null || (i2 = uICustomization.robotBtnBack) == 0) {
                        i2 = C2364R.C2366drawable.ysf_evaluator_btn_first_bg;
                    }
                    textView2.setBackgroundResource(i2);
                } else {
                    textView2.setBackgroundDrawable(C2692b.m6228a(C2690a.m6219a().mo36461c().mo35690b()));
                }
                textView2.setText(aVar.mo35874f());
                textView2.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2894r.View$OnClickListenerC28962 */

                    public final void onClick(View view) {
                        if (!aVar.mo35871c()) {
                            C2894r.this.mo36699a(aVar.mo35876h());
                        } else if (!C2894r.this.mo36704g()) {
                            C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                        } else {
                            C2894r.this.mo36701a(aVar.mo35876h(), aVar.mo35877i(), aVar.mo35874f());
                        }
                    }
                });
                if (mo36704g()) {
                    textView2.setEnabled(true);
                    textView = textView2;
                } else {
                    textView2.setEnabled(false);
                    textView = textView2;
                }
            } else if (aVar.mo35873e()) {
                TextView textView3 = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_text, (ViewGroup) this.f6212a, false);
                C2700f.m6246a(textView3, aVar.mo35874f(), (int) textView3.getResources().getDimension(C2364R.dimen.ysf_bubble_content_rich_image_max_width), this.message.getSessionId());
                textView3.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
                textView = textView3;
            } else {
                TextView textView4 = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_text, (ViewGroup) this.f6212a, false);
                textView4.setText(aVar.mo35874f());
                textView = textView4;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            if (i3 > 0) {
                layoutParams.setMargins(0, C1862c.m3540a(10.0f), 0, 0);
            }
            this.f6212a.addView(textView);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_mix;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6212a = (LinearLayout) findViewById(C2364R.C2367id.ysf_message_mix_container);
    }
}
