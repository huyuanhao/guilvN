package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import androidx.multidex.MultiDexExtractor;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: com.pd.sdk.o00oooOo  reason: case insensitive filesystem */
public final class C7244o00oooOo {
    public static final int OooO00o = 20;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19779OooO00o = "MultiDex";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<File> f19780OooO00o = new HashSet();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19781OooO00o = OooO00o(System.getProperty("java.vm.version"));
    public static final int OooO0O0 = 4;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19782OooO0O0 = "secondary-dexes";
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19783OooO0OO = "code_cache";
    public static final int OooO0Oo = 1;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f19784OooO0Oo = "secondary-dexes";
    public static final String OooO0o0 = "";

    /* renamed from: com.pd.sdk.o00oooOo$OooO0OO */
    public static final class OooO0OO {
        public static void OooO00o(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field OooO0O0 = C7244o00oooOo.OooO0O0(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) OooO0O0.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + MultiDexExtractor.o0OOO0o, 0);
            }
            OooO0O0.set(classLoader, sb.toString());
            C7244o00oooOo.OooO0O0(classLoader, "mPaths", strArr);
            C7244o00oooOo.OooO0O0(classLoader, "mFiles", fileArr);
            C7244o00oooOo.OooO0O0(classLoader, "mZips", zipFileArr);
            C7244o00oooOo.OooO0O0(classLoader, "mDexs", dexFileArr);
        }
    }

    public static void OooO0O0(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f19781OooO00o) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo OooO00o2 = OooO00o(context);
                if (OooO00o2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                OooO00o(context, new File(OooO00o2.sourceDir), new File(OooO00o2.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + C9058ooOoOoOO.OooOO0);
        }
    }

    public static void OooO00o(Context context, Context context2) {
        Log.i("MultiDex", "Installing instrumentation");
        if (f19781OooO00o) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo OooO00o2 = OooO00o(context);
                if (OooO00o2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                ApplicationInfo OooO00o3 = OooO00o(context2);
                if (OooO00o3 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                String str = context.getPackageName() + C9058ooOoOoOO.OooOO0;
                File file = new File(OooO00o3.dataDir);
                OooO00o(context2, new File(OooO00o2.sourceDir), file, str + "secondary-dexes", str, false);
                OooO00o(context2, new File(OooO00o3.sourceDir), file, "secondary-dexes", "", false);
                Log.i("MultiDex", "Installation done");
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + C9058ooOoOoOO.OooOO0);
        }
    }

    /* renamed from: com.pd.sdk.o00oooOo$OooO00o */
    public static final class OooO00o {
        public static final int OooO00o = 4;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC4955OooO00o f19785OooO00o;

        /* renamed from: com.pd.sdk.o00oooOo$OooO00o$OooO00o  reason: collision with other inner class name */
        public interface AbstractC4955OooO00o {
            Object OooO00o(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: com.pd.sdk.o00oooOo$OooO00o$OooO0O0 */
        public static class OooO0O0 implements AbstractC4955OooO00o {
            public final Constructor<?> OooO00o;

            public OooO0O0(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.OooO00o = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p118pd.sdk.C7244o00oooOo.OooO00o.AbstractC4955OooO00o
            public Object OooO00o(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.OooO00o.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* renamed from: com.pd.sdk.o00oooOo$OooO00o$OooO0OO */
        public static class OooO0OO implements AbstractC4955OooO00o {
            public final Constructor<?> OooO00o;

            public OooO0OO(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.OooO00o = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p118pd.sdk.C7244o00oooOo.OooO00o.AbstractC4955OooO00o
            public Object OooO00o(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.OooO00o.newInstance(file, file, dexFile);
            }
        }

        /* renamed from: com.pd.sdk.o00oooOo$OooO00o$OooO0Oo  reason: case insensitive filesystem */
        public static class C7245OooO0Oo implements AbstractC4955OooO00o {
            public final Constructor<?> OooO00o;

            public C7245OooO0Oo(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.OooO00o = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p118pd.sdk.C7244o00oooOo.OooO00o.AbstractC4955OooO00o
            public Object OooO00o(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.OooO00o.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OooO00o() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                com.pd.sdk.o00oooOo$OooO00o$OooO0O0 r1 = new com.pd.sdk.o00oooOo$OooO00o$OooO0O0     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                com.pd.sdk.o00oooOo$OooO00o$OooO0OO r1 = new com.pd.sdk.o00oooOo$OooO00o$OooO0OO     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                com.pd.sdk.o00oooOo$OooO00o$OooO0Oo r1 = new com.pd.sdk.o00oooOo$OooO00o$OooO0Oo
                r1.<init>(r0)
            L_0x001a:
                r2.f19785OooO00o = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7244o00oooOo.OooO00o.<init>():void");
        }

        public static void OooO00o(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C7244o00oooOo.OooO0O0(classLoader, "pathList").get(classLoader);
            Object[] OooO00o2 = new OooO00o().OooO00o(list);
            try {
                C7244o00oooOo.OooO0O0(obj, "dexElements", OooO00o2);
            } catch (NoSuchFieldException unused) {
                C7244o00oooOo.OooO0O0(obj, "pathElements", OooO00o2);
            }
        }

        private Object[] OooO00o(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f19785OooO00o.OooO00o(file, DexFile.loadDex(file.getPath(), OooO00o(file), 0));
            }
            return objArr;
        }

        public static String OooO00o(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - OooO00o) + MultiDexExtractor.o0OOO0o).getPath();
        }
    }

    public static Field OooO0O0(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method OooO0O0(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: com.pd.sdk.o00oooOo$OooO0O0 */
    public static final class OooO0O0 {
        public static void OooO00o(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C7244o00oooOo.OooO0O0(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C7244o00oooOo.OooO0O0(obj, "dexElements", OooO00o(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field OooO0O0 = C7244o00oooOo.OooO0O0(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) OooO0O0.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                OooO0O0.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        public static Object[] OooO00o(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C7244o00oooOo.OooO0O0(obj, "makeDexElements", new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static void OooO00o(Context context, File file, File file2, String str, String str2, boolean z) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        synchronized (f19780OooO00o) {
            if (!f19780OooO00o.contains(file)) {
                f19780OooO00o.add(file);
                if (Build.VERSION.SDK_INT > 20) {
                    String str3 = "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than " + 20 + " should be backed by " + "runtime with built-in multidex capabilty but it's not the " + "case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"";
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader != null) {
                        try {
                            m18725OooO00o(context);
                        } catch (Throwable unused) {
                        }
                        File OooO00o2 = OooO00o(context, file2, str);
                        MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, OooO00o2);
                        IOException e = null;
                        try {
                            try {
                                OooO00o(classLoader, OooO00o2, multiDexExtractor.OooO00o(context, str2, false));
                            } catch (IOException e2) {
                                if (z) {
                                    OooO00o(classLoader, OooO00o2, multiDexExtractor.OooO00o(context, str2, true));
                                } else {
                                    throw e2;
                                }
                            }
                            try {
                            } catch (IOException e3) {
                                e = e3;
                            }
                            if (e != null) {
                                throw e;
                            }
                        } finally {
                            try {
                                multiDexExtractor.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            }
        }
    }

    public static void OooO0O0(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field OooO0O02 = OooO0O0(obj, str);
        Object[] objArr2 = (Object[]) OooO0O02.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        OooO0O02.set(obj, objArr3);
    }

    public static ApplicationInfo OooO00o(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static boolean OooO00o(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    public static void OooO00o(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                OooO0O0.OooO00o(classLoader, list, file);
            } else if (i >= 14) {
                OooO00o.OooO00o(classLoader, list);
            } else {
                OooO0OO.OooO00o(classLoader, list);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18725OooO00o(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                String str = "Failed to list secondary dex dir content (" + file.getPath() + ").";
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    String str2 = "Failed to delete old file " + file2.getPath();
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                String str3 = "Failed to delete secondary dex dir " + file.getPath();
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    public static File OooO00o(Context context, File file, String str) throws IOException {
        File file2 = new File(file, f19783OooO0OO);
        try {
            OooO00o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), f19783OooO0OO);
            OooO00o(file2);
        }
        File file3 = new File(file2, str);
        OooO00o(file3);
        return file3;
    }

    public static void OooO00o(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                String str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                String str2 = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
