package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C4164a;
import java.util.HashMap;

public interface IPerfProcessor extends AbstractC4173c, AbstractC4174d {
    void setPerfMap(HashMap<String, HashMap<String, C4164a>> hashMap);
}
