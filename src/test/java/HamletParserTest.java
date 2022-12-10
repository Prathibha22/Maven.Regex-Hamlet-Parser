import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }
    @Test
    public void testFindHamlet() {
        //Given
        int expectedCount=472;
        //When
        HamletParser objHamletParser=new HamletParser();
        int actualCount=objHamletParser.findHamlet(hamletText);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given
        int expectedCount=0;
        //When
        HamletParser objHamletParser=new HamletParser();
        String modified=objHamletParser.changeHamletToLeon(hamletText);
        int actualCount=objHamletParser.findHamlet(modified);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        int expectedCount=0;
        //When
        HamletParser objHamletParser=new HamletParser();
        String modified=objHamletParser.changeHoratioToTariq(hamletText);
        int actualCount=objHamletParser.findHamlet(modified);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testFindHoratio() {
        //Given
        int expectedCount=158;
        //When
        HamletParser objHamletParser=new HamletParser();
        int actualCount=objHamletParser.findHoratio(hamletText);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }


}