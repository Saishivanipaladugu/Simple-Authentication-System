# Simple Authentication System 🔒

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Version](https://img.shields.io/badge/version-1.0.0-green.svg)
![Status](https://img.shields.io/badge/status-active-brightgreen.svg)

Welcome to the **Simple Authentication System** repository! This project is a secure authentication system that implements bcrypt for password hashing. It was developed as a classroom exercise for the Secure Development course. 

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Releases](#releases)

## Overview

The Simple Authentication System provides a straightforward way to manage user authentication securely. It allows users to register and log in using hashed passwords, enhancing security against unauthorized access. This project emphasizes secure coding practices and the importance of protecting user data.

## Features

- User registration and login functionality
- Password hashing using bcrypt
- Secure storage of user credentials
- Basic input validation
- Simple user interface

## Technologies Used

- **Java**: The primary programming language used for development.
- **Bcrypt**: A password hashing function that is computationally intensive, making it difficult for attackers to crack passwords.
- **Spring Boot**: A framework for building web applications in Java.
- **MySQL**: A relational database for storing user data.

## Installation

To set up the Simple Authentication System, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/Saishivanipaladugu/Simple-Authentication-System.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Simple-Authentication-System
   ```

3. Install the required dependencies:
   ```bash
   mvn install
   ```

4. Configure the database connection in `application.properties`.

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can access it through your web browser. The default URL is `http://localhost:8080`. Here, you can register a new user or log in with existing credentials.

1. **Register a New User**: Fill in the registration form with a username and password. The password will be hashed using bcrypt before being stored.

2. **Login**: Enter your username and password to log in. The system will verify the credentials against the stored hashed password.

3. **Security**: The application ensures that user passwords are never stored in plain text, enhancing overall security.

## Contributing

We welcome contributions to improve the Simple Authentication System. If you have suggestions or want to report issues, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Create a pull request.

Your contributions help make this project better!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, feel free to reach out:

- **Email**: saishivanipaladugu@example.com
- **GitHub**: [Saishivanipaladugu](https://github.com/Saishivanipaladugu)

## Releases

You can download the latest release of the Simple Authentication System from the [Releases](https://github.com/Saishivanipaladugu/Simple-Authentication-System/releases) section. Make sure to check for updates and new features!

![Release](https://img.shields.io/badge/releases-latest-orange.svg)

## Conclusion

The Simple Authentication System is a practical example of secure coding and authentication practices. It demonstrates how to implement a secure login system using modern technologies. We hope this project serves as a valuable resource for learning and implementing secure authentication in your applications.

Feel free to explore the code, contribute, and use this system in your projects. Your feedback and contributions are always welcome!

---

Thank you for checking out the Simple Authentication System!