package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int a = 1; a <= length; a++) {
            for (int b = 1; b <= height; b++) {
                if (a == 1 || a == length || b == 1 || b == height) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
