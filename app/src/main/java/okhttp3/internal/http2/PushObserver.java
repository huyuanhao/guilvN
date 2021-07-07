package okhttp3.internal.http2;

import com.p118pd.sdk.oOOO000O;
import java.io.IOException;
import java.util.List;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() {
        /* class okhttp3.internal.http2.PushObserver.C47841 */

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onData(int i, oOOO000O oooo000o, int i2, boolean z) throws IOException {
            oooo000o.m19759OooO00o((long) i2);
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public void onReset(int i, ErrorCode errorCode) {
        }
    };

    boolean onData(int i, oOOO000O oooo000o, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
