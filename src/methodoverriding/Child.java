package methodoverriding;

public class Child extends Parent {
    int x=10;
    Child(){
        //default parent constructor is called before child
        //If want to call parent constructor then use super method
       
        super();
        System.out.println("This Is Child Constructor");
    }
    
    @Override
     void  show(){
        //printing superclass variable
        System.out.println("SuperClass Number : "+super.x);
        //printing subclass variable
        System.out.println("SubClass Number : "+x);
        System.out.println("This Is Child");
        //printing superclass method
        super.show();
    }
}
