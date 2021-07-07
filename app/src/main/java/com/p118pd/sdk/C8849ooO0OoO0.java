package com.p118pd.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.netease.nimlib.notifier.support26.annotation.RestrictTo;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.ooO0OoO0  reason: case insensitive filesystem */
public final class C8849ooO0OoO0 extends C8852ooO0OoOo.OooO00o {
    public static final OooO0OO OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o f22056OooO00o = new OooO00o();
    public static final String OooO0O0 = "RemoteInput";
    public static final String OooO0OO = "android.remoteinput.results";
    public static final String OooO0Oo = "android.remoteinput.resultsData";
    public static final String OooO0o0 = "android.remoteinput.dataTypeResultsData";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bundle f22057OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f22058OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f22059OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<String> f22060OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f22061OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence[] f22062OooO00o;

    /* renamed from: com.pd.sdk.ooO0OoO0$OooO0O0 */
    public static final class OooO0O0 {
        public Bundle OooO00o = new Bundle();

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f22063OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f22064OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Set<String> f22065OooO00o = new HashSet();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22066OooO00o = true;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence[] f22067OooO00o;

        public OooO0O0(String str) {
            if (str != null) {
                this.f22064OooO00o = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public OooO0O0 OooO00o(CharSequence charSequence) {
            this.f22063OooO00o = charSequence;
            return this;
        }

        public OooO0O0 OooO00o(CharSequence[] charSequenceArr) {
            this.f22067OooO00o = charSequenceArr;
            return this;
        }

        public OooO0O0 OooO00o(String str, boolean z) {
            if (z) {
                this.f22065OooO00o.add(str);
            } else {
                this.f22065OooO00o.remove(str);
            }
            return this;
        }

        public OooO0O0 OooO00o(boolean z) {
            this.f22066OooO00o = z;
            return this;
        }

        public OooO0O0 OooO00o(Bundle bundle) {
            if (bundle != null) {
                this.OooO00o.putAll(bundle);
            }
            return this;
        }

        public Bundle OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C8849ooO0OoO0 m20488OooO00o() {
            return new C8849ooO0OoO0(this.f22064OooO00o, this.f22063OooO00o, this.f22067OooO00o, this.f22066OooO00o, this.OooO00o, this.f22065OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooO0OoO0$OooO0OO */
    public interface OooO0OO {
        Bundle OooO00o(Intent intent);

        Map<String, Uri> OooO00o(Intent intent, String str);

        void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map);

        void OooO00o(C8849ooO0OoO0[] ooo0ooo0Arr, Intent intent, Bundle bundle);
    }

    @RequiresApi(20)
    /* renamed from: com.pd.sdk.ooO0OoO0$OooO0Oo  reason: case insensitive filesystem */
    public static class C8850OooO0Oo implements OooO0OO {
        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Bundle OooO00o(Intent intent) {
            return C8848ooO0OoO.m20482OooO00o(intent);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Map<String, Uri> OooO00o(Intent intent, String str) {
            return C8848ooO0OoO.OooO00o(intent, str);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0[] ooo0ooo0Arr, Intent intent, Bundle bundle) {
            C8848ooO0OoO.OooO00o(ooo0ooo0Arr, intent, bundle);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map) {
            C8848ooO0OoO.OooO00o(ooo0ooo0, intent, map);
        }
    }

    @RequiresApi(16)
    /* renamed from: com.pd.sdk.ooO0OoO0$OooO0o */
    public static class OooO0o implements OooO0OO {
        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Bundle OooO00o(Intent intent) {
            return C8853ooO0Ooo0.m20494OooO00o(intent);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Map<String, Uri> OooO00o(Intent intent, String str) {
            return C8853ooO0Ooo0.OooO00o(intent, str);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0[] ooo0ooo0Arr, Intent intent, Bundle bundle) {
            C8853ooO0Ooo0.OooO00o(ooo0ooo0Arr, intent, bundle);
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map) {
            C8853ooO0Ooo0.OooO00o(ooo0ooo0, intent, map);
        }
    }

    /* renamed from: com.pd.sdk.ooO0OoO0$OooO0o0  reason: case insensitive filesystem */
    public static class C8851OooO0o0 implements OooO0OO {
        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Bundle OooO00o(Intent intent) {
            return null;
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public Map<String, Uri> OooO00o(Intent intent, String str) {
            return null;
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map) {
        }

        @Override // com.p118pd.sdk.C8849ooO0OoO0.OooO0OO
        public void OooO00o(C8849ooO0OoO0[] ooo0ooo0Arr, Intent intent, Bundle bundle) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            OooO00o = new C8850OooO0Oo();
        } else if (i >= 16) {
            OooO00o = new OooO0o();
        } else {
            OooO00o = new C8851OooO0o0();
        }
    }

    public C8849ooO0OoO0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.f22059OooO00o = str;
        this.f22058OooO00o = charSequence;
        this.f22062OooO00o = charSequenceArr;
        this.f22061OooO00o = z;
        this.f22057OooO00o = bundle;
        this.f22060OooO00o = set;
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20484OooO00o() {
        return this.f22059OooO00o;
    }

    public boolean OooO0O0() {
        return !m20486OooO00o() && (m20487OooO00o() == null || m20487OooO00o().length == 0) && m20485OooO00o() != null && !m20485OooO00o().isEmpty();
    }

    /* renamed from: com.pd.sdk.ooO0OoO0$OooO00o */
    public static class OooO00o implements C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o {
        @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o
        public C8849ooO0OoO0 OooO00o(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
            return new C8849ooO0OoO0(str, charSequence, charSequenceArr, z, bundle, set);
        }

        @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o
        public C8849ooO0OoO0[] OooO00o(int i) {
            return new C8849ooO0OoO0[i];
        }
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m20483OooO00o() {
        return this.f22058OooO00o;
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence[] m20487OooO00o() {
        return this.f22062OooO00o;
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<String> m20485OooO00o() {
        return this.f22060OooO00o;
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20486OooO00o() {
        return this.f22061OooO00o;
    }

    @Override // com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o, com.p118pd.sdk.C8852ooO0OoOo.OooO00o
    public Bundle OooO00o() {
        return this.f22057OooO00o;
    }

    public static Map<String, Uri> OooO00o(Intent intent, String str) {
        return OooO00o.OooO00o(intent, str);
    }

    public static Bundle OooO00o(Intent intent) {
        return OooO00o.OooO00o(intent);
    }

    public static void OooO00o(C8849ooO0OoO0[] ooo0ooo0Arr, Intent intent, Bundle bundle) {
        OooO00o.OooO00o(ooo0ooo0Arr, intent, bundle);
    }

    public static void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map) {
        OooO00o.OooO00o(ooo0ooo0, intent, map);
    }
}
