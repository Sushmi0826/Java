package com.demo;
import java.util.Arrays;
import java.util.Scanner;
class inheritancestatistics{
    int[] num = new int[5];
    int n;
    int i=0;
    int sum=0;
    public void findmean(){

        for(i=0;i<n;i++)
            sum+=num[i];
        System.out.println("Mean:"+sum/(float)n);
    }
    public void findmedian(){
        Arrays.sort(num);
        if (n % 2 != 0) {
            double x = num[n / 2];
        }
        double y=(double)(num[(n - 1) / 2] + num[n / 2]) / 2.0;
        System.out.println("Median:"+y);
    }
}
class Operation extends inheritancestatistics {
    public void findmode() {
        int max = Arrays.stream(num).max().getAsInt();
        int t = max + 1;
        int[] count = new int[t];
        for (int i = 0; i < t; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[num[i]]++;
        }
        int mode = 0;
        int k = count[0];
        for (int i = 1; i < t; i++) {
            if (count[i] > k) {
                k = count[i];
                mode = i;
            }
        }

        System.out.println("Mode:" + mode);
    }

    public static class MainClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Operation op1 = new Operation();
            System.out.print("Enter the number of elements you want to store: ");
            op1.n = sc.nextInt();

            System.out.println("Enter the elements of the array: ");
            for (op1.i = 0; op1.i < op1.n; op1.i++) {
                op1.num[op1.i] = sc.nextInt();
            }

            op1.findmean();
            op1.findmedian();
            op1.findmode();
        }
    }
}

