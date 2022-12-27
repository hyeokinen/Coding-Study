package Greedy;

import java.util.Scanner;

// 거스름돈 문제
//이번엔 돈을 낸 뒤, 거스름돈을 최소 개수의 동전 및 지폐의 조합으로 주는 경우, 그 개수를 구하는 문제에 대해서 알아보자.
//
//예를 들어, 누군가 2,730원 어치의 물건을 사고 5,000원을 냈다고 가정하면 거스름돈은 총 2,270원이 될 것이다. 이 때, 지폐와 동전 종류가 아래와 같을 때, 최소의 개수로 거스름돈을 주는 경우는 어떤 경우일까?
//
//지폐 및 동전의 종류 : 1,000원, 500원, 100원, 50원, 10원
//
//정답 : 1,000원 2개 / 100원 2개 / 50원 1개 / 10원 2개로 총 7개
public class Quiz01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 잡화점이 갖고 있는 동전의 종류
        int[] changes = {500, 100, 50, 10, 5, 1};

        // 거스름돈 동전의 갯수
        int number = 0;

        // 1000원을 내는 것은 정해져 있다.
        int money = 1000;

        // 물건의 가격을 입력받는다.
        int price = sc.nextInt();

        // 주어야 할 거스름돈을 계산한다.
        int change = money - price;

        for (int i = 0; i < changes.length; i++) {
            if (change < changes[i]) {
                continue;
            }
            // 몫
            int quotient = change / changes[i];
            // 나머지
            int remainder = change % changes[i];

            // 주어야할 거스름돈에 나머지의 값을 넣는다.
            change = remainder;

            number += quotient;


        }
        System.out.println(number);

        System.exit(0);
    }

}
