package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7644o0oOoOO;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {
    public static final StackTraceElement[] OooO00o = new StackTraceElement[0];
    public static final long serialVersionUID = 1;
    public final List<Throwable> causes;
    public Class<?> dataClass;
    public DataSource dataSource;
    public String detailMessage;
    public AbstractC7644o0oOoOO key;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void OooO00o(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).getCauses()) {
                OooO00o(th2, list);
            }
            return;
        }
        list.add(th);
    }

    public static void OooO0O0(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).OooO00o(appendable);
            } else {
                OooO00o(th, appendable);
            }
            i = i2;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str = "";
        sb.append(this.dataClass != null ? ", " + this.dataClass : str);
        sb.append(this.dataSource != null ? ", " + this.dataSource : str);
        if (this.key != null) {
            str = ", " + this.key;
        }
        sb.append(str);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(C3848l.f10402t);
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(AbstractC7644o0oOoOO o0ooooo, DataSource dataSource2) {
        setLoggingDetails(o0ooooo, dataSource2, null);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        OooO00o(printStream);
    }

    public void setLoggingDetails(AbstractC7644o0oOoOO o0ooooo, DataSource dataSource2, Class<?> cls) {
        this.key = o0ooooo;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(OooO00o);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        OooO00o(printWriter);
    }

    public static final class OooO00o implements Appendable {
        public static final String o0ooOOo = "";
        public static final String o0ooOoO = "  ";
        public final Appendable OooO00o;
        public boolean OooO0O0 = true;

        public OooO00o(Appendable appendable) {
            this.OooO00o = appendable;
        }

        @NonNull
        private CharSequence OooO00o(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.OooO0O0) {
                this.OooO0O0 = false;
                this.OooO00o.append(o0ooOoO);
            }
            if (c == '\n') {
                z = true;
            }
            this.OooO0O0 = z;
            this.OooO00o.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence OooO00o2 = OooO00o(charSequence);
            return append(OooO00o2, 0, OooO00o2.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence OooO00o2 = OooO00o(charSequence);
            boolean z = false;
            if (this.OooO0O0) {
                this.OooO0O0 = false;
                this.OooO00o.append(o0ooOoO);
            }
            if (OooO00o2.length() > 0 && OooO00o2.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.OooO0O0 = z;
            this.OooO00o.append(OooO00o2, i, i2);
            return this;
        }
    }

    private void OooO00o(Appendable appendable) {
        OooO00o(this, appendable);
        OooO00o(getCauses(), new OooO00o(appendable));
    }

    public static void OooO00o(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public static void OooO00o(List<Throwable> list, Appendable appendable) {
        try {
            OooO0O0(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
