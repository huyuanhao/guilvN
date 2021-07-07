package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C4164a;
import java.util.ArrayList;
import java.util.HashMap;

public interface IEventProcessor extends AbstractC4173c, AbstractC4174d {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<C4164a>> hashMap);

    byte[] stringToBytes(String str);
}
