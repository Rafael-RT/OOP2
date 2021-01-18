public class Main {
    public static void main(String[] args) {
        //testAuthor();
        //testBook();
        //testAdvancedBook();
        //testMyPoint();
        //testMyCircle();
        //testMyTriangle();
        //testMyRectangle();
        //testInvoice();
        //testAccount();
        //testCylinder();
        //testMyShape();
        //testLine();
        //testShape();
        //testMovable();
        //testCircle();
        //testResizableCircle();
    }

    static void testAuthor(){
        Author ahTeck = new Author("Tan Ah Tech", "ahteck@nowhere.com",'m');
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("email is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test getter
    }

    static void testBook(){
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99); // Test Book's

        System.out.println(dummyBook); // Test Book's toString()
// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", new Author("Paul Tan",
                "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()
    }

    static void testAdvancedBook(){
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        AdvancedBook javaDummy = new AdvancedBook("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
        System.out.println(javaDummy.getAuthorNames());
    }

    static void testMyPoint(){
//        MyPoint p1 = new MyPoint(3, 4);
//        System.out.println(p1.distance(5, 6));
//        MyPoint p2 = new MyPoint(5, 6);
//        System.out.println(p1.distance(p2));
//        System.out.println(p1.distance());

        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version?
        System.out.println(p2.distance(p1)); // which version?
        System.out.println(p1.distance(5, 6)); // which version?
        System.out.println(p1.distance()); // which version?

        MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1 , i + 1); // Allocate each of MyPoint instances
        } // use a loop to print all the points

        for(int i = 0; i < points.length; i++){
            System.out.println(points[i]);
        }
    }

    static void testMyCircle(){
        MyCircle circle = new MyCircle();
        MyPoint myPoint = new MyPoint(3, 4);
        MyCircle circle1 = new MyCircle(myPoint, 2);

        System.out.println(circle);
        System.out.println(circle1);
        //Get distance
        System.out.println("Distance between 2 circles " + circle.distance(circle1));
        //Get center of 2 circle
        System.out.println("Center of first cirlce " + circle.getCenterX() + " " + circle.getCenterY());
        System.out.println("Center of second cirlce " + circle1.getCenterX() + " " + circle1.getCenterY());
    }

    static void testMyTriangle(){
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(2,2);
        MyPoint myPoint3 = new MyPoint(-2,2);

        MyTriangle myTriangle = new MyTriangle(myPoint1,myPoint2,myPoint3);

        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
    }

    static void testMyRectangle(){
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(2,4);
        MyRectangle myRectangle = new MyRectangle(myPoint1,myPoint2);

        System.out.println(myRectangle);
    }

    static void testInvoice(){
        Customer customer = new Customer(1,"Ulan",15);
        Invoice invoice = new Invoice(1, customer, 1500);

        System.out.println(invoice.getCustomer());

        double amount = invoice.getAmountAfterDiscount();
        //Amount after discount
        System.out.println(amount);
    }

    static void testAccount(){
        Customer1 customer = new Customer1(1, "Ulan", 'm');
        Account account = new Account(1, customer,1000.456);

        account.deposit(120);

        System.out.println(account);

        // withDraw
        account.withdraw(1000);

        account.withdraw(1200);
        System.out.println(account);


    }

    static void testCylinder(){
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }

    static void testMyShape(){
        Square square = new Square(2.0);

        System.out.println(square.getArea());
        System.out.println(square.getSide());

        System.out.println("---------------------");
        Rectangle rectangle = new Rectangle(3.0,1.5);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println("--------------------");
        Circle1 circle1 = new Circle1();
        System.out.println(circle1.getArea());
    }

    static void testLine(){
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point1 p1 = new Point1(2,4);
        Point1 p2 = new Point1(1,4);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }

    static void testShape(){
        Shape1 s1 = new CircleAbs(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius());
        CircleAbs c1 = (CircleAbs)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
//        Shape1 s2 = new Shape1();
        Shape1 s3 = new RectangleAbs(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength());
        RectangleAbs r1 = (RectangleAbs)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape1 s4 = new SquareAbs(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        RectangleAbs r2 = (RectangleAbs)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        SquareAbs sq1 = (SquareAbs)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    static void testMovable(){
        Movable m1 = new MovablePoint1(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }

    static void testCircle(){
        Circle2 circle = new Circle2(15);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

    static void testResizableCircle(){
        Resizable circle = new ResizableCircle(25);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);
        ResizableCircle circle1 = (ResizableCircle) circle;
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
