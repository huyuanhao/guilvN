package com.p118pd.sdk;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.ooOOo0O  reason: case insensitive filesystem */
public class C8967ooOOo0O extends ResponseBody {
    public oOOO000O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8966ooOOo00o f22231OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseBody f22232OooO00o;

    /* renamed from: com.pd.sdk.ooOOo0O$OooO00o */
    public class OooO00o extends oOOO00OO {
        public long OooO00o = 0;

        public OooO00o(AbstractC8930ooOOO0OO ooooo0oo) {
            super(ooooo0oo);
        }

        @Override // com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            long read = super.read(oooo000, j);
            if (read != -1) {
                this.OooO00o += read;
            }
            if (C8967ooOOo0O.this.f22231OooO00o != null) {
                C8967ooOOo0O.this.f22231OooO00o.OooO00o(this.OooO00o, C8967ooOOo0O.this.contentLength(), read == -1);
            }
            return read;
        }
    }

    public C8967ooOOo0O(AbstractC8966ooOOo00o ooooo00o, ResponseBody responseBody) {
        this.f22231OooO00o = ooooo00o;
        this.f22232OooO00o = responseBody;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f22232OooO00o.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f22232OooO00o.contentType();
    }

    @Override // okhttp3.ResponseBody
    public oOOO000O source() {
        if (this.OooO00o == null) {
            this.OooO00o = C9143oooO0oOo.OooO00o(source(this.f22232OooO00o.source()));
        }
        return this.OooO00o;
    }

    private AbstractC8930ooOOO0OO source(AbstractC8930ooOOO0OO ooooo0oo) {
        return new OooO00o(ooooo0oo);
    }
}
