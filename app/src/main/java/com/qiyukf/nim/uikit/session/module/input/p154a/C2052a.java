package com.qiyukf.nim.uikit.session.module.input.p154a;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.qiyukf.nim.uikit.common.p145a.C1880c;
import com.qiyukf.nim.uikit.common.p145a.C1881d;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p212e.C2477l;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2571g;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2609e;
import com.qiyukf.unicorn.p229h.C2667c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.a.a */
public final class C2052a {

    /* renamed from: a */
    public ListView f4080a;

    /* renamed from: b */
    public List<C2571g.C2572a> f4081b = new ArrayList();

    /* renamed from: c */
    public C1881d<C2571g.C2572a> f4082c;

    /* renamed from: d */
    public String f4083d;

    /* renamed from: e */
    public String f4084e;

    /* renamed from: f */
    public String f4085f;

    /* renamed from: g */
    public Handler f4086g;

    /* renamed from: h */
    public long f4087h = 0;

    /* renamed from: i */
    public Runnable f4088i = new Runnable() {
        /* class com.qiyukf.nim.uikit.session.module.input.p154a.C2052a.RunnableC20542 */

        public final void run() {
            if (!TextUtils.isEmpty(C2052a.this.f4084e) && C2052a.this.f4084e.length() <= 10) {
                C2052a aVar = C2052a.this;
                C2052a.m4125b(aVar, aVar.f4084e);
                C2052a aVar2 = C2052a.this;
                aVar2.f4083d = aVar2.f4084e;
                C2052a.this.f4087h = System.currentTimeMillis();
            }
        }
    };

    /* renamed from: com.qiyukf.nim.uikit.session.module.input.a.a$a */
    public interface AbstractC2055a {
        /* renamed from: a */
        void mo34541a(C2571g.C2572a aVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m4125b(C2052a aVar, String str) {
        C2609e eVar = new C2609e();
        eVar.mo36178a(C2452d.m5375g().mo36353e(aVar.f4085f));
        eVar.mo36179a(str);
        C2667c.m6115a((AbstractC2597e) eVar, aVar.f4085f, false);
    }

    /* renamed from: b */
    private void m4126b(String str) {
        ListView listView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f4081b.clear();
        } else {
            Iterator<C2571g.C2572a> it = this.f4081b.iterator();
            while (it.hasNext()) {
                C2571g.C2572a next = it.next();
                if (!next.mo36049a().contains(str) || next.mo36049a().equals(str)) {
                    it.remove();
                }
            }
        }
        this.f4082c.notifyDataSetChanged();
        if (this.f4081b.size() == 0) {
            listView = this.f4080a;
            i = 8;
        } else {
            listView = this.f4080a;
            i = 0;
        }
        listView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo34536a(Context context, View view, String str, final AbstractC2055a aVar) {
        this.f4085f = str;
        this.f4080a = (ListView) view.findViewById(C2364R.C2367id.ysf_quick_reply_list_view);
        C1881d<C2571g.C2572a> dVar = new C1881d<>(context, this.f4081b, new C1880c(C2056b.class));
        this.f4082c = dVar;
        this.f4080a.setAdapter((ListAdapter) dVar);
        this.f4080a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.qiyukf.nim.uikit.session.module.input.p154a.C2052a.C20531 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C2571g.C2572a aVar;
                if (aVar != null && (aVar = (C2571g.C2572a) C2052a.this.f4082c.getItem(i)) != null) {
                    aVar.mo34541a(aVar);
                    C2052a.this.f4083d = aVar.mo36049a();
                }
            }
        });
        this.f4086g = new Handler(context.getMainLooper());
    }

    /* renamed from: a */
    public final void mo34537a(String str) {
        C2477l l = C2452d.m5375g().mo36362l(this.f4085f);
        if (l == null || !l.mo35726a()) {
            List<C2571g.C2572a> list = this.f4081b;
            if (list != null && list.size() > 0) {
                this.f4081b.clear();
                this.f4082c.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || str.length() > 10) {
            str = "";
        }
        if (!str.equals(this.f4083d) || this.f4081b.size() == 0) {
            this.f4086g.removeCallbacks(this.f4088i);
            long currentTimeMillis = System.currentTimeMillis() - this.f4087h;
            long b = (long) (l.mo35727b() * 1000.0f);
            this.f4086g.postDelayed(this.f4088i, Math.max(Math.min(b - currentTimeMillis, b), 50L));
        }
        this.f4084e = str;
        this.f4082c.mo34143a(str);
        m4126b(this.f4084e);
    }

    /* renamed from: a */
    public final void mo34538a(List<C2571g.C2572a> list) {
        this.f4081b.clear();
        this.f4081b.addAll(list);
        m4126b(this.f4084e);
    }
}
