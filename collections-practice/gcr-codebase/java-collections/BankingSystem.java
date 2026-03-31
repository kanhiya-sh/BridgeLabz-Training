package BridgeLabz_Day30_Collections;

import java.util.*;

class Withdrawal {
    int accNo;
    int amount;

    Withdrawal(int a,int amt) {
        accNo = a;
        amount = amt;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Map<Integer,Integer> accountsMap = new HashMap<>();
        accountsMap.put(101,5000);
        accountsMap.put(102,12000);
        accountsMap.put(103,8000);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int acc : accountsMap.keySet()) {
            map.put(accountsMap.get(acc), acc);
        }
        Queue<Withdrawal> queue = new LinkedList<>();
        queue.add(new Withdrawal(101,2000));
        queue.add(new Withdrawal(103,3000));
        while(!queue.isEmpty()) {
            Withdrawal w = queue.remove();
            accountsMap.put(w.accNo, accountsMap.get(w.accNo) - w.amount);
        }
        System.out.println("Updated Accounts : " + accountsMap);
        System.out.println("Sorted by Balance : " + map);
    }
}
