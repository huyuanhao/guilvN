package com.p118pd.sdk;

import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Queue;

/* renamed from: com.pd.sdk.o0o0OoOo  reason: case insensitive filesystem */
public class C7608o0o0OoOo<T> implements AbsListView.OnScrollListener {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o<T> f20463OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0<T> f20464OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7609OooO0Oo f20465OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7658o0oOooOO f20466OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20467OooO00o = true;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo = -1;
    public int OooO0o0;

    /* renamed from: com.pd.sdk.o0o0OoOo$OooO00o */
    public interface OooO00o<U> {
        @Nullable
        C7622o0oOOoOO<?> OooO00o(@NonNull U u);

        @NonNull
        List<U> OooO00o(int i);
    }

    /* renamed from: com.pd.sdk.o0o0OoOo$OooO0O0 */
    public interface OooO0O0<T> {
        @Nullable
        int[] OooO00o(@NonNull T t, int i, int i2);
    }

    /* renamed from: com.pd.sdk.o0o0OoOo$OooO0OO */
    public static final class OooO0OO extends AbstractC7826oO00oO00<Object> {
        public int o00oO0O;
        public int o0ooOO0;

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            ooo00oo0.OooO00o(this.o0ooOO0, this.o00oO0O);
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo<? super Object> oo00oooo) {
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        }
    }

    /* renamed from: com.pd.sdk.o0o0OoOo$OooO0Oo  reason: case insensitive filesystem */
    public static final class C7609OooO0Oo {
        public final Queue<OooO0OO> OooO00o;

        public C7609OooO0Oo(int i) {
            this.OooO00o = oO0O0O00.m19524OooO00o(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.OooO00o.offer(new OooO0OO());
            }
        }

        public OooO0OO OooO00o(int i, int i2) {
            OooO0OO poll = this.OooO00o.poll();
            this.OooO00o.offer(poll);
            poll.o0ooOO0 = i;
            poll.o00oO0O = i2;
            return poll;
        }
    }

    public C7608o0o0OoOo(@NonNull C7658o0oOooOO o0oooooo, @NonNull OooO00o<T> oooO00o, @NonNull OooO0O0<T> oooO0O0, int i) {
        this.f20466OooO00o = o0oooooo;
        this.f20463OooO00o = oooO00o;
        this.f20464OooO00o = oooO0O0;
        this.OooO00o = i;
        this.f20465OooO00o = new C7609OooO0Oo(i + 1);
    }

    private void OooO00o(int i, boolean z) {
        if (this.f20467OooO00o != z) {
            this.f20467OooO00o = z;
            OooO00o();
        }
        OooO00o(i, (z ? this.OooO00o : -this.OooO00o) + i);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.OooO0o0 = i3;
        int i4 = this.OooO0Oo;
        if (i > i4) {
            OooO00o(i2 + i, true);
        } else if (i < i4) {
            OooO00o(i, false);
        }
        this.OooO0Oo = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    private void OooO00o(int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            i3 = Math.max(this.OooO0O0, i);
            i4 = i2;
        } else {
            i4 = Math.min(this.OooO0OO, i);
            i3 = i2;
        }
        int min = Math.min(this.OooO0o0, i4);
        int min2 = Math.min(this.OooO0o0, Math.max(0, i3));
        if (i < i2) {
            for (int i5 = min2; i5 < min; i5++) {
                OooO00o((List) this.f20463OooO00o.OooO00o(i5), i5, true);
            }
        } else {
            for (int i6 = min - 1; i6 >= min2; i6--) {
                OooO00o((List) this.f20463OooO00o.OooO00o(i6), i6, false);
            }
        }
        this.OooO0OO = min2;
        this.OooO0O0 = min;
    }

    private void OooO00o(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                OooO00o(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            OooO00o(list.get(i3), i, i3);
        }
    }

    private void OooO00o(@Nullable T t, int i, int i2) {
        int[] OooO00o2;
        C7622o0oOOoOO<?> OooO00o3;
        if (t != null && (OooO00o2 = this.f20464OooO00o.OooO00o(t, i, i2)) != null && (OooO00o3 = this.f20463OooO00o.OooO00o(t)) != null) {
            OooO00o3.into(this.f20465OooO00o.OooO00o(OooO00o2[0], OooO00o2[1]));
        }
    }

    private void OooO00o() {
        for (int i = 0; i < this.OooO00o; i++) {
            this.f20466OooO00o.clear(this.f20465OooO00o.OooO00o(0, 0));
        }
    }
}
