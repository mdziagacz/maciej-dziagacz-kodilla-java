package WorldTestSuite;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country a = new Country("", new BigDecimal("1"));
        Country b = new Country("", new BigDecimal("1"));
        Country c = new Country("", new BigDecimal("1"));
        Country d = new Country("", new BigDecimal("1"));
        Country e = new Country("", new BigDecimal("1"));
        Country f = new Country("", new BigDecimal("1"));
        Country g = new Country("", new BigDecimal("1"));

        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        continent1.addCountry(a);
        continent1.addCountry(b);
        continent1.addCountry(c);
        continent1.addCountry(d);
        continent2.addCountry(e);
        continent2.addCountry(f);
        continent2.addCountry(g);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("7");
        Assert.assertEquals(expected, peopleQuantity);
    }
}
