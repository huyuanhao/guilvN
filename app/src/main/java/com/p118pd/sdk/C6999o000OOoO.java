package com.p118pd.sdk;

import android.app.Person;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: com.pd.sdk.o000OOoO  reason: case insensitive filesystem */
public class C6999o000OOoO {
    public static final String OooO0OO = "name";
    public static final String OooO0Oo = "icon";
    public static final String OooO0o = "key";
    public static final String OooO0o0 = "uri";
    public static final String OooO0oO = "isBot";
    public static final String OooO0oo = "isImportant";
    @Nullable
    public IconCompat OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f19245OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f19246OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19247OooO00o;
    @Nullable
    public String OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19248OooO0O0;

    /* renamed from: com.pd.sdk.o000OOoO$OooO00o */
    public static class OooO00o {
        @Nullable
        public IconCompat OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f19249OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f19250OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19251OooO00o;
        @Nullable
        public String OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f19252OooO0O0;

        public OooO00o() {
        }

        @NonNull
        public OooO00o OooO00o(@Nullable CharSequence charSequence) {
            this.f19249OooO00o = charSequence;
            return this;
        }

        @NonNull
        public OooO00o OooO0O0(@Nullable String str) {
            this.f19250OooO00o = str;
            return this;
        }

        public OooO00o(C6999o000OOoO o000oooo) {
            this.f19249OooO00o = o000oooo.f19245OooO00o;
            this.OooO00o = o000oooo.OooO00o;
            this.f19250OooO00o = o000oooo.f19246OooO00o;
            this.OooO0O0 = o000oooo.OooO0O0;
            this.f19251OooO00o = o000oooo.f19247OooO00o;
            this.f19252OooO0O0 = o000oooo.f19248OooO0O0;
        }

        @NonNull
        public OooO00o OooO00o(@Nullable IconCompat iconCompat) {
            this.OooO00o = iconCompat;
            return this;
        }

        @NonNull
        public OooO00o OooO0O0(boolean z) {
            this.f19252OooO0O0 = z;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@Nullable String str) {
            this.OooO0O0 = str;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(boolean z) {
            this.f19251OooO00o = z;
            return this;
        }

        @NonNull
        public C6999o000OOoO OooO00o() {
            return new C6999o000OOoO(this);
        }
    }

    public C6999o000OOoO(OooO00o oooO00o) {
        this.f19245OooO00o = oooO00o.f19249OooO00o;
        this.OooO00o = oooO00o.OooO00o;
        this.f19246OooO00o = oooO00o.f19250OooO00o;
        this.OooO0O0 = oooO00o.OooO0O0;
        this.f19247OooO00o = oooO00o.f19251OooO00o;
        this.f19248OooO0O0 = oooO00o.f19252OooO0O0;
    }

    @NonNull
    public static C6999o000OOoO OooO00o(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new OooO00o().OooO00o(bundle.getCharSequence("name")).OooO00o(bundle2 != null ? IconCompat.OooO00o(bundle2) : null).OooO0O0(bundle.getString("uri")).OooO00o(bundle.getString("key")).OooO00o(bundle.getBoolean(OooO0oO)).OooO0O0(bundle.getBoolean(OooO0oo)).OooO00o();
    }

    @Nullable
    public String OooO0O0() {
        return this.f19246OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18224OooO0O0() {
        return this.f19248OooO0O0;
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static C6999o000OOoO OooO00o(@NonNull Person person) {
        return new OooO00o().OooO00o(person.getName()).OooO00o(person.getIcon() != null ? IconCompat.m14551OooO00o(person.getIcon()) : null).OooO0O0(person.getUri()).OooO00o(person.getKey()).OooO00o(person.isBot()).OooO0O0(person.isImportant()).OooO00o();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m18218OooO00o() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f19245OooO00o);
        IconCompat iconCompat = this.OooO00o;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f19246OooO00o);
        bundle.putString("key", this.OooO0O0);
        bundle.putBoolean(OooO0oO, this.f19247OooO00o);
        bundle.putBoolean(OooO0oo, this.f19248OooO0O0);
        return bundle;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m18220OooO00o() {
        return new OooO00o(this);
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Person OooO00o() {
        return new Person.Builder().setName(m18221OooO00o()).setIcon(m18219OooO00o() != null ? m18219OooO00o().OooO00o() : null).setUri(OooO0O0()).setKey(m18222OooO00o()).setBot(m18223OooO00o()).setImportant(m18224OooO0O0()).build();
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18221OooO00o() {
        return this.f19245OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public IconCompat m18219OooO00o() {
        return this.OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18222OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18223OooO00o() {
        return this.f19247OooO00o;
    }
}
