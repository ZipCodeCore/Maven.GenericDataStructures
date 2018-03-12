import ArrayListCombiner.ArrayListCombinerTest;
import MapFunc.MapFuncTest;
import Pair.ArraysTest;
import Pair.PairTest;
import StackArray.GenericStackTest;
import StackArray.ObjectStackTest;
import StackArrayList.StackTest;
import Swap.SwapTest;
import Table.TableTest;
import TableNested.TableNestedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayListCombinerTest.class, MapFuncTest.class, ArraysTest.class, PairTest.class, GenericStackTest.class,
        ObjectStackTest.class, StackTest.class, SwapTest.class, TableTest.class, TableNestedTest.class
})
public class TestSuite {
}
