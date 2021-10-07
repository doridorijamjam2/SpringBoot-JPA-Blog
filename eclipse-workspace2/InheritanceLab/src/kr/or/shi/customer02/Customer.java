package kr.or.shi.customer02;
/*
         상속을 활용한 멤버십 클래스 구현
         개요: 일반고객(customer)과 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함.
              물품구매시 할인율과 적립 보너스 비율이 다름.
              클래스 상속을 활용하여 구현해 보시오.
 */

/*
         일반 고객 클래스
         -속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
         -적립 보너스 비율 : 물품 구매시 1%
 */
public class Customer {
    protected int customerID;
    protected  String customerName;
    protected  String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) call");
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은" +  customerGrade + "이며, " + "보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }


}
