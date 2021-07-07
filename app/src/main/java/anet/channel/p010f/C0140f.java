package anet.channel.p010f;

import android.content.SharedPreferences;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.IStrategyListener;

/* renamed from: anet.channel.f.f */
public final class C0140f implements IStrategyListener {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f168a;

    public C0140f(SharedPreferences sharedPreferences) {
        this.f168a = sharedPreferences;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C0198l.C0202d dVar) {
        String str;
        if (!(dVar == null || dVar.f436b == null)) {
            int i = 0;
            loop0:
            while (true) {
                C0198l.C0200b[] bVarArr = dVar.f436b;
                if (i < bVarArr.length) {
                    str = bVarArr[i].f422a;
                    C0198l.C0199a[] aVarArr = bVarArr[i].f429h;
                    if (aVarArr != null && aVarArr.length > 0) {
                        for (C0198l.C0199a aVar : aVarArr) {
                            String str2 = aVar.f415b;
                            if (ConnType.QUIC.equals(str2) || ConnType.QUIC_PLAIN.equals(str2)) {
                            }
                        }
                        continue;
                    }
                    i++;
                } else {
                    return;
                }
            }
            if (!str.equals(C0135a.f160a)) {
                String unused = C0135a.f160a = str;
                SharedPreferences.Editor edit = this.f168a.edit();
                edit.putString("quic_detector_host", C0135a.f160a);
                edit.apply();
            }
            C0135a.m91a(NetworkStatusHelper.getStatus());
        }
    }
}
