package com.p118pd.sdk;

import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0o0ooo  reason: case insensitive filesystem */
public class C7941oO0o0ooo {
    public int OooO00o;

    public static int OooO00o(byte b) {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        byte b2 = C8027oOO00oo.OooO00o;
        if (b < 65 || b > 70) {
            b2 = 97;
            if (b < 97 || b > 102) {
                return -1;
            }
        }
        return (b - b2) + 10;
    }

    public static void OooO0O0(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        byte[] OooO00o2 = OooO00o(oo0o000o);
        if (OooO00o2 != null) {
            new C8310oOo0o().OooO00o(new C7916oO0o000(OooO00o2), OooO00o2.length, oo0o0oo0);
        }
    }

    public static void OooO0OO(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        new C8138oOOOo00o().OooO00o(new String(OooO00o(oo0o000o, "<?xpacket end=\"w\"?>".getBytes()), C7895oO0OoO00.OooO00o), oo0o0oo0);
    }

    public void OooO00o(@NotNull InputStream inputStream, @NotNull C7925oO0o0OO0 oo0o0oo0) throws IOException {
        oO0o0000 oo0o0000 = new oO0o0000(inputStream);
        C7940oO0o0ooO oo0o0ooo = new C7940oO0o0ooO();
        oo0o0oo0.OooO00o(oo0o0ooo);
        int OooO0O0 = oo0o0000.m19604OooO0O0(0);
        if (OooO0O0 == -976170042) {
            oo0o0000.OooO00o(false);
            int OooO0O02 = oo0o0000.m19604OooO0O0(4);
            int OooO0O03 = oo0o0000.m19604OooO0O0(8);
            int OooO0O04 = oo0o0000.m19604OooO0O0(12);
            int OooO0O05 = oo0o0000.m19604OooO0O0(16);
            int OooO0O06 = oo0o0000.m19604OooO0O0(20);
            int OooO0O07 = oo0o0000.m19604OooO0O0(24);
            if (OooO0O07 != 0) {
                oo0o0ooo.OooO00o(32, OooO0O07);
                oo0o0ooo.OooO00o(33, OooO0O06);
                try {
                    new C7871oO0OOo().OooO00o(new oO0Oo0(oo0o0000.m19611OooO00o(OooO0O06, OooO0O07)), new C8114oOOOO(oo0o0oo0, null), 0);
                } catch (TiffProcessingException e) {
                    oo0o0ooo.OooO00o("Unable to process TIFF data: " + e.getMessage());
                }
            } else if (OooO0O05 != 0) {
                oo0o0ooo.OooO00o(34, OooO0O05);
                oo0o0ooo.OooO00o(35, OooO0O04);
            }
            OooO00o(oo0o0ooo, oo0o0oo0, new C7916oO0o000(oo0o0000.m19611OooO00o(OooO0O02, OooO0O03)));
        } else if (OooO0O0 != 622940243) {
            oo0o0ooo.OooO00o("File type not supported.");
        } else {
            inputStream.reset();
            OooO00o(oo0o0ooo, oo0o0oo0, new C8986ooOOoOoo(inputStream));
        }
    }

    private void OooO00o(@NotNull C7940oO0o0ooO oo0o0ooo, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.setLength(0);
            while (true) {
                char OooO00o2 = (char) oo0o000o.OooO00o();
                if (OooO00o2 != '\r' && OooO00o2 != '\n') {
                    sb.append(OooO00o2);
                }
            }
            if (sb.length() == 0 || sb.charAt(0) == '%') {
                int indexOf = sb.indexOf(Constants.COLON_SEPARATOR);
                if (indexOf != -1) {
                    str = sb.substring(0, indexOf).trim();
                    OooO00o(oo0o0ooo, str, sb.substring(indexOf + 1).trim());
                } else {
                    str = sb.toString().trim();
                }
                if (str.equals("%BeginPhotoshop")) {
                    OooO0O0(oo0o0oo0, oo0o000o);
                } else if (str.equals("%%BeginICCProfile")) {
                    OooO00o(oo0o0oo0, oo0o000o);
                } else if (str.equals("%begin_xml_packet")) {
                    OooO0OO(oo0o0oo0, oo0o000o);
                }
            } else {
                return;
            }
        }
    }

    private void OooO00o(@NotNull C7940oO0o0ooO oo0o0ooo, String str, String str2) throws IOException {
        Integer num = C7940oO0o0ooO.f21008OooO0O0.get(str);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 8) {
                OooO00o(oo0o0ooo, str2);
            } else if (intValue == 36) {
                int i = this.OooO00o;
                oo0o0ooo.m19648OooO00o(i, oo0o0ooo.OooO0O0(this.OooO00o) + " " + str2);
            } else if (!C7940oO0o0ooO.f21007OooO00o.containsKey(num) || oo0o0ooo.m19650OooO00o(num.intValue())) {
                this.OooO00o = 0;
            } else {
                oo0o0ooo.m19648OooO00o(num.intValue(), str2);
                this.OooO00o = num.intValue();
            }
            this.OooO00o = num.intValue();
        }
    }

    public static void OooO00o(@NotNull C7940oO0o0ooO oo0o0ooo, String str) throws IOException {
        oo0o0ooo.m19648OooO00o(8, str.trim());
        String[] split = str.split(" ");
        int i = 0;
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[3]);
        if (!oo0o0ooo.m19650OooO00o(28)) {
            oo0o0ooo.OooO00o(28, parseInt);
        }
        if (!oo0o0ooo.m19650OooO00o(29)) {
            oo0o0ooo.OooO00o(29, parseInt2);
        }
        if (!oo0o0ooo.m19650OooO00o(30)) {
            oo0o0ooo.OooO00o(30, parseInt3);
        }
        if (!oo0o0ooo.m19650OooO00o(31)) {
            if (parseInt3 == 1) {
                i = 1;
            } else if (parseInt3 == 2 || parseInt3 == 3 || parseInt3 == 4) {
                i = 3;
            }
            if (i != 0) {
                oo0o0ooo.OooO00o(31, i * parseInt * parseInt2);
            }
        }
    }

    public static void OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        byte[] OooO00o2 = OooO00o(oo0o000o);
        if (OooO00o2 != null) {
            new C8023oOO00o0o().OooO00o(new oO0Oo0(OooO00o2), oo0o0oo0);
        }
    }

    public static byte[] OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i = 0;
        while (i != length) {
            byte OooO00o2 = oo0o000o.OooO00o();
            i = OooO00o2 == bArr[i] ? i + 1 : 0;
            byteArrayOutputStream.write(OooO00o2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Nullable
    public static byte[] OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        char c = 0;
        byte b = 0;
        int i = 0;
        while (!z) {
            b = oo0o000o.OooO00o();
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        int OooO00o2 = OooO00o(b);
                        if (OooO00o2 != -1) {
                            i = OooO00o2 * 16;
                            c = 3;
                        } else if (b != 13 && b != 10) {
                            return null;
                        } else {
                            c = 0;
                        }
                    } else if (c == 3) {
                        int OooO00o3 = OooO00o(b);
                        if (OooO00o3 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write(OooO00o3 + i);
                    } else {
                        continue;
                    }
                } else if (b != 32) {
                    z = true;
                }
                c = 2;
            } else if (!(b == 10 || b == 13 || b == 32)) {
                if (b != 37) {
                    return null;
                }
                c = 1;
            }
        }
        while (b != 10) {
            b = oo0o000o.OooO00o();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
