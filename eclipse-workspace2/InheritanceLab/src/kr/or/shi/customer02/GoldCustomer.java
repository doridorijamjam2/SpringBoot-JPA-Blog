package kr.or.shi.customer02;

    /*
        개요:
          1. 일반 고객과 VIP 고객 중간 멤버십 만들기
          2. Gold 고객 등급 만들고 혜택을 제공
             - 제품을 살때 10% 할인
             - 보너스 포인트는 2% 적립

     */

public class GoldCustomer extends Customer {
    double saleRate;

    public GoldCustomer(int customerID, String customerNmae){
        super(customerID, customerNmae);

        saleRate = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * bonusRatio);
    }
}
