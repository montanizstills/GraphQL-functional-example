package io.github.montanizstills;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public List getFilingFreq(int n){
        ArrayList remainders = new ArrayList(){};
        ArrayList pow2 = new ArrayList(){};
        while(n>0){
            remainders.add(n%2);
            n=n/2;
        }
        for (int i =0; i< remainders.size(); i++){
            if (remainders.get(i).equals(1)){
                Long value = (long) Math.pow(2,i);
                pow2.add(value);
            }
        }
        ArrayList list = pow2;
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new DemoApp().getFilingFreq(605));
    }
}
