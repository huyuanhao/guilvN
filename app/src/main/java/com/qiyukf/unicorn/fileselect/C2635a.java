package com.qiyukf.unicorn.fileselect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C8884ooO0oo0O;
import com.qiyukf.unicorn.fileselect.p224a.C2636a;
import com.qiyukf.unicorn.fileselect.p226ui.activity.FilePickerActivity;

/* renamed from: com.qiyukf.unicorn.fileselect.a */
public final class C2635a {

    /* renamed from: a */
    public Activity f5409a;

    /* renamed from: b */
    public Fragment f5410b;

    /* renamed from: c */
    public String f5411c;

    /* renamed from: d */
    public int f5412d;

    /* renamed from: e */
    public boolean f5413e = true;

    /* renamed from: f */
    public boolean f5414f = true;

    /* renamed from: g */
    public String[] f5415g;

    /* renamed from: h */
    public int f5416h;

    /* renamed from: i */
    public String f5417i;

    /* renamed from: j */
    public boolean f5418j = true;

    /* renamed from: k */
    public long f5419k;

    /* renamed from: a */
    public final C2635a mo36246a() {
        this.f5413e = false;
        return this;
    }

    /* renamed from: a */
    public final C2635a mo36247a(int i) {
        this.f5412d = i;
        return this;
    }

    /* renamed from: a */
    public final C2635a mo36248a(Activity activity) {
        this.f5409a = activity;
        return this;
    }

    /* renamed from: a */
    public final C2635a mo36249a(Fragment fragment) {
        this.f5410b = fragment;
        return this;
    }

    /* renamed from: a */
    public final C2635a mo36250a(String str) {
        this.f5411c = str;
        return this;
    }

    /* renamed from: b */
    public final C2635a mo36251b() {
        this.f5416h = 1;
        return this;
    }

    /* renamed from: c */
    public final C2635a mo36252c() {
        this.f5414f = true;
        return this;
    }

    /* renamed from: d */
    public final C2635a mo36253d() {
        this.f5418j = false;
        return this;
    }

    /* renamed from: e */
    public final C2635a mo36254e() {
        this.f5419k = C8884ooO0oo0O.OooO0OO;
        return this;
    }

    /* renamed from: f */
    public final void mo36255f() {
        if (this.f5409a == null && this.f5410b == null) {
            throw new RuntimeException("You must pass Activity or Fragment by withActivity or withFragment or withSupportFragment method");
        }
        Intent intent = this.f5409a != null ? new Intent(this.f5409a, FilePickerActivity.class) : new Intent(this.f5410b.getActivity(), FilePickerActivity.class);
        C2636a aVar = new C2636a();
        aVar.mo36259a(this.f5411c);
        aVar.mo36260a(this.f5413e);
        aVar.mo36261a(this.f5415g);
        aVar.mo36257a(this.f5416h);
        aVar.mo36263b(this.f5414f);
        aVar.mo36262b(this.f5417i);
        aVar.mo36258a(this.f5419k);
        aVar.mo36265c(this.f5418j);
        Bundle bundle = new Bundle();
        bundle.putSerializable("param", aVar);
        intent.putExtras(bundle);
        Activity activity = this.f5409a;
        if (activity != null) {
            activity.startActivityForResult(intent, this.f5412d);
        } else {
            this.f5410b.startActivityForResult(intent, this.f5412d);
        }
    }
}
