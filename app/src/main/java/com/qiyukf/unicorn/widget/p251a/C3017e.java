package com.qiyukf.unicorn.widget.p251a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.widget.p251a.AbstractC3010b;

/* renamed from: com.qiyukf.unicorn.widget.a.e */
public final class C3017e extends AbstractC3010b<C3017e> {

    /* renamed from: d */
    public LinearLayout f6604d;

    /* renamed from: e */
    public View f6605e;

    public C3017e(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f6604d = linearLayout;
        linearLayout.setOrientation(1);
        this.f6604d.setGravity(1);
        this.f6589b.f6591a.removeAllViews();
        this.f6589b.f6591a.addView(this.f6604d, -1, -2);
    }

    /* renamed from: b */
    private boolean m7051b() {
        return this.f6589b.f6592b.getVisibility() == 0 || this.f6589b.f6593c.getVisibility() == 0;
    }

    /* renamed from: a */
    public final C3017e mo36876a(final CharSequence[] charSequenceArr) {
        this.f6604d.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C1862c.m3540a(0.5f));
        for (final int i = 0; i < charSequenceArr.length; i++) {
            View inflate = LayoutInflater.from(this.f6588a).inflate(C2364R.layout.ysf_include_divider, (ViewGroup) this.f6604d, false);
            this.f6604d.addView(inflate, layoutParams2);
            TextView textView = (TextView) LayoutInflater.from(this.f6588a).inflate(C2364R.layout.ysf_dialog_content_item_list_item, (ViewGroup) this.f6604d, false);
            textView.setText(charSequenceArr[i]);
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.widget.p251a.C3017e.View$OnClickListenerC30181 */

                public final void onClick(View view) {
                    C3017e.this.f6589b.cancel();
                    if (C3017e.this.f6590c == null) {
                        return;
                    }
                    if ("取消".equals(charSequenceArr[i])) {
                        AbstractC3010b.DialogC3011a aVar = C3017e.this.f6589b;
                        if (aVar != null) {
                            aVar.cancel();
                            return;
                        }
                        return;
                    }
                    C3017e.this.f6590c.mo34369a(i);
                }
            });
            this.f6604d.addView(textView, layoutParams);
            if (i == 0) {
                this.f6605e = inflate;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r2 == (r4 - 1)) goto L_0x0062;
     */
    @Override // com.qiyukf.unicorn.widget.p251a.AbstractC3010b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36865a() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.widget.p251a.C3017e.mo36865a():void");
    }
}
