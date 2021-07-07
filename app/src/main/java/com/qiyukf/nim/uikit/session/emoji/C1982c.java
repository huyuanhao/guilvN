package com.qiyukf.nim.uikit.session.emoji;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p212e.C2469e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.c */
public final class C1982c {

    /* renamed from: a */
    public AdapterView.OnItemClickListener f3883a = new AdapterView.OnItemClickListener() {
        /* class com.qiyukf.nim.uikit.session.emoji.C1982c.C19842 */

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int currentItem = C1982c.this.f3885c.getCurrentItem();
            if (!(C1982c.this.f3893k == null || C1982c.this.f3894l == null)) {
                C1982c.this.m3925b((C1982c) currentItem);
                currentItem = C1982c.this.f3895m[1];
            }
            int i2 = (currentItem * 27) + i;
            if (C1982c.this.f3889g != null) {
                int a = C1978b.m3911a();
                if (i == 27 || i2 >= a) {
                    C1982c.this.f3889g.mo34422a("/DEL");
                    return;
                }
                String a2 = C1978b.m3914a((int) j);
                if (!TextUtils.isEmpty(a2)) {
                    C1982c.this.f3889g.mo34422a(a2);
                }
            }
        }
    };

    /* renamed from: b */
    public AdapterView.OnItemClickListener f3884b = new AdapterView.OnItemClickListener() {
        /* class com.qiyukf.nim.uikit.session.emoji.C1982c.C19853 */

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1982c.this.m3925b((C1982c) C1982c.this.f3885c.getCurrentItem());
            int i2 = C1982c.this.f3895m[0];
            int i3 = C1982c.this.f3895m[1];
            C1994h hVar = (C1994h) C1982c.this.f3893k.get(i2);
            int i4 = (i3 * 27) + i;
            if (i4 > hVar.mo34433a().size()) {
                C1709a.m3011a("sticker", "index " + i4 + " larger than size " + hVar.mo34433a().size());
            } else if (C1982c.this.f3889g != null) {
                List<C2469e.C2470a> a = hVar.mo34433a();
                int size = a.size();
                if (i == 27 || i4 >= size) {
                    C1982c.this.f3889g.mo34422a("/DEL_CUSTOM");
                    return;
                }
                String a2 = a.get(i4).mo35708a();
                if (a2.indexOf(C9058ooOoOoOO.OooOO0) > 0) {
                    a2 = a2.substring(0, a2.indexOf(C9058ooOoOoOO.OooOO0));
                }
                String str = "[:" + a2 + "]";
                if (!TextUtils.isEmpty(str)) {
                    C1982c.this.f3889g.mo34422a(str);
                }
            }
        }
    };

    /* renamed from: c */
    public ViewPager f3885c;

    /* renamed from: d */
    public LinearLayout f3886d;

    /* renamed from: e */
    public int f3887e;

    /* renamed from: f */
    public Context f3888f;

    /* renamed from: g */
    public AbstractC1989e f3889g;

    /* renamed from: h */
    public C1987a f3890h = new C1987a(this, (byte) 0);

    /* renamed from: i */
    public int f3891i;

    /* renamed from: j */
    public boolean f3892j = false;

    /* renamed from: k */
    public List<C1994h> f3893k;

    /* renamed from: l */
    public List<Integer> f3894l;

    /* renamed from: m */
    public int[] f3895m = new int[20];

    /* renamed from: n */
    public AbstractC1988d f3896n;

    /* renamed from: o */
    public AdapterView.OnItemClickListener f3897o = new AdapterView.OnItemClickListener() {
        /* class com.qiyukf.nim.uikit.session.emoji.C1982c.C19864 */

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1982c.this.m3925b((C1982c) C1982c.this.f3885c.getCurrentItem());
            int i2 = C1982c.this.f3895m[0];
            int i3 = C1982c.this.f3895m[1];
            C1994h hVar = (C1994h) C1982c.this.f3893k.get(i2);
            int i4 = i + (i3 << 3);
            if (i4 >= hVar.mo34433a().size()) {
                C1709a.m3011a("sticker", "index " + i4 + " larger than size " + hVar.mo34433a().size());
            } else if (C1982c.this.f3889g != null) {
                C2469e.C2470a aVar = hVar.mo34433a().get(i4);
                C1982c.this.f3889g.mo34423a(aVar.mo35708a(), aVar.mo35709b());
            }
        }
    };

    /* renamed from: com.qiyukf.nim.uikit.session.emoji.c$a */
    public class C1987a extends AbstractC7314o0O0Oo0O {
        public C1987a() {
        }

        public /* synthetic */ C1987a(C1982c cVar, byte b) {
            this();
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getCount() {
            if (C1982c.this.f3887e == 0) {
                return 1;
            }
            return C1982c.this.f3887e;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            int i2;
            C1994h hVar;
            GridView gridView;
            if (C1982c.this.f3893k == null || C1982c.this.f3893k.size() <= 0 || C1982c.this.f3894l == null || C1982c.this.f3894l.size() <= 0) {
                hVar = null;
                i2 = 0;
            } else {
                C1982c.this.m3925b((C1982c) i);
                hVar = (C1994h) C1982c.this.f3893k.get(C1982c.this.f3895m[0]);
                i2 = C1982c.this.f3895m[1];
            }
            if (hVar == null) {
                C1982c.this.f3886d.setVisibility(0);
                GridView gridView2 = new GridView(C1982c.this.f3888f);
                gridView2.setOnItemClickListener(C1982c.this.f3883a);
                gridView2.setAdapter((ListAdapter) new C1977a(C1982c.this.f3888f, i * 27));
                gridView2.setNumColumns(7);
                gridView2.setHorizontalSpacing(5);
                gridView2.setVerticalSpacing(5);
                gridView2.setGravity(17);
                gridView2.setSelector(C2364R.C2366drawable.ysf_emoji_item_selector);
                viewGroup.addView(gridView2);
                return gridView2;
            }
            if (hVar.mo34436d() == 2) {
                C1982c.this.f3886d.setVisibility(0);
                gridView = new GridView(C1982c.this.f3888f);
                gridView.setOnItemClickListener(C1982c.this.f3884b);
                gridView.setAdapter((ListAdapter) new C1977a(C1982c.this.f3888f, i2 * 27, hVar));
                gridView.setNumColumns(7);
                gridView.setHorizontalSpacing(5);
                gridView.setVerticalSpacing(5);
            } else {
                C1982c.this.f3886d.setVisibility(0);
                gridView = new GridView(C1982c.this.f3888f);
                gridView.setPadding(10, 0, 10, 0);
                gridView.setOnItemClickListener(C1982c.this.f3897o);
                gridView.setAdapter((ListAdapter) new C1992g(C1982c.this.f3888f, hVar, i2 << 3));
                gridView.setNumColumns(4);
                gridView.setHorizontalSpacing(5);
            }
            gridView.setGravity(17);
            gridView.setSelector(C2364R.C2366drawable.ysf_emoji_item_selector);
            viewGroup.addView(gridView);
            return gridView;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public C1982c(Context context, AbstractC1989e eVar, ViewPager viewPager, LinearLayout linearLayout) {
        this.f3888f = context.getApplicationContext();
        this.f3889g = eVar;
        this.f3886d = linearLayout;
        this.f3885c = viewPager;
        viewPager.setOnPageChangeListener(new ViewPager.OooO() {
            /* class com.qiyukf.nim.uikit.session.emoji.C1982c.C19831 */

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageSelected(int i) {
                if (C1982c.this.f3893k != null) {
                    C1982c.this.m3926c((C1982c) i);
                    if (C1982c.this.f3896n != null) {
                        C1982c.this.f3896n.mo34396a(C1982c.this.f3895m[0]);
                        return;
                    }
                    return;
                }
                C1982c.m3924b(C1982c.this, i);
            }
        });
        this.f3885c.setAdapter(this.f3890h);
        this.f3885c.setOffscreenPageLimit(1);
    }

    /* renamed from: a */
    public static int m3919a(C1994h hVar) {
        int size;
        float size2;
        float f = 27.0f;
        if (hVar == null) {
            size = C1978b.m3911a();
        } else if (!hVar.mo34434b()) {
            return 1;
        } else {
            List<C2469e.C2470a> a = hVar.mo34433a();
            if (hVar.mo34436d() == 1) {
                size2 = (float) a.size();
                f = 8.0f;
                return (int) Math.ceil((double) (size2 / f));
            }
            size = a.size();
        }
        size2 = (float) size;
        return (int) Math.ceil((double) (size2 / f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3921a(int r9, int r10) {
        /*
            r8 = this;
            android.widget.LinearLayout r0 = r8.f3886d
            int r0 = r0.getChildCount()
            int r1 = java.lang.Math.max(r0, r10)
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x005e
            if (r10 > r0) goto L_0x001e
            if (r3 < r10) goto L_0x0020
            android.widget.LinearLayout r4 = r8.f3886d
            android.view.View r4 = r4.getChildAt(r3)
            r5 = 8
            r4.setVisibility(r5)
            goto L_0x005b
        L_0x001e:
            if (r3 >= r0) goto L_0x0029
        L_0x0020:
            android.widget.LinearLayout r4 = r8.f3886d
            android.view.View r4 = r4.getChildAt(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            goto L_0x004d
        L_0x0029:
            android.widget.ImageView r4 = new android.widget.ImageView
            android.content.Context r5 = r8.f3888f
            r4.<init>(r5)
            int r5 = com.qiyukf.unicorn.C2364R.C2366drawable.ysf_view_pager_indicator_selector
            r4.setBackgroundResource(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r5.<init>(r6, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = com.qiyukf.basesdk.p138c.p143d.C1862c.m3540a(r6)
            int r6 = com.qiyukf.basesdk.p138c.p143d.C1862c.m3540a(r6)
            r5.setMargins(r7, r2, r6, r2)
            android.widget.LinearLayout r6 = r8.f3886d
            r6.addView(r4, r5)
        L_0x004d:
            r4.setId(r3)
            if (r3 != r9) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            r4.setSelected(r5)
            r4.setVisibility(r2)
        L_0x005b:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.emoji.C1982c.m3921a(int, int):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m3924b(C1982c cVar, int i) {
        cVar.m3921a(i, cVar.f3887e);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private int[] m3925b(int i) {
        if (this.f3893k == null || this.f3894l == null) {
            return this.f3895m;
        }
        int i2 = this.f3891i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= this.f3894l.size()) {
                break;
            }
            int intValue = this.f3894l.get(i3).intValue() + i4;
            if (i < intValue) {
                i2 = i3;
                break;
            }
            i3++;
            i4 = intValue;
        }
        int[] iArr = this.f3895m;
        iArr[0] = i2;
        iArr[1] = i - i4;
        return iArr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m3926c(int i) {
        m3925b(i);
        int[] iArr = this.f3895m;
        m3921a(iArr[1], this.f3894l.get(iArr[0]).intValue());
    }

    /* renamed from: a */
    public final void mo34416a() {
        this.f3890h.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo34417a(int i) {
        if (this.f3892j && m3925b(this.f3885c.getCurrentItem()) != null) {
            int[] iArr = this.f3895m;
            if (iArr[0] == i && iArr[1] == 0) {
                return;
            }
        }
        this.f3891i = i;
        C1995i a = C1995i.m3963a();
        if (!this.f3892j || a.mo34444e()) {
            if (this.f3893k == null) {
                this.f3893k = new ArrayList();
            }
            if (this.f3894l == null) {
                this.f3894l = new ArrayList();
            }
            this.f3893k.clear();
            this.f3894l.clear();
            if (a.mo34443d()) {
                this.f3893k.add(null);
                this.f3894l.add(Integer.valueOf(m3919a((C1994h) null)));
            }
            List<C1994h> c = a.mo34442c();
            this.f3893k.addAll(c);
            for (C1994h hVar : c) {
                this.f3894l.add(Integer.valueOf(m3919a(hVar)));
            }
            this.f3887e = 0;
            for (Integer num : this.f3894l) {
                this.f3887e += num.intValue();
            }
            a.mo34445f();
            this.f3892j = true;
        }
        this.f3890h.notifyDataSetChanged();
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f3894l.size() && i2 != this.f3891i) {
            i3 += this.f3894l.get(i2).intValue();
            i2++;
        }
        m3926c(i3);
        this.f3885c.setCurrentItem(i3, false);
    }

    /* renamed from: a */
    public final void mo34418a(AbstractC1988d dVar) {
        this.f3896n = dVar;
    }
}
