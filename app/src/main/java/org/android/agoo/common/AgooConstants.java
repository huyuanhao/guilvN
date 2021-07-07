package org.android.agoo.common;

public interface AgooConstants {
    public static final String ACK_BODY_NULL = "11";
    public static final String ACK_FLAG_NULL = "13";
    public static final String ACK_PACK_ERROR = "15";
    public static final String ACK_PACK_NOBIND = "14";
    public static final String ACK_PACK_NULL = "12";
    public static final String ACK_REMOVE_PACKAGE = "10";
    public static final String AGOO_COMMAND = "command";
    public static final String AGOO_COMMAND_GCMIPUSHID_REPORT = "gcmpushId_report";
    public static final String AGOO_COMMAND_HUAWEIPUSHID_REPORT = "huaweipushId_report";
    public static final String AGOO_COMMAND_MESSAGE_DELETED = "message_deleted";
    public static final String AGOO_COMMAND_MESSAGE_READED = "message_readed";
    public static final String AGOO_COMMAND_MIPUSHID_REPORT = "mipushId_report";
    public static final int AGOO_ENCRYPTED_MESSAGE_FLAG = 4;
    public static final int AGOO_EVENT_ID = 66002;
    public static final String AGOO_SERVICE_AGOOACK = "agooAck";
    public static final String BINDER_MSGRECEIVER_ACTION = "org.android.agoo.client.MessageReceiverService";
    public static final int COME_FORM_BG = 4;
    public static final String ERROR_APPKEY_NULL = "ERROR_APPKEY_NULL";
    public static final String ERROR_APP_SECRET_NULL = "ERROR_APPSECRET_NULL";
    public static final String ERROR_DEVICETOKEN_NULL = "ERROR_DEVICETOKEN_NULL";
    public static final String ERROR_NEED_ELECTION = "ERROR_NEED_ELECTION";
    public static final String ERROR_TTID_NULL = "ERROR_TTID_NULL";
    public static final int EVOKE_BY_AGOO = 1;
    public static final String FLAG_FROM_AGOO_MESSAGE_ID = "AliAgooMsgID";
    public static final String INTENT_FROM_AGOO_MESSAGE = "org.agoo.android.intent.action.RECEIVE";
    public static final String INTENT_FROM_AGOO_PING = "org.agoo.android.intent.action.PING_V4";
    public static final String INTENT_FROM_AGOO_REPORT = "org.agoo.android.intent.action.REPORT";
    public static final int IS_SAME_DAY = 8;
    public static final int LAUNCH_BY_AGOO = 2;
    public static final String MESSAGE_ACCS_EXTRA = "accs_extra";
    public static final String MESSAGE_AGOO_BUNDLE = "msg_agoo_bundle";
    public static final String MESSAGE_BODY = "body";
    public static final String MESSAGE_DUPLICATE = "duplicate";
    public static final String MESSAGE_ENCRYPTED = "encrypted";
    public static final String MESSAGE_EXT = "extData";
    public static final String MESSAGE_FLAG = "flag";
    public static final String MESSAGE_FROM_APPKEY = "fromAppkey";
    public static final String MESSAGE_FROM_PKG = "source";
    public static final String MESSAGE_HAS_DECRYPTED = "has_decrypted";
    public static final String MESSAGE_HAS_TEST = "has_test";
    public static final String MESSAGE_ID = "id";
    public static final String MESSAGE_LOCAL = "local";
    public static final String MESSAGE_MEIZU_PAYLOAD = "meizu_payload";
    public static final String MESSAGE_NOTIFICATION = "notify";
    public static final String MESSAGE_OPPO_PAYLOAD = "oppo_payload";
    public static final String MESSAGE_ORI = "oriData";
    public static final String MESSAGE_POPUP = "popup";
    public static final String MESSAGE_REPORT = "report";
    public static final String MESSAGE_SOURCE = "message_source";
    public static final String MESSAGE_SOURCE_ACCS = "accs";
    public static final String MESSAGE_SYSTEM_SOURCE_GCM = "gcm";
    public static final String MESSAGE_SYSTEM_SOURCE_HUAWEI = "huawei";
    public static final String MESSAGE_SYSTEM_SOURCE_MEIZU = "meizu";
    public static final String MESSAGE_SYSTEM_SOURCE_OPPO = "oppo";
    public static final String MESSAGE_SYSTEM_SOURCE_VIVO = "vivo";
    public static final String MESSAGE_SYSTEM_SOURCE_XIAOMI = "xiaomi";
    public static final String MESSAGE_TASK_ID = "task_id";
    public static final String MESSAGE_TIME = "time";
    public static final String MESSAGE_TRACE = "trace";
    public static final String MESSAGE_TYPE = "type";
    public static final String MESSAGE_VIVO_PAYLOAD = "vivo_payload";
    public static final String MTOP_ERRCODE_AUTH_REJECT = "ERRCODE_AUTH_REJECT";
    public static final String REPORT_DUPLICATE_FAIL = "23";
    public static final String REPORT_ENCRYPT_FAIL = "22";
    public static final String REPORT_MESSAGE_NULL = "21";
    public static final String REPORT_NOT_ENCRYPT = "24";
    public static final String TAOBAO_PACKAGE = "com.taobao.taobao";
    public static final String THIRD_PUSH_ID = "thirdPushId";
}
