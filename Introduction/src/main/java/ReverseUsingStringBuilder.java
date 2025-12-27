
public class ReverseUsingStringBuilder {

    public static void main(String[] args){

        String str = "Ankur";

        StringBuilder sb = new StringBuilder(str);

        String reverseStr = sb.reverse().toString();

        System.out.println(str);
        System.out.println(reverseStr);

    }
}
