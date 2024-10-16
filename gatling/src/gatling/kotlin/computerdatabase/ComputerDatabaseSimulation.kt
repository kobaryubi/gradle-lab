package computerdatabase

import io.gatling.javaapi.core.Simulation
import io.gatling.javaapi.http.HttpDsl.*

class ComputerDatabaseSimulation : Simulation() {
    val httpProtocol = http.baseUrl("https://computer-database.gatling.io")
        .acceptHeader("text/html")
}
