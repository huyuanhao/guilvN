package okhttp3.internal.cache;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO00O0;
import java.io.IOException;

public class FaultHidingSink extends oOOO00O0 {
    public boolean hasErrors;

    public FaultHidingSink(AbstractC8210oOOoO0o0 ooooo0o0) {
        super(ooooo0o0);
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0, java.io.Flushable
    public void flush() throws IOException {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void onException(IOException iOException) {
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0
    public void write(OOOO000 oooo000, long j) throws IOException {
        if (this.hasErrors) {
            oooo000.m16600OooO00o(j);
            return;
        }
        try {
            super.write(oooo000, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
