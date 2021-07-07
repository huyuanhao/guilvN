package com.facebook.soloader;

import android.os.StrictMode;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class DirectorySoSource extends SoSource {
    public static final int ON_LD_LIBRARY_PATH = 2;
    public static final int RESOLVE_DEPENDENCIES = 1;
    public final int flags;
    public final File soDirectory;

    public DirectorySoSource(File file, int i) {
        this.soDirectory = file;
        this.flags = i;
    }

    public static String[] getDependencies(File file) throws IOException {
        if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
            Api18TraceUtils.beginTraceSection("SoLoader.getElfDependencies[" + file.getName() + "]");
        }
        try {
            return MinElf.extract_DT_NEEDED(file);
        } finally {
            if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
                Api18TraceUtils.endSection();
            }
        }
    }

    private void loadDependencies(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] dependencies = getDependencies(file);
        String str = "Loading lib dependencies: " + Arrays.toString(dependencies);
        for (String str2 : dependencies) {
            if (!str2.startsWith(C8932ooOOO0o.OooO0OO)) {
                SoLoader.loadLibraryBySoName(str2, i | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.SoSource
    public void addToLdLibraryPath(Collection<String> collection) {
        collection.add(this.soDirectory.getAbsolutePath());
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
    }

    public int loadLibraryFrom(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            String str2 = str + " not found on " + file.getCanonicalPath();
            return 0;
        }
        String str3 = str + " found on " + file.getCanonicalPath();
        if ((i & 1) == 0 || (this.flags & 2) == 0) {
            if ((this.flags & 1) != 0) {
                loadDependencies(file2, i, threadPolicy);
            } else {
                String str4 = "Not resolving dependencies for " + str;
            }
            try {
                SoLoader.sSoFileLoader.load(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    return 3;
                }
                throw e;
            }
        } else {
            String str5 = str + " loaded implicitly";
            return 2;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            str = this.soDirectory.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.flags + ']';
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public File unpackLibrary(String str) throws IOException {
        File file = new File(this.soDirectory, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
