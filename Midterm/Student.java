class Student {
   
   //attributes
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   
   public Student() {
   
   }
   
   //Getters
   public String getFirstName () {
      return first_name;
      }
   
   public String getMiddleName () {
      return middle_name;
      }
  
  public String getLastName () {
      return last_name;
      }

   public String getSuffix () {
      return suffix;
      }

      
      
   //Setters
   public void setFirstName(String firstName) {
   firstName = firstName;
   }
   
   public void setMiddleName (String middleName) {
   middleName = middleName;
   }
   
   public void setLastName (String lastName) {
   lastName = lastName;
   }
   
   public void setSuffix (String suffix) {
   suffix = suffix;
   }
   
   
  //Custom Methods/Computed Properties
  public String getFullName(){
   return first_name+" "+middle_name+" "+last_name+" "+suffix;
   }
   
}
