package anet.channel.bytes;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: anet.channel.bytes.a */
public class C0116a {
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";

    /* renamed from: a */
    public final TreeSet<ByteArray> f115a = new TreeSet<>();

    /* renamed from: b */
    public final ByteArray f116b = ByteArray.create(0);

    /* renamed from: c */
    public final Random f117c = new Random();

    /* renamed from: d */
    public long f118d = 0;

    /* renamed from: anet.channel.bytes.a$a */
    public static class C0117a {

        /* renamed from: a */
        public static C0116a f119a = new C0116a();
    }

    /* renamed from: a */
    public synchronized void mo3436a(ByteArray byteArray) {
        ByteArray byteArray2;
        if (byteArray != null) {
            if (byteArray.bufferLength < 524288) {
                this.f118d += (long) byteArray.bufferLength;
                this.f115a.add(byteArray);
                while (this.f118d > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    if (this.f117c.nextBoolean()) {
                        byteArray2 = this.f115a.pollFirst();
                    } else {
                        byteArray2 = this.f115a.pollLast();
                    }
                    this.f118d -= (long) byteArray2.bufferLength;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized ByteArray mo3434a(int i) {
        if (i >= 524288) {
            return ByteArray.create(i);
        }
        this.f116b.bufferLength = i;
        ByteArray ceiling = this.f115a.ceiling(this.f116b);
        if (ceiling == null) {
            ceiling = ByteArray.create(i);
        } else {
            Arrays.fill(ceiling.buffer, (byte) 0);
            ceiling.dataLength = 0;
            this.f115a.remove(ceiling);
            this.f118d -= (long) ceiling.bufferLength;
        }
        return ceiling;
    }

    /* renamed from: a */
    public ByteArray mo3435a(byte[] bArr, int i) {
        ByteArray a = mo3434a(i);
        System.arraycopy(bArr, 0, a.buffer, 0, i);
        a.dataLength = i;
        return a;
    }
}
