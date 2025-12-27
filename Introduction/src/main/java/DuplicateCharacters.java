public class DuplicateCharacters {

    public static void main(String[] args){

        char[] inputChar = {'a','b','c','d','b','a','a'};

        StringBuilder result = new StringBuilder();

        for(char c : inputChar){
            if(result.indexOf(String.valueOf(c)) == -1){
                result.append(c);
            }
            System.out.println(result);
        }





    }

}
