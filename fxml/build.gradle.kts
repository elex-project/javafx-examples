plugins {
    id("elex-application")
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("org.beryx.jlink") version "2.23.1"
}
application {
    mainClass.set("kr.pe.elex.examples.fxml.FxmlApplication")
    mainModule.set("kr.pe.elex.examples.fxml")
}
javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.fxml")
}
dependencies {


}
