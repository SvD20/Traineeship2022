package by.incubator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Input word after that you want to insert");
        String searchingWord = scanner.nextLine();
        System.out.println("Input word you want to insert");
        String insertingWord = scanner.nextLine();
        String startString = "Hello, user! How are you?";
        System.out.println(startString);
        insertTextAtPosition(startString,insertingWord,searchingWord);*/

        //String subString = "dear";
        char deletedChar = '!';
        String startString = "Hello, user! How are you?";
        String oldSubstring = "user";
        String newSubstring = "programmer";
        //System.out.println(replaceSubstrings(startString,newSubstring,oldSubstring));
        //System.out.println(replaceSubstrings(startString,newSubstring,oldSubstring));
        //reverseStringFromConsole();
        //deleteSpacesFromString();
        //upperCaseOutput();
        //evenToUpperCaseTransform();
        //replaceTheEmptyStrings();
        //stringCompare();

    }

    public static String addTextToEnd(String startString, String subString){ ////b1
        StringBuilder stringBuilder = new StringBuilder();
        return  stringBuilder.append(startString + " ").append(subString).toString();
    }

    public static void insertTextAtPosition(String startString, String subString, String previousWord){////b2
        String [] words = startString.split(" ");
        boolean flag = false;
        while(true){
            flag = isWordInSentence(words,previousWord);
            if(flag){
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < words.length - 1; i++){
                    stringBuilder.append(words[i] + " ");
                    if (words[i].equals(previousWord)){
                        stringBuilder.append(subString + " ");
                    }
                }
                break;
            }
            System.out.print("No such word " + previousWord + " in sentence: ");
            System.out.println(startString);
        }
        String result = String.join(" ",words);
        System.out.println(result);
    }

    public static boolean isWordInSentence(String[] words, String searchingWord){
        for (int i = 0; i < words.length - 1; i++){
            if (words[i].equals(searchingWord)){
                return true;
            }
        }
        return false;
    }

    public static String deleteCharacter(String startString, char deletedChar){////b3
        char[] c = startString.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i]!= deletedChar)
                result.append(c[i]);/// конкатенация строк, после каждой итерации у меня новый объект строки
        }
        return result.toString();
    }

    public static String replaceSubstrings(String startString, String newSubstring, String oldSubstring){////b4
        String result = startString.replace(oldSubstring,newSubstring);
        return result;
    }

    public static void reverseStringFromConsole(){////c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please");
        String input = scanner.nextLine();
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
        scanner.close();
    }

    public static void deleteSpacesFromString(){////d
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please");
        scanner.useDelimiter("\\A\\w+\\.");
        String input = scanner.nextLine();
        char[] c = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i]!= ' ')
                result.append(c[i]);/// конкатенация строк, после каждой итерации у меня новый объект строки
        }
        System.out.println(result);
        scanner.close();
    }

    public static void upperCaseOutput(){////e
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<input.length();i++){
            if (Character.isUpperCase(input.charAt(i))){
                stringBuilder.append(input.charAt(i));
            }
        }
        System.out.println(stringBuilder);
        scanner.close();
    }

    public static void evenToUpperCaseTransform(){////f
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<input.length();i++){
            if (i%2!=0){
                stringBuilder.append(Character.toUpperCase(input.charAt(i)));
            }
        }
        System.out.println(stringBuilder);
        scanner.close();
    }

    public static void replaceTheEmptyStrings() throws IOException { ////g ////проблема в том, что сразу считывается пустая строка на первой итерации
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input size please");
        int size = Integer.parseInt(bufferedReader.readLine());
        String [] strings = new String[size];
        String temp;
        for (int i = 0; i < size; i++){
            System.out.println("Input string please");
            temp = bufferedReader.readLine();
            strings[i]=temp;
        }
        for (String str:strings){
            if(str.equals("")){
                str ="String is empty";
            }
            System.out.println(str);
        }
    }

    public static void stringCompare(){
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";
        /*System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str4));*/
        //System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str4);
        /*str1 ="JavaJava";
        System.out.println(str1.substring(4) == str4);*/
        //System.out.println(str1 == null);
        /*str1=null;
        System.out.println(str1==null);*/
    }



}


/* a)   Scanner scanner = new Scanner(System.in);
        System.out.println("Input please");
        scanner.useDelimiter("\\.");
        String input = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input," \t\n\r,");
        StringBuilder stringBuilder = new StringBuilder();
        String previous = null;
        String current;
        while (stringTokenizer.hasMoreTokens()) {
            current = stringTokenizer.nextToken();
            if(!current.equals(previous)){
                previous = current;
                stringBuilder.append(current + " ");
            }
        }
        System.out.println(stringBuilder.toString());
        scanner.close();*/