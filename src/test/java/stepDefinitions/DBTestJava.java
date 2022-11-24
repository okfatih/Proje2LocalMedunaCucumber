package stepDefinitions;

import org.junit.Test;
import utilities.DataBaseUtility;
import utilities.WriteToTxt;

import java.util.List;

public class DBTestJava {
    @Test
    public void test(){
        DataBaseUtility.createConnection();


        //Sütün isimlerini alır
        String query = "select * from physician";
        System.out.println(DataBaseUtility.getColumnNames(query));

        //Kendi basit kodum
        List<String> columnAdlari = DataBaseUtility.getColumnNames(query);
      //  System.out.println("columnAdlari = " + columnAdlari);


        //ID'lere ulaşmak ve kaydetmek

         List<Object>idLists = DataBaseUtility.getColumnData(query,"id");
        System.out.println("idLists = " + idLists + "\n");

        String fileName1 ="src/test/resources/testdata/DoktorID.txt";
        WriteToTxt.savePhysicianIds(fileName1,idLists);


        //ID leri doğrulama









    }

}
