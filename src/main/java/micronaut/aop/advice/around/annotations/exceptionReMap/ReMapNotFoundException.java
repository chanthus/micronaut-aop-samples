package micronaut.aop.advice.around.annotations.exceptionReMap;

import io.micronaut.aop.Around;
import io.micronaut.context.annotation.Type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.METHOD})
@Around
@Type(ReMapNotFoundExceptionInterceptor.class)
public @interface ReMapNotFoundException {
  String value();
}
