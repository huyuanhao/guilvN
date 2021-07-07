package com.qiyukf.unicorn.p244ui.p250e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2755b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p212e.AbstractC2473h;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2564ad;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2565ae;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2628x;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2630y;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2714l;
import com.qiyukf.unicorn.p244ui.p245a.C2780a;
import com.qiyukf.unicorn.p244ui.p250e.DialogC2951a;
import com.qiyukf.unicorn.widget.MultipleStatusLayout;
import com.qiyukf.unicorn.widget.p251a.DialogC3019f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.e.b */
public final class DialogC2959b extends Dialog implements DialogC2951a.AbstractC2957a {

    /* renamed from: a */
    public Observer<CustomNotification> f6403a;

    /* renamed from: b */
    public final C2743d f6404b;

    /* renamed from: c */
    public AbstractC2968a f6405c;

    /* renamed from: d */
    public C2504c f6406d;

    /* renamed from: e */
    public String f6407e;

    /* renamed from: f */
    public ArrayList<C2743d> f6408f;

    /* renamed from: g */
    public boolean f6409g;

    /* renamed from: h */
    public Context f6410h;

    /* renamed from: i */
    public Button f6411i;

    /* renamed from: j */
    public C2780a f6412j;

    /* renamed from: k */
    public GridView f6413k;

    /* renamed from: l */
    public DialogC3019f f6414l;

    /* renamed from: m */
    public LinearLayout f6415m;

    /* renamed from: n */
    public TextView f6416n;

    /* renamed from: o */
    public TextView f6417o;

    /* renamed from: p */
    public MultipleStatusLayout f6418p;

    /* renamed from: q */
    public List<C2504c.C2505a> f6419q;

    /* renamed from: r */
    public long f6420r;

    /* renamed from: com.qiyukf.unicorn.ui.e.b$a */
    public interface AbstractC2968a {
        /* renamed from: a */
        void mo34477a(int i);

        /* renamed from: a */
        void mo34478a(String str);

        /* renamed from: a */
        void mo34479a(ArrayList<C2743d> arrayList, int i);
    }

    public DialogC2959b(@NonNull Context context, long j, String str, AbstractC2968a aVar) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f6403a = new Observer<CustomNotification>() {
            /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29601 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(CustomNotification customNotification) {
                CustomNotification customNotification2 = customNotification;
                if (TextUtils.equals(DialogC2959b.this.f6407e, customNotification2.getSessionId()) && customNotification2.getSessionType() == SessionTypeEnum.Ysf) {
                    DialogC2959b.m6887a(DialogC2959b.this, customNotification2);
                }
            }
        };
        this.f6404b = C2743d.m6337a();
        this.f6408f = new ArrayList<>();
        this.f6409g = false;
        this.f6419q = new ArrayList();
        this.f6410h = context;
        this.f6420r = j;
        this.f6407e = str;
        this.f6405c = aVar;
        m6885a();
    }

    public DialogC2959b(@NonNull Context context, C2504c cVar, String str, AbstractC2968a aVar) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f6403a = new Observer<CustomNotification>() {
            /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29601 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(CustomNotification customNotification) {
                CustomNotification customNotification2 = customNotification;
                if (TextUtils.equals(DialogC2959b.this.f6407e, customNotification2.getSessionId()) && customNotification2.getSessionType() == SessionTypeEnum.Ysf) {
                    DialogC2959b.m6887a(DialogC2959b.this, customNotification2);
                }
            }
        };
        this.f6404b = C2743d.m6337a();
        this.f6408f = new ArrayList<>();
        this.f6409g = false;
        ArrayList arrayList = new ArrayList();
        this.f6419q = arrayList;
        this.f6410h = context;
        this.f6406d = cVar;
        this.f6407e = str;
        this.f6405c = aVar;
        if (cVar != null) {
            arrayList.addAll(cVar.mo35776f());
        }
        m6885a();
    }

    /* renamed from: a */
    private void m6885a() {
        setContentView(LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_work_sheet, (ViewGroup) null));
        if (this.f6410h instanceof Activity) {
            m6893a(true);
            this.f6413k = (GridView) findViewById(C2364R.C2367id.ysf_gv_work_sheet_annex_list);
            this.f6418p = (MultipleStatusLayout) findViewById(C2364R.C2367id.ysf_msl_work_sheet_parent);
            this.f6417o = (TextView) findViewById(C2364R.C2367id.ysf_tv_work_sheet_tip);
            this.f6411i = (Button) findViewById(C2364R.C2367id.ysf_work_sheet_done);
            this.f6416n = (TextView) findViewById(C2364R.C2367id.ysf_tv_work_sheet_annex_label);
            this.f6415m = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_work_sheet_item_parent);
            findViewById(C2364R.C2367id.ysf_work_sheet_close).setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.View$OnClickListenerC29612 */

                public final void onClick(View view) {
                    DialogC2959b.this.cancel();
                }
            });
            ArrayList<C2743d> arrayList = this.f6408f;
            if (arrayList != null && arrayList.size() == 0) {
                this.f6408f.add(this.f6404b);
            }
            C2780a aVar = new C2780a((Activity) this.f6410h, this.f6408f, new AbstractC2473h() {
                /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29623 */

                @Override // com.qiyukf.unicorn.p212e.AbstractC2473h
                /* renamed from: a */
                public final void mo35718a(int i) {
                    DialogC2959b.this.f6408f.remove(i);
                    if (!"EMPTY_TYPE_TAG".equals(((C2743d) DialogC2959b.this.f6408f.get(DialogC2959b.this.f6408f.size() - 1)).f5670b)) {
                        DialogC2959b.this.f6408f.add(DialogC2959b.this.f6404b);
                    }
                    DialogC2959b.this.f6412j.notifyDataSetChanged();
                }
            }, this.f6405c);
            this.f6412j = aVar;
            this.f6413k.setAdapter((ListAdapter) aVar);
            this.f6411i.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.View$OnClickListenerC29634 */

                public final void onClick(View view) {
                    DialogC2959b.m6900e(DialogC2959b.this);
                }
            });
            m6897c();
            return;
        }
        cancel();
    }

    /* renamed from: a */
    private void m6886a(C2743d dVar) {
        if (this.f6408f.size() <= 4) {
            ArrayList<C2743d> arrayList = this.f6408f;
            arrayList.add(arrayList.size() - 1, dVar);
        } else if (this.f6408f.size() == 5) {
            ArrayList<C2743d> arrayList2 = this.f6408f;
            arrayList2.remove(arrayList2.size() - 1);
            this.f6408f.add(dVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6887a(DialogC2959b bVar, CustomNotification customNotification) {
        AbstractC2597e attachment = customNotification.getAttachment();
        if (attachment != null) {
            int cmdId = attachment.getCmdId();
            if (cmdId == 11036) {
                C2504c a = ((C2564ad) attachment).mo36016a();
                bVar.f6406d = a;
                if (a == null) {
                    C1865f.m3557a("获取工单数据失败，请稍后重试");
                    return;
                }
                bVar.f6419q.addAll(a.mo35776f());
                C2452d.m5375g().mo36332a(bVar.f6420r, bVar.f6406d);
                bVar.m6897c();
            } else if (cmdId == 11038) {
                C2565ae aeVar = (C2565ae) attachment;
                String str = "信息已提交";
                IMMessage createTextMessage = MessageBuilder.createTextMessage(bVar.f6407e, SessionTypeEnum.Ysf, TextUtils.isEmpty(aeVar.mo36017a()) ? str : aeVar.mo36017a());
                createTextMessage.setStatus(MsgStatusEnum.success);
                createTextMessage.setDirect(MsgDirectionEnum.Out);
                ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(createTextMessage, true);
                AbstractC2968a aVar = bVar.f6405c;
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aeVar.mo36017a())) {
                        str = aeVar.mo36017a();
                    }
                    aVar.mo34478a(str);
                }
                bVar.m6899d();
                bVar.cancel();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6890a(final List<String> list, final int i, final JSONArray jSONArray) {
        if (list.size() == i) {
            m6892a(jSONArray);
            return;
        }
        String b = C1852c.m3513b(list.get(i));
        String a = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(list.get(i)), EnumC2347c.TYPE_VIDEO);
        if (C1806a.m3408a(list.get(i), a) != -1) {
            File file = new File(a);
            FileAttachment fileAttachment = new FileAttachment();
            fileAttachment.setPath(file.getPath());
            fileAttachment.setSize(file.length());
            fileAttachment.setDisplayName(file.getName());
            ((MsgService) NIMClient.getService(MsgService.class)).sendFile(fileAttachment).setCallback(new RequestCallbackWrapper<FileAttachment>() {
                /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29667 */

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int i, FileAttachment fileAttachment, Throwable th) {
                    FileAttachment fileAttachment2 = fileAttachment;
                    if (i == 200) {
                        JSONObject jSONObject = new JSONObject();
                        C1810b.m3425a(jSONObject, "name", fileAttachment2.getDisplayName());
                        C1810b.m3423a(jSONObject, FileAttachment.KEY_SIZE, fileAttachment2.getSize());
                        C1810b.m3425a(jSONObject, "url", fileAttachment2.getUrl());
                        C1810b.m3421a(jSONArray, jSONObject);
                        DialogC2959b.this.m6890a(list, i + 1, jSONArray);
                        return;
                    }
                    C1865f.m3555a(C2364R.string.ysf_bot_form_upload_image_failed);
                }
            });
            return;
        }
        C1865f.m3555a(C2364R.string.ysf_media_exception);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6891a(final List<String> list, final List<Uri> list2, final int i, final JSONArray jSONArray) {
        if (list2.size() == i) {
            m6892a(jSONArray);
        } else if (list2.size() != 0 && list2.get(i) != null) {
            String a = C1852c.m3510a(C2180b.m4471a(), list2.get(i));
            String a2 = C2349d.m5123a(a + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(list.get(i)), EnumC2347c.TYPE_VIDEO);
            if (C1806a.m3410a(C2180b.m4471a(), list2.get(i), a2)) {
                File file = new File(a2);
                FileAttachment fileAttachment = new FileAttachment();
                fileAttachment.setPath(file.getPath());
                fileAttachment.setSize(file.length());
                fileAttachment.setDisplayName(file.getName());
                ((MsgService) NIMClient.getService(MsgService.class)).sendFile(fileAttachment).setCallback(new RequestCallbackWrapper<FileAttachment>() {
                    /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29656 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, FileAttachment fileAttachment, Throwable th) {
                        FileAttachment fileAttachment2 = fileAttachment;
                        if (i == 200) {
                            JSONObject jSONObject = new JSONObject();
                            C1810b.m3425a(jSONObject, "name", fileAttachment2.getDisplayName());
                            C1810b.m3423a(jSONObject, FileAttachment.KEY_SIZE, fileAttachment2.getSize());
                            C1810b.m3425a(jSONObject, "url", fileAttachment2.getUrl());
                            C1810b.m3421a(jSONArray, jSONObject);
                            DialogC2959b.this.m6891a((DialogC2959b) list, list2, (List) (i + 1), (int) jSONArray);
                            return;
                        }
                        C1865f.m3555a(C2364R.string.ysf_bot_form_upload_image_failed);
                    }
                });
                return;
            }
            C1865f.m3555a(C2364R.string.ysf_video_exception);
        }
    }

    /* renamed from: a */
    private void m6892a(JSONArray jSONArray) {
        EditText editText;
        C2374b bVar = new C2374b();
        C2630y yVar = new C2630y();
        C2628x xVar = new C2628x();
        List<C2628x.C2629a> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(this.f6406d.mo35775e() == null ? "" : this.f6406d.mo35775e());
        for (int i = 0; i < this.f6415m.getChildCount(); i++) {
            ViewGroup viewGroup = (ViewGroup) this.f6415m.getChildAt(i);
            if (viewGroup.getTag() != null) {
                C2628x.C2629a aVar = new C2628x.C2629a();
                C2504c.C2505a aVar2 = (C2504c.C2505a) viewGroup.getTag();
                if (aVar2.mo35783c() == 0) {
                    editText = (EditText) viewGroup.findViewById(C2364R.C2367id.ysf_et_work_sheet_item_content);
                    if (aVar2.mo35782b() == 1 && TextUtils.isEmpty(editText.getText())) {
                        C1865f.m3559b(C2364R.string.ysf_leave_msg_menu_required_tips);
                        m6899d();
                        return;
                    }
                } else {
                    editText = (EditText) viewGroup.findViewById(C2364R.C2367id.ysf_et_work_sheet_item_content);
                    if (aVar2.mo35782b() == 1 && TextUtils.isEmpty(editText.getText().toString())) {
                        C1865f.m3559b(C2364R.string.ysf_leave_msg_menu_required_tips);
                        m6899d();
                        return;
                    }
                }
                aVar.mo36233a(aVar2.mo35786f());
                aVar.mo36235b(aVar2.mo35780a());
                aVar.mo36232a(editText.getText().toString().trim());
                String trim = editText.getText().toString().trim();
                sb.append("&");
                sb.append(aVar2.mo35786f());
                sb.append(C8932ooOOO0o.OooO0Oo);
                sb.append(trim);
                arrayList.add(aVar);
            }
        }
        if (jSONArray != null) {
            C2628x.C2629a aVar3 = new C2628x.C2629a();
            aVar3.mo36233a("uploadFile");
            aVar3.mo36232a(jSONArray);
            arrayList.add(aVar3);
        }
        xVar.mo36229a(arrayList);
        if (this.f6420r != 0) {
            xVar.mo36228a(this.f6406d.mo35777g());
            yVar.mo36237a(C2452d.m5375g().mo36349c(this.f6407e));
            yVar.mo36238a(xVar);
            yVar.mo36239a(sb.toString());
            xVar.mo35276a(yVar);
            C2667c.m6115a((AbstractC2597e) yVar, this.f6407e, true).setCallback(new RequestCallback<Void>() {
                /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.C29678 */

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onException(Throwable th) {
                    DialogC2959b.this.m6899d();
                    C1865f.m3557a("发送失败，请稍后发送...");
                }

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                    DialogC2959b.this.m6899d();
                    C1865f.m3557a("发送失败，请稍后发送...");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
                }
            });
            return;
        }
        xVar.mo36229a(arrayList);
        bVar.mo35240a(xVar.mo36230c());
        bVar.mo35241b(sb.toString());
        xVar.mo35276a(bVar);
        IMMessage createCustomMessage = MessageBuilder.createCustomMessage(this.f6407e, SessionTypeEnum.Ysf, xVar);
        createCustomMessage.setContent("信息已提交");
        C2667c.m6119b(createCustomMessage);
        AbstractC2968a aVar4 = this.f6405c;
        if (aVar4 != null) {
            aVar4.mo34478a("信息已提交");
        }
        m6899d();
        cancel();
    }

    /* renamed from: a */
    private void m6893a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f6403a, z);
    }

    /* renamed from: b */
    private void m6895b() {
        if (!C2714l.m6275a(this.f6410h)) {
            C1865f.m3555a(C2364R.string.ysf_download_network_not_available);
        } else if (!this.f6409g || this.f6408f.size() != 1 || !"EMPTY_TYPE_TAG".equals(this.f6408f.get(0).f5670b)) {
            if (this.f6414l == null) {
                DialogC3019f fVar = new DialogC3019f(this.f6410h);
                this.f6414l = fVar;
                fVar.setCancelable(false);
                this.f6414l.mo36879a("正在提交，请稍后...");
            }
            this.f6414l.show();
            if (this.f6408f.size() != 1) {
                ArrayList arrayList = new ArrayList(6);
                ArrayList arrayList2 = new ArrayList(6);
                Iterator<C2743d> it = this.f6408f.iterator();
                while (it.hasNext()) {
                    C2743d next = it.next();
                    if (!"EMPTY_TYPE_TAG".equals(next.f5670b)) {
                        arrayList.add(C2755b.m6382a(this.f6410h, next.f5671c));
                        arrayList2.add(next.f5671c);
                    }
                }
                if (arrayList.size() != 0 && !TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
                    JSONArray jSONArray = new JSONArray();
                    if (Build.VERSION.SDK_INT >= 29) {
                        m6891a(arrayList, arrayList2, 0, jSONArray);
                    } else {
                        m6890a(arrayList, 0, jSONArray);
                    }
                }
            } else {
                m6892a((JSONArray) null);
            }
        } else {
            C1865f.m3555a(C2364R.string.ysf_leave_msg_annex_toast);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01af, code lost:
        if (android.text.TextUtils.isEmpty(r4.mo35784d()) == false) goto L_0x016f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6897c() {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.m6897c():void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m6899d() {
        DialogC3019f fVar = this.f6414l;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m6900e(DialogC2959b bVar) {
        if (bVar.f6420r != 0) {
            bVar.m6895b();
            return;
        }
        C2474i b = C2452d.m5375g().mo36345b(bVar.f6407e);
        if (bVar.f6406d.mo35773c().equals(String.valueOf(C2452d.m5375g().mo36349c(bVar.f6407e))) || (b != null && b.f4891f && String.valueOf(b.f4892g).equals(bVar.f6406d.mo35773c()))) {
            bVar.m6895b();
            return;
        }
        Context context = bVar.f6410h;
        if (context != null) {
            C1865f.m3557a(context.getString(C2364R.string.ysf_work_sheet_session_change));
        }
    }

    /* renamed from: a */
    public final void mo36791a(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("extra_default_bundle");
        if (bundleExtra != null) {
            ArrayList<C2743d> parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
            if (parcelableArrayList != null) {
                for (C2743d dVar : parcelableArrayList) {
                    m6886a(dVar);
                }
            }
            C2780a aVar = this.f6412j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2951a.AbstractC2957a
    /* renamed from: a */
    public final void mo36790a(String str, String str2) {
        for (int i = 0; i < this.f6415m.getChildCount(); i++) {
            ViewGroup viewGroup = (ViewGroup) this.f6415m.getChildAt(i);
            if (viewGroup.getTag() != null) {
                C2504c.C2505a aVar = (C2504c.C2505a) viewGroup.getTag();
                if (aVar.mo35786f().equals(str) && aVar.mo35783c() != 0) {
                    EditText editText = (EditText) viewGroup.findViewById(C2364R.C2367id.ysf_et_work_sheet_item_content);
                    if ("未选择".equals(str2) || TextUtils.isEmpty(str2)) {
                        str2 = null;
                        editText.setHint("请选择");
                    }
                    aVar.mo35781a(str2);
                    editText.setText(str2);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo36792b(Intent intent) {
        ArrayList<C2743d> parcelableArrayList;
        Bundle bundleExtra = intent.getBundleExtra("extra_default_bundle");
        if (!(bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection")) == null)) {
            this.f6408f.clear();
            this.f6408f.add(this.f6404b);
            for (C2743d dVar : parcelableArrayList) {
                m6886a(dVar);
            }
            C2780a aVar = this.f6412j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    public final void cancel() {
        try {
            m6893a(false);
            super.cancel();
        } catch (Exception e) {
            C1709a.m3015b("WorkSheetDialog", " cancel is error", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }
}
