/* File Emp_Emp_name : BPC_copmany */
public class test{
   private String Emp_name;
   private String address;
   private int number;

   public test(String Emp_name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.Emp_name = Emp_name;
      this.address = address;
      this.number = number;
   }

   public void mailCheck() {
      System.out.println("Mailing a check to " + this.Emp_name + " " + this.address);
   }

   public String toString() {
      return Emp_name + " " + address + " " + number;
   }

   public String getEmp_name() {
      return Emp_name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}
