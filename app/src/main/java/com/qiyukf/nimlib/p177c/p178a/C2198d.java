package com.qiyukf.nimlib.p177c.p178a;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.qiyukf.basesdk.p119a.C1709a;

/* renamed from: com.qiyukf.nimlib.c.a.d */
public final class C2198d extends CursorWrapper {

    /* renamed from: a */
    public Cursor f4385a;

    public C2198d(Cursor cursor) {
        super(cursor);
        this.f4385a = cursor;
    }

    /* renamed from: a */
    public static C2198d m4553a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C2198d(cursor);
    }

    /* renamed from: a */
    public static final boolean m4554a(Exception exc) {
        exc.printStackTrace();
        boolean z = false;
        if (exc instanceof SQLiteException) {
            String message = exc.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("lock")) {
                z = true;
            }
            if (z) {
                C1709a.m3020e("db", "query locked!");
            }
        }
        return z;
    }

    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                this.f4385a.copyStringToBuffer(i, charArrayBuffer);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
    }

    public final byte[] getBlob(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getBlob(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return null;
    }

    public final int getColumnCount() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getColumnCount();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return i;
    }

    public final int getColumnIndex(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.getColumnIndex(str);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return -1;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.getColumnIndexOrThrow(str);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return -1;
    }

    public final String getColumnName(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getColumnName(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return null;
    }

    public final String[] getColumnNames() {
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.getColumnNames();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return null;
    }

    public final int getCount() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getCount();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            } catch (Exception e2) {
                C1709a.m3016c("LockSafeCursor getCount", e2.toString());
            }
        }
        return i;
    }

    public final double getDouble(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getDouble(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return AbstractC8352oOoOOoO0.OooO0O0;
    }

    public final float getFloat(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getFloat(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return 0.0f;
    }

    public final int getInt(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getInt(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return 0;
    }

    public final long getLong(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getLong(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return 0;
    }

    public final int getPosition() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getPosition();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return i;
    }

    public final short getShort(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getShort(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return 0;
    }

    public final String getString(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.getString(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return null;
    }

    public final boolean move(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.move(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return false;
    }

    public final boolean moveToFirst() {
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.moveToFirst();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return z;
    }

    public final boolean moveToLast() {
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.moveToLast();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return z;
    }

    public final boolean moveToNext() {
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.moveToNext();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return z;
    }

    public final boolean moveToPosition(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                return this.f4385a.moveToPosition(i);
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return false;
    }

    public final boolean moveToPrevious() {
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            try {
                return this.f4385a.moveToPrevious();
            } catch (RuntimeException e) {
                if (!m4554a(e)) {
                    throw e;
                }
            }
        }
        return z;
    }
}
