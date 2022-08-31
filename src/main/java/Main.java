public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Student s1 = new Student();
//        Pizza p = new Pizza(30);
//        p.setSausages(100);
//        p.setTomatoes(50);

        Pizza p2 = Pizza.create(30, 50, 100, 0,0,0,0);
        System.out.println(p2);
        System.out.println(Integer.toHexString(p2.hashCode()));

        Animal a = new Cat("Murka");
        a.voice();

        Animal b = new Dog("Tuzik");
        b.voice();
    }

    private void run1() {
        byte a = 1;
        byte b = 1;
        System.out.println("b = " + b);
        b += a;
        System.out.println("b = " + b);

        char c = 'd';
        c++;
        System.out.println(c);

        int count = 0;
        for (double x = 1_000_000_000; x < 1_000_000_100; x+=1) {
            System.out.println("x = " + x);
            count++;
        }
        System.out.println("count = " + count);

        double v = 1;
        double t = 0.8;

        double w = v - t;
        System.out.println("w = " + w);
    }
}
