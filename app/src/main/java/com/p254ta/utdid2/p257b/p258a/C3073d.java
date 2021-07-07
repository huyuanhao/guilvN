package com.p254ta.utdid2.p257b.p258a;

import com.p118pd.sdk.C5982OoooOoO;
import com.p254ta.utdid2.p257b.p258a.AbstractC3069b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.ta.utdid2.b.a.d */
public class C3073d {

    /* renamed from: b */
    public static final Object f6785b = new Object();

    /* renamed from: a */
    public File f6786a;

    /* renamed from: a */
    public final Object f6787a = new Object();

    /* renamed from: a */
    public HashMap<File, C3074a> f6788a = new HashMap<>();

    public C3073d(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.f6786a = new File(str);
    }

    /* renamed from: a */
    private File m7157a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* renamed from: b */
    private File m7160b(String str) {
        File a = m7155a();
        return m7157a(a, str + C5982OoooOoO.OooO);
    }

    /* renamed from: com.ta.utdid2.b.a.d$a */
    public static final class C3074a implements AbstractC3069b {

        /* renamed from: c */
        public static final Object f6789c = new Object();

        /* renamed from: a */
        public Map f6790a;

        /* renamed from: a */
        public WeakHashMap<AbstractC3069b.AbstractC3071b, Object> f6791a;

        /* renamed from: b */
        public final File f6792b;

        /* renamed from: c */
        public final int f6793c;

        /* renamed from: c */
        public final File f6794c;

        /* renamed from: j */
        public boolean f6795j = false;

        public C3074a(File file, int i, Map map) {
            this.f6792b = file;
            this.f6794c = C3073d.m7156a(file);
            this.f6793c = i;
            this.f6790a = map == null ? new HashMap() : map;
            this.f6791a = new WeakHashMap<>();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: e */
        private boolean m7166e() {
            if (this.f6792b.exists()) {
                if (this.f6794c.exists()) {
                    this.f6792b.delete();
                } else if (!this.f6792b.renameTo(this.f6794c)) {
                    return false;
                }
            }
            try {
                FileOutputStream a = m7162a(this.f6792b);
                if (a == null) {
                    return false;
                }
                C3076e.m7185a(this.f6790a, a);
                a.close();
                this.f6794c.delete();
                return true;
            } catch (Exception unused) {
                if (this.f6792b.exists()) {
                    this.f6792b.delete();
                }
                return false;
            }
        }

        @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b
        /* renamed from: b */
        public boolean mo37277b() {
            return this.f6792b != null && new File(this.f6792b.getAbsolutePath()).exists();
        }

        /* renamed from: d */
        public boolean mo37297d() {
            boolean z;
            synchronized (this) {
                z = this.f6795j;
            }
            return z;
        }

        @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b
        public Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.f6790a);
            }
            return hashMap;
        }

        @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b
        public long getLong(String str, long j) {
            synchronized (this) {
                Long l = (Long) this.f6790a.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b
        public String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.f6790a.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        /* renamed from: com.ta.utdid2.b.a.d$a$a */
        public final class C3075a implements AbstractC3069b.AbstractC3070a {

            /* renamed from: b */
            public final Map<String, Object> f6797b = new HashMap();

            /* renamed from: k */
            public boolean f6798k = false;

            public C3075a() {
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37285a(String str, String str2) {
                synchronized (this) {
                    this.f6797b.put(str, str2);
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: b */
            public AbstractC3069b.AbstractC3070a mo37287b() {
                synchronized (this) {
                    this.f6798k = true;
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            public boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<AbstractC3069b.AbstractC3071b> hashSet;
                boolean e;
                synchronized (C3073d.f6785b) {
                    z = C3074a.this.f6791a.size() > 0;
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet(C3074a.this.f6791a.keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.f6798k) {
                            C3074a.this.f6790a.clear();
                            this.f6798k = false;
                        }
                        for (Map.Entry<String, Object> entry : this.f6797b.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this) {
                                C3074a.this.f6790a.remove(key);
                            } else {
                                C3074a.this.f6790a.put(key, value);
                            }
                            if (z) {
                                arrayList.add(key);
                            }
                        }
                        this.f6797b.clear();
                    }
                    e = C3074a.this.m7166e();
                    if (e) {
                        C3074a.this.mo37296a(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (AbstractC3069b.AbstractC3071b bVar : hashSet) {
                            if (bVar != null) {
                                bVar.mo37289a(C3074a.this, str);
                            }
                        }
                    }
                }
                return e;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37283a(String str, int i) {
                synchronized (this) {
                    this.f6797b.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37284a(String str, long j) {
                synchronized (this) {
                    this.f6797b.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37282a(String str, float f) {
                synchronized (this) {
                    this.f6797b.put(str, Float.valueOf(f));
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37286a(String str, boolean z) {
                synchronized (this) {
                    this.f6797b.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b.AbstractC3070a
            /* renamed from: a */
            public AbstractC3069b.AbstractC3070a mo37281a(String str) {
                synchronized (this) {
                    this.f6797b.put(str, this);
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo37296a(boolean z) {
            synchronized (this) {
                this.f6795j = z;
            }
        }

        /* renamed from: a */
        public void mo37295a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f6790a = map;
                }
            }
        }

        @Override // com.p254ta.utdid2.p257b.p258a.AbstractC3069b
        /* renamed from: a */
        public AbstractC3069b.AbstractC3070a mo37276a() {
            return new C3075a();
        }

        /* renamed from: a */
        private FileOutputStream m7162a(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
            return fileOutputStream;
        }
    }

    /* renamed from: a */
    private File m7155a() {
        File file;
        synchronized (this.f6787a) {
            file = this.f6786a;
        }
        return file;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|(2:52|53)|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = m7156a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0.exists() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r6.delete();
        r0.renameTo(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r6.exists() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r6.canRead() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = new java.io.FileInputStream(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2 = com.p254ta.utdid2.p257b.p258a.C3076e.m7181a(r0);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        if (r2 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3 = new java.io.FileInputStream(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.read(new byte[r3.available()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0074, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0076, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0077, code lost:
        if (r2 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007d, code lost:
        if (r2 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0082, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0084, code lost:
        if (r2 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0089, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x008a, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x008c, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0092, code lost:
        monitor-enter(com.p254ta.utdid2.p257b.p258a.C3073d.f6785b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0093, code lost:
        if (r1 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r1.mo37295a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0099, code lost:
        r1 = r5.f6788a.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00a2, code lost:
        if (r1 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00a4, code lost:
        r1 = new com.p254ta.utdid2.p257b.p258a.C3073d.C3074a(r6, r7, r2);
        r5.f6788a.put(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00af, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057 A[SYNTHETIC, Splitter:B:33:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0079 A[SYNTHETIC, Splitter:B:52:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0086 A[SYNTHETIC, Splitter:B:63:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p254ta.utdid2.p257b.p258a.AbstractC3069b mo37294a(java.lang.String r6, int r7) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p254ta.utdid2.p257b.p258a.C3073d.mo37294a(java.lang.String, int):com.ta.utdid2.b.a.b");
    }

    /* renamed from: a */
    public static File m7156a(File file) {
        return new File(file.getPath() + ".bak");
    }
}
