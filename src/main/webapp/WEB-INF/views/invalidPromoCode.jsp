<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
            integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
            crossorigin="anonymous">
        <title>Invalid promo code</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                <h1 class="alert alert-danger"> Invalid promo code</h1>
                </div>
            </div>
        </section>
        <section>
            <div class="container">
                <p>
                    <a href="<spring:url value="/market/products" />" class="btn btn-primary">
                    <span class="fas fa-chevron-left"></span> Products</a>
                </p>
            </div>
        </section>
    </body>
</html>