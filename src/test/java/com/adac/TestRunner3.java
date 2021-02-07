package com.adac;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\test\\resources\\Feature\\AdactinLatest.feature", glue="com.Adactin")

public class TestRunner3 {

}
