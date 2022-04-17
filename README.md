<h2>Notes of the Java course</h2>

<h3>Structure</h3>

1. `package`: from root to particular folder
    - from domain name in reverse order. The more left the more detail
    - `import` should specify all path
    - // TODO(import static)
    - unit is a `class`
    - `class` consists of `method`/`function`
    - `method(method_parameters) {}`
    - kinds of variables:
        - instance var, static var, local var, parameter, argument
        - `static` is class variable, without - instance variable
    - `public` access modifier. There can be `private`, `default`, `protected`
    - `void` is to define that method has no return value
    - `query` methods: return value, but don't alter the state. `command` methods: alter the state, but don't return
    - `@` - annotation. I.e. @Test
    - Use `CamelCase`
    - `constructor` is a method for `class` to put parameters
    - variable declaration: `Car myPorsche`; object allocation: `Car myPorsche = new Car(1, 320);`
    - Java will find classes that are in the same package. However, other packages should be imported
    - If you have 2 classes with the same name, but from different packages => define full import path of the one
    - **Argument** is what we provide to a method when calling it

2. About modifiers:
    - `public` makes visible everywhere
    - without **any** word - `default` modifier: class can be used with other classes **only** within current package
    - Link to read: https://stackoverflow.com/a/215505/16543524
    - If you have variable of type `static` -> better to have method with `static` keyword as well
    - `final` - lock the variable and don't allow to modify it (aka `val` in Kotlin)

3. Arrays:
    - Person[] allPersons = Person[5];
    - `enum` is to put as many values as we want during creation:
        - Person[] anotherAllPersons = {"A", "B", null};
    - `static final` -> name variables in the following manner: **ALL_PERSONS_CONTAINER**
    - `enum class` is to allow access values, but we can't change them
    - `for(OurEnumClass currVar: OurEnumClass.values()) {}`
    - `enum clas` with `enum class` can be compared with `==`. Whilst strings: `equals()`
    - we can put values **inside** variable in `enum classes`. But we need to create\
      `private constructor` in this `enum class`
4. `==` for comparing if 2 objects point to the same object in the memory, whilst
   `equals()` is to compare content. `null.equals(someString)` will throw error,
   but if you reverse their position -> Okay
   # TODO: `hashcode()`
5. `switch(someVar)`: `case someState`. If you want to execute something in case
   none of the previous `case` matched -> `default`
6. char: string of length one. It uses single quotes: '' instead of "" in String

<h2>OCP Book notes</h2>

<h3>First chapter</h3>

1. methods in abstract class are to be **open**
2. `var` of two various strings is equal as String pool is used
3. If something is specified of super-type in the loop, you can't use
   sub-type when declaring value from that loop
4. module isn't allowed to have a `public` access modifier
5. `default` / `private` methods can be accessed only from the same package
6. JDK:
    2. `javac` converts `.java` to `.class`: bytecode (aka compiler)
    3. `java` launcher launches JVM
    4. `jar` to archive files
    5. `javadoc`to generate docs
7. JRE: subset of JDK to run program, but can't compile them
8. **LTS**: long term support
9. `/** **/` is javadoc comment & `/* */` is an ordinary comment
   multi-line comment. `//` is one-line comment
10. If a `main()` method isn’t present in the class we name with
    the `.java` executable, the process will throw an error and terminate.
    Even if a `main()` method is present, Java will throw an exception if it isn’t `static`
11. import conflicts: either useful declaration in class
    `    java.util.Date date;
    java.sql.Date sqlDate;`
    or:
    `import java.util.Date;
    import java.sql.*`
12. Also, you can run: ` java -cp classes chapter1/Zoo.java f f` without compiling first
13. create `jar` of all files in the **current dir**. Yeah, you need to enter the dir
14. full way to create byte code & run java:
    1. `javac chapter1/Learning.java`
    2. `java chapter1/Learning`

<h3>Second chapter</h3>

1 .multiple classes can be defined in the same file, but only one of them is allowed to be public
    - but class may have no `public` classes
2. `main()` is the entry point. If we have new class created inside `main` ->
   it'll be executed first and all the surrounding stuff. Then we'll come back to the `main`
3. Java has **primitives** & **reference** types
   1. primitives: boolean, byte, short, int, long, float, double, char
      - **char** & **short** are similar, but former is unsigned & latter is
   2. reference: refers to an object (an instance of a class)
      - primitives are in the memory, whilst reference - points to the object
        where it is in the memory. So, it saves memory address where the object
        is located: **pointer**
   3. We can't reassign to another type
   4. primitives **can't be** assigned to `null`, whilst reference can
   5. to use aka `lateinit` for primitives - use wrapper

4. Computers store numbers with floating-points in **scientific notation**, i.e. less precision
   A byte is 8 bits. A bit has two possible values. 2^8 is2×2=4×2=8×2=16×2=32×2=64× 2 = 128 × 2 = 256. 
   Since 0 needs to be included in the range, Java takes it away from the positive side
5. declaration & initialization of variables are two different things
6. `var` can be used instead of primitives & reference; you can’t leave `var` without specific 
   type when initializing, but you can do so with ordinary variables. We can assign `var` to `null` only after 
   initial initialization to some type.
   `local variable type inference`: in a constructor, method, or initializer block
7. `if` block is a scope of itself and is smaller than method scope -> can't use variable
   from `if` in the method
8. **Garbage collector**: all objects are stored in heap => **collector** frees memory from the heap
    When object is no longer being accessible to program -> eligible for GC
9. `System.gc();` is to call GC by hand. But JVM is free to ignore it
10. What does it mean "object is no longer reachable"?
    * The object no longer has any references pointing to it
    * All references to the object have gone out of scope
11. Difference between **object** & **reference**

<h3>Third chapter</h3>

1. `operand`: variable/value the operator is being applied to. `operator`: action itself, i.e. `+`
2. 3 types of operators: unary, binary, ternary
3. numeric promotion rules:
   * two values of different types promote to the larger value
   * int + float => float + float
   * byte/short/char are promoted to `int` if binary operator are applied to them
   * to make long, specify L or l after the num
   # TODO: mention float issue in notes 4th point
4. Convert data from larger to smaller type (it is usually used). Casting - unary
5. Overflow: when value is beyond the scope of the data type => system wraps multiple times
    Underflow: when value is not enough -> it goes back to the maximum value and continues from there

6. Compound assignment operators have **casting** inside them: *=; += etc
7. Equality operators: 
   * `==` on primitives: if the same value; on objects: if reference the same object in the heap
   * `!=` logic is the same as with `==`
8. Relational operators: `<`, `>=` etc. Pay attention: a `instanceOf` b 
   * `null` instance of SomeType -> false. But vice versa is **Error**
9. ternary: `boolExpr ? expr1 : expr2`

<h3>Fourth chapter</h3>

1. `switch` statements can be applied to some primitives & wrappers, but not
   to Objects. Not allowed: boolean, long, float, double. 
   Allowed:
      * `enum`
      * `String`
      * `var`
      * `char` & `Character`
      * `short` & `Short`
      * `byte` & `Byte`
      * `int` & `Integer`

2. If `default` is positioned not at the last position: it'll be still executed
   only if no other case was matched
3. `switch` statements have auto-casting, but can give compile errors if JVM cast to lower type
4. `do-loop`: it will execute body at least ones before checking `while` condition. But `while`
   will evaluate at first and then move. But you can add additional `if` before `do` to convert loop
5. Convention for using vars in loop: `i`, `j`, `k`
6.  You can't re-assign upper variable to variable in loop
```
      int x = 0;
      for(long y = 0, z = 0; y < 5 && x < 8; y++, x++) {
      System.out.println(y);
      }
```
   You can't use various types in the loop
   
7. You can modify **iterator** of a loop inside loop
8. `for-each` loop is accessible in collections
9. Use **labels** for fine-grained loop:
   * PARENT_LOOP: for(int i=0; i < 5; i++) // look in chapter4/LoopClass/loopWithLabel
10. Also use **labels** for `while` loop

<h3>Fifth chapter</h3>

1. We don't need `new` to instantiate String
2. String implements `CharSequence` interface
3. Concatenation is left to right
4. String is immutable, hence you can't use +/concat on the same variable, only new one
5. Useful methods for Strings:
   * length()
   * charAt()
   * indexOf()
   * substring() // end is exclusive
   * toLowerCase() / toUpperCase()
   * equals() / equalsIgnoreCase()
   * startsWith() / endsWith()
   * replace()
   * contains()
   * strip() / trim() / stripLeading() / stripTrailing()
     * `\t` is a single character
   * intern()
6. As each time we apply `+=` to String, it's recreated & **Garbage Collector** deletes
   old string. It's inefficient => use **StringBuilder**. It uses the same object
7. StringBuilder methods:
   * charAt() / indexOf() / length() / substring() - same as with String
     * substring on StringBuilder returns String
   * append()
   * insert()
   * delete() / deleteCharAt() // from idx to idx exclusive
     * PS: if you specify something that is past the largest element -> won't be error, just remove till last
   * replace() // allows to specify the second which is past the length
   * reverse()
   * toString() // if you need to pass result where String is expected
8. **String pool**: place in JVM where it collects all strings
   * creates at runtime -> if 2 strings are different at start, but then
     made similar -> still different in **Pool**
   * two different variables of similar String content -> Similar as **String Pool**
   * `new String()` will also create a separate object **NOT** in the `String Pool`
   * `new String().intern()`: will check if such string already in String Pool

9.` int[]`: type of array & array symbol; `new int[3]` new array & size 
10. Anonymous array: `{}`
11. To print content of array: `Arrays.toString(somerray)`; to sort: `Arrays.sort(someArray)`
12. About comparator:
   * -1: first array is smaller
   * 0: both arrays are similar
   * 1: first array is larger
     * **Important**: it compares not only size, but values inside as well. Rule is the same
13. mismatch():
   * similar arrays: -1
   * different arrays: zero/positive arrays
14. 1D arrays, 2D arrays
15. ArrayList:
    * can be of some size
    * can be without any size
16. `ArrayList` implements `List` interface & has `toString()` method (while `List` doesn't)
   * add()
   * remove()
   * set()
   * isEmpty() / size()
   * clear()
   * contains()
   * equals()
17. wrappers for primitives: Integer, Boolean etc
    * valueOf() is to convert String into wrapper
    * parseBoolean, parse...() to convert Strigng into primitive
18. Autoboxing & Unboxing
    * autoboxing: from primitive to wrapper
    * unboxing: from wrapper to primitive
19. List & Array Conversion:
    * we can convert from list to array: `toArray()`
    * **Be careful**: when converting from array to list -> they're linked: `Arrays.asList(someArray)`
    * If you want to have unlinked & **immutable** list: `List.of(array)`

    * None of the options allow you to change the size of the list. If you need, use `ArrayList`
20. To sort ArrayList: `Collections.sort()`
21. There are 2 variants of set: **HashSet** & **TreeSet**
    * get()
    * getOrDefault();
    * put()
    * remove() // returns value to a key
    * containsKey()
    * containsValue()
    * keySet()
    * values()
22. Use varargs to create list in another way:
    * Arrays.asList("one", "two") // mutable inside
    * List.of("One", "two") // totally immutable

<h3>Sixth chapter</h3>

1. Functional programming is a whole approach
2. **Lambdas** are used with SAM: single abstract method
3. 4 **functional interfaces**:
   * predicate
   * consumer
   * supplier
   * comparator
   * PS: look at package with 6th index
4. 3 places where Java can be used:
   * parameter list
   * local variables inside lambda body
   * variables referenced from the lambda body
5. Rules for accessing a variable from a lambda body:
   * instance: allowed
   * static: allowed
   * local: allowed if final
   * method param: allowed if final
   * lambda param: allowed
6. Lambda APIs:
   * removeIf()
   * sort()
   * forEach()

<h3>Seventh chapter</h3>

1. access modifiers:
    * private: only from within the same class
    * default: from classes in the same package
    * protected: classes from the same package or subclasses + through inheritance in another package
    * public: from any class can be called
2. Optional specifiers:
   * static
   * abstract
   * final
   * synchronized
   * native: when interacting with code in another language
   * strictfp
3. varargs:
   * you can pass: nothing, one, many, array
   * varargs must be the last parameter (you can't place it in the beginning)
   * PS: if you pass `null` in the `varargs`, then it'll throw an error
   * `(int... nums)` is an example
4. Pay attention to `chapter7/swan/Swan`
5. `static`: 
   * for class methods & variables
     * PS: if you have:
       * `SomeClass k = Koala();`
       * `k = null;` // still can reference Koala static variables
6. We can't reassign final, but we can add values to it, if `final` is an array
7. `static {}` is an initializer, like instance `{}`
8. static imports are for importing static members, ordinary imports - for classes
9. Java is a **pass-by-value** language
   * but rule with **aggregates** works the same as in Kotlin || Python
   * recall **pass-by-value** & **pass-by-reference**
10. overloading methods: methods have the same name, but different signatures
    * difference should occur in **parameters**, not simply in **return type**
    * Java will pick the most precise version -> autoboxing, \
      String/Object methods can be written, Java will separate them
    * PS: Java will convert to **wider** type, not **narrower**:
      * int will be passed to long, but long won't be passed to int
    * Due to **type erasure**, you can't have 2 same methods with List,
      where sub-type differs. But can with array:
      * Good: `public static void methodArrayOne(int[] nums) & public static void methodArrayOne(Integer[] nums)`
      * Bad: `public static void methodListOne(List<String> nums) & public static void methodListOne(List<Integer> num)`
11. Order for overloading:
    * exact match by type
    * wider type
    * Autoboxed type
    * varargs

<h3>Eight chapter</h3>

1. Subclasses **can** have access to `public` & `protected` variables of the parent
2. if class marked `final`, it'll prevent it from being inherited
3. `Object` is a class which serves as a parent to class which doesn't inherit from any other
4. we can assign to **properties** of _parent_ class from _child_
5. **Pay attention:**

```bash
    public void setColor(String color) {
        color = color; // will assign to the `color` in this scope
        this.color = color; // will assign to the instance variable
   }
```

6. Again, recall that **primitives** in class **instance variables** (not only here) \
   will hold default values if not assigned;
7. use `super` to call methods/variables on parent class. Look `Mammal/Bat`
8. **IMPORTANT**: `this` will navigate to the closest scope. But if **no** in the current class -> go to **parent**
9. You can't put `var` in the constructor as with methods
10. As with methods, there is **constructor overloading** as well
11. `private` constructor:
    * prevents compiler from providing **default no-argument** constructor
    * `static` methods in the class have access to it
12. `this` refers to instance of the class (local or parent); 
    `this()` refers to constructor within the class
    * **compiler** will detect if one _constructor_ calls another
    * use `this()` to exclude duplication in constructors
13. `super` refers to the constructor in the parent
14. We can refer to multiple **parent** constructors from child due
    to constructor **overloading** 
    * see `chapter 8/SuperConstructor/Animal.java`
15. first line in every class is call to either `this()` or `super()` even if we don't
    insert it in the class
    * Excerpt from the book: Remember, the first line of every constructor is a call to 
      `this()` or `super()`, and if omitted, the compiler will automatically insert a call
      to the parent no-argument constructor `super()`
16. `final` instance variables **must** be initialized in: a) constructor b) initializer
    * each **constructor** is a separate instance
    * **BUT**: if some `final` variable is assigned in initializer before constructor
      => constructor can't redefine it
17 Order of initialization:
    1. Initialize Class:
    * parent classes if exist (the following will happen in parent of exist, then in child)
    * `static` variables
    * `static` initializers
    * `main()` if method is called
    
    2. Initialize Instance:
    * initialize the instance of Y first : initialize parent class with all the written down things there at first
    * initialize all instance variables
    * process all instance initializers
    * initialize constructor with `this()` if exists

17. we can access `private` fields of parent through inheritance: explore `Fish` package
18. When overriding method, the following rules are to be considered:
    * child method has the same **signature**: params & name. **NOT RETURN TYPE**
    * at least as accessible as parent method **(broader is ok, but narrower - NO)**
    * checked exception mustn't be broader **(only checked, for ordinary doesn't apply)**
    * return value must be of the same type or subtype: `covariant`
19. `covariant`: return value is of the same type or sub-type
20. **Type erasure** during **overriding**:
    * must be of same type: not in parent `List<Object>` & `List<Double>` in child
    * however, in overloading like `List` & `ArrayList` it does work
21. If you reassign your object to the parent/interface, you can lose some methods/instances
    * **cast** from super-type to sub-type: if object is unrelated -> cast error at **runtime**
    * but it applies only to `classes`, not `interfaces` # TODO: revisit here