package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o0Oo00O  reason: case insensitive filesystem */
public class C7449o0Oo00O {
    public final ArrayList<Object> OooO00o;

    public C7449o0Oo00O(int i) {
        this.OooO00o = new ArrayList<>(i);
    }

    public int OooO00o() {
        return this.OooO00o.size();
    }

    public void OooO0O0(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.OooO00o;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    for (Object obj2 : objArr) {
                        this.OooO00o.add(obj2);
                    }
                }
            } else if (obj instanceof Collection) {
                this.OooO00o.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj3 : (Iterable) obj) {
                    this.OooO00o.add(obj3);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.OooO00o.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public void OooO00o(Object obj) {
        this.OooO00o.add(obj);
    }

    public Object[] OooO00o(Object[] objArr) {
        return this.OooO00o.toArray(objArr);
    }
}
