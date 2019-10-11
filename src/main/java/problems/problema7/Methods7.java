package problems.problema7;

import java.util.ArrayList;
import java.util.List;

public class Methods7 {
    boolean isMeasurable(int target,List<Integer> weights){
        List<Integer> aux;
        if(sumWeights(weights)==target) {
            return true;
        }
        else if(weights.size()>0)
            for (Integer i : weights) {
                aux = copyList(weights,i);
                if(isMeasurable(target + i, aux))
                    return true;
            }
        return false;
    }


    private int sumWeights(List<Integer> weights){
        int acumulate = 0;
        for(Integer i : weights)
            acumulate+=i;
        return acumulate;
    }

    private List<Integer> copyList(List<Integer> list, Integer exeption){
        List<Integer> res = new ArrayList<>();
        for (Integer i : list)
            if(!i.equals(exeption))
                res.add(i);
        return res;
    }
}
