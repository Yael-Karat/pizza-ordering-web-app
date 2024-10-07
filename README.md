## Authors
<p>
  <span><strong>Amit Lap & Yael Karat</strong></span>
  (<a href="https://github.com/Yael-Karat">@Yael-Karat</a>)
</p>


## Project Description

The project is an interactive pizza ordering system Frontend (in React) and Backend (in Spring).
It allows users to customize their pizzas by selecting ingredients, managing their cart, and proceeding to checkout.
The application features multiple pages for ordering, editing pizzas in the cart, checking order status, and finalizing orders.

### General Workflow:
1. **Home Page**:
    - The user can start an order or go to check the order status.
   
2. **Building Pizza and Customization**:
    - Users begin by selecting ingredients to customize their pizzas.
    - They can add multiple pizzas to their cart with different ingredient combinations.

3. **Cart Management**:
    - Users can view their current cart contents, modify pizzas (edit ingredients), or remove pizzas altogether.

4. **Checkout Process**:
   - They enter necessary information such as nane and address (contact details).

5. **Order Confirmation**:
    - After placing an order, user gets an order confirmation - including order code and order details.

6. **Order Status**:
    - After placing an order, users can check its status by entering a unique order code.
    - They receive detailed information about the ordered pizzas and total price.

## Technologies Used

### Frontend:
The frontend of the project is a React-based web application designed to facilitate the custom ordering of pizzas. Users can build their pizzas by selecting ingredients, view their cart, and proceed to checkout. The frontend utilizes React hooks, context API, and React Router for state management, context sharing, and navigation, respectively. It communicates with the backend via API calls to manage orders, retrieve ingredient data, and handle order status inquiries.

### Backend:
The backend of the project serves as the server-side logic implemented with Spring and REST API.
The ingredients images are located on the Backend.

## Installation

### Prerequisites:
- Node.js and npm installed
- Java Development Kit (JDK) installed
- Maven installed

### Steps:
<ol>
  <strong><li>Clone the repository:</strong>
    <pre><code>git clone https://github.com/Yael-Karat/pizza-ordering-web-app.git</code></pre>
  </li>
  <strong><li>Navigate to the project directory:</strong>
    <pre><code>cd pizza-ordering-web-app</code></pre>
  </li>
  <strong><li>Install backend dependencies and run the Spring Boot application:</strong>
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <strong><li>Install frontend dependencies:</strong>
    <pre><code>cd frontend
npm install</code></pre>
  </li>
  <strong><li>Start the frontend development server:</strong>
    <pre><code>npm start</code></pre>
  </li>
</ol>
