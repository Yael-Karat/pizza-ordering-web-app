import React from 'react';
import { useCart } from './CartContext';
import { useNavigate } from 'react-router-dom';
import {Container} from 'react-bootstrap';
import UserDetailsForm from './UserDetailsForm';

const Checkout = () => {
    const { cart, clearCart, setOrderDetails } = useCart();
    const navigate = useNavigate();

    const handlePlaceOrder = (userData) => {
        const order = {
            ...userData,
            pizzas: cart
        };

        fetch('/api/orders', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(order)
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to place order');
                }
                return response.text();
            })
            .then(data => {
                const orderCode = data;
                const totalPrice = cart.reduce((sum, pizza) => sum + pizza.price, 0);

                const orderDetails = {
                    orderCode,
                    pizzas: cart,
                    totalPrice,
                    ...userData
                };

                setOrderDetails(orderDetails);
                clearCart();
                navigate('/order-confirmation');
            })
            .catch(error => {
                console.error('Error placing order:', error);
                alert('Failed to place order. Please try again.');
            });
    };

    return (
        <Container style={{marginLeft: '10px', width:'1200px'}} className="mt-3 text-center">
            <h2>Checkout</h2>
            <p>Enter your details</p>
            <UserDetailsForm onSubmit={handlePlaceOrder} />
        </Container>
    );
};

export default Checkout;
