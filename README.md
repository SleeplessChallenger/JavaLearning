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
    - without **any** word - `deafult` modifier: class can be used with other classes **only** within current package
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




