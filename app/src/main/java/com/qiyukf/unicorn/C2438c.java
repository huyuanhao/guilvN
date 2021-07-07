package com.qiyukf.unicorn;

import android.os.Handler;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.nimlib.p195h.C2326h;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.RecentContact;
import com.qiyukf.unicorn.api.UnreadCountChangeListener;
import com.qiyukf.unicorn.api.msg.SessionStatusEnum;
import com.qiyukf.unicorn.api.pop.OnSessionListChangedListener;
import com.qiyukf.unicorn.api.pop.Session;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2580o;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2616l;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2713k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.c */
public final class C2438c {

    /* renamed from: a */
    public final List<RecentContact> f4780a = new ArrayList();

    /* renamed from: b */
    public final List<UnreadCountChangeListener> f4781b = new ArrayList();

    /* renamed from: c */
    public final List<OnSessionListChangedListener> f4782c = new ArrayList();

    /* renamed from: d */
    public Handler f4783d = C1805a.m3404b();

    /* renamed from: e */
    public boolean f4784e = false;

    public C2438c() {
        C24424 r1 = new Observer<List<RecentContact>>() {
            /* class com.qiyukf.unicorn.C2438c.C24424 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(List<RecentContact> list) {
                List<RecentContact> list2 = list;
                if (list2 != null) {
                    C2438c.m5316a(C2438c.this, list2);
                    C2438c.this.m5322b((C2438c) list2);
                }
                C2438c.this.m5325g();
            }
        };
        C24435 r2 = new Observer<RecentContact>() {
            /* class com.qiyukf.unicorn.C2438c.C24435 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(RecentContact recentContact) {
                RecentContact recentContact2 = recentContact;
                if (recentContact2 == null) {
                    C2438c.this.m5324f();
                    return;
                }
                C2438c.this.m5313a((C2438c) recentContact2);
                C2438c.this.m5318b((C2438c) recentContact2);
                if (recentContact2.getUnreadCount() > 0) {
                    C2438c.this.m5325g();
                }
            }
        };
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeRecentContact(r1, true);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeRecentContactDeleted(r2, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m5313a(RecentContact recentContact) {
        synchronized (this.f4780a) {
            Iterator<RecentContact> it = this.f4780a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RecentContact next = it.next();
                if (next.getContactId().equals(recentContact.getContactId()) && next.getSessionType() == recentContact.getSessionType()) {
                    this.f4780a.remove(next);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5316a(C2438c cVar, List list) {
        synchronized (cVar.f4780a) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RecentContact recentContact = (RecentContact) it.next();
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 < cVar.f4780a.size()) {
                        if (recentContact.getContactId().equals(cVar.f4780a.get(i2).getContactId()) && recentContact.getSessionType() == cVar.f4780a.get(i2).getSessionType()) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (i >= 0) {
                    RecentContact recentContact2 = cVar.f4780a.get(i);
                    ((C2326h) recentContact).mo35054a(recentContact2.getSessionStatus());
                    cVar.f4780a.remove(recentContact2);
                } else {
                    ((C2326h) recentContact).mo35054a(C2452d.m5375g().mo36360i(recentContact.getContactId()));
                }
                cVar.f4780a.add(recentContact);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5317a(int i) {
        for (SessionStatusEnum sessionStatusEnum : SessionStatusEnum.values()) {
            if (sessionStatusEnum.value() == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m5318b(final RecentContact recentContact) {
        synchronized (this.f4782c) {
            for (final OnSessionListChangedListener onSessionListChangedListener : this.f4782c) {
                C2713k.m6274b(new Runnable() {
                    /* class com.qiyukf.unicorn.C2438c.RunnableC24457 */

                    public final void run() {
                        onSessionListChangedListener.onSessionDelete(recentContact.getContactId());
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m5322b(final List<RecentContact> list) {
        synchronized (this.f4782c) {
            for (final OnSessionListChangedListener onSessionListChangedListener : this.f4782c) {
                C2713k.m6274b(new Runnable() {
                    /* class com.qiyukf.unicorn.C2438c.RunnableC24446 */

                    public final void run() {
                        onSessionListChangedListener.onSessionUpdate(C2438c.m5323c(list));
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public static List<Session> m5323c(List<RecentContact> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m5324f() {
        synchronized (this.f4780a) {
            int d = mo35663d();
            Iterator<RecentContact> it = this.f4780a.iterator();
            while (it.hasNext()) {
                it.remove();
                m5318b(it.next());
            }
            if (d > 0) {
                m5325g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m5325g() {
        final int d = mo35663d();
        synchronized (this.f4781b) {
            for (final UnreadCountChangeListener unreadCountChangeListener : this.f4781b) {
                C2713k.m6274b(new Runnable() {
                    /* class com.qiyukf.unicorn.C2438c.RunnableC24468 */

                    public final void run() {
                        unreadCountChangeListener.onUnreadCountChange(d);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final int mo35653a(String str) {
        synchronized (this.f4780a) {
            for (RecentContact recentContact : this.f4780a) {
                if (TextUtils.equals(str, recentContact.getContactId())) {
                    return recentContact.getUnreadCount();
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo35654a() {
        synchronized (this.f4780a) {
            if (!this.f4780a.isEmpty()) {
                m5324f();
            }
            List<RecentContact> queryRecentContactsBlock = ((MsgService) NIMClient.getService(MsgService.class)).queryRecentContactsBlock();
            if (queryRecentContactsBlock != null && !queryRecentContactsBlock.isEmpty()) {
                this.f4780a.addAll(queryRecentContactsBlock);
                m5322b(queryRecentContactsBlock);
                m5325g();
            }
        }
    }

    /* renamed from: a */
    public final void mo35655a(final UnreadCountChangeListener unreadCountChangeListener, boolean z) {
        if (unreadCountChangeListener != null) {
            synchronized (this.f4781b) {
                if (z) {
                    try {
                        if (!this.f4781b.contains(unreadCountChangeListener)) {
                            this.f4781b.add(unreadCountChangeListener);
                            C2713k.m6274b(new Runnable() {
                                /* class com.qiyukf.unicorn.C2438c.RunnableC24402 */

                                public final void run() {
                                    unreadCountChangeListener.onUnreadCountChange(C2438c.this.mo35663d());
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z) {
                    this.f4781b.remove(unreadCountChangeListener);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35656a(final OnSessionListChangedListener onSessionListChangedListener, boolean z) {
        if (onSessionListChangedListener != null) {
            synchronized (this.f4782c) {
                if (z) {
                    try {
                        if (!this.f4782c.contains(onSessionListChangedListener)) {
                            this.f4782c.add(onSessionListChangedListener);
                            C2713k.m6274b(new Runnable() {
                                /* class com.qiyukf.unicorn.C2438c.RunnableC24413 */

                                public final void run() {
                                    onSessionListChangedListener.onSessionUpdate(C2438c.this.mo35664e());
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z) {
                    this.f4782c.remove(onSessionListChangedListener);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35657a(C2580o oVar) {
        this.f4784e = true;
        Map<String, Integer> a = oVar.mo36068a();
        if (!(a == null || a.isEmpty())) {
            synchronized (this.f4780a) {
                List<RecentContact> arrayList = new ArrayList<>(a.size());
                for (String str : a.keySet()) {
                    int intValue = a.get(str).intValue();
                    if (m5317a(intValue)) {
                        C2326h hVar = null;
                        for (RecentContact recentContact : this.f4780a) {
                            if (recentContact.getContactId().equals(str)) {
                                hVar = (C2326h) recentContact;
                            }
                        }
                        if (hVar != null) {
                            hVar.mo35054a(SessionStatusEnum.valueOf(intValue));
                            arrayList.add(hVar);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    m5322b(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35658a(String str, SessionStatusEnum sessionStatusEnum) {
        C2326h hVar;
        synchronized (this.f4780a) {
            Iterator<RecentContact> it = this.f4780a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hVar = null;
                    break;
                }
                RecentContact next = it.next();
                if (next.getContactId().equals(str)) {
                    hVar = (C2326h) next;
                    break;
                }
            }
        }
        if (hVar != null && hVar.getSessionStatus() != sessionStatusEnum) {
            hVar.mo35054a(sessionStatusEnum);
            List<RecentContact> arrayList = new ArrayList<>(1);
            arrayList.add(hVar);
            m5322b(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo35659a(String str, boolean z) {
        RecentContact recentContact;
        synchronized (this.f4780a) {
            Iterator<RecentContact> it = this.f4780a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    recentContact = null;
                    break;
                }
                recentContact = it.next();
                if (recentContact.getContactId().equals(str)) {
                    break;
                }
            }
        }
        if (recentContact != null) {
            ((MsgService) NIMClient.getService(MsgService.class)).deleteRecentContact(recentContact);
            m5313a(recentContact);
            m5318b(recentContact);
            if (recentContact.getUnreadCount() > 0) {
                m5325g();
            }
            if (z) {
                ((MsgService) NIMClient.getService(MsgService.class)).clearChattingHistory(str, SessionTypeEnum.Ysf);
            }
        }
    }

    /* renamed from: b */
    public final void mo35660b() {
        String c = C2437b.m5260c();
        if (!TextUtils.isEmpty(c) && !TextUtils.equals(c, "-1")) {
            if (!this.f4784e || C2452d.m5375g().mo36352d()) {
                this.f4783d.postDelayed(new Runnable() {
                    /* class com.qiyukf.unicorn.C2438c.RunnableC24391 */

                    public final void run() {
                        C2667c.m6115a((AbstractC2597e) new C2616l(), C2667c.m6116a(), false);
                    }
                }, 1000);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo35661b(String str) {
        synchronized (this.f4780a) {
            for (RecentContact recentContact : this.f4780a) {
                if (recentContact.getContactId().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo35662c() {
        m5324f();
    }

    /* renamed from: d */
    public final int mo35663d() {
        int i;
        synchronized (this.f4780a) {
            i = 0;
            for (RecentContact recentContact : this.f4780a) {
                if (recentContact != null) {
                    i += recentContact.getUnreadCount();
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final List<Session> mo35664e() {
        List<Session> c;
        synchronized (this.f4780a) {
            c = m5323c(this.f4780a);
        }
        return c;
    }
}
