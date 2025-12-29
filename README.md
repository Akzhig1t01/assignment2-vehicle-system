Project Report - Vehicle Management System
Project Description In this assignment, I developed a system to manage different types of vehicles like cars, motorcycles, and trucks. The main goal was to use Java to show how classes can inherit from each other and how we can use abstract classes to organize code better.

How the System Works I created an abstract class called Vehicle which serves as a base for everything else. It has common properties like brand and year. Then, I made three specific classes: Car, Motorcycle, and Truck. Each of them has its own way of starting the engine. Also, I added a Driver class to show who is driving which vehicle.

Key Programming Concepts Used

Abstraction: I used an abstract Vehicle class so that nobody can create a "general" vehicle, only specific types like a Car.

Inheritance: Car, Motorcycle, and Truck all get their basic features from the Vehicle class, so I didn't have to rewrite the same code many times.

Polymorphism: In the Main class, I put all vehicles into one array and used a loop to start all their engines at once. This is very efficient because the program automatically knows which engine type it is.

Reflection on My Work This task was very useful for understanding how real-world objects are represented in code. The hardest part for me was setting up the Git branches correctly and making sure the Driver class works well with the Vehicles. I learned that using protected fields is better than private fields when you want your subclasses (like Car) to have direct access to the data.