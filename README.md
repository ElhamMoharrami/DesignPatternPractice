# Design pattern guide

there are a total of three types of design patterns

- [creational](#creational-design-patterns)
  + [builder](#builder)
  + [Factory Method](#Factory_method)

[structural](#structural-design-patterns)

[behavioral](#behavioral-design-patterns)

## creational-design-patterns

### builder
Use the Builder design pattern when you need to construct complex objects step-by-step, allowing for flexibility and customization in the construction process, while separating the construction logic from the representation of the object.
#### when we might need to use builder design pattern?
+ When creating objects with many optional parameters that can result in a large number of constructor overloads

+ When the object being created is complex and requires a step-by-step process to set its properties

+ When the object's properties need to be immutable after creation

+ When there is a need for consistency and standardization in the creation of objects with multiple parameters

#### what are some of the scenarios where you could use builder design pattern?

+ Creating complex database queries: When you need to create complex database queries that involve multiple tables, joins, and conditions, and you want to provide a way for the client code to customize the query creation process.

+ Building software configurations: When you need to create software configurations that involve multiple components, such as settings, plugins, and modules, and you want to provide a way for the client code to customize the configuration creation process.

+ Creating complex data structures: When you need to create complex data structures, such as graphs or trees, and you want to provide a way for the client code to customize the data structure creation process.

+ Handling complex object serialization: When you need to serialize complex objects that involve multiple dependencies, and you want to provide a way for the client code to customize the serialization process.

+ Creating complex reports or documents: When you need to create complex reports or documents that involve multiple sections, tables, and layouts, and you want to provide a way for the client code to customize the report creation process.

#### what are the pros of builder design pattern?

+ Flexibility: It allows for easy modification of the construction process by adding or removing steps, without affecting the client code.

+ Separation of Concerns: It separates the construction of complex objects from their representation, allowing for a clear separation of concerns.

+ Improved Readability: It makes the code more readable by providing a clear and concise way to construct complex objects.

+ Reduced Coupling: It reduces coupling between the object being constructed and the code that is using it, making it easier to change or replace the object.

+ Easier Testing: It makes it easier to test the object being constructed by providing a way to create a test object that can be used in isolation.

+ Better Error Handling: It provides a way to handle errors that occur during the construction process, making it easier to handle complex error scenarios.

+ Improved Code Reusability: It allows for reusable code, as the same builder can be used to create different types of objects.

+ Simplified Code Maintenance: It makes it easier to maintain and update the code, as changes to the construction process can be made in one place without affecting the rest of the code.

#### what are the cons of builder design pattern?
+ Boilerplate Code: Implementing a builder class can introduce additional code, which might be seen as a boilerplate, especially for classes with many attributes.

+ Complexity: For simple objects with few attributes, using the Builder Pattern might be overkill and add unnecessary complexity to the code.

+ Incompatibility with Constructor Injection: If you rely heavily on constructor injection for dependency injection, the Builder Pattern might not integrate well with that approach.
#### example:
the problem: Consider a scenario where we have a Person class with multiple attributes and we want to create instances of this class with different combinations of attributes.
you can find the implementation under creational.builder
### factory method
Use the Factory Method design pattern when you need to provide a common interface for creating objects, but also allow for subclasses to define their own concrete implementation of the creation process.
#### when we might need to use factory method design pattern?
+ Decouple the creation of objects from the clients: When you have a client code that needs to create objects, but you want to decouple the object creation process from the client code. The Factory Method pattern allows you to create objects without exposing the client code to the specific implementation details.

+ Support multiple types of objects: When you have multiple types of objects that need to be created, and you want to provide a way to create these objects without hardcoding the specific types in the client code.

+ Provide a way to extend the object creation process: When you want to allow new object creation mechanisms to be added without modifying the existing client code. The Factory Method pattern allows you to add new concrete classes without changing the client code.

+ Handle object creation in a complex or dynamic environment: When the object creation process is complex, involves multiple steps, or depends on external factors, such as user input or configuration files. The Factory Method pattern can help simplify the object creation process and make it more manageable.

#### what are some of the scenarios where you could use factory method design pattern?

+ Database connections: When you need to create different types of database connections (e.g., MySQL, PostgreSQL, Oracle) based on user input or configuration.

+ File formats: When you need to read or write files in different formats (e.g., CSV, JSON, XML) and want to decouple the file format creation from the client code.

+ Payment gateways: When you need to support multiple payment gateways (e.g., PayPal, Stripe, Authorize.net) and want to provide a way to create payment gateways without exposing the client code to the specific implementation details.

+ Product configurations: When you need to create products with different configurations (e.g., sizes, colors, features) and want to provide a way to create products without hardcoding the specific configurations in the client code.

+ Security protocols: When you need to support multiple security protocols (e.g., SSL, TLS, HTTPS) and want to provide a way to create security protocols without exposing the client code to the specific implementation details.

#### what are the pros of factory method design pattern?
+ Encapsulation: The Factory Method allows for encapsulation of the object creation process, making it easier to modify or replace the creation logic without affecting the rest of the code.

+ Decoupling: It decouples the object creation from the client code, making it easier to change the type of object being created without affecting the client code.

+ Polymorphism: It allows for polymorphic behavior, where the same interface can be used to create different types of objects.

+ Flexibility: It provides a way to add new object types without modifying the existing code.

+ Reusability: It allows for reusable code, as the same factory method can be used to create different types of objects.

+ Improved maintainability: It makes the code more maintainable, as changes to the object creation process can be made in one place without affecting the rest of the code.

#### what are the cons of factory method design pattern?

+ Added Complexity: It can add complexity to the code, especially if the factory method is not well-designed or is overused.

+ Over-Engineering: It can lead to over-engineering, as the factory method may be used to create objects that are not necessarily needed or used.

+ Tight Coupling: It can lead to tight coupling between the factory method and the objects being created, making it difficult to change or replace one without affecting the other.

+ Rigidity: It can make the code more rigid, as changes to the object creation process may require changes to the factory method.

+ Performance Overhead: It can introduce a performance overhead, as the factory method needs to be called and objects need to be created.

+ Code Duplication: It can lead to code duplication, as the same factory method may need to be duplicated for different types of objects.

+ Difficult Debugging: It can make debugging more difficult, as the error messages may not be clear or specific enough to identify the problem.

+ Limited Reusability: It can limit the reusability of the code, as the factory method may be tightly coupled to a specific object or context.

+ Higher Learning Curve: It can have a higher learning curve, as developers need to understand the concept of the factory method and how it works.

+ Less Flexibility: It can provide less flexibility than other design patterns, as it is designed to create objects in a specific way.

#### example:
In the code provide there is a product interface with two concrete implementation(Dress and toy), There is a factory interface with two concrete implementation(Dress Making Line,Toy Making Line) in which each create the product they want.

+ ### abstract factory

+ ### prototype

+ ### singleton

+ ### object pool

## structural-design-patterns

## behavioral-design-patterns

