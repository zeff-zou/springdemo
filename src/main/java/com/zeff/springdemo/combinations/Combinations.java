package com.zeff.springdemo.combinations;

import java.util.List;

public class Combinations {

    /*
        combinations([1,2,3,4,5],2);
            - combinations([2,3,4,5],1);
                - combinations([3,4,5],1);
                    - combinations([4,5],1);
                        - combinations([5],1);
            - combinations([2,3,4,5],2);
                - combinations([3,4,5],1);
                   ............................
     */
    public static void combinations(List<Object> selected, List<Object> data ,int n){
        if (n == 0){
            for (Object obj : selected){
                System.out.print(obj);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }

        if (data ==null || data.isEmpty()){
            return;
        }

        selected.add(data.get(0));
        combinations(selected, data.subList(1,data.size()) ,n-1);

        selected.remove(selected.size()-1);
        combinations(selected, data.subList(1,data.size()) ,n);
    }

}
