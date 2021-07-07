package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0OOO  reason: case insensitive filesystem */
public class C7683o0oo0OOO<DataType, ResourceType, Transcode> {
    public static final String OooO0O0 = "DecodePath";
    public final Pools.OooO00o<List<Throwable>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7803oO00Oo0O<ResourceType, Transcode> f20592OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<DataType> f20593OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20594OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<? extends AbstractC7650o0oOoOoO<DataType, ResourceType>> f20595OooO00o;

    /* renamed from: com.pd.sdk.o0oo0OOO$OooO00o */
    public interface OooO00o<ResourceType> {
        @NonNull
        AbstractC7700o0oo0oo0<ResourceType> OooO00o(@NonNull AbstractC7700o0oo0oo0<ResourceType> o0oo0oo0);
    }

    public C7683o0oo0OOO(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends AbstractC7650o0oOoOoO<DataType, ResourceType>> list, AbstractC7803oO00Oo0O<ResourceType, Transcode> oo00oo0o, Pools.OooO00o<List<Throwable>> oooO00o) {
        this.f20593OooO00o = cls;
        this.f20595OooO00o = list;
        this.f20592OooO00o = oo00oo0o;
        this.OooO00o = oooO00o;
        this.f20594OooO00o = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + C7522o0Ooo0o.OooO0Oo;
    }

    public AbstractC7700o0oo0oo0<Transcode> OooO00o(AbstractC7661o0oOooo<DataType> o0ooooo, int i, int i2, @NonNull C7648o0oOoOo o0ooooo2, OooO00o<ResourceType> oooO00o) throws GlideException {
        return this.f20592OooO00o.OooO00o(oooO00o.OooO00o(OooO00o(o0ooooo, i, i2, o0ooooo2)), o0ooooo2);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f20593OooO00o + ", decoders=" + this.f20595OooO00o + ", transcoder=" + this.f20592OooO00o + '}';
    }

    @NonNull
    private AbstractC7700o0oo0oo0<ResourceType> OooO00o(AbstractC7661o0oOooo<DataType> o0ooooo, int i, int i2, @NonNull C7648o0oOoOo o0ooooo2) throws GlideException {
        List<Throwable> list = (List) C7842oO0O0.OooO00o((Object) this.OooO00o.acquire());
        try {
            return OooO00o(o0ooooo, i, i2, o0ooooo2, list);
        } finally {
            this.OooO00o.release(list);
        }
    }

    @NonNull
    private AbstractC7700o0oo0oo0<ResourceType> OooO00o(AbstractC7661o0oOooo<DataType> o0ooooo, int i, int i2, @NonNull C7648o0oOoOo o0ooooo2, List<Throwable> list) throws GlideException {
        int size = this.f20595OooO00o.size();
        AbstractC7700o0oo0oo0<ResourceType> o0oo0oo0 = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC7650o0oOoOoO o0oooooo = (AbstractC7650o0oOoOoO) this.f20595OooO00o.get(i3);
            try {
                if (o0oooooo.OooO00o(o0ooooo.OooO00o(), o0ooooo2)) {
                    o0oo0oo0 = o0oooooo.OooO00o(o0ooooo.OooO00o(), i, i2, o0ooooo2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(OooO0O0, 2)) {
                    String str = "Failed to decode data for " + o0oooooo;
                }
                list.add(e);
            }
            if (o0oo0oo0 != null) {
                break;
            }
        }
        if (o0oo0oo0 != null) {
            return o0oo0oo0;
        }
        throw new GlideException(this.f20594OooO00o, new ArrayList(list));
    }
}
