package problems.problema6;

class Methods6 {
    int GCD(int a, int b) {
        if (a >= b)
            return GCDRecursive(a,b);
        else
            return GCDRecursive(b,a);
    }

    private int GCDRecursive(int a, int b){
        if(a%b==0)
            return b;
        else
            return GCDRecursive(a,b-1);
    }

}
