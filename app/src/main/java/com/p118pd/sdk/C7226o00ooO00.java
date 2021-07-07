package com.p118pd.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.pd.sdk.o00ooO00  reason: case insensitive filesystem */
public class C7226o00ooO00<D> {
    public boolean mAbandoned = false;
    public boolean mContentChanged = false;
    public Context mContext;
    public int mId;
    public OooO0OO<D> mListener;
    public OooO0O0<D> mOnLoadCanceledListener;
    public boolean mProcessingChange = false;
    public boolean mReset = true;
    public boolean mStarted = false;

    /* renamed from: com.pd.sdk.o00ooO00$OooO00o */
    public final class OooO00o extends ContentObserver {
        public OooO00o() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C7226o00ooO00.this.onContentChanged();
        }
    }

    /* renamed from: com.pd.sdk.o00ooO00$OooO0O0 */
    public interface OooO0O0<D> {
        void OooO00o(@NonNull C7226o00ooO00<D> o00ooo00);
    }

    /* renamed from: com.pd.sdk.o00ooO00$OooO0OO */
    public interface OooO0OO<D> {
        void OooO00o(@NonNull C7226o00ooO00<D> o00ooo00, @Nullable D d);
    }

    public C7226o00ooO00(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @MainThread
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @MainThread
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(@Nullable D d) {
        StringBuilder sb = new StringBuilder(64);
        C7082o00OO00O.OooO00o(d, sb);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }

    @MainThread
    public void deliverCancellation() {
        OooO0O0<D> oooO0O0 = this.mOnLoadCanceledListener;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(this);
        }
    }

    @MainThread
    public void deliverResult(@Nullable D d) {
        OooO0OO<D> oooO0OO = this.mListener;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @MainThread
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @MainThread
    public void onAbandon() {
    }

    @MainThread
    public boolean onCancelLoad() {
        return false;
    }

    @MainThread
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    @MainThread
    public void onStartLoading() {
    }

    @MainThread
    public void onStopLoading() {
    }

    @MainThread
    public void registerListener(int i, @NonNull OooO0OO<D> oooO0OO) {
        if (this.mListener == null) {
            this.mListener = oooO0OO;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OooO0O0<D> oooO0O0) {
        if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = oooO0O0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @MainThread
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @MainThread
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C7082o00OO00O.OooO00o(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }

    @MainThread
    public void unregisterListener(@NonNull OooO0OO<D> oooO0OO) {
        OooO0OO<D> oooO0OO2 = this.mListener;
        if (oooO0OO2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (oooO0OO2 == oooO0OO) {
            this.mListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OooO0O0<D> oooO0O0) {
        OooO0O0<D> oooO0O02 = this.mOnLoadCanceledListener;
        if (oooO0O02 == null) {
            throw new IllegalStateException("No listener register");
        } else if (oooO0O02 == oooO0O0) {
            this.mOnLoadCanceledListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
