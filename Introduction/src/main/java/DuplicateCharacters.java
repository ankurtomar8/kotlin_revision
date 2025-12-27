public class DuplicateCharacters {

    public static  void main(String[] args){

        char[]  charInput  = {'a','b','c','d','a','a','b'};
        StringBuilder result = new StringBuilder();

        for(char c : charInput){
            if(result.indexOf(String.valueOf(c)) == -1){
                result.append(c);
            }
        }

        System.out.println("  "+result.toString());



    }

}
