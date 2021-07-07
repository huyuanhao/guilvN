package com.qiyukf.unicorn.p244ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.UnicornMessageBuilder;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2755b;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2472g;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2575j;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2576k;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2610f;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2714l;
import com.qiyukf.unicorn.p244ui.p245a.C2780a;
import com.qiyukf.unicorn.widget.MultipleStatusLayout;
import com.qiyukf.unicorn.widget.p251a.DialogC3019f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.LeaveMessageActivity */
public class LeaveMessageActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public final C2743d f5851b = C2743d.m6337a();

    /* renamed from: c */
    public Observer<CustomNotification> f5852c = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.C27911 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            AbstractC2597e attachment;
            CustomNotification customNotification2 = customNotification;
            if (TextUtils.equals(LeaveMessageActivity.this.f5862m, customNotification2.getSessionId()) && customNotification2.getSessionType() == SessionTypeEnum.Ysf && (attachment = customNotification2.getAttachment()) != null && attachment.getCmdId() == 87) {
                if (((C2576k) attachment).mo36058a() == 0) {
                    LeaveMessageActivity.this.f5867r = true;
                    LeaveMessageActivity.this.mo34366f();
                    LeaveMessageActivity leaveMessageActivity = LeaveMessageActivity.this;
                    LeaveMessageActivity.m6468a(leaveMessageActivity, leaveMessageActivity.f5866q, LeaveMessageActivity.this.f5865p);
                    LeaveMessageActivity.m6476e(LeaveMessageActivity.this);
                    return;
                }
                C1865f.m3560b("发送失败");
            }
        }
    };

    /* renamed from: d */
    public Button f5853d;

    /* renamed from: e */
    public C2780a f5854e;

    /* renamed from: f */
    public TextView f5855f;

    /* renamed from: g */
    public GridView f5856g;

    /* renamed from: h */
    public MultipleStatusLayout f5857h;

    /* renamed from: i */
    public DialogC3019f f5858i;

    /* renamed from: j */
    public LinearLayout f5859j;

    /* renamed from: k */
    public EditText f5860k;

    /* renamed from: l */
    public ImageView f5861l;

    /* renamed from: m */
    public String f5862m;

    /* renamed from: n */
    public String f5863n;

    /* renamed from: o */
    public long f5864o;

    /* renamed from: p */
    public ArrayList<C2743d> f5865p = new ArrayList<>();

    /* renamed from: q */
    public JSONArray f5866q = new JSONArray();

    /* renamed from: r */
    public boolean f5867r = false;

    /* renamed from: s */
    public boolean f5868s = false;

    static {
        C.i(50331755);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6465a(LeaveMessageActivity leaveMessageActivity, final C2472g gVar) {
        if (gVar.mo35713c() != -4) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String b = gVar.mo35712b();
            if (b.length() > 5) {
                spannableStringBuilder.append((CharSequence) b.substring(0, 4)).append((CharSequence) "...");
            } else {
                spannableStringBuilder.append((CharSequence) b);
            }
            if (gVar.mo35714d() == 1) {
                spannableStringBuilder.append((CharSequence) "(必填)");
            }
            int c = gVar.mo35713c();
            View$OnClickListenerC27998 r1 = (c == 1 || c == 2) ? new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.View$OnClickListenerC27998 */

                public final void onClick(View view) {
                    LeaveMsgCustomFieldMenuActivity.startForResult(LeaveMessageActivity.this, 19, gVar);
                }
            } : null;
            ViewGroup viewGroup = (ViewGroup) View.inflate(leaveMessageActivity, C2364R.layout.ysf_view_holder_leave_msg_info, null);
            viewGroup.setTag(gVar);
            TextView textView = (TextView) viewGroup.findViewById(C2364R.C2367id.ysf_tv_leave_msg_info_label);
            TextView textView2 = (TextView) viewGroup.findViewById(C2364R.C2367id.ysf_tv_leave_msg_info_value);
            ImageView imageView = (ImageView) viewGroup.findViewById(C2364R.C2367id.ysf_iv_leave_msg_info_arrow);
            EditText editText = (EditText) viewGroup.findViewById(C2364R.C2367id.ysf_et_leave_msg_item_content);
            if (gVar.mo35710a() == -2) {
                editText.setInputType(2);
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            }
            textView.setText(spannableStringBuilder);
            if (r1 != null) {
                imageView.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(0);
                editText.setVisibility(8);
                viewGroup.setOnClickListener(r1);
                textView2.setText(TextUtils.isEmpty(gVar.mo35717g()) ? "请选择" : gVar.mo35717g());
            } else {
                textView2.setVisibility(8);
                editText.setVisibility(0);
                textView.setVisibility(8);
                imageView.setVisibility(8);
                if ("1".equals(gVar.mo35716f())) {
                    editText.setInputType(2);
                }
                editText.setHint(spannableStringBuilder);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1862c.m3540a(58.0f));
            layoutParams.bottomMargin = C1862c.m3540a(10.0f);
            leaveMessageActivity.f5859j.addView(viewGroup, layoutParams);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6468a(LeaveMessageActivity leaveMessageActivity, JSONArray jSONArray, List list) {
        C2575j jVar = new C2575j();
        jVar.mo36056a(list.size());
        jVar.mo36057a(jSONArray.toString());
        IMMessage buildCustomMessage = UnicornMessageBuilder.buildCustomMessage(jVar);
        buildCustomMessage.setDirect(MsgDirectionEnum.Out);
        buildCustomMessage.setStatus(MsgStatusEnum.success);
        ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(buildCustomMessage, true);
        IMMessage buildTextMessage = UnicornMessageBuilder.buildTextMessage(C2667c.m6116a(), leaveMessageActivity.getString(C2364R.string.ysf_leave_msg_process_hint));
        buildTextMessage.setDirect(MsgDirectionEnum.In);
        buildTextMessage.setStatus(MsgStatusEnum.success);
        ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(buildTextMessage, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6469a(final List<String> list, final int i, final JSONArray jSONArray, final JSONObject jSONObject) {
        if (list.size() == i) {
            C1810b.m3424a(jSONObject, "fieldValue", jSONArray);
            m6471a(jSONObject);
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
                /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.C27932 */

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
                        LeaveMessageActivity.this.m6469a(list, i + 1, jSONArray, jSONObject);
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
    private void m6470a(final List<String> list, final List<Uri> list2, final int i, final JSONArray jSONArray, final JSONObject jSONObject) {
        if (list2.size() == i) {
            C1810b.m3424a(jSONObject, "fieldValue", jSONArray);
            m6471a(jSONObject);
        } else if (list2.size() != 0 && list2.get(i) != null) {
            String a = C1852c.m3510a(this, list2.get(i));
            String a2 = C2349d.m5123a(a + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(list.get(i)), EnumC2347c.TYPE_VIDEO);
            if (C1806a.m3410a(this, list2.get(i), a2)) {
                File file = new File(a2);
                FileAttachment fileAttachment = new FileAttachment();
                fileAttachment.setPath(file.getPath());
                fileAttachment.setSize(file.length());
                fileAttachment.setDisplayName(file.getName());
                ((MsgService) NIMClient.getService(MsgService.class)).sendFile(fileAttachment).setCallback(new RequestCallbackWrapper<FileAttachment>() {
                    /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.C279210 */

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
                            LeaveMessageActivity.this.m6470a((LeaveMessageActivity) list, list2, (List) (i + 1), (int) jSONArray, (JSONArray) jSONObject);
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
    private void m6471a(JSONObject jSONObject) {
        String str;
        C2610f fVar = new C2610f();
        fVar.mo36183c(this.f5860k.getText().toString().trim());
        fVar.mo36182b(this.f5862m);
        fVar.mo36180a(C2437b.m5267d());
        try {
            this.f5866q = new JSONArray("[]");
            for (int i = 0; i < this.f5859j.getChildCount(); i++) {
                ViewGroup viewGroup = (ViewGroup) this.f5859j.getChildAt(i);
                if (viewGroup.getTag() != null) {
                    C2472g gVar = (C2472g) viewGroup.getTag();
                    JSONObject jSONObject2 = new JSONObject();
                    C1810b.m3425a(jSONObject2, "fieldName", gVar.mo35712b());
                    C1810b.m3422a(jSONObject2, "fieldId", gVar.mo35710a());
                    if (gVar.mo35713c() == 0) {
                        EditText editText = (EditText) viewGroup.findViewById(C2364R.C2367id.ysf_et_leave_msg_item_content);
                        if (gVar.mo35714d() != 1 || !TextUtils.isEmpty(editText.getText())) {
                            if (gVar.mo35715e() == -2) {
                                fVar.mo36184d(editText.getText().toString());
                            } else if (gVar.mo35715e() == -3) {
                                fVar.mo36185e(editText.getText().toString());
                            }
                            str = editText.getText().toString();
                        } else {
                            C1865f.m3559b(C2364R.string.ysf_leave_msg_menu_required_tips);
                            mo34366f();
                            return;
                        }
                    } else {
                        TextView textView = (TextView) viewGroup.findViewById(C2364R.C2367id.ysf_tv_leave_msg_info_value);
                        if (gVar.mo35714d() != 1 || !"请选择".equals(textView.getText().toString())) {
                            str = textView.getText().toString();
                        } else {
                            C1865f.m3559b(C2364R.string.ysf_leave_msg_menu_required_tips);
                            mo34366f();
                            return;
                        }
                    }
                    C1810b.m3425a(jSONObject2, "fieldValue", str.trim());
                    C1810b.m3421a(this.f5866q, jSONObject2);
                }
            }
            if (TextUtils.isEmpty(this.f5860k.getText().toString().trim())) {
                C1865f.m3555a(C2364R.string.ysf_leave_msg_empty);
                mo34366f();
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            C1810b.m3425a(jSONObject3, "fieldName", "留言");
            C1810b.m3422a(jSONObject3, "fieldId", -1);
            C1810b.m3425a(jSONObject3, "fieldValue", this.f5860k.getText().toString().trim());
            C1810b.m3421a(this.f5866q, jSONObject3);
            if (jSONObject != null) {
                C1810b.m3421a(this.f5866q, jSONObject);
            }
            fVar.mo36181a(this.f5866q);
            C2667c.m6115a((AbstractC2597e) fVar, this.f5862m, true).setCallback(new RequestCallback<Void>() {
                /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.C27976 */

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onException(Throwable th) {
                    C1865f.m3557a("发送失败，请稍后发送...");
                }

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                    C1865f.m3557a("发送失败，请稍后发送...");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
                }
            });
        } catch (JSONException e) {
            C1709a.m3016c("创建 jsonArray 失败", e.toString());
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m6476e(LeaveMessageActivity leaveMessageActivity) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, C1862c.m3540a(120.0f), 0, 0);
        try {
            leaveMessageActivity.f5857h.mo36849a(layoutParams);
            leaveMessageActivity.f5859j.setVisibility(8);
            leaveMessageActivity.f5860k.setVisibility(8);
            leaveMessageActivity.f5856g.setVisibility(8);
            leaveMessageActivity.f5853d.setVisibility(8);
            leaveMessageActivity.f5857h.mo36852d().findViewById(C2364R.C2367id.ysf_leave_message_success_close).setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.activity.LeaveMessageActivity.View$OnClickListenerC28009 */

                public final void onClick(View view) {
                    LeaveMessageActivity.this.m6478g();
                }
            });
        } catch (NullPointerException e) {
            C1709a.m3015b("LeaveMessageActivity", "showSuccessLayout is error", e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m6478g() {
        if (!this.f5867r) {
            setResult(20);
        }
        finish();
    }

    /* renamed from: g */
    public static /* synthetic */ void m6479g(LeaveMessageActivity leaveMessageActivity) {
        if (!C2714l.m6275a(leaveMessageActivity)) {
            C1865f.m3555a(C2364R.string.ysf_download_network_not_available);
        } else if (leaveMessageActivity.f5868s && leaveMessageActivity.f5865p.size() == 1 && "EMPTY_TYPE_TAG".equals(leaveMessageActivity.f5865p.get(0).f5670b)) {
            C1865f.m3555a(C2364R.string.ysf_leave_msg_annex_toast);
        } else if (TextUtils.isEmpty(leaveMessageActivity.f5860k.getText())) {
            C1865f.m3555a(C2364R.string.ysf_leave_msg_null_tip);
        } else {
            if (leaveMessageActivity.f5858i == null) {
                DialogC3019f fVar = new DialogC3019f(leaveMessageActivity);
                leaveMessageActivity.f5858i = fVar;
                fVar.setCancelable(false);
                leaveMessageActivity.f5858i.mo36879a("正在提交，请稍后...");
            }
            leaveMessageActivity.f5858i.show();
            if (leaveMessageActivity.f5865p.size() != 1) {
                JSONObject jSONObject = new JSONObject();
                C1810b.m3422a(jSONObject, "fieldId", -4);
                C1810b.m3425a(jSONObject, "fieldName", "附件");
                ArrayList arrayList = new ArrayList(6);
                ArrayList arrayList2 = new ArrayList(6);
                Iterator<C2743d> it = leaveMessageActivity.f5865p.iterator();
                while (it.hasNext()) {
                    C2743d next = it.next();
                    if (!"EMPTY_TYPE_TAG".equals(next.f5670b)) {
                        arrayList.add(C2755b.m6382a(leaveMessageActivity, next.f5671c));
                        arrayList2.add(next.f5671c);
                    }
                }
                if (arrayList.size() != 0 && !TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
                    JSONArray jSONArray = new JSONArray();
                    if (Build.VERSION.SDK_INT >= 29) {
                        leaveMessageActivity.m6470a(arrayList, arrayList2, 0, jSONArray, jSONObject);
                    } else {
                        leaveMessageActivity.m6469a(arrayList, 0, jSONArray, jSONObject);
                    }
                }
            } else {
                leaveMessageActivity.m6471a((JSONObject) null);
            }
        }
    }

    public static native void setListViewHeightBasedOnChildren(GridView gridView);

    public static native void start(Fragment fragment, String str, String str2, long j, int i);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: d */
    public final void mo34175d() {
        m6478g();
    }

    @Override // androidx.core.app.ComponentActivity
    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    /* renamed from: f */
    public final void mo34366f() {
        DialogC3019f fVar = this.f5858i;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    public void parseIntent() {
        this.f5862m = getIntent().getStringExtra("LEAVE_MSG_EXCHANGE_TAG");
        this.f5863n = getIntent().getStringExtra("LEAVE_MSG_LABEL_TAG");
        this.f5864o = getIntent().getLongExtra("LEAVE_MSG_TEMPLATE_ID_TAG", 0);
    }

    public native void registerService();
}
