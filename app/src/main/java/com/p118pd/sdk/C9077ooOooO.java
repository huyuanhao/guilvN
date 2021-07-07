package com.p118pd.sdk;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.pd.sdk.ooOooO  reason: case insensitive filesystem */
public class C9077ooOooO implements AbstractC9067ooOoo000 {
    public static final String OooO00o = "waitFor";
    public static final String OooO0O0 = "simultaneousHandlers";

    /* renamed from: OooO00o  reason: collision with other field name */
    public SparseArray<int[]> f22428OooO00o = new SparseArray<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public SparseArray<int[]> f22429OooO0O0 = new SparseArray<>();

    public void OooO00o(int i) {
        this.f22428OooO00o.remove(i);
        this.f22429OooO0O0.remove(i);
    }

    @Override // com.p118pd.sdk.AbstractC9067ooOoo000
    public boolean OooO0O0(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC9067ooOoo000
    public boolean OooO0OO(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC9067ooOoo000
    public boolean OooO0Oo(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        int[] iArr = this.f22429OooO0O0.get(oooooooo.m20740OooO0OO());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == oooooooo2.m20740OooO0OO()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] OooO00o(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public void OooO00o(C9063ooOoOooo oooooooo, ReadableMap readableMap) {
        oooooooo.OooO00o(this);
        if (readableMap.hasKey(OooO00o)) {
            this.f22428OooO00o.put(oooooooo.m20740OooO0OO(), OooO00o(readableMap, OooO00o));
        }
        if (readableMap.hasKey(OooO0O0)) {
            this.f22429OooO0O0.put(oooooooo.m20740OooO0OO(), OooO00o(readableMap, OooO0O0));
        }
    }

    @Override // com.p118pd.sdk.AbstractC9067ooOoo000
    public boolean OooO00o(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        int[] iArr = this.f22428OooO00o.get(oooooooo.m20740OooO0OO());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == oooooooo2.m20740OooO0OO()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void OooO00o() {
        this.f22428OooO00o.clear();
        this.f22429OooO0O0.clear();
    }
}
