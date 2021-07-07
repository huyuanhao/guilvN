package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2369a;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2543a;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity;
import com.qiyukf.unicorn.widget.FileNameTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.l */
public class DialogInterface$OnDismissListenerC2876l extends AbstractC2857f implements DialogInterface.OnDismissListener, View.OnClickListener {

    /* renamed from: a */
    public static String f6148a;

    /* renamed from: b */
    public TextView f6149b;

    /* renamed from: c */
    public View f6150c;

    /* renamed from: d */
    public Dialog f6151d;

    /* renamed from: e */
    public View f6152e;

    /* renamed from: f */
    public View f6153f;

    /* renamed from: g */
    public Button f6154g;

    /* renamed from: h */
    public C2520k f6155h;

    /* renamed from: i */
    public List<C2520k.C2521a> f6156i;

    /* renamed from: j */
    public final List<AbstractC2881c> f6157j = new ArrayList();

    /* renamed from: com.qiyukf.unicorn.ui.d.a.l$a */
    public class View$OnClickListenerC2877a extends AbstractC2881c implements View.OnClickListener {

        /* renamed from: e */
        public Button f6159e = ((Button) this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_image_select));

        /* renamed from: f */
        public View f6160f = this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_image_layout);

        /* renamed from: g */
        public FileNameTextView f6161g = ((FileNameTextView) this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_image_name));

        /* renamed from: h */
        public TextView f6162h = ((TextView) this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_image_size));

        /* renamed from: i */
        public View f6163i = this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_image_delete);

        /* renamed from: j */
        public String f6164j;

        /* renamed from: k */
        public boolean f6165k;

        /* renamed from: l */
        public C2012d.AbstractC2013a f6166l = new C2012d.AbstractC2013a() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.View$OnClickListenerC2877a.C28781 */

            @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
            public final void sendImage(File file, String str, boolean z) {
                View$OnClickListenerC2877a aVar = View$OnClickListenerC2877a.this;
                aVar.f6164j = "file://" + file.getPath();
                View$OnClickListenerC2877a.this.f6165k = true;
                View$OnClickListenerC2877a.m6712a(View$OnClickListenerC2877a.this);
                FileAttachment fileAttachment = new FileAttachment();
                fileAttachment.setPath(file.getPath());
                fileAttachment.setSize(file.length());
                fileAttachment.setDisplayName(str);
                ((MsgService) NIMClient.getService(MsgService.class)).sendFile(fileAttachment).setCallback(new RequestCallbackWrapper<FileAttachment>() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.View$OnClickListenerC2877a.C28781.C28791 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, FileAttachment fileAttachment, Throwable th) {
                        FileAttachment fileAttachment2 = fileAttachment;
                        if (View$OnClickListenerC2877a.this.f6172b.getTag() == DialogInterface$OnDismissListenerC2876l.this.f6151d) {
                            View$OnClickListenerC2877a.this.f6165k = false;
                            View$OnClickListenerC2877a.m6712a(View$OnClickListenerC2877a.this);
                            if (i == 200) {
                                JSONObject jSONObject = new JSONObject();
                                C1810b.m3425a(jSONObject, "name", fileAttachment2.getDisplayName());
                                C1810b.m3423a(jSONObject, FileAttachment.KEY_SIZE, fileAttachment2.getSize());
                                C1810b.m3425a(jSONObject, "url", fileAttachment2.getUrl());
                                View$OnClickListenerC2877a.this.f6173c.mo35841a(jSONObject);
                                View$OnClickListenerC2877a.this.m6715c();
                                return;
                            }
                            C1865f.m3555a(C2364R.string.ysf_bot_form_upload_image_failed);
                        }
                    }
                });
            }
        };

        public View$OnClickListenerC2877a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        /* renamed from: a */
        public static /* synthetic */ void m6712a(View$OnClickListenerC2877a aVar) {
            aVar.f6159e.setText(aVar.f6165k ? C2364R.string.ysf_bot_form_uploading_image : C2364R.string.ysf_bot_form_upload_image);
            aVar.f6159e.setEnabled(!aVar.f6165k);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: c */
        private void m6715c() {
            JSONObject h = this.f6173c.mo35848h();
            if (h == null) {
                this.f6159e.setVisibility(0);
                this.f6160f.setVisibility(8);
                return;
            }
            this.f6159e.setVisibility(8);
            this.f6160f.setVisibility(0);
            String e = C1810b.m3432e(h, "name");
            String a = C1807b.m3415a(C1810b.m3430c(h, FileAttachment.KEY_SIZE));
            this.f6161g.mo36845a(e);
            this.f6162h.setText(a);
        }

        @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.AbstractC2881c
        /* renamed from: a */
        public final int mo36726a() {
            return C2364R.layout.ysf_message_item_form_notify_item_image;
        }

        @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.AbstractC2881c
        /* renamed from: a */
        public final void mo36727a(C2520k.C2521a aVar) {
            super.mo36727a(aVar);
            this.f6159e.setOnClickListener(this);
            this.f6160f.setOnClickListener(this);
            this.f6163i.setOnClickListener(this);
            this.f6172b.setTag(DialogInterface$OnDismissListenerC2876l.this.f6151d);
            m6715c();
        }

        public final void onClick(View view) {
            if (view == this.f6159e) {
                DialogInterface$OnDismissListenerC2876l.this.getAdapter().mo34518e().mo34502a(this.f6166l);
            } else if (view == this.f6160f) {
                if (!TextUtils.isEmpty(this.f6164j)) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(this.f6164j);
                    UrlImagePreviewActivity.start(DialogInterface$OnDismissListenerC2876l.this.context, arrayList, 0);
                }
            } else if (view == this.f6163i) {
                this.f6164j = null;
                this.f6173c.mo35841a(null);
                m6715c();
            }
        }
    }

    /* renamed from: com.qiyukf.unicorn.ui.d.a.l$b */
    public class C2880b extends AbstractC2881c implements TextWatcher {

        /* renamed from: e */
        public EditText f6170e = ((EditText) this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_input_edit));

        public C2880b(ViewGroup viewGroup) {
            super(viewGroup);
        }

        @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.AbstractC2881c
        /* renamed from: a */
        public final int mo36726a() {
            return C2364R.layout.ysf_message_item_form_notify_item_input;
        }

        @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l.AbstractC2881c
        /* renamed from: a */
        public final void mo36727a(C2520k.C2521a aVar) {
            super.mo36727a(aVar);
            this.f6170e.addTextChangedListener(this);
            if (!TextUtils.isEmpty(aVar.mo35847g())) {
                this.f6170e.setText(aVar.mo35847g());
                EditText editText = this.f6170e;
                editText.setSelection(editText.length());
            }
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            String trim = obj.replace("&", "").trim();
            if (!TextUtils.equals(obj, trim)) {
                this.f6170e.setText(trim);
                this.f6170e.setSelection(trim.length());
            }
            this.f6173c.mo35841a(trim);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.qiyukf.unicorn.ui.d.a.l$c */
    public abstract class AbstractC2881c {

        /* renamed from: a */
        public TextView f6171a;

        /* renamed from: b */
        public View f6172b;

        /* renamed from: c */
        public C2520k.C2521a f6173c;

        /* renamed from: e */
        public View f6175e = this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_required);

        /* renamed from: f */
        public View f6176f = this.f6172b.findViewById(C2364R.C2367id.ysf_message_form_item_error);

        public AbstractC2881c(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo36726a(), viewGroup, false);
            this.f6172b = inflate;
            this.f6171a = (TextView) inflate.findViewById(C2364R.C2367id.ysf_message_form_item_label);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m6720a(AbstractC2881c cVar) {
            if (!cVar.f6173c.mo35844d()) {
                return true;
            }
            boolean i = cVar.f6173c.mo35849i();
            cVar.f6176f.setVisibility(i ? 8 : 0);
            return i;
        }

        /* renamed from: a */
        public abstract int mo36726a();

        /* renamed from: a */
        public void mo36727a(C2520k.C2521a aVar) {
            this.f6173c = aVar;
            this.f6171a.setText(aVar.mo35843c());
            this.f6175e.setVisibility(aVar.mo35844d() ? 0 : 8);
        }

        /* renamed from: b */
        public final View mo36732b() {
            return this.f6172b;
        }
    }

    /* renamed from: a */
    private void m6703a(Dialog dialog) {
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(C2364R.C2367id.ysf_message_form_window_item_container);
        this.f6152e = dialog.findViewById(C2364R.C2367id.ysf_message_form_window_placeholder);
        this.f6153f = dialog.findViewById(C2364R.C2367id.ysf_message_form_window_close);
        this.f6154g = (Button) dialog.findViewById(C2364R.C2367id.ysf_message_form_window_submit);
        ((TextView) dialog.findViewById(C2364R.C2367id.ysf_message_form_window_title)).setText(this.f6155h.mo35835c());
        this.f6152e.setOnClickListener(this);
        this.f6153f.setOnClickListener(this);
        this.f6154g.setOnClickListener(this);
        this.f6157j.clear();
        for (C2520k.C2521a aVar : this.f6156i) {
            AbstractC2881c aVar2 = aVar.mo35845e() ? new View$OnClickListenerC2877a(linearLayout) : new C2880b(linearLayout);
            aVar2.mo36727a(aVar);
            linearLayout.addView(aVar2.mo36732b());
            this.f6157j.add(aVar2);
        }
    }

    /* renamed from: b */
    private void m6705b() {
        if (TextUtils.equals(f6148a, this.message.getUuid()) && this.f6151d == null) {
            getAdapter().mo34518e().mo34506b();
            Dialog dialog = new Dialog(this.context, C2364R.style.ysf_form_dialog_style);
            this.f6151d = dialog;
            dialog.setContentView(C2364R.layout.ysf_popup_window_form);
            this.f6151d.setOnDismissListener(this);
            WindowManager.LayoutParams attributes = this.f6151d.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            m6703a(this.f6151d);
            this.f6151d.show();
        }
    }

    /* renamed from: b */
    public static void m6706b(String str) {
        if (f6148a == null) {
            f6148a = str;
        }
    }

    /* renamed from: h */
    private void m6708h() {
        Dialog dialog = this.f6151d;
        if (dialog != null) {
            C2706g.m6261b(dialog.getWindow().getDecorView());
            this.f6151d.dismiss();
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2520k kVar = (C2520k) this.message.getAttachment();
        this.f6155h = kVar;
        this.f6156i = kVar.mo35837e();
        this.f6149b.setText(this.f6155h.mo35835c());
        this.f6150c.setVisibility(this.f6155h.mo35838f() ? 8 : 0);
        this.f6150c.setOnClickListener(this);
        if (!this.f6155h.mo35838f()) {
            m6705b();
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: e */
    public final boolean mo36702e() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_form_notify;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6149b = (TextView) findViewById(C2364R.C2367id.ysf_message_form_title);
        this.f6150c = findViewById(C2364R.C2367id.ysf_message_form_expand);
    }

    public void onClick(View view) {
        if (view == this.f6150c) {
            long msgSessionId = getMsgSessionId();
            if (msgSessionId <= 0 || msgSessionId != C2452d.m5375g().mo36349c(this.message.getSessionId())) {
                C1865f.m3555a(C2364R.string.ysf_bot_form_disabled);
            } else if (f6148a == null) {
                f6148a = this.message.getUuid();
                m6705b();
            }
        } else if (view == this.f6152e || view == this.f6153f) {
            m6708h();
        } else if (view == this.f6154g) {
            long msgSessionId2 = getMsgSessionId();
            if (msgSessionId2 <= 0 || msgSessionId2 != C2452d.m5375g().mo36349c(this.message.getSessionId())) {
                C1865f.m3555a(C2364R.string.ysf_bot_form_disabled);
                m6708h();
                return;
            }
            boolean z = true;
            for (AbstractC2881c cVar : this.f6157j) {
                if (!AbstractC2881c.m6720a(cVar)) {
                    z = false;
                }
            }
            if (z) {
                m6708h();
                String str = (this.f6155h.mo35836d() == null ? "" : this.f6155h.mo35836d()) + "&msgIdClient=" + this.message.getUuid();
                for (C2520k.C2521a aVar : this.f6156i) {
                    str = str + "&" + aVar.mo35840a() + C8932ooOOO0o.OooO0Oo + (aVar.mo35846f() == null ? "" : aVar.mo35846f().toString());
                }
                C2543a aVar2 = new C2543a();
                aVar2.mo35927a(this.f6156i);
                C2374b bVar = new C2374b();
                bVar.mo35241b(str);
                bVar.mo35240a(aVar2.mo35928c());
                aVar2.mo35276a(bVar);
                getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(this.message.getSessionId(), SessionTypeEnum.Ysf, aVar2));
                this.f6155h.mo35839g();
                ((C2369a) this.f6155h.mo35275a()).mo35229a("hasCommit", true);
                ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(this.message, true);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        f6148a = null;
        this.f6151d = null;
    }
}
