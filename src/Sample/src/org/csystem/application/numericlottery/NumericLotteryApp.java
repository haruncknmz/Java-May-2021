package org.csystem.application.numericlottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç tane kupon oynamak istiyorsunuz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;
            while (n-- > 0)
                ArrayUtil.display(2, numericLottery.getNumbers());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
