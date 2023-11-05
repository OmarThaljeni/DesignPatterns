# Design Patterns in Java

It contains Java examples for all classic GoF design patterns.

# Creational Design Patterns

Creational design patterns provide solutions to instantiate an Object in the best possible way for specific situations.


- Singleton Pattern: The singleton pattern restricts the instantiation of a Class and ensures that only one instance of the class exists in the Java Virtual Machine. The implementation of the singleton pattern has always been a controversial topic among developers.

- Factory Pattern: The factory design pattern is used when we have a superclass with multiple subclasses and based on input, we need to return one of the subclasses. This pattern takes out the responsibility of the instantiation of a Class from the client program to the factory class. We can apply a singleton pattern on the factory class or make the factory method static.

- Abstract Factory Pattern: The factory design pattern is used when we have a superclass with multiple subclasses and based on input, we need to return one of the subclasses. This pattern takes out the responsibility of the instantiation of a Class from the client program to the factory class. We can apply a singleton pattern on the factory class or make the factory method static.

- Builder Pattern: The builder pattern was introduced to solve some of the problems with factory and abstract Factory design patterns when the object contains a lot of attributes. This pattern solves the issue with a large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.

- Prototype Pattern: The prototype pattern is used when the Object creation is costly and requires a lot of time and resources, and you have a similar Object already existing. So this pattern provides a mechanism to copy the original Object to a new Object and then modify it according to our needs. This pattern uses Java cloning to copy the Object. The prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However, whether to use the shallow or deep copy of the object properties depends on the requirements and is a design decision.






