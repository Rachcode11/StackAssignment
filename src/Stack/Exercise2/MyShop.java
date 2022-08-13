package Stack.Exercise2;

public class MyShop {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Racheal",2000.0);
        System.out.println("Name is :" + person2.getName());
        System.out.println("CreditLimit is :" + person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Adejoke",5000.0,"aduloju@gmail");
        System.out.println("Name is :" + person3.getName());
        System.out.println("Email Address is :" + person3.getEmailAddress());
        System.out.println("CreditLimit is :" + person3.getCreditLimit());

    }

}
