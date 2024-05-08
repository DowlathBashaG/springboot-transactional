POST: http://localhost:9696/api/v1/orders

CREDIT :

Payload request :

{
    "order": {
        "totalQunatity": 2,
        "shoppingCardId": 1,
        "totalPrice": 2000
    },
    "payment": {
        "type": "CREDIT",
        "cardName": "Dowlath Basha G",
        "cardNumber": "1234 1234 1234 1234",
        "expiryMonth": 2,
        "expiryYear": 2025,
        "cvc": 123
    }
}


Payload response :
{
    "timestamp": "2024-05-08T15:03:06.140+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/api/v1/orders"
}


![credit-transactional](https://github.com/DowlathBashaG/springboot-transactional/assets/9671419/2b0fee27-a66f-4388-8602-a3248d541f79)

DEBIT :

Payload request :

{
    "order": {
        "totalQunatity": 2,
        "shoppingCardId": 1,
        "totalPrice": 2000
    },
    "payment": {
        "type": "DEBIT",
        "cardName": "Dowlath Basha G",
        "cardNumber": "1234 1234 1234 1234",
        "expiryMonth": 2,
        "expiryYear": 2025,
        "cvc": 123
    }
}


Payload response :

{
    "status": "IN-PROGRESS",
    "message": "SUCCESS",
    "orderTrackingNumber": "211c496f-dc25-49bc-b1d8-e5bafa958ab3"
}

![debit-transactional](https://github.com/DowlathBashaG/springboot-transactional/assets/9671419/3de15153-25d1-4a7f-a7fc-36eb6e82f2c0)
