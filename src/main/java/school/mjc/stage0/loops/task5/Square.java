package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int a = 1; a <= sideLength; a++) {
            for (int b = 1; a <= sideLength; a++) {
                if (a == 1 || a == sideLength || b == 1 || b == sideLength) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
