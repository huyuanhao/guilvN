package com.p118pd.sdk;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.o00Ooo0O  reason: case insensitive filesystem */
public final class C7134o00Ooo0O {
    public final OooO0OO OooO00o;

    @RequiresApi(25)
    /* renamed from: com.pd.sdk.o00Ooo0O$OooO00o */
    public static final class OooO00o implements OooO0OO {
        @NonNull
        public final InputContentInfo OooO00o;

        public OooO00o(@NonNull Object obj) {
            this.OooO00o = (InputContentInfo) obj;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @NonNull
        public ClipDescription OooO00o() {
            return this.OooO00o.getDescription();
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @NonNull
        public Uri OooO0O0() {
            return this.OooO00o.getContentUri();
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Uri m18484OooO00o() {
            return this.OooO00o.getLinkUri();
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m18487OooO0O0() {
            this.OooO00o.requestPermission();
        }

        public OooO00o(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.OooO00o = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object m18485OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18486OooO00o() {
            this.OooO00o.releasePermission();
        }
    }

    /* renamed from: com.pd.sdk.o00Ooo0O$OooO0O0 */
    public static final class OooO0O0 implements OooO0OO {
        @NonNull
        public final ClipDescription OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Uri f19481OooO00o;
        @Nullable
        public final Uri OooO0O0;

        public OooO0O0(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f19481OooO00o = uri;
            this.OooO00o = clipDescription;
            this.OooO0O0 = uri2;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @NonNull
        public ClipDescription OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object m18489OooO00o() {
            return null;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18490OooO00o() {
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @NonNull
        public Uri OooO0O0() {
            return this.f19481OooO00o;
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m18491OooO0O0() {
        }

        @Override // com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO, com.p118pd.sdk.C7134o00Ooo0O.OooO0OO
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Uri m18488OooO00o() {
            return this.OooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.o00Ooo0O$OooO0OO */
    public interface OooO0OO {
        @NonNull
        ClipDescription OooO00o();

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        Uri m18492OooO00o();

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        Object m18493OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        void m18494OooO00o();

        @NonNull
        Uri OooO0O0();

        /* renamed from: OooO0O0  reason: collision with other method in class */
        void m18495OooO0O0();
    }

    public C7134o00Ooo0O(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.OooO00o = new OooO00o(uri, clipDescription, uri2);
        } else {
            this.OooO00o = new OooO0O0(uri, clipDescription, uri2);
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Uri m18480OooO00o() {
        return this.OooO00o.OooO0O0();
    }

    @Nullable
    public Uri OooO0O0() {
        return this.OooO00o.m18492OooO00o();
    }

    @NonNull
    public ClipDescription OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18483OooO0O0() {
        this.OooO00o.m18495OooO0O0();
    }

    @Nullable
    public static C7134o00Ooo0O OooO00o(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C7134o00Ooo0O(new OooO00o(obj));
        }
        return null;
    }

    public C7134o00Ooo0O(@NonNull OooO0OO oooO0OO) {
        this.OooO00o = oooO0OO;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18481OooO00o() {
        return this.OooO00o.m18493OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18482OooO00o() {
        this.OooO00o.m18494OooO00o();
    }
}
