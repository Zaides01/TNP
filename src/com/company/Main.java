package com.company;

import java.util.Scanner;

public class Main {
public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    TNP toch1 = new TNP(in.nextDouble(), in.nextDouble());
//    toch1.x = in.nextDouble();
//    toch1.y = in.nextDouble();
        System.out.println(toch1);
    TNP toch2 = new TNP(in.nextDouble(), in.nextDouble());
//    toch2.x = in.nextDouble();
//    toch2.x = in.nextDouble();
    toch2.print();
        System.out.println("Расстояние между точками:" + " " + toch1.disBP(toch2));
        System.out.println("Середина между точками:" + " " + toch1.mid(toch2));
        System.out.println("Замена точки:" + " " + toch1.change(toch2));
            }
}
