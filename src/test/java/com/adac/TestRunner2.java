package com.adac;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\AdactinFeature2.feature", glue="com.Adactin")
public class TestRunner2 {

}
