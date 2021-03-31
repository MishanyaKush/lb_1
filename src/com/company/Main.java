package com.company;

import java.util.Scanner;

public class Main {

    public static void Zavd_1()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введіть порядковий номер місяця: ");
        int n = scanner.nextInt();
        switch (n)
        {
            case 1:System.out.println("Січень");   break;
            case 2:System.out.println("Лютий");   break;
            case 3:System.out.println("Березень");   break;
            case 4:System.out.println("Квітень");   break;
            case 5:System.out.println("Травень");   break;
            case 6:System.out.println("Червень");   break;
            case 7:System.out.println("Липень");   break;
            case 8:System.out.println("Серпень");   break;
            case 9:System.out.println("Вересень");   break;
            case 10:System.out.println("Жовтень");   break;
            case 11:System.out.println("Листопад");   break;
            case 12:System.out.println("Грудень");   break;
            default:System.out.println("Такого місяця не існує");   break;
        }
    }
    public static void Zavd_2()
    {
        Scanner scanner= new Scanner(System.in);
       double a,b,h,x,y;
       a=0;
       b=3.14;
       h=3.14/20;
       x=a;
        System.out.printf("Яким спосопбом виконати завдання?\n1.While\n2.Do_while\n\nВибір:");
        int qv = scanner.nextInt();
        if(qv==1)
        {
            System.out.println("\tX\t|\tY");
            while( x<=b)
            {
                System.out.println(x+"\t|\t"+f(x));
                x+=h;
            }
        }
        else if(qv==2)
        {
            System.out.println("\tX\t|\tY");
            do {
                System.out.println(x+"\t|\t"+f(x));
                x+=h;
            }while(x<=b);
            System.out.println(String.format("%.2f",x));
            System.out.println(String.format("%.2f",f(x)));
        }
        else
            System.out.println("Варіанту не існує");
    }
    public static double f(double x)
    {
        return (Math.pow(Math.sqrt(Math.tan(x)+13),4));
    }

    public static void Zavd_3()
    {
        int[] a;
        int n;
        int ex;
        int nul=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину масиву:");
        n= in.nextInt();
        System.out.println("Заповнити рандомними числами?\n1-Так\n2-Ні ");
        ex= in.nextInt();
        if(ex==1)
        {
            a=new int[n];
            for(int i=0 ;i<n;i++)
            {
                a[i]=(int) (Math.random()*(200+1))-100;
                if (a[i] == 0)
                {
                    nul++;
                }
            }
            for(int i=0 ;i<n;i++)
            {
               System.out.println("Елемент ["+(i+1)+"]:"+a[i]);
            }
            System.out.println("Кількість 0  масиві:" + nul);
            int dob=1;
            int max;
            int ch_i_max=0;
            int i_max=0;
            max = a[0];
            for (int i = 0; i < n; i++)
            {
                if (max < Math.abs(a[i]))
                {
                    max = Math.abs(a[i]);
                    ch_i_max=a[i];
                    i_max=i;
                }
            }
            System.out.println("Максимальний елемент:" + ch_i_max);
            for(int j=i_max;j<n;j++)
                dob*=a[j];
            System.out.println("Добуток елементів після " + max + " = " + dob);
        }
        else if(ex==2)
        {
                a=new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.println("Введіть а[" + i + "]=");
                a[i] = in.nextInt();
                if (a[i] == 0)
                {
                    nul++;
                }
            }
            System.out.println("Кількість 0  масиві:" + nul);
            int dob=1;
            int max;
            int ch_i_max=0;
            int i_max=0;
            max = a[0];
            for (int i = 0; i < n; i++)
            {
                if (max < Math.abs(a[i]))
                {
                    max = Math.abs(a[i]);
                    ch_i_max=a[i];
                    i_max=i;
                }
            }
            System.out.println("Максимальний елемент:" + ch_i_max);
            for(int j=i_max;j<n;j++)
                dob*=a[j];
            System.out.println("Добуток елементів після " + max + " = " + dob);
        }
    }
    public static void Zavd_4()
    {
        int n;
        int arr[][];
        int ex;
        Scanner in= new Scanner(System.in);
        System.out.println("Введіть величину матриці:");
        n = in.nextInt();
        System.out.println("Заповнити рандомними числами?\n1-Так\n2-Ні ");
        ex= in.nextInt();
        if(ex==1)
        {
            arr=new int[n][n];
            for(int i=0 ;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = (int) (Math.random() * (200 + 1)) - 100;
                }
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n");
            int zero=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<0;j++)
                {
                    if(j<n-i+1)
                        arr[i][j]=zero;
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
        else if(ex==2)
        {
            arr = new int[n][n];
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    System.out.print("Введіть елемент arr[" + (i+1) + "][" + (j+1) + "]:");
                    arr[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n");

        }
    }
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Виберіть номер завдання:");
            int z = scanner1.nextInt();
                switch (z) {
                    case 1:
                        Zavd_1();
                        break;
                    case 2:
                        Zavd_2();
                        break;
                    case 3:
                        Zavd_3();
                        break;
                    case 4:
                        Zavd_4();
                        break;
                }
        }
    }
}
