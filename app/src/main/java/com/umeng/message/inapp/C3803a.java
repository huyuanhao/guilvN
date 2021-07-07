package com.umeng.message.inapp;

import android.content.ContentValues;
import android.database.Cursor;
import com.umeng.message.proguard.C3849m;

/* renamed from: com.umeng.message.inapp.a */
public class C3803a {

    /* renamed from: a */
    public long f10256a;

    /* renamed from: b */
    public String f10257b;

    /* renamed from: c */
    public int f10258c;

    /* renamed from: d */
    public int f10259d;

    /* renamed from: e */
    public int f10260e;

    /* renamed from: f */
    public int f10261f;

    /* renamed from: g */
    public int f10262g;

    /* renamed from: h */
    public int f10263h;

    /* renamed from: i */
    public int f10264i;

    /* renamed from: j */
    public int f10265j;

    public C3803a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f10256a = System.currentTimeMillis();
        this.f10257b = str;
        this.f10258c = i;
        this.f10259d = i2;
        this.f10260e = i3;
        this.f10261f = i4;
        this.f10262g = i5;
        this.f10263h = i6;
        this.f10264i = i7;
        this.f10265j = i8;
    }

    /* renamed from: a */
    public ContentValues mo39855a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3849m.f10427n, Long.valueOf(this.f10256a));
        contentValues.put(C3849m.f10423j, this.f10257b);
        contentValues.put(C3849m.f10424k, Integer.valueOf(this.f10258c));
        contentValues.put(C3849m.f10433t, Integer.valueOf(this.f10259d));
        contentValues.put(C3849m.f10434u, Integer.valueOf(this.f10260e));
        contentValues.put(C3849m.f10435v, Integer.valueOf(this.f10261f));
        contentValues.put(C3849m.f10436w, Integer.valueOf(this.f10262g));
        contentValues.put(C3849m.f10437x, Integer.valueOf(this.f10263h));
        contentValues.put(C3849m.f10438y, Integer.valueOf(this.f10264i));
        contentValues.put(C3849m.f10439z, Integer.valueOf(this.f10265j));
        return contentValues;
    }

    public C3803a(Cursor cursor) {
        this.f10257b = cursor.getString(cursor.getColumnIndex(C3849m.f10423j));
        this.f10258c = cursor.getInt(cursor.getColumnIndex(C3849m.f10424k));
        this.f10259d = cursor.getInt(cursor.getColumnIndex(C3849m.f10433t));
        this.f10260e = cursor.getInt(cursor.getColumnIndex(C3849m.f10434u));
        this.f10261f = cursor.getInt(cursor.getColumnIndex(C3849m.f10435v));
        this.f10262g = cursor.getInt(cursor.getColumnIndex(C3849m.f10436w));
        this.f10263h = cursor.getInt(cursor.getColumnIndex(C3849m.f10437x));
        this.f10264i = cursor.getInt(cursor.getColumnIndex(C3849m.f10438y));
        this.f10265j = cursor.getInt(cursor.getColumnIndex(C3849m.f10439z));
    }
}
