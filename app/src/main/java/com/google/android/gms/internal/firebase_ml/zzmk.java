package com.google.android.gms.internal.firebase_ml;

public enum zzmk implements zzuh {
    NO_ERROR(0),
    INCOMPATIBLE_INPUT(1),
    INCOMPATIBLE_OUTPUT(2),
    INCOMPATIBLE_TFLITE_VERSION(3),
    MISSING_OP(4),
    DATA_TYPE_ERROR(6),
    TFLITE_INTERNAL_ERROR(7),
    TFLITE_UNKNOWN_ERROR(8),
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    URI_EXPIRED(101),
    NO_NETWORK_CONNECTION(102),
    METERED_NETWORK(103),
    DOWNLOAD_FAILED(104),
    MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS(105),
    MODEL_INFO_DOWNLOAD_NO_HASH(106),
    MODEL_INFO_DOWNLOAD_CONNECTION_FAILED(107),
    NO_VALID_MODEL(108),
    LOCAL_MODEL_INVALID(109),
    CLOUD_MODEL_INVALID(110),
    CLOUD_MODEL_LOADER_ERROR(111),
    CLOUD_MODEL_LOADER_LOADS_NO_MODEL(112),
    SMART_REPLY_LANG_ID_DETECTAION_FAILURE(113),
    UNKNOWN_ERROR(9999);
    
    public static final zzui<zzmk> zzbe = new zzml();
    public final int value;

    /* access modifiers changed from: public */
    zzmk(int i) {
        this.value = i;
    }

    public static zzmk zzao(int i) {
        if (i == 9999) {
            return UNKNOWN_ERROR;
        }
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return INCOMPATIBLE_INPUT;
            case 2:
                return INCOMPATIBLE_OUTPUT;
            case 3:
                return INCOMPATIBLE_TFLITE_VERSION;
            case 4:
                return MISSING_OP;
            case 5:
                return TIME_OUT_FETCHING_MODEL_METADATA;
            case 6:
                return DATA_TYPE_ERROR;
            case 7:
                return TFLITE_INTERNAL_ERROR;
            case 8:
                return TFLITE_UNKNOWN_ERROR;
            default:
                switch (i) {
                    case 100:
                        return MODEL_NOT_DOWNLOADED;
                    case 101:
                        return URI_EXPIRED;
                    case 102:
                        return NO_NETWORK_CONNECTION;
                    case 103:
                        return METERED_NETWORK;
                    case 104:
                        return DOWNLOAD_FAILED;
                    case 105:
                        return MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS;
                    case 106:
                        return MODEL_INFO_DOWNLOAD_NO_HASH;
                    case 107:
                        return MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
                    case 108:
                        return NO_VALID_MODEL;
                    case 109:
                        return LOCAL_MODEL_INVALID;
                    case 110:
                        return CLOUD_MODEL_INVALID;
                    case 111:
                        return CLOUD_MODEL_LOADER_ERROR;
                    case 112:
                        return CLOUD_MODEL_LOADER_LOADS_NO_MODEL;
                    case 113:
                        return SMART_REPLY_LANG_ID_DETECTAION_FAILURE;
                    default:
                        return null;
                }
        }
    }

    public static zzuj zzq() {
        return zzmm.zzbs;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzuh
    public final int zzo() {
        return this.value;
    }
}
