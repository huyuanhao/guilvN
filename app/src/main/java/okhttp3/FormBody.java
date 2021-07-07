package okhttp3;

import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import com.umeng.message.util.HttpRequest;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.Util;

public final class FormBody extends RequestBody {
    public static final MediaType CONTENT_TYPE = MediaType.get(HttpRequest.CONTENT_TYPE_FORM);
    public final List<String> encodedNames;
    public final List<String> encodedValues;

    public static final class Builder {
        public final Charset charset;
        public final List<String> names;
        public final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, HttpUrl.FORM_ENCODE_SET, true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, HttpUrl.FORM_ENCODE_SET, true, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(@Nullable oOOO0000 oooo0000, boolean z) {
        OOOO000 oooo000;
        if (z) {
            oooo000 = new OOOO000();
        } else {
            oooo000 = oooo0000.OooO00o();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                oooo000.OooO0o0(38);
            }
            oooo000.OooO00o(this.encodedNames.get(i));
            oooo000.OooO0o0(61);
            oooo000.OooO00o(this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long OooO0o0 = oooo000.OooO0o0();
        oooo000.m16610OooO0O0();
        return OooO0o0;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        writeOrCountBytes(oooo0000, false);
    }
}
