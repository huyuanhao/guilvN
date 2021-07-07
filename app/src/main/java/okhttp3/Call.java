package okhttp3;

import com.p118pd.sdk.C9193oooOoo;
import java.io.IOException;

public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    @Override // java.lang.Object
    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C9193oooOoo timeout();
}
