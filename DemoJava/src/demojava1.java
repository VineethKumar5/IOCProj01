public class demojava1{
   public static void main(String[] args) {
	 String s1 = "nit";
	 String s2 = "nit";
	 String s3 = new String("hyd");
	 String s4 = new String("hyd");
	 System.out.println("====String Literal process====");
	 if(s1==s2) {
		 System.out.println("String are equal...");
		 }else {
			 System.out.println("String are not equal...");
		 }
	     System.out.println("====new operator====");
	 if(s3==s4) {
		 System.out.println("String are equal...");
	 }else {
		 System.out.println("String are not equal...");
	 } 
   }
}
  