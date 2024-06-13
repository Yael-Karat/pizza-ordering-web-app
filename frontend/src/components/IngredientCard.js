import React from 'react';
import { Card } from 'react-bootstrap';

function IngredientCard({ ingredient, isSelected, onClick }) {
    return (
        <Card
            className={`ingredient-card ${isSelected ? 'selected' : ''}`}
            onClick={onClick}
            style={{ cursor: 'pointer' }}
        >
            <Card.Img variant="top" src={ingredient.imageUrl} />
            <Card.Body>
                <Card.Title>{ingredient.name}</Card.Title>
            </Card.Body>
        </Card>
    );
}

export default IngredientCard;
