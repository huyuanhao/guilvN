package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;

public class ExtractFromZipSoSource extends UnpackingSoSource {
    public final File mZipFileName;
    public final String mZipSearchPattern;

    public static final class ZipDso extends UnpackingSoSource.Dso implements Comparable {
        public final int abiScore;
        public final ZipEntry backingEntry;

        public ZipDso(String str, ZipEntry zipEntry, int i) {
            super(str, makePseudoHash(zipEntry));
            this.backingEntry = zipEntry;
            this.abiScore = i;
        }

        public static String makePseudoHash(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.name.compareTo(((ZipDso) obj).name);
        }
    }

    public class ZipUnpacker extends UnpackingSoSource.Unpacker {
        @Nullable
        public ZipDso[] mDsos;
        public final UnpackingSoSource mSoSource;
        public final ZipFile mZipFile;

        public final class ZipBackedInputDsoIterator extends UnpackingSoSource.InputDsoIterator {
            public int mCurrentDso;

            public ZipBackedInputDsoIterator() {
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public boolean hasNext() {
                ZipUnpacker.this.ensureDsos();
                return this.mCurrentDso < ZipUnpacker.this.mDsos.length;
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public UnpackingSoSource.InputDso next() throws IOException {
                ZipUnpacker.this.ensureDsos();
                ZipDso[] zipDsoArr = ZipUnpacker.this.mDsos;
                int i = this.mCurrentDso;
                this.mCurrentDso = i + 1;
                ZipDso zipDso = zipDsoArr[i];
                InputStream inputStream = ZipUnpacker.this.mZipFile.getInputStream(zipDso.backingEntry);
                try {
                    return new UnpackingSoSource.InputDso(zipDso, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public ZipUnpacker(UnpackingSoSource unpackingSoSource) throws IOException {
            this.mZipFile = new ZipFile(ExtractFromZipSoSource.this.mZipFileName);
            this.mSoSource = unpackingSoSource;
        }

        @Override // java.io.Closeable, com.facebook.soloader.UnpackingSoSource.Unpacker, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mZipFile.close();
        }

        public final ZipDso[] ensureDsos() {
            if (this.mDsos == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(ExtractFromZipSoSource.this.mZipSearchPattern);
                String[] supportedAbis = SysUtil.getSupportedAbis();
                Enumeration<? extends ZipEntry> entries = this.mZipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int findAbiScore = SysUtil.findAbiScore(supportedAbis, group);
                        if (findAbiScore >= 0) {
                            linkedHashSet.add(group);
                            ZipDso zipDso = (ZipDso) hashMap.get(group2);
                            if (zipDso == null || findAbiScore < zipDso.abiScore) {
                                hashMap.put(group2, new ZipDso(group2, zipEntry, findAbiScore));
                            }
                        }
                    }
                }
                this.mSoSource.setSoSourceAbis((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                ZipDso[] zipDsoArr = (ZipDso[]) hashMap.values().toArray(new ZipDso[hashMap.size()]);
                Arrays.sort(zipDsoArr);
                int i = 0;
                for (int i2 = 0; i2 < zipDsoArr.length; i2++) {
                    ZipDso zipDso2 = zipDsoArr[i2];
                    if (shouldExtract(zipDso2.backingEntry, zipDso2.name)) {
                        i++;
                    } else {
                        zipDsoArr[i2] = null;
                    }
                }
                ZipDso[] zipDsoArr2 = new ZipDso[i];
                int i3 = 0;
                for (ZipDso zipDso3 : zipDsoArr) {
                    if (zipDso3 != null) {
                        zipDsoArr2[i3] = zipDso3;
                        i3++;
                    }
                }
                this.mDsos = zipDsoArr2;
            }
            return this.mDsos;
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public final UnpackingSoSource.DsoManifest getDsoManifest() throws IOException {
            return new UnpackingSoSource.DsoManifest(ensureDsos());
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public final UnpackingSoSource.InputDsoIterator openDsoIterator() throws IOException {
            return new ZipBackedInputDsoIterator();
        }

        public boolean shouldExtract(ZipEntry zipEntry, String str) {
            return true;
        }
    }

    public ExtractFromZipSoSource(Context context, String str, File file, String str2) {
        super(context, str);
        this.mZipFileName = file;
        this.mZipSearchPattern = str2;
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ZipUnpacker(this);
    }
}
