import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement


WebUI.openBrowser('')

WebUI.navigateToUrl('https://stag-patra-logistik.azuralabs.id/login')

WebUI.setText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_113d72 (2)'), 
    'patlog_manajemen')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_648cb7 (2)'), 
    'Tl/nWPU0V52MQE+2jGH8/HDzEI2YIzZ4')

WebUI.click(findTestObject('Object Repository/Page_POC Patra Logistik/button_Masuk (2)'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Patra Logistik/div_Patra Logistik (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Overview (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/input_Overview Bulan Januari 2025_dateFilter (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/svg (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Oktober (1)'))

WebUI.delay(1)

// Array of expected values for each row
List<List<String>> expectedValues = [
	['27.806,00', '10.958,00', '4.950,52', '4.339,44', '3.968,00'],
	['3.740,00', '2.951,60', '1.640,00', '1.543,46', '1.238,12'],
	['1.212,50', '961,66', '921,36', '880,00', '769,81'],
	['700,00', '655,84', '642,90', '632,57', '612,28'],
	['605,00', '516,71', '502,95', '495,00', '478,00'],
	['474,21', '473,54', '450,00', '420,12', '414,70'],
	['406,50', '315,00', '285,97', '269,50', '245,84'],
	['220,00', '176,98', '110,44', '60,00', '50,00'],
	['40,15', '32,00', '31,00', '24,00', '16,00'],
	['8,00', '4,56', '4.950,52', '4.339,44', '3.968,00']
]

// Function to verify a single page
def verifyPageValues(List<String> expectedValues) {
	for (int i = 0; i < expectedValues.size(); i++) {
		def rowObject = findTestObject("Overview Page Values/row ${i + 1}")
		WebUI.verifyElementPresent(rowObject, 2)
		def actualValue = WebUI.getText(rowObject)
		WebUI.verifyEqual(actualValue, expectedValues[i], FailureHandling.CONTINUE_ON_FAILURE)
	}
}

// Iterate through pages and verify rows
for (List<String> pageExpectedValues : expectedValues) {
	verifyPageValues(pageExpectedValues)
	if (WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'), FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Overview Page Values/next page button'))
	} else {
		break
	}
}