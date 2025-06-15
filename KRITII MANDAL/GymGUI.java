import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JLabel;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class GymGUI
{
     ArrayList <GymMember>memebers  = new ArrayList<GymMember>();
    JFrame frame;
    JLabel name,id , address , location,gender, phone,email ,referalSource,DOB, plan ,PaidAmount,RemovalReason,Trainer_Name,
    Regular,premium,discount,membershipStartDate;
    JTextField  idtxt,nametxt , addresstxt , locationtxt, gendertxt,phonetxt ,  Emailtxt ,ReferralSourcetxt,PaidAmounttxt,RemovalReasontxt,
    Trainer_Nametxt,Regulartxt,premiumtxt,discounttxt,DOBtxt,MembershipDatetxt;
    
    JRadioButton male ,female,others;
    JComboBox<String> dobYearBox, dobMonthBox, dobDayBox, msYearBox,msMonthBox,msDayBox,planBox;
    JButton button;
    
    public GymGUI()
    {
        
        frame = new JFrame("Home page");
        frame.setSize(600,600);
        frame.setLayout(null);
        JPanel panel = new JPanel();
        panel.setSize(400,400);
        panel.setBounds(50,100,1400,250);
        panel.setLayout(null);
         panel.setBackground(Color.LIGHT_GRAY);
        JButton regularButton = new JButton("Regular Member");
        regularButton.setBounds(500,70,190,30);
        JButton premiumButton = new JButton("Premium Member");
         premiumButton.setBounds(500,120,190,30);
         JButton displayButton = new JButton("Display ");
         displayButton.setBounds(500,170,190,30); 
        
        frame.add(panel);
        panel.add(regularButton);
        panel.add(premiumButton);
        panel.add(displayButton);
        
        
        regularButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               frame = new JFrame("Regular Member");
               frame.setSize(600,600);
               frame.setLayout(null);
               JLabel title = new JLabel("Regular Member");
               title.setBounds(700,50,300,30);
               title.setFont(new Font("Arial", Font.BOLD, 30));
               frame.add(title);
               
              JPanel panel = new JPanel();
              panel.setSize(400,400);
              panel.setBackground(Color.LIGHT_GRAY);
             panel.setBounds(50,100,1400,500); 
             panel.setLayout(null);
             frame.add(panel);
               
             id = new JLabel("id");
           id.setBounds(80,70,190,25);
          id.setFont(new Font("Arial",Font.BOLD,20));
          idtxt = new JTextField();
          idtxt.setBounds(150,70,190,25);
          panel.add(id);
          panel.add(idtxt);
          
          name =  new JLabel("name");
        name.setBounds(80,120,190,25);
        name.setFont(new Font("Arial",Font.BOLD,20));
        nametxt = new JTextField();
        nametxt.setBounds(150,120,190,25);
        panel.add(name);
        panel.add(nametxt);
        
        location = new JLabel("location");
        location.setBounds(80,160,190,20);
        location.setFont(new Font("Arial",Font.BOLD,20));
        locationtxt = new JTextField();
        locationtxt.setBounds(160,160,190,25);
        panel.add(location);
        panel.add(locationtxt);
        
        phone = new JLabel("phone ");
        phone.setBounds(80,200,190,20);
        phone.setFont(new Font("Arial",Font.BOLD,20));
        phonetxt = new JTextField();
        phonetxt.setBounds(160,200,190,25);
        panel.add(phone);
        panel.add(phonetxt);
        
        email = new JLabel("Email ");
        email.setBounds(80,240,190,20);
        email.setFont(new Font("Arial",Font.BOLD,20));
        Emailtxt = new JTextField();
        Emailtxt.setBounds(160,240,190,25);
        panel.add(email);
        panel.add(Emailtxt);
        
         gender = new JLabel("Gender");
        gender.setBounds(80,290,100,25);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        male = new JRadioButton ("male");
        male.setBounds(160,290,90,25);
        female = new JRadioButton("female");
        female.setBounds(250,290,90,25);
        others = new JRadioButton("others");
        others.setBounds(340,290,90,25);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(others);
        panel.add(gender);
        panel.add(male);
        panel.add(female);
        panel.add(others);
        
        DOB = new JLabel("DOB");
        DOB.setBounds(80,350,190,20);
        DOB.setFont(new Font("Arial",Font.BOLD,20));
        
        String Year[] = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
            "2014","2015","2016","2107","2018","2019","2020","2021","2022","2023","2024","2025"};
            
         dobYearBox = new JComboBox(Year);
         dobYearBox.setBounds(160,350,130,25);
         
         String Month[] = {"Jan","Feb","March","April","May","June","July","August","September","october","November","December"};
         dobMonthBox = new JComboBox(Month);
         dobMonthBox.setBounds(290,350,130,25);
         String Day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23",
            "24","25","26","27","28","29","30","31"};
         dobDayBox = new JComboBox(Day);
          dobDayBox.setBounds(420,350,130,25);
          panel.add(DOB);
          panel.add(dobYearBox);
          panel.add(dobMonthBox);
          panel.add(dobDayBox);
          
          referalSource = new JLabel("Referral Source");
          referalSource.setBounds(80,400,160,25);
          referalSource.setFont(new Font("Arial",Font.BOLD,20));
          ReferralSourcetxt = new JTextField();
          ReferralSourcetxt.setBounds(240,400,190,25);
        panel.add(referalSource);
        panel.add(ReferralSourcetxt);
        
        plan = new JLabel("plan(regular only)");
        plan.setBounds(680,70,190,25);
        plan.setFont(new Font ("Arial",Font.BOLD,20));
        String Plan[]={"Basic","Standard","Deluxe"};
        planBox = new JComboBox(Plan);
        planBox.setBounds(890,70,190,25);
        panel.add(plan);
        panel.add(planBox);
        
        Regular = new JLabel("Regular Price");
        Regular.setBounds(680,120,190,25);
        Regular.setFont(new Font ("Arial",Font.BOLD,20));;
        Regulartxt = new JTextField();
        Regulartxt.setText("6500");
        Regulartxt.setBounds(890,120,190,25);
        Regulartxt.setEditable(false);
        panel.add(Regular);
        panel.add(Regulartxt);
        
       /* discount = new JLabel("discount amount ");
        discount.setBounds(680,200,190,25);
        discount.setFont(new Font ("Arial",Font.BOLD,20));;
        discounttxt = new JTextField();
        discounttxt.setText("6500");
        discounttxt.setBounds(890,200,190,25);
        discounttxt.setEditable(false);
        panel.add(discount);
        panel.add(discounttxt);*/
        
        /*PaidAmount = new JLabel ("Paid Amount ");
        PaidAmount.setBounds(680,200,190,25);
        PaidAmount.setFont(new Font ("Arial",Font.BOLD,20));;
        PaidAmounttxt = new JTextField();
        PaidAmounttxt.setBounds(890,240,190,25);
        panel.add(PaidAmount);
        panel.add(PaidAmounttxt);*/
        
        button = new JButton("Add Regular Member");
        button.setBounds(680,200,190,25);
        panel.add(button);
        button.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
          String idText = idtxt.getText();
        String name = nametxt.getText();
        String location = locationtxt.getText();
        String phone = phonetxt.getText();
        String email = Emailtxt.getText();
        String referralSource = ReferralSourcetxt.getText();

        // Get selected gender
        String gender = "";
        if (male.isSelected())
        {
            gender = "Male";
        }
        else if (female.isSelected())
        {
            gender = "Female";
            
        }
        else if (others.isSelected())
        {
            gender = "Others";
        }

        
        String dob = dobDayBox.getSelectedItem() + "-" +
                     dobMonthBox.getSelectedItem() + "-" +
                     dobYearBox.getSelectedItem();

        
                     
        String membershipStartDate = java.time.LocalDate.now().toString();
        String[] fields = {idText , name, phone, email, gender};
        boolean hasEmptyField = false;
         for (String field : fields)
         {
             if(field.isEmpty())
             {
                 hasEmptyField = true;
                 break;
                 
             }
         }
         if(hasEmptyField)
         {
             JOptionPane.showMessageDialog(frame , "All field is required");
             return;
         }
        
        

        // Validation
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter an ID.");
            return;
        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Name is required.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "ID must be a number.");
            return;
        }

        if (!isIdUnique(id)) {
            JOptionPane.showMessageDialog(frame, "Member ID already exists.");
            return;
        }

        
        RegularMember member = new RegularMember(id, name, location, phone, email, gender, dob, membershipStartDate, referralSource);
        memebers.add(member);
        JOptionPane.showMessageDialog(frame, "Regular member added successfully!");

        // Clear inputs
        idtxt.setText("");
        nametxt.setText("");
        locationtxt.setText("");
        phonetxt.setText("");
        Emailtxt.setText("");
        ReferralSourcetxt.setText("");
        group.clearSelection();
        dobYearBox.setSelectedIndex(0);
        dobMonthBox.setSelectedIndex(0);
        dobDayBox.setSelectedIndex(0);
    }

    // Check for duplicate ID
    public boolean isIdUnique(int id) {
        for (GymMember m : memebers) {
            if (m.getId() == id) {
                return false;
            }
        }
        return true;
    }      
       });
       JButton activeButton = new JButton("Activate Membership");
            activeButton.setBounds(880,200,190,25);
           
            panel.add(activeButton);
             activeButton.addActionListener(new ActionListener()
             {
            public void actionPerformed(ActionEvent e)
             {
                 String idText = idtxt.getText();
                 
                 if(idText.isEmpty())
                 {
                     JOptionPane.showMessageDialog(frame,"Enter your member id to be activate");
                     return;
                 }
                 int id;
                 try{
                     id = Integer.parseInt(idText);
                     
                 }
                 catch(NumberFormatException f)
                 {
                     JOptionPane.showMessageDialog(frame,"Member id should be number");
                     return;
                 }
                 GymMember foundId = null;
                 for(GymMember m: memebers)
                 {
                     if(m.getId() ==id)
                     {
                         foundId = m;
                         break;
                     }
                 }
                 if(foundId !=null)
                 {
                     foundId.activeMembership();
                     JOptionPane.showMessageDialog(frame,"Membership is activated for Member ID");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(frame,"Membership not found with this id " +id);
                 }
                  }
                 
  });
  
  JButton deactiveBtn = new JButton("Deactive Membership");
  deactiveBtn.setBounds(1100,200,195,25);
  panel.add(deactiveBtn);
  deactiveBtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"Enter your id  to be deactivated");
              return;
          }
          int id;
        try{
         id = Integer.parseInt(idText);
                
        }
        catch(NumberFormatException f)
         {
           JOptionPane.showMessageDialog(frame,"Member id should be number");
         return;
         }
          
          
          GymMember foundId = null;
          for(GymMember m :memebers)
          {  
              if(m.getId()== id)
              {
                 foundId = m;
                         break; 
              }
              
          }
          if(foundId !=null)
          {
              foundId.deactiveMembership();
              JOptionPane.showMessageDialog(frame,"membership is deactivate");
            
          }
          else
          {
              JOptionPane.showMessageDialog(frame,"Membership not found with this id " +id);
          }
        
          
      }
  });
  JButton markbtn = new JButton("Mark Attendance");
  markbtn.setBounds(680,300,195,25);
  panel.add(markbtn);
  markbtn.addActionListener(new ActionListener()
  {  
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"Enter your id to mark attendance");
              return;
          }
          int id;
        try{
         id = Integer.parseInt(idText);
                
        }
        catch(NumberFormatException f)
         {
           JOptionPane.showMessageDialog(frame,"Member id should be number");
         return;
         }
          GymMember foundId = null;
          for(GymMember m :memebers)
          {
              if(m.getId() == id)
              { 
                  foundId = m;
                  break;
                  
              }
          }
              if(foundId ==null)
              {
                 JOptionPane.showMessageDialog(frame,"no member found with id :"+id);
                 return;
                  
              }
              if(!foundId.getActiveStatus())
              {
                 JOptionPane.showMessageDialog(frame,"Membership is not active.Cannot mark attendance.");
                 return;
                 
              }
              foundId.markAttendance();
              JOptionPane.showMessageDialog(frame,"Attendance marked succesfully for Id:"+id);
              idtxt.setText("");
          
          
      }
      
  });
  JButton upgradebtn = new JButton("Upgrade");
  upgradebtn.setBounds(880,300,190,25);
  panel.add(upgradebtn);
  
  upgradebtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          String selectPlan = (String)planBox.getSelectedItem();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"id must be entered");
              return;
          }
          int id;
          try{
              id = Integer.parseInt(idText);
              
              
          }catch(NumberFormatException h)
          {
              JOptionPane.showMessageDialog(frame,"Id must be number");
              return;
          }
          GymMember foundId = null;
          for(GymMember m :memebers)
          {
              if(m.getId() == id)
              { 
                  foundId = m;
                  break;
                  
              }
          }
          if(foundId ==null)
              {
                 JOptionPane.showMessageDialog(frame,"no member found with id :"+id);
                 return;
                  
              }
          if(!foundId.getActiveStatus())
          {
              JOptionPane.showMessageDialog(frame,"member is not active .Can't upgrade to plan");
          }
          if(foundId instanceof RegularMember)
          {
              String message = ((RegularMember)foundId).upgradePlan(selectPlan);
              JOptionPane.showMessageDialog(frame,message);
          }
          else{
              JOptionPane.showMessageDialog(frame,"This memeber is not eligible for plan upgrade");
          }
              
          
      }
      
  });
  JButton savebtn = new JButton("Save ");
  savebtn.setBounds(1100 , 300 , 190 , 25);
  panel.add(savebtn);
  savebtn.addActionListener(new ActionListener()
  {
      public void actionPerformed( ActionEvent e)
      {
          
          
         try
          {
              FileWriter write  = new FileWriter("Regular.txt");
              BufferedWriter writer = new BufferedWriter(write);
              writer.write(String.format("%-5s %-15s %-15s %-15s %-25s %-20s %-10s %-10s %-10s %-15s %-10s %-15s %-15s %-15s\n",
            "ID", "Name", "Location", "Phone", "Email", "Attendance", "Loyalty Points", "Membership Start Date", "Plan", "Price","Active Status", "Full Payment", "Discount", "Net Amount"));
           
            for (Object obj : memebers)
            {
                if ( obj instanceof  GymMember)
                {
                    GymMember m = (GymMember) obj;
                    String value = String.format("%-5d %-15s %-15s %-15s %-25s %-5d   %-5.2f \n",
                m.getId(), m.getName(), m.getLocation(), m.getPhone(), m.getEmail(), m.getAttendance(), m.getLoyaltyPoints() );
               
                if ( m instanceof RegularMember)
                {
                    RegularMember rm = (RegularMember) m;
                    //value += String.format(" %-10s %-20s %-10.2f %-25s", "Regular", "rm.getPlan()", "rm.getActivStatus()", "N/A", "rm.getRemovalReason()");
                   
                }
                //else
                //{
                    
                    //value += String.format(" %-10s %-20s %-10.2f", "Regular");
                //}
                writer.write(value + "\n");
                }
               
            }
            writer.close();
            JOptionPane.showMessageDialog(frame,"Member details saved to file succefully ");
           
           
             
          }
          catch(IOException a)
          {
              a.printStackTrace();
          }
          JButton readbtn = new JButton("Read Button ");
  readbtn.setBounds(880 ,400 ,190,25);
  panel.add(readbtn);
  readbtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          JFrame frame = new JFrame("Member Details");
          JTextArea area = new JTextArea();
          try
          {
               BufferedReader reader = new BufferedReader(new FileReader("Regular.txt"));
              String value;
              while ((value = reader.readLine()) != null)
              {
                  
                   area.append(value + "\n"); 
              }
              reader.close();
          }
          catch(IOException r)
          {
              area.setText("Error reading file " + r.getMessage());
          }
          frame.add(new JScrollPane(area));
    frame.setSize(1000, 400);
    
    frame.setVisible(true);
      }
  });
        
         
             
        
}

          
         
      });
       
  JButton clearbtn =  new JButton("Clear");
  clearbtn.setBounds(680, 400,190,25);
  panel.add(clearbtn);
  clearbtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
        idtxt.setText("");
        nametxt.setText("");
        Emailtxt.setText("");
        locationtxt.setText("");
        planBox.setSelectedItem("Plan");
        dobYearBox.setSelectedItem(0);
        dobMonthBox.setSelectedItem(0);
        dobDayBox.setSelectedItem(0);
        
        
      }
  });
   JButton revertbtn = new JButton("Revert Button");
  revertbtn.setBounds(1100,400,190,25);
  panel.add(revertbtn);
  revertbtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"Id must be filled");
              return;
          }
          int id;
          try{
              id = Integer.parseInt(idText);
              
          }
          catch(NumberFormatException J)
          {
              JOptionPane.showMessageDialog(frame,"Id must be numeric");
              return;
          }
          GymMember foundId = null;
          for(GymMember m : memebers)
          {
              if(m.getId() ==id)
              {
                  foundId = m;
                  break;
              }
          }
          if(foundId==null)
          {
             
              
              JOptionPane.showMessageDialog(frame,"no member found with id :"+id);
                 return;    
          }
          if(foundId instanceof RegularMember)
          {
             String removalReason = JOptionPane.showInputDialog(frame , "Enter reason for reverting");
             if(removalReason != null )
             {
                  ((RegularMember) foundId).revertRegularMember(removalReason);
                  JOptionPane.showMessageDialog(frame,"Member reverted sucessfully");
             }
             else
             {
                 JOptionPane.showMessageDialog(frame,"revert cancelled reason is required");
             }
              
          }
          else
          {
              JOptionPane.showMessageDialog(frame , " This member id is not regular");
          }
          
      }
  });
  

frame.setVisible(true);
                       
}
               
   });
      premiumButton.addActionListener(new ActionListener()
      {
          
          public void actionPerformed(ActionEvent e)
          {
              frame = new JFrame("Premium Member");
               frame.setSize(600,600);
               frame.setLayout(null);
               JLabel title = new JLabel("Premium Member");
               title.setBounds(700,50,300,30);
               title.setFont(new Font("Arial", Font.BOLD, 30));
               frame.add(title);
               
              JPanel panel = new JPanel();
              panel.setSize(400,400);
              panel.setBackground(Color.LIGHT_GRAY);
             panel.setBounds(50,100,1400,500); 
             panel.setLayout(null);
             frame.add(panel);
             
          id = new JLabel("id");
          id.setBounds(80,70,190,25);
          id.setFont(new Font("Arial",Font.BOLD,20));
          idtxt = new JTextField();
          idtxt.setBounds(150,70,190,25);
          panel.add(id);
          panel.add(idtxt);
          
        name =  new JLabel("name");
        name.setBounds(80,120,190,25);
        name.setFont(new Font("Arial",Font.BOLD,20));
        nametxt = new JTextField();
        nametxt.setBounds(150,120,190,25);
        panel.add(name);
        panel.add(nametxt);
          
        
        location = new JLabel("location");
        location.setBounds(80,160,190,20);
        location.setFont(new Font("Arial",Font.BOLD,20));
        locationtxt = new JTextField();
        locationtxt.setBounds(160,160,190,25);
        panel.add(location);
        panel.add(locationtxt);
        
         phone = new JLabel("phone ");
        phone.setBounds(80,200,190,20);
        phone.setFont(new Font("Arial",Font.BOLD,20));
        phonetxt = new JTextField();
        phonetxt.setBounds(160,200,190,25);
        panel.add(phone);
        panel.add(phonetxt);
        
        email = new JLabel("Email ");
        email.setBounds(80,240,190,20);
        email.setFont(new Font("Arial",Font.BOLD,20));
        Emailtxt = new JTextField();
        Emailtxt.setBounds(160,240,190,25);
        panel.add(email);
        panel.add(Emailtxt);
        
         gender = new JLabel("Gender");
        gender.setBounds(80,290,100,25);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        male = new JRadioButton ("male");
        male.setBounds(160,290,90,25);
        female = new JRadioButton("female");
        female.setBounds(250,290,90,25);
        others = new JRadioButton("others");
        others.setBounds(340,290,90,25);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(others);
        panel.add(gender);
        panel.add(male);
        panel.add(female);
        panel.add(others);
        
        DOB = new JLabel("DOB");
        DOB.setBounds(80,350,190,20);
        DOB.setFont(new Font("Arial",Font.BOLD,20));
        
        String Year[] = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
            "2014","2015","2016","2107","2018","2019","2020","2021","2022","2023","2024","2025"};
            
         dobYearBox = new JComboBox(Year);
         dobYearBox.setBounds(160,350,130,25);
         
         String Month[] = {"Jan","Feb","March","April","May","June","July","August","September","october","November","December"};
         dobMonthBox = new JComboBox(Month);
         dobMonthBox.setBounds(290,350,130,25);
         String Day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23",
            "24","25","26","27","28","29","30","31"};
         dobDayBox = new JComboBox(Day);
          dobDayBox.setBounds(420,350,130,25);
          panel.add(DOB);
          panel.add(dobYearBox);
          panel.add(dobMonthBox);
          panel.add(dobDayBox);
          
          referalSource = new JLabel("Referral Source");
          referalSource.setBounds(80,400,160,25);
          referalSource.setFont(new Font("Arial",Font.BOLD,20));
          ReferralSourcetxt = new JTextField();
          ReferralSourcetxt.setBounds(240,400,190,25);
        panel.add(referalSource);
        panel.add(ReferralSourcetxt);
        
        
        
        premium = new JLabel("Premium Price");
        premium.setBounds(680,70,190,25);
        premium.setFont(new Font ("Arial",Font.BOLD,20));;
        premiumtxt = new JTextField();
        premiumtxt.setText("50,00");
        premiumtxt.setBounds(890,70,190,25);
        premiumtxt.setEditable(false);
        panel.add(premium);
        panel.add(premiumtxt);
        
        discount = new JLabel("discount amount ");
        discount.setBounds(680,120,190,25);
        discount.setFont(new Font ("Arial",Font.BOLD,20));;
        discounttxt = new JTextField();
        discounttxt.setText("0");
        discounttxt.setBounds(890,120,190,25);
        discounttxt.setEditable(false);
        panel.add(discount);
        panel.add(discounttxt);
        
        membershipStartDate = new JLabel("Membership Start Date");
        membershipStartDate.setBounds(680,180,250,20);
        membershipStartDate.setFont(new Font("Arial",Font.BOLD,20));
         msYearBox = new JComboBox(Year);
         msYearBox.setBounds(910,180,80,25);
         msMonthBox = new JComboBox(Month);
         msMonthBox.setBounds(990,180,80,25);
         msDayBox = new JComboBox(Day);
         msDayBox.setBounds(1070,180,80,25);
         
        panel.add(membershipStartDate);
        panel.add(msYearBox);
        panel.add(msMonthBox);
        panel.add(msDayBox);
         
        
        
        PaidAmount = new JLabel ("Paid Amount ");
        PaidAmount.setBounds(680,230,190,25);
        PaidAmount.setFont(new Font ("Arial",Font.BOLD,20));;
        PaidAmounttxt = new JTextField();
        PaidAmounttxt.setBounds(890,230,190,25);
        panel.add(PaidAmount);
        panel.add(PaidAmounttxt);
        

        JLabel personalTrainer = new JLabel("Personal Trainer ");
        personalTrainer.setBounds(680,290,190,25);
        JTextField personaltxt = new JTextField();
        personaltxt.setBounds(890,290,190,25);
        personalTrainer.setFont(new Font ("Arial",Font.BOLD,20));;
        panel.add(personalTrainer);
        panel.add(personaltxt);
        
        JButton premiumbtn = new JButton("Add Premium Member");
        premiumbtn.setBounds(680,320,190,25);
        panel.add(premiumbtn);
        premiumbtn.addActionListener(new ActionListener()
        {
           
            public void actionPerformed(ActionEvent e)
            {
                String idText = idtxt.getText();
        String name = nametxt.getText();
        String location = locationtxt.getText();
        String phone = phonetxt.getText();
        String email = Emailtxt.getText();
        //String referralSource = ReferralSourcetxt.getText();
        String personalTrainer = personaltxt.getText();

        // Get selected gender
        String gender = "";
        if (male.isSelected()) gender = "Male";
        else if (female.isSelected()) gender = "Female";
        else if (others.isSelected()) gender = "Others";

        
        String dob = dobDayBox.getSelectedItem() + "-" +
                     dobMonthBox.getSelectedItem() + "-" +
                     dobYearBox.getSelectedItem();

   
                     
    String membershipStartDate = java.time.LocalDate.now().toString();
     String[] fields = {idText , name, phone, email, gender};
        boolean hasEmptyField = false;
         for (String field : fields)
         {
             if(field.isEmpty())
             {
                 hasEmptyField = true;
                 break;
                 
             }
         }
         if(hasEmptyField)
         {
             JOptionPane.showMessageDialog(frame , "All field is required");
             return;
         }
    if(idText.isEmpty())
    {
        JOptionPane.showMessageDialog(frame,"Enter id ");
        return;
    }
    if(name.isEmpty())
    {
        JOptionPane.showMessageDialog(frame,"name is required");
        return;
    }
    int id;
    try{
        id = Integer.parseInt(idText);
    }
    catch(NumberFormatException i)
    {
     JOptionPane.showMessageDialog(frame,"id must be numeric");   
     return;
    }
  if (!isIdUnique(id)) {
            JOptionPane.showMessageDialog(frame, "Member ID already exists.");
            return;
     }
     PremiumMember members = new PremiumMember(id,name,location,phone,email,gender,dob,membershipStartDate,personalTrainer);
     memebers.add(members);
        JOptionPane.showMessageDialog(frame, "Premium member added successfully!");

        // Clear inputs
        idtxt.setText("");
        nametxt.setText("");
        locationtxt.setText("");
        phonetxt.setText("");
        Emailtxt.setText("");
        //ReferralSourcetxt.setText("");
        group.clearSelection();
        dobYearBox.setSelectedIndex(0);
        dobMonthBox.setSelectedIndex(0);
        dobDayBox.setSelectedIndex(0);
    
         
            }
            public boolean isIdUnique(int id)
            {
                for(GymMember m :memebers)
                { 
                    if(m.getId() == id)
                    {
                        return false;
                    }
                
                }
                return true;
            }
        });
        JButton activeButton = new JButton("Activate Membership");
            activeButton.setBounds(880,320,190,25);
            panel.add(activeButton);
            activeButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String idText = idtxt.getText();
                 
                 if(idText.isEmpty())
                 {
                     JOptionPane.showMessageDialog(frame,"Enter your member id to be activate");
                     return;
                 }
                 int id;
                 try{
                     id = Integer.parseInt(idText);
                     
                 }
                 catch(NumberFormatException f)
                 {
                     JOptionPane.showMessageDialog(frame,"Member id should be number");
                     return;
                 }
                 GymMember foundId = null;
                 for(GymMember m: memebers)
                 {
                     if(m.getId() ==id)
                     {
                         foundId = m;
                         break;
                     }
                 }
                 if(foundId !=null)
                 {
                     foundId.activeMembership();
                     JOptionPane.showMessageDialog(frame,"Membership is activated for Member ID");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(frame,"Membership not found with this id " +id);
                 }
                }
            });
            JButton deactivebtn = new JButton("Deactivate Membership");
            deactivebtn.setBounds(1100,320,190,25);
            panel.add(deactivebtn);
            deactivebtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String idText = idtxt.getText();
                 
                 if(idText.isEmpty())
                 {
                     JOptionPane.showMessageDialog(frame,"Enter your member id to be activate");
                     return;
                 }
                 int id;
                 try{
                     id = Integer.parseInt(idText);
                     
                 }
                 catch(NumberFormatException f)
                 {
                     JOptionPane.showMessageDialog(frame,"Member id should be number");
                     return;
                 }
                 GymMember foundId = null;
                 for(GymMember m: memebers)
                 {
                     if(m.getId() ==id)
                     {
                         foundId = m;
                         break;
                     }
                 }
                 if(foundId !=null)
                 {
                     foundId.activeMembership();
                     JOptionPane.showMessageDialog(frame,"Membership is deactivate for Member ID");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(frame,"Membership not found with this id " +id);
                 }
                }
            });
            JButton markbtn = new JButton("Mark Attendance");
  markbtn.setBounds(680,400,195,25);
  panel.add(markbtn);
  markbtn.addActionListener(new ActionListener()
  {  
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"Enter your id to mark attendance");
              return;
          }
          int id;
        try{
         id = Integer.parseInt(idText);
                
        }
        catch(NumberFormatException f)
         {
           JOptionPane.showMessageDialog(frame,"Member id should be number");
         return;
         }
          GymMember foundId = null;
          for(GymMember m :memebers)
          {
              if(m.getId() == id)
              { 
                  foundId = m;
                  break;
                  
              }
          }
              if(foundId ==null)
              {
                 JOptionPane.showMessageDialog(frame,"no member found with id :"+id);
                 return;
                  
              }
              if(!foundId.getActiveStatus())
              {
                 JOptionPane.showMessageDialog(frame,"Membership is not active.Cannot mark attendance.");
                 return;
                 
              }
              foundId.markAttendance();
              JOptionPane.showMessageDialog(frame,"Attendance marked succesfully for Id:"+id);
              idtxt.setText("");
          
          
      }
      
  });
  JButton revertbtn = new JButton("Revert Button");
  revertbtn.setBounds(880,400,190,25);
  panel.add(revertbtn);
  revertbtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          String idText = idtxt.getText();
          if(idText.isEmpty())
          {
              JOptionPane.showMessageDialog(frame,"Id must be filled");
              return;
          }
          int id;
          try{
              id = Integer.parseInt(idText);
              
          }
          catch(NumberFormatException J)
          {
              JOptionPane.showMessageDialog(frame,"Id must be numeric");
              return;
          }
          GymMember foundId = null;
          for(GymMember m : memebers)
          {
              if(m.getId() ==id)
              {
                  foundId = m;
                  break;
              }
          }
          if(foundId==null)
          {
             
              
              JOptionPane.showMessageDialog(frame,"no member found with id :"+id);
                 return;    
          }
          if(foundId instanceof PremiumMember)
          {
             
              ((PremiumMember) foundId).revertPremiumMember();
          }
          
          
      }
  });
  JButton clearbtn =  new JButton("Clear");
  clearbtn.setBounds(1100, 400,190,25);
  panel.add(clearbtn);
  clearbtn.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
        idtxt.setText("");
        nametxt.setText("");
        Emailtxt.setText("");
        locationtxt.setText("");
        planBox.setSelectedItem("Plan");
        dobYearBox.setSelectedItem(0);
        dobMonthBox.setSelectedItem(0);
        dobDayBox.setSelectedItem(0);
        
        
      }
  });
  JButton discountBtn = new JButton("Discount Calculate");
      discountBtn.setBounds(680, 450 ,190,25);
      panel.add(discountBtn);
      discountBtn.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
              try {
            int id = Integer.parseInt(idtxt.getText().trim());
            double paid = Double.parseDouble(PaidAmounttxt.getText()); // Read from paidField
            boolean found = false;

            for (GymMember m : memebers) {
                if (m.getId() == id) {
                    found = true;

                    if (m instanceof PremiumMember) {
                        PremiumMember pm = (PremiumMember) m;

                        // Pay entered amount first
                        String result = pm.payDueAmount(paid);
                        JOptionPane.showMessageDialog(frame, result);

                        // Then calculate discount
                        double discount = pm.calculateDiscount();
                        if (discount == 0) {
                            JOptionPane.showMessageDialog(frame,
                                "No discount available. Full payment not completed.");
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                "Discount for Member ID " + id + " is: Rs. " + discount);
                        }

                    } else {
                        JOptionPane.showMessageDialog(frame, "Member is not a Premium Member.");
                    }
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(frame, "No member found with ID: " + id);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }
});


JButton savebtn = new JButton("Save");
savebtn.setBounds(880,450,190,25);
panel.add(savebtn);      
savebtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        
    try {
        FileWriter write = new FileWriter("PremiumMembers.txt");
        BufferedWriter writer = new BufferedWriter(write);

        writer.write(String.format(
            "%-5s %-15s %-15s %-15s %-25s %-10s %-15s %-20s %-10s %-10s %-15s %-15s %-10s %-15s\n",
            "ID", "Name", "Location", "Phone", "Email", "Attendance", "LoyaltyPts", "StartDate",
            "Plan", "Price", "ActiveStatus", "FullPayment", "Discount", "NetAmount"
        ));

        for (GymMember m : memebers) {
            if (m instanceof PremiumMember) {
                PremiumMember pm = (PremiumMember) m;

                String plan = "Premium";
                double price = pm.premiumCharge;
                boolean isPaid = pm.getIsFullyPayment();
                double discount = pm.calculateDiscount();
                double netPay = price - discount;

                String value = String.format(
                    "%-5d %-15s %-15s %-15s %-25s %-10d %-15.2f %-20s %-10s %-10.2f %-15s %-15s %-10.2f %-15.2f",
                    pm.getId(), pm.getName(), pm.getLocation(), pm.getPhone(), pm.getEmail(),
                    pm.getAttendance(), pm.getLoyaltyPoints(), pm.getmembershipStartDate(),
                    plan, price, pm.getActiveStatus(), isPaid, discount, netPay
                );

                writer.write(value + "\n");
            }
        }

        writer.close();
        JOptionPane.showMessageDialog(frame, "Premium member details saved to PremiumMembers.txt");
    } catch (IOException a) {
        a.printStackTrace();
    }
}

});
JButton readbtn  = new JButton("Read ");
readbtn.setBounds(1100, 450,190,25);
panel.add(readbtn);
readbtn.addActionListener(new ActionListener()
{
    public void actionPerformed( ActionEvent e)
    {
        JFrame readFrame = new JFrame("Premium Members List");
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea.setEditable(false);

        try {
            FileReader fileReader = new FileReader("PremiumMembers.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }

            reader.close();
        } catch (IOException ex) {
            textArea.setText("Error reading file: " + ex.getMessage());
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        readFrame.add(scrollPane);
        readFrame.setSize(900, 400);
        readFrame.setLocationRelativeTo(null);
        readFrame.setVisible(true);
    }
    
});
JButton paybtn = new JButton ( "Pay Due Amount");
paybtn.setBounds(450 , 450 ,190,25);
panel.add(paybtn);
paybtn.addActionListener(new ActionListener()
{
    public void actionPerformed( ActionEvent e)
    {
        try {
            int id = Integer.parseInt(idtxt.getText().trim());
            double amountToPay = Double.parseDouble(PaidAmounttxt.getText().trim());
            boolean found = false;

            for (GymMember m : memebers) {
                if (m.getId() == id) {
                    found = true;

                    if (m instanceof PremiumMember) {
                        PremiumMember pm = (PremiumMember) m;
                        String result = pm.payDueAmount(amountToPay);
                        JOptionPane.showMessageDialog(frame, result);
                    } else {
                        JOptionPane.showMessageDialog(frame, "This member is not a Premium Member.");
                    }
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(frame, "No member found with ID: " + id);
            }

            // Clear fields after
            idtxt.setText("");
            PaidAmounttxt.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values.");
        } catch (Exception h) {
            JOptionPane.showMessageDialog(frame, "Error: " + h.getMessage());
        }
    }
});

      

            
             
            
            
        
          
       
             
             frame.setVisible(true);
          }
      });
      displayButton.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
              String obj="";
              for (GymMember m :memebers)
              {
                  if ( m instanceof RegularMember)
                  {
                      RegularMember am = (RegularMember)m;
                      obj += "ID :"+am.getId();
                      obj += "Name :"+am.getName();
                      obj += "Location :"+am.getLocation();
                      //obj += "Phone :"+am.getphone();
                      obj += "Email :"+am.getEmail();
                      obj += "Gender :"+am.getGender();
                      obj += "dob :"+am.getDOB();
                      obj += "StartDate :"+am.getmembershipStartDate();
                      obj += "Referral :"+am.getId();
                      obj += "Attendance :"+am.getAttendance();
                      obj += "plan :"+am.getPlan();
                      
                      
                      
                  }
                  if ( m instanceof PremiumMember)
                  {
                      PremiumMember pm = (PremiumMember)m;
                      obj += "ID :"+pm.getId();
                      obj += "Name :"+pm.getName();
                      obj += "Location :"+pm.getLocation();
                      //obj += "Phone :"+am.getphone();
                      obj += "Email :"+pm.getEmail();
                      obj += "Gender :"+pm.getGender();
                      obj += "dob :"+pm.getDOB();
                      obj += "StartDate :"+pm.getmembershipStartDate();
                      obj += "Referral :"+pm.getId();
                      obj += "Attendance :"+pm.getAttendance();
                      obj += "Loyalty Ponits :"+pm.getLoyaltyPoints();
                      
                      
                      
                      
                  }
              }
              if(obj.isEmpty())
              {
                  JOptionPane.showMessageDialog(frame,"No  member's found");
              }
              else
              {
                  
                  
                  JTextArea textArea = new JTextArea(obj);
                  textArea.setEditable(false);
                  JScrollPane scrollPane = new JScrollPane(textArea);
                  scrollPane.setPreferredSize(new Dimension(1000,500));
                   JOptionPane.showMessageDialog(frame,scrollPane,"ALL Members",JOptionPane.INFORMATION_MESSAGE);
              
             
             
            }
              
          }
      });
        
      
      
      
        
        
        frame.setVisible(true);
        
       
        
        
        
        
        
        
        
        
        
       
        
               
                
                    
                
               
                
                
                
                
                
                
         
        }
        public static void main (String[]args)
        {
            new GymGUI();
        }
    }
