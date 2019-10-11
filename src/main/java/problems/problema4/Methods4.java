package problems.problema4;

class Methods4 {
//1-4-9-16

    int countCannonball(int i){
        return cannonballRecursive(i,0);
    }

    private int cannonballRecursive(int i, int count){
        if(i<1)
            return count;
        else
            return cannonballRecursive(i-1,count+i*i);
    }
}
