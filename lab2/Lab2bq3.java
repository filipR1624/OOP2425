class Lab2bq3
{
    public static void main(String[] args)
    {
        // Driver file
        Rectangle testA = new Rectangle(5, 10);

        // tests
        System.out.println(testA.getLength());
        System.out.println(testA.getWidth());
        System.out.println(testA.toString());

        // Q2
        System.out.println(testA.getArea());
        System.out.println(testA.getPerimiter());

        // Q3
        testA.printRectangle();
    }
}