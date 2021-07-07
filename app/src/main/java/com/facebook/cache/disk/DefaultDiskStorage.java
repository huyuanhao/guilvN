package com.facebook.cache.disk;

import android.os.Environment;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.common.file.FileTree;
import com.facebook.common.file.FileTreeVisitor;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.CountingOutputStream;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class DefaultDiskStorage implements DiskStorage {
    public static final String CONTENT_FILE_EXTENSION = ".cnt";
    public static final String DEFAULT_DISK_STORAGE_VERSION_PREFIX = "v2";
    public static final int SHARDING_BUCKET_COUNT = 100;
    public static final Class<?> TAG = DefaultDiskStorage.class;
    public static final String TEMP_FILE_EXTENSION = ".tmp";
    public static final long TEMP_FILE_LIFETIME_MS = TimeUnit.MINUTES.toMillis(30);
    public final CacheErrorLogger mCacheErrorLogger;
    public final Clock mClock = SystemClock.get();
    public final boolean mIsExternal;
    public final File mRootDirectory;
    public final File mVersionDirectory;

    public class EntriesCollector implements FileTreeVisitor {
        public final List<DiskStorage.Entry> result;

        public EntriesCollector() {
            this.result = new ArrayList();
        }

        public List<DiskStorage.Entry> getEntries() {
            return Collections.unmodifiableList(this.result);
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void postVisitDirectory(File file) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void preVisitDirectory(File file) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void visitFile(File file) {
            FileInfo shardFileInfo = DefaultDiskStorage.this.getShardFileInfo(file);
            if (shardFileInfo != null && shardFileInfo.type == ".cnt") {
                this.result.add(new EntryImpl(shardFileInfo.resourceId, file));
            }
        }
    }

    @VisibleForTesting
    public static class EntryImpl implements DiskStorage.Entry {

        /* renamed from: id */
        public final String f957id;
        public final FileBinaryResource resource;
        public long size;
        public long timestamp;

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public String getId() {
            return this.f957id;
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public long getSize() {
            if (this.size < 0) {
                this.size = this.resource.size();
            }
            return this.size;
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public long getTimestamp() {
            if (this.timestamp < 0) {
                this.timestamp = this.resource.getFile().lastModified();
            }
            return this.timestamp;
        }

        public EntryImpl(String str, File file) {
            Preconditions.checkNotNull(file);
            this.f957id = (String) Preconditions.checkNotNull(str);
            this.resource = FileBinaryResource.createOrNull(file);
            this.size = -1;
            this.timestamp = -1;
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public FileBinaryResource getResource() {
            return this.resource;
        }
    }

    public static class FileInfo {
        public final String resourceId;
        @FileType
        public final String type;

        @Nullable
        public static FileInfo fromFile(File file) {
            String fileTypefromExtension;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (fileTypefromExtension = DefaultDiskStorage.getFileTypefromExtension(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (fileTypefromExtension.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new FileInfo(fileTypefromExtension, substring);
        }

        public File createTempFile(File file) throws IOException {
            return File.createTempFile(this.resourceId + C9058ooOoOoOO.OooOO0, ".tmp", file);
        }

        public String toPath(String str) {
            return str + File.separator + this.resourceId + this.type;
        }

        public String toString() {
            return this.type + C3848l.f10401s + this.resourceId + C3848l.f10402t;
        }

        public FileInfo(@FileType String str, String str2) {
            this.type = str;
            this.resourceId = str2;
        }
    }

    public @interface FileType {
        public static final String CONTENT = ".cnt";
        public static final String TEMP = ".tmp";
    }

    public static class IncompleteFileException extends IOException {
        public final long actual;
        public final long expected;

        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.expected = j;
            this.actual = j2;
        }
    }

    @VisibleForTesting
    public class InserterImpl implements DiskStorage.Inserter {
        public final String mResourceId;
        @VisibleForTesting
        public final File mTemporaryFile;

        public InserterImpl(String str, File file) {
            this.mResourceId = str;
            this.mTemporaryFile = file;
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public boolean cleanUp() {
            return !this.mTemporaryFile.exists() || this.mTemporaryFile.delete();
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public BinaryResource commit(Object obj) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File contentFileFor = DefaultDiskStorage.this.getContentFileFor(this.mResourceId);
            try {
                FileUtils.rename(this.mTemporaryFile, contentFileFor);
                if (contentFileFor.exists()) {
                    contentFileFor.setLastModified(DefaultDiskStorage.this.mClock.now());
                }
                return FileBinaryResource.createOrNull(contentFileFor);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.mCacheErrorLogger.logError(cacheErrorCategory, DefaultDiskStorage.TAG, "commit", e);
                throw e;
            }
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public void writeData(WriterCallback writerCallback, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.mTemporaryFile);
                try {
                    CountingOutputStream countingOutputStream = new CountingOutputStream(fileOutputStream);
                    writerCallback.write(countingOutputStream);
                    countingOutputStream.flush();
                    long count = countingOutputStream.getCount();
                    fileOutputStream.close();
                    if (this.mTemporaryFile.length() != count) {
                        throw new IncompleteFileException(count, this.mTemporaryFile.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.this.mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.TAG, "updateResource", e);
                throw e;
            }
        }
    }

    public class PurgingVisitor implements FileTreeVisitor {
        public boolean insideBaseDirectory;

        public PurgingVisitor() {
        }

        private boolean isExpectedFile(File file) {
            FileInfo shardFileInfo = DefaultDiskStorage.this.getShardFileInfo(file);
            boolean z = false;
            if (shardFileInfo == null) {
                return false;
            }
            String str = shardFileInfo.type;
            if (str == ".tmp") {
                return isRecentFile(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            Preconditions.checkState(z);
            return true;
        }

        private boolean isRecentFile(File file) {
            return file.lastModified() > DefaultDiskStorage.this.mClock.now() - DefaultDiskStorage.TEMP_FILE_LIFETIME_MS;
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void postVisitDirectory(File file) {
            if (!DefaultDiskStorage.this.mRootDirectory.equals(file) && !this.insideBaseDirectory) {
                file.delete();
            }
            if (this.insideBaseDirectory && file.equals(DefaultDiskStorage.this.mVersionDirectory)) {
                this.insideBaseDirectory = false;
            }
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void preVisitDirectory(File file) {
            if (!this.insideBaseDirectory && file.equals(DefaultDiskStorage.this.mVersionDirectory)) {
                this.insideBaseDirectory = true;
            }
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void visitFile(File file) {
            if (!this.insideBaseDirectory || !isExpectedFile(file)) {
                file.delete();
            }
        }
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        Preconditions.checkNotNull(file);
        this.mRootDirectory = file;
        this.mIsExternal = isExternal(file, cacheErrorLogger);
        this.mVersionDirectory = new File(this.mRootDirectory, getVersionSubdirectoryName(i));
        this.mCacheErrorLogger = cacheErrorLogger;
        recreateDirectoryIfVersionChanges();
    }

    private long doRemove(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    private DiskStorage.DiskDumpInfoEntry dumpCacheEntry(DiskStorage.Entry entry) throws IOException {
        String str;
        EntryImpl entryImpl = (EntryImpl) entry;
        byte[] read = entryImpl.getResource().read();
        String typeOfBytes = typeOfBytes(read);
        if (!typeOfBytes.equals("undefined") || read.length < 4) {
            str = "";
        } else {
            str = String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", Byte.valueOf(read[0]), Byte.valueOf(read[1]), Byte.valueOf(read[2]), Byte.valueOf(read[3]));
        }
        return new DiskStorage.DiskDumpInfoEntry(entryImpl.getResource().getFile().getPath(), typeOfBytes, (float) entryImpl.getSize(), str);
    }

    @FileType
    @Nullable
    public static String getFileTypefromExtension(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String getFilename(String str) {
        FileInfo fileInfo = new FileInfo(".cnt", str);
        return fileInfo.toPath(getSubdirectoryPath(fileInfo.resourceId));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private FileInfo getShardFileInfo(File file) {
        FileInfo fromFile = FileInfo.fromFile(file);
        if (fromFile == null) {
            return null;
        }
        if (getSubdirectory(fromFile.resourceId).equals(file.getParentFile())) {
            return fromFile;
        }
        return null;
    }

    private File getSubdirectory(String str) {
        return new File(getSubdirectoryPath(str));
    }

    private String getSubdirectoryPath(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.mVersionDirectory + File.separator + valueOf;
    }

    @VisibleForTesting
    public static String getVersionSubdirectoryName(int i) {
        return String.format(null, "%s.ols%d.%d", DEFAULT_DISK_STORAGE_VERSION_PREFIX, 100, Integer.valueOf(i));
    }

    public static boolean isExternal(File file, CacheErrorLogger cacheErrorLogger) {
        IOException e;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e2) {
                    e = e2;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.OTHER;
                    Class<?> cls = TAG;
                    cacheErrorLogger.logError(cacheErrorCategory, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory2 = CacheErrorLogger.CacheErrorCategory.OTHER;
                Class<?> cls2 = TAG;
                cacheErrorLogger.logError(cacheErrorCategory2, cls2, "failed to read folder to check if external: " + ((String) null), e);
                return false;
            }
        } catch (Exception e4) {
            cacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.OTHER, TAG, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    private void mkdirs(File file, String str) throws IOException {
        try {
            FileUtils.mkdirs(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, TAG, str, e);
            throw e;
        }
    }

    private boolean query(String str, boolean z) {
        File contentFileFor = getContentFileFor(str);
        boolean exists = contentFileFor.exists();
        if (z && exists) {
            contentFileFor.setLastModified(this.mClock.now());
        }
        return exists;
    }

    private void recreateDirectoryIfVersionChanges() {
        boolean z = true;
        if (this.mRootDirectory.exists()) {
            if (!this.mVersionDirectory.exists()) {
                FileTree.deleteRecursively(this.mRootDirectory);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                FileUtils.mkdirs(this.mVersionDirectory);
            } catch (FileUtils.CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.mCacheErrorLogger;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Class<?> cls = TAG;
                cacheErrorLogger.logError(cacheErrorCategory, cls, "version directory could not be created: " + this.mVersionDirectory, null);
            }
        }
    }

    private String typeOfBytes(byte[] bArr) {
        if (bArr.length < 2) {
            return "undefined";
        }
        if (bArr[0] == -1 && bArr[1] == -40) {
            return BitmapUtils.IMAGE_KEY_SUFFIX;
        }
        if (bArr[0] == -119 && bArr[1] == 80) {
            return "png";
        }
        if (bArr[0] == 82 && bArr[1] == 73) {
            return "webp";
        }
        return (bArr[0] == 71 && bArr[1] == 73) ? "gif" : "undefined";
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public void clearAll() {
        FileTree.deleteContents(this.mRootDirectory);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean contains(String str, Object obj) {
        return query(str, false);
    }

    @VisibleForTesting
    public File getContentFileFor(String str) {
        return new File(getFilename(str));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public DiskStorage.DiskDumpInfo getDumpInfo() throws IOException {
        List<DiskStorage.Entry> entries = getEntries();
        DiskStorage.DiskDumpInfo diskDumpInfo = new DiskStorage.DiskDumpInfo();
        for (DiskStorage.Entry entry : entries) {
            DiskStorage.DiskDumpInfoEntry dumpCacheEntry = dumpCacheEntry(entry);
            String str = dumpCacheEntry.type;
            if (!diskDumpInfo.typeCounts.containsKey(str)) {
                diskDumpInfo.typeCounts.put(str, 0);
            }
            Map<String, Integer> map = diskDumpInfo.typeCounts;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            diskDumpInfo.entries.add(dumpCacheEntry);
        }
        return diskDumpInfo;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public BinaryResource getResource(String str, Object obj) {
        File contentFileFor = getContentFileFor(str);
        if (!contentFileFor.exists()) {
            return null;
        }
        contentFileFor.setLastModified(this.mClock.now());
        return FileBinaryResource.createOrNull(contentFileFor);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public String getStorageName() {
        String absolutePath = this.mRootDirectory.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public DiskStorage.Inserter insert(String str, Object obj) throws IOException {
        FileInfo fileInfo = new FileInfo(".tmp", str);
        File subdirectory = getSubdirectory(fileInfo.resourceId);
        if (!subdirectory.exists()) {
            mkdirs(subdirectory, "insert");
        }
        try {
            return new InserterImpl(str, fileInfo.createTempFile(subdirectory));
        } catch (IOException e) {
            this.mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, TAG, "insert", e);
            throw e;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public void purgeUnexpectedResources() {
        FileTree.walkFileTree(this.mRootDirectory, new PurgingVisitor());
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public long remove(DiskStorage.Entry entry) {
        return doRemove(((EntryImpl) entry).getResource().getFile());
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean touch(String str, Object obj) {
        return query(str, true);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public List<DiskStorage.Entry> getEntries() throws IOException {
        EntriesCollector entriesCollector = new EntriesCollector();
        FileTree.walkFileTree(this.mVersionDirectory, entriesCollector);
        return entriesCollector.getEntries();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public long remove(String str) {
        return doRemove(getContentFileFor(str));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean isExternal() {
        return this.mIsExternal;
    }
}
