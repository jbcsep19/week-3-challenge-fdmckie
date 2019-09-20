import java.util.ArrayList;

public class Skills {


    private ArrayList<String> NameSkill = new ArrayList<>();
    private ArrayList<String> RatingSkill = new ArrayList<>();
    private String nameSkill = " ";
    private String ratingSkill = " ";


    public Skills() {
    }


    public Skills(String nameSkill, String ratingSkill) {
        this.nameSkill = nameSkill;
        this.ratingSkill = ratingSkill;
    }


    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
        NameSkill.add(nameSkill);
    }

    public String getRatingSkill() {
        return ratingSkill;
    }

    public void setRatingSkill(String ratingSkill) {
        this.ratingSkill = ratingSkill;
        RatingSkill.add(ratingSkill);
    }

    @Override
    public String toString() {
        String str = "";
        for (int j = 1; j <= NameSkill.size(); j++) {
            str += NameSkill.get(j - 1) + "...." + RatingSkill.get(j - 1) + "\n" ;
        }

        return str;
    }




}
