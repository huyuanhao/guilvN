package anetwork.channel.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0116a;
import anet.channel.request.BodyEntry;
import com.p118pd.sdk.AbstractC7318o0O0OoO0;
import com.p118pd.sdk.AbstractC7325o0O0o0;
import com.p118pd.sdk.BinderC7335o0O0o0oO;
import com.p118pd.sdk.C7251o0O;
import java.io.IOException;
import java.io.OutputStream;

public class BodyHandlerEntry implements BodyEntry {
    public static final Parcelable.Creator<BodyHandlerEntry> CREATOR = new C7251o0O();
    public AbstractC7325o0O0o0 OooO00o;

    public /* synthetic */ BodyHandlerEntry(C7251o0O o0o) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return null;
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        try {
            ByteArray a = C0116a.C0117a.f119a.mo3434a(2048);
            int i = 0;
            while (!this.OooO00o.OooO00o()) {
                int read = this.OooO00o.read(a.getBuffer());
                outputStream.write(a.getBuffer(), 0, read);
                i += read;
            }
            a.recycle();
            return i;
        } catch (RemoteException e) {
            throw new IOException("RemoteException", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongInterface(this.OooO00o);
    }

    public BodyHandlerEntry(AbstractC7318o0O0OoO0 o0o0ooo0) {
        this.OooO00o = null;
        this.OooO00o = new BinderC7335o0O0o0oO(o0o0ooo0);
    }

    public BodyHandlerEntry() {
        this.OooO00o = null;
    }
}
