<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isThreadSafe="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Products</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
    </head>
    <body>
        <section>
            <div class="pull-right" style="padding-right:50px">
                <a href="?language=en" >English</a> | <a href="?language=pl" >Polish</a>
                <a href="<c:url value="/logout" />">  Logout</a>
            </div>
        </section>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-4">Products</h1>
                    <p class="lead">Add product</p>
                </div>
            </div>
        </section>

        <section class="container">
            <form:form method="POST" modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
                <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                <fieldset>
                    <legend>Add new product</legend>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="productId"><spring:message code ="addProduct.form.productId.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="productId" path="productId" type="text" class="form:input-large"/>
                            <form:errors path="productId" cssClass="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="name"><spring:message code ="addProduct.form.name.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                            <form:errors path="name" cssClass="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="manufacturer"><spring:message code ="addProduct.form.manufacturer.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="category"><spring:message code ="addProduct.form.category.label"/></label>
                        <div class="col-lg-10">
                            <form:select id="category" path="category" type="text" class="form:select-large"/>
                            <form:errors path="category" cssClass="text-danger"/>
                            <!-- <div class="input-group mb-3">
                                <select class="custom-select" id="inputGroupSelect01">
                                  <option selected>Choose...</option>
                                  <option value="1">One</option>
                                  <option value="2">Two</option>
                                  <option value="3">Three</option>
                                </select>
                              </div> -->
                        </div>
                        <!-- <div class="dropdown">
                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                              Dropdown button
                            </button>
                            <div class="dropdown-menu">
                              <a class="dropdown-item" href="#">Link 1</a>
                              <a class="dropdown-item" href="#">Link 2</a>
                              <a class="dropdown-item" href="#">Link 3</a>
                            </div>
                          </div>  -->
                          <!-- <div class="input-append btn-group">
                            <input class="span2" id="appendedInputButton" size="16" type="text">
                            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#">
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="icon-pencil"></i> Edit</a></li>
                                <li><a href="#"><i class="icon-trash"></i> Delete</a></li>
                                <li><a href="#"><i class="icon-ban-circle"></i> Ban</a></li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="i"></i> Make admin</a></li>
                            </ul>
                        </div> -->

                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="unitsInStock"><spring:message code ="addProduct.form.unitsInStock.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
                            <form:errors path="unitsInStock" cssClass="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="unitPrice"><spring:message code ="addProduct.form.unitPrice.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
                            <form:errors path="unitPrice" cssClass="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="description"><spring:message code ="addProduct.form.description.label"/></label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows = "2"/>
                        </div>
                    </div>
                    <div class="form-group row">
                            <label class="control-label col-lg-2" for="condition"><spring:message code ="addProduct.form.condition.label"/></label>
                            <div class="col-lg-10">
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="New"/> <spring:message code ="addProduct.radiobutton1.condition"/>
                                </div>
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="Old"/> <spring:message code ="addProduct.radiobutton2.condition"/>
                                </div>
                                <div class="form-check">
                                    <form:radiobutton path="condition" value="Refurbished"/> <spring:message code ="addProduct.radiobutton3.condition"/>
                                </div>
                            </div>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-lg-2" for="productImage"><spring:message code = "addProduct.form.productImage.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
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