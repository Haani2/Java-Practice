package Condition;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius =  ra.nextDouble();
        System.out.println("radius : " + radius);

        if (radius >= 0) {
            double area = 3.14 * (radius * radius);
            System.out.println(area);
        }
        else{
            System.out.println("Provide Vaild Radius");
            }

        }
    }

