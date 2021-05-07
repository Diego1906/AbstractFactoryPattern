class ServiceFactoryImpl : ServiceFactory {

    override fun makeSvc(): Service {
        return ConcreteImpl()
    }
}