package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class SoLoader {
    public static final boolean DEBUG = false;
    public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
    public static final int SOLOADER_DISABLE_BACKUP_SOSOURCE = 8;
    public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
    public static final int SOLOADER_LOOK_IN_ZIP = 4;
    public static final String SO_STORE_NAME_MAIN = "lib-main";
    public static final String SO_STORE_NAME_SPLIT = "lib-";
    public static final boolean SYSTRACE_LIBRARY_LOADING;
    public static final String TAG = "SoLoader";
    @GuardedBy("sSoSourcesLock")
    @Nullable
    public static ApplicationSoSource sApplicationSoSource;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    public static UnpackingSoSource[] sBackupSoSources;
    @GuardedBy("sSoSourcesLock")
    public static int sFlags;
    public static final Set<String> sLoadedAndMergedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    @GuardedBy("SoLoader.class")
    public static final HashSet<String> sLoadedLibraries = new HashSet<>();
    @GuardedBy("SoLoader.class")
    public static final Map<String, Object> sLoadingLibraries = new HashMap();
    @Nullable
    public static SoFileLoader sSoFileLoader;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    public static SoSource[] sSoSources = null;
    public static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    public static int sSoSourcesVersion = 0;
    @Nullable
    public static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;

    @DoNotOptimize
    @TargetApi(14)
    public static class Api14Utils {
        public static String getClassLoaderLdLoadLibrary() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        public WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        SYSTRACE_LIBRARY_LOADING = z;
    }

    public static boolean areSoSourcesAbisSupported() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                for (int i = 0; i < sSoSources.length; i++) {
                    String[] soSourceAbis = sSoSources[i].getSoSourceAbis();
                    for (int i2 = 0; i2 < soSourceAbis.length; i2++) {
                        boolean z = false;
                        for (int i3 = 0; i3 < supportedAbis.length && !z; i3++) {
                            z = soSourceAbis[i2].equals(supportedAbis[i3]);
                        }
                        if (!z) {
                            String str = "abi not supported: " + soSourceAbis[i2];
                        }
                    }
                }
                sSoSourcesLock.readLock().unlock();
                return true;
            }
            return false;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static void assertInitialized() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static void deinitForTest() {
        setSoSources(null);
    }

    /* JADX INFO: finally extract failed */
    public static void doLoadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                sSoSourcesLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[" + str + "]");
                }
                int i2 = 0;
                do {
                    try {
                        sSoSourcesLock.readLock().lock();
                        int i3 = sSoSourcesVersion;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                if (i4 < sSoSources.length) {
                                    i2 = sSoSources[i4].loadLibrary(str, i, threadPolicy);
                                    if (i2 == 3 && sBackupSoSources != null) {
                                        String str2 = "Trying backup SoSource for " + str;
                                        UnpackingSoSource[] unpackingSoSourceArr = sBackupSoSources;
                                        int length = unpackingSoSourceArr.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length) {
                                                break;
                                            }
                                            UnpackingSoSource unpackingSoSource = unpackingSoSourceArr[i5];
                                            unpackingSoSource.prepare(str);
                                            int loadLibrary = unpackingSoSource.loadLibrary(str, i, threadPolicy);
                                            if (loadLibrary == 1) {
                                                i2 = loadLibrary;
                                                break;
                                            }
                                            i5++;
                                        }
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    break;
                                }
                            } catch (Throwable th) {
                                sSoSourcesLock.readLock().unlock();
                                throw th;
                            }
                        }
                        sSoSourcesLock.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            sSoSourcesLock.writeLock().lock();
                            try {
                                if (sApplicationSoSource != null && sApplicationSoSource.checkAndMaybeUpdate()) {
                                    sSoSourcesVersion++;
                                }
                                z2 = sSoSourcesVersion != i3;
                                continue;
                            } finally {
                                sSoSourcesLock.writeLock().unlock();
                            }
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th2) {
                        if (SYSTRACE_LIBRARY_LOADING) {
                            Api18TraceUtils.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            String str3 = "couldn't find DSO to load: " + str;
                            String message = th2.getMessage();
                            if (message == null) {
                                message = th2.toString();
                            }
                            throw new UnsatisfiedLinkError(str3 + " caused by: " + message);
                        }
                        return;
                    }
                } while (z2);
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
                }
                return;
            }
            String str4 = "Could not load: " + str + " because no SO source exists";
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } catch (Throwable th3) {
            sSoSourcesLock.readLock().unlock();
            throw th3;
        }
    }

    @Nullable
    public static Method getNativeLoadRuntimeMethod() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException unused) {
            }
        }
        return null;
    }

    public static void init(Context context, int i) throws IOException {
        init(context, i, null);
    }

    public static synchronized void initSoLoader(@Nullable SoFileLoader soFileLoader) {
        synchronized (SoLoader.class) {
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method nativeLoadRuntimeMethod = getNativeLoadRuntimeMethod();
            final boolean z = nativeLoadRuntimeMethod != null;
            final String classLoaderLdLoadLibrary = z ? Api14Utils.getClassLoaderLdLoadLibrary() : null;
            final String makeNonZipPath = makeNonZipPath(classLoaderLdLoadLibrary);
            sSoFileLoader = new SoFileLoader() {
                /* class com.facebook.soloader.SoLoader.C09011 */

                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                    r1.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
                    r7.addSuppressed(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
                    throw r0;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private java.lang.String getLibHash(java.lang.String r7) {
                    /*
                        r6 = this;
                        java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.lang.String r7 = "MD5"
                        java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0 = 4096(0x1000, float:5.74E-42)
                        byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
                    L_0x0014:
                        int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                        r3 = 0
                        if (r2 <= 0) goto L_0x001f
                        r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                        goto L_0x0014
                    L_0x001f:
                        java.lang.String r0 = "%32x"
                        r2 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                        java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                        byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                        r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                        r4[r3] = r5     // Catch:{ all -> 0x0037 }
                        java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                        r1.close()
                        goto L_0x0054
                    L_0x0037:
                        r7 = move-exception
                        throw r7     // Catch:{ all -> 0x0039 }
                    L_0x0039:
                        r0 = move-exception
                        r1.close()     // Catch:{ all -> 0x003e }
                        goto L_0x0042
                    L_0x003e:
                        r1 = move-exception
                        r7.addSuppressed(r1)
                    L_0x0042:
                        throw r0
                    L_0x0043:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                        goto L_0x0054
                    L_0x0049:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                        goto L_0x0054
                    L_0x004f:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                    L_0x0054:
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C09011.getLibHash(java.lang.String):java.lang.String");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
                    if (r1 == null) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
                    r0 = "Error when loading lib: " + r1 + " lib hash: " + getLibHash(r9) + " search path is " + r10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x0098  */
                @Override // com.facebook.soloader.SoFileLoader
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void load(java.lang.String r9, int r10) {
                    /*
                    // Method dump skipped, instructions count: 193
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C09011.load(java.lang.String, int):void");
                }
            };
        }
    }

    public static void initSoSources(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        int i2;
        sSoSourcesLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                sFlags = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(Constants.COLON_SEPARATOR);
                for (int i3 = 0; i3 < split.length; i3++) {
                    String str2 = "adding system library source: " + split[i3];
                    arrayList.add(new DirectorySoSource(new File(split[i3]), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        sBackupSoSources = null;
                        arrayList.add(0, new ExoSoSource(context, SO_STORE_NAME_MAIN));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            sApplicationSoSource = new ApplicationSoSource(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            String str3 = "adding application source: " + sApplicationSoSource.toString();
                            arrayList.add(0, sApplicationSoSource);
                            i2 = 1;
                        }
                        if ((sFlags & 8) != 0) {
                            sBackupSoSources = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            ApkSoSource apkSoSource = new ApkSoSource(context, file, SO_STORE_NAME_MAIN, i2);
                            arrayList2.add(apkSoSource);
                            String str4 = "adding backup source from : " + apkSoSource.toString();
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    File file2 = new File(strArr[i4]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(SO_STORE_NAME_SPLIT);
                                    sb.append(i5);
                                    ApkSoSource apkSoSource2 = new ApkSoSource(context, file2, sb.toString(), i2);
                                    String str5 = "adding backup source: " + apkSoSource2.toString();
                                    arrayList2.add(apkSoSource2);
                                    i4++;
                                    i5++;
                                }
                            }
                            sBackupSoSources = (UnpackingSoSource[]) arrayList2.toArray(new UnpackingSoSource[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int makePrepareFlags = makePrepareFlags();
                int length2 = soSourceArr.length;
                while (true) {
                    int i6 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    String str6 = "Preparing SO source: " + soSourceArr[i6];
                    soSourceArr[i6].prepare(makePrepareFlags);
                    length2 = i6;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion++;
                String str7 = "init finish: " + sSoSources.length + " SO sources prepared";
            }
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    public static void loadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        loadLibraryBySoName(str, null, null, i, threadPolicy);
    }

    public static String makeLdLibraryPath() {
        SoSource[] soSourceArr;
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            for (SoSource soSource : sSoSources) {
                soSource.addToLdLibraryPath(arrayList);
            }
            String join = TextUtils.join(Constants.COLON_SEPARATOR, arrayList);
            String str = "makeLdLibraryPath final path: " + join;
            return join;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @Nullable
    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(Constants.COLON_SEPARATOR);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(Constants.COLON_SEPARATOR, arrayList);
    }

    public static int makePrepareFlags() {
        sSoSourcesLock.writeLock().lock();
        try {
            return (sFlags & 2) != 0 ? 1 : 0;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        sSoSourcesLock.writeLock().lock();
        try {
            String str = "Prepending to SO sources: " + soSource;
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[(sSoSources.length + 1)];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
            String str2 = "Prepended to SO sources: " + soSource;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void resetStatus() {
        synchronized (SoLoader.class) {
            sLoadedLibraries.clear();
            sLoadingLibraries.clear();
            sSoFileLoader = null;
        }
        setSoSources(null);
    }

    public static void setInTestMode() {
        setSoSources(new SoSource[]{new NoopSoSource()});
    }

    public static void setSoFileLoader(SoFileLoader soFileLoader) {
        sSoFileLoader = soFileLoader;
    }

    public static void setSoSources(SoSource[] soSourceArr) {
        sSoSourcesLock.writeLock().lock();
        try {
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        for (int i = 0; i < sSoSources.length; i++) {
            try {
                File unpackLibrary = sSoSources[i].unpackLibrary(str);
                if (unpackLibrary != null) {
                    return unpackLibrary;
                }
            } finally {
                sSoSourcesLock.readLock().unlock();
            }
        }
        sSoSourcesLock.readLock().unlock();
        throw new FileNotFoundException(str);
    }

    public static void init(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            initSoLoader(soFileLoader);
            initSoSources(context, i, soFileLoader);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean loadLibrary(String str, int i) throws UnsatisfiedLinkError {
        boolean z;
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    assertInitialized();
                } else {
                    synchronized (SoLoader.class) {
                        z = !sLoadedLibraries.contains(str);
                        if (z) {
                            if (sSystemLoadLibraryWrapper != null) {
                                sSystemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    sSoSourcesLock.readLock().unlock();
                    return z;
                }
            }
            sSoSourcesLock.readLock().unlock();
            String mapLibName = MergedSoMapping.mapLibName(str);
            return loadLibraryBySoName(System.mapLibraryName(mapLibName != null ? mapLibName : str), str, mapLibName, i | 2, null);
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (com.facebook.soloader.SoLoader.sLoadedLibraries.contains(r7) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r9 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = "About to load: " + r7;
        doLoadLibraryBySoName(r7, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = "Loaded: " + r7;
        com.facebook.soloader.SoLoader.sLoadedLibraries.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        r8 = r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        if (r8 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0096, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        throw new java.lang.RuntimeException(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a4, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ac, code lost:
        if (com.facebook.soloader.SoLoader.sLoadedAndMergedLibraries.contains(r8) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ae, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00af, code lost:
        if (r9 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b1, code lost:
        if (r2 != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b5, code lost:
        if (com.facebook.soloader.SoLoader.SYSTRACE_LIBRARY_LOADING == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b7, code lost:
        com.facebook.soloader.Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[" + r8 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r0 = "About to merge: " + r8 + " / " + r7;
        com.facebook.soloader.MergedSoMapping.invokeJniOnload(r8);
        com.facebook.soloader.SoLoader.sLoadedAndMergedLibraries.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f8, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fb, code lost:
        if (com.facebook.soloader.SoLoader.SYSTRACE_LIBRARY_LOADING != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fd, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0100, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0101, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0104, code lost:
        return !r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean loadLibraryBySoName(java.lang.String r7, @javax.annotation.Nullable java.lang.String r8, @javax.annotation.Nullable java.lang.String r9, int r10, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r11) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.loadLibraryBySoName(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    public static void init(Context context, boolean z) {
        try {
            init(context, z ? 1 : 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
