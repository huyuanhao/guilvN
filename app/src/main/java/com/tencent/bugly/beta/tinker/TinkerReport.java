package com.tencent.bugly.beta.tinker;

import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.taobao.accs.ErrorCode;
import com.tencent.tinker.lib.util.TinkerLog;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public class TinkerReport {
    public static final int KEY_APPLIED = 5;
    public static final int KEY_APPLIED_DEXOPT_EXIST = 122;
    public static final int KEY_APPLIED_DEXOPT_FORMAT = 123;
    public static final int KEY_APPLIED_DEXOPT_OTHER = 121;
    public static final int KEY_APPLIED_DEX_EXTRACT = 182;
    public static final int KEY_APPLIED_EXCEPTION = 120;
    public static final int KEY_APPLIED_FAIL_COST_10S_LESS = 206;
    public static final int KEY_APPLIED_FAIL_COST_30S_LESS = 207;
    public static final int KEY_APPLIED_FAIL_COST_5S_LESS = 205;
    public static final int KEY_APPLIED_FAIL_COST_60S_LESS = 208;
    public static final int KEY_APPLIED_FAIL_COST_OTHER = 209;
    public static final int KEY_APPLIED_INFO_CORRUPTED = 124;
    public static final int KEY_APPLIED_LIB_EXTRACT = 183;
    public static final int KEY_APPLIED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND = 153;
    public static final int KEY_APPLIED_PACKAGE_CHECK_DEX_META = 151;
    public static final int KEY_APPLIED_PACKAGE_CHECK_LIB_META = 152;
    public static final int KEY_APPLIED_PACKAGE_CHECK_META_NOT_FOUND = 155;
    public static final int KEY_APPLIED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND = 154;
    public static final int KEY_APPLIED_PACKAGE_CHECK_RES_META = 157;
    public static final int KEY_APPLIED_PACKAGE_CHECK_SIGNATURE = 150;
    public static final int KEY_APPLIED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT = 158;
    public static final int KEY_APPLIED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL = 156;
    public static final int KEY_APPLIED_PATCH_FILE_EXTRACT = 181;
    public static final int KEY_APPLIED_RESOURCE_EXTRACT = 184;
    public static final int KEY_APPLIED_START = 4;
    public static final int KEY_APPLIED_SUCC_COST_10S_LESS = 201;
    public static final int KEY_APPLIED_SUCC_COST_30S_LESS = 202;
    public static final int KEY_APPLIED_SUCC_COST_5S_LESS = 200;
    public static final int KEY_APPLIED_SUCC_COST_60S_LESS = 203;
    public static final int KEY_APPLIED_SUCC_COST_OTHER = 204;
    public static final int KEY_APPLIED_UPGRADE = 100;
    public static final int KEY_APPLIED_UPGRADE_FAIL = 101;
    public static final int KEY_APPLIED_VERSION_CHECK = 180;
    public static final int KEY_APPLY_WITH_RETRY = 10;
    public static final int KEY_CRASH_CAUSE_XPOSED_ART = 9;
    public static final int KEY_CRASH_CAUSE_XPOSED_DALVIK = 8;
    public static final int KEY_CRASH_FAST_PROTECT = 7;
    public static final int KEY_DOWNLOAD = 1;
    public static final int KEY_LOADED = 6;
    public static final int KEY_LOADED_EXCEPTION_DEX = 252;
    public static final int KEY_LOADED_EXCEPTION_DEX_CHECK = 253;
    public static final int KEY_LOADED_EXCEPTION_RESOURCE = 254;
    public static final int KEY_LOADED_EXCEPTION_RESOURCE_CHECK = 255;
    public static final int KEY_LOADED_INFO_CORRUPTED = 309;
    public static final int KEY_LOADED_INTERPRET_GET_INSTRUCTION_SET_ERROR = 450;
    public static final int KEY_LOADED_INTERPRET_INTERPRET_COMMAND_ERROR = 451;
    public static final int KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK = 452;
    public static final int KEY_LOADED_MISMATCH_DEX = 300;
    public static final int KEY_LOADED_MISMATCH_LIB = 301;
    public static final int KEY_LOADED_MISMATCH_RESOURCE = 302;
    public static final int KEY_LOADED_MISSING_DEX = 303;
    public static final int KEY_LOADED_MISSING_DEX_OPT = 307;
    public static final int KEY_LOADED_MISSING_LIB = 304;
    public static final int KEY_LOADED_MISSING_PATCH_FILE = 305;
    public static final int KEY_LOADED_MISSING_PATCH_INFO = 306;
    public static final int KEY_LOADED_MISSING_RES = 308;
    public static final int KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND = 353;
    public static final int KEY_LOADED_PACKAGE_CHECK_DEX_META = 351;
    public static final int KEY_LOADED_PACKAGE_CHECK_LIB_META = 352;
    public static final int KEY_LOADED_PACKAGE_CHECK_PACKAGE_META_NOT_FOUND = 356;
    public static final int KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND = 354;
    public static final int KEY_LOADED_PACKAGE_CHECK_RES_META = 357;
    public static final int KEY_LOADED_PACKAGE_CHECK_SIGNATURE = 350;
    public static final int KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT = 358;
    public static final int KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL = 355;
    public static final int KEY_LOADED_SUCC_COST_1000_LESS = 401;
    public static final int KEY_LOADED_SUCC_COST_3000_LESS = 402;
    public static final int KEY_LOADED_SUCC_COST_5000_LESS = 403;
    public static final int KEY_LOADED_SUCC_COST_500_LESS = 400;
    public static final int KEY_LOADED_SUCC_COST_OTHER = 404;
    public static final int KEY_LOADED_UNCAUGHT_EXCEPTION = 251;
    public static final int KEY_LOADED_UNKNOWN_EXCEPTION = 250;
    public static final int KEY_REQUEST = 0;
    public static final int KEY_TRY_APPLY = 2;
    public static final int KEY_TRY_APPLY_ALREADY_APPLY = 77;
    public static final int KEY_TRY_APPLY_CONDITION_NOT_SATISFIED = 80;
    public static final int KEY_TRY_APPLY_CRASH_LIMIT = 79;
    public static final int KEY_TRY_APPLY_DISABLE = 71;
    public static final int KEY_TRY_APPLY_GOOGLEPLAY = 75;
    public static final int KEY_TRY_APPLY_INSERVICE = 73;
    public static final int KEY_TRY_APPLY_JIT = 81;
    public static final int KEY_TRY_APPLY_MEMORY_LIMIT = 78;
    public static final int KEY_TRY_APPLY_NOT_EXIST = 74;
    public static final int KEY_TRY_APPLY_ROM_SPACE = 76;
    public static final int KEY_TRY_APPLY_RUNNING = 72;
    public static final int KEY_TRY_APPLY_SUCCESS = 3;
    public static final int KEY_TRY_APPLY_UPGRADE = 70;
    public static final String TAG = "Tinker.TinkerReport";
    public static Reporter reporter;

    public interface Reporter {
        void onReport(int i);

        void onReport(String str);
    }

    public static void onApplied(long j, boolean z) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            if (z) {
                reporter2.onReport(5);
            }
            if (z) {
                reporter.onReport(100);
            } else {
                reporter.onReport(101);
            }
            TinkerLog.i(TAG, "hp_report report apply cost = %d", new Object[]{Long.valueOf(j)});
            if (j < 0) {
                TinkerLog.e(TAG, "hp_report report apply cost failed, invalid cost", new Object[0]);
            } else if (j <= WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                if (z) {
                    reporter.onReport(200);
                } else {
                    reporter.onReport(KEY_APPLIED_FAIL_COST_5S_LESS);
                }
            } else if (j <= TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE) {
                if (z) {
                    reporter.onReport(201);
                } else {
                    reporter.onReport(206);
                }
            } else if (j <= 30000) {
                if (z) {
                    reporter.onReport(202);
                } else {
                    reporter.onReport(KEY_APPLIED_FAIL_COST_30S_LESS);
                }
            } else if (j <= 60000) {
                if (z) {
                    reporter.onReport(203);
                } else {
                    reporter.onReport(208);
                }
            } else if (z) {
                reporter.onReport(204);
            } else {
                reporter.onReport(KEY_APPLIED_FAIL_COST_OTHER);
            }
        }
    }

    public static void onApplyCrash(Throwable th) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(120);
            Reporter reporter3 = reporter;
            reporter3.onReport("Tinker Exception:apply tinker occur exception " + TinkerUtils.getExceptionCauseString(th));
        }
    }

    public static void onApplyDexOptFail(Throwable th) {
        if (reporter != null) {
            if (th.getMessage().contains("checkDexOptExist failed")) {
                reporter.onReport(KEY_APPLIED_DEXOPT_EXIST);
            } else if (th.getMessage().contains("checkDexOptFormat failed")) {
                reporter.onReport(KEY_APPLIED_DEXOPT_FORMAT);
            } else {
                reporter.onReport(121);
                Reporter reporter2 = reporter;
                reporter2.onReport("Tinker Exception:apply tinker occur exception " + TinkerUtils.getExceptionCauseString(th));
            }
        }
    }

    public static void onApplyExtractFail(int i) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            if (i == 1) {
                reporter2.onReport(181);
            } else if (i == 3) {
                reporter2.onReport(182);
            } else if (i == 5) {
                reporter2.onReport(183);
            } else if (i == 6) {
                reporter2.onReport(184);
            }
        }
    }

    public static void onApplyInfoCorrupted() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(124);
        }
    }

    public static void onApplyPackageCheckFail(int i) {
        if (reporter != null) {
            TinkerLog.i(TAG, "hp_report package check failed, error = %d", new Object[]{Integer.valueOf(i)});
            switch (i) {
                case -9:
                    reporter.onReport(158);
                    return;
                case ErrorCode.UNKNOWN_ERROR:
                    reporter.onReport(157);
                    return;
                case -7:
                    reporter.onReport(156);
                    return;
                case -6:
                    reporter.onReport(154);
                    return;
                case -5:
                    reporter.onReport(153);
                    return;
                case -4:
                    reporter.onReport(152);
                    return;
                case -3:
                    reporter.onReport(151);
                    return;
                case -2:
                    reporter.onReport(155);
                    return;
                case -1:
                    reporter.onReport(150);
                    return;
                default:
                    return;
            }
        }
    }

    public static void onApplyPatchServiceStart() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(4);
        }
    }

    public static void onApplyVersionCheckFail() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(180);
        }
    }

    public static void onFastCrashProtect() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onLoadException(java.lang.Throwable r5, int r6) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.tinker.TinkerReport.onLoadException(java.lang.Throwable, int):void");
    }

    public static void onLoadFileMisMatch(int i) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            if (i == 3) {
                reporter2.onReport(300);
            } else if (i == 5) {
                reporter2.onReport(301);
            } else if (i == 6) {
                reporter2.onReport(302);
            }
        }
    }

    public static void onLoadFileNotFound(int i) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            switch (i) {
                case 1:
                    reporter2.onReport(305);
                    return;
                case 2:
                    reporter2.onReport(306);
                    return;
                case 3:
                    reporter2.onReport(303);
                    return;
                case 4:
                    reporter2.onReport(307);
                    return;
                case 5:
                    reporter2.onReport(304);
                    return;
                case 6:
                    reporter2.onReport(308);
                    return;
                default:
                    return;
            }
        }
    }

    public static void onLoadInfoCorrupted() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(KEY_LOADED_INFO_CORRUPTED);
        }
    }

    public static void onLoadInterpretReport(int i, Throwable th) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            if (i == 0) {
                reporter2.onReport(KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
            } else if (i == 1) {
                reporter2.onReport(KEY_LOADED_INTERPRET_GET_INSTRUCTION_SET_ERROR);
                Reporter reporter3 = reporter;
                reporter3.onReport("Tinker Exception:interpret occur exception " + TinkerUtils.getExceptionCauseString(th));
            } else if (i == 2) {
                reporter2.onReport(KEY_LOADED_INTERPRET_INTERPRET_COMMAND_ERROR);
                Reporter reporter4 = reporter;
                reporter4.onReport("Tinker Exception:interpret occur exception " + TinkerUtils.getExceptionCauseString(th));
            }
        }
    }

    public static void onLoadPackageCheckFail(int i) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            switch (i) {
                case -9:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT);
                    return;
                case ErrorCode.UNKNOWN_ERROR:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_RES_META);
                    return;
                case -7:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL);
                    return;
                case -6:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND);
                    return;
                case -5:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND);
                    return;
                case -4:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_LIB_META);
                    return;
                case -3:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_DEX_META);
                    return;
                case -2:
                    reporter2.onReport(356);
                    return;
                case -1:
                    reporter2.onReport(KEY_LOADED_PACKAGE_CHECK_SIGNATURE);
                    return;
                default:
                    return;
            }
        }
    }

    public static void onLoaded(long j) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(6);
            if (j < 0) {
                TinkerLog.e(TAG, "hp_report report load cost failed, invalid cost", new Object[0]);
            } else if (j <= 500) {
                reporter.onReport(400);
            } else if (j <= 1000) {
                reporter.onReport(KEY_LOADED_SUCC_COST_1000_LESS);
            } else if (j <= 3000) {
                reporter.onReport(KEY_LOADED_SUCC_COST_3000_LESS);
            } else if (j <= WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                reporter.onReport(KEY_LOADED_SUCC_COST_5000_LESS);
            } else {
                reporter.onReport(404);
            }
        }
    }

    public static void onReportRetryPatch() {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(10);
        }
    }

    public static void onTryApply(boolean z) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.onReport(2);
            reporter.onReport(70);
            if (z) {
                reporter.onReport(3);
            }
        }
    }

    public static void onTryApplyFail(int i) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            switch (i) {
                case TinkerUtils.ERROR_PATCH_CONDITION_NOT_SATISFIED /*{ENCODED_INT: -24}*/:
                    reporter2.onReport(80);
                    return;
                case TinkerUtils.ERROR_PATCH_CRASH_LIMIT /*{ENCODED_INT: -23}*/:
                    reporter2.onReport(79);
                    return;
                case TinkerUtils.ERROR_PATCH_MEMORY_LIMIT /*{ENCODED_INT: -22}*/:
                    reporter2.onReport(78);
                    return;
                case TinkerUtils.ERROR_PATCH_ROM_SPACE /*{ENCODED_INT: -21}*/:
                    reporter2.onReport(76);
                    return;
                case TinkerUtils.ERROR_PATCH_GOOGLEPLAY_CHANNEL /*{ENCODED_INT: -20}*/:
                    reporter2.onReport(75);
                    return;
                default:
                    switch (i) {
                        case -6:
                            reporter2.onReport(77);
                            return;
                        case -5:
                            reporter2.onReport(81);
                            return;
                        case -4:
                            reporter2.onReport(73);
                            return;
                        case -3:
                            reporter2.onReport(72);
                            return;
                        case -2:
                            reporter2.onReport(74);
                            return;
                        case -1:
                            reporter2.onReport(71);
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static void onXposedCrash() {
        if (reporter != null) {
            if (ShareTinkerInternals.isVmArt()) {
                reporter.onReport(9);
            } else {
                reporter.onReport(8);
            }
        }
    }

    public void setReporter(Reporter reporter2) {
        reporter = reporter2;
    }
}
