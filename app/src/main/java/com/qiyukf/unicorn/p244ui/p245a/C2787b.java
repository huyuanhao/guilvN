package com.qiyukf.unicorn.p244ui.p245a;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1882e;
import com.qiyukf.nim.uikit.common.p145a.C1881d;
import com.qiyukf.unicorn.C2364R;
import java.util.List;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.ui.a.b */
public class C2787b extends C1881d<String> {

    /* renamed from: b */
    public int f5832b;

    /* renamed from: c */
    public String f5833c;

    /* renamed from: d */
    public List<String> f5834d;

    /* renamed from: e */
    public Set<String> f5835e;

    public C2787b(Context context, List<String> list, AbstractC1882e eVar, int i, String str, Set<String> set) {
        super(context, list, eVar);
        this.f5832b = i;
        this.f5833c = str;
        this.f5834d = list;
        this.f5835e = set;
    }

    /* renamed from: b */
    public final boolean mo36620b(int i) {
        if (i == 0 && this.f5832b == 1 && TextUtils.isEmpty(this.f5833c)) {
            return true;
        }
        if (this.f3460a.getString(C2364R.string.ysf_leave_msg_menu_item_all).equals(this.f5834d.get(i))) {
            return false;
        }
        return this.f5835e.contains(this.f5834d.get(i));
    }
}
