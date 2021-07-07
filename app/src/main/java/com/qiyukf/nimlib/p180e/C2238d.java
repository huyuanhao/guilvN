package com.qiyukf.nimlib.p180e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.p118pd.sdk.C7085o00OO0O0;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p176b.C2183b;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p180e.p181a.C2231b;
import com.qiyukf.nimlib.p183g.C2307f;
import com.qiyukf.nimlib.p183g.C2312g;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.service.WakeupService;
import com.qiyukf.unicorn.api.SavePowerConfig;
import com.qiyukf.unicorn.p228g.C2654c;
import com.qiyukf.unicorn.p228g.C2657d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.e.d */
public final class C2238d {

    /* renamed from: a */
    public final Messenger f4458a;

    /* renamed from: b */
    public Messenger f4459b;

    /* renamed from: c */
    public final List<C7085o00OO0O0<Integer, Object>> f4460c;

    /* renamed from: com.qiyukf.nimlib.e.d$a */
    public static class C2240a {

        /* renamed from: a */
        public static C2238d f4462a = new C2238d((byte) 0);
    }

    /* renamed from: com.qiyukf.nimlib.e.d$b */
    public class HandlerC2241b extends Handler {
        public HandlerC2241b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 1) {
                    C2238d.m4682a(C2238d.this, message);
                } else if (i == 13) {
                    C2227a aVar = (C2227a) C2226a.m4633a(message);
                    if (aVar != null) {
                        C2307f.m4934a().mo34995a(aVar);
                    }
                } else if (i == 10) {
                    C2307f.m4934a().mo34996a((LoginInfo) C2226a.m4633a(message));
                } else if (i == 11) {
                    C2307f.m4934a().mo34997b();
                } else if (i == 101) {
                    C2654c.m6072a(C2180b.m4471a()).mo36290a(((Integer) C2226a.m4634b(message)).intValue());
                } else if (i != 102) {
                    super.handleMessage(message);
                } else {
                    C2657d.m6078a().mo36296a((SavePowerConfig) C2226a.m4634b(message));
                }
            } catch (Throwable th) {
                C1709a.m3019d("RemoteAgent", "handle message error.", th);
            }
        }
    }

    public C2238d() {
        this.f4460c = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("RemoteAgent");
        handlerThread.start();
        this.f4458a = new Messenger(new HandlerC2241b(handlerThread.getLooper()));
    }

    public /* synthetic */ C2238d(byte b) {
        this();
    }

    /* renamed from: a */
    public static void m4679a() {
        if (C2205d.m4578b()) {
            m4680a(16, C2312g.m4956b());
        }
    }

    /* renamed from: a */
    public static void m4680a(int i, Object obj) {
        String str;
        boolean z = false;
        try {
            if (C2205d.m4578b() && C2240a.f4462a.f4459b != null) {
                C2240a.f4462a.f4459b.send(C2226a.m4632a(i, obj));
                z = true;
            }
        } catch (Exception unused) {
            if (C2240a.f4462a == null) {
                str = "remoteagent is null";
            } else {
                str = C2240a.f4462a.toString() + i;
            }
            C1709a.m3011a("RemoteAgent send message exception", str);
        }
        if (!z) {
            synchronized (C2240a.f4462a.f4460c) {
                C2240a.f4462a.f4460c.add(new C7085o00OO0O0<>(Integer.valueOf(i), obj));
            }
            C1709a.m3011a("RemoteAgent", "awake UI process and bind core");
            WakeupService.m5145a(C2180b.m4471a());
        }
    }

    /* renamed from: a */
    public static void m4681a(AbstractC2148a.C2149a aVar) {
        for (C2227a aVar2 : new C2227a(aVar).mo34846a()) {
            m4680a(14, aVar2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4682a(C2238d dVar, Message message) {
        try {
            Messenger messenger = message.replyTo;
            dVar.f4459b = messenger;
            messenger.getBinder().linkToDeath(new IBinder.DeathRecipient() {
                /* class com.qiyukf.nimlib.p180e.C2238d.C22391 */

                public final void binderDied() {
                    C1709a.m3011a("RemoteAgent", "UI binder dead!");
                    C2205d.m4577b(false);
                    C2238d.this.f4459b = null;
                }
            }, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        ArrayList<C7085o00OO0O0> arrayList = null;
        synchronized (C2240a.f4462a.f4460c) {
            if (C2240a.f4462a.f4460c.size() > 0) {
                arrayList = new ArrayList(C2240a.f4462a.f4460c);
                C2240a.f4462a.f4460c.clear();
            }
        }
        if (arrayList != null) {
            C1709a.m3011a("RemoteAgent", "onPend, send pending data");
            for (C7085o00OO0O0 o00oo0o0 : arrayList) {
                m4680a(o00oo0o0.OooO00o.intValue(), o00oo0o0.OooO0O0);
            }
        }
    }

    /* renamed from: a */
    public static void m4683a(StatusCode statusCode) {
        if (C2205d.m4578b() || statusCode.wontAutoLogin()) {
            m4680a(15, new C2231b(statusCode, C2205d.m4585h(), C2180b.m4480e()));
        }
    }

    /* renamed from: a */
    public static void m4684a(boolean z) {
        m4680a(103, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static void m4685b() {
        m4680a(17, C2183b.m4501e().mo34768c());
    }

    /* renamed from: c */
    public static IBinder m4686c() {
        return C2240a.f4462a.f4458a.getBinder();
    }

    /* renamed from: d */
    public static void m4687d() {
        if (!C2205d.m4578b()) {
            C1709a.m3011a("RemoteAgent", "UI process bound!");
            C2205d.m4577b(true);
            C1709a.m3011a("connection Tag", "RemoteAgent onBind");
            m4683a(C2205d.m4582e());
            m4679a();
        }
    }
}
