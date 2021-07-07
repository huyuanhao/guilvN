package com.facebook.soloader;

import java.util.List;
import javax.annotation.Nullable;

public abstract class NativeLibrary {
    public static final String TAG = "com.facebook.soloader.NativeLibrary";
    public boolean mLibrariesLoaded = false;
    @Nullable
    public List<String> mLibraryNames;
    @Nullable
    public volatile UnsatisfiedLinkError mLinkError = null;
    public Boolean mLoadLibraries = true;
    public final Object mLock = new Object();

    public NativeLibrary(List<String> list) {
        this.mLibraryNames = list;
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
        if (!loadLibraries()) {
            throw this.mLinkError;
        }
    }

    @Nullable
    public UnsatisfiedLinkError getError() {
        return this.mLinkError;
    }

    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }

    @Nullable
    public boolean loadLibraries() {
        synchronized (this.mLock) {
            if (!this.mLoadLibraries.booleanValue()) {
                return this.mLibrariesLoaded;
            }
            try {
                if (this.mLibraryNames != null) {
                    for (String str : this.mLibraryNames) {
                        SoLoader.loadLibrary(str);
                    }
                }
                initialNativeCheck();
                this.mLibrariesLoaded = true;
                this.mLibraryNames = null;
            } catch (UnsatisfiedLinkError e) {
                this.mLinkError = e;
                this.mLibrariesLoaded = false;
            } catch (Throwable th) {
                this.mLinkError = new UnsatisfiedLinkError("Failed loading libraries");
                this.mLinkError.initCause(th);
                this.mLibrariesLoaded = false;
            }
            this.mLoadLibraries = false;
            return this.mLibrariesLoaded;
        }
    }
}
