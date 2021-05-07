fun main() {
    println("\nHello World! Im using Abstract Factory Pattern")

    println("\n===>>>> This type is ${getInstanceApp().getService().getType()}")
}

fun getInstanceApp(): Application {
    return ApplicationImpl(getFactory())
}

fun getFactory(): ServiceFactory {
    return ServiceFactoryImpl()
}