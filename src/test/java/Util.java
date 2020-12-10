import java.util.*;

/*
DO NOT CHANGE
 */

public class Util {
    public static Map<String, List<List<Integer>>> getIndexForIndexerTest() {
        Map<String, List<List<Integer>>> index = new HashMap<String, List<List<Integer>>>() {{
            put("world", new ArrayList<>(
                    Arrays.asList(
                            // "world" appears in doc 0 at location 0,1,3
                            new ArrayList<>(Arrays.asList(0, 1, 3)),
                            // "world" appears in doc 1 at location 0,1
                            new ArrayList<>(Arrays.asList(0, 1)),
                            new ArrayList<>(Arrays.asList(0, 4)),
                            new ArrayList<>(Arrays.asList(2)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
            put("hello", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(Arrays.asList(2)),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(2)),
                            new ArrayList<>(Arrays.asList(1)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
            put("hallo", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(2)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
            put("seattle", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(1)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
            put("abc", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(3)),
                            new ArrayList<>(Arrays.asList(0)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
            put("fun", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(3)),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(0, 2)),
                            new ArrayList<>(Arrays.asList(2))
                    ))
            );
            put("sunny", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(0)),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(1))
                    ))
            );
            put("day", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(5)),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(1)),
                            new ArrayList<>(Arrays.asList(0))
                    ))
            );
            put("better", new ArrayList<>(
                    Arrays.asList(
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>(Arrays.asList(1)),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ))
            );
        }};
        return index;
    }

    public static List<String> getDocumentsForIntTest() {
        return new ArrayList<>(
                Arrays.asList(
                        "say hello world like you mean hello world not just world",
                        "hello world",
                        "hello",
                        "world",
                        "world world hello",
                        "world seattle rains hello abc world",
                        "sunday hello world fun",
                        " the new macbook is  awesome  "
                )
        );
    }
    public static List<String> getDocumentsForIntTestExtraCredit() {
        return new ArrayList<>(
                Arrays.asList(
                        "the car is yellow",
                        "today is thursday",
                        "hi",
                        "hi how are you yellow",
                        "thursday yellow thursday car today"
        ));
    }

    public static List<Integer> emptyResult() {
        return new ArrayList<>();
    }

}