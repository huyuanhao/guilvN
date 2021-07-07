package com.taobao.tlog.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.OrangeConfigListener;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogController;
import com.taobao.tao.log.TLogInitializer;
import com.taobao.tao.log.TLogUtils;
import java.io.File;
import java.util.Map;

public class TLogConfigSwitchReceiver {
    public static final String REMOTE_DEBUGER_ANDROID = "remote_debug";
    public static final String TAG = "TLogConfigSwitchReceiver";

    public static void init(final Context context) {
        OrangeConfig.getInstance().registerListener(new String[]{REMOTE_DEBUGER_ANDROID}, new OrangeConfigListener() {
            /* class com.taobao.tlog.adapter.TLogConfigSwitchReceiver.C32101 */

            public void onConfigUpdate(String str) {
                Map configs = OrangeConfig.getInstance().getConfigs(str);
                if (configs != null) {
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    String str2 = (String) configs.get("tlog_destroy");
                    String str3 = (String) configs.get("tlog_switch");
                    String str4 = (String) configs.get("tlog_level");
                    String str5 = (String) configs.get("tlog_module");
                    String str6 = (String) configs.get("tlog_start_up_sampling");
                    if (TLogController.getInstance() != null) {
                        String str7 = "tlogDestroy is: " + str2 + "tlogSwitch is : " + str3 + "  tlogLevel is : " + str4 + "  tlogModule is : " + str5;
                        if (TextUtils.isEmpty(str2) || !str2.equals("true")) {
                            edit.putBoolean("tlog_destroy", false).apply();
                            if (TextUtils.isEmpty(str3) || !str3.equals("false")) {
                                edit.putBoolean("tlog_switch", true).apply();
                            } else {
                                TLogController.getInstance().closeLog();
                                edit.putBoolean("tlog_switch", false).apply();
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                String str8 = "change tlog level : " + str4;
                                LogLevel convertLogLevel = TLogUtils.convertLogLevel(str4);
                                edit.putString("tlog_level", str4).apply();
                                TLogController.getInstance().setLogLevel(convertLogLevel);
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                String str9 = "tlog model : " + str5;
                                if ("off".equals(str5)) {
                                    TLogController.getInstance().cleanModuleFilter();
                                    edit.remove("tlog_module").apply();
                                } else {
                                    Map makeModule = TLogUtils.makeModule(str5);
                                    if (makeModule != null && makeModule.size() > 0) {
                                        TLogController.getInstance().addModuleFilter(makeModule);
                                        edit.putString("tlog_module", str5).apply();
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                String str10 = "change tlog start up sampling : " + str6;
                                try {
                                    TLogInitializer.getInstance().startUpSampling(Integer.valueOf(Integer.parseInt(str6)));
                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        } else {
                            TLogController.getInstance().closeLog();
                            TLogUtils.cleanDir(new File(TLogInitializer.getInstance().getFileDir()));
                            edit.putBoolean("tlog_destroy", true).apply();
                        }
                    }
                } else {
                    Log.i(TLogConfigSwitchReceiver.TAG, "TLogConfigSwitchReceiver --> the config is null!");
                }
            }
        });
    }
}
