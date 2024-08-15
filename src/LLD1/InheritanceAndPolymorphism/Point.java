package LLD1.InheritanceAndPolymorphism;

public class Point {
    protected int x;
    protected int y;
    Point(){

        this.x = 0;
        this.y=0;
    }
    Point(int x,int y){
        this.x=x;
        this.y =y;
    }
    public  void  display2(){
        System.out.println(x+","+y);
    }
}
