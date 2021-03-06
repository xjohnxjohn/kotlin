
plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    compile(projectDist(":kotlin-stdlib"))
    compileOnly(project(":kotlin-reflect-api"))
    compile(project(":compiler:util"))
    compile(project(":compiler:cli-common"))
    compile(project(":compiler:frontend.java"))
    compileOnly(intellijDep())
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

runtimeJar {
    archiveName = "jps-common-ide.jar"
}

ideaPlugin()