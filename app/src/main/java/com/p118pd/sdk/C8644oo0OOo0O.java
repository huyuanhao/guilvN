package com.p118pd.sdk;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.jinhui365.hotsources.bean.StringHotVO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0OOo0O  reason: case insensitive filesystem */
public class C8644oo0OOo0O {
    public static C8644oo0OOo0O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8626oo0OO000 f21766OooO00o = new OooO00o(C8653oo0Oo0.OooO0oo);

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, StringHotVO> f21767OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.oo0OOo0O$OooO00o */
    public class OooO00o extends AbstractC8626oo0OO000 {
        public OooO00o(String str) {
            super(str);
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str, String str2, HotSourceVO hotSourceVO) {
            if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0oo)) {
                C8644oo0OOo0O.this.OooO00o(str2);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO0O0(String str, String str2, HotSourceVO hotSourceVO) {
            if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0oo)) {
                C8644oo0OOo0O.this.OooO00o(str2);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void onFailure(String str, String str2) {
            if (str.equals(C8653oo0Oo0.OooO0oo)) {
                C8644oo0OOo0O.this.f21767OooO00o.clear();
            }
        }
    }

    public void OooO0O0(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("config/hotstring.json")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f21767OooO00o = C9041ooOoOO0.OooO00o(sb.toString(), String.class, StringHotVO.class);
    }

    public static C8644oo0OOo0O OooO00o() {
        if (OooO00o == null) {
            synchronized (C8644oo0OOo0O.class) {
                OooO00o = new C8644oo0OOo0O();
            }
        }
        return OooO00o;
    }

    public void OooO00o(Context context) {
        C8653oo0Oo0 OooO00o2 = C8653oo0Oo0.OooO00o(context);
        OooO00o2.OooO00o(this.f21766OooO00o);
        OooO00o2.OooO00o(C8653oo0Oo0.OooO0oo, 1);
    }

    public void OooO00o(String str) {
        this.f21767OooO00o = C9041ooOoOO0.OooO00o(C8640oo0OOOoo.OooO00o(str), String.class, StringHotVO.class);
    }

    public String OooO00o(String str, String str2) {
        return OooO00o(str, str2, (Object) null);
    }

    public String OooO00o(String str, String str2, Object obj, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return OooO00o(str, str2, obj);
    }

    public String OooO00o(String str, String str2, Object... objArr) {
        return OooO00o(str, str2, (Object) null, objArr);
    }

    public String OooO00o(String str, String str2, Object obj) {
        StringHotVO stringHotVO;
        Map<String, StringHotVO> map = this.f21767OooO00o;
        return (map == null || map.isEmpty() || !this.f21767OooO00o.containsKey(str2) || (stringHotVO = this.f21767OooO00o.get(str2)) == null) ? str : OooO00o(stringHotVO, obj);
    }

    public SpannableStringBuilder OooO00o(String str, String str2, Object obj, int i) {
        return C8642oo0OOo0.OooO00o(C8625oo0OO00.OooO00o().OooO00o, OooO00o(str, str2, obj), i);
    }

    private String OooO00o(StringHotVO stringHotVO, Object obj) {
        String format = stringHotVO.getFormat();
        if (!stringHotVO.isHasArgs()) {
            return format;
        }
        List<StringHotVO.ArgsBean> args = stringHotVO.getArgs();
        Object[] objArr = new Object[args.size()];
        for (int i = 0; i < args.size(); i++) {
            try {
                objArr[i] = OooO00o(args.get(i), obj.getClass().getDeclaredMethod(args.get(i).getKey(), new Class[0]).invoke(obj, new Object[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return String.format(format, objArr);
    }

    private Object OooO00o(StringHotVO.ArgsBean argsBean, Object obj) {
        try {
            if (argsBean.isHasFuncs()) {
                StringHotVO.ArgsBean.FuncsBean funcs = argsBean.getFuncs();
                Class<?> cls = Class.forName(funcs.getClazz());
                return OooO00o(funcs, cls.getConstructor(new Class[0]).newInstance(new Object[0]), OooO00o((Class) cls, funcs.getMethod()), obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    private Object OooO00o(StringHotVO.ArgsBean.FuncsBean funcsBean, Object obj, Method method, Object obj2) {
        if (method == null) {
            return obj2;
        }
        try {
            if (funcsBean.isHasParams()) {
                Object[] objArr = new Object[funcsBean.getParams().size()];
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                for (int i = 0; i < funcsBean.getParams().size(); i++) {
                    if ("$1".equals(funcsBean.getParams().get(i))) {
                        objArr[i] = OooO00o(genericParameterTypes[i], obj2);
                    } else {
                        objArr[i] = OooO00o(genericParameterTypes[i], funcsBean.getParams().get(i));
                    }
                }
                return method.invoke(obj, objArr);
            }
            return method.invoke(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
            return obj2;
        }
    }

    private Object OooO00o(Type type, Object obj) {
        if ("int".equals(type.toString())) {
            return Integer.valueOf(C8642oo0OOo0.m20260OooO00o(obj.toString()));
        }
        if ("long".equals(type.toString())) {
            return Long.valueOf(C8642oo0OOo0.m20261OooO00o(obj.toString()));
        }
        if ("double".equals(type.toString())) {
            return Double.valueOf(C8642oo0OOo0.OooO00o(obj.toString()));
        }
        return "float".equals(type.toString()) ? Float.valueOf(C8642oo0OOo0.m20259OooO00o(obj.toString())) : obj;
    }

    private Method OooO00o(Class cls, String str) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }
}
