package kr.or.shi.customer;
/*
       우수 고객 구현
            -제품을 살때 할인 10% 해줌
            -보너스 포인트는 5%를 적립 해줌
            -담당 전문 상담원이 배정됨
 */
public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;

/*    public VIPCustomer() {
        //super();
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.salesRatio = 0.1;

        System.out.println("Customer() call");
    }*/

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        //super();
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }

    public String getAgentID(){
        return agentID;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13e925343941fe415e90d0abec31d81b3e01bf42
    @Override
    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        price -= (int)(price * bonusRatio);
        return  price;
    }

<<<<<<< HEAD
=======
>>>>>>> 0e89065 (12day)
=======
>>>>>>> 13e925343941fe415e90d0abec31d81b3e01bf42
}