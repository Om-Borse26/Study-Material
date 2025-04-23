public class F07_Super_Keyword {

    public static void main(String args[]){

        Horse g1 = new Horse();
        


    }
    
}

class Animal{
    String color = "blue";
    
    
    Animal(){
        System.out.println("Animal constructor is called");
        System.out.println(color);
        
    }
}

class Horse extends Animal{
  Horse(){
    //this changes the properties of the previous class
    super.color = "black";
    System.out.println("Horse consturctor is called");
    System.out.println(color);
  }
}
