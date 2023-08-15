package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/login.feature", glue="com.stepdef", dryRun=false, 

plugin= {"pretty", "junit:target/cucum.xml", "json:target/cucumber.json","html:target/index.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@Login and @Positive")

public class TestRunner
{

}