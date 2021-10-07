package kr.or.shi.customer;

public class CustomerTest {

    public static void main(String[] args){
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13e925343941fe415e90d0abec31d81b3e01bf42
        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
        int price = customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo() + " " + price);

        VIPCustomer vipCustomerKim = new VIPCustomer(10020, "김유신");
//        vipCustomerKim.setCustomerName("이유신");
//        vipCustomerKim.setCustomerID(10011);
        vipCustomerKim.bonusPoint = 1000;
        price = vipCustomerKim.calcPrice(1000);

        System.out.println(vipCustomerKim.showCustomerInfo() + " " + price);

        Customer vc = new VIPCustomer(10030, "sct");      //vc가 upcasting됨.
        price = vc.calcPrice(1000);                              //overriding된 메서드가 호출됨.
        System.out.println(vc.showCustomerInfo() + " " + price);


        Customer gc = new GoldCustomer(10040, "goldcustomer");
        price = gc.calcPrice(1000);
        System.out.println(gc.showCustomerInfo() + " " + price);

<<<<<<< HEAD
=======
/*        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());*/

        VIPCustomer vipcustomerKim = new VIPCustomer(10020, "김유신");
        vipcustomerKim.setCustomerName("이유신");
        vipcustomerKim.setCustomerID(10011);
        vipcustomerKim.bonusPoint = 1000;
        System.out.println(vipcustomerKim.showCustomerInfo());
>>>>>>> 0e89065 (12day)
=======
>>>>>>> 13e925343941fe415e90d0abec31d81b3e01bf42
    }
}
