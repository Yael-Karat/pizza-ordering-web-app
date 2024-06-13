import React, { createContext, useContext, useState, useEffect } from 'react';

const CartContext = createContext();

export const CartProvider = ({ children }) => {
    const [cart, setCart] = useState([]);
    const [selectedPizza, setSelectedPizza] = useState({ ingredients: [], price: 10 });
    const [orderDetails, setOrderDetails] = useState(null);  // State to hold order details
    const [ingredients, setIngredients] = useState([]);

    useEffect(() => {
        fetch('/api/ingredients')
            .then(response => response.json())
            .then(data => setIngredients(data))
            .catch(error => console.error('Error fetching ingredients:', error));
    }, []);

    const addToCart = (pizza) => {
        setCart([...cart, pizza]);
    };

    const removeFromCart = (index) => {
        const newCart = cart.filter((_, i) => i !== index);
        setCart(newCart);
    };

    const updatePizzaInCart = (index, updatedPizza) => {
        setCart(prevCart => {
            const updatedCart = [...prevCart];
            updatedCart[index] = updatedPizza;
            return updatedCart;
        });
    };

    const clearCart = () => {
        setCart([]);
    };

    return (
        <CartContext.Provider value={{
            cart, addToCart, removeFromCart, updatePizzaInCart, clearCart,
            selectedPizza, setSelectedPizza, orderDetails, setOrderDetails,
            ingredients, setIngredients  // Provide the state and setter for ingredients
        }}>
            {children}
        </CartContext.Provider>
    );
};

export const useCart = () => {
    return useContext(CartContext);
};
