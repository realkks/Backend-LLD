package InheritanceAndPolymorphism;

public class ThreedPoint extends Point{
    private int z;
    ThreedPoint(){
        this.z = 0;
    }
    ThreedPoint(int z){
        //super(23,34);
        this.z = z;
    }
    // Overriding parent class method
    public  void display(){
        System.out.println("["+x+","+y+","+z+"]");
    }
    public  void display1(){
        System.out.println("["+x+","+y+","+z+"]");
    }
}
