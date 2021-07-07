package com.p118pd.sdk;

import android.support.p000v4.media.session.MediaSessionCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.drew.lang.annotations.NotNull;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.analytics.pro.C3445k;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOOOoo0  reason: case insensitive filesystem */
public class C8130oOOOOoo0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21135OooO00o = new HashMap<>();
    public static final int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21136OooO0O0 = "fmt ";
    @NotNull

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final transient HashMap<String, Integer> f21137OooO0O0 = new HashMap<>();
    public static final int OooO0OO = 3;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21138OooO0OO = "data";
    @NotNull

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final transient HashMap<Integer, String> f21139OooO0OO = new HashMap<>();
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21140OooO0Oo = "INFO";
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f21141OooO0o0 = "WAVE";
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 10;
    public static final int OooOO0O = 11;
    public static final int OooOO0o = 12;
    public static final int OooOOO = 14;
    public static final int OooOOO0 = 13;
    public static final int OooOOOO = 15;
    public static final int OooOOOo = 16;

    static {
        f21137OooO0O0.put("IART", 7);
        f21137OooO0O0.put("INAM", 8);
        f21137OooO0O0.put("IPRD", 9);
        f21137OooO0O0.put("ITRK", 10);
        f21137OooO0O0.put("ICRD", 11);
        f21137OooO0O0.put("IGNR", 12);
        f21137OooO0O0.put("ICMT", 13);
        f21137OooO0O0.put("ICOP", 14);
        f21137OooO0O0.put("ISFT", 15);
        f21135OooO00o.put(1, "Format");
        f21135OooO00o.put(2, "Channels");
        f21135OooO00o.put(3, "Samples Per Second");
        f21135OooO00o.put(4, "Bytes Per Second");
        f21135OooO00o.put(5, "Block Alignment");
        f21135OooO00o.put(6, "Bits Per Sample");
        f21135OooO00o.put(7, ExifInterface.f14203OooOooo);
        f21135OooO00o.put(8, "Title");
        f21135OooO00o.put(9, "Product");
        f21135OooO00o.put(10, "Track Number");
        f21135OooO00o.put(11, "Date Created");
        f21135OooO00o.put(12, "Genre");
        f21135OooO00o.put(13, "Comments");
        f21135OooO00o.put(14, ExifInterface.f14209Oooo000);
        f21135OooO00o.put(15, ExifInterface.f14201OooOooO);
        f21135OooO00o.put(16, "Duration");
        f21139OooO0OO.put(1, "Microsoft PCM");
        f21139OooO0OO.put(2, "Microsoft ADPCM");
        f21139OooO0OO.put(3, "Microsoft IEEE float");
        f21139OooO0OO.put(4, "Compaq VSELP");
        f21139OooO0OO.put(5, "IBM CVSD");
        f21139OooO0OO.put(6, "Microsoft a-Law");
        f21139OooO0OO.put(7, "Microsoft u-Law");
        f21139OooO0OO.put(8, "Microsoft DTS");
        f21139OooO0OO.put(9, "DRM");
        f21139OooO0OO.put(10, "WMA 9 Speech");
        f21139OooO0OO.put(11, "Microsoft Windows Media RT Voice");
        f21139OooO0OO.put(16, "OKI-ADPCM");
        f21139OooO0OO.put(17, "Intel IMA/DVI-ADPCM");
        f21139OooO0OO.put(18, "Videologic Mediaspace ADPCM");
        f21139OooO0OO.put(19, "Sierra ADPCM");
        f21139OooO0OO.put(20, "Antex G.723 ADPCM");
        f21139OooO0OO.put(21, "DSP Solutions DIGISTD");
        f21139OooO0OO.put(22, "DSP Solutions DIGIFIX");
        f21139OooO0OO.put(23, "Dialoic OKI ADPCM");
        f21139OooO0OO.put(24, "Media Vision ADPCM");
        f21139OooO0OO.put(25, "HP CU");
        f21139OooO0OO.put(26, "HP Dynamic Voice");
        f21139OooO0OO.put(32, "Yamaha ADPCM");
        f21139OooO0OO.put(33, "SONARC Speech Compression");
        f21139OooO0OO.put(34, "DSP Group True Speech");
        f21139OooO0OO.put(35, "Echo Speech Corp.");
        f21139OooO0OO.put(36, "Virtual Music Audiofile AF36");
        f21139OooO0OO.put(37, "Audio Processing Tech.");
        f21139OooO0OO.put(38, "Virtual Music Audiofile AF10");
        f21139OooO0OO.put(39, "Aculab Prosody 1612");
        f21139OooO0OO.put(40, "Merging Tech. LRC");
        f21139OooO0OO.put(48, "Dolby AC2");
        f21139OooO0OO.put(49, "Microsoft GSM610");
        f21139OooO0OO.put(50, "MSN Audio");
        f21139OooO0OO.put(51, "Antex ADPCME");
        f21139OooO0OO.put(52, "Control Resources VQLPC");
        f21139OooO0OO.put(53, "DSP Solutions DIGIREAL");
        f21139OooO0OO.put(54, "DSP Solutions DIGIADPCM");
        f21139OooO0OO.put(55, "Control Resources CR10");
        f21139OooO0OO.put(56, "Natural MicroSystems VBX ADPCM");
        f21139OooO0OO.put(57, "Crystal Semiconductor IMA ADPCM");
        f21139OooO0OO.put(58, "Echo Speech ECHOSC3");
        f21139OooO0OO.put(59, "Rockwell ADPCM");
        f21139OooO0OO.put(60, "Rockwell DIGITALK");
        f21139OooO0OO.put(61, "Xebec Multimedia");
        f21139OooO0OO.put(64, "Antex G.721 ADPCM");
        f21139OooO0OO.put(65, "Antex G.728 CELP");
        f21139OooO0OO.put(66, "Microsoft MSG723");
        f21139OooO0OO.put(67, "IBM AVC ADPCM");
        f21139OooO0OO.put(69, "ITU-T G.726");
        f21139OooO0OO.put(80, "Microsoft MPEG");
        f21139OooO0OO.put(81, "RT23 or PAC");
        f21139OooO0OO.put(82, "InSoft RT24");
        f21139OooO0OO.put(83, "InSoft PAC");
        f21139OooO0OO.put(85, "MP3");
        f21139OooO0OO.put(89, "Cirrus");
        f21139OooO0OO.put(96, "Cirrus Logic");
        f21139OooO0OO.put(97, "ESS Tech. PCM");
        f21139OooO0OO.put(98, "Voxware Inc.");
        f21139OooO0OO.put(99, "Canopus ATRAC");
        f21139OooO0OO.put(100, "APICOM G.726 ADPCM");
        f21139OooO0OO.put(101, "APICOM G.722 ADPCM");
        f21139OooO0OO.put(102, "Microsoft DSAT");
        f21139OooO0OO.put(103, "Micorsoft DSAT DISPLAY");
        f21139OooO0OO.put(105, "Voxware Byte Aligned");
        f21139OooO0OO.put(112, "Voxware AC8");
        f21139OooO0OO.put(113, "Voxware AC10");
        f21139OooO0OO.put(114, "Voxware AC16");
        f21139OooO0OO.put(115, "Voxware AC20");
        f21139OooO0OO.put(116, "Voxware MetaVoice");
        f21139OooO0OO.put(117, "Voxware MetaSound");
        f21139OooO0OO.put(118, "Voxware RT29HW");
        f21139OooO0OO.put(119, "Voxware VR12");
        f21139OooO0OO.put(120, "Voxware VR18");
        f21139OooO0OO.put(121, "Voxware TQ40");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST), "Voxware SC3");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_APPLIED_DEXOPT_FORMAT), "Voxware SC3");
        f21139OooO0OO.put(128, "Soundsoft");
        f21139OooO0OO.put(129, "Voxware TQ60");
        f21139OooO0OO.put(130, "Microsoft MSRT24");
        f21139OooO0OO.put(131, "AT&T G.729A");
        f21139OooO0OO.put(132, "Motion Pixels MVI MV12");
        f21139OooO0OO.put(133, "DataFusion G.726");
        f21139OooO0OO.put(134, "DataFusion GSM610");
        f21139OooO0OO.put(136, "Iterated Systems Audio");
        f21139OooO0OO.put(137, "Onlive");
        f21139OooO0OO.put(138, "Multitude, Inc. FT SX20");
        f21139OooO0OO.put(139, "Infocom ITS A/S G.721 ADPCM");
        f21139OooO0OO.put(140, "Convedia G729");
        f21139OooO0OO.put(141, "Not specified congruency, Inc.");
        f21139OooO0OO.put(145, "Siemens SBC24");
        f21139OooO0OO.put(146, "Sonic Foundry Dolby AC3 APDIF");
        f21139OooO0OO.put(147, "MediaSonic G.723");
        f21139OooO0OO.put(148, "Aculab Prosody 8kbps");
        f21139OooO0OO.put(151, "ZyXEL ADPCM");
        f21139OooO0OO.put(152, "Philips LPCBB");
        f21139OooO0OO.put(153, "Studer Professional Audio Packed");
        f21139OooO0OO.put(160, "Malden PhonyTalk");
        f21139OooO0OO.put(161, "Racal Recorder GSM");
        f21139OooO0OO.put(162, "Racal Recorder G720.a");
        f21139OooO0OO.put(163, "Racal G723.1");
        f21139OooO0OO.put(164, "Racal Tetra ACELP");
        f21139OooO0OO.put(176, "NEC AAC NEC Corporation");
        f21139OooO0OO.put(255, "AAC");
        f21139OooO0OO.put(256, "Rhetorex ADPCM");
        f21139OooO0OO.put(257, "IBM u-Law");
        f21139OooO0OO.put(258, "IBM a-Law");
        f21139OooO0OO.put(259, "IBM ADPCM");
        f21139OooO0OO.put(273, "Vivo G.723");
        f21139OooO0OO.put(274, "Vivo Siren");
        f21139OooO0OO.put(288, "Philips Speech Processing CELP");
        f21139OooO0OO.put(289, "Philips Speech Processing GRUNDIG");
        f21139OooO0OO.put(291, "Digital G.723");
        f21139OooO0OO.put(293, "Sanyo LD ADPCM");
        f21139OooO0OO.put(304, "Sipro Lab ACEPLNET");
        f21139OooO0OO.put(305, "Sipro Lab ACELP4800");
        f21139OooO0OO.put(306, "Sipro Lab ACELP8V3");
        f21139OooO0OO.put(307, "Sipro Lab G.729");
        f21139OooO0OO.put(308, "Sipro Lab G.729A");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_INFO_CORRUPTED), "Sipro Lab Kelvin");
        f21139OooO0OO.put(310, "VoiceAge AMR");
        f21139OooO0OO.put(Integer.valueOf((int) MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP), "Dictaphone G.726 ADPCM");
        f21139OooO0OO.put(Integer.valueOf((int) C8025oOO00oOO.OooOO0), "Qualcomm PureVoice");
        f21139OooO0OO.put(337, "Qualcomm HalfRate");
        f21139OooO0OO.put(341, "Ring Zero Systems TUBGSM");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_PACKAGE_CHECK_LIB_META), "Microsoft Audio1");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND), "Windows Media Audio V2 V7 V8 V9 / DivX audio (WMA) / Alex AC3 Audio");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND), "Windows Media Audio Professional V9");
        f21139OooO0OO.put(Integer.valueOf((int) TinkerReport.KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL), "Windows Media Audio Lossless V9");
        f21139OooO0OO.put(356, "WMA Pro over S/PDIF");
        f21139OooO0OO.put(368, "UNISYS NAP ADPCM");
        f21139OooO0OO.put(369, "UNISYS NAP ULAW");
        f21139OooO0OO.put(370, "UNISYS NAP ALAW");
        f21139OooO0OO.put(371, "UNISYS NAP 16K");
        f21139OooO0OO.put(372, "MM SYCOM ACM SYC008 SyCom Technologies");
        f21139OooO0OO.put(373, "MM SYCOM ACM SYC701 G726L SyCom Technologies");
        f21139OooO0OO.put(374, "MM SYCOM ACM SYC701 CELP54 SyCom Technologies");
        f21139OooO0OO.put(375, "MM SYCOM ACM SYC701 CELP68 SyCom Technologies");
        f21139OooO0OO.put(Integer.valueOf((int) C8025oOO00oOO.OooOOO0), "Knowledge Adventure ADPCM");
        f21139OooO0OO.put(384, "Fraunhofer IIS MPEG2AAC");
        f21139OooO0OO.put(400, "Digital Theater Systems DTS DS");
        f21139OooO0OO.put(512, "Creative Labs ADPCM");
        f21139OooO0OO.put(514, "Creative Labs FASTSPEECH8");
        f21139OooO0OO.put(515, "Creative Labs FASTSPEECH10");
        f21139OooO0OO.put(528, "UHER ADPCM");
        f21139OooO0OO.put(533, "Ulead DV ACM");
        f21139OooO0OO.put(534, "Ulead DV ACM");
        f21139OooO0OO.put(544, "Quarterdeck Corp.");
        f21139OooO0OO.put(560, "I-Link VC");
        f21139OooO0OO.put(576, "Aureal Semiconductor Raw Sport");
        f21139OooO0OO.put(Integer.valueOf((int) C8025oOO00oOO.Oooo), "ESST AC3");
        f21139OooO0OO.put(Integer.valueOf((int) C8025oOO00oOO.OoooO0O), "Interactive Products HSX");
        f21139OooO0OO.put(593, "Interactive Products RPELP");
        f21139OooO0OO.put(608, "Consistent CS2");
        f21139OooO0OO.put(624, "Sony SCX");
        f21139OooO0OO.put(625, "Sony SCY");
        f21139OooO0OO.put(626, "Sony ATRAC3");
        f21139OooO0OO.put(Integer.valueOf((int) C8025oOO00oOO.Ooooo0o), "Sony SPC");
        f21139OooO0OO.put(Integer.valueOf((int) C7997oO0ooOO0.OooOoO), "TELUM Telum Inc.");
        f21139OooO0OO.put(641, "TELUMIA Telum Inc.");
        f21139OooO0OO.put(645, "Norcom Voice Systems ADPCM");
        f21139OooO0OO.put(768, "Fujitsu FM TOWNS SND");
        f21139OooO0OO.put(769, "Fujitsu (not specified)");
        f21139OooO0OO.put(770, "Fujitsu (not specified)");
        f21139OooO0OO.put(771, "Fujitsu (not specified)");
        f21139OooO0OO.put(772, "Fujitsu (not specified)");
        f21139OooO0OO.put(773, "Fujitsu (not specified)");
        f21139OooO0OO.put(774, "Fujitsu (not specified)");
        f21139OooO0OO.put(Integer.valueOf((int) C7988oO0oo0o.OooOOo0), "Fujitsu (not specified)");
        f21139OooO0OO.put(Integer.valueOf((int) C7992oO0ooO0.OooOO0O), "Fujitsu (not specified)");
        f21139OooO0OO.put(848, "Micronas Semiconductors, Inc. Development");
        f21139OooO0OO.put(849, "Micronas Semiconductors, Inc. CELP833");
        f21139OooO0OO.put(1024, "Brooktree Digital");
        f21139OooO0OO.put(1025, "Intel Music Coder (IMC)");
        f21139OooO0OO.put(Integer.valueOf((int) C8122oOOOO0oo.OooOo0o), "Ligos Indeo Audio");
        f21139OooO0OO.put(1104, "QDesign Music");
        f21139OooO0OO.put(1280, "On2 VP7 On2 Technologies");
        f21139OooO0OO.put(Integer.valueOf((int) C7988oO0oo0o.OooOoO0), "On2 VP6 On2 Technologies");
        f21139OooO0OO.put(1664, "AT&T VME VMPCM");
        f21139OooO0OO.put(1665, "AT&T TCP");
        f21139OooO0OO.put(1792, "YMPEG Alpha (dummy for MPEG-2 compressor)");
        f21139OooO0OO.put(2222, "ClearJump LiteWave (lossless)");
        f21139OooO0OO.put(4096, "Olivetti GSM");
        f21139OooO0OO.put(4097, "Olivetti ADPCM");
        f21139OooO0OO.put(4098, "Olivetti CELP");
        f21139OooO0OO.put(4099, "Olivetti SBC");
        f21139OooO0OO.put(4100, "Olivetti OPR");
        f21139OooO0OO.put(4352, "Lernout & Hauspie");
        f21139OooO0OO.put(4353, "Lernout & Hauspie CELP codec");
        f21139OooO0OO.put(Integer.valueOf((int) C3445k.C3447a.f8740m), "Lernout & Hauspie SBC codec");
        f21139OooO0OO.put(Integer.valueOf((int) C7995oO0ooO0o.OoooOo0), "Lernout & Hauspie SBC codec");
        f21139OooO0OO.put(Integer.valueOf((int) C7995oO0ooO0o.OoooOoO), "Lernout & Hauspie SBC codec");
        f21139OooO0OO.put(5120, "Norris Comm. Inc.");
        f21139OooO0OO.put(Integer.valueOf((int) C7978oO0oOooo.OooOooO), "ISIAudio");
        f21139OooO0OO.put(Integer.valueOf((int) C7992oO0ooO0.OooOo00), "AT&T Soundspace Music Compression");
        f21139OooO0OO.put(6172, "VoxWare RT24 speech codec");
        f21139OooO0OO.put(6174, "Lucent elemedia AX24000P Music codec");
        f21139OooO0OO.put(6513, "Sonic Foundry LOSSLESS");
        f21139OooO0OO.put(6521, "Innings Telecom Inc. ADPCM");
        f21139OooO0OO.put(7175, "Lucent SX8300P speech codec");
        f21139OooO0OO.put(7180, "Lucent SX5363S G.723 compliant codec");
        f21139OooO0OO.put(7939, "CUseeMe DigiTalk (ex-Rocwell)");
        f21139OooO0OO.put(8132, "NCT Soft ALF2CD ACM");
        f21139OooO0OO.put(8192, "FAST Multimedia DVM");
        f21139OooO0OO.put(8193, "Dolby DTS (Digital Theater System)");
        f21139OooO0OO.put(8194, "RealAudio 1 / 2 14.4");
        f21139OooO0OO.put(Integer.valueOf((int) C3445k.C3447a.f8743p), "RealAudio 1 / 2 28.8");
        f21139OooO0OO.put(8196, "RealAudio G2 / 8 Cook (low bitrate)");
        f21139OooO0OO.put(8197, "RealAudio 3 / 4 / 5 Music (DNET)");
        f21139OooO0OO.put(Integer.valueOf((int) C8010oOO000oO.OooOOoo), "RealAudio 10 AAC (RAAC)");
        f21139OooO0OO.put(8199, "RealAudio 10 AAC+ (RACP)");
        f21139OooO0OO.put(9472, "Reserved range to 0x2600 Microsoft");
        f21139OooO0OO.put(13075, "makeAVIS (ffvfw fake AVI sound from AviSynth scripts)");
        f21139OooO0OO.put(16707, "Divio MPEG-4 AAC audio");
        f21139OooO0OO.put(16897, "Nokia adaptive multirate");
        f21139OooO0OO.put(16963, "Divio G726 Divio, Inc.");
        f21139OooO0OO.put(17228, "LEAD Speech");
        f21139OooO0OO.put(22092, "LEAD Vorbis");
        f21139OooO0OO.put(22358, "WavPack Audio");
        f21139OooO0OO.put(26447, "Ogg Vorbis (mode 1)");
        f21139OooO0OO.put(26448, "Ogg Vorbis (mode 2)");
        f21139OooO0OO.put(26449, "Ogg Vorbis (mode 3)");
        f21139OooO0OO.put(26479, "Ogg Vorbis (mode 1+)");
        f21139OooO0OO.put(26480, "Ogg Vorbis (mode 2+)");
        f21139OooO0OO.put(26481, "Ogg Vorbis (mode 3+)");
        f21139OooO0OO.put(Integer.valueOf((int) UMModuleRegister.SHARE_EVENT_VALUE_HIGH), "3COM NBX 3Com Corporation");
        f21139OooO0OO.put(28781, "FAAD AAC");
        f21139OooO0OO.put(31265, "GSM-AMR (CBR, no SID)");
        f21139OooO0OO.put(31266, "GSM-AMR (VBR, including SID)");
        f21139OooO0OO.put(41216, "Comverse Infosys Ltd. G723 1");
        f21139OooO0OO.put(41217, "Comverse Infosys Ltd. AVQSBC");
        f21139OooO0OO.put(41218, "Comverse Infosys Ltd. OLDSBC");
        f21139OooO0OO.put(41219, "Symbol Technologies G729A");
        f21139OooO0OO.put(41220, "VoiceAge AMR WB VoiceAge Corporation");
        f21139OooO0OO.put(41221, "Ingenient Technologies Inc. G726");
        f21139OooO0OO.put(41222, "ISO/MPEG-4 advanced audio Coding");
        f21139OooO0OO.put(41223, "Encore Software Ltd G726");
        f21139OooO0OO.put(41225, "Speex ACM Codec xiph.org");
        f21139OooO0OO.put(57260, "DebugMode SonicFoundry Vegas FrameServer ACM Codec");
        f21139OooO0OO.put(59144, "Unknown -");
        f21139OooO0OO.put(61868, "Free Lossless Audio Codec FLAC");
        f21139OooO0OO.put(Integer.valueOf((int) FragmentActivity.MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS), "Extensible");
        f21139OooO0OO.put(65535, "Development");
    }

    public C8130oOOOOoo0() {
        OooO00o(new C8128oOOOOoOO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "WAV";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19789OooO00o() {
        return f21135OooO00o;
    }
}
