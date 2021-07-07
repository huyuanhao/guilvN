package com.qiyukf.unicorn.p244ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1882e;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1883f;
import com.qiyukf.nim.uikit.common.p145a.C1881d;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p212e.C2472g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.LeaveMsgCustomFieldMenuActivity */
public class LeaveMsgCustomFieldMenuActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public C2472g f5889b;

    /* renamed from: c */
    public ListView f5890c;

    /* renamed from: d */
    public Button f5891d;

    /* renamed from: e */
    public C2806a f5892e;

    /* renamed from: f */
    public List<String> f5893f;

    /* renamed from: g */
    public Set<String> f5894g;

    /* renamed from: h */
    public TextView f5895h;

    /* renamed from: i */
    public ImageView f5896i;

    /* renamed from: com.qiyukf.unicorn.ui.activity.LeaveMsgCustomFieldMenuActivity$a */
    public class C2806a extends C1881d<String> {
        public C2806a(Context context, List<String> list, AbstractC1882e eVar) {
            super(context, list, eVar);
        }

        /* renamed from: b */
        public final boolean mo36620b(int i) {
            if (i == 0 && LeaveMsgCustomFieldMenuActivity.this.f5889b.mo35713c() == 1 && TextUtils.isEmpty(LeaveMsgCustomFieldMenuActivity.this.f5889b.mo35717g())) {
                return true;
            }
            if (this.f3460a.getString(C2364R.string.ysf_leave_msg_menu_item_all).equals(LeaveMsgCustomFieldMenuActivity.this.f5893f.get(i))) {
                return false;
            }
            return LeaveMsgCustomFieldMenuActivity.this.f5894g.contains(LeaveMsgCustomFieldMenuActivity.this.f5893f.get(i));
        }
    }

    /* renamed from: com.qiyukf.unicorn.ui.activity.LeaveMsgCustomFieldMenuActivity$b */
    public static class C2807b extends AbstractC1883f<String> {

        /* renamed from: a */
        public TextView f5903a;

        /* renamed from: b */
        public ImageView f5904b;

        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public int getResId() {
            return C2364R.layout.ysf_view_holder_leave_msg_field_menu;
        }

        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public void inflate() {
            this.f5903a = (TextView) findView(C2364R.C2367id.tv_leave_msg_field_item_name);
            this.f5904b = (ImageView) findView(C2364R.C2367id.ysf_lv_leave_msg_field_select);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
        public /* synthetic */ void refresh(String str) {
            ImageView imageView;
            int i;
            this.f5903a.setText(str);
            if (((C2806a) getAdapter()).mo36620b(this.position)) {
                imageView = this.f5904b;
                i = 0;
            } else {
                imageView = this.f5904b;
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    static {
        C.i(50331756);
    }

    /* renamed from: a */
    public static List<String> m6491a(String str) {
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
    public static /* synthetic */ void m6492a(LeaveMsgCustomFieldMenuActivity leaveMsgCustomFieldMenuActivity, String str) {
        Intent intent = new Intent();
        leaveMsgCustomFieldMenuActivity.f5889b.mo35711a(str);
        intent.putExtra("data", leaveMsgCustomFieldMenuActivity.f5889b);
        leaveMsgCustomFieldMenuActivity.setResult(-1, intent);
        C1865f.m3555a(C2364R.string.ysf_leave_custom_field_commit_success);
        leaveMsgCustomFieldMenuActivity.finish();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private String m6497f() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f5893f) {
            if (this.f5894g.contains(str)) {
                sb.append(str);
                sb.append(C7522o0Ooo0o.OooO0O0);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static native void startForResult(Activity activity, int i, C2472g gVar);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    public native void findView();

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);
}
