package com.umeng.socialize.net.dplus;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.cache.DplusCacheApi;
import com.umeng.socialize.net.dplus.p278db.DBManager;
import com.umeng.socialize.utils.SLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommonNetImpl implements UMLogDataProtocol {
    public static final String AID = "aid";

    /* renamed from: AM */
    public static final String f10812AM = "am";

    /* renamed from: AS */
    public static final String f10813AS = "as";

    /* renamed from: AT */
    public static final String f10814AT = "at";
    public static final String AUTH = "auth";
    public static final String A_B = "a_b";
    public static final String CANCEL = "cancel";
    public static final String CONTENT = "content";

    /* renamed from: CT */
    public static final String f10815CT = "ct";
    public static final String DAU = "dau";
    public static final String DURL = "durl";
    public static final String E_M = "e_m";
    public static final String FAIL = "fail";
    public static final int FLAG_AUTH = 268435456;
    public static final int FLAG_SHARE = 536870912;
    public static final int FLAG_SHARE_EDIT = 16777216;
    public static final int FLAG_SHARE_JUMP = 33554432;
    public static final String HEADER = "header";
    public static final String IMEI = "imei";
    public static final int MAX_FILE_SIZE_IN_KB = 65536;
    public static final int MAX_SEND_SIZE_IN_KB = 524288;
    public static final int MAX_SIZE_IN_KB = 5242880;
    public static final String MENUBG = "menubg";
    public static final String M_P = "m_p";
    public static final String M_U = "m_u";
    public static final String NAME = "name";
    public static final String PCV = "s_pcv";

    /* renamed from: PF */
    public static final String f10816PF = "pf";
    public static final String PIC = "pic";
    public static final String PICURL = "picurl";
    public static final String POSITION = "position";
    public static final String REGION = "regn";
    public static final String RESULT = "result";
    public static final String SDKT = "sdkt";
    public static final String SDKVERSON = "s_sdk_v";
    public static final String SEX = "sex";
    public static final String SHARE = "share";
    public static final String SHARETYPE = "s_t";

    /* renamed from: SM */
    public static final String f10817SM = "sm";
    public static final String STATS = "stats";
    public static final String STATS_TAG = "stats";
    public static final String STYPE = "stype";
    public static final String SUCCESS = "success";
    public static final String S_A_E = "s_a_e";
    public static final String S_A_S = "s_a_s";
    public static final String S_DAU = "s_dau";
    public static final String S_E = "s_e";
    public static final String S_I = "s_i";
    public static final String S_I_E = "s_i_e";
    public static final String S_I_S = "s_i_s";
    public static final String S_S_E = "s_s_e";
    public static final String S_S_S = "s_s_s";
    public static final String TAG = "tag";
    public static final String TITLE = "title";

    /* renamed from: TS */
    public static final String f10818TS = "ts";
    public static final String UID = "uid";
    public static final String UMID = "umid";

    /* renamed from: UN */
    public static final String f10819UN = "un";
    public static final String UNIONID = "unionid";

    /* renamed from: UP */
    public static final String f10820UP = "up";
    public static final String URL = "url";
    public static final String USERINFO = "userinfo";
    public static final String U_C = "u_c";
    public static boolean isSendStats;
    public static CommonNetImpl singleton;
    public ArrayList<Integer> authList = new ArrayList<>();
    public ArrayList<Integer> dauList = new ArrayList<>();
    public ArrayList<Integer> infoList = new ArrayList<>();
    public Context mConetxt;
    public ArrayList<Integer> shareList = new ArrayList<>();
    public ArrayList<Integer> statsList = new ArrayList<>();

    public CommonNetImpl(Context context) {
        this.mConetxt = context;
    }

    public static JSONObject constructHeader() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s_sdk_v", "7.0.2");
        jSONObject.put(PCV, SocializeConstants.PROTOCOL_VERSON);
        return jSONObject;
    }

    public static CommonNetImpl get(Context context) {
        if (singleton == null) {
            singleton = new CommonNetImpl(context);
        }
        return singleton;
    }

    private JSONObject getObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", constructHeader());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("share", new JSONObject());
            jSONObject.put("content", jSONObject2);
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    private void saveFile(JSONObject jSONObject, int i) {
        if (jSONObject != null) {
            switch (i) {
                case 24577:
                    DBManager.get(this.mConetxt).insertDau(jSONObject);
                    return;
                case SocializeConstants.SHARE_EVENT:
                    DBManager.get(this.mConetxt).insertS_E(jSONObject);
                    return;
                case SocializeConstants.AUTH_EVENT:
                    DBManager.get(this.mConetxt).insertAuth(jSONObject);
                    return;
                case SocializeConstants.GET_EVENT:
                    DBManager.get(this.mConetxt).insertUserInfo(jSONObject);
                    return;
                case SocializeConstants.SAVE_STATS_EVENT:
                case SocializeConstants.SEND_DAU_STATS_EVENT:
                    DBManager.get(this.mConetxt).insertStats(jSONObject);
                    return;
                case SocializeConstants.CHECK_STATS_EVENT:
                default:
                    DBManager.get(this.mConetxt).insertStats(jSONObject);
                    return;
            }
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        if (this.shareList.size() > 0) {
            DBManager.get(this.mConetxt).delete(this.shareList, "s_e");
            this.shareList.clear();
        }
        if (this.authList.size() > 0) {
            DBManager.get(this.mConetxt).delete(this.authList, "auth");
            this.authList.clear();
        }
        if (this.dauList.size() > 0) {
            DBManager.get(this.mConetxt).delete(this.dauList, "dau");
            this.dauList.clear();
        }
        if (this.infoList.size() > 0) {
            DBManager.get(this.mConetxt).delete(this.infoList, "userinfo");
            this.infoList.clear();
        }
        if (this.statsList.size() > 0) {
            isSendStats = false;
            DBManager.get(this.mConetxt).delete(this.statsList, "stats");
            this.statsList.clear();
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        JSONArray jSONArray5;
        JSONArray jSONArray6;
        double d = (double) j;
        boolean z = d <= DplusCacheApi.checkFile() + 24576.0d;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("header", constructHeader());
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            DBManager dBManager = DBManager.get(this.mConetxt);
            ArrayList<Integer> arrayList = this.shareList;
            Double.isNaN(d);
            JSONArray select = dBManager.select("s_e", arrayList, d - 1024.0d, z);
            double length = (double) select.toString().getBytes().length;
            Double.isNaN(length);
            double d2 = length + 1024.0d;
            DBManager dBManager2 = DBManager.get(this.mConetxt);
            ArrayList<Integer> arrayList2 = this.authList;
            Double.isNaN(d);
            JSONArray select2 = dBManager2.select("auth", arrayList2, d - d2, z);
            double length2 = (double) select2.toString().getBytes().length;
            Double.isNaN(length2);
            double d3 = d2 + length2;
            DBManager dBManager3 = DBManager.get(this.mConetxt);
            ArrayList<Integer> arrayList3 = this.infoList;
            Double.isNaN(d);
            JSONArray select3 = dBManager3.select("userinfo", arrayList3, d - d3, z);
            double length3 = (double) select3.toString().getBytes().length;
            Double.isNaN(length3);
            double d4 = d3 + length3;
            DBManager dBManager4 = DBManager.get(this.mConetxt);
            ArrayList<Integer> arrayList4 = this.dauList;
            Double.isNaN(d);
            JSONArray select4 = dBManager4.select("dau", arrayList4, d - d4, z);
            double length4 = (double) select4.toString().getBytes().length;
            Double.isNaN(length4);
            double d5 = d4 + length4;
            double checkFile = DplusCacheApi.checkFile();
            if (select4.length() != 0) {
                jSONObject4.put("dau", select4);
            }
            if (select.length() != 0) {
                jSONArray = select;
                jSONObject4.put("s_e", jSONArray);
            } else {
                jSONArray = select;
            }
            if (select2.length() != 0) {
                jSONArray2 = select2;
                jSONObject4.put("auth", jSONArray2);
            } else {
                jSONArray2 = select2;
            }
            if (select3.length() != 0) {
                jSONArray3 = select3;
                jSONObject4.put("userinfo", jSONArray3);
            } else {
                jSONArray3 = select3;
            }
            JSONArray jSONArray7 = new JSONArray();
            if (checkFile >= 524288.0d || isSendStats) {
                DBManager dBManager5 = DBManager.get(this.mConetxt);
                ArrayList<Integer> arrayList5 = this.statsList;
                Double.isNaN(d);
                double d6 = d - d5;
                jSONArray5 = jSONArray;
                jSONArray4 = jSONArray2;
                jSONArray6 = select4;
                jSONArray7 = dBManager5.select("stats", arrayList5, d6, z);
                if (jSONArray7.length() != 0) {
                    jSONObject4.put("stats", jSONArray7);
                }
            } else {
                jSONArray5 = jSONArray;
                jSONArray4 = jSONArray2;
                jSONArray6 = select4;
            }
            jSONObject3.put("share", jSONObject4);
            jSONObject2.put("content", jSONObject3);
            jSONObject = jSONObject2;
            if (jSONArray5.length() == 0) {
                jSONObject = jSONObject2;
                if (jSONArray4.length() == 0) {
                    jSONObject = jSONObject2;
                    if (jSONArray3.length() == 0) {
                        jSONObject = jSONObject2;
                        if (jSONArray6.length() == 0) {
                            jSONObject = jSONObject2;
                            if (jSONArray7.length() == 0) {
                                jSONObject = null;
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            SLog.error(e);
            jSONObject = jSONObject2;
        }
        return (jSONObject == null || ((long) jSONObject.toString().getBytes().length) > j) ? null : null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        JSONObject object;
        if (i == 24585 && (object = getObject()) != null) {
            JSONObject optJSONObject = object.optJSONObject("header");
            JSONObject optJSONObject2 = object.optJSONObject("content");
            if (optJSONObject != null && optJSONObject2 != null) {
                UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.mConetxt, optJSONObject, optJSONObject2);
            }
        }
    }
}
