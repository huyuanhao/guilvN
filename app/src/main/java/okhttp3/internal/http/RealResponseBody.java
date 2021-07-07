package okhttp3.internal.http;

import com.p118pd.sdk.oOOO000O;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {
    public final long contentLength;
    @Nullable
    public final String contentTypeString;
    public final oOOO000O source;

    public RealResponseBody(@Nullable String str, long j, oOOO000O oooo000o) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = oooo000o;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public oOOO000O source() {
        return this.source;
    }
}
