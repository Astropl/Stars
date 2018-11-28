package pl.astro;

import java.util.Scanner;

public class testStars {


    public static void main(String[] args) {

        diamond(5);
    }

        public static void diamond ( int n)
        {
            int i, j, k;

            for(i=1;i<=n/2+1;i++)
            {
                for(j=i;j<n;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<(i*2);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(i=n-1;i>=1;i--)
            {
                for(j=n;j>i;j--)
                {
                    System.out.print(" ");
                }
                for(k=1;k<(i*2);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
