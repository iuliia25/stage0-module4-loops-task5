package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int a = 1; a < cathetusLength; a ++) {
            for (int b = cathetusLength; b >= a; b --) {
                System.out.println("8");
            }
            for (int b = 1; b <= a; b++) {
                System.out.println(" ");
            }
        }
    }
}
