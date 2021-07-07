package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.xiaomi.push.gf */
public class C4449gf extends Exception {

    /* renamed from: a */
    public C4461go f12013a = null;

    /* renamed from: a */
    public C4462gp f12014a = null;

    /* renamed from: a */
    public Throwable f12015a = null;

    public C4449gf() {
    }

    public C4449gf(C4461go goVar) {
        this.f12013a = goVar;
    }

    public C4449gf(String str) {
        super(str);
    }

    public C4449gf(String str, Throwable th) {
        super(str);
        this.f12015a = th;
    }

    public C4449gf(Throwable th) {
        this.f12015a = th;
    }

    /* renamed from: a */
    public Throwable mo41926a() {
        return this.f12015a;
    }

    public String getMessage() {
        C4461go goVar;
        C4462gp gpVar;
        String message = super.getMessage();
        return (message != null || (gpVar = this.f12014a) == null) ? (message != null || (goVar = this.f12013a) == null) ? message : goVar.toString() : gpVar.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f12015a != null) {
            printStream.println("Nested Exception: ");
            this.f12015a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f12015a != null) {
            printWriter.println("Nested Exception: ");
            this.f12015a.printStackTrace(printWriter);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        C4462gp gpVar = this.f12014a;
        if (gpVar != null) {
            sb.append(gpVar);
        }
        C4461go goVar = this.f12013a;
        if (goVar != null) {
            sb.append(goVar);
        }
        if (this.f12015a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f12015a);
        }
        return sb.toString();
    }
}
