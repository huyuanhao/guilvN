package com.p118pd.sdk;

import anet.channel.util.HttpConstant;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* renamed from: com.pd.sdk.ooo0oooo  reason: case insensitive filesystem */
public class RunnableC9106ooo0oooo implements Runnable {
    public static final /* synthetic */ boolean OooO0O0 = (!RunnableC9106ooo0oooo.class.desiredAssertionStatus());
    public final Object[] OooO00o;
    public final int o00oO0O;

    public RunnableC9106ooo0oooo(int i) {
        this.o00oO0O = i;
        this.OooO00o = null;
    }

    public final boolean OooO00o() {
        int i = this.o00oO0O;
        if (i == 451 || i == 452) {
            return C9278ooooo0.m21181OooO00o(this.o00oO0O, this.OooO00o);
        }
        switch (i) {
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_DEX_META /*{ENCODED_INT: 351}*/:
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META /*{ENCODED_INT: 352}*/:
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND /*{ENCODED_INT: 353}*/:
            case TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND /*{ENCODED_INT: 354}*/:
                return C9110oooO000.m20777OooO00o(i, this.OooO00o);
            default:
                switch (i) {
                    case 751:
                    case 752:
                    case 753:
                        return C9142oooO0oO0.OooO00o(i, this.OooO00o);
                    default:
                        C9090ooOooo0O.OooO0Oo("crashsdk", "Unknown sync runnable: " + toString());
                        if (OooO0O0) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    public void run() {
        int i = this.o00oO0O;
        if (i == 10) {
            C9146oooO0oo0.OooO00o(i, this.OooO00o);
        } else if (i == 500) {
            C9094ooOoooOO.OooO00o(i);
        } else if (i == 700) {
            C9142oooO0oO0.OooO0O0(i);
        } else if (i == 800) {
            C9111oooO0000.OooO00o(i);
        } else if (i == 201 || i == 202) {
            C9119oooO00o0.OooO00o(this.o00oO0O);
        } else {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    C9112oooO000O.OooO00o(i);
                    return;
                default:
                    switch (i) {
                        case 301:
                        case 302:
                        case 303:
                            C9110oooO000.OooO00o(i, this.OooO00o);
                            return;
                        default:
                            switch (i) {
                                case TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS /*{ENCODED_INT: 401}*/:
                                case TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS /*{ENCODED_INT: 402}*/:
                                case TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS /*{ENCODED_INT: 403}*/:
                                    break;
                                default:
                                    switch (i) {
                                        case C8713oo0o0o.OooO0o:
                                        case 406:
                                        case 407:
                                        case 408:
                                        case 409:
                                        case 410:
                                        case 411:
                                        case 412:
                                        case 413:
                                        case 414:
                                        case 415:
                                        case HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE:
                                            break;
                                        default:
                                            C9090ooOooo0O.OooO0Oo("crashsdk", "Unknown async runnable: " + toString());
                                            if (!OooO0O0) {
                                                throw new AssertionError();
                                            }
                                            return;
                                    }
                            }
                            C9278ooooo0.OooO00o(this.o00oO0O, this.OooO00o);
                            return;
                    }
            }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.o00oO0O;
    }

    public RunnableC9106ooo0oooo(int i, Object[] objArr) {
        this.o00oO0O = i;
        this.OooO00o = objArr;
    }
}
