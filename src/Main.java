
public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        if(!str.contains(")")){
            return false;
        }

        int up = 0;
        int down = 0;
        char c;
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if(c == '('){
                up++;
            }
            else if(c == ')'){
                down++;
            }

            if(down > up){
                return false;
            }
        }
        return true;
    }

    // 2. reverseInteger
    public static String reverseInteger(int a){
        String str = "" + a;
        char c;
        String s = "";
        for(int i = str.length()-1; i >= 0; i--){
            c = str.charAt(i);
            s = s + c;
        }

        return s;
    }

    // 3. encryptThis

    public static String encryptThis(String e){
        char c;
        int ascii;
        String word;
        String str;
        char two;
        char last;
        String[] arr = e.split(" ");
        String result = "";


        for (String a : arr){
            c = a.charAt(0);
            two = a.charAt(1);
            last = a.charAt(a.length()-1);
            ascii = c;
            if(a.length() < 3){

                result = result + Integer.toString(ascii) + two + " ";
                continue;

            }
            else {
                str = a.substring(2, a.length() - 1);
            }

            word = Integer.toString(ascii) + last + str + two;
            result = result + word + " ";

        }
        result = result.substring(0, result.length()-1);
        return result;
    }

    // 4. decipherThis
    public static String decipherThis(String d){
        char c;
        char cc;
        int in;
        char cha;
        String str;
        String ascii = "";
        String[] arr = d.split(" ");
        String result = "";
        for(String a : arr) {
            for (int i = 0; i < a.length(); i++){
                c = a.charAt(i);
                if (!Character.isDigit(c)) {
                    break;
                }
                ascii = ascii + c;
            }

            in = Integer.parseInt(ascii);
            cha = (char) in;
            a = a.replaceFirst(ascii, "");
            str = ""+a.charAt(a.length()-1);
            a = a.substring(0, a.length()-1);
            if(a.length() < 1){
                result = result + cha + str + " ";
            }
            else if(a.length()<2){
                result = result + cha + str + a.charAt(0) + " ";
            }
            else {
                cc = a.charAt(0);
                a = a.substring(1);
                result = result + cha + str + a + cc + " ";
            }
            ascii = "";
        }

        result = result.substring(0, result.length()-1);

        return result;
    }


}