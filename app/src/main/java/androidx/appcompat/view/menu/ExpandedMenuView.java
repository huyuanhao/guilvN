package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C6970o0000oO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ExpandedMenuView extends ListView implements C5965Oooo00o.OooO0O0, AbstractC5976OoooO00, AdapterView.OnItemClickListener {
    public static final int[] OooO00o = {16842964, 16843049};

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f13687OooO00o;
    public int o00oO0O;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00
    public void OooO00o(C5965Oooo00o oooo00o) {
        this.f13687OooO00o = oooo00o;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00
    public int getWindowAnimations() {
        return this.o00oO0O;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO00o((C5967Oooo0OO) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, OooO00o, i, 0);
        if (OooO00o2.m18168OooO00o(0)) {
            setBackgroundDrawable(OooO00o2.m18162OooO00o(0));
        }
        if (OooO00o2.m18168OooO00o(1)) {
            setDivider(OooO00o2.m18162OooO00o(1));
        }
        OooO00o2.m18167OooO00o();
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO0O0
    public boolean OooO00o(C5967Oooo0OO oooo0OO) {
        return this.f13687OooO00o.OooO00o(oooo0OO, 0);
    }
}
