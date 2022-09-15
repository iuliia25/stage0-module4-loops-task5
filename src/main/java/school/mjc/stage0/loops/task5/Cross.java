package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int a = 1; a <= sideLength; a++) {
            for (int b = 1; b <= sideLength; b++) {
                if (a == sideLength / 2 || a == (sideLength-1)/2 || b == sideLength / 2 || b ==(sideLength-1)/2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
