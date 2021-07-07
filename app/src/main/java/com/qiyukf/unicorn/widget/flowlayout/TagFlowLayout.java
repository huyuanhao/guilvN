package com.qiyukf.unicorn.widget.flowlayout;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.qiyukf.unicorn.widget.flowlayout.AbstractC3026a;
import java.util.HashSet;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements AbstractC3026a.AbstractC3027a {

    /* renamed from: d */
    public AbstractC3026a f6618d;

    /* renamed from: e */
    public int f6619e;

    /* renamed from: f */
    public Set<Integer> f6620f;

    /* renamed from: g */
    public AbstractC3024a f6621g;

    /* renamed from: h */
    public AbstractC3025b f6622h;

    /* renamed from: com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout$a */
    public interface AbstractC3024a {
    }

    /* renamed from: com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout$b */
    public interface AbstractC3025b {
        /* renamed from: a */
        boolean mo36770a(View view, int i);
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6619e = -1;
        this.f6620f = new HashSet();
    }

    /* renamed from: a */
    public static void m7062a(int i, TagView tagView) {
        tagView.setChecked(true);
        tagView.getChildAt(0);
        String str = "onSelected " + i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m7063a(TagFlowLayout tagFlowLayout, TagView tagView, int i) {
        if (!tagView.isChecked()) {
            if (tagFlowLayout.f6619e == 1 && tagFlowLayout.f6620f.size() == 1) {
                Integer next = tagFlowLayout.f6620f.iterator().next();
                m7065b(next.intValue(), (TagView) tagFlowLayout.getChildAt(next.intValue()));
                m7062a(i, tagView);
                tagFlowLayout.f6620f.remove(next);
            } else if (tagFlowLayout.f6619e <= 0 || tagFlowLayout.f6620f.size() < tagFlowLayout.f6619e) {
                m7062a(i, tagView);
            } else {
                return;
            }
            tagFlowLayout.f6620f.add(Integer.valueOf(i));
        } else {
            m7065b(i, tagView);
            tagFlowLayout.f6620f.remove(Integer.valueOf(i));
        }
        if (tagFlowLayout.f6621g != null) {
            new HashSet(tagFlowLayout.f6620f);
        }
    }

    /* renamed from: b */
    private void m7064b() {
        removeAllViews();
        AbstractC3026a aVar = this.f6618d;
        HashSet<Integer> a = aVar.mo36898a();
        for (final int i = 0; i < aVar.mo36900b(); i++) {
            View a2 = aVar.mo36769a(this, i, aVar.mo36897a(i));
            final TagView tagView = new TagView(getContext());
            a2.setDuplicateParentStateEnabled(true);
            if (a2.getLayoutParams() != null) {
                tagView.setLayoutParams(a2.getLayoutParams());
            } else {
                int i2 = (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(i2, i2, i2, i2);
                tagView.setLayoutParams(marginLayoutParams);
            }
            a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            tagView.addView(a2);
            addView(tagView);
            if (a.contains(Integer.valueOf(i))) {
                m7062a(i, tagView);
            }
            aVar.mo36897a(i);
            a2.setClickable(false);
            tagView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.widget.flowlayout.TagFlowLayout.View$OnClickListenerC30231 */

                public final void onClick(View view) {
                    TagFlowLayout.m7063a(TagFlowLayout.this, tagView, i);
                    if (TagFlowLayout.this.f6622h != null) {
                        TagFlowLayout.this.f6622h.mo36770a(tagView, i);
                    }
                }
            });
        }
        this.f6620f.addAll(a);
    }

    /* renamed from: b */
    public static void m7065b(int i, TagView tagView) {
        tagView.setChecked(false);
        tagView.getChildAt(0);
        String str = "unSelected " + i;
    }

    @Override // com.qiyukf.unicorn.widget.flowlayout.AbstractC3026a.AbstractC3027a
    /* renamed from: a */
    public final void mo36887a() {
        this.f6620f.clear();
        m7064b();
    }

    /* renamed from: a */
    public final void mo36888a(AbstractC3025b bVar) {
        this.f6622h = bVar;
    }

    /* renamed from: a */
    public final void mo36889a(AbstractC3026a aVar) {
        this.f6618d = aVar;
        aVar.mo36899a(this);
        this.f6620f.clear();
        m7064b();
    }

    @Override // com.qiyukf.unicorn.widget.flowlayout.FlowLayout
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            TagView tagView = (TagView) getChildAt(i3);
            if (tagView.getVisibility() != 8 && tagView.getChildAt(0).getVisibility() == 8) {
                tagView.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f6620f.add(Integer.valueOf(parseInt));
                    TagView tagView = (TagView) getChildAt(parseInt);
                    if (tagView != null) {
                        m7062a(parseInt, tagView);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.f6620f.size() > 0) {
            for (Integer num : this.f6620f) {
                str = str + num.intValue() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }
}
