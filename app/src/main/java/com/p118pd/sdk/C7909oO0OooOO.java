package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.oO0OooOO  reason: case insensitive filesystem */
public class C7909oO0OooOO {
    public static final String OooO00o = "RequestTracker";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC7821oO00o0o> f20980OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<AbstractC7821oO00o0o> f20981OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20982OooO00o;

    @VisibleForTesting
    public void OooO00o(AbstractC7821oO00o0o oo00o0o) {
        this.f20981OooO00o.add(oo00o0o);
    }

    public void OooO0O0(@NonNull AbstractC7821oO00o0o oo00o0o) {
        this.f20981OooO00o.add(oo00o0o);
        if (!this.f20982OooO00o) {
            oo00o0o.begin();
            return;
        }
        oo00o0o.clear();
        Log.isLoggable(OooO00o, 2);
        this.f20980OooO00o.add(oo00o0o);
    }

    public void OooO0OO() {
        this.f20982OooO00o = true;
        for (AbstractC7821oO00o0o oo00o0o : oO0O0O00.OooO00o(this.f20981OooO00o)) {
            if (oo00o0o.isRunning()) {
                oo00o0o.clear();
                this.f20980OooO00o.add(oo00o0o);
            }
        }
    }

    public void OooO0Oo() {
        for (AbstractC7821oO00o0o oo00o0o : oO0O0O00.OooO00o(this.f20981OooO00o)) {
            if (!oo00o0o.OooO00o() && !oo00o0o.OooO0OO()) {
                oo00o0o.clear();
                if (!this.f20982OooO00o) {
                    oo00o0o.begin();
                } else {
                    this.f20980OooO00o.add(oo00o0o);
                }
            }
        }
    }

    public void OooO0o0() {
        this.f20982OooO00o = false;
        for (AbstractC7821oO00o0o oo00o0o : oO0O0O00.OooO00o(this.f20981OooO00o)) {
            if (!oo00o0o.OooO00o() && !oo00o0o.isRunning()) {
                oo00o0o.begin();
            }
        }
        this.f20980OooO00o.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f20981OooO00o.size() + ", isPaused=" + this.f20982OooO00o + C7522o0Ooo0o.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19592OooO00o(@Nullable AbstractC7821oO00o0o oo00o0o) {
        return OooO00o(oo00o0o, true);
    }

    private boolean OooO00o(@Nullable AbstractC7821oO00o0o oo00o0o, boolean z) {
        boolean z2 = true;
        if (oo00o0o == null) {
            return true;
        }
        boolean remove = this.f20981OooO00o.remove(oo00o0o);
        if (!this.f20980OooO00o.remove(oo00o0o) && !remove) {
            z2 = false;
        }
        if (z2) {
            oo00o0o.clear();
            if (z) {
                oo00o0o.recycle();
            }
        }
        return z2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19591OooO00o() {
        return this.f20982OooO00o;
    }

    public void OooO0O0() {
        this.f20982OooO00o = true;
        for (AbstractC7821oO00o0o oo00o0o : oO0O0O00.OooO00o(this.f20981OooO00o)) {
            if (oo00o0o.isRunning() || oo00o0o.OooO00o()) {
                oo00o0o.clear();
                this.f20980OooO00o.add(oo00o0o);
            }
        }
    }

    public void OooO00o() {
        for (AbstractC7821oO00o0o oo00o0o : oO0O0O00.OooO00o(this.f20981OooO00o)) {
            OooO00o(oo00o0o, false);
        }
        this.f20980OooO00o.clear();
    }
}
