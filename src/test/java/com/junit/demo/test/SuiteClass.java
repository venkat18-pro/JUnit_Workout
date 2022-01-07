package com.junit.demo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitMain.class, JunitMain2.class})
public class SuiteClass {

}
