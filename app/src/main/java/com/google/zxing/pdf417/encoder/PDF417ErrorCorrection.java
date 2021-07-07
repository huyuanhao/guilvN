package com.google.zxing.pdf417.encoder;

import android.support.p000v4.media.session.MediaSessionCompat;
import com.facebook.imageutils.JfifUtil;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import com.p118pd.sdk.AbstractC9366ILlIL;
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
import com.p118pd.sdk.Lillilli;
import com.p118pd.sdk.iI1iII;
import com.p118pd.sdk.oO0oO000;
import com.p118pd.sdk.oOO000OO;
import com.taobao.accs.flowcontrol.FlowControl;
import com.tencent.bugly.beta.tinker.TinkerReport;

public final class PDF417ErrorCorrection {
    public static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, C8025oOO00oOO.Oooo0OO, 232, 755, 599, 524, C7982oO0oo00O.OooOO0, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{iI1iII.OooOo0O, C8025oOO00oOO.Oooo0oo, DecodedBitStreamParser.MACRO_PDF417_TERMINATOR, C7997oO0ooOO0.OooOoO0, 176, 586, C7997oO0ooOO0.OooOoO, 321, oOO000OO.OooOOo0, 742, 677, 742, 687, 284, Lillilli.Oooooo, 517, 273, 494, 263, 147, 593, 800, 571, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, C7982oO0oo00O.OooOO0o, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, FlowControl.STATUS_FLOW_CTRL_BRUSH, 6, 93, 862, 771, 453, 106, 610, C7995oO0ooO0o.OooOooo, 107, C8713oo0o0o.OooOO0O, 733, 877, 381, C8025oOO00oOO.OoooOOo, 723, 476, 462, 172, 430, 609, 858, 822, oOO000OO.OooOo0O, C8025oOO00oOO.OooOOO0, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, oOO000OO.OooOOOo, 517, TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META, 605, 158, 651, 201, 488, C8713oo0o0o.OooO0oo, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, oOO000OO.OooOo0O}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, C8303oOo00oo0.OooO0oo, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, C8303oOo00oo0.OooO0oo, 272, 96, 684, 432, 686, 606, 860, 569, Lillilli.Oooooo, 219, 129, Lillilli.OoooOoo, 236, C7995oO0ooO0o.OooOooo, 192, C7988oO0oo0o.OooOOo0, 278, 173, 40, 379, C8025oOO00oOO.o0ooOoO, 463, 646, C7992oO0ooO0.OooOO0O, 171, 491, oO0oO000.OooOoo0, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, C7992oO0ooO0.OooOO0o, 898, 784, C8025oOO00oOO.o00Oo0, C8025oOO00oOO.Ooooo0o, C8025oOO00oOO.OooOOO, 382, 262, 380, C8025oOO00oOO.OoooOO0, 754, C8025oOO00oOO.OooOO0, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND, 130, 814, C8025oOO00oOO.OoooO0, C7982oO0oo00O.OooOOO0, 34, AbstractC9366ILlIL.OooO00o, 330, 539, oO0oO000.OooOoo0, 827, 865, 37, 517, 834, 315, C8025oOO00oOO.Oooo000, 86, C7982oO0oo00O.OooOO0, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, C7982oO0oo00O.OooO0oO, 138, 720, 858, Lillilli.OoooooO, 311, 913, 275, Lillilli.OooooOO, 375, 850, 438, 733, Lillilli.OoooooO, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, C7982oO0oo00O.OooOO0, 700, 799, 137, 439, 418, C8025oOO00oOO.OoooO0O, 668, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 859, 370, 694, oO0oO000.Oooo0oO, 240, JfifUtil.MARKER_SOI, 257, 284, 549, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, C8025oOO00oOO.OooOOO0, 849, 521, 307, 291, C7982oO0oo00O.OooOO0o, C8025oOO00oOO.o0ooOoO, 19, TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, C8025oOO00oOO.OoooooO, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, C8025oOO00oOO.OooOoOO, 906, 90, 2, C8303oOo00oo0.OooO0o, 743, 199, 655, 903, 329, 49, C7982oO0oo00O.OooOO0O, 580, TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL, 588, 188, 462, 10, 134, C8025oOO00oOO.OooooO0, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, 479, 130, 739, 71, 263, oO0oO000.Oooo0, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, C8025oOO00oOO.OoooOOO, C7997oO0ooOO0.OooOoO, 455, Lillilli.Oooooo, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, TinkerReport.KEY_LOADED_INFO_CORRUPTED, C8025oOO00oOO.o00oO0o, 755, 756, 60, 231, 773, 434, FlowControl.STATUS_FLOW_CTRL_CUR, 726, 528, C8713oo0o0o.OooO, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, oO0oO000.Oooo0O0, 9, C8025oOO00oOO.ooOO, C8025oOO00oOO.Oooo000, 73, 914, oO0oO000.Oooo, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, oO0oO000.OooOoo0, 134, 54, 834, 299, DecodedBitStreamParser.MACRO_PDF417_TERMINATOR, Lillilli.OooooOo, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS, 41, 656, C8713oo0o0o.OooOO0O, 579, 481, 173, 404, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 688, 95, 497, 555, C8025oOO00oOO.Ooooooo, oOO000OO.OooOo0O, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META, 77, 373, C8713oo0o0o.OooOO0, 35, 599, 428, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 409, C8025oOO00oOO.Oooo0oO, 118, 498, 285, 380, TinkerReport.KEY_LOADED_PACKAGE_CHECK_SIGNATURE, 492, Lillilli.ooOO, 265, 920, 155, 914, 299, 229, C8025oOO00oOO.o0OoOo0, 294, 871, 306, 88, 87, Lillilli.Oooooo, TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META, 781, 846, 75, 327, 520, 435, oOO000OO.OooOo0O, 203, C8025oOO00oOO.o00ooo, C7637o0oOo0OO.OooO0o, C8025oOO00oOO.OooOO0O, 781, 621, C7997oO0ooOO0.OooOoO, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, C8303oOo00oo0.OooO0o, C8025oOO00oOO.OooooOo, 545, 37, 858, 916, C8025oOO00oOO.Oooo00O, 41, 542, 289, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, C8303oOo00oo0.OooO0o, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, oO0oO000.OooOoo0, TinkerReport.KEY_LOADED_INTERPRET_INTERPRET_COMMAND_ERROR, 593, 913, 142, C7992oO0ooO0.OooOO0o, 684, C7995oO0ooO0o.OooOooo, oOO000OO.OooOOo0, 561, 76, 653, 899, 729, C8025oOO00oOO.Oooo0o0, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, Lillilli.OooooOO, 826, 328, 596, C7982oO0oo00O.OooO0oO, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 676, 710, 89, 168, 304, TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS, 40, 708, C8025oOO00oOO.Oooo0oo, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT, 785, 288, TinkerReport.KEY_LOADED_PACKAGE_CHECK_RES_META, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, oOO000OO.OooOo0O, 152, 729, 771, 95, 248, iI1iII.OooOo0O, 578, oO0oO000.Oooo0o0, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK, 167, oO0oO000.Oooo, 244, 173, 35, 463, 651, 51, C8025oOO00oOO.o0ooOO0, 591, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK, 578, 37, 124, 298, 332, C8025oOO00oOO.Oooo00O, 43, 427, 119, C8025oOO00oOO.o00O0O, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, FlowControl.STATUS_FLOW_CTRL_ALL, 245, 288, 594, 394, 511, 327, 589, 777, C8025oOO00oOO.o0ooOO0, 688, 43, 408, 842, 383, 721, 521, 560, 644, C8025oOO00oOO.o0Oo0oo, 559, 62, 145, 873, C8025oOO00oOO.o00Oo0, C8025oOO00oOO.o0OOO0o, 159, 672, 729, 624, 59, Lillilli.Oooooo, 417, 158, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 708, 410, 579, 870, C8025oOO00oOO.OoooOoo, 841, C8025oOO00oOO.OooooOo, 860, 289, oOO000OO.OooOOo0, 35, 777, 618, 586, 424, 833, 77, C8025oOO00oOO.OoooO, C8025oOO00oOO.OooOO0O, 269, 757, C8025oOO00oOO.OooooOo, 695, 751, 331, 247, 184, 45, C7982oO0oo00O.OooO0oo, 680, 18, 66, 407, 369, 54, 492, 228, C8025oOO00oOO.OoooOo0, 830, DecodedBitStreamParser.MACRO_PDF417_TERMINATOR, C8114oOOOO.OooO0O0, 519, 644, 905, 789, FlowControl.STATUS_FLOW_CTRL_ALL, 305, 441, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 300, 892, 827, 141, 537, 381, C8025oOO00oOO.o00O0O, 513, 56, TinkerReport.KEY_LOADED_EXCEPTION_DEX, 341, 242, 797, 838, 837, 720, C7967oO0oOo00.Ooooo0o, 307, 631, 61, 87, 560, 310, 756, C8025oOO00oOO.o00o0O, 397, C7992oO0ooO0.OooOO0o, 851, TinkerReport.KEY_LOADED_INFO_CORRUPTED, 473, 795, C8025oOO00oOO.OooOOO, 31, C8025oOO00oOO.ooOO, 915, 459, 806, 590, 731, 425, JfifUtil.MARKER_SOI, oOO000OO.OooOo, C7637o0oOo0OO.OooO0o, 321, 881, C8025oOO00oOO.o0ooOO0, oOO000OO.OooOOOo, 673, 782, 210, 815, 905, 303, 843, DecodedBitStreamParser.MACRO_PDF417_TERMINATOR, 281, 73, 469, 791, 660, 162, 498, 308, 155, FlowControl.STATUS_FLOW_CTRL_BRUSH, 907, C7982oO0oo00O.OooOOOO, 187, 62, 16, 425, oOO000OO.OooOOOo, C8025oOO00oOO.OooOO0, 286, C8114oOOOO.OooO0O0, 375, 273, 610, 296, 183, DecodedBitStreamParser.BEGIN_MACRO_PDF417_OPTIONAL_FIELD, 116, 667, 751, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 62, 366, 691, 379, 687, 842, 37, TinkerReport.KEY_LOADED_PACKAGE_CHECK_RES_META, 720, 742, 330, 5, 39, DecodedBitStreamParser.BEGIN_MACRO_PDF417_OPTIONAL_FIELD, 311, 424, 242, 749, 321, 54, 669, 316, oO0oO000.Oooo, 299, 534, 105, 667, 488, C7997oO0ooOO0.OooOoO, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, Lillilli.OooooOO, 531, oO0oO000.OooOoo0, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, oO0oO000.Oooo0oO, 498, 655, TinkerReport.KEY_LOADED_PACKAGE_CHECK_RES_META, 752, 768, 223, 849, C8025oOO00oOO.ooOO, 63, 310, 863, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};

    public static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            if (cArr[i4] != 0) {
                cArr[i4] = (char) (929 - cArr[i4]);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int getErrorCorrectionCodewordCount(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    public static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else if (i <= 40) {
            return 2;
        } else {
            if (i <= 160) {
                return 3;
            }
            if (i <= 320) {
                return 4;
            }
            if (i <= 863) {
                return 5;
            }
            throw new WriterException("No recommendation possible");
        }
    }
}
