import io.github.stepio.jgforms.Configuration;
import io.github.stepio.jgforms.Submitter;
import io.github.stepio.jgforms.answer.Builder;
import io.github.stepio.jgforms.exception.NotSubmittedException;
import io.github.stepio.jgforms.question.MetaData;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public enum MyForm implements MetaData {

    GENDER(1702524847L),
    MARTIAL(22024491L),
    DEPT(2073106199L),
    AGE(110113770);


    public static void updateForm(String gender, String marital, String dept, String age){
        try {
            URL url = Builder.formKey("1FAIpQLSdRBJgj1leoOnh8feQGteqZPQT3CglUBYnReqDrJqxxNGrrLA")
                    .put(GENDER, gender)
                    .put(MARTIAL, marital)
                    .put(DEPT, dept)
                    .put(AGE, age)
                    .toUrl();
            System.out.println(url);
            Submitter submitter = new Submitter(new Configuration());
            try {
                submitter.submitForm(url);
                System.out.println("Submitted form");
            } catch (NotSubmittedException ex) {
                // TODO: log & handle the exception properly
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\ashan\\Development\\eclipse-workspace\\form\\src\\main\\resources\\config.tbl");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String datamap[] = data.split("\\|");
                System.out.println("Inserting data to form: " + datamap[0]);
                //updateForm(datamap[0], datamap[1], datamap[2], datamap[3]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private long id;
    MyForm(long id){
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void setId(long id){
        this.id = id;
    }
}
