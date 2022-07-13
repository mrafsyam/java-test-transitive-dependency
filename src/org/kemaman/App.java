package org.kemaman;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(10);
        coins.add(5);
        coins.add(2);
        coins.add(1);

        List<Integer> res = returnCollection(coins, 33);
        System.out.println(res);
    }

    static List<Integer>  returnCollection(ArrayList<Integer> list, int change){
        List coins = new ArrayList<>();
        ArrayList<Integer> check = list;
        while (change > 0) {
            for ( int i : list){
                while (change >= i){
                    coins.add(i);
                    change = change - i;
                }
            }
        }
        return coins;
    }
}
