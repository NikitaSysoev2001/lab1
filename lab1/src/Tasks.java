import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tasks {
    public void task1(int workingMode) throws FileNotFoundException {
        double x;
        double y;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 1");
            System.out.println("Введите x = ");
            x = scanner.nextInt();
            System.out.println("Введите y = ");
            y = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\Никита\\Desktop\\lab2\\z1.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 1");
            x = scanner.nextInt();
            System.out.println("Ввод x из файла, x = " + x);
            y = scanner.nextInt();
            System.out.println("Ввод y из файла, y = " + y);
        }
        System.out.println("Результат равен "+ (Math.pow(Math.E, x) - (Math.pow(y, 2) + 12 * x * y - 3 * Math.pow(x, 2)) / (18 * y - 1)));
    }
    public void task2(int workingMode) throws FileNotFoundException {
        double a;
        double b;
        int g;
        double S;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 2");
            System.out.println("Введите a = ");
            a = scanner.nextInt();
            System.out.println("Введите b = ");
            b = scanner.nextInt();
            System.out.println("Введите g = ");
            g = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\Никита\\Desktop\\lab2\\z2.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 2");
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a = " + a);
            b = scanner.nextInt();
            System.out.println("Ввод b из файла, b = " + b);
            g = scanner.nextInt();
            System.out.println("Ввод g из файла, g = " + g);
        }
        S = 0.5 * a * b * Math.sin(g);
        System.out.println("S = " + S);
    }
    public void task3(int workingMode) throws FileNotFoundException {
        double A;
        double B;
        double C;
        int n;
        double p;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 3");
            System.out.println("Введите A = ");
            A = scanner.nextInt();
            System.out.println("Введите B = ");
            B = scanner.nextInt();
            System.out.println("Введите C = ");
            C = scanner.nextInt();
            System.out.println("Введите время разговора = ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\Никита\\Desktop\\lab2\\z3.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 3");
            A = scanner.nextInt();
            System.out.println("Ввод A из файла, A = " + A);
            B = scanner.nextInt();
            System.out.println("Ввод B из файла, B = " + B);
            C = scanner.nextInt();
            System.out.println("Ввод C из файла, C = " + C);
            n = scanner.nextInt();
            System.out.println("Ввод времени разговора из файла, n = " + n);
        }
        if(n <= A){
            p = B;
        }
        else {
            p = B + C * (n - A);
        }
        System.out.println("Плата за телефон = "+ p);
    }
    public void task4(int workingMode) throws FileNotFoundException {
        int a;
        int b;
        int c;
        int d;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 4");
            System.out.println("Введите a = ");
            a = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\Никита\\Desktop\\lab2\\z4.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 4");
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a = " + a);
        }
        b = a % 10;
        c = b * b;
        d = c % 10;
        System.out.println("Последняя цифра квадрата = "+ d);
    }
    public void task5(int workingMode) throws FileNotFoundException {
        int a;
        int b;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 5");
            System.out.println("Введите a = ");
            a = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\Никита\\Desktop\\lab2\\z5.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 5");
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a = " + a);
        }
        b = a % 10;
        switch (b) {
            case 0: System.out.println("Последняя цифра куба = 0");
                break;
            case 1: System.out.println("Последняя цифра куба = 1");
                break;
            case 2: System.out.println("Последняя цифра куба = 8");
                break;
            case 3: System.out.println("Последняя цифра куба = 7");
                break;
            case 4: System.out.println("Последняя цифра куба = 4");
                break;
            case 5: System.out.println("Последняя цифра куба = 5");
                break;
            case 6: System.out.println("Последняя цифра куба = 6");
                break;
            case 7: System.out.println("Последняя цифра куба = 3");
                break;
            case 8: System.out.println("Последняя цифра куба = 2");
                break;
            case 9: System.out.println("Последняя цифра куба = 9");
                break;
            default:
                break;
        }
    }
    public void task6(int workingMode) throws FileNotFoundException {
        int n;
        int a;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 6");
            System.out.println("Введите n = ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\пк\\Desktop\\РППнаЯВУ\\lab2\\z6.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 6");
            n = scanner.nextInt();
            System.out.println("Ввод n из файла, n = " + n);
        }
        for (int i = 2; i <= n; i++) {
            a = i;
            System.out.print(a + " ");
        }
    }
    public void task7(int workingMode) throws FileNotFoundException {
        int n;
        int x;
        double S = 0;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nЗадание 7");
            System.out.println("Введите n = ");
            n = scanner.nextInt();
            System.out.println("Введите x = ");
            x = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\пк\\Desktop\\РППнаЯВУ\\lab2\\z7.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 7");
            n = scanner.nextInt();
            System.out.println("Ввод n из файла, n = " + n);
            x = scanner.nextInt();
            System.out.println("Ввод x из файла, x = " + x);
        }
        for (int i = 1; i <= n; i++){
            S = S +(Math.pow(-1, i - 1) * (Math.sin(i * x))/i);
        }
        System.out.println("S =  " + S );
    }
    public void task8(int workingMode) throws FileNotFoundException {
        int n;
        int a;
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 8");
            System.out.println("Введите n = ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\Users\\пк\\Desktop\\РППнаЯВУ\\lab2\\z8.txt";
            Scanner scanner = new Scanner(new File(path));
            System.out.println("Задание 8");
            n = scanner.nextInt();
            System.out.println("Ввод n из файла, n = " + n);
        }
        for (int i = 1; i <= 10; i++){
            a = i * i;
            System.out.print(a + " ");
        }
    }}
