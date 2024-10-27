plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "cover-agent-kotlin-testing"
include("src:main:foo")
findProject(":src:main:foo")?.name = "foo"
