package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.manager.C4166a;
import com.xiaomi.push.C4245ac;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4291bl;
import com.xiaomi.push.C4475h;
import com.xiaomi.push.C4693y;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.xiaomi.clientreport.processor.a */
public class C4171a implements IEventProcessor {

    /* renamed from: a */
    public Context f11184a;

    /* renamed from: a */
    public HashMap<String, ArrayList<C4164a>> f11185a;

    public C4171a(Context context) {
        mo41268a(context);
    }

    /* renamed from: a */
    public static String mo41269a(C4164a aVar) {
        return String.valueOf(aVar.production);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11306d(r9);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> m11324a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.C4171a.m11324a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    private void m11325a(C4164a[] aVarArr, String str) {
        Throwable th;
        Exception e;
        if (aVarArr != null && aVarArr.length > 0 && !TextUtils.isEmpty(str)) {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str), true));
                try {
                    for (C4164a aVar : aVarArr) {
                        if (aVar != null) {
                            byte[] stringToBytes = stringToBytes(aVar.toJsonString());
                            if (stringToBytes != null && stringToBytes.length >= 1) {
                                if (stringToBytes.length <= 4096) {
                                    bufferedOutputStream2.write(C4245ac.m11631a(-573785174));
                                    bufferedOutputStream2.write(C4245ac.m11631a(stringToBytes.length));
                                    bufferedOutputStream2.write(stringToBytes);
                                    bufferedOutputStream2.flush();
                                }
                            }
                            AbstractC4163b.m11306d("event data throw a invalid item ");
                        }
                    }
                    C4693y.m14236a(bufferedOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        AbstractC4163b.m11302a("event data write to cache file failed cause exception", e);
                        C4693y.m14236a(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C4693y.m14236a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = bufferedOutputStream2;
                    C4693y.m14236a(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                AbstractC4163b.m11302a("event data write to cache file failed cause exception", e);
                C4693y.m14236a(bufferedOutputStream);
            }
        }
    }

    /* renamed from: b */
    private String m11326b(C4164a aVar) {
        File externalFilesDir = this.f11184a.getExternalFilesDir("event");
        String a = mo41269a(aVar);
        if (externalFilesDir == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + a;
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (C4291bl.m11824a(this.f11184a, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        if (r8 == null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    @Override // com.xiaomi.clientreport.processor.AbstractC4173c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41267a() {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.C4171a.mo41267a():void");
    }

    /* renamed from: a */
    public void mo41268a(Context context) {
        this.f11184a = context;
    }

    @Override // com.xiaomi.clientreport.processor.AbstractC4174d
    /* renamed from: a */
    public void m11329a(C4164a aVar) {
        if ((aVar instanceof EventClientReport) && this.f11185a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String a = mo41269a((C4164a) eventClientReport);
            ArrayList<C4164a> arrayList = this.f11185a.get(a);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(eventClientReport);
            this.f11185a.put(a, arrayList);
        }
    }

    /* renamed from: a */
    public void mo41270a(List<String> list) {
        C4291bl.m11822a(this.f11184a, list);
    }

    /* renamed from: a */
    public void mo41271a(C4164a[] aVarArr) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e;
        Exception e2;
        if (aVarArr != null && aVarArr.length > 0) {
            if (aVarArr[0] != null) {
                String b = m11326b(aVarArr[0]);
                if (!TextUtils.isEmpty(b)) {
                    FileLock fileLock = null;
                    try {
                        File file = new File(b + ".lock");
                        C4693y.m14241a(file);
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            FileLock lock = randomAccessFile.getChannel().lock();
                            for (C4164a aVar : aVarArr) {
                                if (aVar != null) {
                                    m11325a(aVarArr, b);
                                }
                            }
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            }
                        } catch (Exception e4) {
                            e2 = e4;
                            try {
                                AbstractC4163b.m11303a(e2);
                                if (0 != 0 && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e5) {
                                        e = e5;
                                    }
                                }
                                C4693y.m14236a(randomAccessFile);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    fileLock.release();
                                } catch (IOException e6) {
                                    AbstractC4163b.m11303a(e6);
                                }
                                C4693y.m14236a(randomAccessFile);
                                throw th;
                            }
                        }
                    } catch (Exception e7) {
                        e2 = e7;
                        randomAccessFile = null;
                        AbstractC4163b.m11303a(e2);
                        fileLock.release();
                        C4693y.m14236a(randomAccessFile);
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                        if (0 != 0 && fileLock.isValid()) {
                            fileLock.release();
                        }
                        C4693y.m14236a(randomAccessFile);
                        throw th;
                    }
                    C4693y.m14236a(randomAccessFile);
                }
                return;
            }
            return;
        }
        return;
        AbstractC4163b.m11303a(e);
        C4693y.m14236a(randomAccessFile);
    }

    @Override // com.xiaomi.clientreport.processor.AbstractC4174d
    /* renamed from: b */
    public void mo41272b() {
        HashMap<String, ArrayList<C4164a>> hashMap = this.f11185a;
        if (hashMap != null) {
            if (hashMap.size() > 0) {
                for (String str : this.f11185a.keySet()) {
                    ArrayList<C4164a> arrayList = this.f11185a.get(str);
                    if (arrayList != null && arrayList.size() > 0) {
                        C4164a[] aVarArr = new C4164a[arrayList.size()];
                        arrayList.toArray(aVarArr);
                        mo41271a(aVarArr);
                    }
                }
            }
            this.f11185a.clear();
        }
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public String bytesToString(byte[] bArr) {
        byte[] a;
        if (bArr != null && bArr.length >= 1) {
            if (!C4166a.m11308a(this.f11184a).mo41252a().isEventEncrypted()) {
                return C4285bf.m11804a(bArr);
            }
            String a2 = C4291bl.m11819a(this.f11184a);
            if (!TextUtils.isEmpty(a2) && (a = C4291bl.m11825a(a2)) != null && a.length > 0) {
                try {
                    return C4285bf.m11804a(Base64.decode(C4475h.m12856a(a, bArr), 2));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public void setEventMap(HashMap<String, ArrayList<C4164a>> hashMap) {
        this.f11185a = hashMap;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public byte[] stringToBytes(String str) {
        byte[] a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!C4166a.m11308a(this.f11184a).mo41252a().isEventEncrypted()) {
            return C4285bf.m11808a(str);
        }
        String a2 = C4291bl.m11819a(this.f11184a);
        byte[] a3 = C4285bf.m11808a(str);
        if (!TextUtils.isEmpty(a2) && a3 != null && a3.length > 1 && (a = C4291bl.m11825a(a2)) != null) {
            try {
                if (a.length > 1) {
                    return C4475h.m12857b(a, Base64.encode(a3, 2));
                }
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }
        return null;
    }
}
