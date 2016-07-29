package jimmy.com.androiddemo.injector;

/**
 * Created by jimmypangpang on 16/7/27.
 */
public @interface ContextLife {
    String value() default "Application";
}
