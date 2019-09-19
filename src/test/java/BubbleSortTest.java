import com.pereverzew.BubbleSort.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortTest {
    BubbleSort <Integer>bubbleSortInt;
    BubbleSort <String>bubbleSortStr;

    @Before
    public void init(){
        bubbleSortInt= new BubbleSort();
        bubbleSortStr= new BubbleSort();
    }

    @Test
    public void test_BubbleSort_Integer(){
        ArrayList<Integer> array= new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        ArrayList<Integer> result= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Assert.assertEquals(result,bubbleSortInt.sort(array));
    }

    @Test
    public void test_BubbleSort_String() {
        ArrayList<String> array= new ArrayList<String>(Arrays.asList("Olya","Tanya","Alex","Oleg"));
        ArrayList<String> result= new ArrayList<String>(Arrays.asList("Alex","Oleg","Olya","Tanya"));
        Assert.assertEquals(result, bubbleSortStr.sort(array));
    }
}
