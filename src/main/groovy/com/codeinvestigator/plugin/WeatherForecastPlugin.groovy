package com.codeinvestigator.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class WeatherForecastPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.task('forecast') {
            group = 'weather'
            doLast {
                println "Sunny 26 deg. centigrade. Maybe some clouds."
            }
        }
    }
}