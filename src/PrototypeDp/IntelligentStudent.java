package PrototypeDp;

public class IntelligentStudent extends Student{
    int iq;

    IntelligentStudent(){

    }

    private IntelligentStudent(IntelligentStudent other){
       super(other);
       this.iq=other.iq;
    }

    //implementing copy method copy of  intelligent student object. It will override Student copy mentod .

    public IntelligentStudent copy(){
        System.out.println("IntelligentStudent");
        IntelligentStudent is =new IntelligentStudent(this);
        return is;
    }
}
