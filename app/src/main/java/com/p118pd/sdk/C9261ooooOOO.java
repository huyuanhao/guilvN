package com.p118pd.sdk;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "LocksKt")
/* renamed from: com.pd.sdk.ooooOOO  reason: case insensitive filesystem */
public final class C9261ooooOOO {
    @InlineOnly
    public static final <T> T OooO00o(@NotNull Lock lock, O00O0000<? extends T> o00o0000) {
        lock.lock();
        try {
            return (T) o00o0000.invoke();
        } finally {
            o0O0O0OO.OooO0O0(1);
            lock.unlock();
            o0O0O0OO.OooO00o(1);
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:311)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @kotlin.internal.InlineOnly
    public static final <T> T OooO0O0(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.ReentrantReadWriteLock r4, com.p118pd.sdk.O00O0000<? extends T> r5) {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L_0x0010
            int r1 = r4.getReadHoldCount()
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            r3 = 0
        L_0x0012:
            if (r3 >= r1) goto L_0x001a
            r0.unlock()
            int r3 = r3 + 1
            goto L_0x0012
        L_0x001a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0038 }
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r3)
        L_0x0029:
            if (r2 >= r1) goto L_0x0031
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0031:
            r4.unlock()
            com.p118pd.sdk.o0O0O0OO.OooO00o(r3)
            return r5
        L_0x0038:
            r5 = move-exception
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r3)
        L_0x003c:
            if (r2 >= r1) goto L_0x0044
            r0.lock()
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0044:
            r4.unlock()
            com.p118pd.sdk.o0O0O0OO.OooO00o(r3)
            goto L_0x004c
        L_0x004b:
            throw r5
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9261ooooOOO.OooO0O0(java.util.concurrent.locks.ReentrantReadWriteLock, com.pd.sdk.O00O0000):java.lang.Object");
    }

    @InlineOnly
    public static final <T> T OooO00o(@NotNull ReentrantReadWriteLock reentrantReadWriteLock, O00O0000<? extends T> o00o0000) {
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return (T) o00o0000.invoke();
        } finally {
            o0O0O0OO.OooO0O0(1);
            readLock.unlock();
            o0O0O0OO.OooO00o(1);
        }
    }
}
