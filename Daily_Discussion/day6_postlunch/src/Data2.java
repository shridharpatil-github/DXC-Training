 public class Data2 extends Data1 {

     private  int num2;
  
     public Data2(int num1,int num2){
         
          super(num1);
          this.num2=num2;
           //super(num1);   // this is not taken, because calling the base
          // class constructor should be first task
        System.out.println("Parameterized constructor call of Data2 "+num2);   
       }
    }