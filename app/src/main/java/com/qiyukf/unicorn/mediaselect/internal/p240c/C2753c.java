package com.qiyukf.unicorn.mediaselect.internal.p240c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2755b;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.c.c */
public final class C2753c {

    /* renamed from: a */
    public final Context f5714a;

    /* renamed from: b */
    public Set<C2743d> f5715b;

    /* renamed from: c */
    public int f5716c = 0;

    public C2753c(Context context) {
        this.f5714a = context;
    }

    /* renamed from: f */
    private boolean m6362f(C2743d dVar) {
        int i;
        if (!C2745e.m6339a().f5675b) {
            return false;
        }
        if (!EnumC2731b.m6306a(dVar.f5670b) || !((i = this.f5716c) == 2 || i == 3)) {
            if (!EnumC2731b.m6308b(dVar.f5670b)) {
                return false;
            }
            int i2 = this.f5716c;
            return i2 == 1 || i2 == 3;
        }
    }

    /* renamed from: g */
    private int m6363g() {
        C2745e a = C2745e.m6339a();
        int i = a.f5680g;
        if (i > 0) {
            return i;
        }
        int i2 = this.f5716c;
        return i2 == 1 ? a.f5681h : i2 == 2 ? a.f5682i : i;
    }

    /* renamed from: a */
    public final Bundle mo36537a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f5715b));
        bundle.putInt("state_collection_type", this.f5716c);
        return bundle;
    }

    /* renamed from: a */
    public final void mo36538a(Bundle bundle) {
        if (bundle == null) {
            this.f5715b = new LinkedHashSet();
            return;
        }
        this.f5715b = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f5716c = bundle.getInt("state_collection_type", 0);
    }

    /* renamed from: a */
    public final void mo36539a(ArrayList<C2743d> arrayList, int i) {
        if (arrayList.size() == 0) {
            i = 0;
        }
        this.f5716c = i;
        this.f5715b.clear();
        this.f5715b.addAll(arrayList);
    }

    /* renamed from: a */
    public final boolean mo36540a(C2743d dVar) {
        if (!m6362f(dVar)) {
            boolean add = this.f5715b.add(dVar);
            if (add) {
                int i = this.f5716c;
                if (i != 0) {
                    if (i == 1) {
                    }
                    this.f5716c = 3;
                } else if (EnumC2731b.m6306a(dVar.f5670b)) {
                    this.f5716c = 1;
                } else if (EnumC2731b.m6308b(dVar.f5670b)) {
                    this.f5716c = 2;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    /* renamed from: b */
    public final List<C2743d> mo36541b() {
        return new ArrayList(this.f5715b);
    }

    /* renamed from: b */
    public final void mo36542b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f5715b));
        bundle.putInt("state_collection_type", this.f5716c);
    }

    /* renamed from: b */
    public final boolean mo36543b(C2743d dVar) {
        boolean remove = this.f5715b.remove(dVar);
        if (remove) {
            boolean z = false;
            if (this.f5715b.size() == 0) {
                this.f5716c = 0;
            } else if (this.f5716c == 3) {
                boolean z2 = false;
                for (C2743d dVar2 : this.f5715b) {
                    if (EnumC2731b.m6306a(dVar2.f5670b) && !z) {
                        z = true;
                    }
                    if (EnumC2731b.m6308b(dVar2.f5670b) && !z2) {
                        z2 = true;
                    }
                }
                if (z && z2) {
                    this.f5716c = 3;
                } else if (z) {
                    this.f5716c = 1;
                } else if (z2) {
                    this.f5716c = 2;
                }
            }
        }
        return remove;
    }

    /* renamed from: c */
    public final List<Uri> mo36544c() {
        ArrayList arrayList = new ArrayList();
        for (C2743d dVar : this.f5715b) {
            arrayList.add(dVar.f5671c);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo36545c(C2743d dVar) {
        return this.f5715b.contains(dVar);
    }

    /* renamed from: d */
    public final C2742c mo36546d(C2743d dVar) {
        String str;
        if (!mo36549e()) {
            return m6362f(dVar) ? new C2742c(this.f5714a.getString(C2364R.string.ysf_error_type_conflict)) : C2756c.m6386a(this.f5714a, dVar);
        }
        int g = m6363g();
        try {
            str = this.f5714a.getResources().getQuantityString(C2364R.plurals.error_over_count, g, Integer.valueOf(g));
        } catch (Resources.NotFoundException unused) {
            str = this.f5714a.getString(C2364R.string.ysf_error_over_count, Integer.valueOf(g));
        } catch (NoClassDefFoundError unused2) {
            str = this.f5714a.getString(C2364R.string.ysf_error_over_count, Integer.valueOf(g));
        }
        return new C2742c(str);
    }

    /* renamed from: d */
    public final List<String> mo36547d() {
        ArrayList arrayList = new ArrayList();
        for (C2743d dVar : this.f5715b) {
            arrayList.add(C2755b.m6382a(this.f5714a, dVar.f5671c));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final int mo36548e(C2743d dVar) {
        int indexOf = new ArrayList(this.f5715b).indexOf(dVar);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    /* renamed from: e */
    public final boolean mo36549e() {
        return this.f5715b.size() == m6363g();
    }

    /* renamed from: f */
    public final int mo36550f() {
        return this.f5715b.size();
    }
}
