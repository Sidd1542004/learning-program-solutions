Purpose
This project demonstrates the *Singleton Design Pattern* by implementing a simple 'Logger' class that ensures only one instance is created and shared across the application.

Technologies Used
- Java 
- Scanner for user input
- Singleton Design Pattern

Features
- Singleton class 'Logger' ensures only one instance exists throughout the program.
- Accepts *user input* for log messages.
- Verifies whether the two logger references point to the same instance.

How It Works
1. When the program starts, it initializes the logger ('Logger Initialized' printed once).
2. The user is prompted to input two log messages.
3. Each message is logged using the Singleton 'Logger' instance.
4. A check confirms that both logger instances refer to the same object.
