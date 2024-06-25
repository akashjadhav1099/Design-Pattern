# Design-Pattern

Design patterns are the well provided solution of commonly occurring problems in software design.
Design patterns represent an idea.

Categorization Design Pattern:-
  1. Creational Desing Pattern
         Factory Pattern, Builder Pattern, Singleton Pattern
  2. Structural Design Pattern
         Proxy Pattern, Adaptor Pattern
  3. Behavioural Design Pattern
         Observer Pattern, State Pattern, Iterator Pattern


Factory Design Pattern:-
  1. When There is SuperClass and multiple subclasses and we want to get object of subclasses based on input and requirement.
  2. Then we create factory class which takes the responsibilty of creating object of class based on input.
  3. Advantages:
    1. Focus on creating object for interface rather than implementation.
    2. Loose coupling. more robust code.


Builder Design Pattern:-
  1. Used by Lombok internally to build objects.
  2. While creating object when object contain many attributes, there are many problem exist:
    1. We have to pass many argumemnts to create object.
    2. some parameter might be optional.
    3. Factory class takes all responsibility for creating object. If the object is heavy then all complexity is the part of factory class.
  3. so, builder pattern create object step by step amd finally return final object with desired value of attributes.

