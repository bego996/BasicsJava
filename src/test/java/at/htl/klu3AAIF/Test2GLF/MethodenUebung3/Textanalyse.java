package at.htl.klu3AAIF.Test2GLF.MethodenUebung3;

import java.util.Scanner;

public class Textanalyse {
    public static void main(String[] args) {
        String inputText = new Scanner(System.in).nextLine().replaceAll(" +","");
        int letterSearcher = HTLStringUtil.getOccurrences(inputText,"e");
        int sentenceCounter = HTLStringUtil.getNumberOfSencences(inputText);
        String whichTextIsIt = HTLStringUtil.isQuestion(inputText) ? "Question":
                               HTLStringUtil.isRequest(inputText) ? "Request"  :
                               HTLStringUtil.isStatement(inputText) ? "Statement": "";
        String isPAlindrome = HTLStringUtil.isPalindrome(inputText) ? "Ist ein Palindrome": "";
        System.out.printf("Der Buchstabe e kommt %d mal vor. %s",letterSearcher,sentenceCounter==1 ? "Es ist eine "+whichTextIsIt+".":
                                                                                                    sentenceCounter==0 ? isPAlindrome:
                                                                                                    sentenceCounter > 1 ? "Der Text besteht aus "+sentenceCounter+" Sätzen":"");
    }
}
