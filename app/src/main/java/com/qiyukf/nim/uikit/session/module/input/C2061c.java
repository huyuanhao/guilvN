package com.qiyukf.nim.uikit.session.module.input;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.c */
public final class C2061c {
    /* renamed from: a */
    public static void m4134a(View view, List<BaseAction> list) {
        ViewPager viewPager = (ViewPager) view.findViewById(C2364R.C2367id.viewPager);
        final ViewGroup viewGroup = (ViewGroup) view.findViewById(C2364R.C2367id.actions_page_indicator);
        C2057b bVar = new C2057b(viewPager, list);
        viewPager.setAdapter(bVar);
        final int count = bVar.getCount();
        viewPager.setOnPageChangeListener(new ViewPager.OooO() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2061c.C20621 */

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageSelected(int i) {
                C2061c.m4136b(viewGroup, count, i);
            }
        });
        m4136b(viewGroup, count, 0);
        bVar.notifyDataSetChanged();
    }

    /* renamed from: b */
    public static void m4136b(ViewGroup viewGroup, int i, int i2) {
        viewGroup.removeAllViews();
        if (i > 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i3 = 0;
            layoutParams.setMargins(C1862c.m3540a(2.0f), 0, C1862c.m3540a(2.0f), 0);
            while (i3 < i) {
                ImageView imageView = new ImageView(viewGroup.getContext());
                imageView.setId(i3);
                imageView.setBackgroundResource(i3 == i2 ? C2364R.C2366drawable.ysf_moon_page_selected : C2364R.C2366drawable.ysf_moon_page_unselected);
                viewGroup.addView(imageView, layoutParams);
                i3++;
            }
        }
    }
}
