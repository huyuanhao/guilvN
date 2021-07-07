package okhttp3.internal.p287io;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9143oooO0oOo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        /* class okhttp3.internal.p287io.FileSystem.C47871 */

        @Override // okhttp3.internal.p287io.FileSystem
        public AbstractC8210oOOoO0o0 appendingSink(File file) throws FileNotFoundException {
            try {
                return C9143oooO0oOo.OooO00o(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9143oooO0oOo.OooO00o(file);
            }
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public AbstractC8210oOOoO0o0 sink(File file) throws FileNotFoundException {
            try {
                return C9143oooO0oOo.OooO0O0(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9143oooO0oOo.OooO0O0(file);
            }
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.p287io.FileSystem
        public AbstractC8930ooOOO0OO source(File file) throws FileNotFoundException {
            return C9143oooO0oOo.m20888OooO00o(file);
        }
    };

    AbstractC8210oOOoO0o0 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    AbstractC8210oOOoO0o0 sink(File file) throws FileNotFoundException;

    long size(File file);

    AbstractC8930ooOOO0OO source(File file) throws FileNotFoundException;
}
