enum Days{
    sunday,
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday
}


enum Months{
    january,
    febuary,
    march,
    april,
    may,
    june,
    july,
    augest,
    september,
    october,
    novemember,
    december
}


enum Direction {
    east,
    north,
    south,
    west
}

enum GameLevel{
    easy,
    medium,
    hard
}


enum OrderStatus {
    PENDING, PROCESSING, SHIPPED,
    DELIVERED, CANCELLED
}


public class Test31 {

    public static void main(String[] args) {

        Days newdays = Days.tuesday;
        Months  newmonth = Months.march;
        Direction newdirection = Direction.north;
        GameLevel newgame = GameLevel.easy;
        OrderStatus neworder = OrderStatus.SHIPPED;


        System.out.println("Day: " + newdays);
        System.out.println("Month: " + newmonth);
        System.out.println("Direction: " + newdirection);
        System.out.println("Game Level: " + newgame);
        System.out.println("Order Status: " + neworder);



    }
}