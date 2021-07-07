package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.common.ReactConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@DoNotStrip
public class Inspector {
    public final HybridData mHybridData;

    @DoNotStrip
    public static class LocalConnection {
        public final HybridData mHybridData;

        public LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @DoNotStrip
    public static class Page {
        public final int mId;
        public final String mTitle;
        public final String mVM;

        @DoNotStrip
        public Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + '\'' + '}';
        }
    }

    @DoNotStrip
    public interface RemoteConnection {
        @DoNotStrip
        void onDisconnect();

        @DoNotStrip
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    public Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            return instance().connectNative(i, remoteConnection);
        } catch (UnsatisfiedLinkError e) {
            FLog.m874e(ReactConstants.TAG, "Inspector doesn't work in open source yet", e);
            throw new RuntimeException(e);
        }
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e) {
            FLog.m874e(ReactConstants.TAG, "Inspector doesn't work in open source yet", e);
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    public static native Inspector instance();
}
