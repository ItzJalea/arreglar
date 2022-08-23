tasks {
    processResources {
        filesMatching("**/*.yml") {
            filter<org.apache.tools.ant.filters.ReplaceTokens>(
                "tokens" to mapOf("version" to project.version)
            )
        }
    }
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
    implementation("org.spigotmc:spigot-api:1.13-R0.1-SNAPSHOT")
    implementation("com.github.Realizedd.Duels:duels-api:3.4.1")
    implementation(project(":nms"))
    implementation(project(":v1_8_R3_paper"))
}
