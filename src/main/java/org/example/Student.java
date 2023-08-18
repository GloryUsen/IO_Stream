package org.example;

public class Student extends Person {

   private String studentId;
   private String guardianEmail1;
   private String guardianEmail2;
   private String isArchieved;
   private String isDeleted;

   public Student(){};
   public Student(String firstName, org.example.Role valueOf, String email, String studentId, String guardianEmail1, String guardianEmail2, String isArchieved, String isDeleted) {
      super(firstName, valueOf, email);
      this.studentId = studentId;
      this.guardianEmail1 = guardianEmail1;
      this.guardianEmail2 = guardianEmail2;
      this.isArchieved = isArchieved;
      this.isDeleted = isDeleted;
   }

   public String getStudentId() {
      return studentId;
   }

   public void setStudentId(String studentId) {
      this.studentId = studentId;
   }

   public String getGuardianEmail1() {
      return guardianEmail1;
   }

   public void setGuardianEmail1(String guardianEmail1) {
      this.guardianEmail1 = guardianEmail1;
   }

   public String getGuardianEmail2() {
      return guardianEmail2;
   }

   public void setGuardianEmail2(String guardianEmail2) {
      this.guardianEmail2 = guardianEmail2;
   }

   public String getIsArchieved() {
      return isArchieved;
   }

   public void setIsArchieved(String isArchieved) {
      this.isArchieved = isArchieved;
   }

   public String getIsDeleted() {
      return isDeleted;
   }

   public void setIsDeleted(String isDeleted) {
      this.isDeleted = isDeleted;
   }
}
