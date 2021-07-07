package com.qiyukf.nim.uikit.session.module.input;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.b */
public final class C2057b extends AbstractC7314o0O0Oo0O {

    /* renamed from: a */
    public final int f4093a = 8;

    /* renamed from: b */
    public final Context f4094b;

    /* renamed from: c */
    public final List<BaseAction> f4095c;

    /* renamed from: d */
    public final ViewPager f4096d;

    /* renamed from: e */
    public final int f4097e;

    public C2057b(ViewPager viewPager, List<BaseAction> list) {
        this.f4094b = viewPager.getContext();
        this.f4095c = new ArrayList(list);
        this.f4096d = viewPager;
        this.f4097e = ((list.size() + 8) - 1) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getCount() {
        return this.f4097e;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2 = (i + 1) << 3;
        if (i2 > this.f4095c.size()) {
            i2 = this.f4095c.size();
        }
        List<BaseAction> subList = this.f4095c.subList(i << 3, i2);
        GridView gridView = new GridView(this.f4094b);
        gridView.setAdapter((ListAdapter) new C2050a(this.f4094b, subList));
        int size = this.f4095c.size();
        gridView.setNumColumns(4);
        viewGroup.post(size > 4 ? new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2057b.RunnableC20581 */

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C2057b.this.f4096d.getLayoutParams();
                layoutParams.height = C2057b.this.f4094b.getResources().getDimensionPixelOffset(C2364R.dimen.ysf_message_action_list_height_modify);
                C2057b.this.f4096d.setLayoutParams(layoutParams);
            }
        } : new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2057b.RunnableC20592 */

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C2057b.this.f4096d.getLayoutParams();
                layoutParams.height = C2057b.this.f4094b.getResources().getDimensionPixelOffset(C2364R.dimen.ysf_message_action_list_height) / 2;
                C2057b.this.f4096d.setLayoutParams(layoutParams);
            }
        });
        gridView.setSelector(17170445);
        gridView.setHorizontalSpacing(0);
        gridView.setVerticalSpacing(0);
        gridView.setGravity(17);
        gridView.setTag(Integer.valueOf(i));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2057b.C20603 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ((BaseAction) C2057b.this.f4095c.get((((Integer) adapterView.getTag()).intValue() << 3) + i)).onClick();
            }
        });
        viewGroup.addView(gridView);
        return gridView;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
