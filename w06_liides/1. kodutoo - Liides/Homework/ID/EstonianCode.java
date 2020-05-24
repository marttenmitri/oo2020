public class EstonianCode implements PersonalCodeBehaviour {

    public static String ID;


    public EstonianCode(String id){
        this.ID = id;
        System.out.println("Isik on " + getGender(ID) + " ja ta on sündinud 19" +getYear(ID)+"."+ getMonth(ID)+"."+ getDay(ID));
    }

    
    @Override
    public String getGender(String ID) {

        String gender = this.ID.substring(0,1);
        int genderInt = Integer.parseInt(gender);

        if(genderInt == 3){
            return "Mees";
        }
        else{
            return "Naine";
        }
    }

    @Override
    public String getDay(String ID) {

        String day = this.ID.substring(5,7);
        return day;
    }

    @Override
    public String getMonth(String ID) {
        
        String month = this.ID.substring(3, 5);
        //int monthInt = Integer.parseInt(month);
        return month;
    }

    @Override
    public String getYear(String ID) {

        String year = this.ID.substring(1, 3);
        return year;
    }

    
}