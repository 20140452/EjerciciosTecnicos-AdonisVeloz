package problems.problema8;

import java.util.*;

public class Methods8 {
    private HashMap<String, List<String>> mnemonic = new HashMap<>();
    private List<String> resultSet;

    void fillMap(){
        mnemonic.put("2", Arrays.asList("A","B","C"));
        mnemonic.put("3", Arrays.asList("D","E","F"));
        mnemonic.put("4", Arrays.asList("G","H","I"));
        mnemonic.put("5", Arrays.asList("J","K","L"));
        mnemonic.put("6", Arrays.asList("M","N","O"));
        mnemonic.put("7", Arrays.asList("P","R","S"));
        mnemonic.put("8", Arrays.asList("T","U","V"));
        mnemonic.put("9", Arrays.asList("W","X","Y"));
    }

    List<String> listMnemonics(String word){
        resultSet = new ArrayList<>();
        mnemonicRecursive(word,"");
        return resultSet;
    }

    private void mnemonicRecursive(String word, String formation){
        if(word.length()>=1)
            for(String s : mnemonic.get(word.substring(0,1))) {
                mnemonicRecursive(word.substring(1, word.length()),formation+s);
            }
        else
            resultSet.add(formation);

    }

    public void printMnemonics(List<String> list){
        System.out.print("\t[\t");
        int count = 0;
        Object[] array = list.toArray();
        for(int i=0;i<list.size();i++){
            System.out.print(array[i]);
            if (i!=list.size()-1)
                System.out.print(", ");
            if(count==9){
                System.out.print("\n\t\t");count=0;
            }

            count++;
        }
        System.out.print("\t]\n");

    }



}
