package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.p118pd.sdk.AbstractC7641o0oOoO;
import com.p118pd.sdk.AbstractC7650o0oOoOoO;
import com.p118pd.sdk.AbstractC7653o0oOoo0;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import com.p118pd.sdk.AbstractC7700o0oo0oo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import com.p118pd.sdk.AbstractC7771oO0000O;
import com.p118pd.sdk.AbstractC7803oO00Oo0O;
import com.p118pd.sdk.C7663o0oOoooO;
import com.p118pd.sdk.C7683o0oo0OOO;
import com.p118pd.sdk.C7696o0oo0oO;
import com.p118pd.sdk.C7804oO00Oo0o;
import com.p118pd.sdk.C7817oO00o0O;
import com.p118pd.sdk.C7818oO00o0O0;
import com.p118pd.sdk.C7819oO00o0OO;
import com.p118pd.sdk.C7820oO00o0Oo;
import com.p118pd.sdk.C7869oO0OOOoO;
import com.p118pd.sdk.C8953ooOOOoO0;
import com.p118pd.sdk.oO0000Oo;
import com.p118pd.sdk.oO0OOOOo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {
    public static final String OooO00o = "Gif";
    public static final String OooO0O0 = "Bitmap";
    public static final String OooO0OO = "BitmapDrawable";
    public static final String OooO0Oo = "legacy_prepend_all";
    public static final String OooO0o0 = "legacy_append";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Pools.OooO00o<List<Throwable>> f14801OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7663o0oOoooO f14802OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0000Oo f14803OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7804oO00Oo0o f14804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7818oO00o0O0 f14805OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7817oO00o0O f14806OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7819oO00o0OO f14807OooO00o = new C7819oO00o0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7820oO00o0Oo f14808OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0OOOOo f14809OooO00o = new oO0OOOOo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7869oO0OOOoO f14810OooO00o;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.OooO00o<List<Throwable>> OooO00o2 = C8953ooOOOoO0.OooO00o();
        this.f14801OooO00o = OooO00o2;
        this.f14803OooO00o = new oO0000Oo(OooO00o2);
        this.f14805OooO00o = new C7818oO00o0O0();
        this.f14810OooO00o = new C7869oO0OOOoO();
        this.f14808OooO00o = new C7820oO00o0Oo();
        this.f14802OooO00o = new C7663o0oOoooO();
        this.f14804OooO00o = new C7804oO00Oo0o();
        this.f14806OooO00o = new C7817oO00o0O();
        OooO00o(Arrays.asList(OooO00o, OooO0O0, OooO0OO));
    }

    @NonNull
    public <Data> Registry OooO00o(@NonNull Class<Data> cls, @NonNull AbstractC7641o0oOoO<Data> o0oooo) {
        this.f14805OooO00o.OooO00o(cls, o0oooo);
        return this;
    }

    @NonNull
    public <Data> Registry OooO0O0(@NonNull Class<Data> cls, @NonNull AbstractC7641o0oOoO<Data> o0oooo) {
        this.f14805OooO00o.OooO0O0(cls, o0oooo);
        return this;
    }

    @NonNull
    @Deprecated
    public <Data> Registry OooO0OO(@NonNull Class<Data> cls, @NonNull AbstractC7641o0oOoO<Data> o0oooo) {
        return OooO00o(cls, o0oooo);
    }

    @NonNull
    public <Data, TResource> Registry OooO00o(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull AbstractC7650o0oOoOoO<Data, TResource> o0oooooo) {
        OooO00o(OooO0o0, cls, cls2, o0oooooo);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry OooO0O0(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull AbstractC7650o0oOoOoO<Data, TResource> o0oooooo) {
        OooO0O0(OooO0Oo, cls, cls2, o0oooooo);
        return this;
    }

    @NonNull
    @Deprecated
    public <TResource> Registry OooO0OO(@NonNull Class<TResource> cls, @NonNull AbstractC7653o0oOoo0<TResource> o0oooo0) {
        return OooO00o((Class) cls, (AbstractC7653o0oOoo0) o0oooo0);
    }

    @NonNull
    public <Data, TResource> Registry OooO00o(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull AbstractC7650o0oOoOoO<Data, TResource> o0oooooo) {
        this.f14810OooO00o.OooO00o(str, o0oooooo, cls, cls2);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry OooO0O0(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull AbstractC7650o0oOoOoO<Data, TResource> o0oooooo) {
        this.f14810OooO00o.OooO0O0(str, o0oooooo, cls, cls2);
        return this;
    }

    @NonNull
    public <Model, Data> Registry OooO0OO(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        this.f14803OooO00o.OooO0OO(cls, cls2, oo0000o);
        return this;
    }

    @NonNull
    public final Registry OooO00o(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, OooO0Oo);
        arrayList.add(OooO0o0);
        this.f14810OooO00o.OooO00o(arrayList);
        return this;
    }

    @NonNull
    public <TResource> Registry OooO0O0(@NonNull Class<TResource> cls, @NonNull AbstractC7653o0oOoo0<TResource> o0oooo0) {
        this.f14808OooO00o.OooO0O0(cls, o0oooo0);
        return this;
    }

    @NonNull
    public <Model, Data> Registry OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<Model, Data> oo0000o) {
        this.f14803OooO00o.OooO0O0(cls, cls2, oo0000o);
        return this;
    }

    @NonNull
    private <Data, TResource, Transcode> List<C7683o0oo0OOO<Data, TResource, Transcode>> OooO0O0(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f14810OooO00o.OooO0O0(cls, cls2)) {
            for (Class cls5 : this.f14804OooO00o.m19507OooO00o(cls4, (Class) cls3)) {
                arrayList.add(new C7683o0oo0OOO(cls, cls4, cls5, this.f14810OooO00o.OooO00o(cls, cls4), this.f14804OooO00o.OooO00o(cls4, cls5), this.f14801OooO00o));
            }
        }
        return arrayList;
    }

    @NonNull
    public <TResource> Registry OooO00o(@NonNull Class<TResource> cls, @NonNull AbstractC7653o0oOoo0<TResource> o0oooo0) {
        this.f14808OooO00o.OooO00o(cls, o0oooo0);
        return this;
    }

    @NonNull
    public Registry OooO00o(@NonNull AbstractC7661o0oOooo.OooO00o<?> oooO00o) {
        this.f14802OooO00o.OooO00o(oooO00o);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry OooO00o(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull AbstractC7803oO00Oo0O<TResource, Transcode> oo00oo0o) {
        this.f14804OooO00o.OooO00o(cls, cls2, oo00oo0o);
        return this;
    }

    @NonNull
    public Registry OooO00o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f14806OooO00o.OooO00o(imageHeaderParser);
        return this;
    }

    @NonNull
    public <Model, Data> Registry OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<Model, Data> oo0000o) {
        this.f14803OooO00o.OooO00o(cls, cls2, oo0000o);
        return this;
    }

    @Nullable
    public <Data, TResource, Transcode> C7696o0oo0oO<Data, TResource, Transcode> OooO00o(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        C7696o0oo0oO<Data, TResource, Transcode> OooO00o2 = this.f14809OooO00o.m19559OooO00o(cls, cls2, cls3);
        if (this.f14809OooO00o.OooO00o(OooO00o2)) {
            return null;
        }
        if (OooO00o2 == null) {
            List<C7683o0oo0OOO<Data, TResource, Transcode>> OooO0O02 = OooO0O0(cls, cls2, cls3);
            if (OooO0O02.isEmpty()) {
                OooO00o2 = null;
            } else {
                OooO00o2 = new C7696o0oo0oO<>(cls, cls2, cls3, OooO0O02, this.f14801OooO00o);
            }
            this.f14809OooO00o.OooO00o(cls, cls2, cls3, OooO00o2);
        }
        return OooO00o2;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <Model, TResource, Transcode> List<Class<?>> m14983OooO00o(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> OooO00o2 = this.f14807OooO00o.OooO00o(cls, cls2);
        if (OooO00o2 == null) {
            OooO00o2 = new ArrayList<>();
            for (Class<?> cls4 : this.f14803OooO00o.OooO00o((Class<?>) cls)) {
                for (Class<?> cls5 : this.f14810OooO00o.OooO0O0(cls4, cls2)) {
                    if (!this.f14804OooO00o.m19507OooO00o((Class) cls5, (Class) cls3).isEmpty() && !OooO00o2.contains(cls5)) {
                        OooO00o2.add(cls5);
                    }
                }
            }
            this.f14807OooO00o.OooO00o(cls, cls2, Collections.unmodifiableList(OooO00o2));
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14985OooO00o(@NonNull AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        return this.f14808OooO00o.OooO00o(o0oo0oo0.m19341OooO00o()) != null;
    }

    @NonNull
    public <X> AbstractC7653o0oOoo0<X> OooO00o(@NonNull AbstractC7700o0oo0oo0<X> o0oo0oo0) throws NoResultEncoderAvailableException {
        AbstractC7653o0oOoo0<X> OooO00o2 = this.f14808OooO00o.OooO00o(o0oo0oo0.m19341OooO00o());
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        throw new NoResultEncoderAvailableException(o0oo0oo0.m19341OooO00o());
    }

    @NonNull
    public <X> AbstractC7641o0oOoO<X> OooO00o(@NonNull X x) throws NoSourceEncoderAvailableException {
        AbstractC7641o0oOoO<X> OooO00o2 = this.f14805OooO00o.OooO00o(x.getClass());
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <X> AbstractC7661o0oOooo<X> m14982OooO00o(@NonNull X x) {
        return this.f14802OooO00o.OooO00o((Object) x);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <Model> List<AbstractC7770oO00000o<Model, ?>> m14984OooO00o(@NonNull Model model) {
        List<AbstractC7770oO00000o<Model, ?>> OooO00o2 = this.f14803OooO00o.m19419OooO00o((Object) model);
        if (!OooO00o2.isEmpty()) {
            return OooO00o2;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    @NonNull
    public List<ImageHeaderParser> OooO00o() {
        List<ImageHeaderParser> OooO00o2 = this.f14806OooO00o.OooO00o();
        if (!OooO00o2.isEmpty()) {
            return OooO00o2;
        }
        throw new NoImageHeaderParserException();
    }
}
