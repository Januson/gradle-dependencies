import org.gradle.script.lang.kotlin.extra
import org.gradle.script.lang.kotlin.getValue
import org.gradle.script.lang.kotlin.setValue

var projectConfiguration: ProjectConfiguration by extra

val openapiGeneratorPlugin = "org.openapitools:openapi-generator-gradle-plugin:6.0.1"
val nebulaLintPlugin = "com.netflix.nebula:gradle-lint-plugin:19.0.1"

projectConfiguration = ProjectConfiguration(
    BuildPlugins(
        openapiGeneratorPlugin,
        nebulaLintPlugin
    )
)
