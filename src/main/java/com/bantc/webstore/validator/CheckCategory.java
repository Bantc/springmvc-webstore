// package com.bantc.webstore.validator;

// import java.lang.annotation.Documented;
// import java.lang.annotation.Retention;
// import java.lang.annotation.ElementType;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

// import javax.validation.Constraint;
// import javax.validation.Payload;

// @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
// @Retention(RetentionPolicy.RUNTIME)
// @Constraint(validatedBy = CategoryValidator.class)
// @Documented
// public @interface CheckCategory {
//     String message() default "{com.bantc.webstore.validator.CheckCategoty.message}";

//     Class<?>[] groups() default {};
//     public abstract Class<? extends Payload>[] payload()
//     default {};
// }
