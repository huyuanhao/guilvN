package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.p118pd.sdk.C7246o00oooo;
import com.p118pd.sdk.C7533o0OoooO0;
import com.umeng.message.proguard.C3848l;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class MultiDexExtractor implements Closeable {
    public static final long OooO0O0 = -1;
    public static final String o00000 = "MultiDex.lock";
    public static final String o000000 = "dex.number";
    public static final String o000000O = "dex.crc.";
    public static final String o000000o = "dex.time.";
    public static final String o000OOo = "crc";
    public static final int o00oO0O = 3;
    public static final String o0O0O00 = "timestamp";
    public static final String o0OO00O = ".zip";
    public static final String o0OOO0o = ".dex";
    public static final String o0Oo0oo = ".classes";
    public static final int o0ooOO0 = 16384;
    public static final String o0ooOOo = "MultiDex";
    public static final String o0ooOoO = "classes";
    public static final String oo0o0Oo = "multidex.version";
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f14482OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RandomAccessFile f14483OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FileChannel f14484OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FileLock f14485OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final File f14486OooO0O0;

    public static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    public class OooO00o implements FileFilter {
        public OooO00o() {
        }

        public boolean accept(File file) {
            return !file.getName().equals(MultiDexExtractor.o00000);
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + C3848l.f10402t);
        this.f14482OooO00o = file;
        this.f14486OooO0O0 = file2;
        this.OooO00o = OooO0O0(file);
        File file3 = new File(file2, o00000);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f14483OooO00o = randomAccessFile;
        try {
            this.f14484OooO00o = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f14485OooO00o = this.f14484OooO00o.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e) {
                OooO00o(this.f14484OooO00o);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e2) {
            OooO00o(this.f14483OooO00o);
            throw e2;
        }
    }

    public static long OooO0O0(File file) throws IOException {
        long OooO00o2 = C7246o00oooo.OooO00o(file);
        return OooO00o2 == -1 ? OooO00o2 - 1 : OooO00o2;
    }

    public List<? extends File> OooO00o(Context context, String str, boolean z) throws IOException {
        List<ExtractedDex> list;
        List<ExtractedDex> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f14482OooO00o.getPath() + ", " + z + ", " + str + C3848l.f10402t);
        if (this.f14485OooO00o.isValid()) {
            if (z || OooO00o(context, this.f14482OooO00o, this.OooO00o, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = OooO00o();
                OooO00o(context, str, OooO00o(this.f14482OooO00o), this.OooO00o, list2);
            } else {
                try {
                    list = OooO00o(context, str);
                } catch (IOException unused) {
                    list2 = OooO00o();
                    OooO00o(context, str, OooO00o(this.f14482OooO00o), this.OooO00o, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14485OooO00o.release();
        this.f14484OooO00o.close();
        this.f14483OooO00o.close();
    }

    private List<ExtractedDex> OooO00o(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f14482OooO00o.getName() + o0Oo0oo;
        SharedPreferences OooO00o2 = OooO00o(context);
        int i = OooO00o2.getInt(str + o000000, 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.f14486OooO0O0, str2 + i2 + o0OO00O);
            if (extractedDex.isFile()) {
                extractedDex.crc = OooO0O0(extractedDex);
                long j = OooO00o2.getLong(str + o000000O + i2, -1);
                long j2 = OooO00o2.getLong(str + o000000o + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified && j == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i2++;
                    OooO00o2 = OooO00o2;
                    str2 = str2;
                } else {
                    throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
        }
        return arrayList;
    }

    public static boolean OooO00o(Context context, File file, long j, String str) {
        SharedPreferences OooO00o2 = OooO00o(context);
        if (OooO00o2.getLong(str + "timestamp", -1) == OooO00o(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(o000OOo);
            return OooO00o2.getLong(sb.toString(), -1) != j;
        }
    }

    public static long OooO00o(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private List<ExtractedDex> OooO00o() throws IOException {
        String str = this.f14482OooO00o.getName() + o0Oo0oo;
        m14693OooO00o();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f14482OooO00o);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry(o0ooOoO + 2 + o0OOO0o);
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f14486OooO0O0, str + i + o0OO00O);
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    OooO00o(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = OooO0O0(extractedDex);
                        z = true;
                    } catch (IOException unused) {
                        String str2 = "Failed to read crc from " + extractedDex.getAbsolutePath();
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : C7533o0OoooO0.OooO0O0);
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            String str3 = "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'";
                        }
                    }
                }
                if (z) {
                    i++;
                    entry = zipFile.getEntry(o0ooOoO + i + o0OOO0o);
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + C3848l.f10402t);
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public static void OooO00o(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = OooO00o(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + o000OOo, j2);
        edit.putInt(str + o000000, list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + o000000O + i, extractedDex.crc);
            edit.putLong(str + o000000o + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    public static SharedPreferences OooO00o(Context context) {
        return context.getSharedPreferences(oo0o0Oo, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m14693OooO00o() {
        File[] listFiles = this.f14486OooO0O0.listFiles(new OooO00o());
        if (listFiles == null) {
            String str = "Failed to list secondary dex dir content (" + this.f14486OooO0O0.getPath() + ").";
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                String str2 = "Failed to delete old file " + file.getPath();
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void OooO00o(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, o0OO00O, file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + file.getPath());
                    if (!createTempFile.renameTo(file)) {
                        throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                    }
                    return;
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            OooO00o(inputStream);
            createTempFile.delete();
        }
    }

    public static void OooO00o(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
