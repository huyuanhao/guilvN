package com.qiyukf.unicorn.p244ui.p248d;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nim.uikit.session.viewholder.MsgContainerLayout;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOptionEntry;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2567c;
import com.qiyukf.unicorn.p229h.C2658a;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.widget.flowlayout.AbstractC3026a;
import com.qiyukf.unicorn.widget.flowlayout.FlowLayout;
import com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.ui.d.b */
public class View$OnClickListenerC2917b extends AbstractC2083b implements View.OnClickListener {

    /* renamed from: a */
    public RelativeLayout f6288a;

    /* renamed from: b */
    public LinearLayout f6289b;

    /* renamed from: c */
    public TextView f6290c;

    /* renamed from: d */
    public Button f6291d;

    /* renamed from: e */
    public Button f6292e;

    /* renamed from: f */
    public TextView f6293f;

    /* renamed from: g */
    public LinearLayout f6294g;

    /* renamed from: h */
    public TextView f6295h;

    /* renamed from: i */
    public TextView f6296i;

    /* renamed from: j */
    public TextView f6297j;

    /* renamed from: k */
    public LinearLayout f6298k;

    /* renamed from: l */
    public TagFlowLayout f6299l;

    /* renamed from: m */
    public C2567c f6300m;

    /* renamed from: n */
    public C2555c f6301n;

    /* renamed from: o */
    public int f6302o = -1;

    /* renamed from: p */
    public Set<Integer>[] f6303p;

    /* renamed from: q */
    public List<String> f6304q = new ArrayList();

    /* renamed from: r */
    public TextWatcher f6305r = new TextWatcher() {
        /* class com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b.C29214 */

        public final void afterTextChanged(Editable editable) {
            TextView textView = View$OnClickListenerC2917b.this.f6297j;
            textView.setText(editable.length() + "/200");
            View$OnClickListenerC2917b.this.m6791c((View$OnClickListenerC2917b) 2);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: s */
    public AbstractC3026a<String> f6306s = new AbstractC3026a<String>(this.f6304q) {
        /* class com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b.C29225 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.qiyukf.unicorn.widget.flowlayout.FlowLayout, int, java.lang.Object] */
        @Override // com.qiyukf.unicorn.widget.flowlayout.AbstractC3026a
        /* renamed from: a */
        public final /* synthetic */ View mo36769a(FlowLayout flowLayout, int i, String str) {
            View inflate = LayoutInflater.from(flowLayout.getContext()).inflate(C2364R.layout.ysf_evaluation_tag_item, (ViewGroup) flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tag_text);
            textView.setText(str);
            textView.setSelected(View$OnClickListenerC2917b.this.f6303p[View$OnClickListenerC2917b.this.f6302o].contains(Integer.valueOf(i)));
            if (C2690a.m6219a().mo36462d()) {
                textView.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), View$OnClickListenerC2917b.this.context.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
                textView.setBackgroundDrawable(C2692b.m6230b(C2690a.m6219a().mo36461c().mo35690b()));
            }
            return inflate;
        }
    };

    /* renamed from: t */
    public TagFlowLayout.AbstractC3025b f6307t = new TagFlowLayout.AbstractC3025b() {
        /* class com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b.C29236 */

        @Override // com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout.AbstractC3025b
        /* renamed from: a */
        public final boolean mo36770a(View view, int i) {
            if (View$OnClickListenerC2917b.this.f6300m.mo36033f()) {
                return true;
            }
            TextView textView = (TextView) view.findViewById(C2364R.C2367id.ysf_tag_text);
            if (!textView.isSelected()) {
                textView.setSelected(true);
                View$OnClickListenerC2917b.this.f6303p[View$OnClickListenerC2917b.this.f6302o].add(Integer.valueOf(i));
            } else {
                textView.setSelected(false);
                View$OnClickListenerC2917b.this.f6303p[View$OnClickListenerC2917b.this.f6302o].remove(Integer.valueOf(i));
            }
            View$OnClickListenerC2917b.this.m6791c((View$OnClickListenerC2917b) 1);
            return true;
        }
    };

    /* JADX WARNING: Removed duplicated region for block: B:80:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6784a() {
        /*
        // Method dump skipped, instructions count: 825
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b.m6784a():void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6785a(int i) {
        View view;
        this.f6302o = m6787b(i);
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f6289b.getChildCount()) {
                break;
            }
            if (this.f6289b.getChildCount() == 2) {
                view = this.f6289b.getChildAt(i2);
                if (i2 == i) {
                    view.setSelected(z);
                    i2++;
                }
            } else {
                view = this.f6289b.getChildAt(i2);
                if (i2 <= i) {
                    view.setSelected(z);
                    i2++;
                }
            }
            z = false;
            view.setSelected(z);
            i2++;
        }
        List<String> tagList = this.f6301n.mo35962e().get(this.f6302o).getTagList();
        this.f6304q.clear();
        this.f6304q.addAll(tagList);
        this.f6306s.mo36901c();
        this.f6293f.setText(this.f6301n.mo35962e().get(this.f6302o).getName());
        this.f6298k.setVisibility(0);
        if (this.f6301n.mo35968k() == 1) {
            this.f6294g.setVisibility(0);
        }
        this.f6288a.setVisibility(0);
        m6791c(0);
    }

    /* renamed from: b */
    private int m6787b(int i) {
        if (this.f6301n.mo35961d() == 2) {
            return i;
        }
        int d = this.f6301n.mo35961d();
        return d != 3 ? d != 4 ? 4 - i : 3 - i : 2 - i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m6791c(int i) {
        int i2 = this.f6302o;
        if (i2 != -1 && i2 <= this.f6301n.mo35962e().size() - 1) {
            EvaluationOptionEntry evaluationOptionEntry = this.f6301n.mo35962e().get(this.f6302o);
            boolean z = false;
            if (i == 0) {
                this.f6300m.mo36020a(evaluationOptionEntry.getValue());
            } else {
                int i3 = 2;
                if (i == 2) {
                    if (!TextUtils.isEmpty(this.f6290c.getText().toString()) && !this.f6290c.getText().toString().equals(this.f6300m.mo36028c())) {
                        z = true;
                    }
                    this.f6300m.mo36027b(this.f6290c.getText().toString());
                } else if (i == 3) {
                    boolean isSelected = this.f6295h.isSelected();
                    if (!this.f6296i.isSelected()) {
                        i3 = isSelected;
                    }
                    if (this.f6300m.mo36035h() != i3) {
                        z = true;
                    }
                    this.f6300m.mo36029c(i3);
                } else if (i == 1) {
                    Set<Integer> set = this.f6303p[this.f6302o];
                    ArrayList arrayList = new ArrayList(set.size());
                    for (Integer num : set) {
                        arrayList.add(evaluationOptionEntry.getTagList().get(num.intValue()));
                    }
                    this.f6300m.mo36024a(arrayList);
                }
            }
            if (z) {
                ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(this.message, true);
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        MsgContainerLayout msgContainerLayout = this.contentContainer;
        if (isReceivedMessage()) {
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.msgItemBackgroundLeft) <= 0) {
                i = C2364R.C2366drawable.ysf_msg_back_left_selector;
            }
        } else {
            UICustomization uICustomization2 = C2452d.m5373e().uiCustomization;
            if (uICustomization2 == null || (i = uICustomization2.msgItemBackgroundRight) <= 0) {
                i = C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector;
            }
        }
        msgContainerLayout.setBackgroundResource(i);
        this.f6302o = -1;
        this.f6304q.clear();
        this.f6306s.mo36901c();
        C2567c cVar = (C2567c) this.message.getAttachment();
        this.f6300m = cVar;
        if (cVar != null) {
            this.f6301n = cVar.mo36031e();
        }
        C2555c cVar2 = this.f6301n;
        if (cVar2 == null || cVar2.mo35962e() == null) {
            C2452d.m5375g();
            this.f6301n = C2658a.m6097a(this.message.getSessionId());
        }
        this.f6303p = new Set[this.f6301n.mo35962e().size()];
        int i2 = 0;
        while (true) {
            Set<Integer>[] setArr = this.f6303p;
            if (i2 < setArr.length) {
                setArr[i2] = new HashSet();
                i2++;
            } else {
                m6784a();
                return;
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_evaluation;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6290c = (TextView) findViewById(C2364R.C2367id.ysf_evaluation_bubble_et_remark);
        this.f6291d = (Button) findViewById(C2364R.C2367id.ysf_btn_evaluator_bubble_submit);
        this.f6293f = (TextView) findViewById(C2364R.C2367id.ysf_tv_evaluator_bubble_select_score);
        this.f6289b = (LinearLayout) findViewById(C2364R.C2367id.ysf_evaluation_bubble_radio_group);
        this.f6295h = (TextView) findViewById(C2364R.C2367id.ysf_tv_evaluator_bubble_solve);
        this.f6296i = (TextView) findViewById(C2364R.C2367id.ysf_tv_evaluator_bubble_unsolve);
        this.f6297j = (TextView) findViewById(C2364R.C2367id.ysf_tv_evaluator_bubble_remark_word_count);
        this.f6298k = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_evaluation_bubble_remark_parent);
        this.f6294g = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_evaluator_bubble_solve_parent);
        this.f6292e = (Button) findViewById(C2364R.C2367id.ysf_btn_evaluator_bubble_cancel);
        this.f6288a = (RelativeLayout) findViewById(C2364R.C2367id.ysf_rl_evaluator_bubble_btn_parent);
        this.f6299l = (TagFlowLayout) findViewById(C2364R.C2367id.ysf_evaluation_bubble_tag_layout);
        this.f6290c.setOnClickListener(this);
        this.f6291d.setOnClickListener(this);
        this.f6299l.mo36889a(this.f6306s);
        this.f6299l.mo36888a(this.f6307t);
        this.f6292e.setOnClickListener(this);
        this.f6290c.addTextChangedListener(this.f6305r);
        this.f6295h.setOnClickListener(this);
        this.f6296i.setOnClickListener(this);
        if (C2690a.m6219a().mo36462d()) {
            this.f6291d.setBackgroundDrawable(C2692b.m6228a(C2690a.m6219a().mo36461c().mo35690b()));
            this.f6295h.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.context.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
            this.f6296i.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.context.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
            this.f6295h.setBackgroundDrawable(C2692b.m6231c(C2690a.m6219a().mo36461c().mo35690b()));
            this.f6296i.setBackgroundDrawable(C2692b.m6231c(C2690a.m6219a().mo36461c().mo35690b()));
            return;
        }
        this.f6291d.setBackgroundResource(C2364R.C2366drawable.ysf_evaluator_btn_first_bg);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r14) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b.onClick(android.view.View):void");
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
