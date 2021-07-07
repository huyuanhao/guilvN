package com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7176o00o0oO;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment.PreviewItemFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.d */
public final class C2766d extends AbstractC7176o00o0oO {

    /* renamed from: a */
    public ArrayList<C2743d> f5737a = new ArrayList<>();

    /* renamed from: b */
    public AbstractC2767a f5738b = null;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.d$a */
    public interface AbstractC2767a {
    }

    public C2766d(AbstractC7175o00o0o0o o00o0o0o) {
        super(o00o0o0o);
    }

    /* renamed from: a */
    public final C2743d mo36573a(int i) {
        return this.f5737a.get(i);
    }

    /* renamed from: a */
    public final void mo36574a(List<C2743d> list) {
        this.f5737a.addAll(list);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getCount() {
        return this.f5737a.size();
    }

    @Override // com.p118pd.sdk.AbstractC7176o00o0oO
    public final Fragment getItem(int i) {
        return PreviewItemFragment.newInstance(this.f5737a.get(i));
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O, com.p118pd.sdk.AbstractC7176o00o0oO
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
