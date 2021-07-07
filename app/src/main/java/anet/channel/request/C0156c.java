package anet.channel.request;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* renamed from: anet.channel.request.c */
public class C0156c implements Cancelable {
    public static final C0156c NULL = new C0156c(null, 0, null);

    /* renamed from: a */
    public final int f255a;

    /* renamed from: b */
    public final SpdySession f256b;

    /* renamed from: c */
    public final String f257c;

    public C0156c(SpdySession spdySession, int i, String str) {
        this.f256b = spdySession;
        this.f255a = i;
        this.f257c = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        try {
            if (this.f256b != null && this.f255a != 0) {
                ALog.m290i("awcn.TnetCancelable", "cancel tnet request", this.f257c, "streamId", Integer.valueOf(this.f255a));
                this.f256b.streamReset((long) this.f255a, 5);
            }
        } catch (SpdyErrorException e) {
            ALog.m288e("awcn.TnetCancelable", "request cancel failed.", this.f257c, e, Constants.KEY_ERROR_CODE, Integer.valueOf(e.SpdyErrorGetCode()));
        }
    }
}
