 public class CollegeStudent extends Student1 {
     private String stream;

    public CollegeStudent()
     {
       // super(); We could have written super .super keyword is used
    	// representing the immediate parent class
       // super().super(); // we cannot go for calling like this
      stream="mechanical";
      System.out.println("The default constructor of the College Student");
     }
  }