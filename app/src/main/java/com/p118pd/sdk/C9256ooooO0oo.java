package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.ooooO0oo  reason: case insensitive filesystem */
public class C9256ooooO0oo extends C7929oO0o0OoO<C8025oOO00oOO> {
    public C9256ooooO0oo(@NotNull C8025oOO00oOO ooo00ooo) {
        super(ooo00ooo);
    }

    @Nullable
    public String OooO() {
        return OooOO0(C8025oOO00oOO.Oooo0o0);
    }

    @Nullable
    public String OooO00o() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooO0O);
    }

    @Nullable
    public String OooO0O0() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooO);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 276) {
            return OooOOOO();
        }
        if (i == 326) {
            return OooOO0();
        }
        if (i == 336) {
            return OooOooO();
        }
        if (i == 537) {
            return OooOOo0();
        }
        if (i == 542) {
            return OooOo();
        }
        if (i == 547) {
            return OooOoO0();
        }
        if (i == 559) {
            return OooOo0o();
        }
        if (i == 567) {
            return OooO();
        }
        if (i == 572) {
            return OooOoo();
        }
        if (i == 549) {
            return OooOOO0();
        }
        if (i == 550) {
            return OooOOO();
        }
        if (i == 574) {
            return OooOO0O();
        }
        if (i != 575) {
            return super.OooO0OO(i);
        }
        return OooOO0o();
    }

    @Nullable
    public String OooO0Oo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(527);
    }

    @Nullable
    public String OooO0o() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OooooO0);
    }

    @Nullable
    public String OooO0o0() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooOO0);
    }

    @Nullable
    public String OooO0oO() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooOo0);
    }

    @Nullable
    public String OooO0oo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.Ooooo00);
    }

    @Nullable
    public String OooOO0(int i) {
        String OooO0O0 = ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        if (OooO0O0.length() != 8) {
            return OooO0O0;
        }
        return OooO0O0.substring(0, 4) + ':' + OooO0O0.substring(4, 6) + ':' + OooO0O0.substring(6);
    }

    @Nullable
    public String OooOO0O(int i) {
        String OooO0O0 = ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        if (OooO0O0.length() != 6 && OooO0O0.length() != 11) {
            return OooO0O0;
        }
        return OooO0O0.substring(0, 2) + ':' + OooO0O0.substring(2, 4) + ':' + OooO0O0.substring(4);
    }

    @Nullable
    public String OooOO0o() {
        return OooOO0O(C8025oOO00oOO.Oooo0oo);
    }

    @Nullable
    public String OooOOO() {
        return OooOO0O(C8025oOO00oOO.Oooo000);
    }

    @Nullable
    public String OooOOO0() {
        return OooOO0(549);
    }

    @Nullable
    public String OooOOOO() {
        Integer OooO00o = ((C8025oOO00oOO) this.f20998OooO00o).m19639OooO00o(276);
        if (OooO00o == null) {
            return null;
        }
        switch (OooO00o.intValue()) {
            case 0:
                return "No ObjectData";
            case 1:
                return "IPTC-NAA Digital Newsphoto Parameter Record";
            case 2:
                return "IPTC7901 Recommended Message Format";
            case 3:
                return "Tagged Image File Format (Adobe/Aldus Image data)";
            case 4:
                return "Illustrator (Adobe Graphics data)";
            case 5:
                return "AppleSingle (Apple Computer Inc)";
            case 6:
                return "NAA 89-3 (ANPA 1312)";
            case 7:
                return "MacBinary II";
            case 8:
                return "IPTC Unstructured Character Oriented File Format (UCOFF)";
            case 9:
                return "United Press International ANPA 1312 variant";
            case 10:
                return "United Press International Down-Load Message";
            case 11:
                return "JPEG File Interchange (JFIF)";
            case 12:
                return "Photo-CD Image-Pac (Eastman Kodak)";
            case 13:
                return "Bit Mapped Graphics File [.BMP] (Microsoft)";
            case 14:
                return "Digital Audio File [.WAV] (Microsoft & Creative Labs)";
            case 15:
                return "Audio plus Moving Video [.AVI] (Microsoft)";
            case 16:
                return "PC DOS/Windows Executable Files [.COM][.EXE]";
            case 17:
                return "Compressed Binary File [.ZIP] (PKWare Inc)";
            case 18:
                return "Audio Interchange File Format AIFF (Apple Computer Inc)";
            case 19:
                return "RIFF Wave (Microsoft Corporation)";
            case 20:
                return "Freehand (Macromedia/Aldus)";
            case 21:
                return "Hypertext Markup Language [.HTML] (The Internet Society)";
            case 22:
                return "MPEG 2 Audio Layer 2 (Musicom), ISO/IEC";
            case 23:
                return "MPEG 2 Audio Layer 3, ISO/IEC";
            case 24:
                return "Portable Document File [.PDF] Adobe";
            case 25:
                return "News Industry Text Format (NITF)";
            case 26:
                return "Tape Archive [.TAR]";
            case 27:
                return "Tidningarnas Telegrambyra NITF version (TTNITF DTD)";
            case 28:
                return "Ritzaus Bureau NITF version (RBNITF DTD)";
            case 29:
                return "Corel Draw [.CDR]";
            default:
                return String.format("Unknown (%d)", OooO00o);
        }
    }

    @Nullable
    public String OooOOOo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooOoo);
    }

    @Nullable
    public String OooOOo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(517);
    }

    @Nullable
    public String OooOOo0() {
        String[] OooO00o = ((C8025oOO00oOO) this.f20998OooO00o).m19655OooO00o(537);
        if (OooO00o == null) {
            return null;
        }
        return C7921oO0o0O00.OooO00o(OooO00o, C7522o0Ooo0o.OooO0O0);
    }

    @Nullable
    public String OooOOoo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooOoO);
    }

    @Nullable
    public String OooOo() {
        return OooOO0(542);
    }

    @Nullable
    public String OooOo0() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OoooOOO);
    }

    @Nullable
    public String OooOo00() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.Oooo);
    }

    @Nullable
    public String OooOo0O() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(512);
    }

    @Nullable
    public String OooOo0o() {
        return OooOO0(559);
    }

    @Nullable
    public String OooOoO() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.Ooooo0o);
    }

    @Nullable
    public String OooOoO0() {
        return OooOO0O(547);
    }

    @Nullable
    public String OooOoOO() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.Oooo00O);
    }

    @Nullable
    public String OooOoo() {
        return OooOO0O(C8025oOO00oOO.Oooo0o);
    }

    @Nullable
    public String OooOoo0() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(532);
    }

    @Nullable
    public String OooOooO() {
        return OooOO0O(C8025oOO00oOO.OooOO0);
    }

    @Nullable
    public String OooOooo() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(522);
    }

    @Nullable
    public String Oooo000() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.Oooooo);
    }

    @Nullable
    public String OooOO0() {
        return OooOO0(C8025oOO00oOO.OooO);
    }

    @Nullable
    public String OooOO0O() {
        return OooOO0(C8025oOO00oOO.Oooo0oO);
    }

    @Nullable
    public String OooO0OO() {
        return ((C8025oOO00oOO) this.f20998OooO00o).OooO0O0(C8025oOO00oOO.OooooOo);
    }
}
