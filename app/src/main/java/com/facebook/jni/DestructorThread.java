package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

public class DestructorThread {
    public static DestructorList sDestructorList = new DestructorList();
    public static DestructorStack sDestructorStack = new DestructorStack();
    public static ReferenceQueue sReferenceQueue = new ReferenceQueue();
    public static Thread sThread;

    public static abstract class Destructor extends PhantomReference<Object> {
        public Destructor next;
        public Destructor previous;

        public abstract void destruct();

        public Destructor(Object obj) {
            super(obj, DestructorThread.sReferenceQueue);
            DestructorThread.sDestructorStack.push(this);
        }

        public Destructor() {
            super(null, DestructorThread.sReferenceQueue);
        }
    }

    public static class DestructorList {
        public Destructor mHead;

        public DestructorList() {
            Terminus terminus = new Terminus();
            this.mHead = terminus;
            terminus.next = new Terminus();
            this.mHead.next.previous = this.mHead;
        }

        public static void drop(Destructor destructor) {
            destructor.next.previous = destructor.previous;
            destructor.previous.next = destructor.next;
        }

        public void enqueue(Destructor destructor) {
            destructor.next = this.mHead.next;
            this.mHead.next = destructor;
            destructor.next.previous = destructor;
            destructor.previous = this.mHead;
        }
    }

    public static class DestructorStack {
        public AtomicReference<Destructor> mHead;

        public DestructorStack() {
            this.mHead = new AtomicReference<>();
        }

        public void push(Destructor destructor) {
            Destructor destructor2;
            do {
                destructor2 = this.mHead.get();
                destructor.next = destructor2;
            } while (!this.mHead.compareAndSet(destructor2, destructor));
        }

        public void transferAllToList() {
            Destructor andSet = this.mHead.getAndSet(null);
            while (andSet != null) {
                Destructor destructor = andSet.next;
                DestructorThread.sDestructorList.enqueue(andSet);
                andSet = destructor;
            }
        }
    }

    public static class Terminus extends Destructor {
        public Terminus() {
            super();
        }

        @Override // com.facebook.jni.DestructorThread.Destructor
        public void destruct() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        C05771 r0 = new Thread("HybridData DestructorThread") {
            /* class com.facebook.jni.DestructorThread.C05771 */

            /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(2:3|5)(1:6)|4) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:4:0x001a, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r2 = this;
                L_0x0000:
                    java.lang.ref.ReferenceQueue r0 = com.facebook.jni.DestructorThread.access$000()     // Catch:{ InterruptedException -> 0x0000 }
                    java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.DestructorThread$Destructor r0 = (com.facebook.jni.DestructorThread.Destructor) r0     // Catch:{ InterruptedException -> 0x0000 }
                    r0.destruct()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.DestructorThread$Destructor r1 = com.facebook.jni.DestructorThread.Destructor.access$300(r0)     // Catch:{ InterruptedException -> 0x0000 }
                    if (r1 != 0) goto L_0x001a
                    com.facebook.jni.DestructorThread$DestructorStack r1 = com.facebook.jni.DestructorThread.access$100()     // Catch:{ InterruptedException -> 0x0000 }
                    r1.transferAllToList()     // Catch:{ InterruptedException -> 0x0000 }
                L_0x001a:
                    com.facebook.jni.DestructorThread.DestructorList.access$400(r0)     // Catch:{ InterruptedException -> 0x0000 }
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.jni.DestructorThread.C05771.run():void");
            }
        };
        sThread = r0;
        r0.start();
    }
}
