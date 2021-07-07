package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;

@DoNotStrip
public class HybridData {
    @DoNotStrip
    public Destructor mDestructor = new Destructor(this);

    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        public long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j);

        @Override // com.facebook.jni.DestructorThread.Destructor
        public void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        SoLoader.loadLibrary("fb");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
