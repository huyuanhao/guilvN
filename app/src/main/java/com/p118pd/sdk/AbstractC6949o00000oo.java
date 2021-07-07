package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00000oo  reason: case insensitive filesystem */
public interface AbstractC6949o00000oo extends SpinnerAdapter {
    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);

    /* renamed from: com.pd.sdk.o00000oo$OooO00o */
    public static final class OooO00o {
        public final Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LayoutInflater f19121OooO00o;
        public LayoutInflater OooO0O0;

        public OooO00o(@NonNull Context context) {
            this.OooO00o = context;
            this.f19121OooO00o = LayoutInflater.from(context);
        }

        public void OooO00o(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.OooO0O0 = null;
            } else if (theme == this.OooO00o.getTheme()) {
                this.OooO0O0 = this.f19121OooO00o;
            } else {
                this.OooO0O0 = LayoutInflater.from(new C5952OooOo0O(this.OooO00o, theme));
            }
        }

        @Nullable
        public Resources.Theme OooO00o() {
            LayoutInflater layoutInflater = this.OooO0O0;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public LayoutInflater m18126OooO00o() {
            LayoutInflater layoutInflater = this.OooO0O0;
            return layoutInflater != null ? layoutInflater : this.f19121OooO00o;
        }
    }
}
