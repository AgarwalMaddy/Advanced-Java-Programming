//try catch finally
public class Tcf{
	
public static void main(String[] args) {
	
 // try{
       //Custom logic// method / statements that may generate exception
	int z =   5/0;
   // }
    
   throw new ArithmeticException("Ohhh.. Sorry");
        // if some exception will come inside try block 
        //then only catch block will execute    /
	
    }
  // finally {
      //it will execute always even exception comes inside try block or not	
    //}
     
}


