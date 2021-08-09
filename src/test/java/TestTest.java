import lesson14.chekArr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestTest {

    public static Stream<Arguments> chekFour1()

    {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 2, 3}, new int[]{1, 4, 1, 2, 3}));
        list.add(Arguments.arguments(new int[]{1, 2, 2}, new int[]{1, 4, 1, 2, 2}));
        list.add(Arguments.arguments(new int[]{1, 2, 6}, new int[]{1, 4, 1, 2, 6}));
        list.add(Arguments.arguments(new int[]{ }, new int[]{1, 4}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("chekFour1")
    public void massTestFour(int[] arr, int[] arr1) {
        Assertions.assertArrayEquals(arr, chekArr.chekFour(arr1));
    }

    @Test
    public void testException() {
        Assertions.assertThrows(RuntimeException.class, () -> chekArr.chekFour(new int[]{5,6}));
    }


    @Test
    public void testBoolean(){
        Assertions.assertFalse(chekArr.chekOneAndFour(new int[] {5,6,5}));
        Assertions.assertTrue(chekArr.chekOneAndFour(new int[] {1,4,1}));
    }

    @Test
    @Disabled(" метод на доработке")
    public void testBoolean2(){
        Assertions.assertFalse(chekArr.chekOneAndFour(new int[] {4,4,4}));
    }
}

