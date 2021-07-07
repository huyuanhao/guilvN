package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7200o00oOOoO;

public abstract class Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(@NonNull State state) {
            return compareTo(state) >= 0;
        }
    }

    @NonNull
    @MainThread
    public abstract State OooO00o();

    @MainThread
    public abstract void OooO00o(@NonNull AbstractC7200o00oOOoO o00ooooo);

    @MainThread
    public abstract void OooO0O0(@NonNull AbstractC7200o00oOOoO o00ooooo);
}
