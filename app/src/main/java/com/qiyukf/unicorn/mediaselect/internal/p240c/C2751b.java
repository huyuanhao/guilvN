package com.qiyukf.unicorn.mediaselect.internal.p240c;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.p118pd.sdk.C7226o00ooO00;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p239b.C2748b;
import java.lang.ref.WeakReference;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.c.b */
public final class C2751b implements AbstractC7221o00oo0o.OooO00o<Cursor> {

    /* renamed from: a */
    public WeakReference<Context> f5711a;

    /* renamed from: b */
    public AbstractC7221o00oo0o f5712b;

    /* renamed from: c */
    public AbstractC2752a f5713c;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.c.b$a */
    public interface AbstractC2752a {
        void onAlbumMediaLoad(Cursor cursor);

        void onAlbumMediaReset();
    }

    /* renamed from: a */
    public final void mo36531a() {
        AbstractC7221o00oo0o o00oo0o = this.f5712b;
        if (o00oo0o != null) {
            o00oo0o.m18706OooO00o(2);
        }
        this.f5713c = null;
    }

    /* renamed from: a */
    public final void mo36532a(@NonNull FragmentActivity fragmentActivity, @NonNull AbstractC2752a aVar) {
        this.f5711a = new WeakReference<>(fragmentActivity);
        this.f5712b = fragmentActivity.getSupportLoaderManager();
        this.f5713c = aVar;
    }

    /* renamed from: a */
    public final void mo36533a(@Nullable C2739a aVar) {
        mo36534a(aVar, false);
    }

    /* renamed from: a */
    public final void mo36534a(@Nullable C2739a aVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", aVar);
        bundle.putBoolean("args_enable_capture", z);
        this.f5712b.OooO00o(2, bundle, this);
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final C7226o00ooO00<Cursor> onCreateLoader(int i, Bundle bundle) {
        C2739a aVar;
        Context context = this.f5711a.get();
        if (context == null || (aVar = (C2739a) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z = false;
        if (aVar.mo36507e() && bundle.getBoolean("args_enable_capture", false)) {
            z = true;
        }
        return C2748b.m6348a(context, aVar, z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.pd.sdk.o00ooO00, java.lang.Object] */
    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final /* synthetic */ void onLoadFinished(C7226o00ooO00<Cursor> o00ooo00, Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f5711a.get() != null) {
            this.f5713c.onAlbumMediaLoad(cursor2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final void onLoaderReset(C7226o00ooO00<Cursor> o00ooo00) {
        if (this.f5711a.get() != null) {
            this.f5713c.onAlbumMediaReset();
        }
    }
}
