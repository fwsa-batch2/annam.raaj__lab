package com.JavaBasics;

interface cars{

    void speed();
    void luxury();
}

class suzuki implements cars{
    public void speed(){
        System.out.println("Suzuki gives 100 kmph speed");
    }
    public void luxury(){
        System.out.println("It's luxury rate is 3/5");
    }
}

public class Interface {
    public static void main(String[] args) {
        suzuki  car_obj= new suzuki();
        car_obj.speed();
        car_obj.luxury();
    }
}

