plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
}

subprojects {
    apply(plugin="java-library")
    apply(plugin="com.github.johnrengelman.shadow")

    repositories {
        mavenLocal()
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://repo.codemc.io/repository/nms/")
        maven("https://jitpack.io")
        mavenCentral()
    }
}