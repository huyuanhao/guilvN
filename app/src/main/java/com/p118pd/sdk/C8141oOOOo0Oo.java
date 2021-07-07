package com.p118pd.sdk;

import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.oOOOo0Oo  reason: case insensitive filesystem */
public class C8141oOOOo0Oo {

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO00o */
    public static class OooO00o extends OooO0OO {
        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str, @NotNull PrintStream printStream) {
            super.OooO00o(file, oo0o0oo0, str, printStream);
            for (AbstractC7922oO0o0O0O oo0o0o0o : oo0o0oo0.m19661OooO00o()) {
                oo0o0o0o.m19643OooO00o();
                for (C7928oO0o0Oo oo0o0oo : oo0o0o0o.m19645OooO00o()) {
                    oo0o0oo.OooO0OO();
                    oo0o0oo.m19666OooO00o();
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(@NotNull File file);

        void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str, @NotNull PrintStream printStream);

        void OooO00o(@NotNull File file, @NotNull PrintStream printStream, @NotNull String str);

        void OooO00o(@NotNull File file, @NotNull Throwable th, @NotNull PrintStream printStream);

        void OooO00o(@NotNull PrintStream printStream);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m19796OooO00o(@NotNull File file);
    }

    public static void OooO00o(String[] strArr) throws IOException, JpegProcessingException {
        ArrayList<String> arrayList = new ArrayList();
        PrintStream printStream = System.out;
        OooO0O0 oooO0O0 = null;
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str.equalsIgnoreCase("--text")) {
                oooO0O0 = new C8143OooO0o0();
            } else if (str.equalsIgnoreCase("--markdown")) {
                oooO0O0 = new C8142OooO0Oo();
            } else if (str.equalsIgnoreCase("--unknown")) {
                oooO0O0 = new OooO0o();
            } else if (str.equalsIgnoreCase("--log-file")) {
                if (i == strArr.length - 1) {
                    OooO00o();
                    System.exit(1);
                }
                i++;
                printStream = new PrintStream((OutputStream) new FileOutputStream(strArr[i], false), true);
            } else {
                arrayList.add(str);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            System.err.println("Expects one or more directories as arguments.");
            OooO00o();
            System.exit(1);
        }
        if (oooO0O0 == null) {
            oooO0O0 = new OooO00o();
        }
        long nanoTime = System.nanoTime();
        for (String str2 : arrayList) {
            OooO00o(new File(str2), oooO0O0, "", printStream);
        }
        oooO0O0.OooO00o(printStream);
        System.out.println(String.format("Completed in %d ms", Long.valueOf((System.nanoTime() - nanoTime) / 1000000)));
        if (printStream != System.out) {
            printStream.close();
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0OO */
    public static abstract class OooO0OO implements OooO0O0 {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f21153OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Set<String> f21154OooO00o = new HashSet(Arrays.asList(BitmapUtils.IMAGE_KEY_SUFFIX, "jpeg", "png", "gif", "bmp", "ico", "webp", "pcx", "ai", "eps", "nef", "crw", "cr2", "orf", "arw", "raf", "srw", "x3f", "rw2", "rwl", "tif", "tiff", "psd", "dng", "3g2", "3gp", "m4v", "mov", "mp4", "pbm", "pnm", "pgm"));
        public int OooO0O0 = 0;
        public int OooO0OO = 0;

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19797OooO00o(@NotNull File file) {
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m19798OooO00o(@NotNull File file) {
            String OooO00o2 = OooO00o(file);
            return OooO00o2 != null && this.f21154OooO00o.contains(OooO00o2.toLowerCase());
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull PrintStream printStream, @NotNull String str) {
            this.OooO00o++;
            this.f21153OooO00o += file.length();
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull Throwable th, @NotNull PrintStream printStream) {
            this.OooO0O0++;
            printStream.printf("\t[%s] %s\n", th.getClass().getName(), th.getMessage());
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str, @NotNull PrintStream printStream) {
            if (oo0o0oo0.m19663OooO00o()) {
                printStream.print(file);
                printStream.print('\n');
                for (AbstractC7922oO0o0O0O oo0o0o0o : oo0o0oo0.m19661OooO00o()) {
                    if (oo0o0o0o.m19649OooO00o()) {
                        Iterator<String> it = oo0o0o0o.m19640OooO00o().iterator();
                        while (it.hasNext()) {
                            printStream.printf("\t[%s] %s\n", oo0o0o0o.m19643OooO00o(), it.next());
                            this.OooO0OO++;
                        }
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull PrintStream printStream) {
            int i = this.OooO00o;
            if (i > 0) {
                printStream.print(String.format("Processed %,d files (%,d bytes) with %,d exceptions and %,d file errors\n", Integer.valueOf(i), Long.valueOf(this.f21153OooO00o), Integer.valueOf(this.OooO0O0), Integer.valueOf(this.OooO0OO)));
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        @Nullable
        public String OooO00o(@NotNull File file) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf == -1 || lastIndexOf == name.length() - 1) {
                return null;
            }
            return name.substring(lastIndexOf + 1);
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0o0  reason: case insensitive filesystem */
    public static class C8143OooO0o0 extends OooO0OO {
        public static final String OooO00o = "\n";

        public static void OooO0O0(@NotNull File file) {
            String[] list;
            if (file.isDirectory()) {
                if (file.exists() && (list = file.list()) != null) {
                    for (String str : list) {
                        File file2 = new File(str);
                        if (file2.isDirectory()) {
                            OooO0O0(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
                file.delete();
                return;
            }
            throw new IllegalArgumentException("Must be a directory.");
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19799OooO00o(@NotNull File file) {
            super.m19797OooO00o(file);
            File file2 = new File(file + "/metadata");
            if (file2.exists()) {
                OooO0O0(file2);
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull PrintStream printStream, @NotNull String str) {
            super.OooO00o(file, printStream, str);
            printStream.print(file.getAbsoluteFile());
            printStream.print("\n");
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0136 A[SYNTHETIC] */
        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(@com.drew.lang.annotations.NotNull java.io.File r17, @com.drew.lang.annotations.NotNull com.p118pd.sdk.C7925oO0o0OO0 r18, @com.drew.lang.annotations.NotNull java.lang.String r19, @com.drew.lang.annotations.NotNull java.io.PrintStream r20) {
            /*
            // Method dump skipped, instructions count: 341
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8141oOOOo0Oo.C8143OooO0o0.OooO00o(java.io.File, com.pd.sdk.oO0o0OO0, java.lang.String, java.io.PrintStream):void");
        }

        public static void OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull PrintWriter printWriter, @Nullable AbstractC7922oO0o0O0O oo0o0o0o, int i) {
            for (AbstractC7922oO0o0O0O oo0o0o0o2 : oo0o0oo0.m19661OooO00o()) {
                if (oo0o0o0o == null) {
                    if (oo0o0o0o2.m19634OooO00o() != null) {
                    }
                } else if (!oo0o0o0o.equals(oo0o0o0o2.m19634OooO00o())) {
                }
                for (int i2 = 0; i2 < i * 4; i2++) {
                    printWriter.write(32);
                }
                printWriter.write("- ");
                printWriter.write(oo0o0o0o2.m19643OooO00o());
                printWriter.write("\n");
                OooO00o(oo0o0oo0, printWriter, oo0o0o0o2, i + 1);
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull Throwable th, @NotNull PrintStream printStream) {
            Throwable th2;
            PrintWriter printWriter;
            super.OooO00o(file, th, printStream);
            try {
                printWriter = OooO00o(file);
                try {
                    printWriter.write("EXCEPTION: " + th.getMessage() + "\n");
                    printWriter.write("\n");
                    try {
                        OooO00o(printWriter);
                    } catch (IOException e) {
                        printStream.printf("IO exception writing metadata file: %s%s", e.getMessage(), "\n");
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    OooO00o(printWriter);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                printWriter = null;
                OooO00o(printWriter);
                throw th2;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0092  */
        @com.drew.lang.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.io.PrintWriter OooO00o(@com.drew.lang.annotations.NotNull java.io.File r7) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8141oOOOo0Oo.C8143OooO0o0.OooO00o(java.io.File):java.io.PrintWriter");
        }

        public static void OooO00o(@Nullable Writer writer) throws IOException {
            if (writer != null) {
                writer.write("Generated using metadata-extractor\n");
                writer.write("https://drewnoakes.com/code/exif/\n");
                writer.flush();
                writer.close();
            }
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0Oo  reason: case insensitive filesystem */
    public static class C8142OooO0Oo extends OooO0OO {
        public final Map<String, String> OooO00o = new HashMap();
        public final Map<String, List<OooO0O0>> OooO0O0 = new HashMap();

        /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0Oo$OooO00o */
        public class OooO00o implements Comparator<OooO0O0> {
            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public int compare(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
                int OooO00o2 = C7921oO0o0O00.OooO00o(oooO0O0.OooO0O0, oooO0O02.OooO0O0);
                return OooO00o2 != 0 ? OooO00o2 : C7921oO0o0O00.OooO00o(oooO0O0.OooO0OO, oooO0O02.OooO0OO);
            }
        }

        /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0Oo$OooO0O0 */
        public static class OooO0O0 {
            public final C7925oO0o0OO0 OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final File f21155OooO00o;
            @NotNull

            /* renamed from: OooO00o  reason: collision with other field name */
            public final String f21156OooO00o;
            @Nullable
            public String OooO0O0;
            @Nullable
            public String OooO0OO;
            @Nullable
            public String OooO0Oo;
            @Nullable
            public String OooO0o;
            @Nullable
            public String OooO0o0;

            public OooO0O0(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str) {
                boolean z;
                this.f21155OooO00o = file;
                this.OooO00o = oo0o0oo0;
                this.f21156OooO00o = str;
                C8287oOo00O0O ooo00o0o = (C8287oOo00O0O) oo0o0oo0.OooO00o(C8287oOo00O0O.class);
                C8294oOo00OoO ooo00ooo = (C8294oOo00OoO) oo0o0oo0.OooO00o(C8294oOo00OoO.class);
                C7949oO0oO0Oo oo0oo0oo = (C7949oO0oO0Oo) oo0o0oo0.OooO00o(C7949oO0oO0Oo.class);
                if (ooo00o0o != null) {
                    this.OooO0O0 = ooo00o0o.m19644OooO00o(271);
                    this.OooO0OO = ooo00o0o.m19644OooO00o(272);
                }
                if (ooo00ooo != null) {
                    this.OooO0Oo = ooo00ooo.m19644OooO00o(36864);
                    z = ooo00ooo.m19650OooO00o(oO0oO000.o0000OoO);
                } else {
                    z = false;
                }
                if (oo0oo0oo != null) {
                    Integer OooO00o2 = oo0oo0oo.m19639OooO00o(256);
                    Integer OooO00o3 = oo0oo0oo.m19639OooO00o(257);
                    this.OooO0o0 = (OooO00o2 == null || OooO00o3 == null) ? "Yes" : String.format("Yes (%s x %s)", OooO00o2, OooO00o3);
                }
                Iterator<AbstractC7922oO0o0O0O> it = oo0o0oo0.m19661OooO00o().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC7922oO0o0O0O next = it.next();
                    if (next.getClass().getName().contains("Makernote")) {
                        this.OooO0o = next.m19643OooO00o().replace("Makernote", "").trim();
                        break;
                    }
                }
                if (this.OooO0o == null) {
                    this.OooO0o = z ? "(Unknown)" : "N/A";
                }
            }
        }

        public C8142OooO0Oo() {
            this.OooO00o.put("jpeg", BitmapUtils.IMAGE_KEY_SUFFIX);
        }

        private void OooO0O0(@NotNull PrintStream printStream) throws IOException {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(printStream);
            outputStreamWriter.write("# Image Database Summary\n\n");
            for (Map.Entry<String, List<OooO0O0>> entry : this.OooO0O0.entrySet()) {
                outputStreamWriter.write("## " + entry.getKey().toUpperCase() + " Files\n\n");
                outputStreamWriter.write("File|Manufacturer|Model|Dir Count|Exif?|Makernote|Thumbnail|All Data\n");
                outputStreamWriter.write("----|------------|-----|---------|-----|---------|---------|--------\n");
                List<OooO0O0> value = entry.getValue();
                Collections.sort(value, new OooO00o());
                for (OooO0O0 oooO0O0 : value) {
                    Object[] objArr = new Object[11];
                    objArr[0] = oooO0O0.f21155OooO00o.getName();
                    objArr[1] = oooO0O0.f21156OooO00o;
                    objArr[2] = C7921oO0o0O00.OooO00o(oooO0O0.f21155OooO00o.getName());
                    String str = "";
                    objArr[3] = oooO0O0.OooO0O0 == null ? str : oooO0O0.OooO0O0;
                    objArr[4] = oooO0O0.OooO0OO == null ? str : oooO0O0.OooO0OO;
                    objArr[5] = Integer.valueOf(oooO0O0.OooO00o.OooO00o());
                    objArr[6] = oooO0O0.OooO0Oo == null ? str : oooO0O0.OooO0Oo;
                    objArr[7] = oooO0O0.OooO0o == null ? str : oooO0O0.OooO0o;
                    if (oooO0O0.OooO0o0 != null) {
                        str = oooO0O0.OooO0o0;
                    }
                    objArr[8] = str;
                    objArr[9] = oooO0O0.f21156OooO00o;
                    objArr[10] = C7921oO0o0O00.OooO00o(oooO0O0.f21155OooO00o.getName()).toLowerCase();
                    outputStreamWriter.write(String.format("[%s](https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s/%s)|%s|%s|%d|%s|%s|%s|[metadata](https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s/metadata/%s.txt)\n", objArr));
                }
                outputStreamWriter.write(10);
            }
            outputStreamWriter.flush();
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str, @NotNull PrintStream printStream) {
            super.OooO00o(file, oo0o0oo0, str, printStream);
            String OooO00o2 = OooO00o(file);
            if (OooO00o2 != null) {
                String lowerCase = OooO00o2.toLowerCase();
                if (this.OooO00o.containsKey(lowerCase)) {
                    lowerCase = this.OooO00o.get(lowerCase);
                }
                List<OooO0O0> list = this.OooO0O0.get(lowerCase);
                if (list == null) {
                    list = new ArrayList<>();
                    this.OooO0O0.put(lowerCase, list);
                }
                list.add(new OooO0O0(file, oo0o0oo0, str));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x004e A[SYNTHETIC, Splitter:B:31:0x004e] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(@com.drew.lang.annotations.NotNull java.io.PrintStream r5) {
            /*
                r4 = this;
                super.OooO00o(r5)
                r5 = 0
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                java.lang.String r1 = "../wiki/ImageDatabaseSummary.md"
                r2 = 0
                r0.<init>(r1, r2)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{ IOException -> 0x0025, all -> 0x0020 }
                r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0020 }
                r4.OooO0O0(r1)     // Catch:{ IOException -> 0x001e }
                r1.flush()     // Catch:{ IOException -> 0x001e }
                r1.close()
                r0.close()     // Catch:{ IOException -> 0x0041 }
                goto L_0x0045
            L_0x001e:
                r5 = move-exception
                goto L_0x0033
            L_0x0020:
                r1 = move-exception
                r3 = r1
                r1 = r5
                r5 = r3
                goto L_0x0047
            L_0x0025:
                r1 = move-exception
                r3 = r1
                r1 = r5
                r5 = r3
                goto L_0x0033
            L_0x002a:
                r0 = move-exception
                r1 = r5
                r5 = r0
                r0 = r1
                goto L_0x0047
            L_0x002f:
                r0 = move-exception
                r1 = r5
                r5 = r0
                r0 = r1
            L_0x0033:
                r5.printStackTrace()     // Catch:{ all -> 0x0046 }
                if (r1 == 0) goto L_0x003b
                r1.close()
            L_0x003b:
                if (r0 == 0) goto L_0x0045
                r0.close()
                goto L_0x0045
            L_0x0041:
                r5 = move-exception
                r5.printStackTrace()
            L_0x0045:
                return
            L_0x0046:
                r5 = move-exception
            L_0x0047:
                if (r1 == 0) goto L_0x004c
                r1.close()
            L_0x004c:
                if (r0 == 0) goto L_0x0056
                r0.close()     // Catch:{ IOException -> 0x0052 }
                goto L_0x0056
            L_0x0052:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0056:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8141oOOOo0Oo.C8142OooO0Oo.OooO00o(java.io.PrintStream):void");
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0o */
    public static class OooO0o extends OooO0OO {
        public HashMap<String, HashMap<Integer, Integer>> OooO00o = new HashMap<>();

        /* renamed from: com.pd.sdk.oOOOo0Oo$OooO0o$OooO00o */
        public class OooO00o implements Comparator<Map.Entry<Integer, Integer>> {
            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public int compare(Map.Entry<Integer, Integer> entry, Map.Entry<Integer, Integer> entry2) {
                return entry2.getValue().compareTo(entry.getValue());
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull String str, @NotNull PrintStream printStream) {
            super.OooO00o(file, oo0o0oo0, str, printStream);
            for (AbstractC7922oO0o0O0O oo0o0o0o : oo0o0oo0.m19661OooO00o()) {
                for (C7928oO0o0Oo oo0o0oo : oo0o0o0o.m19645OooO00o()) {
                    if (!oo0o0oo.m19667OooO00o()) {
                        HashMap<Integer, Integer> hashMap = this.OooO00o.get(oo0o0o0o.m19643OooO00o());
                        if (hashMap == null) {
                            hashMap = new HashMap<>();
                            this.OooO00o.put(oo0o0o0o.m19643OooO00o(), hashMap);
                        }
                        Integer num = hashMap.get(Integer.valueOf(oo0o0oo.OooO00o()));
                        if (num == null) {
                            hashMap.put(Integer.valueOf(oo0o0oo.OooO00o()), 0);
                            num = 0;
                        }
                        hashMap.put(Integer.valueOf(oo0o0oo.OooO00o()), Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.C8141oOOOo0Oo.OooO0OO, com.p118pd.sdk.C8141oOOOo0Oo.OooO0O0
        public void OooO00o(@NotNull PrintStream printStream) {
            super.OooO00o(printStream);
            for (Map.Entry<String, HashMap<Integer, Integer>> entry : this.OooO00o.entrySet()) {
                String key = entry.getKey();
                ArrayList<Map.Entry> arrayList = new ArrayList(entry.getValue().entrySet());
                Collections.sort(arrayList, new OooO00o());
                for (Map.Entry entry2 : arrayList) {
                    printStream.format("%s, 0x%04X, %d\n", key, (Integer) entry2.getKey(), (Integer) entry2.getValue());
                }
            }
        }
    }

    public static void OooO00o() {
        System.out.println("Usage:");
        System.out.println();
        System.out.println("  java com.drew.tools.ProcessAllImagesInFolderUtility [--text|--markdown|--unknown] [--log-file <file-name>]");
    }

    public static void OooO00o(@NotNull File file, @NotNull OooO0O0 oooO0O0, @NotNull String str, PrintStream printStream) {
        oooO0O0.OooO00o(file);
        String[] list = file.list();
        if (list != null) {
            Arrays.sort(list);
            for (String str2 : list) {
                File file2 = new File(file, str2);
                if (file2.isDirectory()) {
                    if (str.length() != 0) {
                        str2 = str + C8932ooOOO0o.OooO0OO + str2;
                    }
                    OooO00o(file2, oooO0O0, str2, printStream);
                } else if (oooO0O0.m19796OooO00o(file2)) {
                    oooO0O0.OooO00o(file2, printStream, str);
                    try {
                        oooO0O0.OooO00o(file2, oO0O0O.OooO00o(file2), str, printStream);
                    } catch (Throwable th) {
                        oooO0O0.OooO00o(file2, th, printStream);
                    }
                }
            }
        }
    }
}
