package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2543a;
import com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity;
import com.qiyukf.unicorn.widget.FileNameTextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.m */
public class C2882m extends AbstractC2857f {

    /* renamed from: a */
    public LinearLayout f6177a;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        View view;
        this.f6177a.removeAllViews();
        List<C2520k.C2521a> d = ((C2543a) this.message.getAttachment()).mo35929d();
        if (d != null) {
            for (int i = 0; i < d.size(); i++) {
                C2520k.C2521a aVar = d.get(i);
                if (aVar.mo35845e()) {
                    view = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_form_request_item_image, (ViewGroup) this.f6177a, false);
                    View findViewById = view.findViewById(C2364R.C2367id.ysf_message_form_item_image_layout);
                    FileNameTextView fileNameTextView = (FileNameTextView) view.findViewById(C2364R.C2367id.ysf_message_form_item_image_name);
                    TextView textView = (TextView) view.findViewById(C2364R.C2367id.ysf_message_form_item_image_size);
                    ((TextView) view.findViewById(C2364R.C2367id.ysf_message_form_item_label)).setText(aVar.mo35843c());
                    JSONObject h = aVar.mo35848h();
                    if (h == null) {
                        findViewById.setVisibility(8);
                    } else {
                        findViewById.setVisibility(0);
                        fileNameTextView.mo36845a(C1810b.m3432e(h, "name"));
                        textView.setText(C1807b.m3415a(C1810b.m3430c(h, FileAttachment.KEY_SIZE)));
                        final String e = C1810b.m3432e(h, "url");
                        findViewById.setOnClickListener(new View.OnClickListener() {
                            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2882m.View$OnClickListenerC28831 */

                            public final void onClick(View view) {
                                if (!C2882m.this.mo36704g()) {
                                    C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                                    return;
                                }
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(e);
                                UrlImagePreviewActivity.start(C2882m.this.context, arrayList, 0);
                            }
                        });
                    }
                } else {
                    view = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_form_request_item_text, (ViewGroup) this.f6177a, false);
                    TextView textView2 = (TextView) view.findViewById(C2364R.C2367id.ysf_message_form_item_text_value);
                    ((TextView) view.findViewById(C2364R.C2367id.ysf_message_form_item_label)).setText(aVar.mo35843c());
                    String g = aVar.mo35847g();
                    if (TextUtils.isEmpty(g)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(g);
                    }
                }
                this.f6177a.addView(view);
                if (i < d.size() - 1) {
                    this.f6177a.addView(LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_include_divider, (ViewGroup) this.f6177a, false));
                }
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_form_request;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6177a = (LinearLayout) findViewById(C2364R.C2367id.ysf_message_form_request_container);
    }
}
