import java.util.Scanner;

public class RoboResumeApp {
    public static void main(String[] args) {


        String name = " ";
        String email = " ";

        String educationLoopValue = "Y";
        String degreeEducation = " ";
        String degreeMajor = " ";
        String degreeUniversity = " ";
        int degreeYear = 0;

        String workExperienceLoopValue = "Y";
        String jobDescriptionValue = "Y";
        String workCompany = " ";
        String jobTitle = " ";
        String jobDescription = " ";
        String startDate = " ";
        String endDate = " ";

        int skillLoopCount = 0;
        String skillLoopValue = "y";
        String nameSkill = " ";
        String ratingSkill = " ";


        Name name1 = new Name();
        Education education1 = new Education();
        Experience experience1 = new Experience();
        Skills skills1 = new Skills();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = input.nextLine();
        name1.setName(name);

        System.out.println();

        System.out.println("Please enter your e-mail address: ");
        email = input.nextLine();
        name1.setEmail(email);

        //make loop for Education (at least 1 Education)
        //begin Education loop

        System.out.println();
        System.out.println("Education...");

        while (educationLoopValue.equalsIgnoreCase("y")) {
            System.out.println("Please enter college degree: 'Associate's', 'Bachelor's', Master's, 'PhD'");
            degreeEducation = input.nextLine();
            education1.setDegreeEducation(degreeEducation);


            System.out.println();
            System.out.println("Please enter degree major: ");
            degreeMajor = input.nextLine();
            education1.setDegreeMajor(degreeMajor);

            System.out.println();
            System.out.println("Please enter name of University or College: ");
            degreeUniversity = input.nextLine();
            education1.setDegreeUniversity(degreeUniversity);

            System.out.println();
            System.out.println("Please enter year of Graduation: i.e. '2002'");
            degreeYear = input.nextInt();
            education1.setDegreeYear(degreeYear);
            input.nextLine();

            System.out.println();
            System.out.println("Do you want to enter another degree? enter 'Y' to continue ");
            educationLoopValue = input.nextLine();
            System.out.println();

        }

        //end Education loop


        //make loop for Work Experience (at least 1 work experience)
        //begin Work Experience loop

        System.out.println();
        System.out.println("Work Experience...");

        while (workExperienceLoopValue.equalsIgnoreCase("y")) {
            System.out.println("Please enter name of company: ");
            workCompany = input.nextLine();
            experience1.setWorkCompany(workCompany);

            System.out.println();
            System.out.println("Please enter Job Title: ");
            jobTitle = input.nextLine();
            experience1.setJobTitle(jobTitle);

            System.out.println();
            System.out.println("Please enter Start Date: i.e. 11/2018");
            startDate = input.nextLine();
            experience1.setStartDate(startDate);

            System.out.println();
            System.out.println("Please enter End Date: i.e. 11/2018 or 'Current' ");
            endDate = input.nextLine();
            experience1.setEndDate(endDate);


            //make loop for job description (at least 1 job description)
            //being job description loop

            while (jobDescriptionValue.equalsIgnoreCase("y")) {
                System.out.println();
                System.out.println("Please enter Job Description: ");
                jobDescription = input.nextLine();
                experience1.setJobDescription(jobDescription);

                System.out.println();
                System.out.println("Do you want to enter another Job Description? enter 'Y' to continue ");
                jobDescriptionValue = input.nextLine();
                System.out.println();


            }

            System.out.println();
            System.out.println("Do you want to enter another Work Experience? enter 'Y' to continue ");
            workExperienceLoopValue = input.nextLine();
            System.out.println();
            jobDescriptionValue = "y";

        }

        //end job description loop

        //end Work Experience loop


        //begin skills loop (at least 3 skills)

        System.out.println();
        System.out.println("Skills...");
        System.out.println("Please enter skill: ");
        System.out.println("Must add at least 3 skills...");
        nameSkill = input.nextLine();
        skills1.setNameSkill(nameSkill);

        System.out.println();
        System.out.println("Please enter Rating/Proficiency: 'Fundamental', 'Novice', 'Intermediate', 'Advanced', 'Expert'");
        ratingSkill = input.nextLine();
        skills1.setRatingSkill(ratingSkill);
        skillLoopCount = skillLoopCount + 1;

//        System.out.println(skillLoopCount + "before while loop 1");

        while (skillLoopCount < 3) {
            System.out.println();
            System.out.println("Add another skill: ");
            nameSkill = input.nextLine();
            skills1.setNameSkill(nameSkill);


            System.out.println();
            System.out.println("Please enter Rating/Proficiency: 'Fundamental', 'Novice', 'Intermediate', 'Advanced', 'Expert'");
            ratingSkill = input.nextLine();
            skills1.setRatingSkill(ratingSkill);

            skillLoopCount = skillLoopCount + 1;

//            System.out.println(skillLoopCount + "inside while loop 1");

            if (skillLoopCount == 3) {
                System.out.println();
                System.out.println("Do you want to enter another Skill? enter 'Y' to continue ");
                skillLoopValue = input.nextLine();
                break;
            }
        }

        while (skillLoopValue.equalsIgnoreCase("Y")) {
            System.out.println();
            System.out.println("Add another skill: ");
            nameSkill = input.nextLine();
            skills1.setNameSkill(nameSkill);

            System.out.println();
            System.out.println("Please enter Rating/Proficiency: 'Fundamental', 'Novice', 'Intermediate', 'Advanced', 'Expert'");
            ratingSkill = input.nextLine();
            skills1.setRatingSkill(ratingSkill);

            System.out.println();
            System.out.println("Do you want to enter another Skill? enter 'Y' to continue ");
            skillLoopValue = input.nextLine();

//            System.out.println(skillLoopCount + "inside while loop 2");
        }

        //end skills loop


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Name: " + name1.getName());
        System.out.println("E-mail: " + name1.getEmail());


        System.out.println();
        System.out.println("Education");
//        System.out.println(education1.getDegreeEducation() + " degree in " + education1.getDegreeMajor());
//        System.out.println("from " + education1.getDegreeUniversity() + " in " + education1.getDegreeYear());
        System.out.println(education1.toString());


        System.out.println();
        System.out.println("Experience");
//        System.out.println(experience1.getWorkCompany());
//        System.out.println(experience1.getJobTitle());
//        System.out.println("from " + experience1.getStartDate() + " to " + experience1.getEndDate());
//        System.out.println(experience1.getJobDescription());
        System.out.println(experience1.toString());


        System.out.println();
        System.out.println("Skills");
//        System.out.println(skills1.getNameSkill() + "..." + skills1.getRatingSkill());
        System.out.println(skills1.toString());

    }

}

