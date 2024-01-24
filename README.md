A simple Spring Boot application showing `@Cacheable` issue when used in a library compiled without `-parameters` compiler flag.

To reproduce run `./gradlew test` and observe the failure of test `DemoApplicationTests > cachedDataLibTests`.