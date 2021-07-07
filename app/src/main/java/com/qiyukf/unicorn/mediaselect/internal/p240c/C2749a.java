package com.qiyukf.unicorn.mediaselect.internal.p240c;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.p118pd.sdk.C7226o00ooO00;
import com.qiyukf.unicorn.mediaselect.internal.p239b.C2747a;
import java.lang.ref.WeakReference;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.c.a */
public final class C2749a implements AbstractC7221o00oo0o.OooO00o<Cursor> {

    /* renamed from: a */
    public WeakReference<Context> f5706a;

    /* renamed from: b */
    public AbstractC7221o00oo0o f5707b;

    /* renamed from: c */
    public AbstractC2750a f5708c;

    /* renamed from: d */
    public int f5709d;

    /* renamed from: e */
    public boolean f5710e;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.c.a$a */
    public interface AbstractC2750a {
        void onAlbumLoad(Cursor cursor);

        void onAlbumReset();
    }

    /* renamed from: a */
    public final void mo36522a() {
        AbstractC7221o00oo0o o00oo0o = this.f5707b;
        if (o00oo0o != null) {
            o00oo0o.m18706OooO00o(1);
        }
        this.f5708c = null;
    }

    /* renamed from: a */
    public final void mo36523a(int i) {
        this.f5709d = i;
    }

    /* renamed from: a */
    public final void mo36524a(Bundle bundle) {
        if (bundle != null) {
            this.f5709d = bundle.getInt("state_current_selection");
        }
    }

    /* renamed from: a */
    public final void mo36525a(FragmentActivity fragmentActivity, AbstractC2750a aVar) {
        this.f5706a = new WeakReference<>(fragmentActivity);
        this.f5707b = fragmentActivity.getSupportLoaderManager();
        this.f5708c = aVar;
    }

    /* renamed from: b */
    public final void mo36526b() {
        this.f5707b.OooO00o(1, null, this);
    }

    /* renamed from: b */
    public final void mo36527b(Bundle bundle) {
        bundle.putInt("state_current_selection", this.f5709d);
    }

    /* renamed from: c */
    public final int mo36528c() {
        return this.f5709d;
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final C7226o00ooO00<Cursor> onCreateLoader(int i, Bundle bundle) {
        Context context = this.f5706a.get();
        if (context == null) {
            return null;
        }
        this.f5710e = false;
        return C2747a.m6346a(context);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.pd.sdk.o00ooO00, java.lang.Object] */
    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final /* synthetic */ void onLoadFinished(C7226o00ooO00<Cursor> o00ooo00, Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f5706a.get() != null && !this.f5710e) {
            this.f5710e = true;
            this.f5708c.onAlbumLoad(cursor2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
    public final void onLoaderReset(C7226o00ooO00<Cursor> o00ooo00) {
        if (this.f5706a.get() != null) {
            this.f5708c.onAlbumReset();
        }
    }
}
