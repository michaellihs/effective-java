Code Examples from "Effective Java"
===================================

This repository contains some code samples from the book "Effective Java".


Table of Contents
-----------------

| Example  | Description  |
| ---------|------------- |
| Item 1: [Static Factory Methods](src/main/java/ch/lihsmi/effectivejava/chapter1/item1/NamedConstructor.java) | Use a static factory method instead of constructor to make intend clearer |
| Item 1: [Re-use Objects in Factory Methods](src/main/java/ch/lihsmi/effectivejava/chapter1/item1/Colors.java) | Do not re-create objects each time a factory method is invoked |
| Item 1: [Return of Subtypes](src/main/java/ch/lihsmi/effectivejava/chapter1/item1/Subtypes.java) | Make Factory Method return a Subtype of its Return Type |
| Item 2: [Builder](src/main/java/ch/lihsmi/effectivejava/chapter1/item2/ProductWithManyConstructorParameters.java) | Use a builder when confronted with many constructor parameters |
| Item 3: [Singleton with Public Field](src/main/java/ch/lihsmi/effectivejava/chapter1/item3/SingletonInstance.java) | Implement a Singleton with a public static field |
| Item 3: [Singleton with Static Factory](src/main/java/ch/lihsmi/effectivejava/chapter1/item3/SingletonWithStaticFactory.java) | Implement a Singleton using a Static Factory Method |
| Item 3: [Singleton with Enum](src/main/java/ch/lihsmi/effectivejava/chapter1/item3/SingletonWithEnum.java) | Implement a Singleton using an Enum |
| Item 4: [Non-Instantiable Classes](src/main/java/ch/lihsmi/effectivejava/chapter1/item4/NoninstantiableUtilityClass.java) | Prevent classes from being instantiated with private constructor |
| Item 5: [Unnecessary Objects](src/main/java/ch/lihsmi/effectivejava/chapter1/item5/UnnecessaryObjects.java) | Avoid creation of unnecessary objects |
| Item 6: [Obsolete Object References](src/main/java/ch/lihsmi/effectivejava/chapter1/item6/MemoryEffectiveStack.java) | Eliminate obsolete Object References |
| Item 7: [Avoid Finalizers](src/main/java/ch/lihsmi/effectivejava/chapter1/item7/ExplicitTermination.java) | Use explicit Termination instead of Finalizers |


Run the tests
-------------

For running the tests, use

    mvn test
