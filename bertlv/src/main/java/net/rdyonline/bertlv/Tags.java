package net.rdyonline.bertlv;

import java.util.ArrayList;
import java.util.List;

public class Tags {

    public static List<String> getKnownTags() {
        return knownTags;
    }

    public static int getLongestTagLength() {
        return 8;
    }

    // sourced from https://www.eftlab.co.uk/index.php/site-map/knowledge-base/145-emv-nfc-tags
    /**
     * I'm sure there's a nicer way to do this, but I would like to familiarise myself with the
     * constraints of the BER-TLV format a little more before implementing something a little less
     * crude
     */
    private static List<String> knownTags = new ArrayList<String>() {{
        add("06");
        add("41");
        add("42");
        add("43");
        add("44");
        add("45");
        add("46");
        add("47");
        add("48");
        add("4D");
        add("4F");
        add("50");
        add("51");
        add("52");
        add("53");
        add("56");
        add("57");
        add("58");
        add("59");
        add("5A");
        add("5B");
        add("5C");
        add("5D");
        add("5E");
        add("5F20");
        add("5F21");
        add("5F22");
        add("5F23");
        add("5F24");
        add("5F25");
        add("5F26");
        add("5F27");
        add("5F28");
        add("5F29");
        add("5F2A");
        add("5F2B");
        add("5F2C");
        add("5F2D");
        add("5F2E");
        add("5F2F");
        add("5F30");
        add("5F32");
        add("5F33");
        add("5F34");
        add("5F35");
        add("5F36");
        add("5F37");
        add("5F38");
        add("5F39");
        add("5F3A");
        add("5F3B");
        add("5F3C");
        add("5F3D");
        add("5F40");
        add("5F41");
        add("5F42");
        add("5F43");
        add("5F44");
        add("5F45");
        add("5F46");
        add("5F47");
        add("5F48");
        add("5F49");
        add("5F4A");
        add("5F4B");
        add("5F4C");
        add("5F4D");
        add("5F4E");
        add("5F50");
        add("5F53");
        add("5F54");
        add("5F55");
        add("5F56");
        add("5F57");
        add("60");
        add("6080");
        add("6081");
        add("6082");
        add("6083");
        add("6084");
        add("6085");
        add("60A0");
        add("61");
        add("62");
        add("6280");
        add("6281");
        add("6282");
        add("6283");
        add("6284");
        add("6285");
        add("6286");
        add("6287");
        add("6288");
        add("628A");
        add("628B");
        add("628C");
        add("628D");
        add("62A0");
        add("62A1");
        add("62A2");
        add("62A5");
        add("62AB");
        add("62AC");
        add("63");
        add("64");
        add("65");
        add("66");
        add("67");
        add("68");
        add("6A");
        add("6A80");
        add("6A81");
        add("6A82");
        add("6A83");
        add("6A84");
        add("6B");
        add("6B06");
        add("6B80");
        add("6BA0");
        add("6C");
        add("6D");
        add("6E");
        add("6F");
        add("6FA5");
        add("70");
        add("71");
        add("7186");
        add("719F18");
        add("72");
        add("73");
        add("77");
        add("78");
        add("79");
        add("7A");
        add("7A80");
        add("7A81");
        add("7A82");
        add("7A83");
        add("7A84");
        add("7A85");
        add("7A86");
        add("7A87");
        add("7A88");
        add("7A89");
        add("7A8A");
        add("7A8B");
        add("7A8C");
        add("7A8D");
        add("7A8E");
        add("7A93");
        add("7A9F2X");
        add("7A9F3Y");
        add("7B");
        add("7B80");
        add("7B8A");
        add("7BAC");
        add("7BA4");
        add("7BAA");
        add("7BB4");
        add("7BB6");
        add("7BB8");
        add("7D");
        add("7D80");
        add("7D81");
        add("7D82");
        add("7D83");
        add("7D84");
        add("7D85");
        add("7D86");
        add("7D87");
        add("7D8E");
        add("7D90");
        add("7D91");
        add("7D92");
        add("7D93");
        add("7D94");
        add("7D95");
        add("7D96");
        add("7D97");
        add("7D99");
        add("7D9A");
        add("7D9B");
        add("7D9C");
        add("7D9D");
        add("7D9E");
        add("7DA0");
        add("7DA1");
        add("7DA2");
        add("7DA4");
        add("7DA5");
        add("7DA8");
        add("7DAA");
        add("7DAB");
        add("7DAC");
        add("7DAD");
        add("7DAE");
        add("7DAF");
        add("7DB0");
        add("7DB1");
        add("7DB2");
        add("7DB3");
        add("7DB4");
        add("7DB5");
        add("7DB6");
        add("7DB7");
        add("7DB8");
        add("7DB9");
        add("7DBA");
        add("7DBB");
        add("7DBC");
        add("7DBD");
        add("7DBE");
        add("7E");
        add("7F20");
        add("7F21");
        add("7F2E");
        add("7F49");
        add("7F4980");
        add("7F4981");
        add("7F4982");
        add("7F4983");
        add("7F4984");
        add("7F4985");
        add("7F4986");
        add("7F4C");
        add("7F4E");
        add("7F4E42");
        add("7F4E5F20");
        add("7F4E5F24");
        add("7F4E5F25");
        add("7F4E5F29");
        add("7F4E65");
        add("7F60");
        add("80");
        add("81");
        add("82");
        add("83");
        add("84");
        add("86");
        add("87");
        add("88");
        add("89");
        add("8A");
        add("8C");
        add("8D");
        add("8E");
        add("8F");
        add("90");
        add("91");
        add("92");
        add("93");
        add("94");
        add("95");
        add("97");
        add("98");
        add("99");
        add("9A");
        add("9B");
        add("9C");
        add("9D");
        add("9F01");
        add("9F02");
        add("9F03");
        add("9F04");
        add("9F05");
        add("9F06");
        add("9F07");
        add("9F08");
        add("9F09");
        add("9F0B");
        add("9F0D");
        add("9F0E");
        add("9F0F");
        add("9F10");
        add("9F11");
        add("9F12");
        add("9F13");
        add("9F14");
        add("9F15");
        add("9F16");
        add("9F17");
        add("9F18");
        add("9F19");
        add("9F1A");
        add("9F1B");
        add("9F1C");
        add("9F1D");
        add("9F1E");
        add("9F1F");
        add("9F20");
        add("9F21");
        add("9F22");
        add("9F23");
        add("9F24");
        add("9F26");
        add("9F27");
        add("9F29");
        add("9F2A");
        add("9F2D");
        add("9F2E");
        add("9F2F");
        add("9F32");
        add("9F33");
        add("9F34");
        add("9F35");
        add("9F36");
        add("9F37");
        add("9F38");
        add("9F39");
        add("9F3A");
        add("9F3B");
        add("9F3C");
        add("9F3D");
        add("9F40");
        add("9F41");
        add("9F42");
        add("9F43");
        add("9F44");
        add("9F45");
        add("9F46");
        add("9F47");
        add("9F48");
        add("9F49");
        add("9F4A");
        add("9F4B");
        add("9F4C");
        add("9F4D");
        add("9F4E");
        add("9F4F");
        add("9F50");
        add("9F51");
        add("9F52");
        add("9F53");
        add("9F54");
        add("9F55");
        add("9F56");
        add("9F57");
        add("9F58");
        add("9F59");
        add("9F5A");
        add("9F5B");
        add("9F5C");
        add("9F5D");
        add("9F5E");
        add("9F5F");
        add("9F60");
        add("9F61");
        add("9F62");
        add("9F63");
        add("9F64");
        add("9F65");
        add("9F66");
        add("9F67");
        add("9F68");
        add("9F69");
        add("9F6A");
        add("9F6B");
        add("9F6C");
        add("9F6D");
        add("9F6E");
        add("9F6F");
        add("9F70");
        add("9F71");
        add("9F72");
        add("9F73");
        add("9F74");
        add("9F75");
        add("9F76");
        add("9F77");
        add("9F78");
        add("9F79");
        add("9F7A");
        add("9F7B");
        add("9F7C");
        add("9F7D");
        add("9F7E");
        add("9F7F");
        add("A5");
        add("BF0C");
        add("BF50");
        add("BF60");
        add("C3");
        add("C4");
        add("C5");
        add("C6");
        add("C7");
        add("C8");
        add("C9");
        add("CA");
        add("CB");
        add("CD");
        add("CE");
        add("CF");
        add("D1");
        add("D2");
        add("D3");
        add("D5");
        add("D6");
        add("D7");
        add("D8");
        add("D9");
        add("DA");
        add("DB");
        add("DC");
        add("DD");
        add("DF01");
        add("DF02");
        add("DF03");
        add("DF04");
        add("DF05");
        add("DF06");
        add("DF07");
        add("DF08");
        add("DF09");
        add("DF0B");
        add("DF0C");
        add("DF0D");
        add("DF0E");
        add("DF0F");
        add("DF12");
        add("DF13");
        add("DF14");
        add("DF15");
        add("DF16");
        add("DF17");
        add("DF18");
        add("DF20");
        add("DF21");
        add("DF22");
        add("DF23");
        add("DF24");
        add("DF25");
        add("DF26");
        add("DF40");
        add("DF41");
        add("DF42");
        add("DF43");
        add("DF44");
        add("DF47");
        add("DF48");
        add("DF49");
        add("DF4A");
        add("DF4B");
        add("DF51");
        add("DF52");
        add("DF53");
        add("DF54");
        add("DF55");
        add("DF56");
        add("DF57");
        add("DF60");
        add("DF61");
        add("DF62");
        add("DF63");
        add("DF64");
        add("DF65");
        add("DF6B");
        add("DF79");
        add("DF8101");
        add("DF8102");
        add("DF8104");
        add("DF8105");
        add("DF8106");
        add("DF8107");
        add("DF8108");
        add("DF8109");
        add("DF810A");
        add("DF810B");
        add("DF810C");
        add("DF810D");
        add("DF810E");
        add("DF810F");
        add("DF8110");
        add("DF8111");
        add("DF8112");
        add("DF8113");
        add("DF8114");
        add("DF8115");
        add("DF8116");
        add("DF8117");
        add("DF8118");
        add("DF8119");
        add("DF811A");
        add("DF811B");
        add("DF811C");
        add("DF811D");
        add("DF811E");
        add("DF811F");
        add("DF8120");
        add("DF8121");
        add("DF8122");
        add("DF8123");
        add("DF8124");
        add("DF8125");
        add("DF8126");
        add("DF8127");
        add("DF8128");
        add("DF8129");
        add("DF812A");
        add("DF812B");
        add("DF812C");
        add("DF812D");
        add("DF8130");
        add("DF8131");
        add("FF60");
        add("FF62");
        add("FF63");
        add("FF8101");
        add("FF8102");
        add("FF8103");
        add("FF8104");
        add("FF8105");
        add("FF8106");
    }};

}