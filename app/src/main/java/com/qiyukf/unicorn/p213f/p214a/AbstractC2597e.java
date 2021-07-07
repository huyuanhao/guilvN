package com.qiyukf.unicorn.p213f.p214a;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.taobao.agoo.p265a.p266a.AbstractC3199b;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.e */
public abstract class AbstractC2597e extends AbstractC2558d {
    private void fromObject(JSONObject jSONObject, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            AbstractC2548a aVar = (AbstractC2548a) field.getAnnotation(AbstractC2548a.class);
            if (aVar != null) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        jSONObject.put(aVar.mo35940a(), toJSONable(obj2));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002c */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    private Object toJSONable(Object obj) {
        if (obj instanceof AbstractC2498a) {
            return fromAttachObject((AbstractC2498a) obj);
        }
        if (obj instanceof List) {
            obj = (List) obj;
            for (int i = 0; i < obj.size(); i++) {
                Object obj2 = obj.get(i);
                if (obj2 instanceof AbstractC2498a) {
                    obj.set(i, fromAttachObject((AbstractC2498a) obj2));
                }
            }
        }
        return obj;
    }

    public JSONObject fromAttachObject(AbstractC2498a aVar) {
        JSONObject jSONObject = new JSONObject();
        fromObject(jSONObject, aVar);
        return jSONObject;
    }

    public final int getCmdId() {
        AbstractC2549b bVar = (AbstractC2549b) getClass().getAnnotation(AbstractC2549b.class);
        if (bVar != null) {
            return bVar.mo35941a();
        }
        return 0;
    }

    public final boolean supportOffline() {
        AbstractC2549b bVar = (AbstractC2549b) getClass().getAnnotation(AbstractC2549b.class);
        return bVar != null && bVar.mo35942b();
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String toJson(boolean z) {
        return toJsonObject(z).toString();
    }

    public JSONObject toJsonObject(boolean z) {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3422a(jSONObject, AbstractC3199b.JSON_CMD, getCmdId());
        fromObject(jSONObject, this);
        return jSONObject;
    }
}
