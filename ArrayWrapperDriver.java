public class ArrayWrapperDriver {
    public static void main(String[] args) {
        ArrayWrapper<String> words = new ArrayWrapper<>();
        System.out.println(words); // []
        words.add("Foo");
        System.out.println(words); // [Foo]
        String[] moreWords = {"Bar", "Car"};
        words.addAll(moreWords);
        System.out.println(words); // [Foo, Bar, Car]
        System.out.println(words.remove("Bar")); // true
        System.out.println(words); // [Foo, Car]
        System.out.println(words.removeAll(moreWords)); // true
        System.out.println(words); // [Foo]
        System.out.println(words.contains("Foo")); // true
        System.out.println(words.contains("Car")); // false
        System.out.println(words.remove("Foo")); // true
        System.out.println(words.size()); // 0
        System.out.println(words.capacity()); // 5
        for (int i = 0; i < 7; i++) {
            words.add("Foo");
        }
        System.out.println(words); // [Foo, Foo, Foo, Foo, Foo, Foo, Foo]
        System.out.println(words.size()); // 7
        System.out.println(words.capacity()); // 10
        words.clear();
        System.out.println(words.size()); // 0
        System.out.println(words.capacity()); // 5
        System.out.println(words.isEmpty()); // true
        words.add("Bar");
        System.out.println(words.isEmpty()); // false
        System.out.println(words.get(0)); // Bar
        System.out.println(words.get(1)); // null

    }
}