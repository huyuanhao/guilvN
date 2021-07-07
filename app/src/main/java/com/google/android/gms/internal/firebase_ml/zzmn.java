package com.google.android.gms.internal.firebase_ml;

import com.tencent.bugly.beta.tinker.TinkerReport;

public enum zzmn implements zzuh {
    UNKNOWN_EVENT(0),
    ON_DEVICE_FACE_DETECT(1),
    ON_DEVICE_FACE_CREATE(2),
    ON_DEVICE_FACE_CLOSE(3),
    ON_DEVICE_TEXT_DETECT(11),
    ON_DEVICE_TEXT_CREATE(12),
    ON_DEVICE_TEXT_CLOSE(13),
    ON_DEVICE_BARCODE_DETECT(21),
    ON_DEVICE_BARCODE_CREATE(22),
    ON_DEVICE_BARCODE_CLOSE(23),
    ON_DEVICE_IMAGE_LABEL_DETECT(141),
    ON_DEVICE_IMAGE_LABEL_CREATE(142),
    ON_DEVICE_IMAGE_LABEL_CLOSE(143),
    ON_DEVICE_SMART_REPLY_DETECT(151),
    ON_DEVICE_SMART_REPLY_CREATE(152),
    ON_DEVICE_SMART_REPLY_CLOSE(153),
    ON_DEVICE_SMART_REPLY_BLACKLIST_UPDATE(154),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(161),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(162),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_LOAD(164),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE(163),
    CLOUD_FACE_DETECT(31),
    CLOUD_FACE_CREATE(32),
    CLOUD_FACE_CLOSE(33),
    CLOUD_CROP_HINTS_CREATE(41),
    CLOUD_CROP_HINTS_DETECT(42),
    CLOUD_CROP_HINTS_CLOSE(43),
    CLOUD_DOCUMENT_TEXT_CREATE(51),
    CLOUD_DOCUMENT_TEXT_DETECT(52),
    CLOUD_DOCUMENT_TEXT_CLOSE(53),
    CLOUD_IMAGE_PROPERTIES_CREATE(61),
    CLOUD_IMAGE_PROPERTIES_DETECT(62),
    CLOUD_IMAGE_PROPERTIES_CLOSE(63),
    CLOUD_IMAGE_LABEL_CREATE(71),
    CLOUD_IMAGE_LABEL_DETECT(72),
    CLOUD_IMAGE_LABEL_CLOSE(73),
    CLOUD_LANDMARK_CREATE(81),
    CLOUD_LANDMARK_DETECT(82),
    CLOUD_LANDMARK_CLOSE(83),
    CLOUD_LOGO_CREATE(91),
    CLOUD_LOGO_DETECT(92),
    CLOUD_LOGO_CLOSE(93),
    CLOUD_SAFE_SEARCH_CREATE(111),
    CLOUD_SAFE_SEARCH_DETECT(112),
    CLOUD_SAFE_SEARCH_CLOSE(113),
    CLOUD_TEXT_CREATE(121),
    CLOUD_TEXT_DETECT(TinkerReport.KEY_APPLIED_DEXOPT_EXIST),
    CLOUD_TEXT_CLOSE(TinkerReport.KEY_APPLIED_DEXOPT_FORMAT),
    CLOUD_WEB_SEARCH_CREATE(131),
    CLOUD_WEB_SEARCH_DETECT(132),
    CLOUD_WEB_SEARCH_CLOSE(133),
    CUSTOM_MODEL_RUN(102),
    CUSTOM_MODEL_CREATE(103),
    CUSTOM_MODEL_CLOSE(104),
    CUSTOM_MODEL_DOWNLOAD(100),
    CUSTOM_MODEL_UPDATE(101),
    CUSTOM_MODEL_LOAD(105);
    
    public static final zzui<zzmn> zzbe = new zzmo();
    public final int value;

    /* access modifiers changed from: public */
    zzmn(int i) {
        this.value = i;
    }

    public static zzmn zzap(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return ON_DEVICE_FACE_DETECT;
            case 2:
                return ON_DEVICE_FACE_CREATE;
            case 3:
                return ON_DEVICE_FACE_CLOSE;
            case 11:
                return ON_DEVICE_TEXT_DETECT;
            case 12:
                return ON_DEVICE_TEXT_CREATE;
            case 13:
                return ON_DEVICE_TEXT_CLOSE;
            case 21:
                return ON_DEVICE_BARCODE_DETECT;
            case 22:
                return ON_DEVICE_BARCODE_CREATE;
            case 23:
                return ON_DEVICE_BARCODE_CLOSE;
            case 31:
                return CLOUD_FACE_DETECT;
            case 32:
                return CLOUD_FACE_CREATE;
            case 33:
                return CLOUD_FACE_CLOSE;
            case 41:
                return CLOUD_CROP_HINTS_CREATE;
            case 42:
                return CLOUD_CROP_HINTS_DETECT;
            case 43:
                return CLOUD_CROP_HINTS_CLOSE;
            case 51:
                return CLOUD_DOCUMENT_TEXT_CREATE;
            case 52:
                return CLOUD_DOCUMENT_TEXT_DETECT;
            case 53:
                return CLOUD_DOCUMENT_TEXT_CLOSE;
            case 61:
                return CLOUD_IMAGE_PROPERTIES_CREATE;
            case 62:
                return CLOUD_IMAGE_PROPERTIES_DETECT;
            case 63:
                return CLOUD_IMAGE_PROPERTIES_CLOSE;
            case 71:
                return CLOUD_IMAGE_LABEL_CREATE;
            case 72:
                return CLOUD_IMAGE_LABEL_DETECT;
            case 73:
                return CLOUD_IMAGE_LABEL_CLOSE;
            case 81:
                return CLOUD_LANDMARK_CREATE;
            case 82:
                return CLOUD_LANDMARK_DETECT;
            case 83:
                return CLOUD_LANDMARK_CLOSE;
            case 91:
                return CLOUD_LOGO_CREATE;
            case 92:
                return CLOUD_LOGO_DETECT;
            case 93:
                return CLOUD_LOGO_CLOSE;
            case 100:
                return CUSTOM_MODEL_DOWNLOAD;
            case 101:
                return CUSTOM_MODEL_UPDATE;
            case 102:
                return CUSTOM_MODEL_RUN;
            case 103:
                return CUSTOM_MODEL_CREATE;
            case 104:
                return CUSTOM_MODEL_CLOSE;
            case 105:
                return CUSTOM_MODEL_LOAD;
            case 111:
                return CLOUD_SAFE_SEARCH_CREATE;
            case 112:
                return CLOUD_SAFE_SEARCH_DETECT;
            case 113:
                return CLOUD_SAFE_SEARCH_CLOSE;
            case 121:
                return CLOUD_TEXT_CREATE;
            case TinkerReport.KEY_APPLIED_DEXOPT_EXIST /*{ENCODED_INT: 122}*/:
                return CLOUD_TEXT_DETECT;
            case TinkerReport.KEY_APPLIED_DEXOPT_FORMAT /*{ENCODED_INT: 123}*/:
                return CLOUD_TEXT_CLOSE;
            case 131:
                return CLOUD_WEB_SEARCH_CREATE;
            case 132:
                return CLOUD_WEB_SEARCH_DETECT;
            case 133:
                return CLOUD_WEB_SEARCH_CLOSE;
            case 141:
                return ON_DEVICE_IMAGE_LABEL_DETECT;
            case 142:
                return ON_DEVICE_IMAGE_LABEL_CREATE;
            case 143:
                return ON_DEVICE_IMAGE_LABEL_CLOSE;
            case 151:
                return ON_DEVICE_SMART_REPLY_DETECT;
            case 152:
                return ON_DEVICE_SMART_REPLY_CREATE;
            case 153:
                return ON_DEVICE_SMART_REPLY_CLOSE;
            case 154:
                return ON_DEVICE_SMART_REPLY_BLACKLIST_UPDATE;
            case 161:
                return ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
            case 162:
                return ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE;
            case 163:
                return ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE;
            case 164:
                return ON_DEVICE_LANGUAGE_IDENTIFICATION_LOAD;
            default:
                return null;
        }
    }

    public static zzuj zzq() {
        return zzmp.zzbs;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzuh
    public final int zzo() {
        return this.value;
    }
}
