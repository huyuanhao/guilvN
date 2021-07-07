package com.p118pd.sdk;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O0ooo  reason: case insensitive filesystem */
public class C7078o00O0ooo {
    public static final String OooO = "(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    public static final int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19390OooO00o = "\n\u000b\f\r  ";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pattern f19391OooO00o = Pattern.compile("[^,*•\t                　\n\u000b\f\r  ]+(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO00o[] f19392OooO00o = {new OooO00o(99, 99, -1, -1), new OooO00o(35, 36, -1, -1), new OooO00o(71, 72, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(85, 86, -1, -1), new OooO00o(90, 96, -1, -1), new OooO00o(80, 81, -1, -1), new OooO00o(6, 6, -1, -1), new OooO00o(20, 20, -1, -1), new OooO00o(19, 19, -1, -1), new OooO00o(32, 34, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(30, 31, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(50, 52, -1, -1), new OooO00o(83, 83, -1, -1), new OooO00o(60, 62, -1, -1), new OooO00o(46, 47, -1, -1), new OooO00o(66, 67, 73, -1), new OooO00o(40, 42, -1, -1), new OooO00o(70, 71, -1, -1), new OooO00o(1, 2, -1, -1), new OooO00o(20, 21, -1, -1), new OooO00o(3, 4, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(48, 49, -1, -1), new OooO00o(55, 56, -1, -1), new OooO00o(63, 65, -1, -1), new OooO00o(96, 96, -1, -1), new OooO00o(38, 39, -1, -1), new OooO00o(55, 56, -1, -1), new OooO00o(27, 28, -1, -1), new OooO00o(58, 58, -1, -1), new OooO00o(68, 69, -1, -1), new OooO00o(3, 4, -1, -1), new OooO00o(7, 8, -1, -1), new OooO00o(87, 88, 86, -1), new OooO00o(88, 89, 96, -1), new OooO00o(10, 14, 0, 6), new OooO00o(43, 45, -1, -1), new OooO00o(73, 74, -1, -1), new OooO00o(97, 97, -1, -1), new OooO00o(15, 19, -1, -1), new OooO00o(6, 6, 0, 9), new OooO00o(96, 96, -1, -1), new OooO00o(2, 2, -1, -1), new OooO00o(29, 29, -1, -1), new OooO00o(57, 57, -1, -1), new OooO00o(37, 38, -1, -1), new OooO00o(75, 79, 87, 88), new OooO00o(84, 84, -1, -1), new OooO00o(22, 24, 20, -1), new OooO00o(6, 9, -1, -1), new OooO00o(5, 5, -1, -1), new OooO00o(98, 99, -1, -1), new OooO00o(53, 54, -1, -1), new OooO00o(24, 26, -1, -1), new OooO00o(82, 83, -1, -1)};
    public static final int OooO0O0 = 14;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19393OooO0O0 = "\t                　";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Pattern f19394OooO0O0 = Pattern.compile("(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\u000b\f\r  ]|$)", 2);
    public static final int OooO0OO = 5;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19395OooO0OO = "\t                　\n\u000b\f\r  ";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Pattern f19396OooO0OO = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final int OooO0Oo = 25;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f19397OooO0Oo = ",*•\t                　\n\u000b\f\r  ";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final Pattern f19398OooO0Oo = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final String OooO0o = ",\"'\t                　\n\u000b\f\r  ";

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final Pattern f19399OooO0o = Pattern.compile("(?:\\d{5}(?:-\\d{4})?)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final int OooO0o0 = 5;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f19400OooO0o0 = "(?=[,*•\t                　\n\u000b\f\r  ]|$)";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final Pattern f19401OooO0o0 = Pattern.compile("(\\d+)(st|nd|rd|th)", 2);
    public static final String OooO0oO = "(?=[,\"'\t                　\n\u000b\f\r  ]|$)";
    public static final String OooO0oo = ":,\"'\t                　\n\u000b\f\r  ";

    /* renamed from: com.pd.sdk.o00O0ooo$OooO00o */
    public static class OooO00o {
        public int OooO00o;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;

        public OooO00o(int i, int i2, int i3, int i4) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.OooO0Oo = i3;
        }

        public boolean OooO00o(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            if ((this.OooO00o <= parseInt && parseInt <= this.OooO0O0) || parseInt == this.OooO0OO || parseInt == this.OooO0Oo) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18363OooO00o(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f19401OooO0o0.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i3 = parseInt % 10;
        String str2 = "th";
        if (i3 == 1) {
            if (parseInt % 100 != 11) {
                str2 = "st";
            }
            return lowerCase.equals(str2);
        } else if (i3 == 2) {
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        } else if (i3 != 3) {
            return lowerCase.equals(str2);
        } else {
            if (parseInt % 100 != 13) {
                str2 = "rd";
            }
            return lowerCase.equals(str2);
        }
    }

    @VisibleForTesting
    public static MatchResult OooO0O0(String str, int i) {
        if (i > 0 && f19397OooO0Oo.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f19396OooO0OO.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            return region.toMatchResult();
        }
        return null;
    }

    @VisibleForTesting
    public static boolean OooO0OO(String str) {
        return f19399OooO0o.matcher(str).matches();
    }

    @VisibleForTesting
    public static boolean OooO0O0(String str) {
        return f19398OooO0Oo.matcher(str).matches();
    }

    @VisibleForTesting
    public static MatchResult OooO00o(String str, int i) {
        if (i > 0 && OooO0oo.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f19394OooO0O0.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (m18363OooO00o(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18364OooO00o(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i;
                break;
            }
            groupCount = i;
        }
        if (!f19399OooO0o.matcher(str).matches() || !f19392OooO00o[groupCount].OooO00o(str)) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public static boolean OooO00o(String str, String str2) {
        return m18364OooO00o(str, OooO0O0(str2, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return -r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int OooO00o(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7078o00O0ooo.OooO00o(java.lang.String, java.util.regex.MatchResult):int");
    }

    public static String OooO00o(String str) {
        Matcher matcher = f19394OooO0O0.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            if (m18363OooO00o(matcher.group(0))) {
                int start = matcher.start();
                int OooO00o2 = OooO00o(str, (MatchResult) matcher);
                if (OooO00o2 > 0) {
                    return str.substring(start, OooO00o2);
                }
                i = -OooO00o2;
            } else {
                i = matcher.end();
            }
        }
        return null;
    }
}
