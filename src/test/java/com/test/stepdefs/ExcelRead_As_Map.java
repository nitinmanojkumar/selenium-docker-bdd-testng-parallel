package com.test.stepdefs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import baseAndHooks.BaseClass;
import io.cucumber.java.en.Then;
import utils.readExcel_Return_as_Map;

public class ExcelRead_As_Map extends BaseClass {

	private BaseClass base;

	public ExcelRead_As_Map(BaseClass base) {
		System.out.println("SearchSteps args constructor");
		this.base = base;
	}

	@Then("getdata from {string} from the row {int}")
	public void getdata_from_from_the_row(String sheetNM, Integer rowNo) throws IOException {
		base.map = new readExcel_Return_as_Map().readExcel_with_sheetname_rowno(sheetNM, rowNo);
	}

}
