/*
Tahani Al-Moshadak
4-2-2019
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Lexical_Analizer {

    static char lookahead;
    static Scanner read;

    // Write here all the reserved words of C/Java into an array
    private String[] keywords = { "abstract", "boolean", "byte", "case",
            "catch", "char", "class", "continue", "default", "do", "double",
            "else", "extends", "final", "finally", "float", "for", "if",
            "implements", "import", "instanceof", "int", "interface", "long",
            "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "super", "switch", "synchronized",
            "this", "throw", "throws", "transient", "try", "void", "volatile",
            "while", "false", "true", "null" };

    public static void main(String[] args) {

        read = new Scanner(System.in);

        while (read.hasNext()) {// while there is more elements to read

            String line = read.nextLine();
            char[] myChar = line.toCharArray();
            // call tokenizer to generate tokens
            tokenizer(myChar);
        }
        read.close();

        // =================================================================================
        // =================================================================================
    }// end main

    public static void tokenizer(char[] chars) {
        int c = 0;// to record the position of lookahead
        String token = "";
        int caseNum = 0;

        while (c < chars.length) {
            // Read one character from the chars array and store it in lookahead
            lookahead = chars[c];

            switch (caseNum) {

                case 0:
                    // case for white spaces
                    if (lookahead == '\r' || lookahead == '\t' || lookahead == ' ' || lookahead == '\n') {
                        caseNum = 0;
                        // skip the white space by reading another character
                        c = c + 1;
                    }
                    // go to case of identifiers
                    else if (lookahead == '_' || Character.isLetter(lookahead))
                    // underscore and Letter for Identifiers
                    {
                        token += lookahead;
                        c = c + 1;
                        caseNum = 1;

                    }
                    // go to case of digits
                    else if (Character.isDigit(lookahead)) {
                        // complete

                    }
                    // go to case of ,
                    else if (lookahead == ',') {
                        token += lookahead;
                        caseNum = 5;

                    }
                    // go to case of ;
                    else if (lookahead == ';') {
                        token += lookahead;
                        caseNum = 6;
                    }
                    // go to case of :
                    else if (lookahead == ':') {
                        // complete

                    }
                    // go to case of ?
                    else if (lookahead == '?') {
                        // complete

                    }
                    // go to case of {
                    else if (lookahead == '{') {
                        // complete

                    }
                    // go caseNum of }
                    else if (lookahead == '}') {
                        // complete

                    }
                    // ADD the other cases
                    // ********************
                    /*
                     * Write the similar code for following operators:
                     * Operators (+ ,+=, ++) (-,-=,--),(=)
                     * 
                     */
                    // *********************
                    else {
                        // At the END
                        // you should implement error method to display a message that is UNRECOGNIZED
                        // TOKEN
                        // and then terminate the Program

                    }
                    break;
                // end case 0
                // *****************************************************
                // *****************************************************
                // Case 1 for completing ID
                case 1:
                    if (lookahead == '_' || Character.isLetter(lookahead) || Character.isDigit(lookahead)) {
                        token += lookahead;// to start new token
                        c = c + 1;
                        caseNum = 1;
                    } else {
                        caseNum = 2;
                    }
                    break;
                // end case 1
                // =====================================================
                // *****************************************************
                // *****************************************************
                // case of IDENTIFIER TOKEN
                case 2:
                    // check keywords
                    // printing IDENTIFIER TOKEN
                    System.out.println(token + "\t\t" + "ID");
                    token = "";// to start new token
                    caseNum = 0;
                    break;
                // =====================================================
                // case of INTEGER TOKEN
                case 3:
                    // complete

                    break;

                case 4:
                    //// complete here to print the token (integer)
                    break;
                // ============================================
                // case of COMMA
                case 5:
                    System.out.println(token + "\t\t" + "COMMA");
                    token = "";// to start new token
                    c = c + 1;
                    caseNum = 0;
                    break;
                // =====================================================
                // case of SEMI_COLON
                case 6:
                    System.out.println(token + "\t\t" + "SEMI_COLON");
                    caseNum = 0;
                    token = "";// to start new token
                    c = c + 1;
                    break;
                // =====================================================
                case 7:
                    // complete here to print the token

                    break;
                // =====================================================
                case 8:
                    // complete here to print the token

                    break;
                // =====================================================
                case 9:
                    // complete here to print the token

                    break;
                // =====================================================
                case 10:
                    // complete here to print the token

                    break;
                // =======================================================

            }// end of main switch

        }

    }// end of tokenizer

    // ==================================================================================
    // ==================================================================================
}// end class
