package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.pd.sdk.oOO00oOO  reason: case insensitive filesystem */
public class C8025oOO00oOO extends AbstractC7922oO0o0O0O {
    public static final int OooO = 326;
    public static final int OooO00o = 256;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21054OooO00o;
    public static final int OooO0O0 = 261;
    public static final int OooO0OO = 276;
    public static final int OooO0Oo = 278;
    public static final int OooO0o = 296;
    public static final int OooO0o0 = 286;
    public static final int OooO0oO = 306;
    public static final int OooO0oo = 316;
    public static final int OooOO0 = 336;
    public static final int OooOO0O = 346;
    public static final int OooOO0o = 356;
    public static final int OooOOO = 378;
    public static final int OooOOO0 = 376;
    public static final int OooOOOO = 512;
    public static final int OooOOOo = 515;
    public static final int OooOOo = 517;
    public static final int OooOOo0 = 516;
    public static final int OooOOoo = 519;
    public static final int OooOo = 532;
    public static final int OooOo0 = 522;
    public static final int OooOo00 = 520;
    public static final int OooOo0O = 524;
    public static final int OooOo0o = 527;
    public static final int OooOoO = 537;
    public static final int OooOoO0 = 534;
    public static final int OooOoOO = 538;
    public static final int OooOoo = 542;
    public static final int OooOoo0 = 539;
    public static final int OooOooO = 547;
    public static final int OooOooo = 549;
    public static final int Oooo = 577;
    public static final int Oooo0 = 557;
    public static final int Oooo000 = 550;
    public static final int Oooo00O = 552;
    public static final int Oooo00o = 554;
    public static final int Oooo0O0 = 559;
    public static final int Oooo0OO = 562;
    public static final int Oooo0o = 572;
    public static final int Oooo0o0 = 567;
    public static final int Oooo0oO = 574;
    public static final int Oooo0oo = 575;
    public static final int OoooO = 597;
    public static final int OoooO0 = 587;
    public static final int OoooO00 = 582;
    public static final int OoooO0O = 592;
    public static final int OoooOO0 = 602;
    public static final int OoooOOO = 607;
    public static final int OoooOOo = 612;
    public static final int OoooOo0 = 613;
    public static final int OoooOoO = 615;
    public static final int OoooOoo = 617;
    public static final int Ooooo00 = 622;
    public static final int Ooooo0o = 627;
    public static final int OooooO0 = 628;
    public static final int OooooOO = 630;
    public static final int OooooOo = 632;
    public static final int Oooooo = 634;
    public static final int Oooooo0 = 633;
    public static final int OoooooO = 637;
    public static final int Ooooooo = 642;
    public static final int o000oOoO = 604;
    public static final int o00O0O = 662;
    public static final int o00Oo0 = 663;
    public static final int o00Ooo = 664;
    public static final int o00o0O = 665;
    public static final int o00oO0O = 698;
    public static final int o00oO0o = 697;
    public static final int o00ooo = 666;
    public static final int o0OOO0o = 713;
    public static final int o0Oo0oo = 714;
    public static final int o0OoOo0 = 643;
    public static final int o0ooOO0 = 699;
    public static final int o0ooOOo = 700;
    public static final int o0ooOoO = 712;
    public static final int oo000o = 696;
    public static final int ooOO = 647;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21054OooO00o = hashMap;
        hashMap.put(256, "Enveloped Record Version");
        f21054OooO00o.put(261, "Destination");
        f21054OooO00o.put(276, "File Format");
        f21054OooO00o.put(278, "File Version");
        f21054OooO00o.put(286, "Service Identifier");
        f21054OooO00o.put(296, "Envelope Number");
        f21054OooO00o.put(306, "Product Identifier");
        f21054OooO00o.put(316, "Envelope Priority");
        f21054OooO00o.put(Integer.valueOf((int) OooO), "Date Sent");
        f21054OooO00o.put(Integer.valueOf((int) OooOO0), "Time Sent");
        f21054OooO00o.put(Integer.valueOf((int) OooOO0O), "Coded Character Set");
        f21054OooO00o.put(356, "Unique Object Name");
        f21054OooO00o.put(Integer.valueOf((int) OooOOO0), "ARM Identifier");
        f21054OooO00o.put(Integer.valueOf((int) OooOOO), "ARM Version");
        f21054OooO00o.put(512, "Application Record Version");
        f21054OooO00o.put(515, "Object Type Reference");
        f21054OooO00o.put(516, "Object Attribute Reference");
        f21054OooO00o.put(517, "Object Name");
        f21054OooO00o.put(519, "Edit Status");
        f21054OooO00o.put(520, "Editorial Update");
        f21054OooO00o.put(522, "Urgency");
        f21054OooO00o.put(524, "Subject Reference");
        f21054OooO00o.put(527, "Category");
        f21054OooO00o.put(532, "Supplemental Category(s)");
        f21054OooO00o.put(534, "Fixture Identifier");
        f21054OooO00o.put(537, "Keywords");
        f21054OooO00o.put(Integer.valueOf((int) OooOoOO), "Content Location Code");
        f21054OooO00o.put(539, "Content Location Name");
        f21054OooO00o.put(542, "Release Date");
        f21054OooO00o.put(547, "Release Time");
        f21054OooO00o.put(549, "Expiration Date");
        f21054OooO00o.put(Integer.valueOf((int) Oooo000), "Expiration Time");
        f21054OooO00o.put(Integer.valueOf((int) Oooo00O), "Special Instructions");
        f21054OooO00o.put(Integer.valueOf((int) Oooo00o), "Action Advised");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0), "Reference Service");
        f21054OooO00o.put(559, "Reference Date");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0OO), "Reference Number");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0o0), "Date Created");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0o), "Time Created");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0oO), "Digital Date Created");
        f21054OooO00o.put(Integer.valueOf((int) Oooo0oo), "Digital Time Created");
        f21054OooO00o.put(Integer.valueOf((int) Oooo), "Originating Program");
        f21054OooO00o.put(Integer.valueOf((int) OoooO00), "Program Version");
        f21054OooO00o.put(Integer.valueOf((int) OoooO0), "Object Cycle");
        f21054OooO00o.put(Integer.valueOf((int) OoooO0O), "By-line");
        f21054OooO00o.put(Integer.valueOf((int) OoooO), "By-line Title");
        f21054OooO00o.put(Integer.valueOf((int) OoooOO0), "City");
        f21054OooO00o.put(Integer.valueOf((int) o000oOoO), "Sub-location");
        f21054OooO00o.put(Integer.valueOf((int) OoooOOO), "Province/State");
        f21054OooO00o.put(Integer.valueOf((int) OoooOOo), "Country/Primary Location Code");
        f21054OooO00o.put(Integer.valueOf((int) OoooOo0), "Country/Primary Location Name");
        f21054OooO00o.put(Integer.valueOf((int) OoooOoO), "Original Transmission Reference");
        f21054OooO00o.put(Integer.valueOf((int) OoooOoo), "Headline");
        f21054OooO00o.put(Integer.valueOf((int) Ooooo00), "Credit");
        f21054OooO00o.put(Integer.valueOf((int) Ooooo0o), "Source");
        f21054OooO00o.put(Integer.valueOf((int) OooooO0), "Copyright Notice");
        f21054OooO00o.put(Integer.valueOf((int) OooooOO), "Contact");
        f21054OooO00o.put(Integer.valueOf((int) OooooOo), "Caption/Abstract");
        f21054OooO00o.put(Integer.valueOf((int) Oooooo0), "Local Caption");
        f21054OooO00o.put(Integer.valueOf((int) Oooooo), "Caption Writer/Editor");
        f21054OooO00o.put(Integer.valueOf((int) OoooooO), "Rasterized Caption");
        f21054OooO00o.put(Integer.valueOf((int) Ooooooo), "Image Type");
        f21054OooO00o.put(Integer.valueOf((int) o0OoOo0), "Image Orientation");
        f21054OooO00o.put(Integer.valueOf((int) ooOO), "Language Identifier");
        f21054OooO00o.put(Integer.valueOf((int) o00O0O), "Audio Type");
        f21054OooO00o.put(Integer.valueOf((int) o00Oo0), "Audio Sampling Rate");
        f21054OooO00o.put(Integer.valueOf((int) o00Ooo), "Audio Sampling Resolution");
        f21054OooO00o.put(Integer.valueOf((int) o00o0O), "Audio Duration");
        f21054OooO00o.put(Integer.valueOf((int) o00ooo), "Audio Outcue");
        f21054OooO00o.put(Integer.valueOf((int) oo000o), "Job Identifier");
        f21054OooO00o.put(Integer.valueOf((int) o00oO0o), "Master Document Identifier");
        f21054OooO00o.put(Integer.valueOf((int) o00oO0O), "Short Document Identifier");
        f21054OooO00o.put(Integer.valueOf((int) o0ooOO0), "Unique Document Identifier");
        f21054OooO00o.put(700, "Owner Identifier");
        f21054OooO00o.put(Integer.valueOf((int) o0ooOoO), "Object Data Preview File Format");
        f21054OooO00o.put(Integer.valueOf((int) o0OOO0o), "Object Data Preview File Format Version");
        f21054OooO00o.put(Integer.valueOf((int) o0Oo0oo), "Object Data Preview Data");
    }

    public C8025oOO00oOO() {
        OooO00o(new C9256ooooO0oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "IPTC";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19727OooO00o() {
        return f21054OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public Date OooO0O0() {
        return OooO00o(OooO, OooOO0);
    }

    @Nullable
    public Date OooO0OO() {
        return OooO00o(Oooo0oO, Oooo0oo);
    }

    @Nullable
    public Date OooO0Oo() {
        return OooO00o(549, Oooo000);
    }

    @Nullable
    public Date OooO0o0() {
        return OooO00o(542, 547);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m19728OooO00o() {
        String[] OooO00o2 = m19655OooO00o(537);
        if (OooO00o2 == null) {
            return null;
        }
        return Arrays.asList(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m19726OooO00o() {
        return OooO00o(Oooo0o0, Oooo0o);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    private Date OooO00o(int i, int i2) {
        String OooO0O02 = OooO0O0(i);
        String OooO0O03 = OooO0O0(i2);
        if (OooO0O02 == null || OooO0O03 == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssZ");
            return simpleDateFormat.parse(OooO0O02 + OooO0O03);
        } catch (ParseException unused) {
            return null;
        }
    }
}
