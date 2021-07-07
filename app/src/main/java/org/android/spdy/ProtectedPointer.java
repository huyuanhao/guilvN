package org.android.spdy;

import java.util.concurrent.atomic.AtomicLong;

public class ProtectedPointer {
    public static final long CLOSED = 3;
    public static final long INIT = 1;
    public static final long WAIT_CLOSE = 2;
    public Object data2protected;
    public ProtectedPointerOnClose how2close;
    public AtomicLong referAndstatus = new AtomicLong(1);

    public interface ProtectedPointerOnClose {
        void close(Object obj);
    }

    public ProtectedPointer(Object obj) {
        this.data2protected = obj;
    }

    public boolean enter() {
        long j;
        do {
            j = this.referAndstatus.get();
            if (j == 3) {
                return false;
            }
        } while (!this.referAndstatus.compareAndSet(j, 16 + j));
        return true;
    }

    public void exit() {
        this.referAndstatus.addAndGet(-16);
        if (this.referAndstatus.compareAndSet(2, 3)) {
            ProtectedPointerOnClose protectedPointerOnClose = this.how2close;
            if (protectedPointerOnClose != null) {
                protectedPointerOnClose.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    public Object getData() {
        return this.data2protected;
    }

    public void release() {
        this.referAndstatus.incrementAndGet();
        if (this.referAndstatus.compareAndSet(2, 3)) {
            ProtectedPointerOnClose protectedPointerOnClose = this.how2close;
            if (protectedPointerOnClose != null) {
                protectedPointerOnClose.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    public void setHow2close(ProtectedPointerOnClose protectedPointerOnClose) {
        this.how2close = protectedPointerOnClose;
    }
}
