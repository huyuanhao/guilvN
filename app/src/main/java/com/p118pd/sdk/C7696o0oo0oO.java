package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.C7683o0oo0OOO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0oO  reason: case insensitive filesystem */
public class C7696o0oo0oO<Data, ResourceType, Transcode> {
    public final Pools.OooO00o<List<Throwable>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<Data> f20637OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20638OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<? extends C7683o0oo0OOO<Data, ResourceType, Transcode>> f20639OooO00o;

    public C7696o0oo0oO(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C7683o0oo0OOO<Data, ResourceType, Transcode>> list, Pools.OooO00o<List<Throwable>> oooO00o) {
        this.f20637OooO00o = cls;
        this.OooO00o = oooO00o;
        this.f20639OooO00o = (List) C7842oO0O0.OooO00o((Collection) list);
        this.f20638OooO00o = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + C7522o0Ooo0o.OooO0Oo;
    }

    public AbstractC7700o0oo0oo0<Transcode> OooO00o(AbstractC7661o0oOooo<Data> o0ooooo, @NonNull C7648o0oOoOo o0ooooo2, int i, int i2, C7683o0oo0OOO.OooO00o<ResourceType> oooO00o) throws GlideException {
        List<Throwable> list = (List) C7842oO0O0.OooO00o((Object) this.OooO00o.acquire());
        try {
            return OooO00o(o0ooooo, o0ooooo2, i, i2, oooO00o, list);
        } finally {
            this.OooO00o.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f20639OooO00o.toArray()) + '}';
    }

    private AbstractC7700o0oo0oo0<Transcode> OooO00o(AbstractC7661o0oOooo<Data> o0ooooo, @NonNull C7648o0oOoOo o0ooooo2, int i, int i2, C7683o0oo0OOO.OooO00o<ResourceType> oooO00o, List<Throwable> list) throws GlideException {
        int size = this.f20639OooO00o.size();
        AbstractC7700o0oo0oo0<Transcode> o0oo0oo0 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                o0oo0oo0 = ((C7683o0oo0OOO) this.f20639OooO00o.get(i3)).OooO00o(o0ooooo, i, i2, o0ooooo2, oooO00o);
            } catch (GlideException e) {
                list.add(e);
            }
            if (o0oo0oo0 != null) {
                break;
            }
        }
        if (o0oo0oo0 != null) {
            return o0oo0oo0;
        }
        throw new GlideException(this.f20638OooO00o, new ArrayList(list));
    }

    public Class<Data> OooO00o() {
        return this.f20637OooO00o;
    }
}
