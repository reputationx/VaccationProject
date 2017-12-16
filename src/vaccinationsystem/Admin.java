package vaccinationsystem;



import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends staff implements Serializable{

    private static final long serialVersionUID = 4L;    
    private final String adminFileName = "admin.bin";
    FileMangerBinary2 Fmanger =new FileMangerBinary2();
    private final File file = new File(adminFileName);


public static ArrayList<Admin> Admins = new ArrayList<>();

   

    

public Admin (int pId,int pAge,String pFirstName,String pLastName ,String pEmail,String sUsername,String sPassword,double sSalary){
   super(pId,pAge,pFirstName,pLastName,pEmail,sUsername,sPassword,sSalary);
        if(!this.file.exists()){
            try {
            this.file.createNewFile();
            } catch (IOException ex) {
             Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}

   public Admin(){
        if(!this.file.exists()){
            try {
            this.file.createNewFile();
            } catch (IOException ex) {
             Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }


   
  /*
public boolean addadmin() {
        if (this.FManger.write(this.getadminData(), adminFileName, true)) {
            return true;
        } else {
            return false;
        }
}
         private String getadminData() {
        return this.pId + "@" + this.pFirstName + "@" + this.pLastName + "@" + this.pAge + "@" + this.pEmail + "@" + this.sUserName + "@" + this.sPassword+ "@" + this.sSalary + "@";
    }
    
        
public void addNewAdmin(int pId,int pAge,String pFirstName,String LastName ,String pEmail,String sUsername,String sPassword,double sSalary)
{
        Admin x = new Admin(pId, pAge,pFirstName ,pFirstName, pEmail,sUsername,sPassword,sSalary);
        if( x.addadmin())
            System.out.println(x.toString() + "Added Successfully ... !"); 
        else
            System.out.println("Failed to insert ... !");
    }
        
 @Override
    public String toString() {
        return "I'm admin : " + pFirstName + " " + pLastName + "\n" + "ID : " + pId + " Age : " + pAge + "\n"
                + "\nUserName: " + sUserName + "\t Password: " + sPassword + "\nSalary: " + sSalary;
    }
  public void displayadmins() {
        Admin a = new Admin();
        System.out.println(a.displayAllAdmins());
    }

  
   private void loadFromFile() {
            Admins= (ArrayList<Admin>) this.Fmanger.read("admin.bin");
    }
  public String displayAllAdmins() {
        loadFromFile();
        String A = "\nAll Admin Data:\n";
        for (Admin x : Admins) {
            A = A + x.toString();
        }
    return A;
  }
        
        
  private int getAdminIndex(int id){
        for (int i = 0; i < Admins.size(); i++)
            if(Admins.get(i).getPId()== id)
                return i;
        
        return -1;
    }
    
        
     public String searchAdmin(int id){
        loadFromFile();
        int index = getAdminIndex(id);
        if(index != -1)
            return "\nFound ...!" + Admins.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
  
    public void searchForAdmin(int id) {
        Admin x = new Admin();
        System.out.println(x.searchAdmin(id));
    }

     public boolean commitToFile() {
         return Fmanger.write(adminFileName, Admins);

    }
  
    public void updateAdmin(int oldID, Admin x){
        loadFromFile();
        int index = getAdminIndex(oldID);
        Admins.set(index, x);
        commitToFile();
    } 
    
     public void updateAdmins(int oldID, Admin newAdminValues) {
        Admin x = new Admin();
        x.updateAdmin(oldID, newAdminValues);
        System.out.println("Updated Successfully ... !");
    }
    
      public void deleteAdmin(int id){
        loadFromFile();
        int index = getAdminIndex(id);
        Admins.remove(index);
        commitToFile();
    } 
      
    public void deleteAdmins(int Id) {
        Admin x = new Admin();
        x.deleteAdmin(Id);
        System.out.println("deleted Successfully ... !");
    }
    
 public void addNewDoctor(int pId,int pAge,String pFirstName,String LastName ,String pEmail,String sUsername,String sPassword,double sSalary){
        Doctor x = new Doctor(pId, pAge,pFirstName ,pFirstName, pEmail,sUsername,sPassword,sSalary);
        if( x.adddoctor() )
            System.out.println(x.toString() + "Added Successfully ... !"); 
        else
            System.out.println("Failed to insert ... !");
    }

 
   public void displayDoctors() {
        Doctor x = new Doctor();
        System.out.println(x.displayAllDoctors());
    }
 
    public void searchForDoctor(int id) {
        Doctor x = new Doctor();
        System.out.println(x.searchDoctor(id));
    }

 
      public void updateDoctor(int oldID, Doctor newDocValues) {
        Doctor x = new Doctor();
        x.updateDoc(oldID, newDocValues);
        System.out.println("Updated Successfully ... !");
    }

    public void deleteDoctor(int Id) {
        Doctor x = new Doctor();
        x.deleteDoc(Id);
        System.out.println("deleted Successfully ... !");
    }
  
 public void addNewStoreKeeper(int pId,int pAge,String pFirstName,String LastName ,String pEmail,String sUsername,String sPassword,double sSalary){
        StoreKeeper x = new StoreKeeper(pId, pAge,pFirstName ,pLastName, pEmail,sUsername,sPassword,sSalary);
        if( x.addstorekeeper() )
            System.out.println(x.toString() + "Added Successfully ... !");
        else 
            System.out.println("Failed to insert ... !");
    }
public void displaySroeKeeper() {
        StoreKeeper x = new StoreKeeper();
        System.out.println(x.displayAllStoreKeeper());
    }
 
    public void searchForStoreKeeper(int id) {
        StoreKeeper x = new StoreKeeper();
        System.out.println(x.searchStoreKeeper(id));
    }

 
      public void updateStoreKeeper(int oldID, StoreKeeper newstkValues) {
        StoreKeeper x = new StoreKeeper();
        x.updateStore(oldID, newstkValues);
        System.out.println("Updated Successfully ... !");
    }

    public void deleteStore(int Id) {
        StoreKeeper x = new StoreKeeper();
        x.deleteStore(Id);
        System.out.println("deleted Successfully ... !");
    }
 
 public void addNewReservOfficer(int pId,int pAge,String pFirstName,String LastName ,String pEmail,String sUsername,String sPassword,double sSalary){
        ReservOfficer x = new ReservOfficer(pId, pAge,pFirstName ,pLastName, pEmail,sUsername,sPassword,sSalary);
        if( x.addReservOfficer() )
            System.out.println(x.toString() + "Added Successfully ... !");
        else 
            System.out.println("Failed to insert ... !");
    }
   /*
   public void displayReservOfficer() {
        ReservOfficer x = new ReservOfficer();
        System.out.println(x.displayAllReservOfficers());
    }
 
    public void searchForReservOfficer(int id) {
        ReservOfficer x = new ReservOfficer();
        System.out.println(x.searchReservOfficer(id));
    }

 */
      public void updateReservOfficer(int oldID, ReservOfficer newResValues) {
        ReservOfficer x = new ReservOfficer();
        x.updateRes(oldID, newResValues);
        System.out.println("Updated Successfully ... !");
    }

    public void deleteReservOfficer(int Id) {
        ReservOfficer x = new ReservOfficer();
        x.deleteRes(Id);
        System.out.println("deleted Successfully ... !");
    }
    /*
    @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (Admin x : Admins) {
            if (userName.equals(x.sUserName) && Pass.equals(x.sPassword)) {
                return true;
            }
        }
        return false;
    }*/
    @Override
    public String toString() {
        return "I'm admin : " + pFirstName + " " + pLastName + "\n" + "ID : " + pId + " Age : " + pAge + "\n"
                + "\nUserName: " + sUserName + "\t Password: " + sPassword + "\nSalary: " + sSalary;
    }
    @Override
    public boolean login(String userName, String Pass) {

        if (userName.equals("Shenoudafarouk") && Pass.equals("1234567899")) {
            return true;
        }
        return false;

    }
  
 
 
 
      
}
