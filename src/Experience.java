import java.util.ArrayList;

public class Experience {




    private ArrayList<String> WorkCompany = new ArrayList<>();
    private ArrayList<String> JobTitle = new ArrayList<>();
    private ArrayList<String> JobDescription = new ArrayList<>();
    private ArrayList<String> StartDate = new ArrayList<>();
    private ArrayList<String> EndDate = new ArrayList<>();
    private String workCompany = " ";
    private String jobTitle = " ";
    private String jobDescription =  " ";
    private String startDate = " ";
    private String endDate = " ";


    public Experience() {

    }


    public Experience(String workCompany, String jobTitle, String jobDescription, String startDate, String endDate) {
        this.workCompany = workCompany;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
        WorkCompany.add(workCompany);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        JobTitle.add(jobTitle);
        JobDescription.add(jobTitle);
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        JobDescription.add(jobDescription);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
        StartDate.add(startDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
        EndDate.add(endDate);
    }





    @Override
    public String toString() {
        String str = "";
        String str2 = "";
        for (int j = 1; j <= WorkCompany.size(); j++) {
            str += JobTitle.get(j - 1) + " at " + WorkCompany.get(j - 1) + "\n" + "from "
                    + StartDate.get(j - 1) + " to " + EndDate.get(j - 1) + "\n"
                    + JobDescription.get(j - 1) + "\n";
        }

//        for (int k = JobDescription.size(); k > 1 ; k--) {
//            if (JobTitle.get(k-1).equalsIgnoreCase(JobDescription.get(0))) {
//                str2 += JobDescription.get(k-1) + "\n";
//            }
//        }

        return str;
    }





//        System.out.println(experience1.getWorkCompany());
//        System.out.println(experience1.getJobTitle());
//        System.out.println("from " + experience1.getStartDate() + " to " + experience1.getEndDate());
//        System.out.println(experience1.getJobDescription());



}
