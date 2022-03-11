import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class deleteCityTest {
    private CustomList list;
    @Before
    public void createCityList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void testDelete() {
        City city = new City("edmonton", "Alberta");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.getCities().contains(city));
    }


}
