package com.p118pd.sdk;

import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: com.pd.sdk.o00O0O0  reason: case insensitive filesystem */
public final class C7053o00O0O0 {
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18325OooO00o() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static void OooO0O0(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Deprecated
    public static int OooO00o() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void OooO0O0(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }

    @Deprecated
    public static void OooO00o(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    public static void OooO0O0(@NonNull DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            TrafficStats.untagDatagramSocket(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.untagSocket(new C7054o00O0O00(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    @Deprecated
    public static void OooO00o(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    public static void OooO00o(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void OooO00o(@NonNull DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            TrafficStats.tagDatagramSocket(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.tagSocket(new C7054o00O0O00(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }
}
