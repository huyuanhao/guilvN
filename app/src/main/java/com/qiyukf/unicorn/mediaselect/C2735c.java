package com.qiyukf.unicorn.mediaselect;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2741b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.MatisseActivity;
import com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a;
import com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.c */
public final class C2735c {

    /* renamed from: a */
    public final C2725a f5656a;

    /* renamed from: b */
    public final C2745e f5657b;

    public C2735c(C2725a aVar, @NonNull Set<EnumC2731b> set) {
        this.f5656a = aVar;
        C2745e b = C2745e.m6340b();
        this.f5657b = b;
        b.f5674a = set;
        b.f5675b = false;
        b.f5678e = -1;
    }

    /* renamed from: a */
    public final C2735c mo36489a() {
        this.f5657b.f5676c = true;
        return this;
    }

    /* renamed from: a */
    public final C2735c mo36490a(int i) {
        if (i > 0) {
            C2745e eVar = this.f5657b;
            if (eVar.f5681h > 0 || eVar.f5682i > 0) {
                throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
            }
            eVar.f5680g = i;
            return this;
        }
        throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
    }

    /* renamed from: a */
    public final C2735c mo36491a(AbstractC2726a aVar) {
        this.f5657b.f5689p = aVar;
        return this;
    }

    /* renamed from: a */
    public final C2735c mo36492a(@NonNull AbstractC2732a aVar) {
        C2745e eVar = this.f5657b;
        if (eVar.f5683j == null) {
            eVar.f5683j = new ArrayList();
        }
        this.f5657b.f5683j.add(aVar);
        return this;
    }

    /* renamed from: a */
    public final C2735c mo36493a(C2741b bVar) {
        this.f5657b.f5685l = bVar;
        return this;
    }

    /* renamed from: b */
    public final C2735c mo36494b() {
        this.f5657b.f5693t = true;
        return this;
    }

    /* renamed from: b */
    public final C2735c mo36495b(int i) {
        this.f5657b.f5687n = i;
        return this;
    }

    /* renamed from: c */
    public final C2735c mo36496c() {
        this.f5657b.f5694u = 10;
        return this;
    }

    /* renamed from: c */
    public final void mo36497c(int i) {
        Activity a = this.f5656a.mo36478a();
        if (a != null) {
            Intent intent = new Intent(a, MatisseActivity.class);
            Fragment b = this.f5656a.mo36479b();
            if (b != null) {
                b.startActivityForResult(intent, i);
            } else {
                a.startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: d */
    public final C2735c mo36498d() {
        this.f5657b.f5678e = 1;
        return this;
    }

    /* renamed from: e */
    public final C2735c mo36499e() {
        this.f5657b.f5688o = 0.85f;
        return this;
    }
}
