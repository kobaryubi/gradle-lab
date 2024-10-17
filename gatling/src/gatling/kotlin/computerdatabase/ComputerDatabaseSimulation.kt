package computerdatabase

import io.gatling.javaapi.core.CoreDsl.*
import io.gatling.javaapi.core.Simulation
import io.gatling.javaapi.http.HttpDsl.*

class ComputerDatabaseSimulation : Simulation() {
    private val httpProtocolBuilder = http.baseUrl("https://computer-database.gatling.io")
        .acceptHeader("text/html")

    private val scenarioBuilder = scenario("Scenario")
        .exec(http("Computers").get("/computers"))

    init {
        setUp(scenarioBuilder.injectOpen(constantUsersPerSec(1.0).during(60)))
            .protocols(httpProtocolBuilder)
    }
}
