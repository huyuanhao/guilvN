package com.p118pd.sdk;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.ooOoo00O  reason: case insensitive filesystem */
public class C9068ooOoo00O implements AbstractC9091ooOooo0o {
    public WeakHashMap<View, ArrayList<C9063ooOoOooo>> OooO00o = new WeakHashMap<>();

    public <T extends C9063ooOoOooo> T OooO00o(View view, T t) {
        ArrayList<C9063ooOoOooo> arrayList = this.OooO00o.get(view);
        if (arrayList == null) {
            ArrayList<C9063ooOoOooo> arrayList2 = new ArrayList<>(1);
            arrayList2.add(t);
            this.OooO00o.put(view, arrayList2);
        } else {
            arrayList.add(t);
        }
        return t;
    }

    @Override // com.p118pd.sdk.AbstractC9091ooOooo0o
    public ArrayList<C9063ooOoOooo> OooO00o(View view) {
        return this.OooO00o.get(view);
    }
}
