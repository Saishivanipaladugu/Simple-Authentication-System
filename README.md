# 🔒 Simple Authentication System

A secure authentication system using **BCrypt** for password hashing. This project ensures strong password protection against brute-force and rainbow table attacks.
## 📚 About this Project
This project was developed as part of the **Secure Development** course to practice secure coding techniques, such as **secure password storage** and **sanitizing user input**.

## 🚀 Features
- 🔐 **Secure password hashing** with BCrypt
- 🧼 **Input sanitization** to prevent injection attacks
- ✅ **User authentication system**

## 📦 Installation

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/AuthenticationService.git
   cd AuthenticationService
   ```

2. **Add the BCrypt library manually**:
   - Download `jbcrypt-0.4.jar` from [Maven Repository](https://mvnrepository.com/artifact/org.mindrot/jbcrypt/0.4) and place it inside the `libs/` folder.
   - Ensure your `CLASSPATH` includes the `libs/` directory.

3. **Compile the project**:
   ```sh
   javac -cp libs/jbcrypt-0.4.jar -d bin src/**/*.java
   ```

## 🛠 Usage

### Running the Application
1. **Execute the program**:
   ```sh
   java -cp "libs/jbcrypt-0.4.jar:bin" AuthenticationSystem
   ```

2. **Enter your credentials** when prompted:
   ```
   Enter your username: ********
   Enter your password: ********
   ```

3. **Authentication Result**:
   - ✅ If the credentials are correct, you will see:
     ```
     Authentication successful!
     ```
   - ❌ If the credentials are incorrect:
     ```
     Invalid username or password.
     ```

## ⚠️ Breaking Changes
This version replaces **SHA-256** with **BCrypt** for password hashing. Stored passwords from previous versions are incompatible with this version.

## 🤝 Contributing

1. Fork the project 🍴
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "feat: add new authentication feature"`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request 📩
