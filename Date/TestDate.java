public class TestDate {

    public static void main(String[] args) {
      // Test constructor and toString()
      Date d1 = new Date(2016, 4, 6);
      System.out.println(d1);  // toString()
 
      // Test Setters and Getters
      d1.setYear(2012);
      d1.setMonth(11);
      d1.setDay(30);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());
 
      // Test setDate()
      d1.setDate(2020, 02, 29);
      System.out.println(d1);  // toString()
      
      //Test checkdate()
      /*d1.checkDate(2016, 4, 31);
      System.out.println(d1);*/
   }   
}
