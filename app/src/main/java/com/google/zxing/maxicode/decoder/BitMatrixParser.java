package com.google.zxing.maxicode.decoder;

import android.support.p000v4.media.session.MediaSessionCompat;
import anet.channel.util.HttpConstant;
import com.baidu.idl.face.platform.utils.FileUtils;
import com.facebook.imageutils.JfifUtil;
import com.google.zxing.common.BitMatrix;
import com.p118pd.sdk.AbstractC9366ILlIL;
import com.p118pd.sdk.C7531o0Oooo0o;
import com.p118pd.sdk.C7637o0oOo0OO;
import com.p118pd.sdk.C7967oO0oOo00;
import com.p118pd.sdk.C7982oO0oo00O;
import com.p118pd.sdk.C7988oO0oo0o;
import com.p118pd.sdk.C7992oO0ooO0;
import com.p118pd.sdk.C7995oO0ooO0o;
import com.p118pd.sdk.C7997oO0ooOO0;
import com.p118pd.sdk.C8025oOO00oOO;
import com.p118pd.sdk.C8114oOOOO;
import com.p118pd.sdk.C8303oOo00oo0;
import com.p118pd.sdk.C8713oo0o0o;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;
import com.p118pd.sdk.Lillilli;
import com.p118pd.sdk.iI1iII;
import com.p118pd.sdk.oO0oO000;
import com.p118pd.sdk.oOO000OO;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.common.Constants;
import com.taobao.accs.flowcontrol.FlowControl;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.socialize.bean.HandlerRequestCode;
import exocr.idcard.CameraManager;

public final class BitMatrixParser {
    public static final int[][] BITNR = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, 174, 181, 180, 187, Lillilli.OoooOoo, Lillilli.Oooooo, 192, 199, 198, -2, -2}, new int[]{TinkerReport.KEY_APPLIED_DEXOPT_FORMAT, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, Lillilli.Ooooooo, Lillilli.OoooooO, 201, 200, C7982oO0oo00O.OooOOO, -3}, new int[]{C7531o0Oooo0o.OooO0O0, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, Lillilli.OooooOo, Lillilli.OooooOO, Lillilli.ooOO, Lillilli.o0OoOo0, 203, 202, C7982oO0oo00O.OooOOOo, C7982oO0oo00O.OooOOOO}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_DEX, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, JfifUtil.MARKER_SOI, AbstractC9366ILlIL.OooO00o, 210, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 204, C7982oO0oo00O.OooOOo0, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, C7637o0oOo0OO.OooO0o, 248, 243, 242, 237, 236, 231, 230, 225, C7967oO0oOo00.Ooooo0o, 219, 218, 213, 212, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 206, 821, 820}, new int[]{C7995oO0ooO0o.OooOooo, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 250, 245, 244, 239, 238, 233, 232, 227, 226, 221, LayoutInflater$Factory2C7167o00o0o.o0ooOoO, JfifUtil.MARKER_RST7, 214, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, oO0oO000.Oooo0O0, oO0oO000.Oooo0, oO0oO000.Oooo0oO, oO0oO000.Oooo0o, 331, 330, 337, C8025oOO00oOO.OooOO0, 343, oO0oO000.Oooo, 349, 348, TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL, TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND, iI1iII.OooOo0O, 360, 367, 366, 824, 823}, new int[]{291, C8303oOo00oo0.OooO0o, oO0oO000.OooOoo0, 296, 303, 302, TinkerReport.KEY_LOADED_INFO_CORRUPTED, 308, 315, 314, 321, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, 327, C8025oOO00oOO.OooO, iI1iII.OooOoO0, 332, 339, 338, 345, 344, TinkerReport.KEY_LOADED_PACKAGE_CHECK_DEX_META, TinkerReport.KEY_LOADED_PACKAGE_CHECK_SIGNATURE, TinkerReport.KEY_LOADED_PACKAGE_CHECK_RES_META, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, C8303oOo00oo0.OooO0oo, 299, 298, 305, 304, 311, 310, oO0oO000.Oooo00o, 316, oO0oO000.Oooo0o0, oO0oO000.Oooo0OO, 329, 328, 335, 334, 341, 340, oO0oO000.OoooO00, C8025oOO00oOO.OooOO0O, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META, 359, TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT, 365, 364, 371, 370, 827, 826}, new int[]{409, 408, TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS, TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, C8025oOO00oOO.OooOOO, 373, 372, 828, -3}, new int[]{411, 410, C8713oo0o0o.OooO0o, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, C8025oOO00oOO.OooOOO0, 831, -3}, new int[]{415, 414, FlowControl.STATUS_FLOW_CTRL_CUR, FlowControl.STATUS_FLOW_CTRL_ALL, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, C7982oO0oo00O.OooOOo}, new int[]{417, HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE, 423, FlowControl.STATUS_FLOW_CTRL_BRUSH, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{AntiBrush.STATUS_BRUSH, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, C8114oOOOO.OooO0O0, 436, Constants.PORT, 442, 449, FileUtils.S_IRWXU, 836, 835}, new int[]{481, CameraManager.OooO0O0, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, TinkerReport.KEY_LOADED_INTERPRET_INTERPRET_COMMAND_ERROR, TinkerReport.KEY_LOADED_INTERPRET_GET_INSTRUCTION_SET_ERROR, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, C8713oo0o0o.OooOO0O, C8713oo0o0o.OooOO0, 511, 510, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, C8713oo0o0o.OooO0oO, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, C8713oo0o0o.OooO, C8713oo0o0o.OooO0oo, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, C8025oOO00oOO.Oooo00O, 547, 546, oOO000OO.OooOo00, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, oOO000OO.OooOOOo, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, C8025oOO00oOO.Oooo00o, 549, oOO000OO.OooOo, oOO000OO.OooOo0O, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, oOO000OO.OooOOo0, 531, 530, C7997oO0ooOO0.OooOoO0, 524, 848, 847}, new int[]{563, C8025oOO00oOO.Oooo0OO, C8025oOO00oOO.Oooo0, 556, 551, C8025oOO00oOO.Oooo000, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, C8025oOO00oOO.OooOoOO, 533, 532, 527, oOO000OO.OooOO0, 849, -3}, new int[]{565, 564, 571, 570, C8025oOO00oOO.Oooo, 576, 583, C8025oOO00oOO.OoooO00, 589, 588, 595, 594, 601, 600, C8025oOO00oOO.OoooOOO, 606, C8025oOO00oOO.OoooOo0, C8025oOO00oOO.OoooOOo, 619, 618, 625, 624, 631, C8025oOO00oOO.OooooOO, C8025oOO00oOO.OoooooO, 636, C8025oOO00oOO.o0OoOo0, C8025oOO00oOO.Ooooooo, 851, 850}, new int[]{C8025oOO00oOO.Oooo0o0, 566, 573, C8025oOO00oOO.Oooo0o, 579, 578, 585, 584, 591, 590, C8025oOO00oOO.OoooO, 596, 603, C8025oOO00oOO.OoooOO0, 609, 608, C8025oOO00oOO.OoooOoO, 614, 621, 620, C8025oOO00oOO.Ooooo0o, 626, C8025oOO00oOO.Oooooo0, C8025oOO00oOO.OooooOo, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, C8025oOO00oOO.Oooo0oo, C8025oOO00oOO.Oooo0oO, 581, 580, C8025oOO00oOO.OoooO0, 586, 593, C8025oOO00oOO.OoooO0O, 599, 598, 605, C8025oOO00oOO.o000oOoO, 611, 610, C8025oOO00oOO.OoooOoo, 616, 623, C8025oOO00oOO.Ooooo00, 629, C8025oOO00oOO.OooooO0, 635, C8025oOO00oOO.Oooooo, 641, C7997oO0ooOO0.OooOoO, C8025oOO00oOO.ooOO, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, C8025oOO00oOO.o0Oo0oo, 709, 708, 703, 702, C8025oOO00oOO.o00oO0o, C8025oOO00oOO.oo000o, 691, 690, 685, 684, 679, 678, 673, 672, 667, C8025oOO00oOO.o00ooo, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, C8025oOO00oOO.o0ooOO0, C8025oOO00oOO.o00oO0O, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, C8025oOO00oOO.o00Oo0, C8025oOO00oOO.o00O0O, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, C8025oOO00oOO.o0OOO0o, C8025oOO00oOO.o0ooOoO, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, C8025oOO00oOO.o00o0O, C8025oOO00oOO.o00Ooo, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, C7988oO0oo0o.OooOOo0, 774, 781, 780, C7982oO0oo00O.OooO0oo, C7982oO0oo00O.OooO0oO, 793, 792, 799, 798, 805, C7982oO0oo00O.OooOOO0, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, HandlerRequestCode.SINA_SHARE_REQUEST_CODE, 764, 771, 770, 777, C7992oO0ooO0.OooOO0O, 783, 782, 789, 788, 795, 794, C7982oO0oo00O.OooOO0, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, C7982oO0oo00O.OooOO0o, C7982oO0oo00O.OooOO0O, 809, C7992oO0ooO0.OooOO0o, 815, 814, 863, 862}};
    public final BitMatrix bitMatrix;

    public BitMatrixParser(BitMatrix bitMatrix2) {
        this.bitMatrix = bitMatrix2;
    }

    public byte[] readCodewords() {
        byte[] bArr = new byte[144];
        int height = this.bitMatrix.getHeight();
        int width = this.bitMatrix.getWidth();
        for (int i = 0; i < height; i++) {
            int[] iArr = BITNR[i];
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0 && this.bitMatrix.get(i2, i)) {
                    int i4 = i3 / 6;
                    bArr[i4] = (byte) (((byte) (1 << (5 - (i3 % 6)))) | bArr[i4]);
                }
            }
        }
        return bArr;
    }
}
