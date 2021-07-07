package com.p118pd.sdk;

import com.drew.imaging.FileType;
import com.drew.imaging.ImageProcessingException;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.pd.sdk.oO0O0O */
public class oO0O0O {

    /* renamed from: com.pd.sdk.oO0O0O$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.oO0O0O.OooO00o.<clinit>():void");
        }
    }

    public oO0O0O() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws ImageProcessingException, IOException {
        return OooO00o(inputStream, -1);
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream, long j) throws ImageProcessingException, IOException {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
        FileType OooO00o2 = C7850oO0O0o.OooO00o(bufferedInputStream);
        C7925oO0o0OO0 OooO00o3 = OooO00o(bufferedInputStream, j, OooO00o2);
        OooO00o3.OooO00o(new oOO00OO0(OooO00o2));
        return OooO00o3;
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream, long j, FileType fileType) throws IOException, ImageProcessingException {
        switch (OooO00o.OooO00o[fileType.ordinal()]) {
            case 1:
                return C7853oO0O0oO0.OooO00o(inputStream);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return C7872oO0OOo0.OooO00o(new oO0o0000(inputStream, 2048, j));
            case 8:
                return C7860oO0OO00.OooO00o(inputStream);
            case 9:
                return C7841oO0O.OooO00o(inputStream);
            case 10:
                return C8958ooOOOoOo.OooO00o(inputStream);
            case 11:
                return C7846oO0O0Oo.OooO00o(inputStream);
            case 12:
                return C7851oO0O0o0O.OooO00o(inputStream);
            case 13:
                return C7856oO0O0oo0.OooO00o(inputStream);
            case 14:
                return C7884oO0Oo00.OooO00o(inputStream);
            case 15:
                return oO0OOO.OooO00o(inputStream);
            case 16:
                return C8317oOo0oooO.OooO00o(inputStream);
            case 17:
                return C7876oO0OOoO.OooO00o(inputStream);
            case 18:
                return C7862oO0OO0Oo.OooO00o(inputStream);
            case 19:
                return C7855oO0O0oOo.OooO00o(inputStream);
            case 20:
                return C7847oO0O0Oo0.OooO00o(inputStream);
            case 21:
                throw new ImageProcessingException("File format could not be determined");
            default:
                return new C7925oO0o0OO0();
        }
    }

    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws ImageProcessingException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C7925oO0o0OO0 OooO00o2 = OooO00o(fileInputStream, file.length());
            fileInputStream.close();
            new oOO00O0O().OooO00o(file, OooO00o2);
            return OooO00o2;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static void OooO00o(@NotNull String[] strArr) throws MetadataException, IOException {
        String str;
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(strArr));
        boolean remove = arrayList.remove("-markdown");
        boolean remove2 = arrayList.remove("-hex");
        if (arrayList.size() < 1) {
            String implementationVersion = oO0O0O.class.getPackage().getImplementationVersion();
            System.out.println("metadata-extractor version " + implementationVersion);
            System.out.println();
            PrintStream printStream = System.out;
            Object[] objArr = new Object[1];
            if (implementationVersion == null) {
                implementationVersion = "a.b.c";
            }
            objArr[0] = implementationVersion;
            printStream.println(String.format("Usage: java -jar metadata-extractor-%s.jar <filename> [<filename>] [-thumb] [-markdown] [-hex]", objArr));
            System.exit(1);
        }
        for (String str2 : arrayList) {
            long nanoTime = System.nanoTime();
            File file = new File(str2);
            if (!remove && arrayList.size() > 1) {
                System.out.printf("\n***** PROCESSING: %s%n%n", str2);
            }
            C7925oO0o0OO0 oo0o0oo0 = null;
            try {
                oo0o0oo0 = OooO00o(file);
            } catch (Exception e) {
                e.printStackTrace(System.err);
                System.exit(1);
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (!remove) {
                PrintStream printStream2 = System.out;
                double length = (double) file.length();
                Double.isNaN(length);
                double d = (double) nanoTime2;
                Double.isNaN(d);
                printStream2.printf("Processed %.3f MB file in %.2f ms%n%n", Double.valueOf(length / 1048576.0d), Double.valueOf(d / 1000000.0d));
            }
            if (remove) {
                String name = file.getName();
                String OooO00o2 = C7921oO0o0O00.OooO00o(str2);
                C8287oOo00O0O ooo00o0o = (C8287oOo00O0O) oo0o0oo0.OooO00o(C8287oOo00O0O.class);
                String str3 = "";
                if (ooo00o0o == null) {
                    str = str3;
                } else {
                    str = ooo00o0o.OooO0O0(271);
                }
                if (ooo00o0o != null) {
                    str3 = ooo00o0o.OooO0O0(272);
                }
                System.out.println();
                System.out.println("---");
                System.out.println();
                System.out.printf("# %s - %s%n", str, str3);
                System.out.println();
                System.out.printf("<a href=\"https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s\">%n", OooO00o2);
                System.out.printf("<img src=\"https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s\" width=\"300\"/><br/>%n", OooO00o2);
                System.out.println(name);
                System.out.println("</a>");
                System.out.println();
                System.out.println("Directory | Tag Id | Tag Name | Extracted Value");
                System.out.println(":--------:|-------:|----------|----------------");
            }
            for (AbstractC7922oO0o0O0O oo0o0o0o : oo0o0oo0.m19661OooO00o()) {
                String OooO00o3 = oo0o0o0o.m19643OooO00o();
                for (C7928oO0o0Oo oo0o0oo : oo0o0o0o.m19645OooO00o()) {
                    String OooO0OO = oo0o0oo.OooO0OO();
                    String OooO00o4 = oo0o0oo.m19666OooO00o();
                    if (OooO00o4 != null && OooO00o4.length() > 1024) {
                        OooO00o4 = OooO00o4.substring(0, 1024) + "...";
                    }
                    if (remove) {
                        System.out.printf("%s|0x%s|%s|%s%n", OooO00o3, Integer.toHexString(oo0o0oo.OooO00o()), OooO0OO, OooO00o4);
                    } else if (remove2) {
                        System.out.printf("[%s - %s] %s = %s%n", OooO00o3, oo0o0oo.OooO0Oo(), OooO0OO, OooO00o4);
                    } else {
                        System.out.printf("[%s] %s = %s%n", OooO00o3, OooO0OO, OooO00o4);
                    }
                }
                Iterator<String> it = oo0o0o0o.m19640OooO00o().iterator();
                while (it.hasNext()) {
                    System.err.println("ERROR: " + it.next());
                }
            }
        }
    }
}
