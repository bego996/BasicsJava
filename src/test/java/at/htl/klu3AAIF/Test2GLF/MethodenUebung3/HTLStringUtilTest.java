package at.htl.klu3AAIF.Test2GLF.MethodenUebung3;

public class HTLStringUtilTest {
    public static void main(String[] args) {
        System.out.println(HTLStringUtil.getOccurrences("HTL-Mössingerstrasse","H"));
        System.out.println(HTLStringUtil.getOccurrences("","e"));
        System.out.println(HTLStringUtil.getOccurrences(null,"e"));
        System.out.println();
        System.out.println(HTLStringUtil.isPalindrome(""));
        System.out.println(HTLStringUtil.isPalindrome("ANNA"));
        System.out.println(HTLStringUtil.isPalindrome(null));
        System.out.println();
        System.out.println(HTLStringUtil.isQuestion(""));
        System.out.println(HTLStringUtil.isQuestion("Heute ist ein schöner Tag"));
        System.out.println(HTLStringUtil.isQuestion("Ist heute ein schöner Tag?"));
        System.out.println();
        System.out.println(HTLStringUtil.isRequest(""));
        System.out.println(HTLStringUtil.isRequest("Heute regnet es"));
        System.out.println(HTLStringUtil.isRequest("Heute regnet es!"));
        System.out.println();
        System.out.println(HTLStringUtil.isStatement(""));
        System.out.println(HTLStringUtil.isStatement("Heute ist ein schöner Tag"));
        System.out.println(HTLStringUtil.isStatement("Heute ist ein schöner Tag."));
        System.out.println();
        System.out.println(HTLStringUtil.getNumberOfSencences(""));
        System.out.println(HTLStringUtil.getNumberOfSencences("Heute ist ein schöner Tag. Es regnet nicht!"));
        System.out.println(HTLStringUtil.getNumberOfSencences("Heute regnet es nicht!"));
    }
}
