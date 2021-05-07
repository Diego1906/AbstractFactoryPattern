class ApplicationImpl(private val factory: ServiceFactory) : Application {

    override fun getService(): Service {
        return factory.makeSvc()
    }
}