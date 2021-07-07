package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOo000OO  reason: case insensitive filesystem */
public class C8278oOo000OO extends AbstractC7922oO0o0O0O {
    public static final int OooO = 32;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21368OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 7;
    public static final int OooO0o = 26;
    public static final int OooO0o0 = 15;
    public static final int OooO0oO = 28;
    public static final int OooO0oo = 31;
    public static final int OooOO0 = 33;
    public static final int OooOO0O = 34;
    public static final int OooOO0o = 35;
    public static final int OooOOO = 37;
    public static final int OooOOO0 = 36;
    public static final int OooOOOO = 38;
    public static final int OooOOOo = 40;
    public static final int OooOOo = 42;
    public static final int OooOOo0 = 41;
    public static final int OooOOoo = 43;
    public static final int OooOo = 49;
    public static final int OooOo0 = 45;
    public static final int OooOo00 = 44;
    public static final int OooOo0O = 46;
    public static final int OooOo0o = 48;
    public static final int OooOoO = 51;
    public static final int OooOoO0 = 50;
    public static final int OooOoOO = 52;
    public static final int OooOoo = 54;
    public static final int OooOoo0 = 53;
    public static final int OooOooO = 57;
    public static final int OooOooo = 58;
    public static final int Oooo = 70;
    public static final int Oooo0 = 62;
    public static final int Oooo000 = 59;
    public static final int Oooo00O = 60;
    public static final int Oooo00o = 61;
    public static final int Oooo0O0 = 63;
    public static final int Oooo0OO = 64;
    public static final int Oooo0o = 66;
    public static final int Oooo0o0 = 65;
    public static final int Oooo0oO = 68;
    public static final int Oooo0oo = 69;
    public static final int OoooO = 75;
    public static final int OoooO0 = 72;
    public static final int OoooO00 = 71;
    public static final int OoooO0O = 73;
    public static final int OoooOO0 = 76;
    public static final int OoooOOO = 78;
    public static final int OoooOOo = 81;
    public static final int OoooOo0 = 82;
    public static final int OoooOoO = 83;
    public static final int OoooOoo = 84;
    public static final int Ooooo00 = 89;
    public static final int Ooooo0o = 93;
    public static final int OooooO0 = 96;
    public static final int OooooOO = 119;
    public static final int OooooOo = 121;
    public static final int Oooooo = 128;
    public static final int Oooooo0 = 124;
    public static final int OoooooO = 137;
    public static final int Ooooooo = 138;
    public static final int o0000 = 32775;
    public static final int o00000 = 107;
    public static final int o000000 = 102;
    public static final int o000000O = 103;
    public static final int o000000o = 105;
    public static final int o00000O = 111;
    public static final int o00000O0 = 109;
    public static final int o00000OO = 112;
    public static final int o00000Oo = 32768;
    public static final int o00000o0 = 32769;
    public static final int o00000oO = 32773;
    public static final int o00000oo = 32774;
    public static final int o0000O0 = 32786;
    public static final int o0000O00 = 32776;
    public static final int o0000Ooo = 32772;
    public static final int o0000oO = 32784;
    public static final int o0000oo = 32777;
    public static final int o000OOo = 101;
    public static final int o000oOoO = 77;
    public static final int o00O0O = 142;
    public static final int o00Oo0 = 143;
    public static final int o00Ooo = 144;
    public static final int o00o0O = 145;
    public static final int o00oO0O = 157;
    public static final int o00oO0o = 150;
    public static final int o00ooo = 147;
    public static final int o0O0O00 = 99;
    public static final int o0OO00O = 97;
    public static final int o0OOO0o = 171;
    public static final int o0Oo0oo = 3584;
    public static final int o0OoOo0 = 140;
    public static final int o0ooOO0 = 158;
    public static final int o0ooOOo = 159;
    public static final int o0ooOoO = 163;
    public static final int oo000o = 148;
    public static final int oo0o0Oo = 98;
    public static final int ooOO = 141;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21368OooO00o = hashMap;
        hashMap.put(1, "Quality Mode");
        f21368OooO00o.put(2, AbstractC7726o0ooOOoo.OooO0o0);
        f21368OooO00o.put(3, "White Balance");
        f21368OooO00o.put(7, "Focus Mode");
        f21368OooO00o.put(15, "AF Area Mode");
        f21368OooO00o.put(26, "Image Stabilization");
        f21368OooO00o.put(28, "Macro Mode");
        f21368OooO00o.put(31, "Record Mode");
        f21368OooO00o.put(32, "Audio");
        f21368OooO00o.put(37, "Internal Serial Number");
        f21368OooO00o.put(33, "Unknown Data Dump");
        f21368OooO00o.put(34, "Easy Mode");
        f21368OooO00o.put(35, "White Balance Bias");
        f21368OooO00o.put(36, "Flash Bias");
        f21368OooO00o.put(38, "Exif Version");
        f21368OooO00o.put(40, "Color Effect");
        f21368OooO00o.put(41, "Camera Uptime");
        f21368OooO00o.put(42, "Burst Mode");
        f21368OooO00o.put(43, "Sequence Number");
        f21368OooO00o.put(44, "Contrast Mode");
        f21368OooO00o.put(45, "Noise Reduction");
        f21368OooO00o.put(46, "Self Timer");
        f21368OooO00o.put(48, "Rotation");
        f21368OooO00o.put(49, "AF Assist Lamp");
        f21368OooO00o.put(50, "Color Mode");
        f21368OooO00o.put(51, "Baby Age");
        f21368OooO00o.put(52, "Optical Zoom Mode");
        f21368OooO00o.put(53, "Conversion Lens");
        f21368OooO00o.put(54, "Travel Day");
        f21368OooO00o.put(57, ExifInterface.o0000Ooo);
        f21368OooO00o.put(58, "World Time Location");
        f21368OooO00o.put(59, "Text Stamp");
        f21368OooO00o.put(60, "Program ISO");
        f21368OooO00o.put(61, "Advanced Scene Mode");
        f21368OooO00o.put(3584, "Print Image Matching (PIM) Info");
        f21368OooO00o.put(63, "Number of Detected Faces");
        f21368OooO00o.put(64, ExifInterface.o00000oO);
        f21368OooO00o.put(65, ExifInterface.o00000oo);
        f21368OooO00o.put(66, "Film Mode");
        f21368OooO00o.put(68, "Color Temp Kelvin");
        f21368OooO00o.put(69, "Bracket Settings");
        f21368OooO00o.put(70, "White Balance Adjust (AB)");
        f21368OooO00o.put(71, "White Balance Adjust (GM)");
        f21368OooO00o.put(72, "Flash Curtain");
        f21368OooO00o.put(73, "Long Exposure Noise Reduction");
        f21368OooO00o.put(75, "Panasonic Image Width");
        f21368OooO00o.put(76, "Panasonic Image Height");
        f21368OooO00o.put(77, "Af Point Position");
        f21368OooO00o.put(78, "Face Detection Info");
        f21368OooO00o.put(81, "Lens Type");
        f21368OooO00o.put(82, "Lens Serial Number");
        f21368OooO00o.put(83, "Accessory Type");
        f21368OooO00o.put(84, "Accessory Serial Number");
        f21368OooO00o.put(89, "Transform");
        f21368OooO00o.put(93, "Intelligent Exposure");
        f21368OooO00o.put(96, "Lens Firmware Version");
        f21368OooO00o.put(97, "Face Recognition Info");
        f21368OooO00o.put(98, "Flash Warning");
        f21368OooO00o.put(99, "Recognized Face Flags");
        f21368OooO00o.put(101, "Title");
        f21368OooO00o.put(102, "Baby Name");
        f21368OooO00o.put(103, "Location");
        f21368OooO00o.put(105, "Country");
        f21368OooO00o.put(107, "State");
        f21368OooO00o.put(109, "City");
        f21368OooO00o.put(111, "Landmark");
        f21368OooO00o.put(112, "Intelligent Resolution");
        f21368OooO00o.put(119, "Burst Speed");
        f21368OooO00o.put(121, "Intelligent D-Range");
        f21368OooO00o.put(124, "Clear Retouch");
        f21368OooO00o.put(128, "City 2");
        f21368OooO00o.put(137, "Photo Style");
        f21368OooO00o.put(138, "Shading Compensation");
        f21368OooO00o.put(140, "Accelerometer Z");
        f21368OooO00o.put(141, "Accelerometer X");
        f21368OooO00o.put(142, "Accelerometer Y");
        f21368OooO00o.put(143, "Camera Orientation");
        f21368OooO00o.put(144, "Roll Angle");
        f21368OooO00o.put(145, "Pitch Angle");
        f21368OooO00o.put(147, "Sweep Panorama Direction");
        f21368OooO00o.put(148, "Sweep Panorama Field Of View");
        f21368OooO00o.put(150, "Timer Recording");
        f21368OooO00o.put(157, "Internal ND Filter");
        f21368OooO00o.put(158, "HDR");
        f21368OooO00o.put(159, "Shutter Type");
        f21368OooO00o.put(163, "Clear Retouch Value");
        f21368OooO00o.put(171, "Touch AE");
        f21368OooO00o.put(32768, "Makernote Version");
        f21368OooO00o.put(32769, "Scene Mode");
        f21368OooO00o.put(32772, "White Balance (Red)");
        f21368OooO00o.put(32773, "White Balance (Green)");
        f21368OooO00o.put(32774, "White Balance (Blue)");
        f21368OooO00o.put(32775, "Flash Fired");
        f21368OooO00o.put(62, "Text Stamp 1");
        f21368OooO00o.put(32776, "Text Stamp 2");
        f21368OooO00o.put(32777, "Text Stamp 3");
        f21368OooO00o.put(Integer.valueOf((int) o0000oO), "Baby Age 1");
        f21368OooO00o.put(Integer.valueOf((int) o0000O0), "Transform 1");
    }

    public C8278oOo000OO() {
        OooO00o(new C8001oO0oooOo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Panasonic Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19977OooO00o() {
        return f21368OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public C7919oO0o0O[] OooO0O0() {
        byte[] OooO00o2 = m19651OooO00o(97);
        if (OooO00o2 == null) {
            return null;
        }
        oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o2);
        oo0oo0.OooO00o(false);
        try {
            int OooO0OO2 = oo0oo0.OooO0OO(0);
            if (OooO0OO2 == 0) {
                return null;
            }
            C7919oO0o0O[] oo0o0oArr = new C7919oO0o0O[OooO0OO2];
            for (int i = 0; i < OooO0OO2; i++) {
                int i2 = (i * 44) + 4;
                oo0o0oArr[i] = new C7919oO0o0O(oo0oo0.OooO0OO(i2 + 20), oo0oo0.OooO0OO(i2 + 22), oo0oo0.OooO0OO(i2 + 24), oo0oo0.OooO0OO(i2 + 26), oo0oo0.OooO00o(i2, 20, "ASCII").trim(), C7920oO0o0O0.OooO00o(oo0oo0.OooO00o(i2 + 28, 20, "ASCII").trim()));
            }
            return oo0o0oArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7919oO0o0O[] m19978OooO00o() {
        byte[] OooO00o2 = m19651OooO00o(78);
        if (OooO00o2 == null) {
            return null;
        }
        oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o2);
        oo0oo0.OooO00o(false);
        try {
            int OooO0OO2 = oo0oo0.OooO0OO(0);
            if (OooO0OO2 == 0) {
                return null;
            }
            C7919oO0o0O[] oo0o0oArr = new C7919oO0o0O[OooO0OO2];
            for (int i = 0; i < OooO0OO2; i++) {
                int i2 = (i * 8) + 2;
                oo0o0oArr[i] = new C7919oO0o0O(oo0oo0.OooO0OO(i2), oo0oo0.OooO0OO(i2 + 2), oo0oo0.OooO0OO(i2 + 4), oo0oo0.OooO0OO(i2 + 6), null, null);
            }
            return oo0o0oArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public C7920oO0o0O0 OooO00o(int i) {
        String OooO0O02 = OooO0O0(i);
        if (OooO0O02 == null) {
            return null;
        }
        return C7920oO0o0O0.OooO00o(OooO0O02);
    }
}
