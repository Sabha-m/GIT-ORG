package com.org.hybrid;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="",monochrome=false,plugin = {"pretty","html:foldername/htmreport"})
public class Test1 {

	
}
