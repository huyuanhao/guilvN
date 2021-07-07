package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.pd.sdk.oOOOo0O  reason: case insensitive filesystem */
public class C8139oOOOo0O {
    public static void OooO00o(String[] strArr) throws IOException, JpegProcessingException {
        if (strArr.length < 1) {
            OooO00o();
            System.exit(1);
        }
        String str = strArr[0];
        if (!new File(str).exists()) {
            System.err.println("File does not exist");
            OooO00o();
            System.exit(1);
        }
        HashSet hashSet = new HashSet();
        for (int i = 1; i < strArr.length; i++) {
            JpegSegmentType valueOf = JpegSegmentType.valueOf(strArr[i].toUpperCase());
            if (!valueOf.canContainMetadata) {
                System.err.printf("WARNING: Segment type %s cannot contain metadata so it may not be necessary to extract it%n", valueOf);
            }
            hashSet.add(valueOf);
        }
        if (hashSet.size() == 0) {
            hashSet.addAll(JpegSegmentType.canContainMetadataTypes);
        }
        PrintStream printStream = System.out;
        printStream.println("Reading: " + str);
        OooO00o(str, C8931ooOOO0Oo.OooO00o(new File(str), hashSet));
    }

    public static void OooO00o(@NotNull String str, @NotNull C7852oO0O0oO oo0o0oo) throws IOException {
        for (JpegSegmentType jpegSegmentType : oo0o0oo.OooO00o()) {
            List OooO00o = C7897oO0OoOO.OooO00o((Iterable) oo0o0oo.m19534OooO00o(jpegSegmentType));
            if (OooO00o.size() != 0) {
                if (OooO00o.size() > 1) {
                    for (int i = 0; i < OooO00o.size(); i++) {
                        String format = String.format("%s.%s.%d", str, jpegSegmentType.toString().toLowerCase(), Integer.valueOf(i));
                        PrintStream printStream = System.out;
                        printStream.println("Writing: " + format);
                        C8140oOOOo0OO.OooO00o(new File(format), (byte[]) OooO00o.get(i));
                    }
                } else {
                    String format2 = String.format("%s.%s", str, jpegSegmentType.toString().toLowerCase());
                    PrintStream printStream2 = System.out;
                    printStream2.println("Writing: " + format2);
                    C8140oOOOo0OO.OooO00o(new File(format2), (byte[]) OooO00o.get(0));
                }
            }
        }
    }

    public static void OooO00o() {
        System.out.println("USAGE:\n");
        System.out.println("\tjava com.drew.tools.ExtractJpegSegmentTool <filename> [<segment> ...]\n");
        System.out.print("Where <segment> is zero or more of:");
        JpegSegmentType[] jpegSegmentTypeArr = (JpegSegmentType[]) JpegSegmentType.class.getEnumConstants();
        for (JpegSegmentType jpegSegmentType : jpegSegmentTypeArr) {
            if (jpegSegmentType.canContainMetadata) {
                System.out.print(" " + jpegSegmentType.toString());
            }
        }
        System.out.println();
    }
}
