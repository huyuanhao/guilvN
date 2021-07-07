package okhttp3.internal.cache2;

import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9193oooOoo;
import com.p118pd.sdk.OOOO000;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.ByteString;

public final class Relay {
    public static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
    public static final ByteString PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    public static final int SOURCE_FILE = 2;
    public static final int SOURCE_UPSTREAM = 1;
    public final OOOO000 buffer = new OOOO000();
    public final long bufferMaxSize;
    public boolean complete;
    public RandomAccessFile file;
    public final ByteString metadata;
    public int sourceCount;
    public AbstractC8930ooOOO0OO upstream;
    public final OOOO000 upstreamBuffer = new OOOO000();
    public long upstreamPos;
    public Thread upstreamReader;

    public class RelaySource implements AbstractC8930ooOOO0OO {
        public FileOperator fileOperator = new FileOperator(Relay.this.file.getChannel());
        public long sourcePos;
        public final C9193oooOoo timeout = new C9193oooOoo();

        public RelaySource() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile2 = Relay.this.file;
                        Relay.this.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
            r5 = 2;
         */
        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(com.p118pd.sdk.OOOO000 r22, long r23) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 324
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(com.pd.sdk.OOOO000, long):long");
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return this.timeout;
        }
    }

    public Relay(RandomAccessFile randomAccessFile, AbstractC8930ooOOO0OO ooooo0oo, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = ooooo0oo;
        this.complete = ooooo0oo == null;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file2, AbstractC8930ooOOO0OO ooooo0oo, ByteString byteString, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        Relay relay = new Relay(randomAccessFile, ooooo0oo, 0, byteString, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    public static Relay read(File file2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        OOOO000 oooo000 = new OOOO000();
        fileOperator.read(0, oooo000, 32);
        if (oooo000.m16597OooO00o((long) PREFIX_CLEAN.size()).equals(PREFIX_CLEAN)) {
            long readLong = oooo000.readLong();
            long readLong2 = oooo000.readLong();
            OOOO000 oooo0002 = new OOOO000();
            fileOperator.read(readLong + 32, oooo0002, readLong2);
            return new Relay(randomAccessFile, null, readLong, oooo0002.m16595OooO00o(), 0);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        OOOO000 oooo000 = new OOOO000();
        oooo000.OooO00o(byteString);
        oooo000.OooO0OO(j);
        oooo000.OooO0OO(j2);
        if (oooo000.OooO0o0() == 32) {
            new FileOperator(this.file.getChannel()).write(0, oooo000, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j) throws IOException {
        OOOO000 oooo000 = new OOOO000();
        oooo000.OooO00o(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, oooo000, (long) this.metadata.size());
    }

    public void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    public boolean isClosed() {
        return this.file == null;
    }

    public ByteString metadata() {
        return this.metadata;
    }

    public AbstractC8930ooOOO0OO newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
