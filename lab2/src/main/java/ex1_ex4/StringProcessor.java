package ex1_ex4;

public class StringProcessor {
    public static String string_clone (int N, String s) {
        if (N == 0) return "";
        if (s == null) throw new IllegalArgumentException("String can`t be null");
        if (N < 0) throw new IllegalArgumentException("N can't be < 0");

        String str_new = new String();
        for (int i = 0; i < N; i++) {
            str_new = str_new.concat(s);
        }
        return str_new;
    }
    public static int NumberOfInputs(String str1, String str2) {
        if (str2 == null) throw new IllegalArgumentException("str2 can't be null");
        if (str2 == "") throw new IllegalArgumentException("str2 can't be empty");
        return (str1.length() - str1.replace(str2, "").length()) / str2.length();
    }

    public static String num_swap (String s1) {
        if (s1 == null) throw new IllegalArgumentException("String can't be null");
        if (s1 == "") throw new IllegalArgumentException("String can't be empty");

        s1 = s1.replace("1", "one");
        s1 = s1.replace("2", "two");
        return (s1 = s1.replace("3", "three"));
    }

    public static String SecondCharDel (String str_build) {
        if (str_build == null) throw new IllegalArgumentException("String can't be null");
        if (str_build == "") throw new IllegalArgumentException("String can't be empty");

        StringBuilder sb = new StringBuilder(str_build);
        for (int i = 1; i < sb.length(); i++) {
            sb.delete(i, i+1);
        }
        String res = sb.toString();
        return res;
    }
}