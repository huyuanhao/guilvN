package com.p118pd.sdk;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import com.p118pd.sdk.AbstractC7331o0O0o0OO;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.pd.sdk.o0O0oo0O  reason: case insensitive filesystem */
public class BinderC7351o0O0oo0O extends AbstractC7331o0O0o0OO.OooO00o {
    public static final ByteArray OooO00o = ByteArray.create(0);
    public static final String OooO0OO = "anet.ParcelableInputStreamImpl";
    public int OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinkedList<ByteArray> f20078OooO00o = new LinkedList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicBoolean f20079OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Condition f20080OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ReentrantLock f20081OooO00o;
    public String OooO0O0 = "";
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O = 10000;

    public BinderC7351o0O0oo0O() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f20081OooO00o = reentrantLock;
        this.f20080OooO00o = reentrantLock.newCondition();
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    private void OooO0O0() {
        this.f20081OooO00o.lock();
        try {
            this.f20078OooO00o.set(this.OooO0oo, OooO00o).recycle();
        } finally {
            this.f20081OooO00o.unlock();
        }
    }

    public void OooO00o(ByteArray byteArray) {
        if (!this.f20079OooO00o.get()) {
            this.f20081OooO00o.lock();
            try {
                this.f20078OooO00o.add(byteArray);
                this.f20080OooO00o.signal();
            } finally {
                this.f20081OooO00o.unlock();
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    public int available() throws RemoteException {
        if (!this.f20079OooO00o.get()) {
            this.f20081OooO00o.lock();
            try {
                int i = 0;
                if (this.OooO0oo == this.f20078OooO00o.size()) {
                    return 0;
                }
                ListIterator<ByteArray> listIterator = this.f20078OooO00o.listIterator(this.OooO0oo);
                while (listIterator.hasNext()) {
                    i += listIterator.next().getDataLength();
                }
                int i2 = i - this.OooO;
                this.f20081OooO00o.unlock();
                return i2;
            } finally {
                this.f20081OooO00o.unlock();
            }
        } else {
            throw new RuntimeException("Stream is closed");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    public void close() throws RemoteException {
        if (this.f20079OooO00o.compareAndSet(false, true)) {
            this.f20081OooO00o.lock();
            try {
                Iterator<ByteArray> it = this.f20078OooO00o.iterator();
                while (it.hasNext()) {
                    ByteArray next = it.next();
                    if (next != OooO00o) {
                        next.recycle();
                    }
                }
                this.f20078OooO00o.clear();
                this.f20078OooO00o = null;
                this.OooO0oo = -1;
                this.OooO = -1;
                this.OooOO0 = 0;
            } finally {
                this.f20081OooO00o.unlock();
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    public int length() throws RemoteException {
        return this.OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    public int read(byte[] bArr) throws RemoteException {
        return OooO00o(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        throw new java.lang.RuntimeException("await interrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r4.f20081OooO00o.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006b */
    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m18858OooO0O0() throws android.os.RemoteException {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.BinderC7351o0O0oo0O.m18858OooO0O0():int");
    }

    public void OooO00o() {
        OooO00o(OooO00o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        throw new java.lang.RuntimeException("await interrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        r5.f20081OooO00o.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0080 */
    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int OooO00o(byte[] r6, int r7, int r8) throws android.os.RemoteException {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.BinderC7351o0O0oo0O.OooO00o(byte[], int, int):int");
    }

    @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
    public long OooO00o(int i) throws RemoteException {
        this.f20081OooO00o.lock();
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            try {
                if (this.OooO0oo == this.f20078OooO00o.size()) {
                    break;
                }
                ByteArray byteArray = this.f20078OooO00o.get(this.OooO0oo);
                if (byteArray == OooO00o) {
                    break;
                }
                int dataLength = byteArray.getDataLength();
                if (dataLength - this.OooO < i - i2) {
                    i2 += dataLength - this.OooO;
                    OooO0O0();
                    this.OooO0oo++;
                    this.OooO = 0;
                    break;
                }
                this.OooO += i - i;
                i2 = i;
            } catch (Throwable th) {
                this.f20081OooO00o.unlock();
                throw th;
            }
        }
        this.f20081OooO00o.unlock();
        return (long) i2;
    }

    public void OooO00o(C7503o0OoOoO o0ooooo, int i) {
        this.OooOO0 = i;
        this.OooO0O0 = o0ooooo.f20342OooO00o;
        this.OooOO0O = o0ooooo.OooO0o0;
    }
}
