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
        Country a = new Country("", new BigDecimal("100000000000000000000"));
        Country b = new Country("", new BigDecimal("200000000000000000000"));
        Country c = new Country("", new BigDecimal("300000000000000000000"));
        Country d = new Country("", new BigDecimal("400000000000000000000"));
        Country e = new Country("", new BigDecimal("500000000000000000000"));
        Country f = new Country("", new BigDecimal("600000000000000000000"));
        Country g = new Country("", new BigDecimal("700000000000000000000"));

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
        BigDecimal expected = new BigDecimal("2800000000000000000000");
        Assert.assertEquals(expected, peopleQuantity);
    }
}
