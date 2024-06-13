import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import { Container, Alert } from 'react-bootstrap';
import axios from 'axios';

function OrderDetails() {
    const { code } = useParams();
    const [order, setOrder] = useState(null);
    const [error, setError] = useState('');

    useEffect(() => {
        axios.get(`http://localhost:8080/api/orders/${code}`)
            .then(response => {
                setOrder(response.data);
            })
            .catch(() => {
                setError('Order not found');
            });
    }, [code]);

    return (
        <Container>
            <h1>Order Details</h1>
            {error && <Alert variant="danger">{error}</Alert>}
            {order && (
                <div>
                    <p><strong>Code:</strong> {order.code}</p>
                    <p><strong>Name:</strong> {order.firstName} {order.lastName}</p>
                    <p><strong>Address:</strong> {order.street}, {order.houseNumber}, {order.city}</p>
                    <p><strong>Phone:</strong> {order.phoneNumber}</p>
                    <h3>Pizzas</h3>
                    <ul>
                        {order.pizzas.map((pizza, index) => (
                            <li key={index}>
                                <strong>Pizza {index + 1}</strong>
                                <ul>
                                    {pizza.ingredients.map((ingredient, i) => (
                                        <li key={i}>{ingredient}</li>
                                    ))}
                                </ul>
                            </li>
                        ))}
                    </ul>
                </div>
            )}
        </Container>
    );
}

export default OrderDetails;
