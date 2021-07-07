package com.google.firebase.p027ml.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.barcode.Barcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode */
public class FirebaseVisionBarcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;
    public static final Map<Integer, zzmd.zzv.zza> zzavq = new HashMap();
    public static final Map<Integer, zzmd.zzv.zzb> zzavr = new HashMap();
    public final Barcode zzavs;

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Address */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        public final Barcode.Address zzavt;

        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Address$AddressType */
        public @interface AddressType {
        }

        public Address(@NonNull Barcode.Address address) {
            this.zzavt = (Barcode.Address) Preconditions.checkNotNull(address);
        }

        @NonNull
        public String[] getAddressLines() {
            return this.zzavt.addressLines;
        }

        @AddressType
        public int getType() {
            return this.zzavt.type;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$BarcodeFormat */
    public @interface BarcodeFormat {
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$BarcodeValueType */
    public @interface BarcodeValueType {
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$CalendarDateTime */
    public static class CalendarDateTime {
        public final Barcode.CalendarDateTime zzavu;

        public CalendarDateTime(@NonNull Barcode.CalendarDateTime calendarDateTime) {
            this.zzavu = calendarDateTime;
        }

        public int getDay() {
            return this.zzavu.day;
        }

        public int getHours() {
            return this.zzavu.hours;
        }

        public int getMinutes() {
            return this.zzavu.minutes;
        }

        public int getMonth() {
            return this.zzavu.month;
        }

        @Nullable
        public String getRawValue() {
            return this.zzavu.rawValue;
        }

        public int getSeconds() {
            return this.zzavu.seconds;
        }

        public int getYear() {
            return this.zzavu.year;
        }

        public boolean isUtc() {
            return this.zzavu.isUtc;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$CalendarEvent */
    public static class CalendarEvent {
        public final Barcode.CalendarEvent calendarEvent;

        public CalendarEvent(@NonNull Barcode.CalendarEvent calendarEvent2) {
            this.calendarEvent = (Barcode.CalendarEvent) Preconditions.checkNotNull(calendarEvent2);
        }

        @Nullable
        public String getDescription() {
            return this.calendarEvent.description;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            Barcode.CalendarDateTime calendarDateTime = this.calendarEvent.end;
            if (calendarDateTime == null) {
                return null;
            }
            return new CalendarDateTime(calendarDateTime);
        }

        @Nullable
        public String getLocation() {
            return this.calendarEvent.location;
        }

        @Nullable
        public String getOrganizer() {
            return this.calendarEvent.organizer;
        }

        @Nullable
        public CalendarDateTime getStart() {
            Barcode.CalendarDateTime calendarDateTime = this.calendarEvent.start;
            if (calendarDateTime == null) {
                return null;
            }
            return new CalendarDateTime(calendarDateTime);
        }

        @Nullable
        public String getStatus() {
            return this.calendarEvent.status;
        }

        @Nullable
        public String getSummary() {
            return this.calendarEvent.summary;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$ContactInfo */
    public static class ContactInfo {
        public final Barcode.ContactInfo contactInfo;

        public ContactInfo(@NonNull Barcode.ContactInfo contactInfo2) {
            this.contactInfo = (Barcode.ContactInfo) Preconditions.checkNotNull(contactInfo2);
        }

        public List<Address> getAddresses() {
            ArrayList arrayList = new ArrayList();
            if (this.contactInfo.addresses == null) {
                return arrayList;
            }
            int i = 0;
            while (true) {
                Barcode.Address[] addressArr = this.contactInfo.addresses;
                if (i >= addressArr.length) {
                    return arrayList;
                }
                Barcode.Address address = addressArr[i];
                if (address != null) {
                    arrayList.add(new Address(address));
                }
                i++;
            }
        }

        public List<Email> getEmails() {
            ArrayList arrayList = new ArrayList();
            if (this.contactInfo.emails == null) {
                return arrayList;
            }
            int i = 0;
            while (true) {
                Barcode.Email[] emailArr = this.contactInfo.emails;
                if (i >= emailArr.length) {
                    return arrayList;
                }
                Barcode.Email email = emailArr[i];
                if (email != null) {
                    arrayList.add(new Email(email));
                }
                i++;
            }
        }

        @Nullable
        public PersonName getName() {
            Barcode.PersonName personName = this.contactInfo.name;
            if (personName == null) {
                return null;
            }
            return new PersonName(personName);
        }

        @Nullable
        public String getOrganization() {
            return this.contactInfo.organization;
        }

        public List<Phone> getPhones() {
            ArrayList arrayList = new ArrayList();
            if (this.contactInfo.phones == null) {
                return arrayList;
            }
            int i = 0;
            while (true) {
                Barcode.Phone[] phoneArr = this.contactInfo.phones;
                if (i >= phoneArr.length) {
                    return arrayList;
                }
                Barcode.Phone phone = phoneArr[i];
                if (phone != null) {
                    arrayList.add(new Phone(phone));
                }
                i++;
            }
        }

        @Nullable
        public String getTitle() {
            return this.contactInfo.title;
        }

        @Nullable
        public String[] getUrls() {
            return this.contactInfo.urls;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$DriverLicense */
    public static class DriverLicense {
        public Barcode.DriverLicense driverLicense;

        public DriverLicense(@NonNull Barcode.DriverLicense driverLicense2) {
            this.driverLicense = (Barcode.DriverLicense) Preconditions.checkNotNull(driverLicense2);
        }

        @Nullable
        public String getAddressCity() {
            return this.driverLicense.addressCity;
        }

        @Nullable
        public String getAddressState() {
            return this.driverLicense.addressState;
        }

        @Nullable
        public String getAddressStreet() {
            return this.driverLicense.addressStreet;
        }

        @Nullable
        public String getAddressZip() {
            return this.driverLicense.addressZip;
        }

        @Nullable
        public String getBirthDate() {
            return this.driverLicense.birthDate;
        }

        @Nullable
        public String getDocumentType() {
            return this.driverLicense.documentType;
        }

        @Nullable
        public String getExpiryDate() {
            return this.driverLicense.expiryDate;
        }

        @Nullable
        public String getFirstName() {
            return this.driverLicense.firstName;
        }

        @Nullable
        public String getGender() {
            return this.driverLicense.gender;
        }

        @Nullable
        public String getIssueDate() {
            return this.driverLicense.issueDate;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.driverLicense.issuingCountry;
        }

        @Nullable
        public String getLastName() {
            return this.driverLicense.lastName;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.driverLicense.licenseNumber;
        }

        @Nullable
        public String getMiddleName() {
            return this.driverLicense.middleName;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Email */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        public final Barcode.Email email;

        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Email$FormatType */
        public @interface FormatType {
        }

        public Email(@NonNull Barcode.Email email2) {
            this.email = (Barcode.Email) Preconditions.checkNotNull(email2);
        }

        @Nullable
        public String getAddress() {
            return this.email.address;
        }

        @Nullable
        public String getBody() {
            return this.email.body;
        }

        @Nullable
        public String getSubject() {
            return this.email.subject;
        }

        @FormatType
        public int getType() {
            return this.email.type;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$GeoPoint */
    public static class GeoPoint {
        public final Barcode.GeoPoint geoPoint;

        public GeoPoint(@NonNull Barcode.GeoPoint geoPoint2) {
            this.geoPoint = (Barcode.GeoPoint) Preconditions.checkNotNull(geoPoint2);
        }

        public double getLat() {
            return this.geoPoint.lat;
        }

        public double getLng() {
            return this.geoPoint.lng;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$PersonName */
    public static class PersonName {
        public final Barcode.PersonName zzavv;

        public PersonName(@NonNull Barcode.PersonName personName) {
            this.zzavv = (Barcode.PersonName) Preconditions.checkNotNull(personName);
        }

        @Nullable
        public String getFirst() {
            return this.zzavv.first;
        }

        @Nullable
        public String getFormattedName() {
            return this.zzavv.formattedName;
        }

        @Nullable
        public String getLast() {
            return this.zzavv.last;
        }

        @Nullable
        public String getMiddle() {
            return this.zzavv.middle;
        }

        @Nullable
        public String getPrefix() {
            return this.zzavv.prefix;
        }

        @Nullable
        public String getPronunciation() {
            return this.zzavv.pronunciation;
        }

        @Nullable
        public String getSuffix() {
            return this.zzavv.suffix;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Phone */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        public final Barcode.Phone phone;

        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Phone$FormatType */
        public @interface FormatType {
        }

        public Phone(@NonNull Barcode.Phone phone2) {
            this.phone = (Barcode.Phone) Preconditions.checkNotNull(phone2);
        }

        @Nullable
        public String getNumber() {
            return this.phone.number;
        }

        @FormatType
        public int getType() {
            return this.phone.type;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Sms */
    public static class Sms {
        public final Barcode.Sms sms;

        public Sms(@NonNull Barcode.Sms sms2) {
            this.sms = (Barcode.Sms) Preconditions.checkNotNull(sms2);
        }

        @Nullable
        public String getMessage() {
            return this.sms.message;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.sms.phoneNumber;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$UrlBookmark */
    public static class UrlBookmark {
        public final Barcode.UrlBookmark zzavw;

        public UrlBookmark(@NonNull Barcode.UrlBookmark urlBookmark) {
            this.zzavw = (Barcode.UrlBookmark) Preconditions.checkNotNull(urlBookmark);
        }

        @Nullable
        public String getTitle() {
            return this.zzavw.title;
        }

        @Nullable
        public String getUrl() {
            return this.zzavw.url;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$WiFi */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;
        public final Barcode.WiFi zzavx;

        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$WiFi$EncryptionType */
        public @interface EncryptionType {
        }

        public WiFi(@NonNull Barcode.WiFi wiFi) {
            this.zzavx = (Barcode.WiFi) Preconditions.checkNotNull(wiFi);
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.zzavx.encryptionType;
        }

        @Nullable
        public String getPassword() {
            return this.zzavx.password;
        }

        @Nullable
        public String getSsid() {
            return this.zzavx.ssid;
        }
    }

    static {
        zzavq.put(-1, zzmd.zzv.zza.FORMAT_UNKNOWN);
        zzavq.put(1, zzmd.zzv.zza.FORMAT_CODE_128);
        zzavq.put(2, zzmd.zzv.zza.FORMAT_CODE_39);
        zzavq.put(4, zzmd.zzv.zza.FORMAT_CODE_93);
        zzavq.put(8, zzmd.zzv.zza.FORMAT_CODABAR);
        zzavq.put(16, zzmd.zzv.zza.FORMAT_DATA_MATRIX);
        zzavq.put(32, zzmd.zzv.zza.FORMAT_EAN_13);
        zzavq.put(64, zzmd.zzv.zza.FORMAT_EAN_8);
        zzavq.put(128, zzmd.zzv.zza.FORMAT_ITF);
        zzavq.put(256, zzmd.zzv.zza.FORMAT_QR_CODE);
        zzavq.put(512, zzmd.zzv.zza.FORMAT_UPC_A);
        zzavq.put(1024, zzmd.zzv.zza.FORMAT_UPC_E);
        zzavq.put(2048, zzmd.zzv.zza.FORMAT_PDF417);
        zzavq.put(4096, zzmd.zzv.zza.FORMAT_AZTEC);
        zzavr.put(0, zzmd.zzv.zzb.TYPE_UNKNOWN);
        zzavr.put(1, zzmd.zzv.zzb.TYPE_CONTACT_INFO);
        zzavr.put(2, zzmd.zzv.zzb.TYPE_EMAIL);
        zzavr.put(3, zzmd.zzv.zzb.TYPE_ISBN);
        zzavr.put(4, zzmd.zzv.zzb.TYPE_PHONE);
        zzavr.put(5, zzmd.zzv.zzb.TYPE_PRODUCT);
        zzavr.put(6, zzmd.zzv.zzb.TYPE_SMS);
        zzavr.put(7, zzmd.zzv.zzb.TYPE_TEXT);
        zzavr.put(8, zzmd.zzv.zzb.TYPE_URL);
        zzavr.put(9, zzmd.zzv.zzb.TYPE_WIFI);
        zzavr.put(10, zzmd.zzv.zzb.TYPE_GEO);
        zzavr.put(11, zzmd.zzv.zzb.TYPE_CALENDAR_EVENT);
        zzavr.put(12, zzmd.zzv.zzb.TYPE_DRIVER_LICENSE);
    }

    public FirebaseVisionBarcode(@NonNull Barcode barcode) {
        this.zzavs = (Barcode) Preconditions.checkNotNull(barcode);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.zzavs.getBoundingBox();
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        Barcode.CalendarEvent calendarEvent = this.zzavs.calendarEvent;
        if (calendarEvent != null) {
            return new CalendarEvent(calendarEvent);
        }
        return null;
    }

    @Nullable
    public ContactInfo getContactInfo() {
        Barcode.ContactInfo contactInfo = this.zzavs.contactInfo;
        if (contactInfo != null) {
            return new ContactInfo(contactInfo);
        }
        return null;
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.zzavs.cornerPoints;
    }

    @Nullable
    public String getDisplayValue() {
        return this.zzavs.displayValue;
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        Barcode.DriverLicense driverLicense = this.zzavs.driverLicense;
        if (driverLicense != null) {
            return new DriverLicense(driverLicense);
        }
        return null;
    }

    @Nullable
    public Email getEmail() {
        Barcode.Email email = this.zzavs.email;
        if (email != null) {
            return new Email(email);
        }
        return null;
    }

    @BarcodeFormat
    public int getFormat() {
        int i = this.zzavs.format;
        if (i > 4096 || i == 0) {
            return -1;
        }
        return i;
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        Barcode.GeoPoint geoPoint = this.zzavs.geoPoint;
        if (geoPoint != null) {
            return new GeoPoint(geoPoint);
        }
        return null;
    }

    @Nullable
    public Phone getPhone() {
        Barcode.Phone phone = this.zzavs.phone;
        if (phone != null) {
            return new Phone(phone);
        }
        return null;
    }

    @Nullable
    public String getRawValue() {
        return this.zzavs.rawValue;
    }

    @Nullable
    public Sms getSms() {
        Barcode.Sms sms = this.zzavs.sms;
        if (sms != null) {
            return new Sms(sms);
        }
        return null;
    }

    @Nullable
    public UrlBookmark getUrl() {
        Barcode.UrlBookmark urlBookmark = this.zzavs.url;
        if (urlBookmark != null) {
            return new UrlBookmark(urlBookmark);
        }
        return null;
    }

    @BarcodeValueType
    public int getValueType() {
        return this.zzavs.valueFormat;
    }

    @Nullable
    public WiFi getWifi() {
        Barcode.WiFi wiFi = this.zzavs.wifi;
        if (wiFi != null) {
            return new WiFi(wiFi);
        }
        return null;
    }

    public final zzmd.zzv.zza zznd() {
        zzmd.zzv.zza zza = zzavq.get(Integer.valueOf(getFormat()));
        return zza == null ? zzmd.zzv.zza.FORMAT_UNKNOWN : zza;
    }

    public final zzmd.zzv.zzb zzne() {
        zzmd.zzv.zzb zzb = zzavr.get(Integer.valueOf(getValueType()));
        return zzb == null ? zzmd.zzv.zzb.TYPE_UNKNOWN : zzb;
    }
}
