package com.p118pd.sdk;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00o00  reason: case insensitive filesystem */
public class C7282o0O00o00 extends C7087o00OO0o {
    public final RecyclerView OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7087o00OO0o f19951OooO00o = new OooO00o(this);

    /* renamed from: com.pd.sdk.o0O00o00$OooO00o */
    public static class OooO00o extends C7087o00OO0o {
        public final C7282o0O00o00 OooO00o;

        public OooO00o(@NonNull C7282o0O00o00 o0o00o00) {
            this.OooO00o = o0o00o00;
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            super.onInitializeAccessibilityNodeInfo(view, o00oooo);
            if (!this.OooO00o.m18780OooO00o() && this.OooO00o.OooO00o.getLayoutManager() != null) {
                this.OooO00o.OooO00o.getLayoutManager().OooO00o(view, o00oooo);
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (this.OooO00o.m18780OooO00o() || this.OooO00o.OooO00o.getLayoutManager() == null) {
                return false;
            }
            return this.OooO00o.OooO00o.getLayoutManager().OooO00o(view, i, bundle);
        }
    }

    public C7282o0O00o00(@NonNull RecyclerView recyclerView) {
        this.OooO00o = recyclerView;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18780OooO00o() {
        return this.OooO00o.m14734OooO0O0();
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !m18780OooO00o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().OooO00o(accessibilityEvent);
            }
        }
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
        super.onInitializeAccessibilityNodeInfo(view, o00oooo);
        o00oooo.OooO00o((CharSequence) RecyclerView.class.getName());
        if (!m18780OooO00o() && this.OooO00o.getLayoutManager() != null) {
            this.OooO00o.getLayoutManager().OooO00o(o00oooo);
        }
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (m18780OooO00o() || this.OooO00o.getLayoutManager() == null) {
            return false;
        }
        return this.OooO00o.getLayoutManager().OooO00o(i, bundle);
    }

    @NonNull
    public C7087o00OO0o OooO00o() {
        return this.f19951OooO00o;
    }
}
