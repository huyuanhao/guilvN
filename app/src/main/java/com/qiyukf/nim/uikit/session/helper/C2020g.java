package com.qiyukf.nim.uikit.session.helper;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.mediaselect.C2725a;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity;
import com.qiyukf.unicorn.p244ui.p250e.DialogC2959b;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nim.uikit.session.helper.g */
public final class C2020g {

    /* renamed from: a */
    public DialogC2959b f3979a;

    /* renamed from: b */
    public Fragment f3980b;

    /* renamed from: c */
    public int f3981c;

    /* renamed from: d */
    public int f3982d;

    public C2020g(Fragment fragment) {
        this.f3980b = fragment;
    }

    /* renamed from: a */
    public final void mo34474a(int i, Intent intent) {
        DialogC2959b bVar;
        if (intent != null && i != 0 && (bVar = this.f3979a) != null) {
            if (i == this.f3981c) {
                bVar.mo36792b(intent);
            } else if (i == this.f3982d) {
                bVar.mo36791a(intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo34475a(long j, String str, final int i, final int i2, final RequestCallback<String> requestCallback) {
        this.f3981c = i;
        this.f3982d = i2;
        if (this.f3980b != null) {
            DialogC2959b bVar = new DialogC2959b(this.f3980b.getContext(), j, str, new DialogC2959b.AbstractC2968a() {
                /* class com.qiyukf.nim.uikit.session.helper.C2020g.C20211 */

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34477a(int i) {
                    C2725a.m6293a(C2020g.this.f3980b, EnumC2731b.m6304a(), i, i2);
                }

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34478a(String str) {
                    RequestCallback requestCallback = requestCallback;
                    if (requestCallback != null) {
                        requestCallback.onSuccess(str);
                    }
                }

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34479a(ArrayList<C2743d> arrayList, int i) {
                    WatchPictureActivity.start(C2020g.this.f3980b, arrayList, i, i);
                }
            });
            this.f3979a = bVar;
            bVar.show();
        }
    }

    /* renamed from: a */
    public final void mo34476a(C2504c cVar, String str, final RequestCallback<String> requestCallback) {
        this.f3981c = 18;
        this.f3982d = 17;
        if (this.f3980b != null) {
            DialogC2959b bVar = new DialogC2959b(this.f3980b.getContext(), cVar, str, new DialogC2959b.AbstractC2968a() {
                /* class com.qiyukf.nim.uikit.session.helper.C2020g.C20222 */

                /* renamed from: b */
                public final /* synthetic */ int f3988b = 18;

                /* renamed from: c */
                public final /* synthetic */ int f3989c = 17;

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34477a(int i) {
                    C2725a.m6293a(C2020g.this.f3980b, EnumC2731b.m6304a(), i, this.f3989c);
                }

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34478a(String str) {
                    RequestCallback requestCallback = requestCallback;
                    if (requestCallback != null) {
                        requestCallback.onSuccess(str);
                    }
                }

                @Override // com.qiyukf.unicorn.p244ui.p250e.DialogC2959b.AbstractC2968a
                /* renamed from: a */
                public final void mo34479a(ArrayList<C2743d> arrayList, int i) {
                    WatchPictureActivity.start(C2020g.this.f3980b, arrayList, i, this.f3988b);
                }
            });
            this.f3979a = bVar;
            bVar.show();
        }
    }
}
