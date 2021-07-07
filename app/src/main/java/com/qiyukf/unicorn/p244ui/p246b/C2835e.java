package com.qiyukf.unicorn.p244ui.p246b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2542b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.b.e */
public final class C2835e extends AbstractC7314o0O0Oo0O {

    /* renamed from: a */
    public final Context f6010a;

    /* renamed from: b */
    public final List<C2557e> f6011b;

    /* renamed from: c */
    public final String f6012c;

    /* renamed from: d */
    public List<C2825b> f6013d = new ArrayList(5);

    /* renamed from: e */
    public DialogC2823a.AbstractC2824a f6014e;

    /* renamed from: f */
    public Observer<CustomNotification> f6015f = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.p246b.C2835e.C28361 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            CustomNotification customNotification2 = customNotification;
            if (customNotification2.getSessionType() == SessionTypeEnum.Ysf && (customNotification2.getAttachment() instanceof C2542b)) {
                C2542b bVar = (C2542b) customNotification2.getAttachment();
                if (!(bVar.mo35926a() instanceof C2519j) && !(bVar.mo35926a() instanceof C2506d)) {
                    return;
                }
                if (bVar.mo35926a() instanceof C2519j) {
                    C2835e.m6575a(C2835e.this, (C2519j) bVar.mo35926a());
                } else if (bVar.mo35926a() instanceof C2506d) {
                    C2506d dVar = (C2506d) bVar.mo35926a();
                    C2557e eVar = new C2557e();
                    eVar.mo35973a(dVar.mo35791e());
                    eVar.mo35975a(dVar.mo35792f());
                    if (C2835e.this.f6013d.size() > 0 && ((C2825b) C2835e.this.f6013d.get(0)).mo36646c()) {
                        ((C2825b) C2835e.this.f6013d.get(0)).mo36644a(eVar);
                    }
                }
            }
        }
    };

    public C2835e(Context context, List<C2557e> list, String str) {
        this.f6010a = context;
        this.f6011b = list;
        this.f6012c = str;
        mo36661a(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6575a(C2835e eVar, C2519j jVar) {
        String g = jVar.mo35834g();
        C2557e eVar2 = null;
        for (C2557e eVar3 : jVar.mo35833f()) {
            if (eVar3.mo35976b().equals(g)) {
                eVar2 = eVar3;
            }
        }
        if (eVar2 != null) {
            for (C2825b bVar : eVar.f6013d) {
                if (bVar.mo36647d().equals(g) && bVar.mo36646c()) {
                    bVar.mo36644a(eVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36660a(DialogC2823a.AbstractC2824a aVar) {
        this.f6014e = aVar;
    }

    /* renamed from: a */
    public final void mo36661a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f6015f, z);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.f6013d.get(i).mo36645b());
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getCount() {
        return this.f6011b.size();
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f6013d.size() < i + 1) {
            for (int i2 = 0; i2 < this.f6011b.size(); i2++) {
                C2825b bVar = new C2825b(this.f6010a, this.f6011b.get(i2), this.f6014e, this.f6012c);
                this.f6013d.add(i2, bVar);
                if (this.f6011b.get(i2).mo35979d().size() == 0) {
                    bVar.mo36643a();
                }
            }
        }
        viewGroup.addView(this.f6013d.get(i).mo36645b());
        return this.f6013d.get(i).mo36645b();
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
