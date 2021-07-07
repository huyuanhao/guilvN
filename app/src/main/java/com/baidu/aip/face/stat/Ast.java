package com.baidu.aip.face.stat;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.baidu.aip.face.stat.NetUtil;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.baidu.idl.facesdk.FaceInfo;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.google.gson.internal.bind.TypeAdapters;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Ast {
    public static final String AS_FILE_NAME = "ast";
    public static final String FACE_HIT_KEY_LASSTTIME = "FACE_HIT_KEY_LASSTTIME";
    public static final long SAVE_INTERVAL = 15000;
    public static final long UPADTE_DEFUALT_DELAY_TIME = 15000;
    public static final String UPLOAD_LASSTTIME = "UPLOAD_LASSTTIME";
    public static Ast instance;
    public File asFile;
    public Context context;
    public Dev dev;

    /* renamed from: es */
    public ExecutorService f945es = Executors.newSingleThreadExecutor();
    public String faceHitKey = "";
    public SparseArray<Integer> faceIds = new SparseArray<>();
    public Future future = null;
    public boolean isInit;
    public long lastSavetime;
    public Properties properties;
    public String scene;

    private void clear() {
        this.properties.clear();
    }

    private String generateFaceHitKey(String str) {
        return new SimpleDateFormat("yyyy_MM_dd_HH").format(new Date()) + "_" + str;
    }

    public static Ast getInstance() {
        if (instance == null) {
            synchronized (Ast.class) {
                instance = new Ast();
            }
        }
        return instance;
    }

    private boolean initFile() {
        this.asFile = new File(this.context.getFilesDir(), AS_FILE_NAME);
        this.properties = new Properties();
        if (!FileUtil.createFile(this.asFile)) {
            return false;
        }
        return FileUtil.loadPropertiesFile(this.asFile, this.properties);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void netRequest() {
        if (this.properties.size() != 0) {
            NetUtil.uploadData(new NetUtil.RequestAdapter<Object>() {
                /* class com.baidu.aip.face.stat.Ast.C04102 */

                @Override // com.baidu.aip.face.stat.NetUtil.RequestAdapter
                public String getRequestString() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("mh", "faceSdkStatistic");
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry : ((Properties) Ast.this.properties.clone()).entrySet()) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            if (!str.equalsIgnoreCase(Ast.FACE_HIT_KEY_LASSTTIME)) {
                                if (!str.equalsIgnoreCase(Ast.UPLOAD_LASSTTIME)) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", "facesdk");
                                    jSONObject2.put("scene", Ast.this.scene);
                                    jSONObject2.put(ConstantHelper.LOG_APPID, Ast.this.dev.getPackagename());
                                    jSONObject2.put("device", Ast.this.dev.getBrand());
                                    jSONObject2.put("imei", Ast.this.dev.getUniqueID());
                                    jSONObject2.put("os", "Android");
                                    jSONObject2.put(ConstantHelper.LOG_OS, Ast.this.dev.getSysVersion());
                                    jSONObject2.put("version", Ast.this.dev.getSdkVersion());
                                    if (str.contains("liveness")) {
                                        jSONObject2.put("isliving", "true");
                                    } else {
                                        jSONObject2.put("isliving", "false");
                                    }
                                    jSONObject2.put(ConstantHelper.LOG_FINISH, "1");
                                    String[] split = str.split("_");
                                    if (split.length > 4) {
                                        jSONObject2.put(TypeAdapters.C104427.YEAR, split[0]);
                                        jSONObject2.put(TypeAdapters.C104427.MONTH, split[1]);
                                        jSONObject2.put("day", split[2]);
                                        jSONObject2.put(TimePickerDialogModule.ARG_HOUR, split[3]);
                                    }
                                    jSONObject2.put("num", str2);
                                    jSONArray.put(jSONObject2);
                                }
                            }
                        }
                        jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_DT, jSONArray);
                        return jSONObject.toString();
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return "";
                    }
                }

                @Override // com.baidu.aip.face.stat.NetUtil.RequestAdapter
                public String getURL() {
                    return "http://brain.baidu.com/record/api";
                }

                @Override // com.baidu.aip.face.stat.NetUtil.RequestAdapter
                public void parseResponse(InputStream inputStream) throws IOException, JSONException {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } finally {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    byteArrayOutputStream.flush();
                    if (new JSONObject(new String(byteArrayOutputStream.toByteArray(), "UTF-8")).optInt("code") == 0) {
                        Ast.this.properties.clear();
                        Ast.this.dev.setFirstRun(false);
                        FileUtil.savePropertiesFile(Ast.this.asFile, Ast.this.properties);
                        Ast.this.properties.setProperty(Ast.UPLOAD_LASSTTIME, String.valueOf(System.currentTimeMillis()));
                    }
                }
            });
        }
    }

    private void sendData() {
        Future future2 = this.future;
        if (future2 == null || future2.isDone()) {
            this.future = this.f945es.submit(new Runnable() {
                /* class com.baidu.aip.face.stat.Ast.RunnableC04091 */

                public void run() {
                    Ast.this.netRequest();
                }
            });
        }
    }

    public void faceHit(String str, int i, FaceInfo[] faceInfoArr) {
        if (faceInfoArr == null) {
            this.faceIds.clear();
            return;
        }
        int i2 = 0;
        for (FaceInfo faceInfo : faceInfoArr) {
            if (this.faceIds.get(faceInfo.face_id) == null) {
                SparseArray<Integer> sparseArray = this.faceIds;
                int i3 = faceInfo.face_id;
                sparseArray.put(i3, Integer.valueOf(i3));
                i2++;
            }
        }
        if (i2 != 0) {
            faceHit(str, (long) i, i2);
        }
    }

    public void immediatelyUpload() {
        sendData();
    }

    public boolean init(Context context2, String str, String str2) {
        if (!this.isInit && context2 != null) {
            this.context = context2.getApplicationContext();
            Dev dev2 = new Dev();
            this.dev = dev2;
            dev2.init(context2);
            this.dev.setSdkVersion(str);
            this.scene = str2;
            initFile();
        }
        return true;
    }

    public void faceHit() {
        faceHit("liveness", 15000, 1);
    }

    public void faceHit(String str) {
        faceHit(str, 15000, 1);
    }

    public void faceHit(String str, int i) {
        faceHit(str, 15000, i);
    }

    public void faceHit(String str, long j, int i) {
        long j2;
        String generateFaceHitKey = generateFaceHitKey(str);
        String property = this.properties.getProperty(generateFaceHitKey);
        if (TextUtils.isEmpty(property)) {
            this.properties.setProperty(generateFaceHitKey, String.valueOf(i));
            this.properties.setProperty(FACE_HIT_KEY_LASSTTIME, String.valueOf(System.currentTimeMillis()));
        } else {
            this.properties.setProperty(generateFaceHitKey, String.valueOf(Integer.parseInt(property) + i));
        }
        long j3 = 0;
        try {
            j2 = Long.parseLong(this.properties.getProperty(FACE_HIT_KEY_LASSTTIME));
        } catch (Exception e) {
            e.printStackTrace();
            j2 = 0;
        }
        if (System.currentTimeMillis() - j2 > 15000) {
            System.currentTimeMillis();
            FileUtil.savePropertiesFile(this.asFile, this.properties);
            this.properties.setProperty(FACE_HIT_KEY_LASSTTIME, String.valueOf(System.currentTimeMillis()));
        }
        try {
            j3 = Long.parseLong(this.properties.getProperty(UPLOAD_LASSTTIME));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.dev.getFirstRun() || System.currentTimeMillis() - j3 >= j) {
            sendData();
        }
    }
}
