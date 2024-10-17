package computerdatabase

import io.gatling.javaapi.core.Simulation
import io.gatling.javaapi.core.CoreDsl.*
import io.gatling.javaapi.http.HttpDsl.*

class ComputerDatabaseSimulation : Simulation() {
    val httpProtocolBuilder = http.baseUrl("https://computer-database.gatling.io")
        .acceptHeader("text/html")

    val scenarioBuilder = scenario("Scenario")
        .exec(http("Computers").get("/computers"))
}
