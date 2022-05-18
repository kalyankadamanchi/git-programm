package loops;

import javaapplication.Company;

import java.util.ArrayList;
import java.util.List;

public class ForExample {
    public static void main(String[] args) {
        Company company1 = new Company();
        company1.setCompanyName("codexbox");
        company1.setCompanyLocation("Gachbowli");
        company1.setCompanyRating(4.5);

        Company company2 = new Company();
        company2.setCompanyName("wipro");
        company2.setCompanyLocation("Gachbowli");
        company2.setCompanyRating(4.0);

        Company company3 = new Company();
        company3.setCompanyName("Turbomodes");
        company3.setCompanyLocation("Gachbowli");
        company3.setCompanyRating(3.5);



        List<Company>list=new ArrayList<>();
         list.add(company1);
         list.add(company2);
         list.add(company3);

         for (int i=0; i< list.size(); i++){
             if (list.get(i).getCompanyRating()>=4.0){
                 System.out.println("Rating above 4.0:" + list.get(i).getCompanyName());
             }
         }
    }
}
