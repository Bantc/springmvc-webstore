<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Products</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
              integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
              crossorigin="anonymous">
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-4">Products</h1>
                </div>
            </div>
        </section>

        <section class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/img/${product.productId}.png"></c:url>" alt="image" style = "width:100%"/>
                </div>
                <div class="col-md-5">
                    <h3>${product.name}</h3>
                    <p>${product.description}</p>
                    <p><strong>Item code: </strong><span class="badge badge-warning">${product.productId}</span></p>
                    <p><strong>manufacturer: </strong>${product.manufacturer}</p>
                    <p><strong>category: </strong>${product.category}</p>
                    <p><strong>Availble units in stock: </strong>${product.unitsInStock}</p>
                    <h4>${product.unitPrice} USD</h4>
                    <a href="<spring:url value="/market/products"/>" class="btn btn-warning"><span class="fas fa-chevron-left"></span> Back</a>
                    <a href="#" class="btn btn-warning"><span class="fas fa-shopping-cart"></span> Shopping Cart</a>
                </div>
            </div>
        </section>
    </body>
</html>