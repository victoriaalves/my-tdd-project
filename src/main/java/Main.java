public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
    }

    public static int add(String s) {
        if (s.equals(""))
            return 0;
        else if (!s.contains(","))
            return Integer.parseInt(s);
        else return sumNumbersFromStringArray(s.split(","));
    }

    public static int sumNumbersFromStringArray(String[] input) {
        int result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}
