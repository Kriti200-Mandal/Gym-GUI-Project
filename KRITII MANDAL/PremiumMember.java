public class PremiumMember extends GymMember
{
    final double premiumCharge;
    String personalTrainer;
    boolean isFullyPayment;
    double paidAmount;
    double discountAmount;
    
    public PremiumMember( int id , String name, String location ,String phone ,String email , String gender , String DOB, 
    String membershipStartDate , String personalTrainer)
    {
        super(id,name,location ,phone , email ,gender, DOB ,membershipStartDate );
        this.personalTrainer = personalTrainer;
        this.premiumCharge = 50000;
        this.paidAmount = 0;
        this.isFullyPayment = false;
        this.discountAmount = 0;
        
    }
    public String getPersonalTrainer()
    {
        return personalTrainer;
    }
    public boolean getIsFullyPayment()
    {
        return isFullyPayment;
    }
    public double getPaidAmount()
    {
        return paidAmount;
    }
    public double getDiscountAmount()
    {
        return discountAmount;
    }
    
    @Override
    public void markAttendance()
    {
        if(this.activeStatus ==true)
        {
            attendance++;
            loyaltyPoints = 10;
        }
        else
        {
            System.out.println("Member is not active to marks attendance ");
        }
    }
    /*public String payDueAmount(double paidAmount)
    {
        if(this.isFullyPayment ==true)
        {
            //System.out.println("Payment is fully done");
            return "payment completed";
            
        }
        if (this.paidAmount> premiumCharge)
        {
            return "payment exceed";
        }
        
         
        if( this.paidAmount==this.premiumCharge)
        {
            return "payment completed";
        }
        
        else
        {
            this.isFullyPayment = false;
            System.out.println("please pay the full amount " );
        
        }
        this.paidAmount +=paidAmount;
        return "payment completed";
    }
    public double calculateDiscount() {
    if (isFullyPayment) {
        discountAmount = 0.10 * premiumCharge;
        return discountAmount;
    } else {
        return 0;
    }
    
}*/
 public String payDueAmount(double paidAmount) {
    if (this.isFullyPayment) {
        return "Payment already completed.";
    }

    if (this.paidAmount + paidAmount > premiumCharge) {
        return "Payment exceeds required amount.";
    }

    this.paidAmount += paidAmount;

    if (this.paidAmount == premiumCharge) {
        this.isFullyPayment = true;
        return "Payment completed. No remaining amount.";
    } else {
        double remainingAmount = premiumCharge - this.paidAmount;
        return "Partial payment done. Remaining amount: " + remainingAmount;
    }
}
    /*public void calculateDiscount()
    {
        if( isFullyPayment == true)
        {
            this.discountAmount = 0.1* premiumCharge;
            System.out.println("Your Amount to be paid after dicount is " + discountAmount);
            
        }
        else
        {
            double remainingAmount = premiumCharge-this.paidAmount;
            System.out.println("Your amount to be paid " +remainingAmount);
        }
        
    }*/
    public double calculateDiscount() {
    if (isFullyPayment) {
        discountAmount = 0.10 * premiumCharge;
        return discountAmount;
    } else {
        return 0;
    }
}
    public void revertPremiumMember()
    {
        super.resetMember();
        this.personalTrainer = "";
        this.discountAmount  = 0;
        
    }
    public void display()
    {
        super.display();
        System.out.println("personalTrainer " +personalTrainer);
        System.out.println("paidAmount " +paidAmount);
        System.out.println("isFullyPayment" + isFullyPayment);
        if(isFullyPayment == true)
           {
               System.out.println("Discount amount :"  + discountAmount);
     
               
           }
           else{
               double remainingAmount = premiumCharge - this.paidAmount;
               System.out.println("remainig Amount to be paid " + remainingAmount);
           }
           
    }

    
    
}
