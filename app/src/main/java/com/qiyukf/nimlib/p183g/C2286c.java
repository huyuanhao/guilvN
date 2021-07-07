package com.qiyukf.nimlib.p183g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.nimlib.p183g.p188b.AbstractC2279c;

/* renamed from: com.qiyukf.nimlib.g.c */
public final class C2286c {

    /* renamed from: a */
    public AbstractC2288a f4571a;

    /* renamed from: b */
    public Context f4572b;

    /* renamed from: c */
    public boolean f4573c;

    /* renamed from: d */
    public String f4574d;

    /* renamed from: e */
    public BroadcastReceiver f4575e = new BroadcastReceiver() {
        /* class com.qiyukf.nimlib.p183g.C2286c.C22871 */

        public final void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean z = activeNetworkInfo != null && activeNetworkInfo.isAvailable();
                String typeName = z ? activeNetworkInfo.getTypeName() : null;
                if (C2286c.this.f4573c != z) {
                    C2286c.this.f4573c = z;
                    C2286c.this.f4574d = typeName;
                    C2286c.m4845b(C2286c.this, z);
                } else if (C2286c.this.f4573c && !typeName.equals(C2286c.this.f4574d)) {
                    C2286c.this.f4574d = typeName;
                    C2286c.this.m4840a((C2286c) AbstractC2279c.EnumC2280a.f4549f);
                }
            }
        }
    };

    /* renamed from: com.qiyukf.nimlib.g.c$a */
    public interface AbstractC2288a {
        /* renamed from: a */
        void mo34934a(int i);
    }

    public C2286c(Context context, AbstractC2288a aVar) {
        this.f4572b = context.getApplicationContext();
        this.f4571a = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m4840a(int i) {
        AbstractC2288a aVar = this.f4571a;
        if (aVar != null) {
            aVar.mo34934a(i);
        }
        if (this.f4573c) {
            C1709a.m3011a("core", "network type changed to: " + this.f4574d);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m4845b(C2286c cVar, boolean z) {
        cVar.m4840a(z ? AbstractC2279c.EnumC2280a.f4548e : AbstractC2279c.EnumC2280a.f4547d);
    }

    /* renamed from: a */
    public final boolean mo34930a() {
        return this.f4573c || C1861b.m3530c(this.f4572b);
    }

    /* renamed from: b */
    public final void mo34931b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f4572b.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        this.f4573c = z;
        this.f4574d = z ? activeNetworkInfo.getTypeName() : null;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f4572b.registerReceiver(this.f4575e, intentFilter);
    }

    /* renamed from: c */
    public final void mo34932c() {
        try {
            this.f4572b.unregisterReceiver(this.f4575e);
        } catch (IllegalArgumentException e) {
            C1709a.m3016c("ConnectivityWatcher", "unregisterReceiver error: " + e.toString());
        }
    }
}
