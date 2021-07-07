package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.FileType;
import com.drew.lang.annotations.NotNull;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.pd.sdk.oO0O0o  reason: case insensitive filesystem */
public class C7850oO0O0o {
    public static final oO0Oo0o0<FileType> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<String, FileType> f20906OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f20907OooO00o = false;

    static {
        oO0Oo0o0<FileType> oo0oo0o0 = new oO0Oo0o0<>();
        OooO00o = oo0oo0o0;
        oo0oo0o0.OooO00o(FileType.Unknown);
        OooO00o.OooO00o(FileType.Jpeg, new byte[]{-1, ExifInterface.OooO0OO});
        OooO00o.OooO00o(FileType.Tiff, "II".getBytes(), new byte[]{ExifInterface.OooO00o, 0});
        OooO00o.OooO00o(FileType.Tiff, "MM".getBytes(), new byte[]{0, ExifInterface.OooO00o});
        OooO00o.OooO00o(FileType.Psd, "8BPS".getBytes());
        OooO00o.OooO00o(FileType.Png, new byte[]{-119, 80, 78, C8027oOO00oo.OooO0O0, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        OooO00o.OooO00o(FileType.Bmp, "BM".getBytes());
        OooO00o.OooO00o(FileType.Bmp, "BA".getBytes());
        OooO00o.OooO00o(FileType.Bmp, "CI".getBytes());
        OooO00o.OooO00o(FileType.Bmp, "CP".getBytes());
        OooO00o.OooO00o(FileType.Bmp, "IC".getBytes());
        OooO00o.OooO00o(FileType.Bmp, "PT".getBytes());
        OooO00o.OooO00o(FileType.Gif, "GIF87a".getBytes());
        OooO00o.OooO00o(FileType.Gif, "GIF89a".getBytes());
        OooO00o.OooO00o(FileType.Ico, new byte[]{0, 0, 1, 0});
        OooO00o.OooO00o(FileType.Pcx, new byte[]{10, 0, 1});
        OooO00o.OooO00o(FileType.Pcx, new byte[]{10, 2, 1});
        OooO00o.OooO00o(FileType.Pcx, new byte[]{10, 3, 1});
        OooO00o.OooO00o(FileType.Pcx, new byte[]{10, 5, 1});
        OooO00o.OooO00o(FileType.Riff, "RIFF".getBytes());
        OooO00o.OooO00o(FileType.Arw, "II".getBytes(), new byte[]{ExifInterface.OooO00o, 0, 8, 0});
        OooO00o.OooO00o(FileType.Crw, "II".getBytes(), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes());
        OooO00o.OooO00o(FileType.Cr2, "II".getBytes(), new byte[]{ExifInterface.OooO00o, 0, 16, 0, 0, 0, 67, 82});
        OooO00o.OooO00o(FileType.Orf, "IIRO".getBytes(), new byte[]{8, 0});
        OooO00o.OooO00o(FileType.Orf, "MMOR".getBytes(), new byte[]{0, 0});
        OooO00o.OooO00o(FileType.Orf, "IIRS".getBytes(), new byte[]{8, 0});
        OooO00o.OooO00o(FileType.Raf, ExifInterface.o0O0ooO.getBytes());
        OooO00o.OooO00o(FileType.Rw2, "II".getBytes(), new byte[]{85, 0});
        OooO00o.OooO00o(FileType.Eps, "%!PS".getBytes());
        OooO00o.OooO00o(FileType.Eps, new byte[]{ExifInterface.OooO0oo, -48, -45, ExifInterface.OooO});
        HashMap<String, FileType> hashMap = new HashMap<>();
        f20906OooO00o = hashMap;
        hashMap.put("ftypmoov", FileType.Mov);
        f20906OooO00o.put("ftypwide", FileType.Mov);
        f20906OooO00o.put("ftypmdat", FileType.Mov);
        f20906OooO00o.put("ftypfree", FileType.Mov);
        f20906OooO00o.put("ftypqt  ", FileType.Mov);
        f20906OooO00o.put("ftypavc1", FileType.Mp4);
        f20906OooO00o.put("ftypiso2", FileType.Mp4);
        f20906OooO00o.put("ftypisom", FileType.Mp4);
        f20906OooO00o.put("ftypM4A ", FileType.Mp4);
        f20906OooO00o.put("ftypM4B ", FileType.Mp4);
        f20906OooO00o.put("ftypM4P ", FileType.Mp4);
        f20906OooO00o.put("ftypM4V ", FileType.Mp4);
        f20906OooO00o.put("ftypM4VH", FileType.Mp4);
        f20906OooO00o.put("ftypM4VP", FileType.Mp4);
        f20906OooO00o.put("ftypmmp4", FileType.Mp4);
        f20906OooO00o.put("ftypmp41", FileType.Mp4);
        f20906OooO00o.put("ftypmp42", FileType.Mp4);
        f20906OooO00o.put("ftypmp71", FileType.Mp4);
        f20906OooO00o.put("ftypMSNV", FileType.Mp4);
        f20906OooO00o.put("ftypNDAS", FileType.Mp4);
        f20906OooO00o.put("ftypNDSC", FileType.Mp4);
        f20906OooO00o.put("ftypNDSH", FileType.Mp4);
        f20906OooO00o.put("ftypNDSM", FileType.Mp4);
        f20906OooO00o.put("ftypNDSP", FileType.Mp4);
        f20906OooO00o.put("ftypNDSS", FileType.Mp4);
        f20906OooO00o.put("ftypNDXC", FileType.Mp4);
        f20906OooO00o.put("ftypNDXH", FileType.Mp4);
        f20906OooO00o.put("ftypNDXM", FileType.Mp4);
        f20906OooO00o.put("ftypNDXP", FileType.Mp4);
        f20906OooO00o.put("ftypNDXS", FileType.Mp4);
        f20906OooO00o.put("ftypmif1", FileType.Heif);
        f20906OooO00o.put("ftypmsf1", FileType.Heif);
        f20906OooO00o.put("ftypheic", FileType.Heif);
        f20906OooO00o.put("ftypheix", FileType.Heif);
        f20906OooO00o.put("ftyphevc", FileType.Heif);
        f20906OooO00o.put("ftyphevx", FileType.Heif);
        OooO00o.OooO00o(FileType.Aac, new byte[]{-1, -15});
        OooO00o.OooO00o(FileType.Aac, new byte[]{-1, -7});
        OooO00o.OooO00o(FileType.Asf, new byte[]{48, 38, -78, 117, -114, 102, ExifInterface.OooOOOo, 17, -90, -39, 0, -86, 0, 98, ExifInterface.OooOOOO, 108});
        OooO00o.OooO00o(FileType.Cfbf, new byte[]{-48, ExifInterface.OooOOOo, 17, C3571am.f9205k, -95, -79, 26, ExifInterface.OooOOo, 0});
        OooO00o.OooO00o(FileType.Flv, new byte[]{70, 76, 86});
        OooO00o.OooO00o(FileType.Indd, new byte[]{6, 6, -19, -11, ExifInterface.OooO0OO, 29, 70, -27, -67, 49, -17, -25, -2, 116, -73, 29});
        OooO00o.OooO00o(FileType.Mxf, new byte[]{6, C3587az.f9268l, 43, 52, 2, 5, 1, 1, 13, 1, 2, 1, 1, 2});
        OooO00o.OooO00o(FileType.Qxp, new byte[]{0, 0, 73, 73, 88, 80, 82, 51});
        OooO00o.OooO00o(FileType.Qxp, new byte[]{0, 0, 77, 77, 88, 80, 82, 51});
        OooO00o.OooO00o(FileType.Ram, new byte[]{114, 116, 115, 112, 58, 47, 47});
        OooO00o.OooO00o(FileType.Rtf, new byte[]{123, 92, 114, 116, 102, 49});
        OooO00o.OooO00o(FileType.Sit, new byte[]{83, 73, 84, PublicSuffixDatabase.EXCEPTION_MARKER, 0});
        OooO00o.OooO00o(FileType.Sit, new byte[]{83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 41, 49, 57, 57, 55, 45});
        OooO00o.OooO00o(FileType.Sitx, new byte[]{83, 116, 117, 102, 102, 73, 116, PublicSuffixDatabase.EXCEPTION_MARKER});
        OooO00o.OooO00o(FileType.Swf, "CWS".getBytes());
        OooO00o.OooO00o(FileType.Swf, "FWS".getBytes());
        OooO00o.OooO00o(FileType.Swf, "ZWS".getBytes());
        OooO00o.OooO00o(FileType.Vob, new byte[]{0, 0, 1, -70});
        OooO00o.OooO00o(FileType.Zip, "PK".getBytes());
    }

    public C7850oO0O0o() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    @NotNull
    public static FileType OooO00o(@NotNull BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.markSupported()) {
            int max = Math.max(16, OooO00o.OooO00o());
            bufferedInputStream.mark(max);
            byte[] bArr = new byte[max];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                FileType OooO00o2 = OooO00o.OooO00o(bArr);
                if (OooO00o2 == FileType.Unknown) {
                    FileType fileType = f20906OooO00o.get(new String(bArr, 4, 8));
                    if (fileType != null) {
                        return fileType;
                    }
                    return OooO00o2;
                } else if (OooO00o2 != FileType.Riff) {
                    return OooO00o2;
                } else {
                    String str = new String(bArr, 8, 4);
                    if (str.equals(C8130oOOOOoo0.f21141OooO0o0)) {
                        return FileType.Wav;
                    }
                    if (str.equals(C7935oO0o0o0o.f21005OooO0o)) {
                        return FileType.Avi;
                    }
                    return str.equals(C8132oOOOOooo.OooO0oo) ? FileType.WebP : OooO00o2;
                }
            } else {
                throw new IOException("Stream ended before file's magic number could be determined.");
            }
        } else {
            throw new IOException("Stream must support mark/reset");
        }
    }
}
