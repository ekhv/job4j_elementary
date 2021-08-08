package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstMember = Math.pow(x2 - x1, 2);
        double secondMember = Math.pow(y2 - y1, 2);
        return Math.sqrt(firstMember + secondMember);
    }

    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(0, 0, 2, 0));
        System.out.println("result (0, 0) to (-1, 0) " + Point.distance(0, 0, -1, 0));
    }
}
