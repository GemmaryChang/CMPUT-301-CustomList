import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class countCitiesTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    public void testcountCities(){
        assertEquals(list.getCount(),list.countCities());
    }


}
