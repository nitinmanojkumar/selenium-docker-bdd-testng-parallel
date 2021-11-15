package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baseAndHooks.BaseClass;

public class readExcel_Return_as_Map {

	public Map readExcel_with_sheetname_rowno(String sheetNM, Integer rowToGet) throws IOException {
		
		Map<String, String> map = new HashMap<String, String>();
		
		File file = new File(System.getProperty("user.dir") + "//src//test//resources//TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet(sheetNM);
		Row rowNo = sheet.getRow(0);
		Row desiredRowNo = sheet.getRow(rowToGet);
		int colCount = desiredRowNo.getLastCellNum();
		for (int i = 0; i < colCount; i++) {
			CellType cellType=desiredRowNo.getCell(i).getCellType();
			System.out.println("cellType : "+cellType.toString());
			if (cellType == CellType.STRING) {
				System.out.println(
						rowNo.getCell(i).getStringCellValue() + " : " + desiredRowNo.getCell(i).getStringCellValue());
				map.put(rowNo.getCell(i).getStringCellValue(), desiredRowNo.getCell(i).getStringCellValue());
			}
			if (cellType == CellType.NUMERIC) {
				String value=String.valueOf(desiredRowNo.getCell(i).getNumericCellValue());
				System.out.println(
						rowNo.getCell(i).getStringCellValue() + " : " + value);
				map.put(rowNo.getCell(i).getStringCellValue(), value);
			}
		}
		return map;
	}
}
