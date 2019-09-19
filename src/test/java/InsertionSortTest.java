import com.pereverzew.InsetionSort.InsertionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortTest {
    InsertionSort <Integer> sortInteger;
    InsertionSort <String> sortString;

    @Before
    public void init(){
        sortInteger= new InsertionSort<Integer>();
        sortString= new InsertionSort<String>();
    }

    @Test
    public void test_InsertionSort_Integer() {
        ArrayList<Integer> list= new ArrayList<Integer>((Arrays.asList(4,5,3,2,1)));
        ArrayList<Integer> result= new ArrayList<Integer>((Arrays.asList(1,2,3,4,5)));
        Assert.assertEquals(result, sortInteger.sort(list));
    }

    @Test
    public void test_InsertionSort_String() {
        ArrayList<String> list= new ArrayList<String>(Arrays.asList("Olya", "Alex","Petr", "Igor"));
        ArrayList<String> result= new ArrayList<String>(Arrays.asList("Alex","Igor","Olya" ,"Petr" ));
        Assert.assertEquals(result, sortString.sort(list));
    }
}
