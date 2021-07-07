package com.p118pd.sdk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p003os.OperationCanceledException;
import com.p118pd.sdk.C7226o00ooO00;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: com.pd.sdk.o00oo  reason: case insensitive filesystem */
public class C7213o00oo extends AbstractC7324o0O0o<Cursor> {
    public C7056o00O0O0o mCancellationSignal;
    public Cursor mCursor;
    public final C7226o00ooO00<Cursor>.OooO00o mObserver = new C7226o00ooO00.OooO00o();
    public String[] mProjection;
    public String mSelection;
    public String[] mSelectionArgs;
    public String mSortOrder;
    public Uri mUri;

    public C7213o00oo(@NonNull Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC7324o0O0o
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            if (this.mCancellationSignal != null) {
                this.mCancellationSignal.m18326OooO00o();
            }
        }
    }

    @Override // com.p118pd.sdk.C7226o00ooO00, com.p118pd.sdk.AbstractC7324o0O0o
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.mUri);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.mProjection));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.mSelection);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.mSelectionArgs));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.mSortOrder);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.mCursor);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @Nullable
    public String[] getProjection() {
        return this.mProjection;
    }

    @Nullable
    public String getSelection() {
        return this.mSelection;
    }

    @Nullable
    public String[] getSelectionArgs() {
        return this.mSelectionArgs;
    }

    @Nullable
    public String getSortOrder() {
        return this.mSortOrder;
    }

    @NonNull
    public Uri getUri() {
        return this.mUri;
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.mCursor;
        if (cursor != null && !cursor.isClosed()) {
            this.mCursor.close();
        }
        this.mCursor = null;
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public void onStartLoading() {
        Cursor cursor = this.mCursor;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.mCursor == null) {
            forceLoad();
        }
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(@Nullable String[] strArr) {
        this.mProjection = strArr;
    }

    public void setSelection(@Nullable String str) {
        this.mSelection = str;
    }

    public void setSelectionArgs(@Nullable String[] strArr) {
        this.mSelectionArgs = strArr;
    }

    public void setSortOrder(@Nullable String str) {
        this.mSortOrder = str;
    }

    public void setUri(@NonNull Uri uri) {
        this.mUri = uri;
    }

    public void deliverResult(Cursor cursor) {
        if (!isReset()) {
            Cursor cursor2 = this.mCursor;
            this.mCursor = cursor;
            if (isStarted()) {
                super.deliverResult((Object) cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7324o0O0o
    public Cursor loadInBackground() {
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.mCancellationSignal = new C7056o00O0O0o();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor OooO00o = C7008o000OoOO.OooO00o(getContext().getContentResolver(), this.mUri, this.mProjection, this.mSelection, this.mSelectionArgs, this.mSortOrder, this.mCancellationSignal);
            if (OooO00o != null) {
                try {
                    OooO00o.getCount();
                    OooO00o.registerContentObserver(this.mObserver);
                } catch (RuntimeException e) {
                    OooO00o.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.mCancellationSignal = null;
            }
            return OooO00o;
        } catch (Throwable th) {
            synchronized (this) {
                this.mCancellationSignal = null;
                throw th;
            }
        }
    }

    public void onCanceled(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public C7213o00oo(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.mUri = uri;
        this.mProjection = strArr;
        this.mSelection = str;
        this.mSelectionArgs = strArr2;
        this.mSortOrder = str2;
    }
}
