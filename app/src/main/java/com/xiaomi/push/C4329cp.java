package com.xiaomi.push;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.xiaomi.push.cp */
public class C4329cp {

    /* renamed from: a */
    public File f11521a;

    /* renamed from: a */
    public StringBuilder f11522a;

    /* renamed from: a */
    public void mo41597a() {
        try {
            FileWriter fileWriter = new FileWriter(this.f11521a, true);
            fileWriter.write(this.f11522a.toString());
            fileWriter.flush();
            fileWriter.close();
            this.f11522a.delete(0, this.f11522a.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo41598a(C4328co coVar) {
        StringBuilder sb = this.f11522a;
        sb.append(coVar.f11518a + "\t");
        StringBuilder sb2 = this.f11522a;
        sb2.append(coVar.f11519a + "\t" + coVar.f11520b);
        this.f11522a.append("\r\n");
    }
}
