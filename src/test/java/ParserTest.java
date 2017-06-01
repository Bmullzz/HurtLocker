/**
 * Created by brianmullin on 6/1/17.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class ParserTest {

    Parser parser;
    @Before
    public void setup() {
        parser = new Parser();
    }

    @Test
    public void breakLinesTest(){
        //Given
        String given = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##" +
                "NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##" +
                "naMe:;price:3.23;type:Food;expiration:1/04/2016##";

        String[] expectedArray = {"naMe:Milk;price:3.23;type:Food;expiration:1/25/2016",
                "NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016",
                "naMe:;price:3.23;type:Food;expiration:1/04/2016"};

        String givenString = expectedArray[2];

        //When
        String[] actualArray = parser.breakLines(given);
        String actualString = actualArray[2];

        //Then
        Assert.assertEquals("The two arrays should be equal", actualString, givenString);


    }

}
