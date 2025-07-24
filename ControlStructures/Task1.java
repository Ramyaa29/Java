class Task1{
    public static void main(String[] args) {
        byte StudentGradLevel = 10;
        int tutionFee = 10000;
        byte discount = 0;
        boolean isAcademicTopper = true;

        if(StudentGradLevel >=9 && StudentGradLevel <= 12){
            if(isAcademicTopper){
                discount = 20;
            } else{
                discount = 10;
            }
        } else if (StudentGradLevel >= 6 && StudentGradLevel <=8){
            discount = 5;
        }else{
            discount = 0;
        }

        if(StudentGradLevel == 10){
            discount += 3;
        }else if (StudentGradLevel == 12){
            discount +=5;
        }
        else{
            discount += 0;
        }

        int discountedFee = tutionFee - (tutionFee * discount/100);

        System.out.println("Student's Grade Level:" + StudentGradLevel);
        System.out.println("Base Tution Fee: "+ tutionFee);;
        System.out.println("Total Discount Percentage: " + discount + "%");
        System.out.println("Tution fee after discount : "+ discountedFee);
    }
}




