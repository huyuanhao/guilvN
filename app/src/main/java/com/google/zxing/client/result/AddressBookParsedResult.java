package com.google.zxing.client.result;

public final class AddressBookParsedResult extends ParsedResult {
    public final String[] addressTypes;
    public final String[] addresses;
    public final String birthday;
    public final String[] emailTypes;
    public final String[] emails;
    public final String[] geo;
    public final String instantMessenger;
    public final String[] names;
    public final String[] nicknames;
    public final String note;

    /* renamed from: org  reason: collision with root package name */
    public final String f24200org;
    public final String[] phoneNumbers;
    public final String[] phoneTypes;
    public final String pronunciation;
    public final String title;
    public final String[] urls;

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.addressTypes;
    }

    public String[] getAddresses() {
        return this.addresses;
    }

    public String getBirthday() {
        return this.birthday;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.names, sb);
        ParsedResult.maybeAppend(this.nicknames, sb);
        ParsedResult.maybeAppend(this.pronunciation, sb);
        ParsedResult.maybeAppend(this.title, sb);
        ParsedResult.maybeAppend(this.f24200org, sb);
        ParsedResult.maybeAppend(this.addresses, sb);
        ParsedResult.maybeAppend(this.phoneNumbers, sb);
        ParsedResult.maybeAppend(this.emails, sb);
        ParsedResult.maybeAppend(this.instantMessenger, sb);
        ParsedResult.maybeAppend(this.urls, sb);
        ParsedResult.maybeAppend(this.birthday, sb);
        ParsedResult.maybeAppend(this.geo, sb);
        ParsedResult.maybeAppend(this.note, sb);
        return sb.toString();
    }

    public String[] getEmailTypes() {
        return this.emailTypes;
    }

    public String[] getEmails() {
        return this.emails;
    }

    public String[] getGeo() {
        return this.geo;
    }

    public String getInstantMessenger() {
        return this.instantMessenger;
    }

    public String[] getNames() {
        return this.names;
    }

    public String[] getNicknames() {
        return this.nicknames;
    }

    public String getNote() {
        return this.note;
    }

    public String getOrg() {
        return this.f24200org;
    }

    public String[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String[] getPhoneTypes() {
        return this.phoneTypes;
    }

    public String getPronunciation() {
        return this.pronunciation;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getURLs() {
        return this.urls;
    }

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        } else if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        } else if (strArr7 == null || strArr8 == null || strArr7.length == strArr8.length) {
            this.names = strArr;
            this.nicknames = strArr2;
            this.pronunciation = str;
            this.phoneNumbers = strArr3;
            this.phoneTypes = strArr4;
            this.emails = strArr5;
            this.emailTypes = strArr6;
            this.instantMessenger = str2;
            this.note = str3;
            this.addresses = strArr7;
            this.addressTypes = strArr8;
            this.f24200org = str4;
            this.birthday = str5;
            this.title = str6;
            this.urls = strArr9;
            this.geo = strArr10;
        } else {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
    }
}
