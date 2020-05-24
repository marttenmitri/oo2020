public class FinnishCode implements PersonalCodeBehaviour{
    
    public static String ID;

    public FinnishCode(String id){
        this.ID = id;
        System.out.println("Isik on " + getGender(ID) + " ja ta on sündinud " +getYear(ID)+"."+ getMonth(ID)+"."+ getDay(ID));
    }

    @Override
    public String getGender(String ID) {
        String gender = this.ID.substring(7,10);
        int genderInt = Integer.parseInt(gender);

        if(genderInt % 2 == 0){
            return "Mees";
        }
        else{
            return "Naine";
        }
    }

    @Override
    public String getDay(String ID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getMonth(String ID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getYear(String ID) {
        // TODO Auto-generated method stub
        return null;
    }
}