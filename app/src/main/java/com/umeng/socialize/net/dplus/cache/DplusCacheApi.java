package com.umeng.socialize.net.dplus.cache;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.dplus.p278db.DBConfig;
import com.umeng.socialize.net.dplus.p278db.DBManager;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DplusCacheApi {

    /* renamed from: a */
    public static final String f10834a = "DplusCacheApi";

    /* renamed from: b */
    public HandlerThread f10835b;

    /* renamed from: c */
    public Handler f10836c;

    /* renamed from: d */
    public final int f10837d;

    /* renamed from: e */
    public ArrayList<Integer> f10838e;

    /* renamed from: f */
    public ArrayList<Integer> f10839f;

    /* renamed from: g */
    public ArrayList<Integer> f10840g;

    /* renamed from: h */
    public ArrayList<Integer> f10841h;

    /* renamed from: i */
    public ArrayList<Integer> f10842i;

    public static class SingletonHolder {

        /* renamed from: a */
        public static final DplusCacheApi f10857a = new DplusCacheApi();
    }

    public static double checkFile() {
        File dataFile = ContextUtil.getDataFile(DBConfig.DB_NAME);
        if (dataFile == null || !dataFile.exists()) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        return (double) dataFile.length();
    }

    public static final DplusCacheApi getInstance() {
        return SingletonHolder.f10857a;
    }

    public void closeDBConnection(final Context context) {
        this.f10836c.post(new Runnable() {
            /* class com.umeng.socialize.net.dplus.cache.DplusCacheApi.RunnableC39801 */

            public void run() {
                DBManager.get(context).closeDatabase();
            }
        });
    }

    public void deleteAll(Context context) {
        this.f10836c.post(new Runnable() {
            /* class com.umeng.socialize.net.dplus.cache.DplusCacheApi.RunnableC39845 */

            public void run() {
                DBManager.get(ContextUtil.getContext()).deleteTable("stats");
            }
        });
    }

    public void deleteAllAsnc(Context context) {
        DBManager.get(ContextUtil.getContext()).deleteTable("stats");
    }

    public void deleteFile(final Context context) {
        this.f10836c.post(new Runnable() {
            /* class com.umeng.socialize.net.dplus.cache.DplusCacheApi.RunnableC39834 */

            public void run() {
                if (DplusCacheApi.this.f10838e.size() > 0) {
                    DBManager.get(context).delete(DplusCacheApi.this.f10838e, "s_e");
                    DplusCacheApi.this.f10838e.clear();
                }
                if (DplusCacheApi.this.f10839f.size() > 0) {
                    DBManager.get(context).delete(DplusCacheApi.this.f10839f, "auth");
                    DplusCacheApi.this.f10839f.clear();
                }
                if (DplusCacheApi.this.f10841h.size() > 0) {
                    DBManager.get(context).delete(DplusCacheApi.this.f10841h, "dau");
                    DplusCacheApi.this.f10841h.clear();
                }
                if (DplusCacheApi.this.f10840g.size() > 0) {
                    DBManager.get(context).delete(DplusCacheApi.this.f10840g, "userinfo");
                    DplusCacheApi.this.f10840g.clear();
                }
                if (DplusCacheApi.this.f10842i.size() > 0) {
                    DBManager.get(context).delete(DplusCacheApi.this.f10842i, "stats");
                    DplusCacheApi.this.f10842i.clear();
                }
            }
        });
    }

    public void deleteFileAsnc(Context context) {
        if (this.f10838e.size() > 0) {
            DBManager.get(context).delete(this.f10838e, "s_e");
            this.f10838e.clear();
        }
        if (this.f10839f.size() > 0) {
            DBManager.get(context).delete(this.f10839f, "auth");
            this.f10839f.clear();
        }
        if (this.f10841h.size() > 0) {
            DBManager.get(context).delete(this.f10841h, "dau");
            this.f10841h.clear();
        }
        if (this.f10840g.size() > 0) {
            DBManager.get(context).delete(this.f10840g, "userinfo");
            this.f10840g.clear();
        }
        if (this.f10842i.size() > 0) {
            DBManager.get(context).delete(this.f10842i, "stats");
            this.f10842i.clear();
        }
    }

    public void readFile(final Context context, final int i, final DplusCacheListener dplusCacheListener) {
        this.f10836c.post(new Runnable() {
            /* class com.umeng.socialize.net.dplus.cache.DplusCacheApi.RunnableC39823 */

            public void run() {
                JSONArray jSONArray;
                JSONArray jSONArray2;
                JSONArray jSONArray3;
                JSONArray jSONArray4;
                JSONArray jSONArray5;
                JSONArray jSONArray6;
                double checkFile = DplusCacheApi.checkFile();
                if (checkFile >= 5242880.0d) {
                    DBManager.get(ContextUtil.getContext()).deleteTable("stats");
                    return;
                }
                boolean z = 1048576.0d <= checkFile + 24576.0d;
                JSONObject jSONObject = new JSONObject();
                try {
                    new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray select = DBManager.get(context).select("s_e", DplusCacheApi.this.f10838e, 1047552.0d, z);
                    double length = (double) select.toString().getBytes().length;
                    Double.isNaN(length);
                    double d = 1024.0d + length;
                    JSONArray select2 = DBManager.get(context).select("auth", DplusCacheApi.this.f10839f, 1048576.0d - d, z);
                    double length2 = (double) select2.toString().getBytes().length;
                    Double.isNaN(length2);
                    double d2 = d + length2;
                    JSONArray select3 = DBManager.get(context).select("userinfo", DplusCacheApi.this.f10840g, 1048576.0d - d2, z);
                    double length3 = (double) select3.toString().getBytes().length;
                    Double.isNaN(length3);
                    double d3 = d2 + length3;
                    JSONArray select4 = DBManager.get(context).select("dau", DplusCacheApi.this.f10841h, 1048576.0d - d3, z);
                    double length4 = (double) select4.toString().getBytes().length;
                    Double.isNaN(length4);
                    double d4 = d3 + length4;
                    double checkFile2 = DplusCacheApi.checkFile();
                    if (select4.length() != 0) {
                        jSONObject2.put("dau", select4);
                    }
                    if (select.length() != 0) {
                        jSONArray = select;
                        jSONObject2.put("s_e", jSONArray);
                    } else {
                        jSONArray = select;
                    }
                    if (select2.length() != 0) {
                        jSONArray2 = select2;
                        jSONObject2.put("auth", jSONArray2);
                    } else {
                        jSONArray2 = select2;
                    }
                    if (select3.length() != 0) {
                        jSONArray3 = select3;
                        jSONObject2.put("userinfo", jSONArray3);
                    } else {
                        jSONArray3 = select3;
                    }
                    JSONArray jSONArray7 = new JSONArray();
                    if (checkFile2 >= 524288.0d || i == 24583) {
                        double d5 = 1048576.0d - d4;
                        jSONArray5 = jSONArray;
                        jSONArray4 = jSONArray2;
                        jSONArray6 = select4;
                        jSONArray7 = DBManager.get(context).select("stats", DplusCacheApi.this.f10842i, d5, z);
                        if (jSONArray7.length() != 0) {
                            jSONObject2.put("stats", jSONArray7);
                        }
                    } else {
                        jSONArray5 = jSONArray;
                        jSONArray4 = jSONArray2;
                        jSONArray6 = select4;
                    }
                    jSONObject.put("share", jSONObject2);
                    if (jSONArray5.length() == 0 && jSONArray4.length() == 0 && jSONArray3.length() == 0 && jSONArray6.length() == 0 && jSONArray7.length() == 0) {
                        jSONObject = null;
                    }
                } catch (JSONException e) {
                    SLog.error(UmengText.CACHE.CACHEFILE, e);
                }
                if (jSONObject != null && ((double) jSONObject.toString().getBytes().length) > 1048576.0d) {
                    dplusCacheListener.onResult(null);
                }
                dplusCacheListener.onResult(jSONObject);
            }
        });
    }

    public JSONObject readFileAsnc(Context context, int i) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        JSONArray jSONArray5;
        JSONArray jSONArray6;
        double checkFile = checkFile();
        if (checkFile >= 5242880.0d) {
            DBManager.get(ContextUtil.getContext()).deleteTable("stats");
            return null;
        }
        boolean z = 1048576.0d <= checkFile + 24576.0d;
        JSONObject jSONObject = new JSONObject();
        try {
            new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray select = DBManager.get(context).select("s_e", this.f10838e, 1047552.0d, z);
            double length = (double) select.toString().getBytes().length;
            Double.isNaN(length);
            double d = 1024.0d + length;
            JSONArray select2 = DBManager.get(context).select("auth", this.f10839f, 1048576.0d - d, z);
            double length2 = (double) select2.toString().getBytes().length;
            Double.isNaN(length2);
            double d2 = d + length2;
            JSONArray select3 = DBManager.get(context).select("userinfo", this.f10840g, 1048576.0d - d2, z);
            double length3 = (double) select3.toString().getBytes().length;
            Double.isNaN(length3);
            double d3 = d2 + length3;
            JSONArray select4 = DBManager.get(context).select("dau", this.f10841h, 1048576.0d - d3, z);
            double length4 = (double) select4.toString().getBytes().length;
            Double.isNaN(length4);
            double d4 = d3 + length4;
            double checkFile2 = checkFile();
            if (select4.length() != 0) {
                jSONObject2.put("dau", select4);
            }
            if (select.length() != 0) {
                jSONArray = select;
                jSONObject2.put("s_e", jSONArray);
            } else {
                jSONArray = select;
            }
            if (select2.length() != 0) {
                jSONArray2 = select2;
                jSONObject2.put("auth", jSONArray2);
            } else {
                jSONArray2 = select2;
            }
            if (select3.length() != 0) {
                jSONArray3 = select3;
                jSONObject2.put("userinfo", jSONArray3);
            } else {
                jSONArray3 = select3;
            }
            JSONArray jSONArray7 = new JSONArray();
            if (checkFile2 >= 524288.0d || i == 24583) {
                double d5 = 1048576.0d - d4;
                jSONArray5 = jSONArray;
                jSONArray4 = jSONArray2;
                jSONArray6 = select4;
                jSONArray7 = DBManager.get(context).select("stats", this.f10842i, d5, z);
                if (jSONArray7.length() != 0) {
                    jSONObject2.put("stats", jSONArray7);
                }
            } else {
                jSONArray5 = jSONArray;
                jSONArray4 = jSONArray2;
                jSONArray6 = select4;
            }
            jSONObject.put("share", jSONObject2);
            if (jSONArray5.length() == 0 && jSONArray4.length() == 0 && jSONArray3.length() == 0 && jSONArray6.length() == 0 && jSONArray7.length() == 0) {
                jSONObject = null;
            }
        } catch (JSONException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
        if (jSONObject == null || ((double) jSONObject.toString().getBytes().length) <= 1048576.0d) {
            return jSONObject;
        }
        return null;
    }

    public void saveFile(final Context context, final JSONObject jSONObject, final int i, final DplusCacheListener dplusCacheListener) {
        this.f10836c.post(new Runnable() {
            /* class com.umeng.socialize.net.dplus.cache.DplusCacheApi.RunnableC39812 */

            public void run() {
                switch (i) {
                    case 24577:
                        DBManager.get(context).insertDau(jSONObject);
                        break;
                    case SocializeConstants.SHARE_EVENT:
                        DBManager.get(context).insertS_E(jSONObject);
                        break;
                    case SocializeConstants.AUTH_EVENT:
                        DBManager.get(context).insertAuth(jSONObject);
                        break;
                    case SocializeConstants.GET_EVENT:
                        DBManager.get(context).insertUserInfo(jSONObject);
                        break;
                    case SocializeConstants.SAVE_STATS_EVENT:
                    case SocializeConstants.SEND_DAU_STATS_EVENT:
                        DBManager.get(context).insertStats(jSONObject);
                        break;
                    case SocializeConstants.CHECK_STATS_EVENT:
                    default:
                        DBManager.get(context).insertStats(jSONObject);
                        break;
                }
                dplusCacheListener.onResult(null);
            }
        });
    }

    public DplusCacheApi() {
        this.f10837d = 1048576;
        this.f10838e = new ArrayList<>();
        this.f10839f = new ArrayList<>();
        this.f10840g = new ArrayList<>();
        this.f10841h = new ArrayList<>();
        this.f10842i = new ArrayList<>();
        HandlerThread handlerThread = new HandlerThread(f10834a, 10);
        this.f10835b = handlerThread;
        handlerThread.start();
        this.f10836c = new Handler(this.f10835b.getLooper());
    }

    /* renamed from: a */
    public static JSONObject m10844a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s_sdk_v", "7.0.2");
        jSONObject.put(CommonNetImpl.PCV, SocializeConstants.PROTOCOL_VERSON);
        return jSONObject;
    }
}
