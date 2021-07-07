package com.qiyukf.unicorn.widget.flowlayout;

import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.widget.flowlayout.a */
public abstract class AbstractC3026a<T> {

    /* renamed from: a */
    public List<T> f6628a;

    /* renamed from: b */
    public AbstractC3027a f6629b;
    @Deprecated

    /* renamed from: c */
    public HashSet<Integer> f6630c = new HashSet<>();

    /* renamed from: com.qiyukf.unicorn.widget.flowlayout.a$a */
    public interface AbstractC3027a {
        /* renamed from: a */
        void mo36887a();
    }

    public AbstractC3026a(List<T> list) {
        this.f6628a = list;
    }

    /* renamed from: a */
    public abstract View mo36769a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public final T mo36897a(int i) {
        return this.f6628a.get(i);
    }

    @Deprecated
    /* renamed from: a */
    public final HashSet<Integer> mo36898a() {
        return this.f6630c;
    }

    /* renamed from: a */
    public final void mo36899a(AbstractC3027a aVar) {
        this.f6629b = aVar;
    }

    /* renamed from: b */
    public final int mo36900b() {
        List<T> list = this.f6628a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public final void mo36901c() {
        AbstractC3027a aVar = this.f6629b;
        if (aVar != null) {
            aVar.mo36887a();
        }
    }
}
