package com.bantc.webstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.bantc.webstore.validator.ProductId;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.web.multipart.MultipartFile;

// import jakarta.validation.constraints.Digits;
// import jakarta.validation.constraints.Min;
// import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Pattern;
// import jakarta.validation.constraints.Size;

@XmlRootElement
public class Product implements Serializable {
    private static final long serialVersionUID = 13L;

    @Pattern(regexp="P[1-9]+", message="{Pattern.Product.productId.validation}")
    @ProductId
    private String productId;
    @Size(min=4, max=50, message="{Size.Product.name.validation}")
    private String name;
    private String description;
    private String manufacturer;
    @NotEmpty(message = "{NotEmpty.Product.category.validation}")
    private String category;
    private String condition;
    @Min(value=0, message="{Min.Product.unitsInStock.validation}")
    private long unitsInStock;
    private long unitsInOrder;
    @Min(value=0, message="{Min.Product.unitPrice.validation}")
    @Digits(integer=8, fraction=2, message="{Digits.Product.unitPrice.validation}")
    @NotNull(message= "{NotNull.Product.unitPrice.validation}")
    private BigDecimal unitPrice;
    private boolean discontinued;
    @JsonIgnore
    private MultipartFile productImage;

    public Product() {
        super();
    }

    public Product(String productId, String name, BigDecimal unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public long getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public long getUnitsInOrder() {
        return this.unitsInOrder;
    }

    public void setUnitsInOrder(long unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isDiscontinued() {
        return this.discontinued;
    }

    public boolean getDiscontinued() {
        return this.discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    @XmlTransient
    public MultipartFile getProductImage() {
        return this.productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product otherProduct = (Product) obj;

        return productId.equals(otherProduct.productId);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        
        return result;
    }

}
