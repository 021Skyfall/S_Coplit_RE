package Co_DailyCode;

public class af_convertDoubleSpaceToSingle {
    public static void main(String[] args) {
        System.out.println(convertDoubleSpaceToSingle("string  with  double  spaces"));
    }
    public static String convertDoubleSpaceToSingle(String str) {
        return str.replace("  "," ");
    }
}
