package com.qiyukf.nimlib.p180e;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p176b.C2185c;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p180e.p181a.C2231b;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.service.NimService;
import com.qiyukf.unicorn.api.SavePowerConfig;
import com.qiyukf.unicorn.p228g.C2651b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.e.b */
public final class C2232b {

    /* renamed from: a */
    public Messenger f4444a;

    /* renamed from: b */
    public IBinder f4445b;

    /* renamed from: c */
    public HandlerC2237c f4446c;

    /* renamed from: d */
    public HandlerC2237c f4447d;

    /* renamed from: e */
    public final List<Message> f4448e = new ArrayList();

    /* renamed from: f */
    public Messenger f4449f;

    /* renamed from: com.qiyukf.nimlib.e.b$a */
    public class HandlerC2236a extends Handler {
        public HandlerC2236a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i != 103) {
                    switch (i) {
                        case 14:
                            C2227a aVar = (C2227a) C2226a.m4633a(message);
                            if (aVar != null) {
                                C2130c.m4323a().mo34657a(aVar);
                                return;
                            }
                            return;
                        case 15:
                            C2130c.m4323a().mo34658a((C2231b) C2226a.m4634b(message));
                            return;
                        case 16:
                            C2130c.m4323a();
                            C2130c.m4324a((ArrayList) C2226a.m4634b(message));
                            return;
                        case 17:
                            C2185c.m4508e().mo34772a((String) C2226a.m4634b(message));
                            return;
                        default:
                            super.handleMessage(message);
                            return;
                    }
                } else {
                    C2651b.m6070a(((Boolean) C2226a.m4634b(message)).booleanValue());
                }
            } catch (Throwable th) {
                C1709a.m3015b("LocalAgent", "handle push message error.", th);
            }
        }
    }

    public C2232b(Context context) {
        if (!C2205d.m4583f()) {
            C1709a.m3011a("LocalAgent", "LocalAgent only lives in main process");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("LocalAgent");
        handlerThread.start();
        this.f4449f = new Messenger(new HandlerC2236a(handlerThread.getLooper()));
        m4653a(context);
    }

    /* renamed from: a */
    private void m4652a(int i, Parcelable parcelable) {
        m4654a(C2226a.m4632a(i, parcelable));
    }

    /* renamed from: a */
    private void m4653a(Context context) {
        this.f4446c = new HandlerC2237c(context, NimService.m5143b(context), "main_conn") {
            /* class com.qiyukf.nimlib.p180e.C2232b.HandlerC22331 */

            @Override // com.qiyukf.nimlib.p180e.HandlerC2237c
            /* renamed from: a */
            public final void mo34859a(IBinder iBinder) {
                C2232b.m4655a(C2232b.this, iBinder);
                if (C2232b.this.f4446c != null) {
                    C2232b.this.f4446c.mo34864c();
                }
            }
        };
        this.f4447d = new HandlerC2237c(context, NimService.m5144c(context), "aux_conn") {
            /* class com.qiyukf.nimlib.p180e.C2232b.HandlerC22342 */

            @Override // com.qiyukf.nimlib.p180e.HandlerC2237c
            /* renamed from: a */
            public final void mo34860a() {
                C1709a.m3011a("LocalAgent", "AuxService onServiceDisconnected");
                if (C2232b.this.f4447d != null) {
                    C2232b.this.f4447d.mo34863b();
                }
            }

            @Override // com.qiyukf.nimlib.p180e.HandlerC2237c
            /* renamed from: a */
            public final void mo34859a(IBinder iBinder) {
                if (C2232b.this.f4445b == null || C2232b.this.f4444a == null) {
                    C1709a.m3011a("LocalAgent", "AuxService onConnected, reconnect NimService...");
                    if (C2232b.this.f4446c != null) {
                        C2232b.this.f4446c.mo34863b();
                    }
                }
            }
        };
        this.f4446c.mo34863b();
        this.f4447d.mo34863b();
    }

    /* renamed from: a */
    private void m4654a(Message message) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                if (this.f4444a != null) {
                    this.f4444a.send(message);
                    z = true;
                }
            } catch (DeadObjectException unused) {
                m4659c();
            } catch (Exception e) {
                if (!C2242e.m4688a(e)) {
                    m4656a(false);
                    break;
                }
                i++;
            }
        }
        if (!z) {
            synchronized (this.f4448e) {
                this.f4448e.add(message);
            }
            this.f4446c.mo34863b();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4655a(C2232b bVar, IBinder iBinder) {
        bVar.f4445b = iBinder;
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() {
                /* class com.qiyukf.nimlib.p180e.C2232b.C22353 */

                public final void binderDied() {
                    C2232b.this.m4659c();
                }
            }, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        bVar.m4656a(true);
    }

    /* renamed from: a */
    private void m4656a(boolean z) {
        if (!z || this.f4445b == null) {
            this.f4444a = null;
            return;
        }
        this.f4444a = new Messenger(this.f4445b);
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.f4449f;
        try {
            this.f4444a.send(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
            m4656a(false);
        }
        m4661d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m4659c() {
        C1709a.m3011a("LocalAgent", "!!! Push binder dead !!!");
        this.f4445b = null;
        m4656a(false);
    }

    /* renamed from: d */
    private void m4661d() {
        ArrayList<Message> arrayList;
        synchronized (this.f4448e) {
            if (this.f4448e.size() > 0) {
                arrayList = new ArrayList(this.f4448e);
                this.f4448e.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (Message message : arrayList) {
                m4654a(message);
            }
        }
    }

    /* renamed from: a */
    public final void mo34853a() {
        m4652a(11, (Parcelable) null);
    }

    /* renamed from: a */
    public final void mo34854a(int i) {
        m4654a(C2226a.m4632a(101, Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo34855a(C2227a aVar) {
        for (C2227a aVar2 : aVar.mo34846a()) {
            m4652a(13, aVar2);
        }
    }

    /* renamed from: a */
    public final void mo34856a(LoginInfo loginInfo) {
        m4652a(10, loginInfo);
    }

    /* renamed from: a */
    public final void mo34857a(SavePowerConfig savePowerConfig) {
        m4654a(C2226a.m4632a(102, savePowerConfig));
    }

    /* renamed from: b */
    public final void mo34858b() {
        if (C2180b.m4471a() == null) {
            C1709a.m3011a("SDKCache.getContext() is", "null");
        } else if (this.f4444a == null || this.f4445b == null) {
            HandlerC2237c cVar = this.f4446c;
            if (cVar == null || !cVar.mo34865d()) {
                HandlerC2237c cVar2 = this.f4447d;
                if (cVar2 == null || !cVar2.mo34865d()) {
                    C1709a.m3011a("LocalAgent", "IPC has not established while awaking UI, start rebinding...");
                    NimService.m5142a(C2180b.m4471a(), 1);
                    m4653a(C2180b.m4471a());
                    return;
                }
                C1709a.m3011a("aux:", this.f4447d.toString());
                return;
            }
            C1709a.m3011a("main:", this.f4446c.toString());
        } else {
            C1709a.m3011a("sender and binder:", this.f4444a.toString() + this.f4445b.toString());
        }
    }
}
