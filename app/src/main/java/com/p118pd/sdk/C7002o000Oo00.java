package com.p118pd.sdk;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.o000Oo00  reason: case insensitive filesystem */
public final class C7002o000Oo00 {
    public static final String OooO0O0 = "RemoteInput";
    public static final String OooO0OO = "android.remoteinput.results";
    public static final String OooO0Oo = "android.remoteinput.resultsData";
    public static final String OooO0o0 = "android.remoteinput.dataTypeResultsData";
    public final Bundle OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f19254OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f19255OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<String> f19256OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f19257OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence[] f19258OooO00o;

    /* renamed from: com.pd.sdk.o000Oo00$OooO00o */
    public static final class OooO00o {
        public final Bundle OooO00o = new Bundle();

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f19259OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19260OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Set<String> f19261OooO00o = new HashSet();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19262OooO00o = true;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence[] f19263OooO00o;

        public OooO00o(@NonNull String str) {
            if (str != null) {
                this.f19260OooO00o = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @NonNull
        public OooO00o OooO00o(@Nullable CharSequence charSequence) {
            this.f19259OooO00o = charSequence;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@Nullable CharSequence[] charSequenceArr) {
            this.f19263OooO00o = charSequenceArr;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@NonNull String str, boolean z) {
            if (z) {
                this.f19261OooO00o.add(str);
            } else {
                this.f19261OooO00o.remove(str);
            }
            return this;
        }

        @NonNull
        public OooO00o OooO00o(boolean z) {
            this.f19262OooO00o = z;
            return this;
        }

        @NonNull
        public OooO00o OooO00o(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.OooO00o.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public Bundle OooO00o() {
            return this.OooO00o;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7002o000Oo00 m18233OooO00o() {
            return new C7002o000Oo00(this.f19260OooO00o, this.f19259OooO00o, this.f19263OooO00o, this.f19262OooO00o, this.OooO00o, this.f19261OooO00o);
        }
    }

    public C7002o000Oo00(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.f19255OooO00o = str;
        this.f19254OooO00o = charSequence;
        this.f19258OooO00o = charSequenceArr;
        this.f19257OooO00o = z;
        this.OooO00o = bundle;
        this.f19256OooO00o = set;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18229OooO00o() {
        return this.f19255OooO00o;
    }

    public boolean OooO0O0() {
        return !m18231OooO00o() && (m18232OooO00o() == null || m18232OooO00o().length == 0) && m18230OooO00o() != null && !m18230OooO00o().isEmpty();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18228OooO00o() {
        return this.f19254OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence[] m18232OooO00o() {
        return this.f19258OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<String> m18230OooO00o() {
        return this.f19256OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18231OooO00o() {
        return this.f19257OooO00o;
    }

    public Bundle OooO00o() {
        return this.OooO00o;
    }

    public static Map<String, Uri> OooO00o(Intent intent, String str) {
        Intent OooO00o2;
        String string;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
        if (i < 16 || (OooO00o2 = OooO00o(intent)) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : OooO00o2.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = OooO00o2.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m18227OooO00o(Intent intent) {
        Intent OooO00o2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        if (i < 16 || (OooO00o2 = OooO00o(intent)) == null) {
            return null;
        }
        return (Bundle) OooO00o2.getExtras().getParcelable("android.remoteinput.resultsData");
    }

    public static void OooO00o(C7002o000Oo00[] o000oo00Arr, Intent intent, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            RemoteInput.addResultsToIntent(OooO00o(o000oo00Arr), intent, bundle);
            return;
        }
        if (i >= 20) {
            Bundle OooO00o2 = m18227OooO00o(intent);
            if (OooO00o2 != null) {
                OooO00o2.putAll(bundle);
                bundle = OooO00o2;
            }
            for (C7002o000Oo00 o000oo00 : o000oo00Arr) {
                Map<String, Uri> OooO00o3 = OooO00o(intent, o000oo00.m18229OooO00o());
                RemoteInput.addResultsToIntent(OooO00o(new C7002o000Oo00[]{o000oo00}), intent, bundle);
                if (OooO00o3 != null) {
                    OooO00o(o000oo00, intent, OooO00o3);
                }
            }
        } else if (i >= 16) {
            Intent OooO00o4 = OooO00o(intent);
            if (OooO00o4 == null) {
                OooO00o4 = new Intent();
            }
            Bundle bundleExtra = OooO00o4.getBundleExtra("android.remoteinput.resultsData");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            for (C7002o000Oo00 o000oo002 : o000oo00Arr) {
                Object obj = bundle.get(o000oo002.m18229OooO00o());
                if (obj instanceof CharSequence) {
                    bundleExtra.putCharSequence(o000oo002.m18229OooO00o(), (CharSequence) obj);
                }
            }
            OooO00o4.putExtra("android.remoteinput.resultsData", bundleExtra);
            intent.setClipData(ClipData.newIntent("android.remoteinput.results", OooO00o4));
        }
    }

    public static void OooO00o(C7002o000Oo00 o000oo00, Intent intent, Map<String, Uri> map) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            RemoteInput.addDataResultToIntent(OooO00o(o000oo00), intent, map);
        } else if (i >= 16) {
            Intent OooO00o2 = OooO00o(intent);
            if (OooO00o2 == null) {
                OooO00o2 = new Intent();
            }
            for (Map.Entry<String, Uri> entry : map.entrySet()) {
                String key = entry.getKey();
                Uri value = entry.getValue();
                if (key != null) {
                    Bundle bundleExtra = OooO00o2.getBundleExtra(OooO00o(key));
                    if (bundleExtra == null) {
                        bundleExtra = new Bundle();
                    }
                    bundleExtra.putString(o000oo00.m18229OooO00o(), value.toString());
                    OooO00o2.putExtra(OooO00o(key), bundleExtra);
                }
            }
            intent.setClipData(ClipData.newIntent("android.remoteinput.results", OooO00o2));
        }
    }

    public static String OooO00o(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    @RequiresApi(20)
    public static RemoteInput[] OooO00o(C7002o000Oo00[] o000oo00Arr) {
        if (o000oo00Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[o000oo00Arr.length];
        for (int i = 0; i < o000oo00Arr.length; i++) {
            remoteInputArr[i] = OooO00o(o000oo00Arr[i]);
        }
        return remoteInputArr;
    }

    @RequiresApi(20)
    public static RemoteInput OooO00o(C7002o000Oo00 o000oo00) {
        return new RemoteInput.Builder(o000oo00.m18229OooO00o()).setLabel(o000oo00.m18228OooO00o()).setChoices(o000oo00.m18232OooO00o()).setAllowFreeFormInput(o000oo00.m18231OooO00o()).addExtras(o000oo00.OooO00o()).build();
    }

    @RequiresApi(16)
    public static Intent OooO00o(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }
}
