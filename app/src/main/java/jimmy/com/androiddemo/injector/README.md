该模块主要包含Dagger2的用法
1、编写接口类Component
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ContextLife("Application")
    Context getContext();

    void inject(DemoApplication demoApplication);
}
@Singleton为JAVA提供的注解，此处用于整个应用生命周期内单例对象，与此并列的@PerActivity @PerService等代表了该Component的一个限定的生命周期
@Component(modules = AppModule.class)代表Component里提供的接口方法的返回值由那个Module类来提供，此处可以添加一个dependencies，填入几个依赖的Component
@ContextLife为自定义注解，对应了Module里，如果发生Module提供了两个返回值相同类型的方法，用ContextLife注解来区分获取哪一个

inject方法名至少约定，在Component生成的实现类中，会提供某个对象的注入方法，预编译时会解析该类中需要注入哪几个对象

