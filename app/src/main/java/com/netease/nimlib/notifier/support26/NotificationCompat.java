package com.netease.nimlib.notifier.support26;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.ColorInt;
import com.netease.nimlib.notifier.support26.annotation.NonNull;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.netease.nimlib.notifier.support26.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC8832ooO0OO;
import com.p118pd.sdk.AbstractC8836ooO0OO0o;
import com.p118pd.sdk.C8838ooO0OOO0;
import com.p118pd.sdk.C8839ooO0OOOo;
import com.p118pd.sdk.C8843ooO0Oo;
import com.p118pd.sdk.C8844ooO0Oo0;
import com.p118pd.sdk.C8845ooO0Oo00;
import com.p118pd.sdk.C8847ooO0Oo0o;
import com.p118pd.sdk.C8849ooO0OoO0;
import com.p118pd.sdk.C8852ooO0OoOo;
import com.p118pd.sdk.C8854ooO0OooO;
import com.p118pd.sdk.C9103ooo0oOo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat {
    public static final int OooO = 8;

    /* renamed from: OooO  reason: collision with other field name */
    public static final String f15122OooO = "android.icon";
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC5155OooOOo0 f15123OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f15124OooO00o = "android.title";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f15125OooO0O0 = "android.title.big";
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f15126OooO0OO = "android.text";
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f15127OooO0Oo = "android.subText";
    public static final int OooO0o = 1;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f15128OooO0o = "android.infoText";
    public static final int OooO0o0 = -1;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f15129OooO0o0 = "android.remoteInputHistory";
    public static final int OooO0oO = 2;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f15130OooO0oO = "android.summaryText";
    public static final int OooO0oo = 4;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final String f15131OooO0oo = "android.bigText";
    public static final int OooOO0 = 16;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final String f15132OooOO0 = "android.largeIcon";
    public static final int OooOO0O = 32;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final String f15133OooOO0O = "android.largeIcon.big";
    public static final int OooOO0o = 64;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final String f15134OooOO0o = "android.progress";
    public static final int OooOOO = 256;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final String f15135OooOOO = "android.progressIndeterminate";
    @Deprecated
    public static final int OooOOO0 = 128;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final String f15136OooOOO0 = "android.progressMax";
    public static final int OooOOOO = 512;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final String f15137OooOOOO = "android.showChronometer";
    public static final int OooOOOo = 0;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final String f15138OooOOOo = "android.showWhen";
    public static final int OooOOo = -2;

    /* renamed from: OooOOo  reason: collision with other field name */
    public static final String f15139OooOOo = "android.textLines";
    public static final int OooOOo0 = -1;

    /* renamed from: OooOOo0  reason: collision with other field name */
    public static final String f15140OooOOo0 = "android.picture";
    public static final int OooOOoo = 1;

    /* renamed from: OooOOoo  reason: collision with other field name */
    public static final String f15141OooOOoo = "android.template";
    public static final int OooOo = -1;

    /* renamed from: OooOo  reason: collision with other field name */
    public static final String f15142OooOo = "android.selfDisplayName";
    @ColorInt
    public static final int OooOo0 = 0;

    /* renamed from: OooOo0  reason: collision with other field name */
    public static final String f15143OooOo0 = "android.backgroundImageUri";
    public static final int OooOo00 = 2;

    /* renamed from: OooOo00  reason: collision with other field name */
    public static final String f15144OooOo00 = "android.people";
    public static final int OooOo0O = 1;

    /* renamed from: OooOo0O  reason: collision with other field name */
    public static final String f15145OooOo0O = "android.mediaSession";
    public static final int OooOo0o = 0;

    /* renamed from: OooOo0o  reason: collision with other field name */
    public static final String f15146OooOo0o = "android.compactActions";
    public static final int OooOoO = 1;

    /* renamed from: OooOoO  reason: collision with other field name */
    public static final String f15147OooOoO = "android.messages";
    public static final int OooOoO0 = 0;

    /* renamed from: OooOoO0  reason: collision with other field name */
    public static final String f15148OooOoO0 = "android.conversationTitle";
    public static final int OooOoOO = 2;

    /* renamed from: OooOoOO  reason: collision with other field name */
    public static final String f15149OooOoOO = "android.audioContents";
    public static final int OooOoo = 1;

    /* renamed from: OooOoo  reason: collision with other field name */
    public static final String f15150OooOoo = "msg";
    public static final int OooOoo0 = 0;

    /* renamed from: OooOoo0  reason: collision with other field name */
    public static final String f15151OooOoo0 = "call";
    public static final int OooOooO = 2;

    /* renamed from: OooOooO  reason: collision with other field name */
    public static final String f15152OooOooO = "email";
    public static final String OooOooo = "event";
    public static final String Oooo = "status";
    public static final String Oooo0 = "social";
    public static final String Oooo000 = "promo";
    public static final String Oooo00O = "alarm";
    public static final String Oooo00o = "progress";
    public static final String Oooo0O0 = "err";
    public static final String Oooo0OO = "transport";
    public static final String Oooo0o = "service";
    public static final String Oooo0o0 = "sys";
    public static final String Oooo0oO = "reminder";
    public static final String Oooo0oo = "recommendation";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    public static class OooO extends AbstractC5154OooOOo {
        public static final int OooO00o = 25;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<OooO00o> f15153OooO00o = new ArrayList();
        public CharSequence OooO0OO;
        public CharSequence OooO0Oo;

        public static final class OooO00o {
            public static final String OooO0O0 = "text";
            public static final String OooO0OO = "time";
            public static final String OooO0Oo = "sender";
            public static final String OooO0o = "uri";
            public static final String OooO0o0 = "type";
            public static final String OooO0oO = "extras";
            public final long OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public Uri f15154OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public Bundle f15155OooO00o = new Bundle();

            /* renamed from: OooO00o  reason: collision with other field name */
            public final CharSequence f15156OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public String f15157OooO00o;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public final CharSequence f15158OooO0O0;

            public OooO00o(CharSequence charSequence, long j, CharSequence charSequence2) {
                this.f15156OooO00o = charSequence;
                this.OooO00o = j;
                this.f15158OooO0O0 = charSequence2;
            }

            public OooO00o OooO00o(String str, Uri uri) {
                this.f15157OooO00o = str;
                this.f15154OooO00o = uri;
                return this;
            }

            /* renamed from: OooO0O0  reason: collision with other method in class */
            public CharSequence m15146OooO0O0() {
                return this.f15156OooO00o;
            }

            private Bundle OooO0O0() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f15156OooO00o;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.OooO00o);
                CharSequence charSequence2 = this.f15158OooO0O0;
                if (charSequence2 != null) {
                    bundle.putCharSequence("sender", charSequence2);
                }
                String str = this.f15157OooO00o;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f15154OooO00o;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f15155OooO00o;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public long OooO00o() {
                return this.OooO00o;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public Bundle m15143OooO00o() {
                return this.f15155OooO00o;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public CharSequence m15144OooO00o() {
                return this.f15158OooO0O0;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m15145OooO00o() {
                return this.f15157OooO00o;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public Uri m15142OooO00o() {
                return this.f15154OooO00o;
            }

            public static Bundle[] OooO00o(List<OooO00o> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).OooO0O0();
                }
                return bundleArr;
            }

            public static List<OooO00o> OooO00o(Parcelable[] parcelableArr) {
                OooO00o OooO00o2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if ((parcelableArr[i] instanceof Bundle) && (OooO00o2 = OooO00o((Bundle) parcelableArr[i])) != null) {
                        arrayList.add(OooO00o2);
                    }
                }
                return arrayList;
            }

            public static OooO00o OooO00o(Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            OooO00o oooO00o = new OooO00o(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                oooO00o.OooO00o(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                oooO00o.m15143OooO00o().putAll(bundle.getBundle("extras"));
                            }
                            return oooO00o;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }
        }

        public OooO() {
        }

        public OooO OooO00o(CharSequence charSequence) {
            this.OooO0Oo = charSequence;
            return this;
        }

        public CharSequence OooO0O0() {
            return this.OooO0OO;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5154OooOOo
        public CharSequence OooO00o() {
            return this.OooO0Oo;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5154OooOOo
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO0O0(Bundle bundle) {
            this.f15153OooO00o.clear();
            this.OooO0OO = bundle.getString("android.selfDisplayName");
            this.OooO0Oo = bundle.getString("android.conversationTitle");
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f15153OooO00o = OooO00o.OooO00o(parcelableArray);
            }
        }

        public OooO(@NonNull CharSequence charSequence) {
            this.OooO0OO = charSequence;
        }

        public OooO OooO00o(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.f15153OooO00o.add(new OooO00o(charSequence, j, charSequence2));
            if (this.f15153OooO00o.size() > 25) {
                this.f15153OooO00o.remove(0);
            }
            return this;
        }

        public OooO OooO00o(OooO00o oooO00o) {
            this.f15153OooO00o.add(oooO00o);
            if (this.f15153OooO00o.size() > 25) {
                this.f15153OooO00o.remove(0);
            }
            return this;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5154OooOOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<OooO00o> m15141OooO00o() {
            return this.f15153OooO00o;
        }

        public static OooO OooO00o(Notification notification) {
            Bundle OooO00o2 = NotificationCompat.m15134OooO00o(notification);
            if (OooO00o2 != null && !OooO00o2.containsKey("android.selfDisplayName")) {
                return null;
            }
            try {
                OooO oooO = new OooO();
                oooO.OooO0O0(OooO00o2);
                return oooO;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5154OooOOo
        public void OooO00o(Bundle bundle) {
            super.OooO00o(bundle);
            CharSequence charSequence = this.OooO0OO;
            if (charSequence != null) {
                bundle.putCharSequence("android.selfDisplayName", charSequence);
            }
            CharSequence charSequence2 = this.OooO0Oo;
            if (charSequence2 != null) {
                bundle.putCharSequence("android.conversationTitle", charSequence2);
            }
            if (!this.f15153OooO00o.isEmpty()) {
                bundle.putParcelableArray("android.messages", OooO00o.OooO00o(this.f15153OooO00o));
            }
        }
    }

    public static class OooO00o extends C8844ooO0Oo0.OooO00o {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o OooO00o = new C4907OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f15159OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f15160OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Bundle f15161OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f15162OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f15163OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C8849ooO0OoO0[] f15164OooO00o;
        public final C8849ooO0OoO0[] OooO0O0;

        /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4907OooO00o implements C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o {
            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o
            public C8844ooO0Oo0.OooO00o OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C8852ooO0OoOo.OooO00o[] oooO00oArr, C8852ooO0OoOo.OooO00o[] oooO00oArr2, boolean z) {
                return new OooO00o(i, charSequence, pendingIntent, bundle, (C8849ooO0OoO0[]) oooO00oArr, (C8849ooO0OoO0[]) oooO00oArr2, z);
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o
            public OooO00o[] OooO00o(int i) {
                return new OooO00o[i];
            }
        }

        public static final class OooO0O0 {
            public final int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final PendingIntent f15165OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final Bundle f15166OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final CharSequence f15167OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public ArrayList<C8849ooO0OoO0> f15168OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f15169OooO00o;

            public OooO0O0(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true);
            }

            public OooO0O0 OooO00o(Bundle bundle) {
                if (bundle != null) {
                    this.f15166OooO00o.putAll(bundle);
                }
                return this;
            }

            public OooO0O0(OooO00o oooO00o) {
                this(oooO00o.f15159OooO00o, oooO00o.f15162OooO00o, oooO00o.f15160OooO00o, new Bundle(oooO00o.f15161OooO00o), oooO00o.OooO0O0(), oooO00o.m15150OooO00o());
            }

            public Bundle OooO00o() {
                return this.f15166OooO00o;
            }

            public OooO0O0 OooO00o(C8849ooO0OoO0 ooo0ooo0) {
                if (this.f15168OooO00o == null) {
                    this.f15168OooO00o = new ArrayList<>();
                }
                this.f15168OooO00o.add(ooo0ooo0);
                return this;
            }

            public OooO0O0(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C8849ooO0OoO0[] ooo0ooo0Arr, boolean z) {
                ArrayList<C8849ooO0OoO0> arrayList;
                this.f15169OooO00o = true;
                this.OooO00o = i;
                this.f15167OooO00o = C5148OooO0Oo.OooO00o(charSequence);
                this.f15165OooO00o = pendingIntent;
                this.f15166OooO00o = bundle;
                if (ooo0ooo0Arr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(ooo0ooo0Arr));
                }
                this.f15168OooO00o = arrayList;
                this.f15169OooO00o = z;
            }

            public OooO0O0 OooO00o(boolean z) {
                this.f15169OooO00o = z;
                return this;
            }

            public OooO0O0 OooO00o(OooO0OO oooO0OO) {
                oooO0OO.OooO00o(this);
                return this;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public OooO00o m15152OooO00o() {
                C8849ooO0OoO0[] ooo0ooo0Arr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C8849ooO0OoO0> arrayList3 = this.f15168OooO00o;
                if (arrayList3 != null) {
                    Iterator<C8849ooO0OoO0> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C8849ooO0OoO0 next = it.next();
                        if (next.OooO0O0()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C8849ooO0OoO0[] ooo0ooo0Arr2 = null;
                if (arrayList.isEmpty()) {
                    ooo0ooo0Arr = null;
                } else {
                    ooo0ooo0Arr = (C8849ooO0OoO0[]) arrayList.toArray(new C8849ooO0OoO0[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    ooo0ooo0Arr2 = (C8849ooO0OoO0[]) arrayList2.toArray(new C8849ooO0OoO0[arrayList2.size()]);
                }
                return new OooO00o(this.OooO00o, this.f15167OooO00o, this.f15165OooO00o, this.f15166OooO00o, ooo0ooo0Arr2, ooo0ooo0Arr, this.f15169OooO00o);
            }
        }

        public interface OooO0OO {
            OooO0O0 OooO00o(OooO0O0 oooO0O0);
        }

        /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO00o$OooO0Oo  reason: case insensitive filesystem */
        public static final class C5147OooO0Oo implements OooO0OO {
            public static final String OooO00o = "android.wearable.EXTENSIONS";
            public static final int OooO0O0 = 1;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public static final String f15170OooO0O0 = "flags";
            public static final int OooO0OO = 2;

            /* renamed from: OooO0OO  reason: collision with other field name */
            public static final String f15171OooO0OO = "inProgressLabel";
            public static final int OooO0Oo = 4;

            /* renamed from: OooO0Oo  reason: collision with other field name */
            public static final String f15172OooO0Oo = "confirmLabel";
            public static final int OooO0o0 = 1;

            /* renamed from: OooO0o0  reason: collision with other field name */
            public static final String f15173OooO0o0 = "cancelLabel";

            /* renamed from: OooO00o  reason: collision with other field name */
            public int f15174OooO00o = 1;

            /* renamed from: OooO00o  reason: collision with other field name */
            public CharSequence f15175OooO00o;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public CharSequence f15176OooO0O0;

            /* renamed from: OooO0OO  reason: collision with other field name */
            public CharSequence f15177OooO0OO;

            public C5147OooO0Oo() {
            }

            @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooO00o.OooO0OO
            public OooO0O0 OooO00o(OooO0O0 oooO0O0) {
                Bundle bundle = new Bundle();
                int i = this.f15174OooO00o;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f15175OooO00o;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f15176OooO0O0;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f15177OooO0OO;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                oooO0O0.OooO00o().putBundle("android.wearable.EXTENSIONS", bundle);
                return oooO0O0;
            }

            public C5147OooO0Oo OooO0O0(CharSequence charSequence) {
                this.f15176OooO0O0 = charSequence;
                return this;
            }

            /* renamed from: OooO0OO  reason: collision with other method in class */
            public boolean m15156OooO0OO() {
                return (this.f15174OooO00o & 1) != 0;
            }

            public CharSequence OooO0O0() {
                return this.f15176OooO0O0;
            }

            public C5147OooO0Oo OooO0OO(CharSequence charSequence) {
                this.f15175OooO00o = charSequence;
                return this;
            }

            public C5147OooO0Oo(OooO00o oooO00o) {
                Bundle bundle = oooO00o.m15148OooO00o().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f15174OooO00o = bundle.getInt("flags", 1);
                    this.f15175OooO00o = bundle.getCharSequence("inProgressLabel");
                    this.f15176OooO0O0 = bundle.getCharSequence("confirmLabel");
                    this.f15177OooO0OO = bundle.getCharSequence("cancelLabel");
                }
            }

            /* renamed from: OooO0O0  reason: collision with other method in class */
            public boolean m15155OooO0O0() {
                return (this.f15174OooO00o & 2) != 0;
            }

            public CharSequence OooO0OO() {
                return this.f15175OooO00o;
            }

            public C5147OooO0Oo OooO0O0(boolean z) {
                OooO00o(4, z);
                return this;
            }

            public C5147OooO0Oo OooO0OO(boolean z) {
                OooO00o(2, z);
                return this;
            }

            /* renamed from: OooO00o */
            public C5147OooO0Oo clone() {
                C5147OooO0Oo oooO0Oo = new C5147OooO0Oo();
                oooO0Oo.f15174OooO00o = this.f15174OooO00o;
                oooO0Oo.f15175OooO00o = this.f15175OooO00o;
                oooO0Oo.f15176OooO0O0 = this.f15176OooO0O0;
                oooO0Oo.f15177OooO0OO = this.f15177OooO0OO;
                return oooO0Oo;
            }

            public C5147OooO0Oo OooO00o(boolean z) {
                OooO00o(1, z);
                return this;
            }

            private void OooO00o(int i, boolean z) {
                if (z) {
                    this.f15174OooO00o = i | this.f15174OooO00o;
                    return;
                }
                this.f15174OooO00o = (i ^ -1) & this.f15174OooO00o;
            }

            public C5147OooO0Oo OooO00o(CharSequence charSequence) {
                this.f15177OooO0OO = charSequence;
                return this;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public CharSequence m15153OooO00o() {
                return this.f15177OooO0OO;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m15154OooO00o() {
                return (this.f15174OooO00o & 4) != 0;
            }
        }

        public OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
        }

        public OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C8849ooO0OoO0[] ooo0ooo0Arr, C8849ooO0OoO0[] ooo0ooo0Arr2, boolean z) {
            this.f15159OooO00o = i;
            this.f15162OooO00o = C5148OooO0Oo.OooO00o(charSequence);
            this.f15160OooO00o = pendingIntent;
            this.f15161OooO00o = bundle == null ? new Bundle() : bundle;
            this.f15164OooO00o = ooo0ooo0Arr;
            this.OooO0O0 = ooo0ooo0Arr2;
            this.f15163OooO00o = z;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        public int OooO00o() {
            return this.f15159OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        public C8849ooO0OoO0[] OooO0O0() {
            return this.f15164OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m15149OooO00o() {
            return this.f15162OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public PendingIntent m15147OooO00o() {
            return this.f15160OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bundle m15148OooO00o() {
            return this.f15161OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15150OooO00o() {
            return this.f15163OooO00o;
        }

        @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o, com.p118pd.sdk.C8844ooO0Oo0.OooO00o
        public C8849ooO0OoO0[] OooO00o() {
            return this.OooO0O0;
        }
    }

    public static class OooO0O0 extends AbstractC5154OooOOo {
        public Bitmap OooO00o;
        public Bitmap OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f15178OooO0O0;

        public OooO0O0() {
        }

        public OooO0O0 OooO00o(CharSequence charSequence) {
            ((AbstractC5154OooOOo) this).f15223OooO00o = C5148OooO0Oo.OooO00o(charSequence);
            return this;
        }

        public OooO0O0 OooO0O0(CharSequence charSequence) {
            ((AbstractC5154OooOOo) this).OooO0O0 = C5148OooO0Oo.OooO00o(charSequence);
            ((AbstractC5154OooOOo) this).f15224OooO00o = true;
            return this;
        }

        public OooO0O0(C5148OooO0Oo oooO0Oo) {
            OooO00o(oooO0Oo);
        }

        public OooO0O0 OooO00o(Bitmap bitmap) {
            this.OooO0O0 = bitmap;
            this.f15178OooO0O0 = true;
            return this;
        }

        public OooO0O0 OooO0O0(Bitmap bitmap) {
            this.OooO00o = bitmap;
            return this;
        }
    }

    public static class OooO0OO extends AbstractC5154OooOOo {
        public CharSequence OooO0OO;

        public OooO0OO() {
        }

        public OooO0OO OooO00o(CharSequence charSequence) {
            this.OooO0OO = C5148OooO0Oo.OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0O0(CharSequence charSequence) {
            ((AbstractC5154OooOOo) this).f15223OooO00o = C5148OooO0Oo.OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0OO(CharSequence charSequence) {
            this.OooO0O0 = C5148OooO0Oo.OooO00o(charSequence);
            ((AbstractC5154OooOOo) this).f15224OooO00o = true;
            return this;
        }

        public OooO0OO(C5148OooO0Oo oooO0Oo) {
            OooO00o(oooO0Oo);
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO0Oo  reason: case insensitive filesystem */
    public static class C5148OooO0Oo {
        public static final int OooO = 5120;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f15179OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification f15180OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f15181OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public Context f15182OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f15183OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f15184OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f15185OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5154OooOOo f15186OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f15187OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f15188OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<OooO00o> f15189OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f15190OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence[] f15191OooO00o;
        public int OooO0O0;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Notification f15192OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public PendingIntent f15193OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public RemoteViews f15194OooO0O0;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO0O0  reason: collision with other field name */
        public CharSequence f15195OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f15196OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ArrayList<String> f15197OooO0O0;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f15198OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public RemoteViews f15199OooO0OO;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO0OO  reason: collision with other field name */
        public CharSequence f15200OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f15201OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f15202OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public RemoteViews f15203OooO0Oo;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public CharSequence f15204OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public String f15205OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f15206OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f15207OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public String f15208OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f15209OooO0o0;
        public int OooO0oO;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public boolean f15210OooO0oO;
        public int OooO0oo;

        public C5148OooO0Oo(@NonNull Context context, String str) {
            this.f15190OooO00o = true;
            this.f15189OooO00o = new ArrayList<>();
            this.f15209OooO0o0 = false;
            this.OooO0o0 = 0;
            this.OooO0o = 0;
            this.OooO0oO = 0;
            this.OooO0oo = 0;
            Notification notification = new Notification();
            this.f15192OooO0O0 = notification;
            this.f15182OooO00o = context;
            this.f15205OooO0Oo = str;
            notification.when = System.currentTimeMillis();
            this.f15192OooO0O0.audioStreamType = -1;
            this.OooO0O0 = 0;
            this.f15197OooO0O0 = new ArrayList<>();
        }

        public C5148OooO0Oo OooO0O0(CharSequence charSequence) {
            this.f15195OooO0O0 = OooO00o(charSequence);
            return this;
        }

        public C5148OooO0Oo OooO0OO(long j) {
            this.f15192OooO0O0.when = j;
            return this;
        }

        public C5148OooO0Oo OooO0Oo(CharSequence charSequence) {
            this.f15204OooO0Oo = OooO00o(charSequence);
            return this;
        }

        public C5148OooO0Oo OooO0o(boolean z) {
            OooO00o(8, z);
            return this;
        }

        public C5148OooO0Oo OooO0o0(int i) {
            this.OooO00o = i;
            return this;
        }

        public C5148OooO0Oo OooO0oO(boolean z) {
            this.f15190OooO00o = z;
            return this;
        }

        public C5148OooO0Oo OooO0oo(boolean z) {
            this.f15198OooO0O0 = z;
            return this;
        }

        public C5148OooO0Oo OooO00o(int i, int i2) {
            Notification notification = this.f15192OooO0O0;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        public C5148OooO0Oo OooO0O0(PendingIntent pendingIntent) {
            this.f15192OooO0O0.deleteIntent = pendingIntent;
            return this;
        }

        public C5148OooO0Oo OooO0OO(CharSequence charSequence) {
            this.f15187OooO00o = OooO00o(charSequence);
            return this;
        }

        public C5148OooO0Oo OooO0Oo(boolean z) {
            this.f15209OooO0o0 = z;
            return this;
        }

        public C5148OooO0Oo OooO0o(int i) {
            this.OooO0O0 = i;
            return this;
        }

        public C5148OooO0Oo OooO0o0(CharSequence charSequence) {
            this.f15192OooO0O0.tickerText = OooO00o(charSequence);
            return this;
        }

        public C5148OooO0Oo OooO0oO(int i) {
            this.f15192OooO0O0.icon = i;
            return this;
        }

        public C5148OooO0Oo OooO0oo(int i) {
            this.OooO0o = i;
            return this;
        }

        public C5148OooO0Oo OooO0O0(boolean z) {
            this.f15207OooO0o = z;
            this.f15210OooO0oO = true;
            return this;
        }

        public C5148OooO0Oo OooO0OO(int i) {
            Notification notification = this.f15192OooO0O0;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public C5148OooO0Oo OooO0Oo(RemoteViews remoteViews) {
            this.f15203OooO0Oo = remoteViews;
            return this;
        }

        public C5148OooO0Oo OooO0o(String str) {
            this.f15208OooO0o0 = str;
            return this;
        }

        public C5148OooO0Oo OooO0o0(boolean z) {
            OooO00o(2, z);
            return this;
        }

        public C5148OooO0Oo OooO0oO(String str) {
            this.f15196OooO0O0 = str;
            return this;
        }

        public C5148OooO0Oo OooO00o(CharSequence[] charSequenceArr) {
            this.f15191OooO00o = charSequenceArr;
            return this;
        }

        public C5148OooO0Oo OooO0Oo(@NonNull String str) {
            this.f15205OooO0Oo = str;
            return this;
        }

        public C5148OooO0Oo OooO0o0(String str) {
            this.f15188OooO00o = str;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5148OooO0Oo m15161OooO00o(CharSequence charSequence) {
            this.f15200OooO0OO = OooO00o(charSequence);
            return this;
        }

        public C5148OooO0Oo OooO0O0(String str) {
            this.f15201OooO0OO = str;
            return this;
        }

        public C5148OooO0Oo OooO0OO(boolean z) {
            this.f15206OooO0Oo = z;
            return this;
        }

        public C5148OooO0Oo OooO0Oo(int i) {
            this.OooO0oo = i;
            return this;
        }

        public C5148OooO0Oo OooO00o(int i, int i2, boolean z) {
            this.OooO0OO = i;
            this.OooO0Oo = i2;
            this.f15202OooO0OO = z;
            return this;
        }

        public C5148OooO0Oo OooO0O0(Bundle bundle) {
            this.f15184OooO00o = bundle;
            return this;
        }

        public C5148OooO0Oo OooO0OO(RemoteViews remoteViews) {
            this.f15194OooO0O0 = remoteViews;
            return this;
        }

        public C5148OooO0Oo OooO0O0(@ColorInt int i) {
            this.OooO0o0 = i;
            return this;
        }

        @Deprecated
        public C5148OooO0Oo OooO0OO(@NonNull String str) {
            return OooO0Oo(str);
        }

        public C5148OooO0Oo OooO0O0(RemoteViews remoteViews) {
            this.f15199OooO0OO = remoteViews;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0OO() {
            return this.f15203OooO0Oo;
        }

        public C5148OooO0Oo OooO00o(RemoteViews remoteViews) {
            this.f15192OooO0O0.contentView = remoteViews;
            return this;
        }

        public C5148OooO0Oo OooO0O0(long j) {
            this.f15179OooO00o = j;
            return this;
        }

        public C5148OooO0Oo OooO00o(PendingIntent pendingIntent) {
            this.f15181OooO00o = pendingIntent;
            return this;
        }

        @Deprecated
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public Notification m15164OooO0O0() {
            return m15158OooO00o();
        }

        public C5148OooO0Oo OooO00o(PendingIntent pendingIntent, boolean z) {
            this.f15193OooO0O0 = pendingIntent;
            OooO00o(128, z);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public RemoteViews m15165OooO0O0() {
            return this.f15194OooO0O0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int OooO0O0() {
            return this.OooO0O0;
        }

        public C5148OooO0Oo OooO00o(CharSequence charSequence, RemoteViews remoteViews) {
            this.f15192OooO0O0.tickerText = OooO00o(charSequence);
            this.f15185OooO00o = remoteViews;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public CharSequence m15166OooO0O0() {
            return this.f15187OooO00o;
        }

        public C5148OooO0Oo OooO00o(Bitmap bitmap) {
            this.f15183OooO00o = bitmap;
            return this;
        }

        @Deprecated
        public C5148OooO0Oo(Context context) {
            this(context, null);
        }

        public C5148OooO0Oo OooO00o(Uri uri) {
            Notification notification = this.f15192OooO0O0;
            notification.sound = uri;
            notification.audioStreamType = -1;
            return this;
        }

        public C5148OooO0Oo OooO00o(Uri uri, int i) {
            Notification notification = this.f15192OooO0O0;
            notification.sound = uri;
            notification.audioStreamType = i;
            return this;
        }

        public C5148OooO0Oo OooO00o(long[] jArr) {
            this.f15192OooO0O0.vibrate = jArr;
            return this;
        }

        public C5148OooO0Oo OooO00o(@ColorInt int i, int i2, int i3) {
            Notification notification = this.f15192OooO0O0;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f15192OooO0O0;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        public C5148OooO0Oo OooO00o(boolean z) {
            OooO00o(16, z);
            return this;
        }

        private void OooO00o(int i, boolean z) {
            if (z) {
                Notification notification = this.f15192OooO0O0;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f15192OooO0O0;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        public C5148OooO0Oo OooO00o(String str) {
            this.f15197OooO0O0.add(str);
            return this;
        }

        public C5148OooO0Oo OooO00o(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f15184OooO00o;
                if (bundle2 == null) {
                    this.f15184OooO00o = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bundle m15159OooO00o() {
            if (this.f15184OooO00o == null) {
                this.f15184OooO00o = new Bundle();
            }
            return this.f15184OooO00o;
        }

        public C5148OooO0Oo OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f15189OooO00o.add(new OooO00o(i, charSequence, pendingIntent));
            return this;
        }

        public C5148OooO0Oo OooO00o(OooO00o oooO00o) {
            this.f15189OooO00o.add(oooO00o);
            return this;
        }

        public C5148OooO0Oo OooO00o(AbstractC5154OooOOo oooOOo) {
            if (this.f15186OooO00o != oooOOo) {
                this.f15186OooO00o = oooOOo;
                if (oooOOo != null) {
                    oooOOo.OooO00o(this);
                }
            }
            return this;
        }

        public C5148OooO0Oo OooO00o(Notification notification) {
            this.f15180OooO00o = notification;
            return this;
        }

        @Deprecated
        public C5148OooO0Oo OooO00o(long j) {
            return OooO0O0(j);
        }

        public C5148OooO0Oo OooO00o(int i) {
            this.OooO0oO = i;
            return this;
        }

        public C5148OooO0Oo OooO00o(AbstractC5150OooO0oO oooO0oO) {
            oooO0oO.OooO00o(this);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m15158OooO00o() {
            return NotificationCompat.f15123OooO00o.OooO00o(this, m15162OooO00o());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5149OooO0o0 m15162OooO00o() {
            return new C5149OooO0o0();
        }

        public static CharSequence OooO00o(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public RemoteViews m15160OooO00o() {
            return this.f15199OooO0OO;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public long m15157OooO00o() {
            if (this.f15190OooO00o) {
                return this.f15192OooO0O0.when;
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int OooO00o() {
            return this.OooO0o0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m15163OooO00o() {
            return this.f15195OooO0O0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO0o0  reason: case insensitive filesystem */
    public static class C5149OooO0o0 {
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, AbstractC8832ooO0OO ooo0oo) {
            Notification OooO00o = ooo0oo.m20457OooO00o();
            RemoteViews remoteViews = oooO0Oo.f15194OooO0O0;
            if (remoteViews != null) {
                OooO00o.contentView = remoteViews;
            }
            return OooO00o;
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO0oO  reason: case insensitive filesystem */
    public interface AbstractC5150OooO0oO {
        C5148OooO0Oo OooO00o(C5148OooO0Oo oooO0Oo);
    }

    @RequiresApi(24)
    public static class OooOOO extends OooOOO0 {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.C5152OooOO0o, com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0O, com.netease.nimlib.notifier.support26.NotificationCompat.OooOOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            C8845ooO0Oo00.OooO00o oooO00o = new C8845ooO0Oo00.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.f15187OooO00o, oooO0Oo.f15195OooO0O0, oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15190OooO00o, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15201OooO0OO, oooO0Oo.f15197OooO0O0, oooO0Oo.f15184OooO00o, oooO0Oo.OooO0o0, oooO0Oo.OooO0o, oooO0Oo.f15180OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15191OooO00o, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO, oooO0Oo.f15203OooO0Oo, oooO0Oo.OooO0oo);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15186OooO00o);
            Notification OooO00o = oooO0o0.OooO00o(oooO0Oo, oooO00o);
            AbstractC5154OooOOo oooOOo = oooO0Oo.f15186OooO00o;
            if (oooOOo != null) {
                oooOOo.OooO00o(NotificationCompat.m15134OooO00o(OooO00o));
            }
            return OooO00o;
        }
    }

    @RequiresApi(26)
    public static class OooOOOO extends OooOOO {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.C5152OooOO0o, com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0O, com.netease.nimlib.notifier.support26.NotificationCompat.OooOOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo, com.netease.nimlib.notifier.support26.NotificationCompat.OooOOO
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            C9103ooo0oOo.OooO00o oooO00o = new C9103ooo0oOo.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.f15187OooO00o, oooO0Oo.f15195OooO0O0, oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15190OooO00o, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15201OooO0OO, oooO0Oo.f15197OooO0O0, oooO0Oo.f15184OooO00o, oooO0Oo.OooO0o0, oooO0Oo.OooO0o, oooO0Oo.f15180OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15191OooO00o, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO, oooO0Oo.f15203OooO0Oo, oooO0Oo.f15205OooO0Oo, oooO0Oo.OooO0oO, oooO0Oo.f15208OooO0o0, oooO0Oo.f15179OooO00o, oooO0Oo.f15207OooO0o, oooO0Oo.f15210OooO0oO, oooO0Oo.OooO0oo);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15186OooO00o);
            Notification OooO00o = oooO0o0.OooO00o(oooO0Oo, oooO00o);
            AbstractC5154OooOOo oooOOo = oooO0Oo.f15186OooO00o;
            if (oooOOo != null) {
                oooOOo.OooO00o(NotificationCompat.m15134OooO00o(OooO00o));
            }
            return OooO00o;
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOOOo  reason: case insensitive filesystem */
    public static class C5153OooOOOo implements AbstractC5155OooOOo0 {

        /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOOOo$OooO00o */
        public static class OooO00o implements AbstractC8832ooO0OO {
            public Notification.Builder OooO00o;

            public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
                boolean z2 = true;
                Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
                if ((notification.flags & 128) == 0) {
                    z2 = false;
                }
                this.OooO00o = deleteIntent.setFullScreenIntent(pendingIntent2, z2).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
            }

            @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
            public Notification.Builder OooO00o() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
            /* renamed from: OooO00o  reason: collision with other method in class */
            public Notification m15174OooO00o() {
                return this.OooO00o.getNotification();
            }
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            return oooO0o0.OooO00o(oooO0Oo, new OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.m15166OooO0O0(), oooO0Oo.m15163OooO00o(), oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO));
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public Bundle OooO00o(C8844ooO0Oo0.OooO0O0 oooO0O0) {
            return null;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public OooO00o OooO00o(Notification notification, int i) {
            return null;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public C8844ooO0Oo0.OooO0O0 OooO00o(Bundle bundle, C8844ooO0Oo0.OooO0O0.OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
            return null;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public ArrayList<Parcelable> OooO00o(OooO00o[] oooO00oArr) {
            return null;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0
        public OooO00o[] OooO00o(ArrayList<Parcelable> arrayList) {
            return null;
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOOo0  reason: case insensitive filesystem */
    public interface AbstractC5155OooOOo0 {
        Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0);

        Bundle OooO00o(C8844ooO0Oo0.OooO0O0 oooO0O0);

        OooO00o OooO00o(Notification notification, int i);

        C8844ooO0Oo0.OooO0O0 OooO00o(Bundle bundle, C8844ooO0Oo0.OooO0O0.OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2);

        ArrayList<Parcelable> OooO00o(OooO00o[] oooO00oArr);

        OooO00o[] OooO00o(ArrayList<Parcelable> arrayList);
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOOoo  reason: case insensitive filesystem */
    public static final class C5156OooOOoo implements AbstractC5150OooO0oO {
        public static final int OooO = -1;

        /* renamed from: OooO  reason: collision with other field name */
        public static final String f15225OooO = "contentIcon";
        public static final String OooO0OO = "android.wearable.EXTENSIONS";
        public static final String OooO0Oo = "actions";
        public static final String OooO0o = "displayIntent";
        public static final String OooO0o0 = "flags";
        public static final String OooO0oO = "pages";
        public static final String OooO0oo = "background";
        public static final int OooOO0 = 0;

        /* renamed from: OooOO0  reason: collision with other field name */
        public static final String f15226OooOO0 = "contentIconGravity";
        public static final int OooOO0O = 1;

        /* renamed from: OooOO0O  reason: collision with other field name */
        public static final String f15227OooOO0O = "contentActionIndex";
        public static final int OooOO0o = 2;

        /* renamed from: OooOO0o  reason: collision with other field name */
        public static final String f15228OooOO0o = "customSizePreset";
        public static final int OooOOO = 4;

        /* renamed from: OooOOO  reason: collision with other field name */
        public static final String f15229OooOOO = "gravity";
        public static final int OooOOO0 = 3;

        /* renamed from: OooOOO0  reason: collision with other field name */
        public static final String f15230OooOOO0 = "customContentHeight";
        public static final int OooOOOO = 5;

        /* renamed from: OooOOOO  reason: collision with other field name */
        public static final String f15231OooOOOO = "hintScreenTimeout";
        public static final int OooOOOo = 0;

        /* renamed from: OooOOOo  reason: collision with other field name */
        public static final String f15232OooOOOo = "dismissalId";
        public static final int OooOOo = 1;
        public static final int OooOOo0 = -1;

        /* renamed from: OooOOo0  reason: collision with other field name */
        public static final String f15233OooOOo0 = "bridgeTag";
        public static final int OooOOoo = 2;
        public static final int OooOo = 64;
        public static final int OooOo0 = 8;
        public static final int OooOo00 = 4;
        public static final int OooOo0O = 16;
        public static final int OooOo0o = 32;
        public static final int OooOoO = 8388613;
        public static final int OooOoO0 = 1;
        public static final int OooOoOO = 80;
        public int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f15234OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f15235OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f15236OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<OooO00o> f15237OooO00o = new ArrayList<>();
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f15238OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ArrayList<Notification> f15239OooO0O0 = new ArrayList<>();

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f15240OooO0OO = 8388613;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public int f15241OooO0Oo = -1;

        /* renamed from: OooO0o  reason: collision with other field name */
        public int f15242OooO0o;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public int f15243OooO0o0 = 0;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public int f15244OooO0oO = 80;

        /* renamed from: OooO0oo  reason: collision with other field name */
        public int f15245OooO0oo;

        public C5156OooOOoo() {
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5150OooO0oO
        public C5148OooO0Oo OooO00o(C5148OooO0Oo oooO0Oo) {
            Bundle bundle = new Bundle();
            if (!this.f15237OooO00o.isEmpty()) {
                AbstractC5155OooOOo0 oooOOo0 = NotificationCompat.f15123OooO00o;
                ArrayList<OooO00o> arrayList = this.f15237OooO00o;
                bundle.putParcelableArrayList("actions", oooOOo0.OooO00o((OooO00o[]) arrayList.toArray(new OooO00o[arrayList.size()])));
            }
            int i = this.OooO00o;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f15234OooO00o;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f15239OooO0O0.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f15239OooO0O0;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f15235OooO00o;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.OooO0O0;
            if (i2 != 0) {
                bundle.putInt("contentIcon", i2);
            }
            int i3 = this.f15240OooO0OO;
            if (i3 != 8388613) {
                bundle.putInt("contentIconGravity", i3);
            }
            int i4 = this.f15241OooO0Oo;
            if (i4 != -1) {
                bundle.putInt("contentActionIndex", i4);
            }
            int i5 = this.f15243OooO0o0;
            if (i5 != 0) {
                bundle.putInt("customSizePreset", i5);
            }
            int i6 = this.f15242OooO0o;
            if (i6 != 0) {
                bundle.putInt("customContentHeight", i6);
            }
            int i7 = this.f15244OooO0oO;
            if (i7 != 80) {
                bundle.putInt("gravity", i7);
            }
            int i8 = this.f15245OooO0oo;
            if (i8 != 0) {
                bundle.putInt("hintScreenTimeout", i8);
            }
            String str = this.f15236OooO00o;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f15238OooO0O0;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            oooO0Oo.m15159OooO00o().putBundle("android.wearable.EXTENSIONS", bundle);
            return oooO0Oo;
        }

        public C5156OooOOoo OooO0O0(List<Notification> list) {
            this.f15239OooO0O0.addAll(list);
            return this;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public C5156OooOOoo clone() {
            C5156OooOOoo oooOOoo = new C5156OooOOoo();
            oooOOoo.f15237OooO00o = new ArrayList<>(this.f15237OooO00o);
            oooOOoo.OooO00o = this.OooO00o;
            oooOOoo.f15234OooO00o = this.f15234OooO00o;
            oooOOoo.f15239OooO0O0 = new ArrayList<>(this.f15239OooO0O0);
            oooOOoo.f15235OooO00o = this.f15235OooO00o;
            oooOOoo.OooO0O0 = this.OooO0O0;
            oooOOoo.f15240OooO0OO = this.f15240OooO0OO;
            oooOOoo.f15241OooO0Oo = this.f15241OooO0Oo;
            oooOOoo.f15243OooO0o0 = this.f15243OooO0o0;
            oooOOoo.f15242OooO0o = this.f15242OooO0o;
            oooOOoo.f15244OooO0oO = this.f15244OooO0oO;
            oooOOoo.f15245OooO0oo = this.f15245OooO0oo;
            oooOOoo.f15236OooO00o = this.f15236OooO00o;
            oooOOoo.f15238OooO0O0 = this.f15238OooO0O0;
            return oooOOoo;
        }

        public C5156OooOOoo OooO0Oo(int i) {
            this.f15242OooO0o = i;
            return this;
        }

        public C5156OooOOoo OooO0o(int i) {
            this.f15244OooO0oO = i;
            return this;
        }

        public C5156OooOOoo OooO0o0(int i) {
            this.f15243OooO0o0 = i;
            return this;
        }

        public C5156OooOOoo OooO0oO(boolean z) {
            OooO00o(8, z);
            return this;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public C5156OooOOoo m15181OooO0O0() {
            this.f15239OooO0O0.clear();
            return this;
        }

        public int OooO0Oo() {
            return this.f15242OooO0o;
        }

        public int OooO0o() {
            return this.f15244OooO0oO;
        }

        public int OooO0o0() {
            return this.f15243OooO0o0;
        }

        /* renamed from: OooO0oO  reason: collision with other method in class */
        public boolean m15190OooO0oO() {
            return (this.OooO00o & 8) != 0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public List<Notification> m15183OooO0O0() {
            return this.f15239OooO0O0;
        }

        public C5156OooOOoo OooO0Oo(boolean z) {
            OooO00o(64, z);
            return this;
        }

        public C5156OooOOoo OooO0o(boolean z) {
            OooO00o(4, z);
            return this;
        }

        public C5156OooOOoo OooO0o0(boolean z) {
            OooO00o(2, z);
            return this;
        }

        public C5156OooOOoo OooO0oO(int i) {
            this.f15245OooO0oo = i;
            return this;
        }

        public C5156OooOOoo OooO0O0(int i) {
            this.OooO0O0 = i;
            return this;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public boolean m15187OooO0Oo() {
            return (this.OooO00o & 64) != 0;
        }

        /* renamed from: OooO0o  reason: collision with other method in class */
        public boolean m15188OooO0o() {
            return (this.OooO00o & 4) != 0;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public boolean m15189OooO0o0() {
            return (this.OooO00o & 2) != 0;
        }

        public int OooO0oO() {
            return this.f15245OooO0oo;
        }

        public int OooO0O0() {
            return this.OooO0O0;
        }

        public C5156OooOOoo OooO0O0(boolean z) {
            OooO00o(32, z);
            return this;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m15184OooO0O0() {
            return (this.OooO00o & 32) != 0;
        }

        public C5156OooOOoo OooO0O0(String str) {
            this.f15236OooO00o = str;
            return this;
        }

        public C5156OooOOoo(Notification notification) {
            Bundle OooO00o2 = NotificationCompat.m15134OooO00o(notification);
            Bundle bundle = OooO00o2 != null ? OooO00o2.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                OooO00o[] OooO00o3 = NotificationCompat.f15123OooO00o.OooO00o(bundle.getParcelableArrayList("actions"));
                if (OooO00o3 != null) {
                    Collections.addAll(this.f15237OooO00o, OooO00o3);
                }
                this.OooO00o = bundle.getInt("flags", 1);
                this.f15234OooO00o = (PendingIntent) bundle.getParcelable("displayIntent");
                Notification[] OooO00o4 = NotificationCompat.OooO00o(bundle, "pages");
                if (OooO00o4 != null) {
                    Collections.addAll(this.f15239OooO0O0, OooO00o4);
                }
                this.f15235OooO00o = (Bitmap) bundle.getParcelable("background");
                this.OooO0O0 = bundle.getInt("contentIcon");
                this.f15240OooO0OO = bundle.getInt("contentIconGravity", 8388613);
                this.f15241OooO0Oo = bundle.getInt("contentActionIndex", -1);
                this.f15243OooO0o0 = bundle.getInt("customSizePreset", 0);
                this.f15242OooO0o = bundle.getInt("customContentHeight");
                this.f15244OooO0oO = bundle.getInt("gravity", 80);
                this.f15245OooO0oo = bundle.getInt("hintScreenTimeout");
                this.f15236OooO00o = bundle.getString("dismissalId");
                this.f15238OooO0O0 = bundle.getString("bridgeTag");
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public String m15182OooO0O0() {
            return this.f15236OooO00o;
        }

        public C5156OooOOoo OooO0OO(int i) {
            this.f15240OooO0OO = i;
            return this;
        }

        public int OooO0OO() {
            return this.f15240OooO0OO;
        }

        public C5156OooOOoo OooO0OO(boolean z) {
            OooO00o(16, z);
            return this;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m15186OooO0OO() {
            return (this.OooO00o & 16) != 0;
        }

        public C5156OooOOoo OooO00o(OooO00o oooO00o) {
            this.f15237OooO00o.add(oooO00o);
            return this;
        }

        public C5156OooOOoo OooO00o(List<OooO00o> list) {
            this.f15237OooO00o.addAll(list);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5156OooOOoo m15177OooO00o() {
            this.f15237OooO00o.clear();
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<OooO00o> m15179OooO00o() {
            return this.f15237OooO00o;
        }

        public C5156OooOOoo OooO00o(PendingIntent pendingIntent) {
            this.f15234OooO00o = pendingIntent;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public PendingIntent m15175OooO00o() {
            return this.f15234OooO00o;
        }

        public C5156OooOOoo OooO00o(Notification notification) {
            this.f15239OooO0O0.add(notification);
            return this;
        }

        public C5156OooOOoo OooO00o(Bitmap bitmap) {
            this.f15235OooO00o = bitmap;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bitmap m15176OooO00o() {
            return this.f15235OooO00o;
        }

        public C5156OooOOoo OooO00o(int i) {
            this.f15241OooO0Oo = i;
            return this;
        }

        public int OooO00o() {
            return this.f15241OooO0Oo;
        }

        public C5156OooOOoo OooO00o(boolean z) {
            OooO00o(1, z);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15180OooO00o() {
            return (this.OooO00o & 1) != 0;
        }

        public C5156OooOOoo OooO00o(String str) {
            this.f15238OooO0O0 = str;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m15178OooO00o() {
            return this.f15238OooO0O0;
        }

        private void OooO00o(int i, boolean z) {
            if (z) {
                this.OooO00o = i | this.OooO00o;
                return;
            }
            this.OooO00o = (i ^ -1) & this.OooO00o;
        }
    }

    static {
        if (C8854ooO0OooO.OooO0OO()) {
            f15123OooO00o = new OooOOOO();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            f15123OooO00o = new OooOOO();
        } else if (i >= 21) {
            f15123OooO00o = new OooOOO0();
        } else if (i >= 20) {
            f15123OooO00o = new C5152OooOO0o();
        } else if (i >= 19) {
            f15123OooO00o = new OooOO0O();
        } else if (i >= 16) {
            f15123OooO00o = new OooOO0();
        } else {
            f15123OooO00o = new C5153OooOOOo();
        }
    }

    public static void OooO00o(AbstractC8836ooO0OO0o ooo0oo0o, ArrayList<OooO00o> arrayList) {
        Iterator<OooO00o> it = arrayList.iterator();
        while (it.hasNext()) {
            ooo0oo0o.OooO00o(it.next());
        }
    }

    @RequiresApi(16)
    public static void OooO0O0(AbstractC8832ooO0OO ooo0oo, AbstractC5154OooOOo oooOOo) {
        if (oooOOo == null) {
            return;
        }
        if (oooOOo instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) oooOOo;
            C8847ooO0Oo0o.OooO00o(ooo0oo, ((AbstractC5154OooOOo) oooO0OO).f15223OooO00o, ((AbstractC5154OooOOo) oooO0OO).f15224OooO00o, oooO0OO.OooO0O0, oooO0OO.OooO0OO);
        } else if (oooOOo instanceof C5151OooO0oo) {
            C5151OooO0oo oooO0oo = (C5151OooO0oo) oooOOo;
            C8847ooO0Oo0o.OooO00o(ooo0oo, ((AbstractC5154OooOOo) oooO0oo).f15223OooO00o, ((AbstractC5154OooOOo) oooO0oo).f15224OooO00o, oooO0oo.OooO0O0, oooO0oo.OooO00o);
        } else if (oooOOo instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) oooOOo;
            C8847ooO0Oo0o.OooO00o(ooo0oo, ((AbstractC5154OooOOo) oooO0O0).f15223OooO00o, ((AbstractC5154OooOOo) oooO0O0).f15224OooO00o, ((AbstractC5154OooOOo) oooO0O0).OooO0O0, oooO0O0.OooO00o, oooO0O0.OooO0O0, oooO0O0.f15178OooO0O0);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m15140OooO0OO(Notification notification) {
        if (C8854ooO0OooO.OooO0OO()) {
            return notification.getChannelId();
        }
        return null;
    }

    public static String OooO0Oo(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getGroup();
        }
        if (i >= 19) {
            return notification.extras.getString("android.support.groupKey");
        }
        if (i >= 16) {
            return C8847ooO0Oo0o.m20479OooO00o(notification).getString("android.support.groupKey");
        }
        return null;
    }

    public static String OooO0o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getSortKey();
        }
        if (i >= 19) {
            return notification.extras.getString("android.support.sortKey");
        }
        if (i >= 16) {
            return C8847ooO0Oo0o.m20479OooO00o(notification).getString("android.support.sortKey");
        }
        return null;
    }

    public static String OooO0o0(Notification notification) {
        if (C8854ooO0OooO.OooO0OO()) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static final class OooO0o implements AbstractC5150OooO0oO {
        public static final String OooO00o = "CarExtender";
        public static final String OooO0O0 = "android.car.EXTENSIONS";
        public static final String OooO0OO = "large_icon";
        public static final String OooO0Oo = "car_conversation";
        public static final String OooO0o0 = "app_color";

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f15211OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f15212OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o f15213OooO00o;

        public static class OooO00o extends C8844ooO0Oo0.OooO0O0 {
            public static final C8844ooO0Oo0.OooO0O0.OooO00o OooO00o = new C4908OooO00o();

            /* renamed from: OooO00o  reason: collision with other field name */
            public final long f15214OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final PendingIntent f15215OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final C8849ooO0OoO0 f15216OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final String[] f15217OooO00o;
            public final PendingIntent OooO0O0;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public final String[] f15218OooO0O0;

            /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO0o$OooO00o$OooO00o  reason: collision with other inner class name */
            public static class C4908OooO00o implements C8844ooO0Oo0.OooO0O0.OooO00o {
                @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0.OooO00o
                public OooO00o OooO00o(String[] strArr, C8852ooO0OoOo.OooO00o oooO00o, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                    return new OooO00o(strArr, (C8849ooO0OoO0) oooO00o, pendingIntent, pendingIntent2, strArr2, j);
                }
            }

            public static class OooO0O0 {
                public long OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public PendingIntent f15219OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public C8849ooO0OoO0 f15220OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public final String f15221OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public final List<String> f15222OooO00o = new ArrayList();
                public PendingIntent OooO0O0;

                public OooO0O0(String str) {
                    this.f15221OooO00o = str;
                }

                public OooO0O0 OooO00o(String str) {
                    this.f15222OooO00o.add(str);
                    return this;
                }

                public OooO0O0 OooO00o(PendingIntent pendingIntent, C8849ooO0OoO0 ooo0ooo0) {
                    this.f15220OooO00o = ooo0ooo0;
                    this.OooO0O0 = pendingIntent;
                    return this;
                }

                public OooO0O0 OooO00o(PendingIntent pendingIntent) {
                    this.f15219OooO00o = pendingIntent;
                    return this;
                }

                public OooO0O0 OooO00o(long j) {
                    this.OooO00o = j;
                    return this;
                }

                public OooO00o OooO00o() {
                    List<String> list = this.f15222OooO00o;
                    return new OooO00o((String[]) list.toArray(new String[list.size()]), this.f15220OooO00o, this.OooO0O0, this.f15219OooO00o, new String[]{this.f15221OooO00o}, this.OooO00o);
                }
            }

            public OooO00o(String[] strArr, C8849ooO0OoO0 ooo0ooo0, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f15217OooO00o = strArr;
                this.f15216OooO00o = ooo0ooo0;
                this.OooO0O0 = pendingIntent2;
                this.f15215OooO00o = pendingIntent;
                this.f15218OooO0O0 = strArr2;
                this.f15214OooO00o = j;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            public PendingIntent OooO0O0() {
                return this.f15215OooO00o;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String[] m15172OooO00o() {
                return this.f15217OooO00o;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            /* renamed from: OooO0O0  reason: collision with other method in class */
            public String[] m15173OooO0O0() {
                return this.f15218OooO0O0;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            public C8849ooO0OoO0 OooO00o() {
                return this.f15216OooO00o;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public PendingIntent m15169OooO00o() {
                return this.OooO0O0;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m15171OooO00o() {
                String[] strArr = this.f15218OooO0O0;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Override // com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0, com.p118pd.sdk.C8844ooO0Oo0.OooO0O0
            public long OooO00o() {
                return this.f15214OooO00o;
            }
        }

        public OooO0o() {
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5150OooO0oO
        public C5148OooO0Oo OooO00o(C5148OooO0Oo oooO0Oo) {
            if (Build.VERSION.SDK_INT < 21) {
                return oooO0Oo;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f15212OooO00o;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f15211OooO00o;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            OooO00o oooO00o = this.f15213OooO00o;
            if (oooO00o != null) {
                bundle.putBundle("car_conversation", NotificationCompat.f15123OooO00o.OooO00o(oooO00o));
            }
            oooO0Oo.m15159OooO00o().putBundle("android.car.EXTENSIONS", bundle);
            return oooO0Oo;
        }

        public OooO0o(Notification notification) {
            Bundle bundle;
            if (Build.VERSION.SDK_INT >= 21) {
                if (NotificationCompat.m15134OooO00o(notification) == null) {
                    bundle = null;
                } else {
                    bundle = NotificationCompat.m15134OooO00o(notification).getBundle("android.car.EXTENSIONS");
                }
                if (bundle != null) {
                    this.f15212OooO00o = (Bitmap) bundle.getParcelable("large_icon");
                    this.f15211OooO00o = bundle.getInt("app_color", 0);
                    this.f15213OooO00o = (OooO00o) NotificationCompat.f15123OooO00o.OooO00o(bundle.getBundle("car_conversation"), OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
                }
            }
        }

        public OooO0o OooO00o(@ColorInt int i) {
            this.f15211OooO00o = i;
            return this;
        }

        @ColorInt
        public int OooO00o() {
            return this.f15211OooO00o;
        }

        public OooO0o OooO00o(Bitmap bitmap) {
            this.f15212OooO00o = bitmap;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bitmap m15167OooO00o() {
            return this.f15212OooO00o;
        }

        public OooO0o OooO00o(OooO00o oooO00o) {
            this.f15213OooO00o = oooO00o;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO00o m15168OooO00o() {
            return this.f15213OooO00o;
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooO0oo  reason: case insensitive filesystem */
    public static class C5151OooO0oo extends AbstractC5154OooOOo {
        public ArrayList<CharSequence> OooO00o = new ArrayList<>();

        public C5151OooO0oo() {
        }

        public C5151OooO0oo OooO00o(CharSequence charSequence) {
            this.OooO00o.add(C5148OooO0Oo.OooO00o(charSequence));
            return this;
        }

        public C5151OooO0oo OooO0O0(CharSequence charSequence) {
            ((AbstractC5154OooOOo) this).f15223OooO00o = C5148OooO0Oo.OooO00o(charSequence);
            return this;
        }

        public C5151OooO0oo OooO0OO(CharSequence charSequence) {
            this.OooO0O0 = C5148OooO0Oo.OooO00o(charSequence);
            ((AbstractC5154OooOOo) this).f15224OooO00o = true;
            return this;
        }

        public C5151OooO0oo(C5148OooO0Oo oooO0Oo) {
            OooO00o(oooO0Oo);
        }
    }

    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOOo  reason: case insensitive filesystem */
    public static abstract class AbstractC5154OooOOo {
        public C5148OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f15223OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f15224OooO00o = false;
        public CharSequence OooO0O0;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(Bundle bundle) {
        }

        public void OooO00o(C5148OooO0Oo oooO0Oo) {
            if (this.OooO00o != oooO0Oo) {
                this.OooO00o = oooO0Oo;
                if (oooO0Oo != null) {
                    oooO0Oo.OooO00o(this);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO0O0(Bundle bundle) {
        }

        public Notification OooO00o() {
            C5148OooO0Oo oooO0Oo = this.OooO00o;
            if (oooO0Oo != null) {
                return oooO0Oo.m15158OooO00o();
            }
            return null;
        }
    }

    @RequiresApi(24)
    public static void OooO00o(AbstractC8832ooO0OO ooo0oo, AbstractC5154OooOOo oooOOo) {
        if (oooOOo == null) {
            return;
        }
        if (oooOOo instanceof OooO) {
            OooO oooO = (OooO) oooOOo;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (OooO.OooO00o oooO00o : oooO.f15153OooO00o) {
                arrayList.add(oooO00o.m15146OooO0O0());
                arrayList2.add(Long.valueOf(oooO00o.OooO00o()));
                arrayList3.add(oooO00o.m15144OooO00o());
                arrayList4.add(oooO00o.m15145OooO00o());
                arrayList5.add(oooO00o.m15142OooO00o());
            }
            C8845ooO0Oo00.OooO00o(ooo0oo, oooO.OooO0OO, oooO.OooO0Oo, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        OooO0O0(ooo0oo, oooOOo);
    }

    public static int OooO0OO(Notification notification) {
        if (C8854ooO0OooO.OooO0OO()) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @RequiresApi(19)
    public static class OooOO0O extends OooOO0 {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            C8843ooO0Oo.OooO00o oooO00o = new C8843ooO0Oo.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.m15166OooO0O0(), oooO0Oo.m15163OooO00o(), oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15190OooO00o, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15197OooO0O0, oooO0Oo.f15184OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO0O0(oooO00o, oooO0Oo.f15186OooO00o);
            return oooO0o0.OooO00o(oooO0Oo, oooO00o);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public OooO00o OooO00o(Notification notification, int i) {
            return (OooO00o) C8843ooO0Oo.OooO00o(notification, i, OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
        }
    }

    @RequiresApi(16)
    public static class OooOO0 extends C5153OooOOOo {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            Bundle OooO00o;
            C8847ooO0Oo0o.OooO00o oooO00o = new C8847ooO0Oo0o.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.m15166OooO0O0(), oooO0Oo.m15163OooO00o(), oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15184OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO0O0(oooO00o, oooO0Oo.f15186OooO00o);
            Notification OooO00o2 = oooO0o0.OooO00o(oooO0Oo, oooO00o);
            if (!(oooO0Oo.f15186OooO00o == null || (OooO00o = NotificationCompat.m15134OooO00o(OooO00o2)) == null)) {
                oooO0Oo.f15186OooO00o.OooO00o(OooO00o);
            }
            return OooO00o2;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public OooO00o OooO00o(Notification notification, int i) {
            return (OooO00o) C8847ooO0Oo0o.OooO00o(notification, i, OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public OooO00o[] OooO00o(ArrayList<Parcelable> arrayList) {
            return (OooO00o[]) C8847ooO0Oo0o.OooO00o(arrayList, OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public ArrayList<Parcelable> OooO00o(OooO00o[] oooO00oArr) {
            return C8847ooO0Oo0o.OooO00o(oooO00oArr);
        }
    }

    @RequiresApi(20)
    /* renamed from: com.netease.nimlib.notifier.support26.NotificationCompat$OooOO0o  reason: case insensitive filesystem */
    public static class C5152OooOO0o extends OooOO0O {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0O, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            C8838ooO0OOO0.OooO00o oooO00o = new C8838ooO0OOO0.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.m15166OooO0O0(), oooO0Oo.m15163OooO00o(), oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15190OooO00o, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15197OooO0O0, oooO0Oo.f15184OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO, oooO0Oo.OooO0oo);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO0O0(oooO00o, oooO0Oo.f15186OooO00o);
            Notification OooO00o = oooO0o0.OooO00o(oooO0Oo, oooO00o);
            AbstractC5154OooOOo oooOOo = oooO0Oo.f15186OooO00o;
            if (oooOOo != null) {
                oooOOo.OooO00o(NotificationCompat.m15134OooO00o(OooO00o));
            }
            return OooO00o;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0O, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public OooO00o OooO00o(Notification notification, int i) {
            return (OooO00o) C8838ooO0OOO0.OooO00o(notification, i, OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public OooO00o[] OooO00o(ArrayList<Parcelable> arrayList) {
            return (OooO00o[]) C8838ooO0OOO0.OooO00o(arrayList, OooO00o.OooO00o, C8849ooO0OoO0.f22056OooO00o);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public ArrayList<Parcelable> OooO00o(OooO00o[] oooO00oArr) {
            return C8838ooO0OOO0.OooO00o(oooO00oArr);
        }
    }

    @RequiresApi(21)
    public static class OooOOO0 extends C5152OooOO0o {
        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0, com.netease.nimlib.notifier.support26.NotificationCompat.C5152OooOO0o, com.netease.nimlib.notifier.support26.NotificationCompat.OooOO0O, com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Notification OooO00o(C5148OooO0Oo oooO0Oo, C5149OooO0o0 oooO0o0) {
            C8839ooO0OOOo.OooO00o oooO00o = new C8839ooO0OOOo.OooO00o(oooO0Oo.f15182OooO00o, oooO0Oo.f15192OooO0O0, oooO0Oo.m15166OooO0O0(), oooO0Oo.m15163OooO00o(), oooO0Oo.f15200OooO0OO, oooO0Oo.f15185OooO00o, oooO0Oo.OooO00o, oooO0Oo.f15181OooO00o, oooO0Oo.f15193OooO0O0, oooO0Oo.f15183OooO00o, oooO0Oo.OooO0OO, oooO0Oo.OooO0Oo, oooO0Oo.f15202OooO0OO, oooO0Oo.f15190OooO00o, oooO0Oo.f15198OooO0O0, oooO0Oo.OooO0O0, oooO0Oo.f15204OooO0Oo, oooO0Oo.f15209OooO0o0, oooO0Oo.f15201OooO0OO, oooO0Oo.f15197OooO0O0, oooO0Oo.f15184OooO00o, oooO0Oo.OooO0o0, oooO0Oo.OooO0o, oooO0Oo.f15180OooO00o, oooO0Oo.f15188OooO00o, oooO0Oo.f15206OooO0Oo, oooO0Oo.f15196OooO0O0, oooO0Oo.f15194OooO0O0, oooO0Oo.f15199OooO0OO, oooO0Oo.f15203OooO0Oo, oooO0Oo.OooO0oo);
            NotificationCompat.OooO00o(oooO00o, oooO0Oo.f15189OooO00o);
            NotificationCompat.OooO0O0(oooO00o, oooO0Oo.f15186OooO00o);
            Notification OooO00o = oooO0o0.OooO00o(oooO0Oo, oooO00o);
            AbstractC5154OooOOo oooOOo = oooO0Oo.f15186OooO00o;
            if (oooOOo != null) {
                oooOOo.OooO00o(NotificationCompat.m15134OooO00o(OooO00o));
            }
            return OooO00o;
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public Bundle OooO00o(C8844ooO0Oo0.OooO0O0 oooO0O0) {
            return C8839ooO0OOOo.OooO00o(oooO0O0);
        }

        @Override // com.netease.nimlib.notifier.support26.NotificationCompat.AbstractC5155OooOOo0, com.netease.nimlib.notifier.support26.NotificationCompat.C5153OooOOOo
        public C8844ooO0Oo0.OooO0O0 OooO00o(Bundle bundle, C8844ooO0Oo0.OooO0O0.OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
            return C8839ooO0OOOo.OooO00o(bundle, oooO00o, oooO00o2);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m15139OooO0O0(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if ((notification.flags & 512) != 0) {
                return true;
            }
            return false;
        } else if (i >= 19) {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        } else {
            if (i >= 16) {
                return C8847ooO0Oo0o.m20479OooO00o(notification).getBoolean("android.support.isGroupSummary");
            }
            return false;
        }
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m15138OooO0O0(Notification notification) {
        return m15140OooO0OO(notification);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long m15137OooO0O0(Notification notification) {
        if (C8854ooO0OooO.OooO0OO()) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    public static int OooO0O0(Notification notification) {
        if (C8854ooO0OooO.OooO0OO()) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static Notification[] OooO00o(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m15134OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C8847ooO0Oo0o.m20479OooO00o(notification);
        }
        return null;
    }

    public static int OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null) {
                return actionArr.length;
            }
            return 0;
        } else if (i >= 16) {
            return C8847ooO0Oo0o.OooO00o(notification);
        } else {
            return 0;
        }
    }

    public static OooO00o OooO00o(Notification notification, int i) {
        return f15123OooO00o.OooO00o(notification, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15135OooO00o(Notification notification) {
        if (Build.VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15136OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if ((notification.flags & 256) != 0) {
                return true;
            }
            return false;
        } else if (i >= 19) {
            return notification.extras.getBoolean("android.support.localOnly");
        } else {
            if (i >= 16) {
                return C8847ooO0Oo0o.m20479OooO00o(notification).getBoolean("android.support.localOnly");
            }
            return false;
        }
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15133OooO00o(Notification notification) {
        return m15137OooO0O0(notification);
    }
}
