
import java.util.ArrayList;

public class Education {

    private ArrayList<String> DegreeEducation = new ArrayList<>();
    private ArrayList<String> DegreeMajor = new ArrayList<>();
    private ArrayList<String> DegreeUniversity = new ArrayList<>();
    private ArrayList<Integer> DegreeYear = new ArrayList<>();
    private String degreeEducation = " ";
    private String degreeMajor = " ";
    private String degreeUniversity = " ";
    private int degreeYear = 0;


    public Education() {

    }


    public Education(String degreeEducation, String degreeMajor, String degreeUniversity, int degreeYear) {
        this.degreeEducation = degreeEducation;
        this.degreeMajor = degreeMajor;
        this.degreeUniversity = degreeUniversity;
        this.degreeYear = degreeYear;
    }

    public String getDegreeEducation() {
        return degreeEducation;
//        return DegreeEducation.get(1);
    }

    public void setDegreeEducation(String degreeEducation) {
        this.degreeEducation = degreeEducation;
        DegreeEducation.add(degreeEducation);
    }

    public String getDegreeMajor() {
        return degreeMajor;
//        return DegreeMajor.get(1);

    }

    public void setDegreeMajor(String degreeMajor) {
        this.degreeMajor = degreeMajor;
        DegreeMajor.add(degreeMajor);
    }

    public String getDegreeUniversity() {
        return degreeUniversity;
//        return DegreeUniversity.get(1);
    }

    public void setDegreeUniversity(String degreeUniversity) {
        this.degreeUniversity = degreeUniversity;
        DegreeUniversity.add(degreeUniversity);
    }

    public int getDegreeYear() {
        return degreeYear;
//        return DegreeYear.get(1);
    }

    public void setDegreeYear(int degreeYear) {
        this.degreeYear = degreeYear;
        DegreeYear.add(degreeYear);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 1; i <= DegreeUniversity.size(); i++) {
            str += DegreeEducation.get(i-1) + " degree in " + DegreeMajor.get(i-1) + "\n" + "from "
                    + DegreeUniversity.get(i-1) + " in " + DegreeYear.get(i-1) + "\n\n";
        }

        return str;
    }
//        System.out.println(education1.getDegreeEducation() + " degree in " + education1.getDegreeMajor());
//        System.out.println("from " + education1.getDegreeUniversity() + " in " + education1.getDegreeYear());



}

