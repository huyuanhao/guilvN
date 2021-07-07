package okhttp3.internal.huc;

import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.OOoOO0;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import okhttp3.internal.http.UnrepeatableRequestBody;

public final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    public final OOoOO0 pipe;

    public StreamedRequestBody(long j) {
        OOoOO0 oOoOO0 = new OOoOO0(8192);
        this.pipe = oOoOO0;
        initOutputStream(C9143oooO0oOo.OooO00o(oOoOO0.OooO00o()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        OOOO000 oooo000 = new OOOO000();
        while (this.pipe.m16623OooO00o().read(oooo000, 8192) != -1) {
            oooo0000.write(oooo000, oooo000.OooO0o0());
        }
    }
}
