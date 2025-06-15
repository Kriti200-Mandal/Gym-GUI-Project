public class RegularMember extends GymMember
{
    private  final int  attendanceLimt;
    private boolean isElligibleForUpgrade;
    private String removalReason;
    private String referalSource;
    private String plan;
    private double price;
    
    
    public RegularMember(int id , String name , String location ,String phone,String email ,String gender,String DOB,
    String membershipStartDate ,String referalSource)
    {
        super(id,name,location,phone,email,gender,DOB ,membershipStartDate);
        this.isElligibleForUpgrade = false;
        this.attendanceLimt = 30;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = "";
        
        
    }
    
    public boolean getIsElligibleForUpgrade()
    {
        return isElligibleForUpgrade;
    }
    public String getRemovalReason()
    {
        return removalReason;
    }
    public String getReferralSource()
    {
        return referalSource;
    }
    public String getPlan()
    {
        return plan;
    }
    public double getPrice()
    {
        return price;
    }
    
    @Override
    public void markAttendance()
    {
       if (attendance >=attendanceLimt)
       { 
           attendance++;
           loyaltyPoints = 5;
           
           
       }
    }
    public double getPlanPrice(String plan)
    {
        switch (plan)
        {
            case "basic":
                return 6500;
                
                case "Standard":
                    return 12500;
                    
                    case "Deluxe":
                        return 18500;
                        
                        default:
                            System.out.println("Invalid plan");
                            return -1;
                
                
            
        }
        
    }
    public String upgradePlan(String plan)
    {
         if(attendance>= attendanceLimt)
         {
            isElligibleForUpgrade = true;
            System.out.println("Eligible for Upgrade");
         }
         if(this.plan.equalsIgnoreCase(plan))
         {
             //System.out.println("You are alerday subsribed to this "  + plan +  "plan");
             return "you are alerady subscribed to this " +plan + " plan";
         }
         // Get the price of the new plan
         double newPrice = getPlanPrice(plan );
         if(price == -1)
         {
             System.out.println("Invalid plan");
         }
         this.plan = plan;
         this.price = newPrice;
         
         return "your plan is upgrade succesfullly";
         
    }
    public void revertRegularMember(String removalReason)
    {
        super.resetMember();
        isElligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        
    }
    
    public void display()
    {
        super.display();
        System.out.println("plan" +plan);
        System.out.println("price" + price);
        if(removalReason != " ")
        {
            System.out.println("Removal reason " +removalReason);
        }
        
        
    }
}

