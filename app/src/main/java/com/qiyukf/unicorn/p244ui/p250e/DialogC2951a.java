package com.qiyukf.unicorn.p244ui.p250e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1883f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p244ui.p245a.C2787b;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.qiyukf.unicorn.ui.e.a */
public final class DialogC2951a extends Dialog {

    /* renamed from: a */
    public C2504c.C2505a f6385a;

    /* renamed from: b */
    public AbstractC2957a f6386b;

    /* renamed from: c */
    public Context f6387c;

    /* renamed from: d */
    public View f6388d;

    /* renamed from: e */
    public ListView f6389e = ((ListView) this.f6388d.findViewById(C2364R.C2367id.ysf_lv_work_sheet_field_select));

    /* renamed from: f */
    public Button f6390f = ((Button) this.f6388d.findViewById(C2364R.C2367id.ysf_btn_work_sheet_field_ok));

    /* renamed from: g */
    public C2787b f6391g;

    /* renamed from: h */
    public List<String> f6392h = m6873a(this.f6385a.mo35787g());

    /* renamed from: i */
    public Set<String> f6393i;

    /* renamed from: j */
    public ImageView f6394j = ((ImageView) this.f6388d.findViewById(C2364R.C2367id.ysf_tv_work_sheet_field_close));

    /* renamed from: k */
    public TextView f6395k = ((TextView) this.f6388d.findViewById(C2364R.C2367id.ysf_tv_work_sheet_field_title));

    /* renamed from: com.qiyukf.unicorn.ui.e.a$a */
    public interface AbstractC2957a {
        /* renamed from: a */
        void mo36790a(String str, String str2);
    }

    /* renamed from: com.qiyukf.unicorn.ui.e.a$b */
    public static class C2958b extends AbstractC1883f<String> {

        /* renamed from: a */
        public TextView f6401a;

        /* renamed from: b */
        public ImageView f6402b;

        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public int getResId() {
            return C2364R.layout.ysf_view_holder_leave_msg_field_menu;
        }

        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public void inflate() {
            this.f6401a = (TextView) findView(C2364R.C2367id.tv_leave_msg_field_item_name);
            this.f6402b = (ImageView) findView(C2364R.C2367id.ysf_lv_leave_msg_field_select);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public /* synthetic */ void refresh(String str) {
            ImageView imageView;
            int i;
            this.f6401a.setText(str);
            if (((C2787b) getAdapter()).mo36620b(this.position)) {
                imageView = this.f6402b;
                i = 0;
            } else {
                imageView = this.f6402b;
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC2951a(android.content.Context r10, com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c.C2505a r11) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p250e.DialogC2951a.<init>(android.content.Context, com.qiyukf.unicorn.f.a.a.a.c$a):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m6871a() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f6392h) {
            if (this.f6393i.contains(str)) {
                sb.append(str);
                sb.append(C7522o0Ooo0o.OooO0O0);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<String> m6873a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray b = C1810b.m3428b(str);
            for (int i = 0; i < b.length(); i++) {
                arrayList.add(b.getJSONObject(i).getString("text"));
            }
            return arrayList;
        } catch (Exception unused) {
            C1709a.m3016c("WorkSheet", "parse menu items error: " + str);
            return arrayList;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6874a(DialogC2951a aVar, String str) {
        aVar.f6386b.mo36790a(aVar.f6385a.mo35786f(), str);
        aVar.dismiss();
    }

    /* renamed from: a */
    public final void mo36784a(AbstractC2957a aVar) {
        this.f6386b = aVar;
    }

    public final void onBackPressed() {
        boolean z = true;
        if (this.f6385a.mo35783c() == 2) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f6392h) {
                if (this.f6393i.contains(str)) {
                    sb.append(str);
                    sb.append(C7522o0Ooo0o.OooO0O0);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String a = m6871a();
            if (!TextUtils.isEmpty(a) && !a.equals(this.f6385a.mo35788h())) {
                Context context = this.f6387c;
                C3021g.m7059a(context, context.getString(C2364R.string.ysf_leave_msg_custom_field_abort_commit_confirm), true, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.unicorn.p244ui.p250e.DialogC2951a.C29565 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        if (i == 0) {
                            DialogC2951a.this.cancel();
                        }
                    }
                });
                z = false;
            }
        }
        if (z) {
            super.onBackPressed();
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
