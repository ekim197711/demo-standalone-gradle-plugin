package com.codeinvestigator.plugin
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WeatherForecastPluginTest {

    @Test
    public void testThePlugin(){
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.codeinvestigator.weatherforecast'
        Assertions.assertNotNull(project.tasks.forecast)
    }
}
