package com.qiyukf.unicorn.p244ui.p248d.p249a;

import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.qiyukf.unicorn.ui.d.a.a */
public final class C2847a {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m6620a(C2515i.C2516a aVar, AbstractC2857f fVar) {
        char c;
        String c2 = aVar.mo35820c();
        switch (c2.hashCode()) {
            case 116079:
                if (c2.equals("url")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 93832333:
                if (c2.equals("block")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (c2.equals("float")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 106852524:
                if (c2.equals(AgooConstants.MESSAGE_POPUP)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            fVar.mo36699a(aVar.mo35818a());
        } else if (c == 1) {
            fVar.mo36701a(aVar.mo35818a(), aVar.mo35819b(), aVar.mo35821d());
        } else if (c == 2) {
            fVar.mo36703f();
        } else if (c == 3) {
            fVar.mo36700a(aVar.mo35818a(), aVar.mo35819b());
        }
    }
}
