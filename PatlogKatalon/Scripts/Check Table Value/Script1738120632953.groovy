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

row1 = WebUI.getText(findTestObject('Object Repository/Page Values/row 1'))

WebUI.verifyEqual(row1, '27.806,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/a_'))

row1 = WebUI.getText(findTestObject('Object Repository/Page Values/row 1'))

WebUI.verifyEqual(row1, '3.740,00', FailureHandling.CONTINUE_ON_FAILURE)

