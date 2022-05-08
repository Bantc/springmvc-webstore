<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Customers</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-4">Customers</h1>
                    <p class="lead">Add customer</p>
                </div>
            </div>
        </section>

        <section class="container">
            <form:form method="POST" modelAttribute="newCustomer" class="form-horizontal">
                <fieldset>
                    <legend>Add new customer</legend>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="customerId">Customer Id</label>
                        <div class="col-lg-10">
                            <form:input id="customerId" path="customerId" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="name">Name</label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="addressStreet">Street</label>
                        <div class="col-lg-10">
                            <form:input id="addressStreet" path="addressStreet" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="addressNumber">Street number</label>
                        <div class="col-lg-10">
                            <form:input id="addressNumber" path="addressNumber" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="addressCountry">Country</label>
                        <div class="col-lg-10">
                            <form:input id="addressCountry" path="addressCountry" type="text" class="form:input-large"/>
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