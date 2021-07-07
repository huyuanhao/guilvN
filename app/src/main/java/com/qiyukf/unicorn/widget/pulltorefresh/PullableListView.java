package com.qiyukf.unicorn.widget.pulltorefresh;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ListView;

public class PullableListView extends ListView implements AbstractC3034a {

    /* renamed from: a */
    public boolean f6667a = false;

    /* renamed from: b */
    public boolean f6668b = false;

    public PullableListView(Context context) {
        super(context);
    }

    public PullableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PullableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    private boolean m7103b(int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            return canScrollVertically(i);
        }
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (computeVerticalScrollRange == 0) {
            return false;
        }
        return i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange - 1;
    }

    @Override // com.qiyukf.unicorn.widget.pulltorefresh.AbstractC3034a
    /* renamed from: a */
    public final void mo36916a(int i) {
        smoothScrollBy(i, 0);
    }

    /* renamed from: a */
    public final void mo36917a(boolean z) {
        this.f6667a = false;
        this.f6668b = z;
    }

    @Override // com.qiyukf.unicorn.widget.pulltorefresh.AbstractC3034a
    /* renamed from: a */
    public final boolean mo36918a() {
        return this.f6667a && !m7103b(-1);
    }

    @Override // com.qiyukf.unicorn.widget.pulltorefresh.AbstractC3034a
    /* renamed from: b */
    public final boolean mo36919b() {
        return this.f6668b && !m7103b(1);
    }
}
