package sec02.verify.exam01;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src/sec02/verify/exam01/AddLineNumberExample.java";
        FileReader fir = new FileReader(filePath);
        BufferedReader bfr = new BufferedReader(fir);

        int rowNumber = 0;
        String rowData;
        while ((rowData= bfr.readLine()) != null) {
            System.out.println(++rowNumber + ": " + rowData);
        }

        bfr.close();


    }
}
