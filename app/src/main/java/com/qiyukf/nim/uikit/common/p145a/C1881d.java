package com.qiyukf.nim.uikit.common.p145a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.qiyukf.basesdk.p119a.C1709a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.qiyukf.nim.uikit.common.a.d */
public class C1881d<T> extends BaseAdapter implements AbstractC1879b {

    /* renamed from: a */
    public final Context f3460a;

    /* renamed from: b */
    public final List<T> f3461b;

    /* renamed from: c */
    public final AbstractC1882e f3462c;

    /* renamed from: d */
    public final LayoutInflater f3463d;

    /* renamed from: e */
    public final Map<Class<?>, Integer> f3464e = new HashMap(getViewTypeCount());

    /* renamed from: f */
    public Object f3465f;

    /* renamed from: g */
    public boolean f3466g;

    /* renamed from: h */
    public Set<AbstractC1878a> f3467h = new HashSet();

    public C1881d(Context context, List<T> list, AbstractC1882e eVar) {
        this.f3460a = context;
        this.f3461b = list;
        this.f3462c = eVar;
        this.f3463d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    private View m3587a(int i, View view) {
        if (view == null) {
            view = mo36620b(i);
        }
        AbstractC1883f fVar = (AbstractC1883f) view.getTag();
        fVar.setPosition(i);
        try {
            fVar.refresh(getItem(i));
            mo34142a(i);
        } catch (RuntimeException e) {
            C1709a.m3016c("TAdapter", "refresh viewholder error. " + e);
        }
        if (fVar instanceof AbstractC1878a) {
            this.f3467h.add(fVar);
        }
        return view;
    }

    /* renamed from: b */
    private View mo36620b(int i) {
        View view = null;
        try {
            AbstractC1883f fVar = (AbstractC1883f) this.f3462c.mo34139a(i).newInstance();
            fVar.setAdapter(this);
            fVar.setContext(this.f3460a);
            view = fVar.getView(this.f3463d);
            view.setTag(fVar);
            return view;
        } catch (Exception e) {
            C1709a.m3015b("TAdapter", " viewAtPosition is error", e);
            return view;
        }
    }

    /* renamed from: a */
    public final List<T> mo34141a() {
        return this.f3461b;
    }

    /* renamed from: a */
    public void mo34142a(int i) {
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1879b
    /* renamed from: a */
    public final void mo34137a(View view) {
        AbstractC1883f fVar;
        if (view != null && (fVar = (AbstractC1883f) view.getTag()) != null) {
            fVar.reclaim();
            this.f3467h.remove(fVar);
        }
    }

    /* renamed from: a */
    public final void mo34143a(Object obj) {
        this.f3465f = obj;
    }

    /* renamed from: b */
    public final boolean mo34144b() {
        return this.f3466g;
    }

    /* renamed from: c */
    public final Object mo34145c() {
        return this.f3465f;
    }

    public int getCount() {
        List<T> list = this.f3461b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getItem(int i) {
        if (i < getCount()) {
            return this.f3461b.get(i);
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (getViewTypeCount() == 1) {
            return 0;
        }
        Class<? extends AbstractC1883f> a = this.f3462c.mo34139a(i);
        if (this.f3464e.containsKey(a)) {
            return this.f3464e.get(a).intValue();
        }
        int size = this.f3464e.size();
        if (size >= getViewTypeCount()) {
            return 0;
        }
        this.f3464e.put(a, Integer.valueOf(size));
        return size;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return m3587a(i, view);
    }

    public int getViewTypeCount() {
        return this.f3462c.mo34138a();
    }

    public boolean isEnabled(int i) {
        return this.f3462c.mo34140b();
    }
}
