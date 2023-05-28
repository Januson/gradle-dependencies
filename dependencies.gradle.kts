import org.gradle.script.lang.kotlin.extra
import org.gradle.script.lang.kotlin.getValue
import org.gradle.script.lang.kotlin.setValue

var projectConfiguration: ProjectConfiguration by extra

val openapiGeneratorPlugin = "org.openapitools:openapi-generator-gradle-plugin:6.6.0"
val nebulaLintPlugin = "com.netflix.nebula:gradle-lint-plugin:18.0.3"

projectConfiguration = ProjectConfiguration(
    BuildPlugins(
        openapiGeneratorPlugin,
        nebulaLintPlugin
    )
)
