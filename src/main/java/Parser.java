/**
 * Created by brianmullin on 5/31/17.
 */

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// regex for splitting key:value [;^%*!@]
// regex for name [nN][aA][mM][eE]
// regex for milk [mM][iI][lL][kK]
// regex for apples [aA][pP][pP][lL][eE][sS]
// regex for bread [bB][rR][eE][aA][dD]
// regex for cookies [cC][oO0][oO0][kK][iI][eE][sS]
// regex for price [pP][rR][iI][cC][eE]
// regex for 0.00 [0-9][.][0-9][0-9]
// regex for type [tT][yY][pP][eE]
// regex for food [fF][oO0][oO0][dD]
// regex for expiration [eE][xX][pP][iI][rR][aA][tT][iI][oO][nN]
// regex for date [0-9][/][0-9][0-9][/][0-9][0-9][0-9][0-9]

public class Parser {



    public static ArrayList<String> breakLines(String rawString){ //breaks file into lines of info

        ArrayList<String> splitLines = new ArrayList<String>();
        String[] linesArray = rawString.split("[##]");

        for(String str: linesArray){

            splitLines.add(str);
        }

        return splitLines;




    }

    public ArrayList breakPair(){
    }

    public Map storeKeyValues(){}



}
