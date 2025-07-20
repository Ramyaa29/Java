class Form{
    public static void main(String[] args) {
        boolean is1styear = true;
        boolean istransferee = false;
        boolean isreturnee = false;

        String Last_Name = "Geesala";
        String First_Name = "Ramya";
        String Middle_Name = "N/A";
        String Company_Adress = "Hyderabad";
        String DOB = "01/01/2001";
        String Citizenship = "Indian";
        boolean isIndian = true;
        char Gender = 'F';
        boolean isFemale = true;
        boolean isMarried = false;
        long Contact_Number = 90000101;
        String Religion = "Hindu";
        String Name_of_spouse ="N/A";
        String Contact_Number_of_spouse = "N/A";

        //Father's details
        String Father_Name = "Daddy";
        String F_Occupation = "XYZ";
        long F_Contact_Number= 000001001;

        //Mother's details
        String Mother_Name = "Mummy";
        String M_Occupation = "XYZ";

        //Guardian's details
        String Guardians_Name ="Guardian";
        String Guardians_Contact_Number = "000001001";
        String Guardians_Address = "Hyderabad";
        long M_Contact_Number= 000001001;
        
        String Senior_high_school="XYZ High School";
        int SHS_Strand = 12;
        int grad_year = 2025;
        float Gen_avg = 95.5f;
    //for transferee
        String Last_school_sttended ="ABC School";
        String Course = "XYZ";
        int Last_school_year = 2023;

        //for als
        boolean ALS = false;
        int Year_taken = 2023;
        byte Average = 90;

        boolean isdisabled = false;
        String Type_of_disability = "N/A";

        boolean is4Psbenficiary = false;
        String PsID = "90000101";

        
        //print details
        System.out.println("Is 1st year: " + is1styear);
        System.out.println("Is transferee: " + istransferee);
        System.out.println("Is returnee: " + isreturnee);
        System.out.println("Last Name: " + Last_Name);
        System.out.println("First Name: " + First_Name);
        System.out.println("Middle Name: " + Middle_Name);
        System.out.println("Company Address: " + Company_Adress);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Citizenship: " + Citizenship);
        System.out.println("Is Indian: " + isIndian);
        System.out.println("Gender:"+ +Gender);
        System.out.println("Is married:" + isMarried);
        System.out.println("Contact Number: " + Contact_Number);
        System.out.println("Religion: " + Religion);
        System.out.println("Name of Spouse: " + Name_of_spouse);
        System.out.println("Contact Number of Spouse: " + Contact_Number_of_spouse);
        System.out.println("Father's Name: " + Father_Name);
        System.out.println("Father's Occupation: " + F_Occupation);
        System.out.println("Father's Contact Number: " + F_Contact_Number);
        System.out.println("Mother's Name: " + Mother_Name);
        System.out.println("Mother's Occupation: " + M_Occupation);
        System.out.println("Guardian's Name: " + Guardians_Name);
        System.out.println("Guardian's Contact Number: " + Guardians_Contact_Number);
        System.out.println("Guardian's Address: " + Guardians_Address);
        System.out.println("Mother's Contact Number: " + M_Contact_Number);
        System.out.println("Senior High School: " + Senior_high_school);
        System.out.println("SHS Strand: " + SHS_Strand);
        System.out.println("Graduation Year: " + grad_year);    
        System.out.println("General Average: " + Gen_avg);

        // For transferee
        System.out.println("Last School Attended: " + Last_school_sttended);
        System.out.println("Course: " + Course);
        System.out.println("Last School Year: " + Last_school_year);
        // For ALS
        System.out.println("Is ALS: " + ALS);
        System.out.println("Year Taken: " + Year_taken);
        System.out.println("Average: " + Average);

        // For disability
        System.out.println("Is Disabled: " + isdisabled);   
        System.out.println("Type of Disability: " + Type_of_disability);

        // For 4Ps beneficiary
        System.out.println("Is 4Ps Beneficiary: " + is4Psbenficiary);
        System.out.println("PS ID: " + PsID);

    }
}