# ShopEasy Ecommerce Website

Welcome to ShopEasy, an ecommerce platform built using React for the frontend, Java Spring Boot for the backend, and MySQL for storing data. This project incorporates various technologies such as JWT authentication, React print library, Axios for HTTP requests and API integration, as well as email features using HTML and CSS for designing purposes. Additionally, the backend employs efficient sorting techniques to manage and display data effectively.ShopEasy offers distinct roles for Admins and Normal Users, providing tailored functionalities for each role. Whether you're managing the platform as an Admin or shopping as a User, this guide will walk you through the features available to each role.

## Features

- **React Frontend:**
  - User-friendly interface built with React for seamless navigation and interactive user experience.
  - Utilizes React print library to enable printing functionalities directly from the frontend.

- **Java Spring Boot Backend:**
  - Robust backend system powered by Java Spring Boot to handle business logic, data processing, and API integrations.
  - Implements JWT (JSON Web Token) authentication for secure user authentication and authorization.

- **MySQL Database:**
  - MySQL database employed to store product information, user data, and other essential ecommerce-related data.

- **Axios for HTTP Requests:**
  - Axios used for making HTTP requests from the frontend to communicate with the backend APIs.

- **Email Feature with HTML and CSS:**
  - Integrates email features using HTML and CSS for designing visually appealing and informative emails sent to users (e.g., order confirmations, newsletters).

- **Sorting Techniques:**
  - Backend utilizes efficient sorting techniques (e.g., quicksort, mergesort) to optimize data retrieval and presentation, ensuring fast and responsive user experience.

## Admin Role

As an Admin, you have access to advanced functionalities to manage products, categories, orders, and users within the ShopEasy platform.

### Features Available to Admins:

1. **Product Management:**
   - Add new products with details like name, description, price, and image.
   - Edit or delete existing products.
   - Assign products to specific categories.

2. **Category Management:**
   - Create new product categories (e.g., Electronics, Clothing, Books).
   - Edit or delete existing categories.

3. **Order Management:**
   - View and manage incoming orders.
   - Accept or reject orders based on availability and fulfillment status.
   - Update order statuses (e.g., processing, shipped, delivered).

4. **User Management:**
   - Create new user accounts.
   - View and manage user details (e.g., name, email, address).
   - Disable or delete user accounts if needed.

### How to Access Admin Panel:

1. Log in to the ShopEasy application using Admin credentials.
2. Navigate to the Admin dashboard to access the admin functionalities.

## Normal User Role

Normal Users enjoy shopping and interacting with the platform based on their interests and preferences.

### Features Available to Normal Users:

1. **Registration and Login:**
   - Create a new user account by registering with an email and password.
   - Log in securely to access user-specific features.

2. **Shopping Experience:**
   - Browse products by category or search for specific items.
   - Add products to the cart and proceed to checkout.
   - View order history and track order statuses.

3. **Customized Shopping:**
   - Filter and sort products based on preferences (e.g., price, category).
   - Sort products from high to low price for budget-conscious shopping.

4. **Interaction and Review:**
   - Leave reviews and ratings for products purchased.
   - Interact with other users through product reviews and ratings.

### How to Use ShopEasy as a Normal User:

1. Register for a new account or log in using existing credentials.
2. Explore categories of interest and discover products.
3. Add desired items to the cart and proceed to checkout.
4. Provide feedback through reviews and ratings for purchased products.

## Session Management

ShopEasy manages user sessions securely to ensure a smooth and uninterrupted experience for both Admins and Normal Users.

- **User Session Details:**
  - Sessions are maintained securely using JWT (JSON Web Tokens) for authentication.
  - Admins and Normal Users have distinct session permissions and access levels.

---
## Installation

To set up ShopEasy locally, follow these steps:

### Prerequisites

- Node.js and npm installed on your machine.
- Java Development Kit (JDK) and Maven for Java Spring Boot.
- MySQL database server.

### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Sohamburkule/ShopEasy
   ```

2. Navigate to the backend directory:
   ```bash
   cd SpringBootMain
   ```

3. Configure MySQL database settings in `application.properties`.

4. Build and run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd ReactView
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the React development server:
   ```bash
   npm start
   ```

4. Access ShopEasy in your web browser at `http://localhost:3000`.

## Usage

- Register a new account or login using existing credentials.
- Browse products, add items to the cart, and proceed to checkout.
- View order history and manage account settings.

## Contributors
- [Gaurav chaughule](https://github.com/gauravchaughule001)
- [Soham Burkule](https://github.com/Sohamburkule)

## Contributing

Contributions are welcome! If you'd like to contribute to ShopEasy, please fork the repository and create a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).

---

ShopEasy aims to provide a seamless ecommerce experience for all users, with tailored functionalities to meet the needs of both Admins and Normal Users. If you have any questions or encounter any issues while using ShopEasy, please reach out to our support team for assistance. Happy shopping with ShopEasy! 🛍️🌟
