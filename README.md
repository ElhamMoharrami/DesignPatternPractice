# Design pattern guide

there are a total of three types of design patterns

[creational](#creational-design-patterns)

[structural](#structural-design-patterns)

[behavioral](#behavioral-design-patterns)

## creational-design-patterns

+ ### builder

#### when we might need to use builder design pattern?
When creating objects with many optional parameters that can result in a large number of constructor overloads

When the object being created is complex and requires a step-by-step process to set its properties

When the object's properties need to be immutable after creation

When there is a need for consistency and standardization in the creation of objects with multiple parameters

#### what are the pros of builder design pattern?

Allows for the creation of complex objects with many optional parameters in a more readable and maintainable way

Ensures that the ordering of parameters does not affect object creation, as each parameter is explicitly set by the builder

Facilitates the creation of immutable objects by setting parameters once during object construction

Encourages consistency and standardization in object creation by providing a clear and consistent interface for building objects

#### what are the cons of builder design pattern?
Boilerplate Code: Implementing a builder class can introduce additional code, which might be seen as a boilerplate, especially for classes with many attributes.

Complexity: For simple objects with few attributes, using the Builder Pattern might be overkill and add unnecessary complexity to the code.

Incompatibility with Constructor Injection: If you rely heavily on constructor injection for dependency injection, the Builder Pattern might not integrate well with that approach.
#### example:
the problem: Consider a scenario where we have a Person class with multiple attributes and we want to create instances of this class with different combinations of attributes.
you can find the implementation under creational.builder
+ ### factory method

+ ### abstract factory

+ ### prototype

+ ### singleton

+ ### object pool

## structural-design-patterns

## behavioral-design-patterns

