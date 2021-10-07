package kr.or.shi;

/*
다형성(polymorphism)
    -하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
    -같은 코드에서 여러 다른 실행 결과가 나옴.
    encapsulation(정보은닉), inheritance(상속)과 더불어 객체지향 프로그래밍(OOP)의 가장 큰 특징중 하나임.
 */

import java.util.ArrayList;

class Creature {
    public void move(){
        System.out.println("생물이 움직인다.");
    }
}

class Human extends  Creature{

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends  Creature{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다..");
    }
}

class Eagle extends  Creature{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }
    public void fly(){
        System.out.println("독수리가 양닐개를 쯕 펴고 날아다닙니다.");
    }
}

public class CreatureTest{
    public static void main(String[] arg){
        Creature hCreature = new Human();
        Creature tCreature = new Tiger();             //필드의 다형성
        Creature eCreature = new Eagle();

        CreatureTest creatureTest = new CreatureTest();
        creatureTest.moveCreature(hCreature);
        creatureTest.moveCreature(tCreature);
        creatureTest.moveCreature(eCreature);

        System.out.println();

        ArrayList<Creature> creatures = new ArrayList<>();       //다형성 적용
        creatures.add(hCreature);
        creatures.add(tCreature);
        creatures.add(eCreature);
        //creatures.add(creatureTest);

        for(Creature creature : creatures){        //다형성 적용
            creature.move();
        }

    }

    public void moveCreature(Creature creature){       //매개변수의 다형성
        creature.move();
    }
}


