public abstract class GymMember
{
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    public GymMember(int id , String name , String loaction ,String phone,String email ,String gender,String DOB,
    String membershipStartDate)
    {
        this.id = id ;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.attendance =0;
        this.loyaltyPoints = 0;
        this.activeStatus = false;
        
        
    }
     public int getId()
     {
         return id;
     }
     public String getName()
     {
         return name;
     }
     public String getLocation()
     {
         return location;
     }
     public String getPhone()
     {
         return phone;
     }
     public String getGender()
     {
         return gender;
     }
     public String getEmail()
     {
         return email;
     }
     public String getDOB()
     {
         return DOB;
     }
     public String getmembershipStartDate()
     {
         return membershipStartDate;
     }
     public int getAttendance()
     {
         return attendance;
     }
     public double getLoyaltyPoints()
     {
         return loyaltyPoints;
     }
     public boolean getActiveStatus()
     {
         return activeStatus;
     }
     public abstract void markAttendance();
     
     
     public void activeMembership()
     {
         
         activeStatus=true;
         } 
         public void deactiveMembership()
     {
         activeStatus = false;
         
     }
     public void resetMember()
     {
         this.activeStatus = false;
         this.attendance = 0;
         this.loyaltyPoints = 0;
         
     }
     public void display()
     {
         System.out.println("Id" + id);
         System.out.println("name" + name);
         System.out.println("location" + location);
         System.out.println("Phone"  + phone);
         System.out.println("email " + email);
         System.out.println("gender" +gender);
         System.out.println("DOB" +DOB);
         System.out.println("membership start DATE " + membershipStartDate);
         System.out.println("attendance "  +attendance);
         System.out.println("loyalty Points  " +loyaltyPoints);
         System.out.println("activeStatus "  + activeStatus);
     }
    
     
}

