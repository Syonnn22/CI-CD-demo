package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x = -5;
        int y = -10;
        double a = 6.0;
        double b = 3.0;

        Calculate maytinh = new Calculate();
        int tong = maytinh.tinhTong(x, y);
        double thuong = maytinh.chiaw(a, b);
        System.out.println("Tổng: " + tong);
        System.out.println("Thương: " + thuong);
    }
}
