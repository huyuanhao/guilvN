package com.drew.imaging;

import androidx.multidex.MultiDexExtractor;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

public enum FileType {
    Unknown("Unknown", "Unknown", null, new String[0]),
    Jpeg("JPEG", "Joint Photographic Experts Group", "image/jpeg", BitmapUtils.IMAGE_KEY_SUFFIX, "jpeg", "jpe"),
    Tiff("TIFF", "Tagged Image File Format", "image/tiff", "tiff", "tif"),
    Psd("PSD", "Photoshop Document", "image/vnd.adobe.photoshop", "psd"),
    Png("PNG", "Portable Network Graphics", "image/png", "png"),
    Bmp("BMP", "Device Independent Bitmap", "image/bmp", "bmp"),
    Gif("GIF", "Graphics Interchange Format", "image/gif", "gif"),
    Ico("ICO", "Windows Icon", "image/x-icon", "ico"),
    Pcx("PCX", "PiCture eXchange", "image/x-pcx", "pcx"),
    Riff("RIFF", "Resource Interchange File Format", null, new String[0]),
    Wav("WAV", "Waveform Audio File Format", "audio/vnd.wave", "wav", "wave"),
    Avi("AVI", "Audio Video Interleaved", "video/vnd.avi", "avi"),
    WebP("WebP", "WebP", "image/webp", "webp"),
    Mov("MOV", "QuickTime Movie", "video/quicktime", "mov", "qt"),
    Mp4("MP4", "MPEG-4 Part 14", "video/mp4", "mp4", "m4a", "m4p", "m4b", "m4r", "m4v"),
    Heif("HEIF", "High Efficiency Image File Format", "image/heif", "heif", "heic"),
    Eps("EPS", "Encapsulated PostScript", "application/postscript", "eps", "epsf", "epsi"),
    Arw("ARW", "Sony Camera Raw", null, "arw"),
    Crw("CRW", "Canon Camera Raw", null, "crw"),
    Cr2("CR2", "Canon Camera Raw", null, "cr2"),
    Nef("NEF", "Nikon Camera Raw", null, "nef"),
    Orf("ORF", "Olympus Camera Raw", null, "orf"),
    Raf("RAF", "FujiFilm Camera Raw", null, "raf"),
    Rw2("RW2", "Panasonic Camera Raw", null, "rw2"),
    Aac("AAC", "Advanced Audio Coding", "audio/aac", "m4a"),
    Asf("ASF", "Advanced Systems Format", "video/x-ms-asf", "asf", "wma", "wmv"),
    Cfbf("CFBF", "Compound File Binary Format", null, null),
    Flv("FLV", "Flash Video", "video/x-flv", ".flv", ".f4v,"),
    Indd("INDD", "INDesign Document", "application/octet-stream", ".indd"),
    Mxf("MXF", "Material Exchange Format", "application/mxf", "mxf"),
    Pdf("PDF", "Portable Document Format", "application/pdf", "pdf"),
    Qxp("QXP", "Quark XPress Document", null, "qzp", "qxd"),
    Ram("RAM", "RealAudio", "audio/vnd.rn-realaudio", "aac", "ra"),
    Rtf("RTF", "Rich Text Format", "application/rtf", "rtf"),
    Sit("SIT", "Stuffit Archive", "application/x-stuffit", "sit"),
    Sitx("SITX", "Stuffit X Archive", "application/x-stuffitx", "sitx"),
    Swf("SWF", "Small Web Format", "application/vnd.adobe.flash-movie", "swf"),
    Vob("VOB", "Video Object", "video/dvd", ".vob"),
    Zip("ZIP", "ZIP Archive", "application/zip", MultiDexExtractor.o0OO00O, ".zipx");
    
    public final String[] _extensions;
    @NotNull
    public final String _longName;
    @Nullable
    public final String _mimeType;
    @NotNull
    public final String _name;

    /* access modifiers changed from: public */
    FileType(@NotNull String str, @NotNull String str2, @Nullable String str3, String... strArr) {
        this._name = str;
        this._longName = str2;
        this._mimeType = str3;
        this._extensions = strArr;
    }

    @Nullable
    public String[] getAllExtensions() {
        return this._extensions;
    }

    @Nullable
    public String getCommonExtension() {
        String[] strArr = this._extensions;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @NotNull
    public String getLongName() {
        return this._longName;
    }

    @Nullable
    public String getMimeType() {
        return this._mimeType;
    }

    @NotNull
    public String getName() {
        return this._name;
    }
}
