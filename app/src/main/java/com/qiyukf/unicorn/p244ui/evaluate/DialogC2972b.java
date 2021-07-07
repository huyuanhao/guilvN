package com.qiyukf.unicorn.p244ui.evaluate;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2608d;
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

/* renamed from: com.qiyukf.unicorn.ui.evaluate.b */
public final class DialogC2972b extends Dialog implements DialogInterface.OnCancelListener, DialogInterface.OnShowListener, View.OnClickListener {

    /* renamed from: A */
    public TextWatcher f6447A = new TextWatcher() {
        /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.C29774 */

        public final void afterTextChanged(Editable editable) {
            TextView textView = DialogC2972b.this.f6461l;
            textView.setText(editable.length() + "/200");
            if (DialogC2972b.this.f6470u != -1) {
                DialogC2972b.this.mo36806a(true);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: B */
    public AbstractC3026a<String> f6448B = new AbstractC3026a<String>(this.f6472w) {
        /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.C29785 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.qiyukf.unicorn.widget.flowlayout.FlowLayout, int, java.lang.Object] */
        @Override // com.qiyukf.unicorn.widget.flowlayout.AbstractC3026a
        /* renamed from: a */
        public final /* synthetic */ View mo36769a(FlowLayout flowLayout, int i, String str) {
            View inflate = LayoutInflater.from(flowLayout.getContext()).inflate(C2364R.layout.ysf_evaluation_tag_item, (ViewGroup) flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tag_text);
            textView.setText(str);
            textView.setSelected(DialogC2972b.this.f6471v[DialogC2972b.this.f6470u].contains(Integer.valueOf(i)));
            if (C2690a.m6219a().mo36462d()) {
                textView.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), DialogC2972b.this.f6466q.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
                textView.setBackgroundDrawable(C2692b.m6230b(C2690a.m6219a().mo36461c().mo35690b()));
            }
            return inflate;
        }
    };

    /* renamed from: C */
    public TagFlowLayout.AbstractC3025b f6449C = new TagFlowLayout.AbstractC3025b() {
        /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.C29796 */

        @Override // com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout.AbstractC3025b
        /* renamed from: a */
        public final boolean mo36770a(View view, int i) {
            TextView textView = (TextView) view.findViewById(C2364R.C2367id.ysf_tag_text);
            if (!textView.isSelected()) {
                textView.setSelected(true);
                DialogC2972b.this.f6471v[DialogC2972b.this.f6470u].add(Integer.valueOf(i));
            } else {
                textView.setSelected(false);
                DialogC2972b.this.f6471v[DialogC2972b.this.f6470u].remove(Integer.valueOf(i));
            }
            DialogC2972b.this.mo36806a(true);
            return true;
        }
    };

    /* renamed from: a */
    public View f6450a;

    /* renamed from: b */
    public ImageView f6451b;

    /* renamed from: c */
    public ScrollView f6452c;

    /* renamed from: d */
    public ScrollView f6453d;

    /* renamed from: e */
    public LinearLayout f6454e;

    /* renamed from: f */
    public EditText f6455f;

    /* renamed from: g */
    public Button f6456g;

    /* renamed from: h */
    public TextView f6457h;

    /* renamed from: i */
    public LinearLayout f6458i;

    /* renamed from: j */
    public TextView f6459j;

    /* renamed from: k */
    public TextView f6460k;

    /* renamed from: l */
    public TextView f6461l;

    /* renamed from: m */
    public LinearLayout f6462m;

    /* renamed from: n */
    public TagFlowLayout f6463n;

    /* renamed from: o */
    public View f6464o;

    /* renamed from: p */
    public AbstractC2980a f6465p;

    /* renamed from: q */
    public Context f6466q;

    /* renamed from: r */
    public C2608d f6467r;

    /* renamed from: s */
    public C2555c f6468s;

    /* renamed from: t */
    public String f6469t;

    /* renamed from: u */
    public int f6470u = -1;

    /* renamed from: v */
    public Set<Integer>[] f6471v;

    /* renamed from: w */
    public List<String> f6472w = new ArrayList();

    /* renamed from: x */
    public String f6473x;

    /* renamed from: y */
    public int f6474y;

    /* renamed from: z */
    public View.OnTouchListener f6475z = new View.OnTouchListener() {
        /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.View$OnTouchListenerC29753 */

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            DialogC2972b.this.f6455f.postDelayed(new Runnable() {
                /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.View$OnTouchListenerC29753.RunnableC29761 */

                public final void run() {
                    DialogC2972b.this.f6453d.fullScroll(130);
                }
            }, 200);
            return false;
        }
    };

    /* renamed from: com.qiyukf.unicorn.ui.evaluate.b$a */
    public interface AbstractC2980a {
        void onSubmit(int i, List<String> list, String str, String str2, int i2);
    }

    public DialogC2972b(Context context, C2608d dVar) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f6466q = context;
        this.f6467r = dVar;
        this.f6473x = dVar.mo36171e();
        this.f6474y = dVar.mo36168c();
        m6916a();
    }

    public DialogC2972b(Context context, String str) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f6466q = context;
        this.f6469t = str;
        m6916a();
    }

    /* renamed from: a */
    private void m6916a() {
        C2608d dVar = this.f6467r;
        if (dVar != null) {
            this.f6468s = dVar.mo36173g();
        }
        C2555c cVar = this.f6468s;
        if (cVar == null || cVar.mo35962e() == null) {
            C2452d.m5375g();
            this.f6468s = C2658a.m6097a(this.f6469t);
        }
        this.f6471v = new Set[this.f6468s.mo35962e().size()];
        int i = 0;
        while (true) {
            Set<Integer>[] setArr = this.f6471v;
            if (i >= setArr.length) {
                break;
            }
            setArr[i] = new HashSet();
            i++;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_evaluation, (ViewGroup) null);
        this.f6450a = inflate;
        setContentView(inflate);
        setCancelable(false);
        setOnShowListener(this);
        setOnCancelListener(this);
        this.f6451b = (ImageView) this.f6450a.findViewById(C2364R.C2367id.ysf_evaluation_dialog_close);
        this.f6452c = (ScrollView) this.f6450a.findViewById(C2364R.C2367id.scroll_view);
        this.f6455f = (EditText) this.f6450a.findViewById(C2364R.C2367id.ysf_evaluation_dialog_et_remark);
        this.f6456g = (Button) this.f6450a.findViewById(C2364R.C2367id.ysf_btn_submit);
        this.f6453d = (ScrollView) this.f6450a.findViewById(C2364R.C2367id.ysf_sl_evaluator_dialog_parent);
        this.f6457h = (TextView) this.f6450a.findViewById(C2364R.C2367id.ysf_tv_evaluator_select_score);
        this.f6454e = (LinearLayout) this.f6450a.findViewById(C2364R.C2367id.ysf_evaluation_dialog_radio_group);
        this.f6459j = (TextView) this.f6450a.findViewById(C2364R.C2367id.ysf_tv_evaluator_solve);
        this.f6460k = (TextView) this.f6450a.findViewById(C2364R.C2367id.ysf_tv_evaluator_unsolve);
        this.f6461l = (TextView) this.f6450a.findViewById(C2364R.C2367id.ysf_tv_evaluator_remark_word_count);
        this.f6462m = (LinearLayout) this.f6450a.findViewById(C2364R.C2367id.ysf_ll_evaluation_dialog_remark_parent);
        this.f6458i = (LinearLayout) this.f6450a.findViewById(C2364R.C2367id.ysf_ll_evaluator_dialog_solve_parent);
        this.f6464o = this.f6450a.findViewById(C2364R.C2367id.ysf_view_evaluator_shadow);
        this.f6463n = (TagFlowLayout) this.f6450a.findViewById(C2364R.C2367id.ysf_evaluation_tag_layout);
        this.f6451b.setOnClickListener(this);
        this.f6455f.setOnTouchListener(this.f6475z);
        this.f6456g.setOnClickListener(this);
        this.f6463n.mo36889a(this.f6448B);
        this.f6463n.mo36888a(this.f6449C);
        this.f6455f.addTextChangedListener(this.f6447A);
        this.f6459j.setOnClickListener(this);
        this.f6460k.setOnClickListener(this);
        if (C2690a.m6219a().mo36462d()) {
            this.f6456g.setBackgroundDrawable(C2692b.m6228a(C2690a.m6219a().mo36461c().mo35690b()));
            this.f6459j.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.f6466q.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
            this.f6460k.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.f6466q.getResources().getColor(C2364R.C2365color.ysf_grey_999999)));
            this.f6459j.setBackgroundDrawable(C2692b.m6231c(C2690a.m6219a().mo36461c().mo35690b()));
            this.f6460k.setBackgroundDrawable(C2692b.m6231c(C2690a.m6219a().mo36461c().mo35690b()));
        } else {
            this.f6456g.setBackgroundResource(C2364R.C2366drawable.ysf_evaluation_dialog_btn_submit_bg_selector);
        }
        C2690a.m6219a().mo36459a(this.f6456g);
        m6921b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r2 == r8) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r2 <= r8) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6917a(int r8) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.m6917a(int):void");
    }

    /* renamed from: b */
    private int m6919b(int i) {
        if (this.f6468s.mo35961d() == 2) {
            return i;
        }
        int d = this.f6468s.mo35961d();
        return d != 3 ? d != 4 ? 4 - i : 3 - i : 2 - i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x023f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0240  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6921b() {
        /*
        // Method dump skipped, instructions count: 700
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.m6921b():void");
    }

    /* renamed from: a */
    public final void mo36805a(AbstractC2980a aVar) {
        this.f6465p = aVar;
    }

    /* renamed from: a */
    public final void mo36806a(boolean z) {
        Button button = this.f6456g;
        if (button != null) {
            button.setEnabled(z);
        }
    }

    /* renamed from: b */
    public final void mo36807b(boolean z) {
        Button button = this.f6456g;
        if (button != null) {
            button.setText(z ? C2364R.string.ysf_evaluation_btn_submitting : C2364R.string.ysf_evaluation_btn_submit);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C2452d.m5375g().mo36350c().mo36318a((DialogC2972b) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.onClick(android.view.View):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    public final void onShow(DialogInterface dialogInterface) {
        C2452d.m5375g().mo36350c().mo36318a(this);
    }
}
