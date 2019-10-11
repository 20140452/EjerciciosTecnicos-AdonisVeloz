package problems.problema3;

import problems.problema3.entities.Pair;

import java.util.ArrayList;
import java.util.List;

public class Methods3 {
    private List<String> setA = new ArrayList<>();
    private List<String> setB = new ArrayList<>();

    private Pair example1;
    private Pair example2;
    private Pair example3;
    private Pair example4;
    private Pair example5;

    Methods3() {
    }

    List<String> getSetA() {
        return setA;
    }

    public void setSetA(List<String> setA) {
        this.setA = setA;
    }

    List<String> getSetB() {
        return setB;
    }

    public void setSetB(List<String> setB) {
        this.setB = setB;
    }

    Pair getExample1() {
        return example1;
    }

    public void setExample1(Pair example1) {
        this.example1 = example1;
    }

    Pair getExample2() {
        return example2;
    }

    public void setExample2(Pair example2) {
        this.example2 = example2;
    }

    Pair getExample3() {
        return example3;
    }

    public void setExample3(Pair example3) {
        this.example3 = example3;
    }

    Pair getExample4() {
        return example4;
    }

    public void setExample4(Pair example4) {
        this.example4 = example4;
    }

    Pair getExample5() {
        return example5;
    }

    public void setExample5(Pair example5) {
        this.example5 = example5;
    }

    void fillLists(){
        setA.add("A");setA.add("B");setA.add("C");
        setB.add("X");setB.add("Y");

        example1 = new Pair("A","B");
        example2 = new Pair("B","A");
        example3 = new Pair("A","B");
        example4 = new Pair("C","D");
        example5 = new Pair("E","F");
    }

    List<Pair> cartesianProduct(List<String> set1,List<String> set2){
        List<Pair> res = new ArrayList<>();

        for (String x : set1)
            for (String y : set2)
                res.add(new Pair(x,y));

        return res;
    }

    boolean comparePairs(Pair pairA, Pair pairB){
        return pairA.getFirst().equals(pairB.getFirst()) && pairA.getSecond().equals(pairB.getSecond());
    }
}
