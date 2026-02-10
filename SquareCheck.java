public class SquareCheck {
    static int distSq(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static void main(String[] args) {

        int[] p1 = {20, 10};
        int[] p2 = {10, 20};
        int[] p3 = {20, 20};
        int[] p4 = {10, 10};
        int d1 = distSq(p1[0], p1[1], p2[0], p2[1]);
        int d2 = distSq(p1[0], p1[1], p3[0], p3[1]);
        int d3 = distSq(p1[0], p1[1], p4[0], p4[1]);
        if (d1 > 0 &&
            d1 == d2 &&
            2 * d1 == d3 &&
            distSq(p2[0], p2[1], p3[0], p3[1]) ==
            distSq(p2[0], p2[1], p4[0], p4[1]) &&
            2 * distSq(p2[0], p2[1], p3[0], p3[1]) ==
            distSq(p3[0], p3[1], p4[0], p4[1])) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
