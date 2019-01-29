public class RandomPoint {
    public static void main(String[] args)   {
        int x = (int)(Math.random() * 100 - 50);
        int y = (int)(Math.random() * 300 - 150);

        System.out.print(
                "The coordinate is (" + x  + "," + y + ")"
        );
    }
}
