package problems.problema5;

class Methods5 {
    String reverseRecursive(String s){
        return reverseRec(s, "");
    }

    private String reverseRec(String s, String res){
        if(s.length()<1)
            return res;
        else
            return reverseRec(s.substring(0,s.length()-1),res+s.toCharArray()[s.length()-1]);
    }

    String reverseIteration(String s) {
        StringBuilder aux = new StringBuilder();
        char[] word = s.toCharArray();
        for (int i = s.length()-1; i >= 0; i--)
            aux.append(word[i]);
        return aux.toString();
    }
}
