package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C6966o0000o0O;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000o0  reason: case insensitive filesystem */
public class C6965o0000o0<K, V> extends C6966o0000o0O<K, V> {
    public HashMap<K, C6966o0000o0O.OooO0OO<K, V>> OooO00o = new HashMap<>();

    @Override // com.p118pd.sdk.C6966o0000o0O, com.p118pd.sdk.C6966o0000o0O
    public C6966o0000o0O.OooO0OO<K, V> OooO00o(K k) {
        return this.OooO00o.get(k);
    }

    public boolean contains(K k) {
        return this.OooO00o.containsKey(k);
    }

    @Override // com.p118pd.sdk.C6966o0000o0O, com.p118pd.sdk.C6966o0000o0O
    public V OooO00o(@NonNull K k, @NonNull V v) {
        C6966o0000o0O.OooO0OO<K, V> OooO00o2 = OooO00o((Object) k);
        if (OooO00o2 != null) {
            return OooO00o2.f19171OooO0O0;
        }
        this.OooO00o.put(k, OooO00o((Object) k, (Object) v));
        return null;
    }

    @Override // com.p118pd.sdk.C6966o0000o0O, com.p118pd.sdk.C6966o0000o0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public V m18152OooO00o(@NonNull K k) {
        V v = (V) super.m18154OooO00o((Object) k);
        this.OooO00o.remove(k);
        return v;
    }

    @Override // com.p118pd.sdk.C6966o0000o0O, com.p118pd.sdk.C6966o0000o0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map.Entry<K, V> m18153OooO00o(K k) {
        if (contains(k)) {
            return this.OooO00o.get(k).OooO0O0;
        }
        return null;
    }
}
