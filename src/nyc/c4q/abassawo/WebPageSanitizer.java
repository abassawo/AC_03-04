package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/3/15.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebPageSanitizer {

    public static void main(String[] args) {

        System.out.println(sanitize("http://help.websiteos.com/websiteos/example_of_a_simple_html_page.htm"));
    }


    public static String sanitize(String html) {
        //html = HTTP.get (       stringToURL(html)    );

        URL site = HTTP.stringToURL(html);
        String newString = HTTP.get(site);

        //stringtoURL method 1st. Then retrieve web content.
        //System.out.println("Original:\n" + newString); //test

        System.out.println("\n" + "test" + "\n");

        while (newString.indexOf("<script") != -1) {
            int scriptStart = newString.indexOf("<script");
            int scriptEnd = newString.indexOf("</script>", scriptStart) + 9;
            String scriptDel = newString.substring(scriptStart, scriptEnd); //Final script to be eliminated.

            newString = newString.replace(scriptDel, "");
        }
        //System.out.println("new");
        return newString;
    }
}
