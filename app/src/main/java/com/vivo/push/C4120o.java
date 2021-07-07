package com.vivo.push;

import android.content.Intent;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.vivo.push.p281b.C4045k;
import com.vivo.push.p281b.C4046l;
import com.vivo.push.p281b.C4047m;
import com.vivo.push.p281b.C4048n;
import com.vivo.push.p281b.C4049o;
import com.vivo.push.p281b.C4050p;
import com.vivo.push.p281b.C4051q;
import com.vivo.push.p281b.C4052r;
import com.vivo.push.p281b.C4053s;
import com.vivo.push.p281b.C4054t;
import com.vivo.push.p281b.C4056v;
import com.vivo.push.p281b.C4057w;
import com.vivo.push.p282c.AbstractC4064ab;
import com.vivo.push.p282c.C4071ai;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.o */
public final class C4120o implements IPushClientFactory {

    /* renamed from: a */
    public C4071ai f11036a = new C4071ai();

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC4064ab createReceiveTask(AbstractC4160y yVar) {
        return C4071ai.m11012b(yVar);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC4160y createReceiverCommand(Intent intent) {
        AbstractC4160y yVar;
        int intExtra = intent.getIntExtra("command", -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra(AbstractC7726o0ooOOoo.OooOOo0, -1);
        }
        if (intExtra == 20) {
            yVar = new C4057w();
        } else if (intExtra != 2016) {
            switch (intExtra) {
                case 1:
                case 2:
                    yVar = new C4056v(intExtra);
                    break;
                case 3:
                    yVar = new C4051q();
                    break;
                case 4:
                    yVar = new C4053s();
                    break;
                case 5:
                    yVar = new C4052r();
                    break;
                case 6:
                    yVar = new C4054t();
                    break;
                case 7:
                    yVar = new C4050p();
                    break;
                case 8:
                    yVar = new C4049o();
                    break;
                case 9:
                    yVar = new C4047m();
                    break;
                case 10:
                case 11:
                    yVar = new C4045k(intExtra);
                    break;
                case 12:
                    yVar = new C4046l();
                    break;
                default:
                    yVar = null;
                    break;
            }
        } else {
            yVar = new C4048n();
        }
        if (yVar != null) {
            C4026a a = C4026a.m10866a(intent);
            if (a == null) {
                C4146p.m11211b("PushCommand", "bundleWapper is null");
            } else {
                yVar.mo41218b(a);
            }
        }
        return yVar;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractRunnableC4157v createTask(AbstractC4160y yVar) {
        return C4071ai.m11011a(yVar);
    }
}
