import static org.junit.Assert.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class hasCityTest {
    private CustomList list;
    @Before
    void createCityList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    void testhasCity(){
        City city = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCities(city));
    }
}


