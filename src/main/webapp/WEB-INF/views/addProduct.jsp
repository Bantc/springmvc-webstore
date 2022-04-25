<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Products</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-4">Products</h1>
                    <p class="lead">Add product</p>
                </div>
            </div>
        </section>

        <section class="container">
            <form:form method="POST" modelAttribute="newProduct" class="form-horizontal">
                <fieldset>
                    <legend>Add new product</legend>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="productId">Product Id</label>
                        <div class="col-lg-10">
                            <form:input id="productId" path="productId" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="name">Name</label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="manufacturer">Manufacturer</label>
                        <div class="col-lg-10">
                            <form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="category">Category</label>
                        <div class="col-lg-10">
                            <form:input id="category" path="category" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="unitsInStock">Units in stock</label>
                        <div class="col-lg-10">
                            <form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="unitPrice">Unit price</label>
                        <div class="col-lg-10">
                            <form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="description">Description</label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows = "2"/>
                        </div>
                    </div>
                    <div class="form-group row">
                            <label class="control-label col-lg-2" for="condition">Condition</label>
                            <div class="col-lg-10">
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="New"/> New
                                </div>
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="Old"/> Old
                                </div>
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="Refurbished"/> Refurbished
                                </div>
                            </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>