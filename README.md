## Authors
<h3>Amit Lap & Yael Karat</h3>
<br>

### Project Description:

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

### Functionality of Pricing:

The pricing in the application is dynamic and based on the ingredients selected for each pizza:

- **Base Price**: Each pizza starts with a base price of $10.
- **Ingredient Cost**: Additional costs are added based on the number and type of ingredients chosen.
    - Each ingredient adds $2 to the base price.
    - The total price of a pizza is calculated as `Base Price + (Number of Ingredients * $2)`.
    - Total Order Price: The total price displayed at Cart is the sum of all individual pizza prices in the cart. It reflects any changes made to pizzas' ingredients during the ordering and editing process.

Frontend
The frontend of the project is a React-based web application designed to facilitate the custom ordering of pizzas. Users can build their pizzas by selecting ingredients, view their cart, and proceed to checkout. The frontend utilizes React hooks, context API, and React Router for state management, context sharing, and navigation, respectively. It communicates with the backend via API calls to manage orders, retrieve ingredient data, and handle order status inquiries.

Backend
The backend of the project serves as the server-side logic implemented with Spring and REST API.
The ingredients images are located on the Backend.

JavaDoc:
[JavaDoc Documentation](doc/index.html)

We used one day of grace (we received confirmation from Solange that Shavuot is not included in days of grace)
