
package nyc.c4q.abassawo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;


/**
 * Distribution Calculator Assignment:
 * Created by c4q-Abass on 4/3/15.
 */
public class DistributionCalculator {

    public static void main(String[] args) throws FileNotFoundException {
        String txtPath = "/Users/c4q-Abass/Desktop/accesscode/AC_04-03/src/nyc/c4q/abassawo/Resources/nevermarry.txt";
        File txtFile = new File(txtPath);

        ArrayList<String> pctArrayList = calculate(txtFile);;
        //System.out.println(calculate(txtFile));

       for (String line : pctArrayList){
           System.out.println(line);
       }
    }

    public static String distributionText(char letter, String text) {
        DecimalFormat df = new DecimalFormat("#.00");
        int ltrCount = 0;
        String distributionText = null;
        int totalCount = 0;
        double percentage;

        for (int i = 0; i < text.length() - 1; i++) {
            totalCount++; //every single letter
            percentage = (double) ltrCount / totalCount * 100;
            String pctOutput = df.format(percentage);
            if (letter == text.charAt(i)) {
                ltrCount++;
            }
            distributionText = (letter + " : " + pctOutput + "%");
        }
        return distributionText;
    }


    public static ArrayList<String> calculate(File textFile) throws FileNotFoundException {
        Scanner scan = new Scanner(textFile);
        String txt = "";
        ArrayList<String> pctArrayList = new ArrayList<String>();

        while (scan.hasNext()) {
            txt += scan.next();   //adds each line to txt String.
        }
        //System.out.println(txt); testcode.

        for (char x = 'a'; x <= 'z'; x++) {
            pctArrayList.add(distributionText(x, txt));
        }
        return pctArrayList;

    }

}