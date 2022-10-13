package Searching;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {

        int i = 0;
        a[n] = key; // 보초키 추가

        while (a[i] != key) i++;

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; // +1  보초키 추가

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값: ");
        int key = stdIn.nextInt();
        int idx = seqSearch(x, num, key);

        if (idx == -1)
            System.out.println("없음");
        else
            System.out.println(idx);
    }
}