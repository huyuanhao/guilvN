package com.umeng.message;

import anet.channel.util.HttpConstant;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.xiaomi.mipush.sdk.Constants;

public class MsgConstant {
    public static final String ACCOUNT_ID = "174658";
    public static final int ACTION_MIPUSH_MSG_CLICK = 21;
    public static final int ACTION_RECALL_MSG_FAIL = 5;
    public static final int ACTION_RECALL_MSG_SUCCESS = 4;
    public static final int ACTION_TYPE_MSG_ARRIVAL = 0;
    public static final int ACTION_TYPE_MSG_CLICK = 1;
    public static final int ACTION_TYPE_MSG_DISMISS = 2;
    public static final int ACTION_TYPE_PULLED_ACTIVITY_NOPACKAGE = 60;
    public static final int ACTION_TYPE_PULLED_ACTIVITY_PACKAGE_NOURL = 61;
    public static final int ACTION_TYPE_PULLED_ACTIVITY_PACKAGE_URL = 62;
    public static final int ACTION_TYPE_PULLED_ACTIVITY_PACKAGE_URL_SUCCESS = 63;
    public static final int ACTION_TYPE_PULLED_ALREADY = 52;
    public static final int ACTION_TYPE_PULLED_FAIL = 50;
    public static final int ACTION_TYPE_PULLED_NOPACKAGE = 53;
    public static final int ACTION_TYPE_PULLED_SUCCESS = 51;
    public static String ALIAS_ENDPOINT = null;
    public static String ALIAS_EXCLUSIVE_ENDPOINT = null;
    public static String ALIAS_LOG = null;
    public static final int APP_LAUNCH_BY_MESSAGE = 1;
    public static final int APP_LAUNCH_BY_UNSET = 0;
    public static final int APP_LAUNCH_BY_USER = 2;
    public static final int CACHE_LOG_COUNT_MAX = 20;
    public static final String CACHE_LOG_FILE_EXT = ".log";
    public static final String CACHE_LOG_FILE_PREFIX = "umeng_message_log_cache_";
    public static String CARD_MSG_ENDPOINT = (f9892h + "getmsg");
    public static final String DEFAULT_INTENT_SERVICE_CLASS_NAME = UmengIntentService.class.getName();
    public static String DELETE_ALIAS_ENDPOINT = (ALIAS_ENDPOINT + "/delete");
    public static final int FAILALIAS = 0;
    public static final int FAILEXCLUSIVEALIAS = 1;
    public static final String HTTPSDNS_ERROR = "java.net.UnknownHostException";
    public static final String INAPP_LABEL = "label";
    public static final String INAPP_MSG_ID = "msg_id";
    public static final String INAPP_MSG_TYPE = "msg_type";
    public static final String INAPP_NUM_CLOSE = "num_close";
    public static final String INAPP_NUM_CUSTOM = "num_custom";
    public static final String INAPP_NUM_DISPLAY = "num_display";
    public static final String INAPP_NUM_DURATION = "num_duration";
    public static final String INAPP_NUM_OPEN_BUTTOM = "num_open_bottom";
    public static final String INAPP_NUM_OPEN_FULL = "num_open_full";
    public static final String INAPP_NUM_OPEN_TOP = "num_open_top";
    public static final String KET_UMENG_TAG_REMAIN = "UMENG_TAG_REMAIN";
    public static final String KEY_ACTION_TYPE = "action_type";
    public static final String KEY_ADDALIAS = "addAlias";
    public static final String KEY_ADDTAGS = "addTags";
    public static final String KEY_ADD_WEIGHTED_TAGS = "addWeightedTags";
    public static final String KEY_ALIAS = "alias";
    public static final String KEY_ALIAS_FAIL_LOG = "aliasFail";
    public static final String KEY_APP_DAREGISTER_LOG_SEND_POLICY = "KEY_APP_DAREGISTER_LOG_SEND_POLICY";
    public static final String KEY_APP_LAUNCH_LOG_SEND_POLICY = "KEY_APP_LAUNCH_LOG_SEND_POLICY";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_CACHE_FILE_TRANSFER_TO_SQL = "KEY_CACHE_FILE_TRANSFER_TO_SQL";
    public static final String KEY_CARD_LABEL_LIST = "KEY_CARD_LABEL_LIST";
    public static final String KEY_CARD_TS = "KEY_CARD_TS";
    public static final String KEY_DELETEALIAS = "deleteAlias";
    public static final String KEY_DELETETAGS = "deleteTags";
    public static final String KEY_DELETE_WEIGHTED_TAGS = "deleteWeightedTags";
    public static final String KEY_DEVICE_TOKEN = "device_token";
    public static final String KEY_ENEABLED = "KEY_ENEABLED";
    public static final String KEY_FAIL = "fail";
    public static final String KEY_GETTAGS = "getTags";
    public static final String KEY_HASREGISTER = "has_register";
    public static final String KEY_HEADER = "header";
    public static final String KEY_INAPP_PMODE = "pmode";
    public static final String KEY_ISENABLED = "is_register";
    public static final String KEY_LAST_ALIAS = "last_alias";
    public static final String KEY_LAST_CARD_ID = "KEY_LAST_CARD_ID";
    public static final String KEY_LAST_MSG_ID = "last_msg_id";
    public static final String KEY_LAST_SHOW_CARD_TS = "KEY_LAST_SHOW_CARD_TS";
    public static final String KEY_LAST_SHOW_SPLASH_TS = "KEY_LAST_SHOW_SPLASH_TS";
    public static final String KEY_LAST_SPLASH_ID = "KEY_LAST_SPLASH_ID";
    public static final String KEY_LAST_VERSION_CODE = "KEY_LAST_VERSION_CODE";
    public static final String KEY_LAUNCH_LOG_SENT_MARK = "KEY_LAUNCH_LOG_SENT_MARK";
    public static final String KEY_LIST_WEIGHTED_TAGS = "listWeightedTags";
    public static final String KEY_LOCATION_INTERVAL = "interval";
    public static final String KEY_LOCATION_PARAMS = "location";
    public static final String KEY_MAIN_ACTIVITY_PATH = "KEY_MAIN_ACTIVITY_PATH";
    public static final String KEY_MERGE_NOTIFICATION = "KEY_MERGE_NOTIFICATION";
    public static final String KEY_MSG_ID = "msg_id";
    public static final String KEY_MSG_RESOURCE_DOWNLOAD_PREFIX = "KEY_MSG_RESOURCE_DOWNLOAD_PREFIX";
    public static final String KEY_MUTE_DURATION = "mute_duration";
    public static final String KEY_NOTIFICATION_CHANNEL = "KEY_NOTIFICATION_CHANNEL";
    public static final String KEY_NOTIFICATION_NUMBER = "KEY_NOTIFICATION_NUMBER";
    public static final String KEY_NO_DISTURB_END_HOUR = "KEY_NO_DISTURB_END_HOUR";
    public static final String KEY_NO_DISTURB_END_MINUTE = "KEY_NO_DISTURB_END_MINUTE";
    public static final String KEY_NO_DISTURB_START_HOUR = "KEY_NO_DISTURB_START_HOUR";
    public static final String KEY_NO_DISTURB_START_MINUTE = "KEY_NO_DISTURB_START_MINUTE";
    public static final String KEY_PLAIN_TEXT_SIZE = "KEY_PLAIN_TEXT_SIZE";
    public static final String KEY_PULLED_WHO = "pa";
    public static final String KEY_PUSH_INTENT_SERVICE_CLASSNAME = "KEY_PUSH_INTENT_SERVICE_CLASSNAME";
    public static final String KEY_REGISTER_TIMES = "KEY_REGISTER_TIMES";
    public static final String KEY_REGISTRATION_ID = "registration_id";
    public static final String KEY_SENDMESSAGE = "KEY_SENDMESSAGE";
    public static final String KEY_SERIA_NO = "serial_no";
    public static final String KEY_SETALIAS = "setAlias";
    public static final String KEY_SET_LOCALNOTIFICATION_INTERVAL_LIMIT = "KEY_SET_LOCALNOTIFICATION_INTERVAL_LIMIT";
    public static final String KEY_SET_NOTIFICATION_ON_FOREGROUND = "KEY_SET_NOTIFICATION_ON_FOREGROUND";
    public static final String KEY_SET_NOTIFICATION_PLAY_LIGHTS = "KEY_SET_NOTIFICATION_PLAY_LIGHTS";
    public static final String KEY_SET_NOTIFICATION_PLAY_SOUND = "KEY_SET_NOTIFICATION_PLAY_SOUND";
    public static final String KEY_SET_NOTIFICATION_PLAY_VIBRATE = "KEY_SET_NOTIFICATION_PLAY_VIBRATE";
    public static final String KEY_SET_PUSH_INTENT_SERVICE_VERSION_CODE = "KEY_SET_PUSH_INTENT_SERVICE_VERSION_CODE";
    public static final String KEY_SET_RESOURCE_PACKAGENAME = "KEY_SET_RESOURCE_PACKAGENAME";
    public static final String KEY_SPLASH_TS = "KEY_SPLASH_TS";
    public static final String KEY_STATUS = "status";
    public static final String KEY_SUCCESS = "success";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TAG_SEND_POLICY = "KEY_TAG_SEND_POLICY";
    public static final String KEY_TS = "ts";
    public static final String KEY_TYPE = "type";
    public static final String KEY_UCODE = "ucode";
    public static final String KEY_UMENG_MESSAGE_APP_CHANNEL = "KEY_UMENG_MESSAGE_APP_CHANNEL";
    public static final String KEY_UMENG_MESSAGE_APP_KEY = "KEY_UMENG_MESSAGE_APP_KEY";
    public static final String KEY_UMENG_MESSAGE_APP_SECRET = "KEY_UMENG_MESSAGE_APP_SECRET";
    public static final String KEY_UMPX_PATH = "KEY_UMPX_PATH";
    public static final String KEY_UTDID = "utdid";
    public static String LAUNCH_ENDPOINT = null;
    public static String LBS_ENDPOINT = null;
    public static String LOC_ENDPOINT = null;
    public static String LOG_ENDPOINT = null;
    public static final String MESSAGE_AUTOUPDATE_HANDLER_ACTION = "com.umeng.message.autoupdate.handler.action";
    public static final String MESSAGE_DISABLE_CALLBACK_ACTION = "com.umeng.message.disablecallback.action";
    public static final String MESSAGE_ENABLE_CALLBACK_ACTION = "com.umeng.message.enablecallback.action";
    public static final String MESSAGE_LBS_ACTION = "com.umeng.message.lbs.action";
    public static final String MESSAGE_MESSAGE_HANDLER_ACTION = "com.umeng.message.message.handler.action";
    public static final String MESSAGE_MESSAGE_SEND_ACTION = "com.umeng.message.message.sendmessage.action";
    public static final String MESSAGE_NOTIFY_ARRIVAL = "7";
    public static final String MESSAGE_NOTIFY_CLICK = "8";
    public static final String MESSAGE_NOTIFY_DISMISS = "9";
    public static final String MESSAGE_NOTIFY_FOR_AGOO_ACTION = "message_notify_for_agoo_action";
    public static final String MESSAGE_REGISTER_CALLBACK_ACTION = "com.umeng.messge.registercallback.action";
    public static final String MESSAGE_SYSTEM_SOURCE_XIAOMI = "xiaomi";
    public static final int NOTIFICATION_MERGE_ID = 20100401;
    public static final int NOTIFICATION_PLAY_SDK_DISABLE = 2;
    public static final int NOTIFICATION_PLAY_SDK_ENABLE = 1;
    public static final int NOTIFICATION_PLAY_SERVER = 0;
    public static final String PERMISSION_ACCESS_NETWORK_STATE = "android.permission.ACCESS_NETWORK_STATE";
    public static final String PERMISSION_ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE";
    public static final String PERMISSION_BROADCAST_PACKAGE_ADDED = "android.permission.BROADCAST_PACKAGE_ADDED";
    public static final String PERMISSION_BROADCAST_PACKAGE_CHANGED = "android.permission.BROADCAST_PACKAGE_CHANGED";
    public static final String PERMISSION_BROADCAST_PACKAGE_INSTALL = "android.permission.BROADCAST_PACKAGE_INSTALL";
    public static final String PERMISSION_BROADCAST_PACKAGE_REPLACED = "android.permission.BROADCAST_PACKAGE_REPLACED";
    public static final String PERMISSION_GET_TASKS = "android.permission.GET_TASKS";
    public static final String PERMISSION_INTERNET = "android.permission.INTERNET";
    public static final String PERMISSION_READ_PHONE_STATE = "android.permission.READ_PHONE_STATE";
    public static final String PERMISSION_RECEIVE_BOOT_COMPLETED = "android.permission.RECEIVE_BOOT_COMPLETED";
    public static final String PERMISSION_RESTART_PACKAGES = "android.permission.RESTART_PACKAGES";
    public static final String PERMISSION_WAKE_LOCK = "android.permission.WAKE_LOCK";
    public static final String PERMISSION_WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
    public static final String PREF_XIAOMI = "pref_xiaomi";
    public static final String PROTOCOL_VERSION = "1.0";
    public static final int PUSH_LOG = 16385;
    public static final String PUSH_SHARED_PREFERENCES_FILE_NAME = "umeng_message_state";
    public static String REGISTER_ENDPOINT = null;
    public static final String SDK_VERSION = "6.1.0";
    public static String SPLASH_MSG_ENDPOINT = null;
    public static String STATS_ENDPOINT = (f9892h + "stats");
    public static final int SUCCESS = 2;
    public static final int SUCCESSEXCLUSIVEALIAS = 3;
    public static String TAG_ENDPOINT = null;
    public static final String UMPX_PUSH_LAUNCH = "umpx_push_launch";
    public static final String UMPX_PUSH_REGISTER = "umpx_push_register";
    public static final String UNPX_PUSH_LOGS = "umpx_push_logs";
    public static String WEIGHTED_TAG_ENDPOINT = null;
    public static final String XIAOMI_REGID = "xiaomi_regid";

    /* renamed from: a */
    public static final String f9885a = "KEY_SET_UMID";

    /* renamed from: b */
    public static long f9886b = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;

    /* renamed from: c */
    public static final long f9887c = 60000;

    /* renamed from: d */
    public static final String f9888d = "TD";

    /* renamed from: e */
    public static String f9889e = "msg.umengcloud.com";

    /* renamed from: f */
    public static String f9890f = null;

    /* renamed from: g */
    public static String f9891g = "https";

    /* renamed from: h */
    public static String f9892h = (f9891g + HttpConstant.SCHEME_SPLIT + f9889e + "/admsg/v2/");

    static {
        String str = f9891g + HttpConstant.SCHEME_SPLIT + f9889e + C8932ooOOO0o.OooO0OO;
        LOG_ENDPOINT = str + "push_logs";
        REGISTER_ENDPOINT = str + "register";
        ALIAS_ENDPOINT = str + "alias";
        ALIAS_EXCLUSIVE_ENDPOINT = str + "alias/set";
        LAUNCH_ENDPOINT = str + "launch";
        TAG_ENDPOINT = str + CommonNetImpl.TAG;
        WEIGHTED_TAG_ENDPOINT = str + "tagplus";
        ALIAS_LOG = str + "da";
        LBS_ENDPOINT = str + "lbs";
        LOC_ENDPOINT = str + "loc";
        StringBuilder sb = new StringBuilder();
        sb.append(f9892h);
        sb.append("launch");
        SPLASH_MSG_ENDPOINT = sb.toString();
    }
}
