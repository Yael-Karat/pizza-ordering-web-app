import React, { useState } from 'react';
import { Button, Form, Container, Image, Row, Col } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';
import { useCart } from './CartContext';

function OrderStatus() {
    const [orderCode, setOrderCode] = useState('');
    const [order, setOrder] = useState(null);
    const [error, setError] = useState(null);
    const navigate = useNavigate();
    const { ingredients } = useCart();

    const handleFetchOrder = () => {
        fetch(`/api/orders/${orderCode}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Order not found');
                }
                return response.json();
            })
            .then(data => {
                setOrder(data);
                setError(null);
            })
            .catch(error => {
                setOrder(null);
                setError('There is no order under this code');
            });
    };

    const getIngredientImage = (ingredientName) => {
        const ingredient = ingredients.find(ing => ing.name === ingredientName);
        return ingredient ? ingredient.image : '';
    };

    const handleBack = () => {
        navigate('/');
    };

    const getTotalPrice = () => {
        if (!order) return 0;
        let totalPrice = 0;
        order.pizzas.forEach(pizza => {
            totalPrice += pizza.price; // Add each pizza price to the total
        });
        return totalPrice;
    };

    return (
        <Container className="mt-5">
            <h2>Check Order</h2>
            <Form>
                <Form.Group controlId="orderCode" className="mt-3">
                    <Form.Control
                        type="text"
                        placeholder="Enter your order code"
                        value={orderCode}
                        onChange={(e) => setOrderCode(e.target.value)}
                        style={{maxWidth: '750px'}}
                        className="w-100 w-md-50"
                    />
                </Form.Group>
                <br />
                <Button variant="primary" onClick={handleFetchOrder}>
                    Check Order
                </Button>
                <Button variant="secondary" style={{ marginLeft: '10px' }} onClick={handleBack}>
                    Home
                </Button>
            </Form>
            {error && <p style={{ color: 'red' }}>{error}</p>}
            {order && (
                <div>
                    <br />
                    <h3>Order Details</h3>
                    <h5><strong>Code:</strong> {order.code}</h5>
                    <h5><strong>Name:</strong> {order.firstName} {order.lastName}</h5>
                    <h5><strong>Address:</strong> {order.address?.street} {order.address?.houseNumber}, {order.address?.city}</h5>
                    <h5><strong>Phone Number:</strong> {order.phoneNumber}</h5>
                    <br />
                    <h4>Pizzas:</h4>
                    {order.pizzas.map((pizza, index) => (
                        <div key={index}>
                            <h5>Pizza {index + 1}:</h5>
                            <ul className="list-unstyled">
                                {pizza.ingredients.map((ingredient, idx) => (
                                    <li key={idx} className="d-flex align-items-center">
                                        <Image src={getIngredientImage(ingredient)} rounded style={{ width: '25px', height: '25px', marginRight: '10px' }} />
                                        {ingredient}
                                    </li>
                                ))}
                            </ul>
                            <p>Price: {pizza.price}$</p> {/* Display pizza price */}
                        </div>
                    ))}
                    <h4>Total Order Price: {getTotalPrice()}$</h4> {/* Display total order price */}
                </div>
            )}
        </Container>
    );
}

export default OrderStatus;
