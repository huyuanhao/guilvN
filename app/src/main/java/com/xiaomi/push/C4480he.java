package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.UnknownHostException;

/* renamed from: com.xiaomi.push.he */
public final class C4480he {

    /* renamed from: com.xiaomi.push.he$a */
    public static class C4481a {

        /* renamed from: a */
        public EnumC4424fj f12144a;

        /* renamed from: a */
        public String f12145a;
    }

    /* renamed from: a */
    public static C4481a m12866a(Exception exc) {
        m12867a(exc);
        boolean z = exc instanceof C4449gf;
        Exception exc2 = exc;
        if (z) {
            C4449gf gfVar = (C4449gf) exc;
            exc2 = exc;
            if (gfVar.mo41926a() != null) {
                exc2 = gfVar.mo41926a();
            }
        }
        C4481a aVar = new C4481a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        int a = C4438fw.m12689a(exc2);
        if (a != 0) {
            aVar.f12144a = EnumC4424fj.m12551a(EnumC4424fj.GSLB_REQUEST_SUCCESS.mo41822a() + a);
        }
        if (aVar.f12144a == null) {
            aVar.f12144a = EnumC4424fj.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f12144a == EnumC4424fj.GSLB_TCP_ERR_OTHER) {
            aVar.f12145a = str;
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m12867a(Exception exc) {
        if (exc == null) {
            throw null;
        }
    }

    /* renamed from: b */
    public static C4481a m12868b(Exception exc) {
        EnumC4424fj fjVar;
        Throwable cause;
        m12867a(exc);
        boolean z = exc instanceof C4449gf;
        Exception exc2 = exc;
        if (z) {
            C4449gf gfVar = (C4449gf) exc;
            exc2 = exc;
            if (gfVar.mo41926a() != null) {
                exc2 = gfVar.mo41926a();
            }
        }
        C4481a aVar = new C4481a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a = C4438fw.m12689a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a != 0) {
            EnumC4424fj a2 = EnumC4424fj.m12551a(EnumC4424fj.CONN_SUCCESS.mo41822a() + a);
            aVar.f12144a = a2;
            if (a2 == EnumC4424fj.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                fjVar = EnumC4424fj.CONN_BOSH_UNKNOWNHOST;
            }
            EnumC4424fj fjVar2 = aVar.f12144a;
            if (fjVar2 == EnumC4424fj.CONN_TCP_ERR_OTHER || fjVar2 == EnumC4424fj.CONN_XMPP_ERR || fjVar2 == EnumC4424fj.CONN_BOSH_ERR) {
                aVar.f12145a = str;
            }
            return aVar;
        }
        fjVar = EnumC4424fj.CONN_XMPP_ERR;
        aVar.f12144a = fjVar;
        EnumC4424fj fjVar22 = aVar.f12144a;
        aVar.f12145a = str;
        return aVar;
    }

    /* renamed from: c */
    public static C4481a m12869c(Exception exc) {
        EnumC4424fj fjVar;
        m12867a(exc);
        boolean z = exc instanceof C4449gf;
        Exception exc2 = exc;
        if (z) {
            C4449gf gfVar = (C4449gf) exc;
            exc2 = exc;
            if (gfVar.mo41926a() != null) {
                exc2 = gfVar.mo41926a();
            }
        }
        C4481a aVar = new C4481a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a = C4438fw.m12689a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            fjVar = EnumC4424fj.BIND_TCP_READ_TIMEOUT;
        } else if (a == 199) {
            fjVar = EnumC4424fj.BIND_TCP_ERR;
        } else if (a != 499) {
            fjVar = a != 109 ? a != 110 ? EnumC4424fj.BIND_XMPP_ERR : EnumC4424fj.BIND_TCP_BROKEN_PIPE : EnumC4424fj.BIND_TCP_CONNRESET;
        } else {
            aVar.f12144a = EnumC4424fj.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                fjVar = EnumC4424fj.BIND_BOSH_ITEM_NOT_FOUND;
            }
            EnumC4424fj fjVar2 = aVar.f12144a;
            if (fjVar2 == EnumC4424fj.BIND_TCP_ERR || fjVar2 == EnumC4424fj.BIND_XMPP_ERR || fjVar2 == EnumC4424fj.BIND_BOSH_ERR) {
                aVar.f12145a = str;
            }
            return aVar;
        }
        aVar.f12144a = fjVar;
        EnumC4424fj fjVar22 = aVar.f12144a;
        aVar.f12145a = str;
        return aVar;
    }

    /* renamed from: d */
    public static C4481a m12870d(Exception exc) {
        EnumC4424fj fjVar;
        m12867a(exc);
        boolean z = exc instanceof C4449gf;
        Exception exc2 = exc;
        if (z) {
            C4449gf gfVar = (C4449gf) exc;
            exc2 = exc;
            if (gfVar.mo41926a() != null) {
                exc2 = gfVar.mo41926a();
            }
        }
        C4481a aVar = new C4481a();
        String message = exc2.getMessage();
        int a = C4438fw.m12689a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            fjVar = EnumC4424fj.CHANNEL_TCP_READTIMEOUT;
        } else if (a == 199) {
            fjVar = EnumC4424fj.CHANNEL_TCP_ERR;
        } else if (a != 499) {
            fjVar = a != 109 ? a != 110 ? EnumC4424fj.CHANNEL_XMPPEXCEPTION : EnumC4424fj.CHANNEL_TCP_BROKEN_PIPE : EnumC4424fj.CHANNEL_TCP_CONNRESET;
        } else {
            aVar.f12144a = EnumC4424fj.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                fjVar = EnumC4424fj.CHANNEL_BOSH_ITEMNOTFIND;
            }
            EnumC4424fj fjVar2 = aVar.f12144a;
            if (fjVar2 == EnumC4424fj.CHANNEL_TCP_ERR || fjVar2 == EnumC4424fj.CHANNEL_XMPPEXCEPTION || fjVar2 == EnumC4424fj.CHANNEL_BOSH_EXCEPTION) {
                aVar.f12145a = str;
            }
            return aVar;
        }
        aVar.f12144a = fjVar;
        EnumC4424fj fjVar22 = aVar.f12144a;
        aVar.f12145a = str;
        return aVar;
    }
}
