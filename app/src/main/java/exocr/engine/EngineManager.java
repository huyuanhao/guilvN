package exocr.engine;

import android.app.Activity;
import exocr.exocrengine.DictManager;
import exocr.exocrengine.EXOCREngine;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class EngineManager {
    public final String[] OooO00o;
    public final String[] OooO0O0;

    public static class LazyHolder {
        public static EngineManager OooO00o = new EngineManager();
    }

    public static EngineManager OooO00o() {
        return LazyHolder.OooO00o;
    }

    public String OooO0O0() {
        return "4.0.1";
    }

    public EngineManager() {
        this.OooO00o = new String[]{"北京市", "天津市", "河北省", "山西省", "内蒙古", "辽宁省", "吉林省", "黑龙江省", "上海市", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西", "海南省", "重庆市", "四川省", "贵州省", "云南省", "西藏", "陕西省", "甘肃省", "青海省", "宁夏", "新疆", "香港", "澳门", "台湾"};
        this.OooO0O0 = new String[]{"省", "市", "自治州", "区", "县", "镇", "乡", "村", "街", "道", "路", "广场", "大学", "室", "栋", "弄", "胡同", "号", "院", "楼", "幢", "座"};
    }

    public void OooO00o(Activity activity) {
        DictManager.OooO00o(activity);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22028OooO00o() {
        DictManager.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m22027OooO00o() {
        byte[] bArr = new byte[128];
        if (EXOCREngine.nativeGetVersion(bArr) == 0) {
            try {
                return new String(bArr, "GB2312");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public List<String> OooO00o(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        char[] charArray = str.toCharArray();
        String str2 = new String(charArray);
        ArrayList arrayList = new ArrayList();
        int length = charArray.length;
        int i = length - 1;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = 0;
        }
        if (str2.contains("中国")) {
            cArr[(str2.lastIndexOf("中国") + 2) - 1] = 1;
        }
        int i3 = 0;
        while (true) {
            String[] strArr = this.OooO00o;
            if (i3 >= strArr.length) {
                break;
            }
            String str3 = strArr[i3];
            if (str2.contains(str3)) {
                cArr[(str2.lastIndexOf(str3) + str3.length()) - 1] = 1;
                break;
            }
            i3++;
        }
        int i4 = i;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.OooO0O0;
            if (i5 >= strArr2.length) {
                break;
            }
            String str4 = strArr2[i5];
            while (i4 > 0) {
                String str5 = new String(charArray, 0, i4);
                if (!str5.contains(str4)) {
                    break;
                }
                cArr[(str5.lastIndexOf(str4) + str4.length()) - 1] = 1;
                i4 = str5.lastIndexOf(str4);
            }
            i5++;
            i4 = length;
        }
        for (int i6 = 0; i6 < i; i6++) {
            if (cArr[i6] != 0 && cArr[i6 + 1] == 1) {
                cArr[i6] = 0;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (cArr[i8] == 1) {
                arrayList.add(new String(charArray, i7, (i8 - i7) + 1));
                i7 = i8 + 1;
            }
        }
        if (i7 < length) {
            arrayList.add(new String(charArray, i7, length - i7));
        }
        return arrayList;
    }
}
