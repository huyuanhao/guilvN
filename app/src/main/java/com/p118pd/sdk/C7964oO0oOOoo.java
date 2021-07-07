package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.C7967oO0oOo00;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.android.agoo.message.MessageService;

/* renamed from: com.pd.sdk.oO0oOOoo  reason: case insensitive filesystem */
public class C7964oO0oOOoo extends C7929oO0o0OoO<C7967oO0oOo00> {
    public static final HashMap<Integer, String> OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO00o = hashMap;
        hashMap.put(1, "Canon EF 50mm f/1.8");
        OooO00o.put(2, "Canon EF 28mm f/2.8");
        OooO00o.put(3, "Canon EF 135mm f/2.8 Soft");
        OooO00o.put(4, "Canon EF 35-105mm f/3.5-4.5 or Sigma Lens");
        OooO00o.put(5, "Canon EF 35-70mm f/3.5-4.5");
        OooO00o.put(6, "Canon EF 28-70mm f/3.5-4.5 or Sigma or Tokina Lens");
        OooO00o.put(7, "Canon EF 100-300mm f/5.6L");
        OooO00o.put(8, "Canon EF 100-300mm f/5.6 or Sigma or Tokina Lens");
        OooO00o.put(9, "Canon EF 70-210mm f/4");
        OooO00o.put(10, "Canon EF 50mm f/2.5 Macro or Sigma Lens");
        OooO00o.put(11, "Canon EF 35mm f/2");
        OooO00o.put(13, "Canon EF 15mm f/2.8 Fisheye");
        OooO00o.put(14, "Canon EF 50-200mm f/3.5-4.5L");
        OooO00o.put(15, "Canon EF 50-200mm f/3.5-4.5");
        OooO00o.put(16, "Canon EF 35-135mm f/3.5-4.5");
        OooO00o.put(17, "Canon EF 35-70mm f/3.5-4.5A");
        OooO00o.put(18, "Canon EF 28-70mm f/3.5-4.5");
        OooO00o.put(20, "Canon EF 100-200mm f/4.5A");
        OooO00o.put(21, "Canon EF 80-200mm f/2.8L");
        OooO00o.put(22, "Canon EF 20-35mm f/2.8L or Tokina Lens");
        OooO00o.put(23, "Canon EF 35-105mm f/3.5-4.5");
        OooO00o.put(24, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        OooO00o.put(25, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        OooO00o.put(26, "Canon EF 100mm f/2.8 Macro or Other Lens");
        OooO00o.put(27, "Canon EF 35-80mm f/4-5.6");
        OooO00o.put(28, "Canon EF 80-200mm f/4.5-5.6 or Tamron Lens");
        OooO00o.put(29, "Canon EF 50mm f/1.8 II");
        OooO00o.put(30, "Canon EF 35-105mm f/4.5-5.6");
        OooO00o.put(31, "Canon EF 75-300mm f/4-5.6 or Tamron Lens");
        OooO00o.put(32, "Canon EF 24mm f/2.8 or Sigma Lens");
        OooO00o.put(33, "Voigtlander or Carl Zeiss Lens");
        OooO00o.put(35, "Canon EF 35-80mm f/4-5.6");
        OooO00o.put(36, "Canon EF 38-76mm f/4.5-5.6");
        OooO00o.put(37, "Canon EF 35-80mm f/4-5.6 or Tamron Lens");
        OooO00o.put(38, "Canon EF 80-200mm f/4.5-5.6");
        OooO00o.put(39, "Canon EF 75-300mm f/4-5.6");
        OooO00o.put(40, "Canon EF 28-80mm f/3.5-5.6");
        OooO00o.put(41, "Canon EF 28-90mm f/4-5.6");
        OooO00o.put(42, "Canon EF 28-200mm f/3.5-5.6 or Tamron Lens");
        OooO00o.put(43, "Canon EF 28-105mm f/4-5.6");
        OooO00o.put(44, "Canon EF 90-300mm f/4.5-5.6");
        OooO00o.put(45, "Canon EF-S 18-55mm f/3.5-5.6 [II]");
        OooO00o.put(46, "Canon EF 28-90mm f/4-5.6");
        OooO00o.put(47, "Zeiss Milvus 35mm f/2 or 50mm f/2");
        OooO00o.put(48, "Canon EF-S 18-55mm f/3.5-5.6 IS");
        OooO00o.put(49, "Canon EF-S 55-250mm f/4-5.6 IS");
        OooO00o.put(50, "Canon EF-S 18-200mm f/3.5-5.6 IS");
        OooO00o.put(51, "Canon EF-S 18-135mm f/3.5-5.6 IS");
        OooO00o.put(52, "Canon EF-S 18-55mm f/3.5-5.6 IS II");
        OooO00o.put(53, "Canon EF-S 18-55mm f/3.5-5.6 III");
        OooO00o.put(54, "Canon EF-S 55-250mm f/4-5.6 IS II");
        OooO00o.put(94, "Canon TS-E 17mm f/4L");
        OooO00o.put(95, "Canon TS-E 24.0mm f/3.5 L II");
        OooO00o.put(124, "Canon MP-E 65mm f/2.8 1-5x Macro Photo");
        OooO00o.put(Integer.valueOf((int) C7531o0Oooo0o.OooO0O0), "Canon TS-E 24mm f/3.5L");
        OooO00o.put(126, "Canon TS-E 45mm f/2.8");
        OooO00o.put(127, "Canon TS-E 90mm f/2.8");
        OooO00o.put(129, "Canon EF 300mm f/2.8L");
        OooO00o.put(130, "Canon EF 50mm f/1.0L");
        OooO00o.put(131, "Canon EF 28-80mm f/2.8-4L or Sigma Lens");
        OooO00o.put(132, "Canon EF 1200mm f/5.6L");
        OooO00o.put(134, "Canon EF 600mm f/4L IS");
        OooO00o.put(135, "Canon EF 200mm f/1.8L");
        OooO00o.put(136, "Canon EF 300mm f/2.8L");
        OooO00o.put(137, "Canon EF 85mm f/1.2L or Sigma or Tamron Lens");
        OooO00o.put(138, "Canon EF 28-80mm f/2.8-4L");
        OooO00o.put(139, "Canon EF 400mm f/2.8L");
        OooO00o.put(140, "Canon EF 500mm f/4.5L");
        OooO00o.put(141, "Canon EF 500mm f/4.5L");
        OooO00o.put(142, "Canon EF 300mm f/2.8L IS");
        OooO00o.put(143, "Canon EF 500mm f/4L IS or Sigma Lens");
        OooO00o.put(144, "Canon EF 35-135mm f/4-5.6 USM");
        OooO00o.put(145, "Canon EF 100-300mm f/4.5-5.6 USM");
        OooO00o.put(146, "Canon EF 70-210mm f/3.5-4.5 USM");
        OooO00o.put(147, "Canon EF 35-135mm f/4-5.6 USM");
        OooO00o.put(148, "Canon EF 28-80mm f/3.5-5.6 USM");
        OooO00o.put(149, "Canon EF 100mm f/2 USM");
        OooO00o.put(150, "Canon EF 14mm f/2.8L or Sigma Lens");
        OooO00o.put(151, "Canon EF 200mm f/2.8L");
        OooO00o.put(152, "Canon EF 300mm f/4L IS or Sigma Lens");
        OooO00o.put(153, "Canon EF 35-350mm f/3.5-5.6L or Sigma or Tamron Lens");
        OooO00o.put(154, "Canon EF 20mm f/2.8 USM or Zeiss Lens");
        OooO00o.put(155, "Canon EF 85mm f/1.8 USM");
        OooO00o.put(156, "Canon EF 28-105mm f/3.5-4.5 USM or Tamron Lens");
        OooO00o.put(160, "Canon EF 20-35mm f/3.5-4.5 USM or Tamron or Tokina Lens");
        OooO00o.put(161, "Canon EF 28-70mm f/2.8L or Sigma or Tamron Lens");
        OooO00o.put(162, "Canon EF 200mm f/2.8L");
        OooO00o.put(163, "Canon EF 300mm f/4L");
        OooO00o.put(164, "Canon EF 400mm f/5.6L");
        OooO00o.put(165, "Canon EF 70-200mm f/2.8 L");
        OooO00o.put(166, "Canon EF 70-200mm f/2.8 L + 1.4x");
        OooO00o.put(167, "Canon EF 70-200mm f/2.8 L + 2x");
        OooO00o.put(168, "Canon EF 28mm f/1.8 USM or Sigma Lens");
        OooO00o.put(169, "Canon EF 17-35mm f/2.8L or Sigma Lens");
        OooO00o.put(170, "Canon EF 200mm f/2.8L II");
        OooO00o.put(171, "Canon EF 300mm f/4L");
        OooO00o.put(172, "Canon EF 400mm f/5.6L or Sigma Lens");
        OooO00o.put(173, "Canon EF 180mm Macro f/3.5L or Sigma Lens");
        OooO00o.put(174, "Canon EF 135mm f/2L or Other Lens");
        OooO00o.put(175, "Canon EF 400mm f/2.8L");
        OooO00o.put(176, "Canon EF 24-85mm f/3.5-4.5 USM");
        OooO00o.put(177, "Canon EF 300mm f/4L IS");
        OooO00o.put(178, "Canon EF 28-135mm f/3.5-5.6 IS");
        OooO00o.put(179, "Canon EF 24mm f/1.4L");
        OooO00o.put(180, "Canon EF 35mm f/1.4L or Other Lens");
        OooO00o.put(181, "Canon EF 100-400mm f/4.5-5.6L IS + 1.4x or Sigma Lens");
        OooO00o.put(182, "Canon EF 100-400mm f/4.5-5.6L IS + 2x or Sigma Lens");
        OooO00o.put(183, "Canon EF 100-400mm f/4.5-5.6L IS or Sigma Lens");
        OooO00o.put(184, "Canon EF 400mm f/2.8L + 2x");
        OooO00o.put(185, "Canon EF 600mm f/4L IS");
        OooO00o.put(Integer.valueOf((int) Lillilli.OoooOoo), "Canon EF 70-200mm f/4L");
        OooO00o.put(187, "Canon EF 70-200mm f/4L + 1.4x");
        OooO00o.put(188, "Canon EF 70-200mm f/4L + 2x");
        OooO00o.put(189, "Canon EF 70-200mm f/4L + 2.8x");
        OooO00o.put(Integer.valueOf((int) Lillilli.OooooOO), "Canon EF 100mm f/2.8 Macro USM");
        OooO00o.put(Integer.valueOf((int) Lillilli.OooooOo), "Canon EF 400mm f/4 DO IS");
        OooO00o.put(Integer.valueOf((int) Lillilli.Oooooo), "Canon EF 35-80mm f/4-5.6 USM");
        OooO00o.put(Integer.valueOf((int) Lillilli.OoooooO), "Canon EF 80-200mm f/4.5-5.6 USM");
        OooO00o.put(Integer.valueOf((int) Lillilli.Ooooooo), "Canon EF 35-105mm f/4.5-5.6 USM");
        OooO00o.put(Integer.valueOf((int) Lillilli.o0OoOo0), "Canon EF 75-300mm f/4-5.6 USM");
        OooO00o.put(Integer.valueOf((int) Lillilli.ooOO), "Canon EF 75-300mm f/4-5.6 IS USM");
        OooO00o.put(198, "Canon EF 50mm f/1.4 USM or Zeiss Lens");
        OooO00o.put(199, "Canon EF 28-80mm f/3.5-5.6 USM");
        OooO00o.put(200, "Canon EF 75-300mm f/4-5.6 USM");
        OooO00o.put(201, "Canon EF 28-80mm f/3.5-5.6 USM");
        OooO00o.put(202, "Canon EF 28-80mm f/3.5-5.6 USM IV");
        OooO00o.put(208, "Canon EF 22-55mm f/4-5.6 USM");
        OooO00o.put(Integer.valueOf((int) TinkerReport.KEY_APPLIED_FAIL_COST_OTHER), "Canon EF 55-200mm f/4.5-5.6");
        OooO00o.put(210, "Canon EF 28-90mm f/4-5.6 USM");
        OooO00o.put(Integer.valueOf((int) AbstractC9366ILlIL.OooO00o), "Canon EF 28-200mm f/3.5-5.6 USM");
        OooO00o.put(212, "Canon EF 28-105mm f/4-5.6 USM");
        OooO00o.put(213, "Canon EF 90-300mm f/4.5-5.6 USM or Tamron Lens");
        OooO00o.put(214, "Canon EF-S 18-55mm f/3.5-5.6 USM");
        OooO00o.put(Integer.valueOf((int) JfifUtil.MARKER_RST7), "Canon EF 55-200mm f/4.5-5.6 II USM");
        OooO00o.put(217, "Tamron AF 18-270mm f/3.5-6.3 Di II VC PZD");
        OooO00o.put(Integer.valueOf((int) C7967oO0oOo00.Ooooo0o), "Canon EF 70-200mm f/2.8L IS");
        OooO00o.put(225, "Canon EF 70-200mm f/2.8L IS + 1.4x");
        OooO00o.put(226, "Canon EF 70-200mm f/2.8L IS + 2x");
        OooO00o.put(227, "Canon EF 70-200mm f/2.8L IS + 2.8x");
        OooO00o.put(228, "Canon EF 28-105mm f/3.5-4.5 USM");
        OooO00o.put(229, "Canon EF 16-35mm f/2.8L");
        OooO00o.put(230, "Canon EF 24-70mm f/2.8L");
        OooO00o.put(231, "Canon EF 17-40mm f/4L");
        OooO00o.put(232, "Canon EF 70-300mm f/4.5-5.6 DO IS USM");
        OooO00o.put(233, "Canon EF 28-300mm f/3.5-5.6L IS");
        OooO00o.put(234, "Canon EF-S 17-85mm f/4-5.6 IS USM or Tokina Lens");
        OooO00o.put(235, "Canon EF-S 10-22mm f/3.5-4.5 USM");
        OooO00o.put(236, "Canon EF-S 60mm f/2.8 Macro USM");
        OooO00o.put(237, "Canon EF 24-105mm f/4L IS");
        OooO00o.put(238, "Canon EF 70-300mm f/4-5.6 IS USM");
        OooO00o.put(239, "Canon EF 85mm f/1.2L II");
        OooO00o.put(240, "Canon EF-S 17-55mm f/2.8 IS USM");
        OooO00o.put(241, "Canon EF 50mm f/1.2L");
        OooO00o.put(242, "Canon EF 70-200mm f/4L IS");
        OooO00o.put(243, "Canon EF 70-200mm f/4L IS + 1.4x");
        OooO00o.put(244, "Canon EF 70-200mm f/4L IS + 2x");
        OooO00o.put(245, "Canon EF 70-200mm f/4L IS + 2.8x");
        OooO00o.put(246, "Canon EF 16-35mm f/2.8L II");
        OooO00o.put(247, "Canon EF 14mm f/2.8L II USM");
        OooO00o.put(248, "Canon EF 200mm f/2L IS or Sigma Lens");
        OooO00o.put(Integer.valueOf((int) C7637o0oOo0OO.OooO0o), "Canon EF 800mm f/5.6L IS");
        OooO00o.put(250, "Canon EF 24mm f/1.4L II or Sigma Lens");
        OooO00o.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION), "Canon EF 70-200mm f/2.8L IS II USM");
        OooO00o.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_EXCEPTION_DEX), "Canon EF 70-200mm f/2.8L IS II USM + 1.4x");
        OooO00o.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK), "Canon EF 70-200mm f/2.8L IS II USM + 2x");
        OooO00o.put(254, "Canon EF 100mm f/2.8L Macro IS USM");
        OooO00o.put(255, "Sigma 24-105mm f/4 DG OS HSM | A or Other Sigma Lens");
        OooO00o.put(488, "Canon EF-S 15-85mm f/3.5-5.6 IS USM");
        OooO00o.put(489, "Canon EF 70-300mm f/4-5.6L IS USM");
        OooO00o.put(490, "Canon EF 8-15mm f/4L Fisheye USM");
        OooO00o.put(491, "Canon EF 300mm f/2.8L IS II USM");
        OooO00o.put(492, "Canon EF 400mm f/2.8L IS II USM");
        OooO00o.put(493, "Canon EF 500mm f/4L IS II USM or EF 24-105mm f4L IS USM");
        OooO00o.put(494, "Canon EF 600mm f/4.0L IS II USM");
        OooO00o.put(495, "Canon EF 24-70mm f/2.8L II USM");
        OooO00o.put(496, "Canon EF 200-400mm f/4L IS USM");
        OooO00o.put(499, "Canon EF 200-400mm f/4L IS USM + 1.4x");
        OooO00o.put(Integer.valueOf((int) C8713oo0o0o.OooO0oo), "Canon EF 28mm f/2.8 IS USM");
        OooO00o.put(Integer.valueOf((int) C8713oo0o0o.OooO), "Canon EF 24mm f/2.8 IS USM");
        OooO00o.put(Integer.valueOf((int) C8713oo0o0o.OooOO0), "Canon EF 24-70mm f/4L IS USM");
        OooO00o.put(Integer.valueOf((int) C8713oo0o0o.OooOO0O), "Canon EF 35mm f/2 IS USM");
        OooO00o.put(506, "Canon EF 400mm f/4 DO IS II USM");
        OooO00o.put(507, "Canon EF 16-35mm f/4L IS USM");
        OooO00o.put(508, "Canon EF 11-24mm f/4L USM");
        OooO00o.put(747, "Canon EF 100-400mm f/4.5-5.6L IS II USM");
        OooO00o.put(750, "Canon EF 35mm f/1.4L II USM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o000000O), "Canon EF-S 18-135mm f/3.5-5.6 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o000000o), "Canon EF-M 18-55mm f/3.5-5.6 IS STM or Tamron Lens");
        OooO00o.put(4144, "Canon EF 40mm f/2.8 STM");
        OooO00o.put(4145, "Canon EF-M 22mm f/2 STM");
        OooO00o.put(4146, "Canon EF-S 18-55mm f/3.5-5.6 IS STM");
        OooO00o.put(4147, "Canon EF-M 11-22mm f/4-5.6 IS STM");
        OooO00o.put(4148, "Canon EF-S 55-250mm f/4-5.6 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o00000Oo), "Canon EF-M 55-200mm f/4.5-6.3 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o00000o0), "Canon EF-S 10-18mm f/4.5-5.6 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o00000oO), "Canon EF 24-105mm f/3.5-5.6 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o00000oo), "Canon EF-M 15-45mm f/3.5-6.3 IS STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o0000), "Canon EF-S 24mm f/2.8 STM");
        OooO00o.put(Integer.valueOf((int) C7997oO0ooOO0.o0000oo), "Canon EF 50mm f/1.8 STM");
        OooO00o.put(36912, "Canon EF-S 18-135mm f/3.5-5.6 IS USM");
        OooO00o.put(65535, "N/A");
    }

    public C7964oO0oOOoo(@NotNull C7967oO0oOo00 oo0ooo00) {
        super(oo0ooo00);
    }

    @Nullable
    public String OooO() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOO0o, "Full auto", "Manual", "Landscape", "Fast shutter", "Slow shutter", "Night", "B&W", "Sepia", "Portrait", "Sports", "Macro / Closeup", "Pan focus");
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(C7967oO0oOo00.OooO0O0.Oooo000, 0, "Normal AE", "Exposure Compensation", "AE Lock", "AE Lock + Exposure Comp.", "No AE");
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOo00, 12288, "None (MF)", "Auto selected", "Right", "Centre", "Left");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 12:
                return Oooo0();
            case C7967oO0oOo00.OooO0O0.OooO0oo /*{ENCODED_INT: 49415}*/:
                return OooOOo0();
            case C7967oO0oOo00.OooO0O0.Oooo0oO /*{ENCODED_INT: 49449}*/:
                return OooO0Oo();
            case C7967oO0oOo00.OooO0O0.Oooo0oo /*{ENCODED_INT: 49453}*/:
                return Oooo000();
            case C7967oO0oOo00.OooO0OO.OooO0O0 /*{ENCODED_INT: 49671}*/:
                return Oooo0oO();
            case C7967oO0oOo00.OooO00o.OooOO0o /*{ENCODED_INT: 53770}*/:
                return Oooo0o();
            default:
                switch (i) {
                    case C7967oO0oOo00.OooO0O0.OooO0O0 /*{ENCODED_INT: 49409}*/:
                        return OooOo();
                    case C7967oO0oOo00.OooO0O0.OooO0OO /*{ENCODED_INT: 49410}*/:
                        return Oooo00o();
                    case C7967oO0oOo00.OooO0O0.OooO0Oo /*{ENCODED_INT: 49411}*/:
                        return OooOooO();
                    case C7967oO0oOo00.OooO0O0.OooO0o0 /*{ENCODED_INT: 49412}*/:
                        return OooOOO();
                    case C7967oO0oOo00.OooO0O0.OooO0o /*{ENCODED_INT: 49413}*/:
                        return OooO0o0();
                    default:
                        switch (i) {
                            case C7967oO0oOo00.OooO0O0.OooOO0 /*{ENCODED_INT: 49417}*/:
                                return OooOooo();
                            case C7967oO0oOo00.OooO0O0.OooOO0O /*{ENCODED_INT: 49418}*/:
                                return OooOo00();
                            case C7967oO0oOo00.OooO0O0.OooOO0o /*{ENCODED_INT: 49419}*/:
                                return OooO();
                            case C7967oO0oOo00.OooO0O0.OooOOO0 /*{ENCODED_INT: 49420}*/:
                                return OooO0oO();
                            case C7967oO0oOo00.OooO0O0.OooOOO /*{ENCODED_INT: 49421}*/:
                                return OooO0o();
                            case C7967oO0oOo00.OooO0O0.OooOOOO /*{ENCODED_INT: 49422}*/:
                                return Oooo00O();
                            case C7967oO0oOo00.OooO0O0.OooOOOo /*{ENCODED_INT: 49423}*/:
                                return Oooo0O0();
                            case C7967oO0oOo00.OooO0O0.OooOOo0 /*{ENCODED_INT: 49424}*/:
                                return OooOo0();
                            case C7967oO0oOo00.OooO0O0.OooOOo /*{ENCODED_INT: 49425}*/:
                                return OooOoOO();
                            case C7967oO0oOo00.OooO0O0.OooOOoo /*{ENCODED_INT: 49426}*/:
                                return OooOOoo();
                            case C7967oO0oOo00.OooO0O0.OooOo00 /*{ENCODED_INT: 49427}*/:
                                return OooO0O0();
                            case C7967oO0oOo00.OooO0O0.OooOo0 /*{ENCODED_INT: 49428}*/:
                                return OooOO0();
                            default:
                                switch (i) {
                                    case C7967oO0oOo00.OooO0O0.OooOo0o /*{ENCODED_INT: 49430}*/:
                                        return OooOo0O();
                                    case C7967oO0oOo00.OooO0O0.OooOo /*{ENCODED_INT: 49431}*/:
                                        return OooOo0o();
                                    case C7967oO0oOo00.OooO0O0.OooOoO0 /*{ENCODED_INT: 49432}*/:
                                        return Oooo0OO();
                                    case C7967oO0oOo00.OooO0O0.OooOoO /*{ENCODED_INT: 49433}*/:
                                        return OooOOOO();
                                    case C7967oO0oOo00.OooO0O0.OooOoOO /*{ENCODED_INT: 49434}*/:
                                        return OooOoO();
                                    case C7967oO0oOo00.OooO0O0.OooOoo0 /*{ENCODED_INT: 49435}*/:
                                        return OooOoo0();
                                    case C7967oO0oOo00.OooO0O0.OooOoo /*{ENCODED_INT: 49436}*/:
                                        return OooOO0O();
                                    case C7967oO0oOo00.OooO0O0.OooOooO /*{ENCODED_INT: 49437}*/:
                                        return OooOOO0();
                                    case C7967oO0oOo00.OooO0O0.OooOooo /*{ENCODED_INT: 49438}*/:
                                        return OooOOOo();
                                    case C7967oO0oOo00.OooO0O0.Oooo000 /*{ENCODED_INT: 49439}*/:
                                        return OooO00o();
                                    case C7967oO0oOo00.OooO0O0.Oooo00O /*{ENCODED_INT: 49440}*/:
                                        return OooOOo();
                                    case C7967oO0oOo00.OooO0O0.Oooo00o /*{ENCODED_INT: 49441}*/:
                                        return OooO0oo();
                                    default:
                                        switch (i) {
                                            case C7967oO0oOo00.OooO0O0.Oooo0OO /*{ENCODED_INT: 49445}*/:
                                                return Oooo0o0();
                                            case C7967oO0oOo00.OooO0O0.Oooo0o0 /*{ENCODED_INT: 49446}*/:
                                                return OooOoo();
                                            case C7967oO0oOo00.OooO0O0.Oooo0o /*{ENCODED_INT: 49447}*/:
                                                return OooOoO0();
                                            default:
                                                switch (i) {
                                                    case C7967oO0oOo00.OooO0OO.OooO0Oo /*{ENCODED_INT: 49678}*/:
                                                        return OooO0OO();
                                                    case C7967oO0oOo00.OooO0OO.OooO0o0 /*{ENCODED_INT: 49679}*/:
                                                        return OooOO0o();
                                                    default:
                                                        return super.OooO0OO(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.Oooo0oO);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.intValue() == 32767 ? "n/a" : OooO00o2.toString();
    }

    @Nullable
    public String OooO0o() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOOO);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooO0o);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            Integer OooO00o3 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooO0OO);
            if (OooO00o3 != null) {
                return OooO00o3.intValue() == 0 ? "Single shot" : "Single shot with self-timer";
            }
            return "Continuous";
        } else if (intValue == 1) {
            return "Continuous";
        } else {
            return "Unknown (" + OooO00o2 + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOOO0, "No digital zoom", "2x", "4x");
    }

    @Nullable
    public String OooO0oo() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.Oooo00o);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 65535) {
            return OooO00o2.toString();
        }
        return C7929oO0o0OoO.OooO00o((double) (((float) OooO00o2.intValue()) / 10.0f));
    }

    @Nullable
    public String OooOO0() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOo0, "Easy shooting", "Program", "Tv-priority", "Av-priority", "Manual", "A-DEP");
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOoo, "Flash did not fire", "Flash fired");
    }

    @Nullable
    public String OooOO0o() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0OO.OooO0o0);
        if (OooO00o2 == null) {
            return null;
        }
        boolean z = false;
        if (OooO00o2.intValue() > 61440) {
            OooO00o2 = Integer.valueOf(Integer.valueOf(65535 - OooO00o2.intValue()).intValue() + 1);
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "");
        sb.append(Float.toString(((float) OooO00o2.intValue()) / 32.0f));
        sb.append(" EV");
        return sb.toString();
    }

    @Nullable
    public String OooOOO() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooO0o0);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 16) {
            return "External flash";
        }
        switch (intValue) {
            case 0:
                return "No flash fired";
            case 1:
                return "Auto";
            case 2:
                return "On";
            case 3:
                return "Red-eye reduction";
            case 4:
                return "Slow-synchro";
            case 5:
                return "Auto and red-eye reduction";
            case 6:
                return "On and red-eye reduction";
            default:
                return "Unknown (" + OooO00o2 + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooOOO0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOooO);
        if (OooO00o2 == null) {
            return null;
        }
        if (((OooO00o2.intValue() >> 14) & 1) != 0) {
            return "External E-TTL";
        }
        if (((OooO00o2.intValue() >> 13) & 1) != 0) {
            return "Internal flash";
        }
        if (((OooO00o2.intValue() >> 11) & 1) != 0) {
            return "FP sync used";
        }
        if (((OooO00o2.intValue() >> 4) & 1) != 0) {
            return "FP sync enabled";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooOOOO() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOoO);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.intValue() != 0 ? Integer.toString(OooO00o2.intValue()) : "";
    }

    @Nullable
    public String OooOOOo() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOooo, 0, "Single", "Continuous", null, null, null, null, null, null, "Manual");
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(C7967oO0oOo00.OooO0O0.Oooo00O, "Single", "Continuous");
    }

    @Nullable
    public String OooOOo0() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooO0oo, "One-shot", "AI Servo", "AI Focus", "Manual Focus", "Single", "Continuous", "Manual Focus");
    }

    @Nullable
    public String OooOOoo() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOOoo);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Manual";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 3) {
            return "Close-up (Macro)";
        }
        if (intValue == 8) {
            return "Locked (Pan Mode)";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooOo() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooO0O0, 1, "Macro", ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    @Nullable
    public String OooOo0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOOo0);
        if (OooO00o2 == null) {
            return null;
        }
        if ((OooO00o2.intValue() & 16384) != 0) {
            return "" + (OooO00o2.intValue() & -16385);
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Not specified (see ISOSpeedRatings tag)";
        }
        switch (intValue) {
            case 15:
                return "Auto";
            case 16:
                return "50";
            case 17:
                return MessageService.MSG_DB_COMPLETE;
            case 18:
                return "200";
            case 19:
                return "400";
            default:
                return "Unknown (" + OooO00o2 + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooOo00() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOO0O, "Large", "Medium", "Small");
    }

    @Nullable
    public String OooOo0O() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOo0o);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o.containsKey(OooO00o2)) {
            return OooO00o.get(OooO00o2);
        }
        return String.format("Unknown (%d)", OooO00o2);
    }

    @Nullable
    public String OooOo0o() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOo);
        if (OooO00o2 == null) {
            return null;
        }
        String OooOOOO = OooOOOO();
        return Integer.toString(OooO00o2.intValue()) + " " + OooOOOO;
    }

    @Nullable
    public String OooOoO() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOoOO);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() <= 512) {
            return C7929oO0o0OoO.OooO00o(Math.exp((OooO00o(OooO00o2.intValue()) * Math.log(2.0d)) / 2.0d));
        }
        return String.format("Unknown (%d)", OooO00o2);
    }

    @Nullable
    public String OooOoO0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.Oooo0o);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "n/a";
        }
        if (intValue == 1280) {
            return "Full";
        }
        if (intValue == 1282) {
            return "Medium";
        }
        if (intValue == 1284) {
            return "Low";
        }
        if (intValue == 32767) {
            return "n/a";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooOoOO() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOOo, 3, "Evaluative", "Partial", "Centre weighted");
    }

    @Nullable
    public String OooOoo() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.Oooo0o0);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 100) {
            return "My Color Data";
        }
        switch (intValue) {
            case 0:
                return "Off";
            case 1:
                return "Vivid";
            case 2:
                return "Neutral";
            case 3:
                return "Smooth";
            case 4:
                return "Sepia";
            case 5:
                return "B&W";
            case 6:
                return "Custom";
            default:
                return "Unknown (" + OooO00o2 + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooOoo0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOoo0);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() <= 512) {
            return C7929oO0o0OoO.OooO00o(Math.exp((OooO00o(OooO00o2.intValue()) * Math.log(2.0d)) / 2.0d));
        }
        return String.format("Unknown (%d)", OooO00o2);
    }

    @Nullable
    public String OooOooO() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooO0Oo, 2, ReactProgressBarViewManager.DEFAULT_STYLE, "Fine", null, "Superfine");
    }

    @Nullable
    public String OooOooo() {
        return OooO00o(C7967oO0oOo00.OooO0O0.OooOO0, 1, "JPEG", "CRW+THM", "AVI+THM", "TIF", "TIF+JPEG", "CR2", "CR2+JPEG", null, "MOV", "MP4");
    }

    @Nullable
    public String Oooo0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(12);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format("%04X%05d", Integer.valueOf((OooO00o2.intValue() >> 8) & 255), Integer.valueOf(OooO00o2.intValue() & 255));
    }

    @Nullable
    public String Oooo000() {
        return OooO00o(C7967oO0oOo00.OooO0O0.Oooo0oo, 0, "n/a", "sRAW1 (mRAW)", "sRAW2 (sRAW)");
    }

    @Nullable
    public String Oooo00O() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOOOO);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String Oooo00o() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooO0OO);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 0) {
            return "Self timer not used";
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        StringBuilder sb = new StringBuilder();
        double intValue = (double) OooO00o2.intValue();
        Double.isNaN(intValue);
        sb.append(decimalFormat.format(intValue * 0.1d));
        sb.append(" sec");
        return sb.toString();
    }

    @Nullable
    public String Oooo0O0() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOOOo);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String Oooo0OO() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0O0.OooOoO0);
        if (OooO00o2 == null) {
            return null;
        }
        String OooOOOO = OooOOOO();
        return Integer.toString(OooO00o2.intValue()) + " " + OooOOOO;
    }

    @Nullable
    public String Oooo0o() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO00o.OooOO0o);
        if (OooO00o2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            if ((OooO00o2.intValue() & (1 << i)) != 0) {
                if (sb.length() != 0) {
                    sb.append(AbstractC1299b.COMMA);
                }
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "None" : sb.toString();
    }

    @Nullable
    public String Oooo0o0() {
        return OooO00o(C7967oO0oOo00.OooO0O0.Oooo0OO, 0, "Center", "AF Point");
    }

    @Nullable
    public String Oooo0oO() {
        return OooO00o(C7967oO0oOo00.OooO0OO.OooO0O0, "Auto", "Sunny", "Cloudy", "Tungsten", "Florescent", ExifInterface.f14327oo000o, "Custom");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    private double OooO00o(int i) {
        int i2;
        if (i < 0) {
            i = -i;
            i2 = -1;
        } else {
            i2 = 1;
        }
        int i3 = i & 31;
        int i4 = i - i3;
        if (i3 == 12) {
            i3 = 10;
        } else if (i3 == 20) {
            i3 = 21;
        }
        double d = (double) (i2 * (i4 + i3));
        Double.isNaN(d);
        return d / 32.0d;
    }

    @Nullable
    public String OooO0OO() {
        Integer OooO00o2 = ((C7967oO0oOo00) this.f20998OooO00o).m19639OooO00o(C7967oO0oOo00.OooO0OO.OooO0Oo);
        if (OooO00o2 == null) {
            return null;
        }
        if ((OooO00o2.intValue() & 7) == 0) {
            return "Right";
        }
        if ((OooO00o2.intValue() & 7) == 1) {
            return "Centre";
        }
        if ((OooO00o2.intValue() & 7) == 2) {
            return "Left";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }
}
